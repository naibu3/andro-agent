package com.stripe.android.financialconnections.ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleEventsCutter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;", "Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;", "<init>", "()V", "now", "", "getNow", "()J", "lastEventTimeMs", "processEvent", "", "event", "Lkotlin/Function0;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MultipleEventsCutterImpl implements MultipleEventsCutter {
    private static final long DEBOUNCE_MS = 500;
    private long lastEventTimeMs;

    private final long getNow() {
        return System.currentTimeMillis();
    }

    @Override // com.stripe.android.financialconnections.ui.components.MultipleEventsCutter
    public void processEvent(Function0<Unit> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (getNow() - this.lastEventTimeMs >= DEBOUNCE_MS) {
            event.invoke();
        }
        this.lastEventTimeMs = getNow();
    }
}
