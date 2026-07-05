.class public final Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
.super Ljava/lang/Object;
.source "QPurchaseUpdateModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\n2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u0006\u0010#\u001a\u00020\u0000J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010\"\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "",
        "productId",
        "",
        "oldProductId",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "offerId",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V",
        "applyOffer",
        "",
        "getApplyOffer$sdk_release",
        "()Z",
        "setApplyOffer$sdk_release",
        "(Z)V",
        "getOfferId",
        "()Ljava/lang/String;",
        "setOfferId",
        "(Ljava/lang/String;)V",
        "getOldProductId",
        "setOldProductId",
        "getProductId",
        "getUpdatePolicy",
        "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "setUpdatePolicy",
        "(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "removeOffer",
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
.field private applyOffer:Z

.field private offerId:Ljava/lang/String;

.field private oldProductId:Ljava/lang/String;

.field private final productId:Ljava/lang/String;

.field private updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldProductId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V
    .locals 8

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldProductId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V
    .locals 1

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldProductId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 27
    iput-object p4, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->applyOffer:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 1

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oldProductId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getApplyOffer$sdk_release()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->applyOffer:Z

    return v0
.end method

.method public final getOfferId()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOldProductId()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 1

    .line 31
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->applyOffer:Z

    return-object p0
.end method

.method public final setApplyOffer$sdk_release(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->applyOffer:Z

    return-void
.end method

.method public final setOfferId(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    return-void
.end method

.method public final setOldProductId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    return-void
.end method

.method public final setUpdatePolicy(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->productId:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->oldProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->offerId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "QPurchaseUpdateModel(productId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", oldProductId="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updatePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
