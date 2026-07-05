package com.stripe.android.financialconnections;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnections.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007J)\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnections;", "", "<init>", "()V", "eventListener", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;", "setEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "clearEventListener", "emitEvent", "Lkotlin/Result;", "name", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;", "metadata", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;", "emitEvent-gIAlu-s$financial_connections_release", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnections {
    private static FinancialConnectionsEventListener eventListener;
    public static final FinancialConnections INSTANCE = new FinancialConnections();
    public static final int $stable = 8;

    private FinancialConnections() {
    }

    @JvmStatic
    public static final synchronized void setEventListener(FinancialConnectionsEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        eventListener = listener;
    }

    @JvmStatic
    public static final synchronized void clearEventListener() {
        eventListener = null;
    }

    /* renamed from: emitEvent-gIAlu-s$financial_connections_release$default, reason: not valid java name */
    public static /* synthetic */ Object m7281emitEventgIAlus$financial_connections_release$default(FinancialConnections financialConnections, FinancialConnectionsEvent.Name name, FinancialConnectionsEvent.Metadata metadata, int i, Object obj) {
        if ((i & 2) != 0) {
            metadata = new FinancialConnectionsEvent.Metadata(null, null, null, 7, null);
        }
        return financialConnections.m7282emitEventgIAlus$financial_connections_release(name, metadata);
    }

    /* renamed from: emitEvent-gIAlu-s$financial_connections_release, reason: not valid java name */
    public final Object m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name name, FinancialConnectionsEvent.Metadata metadata) {
        Unit unit;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        try {
            Result.Companion companion = Result.INSTANCE;
            FinancialConnections financialConnections = this;
            FinancialConnectionsEventListener financialConnectionsEventListener = eventListener;
            if (financialConnectionsEventListener != null) {
                financialConnectionsEventListener.onEvent(new FinancialConnectionsEvent(name, metadata));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            return Result.m9118constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }
}
