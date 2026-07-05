.class public final Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\n\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u0008R\u001c\u0010\u000c\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u0003\u001a\u0004\u0008\u000e\u0010\u0008\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;",
        "",
        "<init>",
        "()V",
        "setDefaultPaymentMethodErrorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getSetDefaultPaymentMethodErrorMessage$paymentsheet_release$annotations",
        "getSetDefaultPaymentMethodErrorMessage$paymentsheet_release",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "updateCardBrandErrorMessage",
        "getUpdateCardBrandErrorMessage$paymentsheet_release$annotations",
        "getUpdateCardBrandErrorMessage$paymentsheet_release",
        "updatesFailedErrorMessage",
        "getUpdatesFailedErrorMessage$paymentsheet_release$annotations",
        "getUpdatesFailedErrorMessage$paymentsheet_release",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 366
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getSetDefaultPaymentMethodErrorMessage$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUpdateCardBrandErrorMessage$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUpdatesFailedErrorMessage$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getSetDefaultPaymentMethodErrorMessage$paymentsheet_release()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 368
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getSetDefaultPaymentMethodErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdateCardBrandErrorMessage$paymentsheet_release()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 372
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getUpdateCardBrandErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    return-object v0
.end method

.method public final getUpdatesFailedErrorMessage$paymentsheet_release()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 376
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->access$getUpdatesFailedErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    return-object v0
.end method
