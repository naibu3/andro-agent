package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$2$1;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: USBankAccountEmitters.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$2$1", f = "USBankAccountEmitters.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class USBankAccountEmittersKt$USBankAccountEmitters$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ USBankAccountFormArguments $usBankAccountFormArgs;
    final /* synthetic */ USBankAccountFormViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    USBankAccountEmittersKt$USBankAccountEmitters$2$1(USBankAccountFormViewModel uSBankAccountFormViewModel, USBankAccountFormArguments uSBankAccountFormArguments, Continuation<? super USBankAccountEmittersKt$USBankAccountEmitters$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = uSBankAccountFormViewModel;
        this.$usBankAccountFormArgs = uSBankAccountFormArguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new USBankAccountEmittersKt$USBankAccountEmitters$2$1(this.$viewModel, this.$usBankAccountFormArgs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((USBankAccountEmittersKt$USBankAccountEmitters$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: USBankAccountEmitters.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ USBankAccountFormArguments $usBankAccountFormArgs;

        AnonymousClass1(USBankAccountFormArguments uSBankAccountFormArguments) {
            this.$usBankAccountFormArgs = uSBankAccountFormArguments;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
        }

        public final Object emit(final boolean z, Continuation<? super Unit> continuation) {
            this.$usBankAccountFormArgs.getOnUpdatePrimaryButtonUIState().invoke(new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmittersKt$USBankAccountEmitters$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return USBankAccountEmittersKt$USBankAccountEmitters$2$1.AnonymousClass1.emit$lambda$0(z, (PrimaryButton.UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PrimaryButton.UIState emit$lambda$0(boolean z, PrimaryButton.UIState uIState) {
            if (uIState != null) {
                return PrimaryButton.UIState.copy$default(uIState, null, null, z, false, 11, null);
            }
            return null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$viewModel.getRequiredFields().collect(new AnonymousClass1(this.$usBankAccountFormArgs), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
