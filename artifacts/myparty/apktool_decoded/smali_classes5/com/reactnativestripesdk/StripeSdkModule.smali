.class public final Lcom/reactnativestripesdk/StripeSdkModule;
.super Lcom/reactnativestripesdk/NativeStripeSdkModuleSpec;
.source "StripeSdkModule.kt"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "StripeSdk"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/StripeSdkModule$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeSdkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeSdkModule.kt\ncom/reactnativestripesdk/StripeSdkModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1410:1\n1#2:1411\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b3\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008+\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0006\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0006*\u00039\u0092\u0001\u0008\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0008\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u0010\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020&H\u0002J \u0010D\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150E0EH\u0015J\u0018\u0010F\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010H\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010K\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010L\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001c\u0010+\u001a\u00020<2\u0008\u0010N\u001a\u0004\u0018\u00010&2\u0008\u0010G\u001a\u0004\u0018\u00010\u0019H\u0017J \u0010O\u001a\u00020<2\u0006\u0010@\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010P\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010Q\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010R\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010S\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\"\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u00020\u00152\u0008\u0010X\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\"\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020\u00152\u0008\u0010X\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J,\u0010[\u001a\u00020<2\u0006\u0010W\u001a\u00020\u00152\u0008\u0010C\u001a\u0004\u0018\u00010&2\u0008\u0010J\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010^\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010_\u001a\u00020<2\u0006\u0010Z\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010`\u001a\u00020<2\u0008\u0010C\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010a\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010c\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010e\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010f\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010g\u001a\u00020<2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010h\u001a\u00020<2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010i\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010j\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010k\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010l\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010m\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010n\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010o\u001a\u00020<2\u0006\u0010p\u001a\u00020q2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010r\u001a\u00020<2\u0006\u0010s\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010t\u001a\u00020<2\u0006\u0010s\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010u\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010v\u001a\u00020<2\u0008\u0010w\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010x\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010y\u001a\u00020<2\u0006\u0010z\u001a\u00020&2\u0006\u0010{\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010|\u001a\u00020<2\u0006\u0010}\u001a\u00020~2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010\u007f\u001a\u00020<2\u0006\u0010z\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0019\u0010\u0080\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020~2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010\u0081\u0001\u001a\u00020<2\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0016J5\u0010\u0084\u0001\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020<2\u0008\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J4\u0010\u008a\u0001\u001a\u00020<2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010q2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010q2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010q2\u0008\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0008\u0010G\u001a\u0004\u0018\u00010\u0019H\u0002J\t\u0010\u0094\u0001\u001a\u00020<H\u0002J\t\u0010\u0095\u0001\u001a\u00020<H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R \u0010+\u001a\u0008\u0012\u0004\u0012\u00020&0%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010(\"\u0004\u0008-\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u0015058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u0010\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010:R\u000f\u0010\u0090\u0001\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0082\u0004\u00a2\u0006\u0005\n\u0003\u0010\u0093\u0001\u00a8\u0006\u0097\u0001"
    }
    d2 = {
        "Lcom/reactnativestripesdk/StripeSdkModule;",
        "Lcom/reactnativestripesdk/NativeStripeSdkModuleSpec;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "cardFieldView",
        "Lcom/reactnativestripesdk/CardFieldView;",
        "getCardFieldView",
        "()Lcom/reactnativestripesdk/CardFieldView;",
        "setCardFieldView",
        "(Lcom/reactnativestripesdk/CardFieldView;)V",
        "cardFormView",
        "Lcom/reactnativestripesdk/CardFormView;",
        "getCardFormView",
        "()Lcom/reactnativestripesdk/CardFormView;",
        "setCardFormView",
        "(Lcom/reactnativestripesdk/CardFormView;)V",
        "stripe",
        "Lcom/stripe/android/Stripe;",
        "publishableKey",
        "",
        "stripeAccountId",
        "urlScheme",
        "createPlatformPayPaymentMethodPromise",
        "Lcom/facebook/react/bridge/Promise;",
        "platformPayUsesDeprecatedTokenFlow",
        "",
        "paymentSheetFragment",
        "Lcom/reactnativestripesdk/PaymentSheetFragment;",
        "paymentLauncherFragment",
        "Lcom/reactnativestripesdk/PaymentLauncherFragment;",
        "collectBankAccountLauncherFragment",
        "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;",
        "customerSheetFragment",
        "Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;",
        "embeddedIntentCreationCallback",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release",
        "()Lkotlinx/coroutines/CompletableDeferred;",
        "setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release",
        "(Lkotlinx/coroutines/CompletableDeferred;)V",
        "customPaymentMethodResultCallback",
        "getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release",
        "setCustomPaymentMethodResultCallback$stripe_stripe_react_native_release",
        "composeCompatView",
        "Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;",
        "getComposeCompatView$stripe_stripe_react_native_release",
        "()Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;",
        "setComposeCompatView$stripe_stripe_react_native_release",
        "(Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;)V",
        "allStripeFragmentTags",
        "",
        "getAllStripeFragmentTags",
        "()Ljava/util/List;",
        "mActivityEventListener",
        "com/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1",
        "Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;",
        "dispatchActivityResultsToFragments",
        "",
        "requestCode",
        "",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "configure3dSecure",
        "params",
        "getTypedExportedConstants",
        "",
        "initialise",
        "promise",
        "initPaymentSheet",
        "presentPaymentSheet",
        "options",
        "confirmPaymentSheetPayment",
        "resetPaymentSheetCustomer",
        "intentCreationCallback",
        "result",
        "createPaymentMethod",
        "createToken",
        "createTokenFromPii",
        "createTokenFromBankAccount",
        "createTokenFromCard",
        "createTokenForCVCUpdate",
        "cvc",
        "handleNextAction",
        "paymentIntentClientSecret",
        "returnUrl",
        "handleNextActionForSetup",
        "setupIntentClientSecret",
        "confirmPayment",
        "retrievePaymentIntent",
        "clientSecret",
        "retrieveSetupIntent",
        "confirmSetupIntent",
        "isPlatformPaySupported",
        "confirmPlatformPay",
        "isPaymentIntent",
        "createPlatformPayPaymentMethod",
        "usesDeprecatedTokenFlow",
        "canAddCardToWallet",
        "isCardInWallet",
        "collectBankAccount",
        "verifyMicrodeposits",
        "collectBankAccountToken",
        "collectFinancialConnectionsAccounts",
        "initCustomerSheet",
        "customerAdapterOverrides",
        "presentCustomerSheet",
        "retrieveCustomerSheetPaymentOptionSelection",
        "customerAdapterFetchPaymentMethodsCallback",
        "paymentMethodJsonObjects",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "customerAdapterAttachPaymentMethodCallback",
        "paymentMethodJson",
        "customerAdapterDetachPaymentMethodCallback",
        "customerAdapterSetSelectedPaymentOptionCallback",
        "customerAdapterFetchSelectedPaymentOptionCallback",
        "paymentOption",
        "customerAdapterSetupIntentClientSecretForCustomerAttachCallback",
        "createEmbeddedPaymentElement",
        "intentConfig",
        "configuration",
        "confirmEmbeddedPaymentElement",
        "viewTag",
        "",
        "updateEmbeddedPaymentElement",
        "clearEmbeddedPaymentOption",
        "handleURLCallback",
        "url",
        "openApplePaySetup",
        "configureOrderTracking",
        "orderTypeIdentifier",
        "orderIdentifier",
        "webServiceUrl",
        "authenticationToken",
        "dismissPlatformPay",
        "updatePlatformPaySheet",
        "summaryItems",
        "shippingMethods",
        "errors",
        "getCurrentActivityOrResolveWithError",
        "Landroidx/fragment/app/FragmentActivity;",
        "isRecreatingActivities",
        "activityLifecycleCallbacks",
        "com/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1",
        "Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;",
        "preventActivityRecreation",
        "setupComposeCompatView",
        "Companion",
        "stripe_stripe-react-native_release"
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

.field public static final Companion:Lcom/reactnativestripesdk/StripeSdkModule$Companion;

.field public static final NAME:Ljava/lang/String; = "StripeSdk"


# instance fields
.field private final activityLifecycleCallbacks:Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;

.field private cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

.field private cardFormView:Lcom/reactnativestripesdk/CardFormView;

.field private collectBankAccountLauncherFragment:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

.field private composeCompatView:Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

.field private createPlatformPayPaymentMethodPromise:Lcom/facebook/react/bridge/Promise;

.field private customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation
.end field

.field private customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

.field private embeddedIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation
.end field

.field private isRecreatingActivities:Z

.field private final mActivityEventListener:Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;

.field private paymentLauncherFragment:Lcom/reactnativestripesdk/PaymentLauncherFragment;

.field private paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

.field private platformPayUsesDeprecatedTokenFlow:Z

.field private publishableKey:Ljava/lang/String;

.field private stripe:Lcom/stripe/android/Stripe;

.field private stripeAccountId:Ljava/lang/String;

.field private urlScheme:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$8r82WDdWMyx5ECz4Q3XzwLvGfyE(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/reactnativestripesdk/StripeSdkModule;->canAddCardToWallet$lambda$24$lambda$23(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mZb1s5a_RxDXI72furORjOKbKLE(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/reactnativestripesdk/StripeSdkModule;->confirmPlatformPay$lambda$17$lambda$16(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mwD6Rd5mr-mxSYlTYhtSZb26HTM(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/reactnativestripesdk/StripeSdkModule;->isCardInWallet$lambda$28$lambda$27(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$npeGzoYYKnVEO-VZWR0RFmUYvbI(Lcom/reactnativestripesdk/StripeSdkModule;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->setupComposeCompatView$lambda$54(Lcom/reactnativestripesdk/StripeSdkModule;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/StripeSdkModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/StripeSdkModule;->Companion:Lcom/reactnativestripesdk/StripeSdkModule$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/StripeSdkModule;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/NativeStripeSdkModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 95
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v2

    iput-object v2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->embeddedIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 96
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    iput-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 115
    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;

    invoke-direct {v0, p0}, Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->mActivityEventListener:Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;

    .line 151
    check-cast v0, Lcom/facebook/react/bridge/ActivityEventListener;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactApplicationContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 1348
    new-instance p1, Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;

    invoke-direct {p1, p0}, Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;)V

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->activityLifecycleCallbacks:Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;

    return-void
.end method

.method public static final synthetic access$dispatchActivityResultsToFragments(Lcom/reactnativestripesdk/StripeSdkModule;IILandroid/content/Intent;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2, p3}, Lcom/reactnativestripesdk/StripeSdkModule;->dispatchActivityResultsToFragments(IILandroid/content/Intent;)V

    return-void
.end method

.method public static final synthetic access$getCreatePlatformPayPaymentMethodPromise$p(Lcom/reactnativestripesdk/StripeSdkModule;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->createPlatformPayPaymentMethodPromise:Lcom/facebook/react/bridge/Promise;

    return-object p0
.end method

.method public static final synthetic access$getPlatformPayUsesDeprecatedTokenFlow$p(Lcom/reactnativestripesdk/StripeSdkModule;)Z
    .locals 0

    .line 74
    iget-boolean p0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->platformPayUsesDeprecatedTokenFlow:Z

    return p0
.end method

.method public static final synthetic access$getStripe$p(Lcom/reactnativestripesdk/StripeSdkModule;)Lcom/stripe/android/Stripe;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    return-object p0
.end method

.method public static final synthetic access$getStripeAccountId$p(Lcom/reactnativestripesdk/StripeSdkModule;)Ljava/lang/String;
    .locals 0

    .line 74
    iget-object p0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$isRecreatingActivities$p(Lcom/reactnativestripesdk/StripeSdkModule;)Z
    .locals 0

    .line 74
    iget-boolean p0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->isRecreatingActivities:Z

    return p0
.end method

.method public static final synthetic access$setCreatePlatformPayPaymentMethodPromise$p(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->createPlatformPayPaymentMethodPromise:Lcom/facebook/react/bridge/Promise;

    return-void
.end method

.method public static final synthetic access$setRecreatingActivities$p(Lcom/reactnativestripesdk/StripeSdkModule;Z)V
    .locals 0

    .line 74
    iput-boolean p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->isRecreatingActivities:Z

    return-void
.end method

.method private static final canAddCardToWallet$lambda$24$lambda$23(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 1

    const/4 p0, 0x0

    if-eqz p4, :cond_0

    const/4 p4, 0x0

    .line 887
    const-string v0, "MISSING_CONFIGURATION"

    invoke-static {p4, v0, p0}, Lcom/reactnativestripesdk/utils/MappersKt;->createCanAddCardResult(ZLjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p4

    if-nez p4, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    .line 889
    const-string p0, "CARD_ALREADY_EXISTS"

    :cond_1
    xor-int/lit8 p2, p2, 0x1

    .line 890
    invoke-static {p2, p0, p3}, Lcom/reactnativestripesdk/utils/MappersKt;->createCanAddCardResult(ZLjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p4

    .line 892
    :cond_2
    invoke-interface {p1, p4}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 893
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final configure3dSecure(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3

    .line 170
    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;

    invoke-direct {v0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;-><init>()V

    .line 171
    const-string v1, "timeout"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;->setTimeout(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;

    .line 172
    :cond_0
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToUICustomization(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    move-result-object p1

    .line 174
    sget-object v1, Lcom/stripe/android/PaymentAuthConfig;->Companion:Lcom/stripe/android/PaymentAuthConfig$Companion;

    .line 176
    new-instance v2, Lcom/stripe/android/PaymentAuthConfig$Builder;

    invoke-direct {v2}, Lcom/stripe/android/PaymentAuthConfig$Builder;-><init>()V

    .line 179
    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;->setUiCustomization(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;

    move-result-object p1

    .line 180
    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;->build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;

    move-result-object p1

    .line 177
    invoke-virtual {v2, p1}, Lcom/stripe/android/PaymentAuthConfig$Builder;->set3ds2Config(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)Lcom/stripe/android/PaymentAuthConfig$Builder;

    move-result-object p1

    .line 181
    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Builder;->build()Lcom/stripe/android/PaymentAuthConfig;

    move-result-object p1

    .line 174
    invoke-virtual {v1, p1}, Lcom/stripe/android/PaymentAuthConfig$Companion;->init(Lcom/stripe/android/PaymentAuthConfig;)V

    return-void
.end method

.method private static final confirmPlatformPay$lambda$17$lambda$16(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 1

    if-eqz p5, :cond_0

    .line 769
    invoke-interface {p0, p5}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    if-eqz p4, :cond_7

    .line 772
    sget-object p5, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Completed;

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_4

    const/4 p4, 0x0

    .line 773
    const-string p5, "stripe"

    const-string v0, "payment_method"

    if-eqz p1, :cond_2

    .line 774
    iget-object p1, p2, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_1

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object p4, p1

    .line 776
    :goto_0
    iget-object p1, p2, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    .line 777
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 778
    new-instance p5, Lcom/reactnativestripesdk/StripeSdkModule$confirmPlatformPay$1$1$1;

    invoke-direct {p5, p0}, Lcom/reactnativestripesdk/StripeSdkModule$confirmPlatformPay$1$1$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    check-cast p5, Lcom/stripe/android/ApiResultCallback;

    .line 774
    invoke-virtual {p4, p3, p1, p2, p5}, Lcom/stripe/android/Stripe;->retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    goto :goto_2

    .line 794
    :cond_2
    iget-object p1, p2, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_3

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object p4, p1

    .line 796
    :goto_1
    iget-object p1, p2, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    .line 797
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 798
    new-instance p5, Lcom/reactnativestripesdk/StripeSdkModule$confirmPlatformPay$1$1$2;

    invoke-direct {p5, p0}, Lcom/reactnativestripesdk/StripeSdkModule$confirmPlatformPay$1$1$2;-><init>(Lcom/facebook/react/bridge/Promise;)V

    check-cast p5, Lcom/stripe/android/ApiResultCallback;

    .line 794
    invoke-virtual {p4, p3, p1, p2, p5}, Lcom/stripe/android/Stripe;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    goto :goto_2

    .line 811
    :cond_4
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;->INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Canceled;

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 814
    sget-object p1, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->Canceled:Lcom/reactnativestripesdk/utils/GooglePayErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 815
    const-string p2, "Google Pay has been canceled"

    .line 813
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 812
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_2

    .line 820
    :cond_5
    instance-of p1, p4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    if-eqz p1, :cond_6

    .line 823
    sget-object p1, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->Failed:Lcom/reactnativestripesdk/utils/GooglePayErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 824
    check-cast p4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;

    invoke-virtual {p4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p2

    .line 822
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 821
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_2

    .line 771
    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 830
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final createTokenFromBankAccount(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 9

    .line 430
    const-string v0, "accountHolderName"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 431
    const-string v0, "accountHolderType"

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 432
    const-string v2, "accountNumber"

    invoke-static {p1, v2, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 433
    const-string v2, "country"

    invoke-static {p1, v2, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 434
    const-string v2, "currency"

    invoke-static {p1, v2, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 435
    const-string v2, "routingNumber"

    invoke-static {p1, v2, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 439
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 440
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 441
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 444
    invoke-static {v0}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToBankAccountType(Ljava/lang/String;)Lcom/stripe/android/model/BankAccountTokenParams$Type;

    move-result-object v6

    .line 438
    new-instance v2, Lcom/stripe/android/model/BankAccountTokenParams;

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/model/BankAccountTokenParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance p1, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromBankAccount$1;

    invoke-direct {p1, p0, v2, p2, v1}, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromBankAccount$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/model/BankAccountTokenParams;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final createTokenFromCard(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 462
    iget-object v3, v0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/reactnativestripesdk/CardFieldView;->getCardParams()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_0
    iget-object v3, v0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/reactnativestripesdk/CardFormView;->getCardParams()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :cond_2
    :goto_0
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;->toParamMap()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_3

    goto/16 :goto_2

    .line 473
    :cond_3
    iget-object v5, v0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/reactnativestripesdk/CardFieldView;->getCardAddress()Lcom/stripe/android/model/Address;

    move-result-object v5

    if-nez v5, :cond_6

    :cond_4
    iget-object v5, v0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/reactnativestripesdk/CardFormView;->getCardAddress()Lcom/stripe/android/model/Address;

    move-result-object v5

    goto :goto_1

    :cond_5
    move-object v5, v4

    .line 474
    :cond_6
    :goto_1
    const-string v6, "address"

    invoke-static {v1, v6}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v6

    .line 477
    const-string v7, "number"

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v7

    check-cast v10, Ljava/lang/String;

    .line 478
    const-string v7, "exp_month"

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v9, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 479
    const-string v7, "exp_year"

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 480
    const-string v7, "cvc"

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    .line 481
    invoke-static {v6, v5}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToAddress(Lcom/facebook/react/bridge/ReadableMap;Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/Address;

    move-result-object v15

    .line 482
    const-string v3, "name"

    invoke-static {v1, v3, v4}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 483
    const-string v3, "currency"

    invoke-static {v1, v3, v4}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 476
    new-instance v9, Lcom/stripe/android/model/CardParams;

    const/16 v18, 0x80

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/stripe/android/model/CardParams;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 486
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v10

    new-instance v1, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromCard$1;

    invoke-direct {v1, v0, v9, v2, v4}, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromCard$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/model/CardParams;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function2;

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    .line 463
    :cond_7
    :goto_2
    move-object v1, v0

    check-cast v1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 466
    sget-object v1, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->Failed:Lcom/reactnativestripesdk/utils/CreateTokenErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 467
    const-string v3, "Card details not complete"

    .line 465
    invoke-static {v1, v3}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 464
    invoke-interface {v2, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method private final createTokenFromPii(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 8

    .line 407
    const-string v0, "personalId"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 408
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromPii$1$1;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/reactnativestripesdk/StripeSdkModule$createTokenFromPii$1$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 416
    :cond_1
    :goto_0
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 419
    sget-object p1, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->Failed:Lcom/reactnativestripesdk/utils/CreateTokenErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 420
    const-string v0, "personalId parameter is required"

    .line 418
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 417
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 416
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-void
.end method

.method private final dispatchActivityResultsToFragments(IILandroid/content/Intent;)V
    .locals 3

    const/4 v0, 0x0

    .line 160
    invoke-direct {p0, v0}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 161
    invoke-direct {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getAllStripeFragmentTags()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 162
    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 163
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1, p2, p3}, Landroidx/activity/result/ActivityResultRegistry;->dispatchResult(IILandroid/content/Intent;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final getAllStripeFragmentTags()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    .line 105
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "payment_sheet_launch_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 106
    const-string v2, "payment_launcher_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 107
    const-string v2, "collect_bank_account_launcher_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 108
    const-string v2, "financial_connections_sheet_launch_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 109
    const-string v2, "address_launcher_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    .line 110
    const-string v2, "google_pay_launcher_fragment"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    .line 111
    const-string v2, "customer_sheet_launch_fragment"

    aput-object v2, v0, v1

    .line 104
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;
    .locals 3

    .line 1339
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    if-eqz p1, :cond_2

    .line 1342
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingActivityError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :cond_2
    return-object v2
.end method

.method private static final isCardInWallet$lambda$28$lambda$27(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;ZLcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/WritableMap;)Lkotlin/Unit;
    .locals 0

    if-nez p4, :cond_0

    .line 911
    new-instance p0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 912
    const-string p4, "isInWallet"

    invoke-virtual {p0, p4, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putBoolean(Ljava/lang/String;Z)V

    .line 913
    const-string p2, "token"

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p0, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 910
    move-object p4, p0

    check-cast p4, Lcom/facebook/react/bridge/WritableMap;

    .line 916
    :cond_0
    invoke-interface {p1, p4}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 917
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final preventActivityRecreation()V
    .locals 2

    .line 1393
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->activityLifecycleCallbacks:Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;

    check-cast v1, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method private final setupComposeCompatView()V
    .locals 1

    .line 1397
    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final setupComposeCompatView$lambda$54(Lcom/reactnativestripesdk/StripeSdkModule;)V
    .locals 3

    .line 1398
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->composeCompatView:Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    if-nez v0, :cond_0

    new-instance v0, Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;-><init>(Landroid/content/Context;)V

    .line 1399
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 1400
    move-object v2, v0

    check-cast v2, Landroid/view/View;

    .line 1399
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1398
    :cond_0
    iput-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->composeCompatView:Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    return-void
.end method


# virtual methods
.method public canAddCardToWallet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 869
    const-string v0, "cardLastFour"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 870
    const-string p1, "Failed"

    const-string v0, "You must provide cardLastFour"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 874
    :cond_0
    const-string v2, "supportsTapToPay"

    const/4 v3, 0x1

    invoke-static {p1, v2, v3}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 875
    sget-object p1, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    .line 876
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v2

    const-string v3, "getReactApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 875
    invoke-virtual {p1, v2}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->isNFCEnabled(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 879
    const-string p1, "UNSUPPORTED_DEVICE"

    const/4 v0, 0x4

    const/4 v2, 0x0

    invoke-static {v2, p1, v1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->createCanAddCardResult$default(ZLjava/lang/String;Lcom/facebook/react/bridge/WritableMap;ILjava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 883
    :cond_1
    invoke-direct {p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 884
    sget-object v1, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    check-cast p1, Landroid/app/Activity;

    new-instance v2, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->isCardInWallet(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    :cond_2
    return-void
.end method

.method public clearEmbeddedPaymentOption(DLcom/facebook/react/bridge/Promise;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p1, "promise"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public collectBankAccount(ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 11
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 928
    const-string v0, "paymentMethodData"

    invoke-static {p3, v0}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    .line 929
    const-string v1, "paymentMethodType"

    const/4 v2, 0x0

    invoke-static {p3, v1, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToPaymentMethodType(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object p3

    .line 930
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eq p3, v1, :cond_0

    .line 933
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 934
    const-string p2, "collectBankAccount currently only accepts the USBankAccount payment method type."

    .line 932
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 931
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 940
    :cond_0
    const-string p3, "billingDetails"

    invoke-static {v0, p3}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 942
    const-string v0, "name"

    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    .line 943
    :goto_0
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_3

    .line 954
    :cond_2
    new-instance v9, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    .line 956
    const-string v1, "email"

    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 954
    invoke-direct {v9, v0, p3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    sget-object v3, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->Companion:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;

    .line 961
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v4

    const-string p3, "getReactApplicationContext(...)"

    invoke-static {v4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 962
    iget-object p3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    if-nez p3, :cond_3

    const-string p3, "publishableKey"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_1

    :cond_3
    move-object v5, p3

    .line 963
    :goto_1
    iget-object v6, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    move v8, p1

    move-object v7, p2

    move-object v10, p4

    .line 960
    invoke-virtual/range {v3 .. v10}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;->create(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;Lcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

    move-result-object p1

    .line 959
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->collectBankAccountLauncherFragment:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

    .line 969
    invoke-direct {p0, v10}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 971
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 972
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 973
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->collectBankAccountLauncherFragment:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Landroidx/fragment/app/Fragment;

    const-string p3, "collect_bank_account_launcher_fragment"

    invoke-virtual {p1, p2, p3}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 974
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 976
    sget-object p2, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p2}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v10, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_4
    :goto_2
    return-void

    :cond_5
    :goto_3
    move-object v10, p4

    .line 946
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 947
    const-string p2, "You must provide a name when collecting US bank account details."

    .line 945
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 944
    invoke-interface {v10, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public collectBankAccountToken(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1072
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p2, :cond_0

    .line 1073
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingInitError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 1076
    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    invoke-direct {v0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;-><init>()V

    .line 1079
    sget-object v2, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;->ForToken:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;

    .line 1080
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    if-nez p2, :cond_1

    const-string p2, "publishableKey"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_1
    move-object v3, p2

    .line 1081
    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    .line 1083
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v6

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-object v5, p3

    .line 1077
    invoke-virtual/range {v0 .. v6}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->presentFinancialConnectionsSheet(Ljava/lang/String;Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public collectFinancialConnectionsAccounts(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1094
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p2, :cond_0

    .line 1095
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingInitError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 1098
    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    invoke-direct {v0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;-><init>()V

    .line 1101
    sget-object v2, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;->ForSession:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;

    .line 1102
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    if-nez p2, :cond_1

    const-string p2, "publishableKey"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_1
    move-object v3, p2

    .line 1103
    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    .line 1105
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v6

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-object v5, p3

    .line 1099
    invoke-virtual/range {v0 .. v6}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->presentFinancialConnectionsSheet(Ljava/lang/String;Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public configureOrderTracking(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    const-string v0, "orderTypeIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "orderIdentifier"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "webServiceUrl"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "authenticationToken"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "promise"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public confirmEmbeddedPaymentElement(DLcom/facebook/react/bridge/Promise;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p1, "promise"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public confirmPayment(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 10
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "paymentIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 583
    const-string v0, "paymentMethodData"

    invoke-static {p2, v0}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 586
    const-string v2, "paymentMethodType"

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToPaymentMethodType(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object p2

    if-nez p2, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 589
    sget-object p1, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 590
    const-string p2, "You must provide paymentMethodType"

    .line 588
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 587
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_0
    move-object p2, v1

    .line 610
    :cond_1
    new-instance v2, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;

    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    invoke-direct {v2, v0, p3, v3, v4}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativestripesdk/CardFieldView;Lcom/reactnativestripesdk/CardFormView;)V

    const/4 p3, 0x1

    .line 614
    :try_start_0
    invoke-virtual {v2, p1, p2, p3}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;->createParams(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Z)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type com.stripe.android.model.ConfirmPaymentIntentParams"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p2

    check-cast v9, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    .line 619
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->urlScheme:Ljava/lang/String;
    :try_end_0
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz p2, :cond_2

    .line 620
    :try_start_1
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToReturnURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v9, p2}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->setReturnUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v7, p4

    goto :goto_4

    .line 623
    :cond_2
    :goto_0
    :try_start_2
    const-string p2, "shippingDetails"

    invoke-static {v0, p2}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-static {p2}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToShippingDetails(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    move-result-object p2

    .line 622
    invoke-virtual {v9, p2}, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->setShipping(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V

    .line 625
    sget-object v2, Lcom/reactnativestripesdk/PaymentLauncherFragment;->Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    .line 626
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v3

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;
    :try_end_2
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_2 .. :try_end_2} :catch_2

    if-nez p2, :cond_3

    :try_start_3
    const-string p2, "stripe"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_3
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v4, v1

    goto :goto_1

    :cond_3
    move-object v4, p2

    .line 628
    :goto_1
    :try_start_4
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;
    :try_end_4
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_4 .. :try_end_4} :catch_2

    if-nez p2, :cond_4

    :try_start_5
    const-string p2, "publishableKey"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_5 .. :try_end_5} :catch_0

    move-object v5, v1

    goto :goto_2

    :cond_4
    move-object v5, p2

    .line 629
    :goto_2
    :try_start_6
    iget-object v6, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;
    :try_end_6
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_6 .. :try_end_6} :catch_2

    move-object v8, p1

    move-object v7, p4

    .line 625
    :try_start_7
    invoke-virtual/range {v2 .. v9}, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;->forPayment(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams;)Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-result-object p1

    .line 624
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentLauncherFragment:Lcom/reactnativestripesdk/PaymentLauncherFragment;
    :try_end_7
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_7 .. :try_end_7} :catch_1

    return-void

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v7, p4

    :goto_3
    move-object p1, v0

    .line 635
    :goto_4
    sget-object p2, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p2}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Ljava/lang/Exception;

    invoke-static {p2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v7, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public confirmPaymentSheetPayment(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    if-nez v0, :cond_0

    .line 283
    sget-object v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 287
    invoke-virtual {v0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->confirmPayment(Lcom/facebook/react/bridge/Promise;)V

    :cond_1
    return-void
.end method

.method public confirmPlatformPay(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 745
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez v0, :cond_0

    .line 746
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingInitError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 751
    :cond_0
    const-string v0, "googlePay"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v4

    if-nez v4, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 754
    sget-object p1, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->Failed:Lcom/reactnativestripesdk/utils/GooglePayErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 755
    const-string p2, "You must provide the `googlePay` parameter."

    .line 753
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 752
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 761
    :cond_1
    new-instance v1, Lcom/reactnativestripesdk/GooglePayLauncherFragment;

    invoke-direct {v1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;-><init>()V

    if-eqz p3, :cond_2

    .line 764
    sget-object p2, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;->ForPayment:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;

    goto :goto_0

    :cond_2
    sget-object p2, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;->ForSetup:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;

    :goto_0
    move-object v3, p2

    .line 766
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v5

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 762
    new-instance v6, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;

    invoke-direct {v6, p4, p3, p0, p1}, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda3;-><init>(Lcom/facebook/react/bridge/Promise;ZLcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;)V

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->presentGooglePaySheet(Ljava/lang/String;Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactApplicationContext;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public confirmSetupIntent(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 11
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "setupIntentClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 669
    const-string v1, "paymentMethodType"

    const/4 v2, 0x0

    invoke-static {p2, v1, v2, v0, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr$default(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToPaymentMethodType(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 680
    :cond_0
    new-instance v1, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;

    .line 681
    const-string v3, "paymentMethodData"

    invoke-static {p2, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    .line 683
    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    .line 684
    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    .line 680
    invoke-direct {v1, p2, p3, v3, v4}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativestripesdk/CardFieldView;Lcom/reactnativestripesdk/CardFormView;)V

    const/4 p2, 0x0

    .line 689
    :try_start_0
    invoke-virtual {v1, p1, v0, p2}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;->createParams(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Z)Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type com.stripe.android.model.ConfirmSetupIntentParams"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, p2

    check-cast v10, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    .line 694
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->urlScheme:Ljava/lang/String;
    :try_end_0
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz p2, :cond_1

    .line 695
    :try_start_1
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToReturnURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v10, p2}, Lcom/stripe/android/model/ConfirmSetupIntentParams;->setReturnUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p4

    goto :goto_4

    .line 698
    :cond_1
    :goto_0
    :try_start_2
    sget-object v3, Lcom/reactnativestripesdk/PaymentLauncherFragment;->Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    .line 699
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v4

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 700
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;
    :try_end_2
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_2 .. :try_end_2} :catch_2

    if-nez p2, :cond_2

    :try_start_3
    const-string p2, "stripe"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_3
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_3 .. :try_end_3} :catch_0

    move-object v5, v2

    goto :goto_1

    :cond_2
    move-object v5, p2

    .line 701
    :goto_1
    :try_start_4
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;
    :try_end_4
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_4 .. :try_end_4} :catch_2

    if-nez p2, :cond_3

    :try_start_5
    const-string p2, "publishableKey"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_5 .. :try_end_5} :catch_0

    move-object v6, v2

    goto :goto_2

    :cond_3
    move-object v6, p2

    .line 702
    :goto_2
    :try_start_6
    iget-object v7, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;
    :try_end_6
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_6 .. :try_end_6} :catch_2

    move-object v9, p1

    move-object v8, p4

    .line 698
    :try_start_7
    invoke-virtual/range {v3 .. v10}, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;->forSetup(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;Lcom/stripe/android/model/ConfirmSetupIntentParams;)Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-result-object p1

    .line 697
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentLauncherFragment:Lcom/reactnativestripesdk/PaymentLauncherFragment;
    :try_end_7
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_7 .. :try_end_7} :catch_1

    return-void

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v8, p4

    :goto_3
    move-object p1, v0

    .line 708
    :goto_4
    sget-object p2, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p2}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Ljava/lang/Exception;

    invoke-static {p2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v8, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_4
    :goto_5
    move-object v8, p4

    .line 669
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 672
    sget-object p1, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 673
    const-string p2, "You must provide paymentMethodType"

    .line 671
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 670
    invoke-interface {v8, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public createEmbeddedPaymentElement(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "intentConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "configuration"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "promise"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public createPaymentMethod(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 12
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 330
    const-string v1, "paymentMethodType"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr$default(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToPaymentMethodType(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 339
    :cond_0
    const-string v1, "paymentMethodData"

    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    .line 341
    new-instance v1, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;

    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    invoke-direct {v1, p1, p2, v3, v4}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;-><init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativestripesdk/CardFieldView;Lcom/reactnativestripesdk/CardFormView;)V

    .line 343
    :try_start_0
    invoke-virtual {v1, v0}, Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;->createPaymentMethodParams(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v6

    .line 344
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_1

    const-string p1, "stripe"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_0

    :cond_1
    move-object v5, p1

    .line 347
    :goto_0
    new-instance p1, Lcom/reactnativestripesdk/StripeSdkModule$createPaymentMethod$1;

    invoke-direct {p1, p3}, Lcom/reactnativestripesdk/StripeSdkModule$createPaymentMethod$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    move-object v9, p1

    check-cast v9, Lcom/stripe/android/ApiResultCallback;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 344
    invoke-static/range {v5 .. v11}, Lcom/stripe/android/Stripe;->createPaymentMethod$default(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V
    :try_end_0
    .catch Lcom/reactnativestripesdk/PaymentMethodCreateParamsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 359
    sget-object p2, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p2}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Ljava/lang/Exception;

    invoke-static {p2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 330
    :cond_2
    :goto_1
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 333
    sget-object p1, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 334
    const-string p2, "You must provide paymentMethodType"

    .line 332
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 331
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public createPlatformPayPaymentMethod(Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Promise;)V
    .locals 5
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 841
    const-string v0, "googlePay"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 844
    sget-object p1, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->Failed:Lcom/reactnativestripesdk/utils/GooglePayErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 845
    const-string p2, "You must provide the `googlePay` parameter."

    .line 843
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 842
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 850
    :cond_0
    iput-boolean p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->platformPayUsesDeprecatedTokenFlow:Z

    .line 851
    iput-object p3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->createPlatformPayPaymentMethodPromise:Lcom/facebook/react/bridge/Promise;

    .line 852
    invoke-direct {p0, p3}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 854
    sget-object p3, Lcom/reactnativestripesdk/GooglePayRequestHelper;->Companion:Lcom/reactnativestripesdk/GooglePayRequestHelper$Companion;

    .line 856
    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 854
    invoke-virtual {p3, p2, v0, p1}, Lcom/reactnativestripesdk/GooglePayRequestHelper$Companion;->createPaymentRequest$stripe_stripe_react_native_release(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/android/GooglePayJsonFactory;Lcom/facebook/react/bridge/ReadableMap;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 859
    sget-object p3, Lcom/reactnativestripesdk/GooglePayRequestHelper;->Companion:Lcom/reactnativestripesdk/GooglePayRequestHelper$Companion;

    invoke-virtual {p3, p1, p2}, Lcom/reactnativestripesdk/GooglePayRequestHelper$Companion;->createPaymentMethod$stripe_stripe_react_native_release(Lcom/google/android/gms/tasks/Task;Landroidx/fragment/app/FragmentActivity;)V

    :cond_1
    return-void
.end method

.method public createToken(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 372
    sget-object p1, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->Failed:Lcom/reactnativestripesdk/utils/CreateTokenErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 373
    const-string v0, "type parameter is required"

    .line 371
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 370
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 379
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x13970

    if-eq v1, v2, :cond_5

    const v2, 0x1fef30

    if-eq v1, v2, :cond_3

    const v2, 0x305b8831

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "BankAccount"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 381
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->createTokenFromBankAccount(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void

    .line 379
    :cond_3
    const-string v1, "Card"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 385
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->createTokenFromCard(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void

    .line 379
    :cond_5
    const-string v1, "Pii"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 395
    :goto_0
    sget-object p1, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->Failed:Lcom/reactnativestripesdk/utils/CreateTokenErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 396
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " type is not supported yet"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 394
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 393
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 389
    :cond_6
    invoke-direct {p0, p1, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->createTokenFromPii(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public createTokenForCVCUpdate(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 8
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "cvc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez v0, :cond_0

    const-string v0, "stripe"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v1, v0

    .line 508
    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$createTokenForCVCUpdate$1;

    invoke-direct {v0, p2}, Lcom/reactnativestripesdk/StripeSdkModule$createTokenForCVCUpdate$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/ApiResultCallback;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    .line 505
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/Stripe;->createCvcUpdateToken$default(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public customPaymentMethodResultCallback(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 317
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;

    if-nez p1, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v1, "createMap(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    :cond_0
    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 319
    invoke-static {v0, p1, v0}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;

    if-eqz p2, :cond_1

    .line 320
    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public customerAdapterAttachPaymentMethodCallback(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1203
    const-string v0, "paymentMethodJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1192
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_2

    .line 1194
    sget-object v1, Lcom/stripe/android/model/PaymentMethod;->Companion:Lcom/stripe/android/model/PaymentMethod$Companion;

    new-instance v2, Lorg/json/JSONObject;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type java.util.HashMap<*, *>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Map;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethod$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-nez p1, :cond_0

    .line 1197
    const-string p1, "StripeReactNative"

    .line 1198
    const-string p2, "There was an error converting Payment Method JSON to a Stripe Payment Method"

    .line 1196
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 1202
    :cond_0
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getAttachPaymentMethodCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 1192
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1203
    :cond_2
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1204
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public customerAdapterDetachPaymentMethodCallback(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1225
    const-string v0, "paymentMethodJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1214
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_2

    .line 1216
    sget-object v1, Lcom/stripe/android/model/PaymentMethod;->Companion:Lcom/stripe/android/model/PaymentMethod$Companion;

    new-instance v2, Lorg/json/JSONObject;

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type java.util.HashMap<*, *>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Map;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethod$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-nez p1, :cond_0

    .line 1219
    const-string p1, "StripeReactNative"

    .line 1220
    const-string p2, "There was an error converting Payment Method JSON to a Stripe Payment Method"

    .line 1218
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 1224
    :cond_0
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getDetachPaymentMethodCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 1214
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1225
    :cond_2
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1226
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public customerAdapterFetchPaymentMethodsCallback(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "paymentMethodJsonObjects"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1168
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_3

    .line 1169
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 1170
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v2, "iterator(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1171
    sget-object v3, Lcom/stripe/android/model/PaymentMethod;->Companion:Lcom/stripe/android/model/PaymentMethod$Companion;

    new-instance v4, Lorg/json/JSONObject;

    const-string v5, "null cannot be cast to non-null type java.util.HashMap<*, *>"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/HashMap;

    check-cast v2, Ljava/util/Map;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3, v4}, Lcom/stripe/android/model/PaymentMethod$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1172
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1173
    :cond_0
    move-object v2, p0

    check-cast v2, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1175
    const-string v2, "StripeReactNative"

    .line 1176
    const-string v3, "There was an error converting Payment Method JSON to a Stripe Payment Method"

    .line 1174
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1180
    :cond_1
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getFetchPaymentMethodsCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1, v1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    .line 1168
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1181
    :cond_3
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1182
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public customerAdapterFetchSelectedPaymentOptionCallback(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1248
    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1246
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_1

    .line 1247
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 1246
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1248
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1249
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public customerAdapterSetSelectedPaymentOptionCallback(Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1235
    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1233
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_1

    .line 1234
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 1233
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1235
    :cond_1
    move-object v0, p0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1236
    sget-object v0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public customerAdapterSetupIntentClientSecretForCustomerAttachCallback(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1261
    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1259
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_1

    .line 1260
    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->getCustomerAdapter$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 1259
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-void

    .line 1261
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1262
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public dismissPlatformPay(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    return-void
.end method

.method public final getCardFieldView()Lcom/reactnativestripesdk/CardFieldView;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    return-object v0
.end method

.method public final getCardFormView()Lcom/reactnativestripesdk/CardFormView;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    return-object v0
.end method

.method public final getComposeCompatView$stripe_stripe_react_native_release()Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->composeCompatView:Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    return-object v0
.end method

.method public final getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public final getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->embeddedIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method protected getTypedExportedConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 190
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "CORE"

    const-string v2, "2020-03-02"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 191
    sget-object v1, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->getApiVersion()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ISSUING"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 189
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 188
    const-string v1, "API_VERSIONS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 187
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public handleNextAction(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p2, "paymentIntentClientSecret"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    sget-object v0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    .line 531
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    const/4 v2, 0x0

    if-nez p2, :cond_0

    const-string p2, "stripe"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    .line 533
    :cond_0
    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    if-nez v3, :cond_1

    const-string v3, "publishableKey"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    .line 534
    :cond_1
    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    move-object v6, p1

    move-object v2, p2

    move-object v5, p3

    .line 530
    invoke-virtual/range {v0 .. v6}, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;->forNextActionPayment(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-result-object p1

    .line 529
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentLauncherFragment:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    return-void
.end method

.method public handleNextActionForSetup(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string p2, "setupIntentClientSecret"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "promise"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    sget-object v0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    .line 548
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string p2, "getReactApplicationContext(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    const/4 v2, 0x0

    if-nez p2, :cond_0

    const-string p2, "stripe"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, v2

    .line 550
    :cond_0
    iget-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    if-nez v3, :cond_1

    const-string v3, "publishableKey"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    .line 551
    :cond_1
    iget-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    move-object v6, p1

    move-object v2, p2

    move-object v5, p3

    .line 547
    invoke-virtual/range {v0 .. v6}, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;->forNextActionSetup(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-result-object p1

    .line 546
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentLauncherFragment:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    return-void
.end method

.method public handleURLCallback(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "promise"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public initCustomerSheet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerAdapterOverrides"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1116
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez v0, :cond_0

    .line 1117
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingInitError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 1121
    :cond_0
    invoke-direct {p0, p3}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1122
    iget-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v1, :cond_1

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v2

    const-string v3, "getReactApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 1124
    :cond_1
    new-instance v1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    invoke-direct {v1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;-><init>()V

    .line 1125
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->setContext$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 1126
    invoke-virtual {v1, p3}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->setInitPromise$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/Promise;)V

    .line 1127
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->toBundleObject(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p1

    .line 1128
    const-string v2, "customerAdapter"

    invoke-static {p2}, Lcom/reactnativestripesdk/utils/MappersKt;->toBundleObject(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1129
    invoke-virtual {v1, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1123
    iput-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    .line 1132
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 1133
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 1134
    iget-object p2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p2, Landroidx/fragment/app/Fragment;

    const-string v0, "customer_sheet_launch_fragment"

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 1135
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1137
    sget-object p2, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p2}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    :goto_0
    return-void
.end method

.method public initPaymentSheet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    invoke-direct {p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 236
    iget-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    const-string v2, "getReactApplicationContext(...)"

    if-eqz v1, :cond_0

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 237
    :cond_0
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->toBundleObject(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;

    move-result-object v1

    .line 240
    const-string v3, "customPaymentMethodConfiguration"

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 243
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    move-result-object p1

    check-cast p1, Ljava/io/Serializable;

    const-string v3, "customPaymentMethodConfigurationReadableMap"

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 247
    :cond_1
    sget-object p1, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3, v1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->create$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/os/Bundle;Lcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/PaymentSheetFragment;

    move-result-object p1

    .line 246
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    .line 249
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 250
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 251
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Landroidx/fragment/app/Fragment;

    const-string v1, "payment_sheet_launch_fragment"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 252
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 254
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    :goto_0
    return-void
.end method

.method public initialise(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 10
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    const-string v0, "publishableKey"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    const-string v2, "appInfo"

    invoke-static {p1, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    const-string v3, "stripeAccountId"

    invoke-static {p1, v3, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    .line 203
    const-string v3, "urlScheme"

    invoke-static {p1, v3, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 204
    const-string v5, "setReturnUrlSchemeOnAndroid"

    invoke-static {p1, v5}, Lcom/reactnativestripesdk/utils/MappersKt;->getBooleanOrFalse(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v1

    .line 205
    :goto_0
    iput-object v3, p0, Lcom/reactnativestripesdk/StripeSdkModule;->urlScheme:Ljava/lang/String;

    .line 207
    const-string v3, "threeDSecureParams"

    invoke-static {p1, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getMapOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 208
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/StripeSdkModule;->configure3dSecure(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 211
    :cond_1
    iput-object v4, p0, Lcom/reactnativestripesdk/StripeSdkModule;->publishableKey:Ljava/lang/String;

    .line 212
    sget-object p1, Lcom/reactnativestripesdk/addresssheet/AddressLauncherFragment;->Companion:Lcom/reactnativestripesdk/addresssheet/AddressLauncherFragment$Companion;

    invoke-virtual {p1, v4}, Lcom/reactnativestripesdk/addresssheet/AddressLauncherFragment$Companion;->setPublishableKey$stripe_stripe_react_native_release(Ljava/lang/String;)V

    .line 214
    const-string p1, "name"

    const-string v3, ""

    invoke-static {v2, p1, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    const-string v0, "partnerId"

    invoke-static {v2, v0, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 216
    const-string v5, "version"

    invoke-static {v2, v5, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 218
    const-string v6, "url"

    invoke-static {v2, v6, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 219
    sget-object v3, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    sget-object v6, Lcom/stripe/android/core/AppInfo;->Companion:Lcom/stripe/android/core/AppInfo$Companion;

    invoke-virtual {v6, p1, v5, v2, v0}, Lcom/stripe/android/core/AppInfo$Companion;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/AppInfo;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/stripe/android/Stripe$Companion;->setAppInfo(Lcom/stripe/android/core/AppInfo;)V

    .line 220
    new-instance v2, Lcom/stripe/android/Stripe;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    const-string v0, "getReactApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Landroid/content/Context;

    iget-object v5, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    .line 222
    sget-object p1, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripeAccountId:Ljava/lang/String;

    invoke-virtual {p1, v2, v4, v0}, Lcom/stripe/android/PaymentConfiguration$Companion;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-direct {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->preventActivityRecreation()V

    .line 225
    invoke-direct {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->setupComposeCompatView()V

    .line 227
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public intentCreationCallback(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->embeddedIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    .line 303
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    if-nez v0, :cond_0

    .line 304
    sget-object p1, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    .line 308
    invoke-virtual {v0}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lkotlinx/coroutines/CompletableDeferred;->complete(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public isCardInWallet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 903
    const-string v0, "cardLastFour"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->getValOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 904
    const-string p1, "Failed"

    const-string v0, "You must provide cardLastFour"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 907
    :cond_0
    invoke-direct {p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 908
    sget-object v1, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    check-cast v0, Landroid/app/Activity;

    new-instance v2, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule$$ExternalSyntheticLambda2;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-virtual {v1, v0, p1, v2}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->isCardInWallet(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    :cond_1
    return-void
.end method

.method public isPlatformPaySupported(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 717
    const-string v0, "googlePay"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 719
    :goto_0
    sget-object v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->Companion:Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;

    .line 720
    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 721
    const-string v2, "testEnv"

    invoke-static {p1, v2}, Lcom/reactnativestripesdk/utils/MappersKt;->getBooleanOrFalse(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    move-result v2

    .line 722
    const-string v3, "existingPaymentMethodRequired"

    invoke-static {p1, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->getBooleanOrFalse(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z

    move-result p1

    .line 719
    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;->create(Lcom/facebook/react/bridge/ReactApplicationContext;ZZLcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;

    move-result-object p1

    .line 726
    invoke-direct {p0, p2}, Lcom/reactnativestripesdk/StripeSdkModule;->getCurrentActivityOrResolveWithError(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 728
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 729
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 730
    check-cast p1, Landroidx/fragment/app/Fragment;

    const-string v1, "google_pay_support_fragment"

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 731
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 733
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_1
    return-void
.end method

.method public openApplePaySetup(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public presentCustomerSheet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1148
    const-string v0, "timeout"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1149
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1151
    :goto_0
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->present(Ljava/lang/Long;Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1152
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public presentPaymentSheet(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    if-nez v0, :cond_0

    .line 265
    sget-object p1, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 270
    :cond_0
    const-string v0, "timeout"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 271
    iget-object v1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    if-eqz v1, :cond_2

    .line 272
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p1

    int-to-long v2, p1

    .line 271
    invoke-virtual {v1, v2, v3, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment;->presentWithTimeout(JLcom/facebook/react/bridge/Promise;)V

    return-void

    .line 276
    :cond_1
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->paymentSheetFragment:Lcom/reactnativestripesdk/PaymentSheetFragment;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment;->present(Lcom/facebook/react/bridge/Promise;)V

    :cond_2
    return-void
.end method

.method public resetPaymentSheetCustomer(Lcom/facebook/react/bridge/Promise;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "getReactApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;->resetCustomer(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 293
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public retrieveCustomerSheetPaymentOptionSelection(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1158
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customerSheetFragment:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->retrievePaymentOptionSelection$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/Promise;)V

    return-void

    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 1159
    sget-object v0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public retrievePaymentIntent(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 644
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$retrievePaymentIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, p2, v2}, Lcom/reactnativestripesdk/StripeSdkModule$retrievePaymentIntent$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public retrieveSetupIntent(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 655
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/reactnativestripesdk/StripeSdkModule$retrieveSetupIntent$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, p2, v2}, Lcom/reactnativestripesdk/StripeSdkModule$retrieveSetupIntent$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setCardFieldView(Lcom/reactnativestripesdk/CardFieldView;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFieldView:Lcom/reactnativestripesdk/CardFieldView;

    return-void
.end method

.method public final setCardFormView(Lcom/reactnativestripesdk/CardFormView;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->cardFormView:Lcom/reactnativestripesdk/CardFormView;

    return-void
.end method

.method public final setComposeCompatView$stripe_stripe_react_native_release(Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->composeCompatView:Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;

    return-void
.end method

.method public final setCustomPaymentMethodResultCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->customPaymentMethodResultCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public final setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->embeddedIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public updateEmbeddedPaymentElement(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "intentConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "promise"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public updatePlatformPaySheet(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    return-void
.end method

.method public verifyMicrodeposits(ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 6
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 988
    const-string v0, "amounts"

    invoke-interface {p3, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v0

    .line 989
    const-string v1, "descriptorCode"

    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-eqz v0, :cond_0

    if-nez p3, :cond_1

    :cond_0
    if-nez v0, :cond_2

    if-nez p3, :cond_2

    .line 994
    :cond_1
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 995
    const-string p2, "You must provide either amounts OR descriptorCode, not both."

    .line 993
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 992
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 1002
    :cond_2
    new-instance v1, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;

    invoke-direct {v1, p4}, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 1013
    new-instance v2, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$setupCallback$1;

    invoke-direct {v2, p4}, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$setupCallback$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    const/4 v3, 0x0

    .line 1023
    const-string v4, "stripe"

    if-eqz v0, :cond_7

    .line 1024
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result p3

    const/4 v5, 0x2

    if-eq p3, v5, :cond_3

    .line 1027
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1028
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Expected 2 integers in the amounts array, but received "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 1026
    invoke-static {p1, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 1025
    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 p3, 0x1

    const/4 p4, 0x0

    if-eqz p1, :cond_5

    .line 1035
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, p1

    .line 1037
    :goto_0
    invoke-interface {v0, p4}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p1

    .line 1038
    invoke-interface {v0, p3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p3

    .line 1039
    check-cast v1, Lcom/stripe/android/ApiResultCallback;

    .line 1035
    invoke-virtual {v3, p2, p1, p3, v1}, Lcom/stripe/android/Stripe;->verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/ApiResultCallback;)V

    return-void

    .line 1042
    :cond_5
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v3, p1

    .line 1044
    :goto_1
    invoke-interface {v0, p4}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p1

    .line 1045
    invoke-interface {v0, p3}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p3

    .line 1046
    check-cast v2, Lcom/stripe/android/ApiResultCallback;

    .line 1042
    invoke-virtual {v3, p2, p1, p3, v2}, Lcom/stripe/android/Stripe;->verifySetupIntentWithMicrodeposits(Ljava/lang/String;IILcom/stripe/android/ApiResultCallback;)V

    return-void

    :cond_7
    if-eqz p3, :cond_b

    if-eqz p1, :cond_9

    .line 1051
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-object v3, p1

    .line 1054
    :goto_2
    check-cast v1, Lcom/stripe/android/ApiResultCallback;

    .line 1051
    invoke-virtual {v3, p2, p3, v1}, Lcom/stripe/android/Stripe;->verifyPaymentIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    return-void

    .line 1057
    :cond_9
    iget-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule;->stripe:Lcom/stripe/android/Stripe;

    if-nez p1, :cond_a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    move-object v3, p1

    .line 1060
    :goto_3
    check-cast v2, Lcom/stripe/android/ApiResultCallback;

    .line 1057
    invoke-virtual {v3, p2, p3, v2}, Lcom/stripe/android/Stripe;->verifySetupIntentWithMicrodeposits(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V

    :cond_b
    return-void
.end method
