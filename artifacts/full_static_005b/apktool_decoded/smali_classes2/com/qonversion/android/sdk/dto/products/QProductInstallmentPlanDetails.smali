.class public final Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;
.super Ljava/lang/Object;
.source "QProductInstallmentPlanDetails.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;",
        "",
        "originalInstallmentPlanDetails",
        "Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;",
        "(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)V",
        "commitmentPaymentsCount",
        "",
        "getCommitmentPaymentsCount",
        "()I",
        "getOriginalInstallmentPlanDetails",
        "()Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;",
        "subsequentCommitmentPaymentsCount",
        "getSubsequentCommitmentPaymentsCount",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final commitmentPaymentsCount:I

.field private final originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

.field private final subsequentCommitmentPaymentsCount:I


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)V
    .locals 1

    const-string v0, "originalInstallmentPlanDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    .line 18
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;->getInstallmentPlanCommitmentPaymentsCount()I

    move-result v0

    iput v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->commitmentPaymentsCount:I

    .line 28
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;->getSubsequentInstallmentPlanCommitmentPaymentsCount()I

    move-result p1

    iput p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->copy(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    return-object v0
.end method

.method public final copy(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;
    .locals 1

    const-string v0, "originalInstallmentPlanDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCommitmentPaymentsCount()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->commitmentPaymentsCount:I

    return v0
.end method

.method public final getOriginalInstallmentPlanDetails()Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    return-object v0
.end method

.method public final getSubsequentCommitmentPaymentsCount()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->subsequentCommitmentPaymentsCount:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->originalInstallmentPlanDetails:Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QProductInstallmentPlanDetails(originalInstallmentPlanDetails="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
