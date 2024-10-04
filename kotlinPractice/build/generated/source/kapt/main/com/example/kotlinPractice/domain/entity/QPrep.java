package com.example.kotlinPractice.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrep is a Querydsl query type for Prep
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrep extends EntityPathBase<Prep> {

    private static final long serialVersionUID = 578291055L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrep prep = new QPrep("prep");

    public final DatePath<java.time.LocalDate> deadLine = createDate("deadLine", java.time.LocalDate.class);

    public final NumberPath<Integer> executionStatus = createNumber("executionStatus", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath job = createString("job");

    public final QMember member;

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public QPrep(String variable) {
        this(Prep.class, forVariable(variable), INITS);
    }

    public QPrep(Path<Prep> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrep(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrep(PathMetadata metadata, PathInits inits) {
        this(Prep.class, metadata, inits);
    }

    public QPrep(Class<? extends Prep> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

