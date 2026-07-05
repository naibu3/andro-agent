.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;
.super Ljava/lang/Object;
.source "DefaultPaymentNextActionHandlerRegistry.kt"

# interfaces
.implements Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultPaymentNextActionHandlerRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPaymentNextActionHandlerRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1863#2,2:176\n1863#2,2:178\n*S KotlinDebug\n*F\n+ 1 DefaultPaymentNextActionHandlerRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry\n*L\n97#1:176,2\n111#1:178,2\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 82\u00020\u0001:\u00018B\\\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012/\u0008\u0001\u0010\u0006\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008j\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000c0\u000bj\u0002`\u000e\u00a2\u0006\u0002\u0008\r0\u0007\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010,\u001a\u0008\u0012\u0004\u0012\u0002H-0\u000b\"\u0004\u0008\u0000\u0010-2\u0006\u0010.\u001a\u0002H-H\u0016\u00a2\u0006\u0002\u0010/J\u001e\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020605H\u0016J\u0008\u00107\u001a\u000201H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\u0006\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008j\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000c0\u000bj\u0002`\u000e\u00a2\u0006\u0002\u0008\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0015\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008j\u0002`\n\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000c0\u000bj\u0002`\u000e\u00a2\u0006\u0002\u0008\r0\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u0017R(\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001c0\u000b0\u001b8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010%\"\u0004\u0008+\u0010\'\u00a8\u00069"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;",
        "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;",
        "noOpIntentNextActionHandler",
        "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
        "sourceNextActionHandler",
        "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
        "paymentNextActionHandlers",
        "",
        "Ljava/lang/Class;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;",
        "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;",
        "Lcom/stripe/android/model/StripeIntent;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "Lcom/stripe/android/payments/core/authentication/NextActionHandler;",
        "includePaymentSheetNextActionHandlers",
        "",
        "applicationContext",
        "Landroid/content/Context;",
        "<init>",
        "(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)V",
        "paymentSheetNextActionHandlers",
        "getPaymentSheetNextActionHandlers",
        "()Ljava/util/Map;",
        "paymentSheetNextActionHandlers$delegate",
        "Lkotlin/Lazy;",
        "allNextActionHandlers",
        "",
        "Lcom/stripe/android/core/model/StripeModel;",
        "getAllNextActionHandlers$payments_core_release$annotations",
        "()V",
        "getAllNextActionHandlers$payments_core_release",
        "()Ljava/util/Set;",
        "paymentRelayLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/PaymentRelayStarter$Args;",
        "getPaymentRelayLauncher$payments_core_release",
        "()Landroidx/activity/result/ActivityResultLauncher;",
        "setPaymentRelayLauncher$payments_core_release",
        "(Landroidx/activity/result/ActivityResultLauncher;)V",
        "paymentBrowserAuthLauncher",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "getPaymentBrowserAuthLauncher$payments_core_release",
        "setPaymentBrowserAuthLauncher$payments_core_release",
        "getNextActionHandler",
        "Actionable",
        "actionable",
        "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;",
        "onNewActivityResultCaller",
        "",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "activityResultCallback",
        "Landroidx/activity/result/ActivityResultCallback;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "onLauncherInvalidated",
        "Companion",
        "payments-core_release"
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

.field public static final Companion:Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;


# instance fields
.field private final includePaymentSheetNextActionHandlers:Z

.field private final noOpIntentNextActionHandler:Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

.field private paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentNextActionHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation
.end field

.field private paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentSheetNextActionHandlers$delegate:Lkotlin/Lazy;

.field private final sourceNextActionHandler:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;


