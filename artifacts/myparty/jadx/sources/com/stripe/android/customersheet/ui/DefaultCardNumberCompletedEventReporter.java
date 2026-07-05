package com.stripe.android.customersheet.ui;

import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/ui/DefaultCardNumberCompletedEventReporter;", "Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;", "viewActionHandler", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerSheetViewAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onCardNumberCompleted", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DefaultCardNumberCompletedEventReporter implements CardNumberCompletedEventReporter {
    private final Function1<CustomerSheetViewAction, Unit> viewActionHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultCardNumberCompletedEventReporter(Function1<? super CustomerSheetViewAction, Unit> viewActionHandler) {
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        this.viewActionHandler = viewActionHandler;
    }

    @Override // com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter
    public void onCardNumberCompleted() {
        this.viewActionHandler.invoke(CustomerSheetViewAction.OnCardNumberInputCompleted.INSTANCE);
    }
}
