package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerState.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002&'B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/state/CustomerState;", "Landroid/os/Parcelable;", "id", "", "ephemeralKeySecret", "customerSessionClientSecret", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "defaultPaymentMethodId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getEphemeralKeySecret", "getCustomerSessionClientSecret", "getPaymentMethods", "()Ljava/util/List;", "getDefaultPaymentMethodId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "DefaultPaymentMethodState", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CustomerState implements Parcelable {
    private final String customerSessionClientSecret;
    private final String defaultPaymentMethodId;
    private final String ephemeralKeySecret;
    private final String id;
    private final List<PaymentMethod> paymentMethods;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CustomerState> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: CustomerState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CustomerState.class.getClassLoader()));
            }
            return new CustomerState(string, string2, string3, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerState[] newArray(int i) {
            return new CustomerState[i];
        }
    }

    public static /* synthetic */ CustomerState copy$default(CustomerState customerState, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerState.id;
        }
        if ((i & 2) != 0) {
            str2 = customerState.ephemeralKeySecret;
        }
        if ((i & 4) != 0) {
            str3 = customerState.customerSessionClientSecret;
        }
        if ((i & 8) != 0) {
            list = customerState.paymentMethods;
        }
        if ((i & 16) != 0) {
            str4 = customerState.defaultPaymentMethodId;
        }
        String str5 = str4;
        String str6 = str3;
        return customerState.copy(str, str2, str6, list, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEphemeralKeySecret() {
        return this.ephemeralKeySecret;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final List<PaymentMethod> component4() {
        return this.paymentMethods;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    public final CustomerState copy(String id, String ephemeralKeySecret, String customerSessionClientSecret, List<PaymentMethod> paymentMethods, String defaultPaymentMethodId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return new CustomerState(id, ephemeralKeySecret, customerSessionClientSecret, paymentMethods, defaultPaymentMethodId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerState)) {
            return false;
        }
        CustomerState customerState = (CustomerState) other;
        return Intrinsics.areEqual(this.id, customerState.id) && Intrinsics.areEqual(this.ephemeralKeySecret, customerState.ephemeralKeySecret) && Intrinsics.areEqual(this.customerSessionClientSecret, customerState.customerSessionClientSecret) && Intrinsics.areEqual(this.paymentMethods, customerState.paymentMethods) && Intrinsics.areEqual(this.defaultPaymentMethodId, customerState.defaultPaymentMethodId);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31;
        String str = this.customerSessionClientSecret;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentMethods.hashCode()) * 31;
        String str2 = this.defaultPaymentMethodId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CustomerState(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", paymentMethods=" + this.paymentMethods + ", defaultPaymentMethodId=" + this.defaultPaymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.ephemeralKeySecret);
        dest.writeString(this.customerSessionClientSecret);
        List<PaymentMethod> list = this.paymentMethods;
        dest.writeInt(list.size());
        Iterator<PaymentMethod> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.defaultPaymentMethodId);
    }

    public CustomerState(String id, String ephemeralKeySecret, String str, List<PaymentMethod> paymentMethods, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.id = id;
        this.ephemeralKeySecret = ephemeralKeySecret;
        this.customerSessionClientSecret = str;
        this.paymentMethods = paymentMethods;
        this.defaultPaymentMethodId = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getEphemeralKeySecret() {
        return this.ephemeralKeySecret;
    }

    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    /* compiled from: CustomerState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState;", "Landroid/os/Parcelable;", "<init>", "()V", "Enabled", "Disabled", "Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState$Disabled;", "Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState$Enabled;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class DefaultPaymentMethodState implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ DefaultPaymentMethodState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DefaultPaymentMethodState() {
        }

        /* compiled from: CustomerState.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState$Enabled;", "Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState;", "defaultPaymentMethodId", "", "<init>", "(Ljava/lang/String;)V", "getDefaultPaymentMethodId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Enabled extends DefaultPaymentMethodState {
            private final String defaultPaymentMethodId;
            public static final Parcelable.Creator<Enabled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: CustomerState.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Enabled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Enabled(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            public static /* synthetic */ Enabled copy$default(Enabled enabled, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enabled.defaultPaymentMethodId;
                }
                return enabled.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDefaultPaymentMethodId() {
                return this.defaultPaymentMethodId;
            }

            public final Enabled copy(String defaultPaymentMethodId) {
                return new Enabled(defaultPaymentMethodId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Enabled) && Intrinsics.areEqual(this.defaultPaymentMethodId, ((Enabled) other).defaultPaymentMethodId);
            }

            public int hashCode() {
                String str = this.defaultPaymentMethodId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Enabled(defaultPaymentMethodId=" + this.defaultPaymentMethodId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.defaultPaymentMethodId);
            }

            public Enabled(String str) {
                super(null);
                this.defaultPaymentMethodId = str;
            }

            public final String getDefaultPaymentMethodId() {
                return this.defaultPaymentMethodId;
            }
        }

        /* compiled from: CustomerState.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState$Disabled;", "Lcom/stripe/android/paymentsheet/state/CustomerState$DefaultPaymentMethodState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Disabled extends DefaultPaymentMethodState {
            public static final Disabled INSTANCE = new Disabled();
            public static final Parcelable.Creator<Disabled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: CustomerState.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Disabled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Disabled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disabled[] newArray(int i) {
                    return new Disabled[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disabled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -975423719;
            }

            public String toString() {
                return "Disabled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Disabled() {
                super(null);
            }
        }
    }

    /* compiled from: CustomerState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0000¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/state/CustomerState$Companion;", "", "<init>", "()V", "createForCustomerSession", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "customer", "Lcom/stripe/android/model/ElementsSession$Customer;", "supportedSavedPaymentMethodTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "customerSessionClientSecret", "", "createForCustomerSession$paymentsheet_release", "createForLegacyEphemeralKey", "customerId", "accessType", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;", "paymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "createForLegacyEphemeralKey$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CustomerState createForCustomerSession$paymentsheet_release(ElementsSession.Customer customer, List<? extends PaymentMethod.Type> supportedSavedPaymentMethodTypes, String customerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(customer, "customer");
            Intrinsics.checkNotNullParameter(supportedSavedPaymentMethodTypes, "supportedSavedPaymentMethodTypes");
            Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
            String customerId = customer.getSession().getCustomerId();
            String apiKey = customer.getSession().getApiKey();
            List<PaymentMethod> paymentMethods = customer.getPaymentMethods();
            ArrayList arrayList = new ArrayList();
            for (Object obj : paymentMethods) {
                if (CollectionsKt.contains(supportedSavedPaymentMethodTypes, ((PaymentMethod) obj).type)) {
                    arrayList.add(obj);
                }
            }
            return new CustomerState(customerId, apiKey, customerSessionClientSecret, arrayList, customer.getDefaultPaymentMethod());
        }

        public final CustomerState createForLegacyEphemeralKey$paymentsheet_release(String customerId, PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey accessType, List<PaymentMethod> paymentMethods) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(accessType, "accessType");
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            return new CustomerState(customerId, accessType.getEphemeralKeySecret(), null, paymentMethods, null);
        }
    }
}
