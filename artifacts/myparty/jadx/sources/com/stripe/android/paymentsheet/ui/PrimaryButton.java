package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.databinding.StripePrimaryButtonBinding;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimaryButton.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002TUB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u000bJ\u0010\u00108\u001a\u0002042\b\b\u0001\u00109\u001a\u00020\u0007J\u0010\u0010:\u001a\u0002042\b\b\u0001\u0010;\u001a\u00020\u0007J\u0010\u0010<\u001a\u0002042\b\b\u0001\u00109\u001a\u00020\u0007J\u0010\u0010=\u001a\u0002042\b\b\u0001\u0010;\u001a\u00020\u0007J\u0012\u0010>\u001a\u0002042\b\u00107\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010?\u001a\u0004\u0018\u00010@2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010A\u001a\u0002042\b\u0010B\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010C\u001a\u000204H\u0002J\b\u0010D\u001a\u000204H\u0002J\u0016\u0010E\u001a\u0002042\f\u0010F\u001a\b\u0012\u0004\u0012\u0002040GH\u0002J\u0010\u0010H\u001a\u0002042\u0006\u0010I\u001a\u00020&H\u0016J\u0012\u0010J\u001a\u0002042\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010M\u001a\u0002042\b\u0010N\u001a\u0004\u0018\u00010OJ\u0010\u0010P\u001a\u0002042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020&H\u0002J\b\u0010S\u001a\u000204H\u0002R&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R&\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\r\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultTintList", "Landroid/content/res/ColorStateList;", "getDefaultTintList$paymentsheet_release$annotations", "()V", "getDefaultTintList$paymentsheet_release", "()Landroid/content/res/ColorStateList;", "setDefaultTintList$paymentsheet_release", "(Landroid/content/res/ColorStateList;)V", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "animator", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "originalLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "defaultLabelColor", "Ljava/lang/Integer;", "externalLabel", "getExternalLabel$paymentsheet_release$annotations", "getExternalLabel$paymentsheet_release", "()Lcom/stripe/android/core/strings/ResolvableString;", "setExternalLabel$paymentsheet_release", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;", "getViewBinding$paymentsheet_release$annotations", "getViewBinding$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;", "lockVisible", "", "getLockVisible$paymentsheet_release", "()Z", "setLockVisible$paymentsheet_release", "(Z)V", "confirmedIcon", "Landroid/widget/ImageView;", "cornerRadius", "", "borderStrokeWidth", "borderStrokeColor", "finishedBackgroundColor", "finishedOnBackgroundColor", "setAppearanceConfiguration", "", "primaryButtonStyle", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "tintList", "setDefaultLabelColor", "color", "setLockIconDrawable", "drawable", "setIndicatorColor", "setConfirmedIconDrawable", "setBackgroundTintList", "getTextAttributeValue", "", "setLabel", "text", "onReadyState", "onStartProcessing", "onFinishProcessing", "onAnimationEnd", "Lkotlin/Function0;", "setEnabled", ViewProps.ENABLED, "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "updateUiState", "uiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "updateState", "updateLockVisibility", "canShow", "updateAlpha", "State", "UIState", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButton extends FrameLayout {
    public static final int $stable = 8;
    private final PrimaryButtonAnimator animator;
    private int borderStrokeColor;
    private float borderStrokeWidth;
    private final ImageView confirmedIcon;
    private float cornerRadius;
    private Integer defaultLabelColor;
    private ColorStateList defaultTintList;
    private ResolvableString externalLabel;
    private int finishedBackgroundColor;
    private int finishedOnBackgroundColor;
    private boolean lockVisible;
    private ResolvableString originalLabel;
    private State state;
    private final StripePrimaryButtonBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animator = new PrimaryButtonAnimator(context);
        StripePrimaryButtonBinding stripePrimaryButtonBindingInflate = StripePrimaryButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripePrimaryButtonBindingInflate, "inflate(...)");
        this.viewBinding = stripePrimaryButtonBindingInflate;
        this.lockVisible = true;
        ImageView confirmedIcon = stripePrimaryButtonBindingInflate.confirmedIcon;
        Intrinsics.checkNotNullExpressionValue(confirmedIcon, "confirmedIcon");
        this.confirmedIcon = confirmedIcon;
        this.cornerRadius = StripeThemeKt.m8738convertDpToPx3ABfNKs(context, Dp.m6117constructorimpl(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getShape().getCornerRadius()));
        this.borderStrokeWidth = StripeThemeKt.m8738convertDpToPx3ABfNKs(context, Dp.m6117constructorimpl(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getShape().getBorderStrokeWidth()));
        this.borderStrokeColor = StripeThemeKt.getBorderStrokeColor(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle(), context);
        this.finishedBackgroundColor = StripeThemeKt.getSuccessBackgroundColor(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle(), context);
        this.finishedOnBackgroundColor = StripeThemeKt.getOnSuccessBackgroundColor(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle(), context);
        stripePrimaryButtonBindingInflate.label.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        CharSequence textAttributeValue = getTextAttributeValue(attributeSet);
        if (textAttributeValue != null) {
            setLabel(ResolvableStringUtilsKt.getResolvableString(textAttributeValue.toString()));
        }
        setClickable(true);
        setEnabled(false);
    }

    /* renamed from: getDefaultTintList$paymentsheet_release, reason: from getter */
    public final ColorStateList getDefaultTintList() {
        return this.defaultTintList;
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.defaultTintList = colorStateList;
    }

    /* renamed from: getExternalLabel$paymentsheet_release, reason: from getter */
    public final ResolvableString getExternalLabel() {
        return this.externalLabel;
    }

    public final void setExternalLabel$paymentsheet_release(ResolvableString resolvableString) {
        this.externalLabel = resolvableString;
    }

    /* renamed from: getViewBinding$paymentsheet_release, reason: from getter */
    public final StripePrimaryButtonBinding getViewBinding() {
        return this.viewBinding;
    }

    /* renamed from: getLockVisible$paymentsheet_release, reason: from getter */
    public final boolean getLockVisible() {
        return this.lockVisible;
    }

    public final void setLockVisible$paymentsheet_release(boolean z) {
        this.lockVisible = z;
    }

    public final void setAppearanceConfiguration(PrimaryButtonStyle primaryButtonStyle, ColorStateList tintList) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cornerRadius = StripeThemeKt.m8738convertDpToPx3ABfNKs(context, Dp.m6117constructorimpl(primaryButtonStyle.getShape().getCornerRadius()));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.borderStrokeWidth = StripeThemeKt.m8738convertDpToPx3ABfNKs(context2, Dp.m6117constructorimpl(primaryButtonStyle.getShape().getBorderStrokeWidth()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.borderStrokeColor = StripeThemeKt.getBorderStrokeColor(primaryButtonStyle, context3);
        ImageView imageView = this.viewBinding.lockIcon;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(StripeThemeKt.getOnBackgroundColor(primaryButtonStyle, context4)));
        this.defaultTintList = tintList;
        setBackgroundTintList(tintList);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.finishedBackgroundColor = StripeThemeKt.getSuccessBackgroundColor(primaryButtonStyle, context5);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.finishedOnBackgroundColor = StripeThemeKt.getOnSuccessBackgroundColor(primaryButtonStyle, context6);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            layoutParams.height = (int) StripeThemeKt.m8738convertDpToPx3ABfNKs(context7, Dp.m6117constructorimpl(primaryButtonStyle.getShape().getHeight()));
        }
    }

    public final void setDefaultLabelColor(int color) {
        this.defaultLabelColor = Integer.valueOf(color);
    }

    public final void setLockIconDrawable(int drawable) {
        this.viewBinding.lockIcon.setImageResource(drawable);
    }

    public final void setIndicatorColor(int color) {
        this.viewBinding.confirmingIcon.setIndicatorColor(color);
    }

    public final void setConfirmedIconDrawable(int drawable) {
        this.viewBinding.confirmedIcon.setImageResource(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tintList) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.cornerRadius);
        gradientDrawable.setColor(tintList);
        gradientDrawable.setStroke((int) this.borderStrokeWidth, this.borderStrokeColor);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_paymentsheet_primary_button_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    private final CharSequence getTextAttributeValue(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CollectionsKt.toIntArray(CollectionsKt.listOf(Integer.valueOf(android.R.attr.text))), 0, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.recycle();
        return text;
    }

    private final void setLabel(final ResolvableString text) {
        this.externalLabel = text;
        if (text != null) {
            if (!(this.state instanceof State.StartProcessing)) {
                this.originalLabel = text;
            }
            this.viewBinding.label.setContent(ComposableLambdaKt.composableLambdaInstance(-47128405, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButton$setLabel$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-47128405, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.setLabel.<anonymous>.<anonymous> (PrimaryButton.kt:169)");
                        }
                        PrimaryButtonKt.LabelUI(ResolvableStringComposeUtilsKt.resolve(text, composer, 0), this.defaultLabelColor, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }));
        }
    }

    private final void onReadyState() throws Resources.NotFoundException {
        updateLockVisibility(true);
        setClickable(true);
        ResolvableString resolvableString = this.originalLabel;
        if (resolvableString != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewCompat.setStateDescription(this, resolvableString.resolve(context));
            setLabel(resolvableString);
        }
        ColorStateList colorStateList = this.defaultTintList;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView lockIcon = this.viewBinding.lockIcon;
        Intrinsics.checkNotNullExpressionValue(lockIcon, "lockIcon");
        lockIcon.setVisibility(this.lockVisible ? 0 : 8);
        CircularProgressIndicator confirmingIcon = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(8);
    }

    private final void onStartProcessing() {
        updateLockVisibility(false);
        CircularProgressIndicator confirmingIcon = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(confirmingIcon, "confirmingIcon");
        confirmingIcon.setVisibility(0);
        setClickable(false);
        ResolvableString resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_primary_button_processing);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewCompat.setStateDescription(this, resolvableString.resolve(context));
        setLabel(resolvableString);
    }

    private final void onFinishProcessing(final Function0<Unit> onAnimationEnd) throws Resources.NotFoundException {
        updateLockVisibility(false);
        setClickable(false);
        ResolvableString resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_successful_transaction_description);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewCompat.setStateDescription(this, resolvableString.resolve(context));
        setBackgroundTintList(ColorStateList.valueOf(this.finishedBackgroundColor));
        this.confirmedIcon.setImageTintList(ColorStateList.valueOf(this.finishedOnBackgroundColor));
        PrimaryButtonAnimator primaryButtonAnimator = this.animator;
        ComposeView label = this.viewBinding.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        primaryButtonAnimator.fadeOut$paymentsheet_release(label);
        PrimaryButtonAnimator primaryButtonAnimator2 = this.animator;
        CircularProgressIndicator confirmingIcon = this.viewBinding.confirmingIcon;
        Intrinsics.checkNotNullExpressionValue(confirmingIcon, "confirmingIcon");
        primaryButtonAnimator2.fadeOut$paymentsheet_release(confirmingIcon);
        this.animator.fadeIn$paymentsheet_release(this.confirmedIcon, getWidth(), new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButton$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrimaryButton.onFinishProcessing$lambda$5(onAnimationEnd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishProcessing$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        updateAlpha();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setClassName(Button.class.getName());
        }
        if (info != null) {
            info.setEnabled(isEnabled());
        }
    }

    public final void updateUiState(final UIState uiState) {
        PrimaryButton primaryButton = this;
        primaryButton.setVisibility(uiState != null ? 0 : 8);
        if (uiState != null) {
            this.lockVisible = uiState.getLockVisible();
            State state = this.state;
            if (!(state instanceof State.StartProcessing) && !(state instanceof State.FinishProcessing)) {
                setLabel(uiState.getLabel());
                ResolvableString label = uiState.getLabel();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ViewCompat.setStateDescription(primaryButton, label.resolve(context));
                updateLockVisibility(true);
            }
            setEnabled(uiState.getEnabled());
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButton$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrimaryButton.updateUiState$lambda$6(uiState, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUiState$lambda$6(UIState uIState, View view) {
        uIState.getOnClick().invoke();
    }

    public final void updateState(State state) throws Resources.NotFoundException {
        this.state = state;
        updateAlpha();
        if (state instanceof State.Ready) {
            onReadyState();
            return;
        }
        if (Intrinsics.areEqual(state, State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof State.FinishProcessing) {
            onFinishProcessing(((State.FinishProcessing) state).getOnComplete());
        } else if (state != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void updateLockVisibility(boolean canShow) {
        ImageView lockIcon = this.viewBinding.lockIcon;
        Intrinsics.checkNotNullExpressionValue(lockIcon, "lockIcon");
        lockIcon.setVisibility(this.lockVisible && canShow ? 0 : 8);
    }

    private final void updateAlpha() {
        for (View view : CollectionsKt.listOf((Object[]) new View[]{this.viewBinding.label, this.viewBinding.lockIcon})) {
            State state = this.state;
            view.setAlpha(((state == null || (state instanceof State.Ready)) && !isEnabled()) ? 0.5f : 1.0f);
        }
    }

    /* compiled from: PrimaryButton.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "", "isProcessing", "", "<init>", "(Z)V", "()Z", "Ready", "StartProcessing", "FinishProcessing", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;
        private final boolean isProcessing;

        public /* synthetic */ State(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private State(boolean z) {
            this.isProcessing = z;
        }

        /* renamed from: isProcessing, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        /* compiled from: PrimaryButton.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Ready extends State {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -745924076;
            }

            public String toString() {
                return "Ready";
            }

            private Ready() {
                super(false, null);
            }
        }

        /* compiled from: PrimaryButton.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StartProcessing extends State {
            public static final int $stable = 0;
            public static final StartProcessing INSTANCE = new StartProcessing();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartProcessing)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -198876090;
            }

            public String toString() {
                return "StartProcessing";
            }

            private StartProcessing() {
                super(true, null);
            }
        }

        /* compiled from: PrimaryButton.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "onComplete", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishProcessing extends State {
            public static final int $stable = 0;
            private final Function0<Unit> onComplete;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    function0 = finishProcessing.onComplete;
                }
                return finishProcessing.copy(function0);
            }

            public final Function0<Unit> component1() {
                return this.onComplete;
            }

            public final FinishProcessing copy(Function0<Unit> onComplete) {
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                return new FinishProcessing(onComplete);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishProcessing) && Intrinsics.areEqual(this.onComplete, ((FinishProcessing) other).onComplete);
            }

            public int hashCode() {
                return this.onComplete.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.onComplete + ")";
            }

            public final Function0<Unit> getOnComplete() {
                return this.onComplete;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishProcessing(Function0<Unit> onComplete) {
                super(true, null);
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                this.onComplete = onComplete;
            }
        }
    }

    /* compiled from: PrimaryButton.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "", "label", "Lcom/stripe/android/core/strings/ResolvableString;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", ViewProps.ENABLED, "", "lockVisible", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getEnabled", "()Z", "getLockVisible", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UIState {
        public static final int $stable = 8;
        private final boolean enabled;
        private final ResolvableString label;
        private final boolean lockVisible;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UIState copy$default(UIState uIState, ResolvableString resolvableString, Function0 function0, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = uIState.label;
            }
            if ((i & 2) != 0) {
                function0 = uIState.onClick;
            }
            if ((i & 4) != 0) {
                z = uIState.enabled;
            }
            if ((i & 8) != 0) {
                z2 = uIState.lockVisible;
            }
            return uIState.copy(resolvableString, function0, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getLabel() {
            return this.label;
        }

        public final Function0<Unit> component2() {
            return this.onClick;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getLockVisible() {
            return this.lockVisible;
        }

        public final UIState copy(ResolvableString label, Function0<Unit> onClick, boolean enabled, boolean lockVisible) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new UIState(label, onClick, enabled, lockVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UIState)) {
                return false;
            }
            UIState uIState = (UIState) other;
            return Intrinsics.areEqual(this.label, uIState.label) && Intrinsics.areEqual(this.onClick, uIState.onClick) && this.enabled == uIState.enabled && this.lockVisible == uIState.lockVisible;
        }

        public int hashCode() {
            return (((((this.label.hashCode() * 31) + this.onClick.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.lockVisible);
        }

        public String toString() {
            return "UIState(label=" + this.label + ", onClick=" + this.onClick + ", enabled=" + this.enabled + ", lockVisible=" + this.lockVisible + ")";
        }

        public UIState(ResolvableString label, Function0<Unit> onClick, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.label = label;
            this.onClick = onClick;
            this.enabled = z;
            this.lockVisible = z2;
        }

        public final ResolvableString getLabel() {
            return this.label;
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getLockVisible() {
            return this.lockVisible;
        }
    }
}
