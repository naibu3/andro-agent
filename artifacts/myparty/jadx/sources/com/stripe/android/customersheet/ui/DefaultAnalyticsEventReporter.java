package com.stripe.android.customersheet.ui;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B*\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/customersheet/ui/DefaultAnalyticsEventReporter;", "Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporter;", "viewActionHandler", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerSheetViewAction;", "Lkotlin/ParameterName;", "name", "event", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onAnalyticsEvent", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DefaultAnalyticsEventReporter implements AnalyticsEventReporter {
    private final Function1<CustomerSheetViewAction, Unit> viewActionHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAnalyticsEventReporter(Function1<? super CustomerSheetViewAction, Unit> viewActionHandler) {
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        this.viewActionHandler = viewActionHandler;
    }

    @Override // com.stripe.android.ui.core.elements.events.AnalyticsEventReporter
    public void onAnalyticsEvent(AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.viewActionHandler.invoke(new CustomerSheetViewAction.OnAnalyticsEvent(event));
    }
}
