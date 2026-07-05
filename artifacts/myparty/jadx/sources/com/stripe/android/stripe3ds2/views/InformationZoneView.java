package com.stripe.android.stripe3ds2.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.imagepipeline.common.RotationOptions;
import com.stripe.android.stripe3ds2.databinding.StripeInformationZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InformationZoneView.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u000108J&\u00109\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u0001052\b\u0010;\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u000108J \u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020>H\u0002J\u0006\u0010B\u001a\u000203R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011R\u001c\u0010\"\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u000f\u001a\u0004\b$\u0010\u0011R\u001c\u0010%\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010\u001eR\u001e\u0010+\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0012\u00100\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;", "whyLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "()V", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "whyText", "getWhyText$3ds2sdk_release$annotations", "getWhyText$3ds2sdk_release", "whyContainer", "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "whyArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "expandLabel", "getExpandLabel$3ds2sdk_release$annotations", "getExpandLabel$3ds2sdk_release", "expandText", "getExpandText$3ds2sdk_release$annotations", "getExpandText$3ds2sdk_release", "expandContainer", "getExpandContainer$3ds2sdk_release$annotations", "getExpandContainer$3ds2sdk_release", "expandArrow", "getExpandArrow$3ds2sdk_release$annotations", "getExpandArrow$3ds2sdk_release", "toggleColor", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "defaultColor", "animationDuration", "setWhyInfo", "", "whyInfoLabel", "", "whyInfoText", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "setExpandInfo", "expandInfoLabel", "expandInfoText", "toggleView", "arrow", "Landroid/view/View;", "label", "Landroid/widget/TextView;", "detailsView", "expandViews", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InformationZoneView extends FrameLayout {
    private final int animationDuration;
    private int defaultColor;
    private final AppCompatImageView expandArrow;
    private final LinearLayout expandContainer;
    private final ThreeDS2TextView expandLabel;
    private final ThreeDS2TextView expandText;
    private int toggleColor;
    private final StripeInformationZoneViewBinding viewBinding;
    private final AppCompatImageView whyArrow;
    private final LinearLayout whyContainer;
    private final ThreeDS2TextView whyLabel;
    private final ThreeDS2TextView whyText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeInformationZoneViewBinding stripeInformationZoneViewBindingInflate = StripeInformationZoneViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeInformationZoneViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeInformationZoneViewBindingInflate;
        ThreeDS2TextView whyLabel = stripeInformationZoneViewBindingInflate.whyLabel;
        Intrinsics.checkNotNullExpressionValue(whyLabel, "whyLabel");
        this.whyLabel = whyLabel;
        ThreeDS2TextView whyText = stripeInformationZoneViewBindingInflate.whyText;
        Intrinsics.checkNotNullExpressionValue(whyText, "whyText");
        this.whyText = whyText;
        LinearLayout whyContainer = stripeInformationZoneViewBindingInflate.whyContainer;
        Intrinsics.checkNotNullExpressionValue(whyContainer, "whyContainer");
        this.whyContainer = whyContainer;
        AppCompatImageView whyArrow = stripeInformationZoneViewBindingInflate.whyArrow;
        Intrinsics.checkNotNullExpressionValue(whyArrow, "whyArrow");
        this.whyArrow = whyArrow;
        ThreeDS2TextView expandLabel = stripeInformationZoneViewBindingInflate.expandLabel;
        Intrinsics.checkNotNullExpressionValue(expandLabel, "expandLabel");
        this.expandLabel = expandLabel;
        ThreeDS2TextView expandText = stripeInformationZoneViewBindingInflate.expandText;
        Intrinsics.checkNotNullExpressionValue(expandText, "expandText");
        this.expandText = expandText;
        LinearLayout expandContainer = stripeInformationZoneViewBindingInflate.expandContainer;
        Intrinsics.checkNotNullExpressionValue(expandContainer, "expandContainer");
        this.expandContainer = expandContainer;
        AppCompatImageView expandArrow = stripeInformationZoneViewBindingInflate.expandArrow;
        Intrinsics.checkNotNullExpressionValue(expandArrow, "expandArrow");
        this.expandArrow = expandArrow;
        this.animationDuration = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView._init_$lambda$0(this.f$0, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView._init_$lambda$1(this.f$0, view);
            }
        });
    }

    /* renamed from: getWhyLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyLabel() {
        return this.whyLabel;
    }

    /* renamed from: getWhyText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyText() {
        return this.whyText;
    }

    /* renamed from: getWhyContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getWhyContainer() {
        return this.whyContainer;
    }

    /* renamed from: getWhyArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getWhyArrow() {
        return this.whyArrow;
    }

    /* renamed from: getExpandLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandLabel() {
        return this.expandLabel;
    }

    /* renamed from: getExpandText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandText() {
        return this.expandText;
    }

    /* renamed from: getExpandContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getExpandContainer() {
        return this.expandContainer;
    }

    /* renamed from: getExpandArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getExpandArrow() {
        return this.expandArrow;
    }

    /* renamed from: getToggleColor$3ds2sdk_release, reason: from getter */
    public final int getToggleColor() {
        return this.toggleColor;
    }

    public final void setToggleColor$3ds2sdk_release(int i) {
        this.toggleColor = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(InformationZoneView informationZoneView, View view) {
        informationZoneView.toggleView(informationZoneView.whyArrow, informationZoneView.whyLabel, informationZoneView.whyText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(InformationZoneView informationZoneView, View view) {
        informationZoneView.toggleView(informationZoneView.expandArrow, informationZoneView.expandLabel, informationZoneView.expandText);
    }

    public static /* synthetic */ void setWhyInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setWhyInfo(str, str2, labelCustomization);
    }

    public final void setWhyInfo(String whyInfoLabel, String whyInfoText, LabelCustomization labelCustomization) {
        String str = whyInfoLabel;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.whyLabel.setText(whyInfoLabel, labelCustomization);
        this.whyContainer.setVisibility(0);
        this.whyText.setText(whyInfoText, labelCustomization);
    }

    public static /* synthetic */ void setExpandInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setExpandInfo(str, str2, labelCustomization);
    }

    public final void setExpandInfo(String expandInfoLabel, String expandInfoText, LabelCustomization labelCustomization) {
        String str = expandInfoLabel;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.expandLabel.setText(expandInfoLabel, labelCustomization);
        this.expandContainer.setVisibility(0);
        this.expandText.setText(expandInfoText, labelCustomization);
    }

    private final void toggleView(View arrow, TextView label, final View detailsView) {
        boolean z = detailsView.getVisibility() == 8;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(arrow, "rotation", z ? RotationOptions.ROTATE_180 : 0);
        objectAnimatorOfFloat.setDuration(this.animationDuration);
        objectAnimatorOfFloat.start();
        label.setEnabled(z);
        arrow.setEnabled(z);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                this.defaultColor = label.getTextColors().getDefaultColor();
            }
            label.setTextColor(z ? this.toggleColor : this.defaultColor);
        }
        detailsView.setVisibility(z ? 0 : 8);
        if (z) {
            detailsView.postDelayed(new Runnable() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.toggleView$lambda$2(detailsView);
                }
            }, this.animationDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleView$lambda$2(View view) {
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        view.getHitRect(rect);
        view.requestRectangleOnScreen(rect, false);
    }

    public final void expandViews() {
        this.expandArrow.setRotation(180.0f);
        this.whyArrow.setRotation(180.0f);
        this.expandText.setVisibility(0);
        this.whyText.setVisibility(0);
    }
}
