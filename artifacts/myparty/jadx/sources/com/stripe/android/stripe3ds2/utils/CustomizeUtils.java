package com.stripe.android.stripe3ds2.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.Customization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: CustomizeUtils.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011J\u001f\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0013\u001a\u00020\u0011H\u0007J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0015J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0007J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0007J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0007J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;", "", "<init>", "()V", "DEFAULT_DARKEN_FACTOR", "", "applyProgressBarColor", "", "progressBar", "Landroid/widget/ProgressBar;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "applyProgressBarColor$3ds2sdk_release", "setStatusBarColor", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "statusBarColor", "", "darken", "color", "factor", "darken$3ds2sdk_release", "colorIntToHex", "", "buildStyledText", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "text", "customization", "Lcom/stripe/android/stripe3ds2/init/ui/Customization;", "requireValidColor", "hexColor", "requireValidFontSize", ViewProps.FONT_SIZE, "requireValidDimension", "dimension", "requireValidString", TypedValues.Custom.S_STRING, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomizeUtils {
    private static final float DEFAULT_DARKEN_FACTOR = 0.8f;
    public static final CustomizeUtils INSTANCE = new CustomizeUtils();

    private CustomizeUtils() {
    }

    public final void applyProgressBarColor$3ds2sdk_release(ProgressBar progressBar, UiCustomization uiCustomization) {
        String accentColor;
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        if (uiCustomization == null || (accentColor = uiCustomization.getAccentColor()) == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(accentColor)));
    }

    public final void setStatusBarColor(AppCompatActivity activity, int statusBarColor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().setStatusBarColor(statusBarColor);
    }

    public final int darken$3ds2sdk_release(int color, float factor) {
        return Color.argb(Color.alpha(color), Math.min(Math.max((int) (Color.red(color) * factor), 0), 255), Math.min(Math.max((int) (Color.green(color) * factor), 0), 255), Math.min(Math.max((int) (Color.blue(color) * factor), 0), 255));
    }

    @JvmStatic
    public static final String colorIntToHex(int color) {
        int iAlpha = Color.alpha(color);
        int iBlue = Color.blue(color);
        int iGreen = Color.green(color);
        int iRed = Color.red(color);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iAlpha)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.ENGLISH, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iRed)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.ENGLISH, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iGreen)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String str4 = String.format(Locale.ENGLISH, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iBlue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        return "#" + str + str2 + str3 + str4;
    }

    public final SpannableString buildStyledText(Context context, String text, Customization customization) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String textColor = customization.getTextColor();
        if (textColor != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(textColor)), 0, spannableString.length(), 0);
        }
        Integer numValueOf = Integer.valueOf(customization.getTextFontSize());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, numValueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String textFontName = customization.getTextFontName();
        if (textFontName != null) {
            spannableString.setSpan(new TypefaceSpan(textFontName), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int darken$3ds2sdk_release(int color) {
        return darken$3ds2sdk_release(color, DEFAULT_DARKEN_FACTOR);
    }

    @JvmStatic
    public static final String requireValidColor(String hexColor) throws InvalidInputException {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        try {
            Result.Companion companion = Result.INSTANCE;
            Color.parseColor(hexColor);
            objM9118constructorimpl = Result.m9118constructorimpl(hexColor);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
            return (String) objM9118constructorimpl;
        }
        throw new InvalidInputException("Unable to parse color: " + hexColor, null, 2, null);
    }

    @JvmStatic
    public static final int requireValidFontSize(int fontSize) throws InvalidInputException {
        if (fontSize > 0) {
            return fontSize;
        }
        throw new InvalidInputException("Font size must be greater than 0", null, 2, null);
    }

    @JvmStatic
    public static final int requireValidDimension(int dimension) throws InvalidInputException {
        if (dimension >= 0) {
            return dimension;
        }
        throw new InvalidInputException("Dimension must be greater or equal to 0", null, 2, null);
    }

    @JvmStatic
    public static final String requireValidString(String string) throws InvalidInputException {
        Intrinsics.checkNotNullParameter(string, "string");
        if (StringsKt.isBlank(string)) {
            throw new InvalidInputException("String must not be null or empty", null, 2, null);
        }
        return string;
    }
}
