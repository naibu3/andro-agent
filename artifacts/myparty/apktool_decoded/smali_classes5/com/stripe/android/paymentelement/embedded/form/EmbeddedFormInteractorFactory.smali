.class public final Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;
.super Ljava/lang/Object;
.source "EmbeddedFormInteractorFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BO\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;",
        "",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "paymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "hasSavedPaymentMethods",
        "",
        "embeddedSelectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "embeddedFormHelperFactory",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;",
        "viewModelScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "formActivityStateHelper",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "<init>",
        "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;ZLcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V",
        "create",
        "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
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
.field private final embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

.field private final embeddedSelectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

.field private final hasSavedPaymentMethods:Z

.field private final paymentMethodCode:Ljava/lang/String;

.field private final paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field private final viewModelScope:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method public static synthetic $r8$lambda$KbxQrCVAlS03fBbVHnPFpWXTbgE(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->create$lambda$3(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$QPLWa-b35yYMql8u201Re6ES7LE(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->create$lambda$2(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$y55zheJJER6n4FNnJu3M3G6j1Ns(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->create$lambda$0(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yJ6HDxslwOFJUysFNJt5dyraNMU(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->create$lambda$1(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;ZLcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V
    .locals 1
    .param p6    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedSelectionHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedFormHelperFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formActivityStateHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 22
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    .line 23
    iput-boolean p3, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->hasSavedPaymentMethods:Z

    .line 24
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedSelectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 25
    iput-object p5, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

    .line 26
    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->viewModelScope:Lkotlinx/coroutines/CoroutineScope;

    .line 27
    iput-object p7, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    .line 28
    iput-object p8, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-void
.end method

.method private static final create$lambda$0(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lkotlin/Unit;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedSelectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$1(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;Lcom/stripe/android/core/strings/ResolvableString;Z)Lkotlin/Unit;
    .locals 0

    .line 50
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-interface {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;->updateMandate(Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 51
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$2(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)Lkotlin/Unit;
    .locals 1

    .line 54
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentMethodFormCompleted(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final create$lambda$3(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final create()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;
    .locals 25

    move-object/from16 v0, p0

    .line 31
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedFormHelperFactory:Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;

    .line 32
    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->viewModelScope:Lkotlinx/coroutines/CoroutineScope;

    .line 33
    iget-object v4, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 34
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 39
    iget-boolean v3, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->hasSavedPaymentMethods:Z

    xor-int/lit8 v3, v3, 0x1

    .line 31
    new-instance v6, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda0;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)V

    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;->create(Lkotlinx/coroutines/CoroutineScope;ZLcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/FormHelper;

    move-result-object v1

    .line 42
    sget-object v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments$Companion;

    .line 43
    iget-object v3, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 44
    iget-object v4, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    .line 46
    new-instance v5, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$1;

    iget-object v6, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedSelectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-direct {v5, v6}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$1;-><init>(Ljava/lang/Object;)V

    check-cast v5, Lkotlin/reflect/KFunction;

    .line 47
    iget-boolean v7, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->hasSavedPaymentMethods:Z

    .line 48
    new-instance v6, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$2;

    iget-object v8, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-direct {v6, v8}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$2;-><init>(Ljava/lang/Object;)V

    check-cast v6, Lkotlin/reflect/KFunction;

    .line 52
    new-instance v8, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3;

    iget-object v9, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-direct {v8, v9}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3;-><init>(Ljava/lang/Object;)V

    check-cast v8, Lkotlin/reflect/KFunction;

    .line 53
    new-instance v9, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$4;

    iget-object v10, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-direct {v9, v10}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$4;-><init>(Ljava/lang/Object;)V

    check-cast v9, Lkotlin/reflect/KFunction;

    .line 46
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v10, v8

    .line 42
    new-instance v8, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda1;

    invoke-direct {v8, v0}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)V

    .line 48
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 52
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 53
    move-object v11, v9

    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 42
    new-instance v12, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda2;

    invoke-direct {v12, v0}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;)V

    move-object v9, v6

    move-object v6, v5

    const-string v5, "payment_element"

    invoke-virtual/range {v2 .. v12}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments$Companion;->createForEmbedded(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-result-object v18

    .line 57
    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/stripe/android/paymentsheet/FormHelper;->formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object v2

    .line 58
    iget-object v3, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/stripe/android/paymentsheet/FormHelper;->createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v15

    .line 59
    instance-of v2, v2, Lcom/stripe/android/paymentsheet/FormHelper$FormType$MandateOnly;

    if-eqz v2, :cond_1

    .line 60
    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->embeddedSelectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 61
    invoke-virtual {v15}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->noUserInteractionFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    move-result-object v3

    .line 63
    iget-object v4, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 65
    iget-object v5, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 61
    invoke-static {v3, v4, v5}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    goto :goto_0

    .line 63
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 69
    :cond_1
    :goto_0
    new-instance v13, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    .line 70
    iget-object v14, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    .line 72
    invoke-interface {v1, v14}, Lcom/stripe/android/paymentsheet/FormHelper;->formElementsForCode(Ljava/lang/String;)Ljava/util/List;

    move-result-object v16

    .line 73
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$1;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$1;-><init>(Ljava/lang/Object;)V

    move-object/from16 v17, v2

    check-cast v17, Lkotlin/jvm/functions/Function2;

    .line 75
    new-instance v1, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$2;

    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$create$2;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v1

    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 76
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 77
    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodCode:Ljava/lang/String;

    .line 78
    iget-boolean v3, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->hasSavedPaymentMethods:Z

    .line 76
    invoke-virtual {v1, v2, v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->formHeaderInformationForCode(Ljava/lang/String;Z)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;

    move-result-object v20

    .line 80
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v21

    .line 81
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->formActivityStateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    invoke-interface {v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda3;

    invoke-direct {v2}, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v22

    .line 82
    new-instance v1, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    .line 83
    iget-object v2, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getPaymentMethodIncentive()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v2

    .line 82
    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)V

    .line 84
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;->getDisplayedIncentive()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v23

    .line 85
    iget-object v1, v0, Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;->viewModelScope:Lkotlinx/coroutines/CoroutineScope;

    move-object/from16 v24, v1

    .line 69
    invoke-direct/range {v13 .. v24}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/lpmfoundations/FormHeaderInformation;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V

    return-object v13
.end method
