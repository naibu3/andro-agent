.class public final Lcom/reactnativestripesdk/EmbeddedPaymentElementView;
.super Lcom/reactnativestripesdk/StripeAbstractComposeView;
.source "EmbeddedPaymentElementView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedPaymentElementView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedPaymentElementView.kt\ncom/reactnativestripesdk/EmbeddedPaymentElementView\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,346:1\n1225#2,6:347\n1225#2,3:358\n1228#2,3:364\n1225#2,6:368\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n1225#2,6:392\n1225#2,6:400\n1225#2,6:406\n481#3:353\n480#3,4:354\n484#3,2:361\n488#3:367\n480#4:363\n77#5:398\n149#6:399\n71#7:412\n68#7,6:413\n74#7:447\n78#7:451\n79#8,6:419\n86#8,4:434\n90#8,2:444\n94#8:450\n368#9,9:425\n377#9:446\n378#9,2:448\n4034#10,6:438\n81#11:452\n1#12:453\n78#13:454\n111#13,2:455\n*S KotlinDebug\n*F\n+ 1 EmbeddedPaymentElementView.kt\ncom/reactnativestripesdk/EmbeddedPaymentElementView\n*L\n73#1:347,6\n74#1:358,3\n74#1:364,3\n77#1:368,6\n157#1:374,6\n235#1:380,6\n240#1:386,6\n277#1:392,6\n294#1:400,6\n308#1:406,6\n74#1:353\n74#1:354,4\n74#1:361,2\n74#1:367\n74#1:363\n288#1:398\n293#1:399\n290#1:412\n290#1:413,6\n290#1:447\n290#1:451\n290#1:419,6\n290#1:434,4\n290#1:444,2\n290#1:450\n290#1:425,9\n290#1:446\n290#1:448,2\n290#1:438,6\n73#1:452\n235#1:454\n235#1:455,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u001e\u001a\u00020\u001fH\u0017\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010\'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\u0008\u0010)\u001a\u00020*H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,\u00b2\u0006\u000c\u0010-\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002\u00b2\u0006\n\u0010\"\u001a\u00020.X\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/reactnativestripesdk/EmbeddedPaymentElementView;",
        "Lcom/reactnativestripesdk/StripeAbstractComposeView;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "latestIntentConfig",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "getLatestIntentConfig",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "setLatestIntentConfig",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V",
        "latestElementConfig",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "getLatestElementConfig",
        "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "setLatestElementConfig",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V",
        "rowSelectionBehaviorType",
        "Landroidx/compose/runtime/MutableState;",
        "Lcom/reactnativestripesdk/RowSelectionBehaviorType;",
        "getRowSelectionBehaviorType",
        "()Landroidx/compose/runtime/MutableState;",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getReactContext",
        "()Lcom/facebook/react/uimanager/ThemedReactContext;",
        "events",
        "Lkotlinx/coroutines/channels/Channel;",
        "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;",
        "Content",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "reportHeightChange",
        "height",
        "",
        "configure",
        "config",
        "intentConfig",
        "confirm",
        "clearPaymentOption",
        "requireStripeSdkModule",
        "Lcom/reactnativestripesdk/StripeSdkModule;",
        "Event",
        "stripe_stripe-react-native_release",
        "type",
        ""
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
.field private final events:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;",
            ">;"
        }
    .end annotation
.end field

.field private latestElementConfig:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

.field private latestIntentConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

