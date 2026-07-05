package com.stripe.android.paymentsheet.verticalmode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.ui.IconHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayablePaymentMethod.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010(J\r\u0010)\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÂ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010.J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010.J\u009c\u0001\u00106\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\tHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006<"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "", "code", "", "Lcom/stripe/android/model/PaymentMethodCode;", "syntheticCode", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "iconResource", "", "iconResourceNight", "lightThemeIconUrl", "darkThemeIconUrl", "iconRequiresTinting", "", "subtitle", "promoBadge", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "outlinedIconResource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getSyntheticCode", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "Ljava/lang/Integer;", "getLightThemeIconUrl", "getDarkThemeIconUrl", "getIconRequiresTinting", "()Z", "getSubtitle", "getPromoBadge", "getOnClick", "()Lkotlin/jvm/functions/Function0;", PaymentSheetAppearanceKeys.ICON, "(Landroidx/compose/runtime/Composer;I)I", "iconUrl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisplayablePaymentMethod {
    public static final int $stable = 8;
    private final String code;
    private final String darkThemeIconUrl;
    private final ResolvableString displayName;
    private final boolean iconRequiresTinting;
    private final int iconResource;
    private final Integer iconResourceNight;
    private final String lightThemeIconUrl;
    private final Function0<Unit> onClick;
    private final Integer outlinedIconResource;
    private final String promoBadge;
    private final ResolvableString subtitle;
    private final String syntheticCode;

    /* renamed from: component12, reason: from getter */
    private final Integer getOutlinedIconResource() {
        return this.outlinedIconResource;
    }

    /* renamed from: component4, reason: from getter */
    private final int getIconResource() {
        return this.iconResource;
    }

    /* renamed from: component5, reason: from getter */
    private final Integer getIconResourceNight() {
        return this.iconResourceNight;
    }

    public static /* synthetic */ DisplayablePaymentMethod copy$default(DisplayablePaymentMethod displayablePaymentMethod, String str, String str2, ResolvableString resolvableString, int i, Integer num, String str3, String str4, boolean z, ResolvableString resolvableString2, String str5, Function0 function0, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = displayablePaymentMethod.code;
        }
        if ((i2 & 2) != 0) {
            str2 = displayablePaymentMethod.syntheticCode;
        }
        if ((i2 & 4) != 0) {
            resolvableString = displayablePaymentMethod.displayName;
        }
        if ((i2 & 8) != 0) {
            i = displayablePaymentMethod.iconResource;
        }
        if ((i2 & 16) != 0) {
            num = displayablePaymentMethod.iconResourceNight;
        }
        if ((i2 & 32) != 0) {
            str3 = displayablePaymentMethod.lightThemeIconUrl;
        }
        if ((i2 & 64) != 0) {
            str4 = displayablePaymentMethod.darkThemeIconUrl;
        }
        if ((i2 & 128) != 0) {
            z = displayablePaymentMethod.iconRequiresTinting;
        }
        if ((i2 & 256) != 0) {
            resolvableString2 = displayablePaymentMethod.subtitle;
        }
        if ((i2 & 512) != 0) {
            str5 = displayablePaymentMethod.promoBadge;
        }
        if ((i2 & 1024) != 0) {
            function0 = displayablePaymentMethod.onClick;
        }
        if ((i2 & 2048) != 0) {
            num2 = displayablePaymentMethod.outlinedIconResource;
        }
        Function0 function02 = function0;
        Integer num3 = num2;
        ResolvableString resolvableString3 = resolvableString2;
        String str6 = str5;
        String str7 = str4;
        boolean z2 = z;
        Integer num4 = num;
        String str8 = str3;
        return displayablePaymentMethod.copy(str, str2, resolvableString, i, num4, str8, str7, z2, resolvableString3, str6, function02, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPromoBadge() {
        return this.promoBadge;
    }

    public final Function0<Unit> component11() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSyntheticCode() {
        return this.syntheticCode;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getDisplayName() {
        return this.displayName;
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

    public final DisplayablePaymentMethod copy(String code, String syntheticCode, ResolvableString displayName, int iconResource, Integer iconResourceNight, String lightThemeIconUrl, String darkThemeIconUrl, boolean iconRequiresTinting, ResolvableString subtitle, String promoBadge, Function0<Unit> onClick, Integer outlinedIconResource) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(syntheticCode, "syntheticCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new DisplayablePaymentMethod(code, syntheticCode, displayName, iconResource, iconResourceNight, lightThemeIconUrl, darkThemeIconUrl, iconRequiresTinting, subtitle, promoBadge, onClick, outlinedIconResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayablePaymentMethod)) {
            return false;
        }
        DisplayablePaymentMethod displayablePaymentMethod = (DisplayablePaymentMethod) other;
        return Intrinsics.areEqual(this.code, displayablePaymentMethod.code) && Intrinsics.areEqual(this.syntheticCode, displayablePaymentMethod.syntheticCode) && Intrinsics.areEqual(this.displayName, displayablePaymentMethod.displayName) && this.iconResource == displayablePaymentMethod.iconResource && Intrinsics.areEqual(this.iconResourceNight, displayablePaymentMethod.iconResourceNight) && Intrinsics.areEqual(this.lightThemeIconUrl, displayablePaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, displayablePaymentMethod.darkThemeIconUrl) && this.iconRequiresTinting == displayablePaymentMethod.iconRequiresTinting && Intrinsics.areEqual(this.subtitle, displayablePaymentMethod.subtitle) && Intrinsics.areEqual(this.promoBadge, displayablePaymentMethod.promoBadge) && Intrinsics.areEqual(this.onClick, displayablePaymentMethod.onClick) && Intrinsics.areEqual(this.outlinedIconResource, displayablePaymentMethod.outlinedIconResource);
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
        String str3 = this.promoBadge;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.onClick.hashCode()) * 31;
        Integer num2 = this.outlinedIconResource;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.code + ", syntheticCode=" + this.syntheticCode + ", displayName=" + this.displayName + ", iconResource=" + this.iconResource + ", iconResourceNight=" + this.iconResourceNight + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ", subtitle=" + this.subtitle + ", promoBadge=" + this.promoBadge + ", onClick=" + this.onClick + ", outlinedIconResource=" + this.outlinedIconResource + ")";
    }

    public DisplayablePaymentMethod(String code, String syntheticCode, ResolvableString displayName, int i, Integer num, String str, String str2, boolean z, ResolvableString resolvableString, String str3, Function0<Unit> onClick, Integer num2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(syntheticCode, "syntheticCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.code = code;
        this.syntheticCode = syntheticCode;
        this.displayName = displayName;
        this.iconResource = i;
        this.iconResourceNight = num;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z;
        this.subtitle = resolvableString;
        this.promoBadge = str3;
        this.onClick = onClick;
        this.outlinedIconResource = num2;
    }

    public /* synthetic */ DisplayablePaymentMethod(String str, String str2, ResolvableString resolvableString, int i, Integer num, String str3, String str4, boolean z, ResolvableString resolvableString2, String str5, Function0 function0, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? str : str2, resolvableString, i, num, str3, str4, z, (i2 & 256) != 0 ? null : resolvableString2, (i2 & 512) != 0 ? null : str5, function0, (i2 & 2048) != 0 ? null : num2);
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

    public final String getPromoBadge() {
        return this.promoBadge;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final int icon(Composer composer, int i) {
        composer.startReplaceGroup(-1609013721);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1609013721, i, -1, "com.stripe.android.paymentsheet.verticalmode.DisplayablePaymentMethod.icon (DisplayablePaymentMethod.kt:24)");
        }
        int iIcon = IconHelper.INSTANCE.icon(this.iconResource, this.iconResourceNight, this.outlinedIconResource, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iIcon;
    }

    public final String iconUrl(Composer composer, int i) {
        composer.startReplaceGroup(475424180);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(475424180, i, -1, "com.stripe.android.paymentsheet.verticalmode.DisplayablePaymentMethod.iconUrl (DisplayablePaymentMethod.kt:27)");
        }
        String strIconUrl = IconHelper.INSTANCE.iconUrl(this.lightThemeIconUrl, this.darkThemeIconUrl, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strIconUrl;
    }
}
