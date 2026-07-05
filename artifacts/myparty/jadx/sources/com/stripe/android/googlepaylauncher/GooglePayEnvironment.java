package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GooglePayEnvironment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue$payments_core_release", "()I", "Production", "Test", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayEnvironment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GooglePayEnvironment[] $VALUES;
    public static final GooglePayEnvironment Production = new GooglePayEnvironment("Production", 0, 1);
    public static final GooglePayEnvironment Test = new GooglePayEnvironment("Test", 1, 3);
    private final int value;

    private static final /* synthetic */ GooglePayEnvironment[] $values() {
        return new GooglePayEnvironment[]{Production, Test};
    }

    public static EnumEntries<GooglePayEnvironment> getEntries() {
        return $ENTRIES;
    }

    private GooglePayEnvironment(String str, int i, int i2) {
        this.value = i2;
    }

    /* renamed from: getValue$payments_core_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    static {
        GooglePayEnvironment[] googlePayEnvironmentArr$values = $values();
        $VALUES = googlePayEnvironmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(googlePayEnvironmentArr$values);
    }

    public static GooglePayEnvironment valueOf(String str) {
        return (GooglePayEnvironment) Enum.valueOf(GooglePayEnvironment.class, str);
    }

    public static GooglePayEnvironment[] values() {
        return (GooglePayEnvironment[]) $VALUES.clone();
    }
}
