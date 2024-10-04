package com.example.kotlinPractice.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QKitchen is a Querydsl query type for Kitchen
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKitchen extends EntityPathBase<Kitchen> {

    private static final long serialVersionUID = 368350498L;

    public static final QKitchen kitchen = new QKitchen("kitchen");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath location = createString("location");

    public final StringPath name = createString("name");

    public QKitchen(String variable) {
        super(Kitchen.class, forVariable(variable));
    }

    public QKitchen(Path<Kitchen> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKitchen(PathMetadata metadata) {
        super(Kitchen.class, metadata);
    }

}

