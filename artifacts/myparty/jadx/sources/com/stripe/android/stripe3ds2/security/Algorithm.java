package com.stripe.android.stripe3ds2.security;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Algorithm.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/Algorithm;", "", SDKConstants.PARAM_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EC", "RSA", InAppPurchaseConstants.METHOD_TO_STRING, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Algorithm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Algorithm[] $VALUES;
    public static final Algorithm EC = new Algorithm("EC", 0, "EC");
    public static final Algorithm RSA = new Algorithm("RSA", 1, "RSA");
    private final String key;

    private static final /* synthetic */ Algorithm[] $values() {
        return new Algorithm[]{EC, RSA};
    }

    public static EnumEntries<Algorithm> getEntries() {
        return $ENTRIES;
    }

    private Algorithm(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        Algorithm[] algorithmArr$values = $values();
        $VALUES = algorithmArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(algorithmArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }

    public static Algorithm valueOf(String str) {
        return (Algorithm) Enum.valueOf(Algorithm.class, str);
    }

    public static Algorithm[] values() {
        return (Algorithm[]) $VALUES.clone();
    }
}