# direct methods
.method public static synthetic $r8$lambda$2apY6qhKACplmL8xLWHgfI0pCCM(Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;Landroid/content/Context;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentSheetNextActionHandlers_delegate$lambda$0(Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;Landroid/content/Context;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->Companion:Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Ljava/util/Map;ZLandroid/content/Context;)V
    .locals 1
    .param p3    # Ljava/util/Map;
        .annotation runtime Lcom/stripe/android/payments/core/injection/IntentAuthenticatorMap;
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Ljavax/inject/Named;
            value = "INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;Z",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "noOpIntentNextActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceNextActionHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentNextActionHandlers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->noOpIntentNextActionHandler:Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->sourceNextActionHandler:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentNextActionHandlers:Ljava/util/Map;

    .line 38
    iput-boolean p4, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->includePaymentSheetNextActionHandlers:Z

    .line 42
    new-instance p1, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0, p5}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;Landroid/content/Context;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentSheetNextActionHandlers$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic getAllNextActionHandlers$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getPaymentSheetNextActionHandlers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentSheetNextActionHandlers$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final paymentSheetNextActionHandlers_delegate$lambda$0(Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;Landroid/content/Context;)Ljava/util/Map;
    .locals 0

    .line 43
    iget-boolean p0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->includePaymentSheetNextActionHandlers:Z

    invoke-static {p0, p1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistryKt;->access$paymentSheetNextActionHandlers(ZLandroid/content/Context;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getAllNextActionHandlers$payments_core_release()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "+",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">;>;"
        }
    .end annotation

    .line 48
    invoke-static {}, Lkotlin/collections/SetsKt;->createSetBuilder()Ljava/util/Set;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->noOpIntentNextActionHandler:Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->sourceNextActionHandler:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentNextActionHandlers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 52
    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->getPaymentSheetNextActionHandlers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 48
    invoke-static {v0}, Lkotlin/collections/SetsKt;->build(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getNextActionHandler(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Actionable:",
            "Ljava/lang/Object;",
            ">(TActionable;)",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler<",
            "TActionable;>;"
        }
    .end annotation

    .line 72
    instance-of v0, p1, Lcom/stripe/android/model/StripeIntent;

    const-string v1, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>"

    if-eqz v0, :cond_3

    .line 73
    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->noOpIntentNextActionHandler:Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    return-object p1

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentNextActionHandlers:Ljava/util/Map;

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->getPaymentSheetNextActionHandlers()Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 78
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    if-nez p1, :cond_2

    .line 80
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->noOpIntentNextActionHandler:Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    .line 82
    :cond_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 84
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/model/Source;

    if-eqz v0, :cond_4

    .line 85
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->sourceNextActionHandler:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    return-object p1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No suitable PaymentNextActionHandler for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getPaymentBrowserAuthLauncher$payments_core_release()Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

.method public final getPaymentRelayLauncher$payments_core_release()Landroidx/activity/result/ActivityResultLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object v0
.end method

.method public onLauncherInvalidated()V
    .locals 2

    .line 111
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->getAllNextActionHandlers$payments_core_release()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 178
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    .line 112
    invoke-virtual {v1}, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;->onLauncherInvalidated()V

    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    :cond_2
    const/4 v0, 0x0

    .line 116
    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 117
    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public onNewActivityResultCaller(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Landroidx/activity/result/ActivityResultCallback<",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->getAllNextActionHandlers$payments_core_release()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 176
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;

    .line 98
    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;->onNewActivityResultCaller(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultCallback;)V

    goto :goto_0

    .line 101
    :cond_0
    new-instance v0, Lcom/stripe/android/PaymentRelayContract;

    invoke-direct {v0}, Lcom/stripe/android/PaymentRelayContract;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 100
    invoke-interface {p1, v0, p2}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 105
    new-instance v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract;

    invoke-direct {v0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 104
    invoke-interface {p1, v0, p2}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public final setPaymentBrowserAuthLauncher$payments_core_release(Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
            ">;)V"
        }
    .end annotation

    .line 64
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentBrowserAuthLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public final setPaymentRelayLauncher$payments_core_release(Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/PaymentRelayStarter$Args;",
            ">;)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;->paymentRelayLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method
