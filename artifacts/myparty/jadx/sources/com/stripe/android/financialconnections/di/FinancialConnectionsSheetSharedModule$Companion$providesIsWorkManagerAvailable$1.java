package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: FinancialConnectionsSheetSharedModule.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.di.FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1", f = "FinancialConnectionsSheetSharedModule.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ GetOrFetchSync $getOrFetchSync;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1(GetOrFetchSync getOrFetchSync, Continuation<? super FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1> continuation) {
        super(1, continuation);
        this.$getOrFetchSync = getOrFetchSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1(this.$getOrFetchSync, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((FinancialConnectionsSheetSharedModule$Companion$providesIsWorkManagerAvailable$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = GetOrFetchSync.invoke$default(this.$getOrFetchSync, null, false, this, 3, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(ManifestExtensionsKt.enableWorkManager(((SynchronizeSessionResponse) obj).getManifest()));
    }
}
