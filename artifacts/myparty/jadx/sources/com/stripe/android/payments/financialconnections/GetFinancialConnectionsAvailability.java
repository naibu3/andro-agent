package com.stripe.android.payments.financialconnections;

import com.stripe.android.core.utils.FeatureFlags;
import com.stripe.android.model.ElementsSession;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetFinancialConnectionsAvailability.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\u0002J\u000e\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u0007H\u0002¨\u0006\r"}, d2 = {"Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "isFullSdkAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;", "fcLiteKillSwitchEnabled", "", "preferLite", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetFinancialConnectionsAvailability {
    public static final int $stable = 0;
    public static final GetFinancialConnectionsAvailability INSTANCE = new GetFinancialConnectionsAvailability();

    private GetFinancialConnectionsAvailability() {
    }

    public static /* synthetic */ FinancialConnectionsAvailability invoke$default(GetFinancialConnectionsAvailability getFinancialConnectionsAvailability, ElementsSession elementsSession, IsFinancialConnectionsSdkAvailable isFinancialConnectionsSdkAvailable, int i, Object obj) {
        if ((i & 2) != 0) {
            isFinancialConnectionsSdkAvailable = DefaultIsFinancialConnectionsAvailable.INSTANCE;
        }
        return getFinancialConnectionsAvailability.invoke(elementsSession, isFinancialConnectionsSdkAvailable);
    }

    public final FinancialConnectionsAvailability invoke(ElementsSession elementsSession, IsFinancialConnectionsSdkAvailable isFullSdkAvailable) {
        Intrinsics.checkNotNullParameter(isFullSdkAvailable, "isFullSdkAvailable");
        if (preferLite(elementsSession) && !fcLiteKillSwitchEnabled(elementsSession)) {
            return FinancialConnectionsAvailability.Lite;
        }
        if (isFullSdkAvailable.invoke() && !FeatureFlags.INSTANCE.getFinancialConnectionsFullSdkUnavailable().isEnabled()) {
            return FinancialConnectionsAvailability.Full;
        }
        if (fcLiteKillSwitchEnabled(elementsSession)) {
            return null;
        }
        return FinancialConnectionsAvailability.Lite;
    }

    private final boolean fcLiteKillSwitchEnabled(ElementsSession elementsSession) {
        Map<ElementsSession.Flag, Boolean> flags;
        if (elementsSession == null || (flags = elementsSession.getFlags()) == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) flags.get(ElementsSession.Flag.ELEMENTS_DISABLE_FC_LITE), (Object) true);
    }

    private final boolean preferLite(ElementsSession elementsSession) {
        Map<ElementsSession.Flag, Boolean> flags;
        if (elementsSession == null || (flags = elementsSession.getFlags()) == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) flags.get(ElementsSession.Flag.ELEMENTS_PREFER_FC_LITE), (Object) true);
    }
}
