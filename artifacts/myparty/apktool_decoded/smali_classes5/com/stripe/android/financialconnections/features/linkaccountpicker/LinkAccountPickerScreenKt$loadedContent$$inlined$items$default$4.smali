.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt;->loadedContent(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 LinkAccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n213#2,4:434\n220#2:444\n1225#3,6:438\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt\n*L\n216#1:438,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;

.field final synthetic $onAccountClick$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $payload$inlined:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

.field final synthetic $selectNetworkedAccountAsync$inlined:Lcom/stripe/android/financialconnections/presentation/Async;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$payload$inlined:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$selectNetworkedAccountAsync$inlined:Lcom/stripe/android/financialconnections/presentation/Async;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$onAccountClick$inlined:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 152
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "C152@7074L22:LazyDsl.kt#428nma"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    if-ne p4, v0, :cond_5

    .line 153
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v1, -0x25b7f321

    invoke-static {v1, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    const p2, 0x5edadad1

    .line 434
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 435
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$payload$inlined:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->getSelectedAccountIds()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object p4

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    const p4, 0x2417a535

    .line 436
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$selectNetworkedAccountAsync$inlined:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$onAccountClick$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    .line 438
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_7

    .line 439
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p4

    if-ne v0, p4, :cond_8

    .line 437
    :cond_7
    new-instance p4, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$2$1$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$selectNetworkedAccountAsync$inlined:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$$inlined$items$default$4;->$onAccountClick$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {p4, v0, v1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt$loadedContent$2$1$1;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function1;)V

    move-object v0, p4

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 441
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 437
    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p4, 0x0

    .line 434
    invoke-static {p1, v0, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerScreenKt;->access$NetworkedAccountItem(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
