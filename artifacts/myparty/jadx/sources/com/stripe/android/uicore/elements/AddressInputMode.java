package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.uicore.address.AutocompleteCapableInputMode;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressInputMode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressInputMode;", "Landroid/os/Parcelable;", "<init>", "()V", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "getPhoneNumberConfig", "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "getNameConfig", "AutocompleteCondensed", "AutocompleteExpanded", "NoAutocomplete", "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;", "Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;", "Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AddressInputMode implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ AddressInputMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AddressFieldConfiguration getNameConfig();

    public abstract AddressFieldConfiguration getPhoneNumberConfig();

    private AddressInputMode() {
    }

    /* compiled from: AddressInputMode.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;", "googleApiKey", "", "autocompleteCountries", "", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "onNavigation", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V", "getGoogleApiKey", "()Ljava/lang/String;", "getAutocompleteCountries", "()Ljava/util/Set;", "getPhoneNumberConfig", "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "getNameConfig", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutocompleteCondensed extends AddressInputMode implements AutocompleteCapableInputMode {
        private final Set<String> autocompleteCountries;
        private final String googleApiKey;
        private final AddressFieldConfiguration nameConfig;
        private final Function0<Unit> onNavigation;
        private final AddressFieldConfiguration phoneNumberConfig;
        public static final Parcelable.Creator<AutocompleteCondensed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressInputMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutocompleteCondensed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutocompleteCondensed createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new AutocompleteCondensed(string, linkedHashSet, AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutocompleteCondensed[] newArray(int i) {
                return new AutocompleteCondensed[i];
            }
        }

        public static /* synthetic */ AutocompleteCondensed copy$default(AutocompleteCondensed autocompleteCondensed, String str, Set set, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autocompleteCondensed.googleApiKey;
            }
            if ((i & 2) != 0) {
                set = autocompleteCondensed.autocompleteCountries;
            }
            if ((i & 4) != 0) {
                addressFieldConfiguration = autocompleteCondensed.phoneNumberConfig;
            }
            if ((i & 8) != 0) {
                addressFieldConfiguration2 = autocompleteCondensed.nameConfig;
            }
            if ((i & 16) != 0) {
                function0 = autocompleteCondensed.onNavigation;
            }
            Function0 function02 = function0;
            AddressFieldConfiguration addressFieldConfiguration3 = addressFieldConfiguration;
            return autocompleteCondensed.copy(str, set, addressFieldConfiguration3, addressFieldConfiguration2, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGoogleApiKey() {
            return this.googleApiKey;
        }

        public final Set<String> component2() {
            return this.autocompleteCountries;
        }

        /* renamed from: component3, reason: from getter */
        public final AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        public final Function0<Unit> component5() {
            return this.onNavigation;
        }

        public final AutocompleteCondensed copy(String googleApiKey, Set<String> autocompleteCountries, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, Function0<Unit> onNavigation) {
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            return new AutocompleteCondensed(googleApiKey, autocompleteCountries, phoneNumberConfig, nameConfig, onNavigation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutocompleteCondensed)) {
                return false;
            }
            AutocompleteCondensed autocompleteCondensed = (AutocompleteCondensed) other;
            return Intrinsics.areEqual(this.googleApiKey, autocompleteCondensed.googleApiKey) && Intrinsics.areEqual(this.autocompleteCountries, autocompleteCondensed.autocompleteCountries) && this.phoneNumberConfig == autocompleteCondensed.phoneNumberConfig && this.nameConfig == autocompleteCondensed.nameConfig && Intrinsics.areEqual(this.onNavigation, autocompleteCondensed.onNavigation);
        }

        public int hashCode() {
            String str = this.googleApiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Set<String> set = this.autocompleteCountries;
            return ((((((iHashCode + (set != null ? set.hashCode() : 0)) * 31) + this.phoneNumberConfig.hashCode()) * 31) + this.nameConfig.hashCode()) * 31) + this.onNavigation.hashCode();
        }

        public String toString() {
            return "AutocompleteCondensed(googleApiKey=" + this.googleApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ", phoneNumberConfig=" + this.phoneNumberConfig + ", nameConfig=" + this.nameConfig + ", onNavigation=" + this.onNavigation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.googleApiKey);
            Set<String> set = this.autocompleteCountries;
            if (set == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }
            dest.writeString(this.phoneNumberConfig.name());
            dest.writeString(this.nameConfig.name());
            dest.writeSerializable((Serializable) this.onNavigation);
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public boolean supportsAutoComplete(String str, boolean z) {
            return AutocompleteCapableInputMode.DefaultImpls.supportsAutoComplete(this, str, z);
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public Function0<Unit> getOnNavigation() {
            return this.onNavigation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutocompleteCondensed(String str, Set<String> set, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, Function0<Unit> onNavigation) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberConfig = phoneNumberConfig;
            this.nameConfig = nameConfig;
            this.onNavigation = onNavigation;
        }
    }

    /* compiled from: AddressInputMode.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;", "googleApiKey", "", "autocompleteCountries", "", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "onNavigation", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V", "getGoogleApiKey", "()Ljava/lang/String;", "getAutocompleteCountries", "()Ljava/util/Set;", "getPhoneNumberConfig", "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "getNameConfig", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutocompleteExpanded extends AddressInputMode implements AutocompleteCapableInputMode {
        private final Set<String> autocompleteCountries;
        private final String googleApiKey;
        private final AddressFieldConfiguration nameConfig;
        private final Function0<Unit> onNavigation;
        private final AddressFieldConfiguration phoneNumberConfig;
        public static final Parcelable.Creator<AutocompleteExpanded> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressInputMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutocompleteExpanded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutocompleteExpanded createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new AutocompleteExpanded(string, linkedHashSet, AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutocompleteExpanded[] newArray(int i) {
                return new AutocompleteExpanded[i];
            }
        }

        public static /* synthetic */ AutocompleteExpanded copy$default(AutocompleteExpanded autocompleteExpanded, String str, Set set, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autocompleteExpanded.googleApiKey;
            }
            if ((i & 2) != 0) {
                set = autocompleteExpanded.autocompleteCountries;
            }
            if ((i & 4) != 0) {
                addressFieldConfiguration = autocompleteExpanded.phoneNumberConfig;
            }
            if ((i & 8) != 0) {
                addressFieldConfiguration2 = autocompleteExpanded.nameConfig;
            }
            if ((i & 16) != 0) {
                function0 = autocompleteExpanded.onNavigation;
            }
            Function0 function02 = function0;
            AddressFieldConfiguration addressFieldConfiguration3 = addressFieldConfiguration;
            return autocompleteExpanded.copy(str, set, addressFieldConfiguration3, addressFieldConfiguration2, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final String getGoogleApiKey() {
            return this.googleApiKey;
        }

        public final Set<String> component2() {
            return this.autocompleteCountries;
        }

        /* renamed from: component3, reason: from getter */
        public final AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        public final Function0<Unit> component5() {
            return this.onNavigation;
        }

        public final AutocompleteExpanded copy(String googleApiKey, Set<String> autocompleteCountries, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, Function0<Unit> onNavigation) {
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            return new AutocompleteExpanded(googleApiKey, autocompleteCountries, phoneNumberConfig, nameConfig, onNavigation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutocompleteExpanded)) {
                return false;
            }
            AutocompleteExpanded autocompleteExpanded = (AutocompleteExpanded) other;
            return Intrinsics.areEqual(this.googleApiKey, autocompleteExpanded.googleApiKey) && Intrinsics.areEqual(this.autocompleteCountries, autocompleteExpanded.autocompleteCountries) && this.phoneNumberConfig == autocompleteExpanded.phoneNumberConfig && this.nameConfig == autocompleteExpanded.nameConfig && Intrinsics.areEqual(this.onNavigation, autocompleteExpanded.onNavigation);
        }

        public int hashCode() {
            String str = this.googleApiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Set<String> set = this.autocompleteCountries;
            return ((((((iHashCode + (set != null ? set.hashCode() : 0)) * 31) + this.phoneNumberConfig.hashCode()) * 31) + this.nameConfig.hashCode()) * 31) + this.onNavigation.hashCode();
        }

        public String toString() {
            return "AutocompleteExpanded(googleApiKey=" + this.googleApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ", phoneNumberConfig=" + this.phoneNumberConfig + ", nameConfig=" + this.nameConfig + ", onNavigation=" + this.onNavigation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.googleApiKey);
            Set<String> set = this.autocompleteCountries;
            if (set == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }
            dest.writeString(this.phoneNumberConfig.name());
            dest.writeString(this.nameConfig.name());
            dest.writeSerializable((Serializable) this.onNavigation);
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public boolean supportsAutoComplete(String str, boolean z) {
            return AutocompleteCapableInputMode.DefaultImpls.supportsAutoComplete(this, str, z);
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public String getGoogleApiKey() {
            return this.googleApiKey;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        @Override // com.stripe.android.uicore.address.AutocompleteCapableInputMode
        public Function0<Unit> getOnNavigation() {
            return this.onNavigation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutocompleteExpanded(String str, Set<String> set, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, Function0<Unit> onNavigation) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            Intrinsics.checkNotNullParameter(onNavigation, "onNavigation");
            this.googleApiKey = str;
            this.autocompleteCountries = set;
            this.phoneNumberConfig = phoneNumberConfig;
            this.nameConfig = nameConfig;
            this.onNavigation = onNavigation;
        }
    }

    /* compiled from: AddressInputMode.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "<init>", "(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V", "getPhoneNumberConfig", "()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "getNameConfig", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoAutocomplete extends AddressInputMode {
        private final AddressFieldConfiguration nameConfig;
        private final AddressFieldConfiguration phoneNumberConfig;
        public static final Parcelable.Creator<NoAutocomplete> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressInputMode.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoAutocomplete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoAutocomplete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoAutocomplete(AddressFieldConfiguration.valueOf(parcel.readString()), AddressFieldConfiguration.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoAutocomplete[] newArray(int i) {
                return new NoAutocomplete[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoAutocomplete() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoAutocomplete copy$default(NoAutocomplete noAutocomplete, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, int i, Object obj) {
            if ((i & 1) != 0) {
                addressFieldConfiguration = noAutocomplete.phoneNumberConfig;
            }
            if ((i & 2) != 0) {
                addressFieldConfiguration2 = noAutocomplete.nameConfig;
            }
            return noAutocomplete.copy(addressFieldConfiguration, addressFieldConfiguration2);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        public final NoAutocomplete copy(AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig) {
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            return new NoAutocomplete(phoneNumberConfig, nameConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoAutocomplete)) {
                return false;
            }
            NoAutocomplete noAutocomplete = (NoAutocomplete) other;
            return this.phoneNumberConfig == noAutocomplete.phoneNumberConfig && this.nameConfig == noAutocomplete.nameConfig;
        }

        public int hashCode() {
            return (this.phoneNumberConfig.hashCode() * 31) + this.nameConfig.hashCode();
        }

        public String toString() {
            return "NoAutocomplete(phoneNumberConfig=" + this.phoneNumberConfig + ", nameConfig=" + this.nameConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.phoneNumberConfig.name());
            dest.writeString(this.nameConfig.name());
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getPhoneNumberConfig() {
            return this.phoneNumberConfig;
        }

        public /* synthetic */ NoAutocomplete(AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration, (i & 2) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration2);
        }

        @Override // com.stripe.android.uicore.elements.AddressInputMode
        public AddressFieldConfiguration getNameConfig() {
            return this.nameConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoAutocomplete(AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
            Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
            this.phoneNumberConfig = phoneNumberConfig;
            this.nameConfig = nameConfig;
        }
    }
}
