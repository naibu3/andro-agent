package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrodepositType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/MicrodepositType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AMOUNTS", "DESCRIPTOR_CODE", "UNKNOWN", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MicrodepositType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrodepositType[] $VALUES;
    public static final MicrodepositType AMOUNTS = new MicrodepositType("AMOUNTS", 0, "amounts");
    public static final MicrodepositType DESCRIPTOR_CODE = new MicrodepositType("DESCRIPTOR_CODE", 1, "descriptor_code");
    public static final MicrodepositType UNKNOWN = new MicrodepositType("UNKNOWN", 2, "unknown");
    private final String value;

    private static final /* synthetic */ MicrodepositType[] $values() {
        return new MicrodepositType[]{AMOUNTS, DESCRIPTOR_CODE, UNKNOWN};
    }

    public static EnumEntries<MicrodepositType> getEntries() {
        return $ENTRIES;
    }

    private MicrodepositType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        MicrodepositType[] microdepositTypeArr$values = $values();
        $VALUES = microdepositTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(microdepositTypeArr$values);
    }

    public static MicrodepositType valueOf(String str) {
        return (MicrodepositType) Enum.valueOf(MicrodepositType.class, str);
    }

    public static MicrodepositType[] values() {
        return (MicrodepositType[]) $VALUES.clone();
    }
}
