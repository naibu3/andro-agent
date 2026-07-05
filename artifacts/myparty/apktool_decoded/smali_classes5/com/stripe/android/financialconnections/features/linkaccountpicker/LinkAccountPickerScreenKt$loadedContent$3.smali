.class final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;
.super Ljava/lang/Object;
.source "LinkAccountPickerScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt;->loadedContent(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,356:1\n1225#2,6:357\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3\n*L\n224#1:357,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onNewBankAccountClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

.field final synthetic $selectNetworkedAccountAsync:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$XEuhvdz-lfSs30kJgiX3IfxQ3eM(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->invoke$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$payload:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$selectNetworkedAccountAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$onNewBankAccountClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 225
    instance-of p0, p0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    if-nez p0, :cond_0

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 226
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 221
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 222
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 227
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 222
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.linkaccountpicker.loadedContent.<anonymous> (LinkAccountPickerScreen.kt:221)"

    const v1, -0x7e2f8df1

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 223
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$payload:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;

    move-result-object p1

    const p3, 0x2417c208

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$selectNetworkedAccountAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$onNewBankAccountClick:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    .line 224
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$selectNetworkedAccountAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3;->$onNewBankAccountClick:Lkotlin/jvm/functions/Function0;

    .line 357
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_3

    .line 358
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v2, p3, :cond_4

    .line 224
    :cond_3
    new-instance v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$3$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;)V

    .line 360
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 224
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p3, 0x0

    .line 222
    invoke-static {v2, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt;->access$SelectNewAccount(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/model/AddNewAccount;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
