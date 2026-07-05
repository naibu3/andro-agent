package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.soloader.Elf64;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: ChallengeActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002MNB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u0014J \u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00142\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0018J\u0006\u0010B\u001a\u00020\u0012J\u0006\u0010C\u001a\u00020\u0012J\u0006\u0010D\u001a\u00020\u0012J\u000e\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0018J\u000e\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u001cJ\u000e\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020 J\u000e\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0014\u00105\u001a\u000206X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006O"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V", "imageRepository", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "_refreshUi", "Landroidx/lifecycle/MutableLiveData;", "", "refreshUi", "Landroidx/lifecycle/LiveData;", "getRefreshUi", "()Landroidx/lifecycle/LiveData;", "_submitClicked", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "submitClicked", "getSubmitClicked", "_shouldFinish", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "shouldFinish", "getShouldFinish", "_challengeText", "", "challengeText", "getChallengeText", "_challengeRequestResult", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "challengeRequestResult", "getChallengeRequestResult", "_nextScreen", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "nextScreen", "getNextScreen", "shouldRefreshUi", "", "getShouldRefreshUi", "()Z", "setShouldRefreshUi", "(Z)V", "shouldAutoSubmitOOB", "getShouldAutoSubmitOOB", "setShouldAutoSubmitOOB", "transactionTimerJob", "Lkotlinx/coroutines/Job;", "getTransactionTimerJob$3ds2sdk_release", "()Lkotlinx/coroutines/Job;", "getTimeout", "getImage", "Landroid/graphics/Bitmap;", "imageData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "densityDpi", "", "submit", "action", "stopTimer", "onMemoryEvent", "onRefreshUi", "onSubmitClicked", "challengeAction", "onFinish", "challengeResult", "updateChallengeText", "text", "onNextScreen", "cres", "OnInactiveAwareMutableLiveData", "Factory", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeActivityViewModel extends ViewModel {
    private final OnInactiveAwareMutableLiveData<ChallengeRequestResult> _challengeRequestResult;
    private final MutableLiveData<String> _challengeText;
    private final OnInactiveAwareMutableLiveData<ChallengeResponseData> _nextScreen;
    private final MutableLiveData<Unit> _refreshUi;
    private final MutableLiveData<ChallengeResult> _shouldFinish;
    private final MutableLiveData<ChallengeAction> _submitClicked;
    private final ChallengeActionHandler challengeActionHandler;
    private final LiveData<ChallengeRequestResult> challengeRequestResult;
    private final LiveData<String> challengeText;
    private final ImageCache imageCache;
    private final ImageRepository imageRepository;
    private final LiveData<ChallengeResponseData> nextScreen;
    private final LiveData<Unit> refreshUi;
    private boolean shouldAutoSubmitOOB;
    private final LiveData<ChallengeResult> shouldFinish;
    private boolean shouldRefreshUi;
    private final LiveData<ChallengeAction> submitClicked;
    private final TransactionTimer transactionTimer;
    private final Job transactionTimerJob;

    public /* synthetic */ ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache.Default r10, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeActionHandler, transactionTimer, errorReporter, (i & 8) != 0 ? ImageCache.Default.INSTANCE : r10, coroutineContext);
    }

    public ChallengeActivityViewModel(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, ImageCache imageCache, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.challengeActionHandler = challengeActionHandler;
        this.transactionTimer = transactionTimer;
        this.imageCache = imageCache;
        this.imageRepository = new ImageRepository(errorReporter, workContext);
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this._refreshUi = mutableLiveData;
        this.refreshUi = mutableLiveData;
        MutableLiveData<ChallengeAction> mutableLiveData2 = new MutableLiveData<>();
        this._submitClicked = mutableLiveData2;
        this.submitClicked = mutableLiveData2;
        MutableLiveData<ChallengeResult> mutableLiveData3 = new MutableLiveData<>();
        this._shouldFinish = mutableLiveData3;
        this.shouldFinish = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this._challengeText = mutableLiveData4;
        this.challengeText = mutableLiveData4;
        OnInactiveAwareMutableLiveData<ChallengeRequestResult> onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData<>();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData<ChallengeResponseData> onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData<>();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        this.transactionTimerJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final LiveData<Unit> getRefreshUi() {
        return this.refreshUi;
    }

    public final LiveData<ChallengeAction> getSubmitClicked() {
        return this.submitClicked;
    }

    public final LiveData<ChallengeResult> getShouldFinish() {
        return this.shouldFinish;
    }

    public final LiveData<String> getChallengeText() {
        return this.challengeText;
    }

    public final LiveData<ChallengeRequestResult> getChallengeRequestResult() {
        return this.challengeRequestResult;
    }

    public final LiveData<ChallengeResponseData> getNextScreen() {
        return this.nextScreen;
    }

    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final void setShouldRefreshUi(boolean z) {
        this.shouldRefreshUi = z;
    }

    public final boolean getShouldAutoSubmitOOB() {
        return this.shouldAutoSubmitOOB;
    }

    public final void setShouldAutoSubmitOOB(boolean z) {
        this.shouldAutoSubmitOOB = z;
    }

    /* renamed from: getTransactionTimerJob$3ds2sdk_release, reason: from getter */
    public final Job getTransactionTimerJob() {
        return this.transactionTimerJob;
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeActivityViewModel.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                if (ChallengeActivityViewModel.this.transactionTimer.start(this) == coroutine_suspended) {
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

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1, reason: invalid class name and case insensitive filesystem */
    static final class C11641 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C11641(Continuation<? super C11641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11641 c11641 = ChallengeActivityViewModel.this.new C11641(continuation);
            c11641.L$0 = obj;
            return c11641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C11641) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                this.L$0 = liveDataScope;
                this.label = 1;
                obj = FlowKt.firstOrNull(ChallengeActivityViewModel.this.transactionTimer.getTimeout(), new C02261(null), this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            liveDataScope = (LiveDataScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }

        /* compiled from: ChallengeActivityViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isTimeout"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02261 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            C02261(Continuation<? super C02261> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02261 c02261 = new C02261(continuation);
                c02261.Z$0 = ((Boolean) obj).booleanValue();
                return c02261;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((C02261) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }
    }

    public final LiveData<Boolean> getTimeout() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C11641(null), 3, (Object) null);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {71, 70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1, reason: invalid class name and case insensitive filesystem */
    static final class C11631 extends SuspendLambda implements Function2<LiveDataScope<Bitmap>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $densityDpi;
        final /* synthetic */ ChallengeResponseData.Image $imageData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11631(ChallengeResponseData.Image image, int i, Continuation<? super C11631> continuation) {
            super(2, continuation);
            this.$imageData = image;
            this.$densityDpi = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11631 c11631 = ChallengeActivityViewModel.this.new C11631(this.$imageData, this.$densityDpi, continuation);
            c11631.L$0 = obj;
            return c11631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Bitmap> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C11631) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.L$0;
                ImageRepository imageRepository = ChallengeActivityViewModel.this.imageRepository;
                ChallengeResponseData.Image image = this.$imageData;
                String urlForDensity = image != null ? image.getUrlForDensity(this.$densityDpi) : null;
                this.L$0 = liveDataScope;
                this.label = 1;
                obj = imageRepository.getImage$3ds2sdk_release(urlForDensity, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            liveDataScope = (LiveDataScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final LiveData<Bitmap> getImage(ChallengeResponseData.Image imageData, int densityDpi) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C11631(imageData, densityDpi, null), 3, (Object) null);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1", f = "ChallengeActivityViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$submit$1, reason: invalid class name and case insensitive filesystem */
    static final class C11651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChallengeAction $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11651(ChallengeAction challengeAction, Continuation<? super C11651> continuation) {
            super(2, continuation);
            this.$action = challengeAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeActivityViewModel.this.new C11651(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OnInactiveAwareMutableLiveData onInactiveAwareMutableLiveData2 = ChallengeActivityViewModel.this._challengeRequestResult;
                this.L$0 = onInactiveAwareMutableLiveData2;
                this.label = 1;
                Object objSubmit = ChallengeActivityViewModel.this.challengeActionHandler.submit(this.$action, this);
                if (objSubmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
                onInactiveAwareMutableLiveData = onInactiveAwareMutableLiveData2;
                obj = objSubmit;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onInactiveAwareMutableLiveData = (OnInactiveAwareMutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            onInactiveAwareMutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    public final void submit(ChallengeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11651(action, null), 3, null);
    }

    public final void stopTimer() {
        Job.DefaultImpls.cancel$default(this.transactionTimerJob, (CancellationException) null, 1, (Object) null);
    }

    public final void onMemoryEvent() {
        this.imageCache.clear();
    }

    public final void onRefreshUi() {
        this._refreshUi.setValue(Unit.INSTANCE);
    }

    public final void onSubmitClicked(ChallengeAction challengeAction) {
        Intrinsics.checkNotNullParameter(challengeAction, "challengeAction");
        this._submitClicked.postValue(challengeAction);
    }

    public final void onFinish(ChallengeResult challengeResult) {
        Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
        this._shouldFinish.postValue(challengeResult);
    }

    public final void updateChallengeText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this._challengeText.setValue(text);
    }

    public final void onNextScreen(ChallengeResponseData cres) {
        Intrinsics.checkNotNullParameter(cres, "cres");
        this._nextScreen.setValue(cres);
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "onInactive", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OnInactiveAwareMutableLiveData<T> extends MutableLiveData<T> {
        @Override // androidx.lifecycle.LiveData
        protected void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* compiled from: ChallengeActivityViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final ChallengeActionHandler challengeActionHandler;
        private final ErrorReporter errorReporter;
        private final TransactionTimer transactionTimer;
        private final CoroutineContext workContext;

        public Factory(ChallengeActionHandler challengeActionHandler, TransactionTimer transactionTimer, ErrorReporter errorReporter, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
            Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.challengeActionHandler = challengeActionHandler;
            this.transactionTimer = transactionTimer;
            this.errorReporter = errorReporter;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ChallengeActivityViewModel(this.challengeActionHandler, this.transactionTimer, this.errorReporter, null, this.workContext, 8, null);
        }
    }
}
