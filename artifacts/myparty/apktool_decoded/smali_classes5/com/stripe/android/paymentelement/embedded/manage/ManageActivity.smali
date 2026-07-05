.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "ManageActivity.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n75#2,13:172\n77#3:185\n1225#4,3:186\n1228#4,3:190\n1225#4,6:193\n149#5:189\n81#6:199\n107#6,2:200\n1#7:202\n*S KotlinDebug\n*F\n+ 1 ManageActivity.kt\ncom/stripe/android/paymentelement/embedded/manage/ManageActivity\n*L\n44#1:172,13\n114#1:185\n115#1:186,3\n115#1:190,3\n147#1:193,6\n115#1:189\n115#1:199\n115#1:200,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001d\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(H\u0003\u00a2\u0006\u0002\u0010)J\u0008\u0010*\u001a\u00020\"H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006.\u00b2\u0006\n\u0010\'\u001a\u00020(X\u008a\u0084\u0002\u00b2\u0006\n\u0010/\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u000201X\u008a\u008e\u0002\u00b2\u0006\u000c\u00102\u001a\u0004\u0018\u000103X\u008a\u0084\u0002\u00b2\u0006\u000c\u00104\u001a\u0004\u0018\u000105X\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "args",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;",
        "args$delegate",
        "Lkotlin/Lazy;",
        "viewModel",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;",
        "viewModel$delegate",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "getCustomerStateHolder",
        "()Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "setCustomerStateHolder",
        "(Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V",
        "manageNavigator",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
        "getManageNavigator",
        "()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
        "setManageNavigator",
        "(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "getSelectionHolder",
        "()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "setSelectionHolder",
        "(Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "ScreenContent",
        "navigator",
        "screen",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
        "(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V",
        "finish",
        "setManageResult",
        "shouldInvokeSelectionCallback",
        "",
        "paymentsheet_release",
        "hasResult",
        "contentHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "headerText",
        "Lcom/stripe/android/core/strings/ResolvableString;"
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

