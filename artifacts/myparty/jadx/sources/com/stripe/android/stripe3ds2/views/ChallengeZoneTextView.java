package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneTextViewBinding;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeZoneTextView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "infoLabel", "Lcom/google/android/material/textfield/TextInputLayout;", "getInfoLabel$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "textEntryView", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextEntryView$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "userEntry", "", "getUserEntry", "()Ljava/lang/String;", "setTextEntryLabel", "", "label", "setText", "text", "setTextBoxCustomization", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeZoneTextView extends LinearLayout implements FormField {
    private final TextInputLayout infoLabel;
    private final TextInputEditText textEntryView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeChallengeZoneTextViewBinding stripeChallengeZoneTextViewBindingInflate = StripeChallengeZoneTextViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneTextViewBindingInflate, "inflate(...)");
        this.infoLabel = stripeChallengeZoneTextViewBindingInflate.label;
        this.textEntryView = stripeChallengeZoneTextViewBindingInflate.textEntry;
    }

    /* renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final TextInputLayout getInfoLabel() {
        return this.infoLabel;
    }

    /* renamed from: getTextEntryView$3ds2sdk_release, reason: from getter */
    public final TextInputEditText getTextEntryView() {
        return this.textEntryView;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        Editable text = this.textEntryView.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void setTextEntryLabel(String label) {
        this.infoLabel.setHint(label);
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.textEntryView.setText(text);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization == null) {
            return;
        }
        String textColor = textBoxCustomization.getTextColor();
        if (textColor != null) {
            this.textEntryView.setTextColor(Color.parseColor(textColor));
        }
        Integer numValueOf = Integer.valueOf(textBoxCustomization.getTextFontSize());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.textEntryView.setTextSize(2, numValueOf.intValue());
        }
        if (textBoxCustomization.getCornerRadius() >= 0) {
            float cornerRadius = textBoxCustomization.getCornerRadius();
            this.infoLabel.setBoxCornerRadii(cornerRadius, cornerRadius, cornerRadius, cornerRadius);
        }
        String borderColor = textBoxCustomization.getBorderColor();
        if (borderColor != null) {
            this.infoLabel.setBoxBackgroundMode(2);
            this.infoLabel.setBoxStrokeColor(Color.parseColor(borderColor));
        }
        String hintTextColor = textBoxCustomization.getHintTextColor();
        if (hintTextColor != null) {
            this.infoLabel.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(hintTextColor)));
        }
    }
}
