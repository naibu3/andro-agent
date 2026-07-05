package com.stripe.android.paymentsheet.utils;

import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventReporterProviderUtil.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EventReporterProviderUtilKt$sam$com_stripe_android_ui_core_elements_events_CardBrandDisallowedReporter$0 implements CardBrandDisallowedReporter, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    EventReporterProviderUtilKt$sam$com_stripe_android_ui_core_elements_events_CardBrandDisallowedReporter$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CardBrandDisallowedReporter) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter
    public final /* synthetic */ void onDisallowedCardBrandEntered(CardBrand cardBrand) {
        this.function.invoke(cardBrand);
    }
}
