package com.stripe.android.model;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/VerificationMethodParam;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Automatic", "Skip", "Microdeposits", "Instant", "InstantOrSkip", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationMethodParam {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VerificationMethodParam[] $VALUES;
    private final String value;
    public static final VerificationMethodParam Automatic = new VerificationMethodParam("Automatic", 0, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);
    public static final VerificationMethodParam Skip = new VerificationMethodParam("Skip", 1, "skip");
    public static final VerificationMethodParam Microdeposits = new VerificationMethodParam("Microdeposits", 2, "microdeposits");
    public static final VerificationMethodParam Instant = new VerificationMethodParam("Instant", 3, "instant");
    public static final VerificationMethodParam InstantOrSkip = new VerificationMethodParam("InstantOrSkip", 4, "instant_or_skip");

    private static final /* synthetic */ VerificationMethodParam[] $values() {
        return new VerificationMethodParam[]{Automatic, Skip, Microdeposits, Instant, InstantOrSkip};
    }

    public static EnumEntries<VerificationMethodParam> getEntries() {
        return $ENTRIES;
    }

    private VerificationMethodParam(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        VerificationMethodParam[] verificationMethodParamArr$values = $values();
        $VALUES = verificationMethodParamArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(verificationMethodParamArr$values);
    }

    public static VerificationMethodParam valueOf(String str) {
        return (VerificationMethodParam) Enum.valueOf(VerificationMethodParam.class, str);
    }

    public static VerificationMethodParam[] values() {
        return (VerificationMethodParam[]) $VALUES.clone();
    }
}
