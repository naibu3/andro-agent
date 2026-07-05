package com.reactnativestripesdk;

import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.os.LocaleListCompat;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.reactcommunity.rndatetimepicker.Common;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PostalCodeUtilities;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.StripeCardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;

/* compiled from: CardFieldView.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dJ\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\b\u0010&\u001a\u00020!H\u0002J\u0010\u0010'\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010(J\u000e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001dJ\u000e\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001dJ\u000e\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\u001dJ\"\u00102\u001a\u00020!2\u001a\u00103\u001a\u0016\u0012\u0004\u0012\u00020+\u0018\u000104j\n\u0012\u0004\u0012\u00020+\u0018\u0001`5J\u0010\u00106\u001a\u00020!2\b\u00107\u001a\u0004\u0018\u00010\fJ\u0012\u00108\u001a\u00020!2\b\u00109\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bJ\b\u0010;\u001a\u00020!H\u0002J\b\u0010<\u001a\u00020!H\u0002J\b\u0010=\u001a\u00020!H\u0002J\u0010\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@H\u0003J\u0010\u0010A\u001a\u00020B2\u0006\u0010?\u001a\u00020@H\u0003J\b\u0010C\u001a\u00020!H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/reactnativestripesdk/CardFieldView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "mCardWidget", "Lcom/stripe/android/view/CardInputWidget;", "cardInputWidgetBinding", "Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;", "cardDetails", "", "", "", "getCardDetails", "()Ljava/util/Map;", "cardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getCardParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "setCardParams", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;)V", "cardAddress", "Lcom/stripe/android/model/Address;", "getCardAddress", "()Lcom/stripe/android/model/Address;", "setCardAddress", "(Lcom/stripe/android/model/Address;)V", "dangerouslyGetFullCardDetails", "", "currentFocusedField", "isCardValid", "setAutofocus", "", "value", "requestFocusFromJS", "requestBlurFromJS", "requestClearFromJS", "onChangeFocus", "setCardStyle", "Lcom/facebook/react/bridge/ReadableMap;", "setCardBrandTint", "color", "", "setPlaceHolders", "setDangerouslyGetFullCardDetails", "isEnabled", "setPostalCodeEnabled", "setDisabled", "isDisabled", "setPreferredNetworks", "preferredNetworks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setOnBehalfOf", "onBehalfOf", "setCountryCode", "countryString", "getValue", "onValidCardChange", "sendCardDetailsEvent", "setListeners", "setPostalCodeFilter", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "createPostalCodeInputFilter", "Landroid/text/InputFilter;", "requestLayout", "mLayoutRunnable", "Ljava/lang/Runnable;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardFieldView extends FrameLayout {
    public static final int $stable = 8;
    private Address cardAddress;
    private final Map<String, Object> cardDetails;
    private final StripeCardInputWidgetBinding cardInputWidgetBinding;
    private PaymentMethodCreateParams.Card cardParams;
    private final ThemedReactContext context;
    private String currentFocusedField;
    private boolean dangerouslyGetFullCardDetails;
    private boolean isCardValid;
    private CardInputWidget mCardWidget;
    private final Runnable mLayoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFieldView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        CardInputWidget cardInputWidget = new CardInputWidget(context, null, 0, 6, null);
        this.mCardWidget = cardInputWidget;
        StripeCardInputWidgetBinding stripeCardInputWidgetBindingBind = StripeCardInputWidgetBinding.bind(cardInputWidget);
        Intrinsics.checkNotNullExpressionValue(stripeCardInputWidgetBindingBind, "bind(...)");
        this.cardInputWidgetBinding = stripeCardInputWidgetBindingBind;
        this.cardDetails = MapsKt.mutableMapOf(TuplesKt.to("brand", ""), TuplesKt.to("last4", ""), TuplesKt.to("expiryMonth", null), TuplesKt.to("expiryYear", null), TuplesKt.to(HintConstants.AUTOFILL_HINT_POSTAL_CODE, ""), TuplesKt.to("validNumber", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN), TuplesKt.to("validCVC", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN), TuplesKt.to("validExpiryDate", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        stripeCardInputWidgetBindingBind.container.setFocusable(true);
        stripeCardInputWidgetBindingBind.container.setFocusableInTouchMode(true);
        stripeCardInputWidgetBindingBind.container.requestFocus();
        addView(this.mCardWidget);
        setListeners();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.requestLayout();
            }
        });
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CardFieldView.mLayoutRunnable$lambda$27(this.f$0);
            }
        };
    }

    public final Map<String, Object> getCardDetails() {
        return this.cardDetails;
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

    public final void setAutofocus(boolean value) {
        if (value) {
            this.cardInputWidgetBinding.cardNumberEditText.requestFocus();
            CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.cardNumberEditText;
            Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
            ExtensionsKt.showSoftKeyboard(cardNumberEditText);
        }
    }

    public final void requestFocusFromJS() {
        this.cardInputWidgetBinding.cardNumberEditText.requestFocus();
        CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
        ExtensionsKt.showSoftKeyboard(cardNumberEditText);
    }

    public final void requestBlurFromJS() {
        CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
        ExtensionsKt.hideSoftKeyboard(cardNumberEditText);
        this.cardInputWidgetBinding.cardNumberEditText.clearFocus();
        this.cardInputWidgetBinding.container.requestFocus();
    }

    public final void requestClearFromJS() {
        this.cardInputWidgetBinding.cardNumberEditText.setText("");
        this.cardInputWidgetBinding.cvcEditText.setText("");
        this.cardInputWidgetBinding.expiryDateEditText.setText("");
        if (this.mCardWidget.getPostalCodeEnabled()) {
            this.cardInputWidgetBinding.postalCodeEditText.setText("");
        }
    }

    private final void onChangeFocus() {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new CardFocusChangeEvent(this.context.getSurfaceId(), getId(), this.currentFocusedField));
        }
    }

    public final void setCardStyle(ReadableMap value) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Integer intOrNull = MappersKt.getIntOrNull(value, "borderWidth");
        String valOr = MappersKt.getValOr(value, ViewProps.BACKGROUND_COLOR, null);
        String valOr2 = MappersKt.getValOr(value, ViewProps.BORDER_COLOR, null);
        Integer intOrNull2 = MappersKt.getIntOrNull(value, "borderRadius");
        int iIntValue = intOrNull2 != null ? intOrNull2.intValue() : 0;
        String valOr3 = MappersKt.getValOr(value, Common.TEXT_COLOR, null);
        Integer intOrNull3 = MappersKt.getIntOrNull(value, ViewProps.FONT_SIZE);
        String valOr$default = MappersKt.getValOr$default(value, ViewProps.FONT_FAMILY, null, 4, null);
        String valOr4 = MappersKt.getValOr(value, "placeholderColor", null);
        String valOr5 = MappersKt.getValOr(value, "textErrorColor", null);
        String valOr6 = MappersKt.getValOr(value, "cursorColor", null);
        Set<StripeEditText> of = SetsKt.setOf((Object[]) new StripeEditText[]{this.cardInputWidgetBinding.cardNumberEditText, this.cardInputWidgetBinding.cvcEditText, this.cardInputWidgetBinding.expiryDateEditText, this.cardInputWidgetBinding.postalCodeEditText});
        if (valOr3 != null) {
            Iterator it = of.iterator();
            while (it.hasNext()) {
                ((StripeEditText) it.next()).setTextColor(Color.parseColor(valOr3));
            }
        }
        if (valOr5 != null) {
            Iterator it2 = of.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).setErrorColor(Color.parseColor(valOr5));
            }
        }
        if (valOr4 != null) {
            Iterator it3 = of.iterator();
            while (it3.hasNext()) {
                ((StripeEditText) it3.next()).setHintTextColor(Color.parseColor(valOr4));
            }
            setCardBrandTint(Color.parseColor(valOr4));
        }
        if (intOrNull3 != null) {
            int iIntValue2 = intOrNull3.intValue();
            Iterator it4 = of.iterator();
            while (it4.hasNext()) {
                ((StripeEditText) it4.next()).setTextSize(iIntValue2);
            }
        }
        if (valOr$default != null) {
            for (StripeEditText stripeEditText : of) {
                String str = valOr$default.length() > 0 ? valOr$default : null;
                AssetManager assets = this.context.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                stripeEditText.setTypeface(ReactTypefaceUtils.applyStyles(null, -1, -1, str, assets));
            }
        }
        if (valOr6 != null && Build.VERSION.SDK_INT >= 29) {
            int color = Color.parseColor(valOr6);
            for (StripeEditText stripeEditText2 : of) {
                Drawable textCursorDrawable = stripeEditText2.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(color);
                }
                Drawable textSelectHandle = stripeEditText2.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(color);
                }
                Drawable textSelectHandleLeft = stripeEditText2.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(color);
                }
                Drawable textSelectHandleRight = stripeEditText2.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(color);
                }
                stripeEditText2.setHighlightColor(color);
            }
        }
        this.mCardWidget.setPadding(20, 0, 20, 0);
        CardInputWidget cardInputWidget = this.mCardWidget;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().toBuilder().setAllCorners(0, PixelUtil.toPixelFromDIP(iIntValue)).build());
        materialShapeDrawable.setStrokeWidth(0.0f);
        materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#000000")));
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (intOrNull != null) {
            materialShapeDrawable.setStrokeWidth(PixelUtil.toPixelFromDIP(intOrNull.intValue()));
        }
        if (valOr2 != null) {
            materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor(valOr2)));
        }
        if (valOr != null) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor(valOr)));
        }
        cardInputWidget.setBackground(materialShapeDrawable);
    }

    private final void setCardBrandTint(int color) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.cardInputWidgetBinding.cardBrandView.getClass().getDeclaredMethod("setTintColorInt$payments_core_release", Integer.TYPE).invoke(this.cardInputWidgetBinding.cardBrandView, Integer.valueOf(color));
        } catch (Exception e) {
            Log.e("StripeReactNative", "Unable to set card brand tint color: " + e.getMessage());
        }
    }

    public final void setPlaceHolders(ReadableMap value) throws Resources.NotFoundException {
        String valOr = MappersKt.getValOr(value, "number", null);
        String valOr2 = MappersKt.getValOr(value, "expiration", null);
        String valOr3 = MappersKt.getValOr(value, "cvc", null);
        String valOr4 = MappersKt.getValOr(value, HintConstants.AUTOFILL_HINT_POSTAL_CODE, null);
        if (valOr != null) {
            this.cardInputWidgetBinding.cardNumberEditText.setHint(valOr);
        }
        if (valOr2 != null) {
            this.cardInputWidgetBinding.expiryDateEditText.setHint(valOr2);
        }
        if (valOr3 != null) {
            this.mCardWidget.setCvcLabel(valOr3);
        }
        if (valOr4 != null) {
            this.cardInputWidgetBinding.postalCodeEditText.setHint(valOr4);
        }
    }

    public final void setDangerouslyGetFullCardDetails(boolean isEnabled) {
        this.dangerouslyGetFullCardDetails = isEnabled;
    }

    public final void setPostalCodeEnabled(boolean isEnabled) {
        this.mCardWidget.setPostalCodeEnabled(isEnabled);
        if (isEnabled) {
            return;
        }
        this.mCardWidget.setPostalCodeRequired(false);
    }

    public final void setDisabled(boolean isDisabled) {
        this.mCardWidget.setEnabled(!isDisabled);
    }

    public final void setPreferredNetworks(ArrayList<Integer> preferredNetworks) {
        this.mCardWidget.setPreferredNetworks(MappersKt.mapToPreferredNetworks(preferredNetworks));
    }

    public final void setOnBehalfOf(String onBehalfOf) {
        this.mCardWidget.setOnBehalfOf(onBehalfOf);
    }

    public final void setCountryCode(String countryString) {
        if (this.mCardWidget.getPostalCodeEnabled()) {
            CountryCode.Companion companion = CountryCode.INSTANCE;
            if (countryString == null) {
                Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
                countryString = locale != null ? locale.getCountry() : null;
                if (countryString == null) {
                    countryString = "US";
                }
            }
            CountryCode countryCodeCreate = companion.create(countryString);
            this.mCardWidget.setPostalCodeRequired(CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCodeCreate));
            setPostalCodeFilter(countryCodeCreate);
        }
    }

    public final Map<String, Object> getValue() {
        return this.cardDetails;
    }

    private final void onValidCardChange() {
        PaymentMethodCreateParams.Card paymentMethodCard = this.mCardWidget.getPaymentMethodCard();
        if (paymentMethodCard != null) {
            this.cardParams = paymentMethodCard;
            this.cardAddress = new Address.Builder().setPostalCode((String) this.cardDetails.get(HintConstants.AUTOFILL_HINT_POSTAL_CODE)).build();
        } else {
            this.cardParams = null;
            this.cardAddress = null;
        }
        CardParams cardParams = this.mCardWidget.getCardParams();
        if (cardParams != null) {
            this.cardDetails.put("brand", MappersKt.mapCardBrand(cardParams.getBrand()));
            this.cardDetails.put("last4", cardParams.getLast4());
        } else {
            this.cardDetails.put("brand", null);
            this.cardDetails.put("last4", null);
        }
        sendCardDetailsEvent();
    }

    private final void sendCardDetailsEvent() {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new CardChangeEvent(this.context.getSurfaceId(), getId(), this.cardDetails, this.mCardWidget.getPostalCodeEnabled(), this.isCardValid, this.dangerouslyGetFullCardDetails));
        }
    }

    private final void setListeners() {
        this.cardInputWidgetBinding.cardNumberEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFieldView.setListeners$lambda$21(this.f$0, view, z);
            }
        });
        this.cardInputWidgetBinding.expiryDateEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFieldView.setListeners$lambda$22(this.f$0, view, z);
            }
        });
        this.cardInputWidgetBinding.cvcEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFieldView.setListeners$lambda$23(this.f$0, view, z);
            }
        });
        this.cardInputWidgetBinding.postalCodeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardFieldView.setListeners$lambda$24(this.f$0, view, z);
            }
        });
        this.mCardWidget.setCardValidCallback(new CardValidCallback() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda7
            @Override // com.stripe.android.view.CardValidCallback
            public final void onInputChanged(boolean z, Set set) {
                CardFieldView.setListeners$lambda$25(this.f$0, z, set);
            }
        });
        this.mCardWidget.setCardInputListener(new CardInputListener() { // from class: com.reactnativestripesdk.CardFieldView.setListeners.6
            @Override // com.stripe.android.view.CardInputListener
            public void onCardComplete() {
            }

            @Override // com.stripe.android.view.CardInputListener
            public void onCvcComplete() {
            }

            @Override // com.stripe.android.view.CardInputListener
            public void onExpirationComplete() {
            }

            @Override // com.stripe.android.view.CardInputListener
            public void onFocusChange(CardInputListener.FocusField focusField) {
                Intrinsics.checkNotNullParameter(focusField, "focusField");
            }

            @Override // com.stripe.android.view.CardInputListener
            public void onPostalCodeComplete() {
            }
        });
        this.mCardWidget.setExpiryDateTextWatcher(new TextWatcher() { // from class: com.reactnativestripesdk.CardFieldView.setListeners.7
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
                List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(var1), new String[]{"/"}, false, 0, 6, (Object) null);
                CardFieldView.this.getCardDetails().put("expiryMonth", StringsKt.toIntOrNull((String) listSplit$default.get(0)));
                if (listSplit$default.size() == 2) {
                    CardFieldView.this.getCardDetails().put("expiryYear", StringsKt.toIntOrNull((String) StringsKt.split$default((CharSequence) String.valueOf(var1), new String[]{"/"}, false, 0, 6, (Object) null).get(1)));
                }
            }
        });
        this.mCardWidget.setPostalCodeTextWatcher(new TextWatcher() { // from class: com.reactnativestripesdk.CardFieldView.setListeners.8
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
                CardFieldView.this.getCardDetails().put(HintConstants.AUTOFILL_HINT_POSTAL_CODE, String.valueOf(var1));
            }
        });
        this.mCardWidget.setCardNumberTextWatcher(new TextWatcher() { // from class: com.reactnativestripesdk.CardFieldView.setListeners.9
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
                if (CardFieldView.this.dangerouslyGetFullCardDetails) {
                    CardFieldView.this.getCardDetails().put("number", StringsKt.replace$default(String.valueOf(var1), " ", "", false, 4, (Object) null));
                }
            }
        });
        this.mCardWidget.setCvcNumberTextWatcher(new TextWatcher() { // from class: com.reactnativestripesdk.CardFieldView.setListeners.10
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
                if (CardFieldView.this.dangerouslyGetFullCardDetails) {
                    CardFieldView.this.getCardDetails().put("cvc", String.valueOf(var1));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$21(CardFieldView cardFieldView, View view, boolean z) {
        cardFieldView.currentFocusedField = z ? "CardNumber" : null;
        cardFieldView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$22(CardFieldView cardFieldView, View view, boolean z) {
        cardFieldView.currentFocusedField = z ? "ExpiryDate" : null;
        cardFieldView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$23(CardFieldView cardFieldView, View view, boolean z) {
        cardFieldView.currentFocusedField = z ? "Cvc" : null;
        cardFieldView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$24(CardFieldView cardFieldView, View view, boolean z) {
        cardFieldView.currentFocusedField = z ? "PostalCode" : null;
        cardFieldView.onChangeFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$25(CardFieldView cardFieldView, boolean z, Set invalidFields) {
        Intrinsics.checkNotNullParameter(invalidFields, "invalidFields");
        cardFieldView.isCardValid = z;
        Map<String, Object> map = cardFieldView.cardDetails;
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardNumberEditText cardNumberEditText = cardFieldView.cardInputWidgetBinding.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
        map.put("validNumber", setListeners$lambda$25$getCardValidationState(invalidFields, fields, cardNumberEditText));
        Map<String, Object> map2 = cardFieldView.cardDetails;
        CardValidCallback.Fields fields2 = CardValidCallback.Fields.Cvc;
        CvcEditText cvcEditText = cardFieldView.cardInputWidgetBinding.cvcEditText;
        Intrinsics.checkNotNullExpressionValue(cvcEditText, "cvcEditText");
        map2.put("validCVC", setListeners$lambda$25$getCardValidationState(invalidFields, fields2, cvcEditText));
        Map<String, Object> map3 = cardFieldView.cardDetails;
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        ExpiryDateEditText expiryDateEditText = cardFieldView.cardInputWidgetBinding.expiryDateEditText;
        Intrinsics.checkNotNullExpressionValue(expiryDateEditText, "expiryDateEditText");
        map3.put("validExpiryDate", setListeners$lambda$25$getCardValidationState(invalidFields, fields3, expiryDateEditText));
        cardFieldView.cardDetails.put("brand", MappersKt.mapCardBrand(cardFieldView.cardInputWidgetBinding.cardNumberEditText.getCardBrand()));
        if (z) {
            cardFieldView.onValidCardChange();
            return;
        }
        cardFieldView.cardParams = null;
        cardFieldView.cardAddress = null;
        cardFieldView.sendCardDetailsEvent();
    }

    private static final String setListeners$lambda$25$getCardValidationState(Set<? extends CardValidCallback.Fields> set, CardValidCallback.Fields fields, StripeEditText stripeEditText) {
        if (set.contains(fields)) {
            if (stripeEditText.getShouldShowError()) {
                return "Invalid";
            }
            return "Incomplete";
        }
        return "Valid";
    }

    private final void setPostalCodeFilter(CountryCode countryCode) {
        PostalCodeEditText postalCodeEditText = this.cardInputWidgetBinding.postalCodeEditText;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(this.cardInputWidgetBinding.postalCodeEditText.getFilters());
        spreadBuilder.add(createPostalCodeInputFilter(countryCode));
        postalCodeEditText.setFilters((InputFilter[]) spreadBuilder.toArray(new InputFilter[spreadBuilder.size()]));
    }

    private final InputFilter createPostalCodeInputFilter(final CountryCode countryCode) {
        return new InputFilter() { // from class: com.reactnativestripesdk.CardFieldView$$ExternalSyntheticLambda2
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return CardFieldView.createPostalCodeInputFilter$lambda$26(countryCode, charSequence, i, i2, spanned, i3, i4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createPostalCodeInputFilter$lambda$26(CountryCode countryCode, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!(Intrinsics.areEqual(countryCode, CountryCode.INSTANCE.getUS()) && PostalCodeUtilities.INSTANCE.isValidUsPostalCodeCharacter$stripe_stripe_react_native_release(charSequence.charAt(i))) && (Intrinsics.areEqual(countryCode, CountryCode.INSTANCE.getUS()) || !PostalCodeUtilities.INSTANCE.isValidGlobalPostalCodeCharacter$stripe_stripe_react_native_release(charSequence.charAt(i)))) {
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
    public static final void mLayoutRunnable$lambda$27(CardFieldView cardFieldView) {
        cardFieldView.measure(View.MeasureSpec.makeMeasureSpec(cardFieldView.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(cardFieldView.getHeight(), BasicMeasure.EXACTLY));
        cardFieldView.layout(cardFieldView.getLeft(), cardFieldView.getTop(), cardFieldView.getRight(), cardFieldView.getBottom());
    }
}
