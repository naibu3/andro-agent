package com.stripe.android.customersheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetState;", "", "Loading", "Full", "Lcom/stripe/android/customersheet/CustomerSheetState$Full;", "Lcom/stripe/android/customersheet/CustomerSheetState$Loading;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetState {

    /* compiled from: CustomerSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetState$Loading;", "Lcom/stripe/android/customersheet/CustomerSheetState;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading implements CustomerSheetState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: CustomerSheetState.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J_\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetState$Full;", "Lcom/stripe/android/customersheet/CustomerSheetState;", "config", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "customerPermissions", "Lcom/stripe/android/customersheet/CustomerPermissions;", "supportedPaymentMethods", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "validationError", "", "<init>", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Ljava/util/List;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/Throwable;)V", "getConfig", "()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getCustomerPaymentMethods", "()Ljava/util/List;", "getCustomerPermissions", "()Lcom/stripe/android/customersheet/CustomerPermissions;", "getSupportedPaymentMethods", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getValidationError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Full implements CustomerSheetState {
        public static final int $stable = 8;
        private final CustomerSheet.Configuration config;
        private final List<PaymentMethod> customerPaymentMethods;
        private final CustomerPermissions customerPermissions;
        private final PaymentMethodMetadata paymentMethodMetadata;
        private final PaymentSelection paymentSelection;
        private final List<SupportedPaymentMethod> supportedPaymentMethods;
        private final Throwable validationError;

        public static /* synthetic */ Full copy$default(Full full, CustomerSheet.Configuration configuration, PaymentMethodMetadata paymentMethodMetadata, List list, CustomerPermissions customerPermissions, List list2, PaymentSelection paymentSelection, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = full.config;
            }
            if ((i & 2) != 0) {
                paymentMethodMetadata = full.paymentMethodMetadata;
            }
            if ((i & 4) != 0) {
                list = full.customerPaymentMethods;
            }
            if ((i & 8) != 0) {
                customerPermissions = full.customerPermissions;
            }
            if ((i & 16) != 0) {
                list2 = full.supportedPaymentMethods;
            }
            if ((i & 32) != 0) {
                paymentSelection = full.paymentSelection;
            }
            if ((i & 64) != 0) {
                th = full.validationError;
            }
            PaymentSelection paymentSelection2 = paymentSelection;
            Throwable th2 = th;
            List list3 = list2;
            List list4 = list;
            return full.copy(configuration, paymentMethodMetadata, list4, customerPermissions, list3, paymentSelection2, th2);
        }

        /* renamed from: component1, reason: from getter */
        public final CustomerSheet.Configuration getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final List<PaymentMethod> component3() {
            return this.customerPaymentMethods;
        }

        /* renamed from: component4, reason: from getter */
        public final CustomerPermissions getCustomerPermissions() {
            return this.customerPermissions;
        }

        public final List<SupportedPaymentMethod> component5() {
            return this.supportedPaymentMethods;
        }

        /* renamed from: component6, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* renamed from: component7, reason: from getter */
        public final Throwable getValidationError() {
            return this.validationError;
        }

        public final Full copy(CustomerSheet.Configuration config, PaymentMethodMetadata paymentMethodMetadata, List<PaymentMethod> customerPaymentMethods, CustomerPermissions customerPermissions, List<SupportedPaymentMethod> supportedPaymentMethods, PaymentSelection paymentSelection, Throwable validationError) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(customerPaymentMethods, "customerPaymentMethods");
            Intrinsics.checkNotNullParameter(customerPermissions, "customerPermissions");
            Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
            return new Full(config, paymentMethodMetadata, customerPaymentMethods, customerPermissions, supportedPaymentMethods, paymentSelection, validationError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Full)) {
                return false;
            }
            Full full = (Full) other;
            return Intrinsics.areEqual(this.config, full.config) && Intrinsics.areEqual(this.paymentMethodMetadata, full.paymentMethodMetadata) && Intrinsics.areEqual(this.customerPaymentMethods, full.customerPaymentMethods) && Intrinsics.areEqual(this.customerPermissions, full.customerPermissions) && Intrinsics.areEqual(this.supportedPaymentMethods, full.supportedPaymentMethods) && Intrinsics.areEqual(this.paymentSelection, full.paymentSelection) && Intrinsics.areEqual(this.validationError, full.validationError);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.config.hashCode() * 31) + this.paymentMethodMetadata.hashCode()) * 31) + this.customerPaymentMethods.hashCode()) * 31) + this.customerPermissions.hashCode()) * 31) + this.supportedPaymentMethods.hashCode()) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            int iHashCode2 = (iHashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31;
            Throwable th = this.validationError;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "Full(config=" + this.config + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ", customerPaymentMethods=" + this.customerPaymentMethods + ", customerPermissions=" + this.customerPermissions + ", supportedPaymentMethods=" + this.supportedPaymentMethods + ", paymentSelection=" + this.paymentSelection + ", validationError=" + this.validationError + ")";
        }

        public Full(CustomerSheet.Configuration config, PaymentMethodMetadata paymentMethodMetadata, List<PaymentMethod> customerPaymentMethods, CustomerPermissions customerPermissions, List<SupportedPaymentMethod> supportedPaymentMethods, PaymentSelection paymentSelection, Throwable th) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(customerPaymentMethods, "customerPaymentMethods");
            Intrinsics.checkNotNullParameter(customerPermissions, "customerPermissions");
            Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
            this.config = config;
            this.paymentMethodMetadata = paymentMethodMetadata;
            this.customerPaymentMethods = customerPaymentMethods;
            this.customerPermissions = customerPermissions;
            this.supportedPaymentMethods = supportedPaymentMethods;
            this.paymentSelection = paymentSelection;
            this.validationError = th;
        }

        public final CustomerSheet.Configuration getConfig() {
            return this.config;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final List<PaymentMethod> getCustomerPaymentMethods() {
            return this.customerPaymentMethods;
        }

        public final CustomerPermissions getCustomerPermissions() {
            return this.customerPermissions;
        }

        public final List<SupportedPaymentMethod> getSupportedPaymentMethods() {
            return this.supportedPaymentMethods;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Throwable getValidationError() {
            return this.validationError;
        }
    }
}
