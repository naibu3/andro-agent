.class public interface abstract Lcom/stripe/android/paymentsheet/analytics/EventReporter;
.super Ljava/lang/Object;
.source "EventReporter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;,
        Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008`\u0018\u00002\u00020\u0001:\u0002^_J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tH&\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH&J\u0091\u0001\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001a0 2\u0006\u0010!\u001a\u00020\t2\u0008\u0010\"\u001a\u0004\u0018\u00010\t2\u0008\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020\t2\u0008\u0010%\u001a\u0004\u0018\u00010&H&\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\u0008\u0010,\u001a\u00020\u0003H&J\u0008\u0010-\u001a\u00020\u0003H&J\u0008\u0010.\u001a\u00020\u0003H&J\u0008\u0010/\u001a\u00020\u0003H&J\u0014\u00100\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00103\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00104\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00105\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0008\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001a\u0010?\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010@\u001a\u0004\u0018\u00010AH&J\u0018\u0010B\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020CH&J\u0012\u0010D\u001a\u00020\u00032\u0008\u0010E\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u001aH&J\u0008\u0010H\u001a\u00020\u0003H&J\u0008\u0010I\u001a\u00020\u0003H&J\u0018\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020:H&J\u0012\u0010N\u001a\u00020\u00032\u0008\u0010M\u001a\u0004\u0018\u00010:H&J\u001a\u0010O\u001a\u00020\u00032\u0008\u0010M\u001a\u0004\u0018\u00010:2\u0006\u0010)\u001a\u00020*H&J\u0012\u0010P\u001a\u00020\u00032\u0008\u0010Q\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020TH&J\u001a\u0010U\u001a\u00020\u00032\u0008\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020*H&J\u0014\u0010V\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0008\u0010W\u001a\u00020\u0003H&J\u0010\u0010X\u001a\u00020\u00032\u0006\u0010<\u001a\u00020YH&J\u0008\u0010Z\u001a\u00020\u0003H&J\u0008\u0010[\u001a\u00020\u0003H&J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\tH&\u00a8\u0006`"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "",
        "onInit",
        "",
        "commonConfiguration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "primaryButtonColor",
        "",
        "configurationSpecificPayload",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;",
        "isDeferred",
        "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V",
        "onLoadStarted",
        "initializedViaCompose",
        "onLoadSucceeded",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "linkEnabled",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "googlePaySupported",
        "linkDisplay",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
        "currency",
        "",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "orderedLpms",
        "",
        "requireCvcRecollection",
        "hasDefaultPaymentMethod",
        "setAsDefaultEnabled",
        "paymentMethodOptionsSetupFutureUsage",
        "setupFutureUsage",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V",
        "onLoadFailed",
        "error",
        "",
        "onElementsSessionLoadFailed",
        "onDismiss",
        "onShowExistingPaymentOptions",
        "onShowManageSavedPaymentMethods",
        "onShowNewPaymentOptions",
        "onSelectPaymentMethod",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "onRemoveSavedPaymentMethod",
        "onPaymentMethodFormShown",
        "onPaymentMethodFormInteraction",
        "onCardNumberCompleted",
        "onSelectPaymentOption",
        "onDisallowedCardBrandEntered",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "onAnalyticsEvent",
        "event",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "onPressConfirmButton",
        "onPaymentSuccess",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "onPaymentFailure",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;",
        "onLpmSpecFailure",
        "errorMessage",
        "onAutofill",
        "type",
        "onShowEditablePaymentOption",
        "onHideEditablePaymentOption",
        "onBrandChoiceSelected",
        "source",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;",
        "selectedBrand",
        "onUpdatePaymentMethodSucceeded",
        "onUpdatePaymentMethodFailed",
        "onSetAsDefaultPaymentMethodSucceeded",
        "paymentMethodType",
        "onExperimentExposure",
        "experiment",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;",
        "onSetAsDefaultPaymentMethodFailed",
        "onPaymentMethodFormCompleted",
        "onCannotProperlyReturnFromLinkAndOtherLPMs",
        "onUsBankAccountFormEvent",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;",
        "onShopPayWebViewLoadAttempt",
        "onShopPayWebViewConfirmSuccess",
        "onShopPayWebViewCancelled",
        "didReceiveECEClick",
        "Mode",
        "CardBrandChoiceEventSource",
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


# virtual methods
.method public abstract onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
.end method

.method public abstract onAutofill(Ljava/lang/String;)V
.end method

.method public abstract onBrandChoiceSelected(Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onCannotProperlyReturnFromLinkAndOtherLPMs()V
.end method

.method public abstract onCardNumberCompleted()V
.end method

.method public abstract onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onDismiss()V
.end method

.method public abstract onElementsSessionLoadFailed(Ljava/lang/Throwable;)V
.end method

.method public abstract onExperimentExposure(Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V
.end method

.method public abstract onHideEditablePaymentOption()V
.end method

.method public abstract onInit(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V
.end method

.method public abstract onLoadFailed(Ljava/lang/Throwable;)V
.end method

.method public abstract onLoadStarted(Z)V
.end method

.method public abstract onLoadSucceeded(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Z",
            "Lcom/stripe/android/model/LinkMode;",
            "Z",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Z",
            "Lcom/stripe/android/model/StripeIntent$Usage;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onLpmSpecFailure(Ljava/lang/String;)V
.end method

.method public abstract onPaymentFailure(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;)V
.end method

.method public abstract onPaymentMethodFormCompleted(Ljava/lang/String;)V
.end method

.method public abstract onPaymentMethodFormInteraction(Ljava/lang/String;)V
.end method

.method public abstract onPaymentMethodFormShown(Ljava/lang/String;)V
.end method

.method public abstract onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V
.end method

.method public abstract onPressConfirmButton(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
.end method

.method public abstract onRemoveSavedPaymentMethod(Ljava/lang/String;)V
.end method

.method public abstract onSelectPaymentMethod(Ljava/lang/String;)V
.end method

.method public abstract onSelectPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
.end method

.method public abstract onSetAsDefaultPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract onSetAsDefaultPaymentMethodSucceeded(Ljava/lang/String;)V
.end method

.method public abstract onShopPayWebViewCancelled(Z)V
.end method

.method public abstract onShopPayWebViewConfirmSuccess()V
.end method

.method public abstract onShopPayWebViewLoadAttempt()V
.end method

.method public abstract onShowEditablePaymentOption()V
.end method

.method public abstract onShowExistingPaymentOptions()V
.end method

.method public abstract onShowManageSavedPaymentMethods()V
.end method

.method public abstract onShowNewPaymentOptions()V
.end method

.method public abstract onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V
.end method

.method public abstract onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onUsBankAccountFormEvent(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)V
.end method
