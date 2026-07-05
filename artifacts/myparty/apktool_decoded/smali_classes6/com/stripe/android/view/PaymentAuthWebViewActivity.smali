.class public final Lcom/stripe/android/view/PaymentAuthWebViewActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "PaymentAuthWebViewActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentAuthWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,207:1\n75#2,13:208\n*S KotlinDebug\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity\n*L\n41#1:208,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0017\u0010\u001d\u001a\u00020\u001a2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0001\u00a2\u0006\u0002\u0008 J\u0008\u0010!\u001a\u00020\u001aH\u0014J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J\u0008\u0010)\u001a\u00020\u001aH\u0002J\u0008\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\t\u001a\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\t\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentAuthWebViewActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;",
        "viewBinding$delegate",
        "Lkotlin/Lazy;",
        "_args",
        "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "get_args",
        "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;",
        "_args$delegate",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "logger$delegate",
        "viewModel",
        "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;",
        "viewModel$delegate",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onAuthComplete",
        "error",
        "",
        "onAuthComplete$payments_core_release",
        "onDestroy",
        "onCreateOptionsMenu",
        "",
        "menu",
        "Landroid/view/Menu;",
        "onOptionsItemSelected",
        "item",
        "Landroid/view/MenuItem;",
        "cancelIntentSource",
        "customizeToolbar",
        "createResultIntent",
        "Landroid/content/Intent;",
        "paymentFlowResult",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final _args$delegate:Lkotlin/Lazy;

