package com.reactnativestripesdk;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.NativeProtocol;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeThemeDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: PaymentSheetAppearance.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\nH\u0002\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000fH\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003\u001a\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0003\u001a*\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nH\u0002\u001a!\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0002\u0010&\u001a\"\u0010'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0002\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u00032\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\fH\u0002\u001a\"\u0010+\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\f2\u0006\u0010)\u001a\u00020,H\u0002\u001a!\u0010-\u001a\u0004\u0018\u00010(2\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0002\u0010.\u001a3\u0010/\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u00100¨\u00061"}, d2 = {"buildPaymentSheetAppearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "userParams", "Landroid/os/Bundle;", "context", "Landroid/content/Context;", "buildTypography", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "fontParams", "colorFromHexOrDefault", "", "hexString", "", Constants.COLLATION_DEFAULT, "buildColors", "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "colorParams", "buildShapes", "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "shapeParams", "buildPrimaryButton", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", NativeProtocol.WEB_DIALOG_PARAMS, "buildPrimaryButtonColors", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "buildEmbeddedAppearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "embeddedParams", "defaultColorsBundle", "buildFormInsets", "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "insetParams", "dynamicColorFromParams", SDKConstants.PARAM_KEY, "defaultColor", "getDoubleOrNull", "", "bundle", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "getFloatOr", "", "defaultValue", "getBundleOrNull", "getBooleanOr", "", "getFloatOrNull", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "getFontResId", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/Integer;", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentSheetAppearanceKt {
    public static final PaymentSheet.Appearance buildPaymentSheetAppearance(Bundle bundle, Context context) {
        Bundle bundle2;
        Bundle bundle3;
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle4 = bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.COLORS) : null;
        if (bundle4 == null || (bundle2 = bundle4.getBundle(PaymentSheetAppearanceKeys.LIGHT)) == null) {
            bundle2 = bundle4;
        }
        if (bundle4 != null && (bundle3 = bundle4.getBundle(PaymentSheetAppearanceKeys.DARK)) != null) {
            bundle4 = bundle3;
        }
        Bundle bundle5 = bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.FORM_INSETS) : null;
        PaymentSheet.Appearance.Embedded embeddedBuildEmbeddedAppearance = buildEmbeddedAppearance(bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.EMBEDDED_PAYMENT_ELEMENT) : null, bundle2, context);
        if (embeddedBuildEmbeddedAppearance != null) {
            return new PaymentSheet.Appearance(buildColors(bundle2, PaymentSheet.Colors.INSTANCE.getDefaultLight()), buildColors(bundle4, PaymentSheet.Colors.INSTANCE.getDefaultDark()), buildShapes(bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.SHAPES) : null), buildTypography(bundle != null ? bundle.getBundle("font") : null, context), buildPrimaryButton(bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.PRIMARY_BUTTON) : null, context), embeddedBuildEmbeddedAppearance, buildFormInsets(bundle5));
        }
        return new PaymentSheet.Appearance(buildColors(bundle2, PaymentSheet.Colors.INSTANCE.getDefaultLight()), buildColors(bundle4, PaymentSheet.Colors.INSTANCE.getDefaultDark()), buildShapes(bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.SHAPES) : null), buildTypography(bundle != null ? bundle.getBundle("font") : null, context), buildPrimaryButton(bundle != null ? bundle.getBundle(PaymentSheetAppearanceKeys.PRIMARY_BUTTON) : null, context), null, buildFormInsets(bundle5), 32, null);
    }

    private static final PaymentSheet.Typography buildTypography(Bundle bundle, Context context) throws PaymentSheetAppearanceException {
        Double doubleOrNull = getDoubleOrNull(bundle, PaymentSheetAppearanceKeys.SCALE);
        return PaymentSheet.Typography.copy$default(PaymentSheet.Typography.INSTANCE.getDefault(), doubleOrNull != null ? (float) doubleOrNull.doubleValue() : PaymentSheet.Typography.INSTANCE.getDefault().getSizeScaleFactor(), getFontResId(bundle, PaymentSheetAppearanceKeys.FAMILY, PaymentSheet.Typography.INSTANCE.getDefault().getFontResId(), context), null, 4, null);
    }

    private static final int colorFromHexOrDefault(String str, int i) throws PaymentSheetAppearanceException {
        String string;
        String strReplace$default;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null || (strReplace$default = StringsKt.replace$default(string, "#", "", false, 4, (Object) null)) == null) {
            return i;
        }
        if (strReplace$default.length() == 6 || strReplace$default.length() == 8) {
            return Color.parseColor("#" + strReplace$default);
        }
        throw new PaymentSheetAppearanceException("Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: " + strReplace$default);
    }

    private static final PaymentSheet.Colors buildColors(Bundle bundle, PaymentSheet.Colors colors) {
        return bundle == null ? colors : colors.copy(colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.PRIMARY), colors.getPrimary()), colorFromHexOrDefault(bundle.getString("background"), colors.getSurface()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.COMPONENT_BACKGROUND), colors.getComponent()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.COMPONENT_BORDER), colors.getComponentBorder()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.COMPONENT_DIVIDER), colors.getComponentDivider()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.COMPONENT_TEXT), colors.getOnComponent()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.PRIMARY_TEXT), colors.getOnSurface()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.SECONDARY_TEXT), colors.getSubtitle()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.PLACEHOLDER_TEXT), colors.getPlaceholderText()), colorFromHexOrDefault(bundle.getString(PaymentSheetAppearanceKeys.ICON), colors.getAppBarIcon()), colorFromHexOrDefault(bundle.getString("error"), colors.getError()));
    }

    private static final PaymentSheet.Shapes buildShapes(Bundle bundle) {
        return PaymentSheet.Shapes.copy$default(PaymentSheet.Shapes.INSTANCE.getDefault(), getFloatOr(bundle, "borderRadius", PaymentSheet.Shapes.INSTANCE.getDefault().getCornerRadiusDp()), getFloatOr(bundle, "borderWidth", PaymentSheet.Shapes.INSTANCE.getDefault().getBorderStrokeWidthDp()), 0.0f, 4, null);
    }

    private static final PaymentSheet.PrimaryButton buildPrimaryButton(Bundle bundle, Context context) throws PaymentSheetAppearanceException {
        if (bundle == null) {
            return new PaymentSheet.PrimaryButton(null, null, null, null, 15, null);
        }
        Bundle bundle2 = bundle.getBundle("font");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        Bundle bundle3 = bundle.getBundle(PaymentSheetAppearanceKeys.SHAPES);
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        Bundle bundle4 = bundle.getBundle(PaymentSheetAppearanceKeys.COLORS);
        if (bundle4 == null) {
            bundle4 = Bundle.EMPTY;
        }
        Bundle bundle5 = bundle4.getBundle(PaymentSheetAppearanceKeys.LIGHT);
        if (bundle5 == null) {
            bundle5 = bundle4;
        }
        Bundle bundle6 = bundle4.getBundle(PaymentSheetAppearanceKeys.DARK);
        if (bundle6 != null) {
            bundle4 = bundle6;
        }
        Intrinsics.checkNotNull(bundle5);
        PaymentSheet.PrimaryButtonColors primaryButtonColorsBuildPrimaryButtonColors = buildPrimaryButtonColors(bundle5, PaymentSheet.PrimaryButtonColors.INSTANCE.getDefaultLight(), context);
        Intrinsics.checkNotNull(bundle4);
        return new PaymentSheet.PrimaryButton(primaryButtonColorsBuildPrimaryButtonColors, buildPrimaryButtonColors(bundle4, PaymentSheet.PrimaryButtonColors.INSTANCE.getDefaultDark(), context), new PaymentSheet.PrimaryButtonShape(getFloatOrNull(bundle3, "borderRadius"), getFloatOrNull(bundle3, "borderWidth"), getFloatOrNull(bundle3, "height")), new PaymentSheet.PrimaryButtonTypography(getFontResId(bundle2, PaymentSheetAppearanceKeys.FAMILY, null, context), null, 2, null));
    }

    private static final PaymentSheet.PrimaryButtonColors buildPrimaryButtonColors(Bundle bundle, PaymentSheet.PrimaryButtonColors primaryButtonColors, Context context) throws PaymentSheetAppearanceException {
        Integer numValueOf;
        String string;
        String strReplace$default;
        String string2 = bundle.getString("background");
        if (string2 == null || (string = StringsKt.trim((CharSequence) string2).toString()) == null || (strReplace$default = StringsKt.replace$default(string, "#", "", false, 4, (Object) null)) == null) {
            numValueOf = null;
        } else if (strReplace$default.length() == 6 || strReplace$default.length() == 8) {
            numValueOf = Integer.valueOf(Color.parseColor("#" + strReplace$default));
        } else {
            throw new PaymentSheetAppearanceException("Failed to set Payment Sheet appearance. Expected hex string of length 6 or 8, but received: " + strReplace$default);
        }
        return new PaymentSheet.PrimaryButtonColors(numValueOf, colorFromHexOrDefault(bundle.getString("text"), primaryButtonColors.getOnBackground()), colorFromHexOrDefault(bundle.getString("border"), primaryButtonColors.getBorder()), dynamicColorFromParams(context, bundle, PaymentSheetAppearanceKeys.SUCCESS_BACKGROUND, primaryButtonColors.getSuccessBackgroundColor()), dynamicColorFromParams(context, bundle, PaymentSheetAppearanceKeys.SUCCESS_TEXT, primaryButtonColors.getOnSuccessBackgroundColor()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final PaymentSheet.Appearance.Embedded buildEmbeddedAppearance(Bundle bundle, Bundle bundle2, Context context) throws PaymentSheetAppearanceException {
        Bundle bundleOrNull;
        PaymentSheet.Appearance.Embedded embedded;
        PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure flatWithDisclosureBuild;
        if (bundle == null || (bundleOrNull = getBundleOrNull(bundle, PaymentSheetAppearanceKeys.ROW)) == null) {
            return null;
        }
        PaymentSheet.Colors colorsBuildColors = buildColors(bundle2, PaymentSheet.Colors.INSTANCE.getDefaultLight());
        String string = bundleOrNull.getString("style", "flatWithRadio");
        float floatOr = getFloatOr(bundleOrNull, PaymentSheetAppearanceKeys.ADDITIONAL_INSETS, 6.0f);
        if (string != null) {
            embedded = null;
            switch (string.hashCode()) {
                case -1436484820:
                    if (string.equals("flatWithDisclosure")) {
                        Bundle bundleOrNull2 = getBundleOrNull(bundleOrNull, PaymentSheetAppearanceKeys.FLAT);
                        Bundle bundleOrNull3 = getBundleOrNull(bundleOrNull2, PaymentSheetAppearanceKeys.DISCLOSURE);
                        Bundle bundleOrNull4 = getBundleOrNull(bundleOrNull2, PaymentSheetAppearanceKeys.SEPARATOR_INSETS);
                        float floatOr2 = getFloatOr(bundleOrNull2, PaymentSheetAppearanceKeys.SEPARATOR_THICKNESS, 1.0f);
                        float floatOr3 = getFloatOr(bundleOrNull4, "left", 0.0f);
                        float floatOr4 = getFloatOr(bundleOrNull4, "right", 0.0f);
                        boolean booleanOr = getBooleanOr(bundleOrNull2, PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, true);
                        boolean booleanOr2 = getBooleanOr(bundleOrNull2, PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, true);
                        PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure.Colors colors = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure.Colors(dynamicColorFromParams(context, bundleOrNull2, PaymentSheetAppearanceKeys.SEPARATOR_COLOR, -7829368), dynamicColorFromParams(context, bundleOrNull3, "color", colorsBuildColors.getComponentBorder()));
                        flatWithDisclosureBuild = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure.Builder().separatorThicknessDp(floatOr2).startSeparatorInsetDp(floatOr3).endSeparatorInsetDp(floatOr4).topSeparatorEnabled(booleanOr).bottomSeparatorEnabled(booleanOr2).additionalVerticalInsetsDp(floatOr).horizontalInsetsDp(0.0f).colorsLight(colors).colorsDark(colors).build();
                        break;
                    }
                    break;
                case 271480668:
                    if (string.equals("flatWithRadio")) {
                        Bundle bundleOrNull5 = getBundleOrNull(bundleOrNull, PaymentSheetAppearanceKeys.FLAT);
                        Bundle bundleOrNull6 = getBundleOrNull(bundleOrNull5, PaymentSheetAppearanceKeys.RADIO);
                        Bundle bundleOrNull7 = getBundleOrNull(bundleOrNull5, PaymentSheetAppearanceKeys.SEPARATOR_INSETS);
                        float floatOr5 = getFloatOr(bundleOrNull5, PaymentSheetAppearanceKeys.SEPARATOR_THICKNESS, 1.0f);
                        float floatOr6 = getFloatOr(bundleOrNull7, "left", 30.0f);
                        float floatOr7 = getFloatOr(bundleOrNull7, "right", 0.0f);
                        boolean booleanOr3 = getBooleanOr(bundleOrNull5, PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, true);
                        boolean booleanOr4 = getBooleanOr(bundleOrNull5, PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, true);
                        PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio.Colors colors2 = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio.Colors(dynamicColorFromParams(context, bundleOrNull5, PaymentSheetAppearanceKeys.SEPARATOR_COLOR, colorsBuildColors.getComponentBorder()), dynamicColorFromParams(context, bundleOrNull6, PaymentSheetAppearanceKeys.SELECTED_COLOR, colorsBuildColors.getPrimary()), dynamicColorFromParams(context, bundleOrNull6, PaymentSheetAppearanceKeys.UNSELECTED_COLOR, colorsBuildColors.getComponentBorder()));
                        flatWithDisclosureBuild = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio(floatOr5, floatOr6, floatOr7, booleanOr3, booleanOr4, floatOr, 0.0f, colors2, colors2);
                        break;
                    }
                    break;
                case 754250422:
                    if (string.equals("flatWithCheckmark")) {
                        Bundle bundleOrNull8 = getBundleOrNull(bundleOrNull, PaymentSheetAppearanceKeys.FLAT);
                        Bundle bundleOrNull9 = getBundleOrNull(bundleOrNull8, PaymentSheetAppearanceKeys.CHECKMARK);
                        Bundle bundleOrNull10 = getBundleOrNull(bundleOrNull8, PaymentSheetAppearanceKeys.SEPARATOR_INSETS);
                        float floatOr8 = getFloatOr(bundleOrNull8, PaymentSheetAppearanceKeys.SEPARATOR_THICKNESS, 1.0f);
                        float floatOr9 = getFloatOr(bundleOrNull10, "left", 0.0f);
                        float floatOr10 = getFloatOr(bundleOrNull10, "right", 0.0f);
                        float floatOr11 = getFloatOr(bundleOrNull9, PaymentSheetAppearanceKeys.CHECKMARK_INSET, 0.0f);
                        boolean booleanOr5 = getBooleanOr(bundleOrNull8, PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, true);
                        boolean booleanOr6 = getBooleanOr(bundleOrNull8, PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, true);
                        PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark.Colors colors3 = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark.Colors(dynamicColorFromParams(context, bundleOrNull8, PaymentSheetAppearanceKeys.SEPARATOR_COLOR, colorsBuildColors.getComponentBorder()), dynamicColorFromParams(context, bundleOrNull9, "color", colorsBuildColors.getPrimary()));
                        flatWithDisclosureBuild = new PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark(floatOr8, floatOr9, floatOr10, booleanOr5, booleanOr6, floatOr11, floatOr, 0.0f, colors3, colors3);
                        break;
                    }
                    break;
                case 1112964824:
                    if (string.equals("floatingButton")) {
                        flatWithDisclosureBuild = new PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton(getFloatOr(getBundleOrNull(bundleOrNull, PaymentSheetAppearanceKeys.FLOATING), PaymentSheetAppearanceKeys.SPACING, 12.0f), floatOr);
                        break;
                    }
                    break;
            }
            return null;
        }
        embedded = null;
        System.err.println("WARN: Unsupported embedded payment element row style received: " + string + ". Falling back to default.");
        return embedded;
    }

    private static final PaymentSheet.Insets buildFormInsets(Bundle bundle) {
        FormInsets formInsets = StripeThemeDefaults.INSTANCE.getFormInsets();
        return new PaymentSheet.Insets(getFloatOr(bundle, "left", formInsets.getStart()), getFloatOr(bundle, "top", formInsets.getTop()), getFloatOr(bundle, "right", formInsets.getEnd()), getFloatOr(bundle, "bottom", formInsets.getBottom()));
    }

    private static final int dynamicColorFromParams(Context context, Bundle bundle, String str, int i) {
        String string;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle(str);
            if (bundle2 != null) {
                if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                    string = bundle2.getString(PaymentSheetAppearanceKeys.DARK);
                } else {
                    string = bundle2.getString(PaymentSheetAppearanceKeys.LIGHT);
                }
                return colorFromHexOrDefault(string, i);
            }
            String string2 = bundle.getString(str);
            if (string2 != null) {
                return colorFromHexOrDefault(string2, i);
            }
        }
        return i;
    }

    private static final Double getDoubleOrNull(Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Number) obj).floatValue());
        }
        return null;
    }

    private static final float getFloatOr(Bundle bundle, String str, float f) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Float) {
                return ((Number) obj).floatValue();
            }
            if (obj instanceof Integer) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof Double) {
                return (float) ((Number) obj).doubleValue();
            }
        }
        return f;
    }

    private static final Bundle getBundleOrNull(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private static final boolean getBooleanOr(Bundle bundle, String str, boolean z) {
        return (bundle == null || !bundle.containsKey(str)) ? z : bundle.getBoolean(str);
    }

    private static final Float getFloatOrNull(Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        return null;
    }

    private static final Integer getFontResId(Bundle bundle, String str, Integer num, Context context) throws PaymentSheetAppearanceException {
        if (bundle == null || !bundle.containsKey(str)) {
            return num;
        }
        String string = bundle.getString(str);
        if (string == null) {
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: expected String for font." + str + ", but received null.");
        }
        if (new Regex("[^a-z0-9]").containsMatchIn(string)) {
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: appearance.font." + str + " should only contain lowercase alphanumeric characters on Android, but received '" + string + "'. This value must match the filename in android/app/src/main/res/font");
        }
        int identifier = context.getResources().getIdentifier(string, "font", context.getPackageName());
        if (identifier == 0) {
            throw new PaymentSheetAppearanceException("Encountered an error when setting a custom font: Failed to find font: " + string);
        }
        return Integer.valueOf(identifier);
    }
}
