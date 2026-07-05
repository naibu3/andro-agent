.class final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;
.super Ljava/lang/Object;
.source "NetworkingLinkVerificationScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt;->NetworkingLinkVerificationLoaded(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nNetworkingLinkVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkVerificationScreen.kt\ncom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,166:1\n1225#2,6:167\n*S KotlinDebug\n*F\n+ 1 NetworkingLinkVerificationScreen.kt\ncom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2\n*L\n115#1:167,6\n*E\n"
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
.field final synthetic $confirmVerificationAsync:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

.field final synthetic $shouldRequestFocus$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$5v3rtsSVhtTI6OsBRCQT95Jtt1Y(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;Lcom/stripe/android/financialconnections/presentation/Async;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$confirmVerificationAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$shouldRequestFocus$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 116
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt;->access$NetworkingLinkVerificationLoaded$lambda$10(Landroidx/compose/runtime/MutableState;Z)V

    .line 117
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 109
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 110
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 110
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (NetworkingLinkVerificationScreen.kt:109)"

    const v1, 0x46615f5c

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    :cond_2
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    .line 112
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v3

    .line 113
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$confirmVerificationAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of p3, p1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    xor-int/lit8 v4, p3, 0x1

    .line 114
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/MavericksExtensionsKt;->getError(Lcom/stripe/android/financialconnections/presentation/Async;)Ljava/lang/Throwable;

    move-result-object v5

    .line 115
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p1, Landroidx/compose/ui/Modifier;

    const p3, -0x135aec21

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$shouldRequestFocus$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2;->$shouldRequestFocus$delegate:Landroidx/compose/runtime/MutableState;

    .line 167
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_3

    .line 168
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_4

    .line 115
    :cond_3
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationScreenKt$NetworkingLinkVerificationLoaded$4$1$2$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 170
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 115
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {p1, v1}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget p1, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 v8, p1, 0x6

    const/4 v9, 0x0

    move-object v7, p2

    .line 110
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/financialconnections/features/common/VerificationSectionKt;->VerificationSection(Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/OTPElement;ZLjava/lang/Throwable;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
