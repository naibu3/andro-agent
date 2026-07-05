.class public final Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "InputAddressViewModel.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;,
        Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002LMB!\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001c\u00107\u001a\u00020\u00122\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u0008\u00109\u001a\u00020\u0014H\u0002J$\u0010:\u001a\u00020\u00122\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u00010\u00192\u0006\u00105\u001a\u00020\u0017J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0014H\u0007J\u000e\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0017J\u000e\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0017J\u0008\u0010B\u001a\u00020\u0017H\u0002J\u001c\u0010C\u001a\u00020\u00172\u0008\u0010D\u001a\u0004\u0018\u00010\u00142\u0008\u0010E\u001a\u0004\u0018\u00010\u0014H\u0002J\u0019\u0010F\u001a\u00020\u0017*\u0004\u0018\u00010\u001b2\u0008\u0010G\u001a\u0004\u0018\u00010\u001bH\u0082\u0004J\u000c\u0010H\u001a\u00020\u0014*\u00020IH\u0002J\u0010\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001f0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010%R\u0014\u0010)\u001a\u00020*X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010-\u001a\u00020.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0014\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00170#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010%R\u0014\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00170#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010%\u00a8\u0006N"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;",
        "args",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "navigator",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;)V",
        "getArgs",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "getNavigator",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "eventListener",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
        "",
        "initialBillingAddress",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "initialShippingAddress",
        "initialInputsAreTheSame",
        "",
        "unparsedBillingAddress",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "parsedBillingAddress",
        "_shippingSameAsBillingState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;",
        "previousUserInput",
        "setShippingSameAsShippingAtLeastOnce",
        "shippingSameAsBillingState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getShippingSameAsBillingState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_collectedAddress",
        "collectedAddress",
        "getCollectedAddress",
        "autocompleteConfig",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "getAutocompleteConfig",
        "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "addressFormController",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;",
        "getAddressFormController",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;",
        "_formEnabled",
        "formEnabled",
        "getFormEnabled",
        "_checkboxChecked",
        "checkboxChecked",
        "getCheckboxChecked",
        "register",
        "onEvent",
        "getCurrentAddress",
        "clickPrimaryButton",
        "completedFormValues",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "dismissWithAddress",
        "addressDetails",
        "clickBillingSameAsShipping",
        "newValue",
        "clickCheckbox",
        "canUseShippingSameAsBilling",
        "addressesAreTheSame",
        "addressOne",
        "addressTwo",
        "softEquals",
        "other",
        "toAddressDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "onAutocomplete",
        "country",
        "ShippingSameAsBillingState",
        "Factory",
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
.field private final _checkboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _collectedAddress:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final _formEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _shippingSameAsBillingState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;",
            ">;"
        }
    .end annotation
.end field

.field private final addressFormController:Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;

.field private final args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

.field private final autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

.field private final checkboxChecked:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final collectedAddress:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ">;"
        }
    .end annotation
.end field

.field private eventListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

.field private final formEnabled:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final initialBillingAddress:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private final initialInputsAreTheSame:Z

.field private final initialShippingAddress:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private final navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

.field private parsedBillingAddress:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private previousUserInput:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private setShippingSameAsShippingAtLeastOnce:Z

.field private final shippingSameAsBillingState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;",
            ">;"
        }
    .end annotation
.end field

