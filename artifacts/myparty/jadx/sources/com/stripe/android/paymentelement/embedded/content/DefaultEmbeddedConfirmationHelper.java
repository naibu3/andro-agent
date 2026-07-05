package com.stripe.android.paymentelement.embedded.content;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationOptionKtxKt;
import com.stripe.android.paymentelement.embedded.EmbeddedResultCallbackHelper;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.utils.ConfirmationReportingUtilsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EmbeddedConfirmationHelper.kt */
@EmbeddedPaymentElementScope
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;", "confirmationStarter", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "confirmationStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "embeddedResultCallbackHelper", "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V", "confirm", "", "confirmationArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedConfirmationHelper implements EmbeddedConfirmationHelper {
    public static final int $stable = 8;
    private final ActivityResultCaller activityResultCaller;
    private final EmbeddedConfirmationStarter confirmationStarter;
    private final EmbeddedConfirmationStateHolder confirmationStateHolder;
    private final EmbeddedResultCallbackHelper embeddedResultCallbackHelper;
    private final EventReporter eventReporter;
    private final LifecycleOwner lifecycleOwner;

    @Inject
    public DefaultEmbeddedConfirmationHelper(EmbeddedConfirmationStarter confirmationStarter, ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner, EmbeddedConfirmationStateHolder confirmationStateHolder, EventReporter eventReporter, EmbeddedResultCallbackHelper embeddedResultCallbackHelper) {
        Intrinsics.checkNotNullParameter(confirmationStarter, "confirmationStarter");
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(confirmationStateHolder, "confirmationStateHolder");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(embeddedResultCallbackHelper, "embeddedResultCallbackHelper");
        this.confirmationStarter = confirmationStarter;
        this.activityResultCaller = activityResultCaller;
        this.lifecycleOwner = lifecycleOwner;
        this.confirmationStateHolder = confirmationStateHolder;
        this.eventReporter = eventReporter;
        this.embeddedResultCallbackHelper = embeddedResultCallbackHelper;
        confirmationStarter.register(activityResultCaller, lifecycleOwner);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: EmbeddedConfirmationHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfirmationHelper$1", f = "EmbeddedConfirmationHelper.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfirmationHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultEmbeddedConfirmationHelper.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ConfirmationHandler.Result> result = DefaultEmbeddedConfirmationHelper.this.confirmationStarter.getResult();
                final DefaultEmbeddedConfirmationHelper defaultEmbeddedConfirmationHelper = DefaultEmbeddedConfirmationHelper.this;
                this.label = 1;
                if (result.collect(new FlowCollector() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfirmationHelper.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfirmationHandler.Result) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ConfirmationHandler.Result result2, Continuation<? super Unit> continuation) {
                        EventReporter eventReporter = defaultEmbeddedConfirmationHelper.eventReporter;
                        EmbeddedConfirmationStateHolder.State state = defaultEmbeddedConfirmationHelper.confirmationStateHolder.getState();
                        ConfirmationReportingUtilsKt.reportPaymentResult(eventReporter, result2, state != null ? state.getSelection() : null);
                        defaultEmbeddedConfirmationHelper.embeddedResultCallbackHelper.setResult(EmbeddedConfirmationHelperKt.asEmbeddedResult(result2));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationHelper
    public void confirm() {
        ConfirmationHandler.Args argsConfirmationArgs = confirmationArgs();
        if (argsConfirmationArgs != null) {
            this.confirmationStarter.start(argsConfirmationArgs);
        } else {
            this.embeddedResultCallbackHelper.setResult(new EmbeddedPaymentElement.Result.Failed(new IllegalStateException("Not in a state that's confirmable.")));
        }
    }

    private final ConfirmationHandler.Args confirmationArgs() {
        PaymentSelection selection;
        EmbeddedConfirmationStateHolder.State state = this.confirmationStateHolder.getState();
        if (state != null && (selection = state.getSelection()) != null) {
            CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(state.getConfiguration());
            LinkState linkState = state.getPaymentMethodMetadata().getLinkState();
            ConfirmationHandler.Option confirmationOption = ConfirmationOptionKtxKt.toConfirmationOption(selection, commonConfigurationAsCommonConfiguration, linkState != null ? linkState.getConfiguration() : null);
            if (confirmationOption != null) {
                return new ConfirmationHandler.Args(state.getPaymentMethodMetadata().getStripeIntent(), confirmationOption, state.getConfiguration().getAppearance(), state.getInitializationMode(), state.getConfiguration().getShippingDetails());
            }
        }
        return null;
    }
}
