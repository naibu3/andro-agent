package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ChallengeZoneView.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\u001c\u00104\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\u001c\u00106\u001a\u00020/2\b\u00107\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\u0010\u00108\u001a\u00020/2\b\b\u0001\u00109\u001a\u00020\u0007J\u001c\u0010:\u001a\u00020/2\b\u0010;\u001a\u0004\u0018\u0001012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010>\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@J\u001c\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u0001012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010C\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u00010@J(\u0010D\u001a\u00020/2\b\u0010\u001a\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u000e\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020+J\u000e\u0010G\u001a\u00020/2\u0006\u0010 \u001a\u00020HR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006I"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoTextView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoLabelView", "getInfoLabelView$3ds2sdk_release", "submitButton", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getSubmitButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "resendButton", "getResendButton$3ds2sdk_release", "whitelistingLabel", "getWhitelistingLabel$3ds2sdk_release", "whitelistRadioGroup", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "challengeEntryView", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "whitelistYesRadioButton", "Landroid/widget/RadioButton;", "getWhitelistYesRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistNoRadioButton", "getWhitelistNoRadioButton$3ds2sdk_release", "whitelistingSelection", "", "getWhitelistingSelection$3ds2sdk_release", "()Z", "setInfoHeaderText", "", "headerText", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "setInfoText", "infoText", "setInfoLabel", "infoLabel", "setInfoTextIndicator", "indicatorResId", "setSubmitButton", "submitButtonLabel", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "setSubmitButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setResendButtonLabel", "resendButtonLabel", "setResendButtonClickListener", "setWhitelistingLabel", "setWhitelistChecked", "checked", "setChallengeEntryView", "Landroid/view/View;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeZoneView extends LinearLayout {
    private final FrameLayout challengeEntryView;
    private final ThreeDS2HeaderTextView infoHeader;
    private final ThreeDS2TextView infoLabelView;
    private final ThreeDS2TextView infoTextView;
    private final ThreeDS2Button resendButton;
    private final ThreeDS2Button submitButton;
    private final RadioButton whitelistNoRadioButton;
    private final RadioGroup whitelistRadioGroup;
    private final RadioButton whitelistYesRadioButton;
    private final ThreeDS2TextView whitelistingLabel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeChallengeZoneViewBinding stripeChallengeZoneViewBindingInflate = StripeChallengeZoneViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneViewBindingInflate, "inflate(...)");
        this.infoHeader = stripeChallengeZoneViewBindingInflate.czvHeader;
        this.infoTextView = stripeChallengeZoneViewBindingInflate.czvInfo;
        this.infoLabelView = stripeChallengeZoneViewBindingInflate.czvInfoLabel;
        this.submitButton = stripeChallengeZoneViewBindingInflate.czvSubmitButton;
        this.resendButton = stripeChallengeZoneViewBindingInflate.czvResendButton;
        this.whitelistingLabel = stripeChallengeZoneViewBindingInflate.czvWhitelistingLabel;
        this.whitelistRadioGroup = stripeChallengeZoneViewBindingInflate.czvWhitelistRadioGroup;
        this.challengeEntryView = stripeChallengeZoneViewBindingInflate.czvEntryView;
        this.whitelistYesRadioButton = stripeChallengeZoneViewBindingInflate.czvWhitelistYesButton;
        this.whitelistNoRadioButton = stripeChallengeZoneViewBindingInflate.czvWhitelistNoButton;
    }

    /* renamed from: getInfoHeader$3ds2sdk_release, reason: from getter */
    public final ThreeDS2HeaderTextView getInfoHeader() {
        return this.infoHeader;
    }

    /* renamed from: getInfoTextView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoTextView() {
        return this.infoTextView;
    }

    /* renamed from: getInfoLabelView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabelView() {
        return this.infoLabelView;
    }

    /* renamed from: getSubmitButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: getResendButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getResendButton() {
        return this.resendButton;
    }

    /* renamed from: getWhitelistingLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhitelistingLabel() {
        return this.whitelistingLabel;
    }

    /* renamed from: getWhitelistRadioGroup$3ds2sdk_release, reason: from getter */
    public final RadioGroup getWhitelistRadioGroup() {
        return this.whitelistRadioGroup;
    }

    /* renamed from: getChallengeEntryView$3ds2sdk_release, reason: from getter */
    public final FrameLayout getChallengeEntryView() {
        return this.challengeEntryView;
    }

    /* renamed from: getWhitelistYesRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistYesRadioButton() {
        return this.whitelistYesRadioButton;
    }

    /* renamed from: getWhitelistNoRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistNoRadioButton() {
        return this.whitelistNoRadioButton;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button;
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoHeaderText(str, labelCustomization);
    }

    public final void setInfoHeaderText(String headerText, LabelCustomization labelCustomization) {
        String str = headerText;
        if (str == null || StringsKt.isBlank(str)) {
            this.infoHeader.setVisibility(8);
        } else {
            this.infoHeader.setText(headerText, labelCustomization);
        }
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoText(str, labelCustomization);
    }

    public final void setInfoText(String infoText, LabelCustomization labelCustomization) {
        String str = infoText;
        if (str == null || StringsKt.isBlank(str)) {
            this.infoTextView.setVisibility(8);
        } else {
            this.infoTextView.setText(infoText, labelCustomization);
        }
    }

    public static /* synthetic */ void setInfoLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoLabel(str, labelCustomization);
    }

    public final void setInfoLabel(String infoLabel, LabelCustomization labelCustomization) {
        String str = infoLabel;
        if (str == null || StringsKt.isBlank(str)) {
            this.infoLabelView.setVisibility(8);
        } else {
            this.infoLabelView.setText(infoLabel, labelCustomization);
        }
    }

    public final void setInfoTextIndicator(int indicatorResId) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(indicatorResId, 0, 0, 0);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setSubmitButton(str, buttonCustomization);
    }

    public final void setSubmitButton(String submitButtonLabel, ButtonCustomization buttonCustomization) {
        String str = submitButtonLabel;
        if (str == null || StringsKt.isBlank(str)) {
            this.submitButton.setVisibility(8);
        } else {
            this.submitButton.setText(str);
            this.submitButton.setButtonCustomization(buttonCustomization);
        }
    }

    public final void setSubmitButtonClickListener(View.OnClickListener listener) {
        this.submitButton.setOnClickListener(listener);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setResendButtonLabel(str, buttonCustomization);
    }

    public final void setResendButtonLabel(String resendButtonLabel, ButtonCustomization buttonCustomization) {
        String str = resendButtonLabel;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.resendButton.setVisibility(0);
        this.resendButton.setText(str);
        this.resendButton.setButtonCustomization(buttonCustomization);
    }

    public final void setResendButtonClickListener(View.OnClickListener listener) {
        this.resendButton.setOnClickListener(listener);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        if ((i & 4) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setWhitelistingLabel(str, labelCustomization, buttonCustomization);
    }

    public final void setWhitelistingLabel(String whitelistingLabel, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization) {
        String str = whitelistingLabel;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.whitelistingLabel.setText(whitelistingLabel, labelCustomization);
        if (buttonCustomization != null) {
            IntRange intRangeUntil = RangesKt.until(0, this.whitelistRadioGroup.getChildCount());
            ArrayList<RadioButton> arrayList = new ArrayList();
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                View childAt = this.whitelistRadioGroup.getChildAt(((IntIterator) it).nextInt());
                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                if (radioButton != null) {
                    arrayList.add(radioButton);
                }
            }
            for (RadioButton radioButton2 : arrayList) {
                String backgroundColor = buttonCustomization.getBackgroundColor();
                if (backgroundColor != null && !StringsKt.isBlank(backgroundColor)) {
                    CompoundButtonCompat.setButtonTintList(radioButton2, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
                }
                String textColor = buttonCustomization.getTextColor();
                if (textColor != null && !StringsKt.isBlank(textColor)) {
                    radioButton2.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
                }
            }
        }
        this.whitelistingLabel.setVisibility(0);
        this.whitelistRadioGroup.setVisibility(0);
    }

    public final void setWhitelistChecked(boolean checked) {
        this.whitelistYesRadioButton.setChecked(checked);
        this.whitelistNoRadioButton.setChecked(!checked);
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        Intrinsics.checkNotNullParameter(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }
}
