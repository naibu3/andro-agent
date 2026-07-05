.class public final Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;
.super Ljava/lang/Object;
.source "QonversionMappingAdapters.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQonversionMappingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QOfferingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1855#2,2:267\n*S KotlinDebug\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QOfferingAdapter\n*L\n230#1:267,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "offering",
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

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 3
    .annotation runtime Lcom/squareup/moshi/FromJson;
    .end annotation

    const-string v0, "offering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 267
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 231
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->setOfferingID(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object p1
.end method
