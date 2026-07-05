package com.stripe.android.customersheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarStateFactory;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor;
import com.stripe.android.uicore.elements.FormElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetViewState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewState;", "", NamedConstantsKt.IS_LIVE_MODE, "", "isProcessing", "canNavigateBack", "<init>", "(ZZZ)V", "()Z", "getCanNavigateBack", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "onEditIconPressed", "Lkotlin/Function0;", "", "shouldDisplayDismissConfirmationModal", "Loading", "SelectPaymentMethod", "AddPaymentMethod", "UpdatePaymentMethod", "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;", "Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;", "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;", "Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CustomerSheetViewState {
    public static final int $stable = 0;
    private final boolean canNavigateBack;
    private final boolean isLiveMode;
    private final boolean isProcessing;

    public /* synthetic */ CustomerSheetViewState(boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3);
    }

    public abstract PaymentSheetTopBarState topBarState(Function0<Unit> onEditIconPressed);

    private CustomerSheetViewState(boolean z, boolean z2, boolean z3) {
        this.isLiveMode = z;
        this.isProcessing = z2;
        this.canNavigateBack = z3;
    }

    /* renamed from: isLiveMode, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: isProcessing, reason: from getter */
    public boolean getIsProcessing() {
        return this.isProcessing;
    }

    public boolean getCanNavigateBack() {
        return this.canNavigateBack;
    }

    public final boolean shouldDisplayDismissConfirmationModal() {
        if ((this instanceof Loading) || (this instanceof UpdatePaymentMethod) || (this instanceof SelectPaymentMethod)) {
            return false;
        }
        if (!(this instanceof AddPaymentMethod)) {
            throw new NoWhenBranchMatchedException();
        }
        AddPaymentMethod addPaymentMethod = (AddPaymentMethod) this;
        return Intrinsics.areEqual(addPaymentMethod.getPaymentMethodCode(), PaymentMethod.Type.USBankAccount.code) && addPaymentMethod.getBankAccountSelection() != null;
    }

    /* compiled from: CustomerSheetViewState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", NamedConstantsKt.IS_LIVE_MODE, "", "<init>", "(Z)V", "()Z", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "onEditIconPressed", "Lkotlin/Function0;", "", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends CustomerSheetViewState {
        public static final int $stable = 0;
        private final boolean isLiveMode;

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.isLiveMode;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public final Loading copy(boolean isLiveMode) {
            return new Loading(isLiveMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.isLiveMode == ((Loading) other).isLiveMode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLiveMode);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.isLiveMode + ")";
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isLiveMode */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading(boolean z) {
            boolean z2 = false;
            super(z, z2, z2, null);
            this.isLiveMode = z;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        public PaymentSheetTopBarState topBarState(Function0<Unit> onEditIconPressed) {
            Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
            return PaymentSheetTopBarStateFactory.INSTANCE.create(getIsLiveMode(), PaymentSheetTopBarState.Editable.Never.INSTANCE);
        }
    }

    /* compiled from: CustomerSheetViewState.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u0099\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001J\u0013\u0010<\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0011\u0010%\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001d¨\u0006B"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", "title", "", "savedPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", NamedConstantsKt.IS_LIVE_MODE, "", "isProcessing", "isEditing", "showGooglePay", "primaryButtonVisible", "canEdit", "canRemovePaymentMethods", "errorMessage", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "isCbcEligible", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZZZZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Z)V", "getTitle", "()Ljava/lang/String;", "getSavedPaymentMethods", "()Ljava/util/List;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()Z", "getShowGooglePay", "getPrimaryButtonVisible", "getCanEdit", "getCanRemovePaymentMethods", "getErrorMessage", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "primaryButtonLabel", "getPrimaryButtonLabel", "primaryButtonEnabled", "getPrimaryButtonEnabled", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "onEditIconPressed", "Lkotlin/Function0;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectPaymentMethod extends CustomerSheetViewState {
        public static final int $stable = 8;
        private final boolean canEdit;
        private final boolean canRemovePaymentMethods;
        private final String errorMessage;
        private final boolean isCbcEligible;
        private final boolean isEditing;
        private final boolean isLiveMode;
        private final boolean isProcessing;
        private final ResolvableString mandateText;
        private final PaymentSelection paymentSelection;
        private final ResolvableString primaryButtonLabel;
        private final boolean primaryButtonVisible;
        private final List<PaymentMethod> savedPaymentMethods;
        private final boolean showGooglePay;
        private final String title;

        public static /* synthetic */ SelectPaymentMethod copy$default(SelectPaymentMethod selectPaymentMethod, String str, List list, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, ResolvableString resolvableString, boolean z8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectPaymentMethod.title;
            }
            return selectPaymentMethod.copy(str, (i & 2) != 0 ? selectPaymentMethod.savedPaymentMethods : list, (i & 4) != 0 ? selectPaymentMethod.paymentSelection : paymentSelection, (i & 8) != 0 ? selectPaymentMethod.isLiveMode : z, (i & 16) != 0 ? selectPaymentMethod.isProcessing : z2, (i & 32) != 0 ? selectPaymentMethod.isEditing : z3, (i & 64) != 0 ? selectPaymentMethod.showGooglePay : z4, (i & 128) != 0 ? selectPaymentMethod.primaryButtonVisible : z5, (i & 256) != 0 ? selectPaymentMethod.canEdit : z6, (i & 512) != 0 ? selectPaymentMethod.canRemovePaymentMethods : z7, (i & 1024) != 0 ? selectPaymentMethod.errorMessage : str2, (i & 2048) != 0 ? selectPaymentMethod.mandateText : resolvableString, (i & 4096) != 0 ? selectPaymentMethod.isCbcEligible : z8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        /* renamed from: component11, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component12, reason: from getter */
        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        public final List<PaymentMethod> component2() {
            return this.savedPaymentMethods;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowGooglePay() {
            return this.showGooglePay;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getPrimaryButtonVisible() {
            return this.primaryButtonVisible;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final SelectPaymentMethod copy(String title, List<PaymentMethod> savedPaymentMethods, PaymentSelection paymentSelection, boolean isLiveMode, boolean isProcessing, boolean isEditing, boolean showGooglePay, boolean primaryButtonVisible, boolean canEdit, boolean canRemovePaymentMethods, String errorMessage, ResolvableString mandateText, boolean isCbcEligible) {
            Intrinsics.checkNotNullParameter(savedPaymentMethods, "savedPaymentMethods");
            return new SelectPaymentMethod(title, savedPaymentMethods, paymentSelection, isLiveMode, isProcessing, isEditing, showGooglePay, primaryButtonVisible, canEdit, canRemovePaymentMethods, errorMessage, mandateText, isCbcEligible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectPaymentMethod)) {
                return false;
            }
            SelectPaymentMethod selectPaymentMethod = (SelectPaymentMethod) other;
            return Intrinsics.areEqual(this.title, selectPaymentMethod.title) && Intrinsics.areEqual(this.savedPaymentMethods, selectPaymentMethod.savedPaymentMethods) && Intrinsics.areEqual(this.paymentSelection, selectPaymentMethod.paymentSelection) && this.isLiveMode == selectPaymentMethod.isLiveMode && this.isProcessing == selectPaymentMethod.isProcessing && this.isEditing == selectPaymentMethod.isEditing && this.showGooglePay == selectPaymentMethod.showGooglePay && this.primaryButtonVisible == selectPaymentMethod.primaryButtonVisible && this.canEdit == selectPaymentMethod.canEdit && this.canRemovePaymentMethods == selectPaymentMethod.canRemovePaymentMethods && Intrinsics.areEqual(this.errorMessage, selectPaymentMethod.errorMessage) && Intrinsics.areEqual(this.mandateText, selectPaymentMethod.mandateText) && this.isCbcEligible == selectPaymentMethod.isCbcEligible;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.savedPaymentMethods.hashCode()) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            int iHashCode2 = (((((((((((((((iHashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31) + Boolean.hashCode(this.isProcessing)) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.showGooglePay)) * 31) + Boolean.hashCode(this.primaryButtonVisible)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.canRemovePaymentMethods)) * 31;
            String str2 = this.errorMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ResolvableString resolvableString = this.mandateText;
            return ((iHashCode3 + (resolvableString != null ? resolvableString.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCbcEligible);
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.title + ", savedPaymentMethods=" + this.savedPaymentMethods + ", paymentSelection=" + this.paymentSelection + ", isLiveMode=" + this.isLiveMode + ", isProcessing=" + this.isProcessing + ", isEditing=" + this.isEditing + ", showGooglePay=" + this.showGooglePay + ", primaryButtonVisible=" + this.primaryButtonVisible + ", canEdit=" + this.canEdit + ", canRemovePaymentMethods=" + this.canRemovePaymentMethods + ", errorMessage=" + this.errorMessage + ", mandateText=" + this.mandateText + ", isCbcEligible=" + this.isCbcEligible + ")";
        }

        public /* synthetic */ SelectPaymentMethod(String str, List list, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, ResolvableString resolvableString, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, paymentSelection, z, z2, z3, z4, z5, z6, z7, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : resolvableString, z8);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<PaymentMethod> getSavedPaymentMethods() {
            return this.savedPaymentMethods;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isLiveMode */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isProcessing */
        public boolean getIsProcessing() {
            return this.isProcessing;
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final boolean getShowGooglePay() {
            return this.showGooglePay;
        }

        public final boolean getPrimaryButtonVisible() {
            return this.primaryButtonVisible;
        }

        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final boolean getCanRemovePaymentMethods() {
            return this.canRemovePaymentMethods;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        public final boolean isCbcEligible() {
            return this.isCbcEligible;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentMethod(String str, List<PaymentMethod> savedPaymentMethods, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, ResolvableString resolvableString, boolean z8) {
            super(z, z2, false, null);
            Intrinsics.checkNotNullParameter(savedPaymentMethods, "savedPaymentMethods");
            this.title = str;
            this.savedPaymentMethods = savedPaymentMethods;
            this.paymentSelection = paymentSelection;
            this.isLiveMode = z;
            this.isProcessing = z2;
            this.isEditing = z3;
            this.showGooglePay = z4;
            this.primaryButtonVisible = z5;
            this.canEdit = z6;
            this.canRemovePaymentMethods = z7;
            this.errorMessage = str2;
            this.mandateText = resolvableString;
            this.isCbcEligible = z8;
            this.primaryButtonLabel = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_confirm);
        }

        public final ResolvableString getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public final boolean getPrimaryButtonEnabled() {
            return !getIsProcessing();
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        public PaymentSheetTopBarState topBarState(Function0<Unit> onEditIconPressed) {
            Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
            return PaymentSheetTopBarStateFactory.INSTANCE.create(getIsLiveMode(), new PaymentSheetTopBarState.Editable.Maybe(this.isEditing, this.canEdit, onEditIconPressed));
        }
    }

    /* compiled from: CustomerSheetViewState.kt */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0016\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0016J\r\u0010G\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\t\u0010L\u001a\u00020\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010N\u001a\u00020\u0013HÆ\u0003J\t\u0010O\u001a\u00020\u0013HÆ\u0003J\t\u0010P\u001a\u00020\u0013HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010R\u001a\u00020\u0013HÆ\u0003J\t\u0010S\u001a\u00020\u0017HÆ\u0003J\t\u0010T\u001a\u00020\u0013HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010W\u001a\u00020\u0013HÆ\u0003J\t\u0010X\u001a\u00020\u0013HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010Z\u001a\u00020#HÆ\u0003Jí\u0001\u0010[\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#HÆ\u0001J\u0013\u0010\\\u001a\u00020\u00132\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020`HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00104R\u0014\u0010\u0015\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u00104R\u0011\u0010\u0019\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\u001e\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001f\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "supportedPaymentMethods", "", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "formFieldValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "formElements", "Lcom/stripe/android/uicore/elements/FormElement;", "formArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "usBankAccountFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "draftPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", ViewProps.ENABLED, "", NamedConstantsKt.IS_LIVE_MODE, "isProcessing", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "isFirstPaymentMethod", "primaryButtonLabel", "primaryButtonEnabled", "customPrimaryButtonUiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "mandateText", "showMandateAbovePrimaryButton", "displayDismissConfirmationModal", "bankAccountSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getSupportedPaymentMethods", "()Ljava/util/List;", "getFormFieldValues", "()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "getFormElements", "getFormArguments", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "getUsBankAccountFormArguments", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "getDraftPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getEnabled", "()Z", "getErrorMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getPrimaryButtonLabel", "getPrimaryButtonEnabled", "getCustomPrimaryButtonUiState", "()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "getMandateText", "getShowMandateAbovePrimaryButton", "getDisplayDismissConfirmationModal", "getBankAccountSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "onEditIconPressed", "Lkotlin/Function0;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethod extends CustomerSheetViewState {
        public static final int $stable = 8;
        private final PaymentSelection.New.USBankAccount bankAccountSelection;
        private final PrimaryButton.UIState customPrimaryButtonUiState;
        private final boolean displayDismissConfirmationModal;
        private final PaymentSelection draftPaymentSelection;
        private final boolean enabled;
        private final ResolvableString errorMessage;
        private final ErrorReporter errorReporter;
        private final FormArguments formArguments;
        private final List<FormElement> formElements;
        private final FormFieldValues formFieldValues;
        private final boolean isFirstPaymentMethod;
        private final boolean isLiveMode;
        private final boolean isProcessing;
        private final ResolvableString mandateText;
        private final String paymentMethodCode;
        private final boolean primaryButtonEnabled;
        private final ResolvableString primaryButtonLabel;
        private final boolean showMandateAbovePrimaryButton;
        private final List<SupportedPaymentMethod> supportedPaymentMethods;
        private final USBankAccountFormArguments usBankAccountFormArguments;

        public static /* synthetic */ AddPaymentMethod copy$default(AddPaymentMethod addPaymentMethod, String str, List list, FormFieldValues formFieldValues, List list2, FormArguments formArguments, USBankAccountFormArguments uSBankAccountFormArguments, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, ResolvableString resolvableString, boolean z4, ResolvableString resolvableString2, boolean z5, PrimaryButton.UIState uIState, ResolvableString resolvableString3, boolean z6, boolean z7, PaymentSelection.New.USBankAccount uSBankAccount, ErrorReporter errorReporter, int i, Object obj) {
            ErrorReporter errorReporter2;
            PaymentSelection.New.USBankAccount uSBankAccount2;
            String str2 = (i & 1) != 0 ? addPaymentMethod.paymentMethodCode : str;
            List list3 = (i & 2) != 0 ? addPaymentMethod.supportedPaymentMethods : list;
            FormFieldValues formFieldValues2 = (i & 4) != 0 ? addPaymentMethod.formFieldValues : formFieldValues;
            List list4 = (i & 8) != 0 ? addPaymentMethod.formElements : list2;
            FormArguments formArguments2 = (i & 16) != 0 ? addPaymentMethod.formArguments : formArguments;
            USBankAccountFormArguments uSBankAccountFormArguments2 = (i & 32) != 0 ? addPaymentMethod.usBankAccountFormArguments : uSBankAccountFormArguments;
            PaymentSelection paymentSelection2 = (i & 64) != 0 ? addPaymentMethod.draftPaymentSelection : paymentSelection;
            boolean z8 = (i & 128) != 0 ? addPaymentMethod.enabled : z;
            boolean z9 = (i & 256) != 0 ? addPaymentMethod.isLiveMode : z2;
            boolean z10 = (i & 512) != 0 ? addPaymentMethod.isProcessing : z3;
            ResolvableString resolvableString4 = (i & 1024) != 0 ? addPaymentMethod.errorMessage : resolvableString;
            boolean z11 = (i & 2048) != 0 ? addPaymentMethod.isFirstPaymentMethod : z4;
            ResolvableString resolvableString5 = (i & 4096) != 0 ? addPaymentMethod.primaryButtonLabel : resolvableString2;
            boolean z12 = (i & 8192) != 0 ? addPaymentMethod.primaryButtonEnabled : z5;
            String str3 = str2;
            PrimaryButton.UIState uIState2 = (i & 16384) != 0 ? addPaymentMethod.customPrimaryButtonUiState : uIState;
            ResolvableString resolvableString6 = (i & 32768) != 0 ? addPaymentMethod.mandateText : resolvableString3;
            boolean z13 = (i & 65536) != 0 ? addPaymentMethod.showMandateAbovePrimaryButton : z6;
            boolean z14 = (i & 131072) != 0 ? addPaymentMethod.displayDismissConfirmationModal : z7;
            PaymentSelection.New.USBankAccount uSBankAccount3 = (i & 262144) != 0 ? addPaymentMethod.bankAccountSelection : uSBankAccount;
            if ((i & 524288) != 0) {
                uSBankAccount2 = uSBankAccount3;
                errorReporter2 = addPaymentMethod.errorReporter;
            } else {
                errorReporter2 = errorReporter;
                uSBankAccount2 = uSBankAccount3;
            }
            return addPaymentMethod.copy(str3, list3, formFieldValues2, list4, formArguments2, uSBankAccountFormArguments2, paymentSelection2, z8, z9, z10, resolvableString4, z11, resolvableString5, z12, uIState2, resolvableString6, z13, z14, uSBankAccount2, errorReporter2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        /* renamed from: component11, reason: from getter */
        public final ResolvableString getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsFirstPaymentMethod() {
            return this.isFirstPaymentMethod;
        }

        /* renamed from: component13, reason: from getter */
        public final ResolvableString getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        /* renamed from: component15, reason: from getter */
        public final PrimaryButton.UIState getCustomPrimaryButtonUiState() {
            return this.customPrimaryButtonUiState;
        }

        /* renamed from: component16, reason: from getter */
        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getShowMandateAbovePrimaryButton() {
            return this.showMandateAbovePrimaryButton;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getDisplayDismissConfirmationModal() {
            return this.displayDismissConfirmationModal;
        }

        /* renamed from: component19, reason: from getter */
        public final PaymentSelection.New.USBankAccount getBankAccountSelection() {
            return this.bankAccountSelection;
        }

        public final List<SupportedPaymentMethod> component2() {
            return this.supportedPaymentMethods;
        }

        /* renamed from: component20, reason: from getter */
        public final ErrorReporter getErrorReporter() {
            return this.errorReporter;
        }

        /* renamed from: component3, reason: from getter */
        public final FormFieldValues getFormFieldValues() {
            return this.formFieldValues;
        }

        public final List<FormElement> component4() {
            return this.formElements;
        }

        /* renamed from: component5, reason: from getter */
        public final FormArguments getFormArguments() {
            return this.formArguments;
        }

        /* renamed from: component6, reason: from getter */
        public final USBankAccountFormArguments getUsBankAccountFormArguments() {
            return this.usBankAccountFormArguments;
        }

        /* renamed from: component7, reason: from getter */
        public final PaymentSelection getDraftPaymentSelection() {
            return this.draftPaymentSelection;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public final AddPaymentMethod copy(String paymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormFieldValues formFieldValues, List<? extends FormElement> formElements, FormArguments formArguments, USBankAccountFormArguments usBankAccountFormArguments, PaymentSelection draftPaymentSelection, boolean enabled, boolean isLiveMode, boolean isProcessing, ResolvableString errorMessage, boolean isFirstPaymentMethod, ResolvableString primaryButtonLabel, boolean primaryButtonEnabled, PrimaryButton.UIState customPrimaryButtonUiState, ResolvableString mandateText, boolean showMandateAbovePrimaryButton, boolean displayDismissConfirmationModal, PaymentSelection.New.USBankAccount bankAccountSelection, ErrorReporter errorReporter) {
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
            Intrinsics.checkNotNullParameter(formElements, "formElements");
            Intrinsics.checkNotNullParameter(formArguments, "formArguments");
            Intrinsics.checkNotNullParameter(usBankAccountFormArguments, "usBankAccountFormArguments");
            Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            return new AddPaymentMethod(paymentMethodCode, supportedPaymentMethods, formFieldValues, formElements, formArguments, usBankAccountFormArguments, draftPaymentSelection, enabled, isLiveMode, isProcessing, errorMessage, isFirstPaymentMethod, primaryButtonLabel, primaryButtonEnabled, customPrimaryButtonUiState, mandateText, showMandateAbovePrimaryButton, displayDismissConfirmationModal, bankAccountSelection, errorReporter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddPaymentMethod)) {
                return false;
            }
            AddPaymentMethod addPaymentMethod = (AddPaymentMethod) other;
            return Intrinsics.areEqual(this.paymentMethodCode, addPaymentMethod.paymentMethodCode) && Intrinsics.areEqual(this.supportedPaymentMethods, addPaymentMethod.supportedPaymentMethods) && Intrinsics.areEqual(this.formFieldValues, addPaymentMethod.formFieldValues) && Intrinsics.areEqual(this.formElements, addPaymentMethod.formElements) && Intrinsics.areEqual(this.formArguments, addPaymentMethod.formArguments) && Intrinsics.areEqual(this.usBankAccountFormArguments, addPaymentMethod.usBankAccountFormArguments) && Intrinsics.areEqual(this.draftPaymentSelection, addPaymentMethod.draftPaymentSelection) && this.enabled == addPaymentMethod.enabled && this.isLiveMode == addPaymentMethod.isLiveMode && this.isProcessing == addPaymentMethod.isProcessing && Intrinsics.areEqual(this.errorMessage, addPaymentMethod.errorMessage) && this.isFirstPaymentMethod == addPaymentMethod.isFirstPaymentMethod && Intrinsics.areEqual(this.primaryButtonLabel, addPaymentMethod.primaryButtonLabel) && this.primaryButtonEnabled == addPaymentMethod.primaryButtonEnabled && Intrinsics.areEqual(this.customPrimaryButtonUiState, addPaymentMethod.customPrimaryButtonUiState) && Intrinsics.areEqual(this.mandateText, addPaymentMethod.mandateText) && this.showMandateAbovePrimaryButton == addPaymentMethod.showMandateAbovePrimaryButton && this.displayDismissConfirmationModal == addPaymentMethod.displayDismissConfirmationModal && Intrinsics.areEqual(this.bankAccountSelection, addPaymentMethod.bankAccountSelection) && Intrinsics.areEqual(this.errorReporter, addPaymentMethod.errorReporter);
        }

        public int hashCode() {
            int iHashCode = ((this.paymentMethodCode.hashCode() * 31) + this.supportedPaymentMethods.hashCode()) * 31;
            FormFieldValues formFieldValues = this.formFieldValues;
            int iHashCode2 = (((((((iHashCode + (formFieldValues == null ? 0 : formFieldValues.hashCode())) * 31) + this.formElements.hashCode()) * 31) + this.formArguments.hashCode()) * 31) + this.usBankAccountFormArguments.hashCode()) * 31;
            PaymentSelection paymentSelection = this.draftPaymentSelection;
            int iHashCode3 = (((((((iHashCode2 + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isLiveMode)) * 31) + Boolean.hashCode(this.isProcessing)) * 31;
            ResolvableString resolvableString = this.errorMessage;
            int iHashCode4 = (((((((iHashCode3 + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + Boolean.hashCode(this.isFirstPaymentMethod)) * 31) + this.primaryButtonLabel.hashCode()) * 31) + Boolean.hashCode(this.primaryButtonEnabled)) * 31;
            PrimaryButton.UIState uIState = this.customPrimaryButtonUiState;
            int iHashCode5 = (iHashCode4 + (uIState == null ? 0 : uIState.hashCode())) * 31;
            ResolvableString resolvableString2 = this.mandateText;
            int iHashCode6 = (((((iHashCode5 + (resolvableString2 == null ? 0 : resolvableString2.hashCode())) * 31) + Boolean.hashCode(this.showMandateAbovePrimaryButton)) * 31) + Boolean.hashCode(this.displayDismissConfirmationModal)) * 31;
            PaymentSelection.New.USBankAccount uSBankAccount = this.bankAccountSelection;
            return ((iHashCode6 + (uSBankAccount != null ? uSBankAccount.hashCode() : 0)) * 31) + this.errorReporter.hashCode();
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.paymentMethodCode + ", supportedPaymentMethods=" + this.supportedPaymentMethods + ", formFieldValues=" + this.formFieldValues + ", formElements=" + this.formElements + ", formArguments=" + this.formArguments + ", usBankAccountFormArguments=" + this.usBankAccountFormArguments + ", draftPaymentSelection=" + this.draftPaymentSelection + ", enabled=" + this.enabled + ", isLiveMode=" + this.isLiveMode + ", isProcessing=" + this.isProcessing + ", errorMessage=" + this.errorMessage + ", isFirstPaymentMethod=" + this.isFirstPaymentMethod + ", primaryButtonLabel=" + this.primaryButtonLabel + ", primaryButtonEnabled=" + this.primaryButtonEnabled + ", customPrimaryButtonUiState=" + this.customPrimaryButtonUiState + ", mandateText=" + this.mandateText + ", showMandateAbovePrimaryButton=" + this.showMandateAbovePrimaryButton + ", displayDismissConfirmationModal=" + this.displayDismissConfirmationModal + ", bankAccountSelection=" + this.bankAccountSelection + ", errorReporter=" + this.errorReporter + ")";
        }

        public /* synthetic */ AddPaymentMethod(String str, List list, FormFieldValues formFieldValues, List list2, FormArguments formArguments, USBankAccountFormArguments uSBankAccountFormArguments, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, ResolvableString resolvableString, boolean z4, ResolvableString resolvableString2, boolean z5, PrimaryButton.UIState uIState, ResolvableString resolvableString3, boolean z6, boolean z7, PaymentSelection.New.USBankAccount uSBankAccount, ErrorReporter errorReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, formFieldValues, list2, formArguments, uSBankAccountFormArguments, paymentSelection, z, z2, z3, (i & 1024) != 0 ? null : resolvableString, z4, resolvableString2, z5, uIState, (32768 & i) != 0 ? null : resolvableString3, (65536 & i) != 0 ? false : z6, (i & 131072) != 0 ? false : z7, uSBankAccount, errorReporter);
        }

        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public final List<SupportedPaymentMethod> getSupportedPaymentMethods() {
            return this.supportedPaymentMethods;
        }

        public final FormFieldValues getFormFieldValues() {
            return this.formFieldValues;
        }

        public final List<FormElement> getFormElements() {
            return this.formElements;
        }

        public final FormArguments getFormArguments() {
            return this.formArguments;
        }

        public final USBankAccountFormArguments getUsBankAccountFormArguments() {
            return this.usBankAccountFormArguments;
        }

        public final PaymentSelection getDraftPaymentSelection() {
            return this.draftPaymentSelection;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isLiveMode */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isProcessing */
        public boolean getIsProcessing() {
            return this.isProcessing;
        }

        public final ResolvableString getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean isFirstPaymentMethod() {
            return this.isFirstPaymentMethod;
        }

        public final ResolvableString getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        public final PrimaryButton.UIState getCustomPrimaryButtonUiState() {
            return this.customPrimaryButtonUiState;
        }

        public final ResolvableString getMandateText() {
            return this.mandateText;
        }

        public final boolean getShowMandateAbovePrimaryButton() {
            return this.showMandateAbovePrimaryButton;
        }

        public final boolean getDisplayDismissConfirmationModal() {
            return this.displayDismissConfirmationModal;
        }

        public final PaymentSelection.New.USBankAccount getBankAccountSelection() {
            return this.bankAccountSelection;
        }

        public final ErrorReporter getErrorReporter() {
            return this.errorReporter;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AddPaymentMethod(String paymentMethodCode, List<SupportedPaymentMethod> supportedPaymentMethods, FormFieldValues formFieldValues, List<? extends FormElement> formElements, FormArguments formArguments, USBankAccountFormArguments usBankAccountFormArguments, PaymentSelection paymentSelection, boolean z, boolean z2, boolean z3, ResolvableString resolvableString, boolean z4, ResolvableString primaryButtonLabel, boolean z5, PrimaryButton.UIState uIState, ResolvableString resolvableString2, boolean z6, boolean z7, PaymentSelection.New.USBankAccount uSBankAccount, ErrorReporter errorReporter) {
            super(z2, z3, !z4, null);
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
            Intrinsics.checkNotNullParameter(formElements, "formElements");
            Intrinsics.checkNotNullParameter(formArguments, "formArguments");
            Intrinsics.checkNotNullParameter(usBankAccountFormArguments, "usBankAccountFormArguments");
            Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            this.paymentMethodCode = paymentMethodCode;
            this.supportedPaymentMethods = supportedPaymentMethods;
            this.formFieldValues = formFieldValues;
            this.formElements = formElements;
            this.formArguments = formArguments;
            this.usBankAccountFormArguments = usBankAccountFormArguments;
            this.draftPaymentSelection = paymentSelection;
            this.enabled = z;
            this.isLiveMode = z2;
            this.isProcessing = z3;
            this.errorMessage = resolvableString;
            this.isFirstPaymentMethod = z4;
            this.primaryButtonLabel = primaryButtonLabel;
            this.primaryButtonEnabled = z5;
            this.customPrimaryButtonUiState = uIState;
            this.mandateText = resolvableString2;
            this.showMandateAbovePrimaryButton = z6;
            this.displayDismissConfirmationModal = z7;
            this.bankAccountSelection = uSBankAccount;
            this.errorReporter = errorReporter;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        public PaymentSheetTopBarState topBarState(Function0<Unit> onEditIconPressed) {
            Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
            return PaymentSheetTopBarStateFactory.INSTANCE.create(getIsLiveMode(), PaymentSheetTopBarState.Editable.Never.INSTANCE);
        }
    }

    /* compiled from: CustomerSheetViewState.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", "updatePaymentMethodInteractor", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", NamedConstantsKt.IS_LIVE_MODE, "", "<init>", "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)V", "getUpdatePaymentMethodInteractor", "()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", "()Z", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "onEditIconPressed", "Lkotlin/Function0;", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatePaymentMethod extends CustomerSheetViewState {
        public static final int $stable = 8;
        private final boolean isLiveMode;
        private final UpdatePaymentMethodInteractor updatePaymentMethodInteractor;

        public static /* synthetic */ UpdatePaymentMethod copy$default(UpdatePaymentMethod updatePaymentMethod, UpdatePaymentMethodInteractor updatePaymentMethodInteractor, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                updatePaymentMethodInteractor = updatePaymentMethod.updatePaymentMethodInteractor;
            }
            if ((i & 2) != 0) {
                z = updatePaymentMethod.isLiveMode;
            }
            return updatePaymentMethod.copy(updatePaymentMethodInteractor, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UpdatePaymentMethodInteractor getUpdatePaymentMethodInteractor() {
            return this.updatePaymentMethodInteractor;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        public final UpdatePaymentMethod copy(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, boolean isLiveMode) {
            Intrinsics.checkNotNullParameter(updatePaymentMethodInteractor, "updatePaymentMethodInteractor");
            return new UpdatePaymentMethod(updatePaymentMethodInteractor, isLiveMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatePaymentMethod)) {
                return false;
            }
            UpdatePaymentMethod updatePaymentMethod = (UpdatePaymentMethod) other;
            return Intrinsics.areEqual(this.updatePaymentMethodInteractor, updatePaymentMethod.updatePaymentMethodInteractor) && this.isLiveMode == updatePaymentMethod.isLiveMode;
        }

        public int hashCode() {
            return (this.updatePaymentMethodInteractor.hashCode() * 31) + Boolean.hashCode(this.isLiveMode);
        }

        public String toString() {
            return "UpdatePaymentMethod(updatePaymentMethodInteractor=" + this.updatePaymentMethodInteractor + ", isLiveMode=" + this.isLiveMode + ")";
        }

        public final UpdatePaymentMethodInteractor getUpdatePaymentMethodInteractor() {
            return this.updatePaymentMethodInteractor;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        /* renamed from: isLiveMode */
        public boolean getIsLiveMode() {
            return this.isLiveMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePaymentMethod(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, boolean z) {
            super(z, false, true, null);
            Intrinsics.checkNotNullParameter(updatePaymentMethodInteractor, "updatePaymentMethodInteractor");
            this.updatePaymentMethodInteractor = updatePaymentMethodInteractor;
            this.isLiveMode = z;
        }

        @Override // com.stripe.android.customersheet.CustomerSheetViewState
        public PaymentSheetTopBarState topBarState(Function0<Unit> onEditIconPressed) {
            Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
            return PaymentSheetTopBarStateFactory.INSTANCE.create(getIsLiveMode(), PaymentSheetTopBarState.Editable.Never.INSTANCE);
        }
    }
}
