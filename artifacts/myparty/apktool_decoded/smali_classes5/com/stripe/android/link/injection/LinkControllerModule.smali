.class public interface abstract Lcom/stripe/android/link/injection/LinkControllerModule;
.super Ljava/lang/Object;
.source "LinkControllerModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/paymentelement/confirmation/injection/ExtendedPaymentElementConfirmationModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;,
        Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;,
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;,
        Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;,
        Lcom/stripe/android/common/di/ApplicationIdModule;,
        Lcom/stripe/android/common/di/MobileSessionIdModule;,
        Lcom/stripe/android/ui/core/di/CardScanModule;,
        Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;
    }
    subcomponents = {
        Lcom/stripe/android/link/injection/LinkControllerPresenterComponent;,
        Lcom/stripe/android/link/injection/LinkComponent;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/LinkControllerModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkControllerModule;",
        "",
        "bindLinkConfigurationLoader",
        "Lcom/stripe/android/link/LinkConfigurationLoader;",
        "impl",
        "Lcom/stripe/android/link/DefaultLinkConfigurationLoader;",
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
.field public static final Companion:Lcom/stripe/android/link/injection/LinkControllerModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/injection/LinkControllerModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/LinkControllerModule$Companion;

    sput-object v0, Lcom/stripe/android/link/injection/LinkControllerModule;->Companion:Lcom/stripe/android/link/injection/LinkControllerModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindLinkConfigurationLoader(Lcom/stripe/android/link/DefaultLinkConfigurationLoader;)Lcom/stripe/android/link/LinkConfigurationLoader;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation
.end method
