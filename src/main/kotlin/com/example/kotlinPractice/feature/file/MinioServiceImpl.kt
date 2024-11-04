package com.example.kotlinPractice.feature.file

import com.example.kotlinPractice.domain.entity.Image
import com.example.kotlinPractice.domain.entity.Menu
import io.minio.BucketExistsArgs
import io.minio.GetObjectArgs
import io.minio.GetPresignedObjectUrlArgs
import io.minio.MakeBucketArgs
import io.minio.MinioClient
import io.minio.PutObjectArgs
import io.minio.RemoveObjectsArgs
import io.minio.http.Method
import io.minio.messages.DeleteObject
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

private const val MENU_ID = "menu-id"

@Service
class MinioServiceImpl(

    @Value("\${minio.url}")
    private val minioUrl: String,

    @Value("\${minio.bucketName}")
    private val bucketName: String,

    private val minioClient: MinioClient,

) : MinioService {
    override fun uploadMenuImages(menuImage: MultipartFile, savedMenu: Menu, imageRandomName: String) {
        if (doesNotExistBucket(bucketName)) {
            createNewBucket(bucketName)
        }
        uploadToMino(menuImage, bucketName, imageRandomName, savedMenu)
    }

    override fun getImageUrl(imageRandomName: String): String {
        return minioClient.getPresignedObjectUrl(
            GetPresignedObjectUrlArgs.builder()
                .bucket(bucketName)
                .`object`(imageRandomName)
                .method(Method.GET)
                .build(),
        )
    }

    private fun uploadToMino(image: MultipartFile, bucketName: String, imageRandomName: String, savedMenu: Menu) {
        val menuIdMetaData = mapOf(MENU_ID to savedMenu.id.toString())

        minioClient.putObject(
            PutObjectArgs.builder()
                .bucket(bucketName)
                .`object`(imageRandomName)
                .stream(image.inputStream, image.size, -1)
                .contentType(image.contentType)
                .userMetadata(menuIdMetaData)
                .build(),
        )
    }

    override fun downloadImages(bucketName: String, objectName: String): ByteArray {
        val stream = minioClient.getObject(
            GetObjectArgs.builder()
                .bucket(bucketName)
                .`object`(objectName)
                .build(),
        )

        return stream.readAllBytes()
    }

    override fun deleteMenuImages(oldImages: List<Image>) {
        deleteImagesFromMinio(oldImages)
    }

    private fun deleteImagesFromMinio(oldImages: List<Image>) {
        val deleteImages = makeDeleteImagesForMinio(oldImages)
        if (deleteImages.isNotEmpty()) {
            minioClient.removeObjects(
                RemoveObjectsArgs.builder()
                    .bucket(bucketName)
                    .objects(deleteImages)
                    .build(),
            )
        }
    }

    private fun makeDeleteImagesForMinio(oldImages: List<Image>): List<DeleteObject> {
        return oldImages.map { DeleteObject(it.imageRandomName) }
    }

    private fun doesNotExistBucket(bucketName: String): Boolean {
        return minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build())
    }

    private fun createNewBucket(bucketName: String) {
        return minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build())
    }
}