.field private final rowSelectionBehaviorType:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/reactnativestripesdk/RowSelectionBehaviorType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$3g7cSXF91YehjNo_lWI8aGAD9lc(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$17$lambda$16(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3ikMm1Eps1mPXybsvZRKkfxcVsk(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$20$lambda$19(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$5W84dYOwCO6og6REf23dAXdtN3M(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$22(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RDRngnoZQ0N4TEC0ofKLingdWDA(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$9$lambda$7(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    return-void
.end method

.method public static synthetic $r8$lambda$XXti3RTcgMl2kL889w5ZzF-5PhM(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$9$lambda$8(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XZhGUhtXDnzXOXjUvAa4v7YPliA(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$5$lambda$4(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ox0ZOciQR9QqpDU3Vub50pQUuuI(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;ILandroidx/compose/ui/layout/Placeable$PlacementScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$17$lambda$16$lambda$15(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;ILandroidx/compose/ui/layout/Placeable$PlacementScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/StripeAbstractComposeView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    .line 65
    invoke-static {v0, v0, p1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->rowSelectionBehaviorType:Landroidx/compose/runtime/MutableState;

    const p1, 0x7fffffff

    const/4 v1, 0x6

    .line 68
    invoke-static {p1, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/ChannelKt;->Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->events:Lkotlinx/coroutines/channels/Channel;

    return-void
.end method

.method private static final Content$lambda$1(Landroidx/compose/runtime/MutableState;)Lcom/reactnativestripesdk/RowSelectionBehaviorType;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/reactnativestripesdk/RowSelectionBehaviorType;",
            ">;)",
            "Lcom/reactnativestripesdk/RowSelectionBehaviorType;"
        }
    .end annotation

    .line 73
    check-cast p0, Landroidx/compose/runtime/State;

    .line 452
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/reactnativestripesdk/RowSelectionBehaviorType;

    return-object p0
.end method

.method private static final Content$lambda$11(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 235
    check-cast p0, Landroidx/compose/runtime/IntState;

    .line 454
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    move-result p0

    return p0
.end method

.method private static final Content$lambda$12(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 455
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    return-void
.end method

.method private static final Content$lambda$17$lambda$16(Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    invoke-virtual {p3}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    invoke-interface {p2, v0}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicHeight(I)I

    move-result v3

    .line 297
    invoke-static {p0, v3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$12(Landroidx/compose/runtime/MutableIntState;I)V

    .line 299
    invoke-virtual {p3}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    new-instance v5, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda6;

    invoke-direct {v5, p2, p3, v3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda6;-><init>(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;I)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p0

    return-object p0
.end method

.method private static final Content$lambda$17$lambda$16$lambda$15(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/Constraints;ILandroidx/compose/ui/layout/Placeable$PlacementScope;)Lkotlin/Unit;
    .locals 9

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    invoke-virtual {p1}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v1

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, p2

    move v5, p2

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide p1

    .line 301
    invoke-interface {p0, p1, p2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 306
    sget-object p0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {p0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    move-result-wide v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative-70tqf50$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFILjava/lang/Object;)V

    .line 307
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Content$lambda$20$lambda$19(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    invoke-static {p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$11(Landroidx/compose/runtime/MutableIntState;)I

    move-result p2

    invoke-interface {p1, p2}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    move-result p1

    .line 309
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->reportHeightChange(F)V

    .line 314
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Content$lambda$22(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Content$lambda$5$lambda$4(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lkotlin/Unit;
    .locals 10

    const-string v1, "StripeReactNative"

    const-string v0, "customPaymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetails"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    const-class v3, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x10000000

    .line 86
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v2, 0x10000

    .line 87
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 89
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 91
    const-string v2, "Failed to start CustomPaymentMethodActivity"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    :goto_0
    :try_start_1
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    new-instance v7, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {v7}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->start()V

    .line 108
    new-instance v3, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1;

    const/4 v9, 0x0

    move-object v8, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v9}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlin/coroutines/Continuation;)V

    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 153
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :catch_1
    move-exception v0

    move-object p0, v0

    .line 98
    const-string p1, "StripeSdkModule not found for CPM callback"

    move-object v0, p0

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    sget-object p0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;->finishCurrent()V

    .line 100
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Content$lambda$9$lambda$7(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 206
    instance-of v1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;

    const-string v2, "status"

    if-eqz v1, :cond_0

    .line 207
    const-string p1, "completed"

    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 210
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Canceled;

    if-eqz v1, :cond_1

    .line 211
    const-string p1, "canceled"

    invoke-interface {v0, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 214
    :cond_1
    instance-of v1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;

    if-eqz v1, :cond_3

    .line 215
    const-string v1, "failed"

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    check-cast p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "Unknown error"

    :cond_2
    const-string v1, "error"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_0
    const-string p1, "apply(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p0

    check-cast v0, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p0, v0}, Lcom/reactnativestripesdk/StripeSdkModule;->emitEmbeddedPaymentElementFormSheetConfirmComplete(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    .line 205
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final Content$lambda$9$lambda$8(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p0

    invoke-virtual {p0}, Lcom/reactnativestripesdk/StripeSdkModule;->emitEmbeddedPaymentElementRowSelectionImmediateAction()V

    .line 229
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$getEvents$p(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lkotlinx/coroutines/channels/Channel;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->events:Lkotlinx/coroutines/channels/Channel;

    return-object p0
.end method

.method public static final synthetic access$getReactContext(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$reportHeightChange(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;F)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->reportHeightChange(F)V

    return-void
.end method

.method public static final synthetic access$requireStripeSdkModule(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lcom/reactnativestripesdk/StripeSdkModule;
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p0

    return-object p0
.end method

.method private final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 2

    .line 67
    invoke-virtual {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/ThemedReactContext;

    return-object v0
.end method

.method private final reportHeightChange(F)V
    .locals 4

    .line 322
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 323
    const-string v1, "height"

    float-to-double v2, p1

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 322
    const-string p1, "apply(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p1

    check-cast v0, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v0}, Lcom/reactnativestripesdk/StripeSdkModule;->emitEmbeddedPaymentElementDidUpdateHeight(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method private final requireStripeSdkModule()Lcom/reactnativestripesdk/StripeSdkModule;
    .locals 2

    .line 344
    invoke-direct {p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object v0

    const-class v1, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/ThemedReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public Content(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const v0, -0x5d81e30b

    .line 72
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    const-string v1, "C(Content)72@2797L37,73@2860L24,76@2937L3046,156@6009L3284,233@9314L39,234@9372L43,239@9491L1182,239@9470L1203,276@10704L312,276@10679L337,287@11049L7,293@11156L508,307@11674L142,289@11062L794:EmbeddedPaymentElementView.kt#iypzlo"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 451
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_6

    .line 72
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_4

    const-string v2, "com.reactnativestripesdk.EmbeddedPaymentElementView.Content (EmbeddedPaymentElementView.kt:71)"

    invoke-static {v0, v1, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    const v0, 0x6e3c21fe

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "CC(remember):EmbeddedPaymentElementView.kt#9igjgp"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 347
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 348
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_5

    .line 73
    iget-object v2, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->rowSelectionBehaviorType:Landroidx/compose/runtime/MutableState;

    .line 350
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 73
    :cond_5
    check-cast v2, Landroidx/compose/runtime/MutableState;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v4, 0x2e20b340

    .line 74
    const-string v5, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp"

    .line 353
    invoke-static {p1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v4, -0x38e27f50

    .line 356
    const-string v5, "CC(remember):Effects.kt#9igjgp"

    .line 357
    invoke-static {p1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 358
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 359
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_6

    .line 363
    sget-object v4, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 362
    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v4, p1}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    .line 361
    new-instance v5, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v5, v4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 364
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v4, v5

    .line 357
    :cond_6
    check-cast v4, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 367
    invoke-virtual {v4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    .line 353
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v5, 0x4c5de2

    .line 74
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 77
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 368
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_7

    .line 369
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_8

    .line 78
    :cond_7
    new-instance v7, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;

    invoke-direct {v7, p0, v4}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlinx/coroutines/CoroutineScope;)V

    .line 371
    invoke-interface {p1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 77
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 157
    invoke-static {v2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$1(Landroidx/compose/runtime/MutableState;)Lcom/reactnativestripesdk/RowSelectionBehaviorType;

    move-result-object v4

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    check-cast v4, Ljava/lang/Enum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    :goto_3
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    .line 374
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    .line 375
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_c

    .line 159
    :cond_a
    new-instance v3, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    .line 222
    new-instance v4, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V

    check-cast v4, Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    new-instance v6, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda1;

    invoke-direct {v6, p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda1;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V

    .line 159
    invoke-direct {v3, v4, v6}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;-><init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V

    new-instance v4, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$sam$com_stripe_android_paymentelement_ConfirmCustomPaymentMethodCallback$0;

    .line 222
    invoke-direct {v4, v7}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$sam$com_stripe_android_paymentelement_ConfirmCustomPaymentMethodCallback$0;-><init>(Lkotlin/jvm/functions/Function2;)V

    check-cast v4, Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    invoke-virtual {v3, v4}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    move-result-object v3

    .line 224
    invoke-static {v2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$1(Landroidx/compose/runtime/MutableState;)Lcom/reactnativestripesdk/RowSelectionBehaviorType;

    move-result-object v2

    sget-object v4, Lcom/reactnativestripesdk/RowSelectionBehaviorType;->Default:Lcom/reactnativestripesdk/RowSelectionBehaviorType;

    if-ne v2, v4, :cond_b

    .line 225
    sget-object v2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;->default()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    move-result-object v2

    goto :goto_4

    .line 227
    :cond_b
    sget-object v2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;

    new-instance v4, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda2;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda2;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V

    invoke-virtual {v2, v4}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;->immediateAction(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    move-result-object v2

    .line 223
    :goto_4
    invoke-virtual {v3, v2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->rowSelectionBehavior(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    move-result-object v4

    .line 377
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 157
    :cond_c
    check-cast v4, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 234
    sget v2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->$stable:I

    invoke-static {v4, p1, v2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;->rememberEmbeddedPaymentElement(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    move-result-object v2

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 380
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 381
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v0, v3, :cond_d

    .line 236
    invoke-static {v4}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object v0

    .line 383
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 235
    :cond_d
    check-cast v0, Landroidx/compose/runtime/MutableIntState;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 240
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v6, -0x615d173a

    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    .line 386
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    const/4 v9, 0x0

    if-nez v7, :cond_e

    .line 387
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_f

    .line 240
    :cond_e
    new-instance v7, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1;

    invoke-direct {v7, p0, v2, v9}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;Lkotlin/coroutines/Continuation;)V

    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 389
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 240
    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v7, 0x6

    invoke-static {v3, v8, p1, v7}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 277
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    .line 392
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_10

    .line 393
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_11

    .line 277
    :cond_10
    new-instance v3, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$2$1;

    invoke-direct {v3, v2, p0, v9}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$2$1;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Lkotlin/coroutines/Continuation;)V

    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 395
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 277
    :cond_11
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget v3, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->$stable:I

    invoke-static {v2, v6, p1, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 288
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    const v6, 0x789c5f52

    const-string v7, "CC:CompositionLocal.kt#9igjgp"

    .line 398
    invoke-static {p1, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 288
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 292
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    .line 293
    invoke-static {v0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content$lambda$11(Landroidx/compose/runtime/MutableIntState;)I

    move-result v7

    int-to-float v7, v7

    .line 399
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 293
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeight-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 400
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 401
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_12

    .line 294
    new-instance v5, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda3;

    invoke-direct {v5, v0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda3;-><init>(Landroidx/compose/runtime/MutableIntState;)V

    .line 403
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 294
    :cond_12
    check-cast v5, Lkotlin/jvm/functions/Function3;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v6, v5}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const v6, -0x6815fd56

    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v1, v6

    .line 406
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_13

    .line 407
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_14

    .line 308
    :cond_13
    new-instance v6, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda4;

    invoke-direct {v6, p0, v3, v0}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda4;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableIntState;)V

    .line 409
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 308
    :cond_14
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v5, v6}, Landroidx/compose/ui/layout/OnPlacedModifierKt;->onPlaced(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x2bb5b5d7

    .line 290
    const-string v3, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 412
    invoke-static {p1, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 413
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v1

    .line 417
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v3, -0x4ee9b9da

    .line 418
    const-string v5, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 419
    invoke-static {p1, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 420
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 421
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 422
    invoke-static {p1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 424
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    const v6, -0x2942ffcf

    .line 423
    const-string v7, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 425
    invoke-static {p1, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 426
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v6

    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    if-nez v6, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 427
    :cond_15
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 428
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-eqz v6, :cond_16

    .line 429
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    .line 431
    :cond_16
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 433
    :goto_5
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .line 434
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 435
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 437
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 439
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_17

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    .line 440
    :cond_17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 441
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 444
    :cond_18
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x7ff519f7    # -1.000876E-39f

    .line 446
    const-string v1, "C73@3429L9:Box.kt#2w3rfo"

    .line 447
    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    const v0, 0x25bc3c22

    const-string v1, "C315@11841L9:EmbeddedPaymentElementView.kt#iypzlo"

    .line 316
    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->$stable:I

    invoke-virtual {v2, p1, v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Content(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 447
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 448
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 425
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 419
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 412
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 451
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    :goto_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_1a

    new-instance v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$$ExternalSyntheticLambda5;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1a
    return-void
.end method

.method public final clearPaymentOption()V
    .locals 2

    .line 341
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->events:Lkotlinx/coroutines/channels/Channel;

    sget-object v1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$ClearPaymentOption;->INSTANCE:Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$ClearPaymentOption;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/Channel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final configure(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->events:Lkotlinx/coroutines/channels/Channel;

    new-instance v1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;

    invoke-direct {v1, p1, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/Channel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final confirm()V
    .locals 2

    .line 337
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->events:Lkotlinx/coroutines/channels/Channel;

    sget-object v1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Confirm;->INSTANCE:Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Confirm;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/Channel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getLatestElementConfig()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->latestElementConfig:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    return-object v0
.end method

.method public final getLatestIntentConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->latestIntentConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    return-object v0
.end method

.method public final getRowSelectionBehaviorType()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/reactnativestripesdk/RowSelectionBehaviorType;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->rowSelectionBehaviorType:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final setLatestElementConfig(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->latestElementConfig:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    return-void
.end method

.method public final setLatestIntentConfig(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->latestIntentConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    return-void
.end method
