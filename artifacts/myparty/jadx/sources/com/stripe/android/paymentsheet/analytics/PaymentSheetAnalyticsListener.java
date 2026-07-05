package com.stripe.android.paymentsheet.analytics;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentSheetAnalyticsListener.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010#\u001a\u00020$J\u0012\u0010%\u001a\u00020$2\n\u0010&\u001a\u00060\rj\u0002`\u001aJ\u0010\u0010'\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0011H\u0002J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\bJ\u0010\u0010,\u001a\u00020$2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R4\u0010\u001b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a2\u000e\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010 \u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a2\u000e\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "currentScreen", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentPaymentMethodTypeProvider", "Lkotlin/Function0;", "", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "value", "", "previouslySentDeepLinkEvent", "getPreviouslySentDeepLinkEvent", "()Z", "setPreviouslySentDeepLinkEvent", "(Z)V", "previouslyPresentedSheet", "getPreviouslyPresentedSheet", "setPreviouslyPresentedSheet", "Lcom/stripe/android/model/PaymentMethodCode;", "previouslyShownForm", "getPreviouslyShownForm", "()Ljava/lang/String;", "setPreviouslyShownForm", "(Ljava/lang/String;)V", "previouslyInteractedForm", "getPreviouslyInteractedForm", "setPreviouslyInteractedForm", "cannotProperlyReturnFromLinkAndOtherLPMs", "", "reportFieldInteraction", "code", "reportPaymentSheetShown", "reportPaymentOptions", "isSaved", "reportPaymentSheetHidden", "hiddenScreen", "reportFormShown", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetAnalyticsListener {
    public static final String PREVIOUSLY_INTERACTION_PAYMENT_FORM = "previously_interacted_payment_form";
    public static final String PREVIOUSLY_PRESENTED_SHEET = "previously_presented_sheet";
    public static final String PREVIOUSLY_SENT_DEEP_LINK_EVENT = "previously_sent_deep_link_event";
    public static final String PREVIOUSLY_SHOWN_PAYMENT_FORM = "previously_shown_payment_form";
    private final Function0<String> currentPaymentMethodTypeProvider;
    private final EventReporter eventReporter;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    public PaymentSheetAnalyticsListener(SavedStateHandle savedStateHandle, EventReporter eventReporter, Flow<? extends PaymentSheetScreen> currentScreen, CoroutineScope coroutineScope, Function0<String> currentPaymentMethodTypeProvider) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(currentPaymentMethodTypeProvider, "currentPaymentMethodTypeProvider");
        this.savedStateHandle = savedStateHandle;
        this.eventReporter = eventReporter;
        this.currentPaymentMethodTypeProvider = currentPaymentMethodTypeProvider;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(currentScreen, this, null), 3, null);
    }

    private final boolean getPreviouslySentDeepLinkEvent() {
        Boolean bool = (Boolean) this.savedStateHandle.get(PREVIOUSLY_SENT_DEEP_LINK_EVENT);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setPreviouslySentDeepLinkEvent(boolean z) {
        this.savedStateHandle.set(PREVIOUSLY_SENT_DEEP_LINK_EVENT, Boolean.valueOf(z));
    }

    private final boolean getPreviouslyPresentedSheet() {
        Boolean bool = (Boolean) this.savedStateHandle.get(PREVIOUSLY_PRESENTED_SHEET);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setPreviouslyPresentedSheet(boolean z) {
        this.savedStateHandle.set(PREVIOUSLY_PRESENTED_SHEET, Boolean.valueOf(z));
    }

    private final String getPreviouslyShownForm() {
        return (String) this.savedStateHandle.get(PREVIOUSLY_SHOWN_PAYMENT_FORM);
    }

    private final void setPreviouslyShownForm(String str) {
        this.savedStateHandle.set(PREVIOUSLY_SHOWN_PAYMENT_FORM, str);
    }

    private final String getPreviouslyInteractedForm() {
        return (String) this.savedStateHandle.get(PREVIOUSLY_INTERACTION_PAYMENT_FORM);
    }

    private final void setPreviouslyInteractedForm(String str) {
        this.savedStateHandle.set(PREVIOUSLY_INTERACTION_PAYMENT_FORM, str);
    }

    /* compiled from: PaymentSheetAnalyticsListener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1", f = "PaymentSheetAnalyticsListener.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<PaymentSheetScreen> $currentScreen;
        int label;
        final /* synthetic */ PaymentSheetAnalyticsListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Flow<? extends PaymentSheetScreen> flow, PaymentSheetAnalyticsListener paymentSheetAnalyticsListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentScreen = flow;
            this.this$0 = paymentSheetAnalyticsListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$currentScreen, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PaymentSheetAnalyticsListener.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "screen", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1$1", f = "PaymentSheetAnalyticsListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02041 extends SuspendLambda implements Function2<PaymentSheetScreen, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaymentSheetAnalyticsListener this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02041(PaymentSheetAnalyticsListener paymentSheetAnalyticsListener, Continuation<? super C02041> continuation) {
                super(2, continuation);
                this.this$0 = paymentSheetAnalyticsListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02041 c02041 = new C02041(this.this$0, continuation);
                c02041.L$0 = obj;
                return c02041;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaymentSheetScreen paymentSheetScreen, Continuation<? super Unit> continuation) {
                return ((C02041) create(paymentSheetScreen, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.reportPaymentSheetShown((PaymentSheetScreen) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(this.$currentScreen, new C02041(this.this$0, null), this) == coroutine_suspended) {
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

    public final void cannotProperlyReturnFromLinkAndOtherLPMs() {
        if (getPreviouslySentDeepLinkEvent()) {
            return;
        }
        this.eventReporter.onCannotProperlyReturnFromLinkAndOtherLPMs();
        setPreviouslySentDeepLinkEvent(true);
    }

    public final void reportFieldInteraction(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (Intrinsics.areEqual(getPreviouslyInteractedForm(), code)) {
            return;
        }
        this.eventReporter.onPaymentMethodFormInteraction(code);
        setPreviouslyInteractedForm(code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportPaymentSheetShown(PaymentSheetScreen currentScreen) {
        if ((currentScreen instanceof PaymentSheetScreen.Loading) || (currentScreen instanceof PaymentSheetScreen.VerticalModeForm) || (currentScreen instanceof PaymentSheetScreen.CvcRecollection)) {
            return;
        }
        if (currentScreen instanceof PaymentSheetScreen.ManageSavedPaymentMethods) {
            this.eventReporter.onShowManageSavedPaymentMethods();
            return;
        }
        if (currentScreen instanceof PaymentSheetScreen.UpdatePaymentMethod) {
            this.eventReporter.onShowEditablePaymentOption();
            return;
        }
        if (currentScreen instanceof PaymentSheetScreen.SelectSavedPaymentMethods) {
            reportPaymentOptions(true);
            setPreviouslyShownForm(null);
            setPreviouslyInteractedForm(null);
        } else if (currentScreen instanceof PaymentSheetScreen.VerticalMode) {
            reportPaymentOptions(false);
        } else {
            if (!(currentScreen instanceof PaymentSheetScreen.AddFirstPaymentMethod) && !(currentScreen instanceof PaymentSheetScreen.AddAnotherPaymentMethod)) {
                throw new NoWhenBranchMatchedException();
            }
            reportFormShown(this.currentPaymentMethodTypeProvider.invoke());
            reportPaymentOptions(false);
        }
    }

    private final void reportPaymentOptions(boolean isSaved) {
        if (!getPreviouslyPresentedSheet()) {
            if (isSaved) {
                this.eventReporter.onShowExistingPaymentOptions();
            } else {
                this.eventReporter.onShowNewPaymentOptions();
            }
        }
        setPreviouslyPresentedSheet(true);
    }

    public final void reportPaymentSheetHidden(PaymentSheetScreen hiddenScreen) {
        Intrinsics.checkNotNullParameter(hiddenScreen, "hiddenScreen");
        if (hiddenScreen instanceof PaymentSheetScreen.UpdatePaymentMethod) {
            this.eventReporter.onHideEditablePaymentOption();
        }
    }

    private final void reportFormShown(String code) {
        if (Intrinsics.areEqual(getPreviouslyShownForm(), code)) {
            return;
        }
        this.eventReporter.onPaymentMethodFormShown(code);
        setPreviouslyShownForm(code);
    }
}
