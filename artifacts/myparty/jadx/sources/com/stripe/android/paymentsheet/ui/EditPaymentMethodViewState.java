package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditPaymentMethodViewState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00011B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState;", "", "status", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;", "last4", "", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "canUpdate", "", "selectedBrand", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "availableBrands", "", "canRemove", "confirmRemoval", "error", "<init>", "(Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZZLcom/stripe/android/core/strings/ResolvableString;)V", "getStatus", "()Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;", "getLast4", "()Ljava/lang/String;", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "getCanUpdate", "()Z", "getSelectedBrand", "()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "getAvailableBrands", "()Ljava/util/List;", "getCanRemove", "getConfirmRemoval", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Status", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EditPaymentMethodViewState {
    public static final int $stable = 8;
    private final List<CardBrandChoice> availableBrands;
    private final boolean canRemove;
    private final boolean canUpdate;
    private final boolean confirmRemoval;
    private final ResolvableString displayName;
    private final ResolvableString error;
    private final String last4;
    private final CardBrandChoice selectedBrand;
    private final Status status;

    public static /* synthetic */ EditPaymentMethodViewState copy$default(EditPaymentMethodViewState editPaymentMethodViewState, Status status, String str, ResolvableString resolvableString, boolean z, CardBrandChoice cardBrandChoice, List list, boolean z2, boolean z3, ResolvableString resolvableString2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = editPaymentMethodViewState.status;
        }
        if ((i & 2) != 0) {
            str = editPaymentMethodViewState.last4;
        }
        if ((i & 4) != 0) {
            resolvableString = editPaymentMethodViewState.displayName;
        }
        if ((i & 8) != 0) {
            z = editPaymentMethodViewState.canUpdate;
        }
        if ((i & 16) != 0) {
            cardBrandChoice = editPaymentMethodViewState.selectedBrand;
        }
        if ((i & 32) != 0) {
            list = editPaymentMethodViewState.availableBrands;
        }
        if ((i & 64) != 0) {
            z2 = editPaymentMethodViewState.canRemove;
        }
        if ((i & 128) != 0) {
            z3 = editPaymentMethodViewState.confirmRemoval;
        }
        if ((i & 256) != 0) {
            resolvableString2 = editPaymentMethodViewState.error;
        }
        boolean z4 = z3;
        ResolvableString resolvableString3 = resolvableString2;
        List list2 = list;
        boolean z5 = z2;
        CardBrandChoice cardBrandChoice2 = cardBrandChoice;
        ResolvableString resolvableString4 = resolvableString;
        return editPaymentMethodViewState.copy(status, str, resolvableString4, z, cardBrandChoice2, list2, z5, z4, resolvableString3);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    /* renamed from: component5, reason: from getter */
    public final CardBrandChoice getSelectedBrand() {
        return this.selectedBrand;
    }

    public final List<CardBrandChoice> component6() {
        return this.availableBrands;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanRemove() {
        return this.canRemove;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getConfirmRemoval() {
        return this.confirmRemoval;
    }

    /* renamed from: component9, reason: from getter */
    public final ResolvableString getError() {
        return this.error;
    }

    public final EditPaymentMethodViewState copy(Status status, String last4, ResolvableString displayName, boolean canUpdate, CardBrandChoice selectedBrand, List<CardBrandChoice> availableBrands, boolean canRemove, boolean confirmRemoval, ResolvableString error) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(last4, "last4");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
        Intrinsics.checkNotNullParameter(availableBrands, "availableBrands");
        return new EditPaymentMethodViewState(status, last4, displayName, canUpdate, selectedBrand, availableBrands, canRemove, confirmRemoval, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditPaymentMethodViewState)) {
            return false;
        }
        EditPaymentMethodViewState editPaymentMethodViewState = (EditPaymentMethodViewState) other;
        return this.status == editPaymentMethodViewState.status && Intrinsics.areEqual(this.last4, editPaymentMethodViewState.last4) && Intrinsics.areEqual(this.displayName, editPaymentMethodViewState.displayName) && this.canUpdate == editPaymentMethodViewState.canUpdate && Intrinsics.areEqual(this.selectedBrand, editPaymentMethodViewState.selectedBrand) && Intrinsics.areEqual(this.availableBrands, editPaymentMethodViewState.availableBrands) && this.canRemove == editPaymentMethodViewState.canRemove && this.confirmRemoval == editPaymentMethodViewState.confirmRemoval && Intrinsics.areEqual(this.error, editPaymentMethodViewState.error);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.status.hashCode() * 31) + this.last4.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.canUpdate)) * 31) + this.selectedBrand.hashCode()) * 31) + this.availableBrands.hashCode()) * 31) + Boolean.hashCode(this.canRemove)) * 31) + Boolean.hashCode(this.confirmRemoval)) * 31;
        ResolvableString resolvableString = this.error;
        return iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode());
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.status + ", last4=" + this.last4 + ", displayName=" + this.displayName + ", canUpdate=" + this.canUpdate + ", selectedBrand=" + this.selectedBrand + ", availableBrands=" + this.availableBrands + ", canRemove=" + this.canRemove + ", confirmRemoval=" + this.confirmRemoval + ", error=" + this.error + ")";
    }

    public EditPaymentMethodViewState(Status status, String last4, ResolvableString displayName, boolean z, CardBrandChoice selectedBrand, List<CardBrandChoice> availableBrands, boolean z2, boolean z3, ResolvableString resolvableString) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(last4, "last4");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
        Intrinsics.checkNotNullParameter(availableBrands, "availableBrands");
        this.status = status;
        this.last4 = last4;
        this.displayName = displayName;
        this.canUpdate = z;
        this.selectedBrand = selectedBrand;
        this.availableBrands = availableBrands;
        this.canRemove = z2;
        this.confirmRemoval = z3;
        this.error = resolvableString;
    }

    public /* synthetic */ EditPaymentMethodViewState(Status status, String str, ResolvableString resolvableString, boolean z, CardBrandChoice cardBrandChoice, List list, boolean z2, boolean z3, ResolvableString resolvableString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, str, resolvableString, z, cardBrandChoice, list, z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : resolvableString2);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    public final CardBrandChoice getSelectedBrand() {
        return this.selectedBrand;
    }

    public final List<CardBrandChoice> getAvailableBrands() {
        return this.availableBrands;
    }

    public final boolean getCanRemove() {
        return this.canRemove;
    }

    public final boolean getConfirmRemoval() {
        return this.confirmRemoval;
    }

    public final ResolvableString getError() {
        return this.error;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditPaymentMethodViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewState$Status;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Updating", "Removing", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status Idle = new Status("Idle", 0);
        public static final Status Updating = new Status("Updating", 1);
        public static final Status Removing = new Status("Removing", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Idle, Updating, Removing};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
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
}
