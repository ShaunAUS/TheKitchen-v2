package com.example.kotlinPractice.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRefrigerator is a Querydsl query type for Refrigerator
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRefrigerator extends EntityPathBase<Refrigerator> {

    private static final long serialVersionUID = -38620510L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRefrigerator refrigerator = new QRefrigerator("refrigerator");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createList("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final QKitchen kitchen;

    public final StringPath name = createString("name");

    public QRefrigerator(String variable) {
        this(Refrigerator.class, forVariable(variable), INITS);
    }

    public QRefrigerator(Path<Refrigerator> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRefrigerator(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRefrigerator(PathMetadata metadata, PathInits inits) {
        this(Refrigerator.class, metadata, inits);
    }

    public QRefrigerator(Class<? extends Refrigerator> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.kitchen = inits.isInitialized("kitchen") ? new QKitchen(forProperty("kitchen")) : null;
    }

}

