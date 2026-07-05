.class public final Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;
.super Ljava/lang/Object;
.source "ReflectiveTypeAdapterFactory.java"

# interfaces
.implements Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;,
        Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;,
        Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;,
        Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;,
        Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;
    }
.end annotation


# instance fields
.field private final constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

.field private final excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

.field private final fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

.field private final jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field private final reflectionFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;Lcom/nimbusds/jose/shaded/gson/internal/Excluder;Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;",
            "Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;",
            "Lcom/nimbusds/jose/shaded/gson/internal/Excluder;",
            "Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;",
            ">;)V"
        }
    .end annotation

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    .line 74
    iput-object p2, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 75
    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    .line 76
    iput-object p4, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 77
    iput-object p5, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->reflectionFilters:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 0

    .line 60
    invoke-static {p0, p1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->checkAccessible(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    return-void
.end method

.method private static checkAccessible(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M:",
            "Ljava/lang/reflect/AccessibleObject;",
            ":",
            "Ljava/lang/reflect/Member;",
            ">(",
            "Ljava/lang/Object;",
            "TM;)V"
        }
    .end annotation

    .line 167
    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 166
    :cond_0
    invoke-static {p1, p0}, Lcom/nimbusds/jose/shaded/gson/internal/ReflectionAccessFilterHelper;->canAccess(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-void

    :cond_1
    const/4 p0, 0x1

    .line 168
    invoke-static {p1, p0}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->getAccessibleObjectDescription(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p0

    .line 169
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private createBoundField(Lcom/nimbusds/jose/shaded/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/Gson;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/String;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;ZZ)",
            "Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;"
        }
    .end annotation

    .line 186
    invoke-virtual/range {p5 .. p5}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/shaded/gson/internal/Primitives;->isPrimitive(Ljava/lang/reflect/Type;)Z

    move-result v8

    .line 188
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    .line 189
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v9

    goto :goto_0

    :cond_0
    move v0, v9

    move v9, v10

    .line 191
    :goto_0
    const-class v2, Lcom/nimbusds/jose/shaded/gson/annotations/JsonAdapter;

    invoke-virtual {p2, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/nimbusds/jose/shaded/gson/annotations/JsonAdapter;

    if-eqz v6, :cond_1

    .line 195
    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    iget-object v3, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    const/4 v7, 0x0

    move-object v4, p1

    move-object/from16 v5, p5

    .line 196
    invoke-virtual/range {v2 .. v7}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->getTypeAdapter(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Lcom/nimbusds/jose/shaded/gson/annotations/JsonAdapter;Z)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    move v10, v0

    :cond_2
    move-object/from16 v5, p5

    if-nez v2, :cond_3

    .line 201
    invoke-virtual {p1, v5}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v2

    :cond_3
    move-object v7, v2

    if-eqz p6, :cond_5

    if-eqz v10, :cond_4

    move-object v0, v7

    goto :goto_2

    .line 211
    :cond_4
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;

    invoke-virtual {v5}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-direct {v0, p1, v7, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;Ljava/lang/reflect/Type;)V

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_5
    move-object v6, v7

    .line 216
    :goto_3
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$2;

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    move-object v2, p4

    move/from16 v4, p7

    invoke-direct/range {v0 .. v9}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$2;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;ZZ)V

    return-object v0
.end method

.method private static createDuplicateFieldException(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/lang/IllegalArgumentException;"
        }
    .end annotation

    .line 303
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, " declares multiple JSON fields named \'"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "\'; conflict is caused by fields "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 309
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->fieldToString(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " and "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 311
    invoke-static {p3}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->fieldToString(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "\nSee "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "duplicate-fields"

    .line 313
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/internal/TroubleshootingGuide;->createUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private getBoundFields(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/Gson;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;ZZ)",
            "Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    .line 318
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 319
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;->EMPTY:Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    return-object v1

    .line 322
    :cond_0
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 325
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v11, p2

    move/from16 v1, p4

    move-object v12, v8

    .line 328
    :goto_0
    const-class v2, Ljava/lang/Object;

    if-eq v12, v2, :cond_f

    .line 329
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v13

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v8, :cond_3

    .line 332
    array-length v2, v13

    if-lez v2, :cond_3

    .line 333
    iget-object v1, v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->reflectionFilters:Ljava/util/List;

    .line 334
    invoke-static {v1, v12}, Lcom/nimbusds/jose/shaded/gson/internal/ReflectionAccessFilterHelper;->getFilterResult(Ljava/util/List;Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    move-result-object v1

    .line 335
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;->BLOCK_ALL:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    if-eq v1, v2, :cond_2

    .line 343
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;->BLOCK_INACCESSIBLE:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    if-ne v1, v2, :cond_1

    move v1, v14

    goto :goto_1

    :cond_1
    move v1, v15

    goto :goto_1

    .line 336
    :cond_2
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ReflectionAccessFilter does not permit using reflection for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " (supertype of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "). Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    move v7, v1

    .line 346
    array-length v1, v13

    move v2, v15

    :goto_2
    if-ge v2, v1, :cond_e

    move v3, v2

    aget-object v2, v13, v3

    .line 347
    invoke-direct {v0, v2, v14}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->includeField(Ljava/lang/reflect/Field;Z)Z

    move-result v6

    .line 348
    invoke-direct {v0, v2, v15}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->includeField(Ljava/lang/reflect/Field;Z)Z

    move-result v4

    if-nez v6, :cond_4

    if-nez v4, :cond_4

    move/from16 v17, v1

    move/from16 v18, v3

    move-object/from16 v16, v11

    move v11, v15

    goto/16 :goto_6

    :cond_4
    const/4 v5, 0x0

    if-eqz p5, :cond_8

    .line 362
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v16

    if-eqz v16, :cond_5

    move v14, v15

    goto :goto_4

    .line 365
    :cond_5
    invoke-static {v12, v2}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->getAccessor(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-nez v7, :cond_6

    .line 368
    invoke-static {v5}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->makeAccessible(Ljava/lang/reflect/AccessibleObject;)V

    .line 375
    :cond_6
    const-class v14, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;

    invoke-virtual {v5, v14}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v14

    if-eqz v14, :cond_8

    const-class v14, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;

    .line 376
    invoke-virtual {v2, v14}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v14

    if-eqz v14, :cond_7

    goto :goto_3

    .line 378
    :cond_7
    invoke-static {v5, v15}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->getAccessibleObjectDescription(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object v1

    .line 379
    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "@SerializedName on "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " is not supported"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    :goto_3
    move v14, v4

    :goto_4
    if-nez v7, :cond_9

    if-nez v5, :cond_9

    .line 388
    invoke-static {v2}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->makeAccessible(Ljava/lang/reflect/AccessibleObject;)V

    .line 391
    :cond_9
    invoke-virtual {v11}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v15

    invoke-static {v4, v12, v15}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 392
    invoke-direct {v0, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->getFieldNames(Ljava/lang/reflect/Field;)Ljava/util/List;

    move-result-object v15

    move-object/from16 v16, v11

    const/4 v11, 0x0

    .line 393
    invoke-interface {v15, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/String;

    .line 400
    invoke-static {v4}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v4

    move/from16 v18, v3

    move-object v3, v5

    move-object v5, v4

    move-object/from16 v4, v17

    move/from16 v17, v1

    move-object/from16 v1, p1

    .line 395
    invoke-direct/range {v0 .. v7}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->createBoundField(Lcom/nimbusds/jose/shaded/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;

    move-result-object v3

    if-eqz v14, :cond_b

    .line 405
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 406
    invoke-interface {v9, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;

    if-nez v5, :cond_a

    goto :goto_5

    .line 409
    :cond_a
    iget-object v0, v5, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->field:Ljava/lang/reflect/Field;

    invoke-static {v8, v1, v0, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->createDuplicateFieldException(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_b
    if-eqz v6, :cond_d

    .line 415
    invoke-interface {v10, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;

    if-nez v0, :cond_c

    goto :goto_6

    .line 417
    :cond_c
    iget-object v0, v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->field:Ljava/lang/reflect/Field;

    invoke-static {v8, v4, v0, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->createDuplicateFieldException(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_d
    :goto_6
    add-int/lit8 v2, v18, 0x1

    move-object/from16 v0, p0

    move v15, v11

    move-object/from16 v11, v16

    move/from16 v1, v17

    const/4 v14, 0x1

    goto/16 :goto_2

    :cond_e
    move-object/from16 v16, v11

    .line 421
    invoke-virtual/range {v16 .. v16}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v12, v1}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v11

    .line 422
    invoke-virtual {v11}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v12

    move-object/from16 v0, p0

    move v1, v7

    goto/16 :goto_0

    .line 424
    :cond_f
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v9, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;-><init>(Ljava/util/Map;Ljava/util/List;)V

    return-object v0
.end method

.method private getFieldNames(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 87
    const-class v0, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    invoke-interface {v0, p1}, Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;->translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 93
    :cond_0
    invoke-interface {v0}, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;->value()Ljava/lang/String;

    move-result-object p1

    .line 94
    invoke-interface {v0}, Lcom/nimbusds/jose/shaded/gson/annotations/SerializedName;->alternate()[Ljava/lang/String;

    move-result-object v0

    .line 95
    array-length v1, v0

    if-nez v1, :cond_1

    .line 96
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 99
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v1
.end method

.method private includeField(Ljava/lang/reflect/Field;Z)Z
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    invoke-virtual {v0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->excludeField(Ljava/lang/reflect/Field;Z)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method public create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/Gson;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 107
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v3

    .line 109
    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 115
    :cond_0
    invoke-static {v3}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->isAnonymousOrNonStaticLocal(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$1;

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$1;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;)V

    return-object p1

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->reflectionFilters:Ljava/util/List;

    .line 139
    invoke-static {v0, v3}, Lcom/nimbusds/jose/shaded/gson/internal/ReflectionAccessFilterHelper;->getFilterResult(Ljava/util/List;Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    move-result-object v0

    .line 140
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;->BLOCK_ALL:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    if-eq v0, v1, :cond_4

    .line 146
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;->BLOCK_INACCESSIBLE:Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter$FilterResult;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    move v4, v0

    .line 150
    invoke-static {v3}, Lcom/nimbusds/jose/shaded/gson/internal/reflect/ReflectionHelper;->isRecord(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    new-instance v6, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 155
    invoke-direct/range {v0 .. v5}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->getBoundFields(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    move-result-object p1

    invoke-direct {v6, v3, p1, v4}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$RecordAdapter;-><init>(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;Z)V

    return-object v6

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 159
    iget-object p1, v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    invoke-virtual {p1, v2}, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;->get(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;

    move-result-object p1

    .line 160
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;

    const/4 v5, 0x0

    .line 161
    invoke-direct/range {v0 .. v5}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;->getBoundFields(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Ljava/lang/Class;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldReflectionAdapter;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/ObjectConstructor;Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory$FieldsData;)V

    return-object p2

    .line 141
    :cond_4
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "ReflectionAccessFilter does not permit using reflection for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, ". Register a TypeAdapter for this type or adjust the access filter."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
