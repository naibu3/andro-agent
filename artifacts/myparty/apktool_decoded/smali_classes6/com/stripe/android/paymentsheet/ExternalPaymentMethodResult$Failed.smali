.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;
.super Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.source "ExternalPaymentMethodResultHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failed"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0008\u001a\u00020\tH\u0010\u00a2\u0006\u0002\u0008\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;",
        "displayMessage",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getDisplayMessage",
        "()Ljava/lang/String;",
        "toPaymentResult",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "toPaymentResult$paymentsheet_release",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Companion;

.field public static final DISPLAY_MESSAGE_EXTRA:Ljava/lang/String; = "external_payment_method_error_message"

.field public static final RESULT_CODE:I = 0x1


# instance fields
.field private final displayMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Companion;

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->copy(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDisplayMessage()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toPaymentResult$paymentsheet_release()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
    .locals 4

    .line 72
    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    .line 73
    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    .line 74
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    .line 75
    const-string v3, "externalPaymentMethodFailure"

    .line 73
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 72
    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed(displayMessage="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;->displayMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
