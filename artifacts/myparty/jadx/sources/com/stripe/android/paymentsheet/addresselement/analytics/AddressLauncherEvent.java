package com.stripe.android.paymentsheet.addresselement.analytics;

import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressLauncherEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "<init>", "()V", "additionalParams", "", "", "", "getAdditionalParams", "()Ljava/util/Map;", "Show", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "Companion", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AddressLauncherEvent implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final String FIELD_ADDRESS_COUNTRY_CODE = "address_country_code";
    public static final String FIELD_ADDRESS_DATA_BLOB = "address_data_blob";
    public static final String FIELD_AUTO_COMPLETE_RESULT_SELECTED = "auto_complete_result_selected";
    public static final String FIELD_EDIT_DISTANCE = "edit_distance";

    public /* synthetic */ AddressLauncherEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> getAdditionalParams();

    private AddressLauncherEvent() {
    }

    /* compiled from: AddressLauncherEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Show;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "country", "", "<init>", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Show extends AddressLauncherEvent {
        public static final int $stable = 0;
        private final String country;
        private final String eventName;

        public final String getCountry() {
            return this.country;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(String country) {
            super(null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
            this.eventName = "mc_address_show";
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEvent
        public Map<String, Object> getAdditionalParams() {
            return MapsKt.mapOf(TuplesKt.to(AddressLauncherEvent.FIELD_ADDRESS_DATA_BLOB, MapsKt.mapOf(TuplesKt.to(AddressLauncherEvent.FIELD_ADDRESS_COUNTRY_CODE, this.country))));
        }
    }

    /* compiled from: AddressLauncherEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent$Completed;", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEvent;", "country", "", "autocompleteResultSelected", "", "editDistance", "", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "getCountry", "()Ljava/lang/String;", "Ljava/lang/Integer;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "additionalParams", "", "", "getAdditionalParams", "()Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Completed extends AddressLauncherEvent {
        public static final int $stable = 0;
        private final boolean autocompleteResultSelected;
        private final String country;
        private final Integer editDistance;
        private final String eventName;

        public final String getCountry() {
            return this.country;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(String country, boolean z, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
            this.autocompleteResultSelected = z;
            this.editDistance = num;
            this.eventName = "mc_address_completed";
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEvent
        public Map<String, Object> getAdditionalParams() {
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(AddressLauncherEvent.FIELD_ADDRESS_COUNTRY_CODE, this.country), TuplesKt.to(AddressLauncherEvent.FIELD_AUTO_COMPLETE_RESULT_SELECTED, Boolean.valueOf(this.autocompleteResultSelected)));
            Integer num = this.editDistance;
            if (num != null) {
                mapMutableMapOf.put(AddressLauncherEvent.FIELD_EDIT_DISTANCE, Integer.valueOf(num.intValue()));
            }
            return MapsKt.mapOf(TuplesKt.to(AddressLauncherEvent.FIELD_ADDRESS_DATA_BLOB, mapMutableMapOf));
        }
    }
}
