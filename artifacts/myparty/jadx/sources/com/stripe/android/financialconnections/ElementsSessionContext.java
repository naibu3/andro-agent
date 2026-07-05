package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.IncentiveEligibilitySession;
import com.stripe.android.model.LinkMode;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationInternal.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000223BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JT\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/stripe/android/financialconnections/ElementsSessionContext;", "Landroid/os/Parcelable;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "", "linkMode", "Lcom/stripe/android/model/LinkMode;", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "prefillDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "incentiveEligibilitySession", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/model/IncentiveEligibilitySession;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "getBillingDetails", "()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "getPrefillDetails", "()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "getIncentiveEligibilitySession", "()Lcom/stripe/android/model/IncentiveEligibilitySession;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Lcom/stripe/android/model/IncentiveEligibilitySession;)Lcom/stripe/android/financialconnections/ElementsSessionContext;", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "BillingDetails", "PrefillDetails", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ElementsSessionContext implements Parcelable {
    public static final Parcelable.Creator<ElementsSessionContext> CREATOR = new Creator();
    private final Long amount;
    private final BillingDetails billingDetails;
    private final String currency;
    private final IncentiveEligibilitySession incentiveEligibilitySession;
    private final LinkMode linkMode;
    private final PrefillDetails prefillDetails;

    /* compiled from: ConfigurationInternal.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ElementsSessionContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ElementsSessionContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ElementsSessionContext(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : LinkMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? BillingDetails.CREATOR.createFromParcel(parcel) : null, PrefillDetails.CREATOR.createFromParcel(parcel), (IncentiveEligibilitySession) parcel.readParcelable(ElementsSessionContext.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ElementsSessionContext[] newArray(int i) {
            return new ElementsSessionContext[i];
        }
    }

    public static /* synthetic */ ElementsSessionContext copy$default(ElementsSessionContext elementsSessionContext, Long l, String str, LinkMode linkMode, BillingDetails billingDetails, PrefillDetails prefillDetails, IncentiveEligibilitySession incentiveEligibilitySession, int i, Object obj) {
        if ((i & 1) != 0) {
            l = elementsSessionContext.amount;
        }
        if ((i & 2) != 0) {
            str = elementsSessionContext.currency;
        }
        if ((i & 4) != 0) {
            linkMode = elementsSessionContext.linkMode;
        }
        if ((i & 8) != 0) {
            billingDetails = elementsSessionContext.billingDetails;
        }
        if ((i & 16) != 0) {
            prefillDetails = elementsSessionContext.prefillDetails;
        }
        if ((i & 32) != 0) {
            incentiveEligibilitySession = elementsSessionContext.incentiveEligibilitySession;
        }
        PrefillDetails prefillDetails2 = prefillDetails;
        IncentiveEligibilitySession incentiveEligibilitySession2 = incentiveEligibilitySession;
        return elementsSessionContext.copy(l, str, linkMode, billingDetails, prefillDetails2, incentiveEligibilitySession2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    /* renamed from: component4, reason: from getter */
    public final BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* renamed from: component5, reason: from getter */
    public final PrefillDetails getPrefillDetails() {
        return this.prefillDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final IncentiveEligibilitySession getIncentiveEligibilitySession() {
        return this.incentiveEligibilitySession;
    }

    public final ElementsSessionContext copy(Long amount, String currency, LinkMode linkMode, BillingDetails billingDetails, PrefillDetails prefillDetails, IncentiveEligibilitySession incentiveEligibilitySession) {
        Intrinsics.checkNotNullParameter(prefillDetails, "prefillDetails");
        return new ElementsSessionContext(amount, currency, linkMode, billingDetails, prefillDetails, incentiveEligibilitySession);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementsSessionContext)) {
            return false;
        }
        ElementsSessionContext elementsSessionContext = (ElementsSessionContext) other;
        return Intrinsics.areEqual(this.amount, elementsSessionContext.amount) && Intrinsics.areEqual(this.currency, elementsSessionContext.currency) && this.linkMode == elementsSessionContext.linkMode && Intrinsics.areEqual(this.billingDetails, elementsSessionContext.billingDetails) && Intrinsics.areEqual(this.prefillDetails, elementsSessionContext.prefillDetails) && Intrinsics.areEqual(this.incentiveEligibilitySession, elementsSessionContext.incentiveEligibilitySession);
    }

    public int hashCode() {
        Long l = this.amount;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkMode linkMode = this.linkMode;
        int iHashCode3 = (iHashCode2 + (linkMode == null ? 0 : linkMode.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int iHashCode4 = (((iHashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.prefillDetails.hashCode()) * 31;
        IncentiveEligibilitySession incentiveEligibilitySession = this.incentiveEligibilitySession;
        return iHashCode4 + (incentiveEligibilitySession != null ? incentiveEligibilitySession.hashCode() : 0);
    }

    public String toString() {
        return "ElementsSessionContext(amount=" + this.amount + ", currency=" + this.currency + ", linkMode=" + this.linkMode + ", billingDetails=" + this.billingDetails + ", prefillDetails=" + this.prefillDetails + ", incentiveEligibilitySession=" + this.incentiveEligibilitySession + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l = this.amount;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeString(this.currency);
        LinkMode linkMode = this.linkMode;
        if (linkMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(linkMode.name());
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billingDetails.writeToParcel(dest, flags);
        }
        this.prefillDetails.writeToParcel(dest, flags);
        dest.writeParcelable(this.incentiveEligibilitySession, flags);
    }

    public ElementsSessionContext(Long l, String str, LinkMode linkMode, BillingDetails billingDetails, PrefillDetails prefillDetails, IncentiveEligibilitySession incentiveEligibilitySession) {
        Intrinsics.checkNotNullParameter(prefillDetails, "prefillDetails");
        this.amount = l;
        this.currency = str;
        this.linkMode = linkMode;
        this.billingDetails = billingDetails;
        this.prefillDetails = prefillDetails;
        this.incentiveEligibilitySession = incentiveEligibilitySession;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    public final BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final PrefillDetails getPrefillDetails() {
        return this.prefillDetails;
    }

    public final IncentiveEligibilitySession getIncentiveEligibilitySession() {
        return this.incentiveEligibilitySession;
    }

    /* compiled from: ConfigurationInternal.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "Landroid/os/Parcelable;", "name", "", "phone", "email", "address", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;)V", "getName", "()Ljava/lang/String;", "getPhone", "getEmail", "getAddress", "()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Address", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingDetails implements Parcelable {
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;

        /* compiled from: ConfigurationInternal.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, String str, String str2, String str3, Address address, int i, Object obj) {
            if ((i & 1) != 0) {
                str = billingDetails.name;
            }
            if ((i & 2) != 0) {
                str2 = billingDetails.phone;
            }
            if ((i & 4) != 0) {
                str3 = billingDetails.email;
            }
            if ((i & 8) != 0) {
                address = billingDetails.address;
            }
            return billingDetails.copy(str, str2, str3, address);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component4, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        public final BillingDetails copy(String name, String phone, String email, Address address) {
            return new BillingDetails(name, phone, email, address);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.address, billingDetails.address);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phone;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address = this.address;
            return iHashCode3 + (address != null ? address.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(name=" + this.name + ", phone=" + this.phone + ", email=" + this.email + ", address=" + this.address + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.phone);
            dest.writeString(this.email);
            Address address = this.address;
            if (address == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                address.writeToParcel(dest, flags);
            }
        }

        public BillingDetails(String str, String str2, String str3, Address address) {
            this.name = str;
            this.phone = str2;
            this.email = str3;
            this.address = address;
        }

        public /* synthetic */ BillingDetails(String str, String str2, String str3, Address address, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : address);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getEmail() {
            return this.email;
        }

        public final Address getAddress() {
            return this.address;
        }

        /* compiled from: ConfigurationInternal.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;", "Landroid/os/Parcelable;", "line1", "", "line2", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "city", ServerProtocol.DIALOG_PARAM_STATE, "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLine1", "()Ljava/lang/String;", "getLine2", "getPostalCode", "getCity", "getState", "getCountry", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Address implements Parcelable {
            public static final Parcelable.Creator<Address> CREATOR = new Creator();
            private final String city;
            private final String country;
            private final String line1;
            private final String line2;
            private final String postalCode;
            private final String state;

            /* compiled from: ConfigurationInternal.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Address> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Address createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Address[] newArray(int i) {
                    return new Address[i];
                }
            }

            public Address() {
                this(null, null, null, null, null, null, 63, null);
            }

            public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = address.line1;
                }
                if ((i & 2) != 0) {
                    str2 = address.line2;
                }
                if ((i & 4) != 0) {
                    str3 = address.postalCode;
                }
                if ((i & 8) != 0) {
                    str4 = address.city;
                }
                if ((i & 16) != 0) {
                    str5 = address.state;
                }
                if ((i & 32) != 0) {
                    str6 = address.country;
                }
                String str7 = str5;
                String str8 = str6;
                return address.copy(str, str2, str3, str4, str7, str8);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLine1() {
                return this.line1;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLine2() {
                return this.line2;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPostalCode() {
                return this.postalCode;
            }

            /* renamed from: component4, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* renamed from: component5, reason: from getter */
            public final String getState() {
                return this.state;
            }

            /* renamed from: component6, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            public final Address copy(String line1, String line2, String postalCode, String city, String state, String country) {
                return new Address(line1, line2, postalCode, city, state, country);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Address)) {
                    return false;
                }
                Address address = (Address) other;
                return Intrinsics.areEqual(this.line1, address.line1) && Intrinsics.areEqual(this.line2, address.line2) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.country, address.country);
            }

            public int hashCode() {
                String str = this.line1;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.line2;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.postalCode;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.city;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.state;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.country;
                return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
            }

            public String toString() {
                return "Address(line1=" + this.line1 + ", line2=" + this.line2 + ", postalCode=" + this.postalCode + ", city=" + this.city + ", state=" + this.state + ", country=" + this.country + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.line1);
                dest.writeString(this.line2);
                dest.writeString(this.postalCode);
                dest.writeString(this.city);
                dest.writeString(this.state);
                dest.writeString(this.country);
            }

            public Address(String str, String str2, String str3, String str4, String str5, String str6) {
                this.line1 = str;
                this.line2 = str2;
                this.postalCode = str3;
                this.city = str4;
                this.state = str5;
                this.country = str6;
            }

            public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
            }

            public final String getLine1() {
                return this.line1;
            }

            public final String getLine2() {
                return this.line2;
            }

            public final String getPostalCode() {
                return this.postalCode;
            }

            public final String getCity() {
                return this.city;
            }

            public final String getState() {
                return this.state;
            }

            public final String getCountry() {
                return this.country;
            }
        }
    }

    /* compiled from: ConfigurationInternal.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "email", "", "phone", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "getPhoneCountryCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrefillDetails implements Parcelable, Serializable {
        private static final long serialVersionUID = 626669472462415908L;
        private final String email;
        private final String phone;
        private final String phoneCountryCode;
        public static final Parcelable.Creator<PrefillDetails> CREATOR = new Creator();

        /* compiled from: ConfigurationInternal.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrefillDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrefillDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrefillDetails(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrefillDetails[] newArray(int i) {
                return new PrefillDetails[i];
            }
        }

        public static /* synthetic */ PrefillDetails copy$default(PrefillDetails prefillDetails, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prefillDetails.email;
            }
            if ((i & 2) != 0) {
                str2 = prefillDetails.phone;
            }
            if ((i & 4) != 0) {
                str3 = prefillDetails.phoneCountryCode;
            }
            return prefillDetails.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPhoneCountryCode() {
            return this.phoneCountryCode;
        }

        public final PrefillDetails copy(String email, String phone, String phoneCountryCode) {
            return new PrefillDetails(email, phone, phoneCountryCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrefillDetails)) {
                return false;
            }
            PrefillDetails prefillDetails = (PrefillDetails) other;
            return Intrinsics.areEqual(this.email, prefillDetails.email) && Intrinsics.areEqual(this.phone, prefillDetails.phone) && Intrinsics.areEqual(this.phoneCountryCode, prefillDetails.phoneCountryCode);
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phone;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phoneCountryCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "PrefillDetails(email=" + this.email + ", phone=" + this.phone + ", phoneCountryCode=" + this.phoneCountryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.email);
            dest.writeString(this.phone);
            dest.writeString(this.phoneCountryCode);
        }

        public PrefillDetails(String str, String str2, String str3) {
            this.email = str;
            this.phone = str2;
            this.phoneCountryCode = str3;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getPhoneCountryCode() {
            return this.phoneCountryCode;
        }
    }
}
