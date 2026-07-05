package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;

/* loaded from: classes6.dex */
public final class StripeFragmentPrimaryButtonContainerBinding implements ViewBinding {
    public final PrimaryButton primaryButton;
    private final FrameLayout rootView;

    private StripeFragmentPrimaryButtonContainerBinding(FrameLayout frameLayout, PrimaryButton primaryButton) {
        this.rootView = frameLayout;
        this.primaryButton = primaryButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static StripeFragmentPrimaryButtonContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeFragmentPrimaryButtonContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.stripe_fragment_primary_button_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeFragmentPrimaryButtonContainerBinding bind(View view) {
        int i = R.id.primary_button;
        PrimaryButton primaryButton = (PrimaryButton) ViewBindings.findChildViewById(view, i);
        if (primaryButton != null) {
            return new StripeFragmentPrimaryButtonContainerBinding((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
