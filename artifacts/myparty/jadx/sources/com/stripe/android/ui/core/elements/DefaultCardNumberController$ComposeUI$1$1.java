package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.MutableState;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CardNumberController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1", f = "CardNumberController.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultCardNumberController$ComposeUI$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardBrandDisallowedReporter $disallowedBrandReporter;
    final /* synthetic */ MutableState<CardBrand> $lastLoggedCardBrand$delegate;
    final /* synthetic */ CardNumberCompletedEventReporter $reporter;
    int label;
    final /* synthetic */ DefaultCardNumberController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultCardNumberController$ComposeUI$1$1(DefaultCardNumberController defaultCardNumberController, CardNumberCompletedEventReporter cardNumberCompletedEventReporter, CardBrandDisallowedReporter cardBrandDisallowedReporter, MutableState<CardBrand> mutableState, Continuation<? super DefaultCardNumberController$ComposeUI$1$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultCardNumberController;
        this.$reporter = cardNumberCompletedEventReporter;
        this.$disallowedBrandReporter = cardBrandDisallowedReporter;
        this.$lastLoggedCardBrand$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultCardNumberController$ComposeUI$1$1(this.this$0, this.$reporter, this.$disallowedBrandReporter, this.$lastLoggedCardBrand$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultCardNumberController$ComposeUI$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(FlowKt.drop(this.this$0.getFieldState(), 1), new AnonymousClass1(this.$reporter, this.this$0, this.$disallowedBrandReporter, this.$lastLoggedCardBrand$delegate, null), this) == coroutine_suspended) {
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

    /* compiled from: CardNumberController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/uicore/elements/TextFieldState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1$1", f = "CardNumberController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<TextFieldState, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardBrandDisallowedReporter $disallowedBrandReporter;
        final /* synthetic */ MutableState<CardBrand> $lastLoggedCardBrand$delegate;
        final /* synthetic */ CardNumberCompletedEventReporter $reporter;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultCardNumberController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CardNumberCompletedEventReporter cardNumberCompletedEventReporter, DefaultCardNumberController defaultCardNumberController, CardBrandDisallowedReporter cardBrandDisallowedReporter, MutableState<CardBrand> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reporter = cardNumberCompletedEventReporter;
            this.this$0 = defaultCardNumberController;
            this.$disallowedBrandReporter = cardBrandDisallowedReporter;
            this.$lastLoggedCardBrand$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reporter, this.this$0, this.$disallowedBrandReporter, this.$lastLoggedCardBrand$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TextFieldState textFieldState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(textFieldState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TextFieldState textFieldState = (TextFieldState) this.L$0;
            if (textFieldState instanceof TextFieldStateConstants.Valid.Full) {
                this.$reporter.onCardNumberCompleted();
                this.$lastLoggedCardBrand$delegate.setValue(null);
            } else if (textFieldState instanceof TextFieldStateConstants.Error.Invalid) {
                FieldError error = ((TextFieldStateConstants.Error.Invalid) textFieldState).getError();
                if (error != null && error.getErrorMessage() == R.string.stripe_disallowed_card_brand && DefaultCardNumberController.ComposeUI$lambda$22(this.$lastLoggedCardBrand$delegate) != this.this$0.impliedCardBrand.getValue()) {
                    this.$disallowedBrandReporter.onDisallowedCardBrandEntered((CardBrand) this.this$0.impliedCardBrand.getValue());
                    this.$lastLoggedCardBrand$delegate.setValue((CardBrand) this.this$0.impliedCardBrand.getValue());
                }
            } else {
                this.$lastLoggedCardBrand$delegate.setValue(null);
            }
            return Unit.INSTANCE;
        }
    }
}
