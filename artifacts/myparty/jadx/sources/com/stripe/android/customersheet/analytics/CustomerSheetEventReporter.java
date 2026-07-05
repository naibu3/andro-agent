package com.stripe.android.customersheet.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.data.CustomerSheetSession;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: CustomerSheetEventReporter.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003345J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H&J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H&J\u0012\u0010+\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(H&J\u001a\u0010,\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020(H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H&¨\u00066"}, d2 = {"Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;", "", "onInit", "", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "onLoadSucceeded", "customerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "onLoadFailed", "error", "", "onScreenPresented", "screen", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;", "onScreenHidden", "onPaymentMethodSelected", "code", "", "onConfirmPaymentMethodSucceeded", "type", "syncDefaultEnabled", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "onConfirmPaymentMethodFailed", "onEditTapped", "onEditCompleted", "onRemovePaymentMethodSucceeded", "onRemovePaymentMethodFailed", "onAttachPaymentMethodSucceeded", "style", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;", "onAttachPaymentMethodCanceled", "onAttachPaymentMethodFailed", "onShowPaymentOptionBrands", "source", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;", "selectedBrand", "Lcom/stripe/android/model/CardBrand;", "onHidePaymentOptionBrands", "onBrandChoiceSelected", "onUpdatePaymentMethodSucceeded", "onUpdatePaymentMethodFailed", "onCardNumberCompleted", "onDisallowedCardBrandEntered", "brand", "onAnalyticsEvent", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", com.swmansion.rnscreens.Screen.TAG, "AddPaymentMethodStyle", "CardBrandChoiceEventSource", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetEventReporter {
    void onAnalyticsEvent(AnalyticsEvent event);

    void onAttachPaymentMethodCanceled(AddPaymentMethodStyle style);

    void onAttachPaymentMethodFailed(AddPaymentMethodStyle style);

    void onAttachPaymentMethodSucceeded(AddPaymentMethodStyle style);

    void onBrandChoiceSelected(CardBrandChoiceEventSource source, CardBrand selectedBrand);

    void onCardNumberCompleted();

    void onConfirmPaymentMethodFailed(String type, Boolean syncDefaultEnabled);

    void onConfirmPaymentMethodSucceeded(String type, Boolean syncDefaultEnabled);

    void onDisallowedCardBrandEntered(CardBrand brand);

    void onEditCompleted();

    void onEditTapped();

    void onHidePaymentOptionBrands(CardBrandChoiceEventSource source, CardBrand selectedBrand);

    void onInit(CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type integrationType);

    void onLoadFailed(Throwable error);

    void onLoadSucceeded(CustomerSheetSession customerSheetSession);

    void onPaymentMethodSelected(String code);

    void onRemovePaymentMethodFailed();

    void onRemovePaymentMethodSucceeded();

    void onScreenHidden(Screen screen);

    void onScreenPresented(Screen screen);

    void onShowPaymentOptionBrands(CardBrandChoiceEventSource source, CardBrand selectedBrand);

    void onUpdatePaymentMethodFailed(CardBrand selectedBrand, Throwable error);

    void onUpdatePaymentMethodSucceeded(CardBrand selectedBrand);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomerSheetEventReporter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AddPaymentMethod", "SelectPaymentMethod", "EditPaymentMethod", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Screen {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        private final String value;
        public static final Screen AddPaymentMethod = new Screen("AddPaymentMethod", 0, "add_payment_method");
        public static final Screen SelectPaymentMethod = new Screen("SelectPaymentMethod", 1, "select_payment_method");
        public static final Screen EditPaymentMethod = new Screen("EditPaymentMethod", 2, "edit_payment_method");

        private static final /* synthetic */ Screen[] $values() {
            return new Screen[]{AddPaymentMethod, SelectPaymentMethod, EditPaymentMethod};
        }

        public static EnumEntries<Screen> getEntries() {
            return $ENTRIES;
        }

        private Screen(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Screen[] screenArr$values = $values();
            $VALUES = screenArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(screenArr$values);
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomerSheetEventReporter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SetupIntent", "CreateAttach", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddPaymentMethodStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AddPaymentMethodStyle[] $VALUES;
        private final String value;
        public static final AddPaymentMethodStyle SetupIntent = new AddPaymentMethodStyle("SetupIntent", 0, "setup_intent");
        public static final AddPaymentMethodStyle CreateAttach = new AddPaymentMethodStyle("CreateAttach", 1, "create_attach");

        private static final /* synthetic */ AddPaymentMethodStyle[] $values() {
            return new AddPaymentMethodStyle[]{SetupIntent, CreateAttach};
        }

        public static EnumEntries<AddPaymentMethodStyle> getEntries() {
            return $ENTRIES;
        }

        private AddPaymentMethodStyle(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            AddPaymentMethodStyle[] addPaymentMethodStyleArr$values = $values();
            $VALUES = addPaymentMethodStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(addPaymentMethodStyleArr$values);
        }

        public static AddPaymentMethodStyle valueOf(String str) {
            return (AddPaymentMethodStyle) Enum.valueOf(AddPaymentMethodStyle.class, str);
        }

        public static AddPaymentMethodStyle[] values() {
            return (AddPaymentMethodStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CustomerSheetEventReporter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;", "", "<init>", "(Ljava/lang/String;I)V", "Add", "Edit", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardBrandChoiceEventSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardBrandChoiceEventSource[] $VALUES;
        public static final CardBrandChoiceEventSource Add = new CardBrandChoiceEventSource("Add", 0);
        public static final CardBrandChoiceEventSource Edit = new CardBrandChoiceEventSource("Edit", 1);

        private static final /* synthetic */ CardBrandChoiceEventSource[] $values() {
            return new CardBrandChoiceEventSource[]{Add, Edit};
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
