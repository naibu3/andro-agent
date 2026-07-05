package com.stripe.android.ui.core.elements;

import androidx.autofill.HintConstants;
import com.facebook.share.internal.ShareConstants;
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
/* compiled from: SimpleTextSpec.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/ui/core/elements/KeyboardType;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Ascii", "Number", "Phone", "Uri", "Email", "Password", "NumberPassword", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class KeyboardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KeyboardType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("text")
    public static final KeyboardType Text = new KeyboardType("Text", 0);

    @SerialName("ascii")
    public static final KeyboardType Ascii = new KeyboardType("Ascii", 1);

    @SerialName("number")
    public static final KeyboardType Number = new KeyboardType("Number", 2);

    @SerialName("phone")
    public static final KeyboardType Phone = new KeyboardType("Phone", 3);

    @SerialName(ShareConstants.MEDIA_URI)
    public static final KeyboardType Uri = new KeyboardType("Uri", 4);

    @SerialName("email")
    public static final KeyboardType Email = new KeyboardType("Email", 5);

    @SerialName(HintConstants.AUTOFILL_HINT_PASSWORD)
    public static final KeyboardType Password = new KeyboardType("Password", 6);

    @SerialName("number_password")
    public static final KeyboardType NumberPassword = new KeyboardType("NumberPassword", 7);

    private static final /* synthetic */ KeyboardType[] $values() {
        return new KeyboardType[]{Text, Ascii, Number, Phone, Uri, Email, Password, NumberPassword};
    }

    public static EnumEntries<KeyboardType> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: SimpleTextSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/KeyboardType;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) KeyboardType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<KeyboardType> serializer() {
            return get$cachedSerializer();
        }
    }

    private KeyboardType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.ui.core.elements.KeyboardType", values(), new String[]{"text", "ascii", "number", "phone", ShareConstants.MEDIA_URI, "email", HintConstants.AUTOFILL_HINT_PASSWORD, "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
    }

    static {
        KeyboardType[] keyboardTypeArr$values = $values();
        $VALUES = keyboardTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(keyboardTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.ui.core.elements.KeyboardType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KeyboardType._init_$_anonymous_();
            }
        });
    }

    public static KeyboardType valueOf(String str) {
        return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
    }

    public static KeyboardType[] values() {
        return (KeyboardType[]) $VALUES.clone();
    }
}
