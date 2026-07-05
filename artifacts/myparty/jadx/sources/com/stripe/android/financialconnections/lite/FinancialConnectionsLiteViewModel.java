package com.stripe.android.financialconnections.lite;

import android.content.Context;
import android.net.Uri;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.di.Di;
import com.stripe.android.financialconnections.lite.repository.FinancialConnectionsLiteRepository;
import com.stripe.android.financialconnections.lite.repository.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.utils.HostedAuthUrlBuilder;
import com.stripe.android.financialconnections.utils.InstantDebitsResultBuilder;
import com.stripe.android.model.Token;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: FinancialConnectionsLiteViewModel.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0003678B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0002J)\u0010-\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 0/H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00069"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;", "Landroidx/lifecycle/ViewModel;", "logger", "Lcom/stripe/android/core/Logger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;", "workContext", "Lkotlinx/coroutines/CoroutineDispatcher;", NamedConstantsKt.APPLICATION_ID, "", "<init>", "(Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)V", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "_viewEffects", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;", "viewEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getViewEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleUrl", "Lkotlin/Result;", "", ShareConstants.MEDIA_URI, "handleUrl-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "onSuccessFromTokenFlow", "userCancelled", "", "onSuccessFromDataFlow", "onSuccessFromInstantDebits", "Lkotlinx/coroutines/Job;", "url", "onAuthFlowCanceled", "launchInBrowser", "withState", "block", "Lkotlin/Function1;", "withState-IoAF18A", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "handleError", "error", "", "message", "State", "ViewEffect", "Factory", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsLiteViewModel extends ViewModel {
    private final MutableStateFlow<State> _state;
    private final MutableSharedFlow<ViewEffect> _viewEffects;
    private final FinancialConnectionsSheetActivityArgs args;
    private final Logger logger;
    private final FinancialConnectionsLiteRepository repository;
    private final StateFlow<State> state;
    private final SharedFlow<ViewEffect> viewEffects;
    private final CoroutineDispatcher workContext;

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetFlowType.values().length];
            try {
                iArr[FinancialConnectionsSheetFlowType.ForData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForInstantDebits.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinancialConnectionsLiteViewModel(Logger logger, SavedStateHandle savedStateHandle, FinancialConnectionsLiteRepository repository, CoroutineDispatcher workContext, String applicationId) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.logger = logger;
        this.repository = repository;
        this.workContext = workContext;
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) savedStateHandle.get(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS);
        if (financialConnectionsSheetActivityArgs == null) {
            throw new IllegalStateException("Missing arguments");
        }
        this.args = financialConnectionsSheetActivityArgs;
        MutableSharedFlow<ViewEffect> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._viewEffects = mutableSharedFlowMutableSharedFlow$default;
        this.viewEffects = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<State> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), workContext, null, new AnonymousClass1(applicationId, null), 2, null);
    }

    public final SharedFlow<ViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final StateFlow<State> getState() {
        return this.state;
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {57, 68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $applicationId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$applicationId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = FinancialConnectionsLiteViewModel.this.new AnonymousClass1(this.$applicationId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        
            if (r10.emit(r1, r9) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel;
            Object objMo7507synchronize0E7RQCE;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                financialConnectionsLiteViewModel = FinancialConnectionsLiteViewModel.this;
                String str = this.$applicationId;
                Result.Companion companion2 = Result.INSTANCE;
                FinancialConnectionsLiteRepository financialConnectionsLiteRepository = financialConnectionsLiteViewModel.repository;
                FinancialConnectionsSheetConfiguration configuration = financialConnectionsLiteViewModel.args.getConfiguration();
                this.L$0 = financialConnectionsLiteViewModel;
                this.label = 1;
                objMo7507synchronize0E7RQCE = financialConnectionsLiteRepository.mo7507synchronize0E7RQCE(configuration, str, this);
                if (objMo7507synchronize0E7RQCE == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2 = FinancialConnectionsLiteViewModel.this;
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    financialConnectionsLiteViewModel2.handleError(thM9121exceptionOrNullimpl, "Failed to synchronize session");
                }
                return Unit.INSTANCE;
            }
            financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7507synchronize0E7RQCE = ((Result) obj).getValue();
            ResultKt.throwOnFailure(objMo7507synchronize0E7RQCE);
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) objMo7507synchronize0E7RQCE;
            String strCreate$default = HostedAuthUrlBuilder.create$default(HostedAuthUrlBuilder.INSTANCE, financialConnectionsLiteViewModel.args, synchronizeSessionResponse.getManifest().getHostedAuthUrl(), null, 4, null);
            String successUrl = synchronizeSessionResponse.getManifest().getSuccessUrl();
            if (successUrl == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String cancelUrl = synchronizeSessionResponse.getManifest().getCancelUrl();
            if (cancelUrl == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (strCreate$default != null) {
                State state = new State(successUrl, cancelUrl, strCreate$default);
                MutableStateFlow mutableStateFlow = financialConnectionsLiteViewModel._state;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, state));
                MutableSharedFlow mutableSharedFlow = financialConnectionsLiteViewModel._viewEffects;
                ViewEffect.OpenAuthFlowWithUrl openAuthFlowWithUrl = new ViewEffect.OpenAuthFlowWithUrl(state.getHostedAuthUrl());
                this.L$0 = null;
                this.label = 2;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    /* renamed from: handleUrl-IoAF18A, reason: not valid java name */
    public final Object m7499handleUrlIoAF18A(final String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return m7498withStateIoAF18A(new Function1() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsLiteViewModel.handleUrl_IoAF18A$lambda$0(uri, this, (FinancialConnectionsLiteViewModel.State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUrl_IoAF18A$lambda$0(String str, FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel, State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) state.getSuccessUrl(), false, 2, (Object) null)) {
            int i = WhenMappings.$EnumSwitchMapping$0[FinancialConnectionsSheetActivityArgsKt.getFlowType(financialConnectionsLiteViewModel.args).ordinal()];
            if (i == 1) {
                financialConnectionsLiteViewModel.onSuccessFromDataFlow(false);
            } else if (i == 2) {
                financialConnectionsLiteViewModel.onSuccessFromTokenFlow(false);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                financialConnectionsLiteViewModel.onSuccessFromInstantDebits(str);
            }
        } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) state.getCancelUrl(), false, 2, (Object) null)) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[FinancialConnectionsSheetActivityArgsKt.getFlowType(financialConnectionsLiteViewModel.args).ordinal()];
            if (i2 == 1) {
                financialConnectionsLiteViewModel.onSuccessFromDataFlow(true);
            } else if (i2 == 2) {
                financialConnectionsLiteViewModel.onSuccessFromTokenFlow(true);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                financialConnectionsLiteViewModel.onAuthFlowCanceled();
            }
        } else {
            financialConnectionsLiteViewModel.launchInBrowser(str);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromTokenFlow$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {100, 102, LocationRequestCompat.QUALITY_LOW_POWER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromTokenFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C09791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $userCancelled;
        private /* synthetic */ Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09791(boolean z, Continuation<? super C09791> continuation) {
            super(2, continuation);
            this.$userCancelled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09791 c09791 = FinancialConnectionsLiteViewModel.this.new C09791(this.$userCancelled, continuation);
            c09791.L$0 = obj;
            return c09791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            boolean z;
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2 = FinancialConnectionsLiteViewModel.this;
                z = this.$userCancelled;
                Result.Companion companion2 = Result.INSTANCE;
                FinancialConnectionsLiteRepository financialConnectionsLiteRepository = financialConnectionsLiteViewModel2.repository;
                FinancialConnectionsSheetConfiguration configuration = financialConnectionsLiteViewModel2.args.getConfiguration();
                this.L$0 = financialConnectionsLiteViewModel2;
                this.Z$0 = z;
                this.label = 1;
                Object objMo7506getFinancialConnectionsSessiongIAlus = financialConnectionsLiteRepository.mo7506getFinancialConnectionsSessiongIAlus(configuration, this);
                if (objMo7506getFinancialConnectionsSessiongIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsLiteViewModel = financialConnectionsLiteViewModel2;
                value = objMo7506getFinancialConnectionsSessiongIAlus;
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel3 = FinancialConnectionsLiteViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                        financialConnectionsLiteViewModel3.handleError(thM9121exceptionOrNullimpl, "Failed to complete session for token flow");
                    }
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(value);
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) value;
            if (financialConnectionsSession.getPaymentAccount() != null || !z) {
                MutableSharedFlow mutableSharedFlow = financialConnectionsLiteViewModel._viewEffects;
                Token parsedToken = financialConnectionsSession.getParsedToken();
                if (parsedToken != null) {
                    ViewEffect.FinishWithResult finishWithResult = new ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession, parsedToken, 1, null));
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                MutableSharedFlow mutableSharedFlow2 = financialConnectionsLiteViewModel._viewEffects;
                ViewEffect.FinishWithResult finishWithResult2 = new ViewEffect.FinishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                this.L$0 = null;
                this.label = 2;
                if (mutableSharedFlow2.emit(finishWithResult2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            }
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel32 = FinancialConnectionsLiteViewModel.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    private final void onSuccessFromTokenFlow(boolean userCancelled) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C09791(userCancelled, null), 2, null);
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {122, 124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromDataFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C09771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $userCancelled;
        private /* synthetic */ Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09771(boolean z, Continuation<? super C09771> continuation) {
            super(2, continuation);
            this.$userCancelled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09771 c09771 = FinancialConnectionsLiteViewModel.this.new C09771(this.$userCancelled, continuation);
            c09771.L$0 = obj;
            return c09771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            boolean z;
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2 = FinancialConnectionsLiteViewModel.this;
                z = this.$userCancelled;
                Result.Companion companion2 = Result.INSTANCE;
                FinancialConnectionsLiteRepository financialConnectionsLiteRepository = financialConnectionsLiteViewModel2.repository;
                FinancialConnectionsSheetConfiguration configuration = financialConnectionsLiteViewModel2.args.getConfiguration();
                this.L$0 = financialConnectionsLiteViewModel2;
                this.Z$0 = z;
                this.label = 1;
                Object objMo7506getFinancialConnectionsSessiongIAlus = financialConnectionsLiteRepository.mo7506getFinancialConnectionsSessiongIAlus(configuration, this);
                if (objMo7506getFinancialConnectionsSessiongIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsLiteViewModel = financialConnectionsLiteViewModel2;
                value = objMo7506getFinancialConnectionsSessiongIAlus;
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel3 = FinancialConnectionsLiteViewModel.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                        financialConnectionsLiteViewModel3.handleError(thM9121exceptionOrNullimpl, "Failed to complete session for data flow");
                    }
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(value);
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) value;
            if (financialConnectionsSession.getPaymentAccount() != null || !z) {
                MutableSharedFlow mutableSharedFlow = financialConnectionsLiteViewModel._viewEffects;
                ViewEffect.FinishWithResult finishWithResult = new ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed(null, financialConnectionsSession, null, 5, null));
                this.L$0 = null;
                this.label = 3;
            } else {
                MutableSharedFlow mutableSharedFlow2 = financialConnectionsLiteViewModel._viewEffects;
                ViewEffect.FinishWithResult finishWithResult2 = new ViewEffect.FinishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                this.L$0 = null;
                this.label = 2;
                if (mutableSharedFlow2.emit(finishWithResult2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            }
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel32 = FinancialConnectionsLiteViewModel.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    private final void onSuccessFromDataFlow(boolean userCancelled) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C09771(userCancelled, null), 2, null);
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1, reason: invalid class name and case insensitive filesystem */
    static final class C09781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $url;
        Object L$0;
        int label;
        final /* synthetic */ FinancialConnectionsLiteViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09781(String str, FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel, Continuation<? super C09781> continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = financialConnectionsLiteViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09781(this.$url, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM7654fromUriIoAF18A;
            Object obj2;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                objM7654fromUriIoAF18A = InstantDebitsResultBuilder.INSTANCE.m7654fromUriIoAF18A(Uri.parse(this.$url));
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = this.this$0;
                if (Result.m9125isSuccessimpl(objM7654fromUriIoAF18A)) {
                    MutableSharedFlow mutableSharedFlow = financialConnectionsLiteViewModel._viewEffects;
                    ViewEffect.FinishWithResult finishWithResult = new ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Completed((InstantDebitsResult) objM7654fromUriIoAF18A, null, null));
                    this.L$0 = objM7654fromUriIoAF18A;
                    this.label = 1;
                    if (mutableSharedFlow.emit(finishWithResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = objM7654fromUriIoAF18A;
                }
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel2 = this.this$0;
                String str = this.$url;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7654fromUriIoAF18A);
                if (thM9121exceptionOrNullimpl != null) {
                    financialConnectionsLiteViewModel2.handleError(thM9121exceptionOrNullimpl, "Failed to parse instant debits result from url: " + str);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            objM7654fromUriIoAF18A = obj2;
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel22 = this.this$0;
            String str2 = this.$url;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7654fromUriIoAF18A);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    private final Job onSuccessFromInstantDebits(String url) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09781(url, this, null), 3, null);
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onAuthFlowCanceled$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onAuthFlowCanceled$1, reason: invalid class name and case insensitive filesystem */
    static final class C09761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09761(Continuation<? super C09761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsLiteViewModel.this.new C09761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FinancialConnectionsLiteViewModel.this._viewEffects.emit(new ViewEffect.FinishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE), this) == coroutine_suspended) {
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

    private final void onAuthFlowCanceled() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09761(null), 3, null);
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$launchInBrowser$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$launchInBrowser$1, reason: invalid class name and case insensitive filesystem */
    static final class C09751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09751(String str, Continuation<? super C09751> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsLiteViewModel.this.new C09751(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FinancialConnectionsLiteViewModel.this._viewEffects.emit(new ViewEffect.OpenCustomTab(this.$uri), this) == coroutine_suspended) {
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

    private final void launchInBrowser(String uri) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09751(uri, null), 3, null);
    }

    /* renamed from: withState-IoAF18A, reason: not valid java name */
    private final Object m7498withStateIoAF18A(Function1<? super State, Unit> block) {
        Object objM9118constructorimpl;
        State value;
        try {
            Result.Companion companion = Result.INSTANCE;
            FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = this;
            value = this._state.getValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (value != null) {
            block.invoke(value);
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                handleError(thM9121exceptionOrNullimpl, "State is null");
            }
            return objM9118constructorimpl;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$handleError$1", f = "FinancialConnectionsLiteViewModel.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$handleError$1, reason: invalid class name and case insensitive filesystem */
    static final class C09741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09741(Throwable th, Continuation<? super C09741> continuation) {
            super(2, continuation);
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsLiteViewModel.this.new C09741(this.$error, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FinancialConnectionsLiteViewModel.this._viewEffects.emit(new ViewEffect.FinishWithResult(new FinancialConnectionsSheetActivityResult.Failed(this.$error)), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable error, String message) {
        this.logger.error(message, error);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09741(error, null), 3, null);
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$State;", "", "successUrl", "", "cancelUrl", "hostedAuthUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuccessUrl", "()Ljava/lang/String;", "getCancelUrl", "getHostedAuthUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        private final String cancelUrl;
        private final String hostedAuthUrl;
        private final String successUrl;

        public static /* synthetic */ State copy$default(State state, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = state.successUrl;
            }
            if ((i & 2) != 0) {
                str2 = state.cancelUrl;
            }
            if ((i & 4) != 0) {
                str3 = state.hostedAuthUrl;
            }
            return state.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSuccessUrl() {
            return this.successUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCancelUrl() {
            return this.cancelUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHostedAuthUrl() {
            return this.hostedAuthUrl;
        }

        public final State copy(String successUrl, String cancelUrl, String hostedAuthUrl) {
            Intrinsics.checkNotNullParameter(successUrl, "successUrl");
            Intrinsics.checkNotNullParameter(cancelUrl, "cancelUrl");
            Intrinsics.checkNotNullParameter(hostedAuthUrl, "hostedAuthUrl");
            return new State(successUrl, cancelUrl, hostedAuthUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.successUrl, state.successUrl) && Intrinsics.areEqual(this.cancelUrl, state.cancelUrl) && Intrinsics.areEqual(this.hostedAuthUrl, state.hostedAuthUrl);
        }

        public int hashCode() {
            return (((this.successUrl.hashCode() * 31) + this.cancelUrl.hashCode()) * 31) + this.hostedAuthUrl.hashCode();
        }

        public String toString() {
            return "State(successUrl=" + this.successUrl + ", cancelUrl=" + this.cancelUrl + ", hostedAuthUrl=" + this.hostedAuthUrl + ")";
        }

        public State(String successUrl, String cancelUrl, String hostedAuthUrl) {
            Intrinsics.checkNotNullParameter(successUrl, "successUrl");
            Intrinsics.checkNotNullParameter(cancelUrl, "cancelUrl");
            Intrinsics.checkNotNullParameter(hostedAuthUrl, "hostedAuthUrl");
            this.successUrl = successUrl;
            this.cancelUrl = cancelUrl;
            this.hostedAuthUrl = hostedAuthUrl;
        }

        public final String getSuccessUrl() {
            return this.successUrl;
        }

        public final String getCancelUrl() {
            return this.cancelUrl;
        }

        public final String getHostedAuthUrl() {
            return this.hostedAuthUrl;
        }
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;", "", "<init>", "()V", "OpenAuthFlowWithUrl", "OpenCustomTab", "FinishWithResult", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenCustomTab;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewEffect {
        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: FinancialConnectionsLiteViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAuthFlowWithUrl extends ViewEffect {
            private final String url;

            public static /* synthetic */ OpenAuthFlowWithUrl copy$default(OpenAuthFlowWithUrl openAuthFlowWithUrl, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openAuthFlowWithUrl.url;
                }
                return openAuthFlowWithUrl.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OpenAuthFlowWithUrl copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenAuthFlowWithUrl(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenAuthFlowWithUrl) && Intrinsics.areEqual(this.url, ((OpenAuthFlowWithUrl) other).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "OpenAuthFlowWithUrl(url=" + this.url + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenAuthFlowWithUrl(String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }

        private ViewEffect() {
        }

        /* compiled from: FinancialConnectionsLiteViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$OpenCustomTab;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCustomTab extends ViewEffect {
            private final String url;

            public static /* synthetic */ OpenCustomTab copy$default(OpenCustomTab openCustomTab, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openCustomTab.url;
                }
                return openCustomTab.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OpenCustomTab copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenCustomTab(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenCustomTab) && Intrinsics.areEqual(this.url, ((OpenCustomTab) other).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "OpenCustomTab(url=" + this.url + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenCustomTab(String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }

        /* compiled from: FinancialConnectionsLiteViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V", "getResult", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithResult extends ViewEffect {
            private final FinancialConnectionsSheetActivityResult result;

            public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    financialConnectionsSheetActivityResult = finishWithResult.result;
                }
                return finishWithResult.copy(financialConnectionsSheetActivityResult);
            }

            /* renamed from: component1, reason: from getter */
            public final FinancialConnectionsSheetActivityResult getResult() {
                return this.result;
            }

            public final FinishWithResult copy(FinancialConnectionsSheetActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                return new FinishWithResult(result);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "FinishWithResult(result=" + this.result + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishWithResult(FinancialConnectionsSheetActivityResult result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public final FinancialConnectionsSheetActivityResult getResult() {
                return this.result;
            }
        }
    }

    /* compiled from: FinancialConnectionsLiteViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            Object obj = extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Context");
            String packageName = ((Context) obj).getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            return new FinancialConnectionsLiteViewModel(Di.INSTANCE.getLogger(), savedStateHandleCreateSavedStateHandle, Di.INSTANCE.repository(), Di.INSTANCE.getWorkContext(), packageName);
        }
    }
}
