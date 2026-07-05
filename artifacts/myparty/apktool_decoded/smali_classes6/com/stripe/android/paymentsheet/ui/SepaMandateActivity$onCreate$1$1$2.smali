.class final Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;
.super Ljava/lang/Object;
.source "SepaMandateActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSepaMandateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SepaMandateActivity.kt\ncom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n1225#2,6:134\n1225#2,6:140\n*S KotlinDebug\n*F\n+ 1 SepaMandateActivity.kt\ncom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2\n*L\n61#1:134,6\n69#1:140,6\n*E\n"
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
.field final synthetic $merchantName:Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;


# direct methods
.method public static synthetic $r8$lambda$600UEWuYF4DsJLdEBf--8E4cjc0(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$69XZZuQ_VPshYqQLuqyzElkJCME(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->$merchantName:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;
    .locals 3

    .line 62
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 64
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/SepaMandateResult$Acknowledged;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/SepaMandateResult$Acknowledged;

    check-cast v1, Landroid/os/Parcelable;

    .line 62
    const-string v2, "extra_activity_result"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    .line 66
    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;->setResult(ILandroid/content/Intent;)V

    .line 67
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;->finish()V

    .line 68
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)Lkotlin/Unit;
    .locals 0

    .line 70
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;->finish()V

    .line 71
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 58
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 59
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 59
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)"

    const v2, 0x2c1e1aa6

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->$merchantName:Ljava/lang/String;

    const v0, -0x3ab9c1

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 61
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    .line 134
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    .line 135
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    .line 61
    :cond_3
    new-instance v2, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V

    .line 137
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 61
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x3a8af6

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 69
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;

    .line 140
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_5

    .line 141
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_6

    .line 69
    :cond_5
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda1;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;)V

    .line 143
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 69
    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v0, 0x0

    .line 59
    invoke-static {p2, v2, v3, p1, v0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateActivityKt;->SepaMandateScreen(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
