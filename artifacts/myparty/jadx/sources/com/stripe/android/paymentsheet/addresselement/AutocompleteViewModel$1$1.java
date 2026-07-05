package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AutocompleteViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$1$1", f = "AutocompleteViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AutocompleteViewModel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ AutocompleteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutocompleteViewModel$1$1(AutocompleteViewModel autocompleteViewModel, String str, Continuation<? super AutocompleteViewModel$1$1> continuation) {
        super(2, continuation);
        this.this$0 = autocompleteViewModel;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutocompleteViewModel$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutocompleteViewModel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo8668findAutocompletePredictionsBWLJW6A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PlacesClientProxy placesClientProxy = this.this$0.placesClient;
            if (placesClientProxy != null) {
                String str = this.$it;
                String country = this.this$0.autocompleteArgs.getCountry();
                if (country != null) {
                    this.label = 1;
                    objMo8668findAutocompletePredictionsBWLJW6A = placesClientProxy.mo8668findAutocompletePredictionsBWLJW6A(str, country, 4, this);
                    if (objMo8668findAutocompletePredictionsBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalStateException("Country cannot be empty");
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo8668findAutocompletePredictionsBWLJW6A = ((Result) obj).getValue();
        AutocompleteViewModel autocompleteViewModel = this.this$0;
        if (Result.m9121exceptionOrNullimpl(objMo8668findAutocompletePredictionsBWLJW6A) == null) {
            autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
            autocompleteViewModel._predictions.setValue(((FindAutocompletePredictionsResponse) objMo8668findAutocompletePredictionsBWLJW6A).getAutocompletePredictions());
        } else {
            autocompleteViewModel._loading.setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
