.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;
.super Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;
.source "PaymentSheetConfirmationError.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GooglePay"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;",
        "errorCodeInt",
        "",
        "<init>",
        "(I)V",
        "getErrorCodeInt",
        "()I",
        "errorCode",
        "",
        "getErrorCode",
        "()Ljava/lang/String;",
        "analyticsValue",
        "getAnalyticsValue",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "paymentsheet_release"
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


# instance fields
.field private final errorCode:Ljava/lang/String;

.field private final errorCodeInt:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    .line 20
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCode:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;IILjava/lang/Object;)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->copy(I)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    return v0
.end method

.method public final copy(I)Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;

    iget v1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    iget p1, p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getAnalyticsValue()Ljava/lang/String;
    .locals 3

    .line 23
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->getErrorCode()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "googlePay_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getErrorCode()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorCodeInt()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;->errorCodeInt:I

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GooglePay(errorCodeInt="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
