.class public final Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;
.super Ljava/lang/Object;
.source "IntentConfirmationModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\u0007JG\u0010\n\u001a\u0012\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0007\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;",
        "",
        "<init>",
        "()V",
        "providesCreateIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "paymentElementCallbackIdentifier",
        "",
        "providesPreparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "providesIntentConfirmationDefinition",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "intentConfirmationInterceptor",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;",
        "stripePaymentLauncherAssistedFactory",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "statusBarColor",
        "",
        "paymentConfigurationProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;


# direct methods
.method public static synthetic $r8$lambda$5PqeK57nfXR6PgsSH5gO4QDpMXs(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;Landroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;->providesIntentConfirmationDefinition$lambda$2(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;Landroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$b3-lRJGcZCBoiQeGvd3Gl3OogqY(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;->providesIntentConfirmationDefinition$lambda$2$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ezNC_SwpFfwlnn_WXIY1X2sWswE(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;->providesIntentConfirmationDefinition$lambda$2$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providesIntentConfirmationDefinition$lambda$2(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;Landroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 7

    const-string v0, "hostActivityLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v2, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda0;-><init>(Ljavax/inject/Provider;)V

    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v3, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda1;-><init>(Ljavax/inject/Provider;)V

    const/4 v5, 0x1

    move-object v1, p0

    move-object v4, p1

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;->create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ZLandroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    return-object p0
.end method

.method private static final providesIntentConfirmationDefinition$lambda$2$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 56
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final providesIntentConfirmationDefinition$lambda$2$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 57
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final providesCreateIntentCallback(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->get(Ljava/lang/String;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->getCreateIntentCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final providesIntentConfirmationDefinition(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;
    .locals 2
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/multibindings/IntoSet;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "Ljava/lang/Integer;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "****>;"
        }
    .end annotation

    const-string v0, "intentConfirmationInterceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePaymentLauncherAssistedFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigurationProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;

    .line 54
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule$Companion$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Ljava/lang/Integer;Ljavax/inject/Provider;)V

    .line 52
    invoke-direct {v0, p1, v1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;

    return-object v0
.end method

.method public final providesPreparePaymentMethodHandler(Ljava/lang/String;)Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->get(Ljava/lang/String;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;->getPreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
