package com.stripe.android.paymentelement.confirmation.intent;

import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Client", "Server", "None", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeferredIntentConfirmationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeferredIntentConfirmationType[] $VALUES;
    private final String value;
    public static final DeferredIntentConfirmationType Client = new DeferredIntentConfirmationType("Client", 0, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
    public static final DeferredIntentConfirmationType Server = new DeferredIntentConfirmationType("Server", 1, "server");
    public static final DeferredIntentConfirmationType None = new DeferredIntentConfirmationType("None", 2, "none");

    private static final /* synthetic */ DeferredIntentConfirmationType[] $values() {
        return new DeferredIntentConfirmationType[]{Client, Server, None};
    }

    public static EnumEntries<DeferredIntentConfirmationType> getEntries() {
        return $ENTRIES;
    }

    private DeferredIntentConfirmationType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        DeferredIntentConfirmationType[] deferredIntentConfirmationTypeArr$values = $values();
        $VALUES = deferredIntentConfirmationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(deferredIntentConfirmationTypeArr$values);
    }

    public static DeferredIntentConfirmationType valueOf(String str) {
        return (DeferredIntentConfirmationType) Enum.valueOf(DeferredIntentConfirmationType.class, str);
    }

    public static DeferredIntentConfirmationType[] values() {
        return (DeferredIntentConfirmationType[]) $VALUES.clone();
    }
}
