.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;
.super Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.source "ExternalPaymentMethodResultHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Canceled"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c1\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010\u00a2\u0006\u0002\u0008\u0006J\u0006\u0010\n\u001a\u00020\u0008J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0008R\u0014\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0003\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;",
        "<init>",
        "()V",
        "toPaymentResult",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "toPaymentResult$paymentsheet_release",
        "RESULT_CODE",
        "",
        "getRESULT_CODE$annotations",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
            "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

.field public static final RESULT_CODE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic getRESULT_CODE$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x4df5d030

    return v0
.end method

.method public toPaymentResult$paymentsheet_release()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
    .locals 1

    .line 62
    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Canceled"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
