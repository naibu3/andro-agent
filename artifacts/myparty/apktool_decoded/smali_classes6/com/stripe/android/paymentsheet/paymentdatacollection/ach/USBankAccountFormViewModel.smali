.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "USBankAccountFormViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUSBankAccountFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,879:1\n230#2,5:880\n230#2,5:885\n230#2,5:890\n230#2,5:895\n142#3:900\n131#3,5:901\n1#4:906\n1187#5,2:907\n1261#5,4:909\n1734#5,3:913\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n*L\n420#1:880,5\n442#1:885,5\n460#1:890,5\n486#1:895,5\n510#1:900\n510#1:901,5\n197#1:907,2\n197#1:909,4\n274#1:913,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u0000 \u00a3\u00012\u00020\u0001:\u0008\u00a0\u0001\u00a1\u0001\u00a2\u0001\u00a3\u0001B9\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000e\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sJ\u0010\u0010t\u001a\u00020q2\u0006\u0010u\u001a\u00020vH\u0007J\u0010\u0010w\u001a\u00020q2\u0006\u0010u\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020q2\u0006\u0010u\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020q2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010z\u001a\u00020q2\u0006\u0010u\u001a\u00020{H\u0002J\u0010\u0010|\u001a\u00020q2\u0006\u0010u\u001a\u00020}H\u0002J\u001c\u0010~\u001a\u00020q2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0019H\u0002J\u0007\u0010\u0082\u0001\u001a\u00020qJ\u0015\u0010\u0083\u0001\u001a\u00020q2\u000c\u0008\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001J\u0007\u0010\u0086\u0001\u001a\u00020qJ\u0007\u0010\u0087\u0001\u001a\u00020\u0019J\t\u0010\u0088\u0001\u001a\u00020NH\u0002J\u0014\u0010\u0089\u0001\u001a\u00020q2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u008b\u0001\u001a\u00020q2\u0007\u0010\u008a\u0001\u001a\u00020\u0019H\u0002J\n\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0002J\n\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0002J\t\u0010\u0096\u0001\u001a\u00020qH\u0002J1\u0010\u0097\u0001\u001a\u00020[2\u0008\u0010\u0098\u0001\u001a\u00030\u0099\u00012\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010O\u001a\u00020PH\u0002J\u001e\u0010\u009c\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00142\t\u0008\u0002\u0010\u009e\u0001\u001a\u00020\u0014H\u0002J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010[*\u00020N2\u0006\u0010O\u001a\u00020PH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010!R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010!R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u00101\u001a\u0004\u0018\u000102\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u00107\u001a\u000208\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0019\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010!R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010!R\u000e\u0010@\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020B\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0017\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010!R\u000e\u0010G\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010H\u001a\u0004\u0018\u00010I\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0014\u0010L\u001a\u0008\u0012\u0004\u0012\u00020N0MX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u0008\u0012\u0004\u0012\u00020P0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020N0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010!R\u0014\u0010S\u001a\u0008\u0012\u0004\u0012\u00020U0TX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010V\u001a\u0008\u0012\u0004\u0012\u00020U0W\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0019\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\\\u0010!R\u0017\u0010]\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010!R&\u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR$\u0010h\u001a\u00020\u00142\u0006\u0010g\u001a\u00020\u00148B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008i\u0010j\"\u0004\u0008k\u0010lR$\u0010m\u001a\u00020\u00142\u0006\u0010g\u001a\u00020\u00148B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008n\u0010j\"\u0004\u0008o\u0010l\u00a8\u0006\u00a4\u0001"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "args",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;",
        "application",
        "Landroid/app/Application;",
        "lazyPaymentConfig",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "autocompleteAddressInteractorFactory",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Landroid/app/Application;Ljavax/inject/Provider;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "collectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "collectingAddress",
        "",
        "collectingPhone",
        "collectingName",
        "collectingEmail",
        "defaultName",
        "",
        "nameController",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "getNameController",
        "()Lcom/stripe/android/uicore/elements/TextFieldController;",
        "name",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getName",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "defaultEmail",
        "emailController",
        "getEmailController",
        "email",
        "getEmail",
        "defaultPhoneCountry",
        "defaultPhone",
        "phoneController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "getPhoneController",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "phone",
        "getPhone",
        "defaultAddress",
        "Lcom/stripe/android/model/Address;",
        "sameAsShippingElement",
        "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "getSameAsShippingElement",
        "()Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "autocompleteAddressElement",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;",
        "addressElement",
        "Lcom/stripe/android/uicore/elements/AddressFieldsElement;",
        "getAddressElement",
        "()Lcom/stripe/android/uicore/elements/AddressFieldsElement;",
        "address",
        "getAddress",
        "lastTextFieldIdentifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getLastTextFieldIdentifier",
        "saveForFutureUseInitialValue",
        "saveForFutureUseElement",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "getSaveForFutureUseElement",
        "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "saveForFutureUseCheckedFlow",
        "getSaveForFutureUseCheckedFlow",
        "setAsDefaultInitialValue",
        "setAsDefaultPaymentMethodElement",
        "Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;",
        "getSetAsDefaultPaymentMethodElement",
        "()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;",
        "screenStateWithoutSaveForFutureUse",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "currentScreenState",
        "getCurrentScreenState",
        "_analyticsEvent",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
        "analyticsEvent",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getAnalyticsEvent",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "linkedAccount",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "getLinkedAccount",
        "requiredFields",
        "getRequiredFields",
        "collectBankAccountLauncher",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "getCollectBankAccountLauncher$annotations",
        "()V",
        "getCollectBankAccountLauncher",
        "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "setCollectBankAccountLauncher",
        "(Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;)V",
        "value",
        "hasLaunched",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "shouldReset",
        "getShouldReset",
        "setShouldReset",
        "register",
        "",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "handleCollectBankAccountResult",
        "result",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;",
        "handleInstantDebitsResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;",
        "emitFinishedEvent",
        "handleCompletedBankAccountResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;",
        "handleCompletedInstantDebitsResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;",
        "handleResultForACH",
        "usBankAccountData",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;",
        "intentId",
        "handlePrimaryButtonClick",
        "reset",
        "error",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "onDestroy",
        "formattedMerchantName",
        "determineInitialState",
        "collectBankAccount",
        "clientSecret",
        "collectBankAccountForIntent",
        "createInstantDebitsConfiguration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;",
        "createUSBankAccountConfiguration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;",
        "makeElementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "makeElementsSessionContextBillingDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
        "makePrefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "collectBankAccountForDeferredIntent",
        "createNewPaymentSelection",
        "resultIdentifier",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;",
        "last4",
        "bankName",
        "buildMandateText",
        "isVerifyWithMicrodeposits",
        "isSaveForFutureUseSelected",
        "toPaymentSelection",
        "AnalyticsEvent",
        "Factory",
        "Args",
        "Companion",
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

