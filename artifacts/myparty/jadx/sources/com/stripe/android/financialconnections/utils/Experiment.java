package com.stripe.android.financialconnections.utils;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Experiments.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/utils/Experiment;", "", SDKConstants.PARAM_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "CONNECTIONS_CONSENT_COMBINED_LOGO", "CONNECTIONS_MOBILE_NATIVE", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Experiment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Experiment[] $VALUES;
    public static final Experiment CONNECTIONS_CONSENT_COMBINED_LOGO = new Experiment("CONNECTIONS_CONSENT_COMBINED_LOGO", 0, "connections_consent_combined_logo");
    public static final Experiment CONNECTIONS_MOBILE_NATIVE = new Experiment("CONNECTIONS_MOBILE_NATIVE", 1, "connections_mobile_native");
    private final String key;

    private static final /* synthetic */ Experiment[] $values() {
        return new Experiment[]{CONNECTIONS_CONSENT_COMBINED_LOGO, CONNECTIONS_MOBILE_NATIVE};
    }

    public static EnumEntries<Experiment> getEntries() {
        return $ENTRIES;
    }

    private Experiment(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        Experiment[] experimentArr$values = $values();
        $VALUES = experimentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(experimentArr$values);
    }

    public static Experiment valueOf(String str) {
        return (Experiment) Enum.valueOf(Experiment.class, str);
    }

    public static Experiment[] values() {
        return (Experiment[]) $VALUES.clone();
    }
}
