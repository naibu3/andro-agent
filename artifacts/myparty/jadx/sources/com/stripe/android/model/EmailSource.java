package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/EmailSource;", "", "backendValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getBackendValue", "()Ljava/lang/String;", "USER_ACTION", "CUSTOMER_OBJECT", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmailSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailSource[] $VALUES;
    private final String backendValue;
    public static final EmailSource USER_ACTION = new EmailSource("USER_ACTION", 0, "user_action");
    public static final EmailSource CUSTOMER_OBJECT = new EmailSource("CUSTOMER_OBJECT", 1, "customer_object");

    private static final /* synthetic */ EmailSource[] $values() {
        return new EmailSource[]{USER_ACTION, CUSTOMER_OBJECT};
    }

    public static EnumEntries<EmailSource> getEntries() {
        return $ENTRIES;
    }

    private EmailSource(String str, int i, String str2) {
        this.backendValue = str2;
    }

    public final String getBackendValue() {
        return this.backendValue;
    }

    static {
        EmailSource[] emailSourceArr$values = $values();
        $VALUES = emailSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(emailSourceArr$values);
    }

    public static EmailSource valueOf(String str) {
        return (EmailSource) Enum.valueOf(EmailSource.class, str);
    }

    public static EmailSource[] values() {
        return (EmailSource[]) $VALUES.clone();
    }
}
