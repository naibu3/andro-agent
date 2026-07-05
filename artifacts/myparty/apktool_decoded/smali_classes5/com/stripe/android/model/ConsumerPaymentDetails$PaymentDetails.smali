.class public abstract Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
.super Ljava/lang/Object;
.source "ConsumerPaymentDetails.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsumerPaymentDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PaymentDetails"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B?\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0016\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0012\u0010\u0015\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000e\u0082\u0001\u0003\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "isDefault",
        "",
        "type",
        "nickname",
        "billingAddress",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "billingEmailAddress",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "()Z",
        "getType",
        "getNickname",
        "getBillingAddress",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "getBillingEmailAddress",
        "last4",
        "getLast4",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;",
        "payments-model_release"
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
.field private final billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

.field private final billingEmailAddress:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isDefault:Z

.field private final nickname:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->id:Ljava/lang/String;

    .line 19
    iput-boolean p2, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault:Z

    .line 20
    iput-object p3, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->type:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->nickname:Ljava/lang/String;

    .line 22
    iput-object p5, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    .line 23
    iput-object p6, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->billingEmailAddress:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->billingAddress:Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    return-object v0
.end method

.method public getBillingEmailAddress()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->billingEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->id:Ljava/lang/String;

    return-object v0
.end method

.method public abstract getLast4()Ljava/lang/String;
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->type:Ljava/lang/String;

    return-object v0
.end method

.method public isDefault()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault:Z

    return v0
.end method
