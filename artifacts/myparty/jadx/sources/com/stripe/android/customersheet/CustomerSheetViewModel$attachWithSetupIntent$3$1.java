package com.stripe.android.customersheet;

import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.customersheet.CustomerSheetViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: CustomerSheetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$attachWithSetupIntent$3$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerSheetViewModel$attachWithSetupIntent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ String $displayMessage;
    int label;
    final /* synthetic */ CustomerSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerSheetViewModel$attachWithSetupIntent$3$1(CustomerSheetViewModel customerSheetViewModel, String str, Throwable th, Continuation<? super CustomerSheetViewModel$attachWithSetupIntent$3$1> continuation) {
        super(2, continuation);
        this.this$0 = customerSheetViewModel;
        this.$displayMessage = str;
        this.$cause = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerSheetViewModel$attachWithSetupIntent$3$1(this.this$0, this.$displayMessage, this.$cause, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomerSheetViewModel$attachWithSetupIntent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        ResolvableString resolvableStringStripeErrorMessage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CustomerSheetViewModel customerSheetViewModel = this.this$0;
        String str = this.$displayMessage;
        Throwable th = this.$cause;
        MutableStateFlow mutableStateFlow = customerSheetViewModel.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                    if (str == null || (resolvableStringStripeErrorMessage = ResolvableStringUtilsKt.getResolvableString(str)) == null) {
                        resolvableStringStripeErrorMessage = ExceptionKtKt.stripeErrorMessage(th);
                    }
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, resolvableStringStripeErrorMessage, false, null, (addPaymentMethod.getFormFieldValues() == null || addPaymentMethod.getIsProcessing()) ? false : true, null, null, false, false, null, null, 1038719, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        return Unit.INSTANCE;
    }
}
