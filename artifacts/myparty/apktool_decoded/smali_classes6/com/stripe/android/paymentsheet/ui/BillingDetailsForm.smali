.class public final Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;
.super Ljava/lang/Object;
.source "BillingDetailsForm.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBillingDetailsForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingDetailsForm.kt\ncom/stripe/android/paymentsheet/ui/BillingDetailsForm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n295#2,2:135\n*S KotlinDebug\n*F\n+ 1 BillingDetailsForm.kt\ncom/stripe/android/paymentsheet/ui/BillingDetailsForm\n*L\n115#1:135,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B1\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%H\u0002J6\u0010)\u001a\u0004\u0018\u00010**\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*0,0+2\u0006\u0010-\u001a\u00020!2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020!0 H\u0002J \u0010/\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u000101002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0 0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;",
        "",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "addressCollectionMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "collectName",
        "",
        "collectEmail",
        "collectPhone",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZ)V",
        "nameElement",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "getNameElement",
        "()Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "emailElement",
        "Lcom/stripe/android/uicore/elements/EmailElement;",
        "getEmailElement",
        "()Lcom/stripe/android/uicore/elements/EmailElement;",
        "phoneElement",
        "Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "getPhoneElement",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "cardBillingAddressElement",
        "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;",
        "addressSectionElement",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "getAddressSectionElement",
        "()Lcom/stripe/android/uicore/elements/SectionElement;",
        "hiddenElements",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getHiddenElements",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "formFieldsState",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
        "getFormFieldsState",
        "()Lkotlinx/coroutines/flow/Flow;",
        "valueOrNull",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "",
        "Lkotlin/Pair;",
        "identifierSpec",
        "hiddenIdentifiers",
        "rawAddressValues",
        "",
        "",
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
.field public static final $stable:I


# instance fields
.field private final addressSectionElement:Lcom/stripe/android/uicore/elements/SectionElement;

.field private final cardBillingAddressElement:Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

.field private final emailElement:Lcom/stripe/android/uicore/elements/EmailElement;

.field private final formFieldsState:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
            ">;"
        }
    .end annotation
.end field

.field private final hiddenElements:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

.field private final phoneElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "addressCollectionMode"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    if-eqz p3, :cond_1

    .line 34
    new-instance v4, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 35
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    .line 36
    sget-object v6, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    if-eqz v1, :cond_0

    iget-object v7, v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v7, v2

    :goto_0
    invoke-virtual {v6, v7}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 34
    invoke-direct {v4, v5, v6}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    goto :goto_1

    :cond_1
    move-object v4, v2

    .line 33
    :goto_1
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    if-eqz p4, :cond_3

    .line 43
    new-instance v5, Lcom/stripe/android/uicore/elements/EmailElement;

    if-eqz v1, :cond_2

    iget-object v4, v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    move-object v7, v4

    goto :goto_2

    :cond_2
    move-object v7, v2

    :goto_2
    const/4 v9, 0x5

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/uicore/elements/EmailElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object v5, v2

    .line 42
    :goto_3
    iput-object v5, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->emailElement:Lcom/stripe/android/uicore/elements/EmailElement;

    if-eqz p5, :cond_6

    .line 49
    new-instance v4, Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    .line 50
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    .line 51
    sget-object v6, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    if-eqz v1, :cond_4

    .line 52
    iget-object v7, v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->phone:Ljava/lang/String;

    if-nez v7, :cond_5

    :cond_4
    const-string v7, ""

    :cond_5
    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 51
    invoke-static/range {v6 .. v13}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v6

    .line 49
    invoke-direct {v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    goto :goto_4

    :cond_6
    move-object v4, v2

    .line 48
    :goto_4
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->phoneElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    .line 60
    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getBillingAddress()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 63
    invoke-static {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt;->toInternal(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;)Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v13

    .line 64
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->rawAddressValues(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Ljava/util/Map;

    move-result-object v7

    .line 59
    new-instance v5, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->cardBillingAddressElement:Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    .line 68
    sget-object v1, Lcom/stripe/android/uicore/elements/SectionElement;->Companion:Lcom/stripe/android/uicore/elements/SectionElement$Companion;

    .line 69
    move-object v3, v5

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 70
    sget v4, Lcom/stripe/android/ui/core/R$string;->stripe_billing_details:I

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x4

    invoke-static {v4, v6, v2, v7, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    .line 68
    invoke-virtual {v1, v3, v2}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Lcom/stripe/android/uicore/elements/SectionFieldElement;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->addressSectionElement:Lcom/stripe/android/uicore/elements/SectionElement;

    .line 72
    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;->getHiddenIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->hiddenElements:Lkotlinx/coroutines/flow/StateFlow;

    .line 73
    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->formFieldsState()Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->formFieldsState:Lkotlinx/coroutines/flow/Flow;

    return-void
.end method

.method public static final synthetic access$valueOrNull(Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->valueOrNull(Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method private final formFieldsState()Lkotlinx/coroutines/flow/Flow;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    :goto_0
    move-object v1, v0

    .line 77
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->emailElement:Lcom/stripe/android/uicore/elements/EmailElement;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/EmailElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_1

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    :goto_1
    move-object v2, v0

    .line 78
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->phoneElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_2

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    :goto_2
    move-object v3, v0

    .line 84
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->cardBillingAddressElement:Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lkotlinx/coroutines/flow/Flow;

    .line 85
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->hiddenElements:Lkotlinx/coroutines/flow/StateFlow;

    move-object v5, v0

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 80
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm$formFieldsState$1;

    const/4 v6, 0x0

    invoke-direct {v0, p0, v6}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm$formFieldsState$1;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;Lkotlin/coroutines/Continuation;)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function6;

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 107
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->flowOn(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method private final rawAddressValues(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            ")",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 123
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    .line 125
    new-array v0, v0, [Lkotlin/Pair;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 126
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine2()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 127
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getState()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 128
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 129
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 130
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x5

    aput-object p1, v0, v1

    .line 124
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 123
    :cond_1
    :goto_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final valueOrNull(Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;"
        }
    .end annotation

    .line 114
    invoke-interface {p3, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    return-object v0

    .line 115
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 135
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lkotlin/Pair;

    .line 116
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    move-object p3, v0

    .line 115
    :goto_0
    check-cast p3, Lkotlin/Pair;

    if-eqz p3, :cond_3

    .line 117
    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object p1

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final getAddressSectionElement()Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->addressSectionElement:Lcom/stripe/android/uicore/elements/SectionElement;

    return-object v0
.end method

.method public final getEmailElement()Lcom/stripe/android/uicore/elements/EmailElement;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->emailElement:Lcom/stripe/android/uicore/elements/EmailElement;

    return-object v0
.end method

.method public final getFormFieldsState()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->formFieldsState:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getHiddenElements()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->hiddenElements:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getNameElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    return-object v0
.end method

.method public final getPhoneElement()Lcom/stripe/android/uicore/elements/PhoneNumberElement;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;->phoneElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    return-object v0
.end method
