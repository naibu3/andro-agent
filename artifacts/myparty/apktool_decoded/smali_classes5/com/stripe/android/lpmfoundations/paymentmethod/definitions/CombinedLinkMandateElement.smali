.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;
.super Lcom/stripe/android/ui/core/elements/RenderableFormElement;
.source "CardDefinition.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDefinition.kt\ncom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,331:1\n149#2:332\n149#2:333\n149#2:334\n149#2:335\n81#3:336\n*S KotlinDebug\n*F\n+ 1 CardDefinition.kt\ncom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement\n*L\n306#1:332\n307#1:333\n308#1:334\n309#1:335\n314#1:336\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000bH\u0016J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0017\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0015\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u001b\u001a\u0004\u0018\u00010\u000cX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;",
        "Lcom/stripe/android/ui/core/elements/RenderableFormElement;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "signupMode",
        "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "canChangeSaveForFutureUse",
        "",
        "merchantName",
        "",
        "linkSignupStateFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLjava/lang/String;Lkotlinx/coroutines/flow/StateFlow;)V",
        "getFormFieldValueFlow",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "topPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "ComposeUI",
        "",
        "enabled",
        "(ZLandroidx/compose/runtime/Composer;I)V",
        "paymentsheet_release",
        "linkState"
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
.field private final linkSignupStateFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final merchantName:Ljava/lang/String;

.field private final topPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLjava/lang/String;Lkotlinx/coroutines/flow/StateFlow;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkSignupStateFlow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 299
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/ui/core/elements/RenderableFormElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Z)V

    .line 297
    iput-object p4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->merchantName:Ljava/lang/String;

    .line 298
    iput-object p5, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->linkSignupStateFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 306
    sget-object p1, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->AlongsideSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-ne p2, p1, :cond_0

    int-to-float p1, v0

    .line 332
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    goto :goto_0

    .line 307
    :cond_0
    sget-object p1, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->InsteadOfSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x4

    int-to-float p1, p1

    .line 333
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const/4 p1, 0x6

    int-to-float p1, p1

    .line 334
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    int-to-float p1, p1

    .line 335
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    .line 305
    :goto_0
    iput p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->topPadding:F

    return-void
.end method

.method private static final ComposeUI$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;)",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"
        }
    .end annotation

    .line 336
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    return-object p0
.end method


# virtual methods
.method public ComposeUI(ZLandroidx/compose/runtime/Composer;I)V
    .locals 8

    const p1, -0x5f03c0f5

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.lpmfoundations.paymentmethod.definitions.CombinedLinkMandateElement.ComposeUI (CardDefinition.kt:312)"

    .line 313
    invoke-static {p1, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 314
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->linkSignupStateFlow:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p1

    .line 316
    invoke-static {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->ComposeUI$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$paymentsheet_release()Z

    move-result p1

    if-ne p1, v1, :cond_1

    const p1, 0x5d832091

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 318
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_mandate_signup_toggle_on:I

    .line 319
    iget-object p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->merchantName:Ljava/lang/String;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 317
    invoke-static {p1, p3, p2, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    .line 320
    invoke-static {p1}, Lcom/stripe/android/link/ui/LinkTermsKt;->replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 316
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_0

    :cond_1
    const p1, 0x5d86ce50

    .line 321
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 323
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_mandate_signup_toggle_off:I

    .line 324
    iget-object p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->merchantName:Ljava/lang/String;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 322
    invoke-static {p1, p3, p2, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    .line 325
    invoke-static {p1}, Lcom/stripe/android/link/ui/LinkTermsKt;->replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 321
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_0
    move-object v0, p1

    .line 327
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget v3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CombinedLinkMandateElement;->topPadding:F

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    .line 315
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/MandateTextUIKt;->Mandate-J7GKd-g(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    .line 303
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method
