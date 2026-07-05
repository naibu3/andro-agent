package com.stripe.android.paymentelement.embedded.manage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManageContract.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;", "Landroid/os/Parcelable;", "Complete", "Error", "Companion", "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Error;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ManageResult extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String EXTRA_RESULT = "extra_activity_result";

    /* compiled from: ManageContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;", "customerState", "Lcom/stripe/android/paymentsheet/state/CustomerState;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "shouldInvokeSelectionCallback", "", "<init>", "(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V", "getCustomerState", "()Lcom/stripe/android/paymentsheet/state/CustomerState;", "getSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getShouldInvokeSelectionCallback", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Complete implements ManageResult {
        private final CustomerState customerState;
        private final PaymentSelection selection;
        private final boolean shouldInvokeSelectionCallback;
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ManageContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Complete(CustomerState.CREATOR.createFromParcel(parcel), (PaymentSelection) parcel.readParcelable(Complete.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }

        public static /* synthetic */ Complete copy$default(Complete complete, CustomerState customerState, PaymentSelection paymentSelection, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                customerState = complete.customerState;
            }
            if ((i & 2) != 0) {
                paymentSelection = complete.selection;
            }
            if ((i & 4) != 0) {
                z = complete.shouldInvokeSelectionCallback;
            }
            return complete.copy(customerState, paymentSelection, z);
        }

        /* renamed from: component1, reason: from getter */
        public final CustomerState getCustomerState() {
            return this.customerState;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSelection getSelection() {
            return this.selection;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldInvokeSelectionCallback() {
            return this.shouldInvokeSelectionCallback;
        }

        public final Complete copy(CustomerState customerState, PaymentSelection selection, boolean shouldInvokeSelectionCallback) {
            Intrinsics.checkNotNullParameter(customerState, "customerState");
            return new Complete(customerState, selection, shouldInvokeSelectionCallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.customerState, complete.customerState) && Intrinsics.areEqual(this.selection, complete.selection) && this.shouldInvokeSelectionCallback == complete.shouldInvokeSelectionCallback;
        }

        public int hashCode() {
            int iHashCode = this.customerState.hashCode() * 31;
            PaymentSelection paymentSelection = this.selection;
            return ((iHashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31) + Boolean.hashCode(this.shouldInvokeSelectionCallback);
        }

        public String toString() {
            return "Complete(customerState=" + this.customerState + ", selection=" + this.selection + ", shouldInvokeSelectionCallback=" + this.shouldInvokeSelectionCallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.customerState.writeToParcel(dest, flags);
            dest.writeParcelable(this.selection, flags);
            dest.writeInt(this.shouldInvokeSelectionCallback ? 1 : 0);
        }

        public Complete(CustomerState customerState, PaymentSelection paymentSelection, boolean z) {
            Intrinsics.checkNotNullParameter(customerState, "customerState");
            this.customerState = customerState;
            this.selection = paymentSelection;
            this.shouldInvokeSelectionCallback = z;
        }

        public final CustomerState getCustomerState() {
            return this.customerState;
        }

        public final PaymentSelection getSelection() {
            return this.selection;
        }

        public final boolean getShouldInvokeSelectionCallback() {
            return this.shouldInvokeSelectionCallback;
        }
    }

    /* compiled from: ManageContract.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Error;", "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements ManageResult {
        public static final Error INSTANCE = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ManageContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Error() {
        }
    }

    /* compiled from: ManageContract.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;", "", "<init>", "()V", "EXTRA_RESULT", "", "toIntent", "Landroid/content/Intent;", SDKConstants.PARAM_INTENT, FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;", "fromIntent", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String EXTRA_RESULT = "extra_activity_result";

        private Companion() {
        }

        public final Intent toIntent(Intent intent, ManageResult result) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(result, "result");
            Intent intentPutExtra = intent.putExtra("extra_activity_result", result);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final ManageResult fromIntent(Intent intent) {
            Bundle extras;
            ManageResult manageResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (ManageResult) BundleCompat.getParcelable(extras, "extra_activity_result", ManageResult.class);
            return manageResult == null ? Error.INSTANCE : manageResult;
        }
    }
}
