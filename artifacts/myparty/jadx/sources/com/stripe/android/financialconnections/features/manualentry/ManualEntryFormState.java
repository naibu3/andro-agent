package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ManualEntryFormState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryFormState;", "", "routing", "", "account", "accountConfirm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "routingError", "", "getRoutingError", "()Ljava/lang/Integer;", "accountError", "getAccountError", "accountConfirmError", "getAccountConfirmError", "isValid", "", "()Z", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntryFormState {
    public static final int $stable = 0;
    private final String account;
    private final String accountConfirm;
    private final String routing;

    public ManualEntryFormState() {
        this(null, null, null, 7, null);
    }

    public ManualEntryFormState(String str, String str2, String str3) {
        this.routing = str;
        this.account = str2;
        this.accountConfirm = str3;
    }

    public /* synthetic */ ManualEntryFormState(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final Integer getRoutingError() {
        if (this.routing != null) {
            return Validator.INSTANCE.getRoutingErrorIdOrNull(this.routing);
        }
        return null;
    }

    public final Integer getAccountError() {
        if (this.account != null) {
            return Validator.INSTANCE.getAccountErrorIdOrNull(this.account);
        }
        return null;
    }

    public final Integer getAccountConfirmError() {
        if (this.account == null || this.accountConfirm == null) {
            return null;
        }
        return Validator.INSTANCE.getAccountConfirmIdOrNull(this.account, this.accountConfirm);
    }

    public final boolean isValid() {
        return this.routing != null && this.account != null && this.accountConfirm != null && getRoutingError() == null && getAccountError() == null && getAccountConfirmError() == null;
    }
}
