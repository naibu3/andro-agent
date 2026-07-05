package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeMaskedCardViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaskedCardView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000f8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "", "last4", "getLast4", "()Ljava/lang/String;", "viewBinding", "Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "cardDisplayFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "applyTint", "", "imageView", "Landroid/widget/ImageView;", "setSelected", "selected", "", "setPaymentMethod", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "updateUi", "updateBrandIcon", "updateCheckMark", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MaskedCardView extends LinearLayout {
    public static final int $stable = 8;
    private CardBrand cardBrand;
    private final CardDisplayTextFactory cardDisplayFactory;
    private String last4;
    private final ThemeConfig themeConfig;
    private final StripeMaskedCardViewBinding viewBinding;

    /* compiled from: MaskedCardView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.Discover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardBrand.JCB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardBrand.DinersClub.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardBrand.Visa.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardBrand.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardBrand.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardBrand.CartesBancaires.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardBrand.Unknown.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cardBrand = CardBrand.Unknown;
        StripeMaskedCardViewBinding stripeMaskedCardViewBindingInflate = StripeMaskedCardViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeMaskedCardViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeMaskedCardViewBindingInflate;
        ThemeConfig themeConfig = new ThemeConfig(context);
        this.themeConfig = themeConfig;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.cardDisplayFactory = new CardDisplayTextFactory(resources, themeConfig);
        AppCompatImageView brandIcon = stripeMaskedCardViewBindingInflate.brandIcon;
        Intrinsics.checkNotNullExpressionValue(brandIcon, "brandIcon");
        applyTint(brandIcon);
        AppCompatImageView checkIcon = stripeMaskedCardViewBindingInflate.checkIcon;
        Intrinsics.checkNotNullExpressionValue(checkIcon, "checkIcon");
        applyTint(checkIcon);
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    /* renamed from: getViewBinding$payments_core_release, reason: from getter */
    public final StripeMaskedCardViewBinding getViewBinding() {
        return this.viewBinding;
    }

    private final void applyTint(ImageView imageView) {
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(true)));
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        updateCheckMark();
        updateUi();
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        CardBrand cardBrandFromCode = CardBrand.INSTANCE.fromCode(card != null ? card.displayBrand : null);
        if (cardBrandFromCode == CardBrand.Unknown) {
            cardBrandFromCode = null;
        }
        if (cardBrandFromCode == null) {
            cardBrandFromCode = card != null ? card.brand : null;
            if (cardBrandFromCode == null) {
                cardBrandFromCode = CardBrand.Unknown;
            }
        }
        this.cardBrand = cardBrandFromCode;
        this.last4 = card != null ? card.last4 : null;
        updateUi();
    }

    private final void updateUi() {
        updateBrandIcon();
        this.viewBinding.details.setText(this.cardDisplayFactory.createStyled$payments_core_release(this.cardBrand, this.last4, isSelected()));
    }

    private final void updateBrandIcon() {
        int i;
        AppCompatImageView appCompatImageView = this.viewBinding.brandIcon;
        Context context = getContext();
        switch (WhenMappings.$EnumSwitchMapping$0[this.cardBrand.ordinal()]) {
            case 1:
                i = R.drawable.stripe_ic_amex_template_32;
                break;
            case 2:
                i = R.drawable.stripe_ic_discover_template_32;
                break;
            case 3:
                i = R.drawable.stripe_ic_jcb_template_32;
                break;
            case 4:
                i = R.drawable.stripe_ic_diners_template_32;
                break;
            case 5:
                i = R.drawable.stripe_ic_visa_template_32;
                break;
            case 6:
                i = R.drawable.stripe_ic_mastercard_template_32;
                break;
            case 7:
                i = R.drawable.stripe_ic_unionpay_template_32;
                break;
            case 8:
                i = R.drawable.stripe_ic_cartebancaire_template_32;
                break;
            case 9:
                i = com.stripe.payments.model.R.drawable.stripe_ic_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(ContextCompat.getDrawable(context, i));
    }

    private final void updateCheckMark() {
        this.viewBinding.checkIcon.setVisibility(isSelected() ? 0 : 4);
    }
}
