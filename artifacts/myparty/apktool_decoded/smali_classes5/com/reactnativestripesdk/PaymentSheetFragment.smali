.class public final Lcom/reactnativestripesdk/PaymentSheetFragment;
.super Lcom/reactnativestripesdk/utils/StripeFragment;
.source "PaymentSheetFragment.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetFragment.kt\ncom/reactnativestripesdk/PaymentSheetFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,806:1\n1#2:807\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0008J\u0016\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020\u0008J\u000e\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0008J\u0008\u0010)\u001a\u00020\"H\u0002J\u0012\u0010*\u001a\u00020\"2\u0008\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/reactnativestripesdk/PaymentSheetFragment;",
        "Lcom/reactnativestripesdk/utils/StripeFragment;",
        "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "<init>",
        "()V",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "initPromise",
        "Lcom/facebook/react/bridge/Promise;",
        "paymentSheet",
        "Lcom/stripe/android/paymentsheet/PaymentSheet;",
        "flowController",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;",
        "paymentIntentClientSecret",
        "",
        "setupIntentClientSecret",
        "intentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "paymentSheetConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "confirmPromise",
        "presentPromise",
        "paymentSheetTimedOut",
        "",
        "paymentSheetIntentCreationCallback",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release",
        "()Lkotlinx/coroutines/CompletableDeferred;",
        "setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release",
        "(Lkotlinx/coroutines/CompletableDeferred;)V",
        "keepJsAwake",
        "Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;",
        "prepare",
        "",
        "present",
        "promise",
        "presentWithTimeout",
        "timeout",
        "",
        "confirmPayment",
        "configureFlowController",
        "resolvePresentPromise",
        "value",
        "",
        "resolvePaymentResult",
        "map",
        "Lcom/facebook/react/bridge/WritableMap;",
        "onConfirmCustomPaymentMethod",
        "customPaymentMethod",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
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

.field public static final Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "payment_sheet_launch_fragment"

.field private static final mapIntToButtonType:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private confirmPromise:Lcom/facebook/react/bridge/Promise;

.field private context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

.field private initPromise:Lcom/facebook/react/bridge/Promise;

.field private intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

.field private keepJsAwake:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

.field private paymentIntentClientSecret:Ljava/lang/String;

.field private paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

.field private paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private paymentSheetIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation
.end field

.field private paymentSheetTimedOut:Z

.field private presentPromise:Lcom/facebook/react/bridge/Promise;

