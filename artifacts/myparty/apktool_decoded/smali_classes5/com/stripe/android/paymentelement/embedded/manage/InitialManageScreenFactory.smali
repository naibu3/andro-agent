.class public final Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;
.super Ljava/lang/Object;
.source "InitialManageScreenFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
        "",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "updateScreenInteractorFactory",
        "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;",
        "manageInteractorFactory",
        "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;)V",
        "createInitialScreen",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

.field private final manageInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;

.field private final paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field private final updateScreenInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "customerStateHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateScreenInteractorFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageInteractorFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    .line 12
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 13
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->updateScreenInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;

    .line 14
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->manageInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;

    return-void
.end method


# virtual methods
.method public final createInitialScreen()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;
    .locals 9

    .line 17
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/state/CustomerState;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 19
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 20
    iget-object v0, v4, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 21
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v2, v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 22
    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    :cond_1
    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->orEmpty(Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    .line 23
    sget-object v2, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->Companion:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;

    .line 26
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object v0

    instance-of v5, v0, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 23
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;->create$default(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethod;ZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v0

    .line 28
    new-instance v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;

    .line 29
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->updateScreenInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;

    invoke-interface {v2, v0}, Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;->createUpdateScreenInteractor(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    move-result-object v0

    .line 28
    invoke-direct {v1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$Update;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;)V

    check-cast v1, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    return-object v1

    .line 34
    :cond_2
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;->manageInteractorFactory:Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;

    invoke-interface {v1}, Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;->createManageScreenInteractor()Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;)V

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen;

    return-object v0
.end method
