package com.stripe.android.stripe3ds2.init.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.appcompat.R;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class StripeUiCustomization implements UiCustomization, Parcelable {
    public static final Parcelable.Creator<StripeUiCustomization> CREATOR = new Parcelable.Creator<StripeUiCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization createFromParcel(Parcel parcel) {
            return new StripeUiCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization[] newArray(int i) {
            return new StripeUiCustomization[i];
        }
    };
    private String mAccentColor;
    private final Map<String, ButtonCustomization> mCustomButtonTypeCustomization;
    private final Map<UiCustomization.ButtonType, ButtonCustomization> mDefaultButtonTypeCustomizations;
    private LabelCustomization mLabelCustomization;
    private TextBoxCustomization mTextBoxCustomization;
    private ToolbarCustomization mToolbarCustomization;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StripeUiCustomization() {
        this.mDefaultButtonTypeCustomizations = new EnumMap(UiCustomization.ButtonType.class);
        this.mCustomButtonTypeCustomization = new HashMap();
    }

    public static StripeUiCustomization createWithAppTheme(Activity activity) {
        return new StripeUiCustomization(activity);
    }

    private StripeUiCustomization(Activity activity) throws InvalidInputException {
        this();
        Context themeContext = getThemeContext(activity, R.attr.actionBarTheme);
        String themeColor = getThemeColor(activity, android.R.attr.colorPrimary);
        String themeColor2 = getThemeColor(activity, android.R.attr.colorPrimaryDark);
        String themeColor3 = getThemeColor(themeContext, android.R.attr.textColorPrimary);
        String themeColor4 = getThemeColor(activity, android.R.attr.textColor);
        String themeColor5 = getThemeColor(activity, android.R.attr.colorAccent);
        String themeColor6 = getThemeColor(activity, android.R.attr.textColorHint);
        this.mToolbarCustomization = new StripeToolbarCustomization();
        this.mLabelCustomization = new StripeLabelCustomization();
        StripeTextBoxCustomization stripeTextBoxCustomization = new StripeTextBoxCustomization();
        this.mTextBoxCustomization = stripeTextBoxCustomization;
        if (themeColor6 != null) {
            stripeTextBoxCustomization.setHintTextColor(themeColor6);
        }
        StripeButtonCustomization stripeButtonCustomization = new StripeButtonCustomization();
        StripeButtonCustomization stripeButtonCustomization2 = new StripeButtonCustomization();
        if (themeColor3 != null) {
            this.mToolbarCustomization.setTextColor(themeColor3);
            stripeButtonCustomization.setTextColor(themeColor3);
        }
        if (themeColor != null) {
            this.mToolbarCustomization.setBackgroundColor(themeColor);
        }
        if (themeColor2 != null) {
            this.mToolbarCustomization.setStatusBarColor(themeColor2);
        }
        if (themeColor4 != null) {
            this.mLabelCustomization.setTextColor(themeColor4);
            this.mLabelCustomization.setHeadingTextColor(themeColor4);
            stripeButtonCustomization2.setTextColor(themeColor4);
            this.mTextBoxCustomization.setTextColor(themeColor4);
        }
        if (themeColor5 != null) {
            setAccentColor(themeColor5);
            StripeButtonCustomization stripeButtonCustomization3 = new StripeButtonCustomization();
            stripeButtonCustomization3.setTextColor(themeColor5);
            setButtonCustomization(stripeButtonCustomization3, UiCustomization.ButtonType.RESEND);
            stripeButtonCustomization2.setBackgroundColor(themeColor5);
        }
        setButtonCustomization(stripeButtonCustomization, UiCustomization.ButtonType.CANCEL);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.NEXT);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.CONTINUE);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.SUBMIT);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.SELECT);
    }

    private String getThemeColor(Context context, int i) {
        int color;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            color = ContextCompat.getColor(context, typedValue.resourceId);
        } else {
            color = typedValue.data;
        }
        return CustomizeUtils.colorIntToHex(color);
    }

    private Context getThemeContext(Activity activity, int i) {
        TypedValue typedValue = new TypedValue();
        return activity.getTheme().resolveAttribute(i, typedValue, true) ? new ContextThemeWrapper(activity, typedValue.resourceId) : activity;
    }

    private StripeUiCustomization(Parcel parcel) {
        this.mAccentColor = parcel.readString();
        this.mToolbarCustomization = (ToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
        this.mLabelCustomization = (LabelCustomization) parcel.readParcelable(StripeLabelCustomization.class.getClassLoader());
        this.mTextBoxCustomization = (TextBoxCustomization) parcel.readParcelable(StripeTextBoxCustomization.class.getClassLoader());
        this.mDefaultButtonTypeCustomizations = new HashMap();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                ButtonCustomization buttonCustomization = (ButtonCustomization) BundleCompat.getParcelable(bundle, str, ButtonCustomization.class);
                if (buttonCustomization != null) {
                    this.mDefaultButtonTypeCustomizations.put(UiCustomization.ButtonType.valueOf(str), buttonCustomization);
                }
            }
        }
        this.mCustomButtonTypeCustomization = new HashMap();
        Bundle bundle2 = parcel.readBundle(getClass().getClassLoader());
        if (bundle2 != null) {
            for (String str2 : bundle2.keySet()) {
                ButtonCustomization buttonCustomization2 = (ButtonCustomization) BundleCompat.getParcelable(bundle2, str2, ButtonCustomization.class);
                if (buttonCustomization2 != null) {
                    this.mCustomButtonTypeCustomization.put(str2, buttonCustomization2);
                }
            }
        }
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setButtonCustomization(ButtonCustomization buttonCustomization, UiCustomization.ButtonType buttonType) throws InvalidInputException {
        this.mDefaultButtonTypeCustomizations.put(buttonType, buttonCustomization);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) throws InvalidInputException {
        this.mCustomButtonTypeCustomization.put(str, buttonCustomization);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) throws InvalidInputException {
        this.mToolbarCustomization = toolbarCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setLabelCustomization(LabelCustomization labelCustomization) throws InvalidInputException {
        this.mLabelCustomization = labelCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) throws InvalidInputException {
        this.mTextBoxCustomization = textBoxCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setAccentColor(String str) {
        this.mAccentColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ButtonCustomization getButtonCustomization(UiCustomization.ButtonType buttonType) throws InvalidInputException {
        return this.mDefaultButtonTypeCustomizations.get(buttonType);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ButtonCustomization getButtonCustomization(String str) throws InvalidInputException {
        return this.mCustomButtonTypeCustomization.get(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ToolbarCustomization getToolbarCustomization() {
        return this.mToolbarCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public LabelCustomization getLabelCustomization() {
        return this.mLabelCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public TextBoxCustomization getTextBoxCustomization() {
        return this.mTextBoxCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public String getAccentColor() {
        return this.mAccentColor;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StripeUiCustomization) && typedEquals((StripeUiCustomization) obj);
        }
        return true;
    }

    private boolean typedEquals(StripeUiCustomization stripeUiCustomization) {
        return ObjectUtils.equals(this.mToolbarCustomization, stripeUiCustomization.mToolbarCustomization) && ObjectUtils.equals(this.mAccentColor, stripeUiCustomization.mAccentColor) && ObjectUtils.equals(this.mLabelCustomization, stripeUiCustomization.mLabelCustomization) && ObjectUtils.equals(this.mTextBoxCustomization, stripeUiCustomization.mTextBoxCustomization) && ObjectUtils.equals(this.mDefaultButtonTypeCustomizations, stripeUiCustomization.mDefaultButtonTypeCustomizations) && ObjectUtils.equals(this.mCustomButtonTypeCustomization, stripeUiCustomization.mCustomButtonTypeCustomization);
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mToolbarCustomization, this.mAccentColor, this.mLabelCustomization, this.mTextBoxCustomization, this.mDefaultButtonTypeCustomizations, this.mCustomButtonTypeCustomization);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccentColor);
        parcel.writeParcelable((StripeToolbarCustomization) this.mToolbarCustomization, 0);
        parcel.writeParcelable((StripeLabelCustomization) this.mLabelCustomization, 0);
        parcel.writeParcelable((StripeTextBoxCustomization) this.mTextBoxCustomization, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry<UiCustomization.ButtonType, ButtonCustomization> entry : this.mDefaultButtonTypeCustomizations.entrySet()) {
            bundle.putParcelable(entry.getKey().name(), (StripeButtonCustomization) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, ButtonCustomization> entry2 : this.mCustomButtonTypeCustomization.entrySet()) {
            bundle2.putParcelable(entry2.getKey(), (StripeButtonCustomization) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }
}
