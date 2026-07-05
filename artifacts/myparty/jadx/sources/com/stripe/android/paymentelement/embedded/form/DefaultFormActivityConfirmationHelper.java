package com.stripe.android.paymentelement.embedded.form;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationOptionKtxKt;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.form.FormResult;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FormActivityConfirmationHelper.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "stateHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "onClickDelegate", "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultCaller;Lkotlinx/coroutines/CoroutineScope;)V", "confirm", "Lcom/stripe/android/paymentelement/embedded/form/FormResult;", "confirmationArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@FormActivityScope
/* loaded from: classes5.dex */
public final class DefaultFormActivityConfirmationHelper implements FormActivityConfirmationHelper {
    public static final int $stable = 8;
    private final EmbeddedPaymentElement.Configuration configuration;
    private final ConfirmationHandler confirmationHandler;
    private final CoroutineScope coroutineScope;
    private final EventReporter eventReporter;
    private final PaymentElementLoader.InitializationMode initializationMode;
    private final OnClickOverrideDelegate onClickDelegate;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final EmbeddedSelectionHolder selectionHolder;
    private final FormActivityStateHelper stateHelper;

    /* compiled from: FormActivityConfirmationHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbeddedPaymentElement.FormSheetAction.values().length];
            try {
                iArr[EmbeddedPaymentElement.FormSheetAction.Continue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbeddedPaymentElement.FormSheetAction.Confirm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultFormActivityConfirmationHelper(PaymentElementLoader.InitializationMode initializationMode, PaymentMethodMetadata paymentMethodMetadata, ConfirmationHandler confirmationHandler, EmbeddedPaymentElement.Configuration configuration, EmbeddedSelectionHolder selectionHolder, FormActivityStateHelper stateHelper, OnClickOverrideDelegate onClickDelegate, EventReporter eventReporter, LifecycleOwner lifecycleOwner, ActivityResultCaller activityResultCaller, @ViewModelScope CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(stateHelper, "stateHelper");
        Intrinsics.checkNotNullParameter(onClickDelegate, "onClickDelegate");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.initializationMode = initializationMode;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.confirmationHandler = confirmationHandler;
        this.configuration = configuration;
        this.selectionHolder = selectionHolder;
        this.stateHelper = stateHelper;
        this.onClickDelegate = onClickDelegate;
        this.eventReporter = eventReporter;
        this.coroutineScope = coroutineScope;
        confirmationHandler.register(activityResultCaller, lifecycleOwner);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: FormActivityConfirmationHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.form.DefaultFormActivityConfirmationHelper$1", f = "FormActivityConfirmationHelper.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.form.DefaultFormActivityConfirmationHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFormActivityConfirmationHelper.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FormActivityConfirmationHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.form.DefaultFormActivityConfirmationHelper$1$1", f = "FormActivityConfirmationHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentelement.embedded.form.DefaultFormActivityConfirmationHelper$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01911 extends SuspendLambda implements Function2<ConfirmationHandler.State, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultFormActivityConfirmationHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01911(DefaultFormActivityConfirmationHelper defaultFormActivityConfirmationHelper, Continuation<? super C01911> continuation) {
                super(2, continuation);
                this.this$0 = defaultFormActivityConfirmationHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01911 c01911 = new C01911(this.this$0, continuation);
                c01911.L$0 = obj;
                return c01911;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmationHandler.State state, Continuation<? super Unit> continuation) {
                return ((C01911) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.stateHelper.updateConfirmationState((ConfirmationHandler.State) this.L$0);
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
                if (FlowKt.collectLatest(DefaultFormActivityConfirmationHelper.this.confirmationHandler.getState(), new C01911(DefaultFormActivityConfirmationHelper.this, null), this) == coroutine_suspended) {
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

    @Override // com.stripe.android.paymentelement.embedded.form.FormActivityConfirmationHelper
    public FormResult confirm() {
        if (this.onClickDelegate.getOnClickOverride() != null) {
            Function0<Unit> onClickOverride = this.onClickDelegate.getOnClickOverride();
            if (onClickOverride != null) {
                onClickOverride.invoke();
            }
        } else {
            PaymentSelection value = this.selectionHolder.getSelection().getValue();
            if (value != null) {
                this.eventReporter.onPressConfirmButton(value);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[this.configuration.getFormSheetAction().ordinal()];
            if (i == 1) {
                return new FormResult.Complete(this.selectionHolder.getSelection().getValue(), false);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConfirmationHandler.Args argsConfirmationArgs = confirmationArgs();
            if (argsConfirmationArgs != null) {
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DefaultFormActivityConfirmationHelper$confirm$2$1(this, argsConfirmationArgs, null), 3, null);
            }
        }
        return null;
    }

    private final ConfirmationHandler.Args confirmationArgs() {
        PaymentSelection value = this.selectionHolder.getSelection().getValue();
        if (value != null) {
            CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(this.configuration);
            LinkState linkState = this.paymentMethodMetadata.getLinkState();
            ConfirmationHandler.Option confirmationOption = ConfirmationOptionKtxKt.toConfirmationOption(value, commonConfigurationAsCommonConfiguration, linkState != null ? linkState.getConfiguration() : null);
            if (confirmationOption != null) {
                return new ConfirmationHandler.Args(this.paymentMethodMetadata.getStripeIntent(), confirmationOption, this.configuration.getAppearance(), this.initializationMode, this.paymentMethodMetadata.getShippingDetails());
            }
        }
        return null;
    }
}
