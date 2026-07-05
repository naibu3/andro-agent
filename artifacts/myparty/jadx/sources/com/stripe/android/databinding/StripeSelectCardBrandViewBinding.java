package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.stripe.android.R;

/* loaded from: classes5.dex */
public final class StripeSelectCardBrandViewBinding implements ViewBinding {
    private final LinearLayout rootView;

    private StripeSelectCardBrandViewBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static StripeSelectCardBrandViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeSelectCardBrandViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.stripe_select_card_brand_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeSelectCardBrandViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new StripeSelectCardBrandViewBinding((LinearLayout) view);
    }
}
