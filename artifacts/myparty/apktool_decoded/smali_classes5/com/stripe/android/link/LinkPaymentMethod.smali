.class public abstract Lcom/stripe/android/link/LinkPaymentMethod;
.super Ljava/lang/Object;
.source "LinkPaymentMethod.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;,
        Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B%\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\u0008\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "Landroid/os/Parcelable;",
        "details",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "collectedCvc",
        "",
        "billingPhone",
        "<init>",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V",
        "getDetails",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getCollectedCvc",
        "()Ljava/lang/String;",
        "getBillingPhone",
        "readyForConfirmation",
        "",
        "readyForConfirmation$paymentsheet_release",
        "ConsumerPaymentDetails",
        "LinkPaymentDetails",
        "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
        "Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final billingPhone:Ljava/lang/String;

.field private final collectedCvc:Ljava/lang/String;

.field private final details:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentMethod;->details:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentMethod;->collectedCvc:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/link/LinkPaymentMethod;->billingPhone:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentMethod;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getBillingPhone()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentMethod;->billingPhone:Ljava/lang/String;

    return-object v0
.end method

.method public getCollectedCvc()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentMethod;->collectedCvc:Ljava/lang/String;

    return-object v0
.end method

.method public getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentMethod;->details:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v0
.end method

.method public final readyForConfirmation$paymentsheet_release()Z
    .locals 4

    .line 17
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    .line 18
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 19
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_4

    .line 20
    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getCvcCheck()Lcom/stripe/android/model/CvcCheck;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/CvcCheck;->getRequiresRecollection()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkPaymentMethod;->getCollectedCvc()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v2

    .line 21
    :goto_1
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz v1, :cond_3

    return v2

    :cond_3
    return v3

    .line 23
    :cond_4
    instance-of v0, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz v0, :cond_5

    return v2

    .line 17
    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
