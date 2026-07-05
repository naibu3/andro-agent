package com.stripe.android.lpmfoundations.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.data.CustomerSheetSession;
import com.stripe.android.model.ElementsSession;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerMetadata.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "Landroid/os/Parcelable;", "hasCustomerConfiguration", "", "isPaymentMethodSetAsDefaultEnabled", "permissions", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;", "<init>", "(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V", "getHasCustomerConfiguration", "()Z", "getPermissions", "()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Permissions", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomerMetadata implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CustomerMetadata> CREATOR = new Creator();
    private final boolean hasCustomerConfiguration;
    private final boolean isPaymentMethodSetAsDefaultEnabled;
    private final Permissions permissions;

    /* compiled from: CustomerMetadata.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomerMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomerMetadata(parcel.readInt() != 0, parcel.readInt() != 0, Permissions.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerMetadata[] newArray(int i) {
            return new CustomerMetadata[i];
        }
    }

    public static /* synthetic */ CustomerMetadata copy$default(CustomerMetadata customerMetadata, boolean z, boolean z2, Permissions permissions, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customerMetadata.hasCustomerConfiguration;
        }
        if ((i & 2) != 0) {
            z2 = customerMetadata.isPaymentMethodSetAsDefaultEnabled;
        }
        if ((i & 4) != 0) {
            permissions = customerMetadata.permissions;
        }
        return customerMetadata.copy(z, z2, permissions);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasCustomerConfiguration() {
        return this.hasCustomerConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPaymentMethodSetAsDefaultEnabled() {
        return this.isPaymentMethodSetAsDefaultEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Permissions getPermissions() {
        return this.permissions;
    }

    public final CustomerMetadata copy(boolean hasCustomerConfiguration, boolean isPaymentMethodSetAsDefaultEnabled, Permissions permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return new CustomerMetadata(hasCustomerConfiguration, isPaymentMethodSetAsDefaultEnabled, permissions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerMetadata)) {
            return false;
        }
        CustomerMetadata customerMetadata = (CustomerMetadata) other;
        return this.hasCustomerConfiguration == customerMetadata.hasCustomerConfiguration && this.isPaymentMethodSetAsDefaultEnabled == customerMetadata.isPaymentMethodSetAsDefaultEnabled && Intrinsics.areEqual(this.permissions, customerMetadata.permissions);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasCustomerConfiguration) * 31) + Boolean.hashCode(this.isPaymentMethodSetAsDefaultEnabled)) * 31) + this.permissions.hashCode();
    }

    public String toString() {
        return "CustomerMetadata(hasCustomerConfiguration=" + this.hasCustomerConfiguration + ", isPaymentMethodSetAsDefaultEnabled=" + this.isPaymentMethodSetAsDefaultEnabled + ", permissions=" + this.permissions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasCustomerConfiguration ? 1 : 0);
        dest.writeInt(this.isPaymentMethodSetAsDefaultEnabled ? 1 : 0);
        this.permissions.writeToParcel(dest, flags);
    }

    public CustomerMetadata(boolean z, boolean z2, Permissions permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.hasCustomerConfiguration = z;
        this.isPaymentMethodSetAsDefaultEnabled = z2;
        this.permissions = permissions;
    }

    public final boolean getHasCustomerConfiguration() {
        return this.hasCustomerConfiguration;
    }

    public final boolean isPaymentMethodSetAsDefaultEnabled() {
        return this.isPaymentMethodSetAsDefaultEnabled;
    }

    public final Permissions getPermissions() {
        return this.permissions;
    }

    /* compiled from: CustomerMetadata.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;", "Landroid/os/Parcelable;", "canRemovePaymentMethods", "", "canRemoveLastPaymentMethod", "canRemoveDuplicates", "canUpdateFullPaymentMethodDetails", "<init>", "(ZZZZ)V", "getCanRemovePaymentMethods", "()Z", "getCanRemoveLastPaymentMethod", "getCanRemoveDuplicates", "getCanUpdateFullPaymentMethodDetails", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Permissions implements Parcelable {
        private final boolean canRemoveDuplicates;
        private final boolean canRemoveLastPaymentMethod;
        private final boolean canRemovePaymentMethods;
        private final boolean canUpdateFullPaymentMethodDetails;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Permissions> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CustomerMetadata.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Permissions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Permissions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Permissions(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Permissions[] newArray(int i) {
                return new Permissions[i];
            }
        }

        public static /* synthetic */ Permissions copy$default(Permissions permissions, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = permissions.canRemovePaymentMethods;
            }
            if ((i & 2) != 0) {
                z2 = permissions.canRemoveLastPaymentMethod;
            }
            if ((i & 4) != 0) {
                z3 = permissions.canRemoveDuplicates;
            }
            if ((i & 8) != 0) {
                z4 = permissions.canUpdateFullPaymentMethodDetails;
            }
            return permissions.copy(z, z2, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanRemoveLastPaymentMethod() {
            return this.canRemoveLastPaymentMethod;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getCanRemoveDuplicates() {
            return this.canRemoveDuplicates;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCanUpdateFullPaymentMethodDetails() {
            return this.canUpdateFullPaymentMethodDetails;
        }

        public final Permissions copy(boolean canRemovePaymentMethods, boolean canRemoveLastPaymentMethod, boolean canRemoveDuplicates, boolean canUpdateFullPaymentMethodDetails) {
            return new Permissions(canRemovePaymentMethods, canRemoveLastPaymentMethod, canRemoveDuplicates, canUpdateFullPaymentMethodDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Permissions)) {
                return false;
            }
            Permissions permissions = (Permissions) other;
            return this.canRemovePaymentMethods == permissions.canRemovePaymentMethods && this.canRemoveLastPaymentMethod == permissions.canRemoveLastPaymentMethod && this.canRemoveDuplicates == permissions.canRemoveDuplicates && this.canUpdateFullPaymentMethodDetails == permissions.canUpdateFullPaymentMethodDetails;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.canRemovePaymentMethods) * 31) + Boolean.hashCode(this.canRemoveLastPaymentMethod)) * 31) + Boolean.hashCode(this.canRemoveDuplicates)) * 31) + Boolean.hashCode(this.canUpdateFullPaymentMethodDetails);
        }

        public String toString() {
            return "Permissions(canRemovePaymentMethods=" + this.canRemovePaymentMethods + ", canRemoveLastPaymentMethod=" + this.canRemoveLastPaymentMethod + ", canRemoveDuplicates=" + this.canRemoveDuplicates + ", canUpdateFullPaymentMethodDetails=" + this.canUpdateFullPaymentMethodDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.canRemovePaymentMethods ? 1 : 0);
            dest.writeInt(this.canRemoveLastPaymentMethod ? 1 : 0);
            dest.writeInt(this.canRemoveDuplicates ? 1 : 0);
            dest.writeInt(this.canUpdateFullPaymentMethodDetails ? 1 : 0);
        }

        public Permissions(boolean z, boolean z2, boolean z3, boolean z4) {
            this.canRemovePaymentMethods = z;
            this.canRemoveLastPaymentMethod = z2;
            this.canRemoveDuplicates = z3;
            this.canUpdateFullPaymentMethodDetails = z4;
        }

        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        public final boolean getCanRemoveLastPaymentMethod() {
            return this.canRemoveLastPaymentMethod;
        }

        public final boolean getCanRemoveDuplicates() {
            return this.canRemoveDuplicates;
        }

        public final boolean getCanUpdateFullPaymentMethodDetails() {
            return this.canUpdateFullPaymentMethodDetails;
        }

        /* compiled from: CustomerMetadata.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;", "", "<init>", "()V", "createForPaymentSheetCustomerSession", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "customer", "Lcom/stripe/android/model/ElementsSession$Customer;", "createForPaymentSheetCustomerSession$paymentsheet_release", "createForPaymentSheetLegacyEphemeralKey", "createForPaymentSheetLegacyEphemeralKey$paymentsheet_release", "createForCustomerSheet", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "customerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "createForCustomerSheet$paymentsheet_release", "createForNativeLink", "createForNativeLink$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Permissions createForPaymentSheetCustomerSession$paymentsheet_release(CommonConfiguration configuration, ElementsSession.Customer customer) {
                boolean zIsPaymentMethodRemoveEnabled;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(customer, "customer");
                ElementsSession.Customer.Components.MobilePaymentElement mobilePaymentElement = customer.getSession().getComponents().getMobilePaymentElement();
                boolean z = mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Enabled;
                boolean z2 = false;
                if (z) {
                    zIsPaymentMethodRemoveEnabled = ((ElementsSession.Customer.Components.MobilePaymentElement.Enabled) mobilePaymentElement).isPaymentMethodRemoveEnabled();
                } else {
                    if (!(mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Disabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zIsPaymentMethodRemoveEnabled = false;
                }
                if (configuration.getAllowsRemovalOfLastSavedPaymentMethod() && z && ((ElementsSession.Customer.Components.MobilePaymentElement.Enabled) mobilePaymentElement).getCanRemoveLastPaymentMethod()) {
                    z2 = true;
                }
                return new Permissions(zIsPaymentMethodRemoveEnabled, z2, true, true);
            }

            public final Permissions createForPaymentSheetLegacyEphemeralKey$paymentsheet_release(CommonConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new Permissions(true, configuration.getAllowsRemovalOfLastSavedPaymentMethod(), false, false);
            }

            public final Permissions createForCustomerSheet$paymentsheet_release(CustomerSheet.Configuration configuration, CustomerSheetSession customerSheetSession) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(customerSheetSession, "customerSheetSession");
                return new Permissions(customerSheetSession.getPermissions().getCanRemovePaymentMethods(), configuration.getAllowsRemovalOfLastSavedPaymentMethod(), true, customerSheetSession.getPermissions().getCanUpdateFullPaymentMethodDetails());
            }

            public final Permissions createForNativeLink$paymentsheet_release() {
                return new Permissions(false, false, false, false);
            }
        }
    }
}
