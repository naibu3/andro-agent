package com.stripe.android.paymentsheet;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CustomerStateHolder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0011J\u0010\u0010!\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0011R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000e¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "", "customerMetadataPermissions", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/flow/StateFlow;)V", "customer", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "getCustomer", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethods", "mostRecentlySelectedSavedPaymentMethod", "getMostRecentlySelectedSavedPaymentMethod", "canRemoveDuplicate", "", "getCanRemoveDuplicate", "canRemove", "getCanRemove", "canUpdateFullPaymentMethodDetails", "getCanUpdateFullPaymentMethodDetails", "setCustomerState", "", "customerState", "setDefaultPaymentMethod", "paymentMethod", "updateMostRecentlySelectedSavedPaymentMethod", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomerStateHolder {
    public static final String SAVED_CUSTOMER = "customer_info";
    public static final String SAVED_PM_SELECTION = "saved_selection";
    private final StateFlow<Boolean> canRemove;
    private final StateFlow<Boolean> canRemoveDuplicate;
    private final StateFlow<Boolean> canUpdateFullPaymentMethodDetails;
    private final StateFlow<CustomerState> customer;
    private final StateFlow<CustomerMetadata.Permissions> customerMetadataPermissions;
    private final StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod;
    private final StateFlow<List<PaymentMethod>> paymentMethods;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<PaymentSelection> selection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerStateHolder(StateFlow<CustomerMetadata.Permissions> customerMetadataPermissions, SavedStateHandle savedStateHandle, StateFlow<? extends PaymentSelection> selection) {
        Intrinsics.checkNotNullParameter(customerMetadataPermissions, "customerMetadataPermissions");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.customerMetadataPermissions = customerMetadataPermissions;
        this.savedStateHandle = savedStateHandle;
        this.selection = selection;
        StateFlow<CustomerState> stateFlow = savedStateHandle.getStateFlow(SAVED_CUSTOMER, null);
        this.customer = stateFlow;
        StateFlow<List<PaymentMethod>> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(stateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.CustomerStateHolder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerStateHolder.paymentMethods$lambda$0((CustomerState) obj);
            }
        });
        this.paymentMethods = stateFlowMapAsStateFlow;
        Object value = selection.getValue();
        PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
        this.mostRecentlySelectedSavedPaymentMethod = savedStateHandle.getStateFlow(SAVED_PM_SELECTION, saved != null ? saved.getPaymentMethod() : null);
        this.canRemoveDuplicate = StateFlowsKt.combineAsStateFlow(stateFlow, customerMetadataPermissions, new Function2() { // from class: com.stripe.android.paymentsheet.CustomerStateHolder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(CustomerStateHolder.canRemoveDuplicate$lambda$1((CustomerState) obj, (CustomerMetadata.Permissions) obj2));
            }
        });
        this.canRemove = StateFlowsKt.combineAsStateFlow(stateFlowMapAsStateFlow, customerMetadataPermissions, new Function2() { // from class: com.stripe.android.paymentsheet.CustomerStateHolder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(CustomerStateHolder.canRemove$lambda$3((List) obj, (CustomerMetadata.Permissions) obj2));
            }
        });
        this.canUpdateFullPaymentMethodDetails = StateFlowsKt.mapAsStateFlow(customerMetadataPermissions, new Function1() { // from class: com.stripe.android.paymentsheet.CustomerStateHolder$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CustomerStateHolder.canUpdateFullPaymentMethodDetails$lambda$4((CustomerMetadata.Permissions) obj));
            }
        });
    }

    public final StateFlow<CustomerState> getCustomer() {
        return this.customer;
    }

    public final StateFlow<List<PaymentMethod>> getPaymentMethods() {
        return this.paymentMethods;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List paymentMethods$lambda$0(CustomerState customerState) {
        List<PaymentMethod> paymentMethods;
        return (customerState == null || (paymentMethods = customerState.getPaymentMethods()) == null) ? CollectionsKt.emptyList() : paymentMethods;
    }

    public final StateFlow<PaymentMethod> getMostRecentlySelectedSavedPaymentMethod() {
        return this.mostRecentlySelectedSavedPaymentMethod;
    }

    public final StateFlow<Boolean> getCanRemoveDuplicate() {
        return this.canRemoveDuplicate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canRemoveDuplicate$lambda$1(CustomerState customerState, CustomerMetadata.Permissions permissions) {
        if (permissions != null) {
            return permissions.getCanRemoveDuplicates();
        }
        return false;
    }

    public final StateFlow<Boolean> getCanRemove() {
        return this.canRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canRemove$lambda$3(List paymentMethods, CustomerMetadata.Permissions permissions) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        if (permissions != null) {
            boolean canRemovePaymentMethods = permissions.getCanRemovePaymentMethods();
            boolean canRemoveLastPaymentMethod = permissions.getCanRemoveLastPaymentMethod();
            int size = paymentMethods.size();
            if (size != 0) {
                if (size != 1) {
                    return canRemovePaymentMethods;
                }
                if (canRemoveLastPaymentMethod && canRemovePaymentMethods) {
                    return true;
                }
            }
        }
        return false;
    }

    public final StateFlow<Boolean> getCanUpdateFullPaymentMethodDetails() {
        return this.canUpdateFullPaymentMethodDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canUpdateFullPaymentMethodDetails$lambda$4(CustomerMetadata.Permissions permissions) {
        if (permissions != null) {
            return permissions.getCanUpdateFullPaymentMethodDetails();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCustomerState(CustomerState customerState) {
        List<PaymentMethod> paymentMethods;
        this.savedStateHandle.set(SAVED_CUSTOMER, customerState);
        PaymentMethod value = this.mostRecentlySelectedSavedPaymentMethod.getValue();
        PaymentMethod paymentMethod = null;
        if (customerState != null && (paymentMethods = customerState.getPaymentMethods()) != null) {
            Iterator<T> it = paymentMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((PaymentMethod) next).id, value != null ? value.id : null)) {
                    paymentMethod = next;
                    break;
                }
            }
            paymentMethod = paymentMethod;
        }
        updateMostRecentlySelectedSavedPaymentMethod(paymentMethod);
    }

    public final void setDefaultPaymentMethod(PaymentMethod paymentMethod) {
        CustomerState value = this.customer.getValue();
        CustomerState customerStateCopy$default = null;
        if (value != null) {
            customerStateCopy$default = CustomerState.copy$default(value, null, null, null, null, paymentMethod != null ? paymentMethod.id : null, 15, null);
        }
        this.savedStateHandle.set(SAVED_CUSTOMER, customerStateCopy$default);
    }

    public final void updateMostRecentlySelectedSavedPaymentMethod(PaymentMethod paymentMethod) {
        this.savedStateHandle.set(SAVED_PM_SELECTION, paymentMethod);
    }

    /* compiled from: CustomerStateHolder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;", "", "<init>", "()V", "SAVED_CUSTOMER", "", "SAVED_PM_SELECTION", "create", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CustomerStateHolder create(BaseSheetViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new CustomerStateHolder(StateFlowsKt.mapAsStateFlow(viewModel.getPaymentMethodMetadata$paymentsheet_release(), new Function1() { // from class: com.stripe.android.paymentsheet.CustomerStateHolder$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomerStateHolder.Companion.create$lambda$0((PaymentMethodMetadata) obj);
                }
            }), viewModel.getSavedStateHandle(), viewModel.getSelection$paymentsheet_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerMetadata.Permissions create$lambda$0(PaymentMethodMetadata paymentMethodMetadata) {
            CustomerMetadata customerMetadata;
            if (paymentMethodMetadata == null || (customerMetadata = paymentMethodMetadata.getCustomerMetadata()) == null) {
                return null;
            }
            return customerMetadata.getPermissions();
        }
    }
}
