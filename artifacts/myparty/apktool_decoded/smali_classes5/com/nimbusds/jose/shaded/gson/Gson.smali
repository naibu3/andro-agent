.class public final Lcom/nimbusds/jose/shaded/gson/Gson;
.super Ljava/lang/Object;
.source "Gson.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nimbusds/jose/shaded/gson/Gson$FutureTypeAdapter;
    }
.end annotation


# static fields
.field static final DEFAULT_COMPLEX_MAP_KEYS:Z = false

.field static final DEFAULT_DATE_PATTERN:Ljava/lang/String;

.field static final DEFAULT_ESCAPE_HTML:Z = true

.field static final DEFAULT_FIELD_NAMING_STRATEGY:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

.field static final DEFAULT_FORMATTING_STYLE:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

.field static final DEFAULT_JSON_NON_EXECUTABLE:Z = false

.field static final DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field static final DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field static final DEFAULT_SERIALIZE_NULLS:Z = false

.field static final DEFAULT_SPECIALIZE_FLOAT_VALUES:Z = false

.field static final DEFAULT_STRICTNESS:Lcom/nimbusds/jose/shaded/gson/Strictness; = null

.field static final DEFAULT_USE_JDK_UNSAFE:Z = true

.field private static final JSON_NON_EXECUTABLE_PREFIX:Ljava/lang/String; = ")]}\'\n"


# instance fields
.field final builderFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field final builderHierarchyFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field final complexMapKeySerialization:Z

.field private final constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

.field final datePattern:Ljava/lang/String;

.field final dateStyle:I

.field final excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

.field final factories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field final fieldNamingStrategy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

.field final formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

.field final generateNonExecutableJson:Z

.field final htmlSafe:Z

.field final instanceCreators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/nimbusds/jose/shaded/gson/InstanceCreator<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field final longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

.field final numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field final objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field final reflectionFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;",
            ">;"
        }
    .end annotation
.end field

.field final serializeNulls:Z

.field final serializeSpecialFloatingPointValues:Z

.field final strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

.field private final threadLocalAdapterResults:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field final timeStyle:I

.field private final typeTokenCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "*>;",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "*>;>;"
        }
    .end annotation
.end field

