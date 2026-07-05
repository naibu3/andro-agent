.class public final Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;
.super Ljava/lang/Object;
.source "DisplayableSavedPaymentMethod.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/SavedPaymentMethod;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/SavedPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;",
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;",
        "card",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V",
        "getCard",
        "()Lcom/stripe/android/model/PaymentMethod$Card;",
        "getBillingDetails",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "isExpired",
        "",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

.field private final card:Lcom/stripe/android/model/PaymentMethod$Card;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->$stable:I

    sget v1, Lcom/stripe/android/model/PaymentMethod$Card;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V
    .locals 1

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    .line 171
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->copy(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/PaymentMethod$Card;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;
    .locals 1

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;-><init>(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    return-object v0
.end method

.method public final getCard()Lcom/stripe/android/model/PaymentMethod$Card;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$Card;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isExpired()Z
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Card;->expiryMonth:Ljava/lang/Integer;

    .line 175
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Card;->expiryYear:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 180
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 181
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 179
    invoke-static {v0, v1}, Lcom/stripe/android/core/utils/DateUtils;->isExpiryDataValid(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Card(card="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", billingDetails="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
