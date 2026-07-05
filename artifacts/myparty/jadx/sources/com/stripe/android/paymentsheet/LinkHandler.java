package com.stripe.android.paymentsheet;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.paymentsheet.state.LinkState;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: LinkHandler.kt */
@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0018\u0010\u0016\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/LinkHandler;", "", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "<init>", "(Lcom/stripe/android/link/LinkConfigurationCoordinator;)V", "getLinkConfigurationCoordinator", "()Lcom/stripe/android/link/LinkConfigurationCoordinator;", "_isLinkEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isLinkEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "linkConfiguration", "getLinkConfiguration", "setupLink", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/LinkState;", "setupLinkWithEagerLaunch", "(Lcom/stripe/android/paymentsheet/state/LinkState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attestationCheckPassed", "configuration", "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkHandler {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isLinkEnabled;
    private final MutableStateFlow<LinkConfiguration> _linkConfiguration;
    private final StateFlow<Boolean> isLinkEnabled;
    private final StateFlow<LinkConfiguration> linkConfiguration;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;

    /* compiled from: LinkHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkState.LoginState.values().length];
            try {
                iArr[LinkState.LoginState.LoggedIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkState.LoginState.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkState.LoginState.LoggedOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LinkHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkHandler", f = "LinkHandler.kt", i = {}, l = {59}, m = "attestationCheckPassed", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.LinkHandler$attestationCheckPassed$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkHandler.this.attestationCheckPassed(null, this);
        }
    }

    @Inject
    public LinkHandler(LinkConfigurationCoordinator linkConfigurationCoordinator) {
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._isLinkEnabled = MutableStateFlow;
        this.isLinkEnabled = MutableStateFlow;
        MutableStateFlow<LinkConfiguration> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._linkConfiguration = MutableStateFlow2;
        this.linkConfiguration = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final LinkConfigurationCoordinator getLinkConfigurationCoordinator() {
        return this.linkConfigurationCoordinator;
    }

    public final StateFlow<Boolean> isLinkEnabled() {
        return this.isLinkEnabled;
    }

    public final StateFlow<LinkConfiguration> getLinkConfiguration() {
        return this.linkConfiguration;
    }

    public final void setupLink(LinkState state) {
        this._isLinkEnabled.setValue(Boolean.valueOf(state != null));
        if (state == null) {
            return;
        }
        this._linkConfiguration.setValue(state.getConfiguration());
        this.linkConfigurationCoordinator.getComponent(state.getConfiguration());
    }

    public final Object setupLinkWithEagerLaunch(LinkState linkState, Continuation<? super Boolean> continuation) {
        LinkConfiguration configuration;
        setupLink(linkState);
        if (linkState == null || (configuration = linkState.getConfiguration()) == null) {
            return Boxing.boxBoolean(false);
        }
        if (this.linkConfigurationCoordinator.linkGate(configuration).getSuppress2faModal()) {
            return Boxing.boxBoolean(false);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[linkState.getLoginState().ordinal()];
        if (i == 1 || i == 2) {
            return attestationCheckPassed(configuration, continuation);
        }
        if (i == 3) {
            return Boxing.boxBoolean(false);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attestationCheckPassed(LinkConfiguration linkConfiguration, Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            LinkAttestationCheck linkAttestationCheck = this.linkConfigurationCoordinator.linkAttestationCheck(linkConfiguration);
            anonymousClass1.label = 1;
            objInvoke = linkAttestationCheck.invoke(anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        LinkAttestationCheck.Result result = (LinkAttestationCheck.Result) objInvoke;
        if ((result instanceof LinkAttestationCheck.Result.AccountError) || (result instanceof LinkAttestationCheck.Result.AttestationFailed) || (result instanceof LinkAttestationCheck.Result.Error)) {
            z = false;
        } else if (!Intrinsics.areEqual(result, LinkAttestationCheck.Result.Successful.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boxing.boxBoolean(z);
    }

    public final void logOut() {
        LinkConfiguration value = this.linkConfiguration.getValue();
        if (value == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C11001(value, null), 3, null);
    }

    /* compiled from: LinkHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.LinkHandler$logOut$1", f = "LinkHandler.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.LinkHandler$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C11001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkConfiguration $configuration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11001(LinkConfiguration linkConfiguration, Continuation<? super C11001> continuation) {
            super(2, continuation);
            this.$configuration = linkConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkHandler.this.new C11001(this.$configuration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LinkHandler.this.getLinkConfigurationCoordinator().mo7680logOutgIAlus(this.$configuration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }
}