.field private final logger$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$EVhrQKf6yn83F_KIshnilEfBPYE(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewModel_delegate$lambda$3(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$KpLdTc0wM_o1rP76IknAY1fXg18(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/core/Logger;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->logger_delegate$lambda$2(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/core/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Qc4F3TdQAIt1BzAnnKAMjYUpT2E(Lcom/stripe/android/view/PaymentAuthWebViewActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->onCreate$lambda$4(Lcom/stripe/android/view/PaymentAuthWebViewActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UNRWkoP57L-GHRzDdblIFdOeszU(Lcom/stripe/android/view/PaymentAuthWebViewClient;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->onCreate$lambda$5(Lcom/stripe/android/view/PaymentAuthWebViewClient;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$etgCZzcSfv_VefEaZZX7Ic9di0A(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->_args_delegate$lambda$1(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$sb4dxEhqAZAwp7sQsXwYea6taZ0(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewBinding_delegate$lambda$0(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 28
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 30
    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewBinding$delegate:Lkotlin/Lazy;

    .line 34
    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->_args$delegate:Lkotlin/Lazy;

    .line 38
    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->logger$delegate:Lkotlin/Lazy;

    .line 41
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    .line 216
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 218
    new-instance v4, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 220
    new-instance v5, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 216
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 41
    iput-object v2, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final _args_delegate$lambda$1(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 2

    .line 35
    sget-object v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract;->Companion:Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;->parseArgs$payments_core_release(Landroid/content/Intent;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewBinding(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method private final cancelIntentSource()V
    .locals 2

    .line 179
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getCancellationResult$payments_core_release()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setResult(ILandroid/content/Intent;)V

    .line 180
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->finish()V

    return-void
.end method

.method private final createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;
    .locals 1

    .line 205
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "putExtras(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final customizeToolbar()V
    .locals 5

    .line 184
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#customizeToolbar()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 186
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getToolbarTitle$payments_core_release()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 187
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 188
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    sget-object v2, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    .line 189
    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    .line 190
    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;->getText$payments_core_release()Ljava/lang/String;

    move-result-object v4

    .line 191
    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;->getToolbarCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/ui/Customization;

    .line 188
    invoke-virtual {v2, v3, v4, v0}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->buildStyledText(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 195
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getToolbarBackgroundColor$payments_core_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 196
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 197
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    .line 198
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackgroundColor(I)V

    .line 199
    sget-object v1, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    move-object v2, p0

    check-cast v2, Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v1, v2, v0}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->setStatusBarColor(Landroidx/appcompat/app/AppCompatActivity;I)V

    :cond_1
    return-void
.end method

.method private final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->logger$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method private final getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    return-object v0
.end method

.method private final get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->_args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    return-object v0
.end method

.method private static final logger_delegate$lambda$2(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/core/Logger;
    .locals 3

    .line 39
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getEnableLogging()Z

    move-result p0

    const/4 v2, 0x1

    if-ne p0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreate$lambda$4(Lcom/stripe/android/view/PaymentAuthWebViewActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentAuthWebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 72
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebView;->goBack()V

    goto :goto_0

    .line 74
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->cancelIntentSource()V

    .line 76
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCreate$lambda$5(Lcom/stripe/android/view/PaymentAuthWebViewClient;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    .line 111
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentAuthWebViewClient;->setHasLoadedBlank$payments_core_release(Z)V

    .line 112
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final viewBinding_delegate$lambda$0(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;
    .locals 1

    .line 31
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object p0

    const-string v0, "inflate(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final viewModel_delegate$lambda$3(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 42
    new-instance v0, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;

    .line 43
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApplication(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v2

    .line 45
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 42
    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;-><init>(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0

    .line 45
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V
    .locals 11

    if-eqz p1, :cond_0

    .line 128
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v4

    .line 130
    sget-object v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 131
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 129
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 133
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logError()V

    .line 137
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v1

    .line 139
    sget-object v0, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/16 v9, 0x71

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 138
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->copy$default(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object p1

    .line 136
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 134
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    .line 146
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logComplete()V

    .line 148
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v0, p0

    .line 50
    invoke-super/range {p0 .. p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->get_args()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    move-result-object v1

    const/4 v2, 0x2

    .line 53
    const-string v3, "getApplicationContext(...)"

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v1, :cond_0

    .line 54
    invoke-virtual {v0, v4}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setResult(I)V

    .line 55
    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->finish()V

    .line 56
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, v5, v2, v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v6

    .line 58
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->AUTH_WEB_VIEW_NULL_ARGS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 57
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 63
    :cond_0
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v6

    const-string v7, "PaymentAuthWebViewActivity#onCreate()"

    invoke-interface {v6, v7}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 65
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->getRoot()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v0, v6}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setContentView(Landroid/view/View;)V

    .line 67
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v6

    iget-object v6, v6, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, v6}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 68
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->customizeToolbar()V

    .line 70
    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v7

    new-instance v10, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda4;

    invoke-direct {v10, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 78
    invoke-virtual {v1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v16

    .line 79
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getPaymentResult$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->createResultIntent(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;

    move-result-object v6

    const/4 v7, -0x1

    invoke-virtual {v0, v7, v6}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->setResult(ILandroid/content/Intent;)V

    .line 81
    move-object/from16 v6, v16

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 82
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v4, "PaymentAuthWebViewActivity#onCreate() - clientSecret is blank"

    invoke-interface {v1, v4}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->finish()V

    .line 84
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter;->Companion:Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, v5, v2, v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;->createFallbackInstance$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter$Companion;Landroid/content/Context;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v6

    .line 86
    sget-object v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->AUTH_WEB_VIEW_BLANK_CLIENT_SECRET:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 85
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 91
    :cond_1
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v2

    const-string v3, "PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl"

    invoke-interface {v2, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 93
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v15

    .line 94
    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2;

    invoke-direct {v2, v15, v0, v5}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/stripe/android/view/PaymentAuthWebViewActivity;Lkotlin/coroutines/Continuation;)V

    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 102
    new-instance v13, Lcom/stripe/android/view/PaymentAuthWebViewClient;

    .line 103
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v14

    .line 106
    invoke-virtual {v1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getReturnUrl()Ljava/lang/String;

    move-result-object v17

    .line 107
    new-instance v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$1;

    invoke-direct {v2, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$1;-><init>(Ljava/lang/Object;)V

    move-object/from16 v18, v2

    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 108
    new-instance v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$2;

    invoke-direct {v2, v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$webViewClient$2;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 102
    invoke-direct/range {v13 .. v19}, Lcom/stripe/android/view/PaymentAuthWebViewClient;-><init>(Lcom/stripe/android/core/Logger;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 110
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v3, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda5;

    invoke-direct {v3, v13}, Lcom/stripe/android/view/PaymentAuthWebViewActivity$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewClient;)V

    invoke-virtual {v2, v3}, Lcom/stripe/android/view/PaymentAuthWebView;->setOnLoadBlank$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    .line 113
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    check-cast v13, Landroid/webkit/WebViewClient;

    invoke-virtual {v2, v13}, Lcom/stripe/android/view/PaymentAuthWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 114
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v3, Lcom/stripe/android/view/PaymentAuthWebChromeClient;

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/view/PaymentAuthWebChromeClient;-><init>(Landroid/app/Activity;Lcom/stripe/android/core/Logger;)V

    check-cast v3, Landroid/webkit/WebChromeClient;

    invoke-virtual {v2, v3}, Lcom/stripe/android/view/PaymentAuthWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 116
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->logStart()V

    .line 117
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    .line 118
    invoke-virtual {v1}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-direct {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getExtraHeaders()Ljava/util/Map;

    move-result-object v3

    .line 117
    invoke-virtual {v2, v1, v3}, Lcom/stripe/android/view/PaymentAuthWebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onCreateOptionsMenu()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 159
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$menu;->stripe_payment_auth_web_view_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 161
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewModel()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;->getButtonText$payments_core_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 162
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating close button text"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 163
    sget v1, Lcom/stripe/android/R$id;->action_close:I

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 166
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onDestroy()V
    .locals 1

    .line 152
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webViewContainer:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 153
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getViewBinding()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;->webView:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebView;->destroy()V

    .line 154
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->getLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onOptionsItemSelected()"

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 171
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/stripe/android/R$id;->action_close:I

    if-ne v0, v1, :cond_0

    .line 172
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->cancelIntentSource()V

    const/4 p1, 0x1

    return p1

    .line 175
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
