package com.stripe.android.paymentsheet.addresselement;

import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AutocompleteScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$1$1", f = "AutocompleteScreen.kt", i = {}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AutocompleteScreenKt$AutocompleteScreenUI$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AddressElementNavigator $navigator;
    final /* synthetic */ AutocompleteViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutocompleteScreenKt$AutocompleteScreenUI$1$1(AutocompleteViewModel autocompleteViewModel, AddressElementNavigator addressElementNavigator, Continuation<? super AutocompleteScreenKt$AutocompleteScreenUI$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = autocompleteViewModel;
        this.$navigator = addressElementNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutocompleteScreenKt$AutocompleteScreenUI$1$1(this.$viewModel, this.$navigator, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutocompleteScreenKt$AutocompleteScreenUI$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AutocompleteScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$1$1$1", f = "AutocompleteScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<AutocompleteViewModel.Event, Continuation<? super Unit>, Object> {
        final /* synthetic */ AddressElementNavigator $navigator;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddressElementNavigator addressElementNavigator, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navigator = addressElementNavigator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigator, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AutocompleteViewModel.Event event, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AutocompleteViewModel.Event event = (AutocompleteViewModel.Event) this.L$0;
            if (event instanceof AutocompleteViewModel.Event.GoBack) {
                this.$navigator.setResult("AutocompleteEvent", new AddressElementNavigator.AutocompleteEvent.OnBack(((AutocompleteViewModel.Event.GoBack) event).getAddressDetails()));
            } else {
                if (!(event instanceof AutocompleteViewModel.Event.EnterManually)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$navigator.setResult("AutocompleteEvent", new AddressElementNavigator.AutocompleteEvent.OnEnterManually(((AutocompleteViewModel.Event.EnterManually) event).getAddressDetails()));
            }
            this.$navigator.onBack();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(this.$viewModel.getEvent(), new AnonymousClass1(this.$navigator, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
