.class public final Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;
.super Ljava/lang/Object;
.source "CollectBankAccountResultInternal.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstantDebitsData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00082\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "last4",
        "",
        "bankName",
        "eligibleForIncentive",
        "",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "getLast4",
        "()Ljava/lang/String;",
        "getBankName",
        "getEligibleForIncentive",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "payments-core_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final bankName:Ljava/lang/String;

.field private final eligibleForIncentive:Z

.field private final last4:Ljava/lang/String;

.field private final paymentMethod:Lcom/stripe/android/model/PaymentMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData$Creator;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 56
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    .line 58
    iput-boolean p4, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->copy(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;-><init>(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    iget-boolean p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBankName()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public final getEligibleForIncentive()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    return v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "InstantDebitsData(paymentMethod="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", last4="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bankName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", eligibleForIncentive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->last4:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->bankName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->eligibleForIncentive:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
