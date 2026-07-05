package com.reactnativestripesdk;

import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.reactcommunity.rndatetimepicker.Common;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PostalCodeUtilities;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.databinding.StripeCardFormViewBinding;
import com.stripe.android.databinding.StripeCardMultilineWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* compiled from: CardFormView.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\u0010\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tJ\"\u0010$\u001a\u00020\u001d2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020'\u0018\u00010&j\n\u0012\u0004\u0012\u00020'\u0018\u0001`(J\u0012\u0010)\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0003J\u0010\u0010+\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010!J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010-\u001a\u00020\u001dJ\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001dJ\b\u00100\u001a\u00020\u001dH\u0002J\u0012\u00101\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010!H\u0007J\u000e\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\tJ\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u000207H\u0003J\b\u00108\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/reactnativestripesdk/CardFormView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "cardForm", "Lcom/stripe/android/view/CardFormView;", "dangerouslyGetFullCardDetails", "", "currentFocusedField", "", "cardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getCardParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "setCardParams", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;)V", "cardAddress", "Lcom/stripe/android/model/Address;", "getCardAddress", "()Lcom/stripe/android/model/Address;", "setCardAddress", "(Lcom/stripe/android/model/Address;)V", "cardFormViewBinding", "Lcom/stripe/android/databinding/StripeCardFormViewBinding;", "multilineWidgetBinding", "Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;", "setPostalCodeEnabled", "", "value", "setDefaultValues", "defaults", "Lcom/facebook/react/bridge/ReadableMap;", "setDisabled", "isDisabled", "setPreferredNetworks", "preferredNetworks", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "setCountry", "countryString", "setPlaceHolders", "setAutofocus", "requestFocusFromJS", "requestBlurFromJS", "requestClearFromJS", "onChangeFocus", "setCardStyle", "setDangerouslyGetFullCardDetails", "isEnabled", "setListeners", "setPostalCodeFilter", "createPostalCodeInputFilter", "Landroid/text/InputFilter;", "requestLayout", "mLayoutRunnable", "Ljava/lang/Runnable;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardFormView extends FrameLayout {
    public static final int $stable = 8;
    private Address cardAddress;
    private com.stripe.android.view.CardFormView cardForm;
    private final StripeCardFormViewBinding cardFormViewBinding;
    private PaymentMethodCreateParams.Card cardParams;
    private final ThemedReactContext context;
    private String currentFocusedField;
    private boolean dangerouslyGetFullCardDetails;
    private final Runnable mLayoutRunnable;
    private final StripeCardMultilineWidgetBinding multilineWidgetBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFormView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        com.stripe.android.view.CardFormView cardFormView = new com.stripe.android.view.CardFormView(context, null, com.stripe.android.R.style.StripeCardFormView_Borderless);
        this.cardForm = cardFormView;
        StripeCardFormViewBinding stripeCardFormViewBindingBind = StripeCardFormViewBinding.bind(cardFormView);
        Intrinsics.checkNotNullExpressionValue(stripeCardFormViewBindingBind, "bind(...)");
        this.cardFormViewBinding = stripeCardFormViewBindingBind;
        StripeCardMultilineWidgetBinding stripeCardMultilineWidgetBindingBind = StripeCardMultilineWidgetBinding.bind(stripeCardFormViewBindingBind.cardMultilineWidget);
        Intrinsics.checkNotNullExpressionValue(stripeCardMultilineWidgetBindingBind, "bind(...)");
        this.multilineWidgetBinding = stripeCardMultilineWidgetBindingBind;
        stripeCardFormViewBindingBind.cardMultilineWidgetContainer.setFocusable(true);
        stripeCardFormViewBindingBind.cardMultilineWidgetContainer.setFocusableInTouchMode(true);
        ViewGroup.LayoutParams layoutParams = stripeCardFormViewBindingBind.cardMultilineWidgetContainer.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        addView(this.cardForm);
        setListeners();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.requestLayout();
            }
        });
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CardFormView.mLayoutRunnable$lambda$24(this.f$0);
            }
        };
    }

    public final PaymentMethodCreateParams.Card getCardParams() {
        return this.cardParams;
    }

    public final void setCardParams(PaymentMethodCreateParams.Card card) {
        this.cardParams = card;
    }

    public final Address getCardAddress() {
        return this.cardAddress;
    }

    public final void setCardAddress(Address address) {
        this.cardAddress = address;
    }

    public final void setPostalCodeEnabled(boolean value) {
        int i = value ? 0 : 8;
        this.cardFormViewBinding.cardMultilineWidget.setPostalCodeRequired(false);
        this.cardFormViewBinding.postalCodeContainer.setVisibility(i);
    }

    public final void setDefaultValues(ReadableMap defaults) {
        setCountry(defaults != null ? defaults.getString("countryCode") : null);
    }

    public final void setDisabled(boolean isDisabled) {
        this.cardForm.setEnabled(!isDisabled);
    }

    public final void setPreferredNetworks(ArrayList<Integer> preferredNetworks) {
        this.cardForm.setPreferredNetworks(MappersKt.mapToPreferredNetworks(preferredNetworks));
    }

    private final void setCountry(String countryString) {
        if (countryString != null) {
            this.cardFormViewBinding.countryLayout.setSelectedCountryCode(new CountryCode(countryString));
            this.cardFormViewBinding.countryLayout.updateUiForCountryEntered(new CountryCode(countryString));
        }
        setPostalCodeFilter();
    }

    public final void setPlaceHolders(ReadableMap value) {
        String valOr = MappersKt.getValOr(value, "number", null);
        String valOr2 = MappersKt.getValOr(value, "expiration", null);
        String valOr3 = MappersKt.getValOr(value, "cvc", null);
        String valOr4 = MappersKt.getValOr(value, HintConstants.AUTOFILL_HINT_POSTAL_CODE, null);
        if (valOr != null) {
            this.multilineWidgetBinding.tlCardNumber.setHint(valOr);
        }
        if (valOr2 != null) {
            this.multilineWidgetBinding.tlExpiry.setHint(valOr2);
        }
        if (valOr3 != null) {
            this.multilineWidgetBinding.tlCvc.setHint(valOr3);
        }
        if (valOr4 != null) {
            this.cardFormViewBinding.postalCodeContainer.setHint(valOr4);
        }
    }

    public final void setAutofocus(boolean value) {
        if (value) {
            CardNumberEditText etCardNumber = this.multilineWidgetBinding.etCardNumber;
            Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
            etCardNumber.requestFocus();
            ExtensionsKt.showSoftKeyboard(etCardNumber);
        }
    }

    public final void requestFocusFromJS() {
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
        etCardNumber.requestFocus();
        ExtensionsKt.showSoftKeyboard(etCardNumber);
    }

    public final void requestBlurFromJS() {
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
        ExtensionsKt.hideSoftKeyboard(etCardNumber);
        etCardNumber.clearFocus();
    }

    public final void requestClearFromJS() {
        this.multilineWidgetBinding.etCardNumber.setText("");
        this.multilineWidgetBinding.etCvc.setText("");
        this.multilineWidgetBinding.etExpiry.setText("");
        this.cardFormViewBinding.postalCode.setText("");
    }

    private final void onChangeFocus() {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new CardFocusChangeEvent(this.context.getSurfaceId(), getId(), this.currentFocusedField));
        }
    }

    public final void setCardStyle(ReadableMap value) {
        String valOr = MappersKt.getValOr(value, ViewProps.BACKGROUND_COLOR, null);
        String valOr2 = MappersKt.getValOr(value, Common.TEXT_COLOR, null);
        Integer intOrNull = MappersKt.getIntOrNull(value, "borderWidth");
        String valOr3 = MappersKt.getValOr(value, ViewProps.BORDER_COLOR, null);
        Integer intOrNull2 = MappersKt.getIntOrNull(value, "borderRadius");
        int iIntValue = intOrNull2 != null ? intOrNull2.intValue() : 0;
        Integer intOrNull3 = MappersKt.getIntOrNull(value, ViewProps.FONT_SIZE);
        String valOr$default = MappersKt.getValOr$default(value, ViewProps.FONT_FAMILY, null, 4, null);
        String valOr4 = MappersKt.getValOr(value, "placeholderColor", null);
        String valOr5 = MappersKt.getValOr(value, "textErrorColor", null);
        String valOr6 = MappersKt.getValOr(value, "cursorColor", null);
        Set<StripeEditText> of = SetsKt.setOf((Object[]) new StripeEditText[]{this.cardFormViewBinding.cardMultilineWidget.getCardNumberEditText(), this.cardFormViewBinding.cardMultilineWidget.getCvcEditText(), this.cardFormViewBinding.cardMultilineWidget.getExpiryDateEditText(), this.cardFormViewBinding.postalCode});
        Set of2 = SetsKt.setOf((Object[]) new TextInputLayout[]{this.multilineWidgetBinding.tlExpiry, this.multilineWidgetBinding.tlCardNumber, this.multilineWidgetBinding.tlCvc, this.cardFormViewBinding.postalCodeContainer});
        if (valOr2 != null) {
            Iterator it = of.iterator();
            while (it.hasNext()) {
                ((StripeEditText) it.next()).setTextColor(Color.parseColor(valOr2));
            }
            this.cardFormViewBinding.countryLayout.getCountryAutocomplete().setTextColor(Color.parseColor(valOr2));
        }
        if (valOr5 != null) {
            Iterator it2 = of.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).setErrorColor(Color.parseColor(valOr5));
                this.cardFormViewBinding.postalCode.setErrorColor(Color.parseColor(valOr5));
            }
        }
        if (valOr4 != null) {
            for (Object obj : of2) {
                Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
                ((TextInputLayout) obj).setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(valOr4)));
            }
        }
        if (intOrNull3 != null) {
            int iIntValue2 = intOrNull3.intValue();
            Iterator it3 = of.iterator();
            while (it3.hasNext()) {
                ((StripeEditText) it3.next()).setTextSize(iIntValue2);
            }
        }
        if (valOr$default != null) {
            if (valOr$default.length() <= 0) {
                valOr$default = null;
            }
            AssetManager assets = this.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(null, -1, -1, valOr$default, assets);
            Iterator it4 = of.iterator();
            while (it4.hasNext()) {
                ((StripeEditText) it4.next()).setTypeface(typefaceApplyStyles);
            }
            for (Object obj2 : of2) {
                Intrinsics.checkNotNullExpressionValue(obj2, "next(...)");
                ((TextInputLayout) obj2).setTypeface(typefaceApplyStyles);
            }
            this.cardFormViewBinding.countryLayout.setTypeface(typefaceApplyStyles);
            this.cardFormViewBinding.countryLayout.getCountryAutocomplete().setTypeface(typefaceApplyStyles);
            this.cardFormViewBinding.errors.setTypeface(typefaceApplyStyles);
        }
        if (valOr6 != null && Build.VERSION.SDK_INT >= 29) {
            int color = Color.parseColor(valOr6);
            for (StripeEditText stripeEditText : of) {
                Drawable textCursorDrawable = stripeEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(color);
                }
                Drawable textSelectHandle = stripeEditText.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(color);
                }
                Drawable textSelectHandleLeft = stripeEditText.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(color);
                }
                Drawable textSelectHandleRight = stripeEditText.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(color);
                }
                stripeEditText.setHighlightColor(color);
            }
        }
        MaterialCardView materialCardView = this.cardFormViewBinding.cardMultilineWidgetContainer;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().toBuilder().setAllCorners(0, PixelUtil.toPixelFromDIP(iIntValue)).build());
        materialShapeDrawable.setStrokeWidth(0.0f);
        materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#000000")));
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (intOrNull != null) {
            materialShapeDrawable.setStrokeWidth(PixelUtil.toPixelFromDIP(intOrNull.intValue()));
        }
        if (valOr3 != null) {
            materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor(valOr3)));
        }
        if (valOr != null) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor(valOr)));
        }
        materialCardView.setBackground(materialShapeDrawable);
    }

    public final void setDangerouslyGetFullCardDetails(boolean isEnabled) {
        this.dangerouslyGetFullCardDetails = isEnabled;
    }

    private final void setListeners() {
        this.cardForm.setCardValidCallback(new CardValidCallback() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda2
            @Override // com.stripe.android.view.CardValidCallback
            public final void onInputChanged(boolean z, Set set) throws Resources.NotFoundException {
                CardFormView.setListeners$lambda$18(this.f$0, z, set);
            }
        });
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
        CvcEditText etCvc = this.multilineWidgetBinding.etCvc;
        Intrinsics.checkNotNullExpressionValue(etCvc, "etCvc");
        ExpiryDateEditText etExpiry = this.multilineWidgetBinding.etExpiry;
        Intrinsics.checkNotNullExpressionValue(etExpiry, "etExpiry");
        PostalCodeEditText postalCode = this.cardFormViewBinding.postalCode;
        Intrinsics.checkNotNullExpressionValue(postalCode, "postalCode");
        etCardNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFormView.setListeners$lambda$19(this.f$0, view, z);
            }
        });
        etCvc.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFormView.setListeners$lambda$20(this.f$0, view, z);
            }
        });
        etExpiry.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFormView.setListeners$lambda$21(this.f$0, view, z);
            }
        });
        postalCode.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFormView.setListeners$lambda$22(this.f$0, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$18(CardFormView cardFormView, boolean z, Set set) throws Resources.NotFoundException {
        String postalCode;
        String country;
        Intrinsics.checkNotNullParameter(set, "<unused var>");
        if (z) {
            CardParams cardParams = cardFormView.cardForm.getCardParams();
            if (cardParams != null) {
                Object obj = cardParams.toParamMap().get("card");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                Pair[] pairArr = new Pair[6];
                HashMap map = (HashMap) obj;
                Object obj2 = map.get("exp_month");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                pairArr[0] = TuplesKt.to("expiryMonth", (Integer) obj2);
                Object obj3 = map.get("exp_year");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                pairArr[1] = TuplesKt.to("expiryYear", (Integer) obj3);
                pairArr[2] = TuplesKt.to("last4", cardParams.getLast4());
                pairArr[3] = TuplesKt.to("brand", MappersKt.mapCardBrand(cardParams.getBrand()));
                Address address = cardParams.getAddress();
                String str = "";
                if (address == null || (postalCode = address.getPostalCode()) == null) {
                    postalCode = "";
                }
                pairArr[4] = TuplesKt.to(HintConstants.AUTOFILL_HINT_POSTAL_CODE, postalCode);
                Address address2 = cardParams.getAddress();
                if (address2 != null && (country = address2.getCountry()) != null) {
                    str = country;
                }
                pairArr[5] = TuplesKt.to("country", str);
                Map mapMutableMapOf = MapsKt.mutableMapOf(pairArr);
                if (cardFormView.dangerouslyGetFullCardDetails) {
                    Object obj4 = map.get("number");
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    mapMutableMapOf.put("number", (String) obj4);
                    Object obj5 = map.get("cvc");
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                    mapMutableMapOf.put("cvc", (String) obj5);
                }
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(cardFormView.context, cardFormView.getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new CardFormCompleteEvent(cardFormView.context.getSurfaceId(), cardFormView.getId(), mapMutableMapOf, z, cardFormView.dangerouslyGetFullCardDetails));
                }
                Address.Builder builder = new Address.Builder();
                Address address3 = cardParams.getAddress();
                Address.Builder postalCode2 = builder.setPostalCode(address3 != null ? address3.getPostalCode() : null);
                Address address4 = cardParams.getAddress();
                cardFormView.cardAddress = postalCode2.setCountry(address4 != null ? address4.getCountry() : null).build();
                PaymentMethodCreateParams.Card paymentMethodCard = cardFormView.cardFormViewBinding.cardMultilineWidget.getPaymentMethodCard();
                if (paymentMethodCard != null) {
                    cardFormView.cardParams = paymentMethodCard;
                    return;
                }
                return;
            }
            return;
        }
        cardFormView.cardParams = null;
        cardFormView.cardAddress = null;
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(cardFormView.context, cardFormView.getId());
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new CardFormCompleteEvent(cardFormView.context.getSurfaceId(), cardFormView.getId(), null, z, cardFormView.dangerouslyGetFullCardDetails));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$19(CardFormView cardFormView, View view, boolean z) {
        cardFormView.currentFocusedField = z ? CardInputListener.FocusField.CardNumber.toString() : null;
        cardFormView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$20(CardFormView cardFormView, View view, boolean z) {
        cardFormView.currentFocusedField = z ? CardInputListener.FocusField.Cvc.toString() : null;
        cardFormView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$21(CardFormView cardFormView, View view, boolean z) {
        cardFormView.currentFocusedField = z ? CardInputListener.FocusField.ExpiryDate.toString() : null;
        cardFormView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$22(CardFormView cardFormView, View view, boolean z) {
        cardFormView.currentFocusedField = z ? CardInputListener.FocusField.PostalCode.toString() : null;
        cardFormView.onChangeFocus();
    }

    private final void setPostalCodeFilter() {
        PostalCodeEditText postalCodeEditText = this.cardFormViewBinding.postalCode;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(this.cardFormViewBinding.postalCode.getFilters());
        spreadBuilder.add(createPostalCodeInputFilter());
        postalCodeEditText.setFilters((InputFilter[]) spreadBuilder.toArray(new InputFilter[spreadBuilder.size()]));
    }

    private final InputFilter createPostalCodeInputFilter() {
        return new InputFilter() { // from class: com.reactnativestripesdk.CardFormView$$ExternalSyntheticLambda7
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return CardFormView.createPostalCodeInputFilter$lambda$23(this.f$0, charSequence, i, i2, spanned, i3, i4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createPostalCodeInputFilter$lambda$23(CardFormView cardFormView, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (Intrinsics.areEqual(cardFormView.cardFormViewBinding.countryLayout.getSelectedCountryCode(), CountryCode.INSTANCE.getUS())) {
            return null;
        }
        while (i < i2) {
            if (!PostalCodeUtilities.INSTANCE.isValidGlobalPostalCodeCharacter$stripe_stripe_react_native_release(charSequence.charAt(i))) {
                return "";
            }
            i++;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mLayoutRunnable$lambda$24(CardFormView cardFormView) {
        cardFormView.measure(View.MeasureSpec.makeMeasureSpec(cardFormView.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(cardFormView.getHeight(), BasicMeasure.EXACTLY));
        cardFormView.layout(cardFormView.getLeft(), cardFormView.getTop(), cardFormView.getRight(), cardFormView.getBottom());
    }
}
