package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetTopBarState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "", "showTestModeLabel", "", "showEditMenu", "isEditing", "onEditIconPressed", "Lkotlin/Function0;", "", "<init>", "(ZZZLkotlin/jvm/functions/Function0;)V", "getShowTestModeLabel", "()Z", "getShowEditMenu", "getOnEditIconPressed", "()Lkotlin/jvm/functions/Function0;", "editMenuLabel", "", "getEditMenuLabel", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Editable", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentSheetTopBarState {
    public static final int $stable = 0;
    private final boolean isEditing;
    private final Function0<Unit> onEditIconPressed;
    private final boolean showEditMenu;
    private final boolean showTestModeLabel;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentSheetTopBarState copy$default(PaymentSheetTopBarState paymentSheetTopBarState, boolean z, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentSheetTopBarState.showTestModeLabel;
        }
        if ((i & 2) != 0) {
            z2 = paymentSheetTopBarState.showEditMenu;
        }
        if ((i & 4) != 0) {
            z3 = paymentSheetTopBarState.isEditing;
        }
        if ((i & 8) != 0) {
            function0 = paymentSheetTopBarState.onEditIconPressed;
        }
        return paymentSheetTopBarState.copy(z, z2, z3, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowTestModeLabel() {
        return this.showTestModeLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowEditMenu() {
        return this.showEditMenu;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public final Function0<Unit> component4() {
        return this.onEditIconPressed;
    }

    public final PaymentSheetTopBarState copy(boolean showTestModeLabel, boolean showEditMenu, boolean isEditing, Function0<Unit> onEditIconPressed) {
        Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
        return new PaymentSheetTopBarState(showTestModeLabel, showEditMenu, isEditing, onEditIconPressed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSheetTopBarState)) {
            return false;
        }
        PaymentSheetTopBarState paymentSheetTopBarState = (PaymentSheetTopBarState) other;
        return this.showTestModeLabel == paymentSheetTopBarState.showTestModeLabel && this.showEditMenu == paymentSheetTopBarState.showEditMenu && this.isEditing == paymentSheetTopBarState.isEditing && Intrinsics.areEqual(this.onEditIconPressed, paymentSheetTopBarState.onEditIconPressed);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.showTestModeLabel) * 31) + Boolean.hashCode(this.showEditMenu)) * 31) + Boolean.hashCode(this.isEditing)) * 31) + this.onEditIconPressed.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(showTestModeLabel=" + this.showTestModeLabel + ", showEditMenu=" + this.showEditMenu + ", isEditing=" + this.isEditing + ", onEditIconPressed=" + this.onEditIconPressed + ")";
    }

    public PaymentSheetTopBarState(boolean z, boolean z2, boolean z3, Function0<Unit> onEditIconPressed) {
        Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
        this.showTestModeLabel = z;
        this.showEditMenu = z2;
        this.isEditing = z3;
        this.onEditIconPressed = onEditIconPressed;
    }

    public final boolean getShowTestModeLabel() {
        return this.showTestModeLabel;
    }

    public final boolean getShowEditMenu() {
        return this.showEditMenu;
    }

    public final boolean isEditing() {
        return this.isEditing;
    }

    public final Function0<Unit> getOnEditIconPressed() {
        return this.onEditIconPressed;
    }

    public final int getEditMenuLabel() {
        if (this.isEditing) {
            return R.string.stripe_done;
        }
        return R.string.stripe_edit;
    }

    /* compiled from: PaymentSheetTopBarState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;", "", "Never", "Maybe", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Editable {

        /* compiled from: PaymentSheetTopBarState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Never implements Editable {
            public static final int $stable = 0;
            public static final Never INSTANCE = new Never();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Never)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2105449614;
            }

            public String toString() {
                return "Never";
            }

            private Never() {
            }
        }

        /* compiled from: PaymentSheetTopBarState.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Maybe;", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;", "isEditing", "", "canEdit", "onEditIconPressed", "Lkotlin/Function0;", "", "<init>", "(ZZLkotlin/jvm/functions/Function0;)V", "()Z", "getCanEdit", "getOnEditIconPressed", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Maybe implements Editable {
            public static final int $stable = 0;
            private final boolean canEdit;
            private final boolean isEditing;
            private final Function0<Unit> onEditIconPressed;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Maybe copy$default(Maybe maybe, boolean z, boolean z2, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = maybe.isEditing;
                }
                if ((i & 2) != 0) {
                    z2 = maybe.canEdit;
                }
                if ((i & 4) != 0) {
                    function0 = maybe.onEditIconPressed;
                }
                return maybe.copy(z, z2, function0);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEditing() {
                return this.isEditing;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getCanEdit() {
                return this.canEdit;
            }

            public final Function0<Unit> component3() {
                return this.onEditIconPressed;
            }

            public final Maybe copy(boolean isEditing, boolean canEdit, Function0<Unit> onEditIconPressed) {
                Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
                return new Maybe(isEditing, canEdit, onEditIconPressed);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Maybe)) {
                    return false;
                }
                Maybe maybe = (Maybe) other;
                return this.isEditing == maybe.isEditing && this.canEdit == maybe.canEdit && Intrinsics.areEqual(this.onEditIconPressed, maybe.onEditIconPressed);
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.isEditing) * 31) + Boolean.hashCode(this.canEdit)) * 31) + this.onEditIconPressed.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.isEditing + ", canEdit=" + this.canEdit + ", onEditIconPressed=" + this.onEditIconPressed + ")";
            }

            public Maybe(boolean z, boolean z2, Function0<Unit> onEditIconPressed) {
                Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
                this.isEditing = z;
                this.canEdit = z2;
                this.onEditIconPressed = onEditIconPressed;
            }

            public final boolean isEditing() {
                return this.isEditing;
            }

            public final boolean getCanEdit() {
                return this.canEdit;
            }

            public final Function0<Unit> getOnEditIconPressed() {
                return this.onEditIconPressed;
            }
        }
    }
}
