package com.stripe.android.paymentsheet.addresselement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElementScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "", "route", "", "<init>", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "InputAddress", "Autocomplete", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$Autocomplete;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$InputAddress;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AddressElementScreen {
    public static final int $stable = 0;
    private final String route;

    public /* synthetic */ AddressElementScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AddressElementScreen(String str) {
        this.route = str;
    }

    public String getRoute() {
        return this.route;
    }

    /* compiled from: AddressElementScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$InputAddress;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InputAddress extends AddressElementScreen {
        public static final int $stable = 0;
        public static final InputAddress INSTANCE = new InputAddress();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputAddress)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1744313088;
        }

        public String toString() {
            return "InputAddress";
        }

        private InputAddress() {
            super("InputAddress", null);
        }
    }

    /* compiled from: AddressElementScreen.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$Autocomplete;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "country", "", "<init>", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Autocomplete extends AddressElementScreen {
        public static final int $stable = 0;
        public static final String countryArg = "country";
        public static final String route = "Autocomplete?country={country}";
        private final String country;

        public static /* synthetic */ Autocomplete copy$default(Autocomplete autocomplete, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autocomplete.country;
            }
            return autocomplete.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final Autocomplete copy(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            return new Autocomplete(country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Autocomplete) && Intrinsics.areEqual(this.country, ((Autocomplete) other).country);
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public String toString() {
            return "Autocomplete(country=" + this.country + ")";
        }

        public final String getCountry() {
            return this.country;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Autocomplete(String country) {
            super("Autocomplete?country=" + country, null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
        }
    }
}
