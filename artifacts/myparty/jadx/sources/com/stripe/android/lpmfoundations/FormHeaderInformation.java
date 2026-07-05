package com.stripe.android.lpmfoundations;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.ui.IconHelper;
import com.stripe.android.uicore.IconStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormHeaderInformation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dJ\r\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÂ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010%J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0002\u0010%Jr\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u00061"}, d2 = {"Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "shouldShowIcon", "", "iconResource", "", "iconResourceNight", "lightThemeIconUrl", "", "darkThemeIconUrl", "iconRequiresTinting", "promoBadge", "outlinedIconResource", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "getShouldShowIcon", "()Z", "Ljava/lang/Integer;", "getLightThemeIconUrl", "()Ljava/lang/String;", "getDarkThemeIconUrl", "getIconRequiresTinting", "getPromoBadge", PaymentSheetAppearanceKeys.ICON, "style", "Lcom/stripe/android/uicore/IconStyle;", "(Landroidx/compose/runtime/Composer;I)I", "iconUrl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormHeaderInformation {
    public static final int $stable = 8;
    private final String darkThemeIconUrl;
    private final ResolvableString displayName;
    private final boolean iconRequiresTinting;
    private final int iconResource;
    private final Integer iconResourceNight;
    private final String lightThemeIconUrl;
    private final Integer outlinedIconResource;
    private final String promoBadge;
    private final boolean shouldShowIcon;

    /* compiled from: FormHeaderInformation.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconStyle.values().length];
            try {
                iArr[IconStyle.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconStyle.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final int getIconResource() {
        return this.iconResource;
    }

    /* renamed from: component4, reason: from getter */
    private final Integer getIconResourceNight() {
        return this.iconResourceNight;
    }

    /* renamed from: component9, reason: from getter */
    private final Integer getOutlinedIconResource() {
        return this.outlinedIconResource;
    }

    public static /* synthetic */ FormHeaderInformation copy$default(FormHeaderInformation formHeaderInformation, ResolvableString resolvableString, boolean z, int i, Integer num, String str, String str2, boolean z2, String str3, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resolvableString = formHeaderInformation.displayName;
        }
        if ((i2 & 2) != 0) {
            z = formHeaderInformation.shouldShowIcon;
        }
        if ((i2 & 4) != 0) {
            i = formHeaderInformation.iconResource;
        }
        if ((i2 & 8) != 0) {
            num = formHeaderInformation.iconResourceNight;
        }
        if ((i2 & 16) != 0) {
            str = formHeaderInformation.lightThemeIconUrl;
        }
        if ((i2 & 32) != 0) {
            str2 = formHeaderInformation.darkThemeIconUrl;
        }
        if ((i2 & 64) != 0) {
            z2 = formHeaderInformation.iconRequiresTinting;
        }
        if ((i2 & 128) != 0) {
            str3 = formHeaderInformation.promoBadge;
        }
        if ((i2 & 256) != 0) {
            num2 = formHeaderInformation.outlinedIconResource;
        }
        String str4 = str3;
        Integer num3 = num2;
        String str5 = str2;
        boolean z3 = z2;
        String str6 = str;
        int i3 = i;
        return formHeaderInformation.copy(resolvableString, z, i3, num, str6, str5, z3, str4, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowIcon() {
        return this.shouldShowIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPromoBadge() {
        return this.promoBadge;
    }

    public final FormHeaderInformation copy(ResolvableString displayName, boolean shouldShowIcon, int iconResource, Integer iconResourceNight, String lightThemeIconUrl, String darkThemeIconUrl, boolean iconRequiresTinting, String promoBadge, Integer outlinedIconResource) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new FormHeaderInformation(displayName, shouldShowIcon, iconResource, iconResourceNight, lightThemeIconUrl, darkThemeIconUrl, iconRequiresTinting, promoBadge, outlinedIconResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormHeaderInformation)) {
            return false;
        }
        FormHeaderInformation formHeaderInformation = (FormHeaderInformation) other;
        return Intrinsics.areEqual(this.displayName, formHeaderInformation.displayName) && this.shouldShowIcon == formHeaderInformation.shouldShowIcon && this.iconResource == formHeaderInformation.iconResource && Intrinsics.areEqual(this.iconResourceNight, formHeaderInformation.iconResourceNight) && Intrinsics.areEqual(this.lightThemeIconUrl, formHeaderInformation.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, formHeaderInformation.darkThemeIconUrl) && this.iconRequiresTinting == formHeaderInformation.iconRequiresTinting && Intrinsics.areEqual(this.promoBadge, formHeaderInformation.promoBadge) && Intrinsics.areEqual(this.outlinedIconResource, formHeaderInformation.outlinedIconResource);
    }

    public int hashCode() {
        int iHashCode = ((((this.displayName.hashCode() * 31) + Boolean.hashCode(this.shouldShowIcon)) * 31) + Integer.hashCode(this.iconResource)) * 31;
        Integer num = this.iconResourceNight;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.iconRequiresTinting)) * 31;
        String str3 = this.promoBadge;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.outlinedIconResource;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.displayName + ", shouldShowIcon=" + this.shouldShowIcon + ", iconResource=" + this.iconResource + ", iconResourceNight=" + this.iconResourceNight + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ", promoBadge=" + this.promoBadge + ", outlinedIconResource=" + this.outlinedIconResource + ")";
    }

    public FormHeaderInformation(ResolvableString displayName, boolean z, int i, Integer num, String str, String str2, boolean z2, String str3, Integer num2) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.displayName = displayName;
        this.shouldShowIcon = z;
        this.iconResource = i;
        this.iconResourceNight = num;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z2;
        this.promoBadge = str3;
        this.outlinedIconResource = num2;
    }

    public /* synthetic */ FormHeaderInformation(ResolvableString resolvableString, boolean z, int i, Integer num, String str, String str2, boolean z2, String str3, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, z, i, num, str, str2, z2, str3, (i2 & 256) != 0 ? null : num2);
    }

    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    public final boolean getShouldShowIcon() {
        return this.shouldShowIcon;
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

    public final String getPromoBadge() {
        return this.promoBadge;
    }

    public final int icon(IconStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return this.iconResource;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num = this.outlinedIconResource;
        return num != null ? num.intValue() : this.iconResource;
    }

    public final int icon(Composer composer, int i) {
        composer.startReplaceGroup(2138358);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2138358, i, -1, "com.stripe.android.lpmfoundations.FormHeaderInformation.icon (FormHeaderInformation.kt:25)");
        }
        int iIcon = IconHelper.INSTANCE.icon(this.iconResource, this.iconResourceNight, this.outlinedIconResource, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iIcon;
    }

    public final String iconUrl(Composer composer, int i) {
        composer.startReplaceGroup(944505289);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(944505289, i, -1, "com.stripe.android.lpmfoundations.FormHeaderInformation.iconUrl (FormHeaderInformation.kt:32)");
        }
        String strIconUrl = IconHelper.INSTANCE.iconUrl(this.lightThemeIconUrl, this.darkThemeIconUrl, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strIconUrl;
    }
}
