package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.MutableState;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporter;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CardNumberController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$2$1", f = "CardNumberController.kt", i = {}, l = {412}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultCardNumberController$ComposeUI$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnalyticsEventReporter $analyticsEventReporter;
    final /* synthetic */ MutableState<Boolean> $hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate;
    int label;
    final /* synthetic */ DefaultCardNumberController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultCardNumberController$ComposeUI$2$1(DefaultCardNumberController defaultCardNumberController, MutableState<Boolean> mutableState, AnalyticsEventReporter analyticsEventReporter, Continuation<? super DefaultCardNumberController$ComposeUI$2$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultCardNumberController;
        this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate = mutableState;
        this.$analyticsEventReporter = analyticsEventReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultCardNumberController$ComposeUI$2$1(this.this$0, this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, this.$analyticsEventReporter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultCardNumberController$ComposeUI$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(FlowKt.combine(FlowKt.drop(this.this$0.getFieldState(), 1), this.this$0.getFieldValue(), this.this$0._hasFocus, new AnonymousClass1(this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, null)), new AnonymousClass2(this.$analyticsEventReporter, this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, null), this) == coroutine_suspended) {
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
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldValue", "", "hasFocus"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$2$1$1", f = "CardNumberController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function4<TextFieldState, String, Boolean, Continuation<? super Boolean>, Object> {
        final /* synthetic */ MutableState<Boolean> $hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
            this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate = mutableState;
        }

        public final Object invoke(TextFieldState textFieldState, String str, boolean z, Continuation<? super Boolean> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, continuation);
            anonymousClass1.L$0 = textFieldState;
            anonymousClass1.L$1 = str;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(TextFieldState textFieldState, String str, Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(textFieldState, str, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean((((TextFieldState) this.L$0) instanceof TextFieldStateConstants.Error.Incomplete) && !this.Z$0 && !DefaultCardNumberController.ComposeUI$lambda$26(this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate) && ((String) this.L$1).length() == 16);
        }
    }

    /* compiled from: CardNumberController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$2$1$2", f = "CardNumberController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEventReporter $analyticsEventReporter;
        final /* synthetic */ MutableState<Boolean> $hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnalyticsEventReporter analyticsEventReporter, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$analyticsEventReporter = analyticsEventReporter;
            this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$analyticsEventReporter, this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                this.$analyticsEventReporter.onAnalyticsEvent(PaymentAnalyticsEvent.CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields);
                DefaultCardNumberController.ComposeUI$lambda$27(this.$hasReportedIncompleteCardNumberRequiringMoreThan16Digits$delegate, true);
            }
            return Unit.INSTANCE;
        }
    }
}
