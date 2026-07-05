package com.stripe.android.uicore.elements;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: PhoneNumberElementUI.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$5$1", f = "PhoneNumberElementUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PhoneNumberElementUIKt$PhoneNumberElementUI$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberElementUIKt$PhoneNumberElementUI$5$1(FocusRequester focusRequester, Continuation<? super PhoneNumberElementUIKt$PhoneNumberElementUI$5$1> continuation) {
        super(2, continuation);
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneNumberElementUIKt$PhoneNumberElementUI$5$1 phoneNumberElementUIKt$PhoneNumberElementUI$5$1 = new PhoneNumberElementUIKt$PhoneNumberElementUI$5$1(this.$focusRequester, continuation);
        phoneNumberElementUIKt$PhoneNumberElementUI$5$1.L$0 = obj;
        return phoneNumberElementUIKt$PhoneNumberElementUI$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhoneNumberElementUIKt$PhoneNumberElementUI$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
        final FocusRequester focusRequester = this.$focusRequester;
        job.invokeOnCompletion(new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$5$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return PhoneNumberElementUIKt$PhoneNumberElementUI$5$1.invokeSuspend$lambda$0(focusRequester, (Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(FocusRequester focusRequester, Throwable th) {
        focusRequester.requestFocus();
        return Unit.INSTANCE;
    }
}
