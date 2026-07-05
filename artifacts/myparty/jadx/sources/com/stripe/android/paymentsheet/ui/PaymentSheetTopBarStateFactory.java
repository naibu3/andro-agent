package com.stripe.android.paymentsheet.ui;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetTopBarState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", NamedConstantsKt.IS_LIVE_MODE, "", "editable", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetTopBarStateFactory {
    public static final int $stable = 0;
    public static final PaymentSheetTopBarStateFactory INSTANCE = new PaymentSheetTopBarStateFactory();

    private PaymentSheetTopBarStateFactory() {
    }

    public final PaymentSheetTopBarState create(boolean isLiveMode, PaymentSheetTopBarState.Editable editable) {
        Function0<Unit> onEditIconPressed;
        Intrinsics.checkNotNullParameter(editable, "editable");
        boolean z = !isLiveMode;
        boolean z2 = editable instanceof PaymentSheetTopBarState.Editable.Maybe;
        PaymentSheetTopBarState.Editable.Maybe maybe = z2 ? (PaymentSheetTopBarState.Editable.Maybe) editable : null;
        boolean z3 = maybe != null && maybe.getCanEdit();
        PaymentSheetTopBarState.Editable.Maybe maybe2 = z2 ? (PaymentSheetTopBarState.Editable.Maybe) editable : null;
        boolean z4 = maybe2 != null && maybe2.isEditing();
        PaymentSheetTopBarState.Editable.Maybe maybe3 = z2 ? (PaymentSheetTopBarState.Editable.Maybe) editable : null;
        if (maybe3 == null || (onEditIconPressed = maybe3.getOnEditIconPressed()) == null) {
            onEditIconPressed = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarStateFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return new PaymentSheetTopBarState(z, z3, z4, onEditIconPressed);
    }
}
