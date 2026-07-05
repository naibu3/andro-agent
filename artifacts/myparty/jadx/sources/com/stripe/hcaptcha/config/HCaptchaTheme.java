package com.stripe.hcaptcha.config;

import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HCaptchaTheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "", "<init>", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "CONTRAST", "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class HCaptchaTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HCaptchaTheme[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName(PaymentSheetAppearanceKeys.DARK)
    public static final HCaptchaTheme DARK = new HCaptchaTheme("DARK", 0);

    @SerialName(PaymentSheetAppearanceKeys.LIGHT)
    public static final HCaptchaTheme LIGHT = new HCaptchaTheme("LIGHT", 1);

    @SerialName("contrast")
    public static final HCaptchaTheme CONTRAST = new HCaptchaTheme("CONTRAST", 2);

    private static final /* synthetic */ HCaptchaTheme[] $values() {
        return new HCaptchaTheme[]{DARK, LIGHT, CONTRAST};
    }

    public static EnumEntries<HCaptchaTheme> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: HCaptchaTheme.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaTheme$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) HCaptchaTheme.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<HCaptchaTheme> serializer() {
            return get$cachedSerializer();
        }
    }

    private HCaptchaTheme(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.hcaptcha.config.HCaptchaTheme", values(), new String[]{PaymentSheetAppearanceKeys.DARK, PaymentSheetAppearanceKeys.LIGHT, "contrast"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        HCaptchaTheme[] hCaptchaThemeArr$values = $values();
        $VALUES = hCaptchaThemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hCaptchaThemeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.hcaptcha.config.HCaptchaTheme$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HCaptchaTheme._init_$_anonymous_();
            }
        });
    }

    public static HCaptchaTheme valueOf(String str) {
        return (HCaptchaTheme) Enum.valueOf(HCaptchaTheme.class, str);
    }

    public static HCaptchaTheme[] values() {
        return (HCaptchaTheme[]) $VALUES.clone();
    }
}
