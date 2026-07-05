package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeEditText;

/* loaded from: classes5.dex */
public final class StripeCardFormViewBinding implements ViewBinding {
    public final CardMultilineWidget cardMultilineWidget;
    public final MaterialCardView cardMultilineWidgetContainer;
    public final CountryTextInputLayout countryLayout;
    public final View countryPostalDivider;
    public final TextView errors;
    public final PostalCodeEditText postalCode;
    public final TextInputLayout postalCodeContainer;
    private final View rootView;

    private StripeCardFormViewBinding(View view, CardMultilineWidget cardMultilineWidget, MaterialCardView materialCardView, CountryTextInputLayout countryTextInputLayout, View view2, TextView textView, PostalCodeEditText postalCodeEditText, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.cardMultilineWidget = cardMultilineWidget;
        this.cardMultilineWidgetContainer = materialCardView;
        this.countryLayout = countryTextInputLayout;
        this.countryPostalDivider = view2;
        this.errors = textView;
        this.postalCode = postalCodeEditText;
        this.postalCodeContainer = textInputLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeCardFormViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.stripe_card_form_view, viewGroup);
        return bind(viewGroup);
    }

    public static StripeCardFormViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = R.id.card_multiline_widget;
        CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) ViewBindings.findChildViewById(view, i);
        if (cardMultilineWidget != null) {
            i = R.id.card_multiline_widget_container;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
            if (materialCardView != null) {
                i = R.id.country_layout;
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) ViewBindings.findChildViewById(view, i);
                if (countryTextInputLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.country_postal_divider))) != null) {
                    i = R.id.errors;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.postal_code;
                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) ViewBindings.findChildViewById(view, i);
                        if (postalCodeEditText != null) {
                            i = R.id.postal_code_container;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                            if (textInputLayout != null) {
                                return new StripeCardFormViewBinding(view, cardMultilineWidget, materialCardView, countryTextInputLayout, viewFindChildViewById, textView, postalCodeEditText, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