.field private setupIntentClientSecret:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$5NPZJVjtcsKMBYLp5uXyMXZP2SI(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->prepare$lambda$4(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$8OyosIa5PU1IYyIlj5xpCcYR9gs(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->prepare$lambda$3(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V

    return-void
.end method

.method public static synthetic $r8$lambda$cxZqbi5nIsq4vVwdWzob6MqAPJ4(Lcom/reactnativestripesdk/PaymentSheetFragment;ZLjava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment;->configureFlowController$lambda$12(Lcom/reactnativestripesdk/PaymentSheetFragment;ZLjava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic $r8$lambda$oZYfp8mJMXrcmYAviRLH1e5pe9U(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/reactnativestripesdk/PaymentSheetFragment;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->presentWithTimeout$lambda$9(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->$stable:I

    .line 536
    new-array v0, v0, [Lkotlin/Pair;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Buy:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x6

    .line 537
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Book:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x5

    .line 538
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v0, v4

    const/4 v3, 0x4

    .line 539
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Donate:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x3

    aput-object v4, v0, v5

    const/16 v4, 0xb

    .line 540
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Order:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x3e8

    .line 541
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Pay:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x7

    .line 542
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v2

    const/16 v2, 0x3e9

    .line 543
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Plain:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v1

    .line 535
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->mapIntToButtonType:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 75
    invoke-static {v0, v1, v0}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v0

    iput-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/reactnativestripesdk/PaymentSheetFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getMapIntToButtonType$cp()Ljava/util/Map;
    .locals 1

    .line 60
    sget-object v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->mapIntToButtonType:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$setContext$p(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method public static final synthetic access$setInitPromise$p(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    return-void
.end method

.method private final configureFlowController()V
    .locals 6

    .line 389
    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda3;-><init>(Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    .line 403
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentIntentClientSecret:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "paymentSheetConfiguration"

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 404
    :cond_0
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    if-eqz v1, :cond_7

    .line 405
    iget-object v4, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentIntentClientSecret:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 406
    iget-object v5, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v5, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v3, v5

    .line 404
    :goto_0
    invoke-interface {v1, v4, v3, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->configureWithPaymentIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V

    return-void

    .line 409
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->setupIntentClientSecret:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    .line 410
    :cond_3
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    if-eqz v1, :cond_7

    .line 411
    iget-object v4, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->setupIntentClientSecret:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 412
    iget-object v5, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v5, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v3, v5

    .line 410
    :goto_2
    invoke-interface {v1, v4, v3, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->configureWithSetupIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V

    return-void

    .line 415
    :cond_5
    :goto_3
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    if-eqz v1, :cond_8

    .line 416
    iget-object v4, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    if-eqz v4, :cond_7

    .line 417
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 418
    iget-object v5, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v5, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    move-object v3, v5

    .line 416
    :goto_4
    invoke-interface {v4, v1, v3, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->configureWithIntentConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V

    :cond_7
    return-void

    .line 422
    :cond_8
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_9

    const-string v0, "initPromise"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    move-object v3, v0

    .line 424
    :goto_5
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    .line 425
    const-string v1, "One of `paymentIntentClientSecret`, `setupIntentClientSecret`, or `intentConfiguration` is required"

    .line 423
    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 422
    invoke-interface {v3, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method private static final configureFlowController$lambda$12(Lcom/reactnativestripesdk/PaymentSheetFragment;ZLjava/lang/Throwable;)V
    .locals 3

    .line 392
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 393
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, p2

    :cond_0
    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getDrawableResourceId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBitmapFromVectorDrawable(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 394
    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBase64FromBitmap(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    .line 395
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    check-cast v1, Lcom/facebook/react/bridge/WritableMap;

    .line 396
    const-string v2, "label"

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    const-string p1, "image"

    invoke-interface {v1, p1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    const-string p1, "paymentOption"

    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    if-nez p1, :cond_2

    .line 399
    :cond_1
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    check-cast p1, Lcom/facebook/react/bridge/WritableMap;

    .line 400
    :cond_2
    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez p0, :cond_3

    const-string p0, "initPromise"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object p2, p0

    :goto_0
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method private static final prepare$lambda$3(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 130
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Landroid/content/Context;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getDrawableResourceId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBitmapFromVectorDrawable(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 131
    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->getBase64FromBitmap(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    .line 132
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    check-cast v1, Lcom/facebook/react/bridge/WritableMap;

    .line 133
    const-string v2, "label"

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOption;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string p1, "image"

    invoke-interface {v1, p1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string p1, "paymentOption"

    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    if-nez p1, :cond_3

    .line 138
    :cond_1
    iget-boolean p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetTimedOut:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 139
    iput-boolean p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetTimedOut:Z

    .line 140
    sget-object p1, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Timeout:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "The payment has timed out"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    goto :goto_0

    .line 143
    :cond_2
    sget-object p1, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Canceled:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 144
    const-string v0, "The payment option selection flow has been canceled"

    .line 142
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 148
    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePresentPromise(Ljava/lang/Object;)V

    return-void
.end method

.method private static final prepare$lambda$4(Lcom/reactnativestripesdk/PaymentSheetFragment;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 2

    const-string v0, "paymentResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-boolean v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetTimedOut:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 154
    iput-boolean p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetTimedOut:Z

    .line 156
    sget-object p1, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Timeout:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "The payment has timed out"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 155
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePaymentResult(Lcom/facebook/react/bridge/WritableMap;)V

    return-void

    .line 160
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;

    if-eqz v0, :cond_1

    .line 163
    sget-object p1, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Canceled:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    .line 164
    const-string v0, "The payment flow has been canceled"

    .line 162
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 161
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePaymentResult(Lcom/facebook/react/bridge/WritableMap;)V

    return-void

    .line 169
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;

    if-eqz v0, :cond_2

    .line 171
    sget-object v0, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->Failed:Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 170
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePaymentResult(Lcom/facebook/react/bridge/WritableMap;)V

    return-void

    .line 175
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;

    if-eqz p1, :cond_4

    .line 176
    new-instance p1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    check-cast p1, Lcom/facebook/react/bridge/WritableMap;

    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePaymentResult(Lcom/facebook/react/bridge/WritableMap;)V

    .line 179
    move-object p1, p0

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 180
    iput-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    .line 181
    iput-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    return-void

    .line 159
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final presentWithTimeout$lambda$9(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/reactnativestripesdk/PaymentSheetFragment;)V
    .locals 0

    .line 368
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Landroid/app/Activity;

    if-eqz p0, :cond_0

    .line 369
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    .line 370
    iput-boolean p0, p1, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetTimedOut:Z

    :cond_0
    return-void
.end method

.method private final resolvePaymentResult(Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 438
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->confirmPromise:Lcom/facebook/react/bridge/Promise;

    if-eqz v0, :cond_0

    .line 439
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 440
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->confirmPromise:Lcom/facebook/react/bridge/Promise;

    return-void

    .line 441
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->resolvePresentPromise(Ljava/lang/Object;)V

    return-void
.end method

.method private final resolvePresentPromise(Ljava/lang/Object;)V
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->keepJsAwake:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->stop()V

    .line 434
    :cond_0
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->presentPromise:Lcom/facebook/react/bridge/Promise;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final confirmPayment(Lcom/facebook/react/bridge/Promise;)V
    .locals 1

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->confirmPromise:Lcom/facebook/react/bridge/Promise;

    .line 385
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->confirm()V

    :cond_0
    return-void
.end method

.method public final getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/facebook/react/bridge/ReadableMap;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public onConfirmCustomPaymentMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V
    .locals 11

    const-string v1, "StripeReactNative"

    const-string v2, "context"

    const-string v0, "customPaymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 452
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v7, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v7, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v6

    :cond_0
    check-cast v7, Landroid/content/Context;

    const-class v8, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;

    invoke-direct {v0, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v7, 0x10000000

    .line 453
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v7, 0x10000

    .line 454
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 456
    iget-object v7, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v7, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v6

    :cond_1
    invoke-virtual {v7, v0}, Lcom/facebook/react/bridge/ReactApplicationContext;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 458
    const-string v7, "Failed to start CustomPaymentMethodActivity"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 463
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_2
    const-class v7, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {v0, v7}, Lcom/facebook/react/bridge/ReactApplicationContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v0, :cond_4

    .line 473
    new-instance v4, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v6, v1

    :goto_1
    invoke-direct {v4, v6}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {v4}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->start()V

    .line 476
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v7

    move-object v1, v0

    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;

    const/4 v6, 0x0

    move-object v5, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/reactnativestripesdk/PaymentSheetFragment;Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    .line 464
    :cond_4
    :try_start_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "StripeSdkModule not found"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    .line 466
    const-string v2, "StripeSdkModule not found for CPM callback"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 467
    sget-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;->finishCurrent()V

    return-void
.end method

.method public prepare()V
    .locals 35

    move-object/from16 v1, p0

    .line 80
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v3, "merchantDisplayName"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, ""

    if-nez v0, :cond_1

    move-object v0, v3

    .line 81
    :cond_1
    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const-string v5, "initPromise"

    if-nez v4, :cond_3

    .line 82
    iget-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    move-object v2, v0

    .line 83
    :goto_1
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "merchantDisplayName cannot be empty or null."

    invoke-static {v0, v3}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 82
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 87
    :cond_3
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v6, "primaryButtonLabel"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    .line 88
    :goto_2
    sget-object v6, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v7

    if-eqz v7, :cond_5

    const-string v8, "googlePay"

    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    invoke-virtual {v6, v7}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->buildGooglePayConfig$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v7

    .line 89
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v8

    if-eqz v8, :cond_6

    const-string v9, "link"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    :goto_4
    invoke-virtual {v6, v8}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->buildLinkConfig$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    .line 90
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v8

    if-eqz v8, :cond_7

    const-string v9, "allowsDelayedPaymentMethods"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    .line 91
    :goto_5
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_8

    const-string v10, "defaultBillingDetails"

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    goto :goto_6

    :cond_8
    const/4 v9, 0x0

    .line 92
    :goto_6
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v10

    if-eqz v10, :cond_9

    const-string v11, "billingDetailsCollectionConfiguration"

    invoke-virtual {v10, v11}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    goto :goto_7

    :cond_9
    const/4 v10, 0x0

    .line 93
    :goto_7
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v11

    if-eqz v11, :cond_a

    const-string v12, "paymentMethodOrder"

    invoke-virtual {v11, v12}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    goto :goto_8

    :cond_a
    const/4 v11, 0x0

    .line 95
    :goto_8
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v12

    const/4 v13, 0x1

    if-eqz v12, :cond_b

    const-string v14, "allowsRemovalOfLastSavedPaymentMethod"

    invoke-virtual {v12, v14, v13}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    goto :goto_9

    :cond_b
    move v12, v13

    .line 96
    :goto_9
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v14

    if-eqz v14, :cond_c

    const-string v15, "paymentIntentClientSecret"

    invoke-virtual {v14, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_a

    :cond_c
    const/4 v14, 0x0

    :goto_a
    if-nez v14, :cond_d

    move-object v14, v3

    :cond_d
    iput-object v14, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentIntentClientSecret:Ljava/lang/String;

    .line 97
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v14

    if-eqz v14, :cond_e

    const-string v15, "setupIntentClientSecret"

    invoke-virtual {v14, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_b

    :cond_e
    const/4 v14, 0x0

    :goto_b
    if-nez v14, :cond_f

    goto :goto_c

    :cond_f
    move-object v3, v14

    :goto_c
    iput-object v3, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->setupIntentClientSecret:Ljava/lang/String;

    .line 100
    :try_start_0
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_10

    const-string v14, "intentConfiguration"

    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_d

    :cond_10
    const/4 v3, 0x0

    :goto_d
    invoke-virtual {v6, v3}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->buildIntentConfiguration$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v3
    :try_end_0
    .catch Lcom/reactnativestripesdk/utils/PaymentSheetException; {:try_start_0 .. :try_end_0} :catch_2

    .line 98
    iput-object v3, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    .line 107
    :try_start_1
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_11

    const-string v14, "appearance"

    invoke-virtual {v3, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_e

    :cond_11
    const/4 v3, 0x0

    :goto_e
    iget-object v14, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez v14, :cond_12

    const-string v14, "context"

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v14, 0x0

    :cond_12
    check-cast v14, Landroid/content/Context;

    invoke-static {v3, v14}, Lcom/reactnativestripesdk/PaymentSheetAppearanceKt;->buildPaymentSheetAppearance(Landroid/os/Bundle;Landroid/content/Context;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v3
    :try_end_1
    .catch Lcom/reactnativestripesdk/utils/PaymentSheetAppearanceException; {:try_start_1 .. :try_end_1} :catch_1

    .line 115
    :try_start_2
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v14

    invoke-virtual {v6, v14}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->buildCustomerConfiguration$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v6
    :try_end_2
    .catch Lcom/reactnativestripesdk/utils/PaymentSheetException; {:try_start_2 .. :try_end_2} :catch_0

    .line 122
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v14

    if-eqz v14, :cond_13

    const-string v15, "defaultShippingDetails"

    invoke-virtual {v14, v15}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    if-eqz v14, :cond_13

    .line 123
    sget-object v15, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->Companion:Lcom/reactnativestripesdk/addresssheet/AddressSheetView$Companion;

    invoke-virtual {v15, v14}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView$Companion;->buildAddressDetails$stripe_stripe_react_native_release(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v14

    goto :goto_f

    :cond_13
    const/4 v14, 0x0

    .line 126
    :goto_f
    new-instance v15, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda1;

    invoke-direct {v15, v1}, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda1;-><init>(Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    .line 151
    new-instance v2, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda2;

    invoke-direct {v2, v1}, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda2;-><init>(Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    .line 187
    new-instance v13, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;

    invoke-direct {v13, v1}, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;-><init>(Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    check-cast v13, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    .line 215
    new-instance v16, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-object/from16 v22, v5

    .line 216
    const-string v5, "name"

    if-eqz v10, :cond_14

    invoke-virtual {v10, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    goto :goto_10

    :cond_14
    const/16 v17, 0x0

    :goto_10
    invoke-static/range {v17 .. v17}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v17

    move-object/from16 v23, v8

    .line 217
    const-string v8, "phone"

    if-eqz v10, :cond_15

    invoke-virtual {v10, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    goto :goto_11

    :cond_15
    const/16 v18, 0x0

    :goto_11
    invoke-static/range {v18 .. v18}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v18

    move-object/from16 v24, v11

    .line 218
    const-string v11, "email"

    if-eqz v10, :cond_16

    invoke-virtual {v10, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    goto :goto_12

    :cond_16
    const/16 v19, 0x0

    :goto_12
    invoke-static/range {v19 .. v19}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v19

    move-object/from16 v25, v13

    .line 219
    const-string v13, "address"

    if-eqz v10, :cond_17

    invoke-virtual {v10, v13}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    goto :goto_13

    :cond_17
    const/16 v20, 0x0

    :goto_13
    invoke-static/range {v20 .. v20}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToAddressCollectionMode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v20

    move-object/from16 v26, v2

    const/4 v2, 0x0

    move-object/from16 v27, v15

    if-eqz v10, :cond_18

    .line 221
    const-string v15, "attachDefaultsToPaymentMethod"

    invoke-virtual {v10, v15, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    move/from16 v21, v10

    goto :goto_14

    :cond_18
    move/from16 v21, v2

    .line 215
    :goto_14
    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;Z)V

    move-object/from16 v10, v16

    if-eqz v9, :cond_1f

    .line 226
    invoke-virtual {v9, v13}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v13

    .line 228
    new-instance v28, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    if-eqz v13, :cond_19

    .line 229
    const-string v15, "city"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v29, v15

    goto :goto_15

    :cond_19
    const/16 v29, 0x0

    :goto_15
    if-eqz v13, :cond_1a

    .line 230
    const-string v15, "country"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v30, v15

    goto :goto_16

    :cond_1a
    const/16 v30, 0x0

    :goto_16
    if-eqz v13, :cond_1b

    .line 231
    const-string v15, "line1"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v31, v15

    goto :goto_17

    :cond_1b
    const/16 v31, 0x0

    :goto_17
    if-eqz v13, :cond_1c

    .line 232
    const-string v15, "line2"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v32, v15

    goto :goto_18

    :cond_1c
    const/16 v32, 0x0

    :goto_18
    if-eqz v13, :cond_1d

    .line 233
    const-string v15, "postalCode"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v33, v15

    goto :goto_19

    :cond_1d
    const/16 v33, 0x0

    :goto_19
    if-eqz v13, :cond_1e

    .line 234
    const-string v15, "state"

    invoke-virtual {v13, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v34, v13

    goto :goto_1a

    :cond_1e
    const/16 v34, 0x0

    .line 228
    :goto_1a
    invoke-direct/range {v28 .. v34}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v13, v28

    .line 237
    new-instance v15, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 239
    invoke-virtual {v9, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 240
    invoke-virtual {v9, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 241
    invoke-virtual {v9, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 237
    invoke-direct {v15, v13, v11, v5, v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1b

    :cond_1f
    const/4 v15, 0x0

    .line 246
    :goto_1b
    new-instance v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    invoke-direct {v5, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;-><init>(Ljava/lang/String;)V

    if-eqz v23, :cond_20

    .line 247
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_20
    invoke-virtual {v5, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->allowsDelayedPaymentMethods(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 248
    invoke-virtual {v0, v15}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->defaultBillingDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 249
    invoke-virtual {v0, v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->customer(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 250
    invoke-virtual {v0, v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->googlePay(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 251
    invoke-virtual {v0, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->appearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 252
    invoke-virtual {v0, v14}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->shippingDetails(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 253
    invoke-virtual {v0, v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->billingDetailsCollectionConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 255
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_21

    const-string v3, "preferredNetworks"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_1c

    :cond_21
    const/4 v2, 0x0

    :goto_1c
    invoke-static {v2}, Lcom/reactnativestripesdk/utils/MappersKt;->mapToPreferredNetworks(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    .line 254
    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->preferredNetworks(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 256
    invoke-virtual {v0, v12}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->allowsRemovalOfLastSavedPaymentMethod(Z)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 257
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToCardBrandAcceptance(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->cardBrandAcceptance(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    .line 258
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2}, Lcom/reactnativestripesdk/utils/MappersKt;->parseCustomPaymentMethods(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->customPaymentMethods(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    move-result-object v0

    if-eqz v4, :cond_22

    .line 260
    invoke-virtual {v0, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->primaryButtonLabel(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    :cond_22
    if-eqz v24, :cond_23

    .line 261
    move-object/from16 v11, v24

    check-cast v11, Ljava/util/List;

    invoke-virtual {v0, v11}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->paymentMethodOrder(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    .line 264
    :cond_23
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_24

    const-string v3, "paymentMethodLayout"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1d

    :cond_24
    const/4 v2, 0x0

    :goto_1d
    invoke-static {v2}, Lcom/reactnativestripesdk/PaymentSheetFragmentKt;->mapToPaymentMethodLayout(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;

    move-result-object v2

    .line 263
    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->paymentMethodLayout(Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;

    .line 267
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;->build()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v0

    iput-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    .line 269
    invoke-virtual {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_26

    const-string v2, "customFlow"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_26

    .line 271
    iget-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    if-eqz v0, :cond_25

    .line 273
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    move-object/from16 v3, v26

    move-object/from16 v2, v27

    invoke-direct {v0, v3, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V

    move-object/from16 v13, v25

    .line 276
    invoke-virtual {v0, v13}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    move-result-object v0

    .line 277
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    move-result-object v0

    .line 278
    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object v0

    goto :goto_1e

    :cond_25
    move-object/from16 v3, v26

    move-object/from16 v2, v27

    .line 281
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    invoke-direct {v0, v3, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V

    .line 284
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;

    move-result-object v0

    .line 285
    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;->build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    move-result-object v0

    .line 270
    :goto_1e
    iput-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    .line 287
    invoke-direct {v1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->configureFlowController()V

    return-void

    :cond_26
    move-object/from16 v13, v25

    move-object/from16 v3, v26

    .line 290
    iget-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    if-eqz v0, :cond_27

    .line 292
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    invoke-direct {v0, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    .line 293
    invoke-virtual {v0, v13}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    move-result-object v0

    .line 294
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    move-result-object v0

    .line 295
    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet;

    move-result-object v0

    goto :goto_1f

    .line 298
    :cond_27
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    invoke-direct {v0, v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    .line 299
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;

    move-result-object v0

    .line 300
    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;->build(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/paymentsheet/PaymentSheet;

    move-result-object v0

    .line 289
    :goto_1f
    iput-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    .line 302
    iget-object v0, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_28

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_20

    :cond_28
    move-object v2, v0

    :goto_20
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    move-object/from16 v22, v5

    .line 117
    iget-object v2, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v2, :cond_29

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_29
    sget-object v3, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v3}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v3, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    move-object/from16 v22, v5

    .line 109
    iget-object v2, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v2, :cond_2a

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_2a
    sget-object v3, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v3}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v3, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    :catch_2
    move-exception v0

    move-object/from16 v22, v5

    .line 102
    iget-object v2, v1, Lcom/reactnativestripesdk/PaymentSheetFragment;->initPromise:Lcom/facebook/react/bridge/Promise;

    if-nez v2, :cond_2b

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_2b
    sget-object v3, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v3}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v3, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public final present(Lcom/facebook/react/bridge/Promise;)V
    .locals 4

    const-string v0, "promise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    new-instance v0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "context"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->start()V

    iput-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->keepJsAwake:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    .line 308
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->presentPromise:Lcom/facebook/react/bridge/Promise;

    .line 309
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    if-eqz v0, :cond_8

    .line 310
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentIntentClientSecret:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    const-string v0, "paymentSheetConfiguration"

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 311
    :cond_1
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    if-eqz p1, :cond_9

    .line 312
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentIntentClientSecret:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 313
    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v3, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, v3

    .line 311
    :goto_0
    invoke-virtual {p1, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithPaymentIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void

    .line 315
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->setupIntentClientSecret:Ljava/lang/String;

    check-cast p1, Ljava/lang/CharSequence;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    .line 316
    :cond_4
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    if-eqz p1, :cond_9

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->setupIntentClientSecret:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v3, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v2, v3

    :goto_2
    invoke-virtual {p1, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithSetupIntent(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void

    .line 317
    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->intentConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    if-eqz p1, :cond_9

    .line 318
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheet:Lcom/stripe/android/paymentsheet/PaymentSheet;

    if-eqz v1, :cond_9

    .line 319
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 320
    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-nez v3, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move-object v2, v3

    .line 318
    :goto_4
    invoke-virtual {v1, p1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet;->presentWithIntentConfiguration(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    return-void

    .line 323
    :cond_8
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->flowController:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;

    if-eqz v0, :cond_a

    if-eqz v0, :cond_9

    .line 324
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;->presentPaymentOptions()V

    :cond_9
    return-void

    .line 326
    :cond_a
    sget-object v0, Lcom/reactnativestripesdk/PaymentSheetFragment;->Companion:Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public final presentWithTimeout(JLcom/facebook/react/bridge/Promise;)V
    .locals 4

    const-string v0, "promise"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 337
    new-instance v1, Lcom/reactnativestripesdk/PaymentSheetFragment$presentWithTimeout$activityLifecycleCallbacks$1;

    invoke-direct {v1, v0, p0}, Lcom/reactnativestripesdk/PaymentSheetFragment$presentWithTimeout$activityLifecycleCallbacks$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    .line 365
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 366
    new-instance v3, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda0;

    invoke-direct {v3, v0, p0}, Lcom/reactnativestripesdk/PaymentSheetFragment$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/reactnativestripesdk/PaymentSheetFragment;)V

    invoke-virtual {v2, v3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 376
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p1, :cond_0

    const-string p1, "context"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 377
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 378
    check-cast v1, Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 380
    :cond_1
    invoke-virtual {p0, p3}, Lcom/reactnativestripesdk/PaymentSheetFragment;->present(Lcom/facebook/react/bridge/Promise;)V

    return-void
.end method

.method public final setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
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

    .line 75
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment;->paymentSheetIntentCreationCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method
