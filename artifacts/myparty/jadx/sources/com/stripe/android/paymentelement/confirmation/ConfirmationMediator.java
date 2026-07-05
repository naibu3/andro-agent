package com.stripe.android.paymentelement.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler.Option;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.paymentsheet.R;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ConfirmationMediator.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 0*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u0004*\b\b\u0003\u0010\u0005*\u00020\u00062\u00020\u0007:\u0003./0B/\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"0&J\u0006\u0010(\u001a\u00020\"J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020 H\u0086@¢\u0006\u0002\u0010-R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;", "TConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "TLauncher", "TLauncherArgs", "TLauncherResult", "Landroid/os/Parcelable;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "definition", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;)V", "launcher", "Ljava/lang/Object;", "parametersKey", "", "value", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Parameters;", "persistedParameters", "getPersistedParameters", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Parameters;", "setPersistedParameters", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Parameters;)V", SDKConstants.PARAM_KEY, "getKey", "()Ljava/lang/String;", "canConfirm", "", "confirmationOption", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "unregister", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", "option", "parameters", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Action", ConfirmationMediator.PARAMETERS_POSTFIX_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmationMediator<TConfirmationOption extends ConfirmationHandler.Option, TLauncher, TLauncherArgs, TLauncherResult extends Parcelable> {
    private static final String PARAMETERS_POSTFIX_KEY = "Parameters";
    private final ConfirmationDefinition<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> definition;
    private final String key;
    private TLauncher launcher;
    private final String parametersKey;
    private final SavedStateHandle savedStateHandle;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConfirmationMediator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.ConfirmationMediator", f = "ConfirmationMediator.kt", i = {0, 0, 0}, l = {AESGCM.IV_BIT_LENGTH}, m = "action", n = {"this", "parameters", "confirmationOption"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.ConfirmationMediator$action$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ConfirmationMediator<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ConfirmationMediator<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationMediator, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = confirmationMediator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.action(null, null, this);
        }
    }

    public ConfirmationMediator(SavedStateHandle savedStateHandle, ConfirmationDefinition<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> definition) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(definition, "definition");
        this.savedStateHandle = savedStateHandle;
        this.definition = definition;
        this.parametersKey = definition.getKey() + PARAMETERS_POSTFIX_KEY;
        this.key = definition.getKey();
    }

    private final Parameters<TConfirmationOption> getPersistedParameters() {
        return (Parameters) this.savedStateHandle.get(this.parametersKey);
    }

    private final void setPersistedParameters(Parameters<TConfirmationOption> parameters) {
        this.savedStateHandle.set(this.parametersKey, parameters);
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean canConfirm(ConfirmationHandler.Option confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        ConfirmationHandler.Option option = this.definition.option(confirmationOption);
        if (option != null) {
            return this.definition.canConfirm(option, confirmationParameters);
        }
        return false;
    }

    public final void register(ActivityResultCaller activityResultCaller, final Function1<? super ConfirmationDefinition.Result, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.launcher = this.definition.createLauncher(activityResultCaller, new Function1() { // from class: com.stripe.android.paymentelement.confirmation.ConfirmationMediator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConfirmationMediator.register$lambda$3(this.f$0, onResult, (Parcelable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit register$lambda$3(ConfirmationMediator confirmationMediator, Function1 function1, Parcelable result) {
        ConfirmationDefinition.Result failed;
        Intrinsics.checkNotNullParameter(result, "result");
        Parameters<TConfirmationOption> persistedParameters = confirmationMediator.getPersistedParameters();
        if (persistedParameters == null || (failed = confirmationMediator.definition.toResult(persistedParameters.getConfirmationOption(), persistedParameters.getConfirmationParameters(), persistedParameters.getDeferredIntentConfirmationType(), result)) == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Arguments should have been initialized before handling result!");
            failed = new ConfirmationDefinition.Result.Failed(illegalStateException, ExceptionKtKt.stripeErrorMessage(illegalStateException), ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE);
        }
        function1.invoke(failed);
        return Unit.INSTANCE;
    }

    public final void unregister() {
        TLauncher tlauncher = this.launcher;
        if (tlauncher != null) {
            this.definition.unregister(tlauncher);
        }
        this.launcher = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object action(ConfirmationHandler.Option option, ConfirmationDefinition.Parameters parameters, Continuation<? super Action> continuation) {
        AnonymousClass1 anonymousClass1;
        final ConfirmationMediator<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationMediator;
        final ConfirmationHandler.Option option2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConfirmationHandler.Option option3 = this.definition.option(option);
            if (option3 == null) {
                return new Action.Fail(new IllegalArgumentException("Parameter type of '" + Reflection.getOrCreateKotlinClass(option.getClass()).getSimpleName() + "' cannot be used with " + Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + " to read a result"), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_something_went_wrong), ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE);
            }
            ConfirmationDefinition<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationDefinition = this.definition;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = parameters;
            anonymousClass1.L$2 = option3;
            anonymousClass1.label = 1;
            Object objAction = confirmationDefinition.action(option3, parameters, anonymousClass1);
            if (objAction == coroutine_suspended) {
                return coroutine_suspended;
            }
            confirmationMediator = this;
            option2 = option3;
            obj = objAction;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConfirmationHandler.Option option4 = (ConfirmationHandler.Option) anonymousClass1.L$2;
            parameters = (ConfirmationDefinition.Parameters) anonymousClass1.L$1;
            ConfirmationMediator<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationMediator2 = (ConfirmationMediator) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            option2 = option4;
            confirmationMediator = confirmationMediator2;
        }
        final ConfirmationDefinition.Parameters parameters2 = parameters;
        final ConfirmationDefinition.Action action = (ConfirmationDefinition.Action) obj;
        if (action instanceof ConfirmationDefinition.Action.Launch) {
            final TLauncher tlauncher = confirmationMediator.launcher;
            if (tlauncher != null) {
                return new Action.Launch(new Function0() { // from class: com.stripe.android.paymentelement.confirmation.ConfirmationMediator$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConfirmationMediator.action$lambda$6$lambda$5(this.f$0, option2, parameters2, action, tlauncher);
                    }
                }, ((ConfirmationDefinition.Action.Launch) action).getReceivesResultInProcess());
            }
            IllegalStateException illegalStateException = new IllegalStateException("No launcher for " + Reflection.getOrCreateKotlinClass(confirmationMediator.definition.getClass()).getSimpleName() + " was found, did you call register?");
            return new Action.Fail(illegalStateException, ExceptionKtKt.stripeErrorMessage(illegalStateException), ConfirmationHandler.Result.Failed.ErrorType.Fatal.INSTANCE);
        }
        if (action instanceof ConfirmationDefinition.Action.Complete) {
            ConfirmationDefinition.Action.Complete complete = (ConfirmationDefinition.Action.Complete) action;
            return new Action.Complete(complete.getIntent(), complete.getConfirmationOption(), complete.getDeferredIntentConfirmationType(), complete.getCompletedFullPaymentFlow());
        }
        if (!(action instanceof ConfirmationDefinition.Action.Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        ConfirmationDefinition.Action.Fail fail = (ConfirmationDefinition.Action.Fail) action;
        return new Action.Fail(fail.getCause(), fail.getMessage(), fail.getErrorType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit action$lambda$6$lambda$5(ConfirmationMediator confirmationMediator, ConfirmationHandler.Option option, ConfirmationDefinition.Parameters parameters, ConfirmationDefinition.Action action, Object obj) {
        ConfirmationDefinition.Action.Launch launch = (ConfirmationDefinition.Action.Launch) action;
        confirmationMediator.setPersistedParameters(new Parameters<>(option, parameters, launch.getDeferredIntentConfirmationType()));
        confirmationMediator.definition.launch(obj, launch.getLauncherArguments(), option, parameters);
        return Unit.INSTANCE;
    }

    /* compiled from: ConfirmationMediator.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", "", "Launch", "Fail", "Complete", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        /* compiled from: ConfirmationMediator.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", "launch", "Lkotlin/Function0;", "", "receivesResultInProcess", "", "<init>", "(Lkotlin/jvm/functions/Function0;Z)V", "getLaunch", "()Lkotlin/jvm/functions/Function0;", "getReceivesResultInProcess", "()Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Launch implements Action {
            public static final int $stable = 0;
            private final Function0<Unit> launch;
            private final boolean receivesResultInProcess;

            public Launch(Function0<Unit> launch, boolean z) {
                Intrinsics.checkNotNullParameter(launch, "launch");
                this.launch = launch;
                this.receivesResultInProcess = z;
            }

            public final Function0<Unit> getLaunch() {
                return this.launch;
            }

            public final boolean getReceivesResultInProcess() {
                return this.receivesResultInProcess;
            }
        }

        /* compiled from: ConfirmationMediator.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Fail;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", "cause", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "errorType", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getErrorType", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Fail implements Action {
            public static final int $stable = 8;
            private final Throwable cause;
            private final ConfirmationHandler.Result.Failed.ErrorType errorType;
            private final ResolvableString message;

            public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, ResolvableString resolvableString, ConfirmationHandler.Result.Failed.ErrorType errorType, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = fail.cause;
                }
                if ((i & 2) != 0) {
                    resolvableString = fail.message;
                }
                if ((i & 4) != 0) {
                    errorType = fail.errorType;
                }
                return fail.copy(th, resolvableString, errorType);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* renamed from: component2, reason: from getter */
            public final ResolvableString getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final ConfirmationHandler.Result.Failed.ErrorType getErrorType() {
                return this.errorType;
            }

            public final Fail copy(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType errorType) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                return new Fail(cause, message, errorType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fail)) {
                    return false;
                }
                Fail fail = (Fail) other;
                return Intrinsics.areEqual(this.cause, fail.cause) && Intrinsics.areEqual(this.message, fail.message) && Intrinsics.areEqual(this.errorType, fail.errorType);
            }

            public int hashCode() {
                return (((this.cause.hashCode() * 31) + this.message.hashCode()) * 31) + this.errorType.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.cause + ", message=" + this.message + ", errorType=" + this.errorType + ")";
            }

            public Fail(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType errorType) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.cause = cause;
                this.message = message;
                this.errorType = errorType;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final ResolvableString getMessage() {
                return this.message;
            }

            public final ConfirmationHandler.Result.Failed.ErrorType getErrorType() {
                return this.errorType;
            }
        }

        /* compiled from: ConfirmationMediator.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Complete;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "completedFullPaymentFlow", "", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getCompletedFullPaymentFlow", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete implements Action {
            public static final int $stable = 8;
            private final boolean completedFullPaymentFlow;
            private final ConfirmationHandler.Option confirmationOption;
            private final DeferredIntentConfirmationType deferredIntentConfirmationType;
            private final StripeIntent intent;

            public static /* synthetic */ Complete copy$default(Complete complete, StripeIntent stripeIntent, ConfirmationHandler.Option option, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    stripeIntent = complete.intent;
                }
                if ((i & 2) != 0) {
                    option = complete.confirmationOption;
                }
                if ((i & 4) != 0) {
                    deferredIntentConfirmationType = complete.deferredIntentConfirmationType;
                }
                if ((i & 8) != 0) {
                    z = complete.completedFullPaymentFlow;
                }
                return complete.copy(stripeIntent, option, deferredIntentConfirmationType, z);
            }

            /* renamed from: component1, reason: from getter */
            public final StripeIntent getIntent() {
                return this.intent;
            }

            /* renamed from: component2, reason: from getter */
            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            /* renamed from: component3, reason: from getter */
            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }

            public final Complete copy(StripeIntent intent, ConfirmationHandler.Option confirmationOption, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean completedFullPaymentFlow) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                return new Complete(intent, confirmationOption, deferredIntentConfirmationType, completedFullPaymentFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.intent, complete.intent) && Intrinsics.areEqual(this.confirmationOption, complete.confirmationOption) && this.deferredIntentConfirmationType == complete.deferredIntentConfirmationType && this.completedFullPaymentFlow == complete.completedFullPaymentFlow;
            }

            public int hashCode() {
                int iHashCode = ((this.intent.hashCode() * 31) + this.confirmationOption.hashCode()) * 31;
                DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
                return ((iHashCode + (deferredIntentConfirmationType == null ? 0 : deferredIntentConfirmationType.hashCode())) * 31) + Boolean.hashCode(this.completedFullPaymentFlow);
            }

            public String toString() {
                return "Complete(intent=" + this.intent + ", confirmationOption=" + this.confirmationOption + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ", completedFullPaymentFlow=" + this.completedFullPaymentFlow + ")";
            }

            public Complete(StripeIntent intent, ConfirmationHandler.Option confirmationOption, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                this.intent = intent;
                this.confirmationOption = confirmationOption;
                this.deferredIntentConfirmationType = deferredIntentConfirmationType;
                this.completedFullPaymentFlow = z;
            }

            public /* synthetic */ Complete(StripeIntent stripeIntent, ConfirmationHandler.Option option, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(stripeIntent, option, (i & 4) != 0 ? null : deferredIntentConfirmationType, z);
            }

            public final StripeIntent getIntent() {
                return this.intent;
            }

            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }
        }
    }

    /* compiled from: ConfirmationMediator.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u0000*\b\b\u0004\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00028\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u0013\u0010\u0004\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Parameters;", "TConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Landroid/os/Parcelable;", "confirmationOption", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getConfirmationParameters", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "component2", "component3", "copy", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Parameters;", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Parameters<TConfirmationOption extends ConfirmationHandler.Option> implements Parcelable {
        private final TConfirmationOption confirmationOption;
        private final ConfirmationDefinition.Parameters confirmationParameters;
        private final DeferredIntentConfirmationType deferredIntentConfirmationType;
        public static final Parcelable.Creator<Parameters<?>> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ConfirmationMediator.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parameters<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Parameters<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Parameters<>((ConfirmationHandler.Option) parcel.readParcelable(Parameters.class.getClassLoader()), ConfirmationDefinition.Parameters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeferredIntentConfirmationType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Parameters<?>[] newArray(int i) {
                return new Parameters[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Parameters copy$default(Parameters parameters, ConfirmationHandler.Option option, ConfirmationDefinition.Parameters parameters2, DeferredIntentConfirmationType deferredIntentConfirmationType, int i, Object obj) {
            if ((i & 1) != 0) {
                option = parameters.confirmationOption;
            }
            if ((i & 2) != 0) {
                parameters2 = parameters.confirmationParameters;
            }
            if ((i & 4) != 0) {
                deferredIntentConfirmationType = parameters.deferredIntentConfirmationType;
            }
            return parameters.copy(option, parameters2, deferredIntentConfirmationType);
        }

        public final TConfirmationOption component1() {
            return this.confirmationOption;
        }

        /* renamed from: component2, reason: from getter */
        public final ConfirmationDefinition.Parameters getConfirmationParameters() {
            return this.confirmationParameters;
        }

        /* renamed from: component3, reason: from getter */
        public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
            return this.deferredIntentConfirmationType;
        }

        public final Parameters<TConfirmationOption> copy(TConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType) {
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
            return new Parameters<>(confirmationOption, confirmationParameters, deferredIntentConfirmationType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.confirmationOption, parameters.confirmationOption) && Intrinsics.areEqual(this.confirmationParameters, parameters.confirmationParameters) && this.deferredIntentConfirmationType == parameters.deferredIntentConfirmationType;
        }

        public int hashCode() {
            int iHashCode = ((this.confirmationOption.hashCode() * 31) + this.confirmationParameters.hashCode()) * 31;
            DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
            return iHashCode + (deferredIntentConfirmationType == null ? 0 : deferredIntentConfirmationType.hashCode());
        }

        public String toString() {
            return "Parameters(confirmationOption=" + this.confirmationOption + ", confirmationParameters=" + this.confirmationParameters + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.confirmationOption, flags);
            this.confirmationParameters.writeToParcel(dest, flags);
            DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
            if (deferredIntentConfirmationType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(deferredIntentConfirmationType.name());
            }
        }

        public Parameters(TConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType) {
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
            this.confirmationOption = confirmationOption;
            this.confirmationParameters = confirmationParameters;
            this.deferredIntentConfirmationType = deferredIntentConfirmationType;
        }

        public final TConfirmationOption getConfirmationOption() {
            return this.confirmationOption;
        }

        public final ConfirmationDefinition.Parameters getConfirmationParameters() {
            return this.confirmationParameters;
        }

        public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
            return this.deferredIntentConfirmationType;
        }
    }

    /* compiled from: ConfirmationMediator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Companion;", "", "<init>", "()V", "PARAMETERS_POSTFIX_KEY", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
