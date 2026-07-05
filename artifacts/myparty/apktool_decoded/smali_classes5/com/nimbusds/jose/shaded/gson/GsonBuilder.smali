.class public final Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
.super Ljava/lang/Object;
.source "GsonBuilder.java"


# instance fields
.field private complexMapKeySerialization:Z

.field private datePattern:Ljava/lang/String;

.field private dateStyle:I

.field private escapeHtmlChars:Z

.field private excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

.field private final factories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field private fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

.field private formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

.field private generateNonExecutableJson:Z

.field private final hierarchyFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final instanceCreators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/nimbusds/jose/shaded/gson/InstanceCreator<",
            "*>;>;"
        }
    .end annotation
.end field

.field private longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

.field private numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field private objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

.field private final reflectionFilters:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;",
            ">;"
        }
    .end annotation
.end field

.field private serializeNulls:Z

.field private serializeSpecialFloatingPointValues:Z

.field private strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

.field private timeStyle:I

.field private useJdkUnsafe:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    .line 95
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    .line 96
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;->IDENTITY:Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    const/4 v0, 0x0

    .line 103
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeNulls:Z

    .line 104
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    iput-object v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    const/4 v1, 0x2

    .line 105
    iput v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    .line 106
    iput v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    .line 107
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 108
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    const/4 v1, 0x1

    .line 109
    iput-boolean v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 110
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FORMATTING_STYLE:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    .line 111
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 112
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_STRICTNESS:Lcom/nimbusds/jose/shaded/gson/Strictness;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 113
    iput-boolean v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 114
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 115
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 116
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    return-void
.end method

