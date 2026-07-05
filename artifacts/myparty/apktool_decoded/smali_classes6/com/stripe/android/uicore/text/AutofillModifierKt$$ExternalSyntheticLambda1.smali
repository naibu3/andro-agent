.class public final synthetic Lcom/stripe/android/uicore/text/AutofillModifierKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/autofill/AutofillNode;

.field public final synthetic f$1:Landroidx/compose/ui/autofill/Autofill;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/autofill/AutofillNode;Landroidx/compose/ui/autofill/Autofill;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/text/AutofillModifierKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/autofill/AutofillNode;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/AutofillModifierKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/autofill/Autofill;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/text/AutofillModifierKt$$ExternalSyntheticLambda1;->f$0:Landroidx/compose/ui/autofill/AutofillNode;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/AutofillModifierKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/autofill/Autofill;

    check-cast p1, Landroidx/compose/ui/focus/FocusState;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/uicore/text/AutofillModifierKt;->$r8$lambda$96cLoWle6Hw0NU1hfl3iHg6MZ0M(Landroidx/compose/ui/autofill/AutofillNode;Landroidx/compose/ui/autofill/Autofill;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
