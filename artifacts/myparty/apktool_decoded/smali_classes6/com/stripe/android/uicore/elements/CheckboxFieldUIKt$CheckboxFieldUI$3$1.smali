.class final Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;
.super Ljava/lang/Object;
.source "CheckboxFieldUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt;->CheckboxFieldUI(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/CheckboxFieldController;ZLandroidx/compose/runtime/Composer;II)V
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
        "Ljava/lang/String;",
        ">;"
    }
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
.field final synthetic $fieldError:Lcom/stripe/android/uicore/elements/FieldError;


# direct methods
.method constructor <init>(Lcom/stripe/android/uicore/elements/FieldError;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;->$fieldError:Lcom/stripe/android/uicore/elements/FieldError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 58
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;->invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 3

    const v0, -0x6a677885

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)"

    .line 59
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;->$fieldError:Lcom/stripe/android/uicore/elements/FieldError;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/FieldError;->getFormatArgs()[Ljava/lang/Object;

    move-result-object p2

    const v0, -0x3903ce33

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v0, 0x0

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;->$fieldError:Lcom/stripe/android/uicore/elements/FieldError;

    .line 60
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v1

    array-length v2, p2

    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2, p1, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    .line 59
    :goto_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-nez p2, :cond_2

    .line 61
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUI$3$1;->$fieldError:Lcom/stripe/android/uicore/elements/FieldError;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result p2

    invoke-static {p2, p1, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    .line 59
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method
