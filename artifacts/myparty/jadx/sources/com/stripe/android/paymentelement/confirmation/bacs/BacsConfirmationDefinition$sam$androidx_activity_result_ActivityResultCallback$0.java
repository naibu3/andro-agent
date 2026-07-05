package com.stripe.android.paymentelement.confirmation.bacs;

import androidx.activity.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsConfirmationDefinition.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BacsConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0 implements ActivityResultCallback, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    BacsConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
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

    @Override // androidx.activity.result.ActivityResultCallback
    public final /* synthetic */ void onActivityResult(Object obj) {
        this.function.invoke(obj);
    }
}
