.class final Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;
.super Ljava/lang/Object;
.source "PaymentSheetTopBar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheetTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,209:1\n1225#2,6:210\n1225#2,6:217\n149#3:216\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1\n*L\n186#1:210,6\n194#1:217,6\n193#1:216\n*E\n"
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$IFBdFtIVQkiWXdA_YHGmEFRxmR8()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;->invoke$lambda$3$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$bptZcrQxxDoZ_c3OIrAVliHfcOI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;->invoke$lambda$1$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 186
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$3$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 194
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 181
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 182
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 182
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetTopBarKt.lambda-1.<anonymous> (PaymentSheetTopBar.kt:181)"

    const v2, 0x451a21c1

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x7e7e89c3

    .line 185
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 210
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 211
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    .line 212
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 213
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 186
    :cond_3
    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 182
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;-><init>(ZZZLkotlin/jvm/functions/Function0;)V

    int-to-float p2, v2

    .line 216
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    const p2, 0x7e7ea343

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 217
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 218
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_4

    .line 219
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1$$ExternalSyntheticLambda1;-><init>()V

    .line 220
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    :cond_4
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0x6db0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v5, p1

    .line 189
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->PaymentSheetTopBar--jt2gSs(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
