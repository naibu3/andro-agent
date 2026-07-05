.class public final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModelKt;
.super Ljava/lang/Object;
.source "IDConsentContentViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "withPayload",
        "",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;",
        "block",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$withPayload(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModelKt;->withPayload(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final withPayload(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 121
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;

    if-nez p0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
