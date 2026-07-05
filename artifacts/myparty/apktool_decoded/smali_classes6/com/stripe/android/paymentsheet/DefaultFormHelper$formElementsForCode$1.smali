.class final synthetic Lcom/stripe/android/paymentsheet/DefaultFormHelper$formElementsForCode$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "DefaultFormHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/DefaultFormHelper;->formElementsForCode(Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "Lkotlin/Unit;",
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


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    const-string v5, "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "onStateUpdated"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 154
    check-cast p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$formElementsForCode$1;->invoke(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$formElementsForCode$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/LinkInlineHandler;->onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    return-void
.end method
