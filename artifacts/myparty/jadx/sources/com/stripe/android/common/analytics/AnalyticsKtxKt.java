package com.stripe.android.common.analytics;

import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.StripeThemeDefaults;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsKtx.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012*\u00020\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0001*\u00020\u0019H\u0000\u001a\u001a\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012*\u00020\u001aH\u0000\u001a\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000\u001a\u0014\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b*\u00020\u001eH\u0000\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\u00020\u001eH\u0000\u001a\f\u0010\u0018\u001a\u00020\u0016*\u00020 H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0001*\u00020!H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"FIELD_APPEARANCE_USAGE", "", "FIELD_COLORS_LIGHT", "FIELD_COLORS_DARK", "FIELD_CORNER_RADIUS", "FIELD_BORDER_WIDTH", "FIELD_FONT", "FIELD_SIZE_SCALE_FACTOR", "FIELD_PRIMARY_BUTTON", "FIELD_ATTACH_DEFAULTS", "FIELD_COLLECT_NAME", "FIELD_COLLECT_EMAIL", "FIELD_COLLECT_PHONE", "FIELD_COLLECT_ADDRESS", "FIELD_EMBEDDED_PAYMENT_ELEMENT", "FIELD_STYLE", "FIELD_ROW_STYLE", "toAnalyticsMap", "", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "isEmbedded", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "toAnalyticsValue", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "", "Lcom/stripe/android/model/CardBrand;", "getExternalPaymentMethodsAnalyticsValue", "Lcom/stripe/android/common/model/CommonConfiguration;", "getCustomPaymentMethodsAnalyticsValue", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsKtxKt {
    public static final String FIELD_APPEARANCE_USAGE = "usage";
    public static final String FIELD_ATTACH_DEFAULTS = "attach_defaults";
    public static final String FIELD_BORDER_WIDTH = "border_width";
    public static final String FIELD_COLLECT_ADDRESS = "address";
    public static final String FIELD_COLLECT_EMAIL = "email";
    public static final String FIELD_COLLECT_NAME = "name";
    public static final String FIELD_COLLECT_PHONE = "phone";
    public static final String FIELD_COLORS_DARK = "colorsDark";
    public static final String FIELD_COLORS_LIGHT = "colorsLight";
    public static final String FIELD_CORNER_RADIUS = "corner_radius";
    public static final String FIELD_EMBEDDED_PAYMENT_ELEMENT = "embedded_payment_element";
    public static final String FIELD_FONT = "font";
    public static final String FIELD_PRIMARY_BUTTON = "primary_button";
    public static final String FIELD_ROW_STYLE = "row_style";
    public static final String FIELD_SIZE_SCALE_FACTOR = "size_scale_factor";
    public static final String FIELD_STYLE = "style";

    /* compiled from: AnalyticsKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.PaymentMethodLayout.values().length];
            try {
                iArr[PaymentSheet.PaymentMethodLayout.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.PaymentMethodLayout.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.PaymentMethodLayout.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Map toAnalyticsMap$default(PaymentSheet.Appearance appearance, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toAnalyticsMap(appearance, z);
    }

    public static final Map<String, Object> toAnalyticsMap(PaymentSheet.Appearance appearance, boolean z) {
        Intrinsics.checkNotNullParameter(appearance, "<this>");
        PaymentSheet.PrimaryButton primaryButton = appearance.getPrimaryButton();
        Pair[] pairArr = new Pair[5];
        boolean z2 = true;
        pairArr[0] = TuplesKt.to(FIELD_COLORS_LIGHT, Boolean.valueOf(!Intrinsics.areEqual(appearance.getPrimaryButton().getColorsLight(), PaymentSheet.PrimaryButtonColors.INSTANCE.getDefaultLight())));
        pairArr[1] = TuplesKt.to(FIELD_COLORS_DARK, Boolean.valueOf(!Intrinsics.areEqual(appearance.getPrimaryButton().getColorsDark(), PaymentSheet.PrimaryButtonColors.INSTANCE.getDefaultDark())));
        pairArr[2] = TuplesKt.to(FIELD_CORNER_RADIUS, Boolean.valueOf(primaryButton.getShape().getCornerRadiusDp() != null));
        pairArr[3] = TuplesKt.to(FIELD_BORDER_WIDTH, Boolean.valueOf(primaryButton.getShape().getBorderStrokeWidthDp() != null));
        pairArr[4] = TuplesKt.to("font", Boolean.valueOf(primaryButton.getTypography().getFontResId() != null));
        Map mapMapOf = MapsKt.mapOf(pairArr);
        Pair[] pairArr2 = new Pair[7];
        pairArr2[0] = TuplesKt.to(FIELD_COLORS_LIGHT, Boolean.valueOf(!Intrinsics.areEqual(appearance.getColorsLight(), PaymentSheet.Colors.INSTANCE.getDefaultLight())));
        pairArr2[1] = TuplesKt.to(FIELD_COLORS_DARK, Boolean.valueOf(!Intrinsics.areEqual(appearance.getColorsDark(), PaymentSheet.Colors.INSTANCE.getDefaultDark())));
        pairArr2[2] = TuplesKt.to(FIELD_CORNER_RADIUS, Boolean.valueOf(!(appearance.getShapes().getCornerRadiusDp() == StripeThemeDefaults.INSTANCE.getShapes().getCornerRadius())));
        pairArr2[3] = TuplesKt.to(FIELD_BORDER_WIDTH, Boolean.valueOf(!(appearance.getShapes().getBorderStrokeWidthDp() == StripeThemeDefaults.INSTANCE.getShapes().getBorderStrokeWidth())));
        pairArr2[4] = TuplesKt.to("font", Boolean.valueOf(appearance.getTypography().getFontResId() != null));
        pairArr2[5] = TuplesKt.to(FIELD_SIZE_SCALE_FACTOR, Boolean.valueOf(!(appearance.getTypography().getSizeScaleFactor() == StripeThemeDefaults.INSTANCE.getTypography().getFontSizeMultiplier())));
        pairArr2[6] = TuplesKt.to(FIELD_PRIMARY_BUTTON, mapMapOf);
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(pairArr2);
        Map<String, Object> analyticsMap = toAnalyticsMap(appearance.getEmbeddedAppearance$paymentsheet_release());
        mapMutableMapOf.put(FIELD_EMBEDDED_PAYMENT_ELEMENT, z ? analyticsMap : null);
        boolean zContains = mapMapOf.values().contains(true);
        Collection<Object> collectionValues = mapMutableMapOf.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof Boolean) {
                arrayList.add(obj);
            }
        }
        boolean zContains2 = arrayList.contains(true);
        Collection<Object> collectionValues2 = analyticsMap.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            if (obj2 instanceof Boolean) {
                arrayList2.add(obj2);
            }
        }
        boolean zContains3 = arrayList2.contains(true);
        if (!zContains2 && !zContains && !zContains3) {
            z2 = false;
        }
        mapMutableMapOf.put("usage", Boolean.valueOf(z2));
        return mapMutableMapOf;
    }

    public static final Map<String, Object> toAnalyticsMap(PaymentSheet.Appearance.Embedded embedded) {
        Intrinsics.checkNotNullParameter(embedded, "<this>");
        return MapsKt.mapOf(TuplesKt.to("style", Boolean.valueOf(!Intrinsics.areEqual(embedded.getStyle(), PaymentSheet.Appearance.Embedded.INSTANCE.getDefault().getStyle()))), TuplesKt.to(FIELD_ROW_STYLE, toAnalyticsValue(embedded.getStyle())));
    }

    public static final String toAnalyticsValue(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        Intrinsics.checkNotNullParameter(rowStyle, "<this>");
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            return "floating_button";
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) {
            return "flat_with_radio";
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) {
            return "flat_with_checkmark";
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) {
            return "flat_with_disclosure";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map<String, Object> toAnalyticsMap(PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "<this>");
        return MapsKt.mapOf(TuplesKt.to(FIELD_ATTACH_DEFAULTS, Boolean.valueOf(billingDetailsCollectionConfiguration.getAttachDefaultsToPaymentMethod())), TuplesKt.to("name", billingDetailsCollectionConfiguration.getName().name()), TuplesKt.to("email", billingDetailsCollectionConfiguration.getEmail().name()), TuplesKt.to("phone", billingDetailsCollectionConfiguration.getPhone().name()), TuplesKt.to("address", billingDetailsCollectionConfiguration.getAddress().name()));
    }

    public static final String toAnalyticsValue(List<? extends CardBrand> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.stripe.android.common.analytics.AnalyticsKtxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalyticsKtxKt.toAnalyticsValue$lambda$1((CardBrand) obj);
                }
            }, 31, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toAnalyticsValue$lambda$1(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return brand.getCode();
    }

    public static final List<String> getExternalPaymentMethodsAnalyticsValue(CommonConfiguration commonConfiguration) {
        Intrinsics.checkNotNullParameter(commonConfiguration, "<this>");
        List<String> externalPaymentMethods = commonConfiguration.getExternalPaymentMethods();
        if (externalPaymentMethods.isEmpty()) {
            externalPaymentMethods = null;
        }
        if (externalPaymentMethods != null) {
            return CollectionsKt.take(externalPaymentMethods, 10);
        }
        return null;
    }

    public static final String getCustomPaymentMethodsAnalyticsValue(CommonConfiguration commonConfiguration) {
        Intrinsics.checkNotNullParameter(commonConfiguration, "<this>");
        List<PaymentSheet.CustomPaymentMethod> customPaymentMethods = commonConfiguration.getCustomPaymentMethods();
        if (customPaymentMethods.isEmpty()) {
            customPaymentMethods = null;
        }
        if (customPaymentMethods != null) {
            return CollectionsKt.joinToString$default(customPaymentMethods, ",", null, null, 0, null, new Function1() { // from class: com.stripe.android.common.analytics.AnalyticsKtxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalyticsKtxKt.getCustomPaymentMethodsAnalyticsValue$lambda$4((PaymentSheet.CustomPaymentMethod) obj);
                }
            }, 30, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getCustomPaymentMethodsAnalyticsValue$lambda$4(PaymentSheet.CustomPaymentMethod customPaymentMethod) {
        Intrinsics.checkNotNullParameter(customPaymentMethod, "customPaymentMethod");
        return customPaymentMethod.getId();
    }

    public static final boolean toAnalyticsValue(PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
        Intrinsics.checkNotNullParameter(cardBrandAcceptance, "<this>");
        return !(cardBrandAcceptance instanceof PaymentSheet.CardBrandAcceptance.All);
    }

    public static final String toAnalyticsValue(PaymentSheet.PaymentMethodLayout paymentMethodLayout) {
        Intrinsics.checkNotNullParameter(paymentMethodLayout, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[paymentMethodLayout.ordinal()];
        if (i == 1) {
            return "horizontal";
        }
        if (i == 2) {
            return "vertical";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
    }
}
