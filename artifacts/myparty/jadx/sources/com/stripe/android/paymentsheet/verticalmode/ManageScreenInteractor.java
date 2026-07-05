package com.stripe.android.paymentsheet.verticalmode;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarStateFactory;
import com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManageScreenInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "", NamedConstantsKt.IS_LIVE_MODE, "", "()Z", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "", "viewAction", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "close", "State", "ViewAction", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ManageScreenInteractor {
    void close();

    StateFlow<State> getState();

    void handleViewAction(ViewAction viewAction);

    boolean isLiveMode();

    /* compiled from: ManageScreenInteractor.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J9\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;", "", "paymentMethods", "", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "currentSelection", "isEditing", "", "canEdit", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZZ)V", "getPaymentMethods", "()Ljava/util/List;", "getCurrentSelection", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "()Z", "getCanEdit", "containsOnlyCards", "getContainsOnlyCards", "containsOnlyCards$delegate", "Lkotlin/Lazy;", "manageTitle", "Lcom/stripe/android/core/strings/ResolvableString;", "getManageTitle", "()Lcom/stripe/android/core/strings/ResolvableString;", "selectTitle", "getSelectTitle", "title", "getTitle", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final boolean canEdit;

        /* renamed from: containsOnlyCards$delegate, reason: from kotlin metadata */
        private final Lazy containsOnlyCards;
        private final DisplayableSavedPaymentMethod currentSelection;
        private final boolean isEditing;
        private final List<DisplayableSavedPaymentMethod> paymentMethods;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, List list, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = state.paymentMethods;
            }
            if ((i & 2) != 0) {
                displayableSavedPaymentMethod = state.currentSelection;
            }
            if ((i & 4) != 0) {
                z = state.isEditing;
            }
            if ((i & 8) != 0) {
                z2 = state.canEdit;
            }
            return state.copy(list, displayableSavedPaymentMethod, z, z2);
        }

        public final List<DisplayableSavedPaymentMethod> component1() {
            return this.paymentMethods;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayableSavedPaymentMethod getCurrentSelection() {
            return this.currentSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEditing() {
            return this.isEditing;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final State copy(List<DisplayableSavedPaymentMethod> paymentMethods, DisplayableSavedPaymentMethod currentSelection, boolean isEditing, boolean canEdit) {
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            return new State(paymentMethods, currentSelection, isEditing, canEdit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.paymentMethods, state.paymentMethods) && Intrinsics.areEqual(this.currentSelection, state.currentSelection) && this.isEditing == state.isEditing && this.canEdit == state.canEdit;
        }

        public int hashCode() {
            int iHashCode = this.paymentMethods.hashCode() * 31;
            DisplayableSavedPaymentMethod displayableSavedPaymentMethod = this.currentSelection;
            return ((((iHashCode + (displayableSavedPaymentMethod == null ? 0 : displayableSavedPaymentMethod.hashCode())) * 31) + Boolean.hashCode(this.isEditing)) * 31) + Boolean.hashCode(this.canEdit);
        }

        public String toString() {
            return "State(paymentMethods=" + this.paymentMethods + ", currentSelection=" + this.currentSelection + ", isEditing=" + this.isEditing + ", canEdit=" + this.canEdit + ")";
        }

        public State(List<DisplayableSavedPaymentMethod> paymentMethods, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            this.paymentMethods = paymentMethods;
            this.currentSelection = displayableSavedPaymentMethod;
            this.isEditing = z;
            this.canEdit = z2;
            this.containsOnlyCards = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor$State$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(ManageScreenInteractor.State.containsOnlyCards_delegate$lambda$1(this.f$0));
                }
            });
        }

        public final List<DisplayableSavedPaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final DisplayableSavedPaymentMethod getCurrentSelection() {
            return this.currentSelection;
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final boolean getCanEdit() {
            return this.canEdit;
        }

        private final boolean getContainsOnlyCards() {
            return ((Boolean) this.containsOnlyCards.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean containsOnlyCards_delegate$lambda$1(State state) {
            if (state.paymentMethods.isEmpty()) {
                return false;
            }
            List<DisplayableSavedPaymentMethod> list = state.paymentMethods;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((DisplayableSavedPaymentMethod) it.next()).isCard()) {
                    return false;
                }
            }
            return true;
        }

        private final ResolvableString getManageTitle() {
            int i;
            if (getContainsOnlyCards()) {
                i = R.string.stripe_paymentsheet_manage_cards;
            } else {
                i = R.string.stripe_paymentsheet_manage_payment_methods;
            }
            return ResolvableStringUtilsKt.getResolvableString(i);
        }

        private final ResolvableString getSelectTitle() {
            int i;
            if (getContainsOnlyCards()) {
                i = R.string.stripe_paymentsheet_select_card;
            } else {
                i = R.string.stripe_paymentsheet_select_payment_method;
            }
            return ResolvableStringUtilsKt.getResolvableString(i);
        }

        public final ResolvableString getTitle() {
            if (this.isEditing) {
                return getManageTitle();
            }
            return getSelectTitle();
        }

        public final PaymentSheetTopBarState topBarState(final ManageScreenInteractor interactor) {
            Intrinsics.checkNotNullParameter(interactor, "interactor");
            return PaymentSheetTopBarStateFactory.INSTANCE.create(interactor.isLiveMode(), new PaymentSheetTopBarState.Editable.Maybe(this.isEditing, this.canEdit, new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor$State$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ManageScreenInteractor.State.topBarState$lambda$2(interactor);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit topBarState$lambda$2(ManageScreenInteractor manageScreenInteractor) {
            manageScreenInteractor.handleViewAction(ViewAction.ToggleEdit.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ManageScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "", "<init>", "()V", "SelectPaymentMethod", "UpdatePaymentMethod", "ToggleEdit", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$ToggleEdit;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$UpdatePaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewAction {
        public static final int $stable = 0;

        public /* synthetic */ ViewAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ManageScreenInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$SelectPaymentMethod;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "paymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SelectPaymentMethod extends ViewAction {
            public static final int $stable = 8;
            private final DisplayableSavedPaymentMethod paymentMethod;

            public static /* synthetic */ SelectPaymentMethod copy$default(SelectPaymentMethod selectPaymentMethod, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    displayableSavedPaymentMethod = selectPaymentMethod.paymentMethod;
                }
                return selectPaymentMethod.copy(displayableSavedPaymentMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final SelectPaymentMethod copy(DisplayableSavedPaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new SelectPaymentMethod(paymentMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectPaymentMethod) && Intrinsics.areEqual(this.paymentMethod, ((SelectPaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectPaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }
        }

        private ViewAction() {
        }

        /* compiled from: ManageScreenInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$UpdatePaymentMethod;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "paymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdatePaymentMethod extends ViewAction {
            public static final int $stable = 8;
            private final DisplayableSavedPaymentMethod paymentMethod;

            public static /* synthetic */ UpdatePaymentMethod copy$default(UpdatePaymentMethod updatePaymentMethod, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    displayableSavedPaymentMethod = updatePaymentMethod.paymentMethod;
                }
                return updatePaymentMethod.copy(displayableSavedPaymentMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final UpdatePaymentMethod copy(DisplayableSavedPaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new UpdatePaymentMethod(paymentMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePaymentMethod) && Intrinsics.areEqual(this.paymentMethod, ((UpdatePaymentMethod) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "UpdatePaymentMethod(paymentMethod=" + this.paymentMethod + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePaymentMethod(DisplayableSavedPaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            public final DisplayableSavedPaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }
        }

        /* compiled from: ManageScreenInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction$ToggleEdit;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
                return -1354134144;
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
