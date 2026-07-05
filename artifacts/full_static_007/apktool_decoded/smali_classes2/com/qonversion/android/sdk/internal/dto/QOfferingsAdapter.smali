.class public final Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;
.super Ljava/lang/Object;
.source "QonversionMappingAdapters.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQonversionMappingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QOfferingsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n288#2,2:267\n*S KotlinDebug\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QOfferingsAdapter\n*L\n218#1:267,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "offerings",
        "",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "toJson",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toJson(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)Ljava/util/List;
    .locals 0
    .annotation runtime Lcom/squareup/moshi/ToJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
            ")",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 209
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 5
    .annotation runtime Lcom/squareup/moshi/FromJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;"
        }
    .end annotation

    const-string v0, "offerings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 218
    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 267
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 218
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    move-result-object v3

    sget-object v4, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    if-ne v3, v4, :cond_1

    move-object v1, v2

    :cond_2
    check-cast v1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 220
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    return-object v0
.end method
