.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormUIKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormUIKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormUIKt$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor;

    check-cast p1, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormUIKt;->$r8$lambda$GL6YJBliFgZChUq_9omjw3D0Sdk(Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
