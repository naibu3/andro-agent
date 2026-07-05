package com.stripe.android.customersheet.ui;

import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/ui/DefaultCardBrandDisallowedReporter;", "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;", "viewActionHandler", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerSheetViewAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onDisallowedCardBrandEntered", "brand", "Lcom/stripe/android/model/CardBrand;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DefaultCardBrandDisallowedReporter implements CardBrandDisallowedReporter {
    private final Function1<CustomerSheetViewAction, Unit> viewActionHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultCardBrandDisallowedReporter(Function1<? super CustomerSheetViewAction, Unit> viewActionHandler) {
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        this.viewActionHandler = viewActionHandler;
    }

    @Override // com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter
    public void onDisallowedCardBrandEntered(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.viewActionHandler.invoke(new CustomerSheetViewAction.OnDisallowedCardBrandEntered(brand));
    }
}
