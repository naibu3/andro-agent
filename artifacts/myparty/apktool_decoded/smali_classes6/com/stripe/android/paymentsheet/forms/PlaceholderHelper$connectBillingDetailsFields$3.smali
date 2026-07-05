.class final Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper$connectBillingDetailsFields$3;
.super Ljava/lang/Object;
.source "PlaceholderHelper.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper;->connectBillingDetailsFields$paymentsheet_release(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
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
.field final synthetic $phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;


# direct methods
.method constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberElement;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper$connectBillingDetailsFields$3;->$phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 198
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper$connectBillingDetailsFields$3;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 199
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper$connectBillingDetailsFields$3;->$phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;->getController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getLocalNumber()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 200
    :cond_1
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/forms/PlaceholderHelper$connectBillingDetailsFields$3;->$phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;->getController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 202
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
