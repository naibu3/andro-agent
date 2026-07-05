.class final synthetic Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "EmbeddedFormInteractorFactory.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->create()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/jvm/functions/Function1<",
        "-",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "+",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        ">;",
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

    const-class v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    const-string v5, "updatePrimaryButton(Lkotlin/jvm/functions/Function1;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "updatePrimaryButton"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 52
    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3;->invoke(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;->updatePrimaryButton(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
