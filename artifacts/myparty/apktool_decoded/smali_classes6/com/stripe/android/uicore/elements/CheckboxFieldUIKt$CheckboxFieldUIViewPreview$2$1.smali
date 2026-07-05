.class final Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;
.super Ljava/lang/Object;
.source "CheckboxFieldUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2;->invoke(Landroidx/compose/runtime/Composer;I)V
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;->INSTANCE:Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 169
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/CheckboxFieldUIKt$CheckboxFieldUIViewPreview$2$1;->invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 3

    const v0, 0x2934fe29

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.CheckboxFieldUIViewPreview.<anonymous>.<anonymous> (CheckboxFieldUI.kt:175)"

    .line 176
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const-string p1, "I understand that Stripe will be collecting Direct Debits on behalf of Test Business Name and confirm that I am the account holder and the only person required to authorise debits from this account."

    return-object p1
.end method
