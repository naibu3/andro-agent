package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetNavigation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;", "", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;)V", "getSheetState$financial_connections_release", "()Landroidx/compose/material/ModalBottomSheetState;", "isVisible", "", "isVisible$financial_connections_release", "()Z", "currentValue", "Landroidx/compose/material/ModalBottomSheetValue;", "getCurrentValue$financial_connections_release", "()Landroidx/compose/material/ModalBottomSheetValue;", "targetValue", "getTargetValue$financial_connections_release", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetNavigatorSheetState {
    public static final int $stable = 0;
    private final ModalBottomSheetState sheetState;

    public BottomSheetNavigatorSheetState(ModalBottomSheetState sheetState) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        this.sheetState = sheetState;
    }

    /* renamed from: getSheetState$financial_connections_release, reason: from getter */
    public final ModalBottomSheetState getSheetState() {
        return this.sheetState;
    }

    public final boolean isVisible$financial_connections_release() {
        return this.sheetState.isVisible();
    }

    public final ModalBottomSheetValue getCurrentValue$financial_connections_release() {
        return this.sheetState.getCurrentValue();
    }

    public final ModalBottomSheetValue getTargetValue$financial_connections_release() {
        return this.sheetState.getTargetValue();
    }
}