.field private static final Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

.field private static final HAS_LAUNCHED_KEY:Ljava/lang/String; = "has_launched"

.field private static final SHOULD_RESET_KEY:Ljava/lang/String; = "should_reset"


# instance fields
.field private final _analyticsEvent:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final address:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/Address;",
            ">;"
        }
    .end annotation
.end field

.field private final addressElement:Lcom/stripe/android/uicore/elements/AddressFieldsElement;

.field private final analyticsEvent:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final application:Landroid/app/Application;

.field private final args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

.field private final autocompleteAddressElement:Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;

.field private final billingDetails:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            ">;"
        }
    .end annotation
.end field

.field private collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

.field private final collectingAddress:Z

.field private final collectingEmail:Z

.field private final collectingName:Z

.field private final collectingPhone:Z

.field private final collectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final currentScreenState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultAddress:Lcom/stripe/android/model/Address;

.field private final defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final defaultEmail:Ljava/lang/String;

.field private final defaultName:Ljava/lang/String;

.field private final defaultPhone:Ljava/lang/String;

.field private final defaultPhoneCountry:Ljava/lang/String;

.field private final email:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field private final lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final lazyPaymentConfig:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final linkedAccount:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field private final phone:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field private final requiredFields:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

.field private final saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

.field private final saveForFutureUseInitialValue:Z

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final setAsDefaultInitialValue:Z

.field private final setAsDefaultPaymentMethodElement:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;


