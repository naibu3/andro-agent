package defpackage;

import androidx.webkit.Profile;
import com.facebook.hermes.intl.Constants;
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
/* compiled from: FinancialConnectionsGenericInfoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"LVerticalAlignment;", "", "<init>", "(Ljava/lang/String;I)V", Profile.DEFAULT_PROFILE_NAME, "Centered", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final class VerticalAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VerticalAlignment[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName(Constants.COLLATION_DEFAULT)
    public static final VerticalAlignment Default = new VerticalAlignment(Profile.DEFAULT_PROFILE_NAME, 0);

    @SerialName("centered")
    public static final VerticalAlignment Centered = new VerticalAlignment("Centered", 1);

    private static final /* synthetic */ VerticalAlignment[] $values() {
        return new VerticalAlignment[]{Default, Centered};
    }

    public static EnumEntries<VerticalAlignment> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LVerticalAlignment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LVerticalAlignment;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) VerticalAlignment.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<VerticalAlignment> serializer() {
            return get$cachedSerializer();
        }
    }

    private VerticalAlignment(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("VerticalAlignment", values(), new String[]{Constants.COLLATION_DEFAULT, "centered"}, new Annotation[][]{null, null}, null);
    }

    static {
        VerticalAlignment[] verticalAlignmentArr$values = $values();
        $VALUES = verticalAlignmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(verticalAlignmentArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: VerticalAlignment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VerticalAlignment._init_$_anonymous_();
            }
        });
    }

    public static VerticalAlignment valueOf(String str) {
        return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
    }

    public static VerticalAlignment[] values() {
        return (VerticalAlignment[]) $VALUES.clone();
    }
}