.field final useJdkUnsafe:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 156
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/FormattingStyle;->COMPACT:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FORMATTING_STYLE:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    const/4 v0, 0x0

    .line 162
    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    .line 163
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;->IDENTITY:Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FIELD_NAMING_STRATEGY:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 164
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/ToNumberPolicy;->DOUBLE:Lcom/nimbusds/jose/shaded/gson/ToNumberPolicy;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 165
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/ToNumberPolicy;->LAZILY_PARSED_NUMBER:Lcom/nimbusds/jose/shaded/gson/ToNumberPolicy;

    sput-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    .line 254
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    sget-object v2, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FIELD_NAMING_STRATEGY:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 257
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v8, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FORMATTING_STYLE:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    sget-object v9, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_STRICTNESS:Lcom/nimbusds/jose/shaded/gson/Strictness;

    sget-object v12, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    sget-object v13, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    .line 270
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    .line 271
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v17

    .line 272
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    sget-object v19, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    sget-object v20, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 275
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v21

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x2

    move-object/from16 v0, p0

    .line 254
    invoke-direct/range {v0 .. v21}, Lcom/nimbusds/jose/shaded/gson/Gson;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/Excluder;Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZLcom/nimbusds/jose/shaded/gson/FormattingStyle;Lcom/nimbusds/jose/shaded/gson/Strictness;ZZLcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/nimbusds/jose/shaded/gson/internal/Excluder;Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZLcom/nimbusds/jose/shaded/gson/FormattingStyle;Lcom/nimbusds/jose/shaded/gson/Strictness;ZZLcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/internal/Excluder;",
            "Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/nimbusds/jose/shaded/gson/InstanceCreator<",
            "*>;>;ZZZZ",
            "Lcom/nimbusds/jose/shaded/gson/FormattingStyle;",
            "Lcom/nimbusds/jose/shaded/gson/Strictness;",
            "ZZ",
            "Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;",
            "Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;",
            "Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;",
            ">;)V"
        }
    .end annotation

    move/from16 v1, p10

    move/from16 v2, p11

    move-object/from16 v3, p21

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    new-instance v4, Ljava/lang/ThreadLocal;

    invoke-direct {v4}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->threadLocalAdapterResults:Ljava/lang/ThreadLocal;

    .line 185
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->typeTokenCache:Ljava/util/concurrent/ConcurrentMap;

    .line 300
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    .line 301
    iput-object p2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->fieldNamingStrategy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 302
    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->instanceCreators:Ljava/util/Map;

    .line 303
    new-instance v4, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    invoke-direct {v4, p3, v2, v3}, Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    .line 305
    iput-boolean p4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    .line 306
    iput-boolean p5, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->complexMapKeySerialization:Z

    .line 307
    iput-boolean p6, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->generateNonExecutableJson:Z

    move/from16 p3, p7

    .line 308
    iput-boolean p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    move-object/from16 p3, p8

    .line 309
    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    move-object/from16 p3, p9

    .line 310
    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 311
    iput-boolean v1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeSpecialFloatingPointValues:Z

    .line 312
    iput-boolean v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->useJdkUnsafe:Z

    move-object/from16 p3, p12

    .line 313
    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    move-object/from16 v2, p13

    .line 314
    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->datePattern:Ljava/lang/String;

    move/from16 v2, p14

    .line 315
    iput v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->dateStyle:I

    move/from16 v2, p15

    .line 316
    iput v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->timeStyle:I

    move-object/from16 v2, p16

    .line 317
    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->builderFactories:Ljava/util/List;

    move-object/from16 v2, p17

    .line 318
    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->builderHierarchyFactories:Ljava/util/List;

    move-object/from16 v2, p19

    .line 319
    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    move-object/from16 v5, p20

    .line 320
    iput-object v5, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 321
    iput-object v3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->reflectionFilters:Ljava/util/List;

    .line 323
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 326
    sget-object v7, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->JSON_ELEMENT_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    invoke-static {v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ObjectTypeAdapter;->getFactory(Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p18

    .line 333
    invoke-interface {v6, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 336
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->STRING_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->INTEGER_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BOOLEAN_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BYTE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->SHORT_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    invoke-static {p3}, Lcom/nimbusds/jose/shaded/gson/Gson;->longAdapter(Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p3

    .line 342
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Long;

    invoke-static {v2, v7, p3}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Double;

    .line 345
    invoke-direct {p0, v1}, Lcom/nimbusds/jose/shaded/gson/Gson;->doubleAdapter(Z)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v8

    .line 344
    invoke-static {v2, v7, v8}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v2

    .line 343
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 346
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v7, Ljava/lang/Float;

    .line 348
    invoke-direct {p0, v1}, Lcom/nimbusds/jose/shaded/gson/Gson;->floatAdapter(Z)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v1

    .line 347
    invoke-static {v2, v7, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    .line 346
    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    invoke-static {v5}, Lcom/nimbusds/jose/shaded/gson/internal/bind/NumberTypeAdapter;->getFactory(Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 350
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->ATOMIC_INTEGER_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->ATOMIC_BOOLEAN_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {p3}, Lcom/nimbusds/jose/shaded/gson/Gson;->atomicLongAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 353
    const-class v1, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 354
    invoke-static {p3}, Lcom/nimbusds/jose/shaded/gson/Gson;->atomicLongArrayAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p3

    invoke-static {v1, p3}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p3

    .line 353
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->ATOMIC_INTEGER_ARRAY_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->CHARACTER_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->STRING_BUILDER_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 358
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->STRING_BUFFER_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    const-class p3, Ljava/math/BigDecimal;

    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BIG_DECIMAL:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    invoke-static {p3, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p3

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 360
    const-class p3, Ljava/math/BigInteger;

    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BIG_INTEGER:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    invoke-static {p3, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p3

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 363
    const-class p3, Lcom/nimbusds/jose/shaded/gson/internal/LazilyParsedNumber;

    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->LAZILY_PARSED_NUMBER:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    .line 364
    invoke-static {p3, v1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p3

    .line 363
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 365
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->URL_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 366
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->URI_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 367
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->UUID_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 368
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->CURRENCY_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->LOCALE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->INET_ADDRESS_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->BIT_SET_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter;->DEFAULT_STYLE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->CALENDAR_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    sget-boolean p3, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->SUPPORTS_SQL_TYPES:Z

    if-eqz p3, :cond_0

    .line 376
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIME_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    :cond_0
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/ArrayTypeAdapter;->FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    sget-object p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->CLASS_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 385
    new-instance p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/CollectionTypeAdapterFactory;

    invoke-direct {p3, v4}, Lcom/nimbusds/jose/shaded/gson/internal/bind/CollectionTypeAdapterFactory;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    new-instance p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;

    invoke-direct {p3, v4, p5}, Lcom/nimbusds/jose/shaded/gson/internal/bind/MapTypeAdapterFactory;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Z)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    new-instance p3, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    invoke-direct {p3, v4}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;)V

    iput-object p3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 388
    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->ENUM_FACTORY:Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;

    move-object p6, p1

    move-object p5, p2

    move-object/from16 p7, p3

    move-object p3, v0

    move-object/from16 p8, v3

    move-object p4, v4

    invoke-direct/range {p3 .. p8}, Lcom/nimbusds/jose/shaded/gson/internal/bind/ReflectiveTypeAdapterFactory;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;Lcom/nimbusds/jose/shaded/gson/internal/Excluder;Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V

    invoke-interface {v6, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->factories:Ljava/util/List;

    return-void
.end method

.method private static assertFullConsumption(Ljava/lang/Object;Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 1468
    :try_start_0
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->peek()Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    move-result-object p0

    sget-object p1, Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;->END_DOCUMENT:Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 1469
    :cond_0
    new-instance p0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/nimbusds/jose/shaded/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 1474
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 1472
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private static atomicLongAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            ">;"
        }
    .end annotation

    .line 542
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/Gson$4;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/shaded/gson/Gson$4;-><init>(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)V

    .line 553
    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/Gson$4;->nullSafe()Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static atomicLongArrayAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/util/concurrent/atomic/AtomicLongArray;",
            ">;"
        }
    .end annotation

    .line 558
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/Gson$5;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/shaded/gson/Gson$5;-><init>(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)V

    .line 584
    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/Gson$5;->nullSafe()Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method static checkValidFloatingPoint(D)V
    .locals 2

    .line 508
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 509
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private doubleAdapter(Z)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 452
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->DOUBLE:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    return-object p1

    .line 454
    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/Gson$1;

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/Gson$1;-><init>(Lcom/nimbusds/jose/shaded/gson/Gson;)V

    return-object p1
.end method

.method private floatAdapter(Z)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 479
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->FLOAT:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    return-object p1

    .line 481
    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/gson/Gson$2;

    invoke-direct {p1, p0}, Lcom/nimbusds/jose/shaded/gson/Gson$2;-><init>(Lcom/nimbusds/jose/shaded/gson/Gson;)V

    return-object p1
.end method

.method private static longAdapter(Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;",
            ")",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    .line 517
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    if-ne p0, v0, :cond_0

    .line 518
    sget-object p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->LONG:Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    return-object p0

    .line 520
    :cond_0
    new-instance p0, Lcom/nimbusds/jose/shaded/gson/Gson$3;

    invoke-direct {p0}, Lcom/nimbusds/jose/shaded/gson/Gson$3;-><init>()V

    return-object p0
.end method


# virtual methods
.method public excluder()Lcom/nimbusds/jose/shaded/gson/internal/Excluder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 418
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object v0
.end method

.method public fieldNamingStrategy()Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->fieldNamingStrategy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    return-object v0
.end method

.method public fromJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/JsonElement;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1463
    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonTreeReader;

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonTreeReader;-><init>(Lcom/nimbusds/jose/shaded/gson/JsonElement;)V

    invoke-virtual {p0, v0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/JsonElement;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1406
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    .line 1407
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/JsonElement;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1434
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;,
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    const-string v0, "AssertionError (GSON 2.11.0): "

    .line 1348
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v1

    .line 1350
    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-eqz v2, :cond_0

    .line 1351
    invoke-virtual {p1, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    goto :goto_0

    .line 1352
    :cond_0
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v2

    sget-object v3, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-ne v2, v3, :cond_1

    .line 1354
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/Strictness;->LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-virtual {p1, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1358
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->peek()Lcom/nimbusds/jose/shaded/gson/stream/JsonToken;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    .line 1360
    :try_start_1
    invoke-virtual {p0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p2

    .line 1361
    invoke-virtual {p2, p1}, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;->read(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1380
    invoke-virtual {p1, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    .line 1377
    :try_start_2
    new-instance v2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1378
    invoke-virtual {p2}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_2
    move-exception p2

    .line 1375
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v0, p2}, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p2

    .line 1372
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v0, p2}, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception p2

    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    .line 1380
    invoke-virtual {p1, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    const/4 p1, 0x0

    return-object p1

    .line 1370
    :cond_2
    :try_start_3
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v0, p2}, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1380
    :goto_2
    invoke-virtual {p1, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1381
    throw p2
.end method

.method public fromJson(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;,
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1306
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Ljava/io/Reader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;,
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1261
    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/shaded/gson/Gson;->newJsonReader(Ljava/io/Reader;)Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;

    move-result-object p1

    .line 1262
    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p2

    .line 1263
    invoke-static {p2, p1}, Lcom/nimbusds/jose/shaded/gson/Gson;->assertFullConsumption(Ljava/lang/Object;Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;)V

    return-object p2
.end method

.method public fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;,
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    .line 1199
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Ljava/io/Reader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    .line 1200
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;,
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1230
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Ljava/io/Reader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Ljava/lang/String;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1170
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 1171
    invoke-virtual {p0, v0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Ljava/io/Reader;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1107
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Ljava/lang/String;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    .line 1108
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;
        }
    .end annotation

    .line 1137
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->fromJson(Ljava/lang/String;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 599
    const-string v0, "type must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 600
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->typeTokenCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v0, :cond_0

    return-object v0

    .line 607
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->threadLocalAdapterResults:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    .line 610
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 611
    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->threadLocalAdapterResults:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    .line 616
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const/4 v1, 0x0

    .line 624
    :goto_0
    :try_start_0
    new-instance v2, Lcom/nimbusds/jose/shaded/gson/Gson$FutureTypeAdapter;

    invoke-direct {v2}, Lcom/nimbusds/jose/shaded/gson/Gson$FutureTypeAdapter;-><init>()V

    .line 625
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    iget-object v3, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->factories:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    .line 628
    invoke-interface {v4, p0, p1}, Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;->create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 630
    invoke-virtual {v2, v4}, Lcom/nimbusds/jose/shaded/gson/Gson$FutureTypeAdapter;->setDelegate(Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)V

    .line 632
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    if-eqz v1, :cond_5

    .line 638
    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->threadLocalAdapterResults:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    if-eqz v4, :cond_7

    if-eqz v1, :cond_6

    .line 654
    iget-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->typeTokenCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putAll(Ljava/util/Map;)V

    :cond_6
    return-object v4

    .line 643
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GSON (2.11.0) cannot handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_8

    .line 638
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->threadLocalAdapterResults:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 640
    :cond_8
    throw p1
.end method

.method public getAdapter(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 666
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p1

    return-object p1
.end method

.method public getDelegateAdapter(Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            "Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 731
    const-string v0, "skipPast must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 732
    const-string v0, "type must not be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 734
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    invoke-virtual {v0, p2, p1}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->isClassJsonAdapterFactory(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 735
    iget-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->jsonAdapterFactory:Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 739
    :cond_0
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->factories:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 747
    :cond_2
    invoke-interface {v2, p0, p2}, Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;->create(Lcom/nimbusds/jose/shaded/gson/Gson;Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    if-nez v1, :cond_4

    .line 757
    invoke-virtual {p0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p1

    return-object p1

    .line 754
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GSON cannot serialize or deserialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public htmlSafe()Z
    .locals 1

    .line 447
    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    return v0
.end method

.method public newBuilder()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 409
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;

    invoke-direct {v0, p0}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;-><init>(Lcom/nimbusds/jose/shaded/gson/Gson;)V

    return-object v0
.end method

.method public newJsonReader(Ljava/io/Reader;)Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;
    .locals 1

    .line 1078
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 1079
    iget-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-nez p1, :cond_0

    sget-object p1, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    :cond_0
    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonReader;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    return-object v0
.end method

.method public newJsonWriter(Ljava/io/Writer;)Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1054
    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->generateNonExecutableJson:Z

    if-eqz v0, :cond_0

    .line 1055
    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1057
    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 1058
    iget-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setFormattingStyle(Lcom/nimbusds/jose/shaded/gson/FormattingStyle;)V

    .line 1059
    iget-boolean p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 1060
    iget-object p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-nez p1, :cond_1

    sget-object p1, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    :cond_1
    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1061
    iget-boolean p1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    return-object v0
.end method

.method public serializeNulls()Z
    .locals 1

    .line 437
    iget-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    return v0
.end method

.method public toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;)Ljava/lang/String;
    .locals 1

    .line 965
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 966
    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Ljava/lang/Appendable;)V

    .line 967
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    .line 823
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 825
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 847
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 848
    invoke-virtual {p0, p1, p2, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    .line 849
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    const-string v0, "AssertionError (GSON 2.11.0): "

    .line 1008
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v1

    .line 1009
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->isHtmlSafe()Z

    move-result v2

    .line 1010
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getSerializeNulls()Z

    move-result v3

    .line 1012
    iget-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    invoke-virtual {p2, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 1013
    iget-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    invoke-virtual {p2, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    .line 1015
    iget-object v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-eqz v4, :cond_0

    .line 1016
    invoke-virtual {p2, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    goto :goto_0

    .line 1017
    :cond_0
    invoke-virtual {p2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v4

    sget-object v5, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-ne v4, v5, :cond_1

    .line 1019
    sget-object v4, Lcom/nimbusds/jose/shaded/gson/Strictness;->LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-virtual {p2, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1023
    :cond_1
    :goto_0
    :try_start_0
    invoke-static {p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/Streams;->write(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1030
    invoke-virtual {p2, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1031
    invoke-virtual {p2, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 1032
    invoke-virtual {p2, v3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 1027
    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1028
    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_1
    move-exception p1

    .line 1025
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {v0, p1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1030
    :goto_1
    invoke-virtual {p2, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 1031
    invoke-virtual {p2, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 1032
    invoke-virtual {p2, v3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    .line 1033
    throw p1
.end method

.method public toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Ljava/lang/Appendable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    .line 980
    :try_start_0
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/internal/Streams;->writerForAppendable(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;

    move-result-object p2

    .line 981
    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 983
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public toJson(Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 870
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    return-void

    .line 872
    :cond_0
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Lcom/nimbusds/jose/shaded/gson/JsonElement;Ljava/lang/Appendable;)V

    return-void
.end method

.method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    const-string v0, "AssertionError (GSON 2.11.0): "

    .line 928
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/nimbusds/jose/shaded/gson/Gson;->getAdapter(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;)Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    move-result-object p2

    .line 930
    invoke-virtual {p3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v1

    .line 931
    iget-object v2, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-eqz v2, :cond_0

    .line 932
    invoke-virtual {p3, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    goto :goto_0

    .line 933
    :cond_0
    invoke-virtual {p3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getStrictness()Lcom/nimbusds/jose/shaded/gson/Strictness;

    move-result-object v2

    sget-object v3, Lcom/nimbusds/jose/shaded/gson/Strictness;->LEGACY_STRICT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    if-ne v2, v3, :cond_1

    .line 935
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/Strictness;->LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-virtual {p3, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 938
    :cond_1
    :goto_0
    invoke-virtual {p3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->isHtmlSafe()Z

    move-result v2

    .line 939
    invoke-virtual {p3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->getSerializeNulls()Z

    move-result v3

    .line 941
    iget-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    invoke-virtual {p3, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 942
    iget-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    invoke-virtual {p3, v4}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    .line 944
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;->write(Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 951
    invoke-virtual {p3, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 952
    invoke-virtual {p3, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 953
    invoke-virtual {p3, v3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 948
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 949
    invoke-virtual {p1}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 946
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 951
    :goto_1
    invoke-virtual {p3, v1}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)V

    .line 952
    invoke-virtual {p3, v2}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setHtmlSafe(Z)V

    .line 953
    invoke-virtual {p3, v3}, Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;->setSerializeNulls(Z)V

    .line 954
    throw p1
.end method

.method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/gson/JsonIOException;
        }
    .end annotation

    .line 898
    :try_start_0
    invoke-static {p3}, Lcom/nimbusds/jose/shaded/gson/internal/Streams;->writerForAppendable(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/nimbusds/jose/shaded/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;

    move-result-object p3

    .line 899
    invoke-virtual {p0, p1, p2, p3}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 901
    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/nimbusds/jose/shaded/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public toJsonTree(Ljava/lang/Object;)Lcom/nimbusds/jose/shaded/gson/JsonElement;
    .locals 1

    if-nez p1, :cond_0

    .line 777
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/JsonNull;->INSTANCE:Lcom/nimbusds/jose/shaded/gson/JsonNull;

    return-object p1

    .line 779
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/JsonElement;
    .locals 1

    .line 801
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonTreeWriter;

    invoke-direct {v0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonTreeWriter;-><init>()V

    .line 802
    invoke-virtual {p0, p1, p2, v0}, Lcom/nimbusds/jose/shaded/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/nimbusds/jose/shaded/gson/stream/JsonWriter;)V

    .line 803
    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/JsonTreeWriter;->get()Lcom/nimbusds/jose/shaded/gson/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1527
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->factories:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/Gson;->constructorConstructor:Lcom/nimbusds/jose/shaded/gson/internal/ConstructorConstructor;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
