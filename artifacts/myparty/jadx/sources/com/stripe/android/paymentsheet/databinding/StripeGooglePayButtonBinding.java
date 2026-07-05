package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.wallet.button.PayButton;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;

/* loaded from: classes6.dex */
public final class StripeGooglePayButtonBinding implements ViewBinding {
    public final RelativeLayout googlePayButtonLayout;
    public final PayButton googlePayPaymentButton;
    public final PrimaryButton googlePayPrimaryButton;
    private final View rootView;

    private StripeGooglePayButtonBinding(View view, RelativeLayout relativeLayout, PayButton payButton, PrimaryButton primaryButton) {
        this.rootView = view;
        this.googlePayButtonLayout = relativeLayout;
        this.googlePayPaymentButton = payButton;
        this.googlePayPrimaryButton = primaryButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeGooglePayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.stripe_google_pay_button, viewGroup);
        return bind(viewGroup);
    }

    public static StripeGooglePayButtonBinding bind(View view) {
        int i = R.id.google_pay_button_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.google_pay_payment_button;
            PayButton payButton = (PayButton) ViewBindings.findChildViewById(view, i);
            if (payButton != null) {
                i = R.id.google_pay_primary_button;
                PrimaryButton primaryButton = (PrimaryButton) ViewBindings.findChildViewById(view, i);
                if (primaryButton != null) {
                    return new StripeGooglePayButtonBinding(view, relativeLayout, payButton, primaryButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
