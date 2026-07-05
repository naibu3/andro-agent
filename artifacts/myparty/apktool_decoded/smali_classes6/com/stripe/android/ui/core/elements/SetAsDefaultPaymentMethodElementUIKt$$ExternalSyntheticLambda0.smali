.class public final synthetic Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

.field public final synthetic f$1:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/State;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->$r8$lambda$FzwRn6Cv5Rb49LwZZgfGDIOkyH0(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
