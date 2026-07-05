package com.stripe.android.paymentelement.embedded.content;

import androidx.lifecycle.SavedStateHandle;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SheetStateHolder.kt */
@Singleton
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "value", "", "sheetIsOpen", "getSheetIsOpen", "()Z", "setSheetIsOpen", "(Z)V", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SheetStateHolder {
    private static final String SHEET_IS_OPEN_KEY = "SheetStateHolder_SHEET_IS_OPEN_KEY";
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    @Inject
    public SheetStateHolder(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    public final boolean getSheetIsOpen() {
        return Intrinsics.areEqual(this.savedStateHandle.get(SHEET_IS_OPEN_KEY), (Object) true);
    }

    public final void setSheetIsOpen(boolean z) {
        this.savedStateHandle.set(SHEET_IS_OPEN_KEY, Boolean.valueOf(z));
    }
}
