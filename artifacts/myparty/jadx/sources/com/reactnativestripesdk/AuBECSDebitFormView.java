package com.reactnativestripesdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.reactcommunity.rndatetimepicker.Common;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.databinding.StripeBecsDebitWidgetBinding;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.BecsDebitWidget;
import com.stripe.android.view.EmailEditText;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuBECSDebitFormView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/reactnativestripesdk/AuBECSDebitFormView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "becsDebitWidget", "Lcom/stripe/android/view/BecsDebitWidget;", "formStyle", "Lcom/facebook/react/bridge/ReadableMap;", "setCompanyName", "", "name", "", "setFormStyle", "value", "onFormChanged", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodCreateParams;", "setListeners", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuBECSDebitFormView extends FrameLayout {
    public static final int $stable = 8;
    private BecsDebitWidget becsDebitWidget;
    private final ThemedReactContext context;
    private ReadableMap formStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuBECSDebitFormView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void setCompanyName(String name) {
        ThemedReactContext themedReactContext = this.context;
        Intrinsics.checkNotNull(name, "null cannot be cast to non-null type kotlin.String");
        this.becsDebitWidget = new BecsDebitWidget(themedReactContext, null, 0, name, 6, null);
        setFormStyle(this.formStyle);
        BecsDebitWidget becsDebitWidget = this.becsDebitWidget;
        if (becsDebitWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("becsDebitWidget");
            becsDebitWidget = null;
        }
        addView(becsDebitWidget);
        setListeners();
    }

    public final void setFormStyle(ReadableMap value) {
        this.formStyle = value;
        BecsDebitWidget becsDebitWidget = this.becsDebitWidget;
        if (becsDebitWidget == null || value == null) {
            return;
        }
        BecsDebitWidget becsDebitWidget2 = null;
        if (becsDebitWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("becsDebitWidget");
            becsDebitWidget = null;
        }
        StripeBecsDebitWidgetBinding stripeBecsDebitWidgetBindingBind = StripeBecsDebitWidgetBinding.bind(becsDebitWidget);
        Intrinsics.checkNotNullExpressionValue(stripeBecsDebitWidgetBindingBind, "bind(...)");
        String valOr = MappersKt.getValOr(value, Common.TEXT_COLOR, null);
        String valOr2 = MappersKt.getValOr(value, "textErrorColor", null);
        String valOr3 = MappersKt.getValOr(value, "placeholderColor", null);
        Integer intOrNull = MappersKt.getIntOrNull(value, ViewProps.FONT_SIZE);
        Integer intOrNull2 = MappersKt.getIntOrNull(value, "borderWidth");
        String valOr4 = MappersKt.getValOr(value, ViewProps.BACKGROUND_COLOR, null);
        String valOr5 = MappersKt.getValOr(value, ViewProps.BORDER_COLOR, null);
        Integer intOrNull3 = MappersKt.getIntOrNull(value, "borderRadius");
        int iIntValue = intOrNull3 != null ? intOrNull3.intValue() : 0;
        if (valOr != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = stripeBecsDebitWidgetBindingBind.accountNumberEditText;
            Intrinsics.checkNotNull(becsDebitAccountNumberEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText.setTextColor(Color.parseColor(valOr));
            BecsDebitBsbEditText becsDebitBsbEditText = stripeBecsDebitWidgetBindingBind.bsbEditText;
            Intrinsics.checkNotNull(becsDebitBsbEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText.setTextColor(Color.parseColor(valOr));
            EmailEditText emailEditText = stripeBecsDebitWidgetBindingBind.emailEditText;
            Intrinsics.checkNotNull(emailEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText.setTextColor(Color.parseColor(valOr));
            stripeBecsDebitWidgetBindingBind.nameEditText.setTextColor(Color.parseColor(valOr));
        }
        if (valOr2 != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = stripeBecsDebitWidgetBindingBind.accountNumberEditText;
            Intrinsics.checkNotNull(becsDebitAccountNumberEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText2.setErrorColor(Color.parseColor(valOr2));
            BecsDebitBsbEditText becsDebitBsbEditText2 = stripeBecsDebitWidgetBindingBind.bsbEditText;
            Intrinsics.checkNotNull(becsDebitBsbEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText2.setErrorColor(Color.parseColor(valOr2));
            EmailEditText emailEditText2 = stripeBecsDebitWidgetBindingBind.emailEditText;
            Intrinsics.checkNotNull(emailEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText2.setErrorColor(Color.parseColor(valOr2));
            stripeBecsDebitWidgetBindingBind.nameEditText.setErrorColor(Color.parseColor(valOr2));
        }
        if (valOr3 != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText3 = stripeBecsDebitWidgetBindingBind.accountNumberEditText;
            Intrinsics.checkNotNull(becsDebitAccountNumberEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText3.setHintTextColor(Color.parseColor(valOr3));
            BecsDebitBsbEditText becsDebitBsbEditText3 = stripeBecsDebitWidgetBindingBind.bsbEditText;
            Intrinsics.checkNotNull(becsDebitBsbEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText3.setHintTextColor(Color.parseColor(valOr3));
            EmailEditText emailEditText3 = stripeBecsDebitWidgetBindingBind.emailEditText;
            Intrinsics.checkNotNull(emailEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText3.setHintTextColor(Color.parseColor(valOr3));
            stripeBecsDebitWidgetBindingBind.nameEditText.setHintTextColor(Color.parseColor(valOr3));
        }
        if (intOrNull != null) {
            int iIntValue2 = intOrNull.intValue();
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText4 = stripeBecsDebitWidgetBindingBind.accountNumberEditText;
            Intrinsics.checkNotNull(becsDebitAccountNumberEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            float f = iIntValue2;
            becsDebitAccountNumberEditText4.setTextSize(f);
            BecsDebitBsbEditText becsDebitBsbEditText4 = stripeBecsDebitWidgetBindingBind.bsbEditText;
            Intrinsics.checkNotNull(becsDebitBsbEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText4.setTextSize(f);
            EmailEditText emailEditText4 = stripeBecsDebitWidgetBindingBind.emailEditText;
            Intrinsics.checkNotNull(emailEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText4.setTextSize(f);
            stripeBecsDebitWidgetBindingBind.nameEditText.setTextSize(f);
        }
        BecsDebitWidget becsDebitWidget3 = this.becsDebitWidget;
        if (becsDebitWidget3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("becsDebitWidget");
        } else {
            becsDebitWidget2 = becsDebitWidget3;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().toBuilder().setAllCorners(0, iIntValue * 2).build());
        materialShapeDrawable.setStrokeWidth(0.0f);
        materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor("#000000")));
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (intOrNull2 != null) {
            materialShapeDrawable.setStrokeWidth(intOrNull2.intValue() * 2);
        }
        if (valOr5 != null) {
            materialShapeDrawable.setStrokeColor(ColorStateList.valueOf(Color.parseColor(valOr5)));
        }
        if (valOr4 != null) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(Color.parseColor(valOr4)));
        }
        becsDebitWidget2.setBackground(materialShapeDrawable);
    }

    public final void onFormChanged(PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params.toParamMap().get("billing_details");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        Object obj2 = params.toParamMap().get("au_becs_debit");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        HashMap map = (HashMap) obj2;
        Object obj3 = map.get("account_number");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = map.get("bsb_number");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        HashMap map2 = (HashMap) obj;
        Object obj5 = map2.get("name");
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
        Object obj6 = map2.get("email");
        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("accountNumber", (String) obj3), TuplesKt.to("bsbNumber", (String) obj4), TuplesKt.to("name", (String) obj5), TuplesKt.to("email", (String) obj6));
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new FormCompleteEvent(this.context.getSurfaceId(), getId(), mapMutableMapOf));
        }
    }

    private final void setListeners() {
        BecsDebitWidget becsDebitWidget = this.becsDebitWidget;
        if (becsDebitWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("becsDebitWidget");
            becsDebitWidget = null;
        }
        becsDebitWidget.setValidParamsCallback(new BecsDebitWidget.ValidParamsCallback() { // from class: com.reactnativestripesdk.AuBECSDebitFormView.setListeners.1
            @Override // com.stripe.android.view.BecsDebitWidget.ValidParamsCallback
            public void onInputChanged(boolean isValid) throws Resources.NotFoundException, IOException {
                BecsDebitWidget becsDebitWidget2 = AuBECSDebitFormView.this.becsDebitWidget;
                if (becsDebitWidget2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("becsDebitWidget");
                    becsDebitWidget2 = null;
                }
                PaymentMethodCreateParams params = becsDebitWidget2.getParams();
                if (params != null) {
                    AuBECSDebitFormView.this.onFormChanged(params);
                }
            }
        });
    }
}
