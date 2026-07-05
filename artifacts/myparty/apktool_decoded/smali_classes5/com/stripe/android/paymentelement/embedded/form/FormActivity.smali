.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "FormActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFormActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,109:1\n75#2,13:110\n*S KotlinDebug\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity\n*L\n25#1:110,13\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0008\u0010+\u001a\u00020(H\u0002J\u0008\u0010,\u001a\u00020(H\u0002J\u0008\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u00061\u00b2\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "args",
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "args$delegate",
        "Lkotlin/Lazy;",
        "viewModel",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;",
        "viewModel$delegate",
        "formInteractor",
        "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
        "getFormInteractor",
        "()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
        "setFormInteractor",
        "(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "getEventReporter",
        "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "setEventReporter",
        "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V",
        "formActivityStateHelper",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
        "getFormActivityStateHelper",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
        "setFormActivityStateHelper",
        "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;)V",
        "confirmationHelper",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
        "getConfirmationHelper",
        "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
        "setConfirmationHelper",
        "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;)V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setCompletedResultAndDismiss",
        "setCancelAndFinish",
        "finish",
        "setFormResult",
        "result",
        "Lcom/stripe/android/paymentelement/embedded/form/FormResult;",
        "paymentsheet_release",
        "state",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;"
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
.field private final args$delegate:Lkotlin/Lazy;

.field public confirmationHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public formInteractor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$4WII4scMotGoF-Yi9vNY2cIUQmQ(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->args_delegate$lambda$0(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kqACTHa1oIUC30_ZFiFRHKMlfqg(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$r5wd2d8MOBvok9MQC3vZArRL_C4(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 20
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 21
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->args$delegate:Lkotlin/Lazy;

    .line 25
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    .line 118
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 120
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 122
    new-instance v5, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 118
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 25
    iput-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$setCancelAndFinish(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setCancelAndFinish()V

    return-void
.end method

.method public static final synthetic access$setCompletedResultAndDismiss(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setCompletedResultAndDismiss()V

    return-void
.end method

.method public static final synthetic access$setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    return-void
.end method

.method private static final args_delegate$lambda$0(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    .locals 2

    .line 22
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;->Companion:Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private final getArgs()Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;

    return-object v0
.end method

.method private final setCancelAndFinish()V
    .locals 1

    .line 93
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Cancelled;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/form/FormResult$Cancelled;

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    .line 94
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-void
.end method

.method private final setCompletedResultAndDismiss()V
    .locals 3

    .line 88
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    .line 89
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-void
.end method

.method private final setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V
    .locals 3

    .line 105
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult;->Companion:Lcom/stripe/android/paymentelement/embedded/form/FormResult$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "getIntent(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Companion;->toIntent(Landroid/content/Intent;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 103
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 26
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method private static final viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getArgs()Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public finish()V
    .locals 1

    .line 98
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->finish()V

    .line 99
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getConfirmationHelper()Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->confirmationHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "confirmationHelper"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "eventReporter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFormActivityStateHelper()Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "formActivityStateHelper"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFormInteractor()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formInteractor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "formInteractor"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 45
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getArgs()Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->setCancelAndFinish()V

    return-void

    .line 52
    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/utils/EdgeToEdgeKt;->renderEdgeToEdge(Landroid/app/Activity;)V

    .line 54
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getViewModel()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;->getComponent()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelComponent;->getSubcomponentFactory()Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;

    move-result-object p1

    .line 55
    move-object v0, p0

    check-cast v0, Landroidx/activity/result/ActivityResultCaller;

    .line 56
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 54
    invoke-interface {p1, v0, v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;->build(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent;

    move-result-object p1

    .line 57
    invoke-interface {p1, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent;->inject(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    .line 59
    move-object p1, p0

    check-cast p1, Landroidx/activity/ComponentActivity;

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    const v1, 0x7ff6a7f

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final setConfirmationHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->confirmationHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;

    return-void
.end method

.method public final setEventReporter(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-void
.end method

.method public final setFormActivityStateHelper(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    return-void
.end method

.method public final setFormInteractor(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->formInteractor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    return-void
.end method
