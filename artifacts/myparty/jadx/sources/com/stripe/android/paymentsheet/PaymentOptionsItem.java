package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "", "<init>", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "isEnabledDuringEditing", "", "()Z", "AddCard", "GooglePay", "Link", "SavedPaymentMethod", "ViewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentOptionsItem {
    public static final int $stable = 0;

    public /* synthetic */ PaymentOptionsItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ViewType getViewType();

    /* renamed from: isEnabledDuringEditing */
    public abstract boolean getIsEnabledDuringEditing();

    private PaymentOptionsItem() {
    }

    /* compiled from: PaymentOptionsItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "<init>", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "isEnabledDuringEditing", "", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddCard extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final AddCard INSTANCE = new AddCard();
        private static final ViewType viewType = ViewType.AddCard;

        private AddCard() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        /* renamed from: isEnabledDuringEditing */
        public boolean getIsEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    /* compiled from: PaymentOptionsItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "<init>", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "isEnabledDuringEditing", "", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePay extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final GooglePay INSTANCE = new GooglePay();
        private static final ViewType viewType = ViewType.GooglePay;

        private GooglePay() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        /* renamed from: isEnabledDuringEditing */
        public boolean getIsEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    /* compiled from: PaymentOptionsItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "<init>", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "isEnabledDuringEditing", "", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link extends PaymentOptionsItem {
        public static final int $stable = 0;
        private static final boolean isEnabledDuringEditing = false;
        public static final Link INSTANCE = new Link();
        private static final ViewType viewType = ViewType.Link;

        private Link() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return viewType;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        /* renamed from: isEnabledDuringEditing */
        public boolean getIsEnabledDuringEditing() {
            return isEnabledDuringEditing;
        }
    }

    /* compiled from: PaymentOptionsItem.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", "getDisplayableSavedPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "isModifiable", "", "canUpdateFullPaymentMethodDetails", "isEnabledDuringEditing", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedPaymentMethod extends PaymentOptionsItem {
        public static final int $stable = 8;
        private final ResolvableString displayName;
        private final DisplayableSavedPaymentMethod displayableSavedPaymentMethod;
        private final boolean isEnabledDuringEditing;
        private final PaymentMethod paymentMethod;
        private final ViewType viewType;

        public static /* synthetic */ SavedPaymentMethod copy$default(SavedPaymentMethod savedPaymentMethod, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                displayableSavedPaymentMethod = savedPaymentMethod.displayableSavedPaymentMethod;
            }
            return savedPaymentMethod.copy(displayableSavedPaymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final DisplayableSavedPaymentMethod getDisplayableSavedPaymentMethod() {
            return this.displayableSavedPaymentMethod;
        }

        public final SavedPaymentMethod copy(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            return new SavedPaymentMethod(displayableSavedPaymentMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SavedPaymentMethod) && Intrinsics.areEqual(this.displayableSavedPaymentMethod, ((SavedPaymentMethod) other).displayableSavedPaymentMethod);
        }

        public int hashCode() {
            return this.displayableSavedPaymentMethod.hashCode();
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.displayableSavedPaymentMethod + ")";
        }

        public final DisplayableSavedPaymentMethod getDisplayableSavedPaymentMethod() {
            return this.displayableSavedPaymentMethod;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedPaymentMethod(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.displayableSavedPaymentMethod = displayableSavedPaymentMethod;
            this.viewType = ViewType.SavedPaymentMethod;
            this.displayName = displayableSavedPaymentMethod.getDisplayName();
            this.paymentMethod = displayableSavedPaymentMethod.getPaymentMethod();
            this.isEnabledDuringEditing = true;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        public ViewType getViewType() {
            return this.viewType;
        }

        public final ResolvableString getDisplayName() {
            return this.displayName;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final boolean isModifiable(boolean canUpdateFullPaymentMethodDetails) {
            return this.displayableSavedPaymentMethod.isModifiable(canUpdateFullPaymentMethodDetails);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsItem
        /* renamed from: isEnabledDuringEditing, reason: from getter */
        public boolean getIsEnabledDuringEditing() {
            return this.isEnabledDuringEditing;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentOptionsItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SavedPaymentMethod", "AddCard", "GooglePay", "Link", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType SavedPaymentMethod = new ViewType("SavedPaymentMethod", 0);
        public static final ViewType AddCard = new ViewType("AddCard", 1);
        public static final ViewType GooglePay = new ViewType("GooglePay", 2);
        public static final ViewType Link = new ViewType("Link", 3);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{SavedPaymentMethod, AddCard, GooglePay, Link};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }
}
