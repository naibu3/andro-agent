package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/reactnativestripesdk/utils/CreateTokenErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateTokenErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateTokenErrorType[] $VALUES;
    public static final CreateTokenErrorType Failed = new CreateTokenErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);

    private static final /* synthetic */ CreateTokenErrorType[] $values() {
        return new CreateTokenErrorType[]{Failed};
    }

    public static EnumEntries<CreateTokenErrorType> getEntries() {
        return $ENTRIES;
    }

    private CreateTokenErrorType(String str, int i) {
    }

    static {
        CreateTokenErrorType[] createTokenErrorTypeArr$values = $values();
        $VALUES = createTokenErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(createTokenErrorTypeArr$values);
    }

    public static CreateTokenErrorType valueOf(String str) {
        return (CreateTokenErrorType) Enum.valueOf(CreateTokenErrorType.class, str);
    }

    public static CreateTokenErrorType[] values() {
        return (CreateTokenErrorType[]) $VALUES.clone();
    }
}