.field private final unparsedBillingAddress:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;)V
    .locals 17
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "args"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "navigator"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "eventReporter"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 23
    iput-object v1, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    .line 24
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    .line 25
    iput-object v3, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    .line 29
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getBillingAddress$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {v0, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->toAddressDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->initialBillingAddress:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 30
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAddress()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    iput-object v4, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->initialShippingAddress:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 32
    invoke-direct {v0, v2, v4}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->addressesAreTheSame(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Z

    move-result v5

    iput-boolean v5, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->initialInputsAreTheSame:Z

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    .line 34
    invoke-static {v2, v3, v6, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap$default(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v3

    :goto_2
    iput-object v7, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->unparsedBillingAddress:Ljava/util/Map;

    .line 38
    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->canUseShippingSameAsBilling()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_6

    .line 39
    new-instance v7, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;

    if-eqz v2, :cond_3

    if-eqz v4, :cond_4

    :cond_3
    if-eqz v5, :cond_5

    :cond_4
    move v9, v6

    goto :goto_3

    :cond_5
    move v9, v8

    :goto_3
    invoke-direct {v7, v9}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;-><init>(Z)V

    check-cast v7, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;

    goto :goto_4

    .line 44
    :cond_6
    sget-object v7, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Hide;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Hide;

    check-cast v7, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;

    .line 37
    :goto_4
    invoke-static {v7}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v7

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_shippingSameAsBillingState:Lkotlinx/coroutines/flow/MutableStateFlow;

    if-eqz v5, :cond_8

    :cond_7
    move-object v5, v3

    goto :goto_5

    :cond_8
    if-eqz v4, :cond_7

    .line 51
    invoke-static {v4, v3, v6, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap$default(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    .line 48
    :goto_5
    iput-object v5, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->previousUserInput:Ljava/util/Map;

    .line 54
    invoke-interface {v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;

    .line 55
    instance-of v9, v5, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;

    if-eqz v9, :cond_9

    check-cast v5, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_9

    move v5, v6

    goto :goto_6

    :cond_9
    move v5, v8

    .line 54
    :goto_6
    iput-boolean v5, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->setShippingSameAsShippingAtLeastOnce:Z

    .line 58
    invoke-static {v7}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->shippingSameAsBillingState:Lkotlinx/coroutines/flow/StateFlow;

    if-nez v4, :cond_a

    goto :goto_7

    :cond_a
    move-object v2, v4

    .line 60
    :goto_7
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_collectedAddress:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 61
    move-object v4, v2

    check-cast v4, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->collectedAddress:Lkotlinx/coroutines/flow/StateFlow;

    .line 63
    new-instance v9, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    .line 64
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v4

    move-object v10, v4

    goto :goto_8

    :cond_b
    move-object v10, v3

    .line 65
    :goto_8
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    :cond_d
    move-object v11, v4

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    .line 63
    invoke-direct/range {v9 .. v14}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;-><init>(Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    .line 69
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-eqz v2, :cond_e

    invoke-static {v2, v3, v6, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap$default(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_f

    :cond_e
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    .line 71
    :cond_f
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v4

    .line 68
    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;

    .line 70
    move-object v7, v0

    check-cast v7, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    .line 68
    invoke-direct {v5, v2, v4, v7}, Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;-><init>(Ljava/util/Map;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;)V

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->addressFormController:Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;

    .line 74
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_formEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 75
    check-cast v2, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->formEnabled:Lkotlinx/coroutines/flow/StateFlow;

    .line 77
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_checkboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 78
    move-object v4, v2

    check-cast v4, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->checkboxChecked:Lkotlinx/coroutines/flow/StateFlow;

    .line 81
    move-object v4, v0

    check-cast v4, Landroidx/lifecycle/ViewModel;

    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$1;

    invoke-direct {v6, v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 111
    invoke-static {v4}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v11

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2;

    invoke-direct {v4, v0, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function2;

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 144
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAddress()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->isCheckboxSelected()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 145
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    :cond_10
    return-void
.end method

.method public static final synthetic access$getCurrentAddress(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->getCurrentAddress()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventListener$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->eventListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getParsedBillingAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->parsedBillingAddress:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getPreviousUserInput$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->previousUserInput:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getSetShippingSameAsShippingAtLeastOnce$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Z
    .locals 0

    .line 22
    iget-boolean p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->setShippingSameAsShippingAtLeastOnce:Z

    return p0
.end method

.method public static final synthetic access$getUnparsedBillingAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Ljava/util/Map;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->unparsedBillingAddress:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$get_collectedAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_collectedAddress:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_shippingSameAsBillingState$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_shippingSameAsBillingState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$setParsedBillingAddress$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Ljava/util/Map;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->parsedBillingAddress:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$setPreviousUserInput$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Ljava/util/Map;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->previousUserInput:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$setSetShippingSameAsShippingAtLeastOnce$p(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Z)V
    .locals 0

    .line 22
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->setShippingSameAsShippingAtLeastOnce:Z

    return-void
.end method

.method private final addressesAreTheSame(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_d

    if-nez p2, :cond_0

    goto/16 :goto_b

    .line 260
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 261
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 262
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    invoke-direct {p0, v1, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 263
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine2()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine2()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    invoke-direct {p0, v1, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 264
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCity()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, v2

    :goto_4
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCity()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_6
    move-object v3, v2

    :goto_5
    invoke-direct {p0, v1, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 265
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getState()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_7
    move-object v1, v2

    :goto_6
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getState()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_8
    move-object v3, v2

    :goto_7
    invoke-direct {p0, v1, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 266
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_9
    move-object v1, v2

    :goto_8
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    :cond_a
    move-object v3, v2

    :goto_9
    invoke-direct {p0, v1, v3}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 267
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getPostalCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_a

    :cond_b
    move-object p1, v2

    :goto_a
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    :cond_c
    invoke-direct {p0, p1, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->softEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    return p1

    :cond_d
    :goto_b
    return v0
.end method

.method private final canUseShippingSameAsBilling()Z
    .locals 3

    .line 235
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 236
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->initialBillingAddress:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-nez v2, :cond_0

    return v1

    .line 241
    :cond_0
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 243
    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;->getAllowedCountries()Ljava/util/Set;

    move-result-object v0

    .line 244
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    .line 245
    sget-object v0, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryUtils;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object v0

    .line 248
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_4
    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_5
    return v1
.end method

.method private final getCurrentAddress()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 12

    .line 154
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->addressFormController:Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;->getCurrentFormValues()Ljava/util/Map;

    move-result-object v0

    .line 156
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 157
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    .line 158
    :goto_0
    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    .line 159
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    .line 160
    :goto_1
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v3

    .line 161
    :goto_2
    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object v7, v3

    .line 162
    :goto_3
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine2()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_4
    move-object v8, v3

    .line 163
    :goto_4
    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_5
    move-object v9, v3

    .line 164
    :goto_5
    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v10}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getState()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v10

    goto :goto_6

    :cond_6
    move-object v10, v3

    .line 158
    :goto_6
    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v3

    :cond_7
    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v11, v4

    move-object v4, v3

    move-object v3, v11

    .line 156
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final softEquals(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 271
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    check-cast p1, Ljava/lang/CharSequence;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final toAddressDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 7

    .line 276
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v1

    .line 277
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v3

    .line 278
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v2

    .line 275
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final clickBillingSameAsShipping(Z)V
    .locals 7

    .line 207
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$clickBillingSameAsShipping$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;ZLkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final clickCheckbox(Z)V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_checkboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final clickPrimaryButton(Ljava/util/Map;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;Z)V"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->_formEnabled:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 176
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 177
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 178
    :goto_0
    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    if-eqz p1, :cond_1

    .line 179
    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz p1, :cond_2

    .line 180
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v1

    :goto_2
    if-eqz p1, :cond_3

    .line 181
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    if-eqz p1, :cond_4

    .line 182
    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine2()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object v7, v1

    :goto_4
    if-eqz p1, :cond_5

    .line 183
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_5
    move-object v8, v1

    :goto_5
    if-eqz p1, :cond_6

    .line 184
    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getState()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_6
    move-object v9, v1

    .line 178
    :goto_6
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_7

    .line 186
    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 187
    :cond_7
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 176
    invoke-direct {v0, v2, v3, v1, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 175
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->dismissWithAddress(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-void
.end method

.method public final dismissWithAddress(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V
    .locals 4

    const-string v0, "addressDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 195
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    .line 197
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->collectedAddress:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 198
    :goto_1
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->collectedAddress:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {p1, v3}, Lcom/stripe/android/paymentsheet/addresselement/AddressUtilsKt;->editDistance(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 195
    invoke-interface {v1, v0, v2, v3}, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;->onCompleted(Ljava/lang/String;ZLjava/lang/Integer;)V

    .line 201
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    .line 202
    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    .line 201
    invoke-interface {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method

.method public final getAddressFormController()Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->addressFormController:Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;

    return-object v0
.end method

.method public final getArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object v0
.end method

.method public getAutocompleteConfig()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->autocompleteConfig:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    return-object v0
.end method

.method public final getCheckboxChecked()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->checkboxChecked:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getCollectedAddress()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->collectedAddress:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getFormEnabled()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->formEnabled:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getNavigator()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    return-object v0
.end method

.method public final getShippingSameAsBillingState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->shippingSameAsBillingState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public onAutocomplete(Ljava/lang/String;)V
    .locals 7

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$onAutocomplete$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$onAutocomplete$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public register(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;->eventListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method
