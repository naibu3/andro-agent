package com.stripe.android.uicore.elements;

import com.facebook.react.uimanager.ViewProps;
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
/* compiled from: AddressFieldConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "OPTIONAL", "REQUIRED", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class AddressFieldConfiguration {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddressFieldConfiguration[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName(ViewProps.HIDDEN)
    public static final AddressFieldConfiguration HIDDEN = new AddressFieldConfiguration("HIDDEN", 0);

    @SerialName("optional")
    public static final AddressFieldConfiguration OPTIONAL = new AddressFieldConfiguration("OPTIONAL", 1);

    @SerialName("required")
    public static final AddressFieldConfiguration REQUIRED = new AddressFieldConfiguration("REQUIRED", 2);

    private static final /* synthetic */ AddressFieldConfiguration[] $values() {
        return new AddressFieldConfiguration[]{HIDDEN, OPTIONAL, REQUIRED};
    }

    public static EnumEntries<AddressFieldConfiguration> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: AddressFieldConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressFieldConfiguration$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AddressFieldConfiguration.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AddressFieldConfiguration> serializer() {
            return get$cachedSerializer();
        }
    }

    private AddressFieldConfiguration(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.uicore.elements.AddressFieldConfiguration", values(), new String[]{ViewProps.HIDDEN, "optional", "required"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        AddressFieldConfiguration[] addressFieldConfigurationArr$values = $values();
        $VALUES = addressFieldConfigurationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(addressFieldConfigurationArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.uicore.elements.AddressFieldConfiguration$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressFieldConfiguration._init_$_anonymous_();
            }
        });
    }

    public static AddressFieldConfiguration valueOf(String str) {
        return (AddressFieldConfiguration) Enum.valueOf(AddressFieldConfiguration.class, str);
    }

    public static AddressFieldConfiguration[] values() {
        return (AddressFieldConfiguration[]) $VALUES.clone();
    }
}
