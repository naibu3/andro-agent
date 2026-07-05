package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.databinding.StripeCardBrandSpinnerDropdownBinding;
import com.stripe.android.databinding.StripeCardBrandSpinnerMainBinding;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandSpinner.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0007J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardBrandsAdapter", "Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "defaultBackground", "Landroid/graphics/drawable/Drawable;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "onFinishInflate", "", "setTintColor", "tintColor", "setCardBrands", "cardBrands", "", "Adapter", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardBrandSpinner extends AppCompatSpinner {
    public static final int $stable = 8;
    private final Adapter cardBrandsAdapter;
    private Drawable defaultBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardBrandSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.spinnerStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Adapter adapter = new Adapter(context);
        this.cardBrandsAdapter = adapter;
        setAdapter((SpinnerAdapter) adapter);
        setDropDownWidth(getResources().getDimensionPixelSize(com.stripe.android.R.dimen.stripe_card_brand_spinner_dropdown_width));
    }

    public final CardBrand getCardBrand() {
        return (CardBrand) getSelectedItem();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.defaultBackground = getBackground();
        setCardBrands(CollectionsKt.listOf(CardBrand.Unknown));
    }

    public final void setTintColor(int tintColor) {
        this.cardBrandsAdapter.setTintColor$payments_core_release(tintColor);
    }

    public final /* synthetic */ void setCardBrands(List cardBrands) {
        Intrinsics.checkNotNullParameter(cardBrands, "cardBrands");
        this.cardBrandsAdapter.clear();
        this.cardBrandsAdapter.addAll(cardBrands);
        this.cardBrandsAdapter.notifyDataSetChanged();
        setSelection(0);
        if (cardBrands.size() > 1) {
            setClickable(true);
            setEnabled(true);
            setBackground(this.defaultBackground);
        } else {
            setClickable(false);
            setEnabled(false);
            setBackgroundColor(ContextCompat.getColor(getContext(), android.R.color.transparent));
        }
    }

    /* compiled from: CardBrandSpinner.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0002R\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/CardBrand;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "tintColor", "", "getTintColor$payments_core_release", "()I", "setTintColor$payments_core_release", "(I)V", "getView", "Landroid/view/View;", ViewProps.POSITION, "convertView", "parent", "Landroid/view/ViewGroup;", "getDropDownView", "createCardBrandDrawable", "Landroid/graphics/drawable/Drawable;", "cardBrand", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Adapter extends ArrayAdapter<CardBrand> {
        public static final int $stable = 8;
        private final LayoutInflater layoutInflater;
        private int tintColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Adapter(Context context) {
            super(context, 0);
            Intrinsics.checkNotNullParameter(context, "context");
            this.layoutInflater = LayoutInflater.from(context);
        }

        /* renamed from: getTintColor$payments_core_release, reason: from getter */
        public final int getTintColor() {
            return this.tintColor;
        }

        public final void setTintColor$payments_core_release(int i) {
            this.tintColor = i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            StripeCardBrandSpinnerMainBinding stripeCardBrandSpinnerMainBindingInflate;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (convertView == null || (stripeCardBrandSpinnerMainBindingInflate = StripeCardBrandSpinnerMainBinding.bind(convertView)) == null) {
                stripeCardBrandSpinnerMainBindingInflate = StripeCardBrandSpinnerMainBinding.inflate(this.layoutInflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeCardBrandSpinnerMainBindingInflate, "inflate(...)");
            }
            CardBrand item = getItem(position);
            if (item == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            CardBrand cardBrand = item;
            AppCompatImageView appCompatImageView = stripeCardBrandSpinnerMainBindingInflate.image;
            appCompatImageView.setImageDrawable(createCardBrandDrawable(cardBrand));
            appCompatImageView.setContentDescription(cardBrand.getDisplayName());
            AppCompatImageView root = stripeCardBrandSpinnerMainBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            return root;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            StripeCardBrandSpinnerDropdownBinding stripeCardBrandSpinnerDropdownBindingInflate;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (convertView == null || (stripeCardBrandSpinnerDropdownBindingInflate = StripeCardBrandSpinnerDropdownBinding.bind(convertView)) == null) {
                stripeCardBrandSpinnerDropdownBindingInflate = StripeCardBrandSpinnerDropdownBinding.inflate(this.layoutInflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(stripeCardBrandSpinnerDropdownBindingInflate, "inflate(...)");
            }
            CardBrand item = getItem(position);
            if (item == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            CardBrand cardBrand = item;
            AppCompatTextView appCompatTextView = stripeCardBrandSpinnerDropdownBindingInflate.textView;
            appCompatTextView.setText(cardBrand.getDisplayName());
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(createCardBrandDrawable(cardBrand), (Drawable) null, (Drawable) null, (Drawable) null);
            AppCompatTextView root = stripeCardBrandSpinnerDropdownBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            return root;
        }

        private final Drawable createCardBrandDrawable(CardBrand cardBrand) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), cardBrand.getIcon());
            if (drawable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (cardBrand != CardBrand.Unknown) {
                return drawable;
            }
            Drawable drawableWrap = DrawableCompat.wrap(drawable);
            Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
            DrawableCompat.setTint(drawableWrap.mutate(), this.tintColor);
            Drawable drawableUnwrap = DrawableCompat.unwrap(drawableWrap);
            Intrinsics.checkNotNull(drawableUnwrap);
            return drawableUnwrap;
        }
    }
}
