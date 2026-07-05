package com.stripe.android.ui.core.elements;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/ui/core/elements/Capitalization;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Characters", "Words", "Sentences", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class Capitalization {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Capitalization[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("none")
    public static final Capitalization None = new Capitalization("None", 0);

    @SerialName("characters")
    public static final Capitalization Characters = new Capitalization("Characters", 1);

    @SerialName("words")
    public static final Capitalization Words = new Capitalization("Words", 2);

    @SerialName("sentences")
    public static final Capitalization Sentences = new Capitalization("Sentences", 3);

    private static final /* synthetic */ Capitalization[] $values() {
        return new Capitalization[]{None, Characters, Words, Sentences};
    }

    public static EnumEntries<Capitalization> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: SimpleTextSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/Capitalization$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/Capitalization;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Capitalization.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Capitalization> serializer() {
            return get$cachedSerializer();
        }
    }

    private Capitalization(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.ui.core.elements.Capitalization", values(), new String[]{"none", "characters", "words", "sentences"}, new Annotation[][]{null, null, null, null}, null);
    }

    static {
        Capitalization[] capitalizationArr$values = $values();
        $VALUES = capitalizationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(capitalizationArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.ui.core.elements.Capitalization$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Capitalization._init_$_anonymous_();
            }
        });
    }

    public static Capitalization valueOf(String str) {
        return (Capitalization) Enum.valueOf(Capitalization.class, str);
    }

    public static Capitalization[] values() {
        return (Capitalization[]) $VALUES.clone();
    }
}
