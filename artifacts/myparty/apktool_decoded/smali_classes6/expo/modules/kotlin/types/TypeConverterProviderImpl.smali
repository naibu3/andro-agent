.class public final Lexpo/modules/kotlin/types/TypeConverterProviderImpl;
.super Ljava/lang/Object;
.source "TypeConverterProvider.kt"

# interfaces
.implements Lexpo/modules/kotlin/types/TypeConverterProvider;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTypeConverterProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeConverterProvider.kt\nexpo/modules/kotlin/types/TypeConverterProviderImpl\n+ 2 TypeConverter.kt\nexpo/modules/kotlin/types/TypeConverterKt\n*L\n1#1,348:1\n65#2:349\n65#2:350\n65#2:351\n65#2:352\n65#2:353\n65#2:354\n65#2:355\n65#2:356\n61#2,5:357\n61#2,5:362\n65#2:367\n65#2:368\n65#2:369\n65#2:370\n65#2:371\n*S KotlinDebug\n*F\n+ 1 TypeConverterProvider.kt\nexpo/modules/kotlin/types/TypeConverterProviderImpl\n*L\n186#1:349\n189#1:350\n192#1:351\n195#1:352\n198#1:353\n218#1:354\n222#1:355\n225#1:356\n231#1:357,5\n234#1:362,5\n281#1:367\n289#1:368\n297#1:369\n305#1:370\n313#1:371\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u000c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\"\u0010\u0012\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\u0008\u00030\u0014H\u0002J\u001c\u0010\u0015\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005H\u0002J\u001c\u0010\u0016\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005H\u0002R\"\u0010\u0004\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0008\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/TypeConverterProviderImpl;",
        "Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "<init>",
        "()V",
        "cachedConverters",
        "",
        "Lkotlin/reflect/KClass;",
        "Lexpo/modules/kotlin/types/TypeConverter;",
        "cachedPrimitiveArrayConverters",
        "cachedRecordConverters",
        "",
        "Lkotlin/reflect/KType;",
        "getCachedConverter",
        "inputType",
        "getCachedPrimitiveArrayConverter",
        "obtainTypeConverter",
        "type",
        "obtainNonNullableTypeConverter",
        "handelEither",
        "jClass",
        "Ljava/lang/Class;",
        "createCachedConverters",
        "createCachedPrimitiveArrayConverters",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/kotlin/types/TypeConverterProviderImpl;

