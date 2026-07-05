package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;

/* loaded from: classes5.dex */
public final class StripeCardBrandSpinnerMainBinding implements ViewBinding {
    public final AppCompatImageView image;
    private final AppCompatImageView rootView;

    private StripeCardBrandSpinnerMainBinding(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.image = appCompatImageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AppCompatImageView getRoot() {
        return this.rootView;
    }

    public static StripeCardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeCardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.stripe_card_brand_spinner_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeCardBrandSpinnerMainBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new StripeCardBrandSpinnerMainBinding(appCompatImageView, appCompatImageView);
    }
}
