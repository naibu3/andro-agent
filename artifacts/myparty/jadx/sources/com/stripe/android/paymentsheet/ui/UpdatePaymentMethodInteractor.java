package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UpdatePaymentMethodInteractor.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 62\u00020\u0001:\u00043456J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0012\u0010\u0017\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0012\u0010\u001a\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0012\u0010\u001c\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0012\u0010\u001e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0012\u0010 \u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00067"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", "", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "getTopBarState", "()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "canRemove", "", "getCanRemove", "()Z", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "getDisplayableSavedPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "screenTitle", "Lcom/stripe/android/core/strings/ResolvableString;", "getScreenTitle", "()Lcom/stripe/android/core/strings/ResolvableString;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "isExpiredCard", "isModifiablePaymentMethod", "hasValidBrandChoices", "getHasValidBrandChoices", "shouldShowSetAsDefaultCheckbox", "getShouldShowSetAsDefaultCheckbox", "setAsDefaultCheckboxEnabled", "getSetAsDefaultCheckboxEnabled", "shouldShowSaveButton", "getShouldShowSaveButton", "canUpdateFullPaymentMethodDetails", "getCanUpdateFullPaymentMethodDetails", "addressCollectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "getAddressCollectionMode", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "editCardDetailsInteractor", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "getEditCardDetailsInteractor", "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "", "viewAction", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "State", "Status", "ViewAction", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UpdatePaymentMethodInteractor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode getAddressCollectionMode();

    boolean getCanRemove();

    boolean getCanUpdateFullPaymentMethodDetails();

    CardBrandFilter getCardBrandFilter();

    DisplayableSavedPaymentMethod getDisplayableSavedPaymentMethod();

    EditCardDetailsInteractor getEditCardDetailsInteractor();

    boolean getHasValidBrandChoices();

    ResolvableString getScreenTitle();

    boolean getSetAsDefaultCheckboxEnabled();

    boolean getShouldShowSaveButton();

    boolean getShouldShowSetAsDefaultCheckbox();

    StateFlow<State> getState();

    PaymentSheetTopBarState getTopBarState();

    void handleViewAction(ViewAction viewAction);

    boolean isExpiredCard();

    boolean isModifiablePaymentMethod();

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;", "", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "status", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;", "setAsDefaultCheckboxChecked", "", "isSaveButtonEnabled", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)V", "getError", "()Lcom/stripe/android/core/strings/ResolvableString;", "getStatus", "()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;", "getSetAsDefaultCheckboxChecked", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final ResolvableString error;
        private final boolean isSaveButtonEnabled;
        private final boolean setAsDefaultCheckboxChecked;
        private final Status status;

        public static /* synthetic */ State copy$default(State state, ResolvableString resolvableString, Status status, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = state.error;
            }
            if ((i & 2) != 0) {
                status = state.status;
            }
            if ((i & 4) != 0) {
                z = state.setAsDefaultCheckboxChecked;
            }
            if ((i & 8) != 0) {
                z2 = state.isSaveButtonEnabled;
            }
            return state.copy(resolvableString, status, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSetAsDefaultCheckboxChecked() {
            return this.setAsDefaultCheckboxChecked;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSaveButtonEnabled() {
            return this.isSaveButtonEnabled;
        }

        public final State copy(ResolvableString error, Status status, boolean setAsDefaultCheckboxChecked, boolean isSaveButtonEnabled) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new State(error, status, setAsDefaultCheckboxChecked, isSaveButtonEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.error, state.error) && this.status == state.status && this.setAsDefaultCheckboxChecked == state.setAsDefaultCheckboxChecked && this.isSaveButtonEnabled == state.isSaveButtonEnabled;
        }

        public int hashCode() {
            ResolvableString resolvableString = this.error;
            return ((((((resolvableString == null ? 0 : resolvableString.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.setAsDefaultCheckboxChecked)) * 31) + Boolean.hashCode(this.isSaveButtonEnabled);
        }

        public String toString() {
            return "State(error=" + this.error + ", status=" + this.status + ", setAsDefaultCheckboxChecked=" + this.setAsDefaultCheckboxChecked + ", isSaveButtonEnabled=" + this.isSaveButtonEnabled + ")";
        }

        public State(ResolvableString resolvableString, Status status, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.error = resolvableString;
            this.status = status;
            this.setAsDefaultCheckboxChecked = z;
            this.isSaveButtonEnabled = z2;
        }

        public final ResolvableString getError() {
            return this.error;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final boolean getSetAsDefaultCheckboxChecked() {
            return this.setAsDefaultCheckboxChecked;
        }

        public final boolean isSaveButtonEnabled() {
            return this.isSaveButtonEnabled;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;", "", "isPerformingNetworkOperation", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "Idle", "Updating", "Removing", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final boolean isPerformingNetworkOperation;
        public static final Status Idle = new Status("Idle", 0, false);
        public static final Status Updating = new Status("Updating", 1, true);
        public static final Status Removing = new Status("Removing", 2, true);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Idle, Updating, Removing};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, boolean z) {
            this.isPerformingNetworkOperation = z;
        }

        /* renamed from: isPerformingNetworkOperation, reason: from getter */
        public final boolean getIsPerformingNetworkOperation() {
            return this.isPerformingNetworkOperation;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "", "<init>", "()V", "RemovePaymentMethod", "SaveButtonPressed", "SetAsDefaultCheckboxChanged", "CardUpdateParamsChanged", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewAction {
        public static final int $stable = 0;

        public /* synthetic */ ViewAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemovePaymentMethod extends ViewAction {
            public static final int $stable = 0;
            public static final RemovePaymentMethod INSTANCE = new RemovePaymentMethod();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemovePaymentMethod)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -51637729;
            }

            public String toString() {
                return "RemovePaymentMethod";
            }

            private RemovePaymentMethod() {
                super(null);
            }
        }

        private ViewAction() {
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SaveButtonPressed extends ViewAction {
            public static final int $stable = 0;
            public static final SaveButtonPressed INSTANCE = new SaveButtonPressed();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SaveButtonPressed)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 650171087;
            }

            public String toString() {
                return "SaveButtonPressed";
            }

            private SaveButtonPressed() {
                super(null);
            }
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetAsDefaultCheckboxChanged extends ViewAction {
            public static final int $stable = 0;
            private final boolean isChecked;

            public static /* synthetic */ SetAsDefaultCheckboxChanged copy$default(SetAsDefaultCheckboxChanged setAsDefaultCheckboxChanged, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = setAsDefaultCheckboxChanged.isChecked;
                }
                return setAsDefaultCheckboxChanged.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public final SetAsDefaultCheckboxChanged copy(boolean isChecked) {
                return new SetAsDefaultCheckboxChanged(isChecked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAsDefaultCheckboxChanged) && this.isChecked == ((SetAsDefaultCheckboxChanged) other).isChecked;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "SetAsDefaultCheckboxChanged(isChecked=" + this.isChecked + ")";
            }

            public SetAsDefaultCheckboxChanged(boolean z) {
                super(null);
                this.isChecked = z;
            }

            public final boolean isChecked() {
                return this.isChecked;
            }
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "cardUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "<init>", "(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V", "getCardUpdateParams", "()Lcom/stripe/android/paymentsheet/CardUpdateParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CardUpdateParamsChanged extends ViewAction {
            public static final int $stable = PaymentMethod.BillingDetails.$stable;
            private final CardUpdateParams cardUpdateParams;

            public static /* synthetic */ CardUpdateParamsChanged copy$default(CardUpdateParamsChanged cardUpdateParamsChanged, CardUpdateParams cardUpdateParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    cardUpdateParams = cardUpdateParamsChanged.cardUpdateParams;
                }
                return cardUpdateParamsChanged.copy(cardUpdateParams);
            }

            /* renamed from: component1, reason: from getter */
            public final CardUpdateParams getCardUpdateParams() {
                return this.cardUpdateParams;
            }

            public final CardUpdateParamsChanged copy(CardUpdateParams cardUpdateParams) {
                return new CardUpdateParamsChanged(cardUpdateParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardUpdateParamsChanged) && Intrinsics.areEqual(this.cardUpdateParams, ((CardUpdateParamsChanged) other).cardUpdateParams);
            }

            public int hashCode() {
                CardUpdateParams cardUpdateParams = this.cardUpdateParams;
                if (cardUpdateParams == null) {
                    return 0;
                }
                return cardUpdateParams.hashCode();
            }

            public String toString() {
                return "CardUpdateParamsChanged(cardUpdateParams=" + this.cardUpdateParams + ")";
            }

            public CardUpdateParamsChanged(CardUpdateParams cardUpdateParams) {
                super(null);
                this.cardUpdateParams = cardUpdateParams;
            }

            public final CardUpdateParams getCardUpdateParams() {
                return this.cardUpdateParams;
            }
        }
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;", "", "<init>", "()V", "screenTitle", "Lcom/stripe/android/core/strings/ResolvableString;", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "expiredErrorMessage", "getExpiredErrorMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ResolvableString expiredErrorMessage = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_expired_card);

        private Companion() {
        }

        public final ResolvableString screenTitle(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            SavedPaymentMethod savedPaymentMethod = displayableSavedPaymentMethod.getSavedPaymentMethod();
            if (savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) {
                numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_manage_sepa_debit);
            } else if (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) {
                numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_manage_bank_account);
            } else if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
                numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_manage_card);
            } else {
                if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
                    LinkPaymentDetails linkPaymentDetails = displayableSavedPaymentMethod.getPaymentMethod().getLinkPaymentDetails();
                    if (linkPaymentDetails instanceof LinkPaymentDetails.BankAccount) {
                        numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_manage_international_bank_account);
                    } else if (linkPaymentDetails instanceof LinkPaymentDetails.Card) {
                        numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_manage_card);
                    } else if (linkPaymentDetails != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = null;
            }
            if (numValueOf != null) {
                return ResolvableStringUtilsKt.getResolvableString(numValueOf.intValue());
            }
            return null;
        }

        public final ResolvableString getExpiredErrorMessage() {
            return expiredErrorMessage;
        }
    }
}
