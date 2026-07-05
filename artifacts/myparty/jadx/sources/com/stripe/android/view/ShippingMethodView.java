package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeShippingMethodViewBinding;
import com.stripe.android.model.ShippingMethod;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShippingMethodView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/ShippingMethodView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "selectedColorInt", "unselectedTextColorSecondaryInt", "unselectedTextColorPrimaryInt", "viewBinding", "Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;", "setSelected", "", "selected", "", "setShippingMethod", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShippingMethodView extends RelativeLayout {
    public static final int $stable = 8;
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int unselectedTextColorPrimaryInt;
    private final int unselectedTextColorSecondaryInt;
    private final StripeShippingMethodViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShippingMethodView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        StripeShippingMethodViewBinding stripeShippingMethodViewBindingInflate = StripeShippingMethodViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeShippingMethodViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeShippingMethodViewBindingInflate;
        int colorAccent = stripeColorUtils.getColorAccent();
        int textColorPrimary = stripeColorUtils.getTextColorPrimary();
        int textColorSecondary = stripeColorUtils.getTextColorSecondary();
        this.selectedColorInt = StripeColorUtils.INSTANCE.isColorTransparent(colorAccent) ? ContextCompat.getColor(context, R.color.stripe_accent_color_default) : colorAccent;
        this.unselectedTextColorPrimaryInt = StripeColorUtils.INSTANCE.isColorTransparent(textColorPrimary) ? ContextCompat.getColor(context, R.color.stripe_color_text_unselected_primary_default) : textColorPrimary;
        this.unselectedTextColorSecondaryInt = StripeColorUtils.INSTANCE.isColorTransparent(textColorSecondary) ? ContextCompat.getColor(context, R.color.stripe_color_text_unselected_secondary_default) : textColorSecondary;
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        if (selected) {
            this.viewBinding.name.setTextColor(this.selectedColorInt);
            this.viewBinding.description.setTextColor(this.selectedColorInt);
            this.viewBinding.price.setTextColor(this.selectedColorInt);
            this.viewBinding.selectedIcon.setVisibility(0);
            return;
        }
        this.viewBinding.name.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.description.setTextColor(this.unselectedTextColorSecondaryInt);
        this.viewBinding.price.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.selectedIcon.setVisibility(4);
    }

    public final void setShippingMethod(ShippingMethod shippingMethod) {
        Intrinsics.checkNotNullParameter(shippingMethod, "shippingMethod");
        this.viewBinding.name.setText(shippingMethod.getLabel());
        this.viewBinding.description.setText(shippingMethod.getDetail());
        TextView textView = this.viewBinding.price;
        long amount = shippingMethod.getAmount();
        Currency currency = shippingMethod.getCurrency();
        String string = getContext().getString(R.string.stripe_price_free);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(PaymentUtils.formatPriceStringUsingFree(amount, currency, string));
    }
}
