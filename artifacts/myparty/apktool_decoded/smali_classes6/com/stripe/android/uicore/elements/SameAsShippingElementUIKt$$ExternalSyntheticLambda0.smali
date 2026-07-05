.class public final synthetic Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/elements/SameAsShippingController;

.field public final synthetic f$1:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/SameAsShippingController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/SameAsShippingController;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/elements/SameAsShippingController;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->$r8$lambda$aTqjcf2xvUR43HvK3v_jmJjaAQo(Lcom/stripe/android/uicore/elements/SameAsShippingController;Landroidx/compose/runtime/State;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
