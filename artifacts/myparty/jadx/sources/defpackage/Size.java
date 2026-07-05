package defpackage;

import com.google.firebase.messaging.Constants;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"LSize;", "", "<init>", "(Ljava/lang/String;I)V", "XSmall", "Small", "Medium", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final class Size {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Size[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("x-small")
    public static final Size XSmall = new Size("XSmall", 0);

    @SerialName("small")
    public static final Size Small = new Size("Small", 1);

    @SerialName(Constants.ScionAnalytics.PARAM_MEDIUM)
    public static final Size Medium = new Size("Medium", 2);

    private static final /* synthetic */ Size[] $values() {
        return new Size[]{XSmall, Small, Medium};
    }

    public static EnumEntries<Size> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: FinancialConnectionsGenericInfoScreen.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"LSize$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "LSize;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Size.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Size> serializer() {
            return get$cachedSerializer();
        }
    }

    private Size(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("Size", values(), new String[]{"x-small", "small", Constants.ScionAnalytics.PARAM_MEDIUM}, new Annotation[][]{null, null, null}, null);
    }

    static {
        Size[] sizeArr$values = $values();
        $VALUES = sizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sizeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: Size$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Size._init_$_anonymous_();
            }
        });
    }

    public static Size valueOf(String str) {
        return (Size) Enum.valueOf(Size.class, str);
    }

    public static Size[] values() {
        return (Size[]) $VALUES.clone();
    }
}
