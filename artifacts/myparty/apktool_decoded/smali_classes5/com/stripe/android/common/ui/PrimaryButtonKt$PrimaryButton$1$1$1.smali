.class final Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;
.super Ljava/lang/Object;
.source "PrimaryButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,146:1\n77#2:147\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1\n*L\n81#1:147\n*E\n"
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
.field final synthetic $displayLockIcon:Z

.field final synthetic $isEnabled:Z

.field final synthetic $isLoading:Z

.field final synthetic $label:Ljava/lang/String;

.field final synthetic $onBackground:J

.field final synthetic $textStyle:Landroidx/compose/ui/text/TextStyle;


# direct methods
.method constructor <init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;ZZZ)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$label:Ljava/lang/String;

    iput-wide p2, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$onBackground:J

    iput-object p4, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p5, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$isEnabled:Z

    iput-boolean p6, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$isLoading:Z

    iput-boolean p7, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$displayLockIcon:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 78
    check-cast p1, Landroidx/compose/foundation/layout/RowScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$TextButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 79
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 79
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.common.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:78)"

    const v1, -0x933c0d1

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 80
    :cond_2
    iget-object v2, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$label:Ljava/lang/String;

    .line 81
    iget-wide v3, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$onBackground:J

    invoke-static {}, Landroidx/compose/material/ContentAlphaKt;->getLocalContentAlpha()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    const p3, 0x789c5f52

    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    .line 147
    invoke-static {p2, p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 81
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    .line 82
    iget-object v5, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    .line 83
    iget-boolean v6, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$isEnabled:Z

    .line 84
    iget-boolean v7, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$isLoading:Z

    .line 85
    iget-boolean v8, p0, Lcom/stripe/android/common/ui/PrimaryButtonKt$PrimaryButton$1$1$1;->$displayLockIcon:Z

    const/4 v10, 0x0

    move-object v9, p2

    .line 79
    invoke-static/range {v2 .. v10}, Lcom/stripe/android/common/ui/PrimaryButtonKt;->access$PrimaryButtonContent-8V94_ZQ(Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;ZZZLandroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
