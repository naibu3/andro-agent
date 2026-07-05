.class public final Lexpo/modules/kotlin/types/TypeConverterComponent;
.super Ljava/lang/Object;
.source "TypeConverterCollection.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Type:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTypeConverterCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeConverterCollection.kt\nexpo/modules/kotlin/types/TypeConverterComponent\n+ 2 TypeConverterCollection.kt\nexpo/modules/kotlin/types/TypeConverterCollection\n*L\n1#1,101:1\n38#2,6:102\n*S KotlinDebug\n*F\n+ 1 TypeConverterCollection.kt\nexpo/modules/kotlin/types/TypeConverterComponent\n*L\n17#1:102,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JC\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000\"\n\u0008\u0001\u0010\u000f\u0018\u0001*\u00020\u00022#\u0008\u0004\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u0011H\u000f\u00a2\u0006\u000c\u0008\u0012\u0012\u0008\u0008\u0013\u0012\u0004\u0008\u0008(\u0014\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0008\u00f8\u0001\u0000J\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0017\u0018\u00010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/TypeConverterComponent;",
        "Type",
        "",
        "desireType",
        "Lkotlin/reflect/KType;",
        "<init>",
        "(Lkotlin/reflect/KType;)V",
        "getDesireType",
        "()Lkotlin/reflect/KType;",
        "desireTypeConverter",
        "Lkotlin/Lazy;",
        "Lexpo/modules/kotlin/types/TypeConverterCollection;",
        "getDesireTypeConverter",
        "()Lkotlin/Lazy;",
        "from",
        "P0",
        "body",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "p0",
        "build",
        "Lkotlin/Pair;",
        "Lexpo/modules/kotlin/types/TypeConverter;",
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


# instance fields
.field private final desireType:Lkotlin/reflect/KType;

.field private final desireTypeConverter:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lexpo/modules/kotlin/types/TypeConverterCollection<",
            "TType;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$ltbBCaiNNRElWYJp8A_g0RjBB9M(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;
    .locals 0

    invoke-static {p0}, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter$lambda$0(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lkotlin/reflect/KType;)V
    .locals 1

    const-string v0, "desireType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:Lkotlin/reflect/KType;

    .line 14
    new-instance p1, Lexpo/modules/kotlin/types/TypeConverterComponent$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lexpo/modules/kotlin/types/TypeConverterComponent$$ExternalSyntheticLambda0;-><init>(Lexpo/modules/kotlin/types/TypeConverterComponent;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    return-void
.end method

.method private static final desireTypeConverter$lambda$0(Lexpo/modules/kotlin/types/TypeConverterComponent;)Lexpo/modules/kotlin/types/TypeConverterCollection;
    .locals 1

    .line 14
    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    iget-object p0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:Lkotlin/reflect/KType;

    invoke-direct {v0, p0}, Lexpo/modules/kotlin/types/TypeConverterCollection;-><init>(Lkotlin/reflect/KType;)V

    return-object v0
.end method


# virtual methods
.method public final build()Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Lkotlin/reflect/KType;",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:Lkotlin/reflect/KType;

    invoke-direct {v0, v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;-><init>(Lkotlin/reflect/KType;)V

    .line 24
    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/TypeConverterCollection;

    invoke-virtual {v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/types/TypeConverterCollection;->setConverters(Ljava/util/Map;)V

    .line 25
    iget-object v1, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:Lkotlin/reflect/KType;

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic from(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterComponent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-TP0;+TType;>;)",
            "Lexpo/modules/kotlin/types/TypeConverterComponent<",
            "TType;>;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/TypeConverterComponent;->getDesireTypeConverter()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverterCollection;

    .line 102
    invoke-virtual {v0}, Lexpo/modules/kotlin/types/TypeConverterCollection;->getConverters()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x6

    const-string v2, "P0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    new-instance v1, Lexpo/modules/kotlin/types/TypeConverterCollection$from$1;

    invoke-direct {v1, p1}, Lexpo/modules/kotlin/types/TypeConverterCollection$from$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final getDesireType()Lkotlin/reflect/KType;
    .locals 1

    .line 13
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireType:Lkotlin/reflect/KType;

    return-object v0
.end method

.method public final getDesireTypeConverter()Lkotlin/Lazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Lazy<",
            "Lexpo/modules/kotlin/types/TypeConverterCollection<",
            "TType;>;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lexpo/modules/kotlin/types/TypeConverterComponent;->desireTypeConverter:Lkotlin/Lazy;

    return-object v0
.end method
