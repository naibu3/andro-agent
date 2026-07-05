package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardDisplayTextFactory.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/android/view/CardDisplayTextFactory;", "", "resources", "Landroid/content/res/Resources;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "<init>", "(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createStyled", "Landroid/text/SpannableString;", "brand", "Lcom/stripe/android/model/CardBrand;", "last4", "", "isSelected", "", "createStyled$payments_core_release", "createUnstyled", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "createUnstyled$payments_core_release", "setSpan", "", "displayString", "span", "Landroid/text/ParcelableSpan;", ViewProps.START, "", ViewProps.END, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDisplayTextFactory {
    public static final int $stable = 8;
    private final Resources resources;
    private final ThemeConfig themeConfig;

    public CardDisplayTextFactory(Resources resources, ThemeConfig themeConfig) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        this.resources = resources;
        this.themeConfig = themeConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardDisplayTextFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this(resources, new ThemeConfig(context));
    }

    public final /* synthetic */ SpannableString createStyled$payments_core_release(CardBrand brand, String last4, boolean isSelected) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brand, "brand");
        String displayName = brand.getDisplayName();
        int length = displayName.length();
        String str = last4;
        if (str == null || StringsKt.isBlank(str)) {
            SpannableString spannableString = new SpannableString(displayName);
            setSpan(spannableString, new TypefaceSpan("sans-serif-medium"), 0, length);
            return spannableString;
        }
        String string = this.resources.getString(R.string.stripe_card_ending_in, displayName, last4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int length2 = string.length();
        String str2 = string;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, last4, 0, false, 6, (Object) null);
        int length3 = last4.length() + iIndexOf$default;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, displayName, 0, false, 6, (Object) null);
        int length4 = displayName.length() + iIndexOf$default2;
        int textColor$payments_core_release = this.themeConfig.getTextColor$payments_core_release(isSelected);
        int textAlphaColor$payments_core_release = this.themeConfig.getTextAlphaColor$payments_core_release(isSelected);
        SpannableString spannableString2 = new SpannableString(str2);
        setSpan(spannableString2, new ForegroundColorSpan(textAlphaColor$payments_core_release), 0, length2);
        setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), iIndexOf$default2, length4);
        setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), iIndexOf$default2, length4);
        setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), iIndexOf$default, length3);
        setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), iIndexOf$default, length3);
        return spannableString2;
    }

    public final /* synthetic */ String createUnstyled$payments_core_release(PaymentMethod.Card card) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(card, "card");
        String string = this.resources.getString(R.string.stripe_card_ending_in, card.brand.getDisplayName(), card.last4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void setSpan(SpannableString displayString, ParcelableSpan span, int start, int end) {
        displayString.setSpan(span, start, end, 33);
    }
}
