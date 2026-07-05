.class public final Lcom/qonversion/android/sdk/dto/offerings/QOffering;
.super Ljava/lang/Object;
.source "QOffering.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQOffering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QOffering.kt\ncom/qonversion/android/sdk/dto/offerings/QOffering\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n288#2,2:35\n*S KotlinDebug\n*F\n+ 1 QOffering.kt\ncom/qonversion/android/sdk/dto/offerings/QOffering\n*L\n16#1:35,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0016\u001a\u00020\u0003J\u0008\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "",
        "offeringID",
        "",
        "tag",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "products",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V",
        "getOfferingID",
        "()Ljava/lang/String;",
        "getProducts",
        "()Ljava/util/List;",
        "getTag",
        "()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "productForID",
        "id",
        "toString",
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


# instance fields
.field private final offeringID:Ljava/lang/String;

.field private final products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation
.end field

.field private final tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "id"
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "tag"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "products"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "offeringID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "products"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 12
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 12
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 24
    instance-of v0, p1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    if-eqz v0, :cond_0

    .line 25
    check-cast p1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    iget-object v0, p1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    iget-object v0, p1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    if-ne v0, v1, :cond_0

    .line 27
    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->equalsIgnoreOrder(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getOfferingID()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    return-object v0
.end method

.method public final getProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    return-object v0
.end method

.method public final getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final productForID(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 16
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->offeringID:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->tag:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->products:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "QOffering(offeringID="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", tag="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