.method constructor <init>(Lcom/nimbusds/jose/shaded/gson/Gson;)V
    .locals 6

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    .line 95
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;->DEFAULT:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    .line 96
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;->IDENTITY:Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 101
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    const/4 v3, 0x0

    .line 103
    iput-boolean v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeNulls:Z

    .line 104
    sget-object v4, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    const/4 v4, 0x2

    .line 105
    iput v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    .line 106
    iput v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    .line 107
    iput-boolean v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 108
    iput-boolean v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    const/4 v4, 0x1

    .line 109
    iput-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 110
    sget-object v5, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_FORMATTING_STYLE:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    iput-object v5, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    .line 111
    iput-boolean v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 112
    sget-object v3, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_STRICTNESS:Lcom/nimbusds/jose/shaded/gson/Strictness;

    iput-object v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 113
    iput-boolean v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 114
    sget-object v3, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 115
    sget-object v3, Lcom/nimbusds/jose/shaded/gson/Gson;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 116
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    .line 132
    iget-object v4, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    .line 133
    iget-object v4, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->fieldNamingStrategy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    iput-object v4, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    .line 134
    iget-object v4, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->instanceCreators:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 135
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeNulls:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeNulls:Z

    .line 136
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->complexMapKeySerialization:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 137
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->generateNonExecutableJson:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 138
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->htmlSafe:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 139
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    .line 140
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    .line 141
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->serializeSpecialFloatingPointValues:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    .line 142
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    .line 143
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->datePattern:Ljava/lang/String;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    .line 144
    iget v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->dateStyle:I

    iput v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    .line 145
    iget v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->timeStyle:I

    iput v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    .line 146
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->builderFactories:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 147
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->builderHierarchyFactories:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 148
    iget-boolean v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->useJdkUnsafe:Z

    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 149
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 150
    iget-object v0, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    .line 151
    iget-object p1, p1, Lcom/nimbusds/jose/shaded/gson/Gson;->reflectionFilters:Ljava/util/List;

    invoke-virtual {v3, p1}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private static addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;",
            ">;)V"
        }
    .end annotation

    .line 915
    sget-boolean v0, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->SUPPORTS_SQL_TYPES:Z

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 919
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 920
    sget-object p1, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->DATE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    invoke-virtual {p1, p0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p1

    if-eqz v0, :cond_3

    .line 923
    sget-object p2, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 924
    invoke-virtual {p2, p0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    .line 925
    sget-object p2, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    invoke-virtual {p2, p0}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    if-ne p1, p0, :cond_1

    if-eq p2, p0, :cond_4

    .line 928
    :cond_1
    sget-object p0, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->DATE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 929
    invoke-virtual {p0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p0

    if-eqz v0, :cond_2

    .line 932
    sget-object v1, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 933
    invoke-virtual {v1, p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    .line 934
    sget-object v2, Lcom/nimbusds/jose/shaded/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    .line 935
    invoke-virtual {v2, p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p1

    move-object v3, p1

    move-object p1, p0

    move-object p0, v3

    goto :goto_0

    :cond_2
    move-object p1, p0

    :cond_3
    move-object p0, v1

    .line 941
    :goto_0
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_4

    .line 943
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 944
    invoke-interface {p3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method private static checkDateFormatStyle(I)I
    .locals 3

    if-ltz p0, :cond_0

    const/4 v0, 0x3

    if-gt p0, v0, :cond_0

    return p0

    .line 672
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid style: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static isTypeObjectOrJsonElement(Ljava/lang/reflect/Type;)Z
    .locals 1

    .line 734
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    const-class v0, Ljava/lang/Object;

    if-eq p0, v0, :cond_0

    const-class v0, Lcom/nimbusds/jose/shaded/gson/JsonElement;

    check-cast p0, Ljava/lang/Class;

    .line 735
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public addDeserializationExclusionStrategy(Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 3

    .line 499
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->withExclusionStrategy(Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0
.end method

.method public addReflectionAccessFilter(Lcom/nimbusds/jose/shaded/gson/ReflectionAccessFilter;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 865
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 866
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    return-object p0
.end method

.method public addSerializationExclusionStrategy(Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 3

    .line 478
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->withExclusionStrategy(Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0
.end method

.method public create()Lcom/nimbusds/jose/shaded/gson/Gson;
    .locals 24

    move-object/from16 v0, p0

    .line 877
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 878
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 879
    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 880
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 882
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 883
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 884
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 886
    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    iget v3, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    iget v4, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    invoke-static {v2, v3, v4, v1}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V

    move-object/from16 v19, v1

    .line 888
    new-instance v1, Lcom/nimbusds/jose/shaded/gson/Gson;

    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    iget-object v3, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    new-instance v4, Ljava/util/HashMap;

    iget-object v5, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-boolean v5, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeNulls:Z

    iget-boolean v6, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->complexMapKeySerialization:Z

    iget-boolean v7, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->generateNonExecutableJson:Z

    iget-boolean v8, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->escapeHtmlChars:Z

    iget-object v9, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    iget-object v10, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    iget-boolean v11, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    iget-boolean v12, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->useJdkUnsafe:Z

    iget-object v13, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    iget-object v14, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    iget v15, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    move-object/from16 v16, v1

    iget v1, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    move/from16 v17, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v18, v2

    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    move-object/from16 v22, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v23, v2

    iget-object v2, v0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v2, v22

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v2

    move-object/from16 v2, v18

    move-object/from16 v18, v23

    invoke-direct/range {v1 .. v22}, Lcom/nimbusds/jose/shaded/gson/Gson;-><init>(Lcom/nimbusds/jose/shaded/gson/internal/Excluder;Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZLcom/nimbusds/jose/shaded/gson/FormattingStyle;Lcom/nimbusds/jose/shaded/gson/Strictness;ZZLcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;Ljava/util/List;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public disableHtmlEscaping()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 580
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->escapeHtmlChars:Z

    return-object p0
.end method

.method public disableInnerClassSerialization()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->disableInnerClassSerialization()Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0
.end method

.method public disableJdkUnsafe()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 839
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->useJdkUnsafe:Z

    return-object p0
.end method

.method public enableComplexMapKeySerialization()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 326
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->complexMapKeySerialization:Z

    return-object p0
.end method

.method public varargs excludeFieldsWithModifiers([I)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 194
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    invoke-virtual {v0, p1}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->withModifiers([I)Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0
.end method

.method public excludeFieldsWithoutExposeAnnotation()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->excludeFieldsWithoutExposeAnnotation()Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0
.end method

.method public generateNonExecutableJson()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 209
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->generateNonExecutableJson:Z

    return-object p0
.end method

.method public registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 3

    .line 706
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    instance-of v0, p2, Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/InstanceCreator;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Preconditions;->checkArgument(Z)V

    .line 713
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->isTypeObjectOrJsonElement(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 717
    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/InstanceCreator;

    if-eqz v1, :cond_2

    .line 718
    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lcom/nimbusds/jose/shaded/gson/InstanceCreator;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    .line 720
    instance-of v0, p2, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-eqz v0, :cond_4

    .line 721
    :cond_3
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object v0

    .line 722
    iget-object v1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter;->newFactoryWithMatchRawType(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 724
    :cond_4
    instance-of v0, p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v0, :cond_5

    .line 727
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;

    move-result-object p1

    check-cast p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newFactory(Lcom/nimbusds/jose/shaded/gson/reflect/TypeToken;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p1

    .line 728
    iget-object p2, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0

    .line 714
    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot override built-in adapter for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public registerTypeAdapterFactory(Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 752
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public registerTypeHierarchyAdapter(Ljava/lang/Class;Ljava/lang/Object;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/nimbusds/jose/shaded/gson/GsonBuilder;"
        }
    .end annotation

    .line 775
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    instance-of v0, p2, Lcom/nimbusds/jose/shaded/gson/JsonSerializer;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lcom/nimbusds/jose/shaded/gson/internal/$Gson$Preconditions;->checkArgument(Z)V

    .line 781
    const-class v1, Lcom/nimbusds/jose/shaded/gson/JsonElement;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 785
    instance-of v1, p2, Lcom/nimbusds/jose/shaded/gson/JsonDeserializer;

    if-nez v1, :cond_2

    if-eqz v0, :cond_3

    .line 786
    :cond_2
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TreeTypeAdapter;->newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 788
    :cond_3
    instance-of v0, p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    if-eqz v0, :cond_4

    .line 790
    check-cast p2, Lcom/nimbusds/jose/shaded/gson/TypeAdapter;

    .line 791
    invoke-static {p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/bind/TypeAdapters;->newTypeHierarchyFactory(Ljava/lang/Class;Lcom/nimbusds/jose/shaded/gson/TypeAdapter;)Lcom/nimbusds/jose/shaded/gson/TypeAdapterFactory;

    move-result-object p1

    .line 792
    iget-object p2, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object p0

    .line 782
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot override built-in adapter for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public serializeNulls()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 238
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeNulls:Z

    return-object p0
.end method

.method public serializeSpecialFloatingPointValues()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 818
    iput-boolean v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    return-object p0
.end method

.method public setDateFormat(I)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 640
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    const/4 p1, 0x0

    .line 641
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(II)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 663
    invoke-static {p1}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->dateStyle:I

    .line 664
    invoke-static {p2}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->timeStyle:I

    const/4 p1, 0x0

    .line 665
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(Ljava/lang/String;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 4

    if-eqz p1, :cond_0

    .line 607
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 610
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The date pattern \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v2, "\' is not valid"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 613
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public varargs setExclusionStrategies([Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 5

    .line 455
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 457
    iget-object v3, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4, v4}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->withExclusionStrategy(Lcom/nimbusds/jose/shaded/gson/ExclusionStrategy;ZZ)Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object v2

    iput-object v2, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setFieldNamingPolicy(Lcom/nimbusds/jose/shaded/gson/FieldNamingPolicy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 379
    invoke-virtual {p0, p1}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->setFieldNamingStrategy(Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;

    move-result-object p1

    return-object p1
.end method

.method public setFieldNamingStrategy(Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 396
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->fieldNamingPolicy:Lcom/nimbusds/jose/shaded/gson/FieldNamingStrategy;

    return-object p0
.end method

.method public setFormattingStyle(Lcom/nimbusds/jose/shaded/gson/FormattingStyle;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 529
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->formattingStyle:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    return-object p0
.end method

.method public setLenient()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 549
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/Strictness;->LENIENT:Lcom/nimbusds/jose/shaded/gson/Strictness;

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setLongSerializationPolicy(Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 367
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->longSerializationPolicy:Lcom/nimbusds/jose/shaded/gson/LongSerializationPolicy;

    return-object p0
.end method

.method public setNumberToNumberStrategy(Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 424
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->numberToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    return-object p0
.end method

.method public setObjectToNumberStrategy(Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 410
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->objectToNumberStrategy:Lcom/nimbusds/jose/shaded/gson/ToNumberStrategy;

    return-object p0
.end method

.method public setPrettyPrinting()Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 1

    .line 515
    sget-object v0, Lcom/nimbusds/jose/shaded/gson/FormattingStyle;->PRETTY:Lcom/nimbusds/jose/shaded/gson/FormattingStyle;

    invoke-virtual {p0, v0}, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->setFormattingStyle(Lcom/nimbusds/jose/shaded/gson/FormattingStyle;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setStrictness(Lcom/nimbusds/jose/shaded/gson/Strictness;)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 0

    .line 567
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nimbusds/jose/shaded/gson/Strictness;

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->strictness:Lcom/nimbusds/jose/shaded/gson/Strictness;

    return-object p0
.end method

.method public setVersion(D)Lcom/nimbusds/jose/shaded/gson/GsonBuilder;
    .locals 3

    .line 171
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-ltz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    invoke-virtual {v0, p1, p2}, Lcom/nimbusds/jose/shaded/gson/internal/Excluder;->withVersion(D)Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/nimbusds/jose/shaded/gson/GsonBuilder;->excluder:Lcom/nimbusds/jose/shaded/gson/internal/Excluder;

    return-object p0

    .line 172
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid version: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