.field public customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public manageNavigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$1woncNfXaMDIlVo-o8QhQ2mPbIo(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent$lambda$10(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$F0KQDQAA2bEwzdNLrWdvzAIOzIo(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->args_delegate$lambda$0(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WACnw2k1ynpSGMiVJeiVosqqJsk(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->onCreate$lambda$3(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bb8lPCmLXS1ftqCA4Jwf6UbRjFM(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->viewModel_delegate$lambda$2(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$o4_INxXachNk6jSBEBOUuWoOBls(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tu0eQbud0Z7-KO3NNx_X8Le72gM(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent$lambda$9$lambda$8(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 39
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 40
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->args$delegate:Lkotlin/Lazy;

    .line 44
    move-object v0, p0

    check-cast v0, Landroidx/activity/ComponentActivity;

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    .line 180
    new-instance v2, Landroidx/lifecycle/ViewModelLazy;

    const-class v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 182
    new-instance v4, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$special$$inlined$viewModels$default$2;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 184
    new-instance v5, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$special$$inlined$viewModels$default$3;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 180
    invoke-direct {v2, v3, v4, v1, v5}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    check-cast v2, Lkotlin/Lazy;

    .line 44
    iput-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final ScreenContent(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const v0, -0x1594304d

    .line 113
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    and-int/lit8 p3, p4, 0x6

    const/4 v1, 0x2

    if-nez p3, :cond_1

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p3, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr p3, v2

    :cond_5
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    .line 152
    :cond_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_5

    .line 113
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentelement.embedded.manage.ManageActivity.ScreenContent (ManageActivity.kt:112)"

    invoke-static {v0, p3, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 114
    :cond_8
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p3

    check-cast p3, Landroidx/compose/runtime/CompositionLocal;

    const v0, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 185
    invoke-static {v5, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, p3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 114
    check-cast p3, Landroidx/compose/ui/unit/Density;

    const v0, -0x39ffe322

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 186
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 187
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_9

    int-to-float v0, v3

    .line 189
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object v0

    const/4 v2, 0x0

    .line 115
    invoke-static {v0, v2, v1, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    .line 190
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 115
    :cond_9
    check-cast v0, Landroidx/compose/runtime/MutableState;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v1, 0x1

    .line 116
    invoke-static {v3, v5, v3, v1}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v4

    .line 118
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;

    invoke-direct {v2, p2, p1, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$1;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    const v3, -0x69f2616e

    const/16 v6, 0x36

    invoke-static {v3, v1, v2, v5, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 129
    new-instance v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$2;

    invoke-direct {v3, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$ScreenContent$2;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;)V

    const v7, 0x6941e3b1

    invoke-static {v7, v1, v3, v5, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 147
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const v6, -0x39ff412c

    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v5, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 193
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    .line 194
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_b

    .line 147
    :cond_a
    new-instance v7, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda0;

    invoke-direct {v7, p3, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)V

    .line 196
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 147
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v6, 0x36

    const/4 v7, 0x0

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    .line 117
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/common/ui/BottomSheetScaffoldKt;->BottomSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 152
    :cond_c
    :goto_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p3

    if-eqz p3, :cond_d

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;I)V

    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method private static final ScreenContent$lambda$10(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-direct {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final ScreenContent$lambda$5(Landroidx/compose/runtime/MutableState;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;)F"
        }
    .end annotation

    .line 115
    check-cast p0, Landroidx/compose/runtime/State;

    .line 199
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {p0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result p0

    return p0
.end method

.method private static final ScreenContent$lambda$6(Landroidx/compose/runtime/MutableState;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;F)V"
        }
    .end annotation

    .line 115
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object p1

    .line 200
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final ScreenContent$lambda$9$lambda$8(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-interface {p2}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    move-result p2

    invoke-interface {p0, p2}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent$lambda$6(Landroidx/compose/runtime/MutableState;F)V

    .line 149
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$ScreenContent(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->ScreenContent(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$setManageResult(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->setManageResult(Z)V

    return-void
.end method

.method private static final args_delegate$lambda$0(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;
    .locals 2

    .line 41
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    const-string v1, "getIntent(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    move-result-object p0

    return-object p0
.end method

.method private final getArgs()Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    return-object v0
.end method

.method private static final onCreate$lambda$3(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getManageNavigator()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->getScreen()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;->isPerformingNetworkOperation()Z

    move-result p1

    if-nez p1, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getManageNavigator()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action$Back;

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;->performAction(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Action;)V

    .line 76
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final setManageResult(Z)V
    .locals 3

    .line 160
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;

    .line 161
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getCustomerStateHolder()Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 162
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getSelectionHolder()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 160
    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;-><init>(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V

    .line 167
    sget-object p1, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "getIntent(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;

    invoke-virtual {p1, v1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;->toIntent(Landroid/content/Intent;Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    .line 165
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->setResult(ILandroid/content/Intent;)V

    return-void

    .line 161
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final viewModel_delegate$lambda$2(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 45
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel$Factory;

    new-instance v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroidx/lifecycle/ViewModelProvider$Factory;

    return-object v0
.end method

.method private static final viewModel_delegate$lambda$2$lambda$1(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getArgs()Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

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

    .line 155
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->finish()V

    .line 156
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/AnimationConstantsKt;->fadeOut(Landroid/app/Activity;)V

    return-void
.end method

.method public final getCustomerStateHolder()Lcom/stripe/android/paymentsheet/CustomerStateHolder;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "customerStateHolder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getManageNavigator()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->manageNavigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "manageNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectionHolder()Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "selectionHolder"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 61
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getArgs()Lcom/stripe/android/paymentelement/embedded/manage/ManageContract$Args;

    move-result-object p1

    if-nez p1, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    return-void

    .line 68
    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/utils/EdgeToEdgeKt;->renderEdgeToEdge(Landroid/app/Activity;)V

    .line 70
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getViewModel()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;->getComponent()Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;->inject(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    .line 72
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    new-instance v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda2;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 78
    move-object p1, p0

    check-cast p1, Landroidx/activity/ComponentActivity;

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;)V

    const v1, 0x223337bc

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method public final setCustomerStateHolder(Lcom/stripe/android/paymentsheet/CustomerStateHolder;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    return-void
.end method

.method public final setManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->manageNavigator:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    return-void
.end method

.method public final setSelectionHolder(Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    return-void
.end method
