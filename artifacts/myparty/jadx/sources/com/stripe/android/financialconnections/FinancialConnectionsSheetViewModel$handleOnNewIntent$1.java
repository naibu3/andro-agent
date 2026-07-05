package com.stripe.android.financialconnections;

import android.content.Intent;
import android.net.Uri;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: FinancialConnectionsSheetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$1", f = "FinancialConnectionsSheetViewModel.kt", i = {0}, l = {628}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FinancialConnectionsSheetViewModel$handleOnNewIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsSheetViewModel$handleOnNewIntent$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Intent intent, Continuation<? super FinancialConnectionsSheetViewModel$handleOnNewIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetViewModel;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetViewModel$handleOnNewIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetViewModel$handleOnNewIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        Mutex mutex;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        String string;
        Uri uriOrNull;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderBuildUpon2;
        Uri.Builder builderClearQuery;
        Uri uriBuild;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.this$0.mutex;
            intent = this.$intent;
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2 = this.this$0;
            this.L$0 = mutex2;
            this.L$1 = intent;
            this.L$2 = financialConnectionsSheetViewModel2;
            this.label = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = (FinancialConnectionsSheetViewModel) this.L$2;
            intent = (Intent) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            financialConnectionsSheetViewModel = financialConnectionsSheetViewModel3;
        }
        if (intent != null) {
            try {
                Uri data = intent.getData();
                uriOrNull = (data == null || (string = data.toString()) == null) ? null : financialConnectionsSheetViewModel.toUriOrNull(string);
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
        FinancialConnectionsSheetState value = financialConnectionsSheetViewModel.getStateFlow().getValue();
        if (Intrinsics.areEqual(uriOrNull != null ? uriOrNull.getHost() : null, "native-redirect")) {
            String string2 = uriOrNull.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            financialConnectionsSheetViewModel.onStartApp2App(StringsKt.replaceFirst$default(string2, "stripe-auth://native-redirect/" + financialConnectionsSheetViewModel.applicationId + "/", "", false, 4, (Object) null));
        } else {
            if (Intrinsics.areEqual(uriOrNull != null ? uriOrNull.getHost() : null, "link-accounts")) {
                Uri.Builder builderBuildUpon3 = uriOrNull.buildUpon();
                if (Intrinsics.areEqual((builderBuildUpon3 == null || (builderClearQuery = builderBuildUpon3.clearQuery()) == null || (uriBuild = builderClearQuery.build()) == null) ? null : uriBuild.getPath(), "/" + financialConnectionsSheetViewModel.applicationId + "/authentication_return")) {
                    financialConnectionsSheetViewModel.onFinishApp2App(uriOrNull);
                }
            } else {
                String strValueOf = String.valueOf((uriOrNull == null || (builderBuildUpon2 = uriOrNull.buildUpon()) == null) ? null : builderBuildUpon2.clearQuery());
                FinancialConnectionsSessionManifest manifest = value.getManifest();
                if (Intrinsics.areEqual(strValueOf, manifest != null ? manifest.getSuccessUrl() : null)) {
                    financialConnectionsSheetViewModel.onFlowSuccess(value, uriOrNull);
                } else {
                    String strValueOf2 = String.valueOf((uriOrNull == null || (builderBuildUpon = uriOrNull.buildUpon()) == null) ? null : builderBuildUpon.clearQuery());
                    FinancialConnectionsSessionManifest manifest2 = value.getManifest();
                    if (Intrinsics.areEqual(strValueOf2, manifest2 != null ? manifest2.getCancelUrl() : null)) {
                        financialConnectionsSheetViewModel.onFlowCancelled(value);
                    } else {
                        financialConnectionsSheetViewModel.setState(new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FinancialConnectionsSheetViewModel$handleOnNewIntent$1.invokeSuspend$lambda$1$lambda$0((FinancialConnectionsSheetState) obj2);
                            }
                        });
                        FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Error processing FinancialConnectionsSheet intent")), false, null, 6, null);
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        mutex.unlock(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsSheetState invokeSuspend$lambda$1$lambda$0(FinancialConnectionsSheetState financialConnectionsSheetState) {
        return FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, null, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23, null);
    }
}
