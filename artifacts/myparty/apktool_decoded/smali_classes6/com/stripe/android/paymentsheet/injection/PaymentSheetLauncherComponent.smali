.class public interface abstract Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;
.super Ljava/lang/Object;
.source "PaymentSheetLauncherComponent.kt"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;,
        Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;,
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;,
        Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;,
        Lcom/stripe/android/common/di/ApplicationIdModule;,
        Lcom/stripe/android/common/di/MobileSessionIdModule;,
        Lcom/stripe/android/ui/core/di/CardScanModule;,
        Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;",
        "",
        "paymentSheetViewModelSubcomponentBuilder",
        "Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;",
        "getPaymentSheetViewModelSubcomponentBuilder",
        "()Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;",
        "Builder",
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


# virtual methods
.method public abstract getPaymentSheetViewModelSubcomponentBuilder()Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelSubcomponent$Builder;
.end method
