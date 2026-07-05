package com.stripe.android.view;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.stripe.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0019J$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\tH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/ThemeConfig;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "selectedColorInt", "", "unselectedColorInt", "unselectedTextColorInt", "selectedTextAlphaColorInt", "unselectedTextAlphaColorInt", "textColorValues", "", "getTextColorValues$payments_core_release", "()[I", "getTintColor", "isSelected", "", "getTintColor$payments_core_release", "getTextColor", "getTextColor$payments_core_release", "getTextAlphaColor", "getTextAlphaColor$payments_core_release", "determineColor", "defaultColor", "colorIfTransparent", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemeConfig {
    public static final int $stable = 8;
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int selectedTextAlphaColorInt;
    private final int[] textColorValues;
    private final int unselectedColorInt;
    private final int unselectedTextAlphaColorInt;
    private final int unselectedTextColorInt;

    public ThemeConfig(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        int iDetermineColor = determineColor(context, stripeColorUtils.getColorAccent(), R.color.stripe_accent_color_default);
        this.selectedColorInt = iDetermineColor;
        this.unselectedColorInt = determineColor(context, stripeColorUtils.getColorControlNormal(), R.color.stripe_control_normal_color_default);
        int iDetermineColor2 = determineColor(context, stripeColorUtils.getTextColorSecondary(), R.color.stripe_color_text_secondary_default);
        this.unselectedTextColorInt = iDetermineColor2;
        int alphaComponent = ColorUtils.setAlphaComponent(iDetermineColor, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
        this.selectedTextAlphaColorInt = alphaComponent;
        int alphaComponent2 = ColorUtils.setAlphaComponent(iDetermineColor2, context.getResources().getInteger(R.integer.stripe_light_text_alpha_hex));
        this.unselectedTextAlphaColorInt = alphaComponent2;
        this.textColorValues = new int[]{iDetermineColor, alphaComponent, iDetermineColor2, alphaComponent2};
    }

    /* renamed from: getTextColorValues$payments_core_release, reason: from getter */
    public final int[] getTextColorValues() {
        return this.textColorValues;
    }

    public final int getTintColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedColorInt;
    }

    public final int getTextColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedColorInt : this.unselectedTextColorInt;
    }

    public final int getTextAlphaColor$payments_core_release(boolean isSelected) {
        return isSelected ? this.selectedTextAlphaColorInt : this.unselectedTextAlphaColorInt;
    }

    private final int determineColor(Context context, int defaultColor, int colorIfTransparent) {
        return StripeColorUtils.INSTANCE.isColorTransparent(defaultColor) ? ContextCompat.getColor(context, colorIfTransparent) : defaultColor;
    }
}
