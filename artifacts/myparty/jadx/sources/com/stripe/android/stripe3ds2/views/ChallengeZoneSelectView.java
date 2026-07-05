package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.CompoundButtonCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneMultiSelectViewBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneSingleSelectViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ChallengeZoneSelectView.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ'\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\nH\u0000¢\u0006\u0002\b.J \u0010/\u001a\u0002002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f2\b\u0010+\u001a\u0004\u0018\u00010,J\u001a\u00102\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010\u001b2\b\u00104\u001a\u0004\u0018\u000105J\u000e\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\bJ\b\u00108\u001a\u000209H\u0014J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u000209H\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001f8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006="}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "isSingleSelectMode", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "()Z", "infoLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "selectGroup", "Landroid/widget/LinearLayout;", "getSelectGroup$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "buttonBottomMargin", "buttonLabelPadding", "buttonOffsetMargin", "buttonMinHeight", "userEntry", "", "getUserEntry", "()Ljava/lang/String;", "checkBoxes", "", "Landroid/widget/CheckBox;", "getCheckBoxes", "()Ljava/util/List;", "selectedOptions", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "getSelectedOptions", "selectedIndexes", "getSelectedIndexes$3ds2sdk_release", "buildButton", "Landroid/widget/CompoundButton;", "option", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "lastButton", "buildButton$3ds2sdk_release", "setChallengeSelectOptions", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "setTextEntryLabel", "label", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "selectOption", "index", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeZoneSelectView extends FrameLayout implements FormField {
    private static final Companion Companion = new Companion(null);
    private static final String STATE_SELECTED_INDEXED = "state_selected_indexes";
    private static final String STATE_SUPER = "state_super";
    private final int buttonBottomMargin;
    private final int buttonLabelPadding;
    private final int buttonMinHeight;
    private final int buttonOffsetMargin;
    private final ThreeDS2TextView infoLabel;
    private final boolean isSingleSelectMode;
    private final LinearLayout selectGroup;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* renamed from: isSingleSelectMode, reason: from getter */
    public final boolean getIsSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSingleSelectMode = z;
        if (getId() == -1) {
            setId(R.id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        if (z) {
            StripeChallengeZoneSingleSelectViewBinding stripeChallengeZoneSingleSelectViewBindingInflate = StripeChallengeZoneSingleSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
            Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneSingleSelectViewBindingInflate, "inflate(...)");
            this.infoLabel = stripeChallengeZoneSingleSelectViewBindingInflate.label;
            this.selectGroup = stripeChallengeZoneSingleSelectViewBindingInflate.selectGroup;
            return;
        }
        StripeChallengeZoneMultiSelectViewBinding stripeChallengeZoneMultiSelectViewBindingInflate = StripeChallengeZoneMultiSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneMultiSelectViewBindingInflate, "inflate(...)");
        this.infoLabel = stripeChallengeZoneMultiSelectViewBindingInflate.label;
        this.selectGroup = stripeChallengeZoneMultiSelectViewBindingInflate.selectGroup;
    }

    /* renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoLabel() {
        return this.infoLabel;
    }

    /* renamed from: getSelectGroup$3ds2sdk_release, reason: from getter */
    public final LinearLayout getSelectGroup() {
        return this.selectGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_userEntry_$lambda$0(ChallengeResponseData.ChallengeSelectOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        return CollectionsKt.joinToString$default(getSelectedOptions(), ",", null, null, 0, null, new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeZoneSelectView._get_userEntry_$lambda$0((ChallengeResponseData.ChallengeSelectOption) obj);
            }
        }, 30, null);
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.isSingleSelectMode) {
            return null;
        }
        IntRange intRangeUntil = RangesKt.until(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            View childAt = this.selectGroup.getChildAt(((IntIterator) it).nextInt());
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.selectGroup.getChildAt(((Number) it.next()).intValue()).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        IntRange intRangeUntil = RangesKt.until(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            View childAt = this.selectGroup.getChildAt(iNextInt);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer numValueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(iNextInt) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        ArrayList arrayList2 = arrayList;
        return CollectionsKt.take(arrayList2, this.isSingleSelectMode ? 1 : arrayList2.size());
    }

    public final CompoundButton buildButton$3ds2sdk_release(ChallengeResponseData.ChallengeSelectOption option, ButtonCustomization buttonCustomization, boolean lastButton) {
        MaterialCheckBox materialCheckBox;
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.isSingleSelectMode) {
            materialCheckBox = new MaterialRadioButton(getContext());
        } else {
            materialCheckBox = new MaterialCheckBox(getContext());
        }
        if (buttonCustomization != null) {
            String backgroundColor = buttonCustomization.getBackgroundColor();
            if (backgroundColor != null && !StringsKt.isBlank(backgroundColor)) {
                CompoundButtonCompat.setButtonTintList(materialCheckBox, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
            }
            String textColor = buttonCustomization.getTextColor();
            if (textColor != null && !StringsKt.isBlank(textColor)) {
                materialCheckBox.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
            }
        }
        materialCheckBox.setId(View.generateViewId());
        materialCheckBox.setTag(option);
        materialCheckBox.setText(option.getText());
        materialCheckBox.setPadding(this.buttonLabelPadding, materialCheckBox.getPaddingTop(), materialCheckBox.getPaddingRight(), materialCheckBox.getPaddingBottom());
        materialCheckBox.setMinimumHeight(this.buttonMinHeight);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!lastButton) {
            layoutParams.bottomMargin = this.buttonBottomMargin;
        }
        layoutParams.leftMargin = this.buttonOffsetMargin;
        materialCheckBox.setLayoutParams(layoutParams);
        return materialCheckBox;
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> options, ButtonCustomization buttonCustomization) {
        if (options != null) {
            int size = options.size();
            Iterator<Integer> it = RangesKt.until(0, size).iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = options.get(iNextInt);
                boolean z = true;
                if (iNextInt != size - 1) {
                    z = false;
                }
                this.selectGroup.addView(buildButton$3ds2sdk_release(challengeSelectOption, buttonCustomization, z));
            }
        }
    }

    public final void setTextEntryLabel(String label, LabelCustomization labelCustomization) {
        String str = label;
        if (str == null || StringsKt.isBlank(str)) {
            this.infoLabel.setVisibility(8);
        } else {
            this.infoLabel.setText(label, labelCustomization);
        }
    }

    public final void selectOption(int index) {
        View childAt = this.selectGroup.getChildAt(index);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(TuplesKt.to(STATE_SUPER, super.onSaveInstanceState()), TuplesKt.to(STATE_SELECTED_INDEXED, new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, STATE_SUPER, Parcelable.class));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(STATE_SELECTED_INDEXED);
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    Intrinsics.checkNotNull(num);
                    selectOption(num.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: ChallengeZoneSelectView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;", "", "<init>", "()V", "STATE_SELECTED_INDEXED", "", "STATE_SUPER", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