# direct methods
.method public static synthetic $r8$lambda$7pZP5lBh2JLzsvQSBzsNovP62nQ(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields$lambda$19(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$7tYtk-6yOa86ivCfpLGq2ASJrQY(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields$lambda$16(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$CEPCmuUVHzMUD1MxsFPgYPEAazA(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZZZ)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields$lambda$20(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZZZ)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$V7jcx-4IEdKn5EQdLmAWoaGo2RU(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Z)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->linkedAccount$lambda$14(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Z)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WTQ5z0SEPj6GvShfLLLfXENqsKw(Ljava/util/List;)Lcom/stripe/android/model/Address;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->address$lambda$9(Ljava/util/List;)Lcom/stripe/android/model/Address;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$YjxiJoMmBi0VoZAfjed_1SdtKdg(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phone$lambda$5(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZsNQHXWgjRsrf8WWGu50oMXjoUg(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name$lambda$1(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dJFNKCTTLDl8LgsBQwKSIZZa0pU(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields$lambda$15(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$kSlk1_JokxDOFeIC4BSVmNoSc44(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields$lambda$17(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$kTdByg62kr3OzH5tushPsWcppDE(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email$lambda$3(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ke2Dsz2sCqkCb8oTqJreyQzFik0(Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lastTextFieldIdentifier$lambda$10(Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$v6-VW8wFaStdP2Whxzp7OJxaFN8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->billingDetails$lambda$11(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yuXmsP6YrqOqx4RhMZaSoAczkY0(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->currentScreenState$lambda$13(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Landroid/app/Application;Ljavax/inject/Provider;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;",
            "Landroid/app/Application;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "args"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "application"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "lazyPaymentConfig"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "savedStateHandle"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 74
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    .line 75
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    .line 76
    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    .line 77
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 80
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    .line 81
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 84
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Full:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v4, v5, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v7

    :goto_0
    iput-boolean v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingAddress:Z

    .line 87
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getPhone()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v5

    sget-object v8, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Always:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-ne v5, v8, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    iput-boolean v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingPhone:Z

    .line 89
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 90
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getName()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Always:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-ne v8, v9, :cond_3

    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getName()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-eq v8, v9, :cond_3

    :goto_2
    move v8, v6

    goto :goto_3

    :cond_3
    move v8, v7

    .line 89
    :goto_3
    iput-boolean v8, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingName:Z

    .line 96
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getEmail()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object v9

    sget-object v10, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-eq v9, v10, :cond_4

    goto :goto_4

    :cond_4
    move v6, v7

    :goto_4
    iput-boolean v6, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingEmail:Z

    .line 98
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v9

    const/4 v10, 0x0

    if-eqz v9, :cond_5

    .line 99
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_5
    if-nez v8, :cond_6

    .line 100
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v9

    if-eqz v9, :cond_7

    :cond_6
    if-eqz v2, :cond_7

    .line 101
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_7
    move-object v9, v10

    .line 98
    :goto_5
    iput-object v9, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultName:Ljava/lang/String;

    .line 106
    sget-object v11, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    invoke-virtual {v11, v9}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object v9, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 110
    invoke-interface {v9}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v12}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v11, v12}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v11

    iput-object v11, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:Lkotlinx/coroutines/flow/StateFlow;

    .line 114
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v12

    if-eqz v12, :cond_8

    .line 115
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getEmail()Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_8
    if-nez v6, :cond_9

    .line 116
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v12

    if-eqz v12, :cond_a

    :cond_9
    if-eqz v2, :cond_a

    .line 117
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_a
    move-object v12, v10

    .line 114
    :goto_6
    iput-object v12, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultEmail:Ljava/lang/String;

    .line 122
    sget-object v13, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    .line 123
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-virtual {v14}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v14

    if-eqz v14, :cond_c

    invoke-virtual {v14}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getEmail()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_b

    goto :goto_7

    :cond_b
    move-object v12, v14

    :cond_c
    :goto_7
    const/4 v14, 0x2

    .line 122
    invoke-static {v13, v12, v7, v14, v10}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object v12, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 126
    invoke-interface {v12}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v13

    new-instance v14, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda7;

    invoke-direct {v14}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda7;-><init>()V

    invoke-static {v13, v14}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v13

    iput-object v13, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    .line 130
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v14

    if-eqz v14, :cond_e

    .line 131
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v14

    invoke-virtual {v14}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v14

    invoke-virtual {v14}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object v14

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v14

    goto :goto_8

    :cond_d
    move-object v14, v10

    goto :goto_8

    :cond_e
    if-nez v5, :cond_f

    .line 132
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v14

    if-eqz v14, :cond_d

    :cond_f
    if-eqz v2, :cond_d

    .line 133
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v14

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v14

    .line 130
    :goto_8
    iput-object v14, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultPhoneCountry:Ljava/lang/String;

    .line 138
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v15

    if-eqz v15, :cond_10

    .line 139
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v15

    invoke-virtual {v15}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v15

    invoke-virtual {v15}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getPhone()Ljava/lang/String;

    move-result-object v15

    goto :goto_9

    :cond_10
    if-nez v5, :cond_11

    .line 140
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v15

    if-eqz v15, :cond_12

    :cond_11
    if-eqz v2, :cond_12

    .line 141
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v15

    goto :goto_9

    :cond_12
    move-object v15, v10

    .line 138
    :goto_9
    iput-object v15, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultPhone:Ljava/lang/String;

    move-object/from16 v16, v15

    .line 146
    sget-object v15, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    if-nez v16, :cond_13

    .line 148
    const-string v16, ""

    :cond_13
    const/16 v21, 0x1c

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v14

    .line 146
    invoke-static/range {v15 .. v22}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v14

    iput-object v14, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 151
    invoke-virtual {v14}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v15

    new-instance v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda8;

    invoke-direct {v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda8;-><init>()V

    invoke-static {v15, v7}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phone:Lkotlinx/coroutines/flow/StateFlow;

    .line 155
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v15

    if-eqz v15, :cond_14

    .line 156
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object v3

    goto :goto_a

    :cond_14
    if-nez v4, :cond_15

    .line 157
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v3

    if-eqz v3, :cond_16

    :cond_15
    if-eqz v2, :cond_16

    .line 158
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->asAddressModel(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;)Lcom/stripe/android/model/Address;

    move-result-object v3

    goto :goto_a

    :cond_16
    move-object v3, v10

    .line 155
    :goto_a
    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultAddress:Lcom/stripe/android/model/Address;

    .line 163
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v15

    invoke-virtual {v15}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v15

    if-eqz v15, :cond_17

    .line 164
    invoke-static {v15, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 165
    sget-object v15, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v15}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v15

    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_17

    .line 166
    invoke-static {v2}, Lkotlin/text/StringsKt;->toBooleanStrictOrNull(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 167
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 168
    new-instance v15, Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    .line 169
    sget-object v16, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    move-object/from16 p3, v10

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    .line 170
    new-instance v1, Lcom/stripe/android/uicore/elements/SameAsShippingController;

    invoke-direct {v1, v2}, Lcom/stripe/android/uicore/elements/SameAsShippingController;-><init>(Z)V

    .line 168
    invoke-direct {v15, v10, v1}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingController;)V

    goto :goto_b

    :cond_17
    move-object/from16 p3, v10

    move-object/from16 v15, p3

    .line 167
    :goto_b
    iput-object v15, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    .line 174
    const-string v1, "billing_details[address]"

    if-eqz p5, :cond_1b

    .line 176
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v17

    if-eqz v3, :cond_18

    .line 177
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->asFormFieldValues(Lcom/stripe/android/model/Address;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_19
    move-object/from16 v18, v2

    .line 180
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v10

    invoke-static {v2, v10}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v24, v2

    goto :goto_c

    :cond_1a
    move-object/from16 v24, p3

    .line 175
    :goto_c
    new-instance v16, Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;

    const/16 v27, 0x23c

    const/16 v28, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, p5

    move-object/from16 v23, v15

    invoke-direct/range {v16 .. v28}, Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v23

    move-object/from16 v2, v16

    goto :goto_d

    :cond_1b
    move-object/from16 v22, v15

    move-object/from16 v2, p3

    .line 174
    :goto_d
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->autocompleteAddressElement:Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;

    if-eqz v2, :cond_1c

    .line 184
    check-cast v2, Lcom/stripe/android/uicore/elements/AddressFieldsElement;

    goto :goto_f

    :cond_1c
    new-instance v16, Lcom/stripe/android/uicore/elements/AddressElement;

    .line 185
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v17

    if-eqz v3, :cond_1d

    .line 186
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->asFormFieldValues(Lcom/stripe/android/model/Address;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_1e

    :cond_1d
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_1e
    move-object/from16 v18, v1

    .line 188
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v1

    if-eqz v1, :cond_1f

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Ljava/util/Map;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_e

    :cond_1f
    move-object/from16 v23, p3

    :goto_e
    const/16 v26, 0x19c

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 184
    invoke-direct/range {v16 .. v27}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    check-cast v2, Lcom/stripe/android/uicore/elements/AddressFieldsElement;

    :goto_f
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->addressElement:Lcom/stripe/android/uicore/elements/AddressFieldsElement;

    if-nez v3, :cond_20

    .line 194
    invoke-static/range {p3 .. p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    goto :goto_10

    .line 196
    :cond_20
    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/AddressFieldsElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda9;

    invoke-direct {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {v1, v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 193
    :goto_10
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->address:Lkotlinx/coroutines/flow/StateFlow;

    if-eqz v4, :cond_21

    .line 203
    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/AddressFieldsElement;->getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda10;

    invoke-direct {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda10;-><init>()V

    invoke-static {v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    goto :goto_11

    :cond_21
    if-eqz v5, :cond_22

    .line 205
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    goto :goto_11

    :cond_22
    if-eqz v6, :cond_23

    .line 207
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getEmail()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    goto :goto_11

    :cond_23
    if-eqz v8, :cond_24

    .line 209
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    goto :goto_11

    .line 211
    :cond_24
    invoke-static/range {p3 .. p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 202
    :goto_11
    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;

    .line 215
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInput()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;->getSaveForFutureUse()Z

    move-result v3

    goto :goto_12

    :cond_25
    const/4 v3, 0x0

    :goto_12
    iput-boolean v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseInitialValue:Z

    .line 217
    new-instance v4, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    .line 219
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getMerchantName()Ljava/lang/String;

    move-result-object v5

    .line 217
    invoke-direct {v4, v3, v5}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;-><init>(ZLjava/lang/String;)V

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    .line 222
    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->getSaveForFutureUse()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 225
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v4

    if-eqz v4, :cond_26

    check-cast v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/utils/SelectionUtilsKt;->getSetAsDefaultPaymentMethodFromPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_26

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_13

    :cond_26
    const/4 v4, 0x0

    :goto_13
    iput-boolean v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setAsDefaultInitialValue:Z

    .line 228
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSetAsDefaultPaymentMethodEnabled()Z

    move-result v5

    if-eqz v5, :cond_27

    .line 229
    new-instance v5, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    .line 232
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSetAsDefaultMatchesSaveForFutureUse()Z

    move-result v6

    .line 229
    invoke-direct {v5, v4, v3, v6}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;-><init>(ZLkotlinx/coroutines/flow/StateFlow;Z)V

    goto :goto_14

    :cond_27
    move-object/from16 v5, p3

    .line 228
    :goto_14
    iput-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setAsDefaultPaymentMethodElement:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    .line 238
    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->determineInitialState()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v4

    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 240
    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda11;

    invoke-direct {v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda11;-><init>()V

    invoke-static {v11, v13, v7, v1, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->billingDetails:Lkotlinx/coroutines/flow/StateFlow;

    .line 245
    check-cast v4, Lkotlinx/coroutines/flow/StateFlow;

    .line 244
    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda12;

    invoke-direct {v6, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda12;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)V

    invoke-static {v4, v3, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->currentScreenState:Lkotlinx/coroutines/flow/StateFlow;

    const/4 v4, 0x7

    move-object/from16 v7, p3

    const/4 v6, 0x0

    .line 258
    invoke-static {v6, v6, v7, v4, v7}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_analyticsEvent:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 259
    invoke-static {v4}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->analyticsEvent:Lkotlinx/coroutines/flow/SharedFlow;

    if-eqz v5, :cond_28

    .line 264
    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;->getController()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

    move-result-object v4

    if-eqz v4, :cond_28

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;->getSetAsDefaultPaymentMethodChecked()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    if-nez v4, :cond_29

    :cond_28
    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 261
    :cond_29
    new-instance v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v5, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)V

    invoke-static {v3, v1, v4, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->linkedAccount:Lkotlinx/coroutines/flow/StateFlow;

    .line 270
    invoke-interface {v9}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v1, v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 271
    invoke-interface {v12}, Lcom/stripe/android/uicore/elements/TextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 272
    invoke-virtual {v14}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda4;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v4, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 273
    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/AddressFieldsElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    new-instance v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda5;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {v2, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 269
    new-instance v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda6;

    invoke-direct {v5, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)V

    invoke-static {v1, v3, v4, v2, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields:Lkotlinx/coroutines/flow/StateFlow;

    .line 293
    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$1;

    const/4 v8, 0x0

    invoke-direct {v1, v0, v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 301
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v7

    goto :goto_15

    :cond_2a
    move-object v7, v8

    :goto_15
    if-eqz v7, :cond_2b

    .line 302
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v1

    .line 303
    :cond_2b
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    if-eqz v1, :cond_2c

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v10

    goto :goto_16

    :cond_2c
    move-object v10, v8

    :goto_16
    if-eqz v10, :cond_2d

    .line 304
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v1

    .line 306
    :cond_2d
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    return-void
.end method

.method public static final synthetic access$handleInstantDebitsResult(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V

    return-void
.end method

.method private static final address$lambda$9(Ljava/util/List;)Lcom/stripe/android/model/Address;
    .locals 3

    const-string v0, "formFieldValues"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    .line 907
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 908
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v1, Ljava/util/Map;

    .line 909
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 910
    check-cast v0, Lkotlin/Pair;

    .line 197
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 910
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 198
    :cond_0
    sget-object p0, Lcom/stripe/android/model/Address;->Companion:Lcom/stripe/android/model/Address$Companion;

    invoke-static {p0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->fromFormFieldValues(Lcom/stripe/android/model/Address$Companion;Ljava/util/Map;)Lcom/stripe/android/model/Address;

    move-result-object p0

    return-object p0
.end method

.method private static final billingDetails$lambda$11(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-direct {v0, p3, p1, p0, p2}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final buildMandateText(ZZ)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 6

    .line 751
    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;

    .line 752
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->formattedMerchantName()Ljava/lang/String;

    move-result-object v1

    .line 755
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v4

    .line 756
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isPaymentFlow()Z

    move-result v2

    xor-int/lit8 v5, v2, 0x1

    move v2, p1

    move v3, p2

    .line 751
    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;->buildMandateAndMicrodepositsText(Ljava/lang/String;ZZZZ)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method

.method static synthetic buildMandateText$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 749
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 747
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText(ZZ)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private final collectBankAccount(Ljava/lang/String;)V
    .locals 1

    .line 522
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getHasLaunched()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 523
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    if-eqz p1, :cond_1

    .line 526
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountForIntent(Ljava/lang/String;)V

    return-void

    .line 528
    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountForDeferredIntent()V

    return-void
.end method

.method private final collectBankAccountForDeferredIntent()V
    .locals 10

    .line 631
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getStripeIntentId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->createInstantDebitsConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    goto :goto_0

    .line 636
    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->createUSBankAccountConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    :goto_0
    move-object v4, v0

    .line 639
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isPaymentFlow()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 640
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v1, :cond_5

    .line 641
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 642
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v3

    .line 646
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v7

    .line 647
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v0

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/Amount;->getValue()J

    move-result-wide v8

    long-to-int v0, v8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    :cond_2
    move-object v8, v6

    .line 648
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/Amount;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    :cond_3
    move-object v9, v6

    const/4 v6, 0x0

    .line 640
    invoke-interface/range {v1 .. v9}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithDeferredPayment(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void

    .line 651
    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v1, :cond_5

    .line 652
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 653
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v3

    .line 657
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getOnBehalfOf()Ljava/lang/String;

    move-result-object v7

    const/4 v6, 0x0

    .line 651
    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithDeferredSetup(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private final collectBankAccountForIntent(Ljava/lang/String;)V
    .locals 4

    .line 533
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 534
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->createInstantDebitsConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    goto :goto_0

    .line 536
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->createUSBankAccountConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    .line 538
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_analyticsEvent:Lkotlinx/coroutines/flow/MutableSharedFlow;

    sget-object v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Started;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Started;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    .line 539
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isPaymentFlow()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 540
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v1, :cond_2

    .line 541
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 542
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v3

    .line 540
    invoke-interface {v1, v2, v3, p1, v0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithPaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    return-void

    .line 547
    :cond_1
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v1, :cond_2

    .line 548
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    .line 549
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v3

    .line 547
    invoke-interface {v1, v2, v3, p1, v0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    :cond_2
    return-void
.end method

.method private final createInstantDebitsConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;
    .locals 3

    .line 557
    new-instance v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    .line 558
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 559
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->makeElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v2

    .line 557
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-object v0
.end method

.method private final createNewPaymentSelection(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 669
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getShowCheckbox()Z

    move-result v2

    .line 670
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 668
    invoke-static {v2, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->customerRequestedSave(ZZ)Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v9

    .line 674
    instance-of v10, v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;

    if-eqz v10, :cond_0

    .line 675
    sget-object v2, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 677
    const-string v3, "PaymentSheet"

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    .line 678
    iget-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getPaymentMethodSaveConsentBehavior()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-result-object v4

    .line 679
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getHasIntentToSetup()Z

    move-result v5

    .line 678
    invoke-interface {v4, v5, v9}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;->allowRedisplay(ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object v4

    const/4 v5, 0x1

    .line 675
    invoke-virtual {v2, v5, v3, v4}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createInstantDebits(ZLjava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    :goto_0
    move-object/from16 v26, v2

    goto :goto_1

    .line 684
    :cond_0
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;

    if-eqz v2, :cond_8

    .line 685
    sget-object v2, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 686
    new-instance v3, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    .line 687
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;->getId()Ljava/lang/String;

    move-result-object v4

    .line 686
    invoke-direct {v3, v4}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;)V

    .line 690
    iget-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getPaymentMethodSaveConsentBehavior()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-result-object v4

    .line 691
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getHasIntentToSetup()Z

    move-result v5

    .line 690
    invoke-interface {v4, v5, v9}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;->allowRedisplay(ZLcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p4

    .line 685
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    goto :goto_0

    :goto_1
    const/4 v2, 0x0

    if-eqz v10, :cond_1

    .line 698
    move-object v3, v1

    check-cast v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;

    goto :goto_2

    :cond_1
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_2

    .line 699
    new-instance v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;

    .line 700
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v3

    const v24, 0x1fffdf

    const/16 v25, 0x0

    move-object v5, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object v6, v4

    const/4 v4, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v27, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object v1, v8

    move-object/from16 v29, v28

    move-object/from16 v8, p4

    invoke-static/range {v2 .. v25}, Lcom/stripe/android/model/PaymentMethod;->copy$default(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    move-object v4, v8

    .line 703
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v3

    .line 699
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/LinkMode;)V

    move-object v9, v1

    goto :goto_3

    :cond_2
    move-object/from16 v4, p4

    move-object/from16 v29, v9

    const/4 v9, 0x0

    :goto_3
    move-object/from16 v1, p1

    .line 707
    instance-of v1, v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;

    if-eqz v1, :cond_3

    .line 708
    new-instance v2, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    .line 709
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getHasIntentToSetup()Z

    move-result v1

    move-object/from16 v11, v29

    invoke-static {v11, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getSetupFutureUseValue(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Z)Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object v1

    .line 708
    invoke-direct {v2, v1}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    goto :goto_4

    :cond_3
    move-object/from16 v11, v29

    const/4 v2, 0x0

    :goto_4
    if-eqz p2, :cond_4

    .line 716
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    .line 717
    sget v3, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_payment_method_item_card_number:I

    .line 718
    filled-new-array/range {p2 .. p2}, [Ljava/lang/Object;

    move-result-object v5

    .line 716
    invoke-virtual {v1, v3, v5}, Landroid/app/Application;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    :goto_5
    if-nez v1, :cond_5

    .line 723
    const-string v1, "\u2022\u2022\u2022\u2022"

    :cond_5
    move-object v5, v1

    .line 724
    sget-object v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;

    const/4 v3, 0x0

    const/4 v6, 0x2

    move-object/from16 v7, p3

    const/4 v12, 0x0

    invoke-static {v1, v7, v3, v6, v12}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;->invoke$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;Ljava/lang/String;IILjava/lang/Object;)I

    move-result v6

    .line 728
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->currentScreenState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 730
    new-instance v13, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;

    .line 731
    iget-object v1, v4, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, ""

    :cond_6
    move-object v14, v1

    .line 732
    iget-object v15, v4, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    .line 733
    iget-object v1, v4, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->phone:Ljava/lang/String;

    .line 734
    iget-object v3, v4, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->address:Lcom/stripe/android/model/Address;

    .line 735
    iget-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    .line 730
    invoke-direct/range {v13 .. v18}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Z)V

    .line 737
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setAsDefaultPaymentMethodElement:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    if-eqz v1, :cond_7

    .line 738
    new-instance v1, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;

    .line 739
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setAsDefaultPaymentMethodElement:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;->getController()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;->getShouldPaymentMethodBeSetAsDefault()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    .line 738
    invoke-direct {v1, v3}, Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;-><init>(Ljava/lang/Boolean;)V

    move-object v12, v1

    .line 722
    :cond_7
    new-instance v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    .line 726
    check-cast v2, Lcom/stripe/android/model/PaymentMethodOptionsParams;

    .line 737
    check-cast v12, Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-object v7, v13

    move-object/from16 v10, v26

    move-object v13, v12

    move-object v12, v2

    .line 722
    invoke-direct/range {v4 .. v13}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;-><init>(Ljava/lang/String;ILcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V

    return-object v4

    .line 673
    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final createUSBankAccountConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;
    .locals 4

    .line 564
    new-instance v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    .line 565
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 566
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 567
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->makeElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object v3

    .line 564
    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-object v0
.end method

.method private static final currentScreenState$lambda$13(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->isVerifyingWithMicrodeposits()Z

    move-result v0

    .line 249
    invoke-direct {p0, v0, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText(ZZ)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 255
    :goto_0
    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenStateKt;->updateWithMandate(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object p0

    return-object p0
.end method

.method private final determineInitialState()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;
    .locals 3

    .line 514
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getScreenState()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v0

    return-object v0

    .line 517
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->toInitialState$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v0

    return-object v0
.end method

.method private static final email$lambda$3(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 2

    const-string v0, "formFieldEntry"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private final emitFinishedEvent(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V
    .locals 5

    .line 375
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 376
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_analyticsEvent:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 377
    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;

    if-eqz v0, :cond_1

    .line 379
    const-string p1, "completed"

    goto :goto_1

    .line 380
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;

    if-eqz v0, :cond_2

    const-string p1, "failed"

    goto :goto_1

    .line 381
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Cancelled;

    if-eqz p1, :cond_4

    const-string p1, "cancelled"

    :goto_1
    if-eqz v2, :cond_3

    .line 384
    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    .line 377
    :goto_2
    invoke-direct {v4, p1, v1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    .line 376
    invoke-interface {v3, v4}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 378
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final emitFinishedEvent(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V
    .locals 5

    .line 390
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 391
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_analyticsEvent:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 392
    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;

    if-eqz v0, :cond_1

    .line 394
    const-string p1, "completed"

    goto :goto_1

    .line 395
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    if-eqz v0, :cond_2

    const-string p1, "failed"

    goto :goto_1

    .line 396
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Cancelled;

    if-eqz p1, :cond_5

    const-string p1, "cancelled"

    :goto_1
    if-eqz v2, :cond_3

    .line 398
    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getUsBankAccountData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_4

    .line 399
    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 392
    :cond_4
    invoke-direct {v4, p1, v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent$Finished;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    .line 391
    invoke-interface {v3, v4}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-void

    .line 393
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic getCollectBankAccountLauncher$annotations()V
    .locals 0

    return-void
.end method

.method private final getHasLaunched()Z
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final getShouldReset()Z
    .locals 2

    .line 318
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "should_reset"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final handleCompletedBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;)V
    .locals 1

    .line 407
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 408
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getUsBankAccountData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 411
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->handleResultForACH(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Ljava/lang/String;)V

    return-void

    .line 413
    :cond_1
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private final handleCompletedInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;)V
    .locals 12

    .line 420
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 881
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 882
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 422
    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    .line 423
    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$PaymentMethod;-><init>(Lcom/stripe/android/model/PaymentMethod;)V

    check-cast v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;

    .line 424
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getBankName()Ljava/lang/String;

    move-result-object v5

    .line 425
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getLast4()Ljava/lang/String;

    move-result-object v6

    .line 426
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-interface {v7}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_1
    move-object v7, v8

    :goto_0
    const/4 v9, 0x2

    const/4 v10, 0x0

    .line 428
    invoke-static {p0, v10, v10, v9, v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    .line 430
    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;->getEligibleForIncentive()Z

    move-result v11

    const/4 v8, 0x0

    .line 422
    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZZ)V

    .line 421
    invoke-static {v2, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenStateKt;->updateWithLinkedBankAccount(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v2

    .line 883
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V
    .locals 1

    const/4 v0, 0x0

    .line 359
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    .line 360
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emitFinishedEvent(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V

    .line 362
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;

    if-eqz v0, :cond_0

    .line 363
    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->handleCompletedInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;)V

    return-void

    .line 365
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;

    if-eqz v0, :cond_1

    .line 366
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void

    .line 368
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Cancelled;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 369
    invoke-static {p0, v0, p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    return-void

    .line 361
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handleResultForACH(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Ljava/lang/String;)V
    .locals 30

    move-object/from16 v0, p0

    .line 440
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v1

    .line 441
    instance-of v2, v1, Lcom/stripe/android/financialconnections/model/BankAccount;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    .line 442
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 886
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 887
    move-object v7, v6

    check-cast v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 444
    new-instance v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    .line 445
    new-instance v9, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;

    .line 446
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v10

    .line 445
    invoke-direct {v9, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;-><init>(Ljava/lang/String;)V

    check-cast v9, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;

    .line 448
    move-object v10, v1

    check-cast v10, Lcom/stripe/android/financialconnections/model/BankAccount;

    move-object v11, v10

    invoke-virtual {v11}, Lcom/stripe/android/financialconnections/model/BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v10

    move-object v12, v11

    .line 449
    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/model/BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v11

    .line 451
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    .line 452
    invoke-static {v0, v14, v5, v4, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v14

    .line 453
    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/model/BankAccount;->getUsesMicrodeposits()Z

    move-result v15

    const/16 v17, 0x80

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p2

    .line 444
    invoke-direct/range {v8 .. v18}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 443
    invoke-static {v7, v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenStateKt;->updateWithLinkedBankAccount(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v7

    .line 888
    invoke-interface {v2, v6, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    .line 459
    :cond_1
    instance-of v2, v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    if-eqz v2, :cond_3

    .line 460
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 891
    :cond_2
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 892
    move-object v7, v6

    check-cast v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 462
    new-instance v19, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    .line 463
    new-instance v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;

    .line 464
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v9

    .line 463
    invoke-direct {v8, v9}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier$Session;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v8

    check-cast v20, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;

    .line 466
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getInstitutionName()Ljava/lang/String;

    move-result-object v21

    .line 467
    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getLast4()Ljava/lang/String;

    move-result-object v22

    .line 469
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v24

    .line 470
    invoke-static {v0, v5, v5, v4, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v25

    const/16 v28, 0x80

    const/16 v29, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v23, p2

    .line 462
    invoke-direct/range {v19 .. v29}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v19

    .line 461
    invoke-static {v7, v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenStateKt;->updateWithLinkedBankAccount(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v7

    .line 893
    invoke-interface {v2, v6, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_0
    return-void

    :cond_3
    if-nez v1, :cond_4

    .line 478
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void

    .line 440
    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private static final lastTextFieldIdentifier$lambda$10(Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p0
.end method

.method private static final linkedAccount$lambda$14(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Z)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 0

    const-string p3, "state"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "billingDetails"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->toPaymentSelection(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object p0

    return-object p0
.end method

.method private final makeElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 10

    .line 572
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getStripeIntentId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 573
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getIncentive()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 576
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 577
    new-instance v1, Lcom/stripe/android/model/IncentiveEligibilitySession$DeferredIntent;

    invoke-direct {v1, v0}, Lcom/stripe/android/model/IncentiveEligibilitySession$DeferredIntent;-><init>(Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/model/IncentiveEligibilitySession;

    :goto_0
    move-object v9, v1

    goto :goto_1

    .line 578
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isPaymentFlow()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 579
    new-instance v1, Lcom/stripe/android/model/IncentiveEligibilitySession$PaymentIntent;

    invoke-direct {v1, v0}, Lcom/stripe/android/model/IncentiveEligibilitySession$PaymentIntent;-><init>(Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/model/IncentiveEligibilitySession;

    goto :goto_0

    .line 581
    :cond_1
    new-instance v1, Lcom/stripe/android/model/IncentiveEligibilitySession$SetupIntent;

    invoke-direct {v1, v0}, Lcom/stripe/android/model/IncentiveEligibilitySession$SetupIntent;-><init>(Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/model/IncentiveEligibilitySession;

    goto :goto_0

    :cond_2
    move-object v9, v2

    .line 587
    :goto_1
    new-instance v3, Lcom/stripe/android/financialconnections/ElementsSessionContext;

    .line 588
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/Amount;->getValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_3
    move-object v4, v2

    .line 589
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/Amount;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    :cond_4
    move-object v5, v2

    .line 590
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v6

    .line 591
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->makeElementsSessionContextBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    move-result-object v7

    .line 592
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->makePrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    move-result-object v8

    .line 587
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/financialconnections/ElementsSessionContext;-><init>(Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/model/IncentiveEligibilitySession;)V

    return-object v3
.end method

.method private final makeElementsSessionContextBillingDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;
    .locals 13

    .line 598
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAttachDefaultsToPaymentMethod()Z

    move-result v0

    .line 599
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingName:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :cond_1
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 600
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingEmail:Z

    if-nez v4, :cond_3

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v3

    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 601
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phone:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingPhone:Z

    if-nez v5, :cond_5

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v3

    :cond_5
    :goto_2
    check-cast v4, Ljava/lang/String;

    .line 602
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->address:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/Address;

    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectingAddress:Z

    if-nez v6, :cond_7

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    move-object v5, v3

    :cond_7
    :goto_3
    check-cast v5, Lcom/stripe/android/model/Address;

    if-eqz v2, :cond_8

    .line 607
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_4
    if-eqz v5, :cond_9

    .line 610
    new-instance v6, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    .line 611
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v7

    .line 612
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v8

    .line 613
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v9

    .line 614
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v10

    .line 615
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v11

    .line 616
    invoke-virtual {v5}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v12

    .line 610
    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v6

    .line 604
    :cond_9
    new-instance v2, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;

    invoke-direct {v2, v1, v4, v0, v3}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;)V

    return-object v2
.end method

.method private final makePrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;
    .locals 4

    .line 623
    new-instance v0, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    .line 624
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 625
    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phone:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v3

    .line 626
    :cond_3
    :goto_1
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v3

    .line 623
    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final name$lambda$1(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 1

    const-string v0, "formFieldEntry"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method private static final phone$lambda$5(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 2

    const-string v0, "formFieldEntry"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private static final requiredFields$lambda$15(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result p0

    return p0
.end method

.method private static final requiredFields$lambda$16(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result p0

    return p0
.end method

.method private static final requiredFields$lambda$17(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result p0

    return p0
.end method

.method private static final requiredFields$lambda$19(Ljava/util/List;)Z
    .locals 2

    const-string v0, "formFieldValues"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    check-cast p0, Ljava/lang/Iterable;

    .line 913
    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 914
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    .line 274
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_2
    return v1
.end method

.method private static final requiredFields$lambda$20(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;ZZZZ)Z
    .locals 3

    .line 277
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    move p2, v1

    goto :goto_0

    :cond_1
    move p2, v2

    :goto_0
    if-nez p3, :cond_2

    .line 283
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getPhone()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    move-result-object p1

    sget-object p3, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Always:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    if-eq p1, p3, :cond_3

    :cond_2
    if-nez p4, :cond_4

    .line 284
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Full:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    if-eq p0, p1, :cond_3

    goto :goto_1

    :cond_3
    move p0, v2

    goto :goto_2

    :cond_4
    :goto_1
    move p0, v1

    :goto_2
    if-eqz p2, :cond_5

    if-eqz p0, :cond_5

    return v1

    :cond_5
    return v2
.end method

.method public static synthetic reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 494
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private final setHasLaunched(Z)V
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final setShouldReset(Z)V
    .locals 2

    .line 319
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "should_reset"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final toPaymentSelection(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 2

    .line 763
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 766
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->getResultIdentifier()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;

    move-result-object v1

    .line 767
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->getBankName()Ljava/lang/String;

    move-result-object p1

    .line 768
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->getLast4()Ljava/lang/String;

    move-result-object v0

    .line 765
    invoke-direct {p0, v1, v0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->createNewPaymentSelection(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$ResultIdentifier;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final formattedMerchantName()Ljava/lang/String;
    .locals 5

    .line 510
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    .line 900
    check-cast v0, Ljava/lang/CharSequence;

    .line 901
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 902
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_1

    if-gez v2, :cond_0

    goto :goto_1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    .line 903
    invoke-interface {v0, v2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_2

    .line 905
    :cond_2
    :goto_1
    const-string v0, ""

    check-cast v0, Ljava/lang/CharSequence;

    .line 900
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getAddress()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/Address;",
            ">;"
        }
    .end annotation

    .line 193
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->address:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getAddressElement()Lcom/stripe/android/uicore/elements/AddressFieldsElement;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->addressElement:Lcom/stripe/android/uicore/elements/AddressFieldsElement;

    return-object v0
.end method

.method public final getAnalyticsEvent()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
            ">;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->analyticsEvent:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getCollectBankAccountLauncher()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-object v0
.end method

.method public final getCurrentScreenState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
            ">;"
        }
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->currentScreenState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getEmail()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getEmailController()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-object v0
.end method

.method public final getLastTextFieldIdentifier()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLinkedAccount()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            ">;"
        }
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->linkedAccount:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getName()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-object v0
.end method

.method public final getPhone()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phone:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    return-object v0
.end method

.method public final getRequiredFields()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getSameAsShippingElement()Lcom/stripe/android/uicore/elements/SameAsShippingElement;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    return-object v0
.end method

.method public final getSaveForFutureUseCheckedFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseCheckedFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getSaveForFutureUseElement()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    return-object v0
.end method

.method public final getSetAsDefaultPaymentMethodElement()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setAsDefaultPaymentMethodElement:Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;

    return-object v0
.end method

.method public final handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 341
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    .line 342
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emitFinishedEvent(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V

    .line 344
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    if-eqz v0, :cond_0

    .line 345
    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->handleCompletedBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;)V

    return-void

    .line 348
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    if-eqz v0, :cond_1

    .line 349
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void

    .line 352
    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Cancelled;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 353
    invoke-static {p0, v0, p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    return-void

    .line 343
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final handlePrimaryButtonClick()V
    .locals 3

    .line 484
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->currentScreenState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 485
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object v0

    if-nez v0, :cond_1

    .line 486
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 896
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 897
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    .line 487
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->processing()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object v2

    .line 898
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 490
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccount(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 502
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getShouldReset()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 503
    invoke-static {p0, v1, v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 505
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->unregister()V

    .line 506
    :cond_1
    iput-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method

.method public final register(Landroidx/activity/result/ActivityResultRegistryOwner;)V
    .locals 4

    const-string v0, "activityResultRegistryOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getInstantDebits()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    sget-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher;->Companion:Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;

    .line 324
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getHostedSurface()Ljava/lang/String;

    move-result-object v1

    .line 326
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v2

    .line 327
    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$register$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$register$1;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/reflect/KFunction;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 323
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;->createForPaymentSheet(Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    move-result-object p1

    goto :goto_0

    .line 330
    :cond_0
    sget-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->Companion:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;

    .line 331
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getHostedSurface()Ljava/lang/String;

    move-result-object v1

    .line 333
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v2

    .line 334
    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$register$2;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$register$2;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/reflect/KFunction;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 330
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->createForPaymentSheet(Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Landroidx/activity/result/ActivityResultRegistryOwner;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    move-result-object p1

    .line 322
    :goto_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method

.method public final reset(Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 2

    const/4 v0, 0x0

    .line 495
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    .line 496
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setShouldReset(Z)V

    .line 497
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->screenStateWithoutSaveForFutureUse:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-static {v1, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModelKt;->access$toInitialState(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 498
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->onValueChange(Z)V

    return-void
.end method

.method public final setCollectBankAccountLauncher(Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method
