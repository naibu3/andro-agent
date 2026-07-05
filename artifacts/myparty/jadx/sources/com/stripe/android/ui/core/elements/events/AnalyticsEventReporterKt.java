package com.stripe.android.ui.core.elements.events;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: AnalyticsEventReporter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalAnalyticsEventReporter", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporter;", "getLocalAnalyticsEventReporter", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsEventReporterKt {
    private static final ProvidableCompositionLocal<AnalyticsEventReporter> LocalAnalyticsEventReporter = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.ui.core.elements.events.AnalyticsEventReporterKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AnalyticsEventReporterKt.LocalAnalyticsEventReporter$lambda$0();
        }
    });

    public static final ProvidableCompositionLocal<AnalyticsEventReporter> getLocalAnalyticsEventReporter() {
        return LocalAnalyticsEventReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsEventReporter LocalAnalyticsEventReporter$lambda$0() {
        return EmptyAnalyticsEventReporter.INSTANCE;
    }
}
