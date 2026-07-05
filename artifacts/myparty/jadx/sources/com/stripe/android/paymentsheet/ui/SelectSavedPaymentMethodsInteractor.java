package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SelectSavedPaymentMethodsInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;", "", NamedConstantsKt.IS_LIVE_MODE, "", "()Z", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "", "viewAction", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "close", "State", "ViewAction", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SelectSavedPaymentMethodsInteractor {
    void close();

    StateFlow<State> getState();

    void handleViewAction(ViewAction viewAction);

    boolean isLiveMode();

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;", "", "paymentOptionsItems", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "selectedPaymentOptionsItem", "isEditing", "", "isProcessing", "canEdit", "canRemove", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZ)V", "getPaymentOptionsItems", "()Ljava/util/List;", "getSelectedPaymentOptionsItem", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "()Z", "getCanEdit", "getCanRemove", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final boolean canEdit;
        private final boolean canRemove;
        private final boolean isEditing;
        private final boolean isProcessing;
        private final List<PaymentOptionsItem> paymentOptionsItems;
        private final PaymentOptionsItem selectedPaymentOptionsItem;

        public static /* synthetic */ State copy$default(State state, List list, PaymentOptionsItem paymentOptionsItem, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = state.paymentOptionsItems;
            }
            if ((i & 2) != 0) {
                paymentOptionsItem = state.selectedPaymentOptionsItem;
            }
            if ((i & 4) != 0) {
                z = state.isEditing;
            }
            if ((i & 8) != 0) {
                z2 = state.isProcessing;
            }
            if ((i & 16) != 0) {
                z3 = state.canEdit;
            }
            if ((i & 32) != 0) {
                z4 = state.canRemove;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            return state.copy(list, paymentOptionsItem, z, z2, z5, z6);
        }

        public final List<PaymentOptionsItem> component1() {
            return this.paymentOptionsItems;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentOptionsItem getSelectedPaymentOptionsItem() {
            return this.selectedPaymentOptionsItem;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCanRemove() {
            return this.canRemove;
        }

        public final State copy(List<? extends PaymentOptionsItem> paymentOptionsItems, PaymentOptionsItem selectedPaymentOptionsItem, boolean isEditing, boolean isProcessing, boolean canEdit, boolean canRemove) {
            Intrinsics.checkNotNullParameter(paymentOptionsItems, "paymentOptionsItems");
            return new State(paymentOptionsItems, selectedPaymentOptionsItem, isEditing, isProcessing, canEdit, canRemove);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.paymentOptionsItems, state.paymentOptionsItems) && Intrinsics.areEqual(this.selectedPaymentOptionsItem, state.selectedPaymentOptionsItem) && this.isEditing == state.isEditing && this.isProcessing == state.isProcessing && this.canEdit == state.canEdit && this.canRemove == state.canRemove;
        }

        public int hashCode() {
            int iHashCode = this.paymentOptionsItems.hashCode() * 31;
            PaymentOptionsItem paymentOptionsItem = this.selectedPaymentOptionsItem;
            return ((((((((iHashCode + (paymentOptionsItem == null ? 0 : paymentOptionsItem.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.isProcessing)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.canRemove);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.paymentOptionsItems + ", selectedPaymentOptionsItem=" + this.selectedPaymentOptionsItem + ", isEditing=" + this.isEditing + ", isProcessing=" + this.isProcessing + ", canEdit=" + this.canEdit + ", canRemove=" + this.canRemove + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(List<? extends PaymentOptionsItem> paymentOptionsItems, PaymentOptionsItem paymentOptionsItem, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(paymentOptionsItems, "paymentOptionsItems");
            this.paymentOptionsItems = paymentOptionsItems;
            this.selectedPaymentOptionsItem = paymentOptionsItem;
            this.isEditing = z;
            this.isProcessing = z2;
            this.canEdit = z3;
            this.canRemove = z4;
        }

        public final List<PaymentOptionsItem> getPaymentOptionsItems() {
            return this.paymentOptionsItems;
        }

        public final PaymentOptionsItem getSelectedPaymentOptionsItem() {
            return this.selectedPaymentOptionsItem;
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final boolean isProcessing() {
            return this.isProcessing;
        }

        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final boolean getCanRemove() {
            return this.canRemove;
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "", "<init>", "()V", "AddCardPressed", "SelectPaymentMethod", "EditPaymentMethod", "ToggleEdit", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$AddCardPressed;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$EditPaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$ToggleEdit;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewAction {
        public static final int $stable = 0;

        public /* synthetic */ ViewAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$AddCardPressed;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddCardPressed extends ViewAction {
            public static final int $stable = 0;
            public static final AddCardPressed INSTANCE = new AddCardPressed();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddCardPressed)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 792087598;
            }

            public String toString() {
                return "AddCardPressed";
            }

            private AddCardPressed() {
                super(null);
            }
        }

        private ViewAction() {
        }

        /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SelectPaymentMethod extends ViewAction {
            public static final int $stable = 8;
            private final PaymentSelection selection;

            public static /* synthetic */ SelectPaymentMethod copy$default(SelectPaymentMethod selectPaymentMethod, PaymentSelection paymentSelection, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentSelection = selectPaymentMethod.selection;
                }
                return selectPaymentMethod.copy(paymentSelection);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentSelection getSelection() {
                return this.selection;
            }

            public final SelectPaymentMethod copy(PaymentSelection selection) {
                return new SelectPaymentMethod(selection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectPaymentMethod) && Intrinsics.areEqual(this.selection, ((SelectPaymentMethod) other).selection);
            }

            public int hashCode() {
                PaymentSelection paymentSelection = this.selection;
                if (paymentSelection == null) {
                    return 0;
                }
                return paymentSelection.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.selection + ")";
            }

            public SelectPaymentMethod(PaymentSelection paymentSelection) {
                super(null);
                this.selection = paymentSelection;
            }

            public final PaymentSelection getSelection() {
                return this.selection;
            }
        }

        /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$EditPaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "paymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EditPaymentMethod extends ViewAction {
            public static final int $stable = 8;
            private final DisplayableSavedPaymentMethod paymentMethod;

            public static /* synthetic */ EditPaymentMethod copy$default(EditPaymentMethod editPaymentMethod, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    displayableSavedPaymentMethod = editPaymentMethod.paymentMethod;
                }
                return editPaymentMethod.copy(displayableSavedPaymentMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final EditPaymentMethod copy(DisplayableSavedPaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new EditPaymentMethod(paymentMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EditPaymentMethod) && Intrinsics.areEqual(this.paymentMethod, ((EditPaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EditPaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }
        }

        /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction$ToggleEdit;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ToggleEdit extends ViewAction {
            public static final int $stable = 0;
            public static final ToggleEdit INSTANCE = new ToggleEdit();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToggleEdit)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2007142043;
            }

            public String toString() {
                return "ToggleEdit";
            }

            private ToggleEdit() {
                super(null);
            }
        }
    }
}
