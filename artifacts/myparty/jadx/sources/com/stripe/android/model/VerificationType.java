package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Verification.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/VerificationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EMAIL", "SMS", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VerificationType[] $VALUES;
    public static final VerificationType EMAIL = new VerificationType("EMAIL", 0, "EMAIL");
    public static final VerificationType SMS = new VerificationType("SMS", 1, "SMS");
    private final String value;

    private static final /* synthetic */ VerificationType[] $values() {
        return new VerificationType[]{EMAIL, SMS};
    }

    public static EnumEntries<VerificationType> getEntries() {
        return $ENTRIES;
    }

    private VerificationType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        VerificationType[] verificationTypeArr$values = $values();
        $VALUES = verificationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(verificationTypeArr$values);
    }

    public static VerificationType valueOf(String str) {
        return (VerificationType) Enum.valueOf(VerificationType.class, str);
    }

    public static VerificationType[] values() {
        return (VerificationType[]) $VALUES.clone();
    }
}
