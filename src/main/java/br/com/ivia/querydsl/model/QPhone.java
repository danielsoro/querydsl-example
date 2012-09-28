package br.com.ivia.querydsl.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QPhone is a Querydsl query type for Phone
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPhone extends EntityPathBase<Phone> {

    private static final long serialVersionUID = 2135388622;

    public static final QPhone phone = new QPhone("phone");

    public final QModel _super = new QModel(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath number = createString("number");

    public QPhone(String variable) {
        super(Phone.class, forVariable(variable));
    }

    public QPhone(Path<? extends Phone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhone(PathMetadata<?> metadata) {
        super(Phone.class, metadata);
    }

}