.field private static final cachedConverters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final cachedPrimitiveArrayConverters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final cachedRecordConverters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lkotlin/reflect/KType;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;

    invoke-direct {v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;-><init>()V

    sput-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->INSTANCE:Lexpo/modules/kotlin/types/TypeConverterProviderImpl;

    .line 77
    invoke-direct {v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->createCachedConverters()Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedConverters:Ljava/util/Map;

    .line 78
    invoke-direct {v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->createCachedPrimitiveArrayConverters()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedPrimitiveArrayConverters:Ljava/util/Map;

    .line 80
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    sput-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedRecordConverters:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createCachedConverters()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation

    .line 187
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    const/4 v1, 0x1

    new-array v2, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->INT:Lexpo/modules/kotlin/jni/CppType;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {v0, v2}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 349
    new-instance v2, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$1;

    invoke-direct {v2, v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$1;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v2, Lexpo/modules/kotlin/types/TypeConverter;

    .line 190
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v3, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v5, Lexpo/modules/kotlin/jni/CppType;->LONG:Lexpo/modules/kotlin/jni/CppType;

    aput-object v5, v3, v4

    invoke-direct {v0, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 350
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$2;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$2;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 193
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v5, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v6, Lexpo/modules/kotlin/jni/CppType;->DOUBLE:Lexpo/modules/kotlin/jni/CppType;

    aput-object v6, v5, v4

    invoke-direct {v0, v5}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 351
    new-instance v5, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$3;

    invoke-direct {v5, v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$3;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v5, Lexpo/modules/kotlin/types/TypeConverter;

    .line 196
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->FLOAT:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v0, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 352
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$4;

    invoke-direct {v6, v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$4;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 199
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v7, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v8, Lexpo/modules/kotlin/jni/CppType;->BOOLEAN:Lexpo/modules/kotlin/jni/CppType;

    aput-object v8, v7, v4

    invoke-direct {v0, v7}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 353
    new-instance v7, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$5;

    invoke-direct {v7, v0}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$5;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v7, Lexpo/modules/kotlin/types/TypeConverter;

    const/16 v0, 0x24

    .line 203
    new-array v0, v0, [Lkotlin/Pair;

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v0, v4

    const-class v8, Ljava/lang/Integer;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    .line 204
    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v1

    .line 203
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 206
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v8, 0x2

    aput-object v2, v0, v8

    .line 203
    const-class v2, Ljava/lang/Long;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 207
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    .line 203
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 209
    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v9, 0x4

    aput-object v2, v0, v9

    .line 203
    const-class v2, Ljava/lang/Double;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 210
    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x5

    aput-object v2, v0, v5

    .line 203
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 212
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x6

    aput-object v2, v0, v5

    .line 203
    const-class v2, Ljava/lang/Float;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 213
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x7

    aput-object v2, v0, v5

    .line 203
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 215
    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x8

    aput-object v2, v0, v5

    .line 203
    const-class v2, Ljava/lang/Boolean;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 216
    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x9

    aput-object v2, v0, v5

    .line 203
    const-class v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 219
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->STRING:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 354
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$6;

    invoke-direct {v6, v5}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$6;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 218
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xa

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 223
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->READABLE_ARRAY:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 355
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$7;

    invoke-direct {v6, v5}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$7;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 222
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xb

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 226
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->READABLE_MAP:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 356
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$8;

    invoke-direct {v6, v5}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$8;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 225
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xc

    aput-object v2, v0, v5

    .line 203
    const-class v2, [B

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 229
    new-instance v5, Lexpo/modules/kotlin/types/ByteArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/ByteArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xd

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/jni/JavaScriptValue;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 232
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->JS_VALUE:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 361
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$1;

    invoke-direct {v6, v5}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$1;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 231
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xe

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/jni/JavaScriptObject;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 235
    new-instance v5, Lexpo/modules/kotlin/jni/ExpectedType;

    new-array v6, v1, [Lexpo/modules/kotlin/jni/CppType;

    sget-object v7, Lexpo/modules/kotlin/jni/CppType;->JS_OBJECT:Lexpo/modules/kotlin/jni/CppType;

    aput-object v7, v6, v4

    invoke-direct {v5, v6}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/CppType;)V

    .line 366
    new-instance v6, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$2;

    invoke-direct {v6, v5}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$2;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v6, Lexpo/modules/kotlin/types/TypeConverter;

    .line 234
    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0xf

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Int8Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 238
    new-instance v5, Lexpo/modules/kotlin/types/Int8ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Int8ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x10

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Int16Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 239
    new-instance v5, Lexpo/modules/kotlin/types/Int16ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Int16ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x11

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Int32Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 240
    new-instance v5, Lexpo/modules/kotlin/types/Int32ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Int32ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x12

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Uint8Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 241
    new-instance v5, Lexpo/modules/kotlin/types/Uint8ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Uint8ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x13

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Uint8ClampedArray;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 242
    new-instance v5, Lexpo/modules/kotlin/types/Uint8ClampedArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Uint8ClampedArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x14

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Uint16Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 243
    new-instance v5, Lexpo/modules/kotlin/types/Uint16ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Uint16ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x15

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Uint32Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 244
    new-instance v5, Lexpo/modules/kotlin/types/Uint32ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Uint32ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x16

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Float32Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 245
    new-instance v5, Lexpo/modules/kotlin/types/Float32ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Float32ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x17

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/Float64Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 246
    new-instance v5, Lexpo/modules/kotlin/types/Float64ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/Float64ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x18

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/BigInt64Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 247
    new-instance v5, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x19

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/BigUint64Array;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 248
    new-instance v5, Lexpo/modules/kotlin/types/BigUint64ArrayTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/BigUint64ArrayTypeConverter;-><init>()V

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v5, 0x1a

    aput-object v2, v0, v5

    .line 203
    const-class v2, Lexpo/modules/kotlin/typedarray/TypedArray;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 249
    new-instance v6, Lexpo/modules/kotlin/types/TypedArrayTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/TypedArrayTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1b

    aput-object v2, v0, v6

    .line 203
    const-class v2, Ljava/net/URL;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 251
    new-instance v6, Lexpo/modules/kotlin/types/net/URLTypConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/net/URLTypConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1c

    aput-object v2, v0, v6

    .line 203
    const-class v2, Landroid/net/Uri;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 252
    new-instance v6, Lexpo/modules/kotlin/types/net/UriTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/net/UriTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1d

    aput-object v2, v0, v6

    .line 203
    const-class v2, Ljava/net/URI;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 253
    new-instance v6, Lexpo/modules/kotlin/types/net/JavaURITypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/net/JavaURITypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1e

    aput-object v2, v0, v6

    .line 203
    const-class v2, Ljava/io/File;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 255
    new-instance v6, Lexpo/modules/kotlin/types/io/FileTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/io/FileTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1f

    aput-object v2, v0, v6

    .line 203
    const-class v2, Lkotlin/time/Duration;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 257
    new-instance v6, Lexpo/modules/kotlin/types/DurationTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/DurationTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x20

    aput-object v2, v0, v6

    .line 203
    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 259
    new-instance v6, Lexpo/modules/kotlin/types/AnyTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/AnyTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x21

    aput-object v2, v0, v6

    .line 203
    const-class v2, Lkotlin/Unit;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 263
    new-instance v6, Lexpo/modules/kotlin/types/UnitTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/UnitTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x22

    aput-object v2, v0, v6

    .line 203
    const-class v2, Lexpo/modules/core/arguments/ReadableArguments;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 265
    new-instance v6, Lexpo/modules/kotlin/types/ReadableArgumentsTypeConverter;

    invoke-direct {v6}, Lexpo/modules/kotlin/types/ReadableArgumentsTypeConverter;-><init>()V

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x23

    aput-object v2, v0, v6

    .line 202
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 268
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v5, :cond_0

    .line 270
    new-array v2, v3, [Lkotlin/Pair;

    const-class v3, Ljava/nio/file/Path;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    new-instance v5, Lexpo/modules/kotlin/types/io/PathTypeConverter;

    invoke-direct {v5}, Lexpo/modules/kotlin/types/io/PathTypeConverter;-><init>()V

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v4

    const-class v3, Landroid/graphics/Color;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 271
    new-instance v4, Lexpo/modules/kotlin/types/ColorTypeConverter;

    invoke-direct {v4}, Lexpo/modules/kotlin/types/ColorTypeConverter;-><init>()V

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v1

    .line 270
    const-class v1, Ljava/time/LocalDate;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 272
    new-instance v3, Lexpo/modules/kotlin/types/DateTypeConverter;

    invoke-direct {v3}, Lexpo/modules/kotlin/types/DateTypeConverter;-><init>()V

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v2, v8

    .line 269
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final createCachedPrimitiveArrayConverters()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x5

    .line 281
    new-array v0, v0, [Lkotlin/Pair;

    const-class v1, [I

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 282
    sget-object v2, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->INT:Lexpo/modules/kotlin/jni/CppType;

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;->forPrimitiveArray(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;

    move-result-object v2

    .line 367
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$1;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$1;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 281
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, [J

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 290
    sget-object v2, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->LONG:Lexpo/modules/kotlin/jni/CppType;

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;->forPrimitiveArray(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;

    move-result-object v2

    .line 368
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$2;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$2;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 289
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 281
    const-class v1, [D

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 298
    sget-object v2, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->DOUBLE:Lexpo/modules/kotlin/jni/CppType;

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;->forPrimitiveArray(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;

    move-result-object v2

    .line 369
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$3;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$3;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 297
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 281
    const-class v1, [F

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 306
    sget-object v2, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->FLOAT:Lexpo/modules/kotlin/jni/CppType;

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;->forPrimitiveArray(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;

    move-result-object v2

    .line 370
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$4;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$4;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 305
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 281
    const-class v1, [Z

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 314
    sget-object v2, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    sget-object v3, Lexpo/modules/kotlin/jni/CppType;->BOOLEAN:Lexpo/modules/kotlin/jni/CppType;

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;->forPrimitiveArray(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;

    move-result-object v2

    .line 371
    new-instance v3, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$5;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$5;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v3, Lexpo/modules/kotlin/types/TypeConverter;

    .line 313
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 280
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final getCachedConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KType;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    .line 83
    sget-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedConverters:Ljava/util/Map;

    invoke-interface {p1}, Lkotlin/reflect/KType;->getClassifier()Lkotlin/reflect/KClassifier;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p1
.end method

.method private final getCachedPrimitiveArrayConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KType;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    .line 86
    sget-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedPrimitiveArrayConverters:Ljava/util/Map;

    invoke-interface {p1}, Lkotlin/reflect/KType;->getClassifier()Lkotlin/reflect/KClassifier;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p1
.end method

.method private final handelEither(Lkotlin/reflect/KType;Ljava/lang/Class;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KType;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    .line 172
    const-class v0, Lexpo/modules/kotlin/types/Either;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    const-class v0, Lexpo/modules/kotlin/types/EitherOfFour;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    new-instance p2, Lexpo/modules/kotlin/types/EitherOfFourTypeConverter;

    move-object v0, p0

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {p2, v0, p1}, Lexpo/modules/kotlin/types/EitherOfFourTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast p2, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p2

    .line 176
    :cond_0
    const-class v0, Lexpo/modules/kotlin/types/EitherOfThree;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 177
    new-instance p2, Lexpo/modules/kotlin/types/EitherOfThreeTypeConverter;

    move-object v0, p0

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {p2, v0, p1}, Lexpo/modules/kotlin/types/EitherOfThreeTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast p2, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p2

    .line 179
    :cond_1
    new-instance p2, Lexpo/modules/kotlin/types/EitherTypeConverter;

    move-object v0, p0

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {p2, v0, p1}, Lexpo/modules/kotlin/types/EitherTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast p2, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final obtainNonNullableTypeConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KType;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->getCachedConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 103
    :cond_0
    invoke-interface {p1}, Lkotlin/reflect/KType;->getClassifier()Lkotlin/reflect/KClassifier;

    move-result-object v0

    instance-of v1, v0, Lkotlin/reflect/KClass;

    if-eqz v1, :cond_1

    check-cast v0, Lkotlin/reflect/KClass;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_13

    .line 104
    invoke-static {v0}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-nez v2, :cond_10

    const-class v2, [Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    .line 114
    :cond_2
    const-class v2, Ljava/util/List;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 115
    new-instance v0, Lexpo/modules/kotlin/types/ListTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/ListTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 118
    :cond_3
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 119
    new-instance v0, Lexpo/modules/kotlin/types/MapTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/MapTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 122
    :cond_4
    const-class v2, Lkotlin/Pair;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 123
    new-instance v0, Lexpo/modules/kotlin/types/PairTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/PairTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 126
    :cond_5
    const-class v2, Ljava/util/Set;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 127
    new-instance v0, Lexpo/modules/kotlin/types/SetTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/SetTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 130
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 132
    new-instance p1, Lexpo/modules/kotlin/types/EnumTypeConverter;

    invoke-direct {p1, v0}, Lexpo/modules/kotlin/types/EnumTypeConverter;-><init>(Lkotlin/reflect/KClass;)V

    check-cast p1, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p1

    .line 135
    :cond_7
    sget-object v0, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->cachedRecordConverters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/TypeConverter;

    if-eqz v2, :cond_8

    return-object v2

    .line 140
    :cond_8
    const-class v2, Lexpo/modules/kotlin/records/Record;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 141
    new-instance v1, Lexpo/modules/kotlin/records/RecordTypeConverter;

    move-object v2, p0

    check-cast v2, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v1, v2, p1}, Lexpo/modules/kotlin/records/RecordTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    .line 142
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    check-cast v1, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v1

    .line 146
    :cond_9
    const-class v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 147
    new-instance v0, Lexpo/modules/kotlin/views/ViewTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/views/ViewTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 150
    :cond_a
    const-class v0, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 151
    new-instance v0, Lexpo/modules/kotlin/sharedobjects/SharedRefTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedRefTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 154
    :cond_b
    const-class v0, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 155
    new-instance v0, Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedObjectTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 158
    :cond_c
    const-class v0, Lexpo/modules/kotlin/jni/JavaScriptFunction;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 159
    new-instance v0, Lexpo/modules/kotlin/types/JavaScriptFunctionTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/types/JavaScriptFunctionTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 162
    :cond_d
    const-class v0, Lexpo/modules/kotlin/types/ValueOrUndefined;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 163
    new-instance v0, Lexpo/modules/kotlin/types/ValueOrUndefinedTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/ValueOrUndefinedTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 166
    :cond_e
    invoke-direct {p0, p1, v1}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->handelEither(Lkotlin/reflect/KType;Ljava/lang/Class;)Lexpo/modules/kotlin/types/TypeConverter;

    move-result-object v0

    if-eqz v0, :cond_f

    return-object v0

    .line 167
    :cond_f
    new-instance v0, Lexpo/modules/kotlin/exception/MissingTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/exception/MissingTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    throw v0

    .line 107
    :cond_10
    :goto_1
    invoke-static {p1, v1}, Lexpo/modules/kotlin/types/ArrayTypeConverterKt;->isPrimitiveArray(Lkotlin/reflect/KType;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 108
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->getCachedPrimitiveArrayConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;

    move-result-object v0

    if-eqz v0, :cond_11

    return-object v0

    :cond_11
    new-instance v0, Lexpo/modules/kotlin/exception/MissingTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/exception/MissingTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    throw v0

    .line 110
    :cond_12
    new-instance v0, Lexpo/modules/kotlin/types/ArrayTypeConverter;

    move-object v1, p0

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterProvider;

    invoke-direct {v0, v1, p1}, Lexpo/modules/kotlin/types/ArrayTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverterProvider;Lkotlin/reflect/KType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0

    .line 103
    :cond_13
    new-instance v0, Lexpo/modules/kotlin/exception/MissingTypeConverter;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/exception/MissingTypeConverter;-><init>(Lkotlin/reflect/KType;)V

    throw v0
.end method

.method public obtainTypeConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KType;",
            ")",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/types/TypeConverterProviderImpl;->obtainNonNullableTypeConverter(Lkotlin/reflect/KType;)Lexpo/modules/kotlin/types/TypeConverter;

    move-result-object v0

    .line 91
    invoke-interface {p1}, Lkotlin/reflect/KType;->isMarkedNullable()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 92
    new-instance p1, Lexpo/modules/kotlin/types/NullableTypeConverter;

    invoke-direct {p1, v0}, Lexpo/modules/kotlin/types/NullableTypeConverter;-><init>(Lexpo/modules/kotlin/types/TypeConverter;)V

    check-cast p1, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p1

    :cond_0
    return-object v0
.end method
