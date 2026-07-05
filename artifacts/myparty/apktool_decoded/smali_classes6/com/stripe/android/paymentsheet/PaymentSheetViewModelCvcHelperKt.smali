.class public final Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt;
.super Ljava/lang/Object;
.source "PaymentSheetViewModelCvcHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000c\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\tH\u0002\u00a8\u0006\n"
    }
    d2 = {
        "shouldLaunchCvcRecollectionScreen",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
        "shouldAttachCvc",
        "isCvcRecollectionEnabled",
        "requiresCvcRecollection",
        "extraRequirements",
        "Lkotlin/Function0;",
        "paymentsheet_release"
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
.method public static synthetic $r8$lambda$Qvd62z1LA94hnMm314vVKmdeT0g(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt;->shouldAttachCvc$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$U98v_OZDFAqt0C3E9T3BD_A43k0(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt;->shouldLaunchCvcRecollectionScreen$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z

    move-result p0

    return p0
.end method

.method public static final isCvcRecollectionEnabled(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getPaymentMethodMetadata$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getCvcRecollectionHandler$paymentsheet_release()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v1

    .line 22
    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getArgs$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getInitializationMode$paymentsheet_release()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object p0

    .line 21
    invoke-interface {v1, v0, p0}, Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;->cvcRecollectionEnabled(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final requiresCvcRecollection(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;Lkotlin/jvm/functions/Function0;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 32
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getPaymentMethodMetadata$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getCvcRecollectionHandler$paymentsheet_release()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v2

    .line 34
    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v3

    .line 36
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p1

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getArgs$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getInitializationMode$paymentsheet_release()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object p0

    .line 33
    invoke-interface {v2, v0, v3, p1, p0}, Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;->requiresCVCRecollection(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 40
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method public static final shouldAttachCvc(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    invoke-static {p0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt;->requiresCvcRecollection(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;Lkotlin/jvm/functions/Function0;)Z

    move-result p0

    return p0
.end method

.method private static final shouldAttachCvc$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPaymentMethodLayout$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;->Horizontal:Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final shouldLaunchCvcRecollectionScreen(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)V

    invoke-static {p0, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelCvcHelperKt;->requiresCvcRecollection(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;Lkotlin/jvm/functions/Function0;)Z

    move-result p0

    return p0
.end method

.method private static final shouldLaunchCvcRecollectionScreen$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Z
    .locals 2

    .line 8
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPaymentMethodLayout$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;->Horizontal:Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;

    if-eq v0, v1, :cond_0

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getNavigationHandler()Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;->getCurrentScreen()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
