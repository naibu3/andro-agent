.class public final synthetic Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    invoke-static {v0, p1}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$r8$lambda$DBkVz4GlB2sHP7TL1gcr2ZEzep0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
