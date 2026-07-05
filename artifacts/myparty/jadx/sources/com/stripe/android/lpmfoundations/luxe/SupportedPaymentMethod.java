package com.stripe.android.lpmfoundations.luxe;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodDefinition;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.ui.IconHelper;
import com.stripe.android.paymentsheet.verticalmode.DisplayablePaymentMethod;
import com.stripe.android.ui.core.elements.SelectorIcon;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportedPaymentMethod.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012B_\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\t\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0018By\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0001\u0010\u0017\u001a\u00020\t\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0019J\u0010\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-J,\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\b\u0010,\u001a\u0004\u0018\u00010-2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504J\r\u00106\u001a\u00020\tH\u0007¢\u0006\u0002\u00107J\u000f\u00108\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u00109J\r\u0010:\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0080\u0001\u0010D\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\tHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b)\u0010\"¨\u0006J"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "", "code", "", "Lcom/stripe/android/model/PaymentMethodCode;", "syntheticCode", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "iconResource", "", "iconResourceNight", "lightThemeIconUrl", "darkThemeIconUrl", "iconRequiresTinting", "", "subtitle", "outlinedIconResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;)V", "paymentMethodDefinition", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "displayNameResource", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getSyntheticCode", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "getIconResource", "()I", "getIconResourceNight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLightThemeIconUrl", "getDarkThemeIconUrl", "getIconRequiresTinting", "()Z", "getSubtitle", "getOutlinedIconResource", "asFormHeaderInformation", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "asDisplayablePaymentMethod", "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "customerSavedPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", PaymentSheetAppearanceKeys.ICON, "(Landroidx/compose/runtime/Composer;I)I", "iconUrl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SupportedPaymentMethod {
    public static final int $stable = 8;
    private final String code;
    private final String darkThemeIconUrl;
    private final ResolvableString displayName;
    private final boolean iconRequiresTinting;
    private final int iconResource;
    private final Integer iconResourceNight;
    private final String lightThemeIconUrl;
    private final Integer outlinedIconResource;
    private final ResolvableString subtitle;
    private final String syntheticCode;

    public static /* synthetic */ SupportedPaymentMethod copy$default(SupportedPaymentMethod supportedPaymentMethod, String str, String str2, ResolvableString resolvableString, int i, Integer num, String str3, String str4, boolean z, ResolvableString resolvableString2, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportedPaymentMethod.code;
        }
        if ((i2 & 2) != 0) {
            str2 = supportedPaymentMethod.syntheticCode;
        }
        if ((i2 & 4) != 0) {
            resolvableString = supportedPaymentMethod.displayName;
        }
        if ((i2 & 8) != 0) {
            i = supportedPaymentMethod.iconResource;
        }
        if ((i2 & 16) != 0) {
            num = supportedPaymentMethod.iconResourceNight;
        }
        if ((i2 & 32) != 0) {
            str3 = supportedPaymentMethod.lightThemeIconUrl;
        }
        if ((i2 & 64) != 0) {
            str4 = supportedPaymentMethod.darkThemeIconUrl;
        }
        if ((i2 & 128) != 0) {
            z = supportedPaymentMethod.iconRequiresTinting;
        }
        if ((i2 & 256) != 0) {
            resolvableString2 = supportedPaymentMethod.subtitle;
        }
        if ((i2 & 512) != 0) {
            num2 = supportedPaymentMethod.outlinedIconResource;
        }
        ResolvableString resolvableString3 = resolvableString2;
        Integer num3 = num2;
        String str5 = str4;
        boolean z2 = z;
        Integer num4 = num;
        String str6 = str3;
        return supportedPaymentMethod.copy(str, str2, resolvableString, i, num4, str6, str5, z2, resolvableString3, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getOutlinedIconResource() {
        return this.outlinedIconResource;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSyntheticCode() {
        return this.syntheticCode;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIconResource() {
        return this.iconResource;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getIconResourceNight() {
        return this.iconResourceNight;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    /* renamed from: component9, reason: from getter */
    public final ResolvableString getSubtitle() {
        return this.subtitle;
    }

    public final SupportedPaymentMethod copy(String code, String syntheticCode, ResolvableString displayName, int iconResource, Integer iconResourceNight, String lightThemeIconUrl, String darkThemeIconUrl, boolean iconRequiresTinting, ResolvableString subtitle, Integer outlinedIconResource) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(syntheticCode, "syntheticCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new SupportedPaymentMethod(code, syntheticCode, displayName, iconResource, iconResourceNight, lightThemeIconUrl, darkThemeIconUrl, iconRequiresTinting, subtitle, outlinedIconResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedPaymentMethod)) {
            return false;
        }
        SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) other;
        return Intrinsics.areEqual(this.code, supportedPaymentMethod.code) && Intrinsics.areEqual(this.syntheticCode, supportedPaymentMethod.syntheticCode) && Intrinsics.areEqual(this.displayName, supportedPaymentMethod.displayName) && this.iconResource == supportedPaymentMethod.iconResource && Intrinsics.areEqual(this.iconResourceNight, supportedPaymentMethod.iconResourceNight) && Intrinsics.areEqual(this.lightThemeIconUrl, supportedPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, supportedPaymentMethod.darkThemeIconUrl) && this.iconRequiresTinting == supportedPaymentMethod.iconRequiresTinting && Intrinsics.areEqual(this.subtitle, supportedPaymentMethod.subtitle) && Intrinsics.areEqual(this.outlinedIconResource, supportedPaymentMethod.outlinedIconResource);
    }

    public int hashCode() {
        int iHashCode = ((((((this.code.hashCode() * 31) + this.syntheticCode.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.iconResource)) * 31;
        Integer num = this.iconResourceNight;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.iconRequiresTinting)) * 31;
        ResolvableString resolvableString = this.subtitle;
        int iHashCode5 = (iHashCode4 + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31;
        Integer num2 = this.outlinedIconResource;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SupportedPaymentMethod(code=" + this.code + ", syntheticCode=" + this.syntheticCode + ", displayName=" + this.displayName + ", iconResource=" + this.iconResource + ", iconResourceNight=" + this.iconResourceNight + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ", subtitle=" + this.subtitle + ", outlinedIconResource=" + this.outlinedIconResource + ")";
    }

    public SupportedPaymentMethod(String code, String syntheticCode, ResolvableString displayName, int i, Integer num, String str, String str2, boolean z, ResolvableString resolvableString, Integer num2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(syntheticCode, "syntheticCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.code = code;
        this.syntheticCode = syntheticCode;
        this.displayName = displayName;
        this.iconResource = i;
        this.iconResourceNight = num;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z;
        this.subtitle = resolvableString;
        this.outlinedIconResource = num2;
    }

    public /* synthetic */ SupportedPaymentMethod(String str, String str2, ResolvableString resolvableString, int i, Integer num, String str3, String str4, boolean z, ResolvableString resolvableString2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? str : str2, resolvableString, i, num, str3, str4, z, (i2 & 256) != 0 ? null : resolvableString2, (i2 & 512) != 0 ? null : num2);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getSyntheticCode() {
        return this.syntheticCode;
    }

    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    public final int getIconResource() {
        return this.iconResource;
    }

    public final Integer getIconResourceNight() {
        return this.iconResourceNight;
    }

    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    public final ResolvableString getSubtitle() {
        return this.subtitle;
    }

    public final Integer getOutlinedIconResource() {
        return this.outlinedIconResource;
    }

    public /* synthetic */ SupportedPaymentMethod(PaymentMethodDefinition paymentMethodDefinition, SharedDataSpec sharedDataSpec, int i, int i2, Integer num, boolean z, ResolvableString resolvableString, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodDefinition, (i3 & 2) != 0 ? null : sharedDataSpec, i, i2, num, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : resolvableString, (i3 & 128) != 0 ? null : num2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SupportedPaymentMethod(PaymentMethodDefinition paymentMethodDefinition, SharedDataSpec sharedDataSpec, int i, int i2, Integer num, boolean z, ResolvableString resolvableString, Integer num2) {
        SelectorIcon selectorIcon;
        SelectorIcon selectorIcon2;
        Intrinsics.checkNotNullParameter(paymentMethodDefinition, "paymentMethodDefinition");
        String str = paymentMethodDefinition.getType().code;
        ResolvableString resolvableString2 = ResolvableStringUtilsKt.getResolvableString(i);
        String darkThemePng = null;
        String lightThemePng = (sharedDataSpec == null || (selectorIcon2 = sharedDataSpec.getSelectorIcon()) == null) ? null : selectorIcon2.getLightThemePng();
        if (sharedDataSpec != null && (selectorIcon = sharedDataSpec.getSelectorIcon()) != null) {
            darkThemePng = selectorIcon.getDarkThemePng();
        }
        this(str, (String) null, resolvableString2, i2, num, lightThemePng, darkThemePng, z, resolvableString, num2, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SupportedPaymentMethod(String str, String str2, int i, int i2, Integer num, boolean z, String str3, String str4, ResolvableString resolvableString, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? str : str2, i, i2, num, (i3 & 32) != 0 ? false : z, str3, str4, (i3 & 256) != 0 ? null : resolvableString, (i3 & 512) != 0 ? null : num2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupportedPaymentMethod(String code, String syntheticCode, int i, int i2, Integer num, boolean z, String str, String str2, ResolvableString resolvableString, Integer num2) {
        this(code, syntheticCode, ResolvableStringUtilsKt.getResolvableString(i), i2, num, str, str2, z, resolvableString, num2);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(syntheticCode, "syntheticCode");
    }

    public final FormHeaderInformation asFormHeaderInformation(PaymentMethodIncentive incentive) {
        return new FormHeaderInformation(this.displayName, true, this.iconResource, this.iconResourceNight, this.lightThemeIconUrl, this.darkThemeIconUrl, this.iconRequiresTinting, incentive != null ? incentive.getDisplayText() : null, this.outlinedIconResource);
    }

    private static final boolean asDisplayablePaymentMethod$isTypeAndHasCustomerSavedPaymentMethodsOfType(List<PaymentMethod> list, SupportedPaymentMethod supportedPaymentMethod, PaymentMethod.Type type) {
        List<PaymentMethod> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((PaymentMethod) it.next()).type == type) {
                return Intrinsics.areEqual(supportedPaymentMethod.code, type.code);
            }
        }
        return false;
    }

    public final DisplayablePaymentMethod asDisplayablePaymentMethod(List<PaymentMethod> customerSavedPaymentMethods, PaymentMethodIncentive incentive, Function0<Unit> onClick) {
        ResolvableString resolvableString;
        Intrinsics.checkNotNullParameter(customerSavedPaymentMethods, "customerSavedPaymentMethods");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (asDisplayablePaymentMethod$isTypeAndHasCustomerSavedPaymentMethodsOfType(customerSavedPaymentMethods, this, PaymentMethod.Type.Card)) {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_new_card);
        } else {
            resolvableString = this.displayName;
        }
        ResolvableString resolvableString2 = resolvableString;
        return new DisplayablePaymentMethod(this.code, this.syntheticCode, resolvableString2, this.iconResource, this.iconResourceNight, this.lightThemeIconUrl, this.darkThemeIconUrl, this.iconRequiresTinting, this.subtitle, incentive != null ? incentive.getDisplayText() : null, onClick, this.outlinedIconResource);
    }

    public final int icon(Composer composer, int i) {
        composer.startReplaceGroup(-2091678616);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091678616, i, -1, "com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod.icon (SupportedPaymentMethod.kt:144)");
        }
        int iIcon = IconHelper.INSTANCE.icon(this.iconResource, this.iconResourceNight, this.outlinedIconResource, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iIcon;
    }

    public final String iconUrl(Composer composer, int i) {
        composer.startReplaceGroup(-466345931);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466345931, i, -1, "com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod.iconUrl (SupportedPaymentMethod.kt:151)");
        }
        String strIconUrl = IconHelper.INSTANCE.iconUrl(this.lightThemeIconUrl, this.darkThemeIconUrl, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strIconUrl;
    }
}
