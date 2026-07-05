package com.stripe.android.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import androidx.transition.TransitionManager;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.databinding.StripeCardBrandViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.Networks;
import com.stripe.android.model.PaymentMethodCreateParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CardBrandView.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002JKB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u00104\u001a\u0004\u0018\u000105J\n\u00106\u001a\u0004\u0018\u000105H\u0002J\b\u00107\u001a\u0004\u0018\u000108J\n\u00109\u001a\u0004\u0018\u000108H\u0002J\u0017\u0010:\u001a\u00020;2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0002J\b\u0010>\u001a\u00020;H\u0002J\u0010\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u001aH\u0002J\b\u0010A\u001a\u00020;H\u0002J\u0010\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020FH\u0014J\u0012\u0010G\u001a\u00020;2\b\u0010\u0015\u001a\u0004\u0018\u00010FH\u0014J\u000e\u0010H\u001a\u00020;*\u0004\u0018\u00010IH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001f0%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001f0%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u0010.\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR$\u00101\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001e¨\u0006L"}, d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/stripe/android/databinding/StripeCardBrandViewBinding;", "iconView", "Landroid/widget/ImageView;", "chevron", "listPopup", "Landroid/widget/ListPopupWindow;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/view/CardBrandView$State;", "value", ServerProtocol.DIALOG_PARAM_STATE, "getState", "()Lcom/stripe/android/view/CardBrandView$State;", "setState", "(Lcom/stripe/android/view/CardBrandView$State;)V", "", "isCbcEligible", "()Z", "setCbcEligible", "(Z)V", "Lcom/stripe/android/model/CardBrand;", "brand", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "setBrand", "(Lcom/stripe/android/model/CardBrand;)V", "", "possibleBrands", "getPossibleBrands", "()Ljava/util/List;", "setPossibleBrands", "(Ljava/util/List;)V", "merchantPreferredNetworks", "getMerchantPreferredNetworks", "setMerchantPreferredNetworks", "shouldShowCvc", "getShouldShowCvc", "setShouldShowCvc", "shouldShowErrorIcon", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "paymentMethodCreateParamsNetworks", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;", "brandPaymentMethodCreateParamsNetworks", "cardParamsNetworks", "Lcom/stripe/android/model/Networks;", "brandCardParamsNetworks", "handleBrandSelected", "", "handleBrandSelected$payments_core_release", "setCardBrandIconAndTint", "determineCardBrandToDisplay", "updateBrandSpinner", "animate", "initListPopup", "measureContentWidth", "adapter", "Lcom/stripe/android/view/BrandAdapter;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "animateNextChanges", "Landroid/view/ViewGroup;", "State", "SavedState", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardBrandView extends FrameLayout {
    public static final int $stable = 8;
    private final ImageView chevron;
    private final ImageView iconView;
    private final ListPopupWindow listPopup;
    private MutableStateFlow<State> stateFlow;
    private final StripeCardBrandViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeCardBrandViewBinding stripeCardBrandViewBindingInflate = StripeCardBrandViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardBrandViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardBrandViewBindingInflate;
        ImageView icon = stripeCardBrandViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        this.iconView = icon;
        ImageView chevron = stripeCardBrandViewBindingInflate.chevron;
        Intrinsics.checkNotNullExpressionValue(chevron, "chevron");
        this.chevron = chevron;
        this.listPopup = new ListPopupWindow(context);
        this.stateFlow = StateFlowKt.MutableStateFlow(new State(false, false, null, null, null, null, false, false, 255, null));
        setClickable(false);
        setFocusable(false);
        determineCardBrandToDisplay();
        updateBrandSpinner(false);
    }

    /* compiled from: CardBrandView.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006."}, d2 = {"Lcom/stripe/android/view/CardBrandView$State;", "Landroid/os/Parcelable;", "isCbcEligible", "", "isLoading", "brand", "Lcom/stripe/android/model/CardBrand;", "userSelectedBrand", "possibleBrands", "", "merchantPreferredNetworks", "shouldShowCvc", "shouldShowErrorIcon", "<init>", "(ZZLcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/CardBrand;Ljava/util/List;Ljava/util/List;ZZ)V", "()Z", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getUserSelectedBrand", "getPossibleBrands", "()Ljava/util/List;", "getMerchantPreferredNetworks", "getShouldShowCvc", "getShouldShowErrorIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        private final CardBrand brand;
        private final boolean isCbcEligible;
        private final boolean isLoading;
        private final List<CardBrand> merchantPreferredNetworks;
        private final List<CardBrand> possibleBrands;
        private final boolean shouldShowCvc;
        private final boolean shouldShowErrorIcon;
        private final CardBrand userSelectedBrand;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CardBrandView.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                CardBrand cardBrandValueOf = CardBrand.valueOf(parcel.readString());
                CardBrand cardBrandValueOf2 = parcel.readInt() == 0 ? null : CardBrand.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CardBrand.valueOf(parcel.readString()));
                }
                ArrayList arrayList2 = arrayList;
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(CardBrand.valueOf(parcel.readString()));
                }
                return new State(z, z2, cardBrandValueOf, cardBrandValueOf2, arrayList2, arrayList3, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            this(false, false, null, null, null, null, false, false, 255, null);
        }

        public static /* synthetic */ State copy$default(State state, boolean z, boolean z2, CardBrand cardBrand, CardBrand cardBrand2, List list, List list2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = state.isCbcEligible;
            }
            if ((i & 2) != 0) {
                z2 = state.isLoading;
            }
            if ((i & 4) != 0) {
                cardBrand = state.brand;
            }
            if ((i & 8) != 0) {
                cardBrand2 = state.userSelectedBrand;
            }
            if ((i & 16) != 0) {
                list = state.possibleBrands;
            }
            if ((i & 32) != 0) {
                list2 = state.merchantPreferredNetworks;
            }
            if ((i & 64) != 0) {
                z3 = state.shouldShowCvc;
            }
            if ((i & 128) != 0) {
                z4 = state.shouldShowErrorIcon;
            }
            boolean z5 = z3;
            boolean z6 = z4;
            List list3 = list;
            List list4 = list2;
            return state.copy(z, z2, cardBrand, cardBrand2, list3, list4, z5, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component4, reason: from getter */
        public final CardBrand getUserSelectedBrand() {
            return this.userSelectedBrand;
        }

        public final List<CardBrand> component5() {
            return this.possibleBrands;
        }

        public final List<CardBrand> component6() {
            return this.merchantPreferredNetworks;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldShowCvc() {
            return this.shouldShowCvc;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldShowErrorIcon() {
            return this.shouldShowErrorIcon;
        }

        public final State copy(boolean isCbcEligible, boolean isLoading, CardBrand brand, CardBrand userSelectedBrand, List<? extends CardBrand> possibleBrands, List<? extends CardBrand> merchantPreferredNetworks, boolean shouldShowCvc, boolean shouldShowErrorIcon) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(possibleBrands, "possibleBrands");
            Intrinsics.checkNotNullParameter(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new State(isCbcEligible, isLoading, brand, userSelectedBrand, possibleBrands, merchantPreferredNetworks, shouldShowCvc, shouldShowErrorIcon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.isCbcEligible == state.isCbcEligible && this.isLoading == state.isLoading && this.brand == state.brand && this.userSelectedBrand == state.userSelectedBrand && Intrinsics.areEqual(this.possibleBrands, state.possibleBrands) && Intrinsics.areEqual(this.merchantPreferredNetworks, state.merchantPreferredNetworks) && this.shouldShowCvc == state.shouldShowCvc && this.shouldShowErrorIcon == state.shouldShowErrorIcon;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isCbcEligible) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.brand.hashCode()) * 31;
            CardBrand cardBrand = this.userSelectedBrand;
            return ((((((((iHashCode + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31) + this.possibleBrands.hashCode()) * 31) + this.merchantPreferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.shouldShowCvc)) * 31) + Boolean.hashCode(this.shouldShowErrorIcon);
        }

        public String toString() {
            return "State(isCbcEligible=" + this.isCbcEligible + ", isLoading=" + this.isLoading + ", brand=" + this.brand + ", userSelectedBrand=" + this.userSelectedBrand + ", possibleBrands=" + this.possibleBrands + ", merchantPreferredNetworks=" + this.merchantPreferredNetworks + ", shouldShowCvc=" + this.shouldShowCvc + ", shouldShowErrorIcon=" + this.shouldShowErrorIcon + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCbcEligible ? 1 : 0);
            dest.writeInt(this.isLoading ? 1 : 0);
            dest.writeString(this.brand.name());
            CardBrand cardBrand = this.userSelectedBrand;
            if (cardBrand == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cardBrand.name());
            }
            List<CardBrand> list = this.possibleBrands;
            dest.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<CardBrand> list2 = this.merchantPreferredNetworks;
            dest.writeInt(list2.size());
            Iterator<CardBrand> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeInt(this.shouldShowCvc ? 1 : 0);
            dest.writeInt(this.shouldShowErrorIcon ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(boolean z, boolean z2, CardBrand brand, CardBrand cardBrand, List<? extends CardBrand> possibleBrands, List<? extends CardBrand> merchantPreferredNetworks, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(possibleBrands, "possibleBrands");
            Intrinsics.checkNotNullParameter(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.isCbcEligible = z;
            this.isLoading = z2;
            this.brand = brand;
            this.userSelectedBrand = cardBrand;
            this.possibleBrands = possibleBrands;
            this.merchantPreferredNetworks = merchantPreferredNetworks;
            this.shouldShowCvc = z3;
            this.shouldShowErrorIcon = z4;
        }

        public final boolean isCbcEligible() {
            return this.isCbcEligible;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ State(boolean z, boolean z2, CardBrand cardBrand, CardBrand cardBrand2, List list, List list2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CardBrand.Unknown : cardBrand, (i & 8) != 0 ? null : cardBrand2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4);
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final CardBrand getUserSelectedBrand() {
            return this.userSelectedBrand;
        }

        public final List<CardBrand> getPossibleBrands() {
            return this.possibleBrands;
        }

        public final List<CardBrand> getMerchantPreferredNetworks() {
            return this.merchantPreferredNetworks;
        }

        public final boolean getShouldShowCvc() {
            return this.shouldShowCvc;
        }

        public final boolean getShouldShowErrorIcon() {
            return this.shouldShowErrorIcon;
        }
    }

    private final State getState() {
        return this.stateFlow.getValue();
    }

    private final void setState(State state) {
        this.stateFlow.setValue(state);
    }

    public final boolean isCbcEligible() {
        return getState().isCbcEligible();
    }

    public final void setCbcEligible(boolean z) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, State.copy$default(value, z2, false, null, null, null, null, false, false, 254, null))) {
                updateBrandSpinner(true);
                return;
            }
            z = z2;
        }
    }

    public final CardBrand getBrand() {
        return getState().getBrand();
    }

    public final void setBrand(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            CardBrand cardBrand = value;
            if (mutableStateFlow.compareAndSet(value2, State.copy$default(value2, false, false, cardBrand, null, null, null, false, false, 251, null))) {
                determineCardBrandToDisplay();
                updateBrandSpinner(true);
                return;
            }
            value = cardBrand;
        }
    }

    public final List<CardBrand> getPossibleBrands() {
        return getState().getPossibleBrands();
    }

    public final void setPossibleBrands(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            List<? extends CardBrand> list = value;
            if (mutableStateFlow.compareAndSet(value2, State.copy$default(value2, false, false, null, null, list, null, false, false, 239, null))) {
                determineCardBrandToDisplay();
                updateBrandSpinner(true);
                return;
            }
            value = list;
        }
    }

    public final List<CardBrand> getMerchantPreferredNetworks() {
        return getState().getMerchantPreferredNetworks();
    }

    public final void setMerchantPreferredNetworks(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value2 = mutableStateFlow.getValue();
            List<? extends CardBrand> list = value;
            if (mutableStateFlow.compareAndSet(value2, State.copy$default(value2, false, false, null, null, null, list, false, false, 223, null))) {
                determineCardBrandToDisplay();
                return;
            }
            value = list;
        }
    }

    public final boolean getShouldShowCvc() {
        return getState().getShouldShowCvc();
    }

    public final void setShouldShowCvc(boolean z) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, State.copy$default(value, false, false, null, null, null, null, z2, false, 191, null))) {
                setCardBrandIconAndTint();
                updateBrandSpinner(false);
                return;
            }
            z = z2;
        }
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().getShouldShowErrorIcon();
    }

    public final void setShouldShowErrorIcon(boolean z) {
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            boolean z2 = z;
            if (mutableStateFlow.compareAndSet(value, State.copy$default(value, false, false, null, null, null, null, false, z2, 127, null))) {
                setCardBrandIconAndTint();
                return;
            }
            z = z2;
        }
    }

    public final PaymentMethodCreateParams.Card.Networks paymentMethodCreateParamsNetworks() {
        String code;
        PaymentMethodCreateParams.Card.Networks networksBrandPaymentMethodCreateParamsNetworks = brandPaymentMethodCreateParamsNetworks();
        if (networksBrandPaymentMethodCreateParamsNetworks != null) {
            return networksBrandPaymentMethodCreateParamsNetworks;
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) getMerchantPreferredNetworks());
        if (cardBrand == null || (code = cardBrand.getCode()) == null) {
            return null;
        }
        return new PaymentMethodCreateParams.Card.Networks(code);
    }

    private final PaymentMethodCreateParams.Card.Networks brandPaymentMethodCreateParamsNetworks() {
        if (getBrand() == CardBrand.Unknown) {
            return null;
        }
        PaymentMethodCreateParams.Card.Networks networks = new PaymentMethodCreateParams.Card.Networks(getBrand().getCode());
        if (!isCbcEligible() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return networks;
    }

    public final Networks cardParamsNetworks() {
        String code;
        Networks networksBrandCardParamsNetworks = brandCardParamsNetworks();
        if (networksBrandCardParamsNetworks != null) {
            return networksBrandCardParamsNetworks;
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) getMerchantPreferredNetworks());
        if (cardBrand == null) {
            return null;
        }
        if (cardBrand == CardBrand.Unknown) {
            cardBrand = null;
        }
        if (cardBrand == null || (code = cardBrand.getCode()) == null) {
            return null;
        }
        return new Networks(code);
    }

    private final Networks brandCardParamsNetworks() {
        String code;
        CardBrand brand = getBrand();
        if (brand == CardBrand.Unknown) {
            brand = null;
        }
        Networks networks = (brand == null || (code = brand.getCode()) == null) ? null : new Networks(code);
        if (!isCbcEligible() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return networks;
    }

    public final void handleBrandSelected$payments_core_release(CardBrand brand) {
        if (brand == null) {
            return;
        }
        MutableStateFlow<State> mutableStateFlow = this.stateFlow;
        while (true) {
            State value = mutableStateFlow.getValue();
            CardBrand cardBrand = brand;
            if (mutableStateFlow.compareAndSet(value, State.copy$default(value, false, false, null, cardBrand, null, null, false, false, 247, null))) {
                determineCardBrandToDisplay();
                return;
            }
            brand = cardBrand;
        }
    }

    private final void setCardBrandIconAndTint() {
        int cvcIcon;
        ImageView imageView = this.iconView;
        if (getShouldShowErrorIcon()) {
            cvcIcon = getState().getBrand().getErrorIcon();
        } else {
            cvcIcon = getShouldShowCvc() ? getState().getBrand().getCvcIcon() : getState().getBrand().getIcon();
        }
        imageView.setImageResource(cvcIcon);
    }

    private final void determineCardBrandToDisplay() {
        CardBrand brand;
        if (getState().getPossibleBrands().size() > 1) {
            brand = CardBrandSelectorKt.selectCardBrandToDisplay(getState().getUserSelectedBrand(), getState().getPossibleBrands(), getState().getMerchantPreferredNetworks());
        } else {
            brand = getState().getBrand();
        }
        if (getBrand() != brand) {
            setBrand(brand);
        }
        setCardBrandIconAndTint();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateBrandSpinner(boolean animate) {
        boolean z;
        if (isCbcEligible()) {
            z = (getPossibleBrands().size() <= 1 || getShouldShowCvc() || getShouldShowErrorIcon()) ? false : true;
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (z) {
            initListPopup();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.CardBrandView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.updateBrandSpinner$lambda$15(this.f$0, view);
                }
            });
            if (animate) {
                animateNextChanges(viewGroup);
            }
            this.chevron.setVisibility(0);
            return;
        }
        setOnClickListener(null);
        if (animate) {
            animateNextChanges(viewGroup);
        }
        this.chevron.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBrandSpinner$lambda$15(CardBrandView cardBrandView, View view) {
        if (cardBrandView.listPopup.isShowing()) {
            cardBrandView.listPopup.dismiss();
        } else {
            cardBrandView.listPopup.show();
        }
    }

    private final void initListPopup() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BrandAdapter brandAdapter = new BrandAdapter(context, getPossibleBrands(), getBrand());
        this.listPopup.setAdapter(brandAdapter);
        this.listPopup.setModal(true);
        this.listPopup.setWidth(measureContentWidth(brandAdapter));
        this.listPopup.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.CardBrandView$$ExternalSyntheticLambda0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                CardBrandView.initListPopup$lambda$17(this.f$0, adapterView, view, i, j);
            }
        });
        this.listPopup.setAnchorView(this.iconView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListPopup$lambda$17(CardBrandView cardBrandView, AdapterView adapterView, View view, int i, long j) {
        CardBrand cardBrand = (CardBrand) CollectionsKt.getOrNull(cardBrandView.getPossibleBrands(), i - 1);
        if (cardBrand != null) {
            cardBrandView.handleBrandSelected$payments_core_release(cardBrand);
        }
        cardBrandView.listPopup.dismiss();
    }

    private final int measureContentWidth(BrandAdapter adapter) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        int iCoerceAtLeast = 0;
        for (int i = 0; i < count; i++) {
            View view = adapter.getView(i, null, this);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, view.getMeasuredWidth());
        }
        return iCoerceAtLeast;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        State state2;
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState == null || (state2 = savedState.getState()) == null) {
            state2 = new State(false, false, null, null, null, null, false, false, 255, null);
        }
        setState(state2);
        determineCardBrandToDisplay();
        updateBrandSpinner(false);
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    private final void animateNextChanges(ViewGroup viewGroup) {
        if (viewGroup != null) {
            TransitionManager.endTransitions(viewGroup);
            TransitionManager.beginDelayedTransition(viewGroup);
        }
    }

    /* compiled from: CardBrandView.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/CardBrandView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/view/CardBrandView$State;", "<init>", "(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)V", "getSuperSavedState", "()Landroid/os/Parcelable;", "getState", "()Lcom/stripe/android/view/CardBrandView$State;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        private final State state;
        private final Parcelable superSavedState;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CardBrandView.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), State.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, State state, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = savedState.superSavedState;
            }
            if ((i & 2) != 0) {
                state = savedState.state;
            }
            return savedState.copy(parcelable, state);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperSavedState() {
            return this.superSavedState;
        }

        /* renamed from: component2, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final SavedState copy(Parcelable superSavedState, State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new SavedState(superSavedState, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superSavedState, savedState.superSavedState) && Intrinsics.areEqual(this.state, savedState.state);
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.state.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", state=" + this.state + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superSavedState, flags);
            this.state.writeToParcel(dest, flags);
        }

        public final Parcelable getSuperSavedState() {
            return this.superSavedState;
        }

        public final State getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, State state) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(state, "state");
            this.superSavedState = parcelable;
            this.state = state;
        }
    }
}
