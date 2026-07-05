package com.reactnativestripesdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.stripe.android.GooglePayJsonFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: GooglePayButtonView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/reactnativestripesdk/GooglePayButtonView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "type", "", "Ljava/lang/Integer;", "appearance", "borderRadius", "button", "Lcom/google/android/gms/wallet/button/PayButton;", "initialize", "", "configureGooglePayButton", "buildButtonOptions", "Lcom/google/android/gms/wallet/button/ButtonOptions;", "getButtonType", "()Ljava/lang/Integer;", "getButtonTheme", "requestLayout", "mLayoutRunnable", "Ljava/lang/Runnable;", "setType", "setAppearance", "setBorderRadius", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayButtonView extends FrameLayout {
    public static final int $stable = 8;
    private Integer appearance;
    private int borderRadius;
    private PayButton button;
    private final ThemedReactContext context;
    private final Runnable mLayoutRunnable;
    private Integer type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayButtonView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderRadius = 4;
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.GooglePayButtonView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GooglePayButtonView.mLayoutRunnable$lambda$5(this.f$0);
            }
        };
    }

    public final void initialize() throws Resources.NotFoundException {
        PayButton payButton = this.button;
        if (payButton != null) {
            removeView(payButton);
        }
        PayButton payButtonConfigureGooglePayButton = configureGooglePayButton();
        this.button = payButtonConfigureGooglePayButton;
        addView(payButtonConfigureGooglePayButton);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.GooglePayButtonView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.requestLayout();
            }
        });
    }

    private final PayButton configureGooglePayButton() throws Resources.NotFoundException {
        PayButton payButton = new PayButton(this.context);
        payButton.initialize(buildButtonOptions());
        payButton.setOnClickListener(new View.OnClickListener() { // from class: com.reactnativestripesdk.GooglePayButtonView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GooglePayButtonView.configureGooglePayButton$lambda$2(this.f$0, view);
            }
        });
        return payButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureGooglePayButton$lambda$2(GooglePayButtonView googlePayButtonView, View view) {
        Object parent = googlePayButtonView.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.performClick();
        } else {
            Log.e("StripeReactNative", "Unable to find parent of GooglePayButtonView.");
        }
    }

    private final ButtonOptions buildButtonOptions() {
        String string = new JSONArray().put(GooglePayJsonFactory.createCardPaymentMethod$default(new GooglePayJsonFactory((Context) this.context, false, 2, (DefaultConstructorMarker) null), null, null, false, 4, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ButtonOptions.Builder allowedPaymentMethods = ButtonOptions.newBuilder().setAllowedPaymentMethods(string);
        Intrinsics.checkNotNullExpressionValue(allowedPaymentMethods, "setAllowedPaymentMethods(...)");
        Integer buttonType = getButtonType();
        if (buttonType != null) {
            allowedPaymentMethods.setButtonType(buttonType.intValue());
        }
        Integer buttonTheme = getButtonTheme();
        if (buttonTheme != null) {
            allowedPaymentMethods.setButtonTheme(buttonTheme.intValue());
        }
        allowedPaymentMethods.setCornerRadius((int) PixelUtil.toPixelFromDIP(this.borderRadius));
        ButtonOptions buttonOptionsBuild = allowedPaymentMethods.build();
        Intrinsics.checkNotNullExpressionValue(buttonOptionsBuild, "build(...)");
        return buttonOptionsBuild;
    }

    private final Integer getButtonType() {
        Integer num = this.type;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return 1;
        }
        if (num != null && num.intValue() == 6) {
            return 2;
        }
        if (num != null && num.intValue() == 5) {
            return 3;
        }
        if (num != null && num.intValue() == 4) {
            return 4;
        }
        if (num != null && num.intValue() == 11) {
            return 5;
        }
        if (num != null && num.intValue() == 7) {
            return 7;
        }
        if (num != null && num.intValue() == 1000) {
            return 6;
        }
        return (num != null && num.intValue() == 1001) ? 8 : null;
    }

    private final Integer getButtonTheme() {
        Integer num = this.appearance;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return 2;
        }
        return (num != null && num.intValue() == 2) ? 1 : null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mLayoutRunnable$lambda$5(GooglePayButtonView googlePayButtonView) {
        googlePayButtonView.measure(View.MeasureSpec.makeMeasureSpec(googlePayButtonView.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(googlePayButtonView.getHeight(), BasicMeasure.EXACTLY));
        PayButton payButton = googlePayButtonView.button;
        if (payButton != null) {
            payButton.layout(googlePayButtonView.getLeft(), googlePayButtonView.getTop(), googlePayButtonView.getRight(), googlePayButtonView.getBottom());
        }
    }

    public final void setType(int type) {
        this.type = Integer.valueOf(type);
    }

    public final void setAppearance(int appearance) {
        this.appearance = Integer.valueOf(appearance);
    }

    public final void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }
}
