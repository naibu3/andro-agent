.class public final synthetic Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->$r8$lambda$6D3yCPuOXvhA3vfIOrdhnU1nvPI(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    return-object p1
.end method
