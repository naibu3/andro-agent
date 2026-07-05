package com.stripe.android.paymentsheet.analytics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.analytics.experiment.LoggableExperiment;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: EventReporter.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0002^_J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH&J\u0091\u0001\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\u0006\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&H&¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\u0014\u00100\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00103\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00104\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\u0014\u00105\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\b\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001a\u0010?\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010AH&J\u0018\u0010B\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020CH&J\u0012\u0010D\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u001aH&J\b\u0010H\u001a\u00020\u0003H&J\b\u0010I\u001a\u00020\u0003H&J\u0018\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020:H&J\u0012\u0010N\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010:H&J\u001a\u0010O\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010:2\u0006\u0010)\u001a\u00020*H&J\u0012\u0010P\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u001aH&J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020TH&J\u001a\u0010U\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020*H&J\u0014\u0010V\u001a\u00020\u00032\n\u00101\u001a\u00060\u001aj\u0002`2H&J\b\u0010W\u001a\u00020\u0003H&J\u0010\u0010X\u001a\u00020\u00032\u0006\u0010<\u001a\u00020YH&J\b\u0010Z\u001a\u00020\u0003H&J\b\u0010[\u001a\u00020\u0003H&J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\tH&¨\u0006`"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "", "onInit", "", "commonConfiguration", "Lcom/stripe/android/common/model/CommonConfiguration;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonColor", "", "configurationSpecificPayload", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;", "isDeferred", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ConfigurationSpecificPayload;Z)V", "onLoadStarted", "initializedViaCompose", "onLoadSucceeded", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkEnabled", "linkMode", "Lcom/stripe/android/model/LinkMode;", "googlePaySupported", "linkDisplay", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "currency", "", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "orderedLpms", "", "requireCvcRecollection", "hasDefaultPaymentMethod", "setAsDefaultEnabled", "paymentMethodOptionsSetupFutureUsage", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLcom/stripe/android/model/LinkMode;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;Ljava/lang/String;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZLcom/stripe/android/model/StripeIntent$Usage;)V", "onLoadFailed", "error", "", "onElementsSessionLoadFailed", "onDismiss", "onShowExistingPaymentOptions", "onShowManageSavedPaymentMethods", "onShowNewPaymentOptions", "onSelectPaymentMethod", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "onRemoveSavedPaymentMethod", "onPaymentMethodFormShown", "onPaymentMethodFormInteraction", "onCardNumberCompleted", "onSelectPaymentOption", "onDisallowedCardBrandEntered", "brand", "Lcom/stripe/android/model/CardBrand;", "onAnalyticsEvent", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "onPressConfirmButton", "onPaymentSuccess", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "onPaymentFailure", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "onLpmSpecFailure", "errorMessage", "onAutofill", "type", "onShowEditablePaymentOption", "onHideEditablePaymentOption", "onBrandChoiceSelected", "source", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;", "selectedBrand", "onUpdatePaymentMethodSucceeded", "onUpdatePaymentMethodFailed", "onSetAsDefaultPaymentMethodSucceeded", "paymentMethodType", "onExperimentExposure", "experiment", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;", "onSetAsDefaultPaymentMethodFailed", "onPaymentMethodFormCompleted", "onCannotProperlyReturnFromLinkAndOtherLPMs", "onUsBankAccountFormEvent", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;", "onShopPayWebViewLoadAttempt", "onShopPayWebViewConfirmSuccess", "onShopPayWebViewCancelled", "didReceiveECEClick", "Mode", "CardBrandChoiceEventSource", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EventReporter {
    void onAnalyticsEvent(AnalyticsEvent event);

    void onAutofill(String type);

    void onBrandChoiceSelected(CardBrandChoiceEventSource source, CardBrand selectedBrand);

    void onCannotProperlyReturnFromLinkAndOtherLPMs();

    void onCardNumberCompleted();

    void onDisallowedCardBrandEntered(CardBrand brand);

    void onDismiss();

    void onElementsSessionLoadFailed(Throwable error);

    void onExperimentExposure(LoggableExperiment experiment);

    void onHideEditablePaymentOption();

    void onInit(CommonConfiguration commonConfiguration, PaymentSheet.Appearance appearance, Boolean primaryButtonColor, PaymentSheetEvent.ConfigurationSpecificPayload configurationSpecificPayload, boolean isDeferred);

    void onLoadFailed(Throwable error);

    void onLoadStarted(boolean initializedViaCompose);

    void onLoadSucceeded(PaymentSelection paymentSelection, boolean linkEnabled, LinkMode linkMode, boolean googlePaySupported, PaymentSheet.LinkConfiguration.Display linkDisplay, String currency, PaymentElementLoader.InitializationMode initializationMode, FinancialConnectionsAvailability financialConnectionsAvailability, List<String> orderedLpms, boolean requireCvcRecollection, Boolean hasDefaultPaymentMethod, Boolean setAsDefaultEnabled, boolean paymentMethodOptionsSetupFutureUsage, StripeIntent.Usage setupFutureUsage);

    void onLpmSpecFailure(String errorMessage);

    void onPaymentFailure(PaymentSelection paymentSelection, PaymentSheetConfirmationError error);

    void onPaymentMethodFormCompleted(String code);

    void onPaymentMethodFormInteraction(String code);

    void onPaymentMethodFormShown(String code);

    void onPaymentSuccess(PaymentSelection paymentSelection, DeferredIntentConfirmationType deferredIntentConfirmationType);

    void onPressConfirmButton(PaymentSelection paymentSelection);

    void onRemoveSavedPaymentMethod(String code);

    void onSelectPaymentMethod(String code);

    void onSelectPaymentOption(PaymentSelection paymentSelection);

    void onSetAsDefaultPaymentMethodFailed(String paymentMethodType, Throwable error);

    void onSetAsDefaultPaymentMethodSucceeded(String paymentMethodType);

    void onShopPayWebViewCancelled(boolean didReceiveECEClick);

    void onShopPayWebViewConfirmSuccess();

    void onShopPayWebViewLoadAttempt();

    void onShowEditablePaymentOption();

    void onShowExistingPaymentOptions();

    void onShowManageSavedPaymentMethods();

    void onShowNewPaymentOptions();

    void onUpdatePaymentMethodFailed(CardBrand selectedBrand, Throwable error);

    void onUpdatePaymentMethodSucceeded(CardBrand selectedBrand);

    void onUsBankAccountFormEvent(USBankAccountFormViewModel.AnalyticsEvent event);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventReporter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Complete", TypedValues.Custom.NAME, "Embedded", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Complete = new Mode("Complete", 0, "complete");
        public static final Mode Custom = new Mode(TypedValues.Custom.NAME, 1, "custom");
        public static final Mode Embedded = new Mode("Embedded", 2, "embedded");
        private final String code;

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{Complete, Custom, Embedded};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(modeArr$values);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventReporter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$CardBrandChoiceEventSource;", "", "<init>", "(Ljava/lang/String;I)V", "Edit", "Add", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardBrandChoiceEventSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardBrandChoiceEventSource[] $VALUES;
        public static final CardBrandChoiceEventSource Edit = new CardBrandChoiceEventSource("Edit", 0);
        public static final CardBrandChoiceEventSource Add = new CardBrandChoiceEventSource("Add", 1);

        private static final /* synthetic */ CardBrandChoiceEventSource[] $values() {
            return new CardBrandChoiceEventSource[]{Edit, Add};
        }

        public static EnumEntries<CardBrandChoiceEventSource> getEntries() {
            return $ENTRIES;
        }

        private CardBrandChoiceEventSource(String str, int i) {
        }

        static {
            CardBrandChoiceEventSource[] cardBrandChoiceEventSourceArr$values = $values();
            $VALUES = cardBrandChoiceEventSourceArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(cardBrandChoiceEventSourceArr$values);
        }

        public static CardBrandChoiceEventSource valueOf(String str) {
            return (CardBrandChoiceEventSource) Enum.valueOf(CardBrandChoiceEventSource.class, str);
        }

        public static CardBrandChoiceEventSource[] values() {
            return (CardBrandChoiceEventSource[]) $VALUES.clone();
        }
    }
}
