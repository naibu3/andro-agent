package coil3;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.EventListener;
import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.disk.DiskCache;
import coil3.intercept.EngineInterceptor;
import coil3.memory.MemoryCache;
import coil3.request.Disposable;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import coil3.request.NullRequestData;
import coil3.request.NullRequestDataException;
import coil3.request.RequestDelegate;
import coil3.request.RequestService;
import coil3.request.RequestService_androidKt;
import coil3.request.SuccessResult;
import coil3.size.Size;
import coil3.size.SizeResolver;
import coil3.target.Target;
import coil3.transition.NoneTransition;
import coil3.transition.Transition;
import coil3.transition.TransitionTarget;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import coil3.util.SystemCallbacksKt;
import coil3.util.UtilsKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;

/* compiled from: RealImageLoader.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010)J\u001e\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J\b\u0010!\u001a\u00020.H\u0016J\b\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\"\u00108\u001a\u00020.2\u0006\u00102\u001a\u0002092\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010:\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017*\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c*\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\t\u0010!\u001a\u00020\"X\u0082\u0004¨\u0006<"}, d2 = {"Lcoil3/RealImageLoader;", "Lcoil3/ImageLoader;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil3/RealImageLoader$Options;", "<init>", "(Lcoil3/RealImageLoader$Options;)V", "getOptions", "()Lcoil3/RealImageLoader$Options;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil3/util/SystemCallbacks;", "requestService", "Lcoil3/request/RequestService;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "memoryCache", "Lcoil3/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil3/RealImageLoader;)Ljava/lang/Object;", "getMemoryCache", "()Lcoil3/memory/MemoryCache;", "diskCache", "Lcoil3/disk/DiskCache;", "getDiskCache$delegate", "getDiskCache", "()Lcoil3/disk/DiskCache;", "components", "Lcoil3/ComponentRegistry;", "getComponents", "()Lcoil3/ComponentRegistry;", "shutdown", "Lkotlinx/atomicfu/AtomicBoolean;", "enqueue", "Lcoil3/request/Disposable;", "request", "Lcoil3/request/ImageRequest;", "execute", "Lcoil3/request/ImageResult;", "(Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialRequest", "type", "", "(Lcoil3/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcoil3/ImageLoader$Builder;", "onSuccess", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcoil3/request/SuccessResult;", TypedValues.AttributesType.S_TARGET, "Lcoil3/target/Target;", "eventListener", "Lcoil3/EventListener;", "onError", "Lcoil3/request/ErrorResult;", "onCancel", "Options", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealImageLoader implements ImageLoader {
    private static final /* synthetic */ AtomicIntegerFieldUpdater shutdown$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "shutdown$volatile");
    private final ComponentRegistry components;
    private final Options options;
    private final RequestService requestService;
    private final CoroutineScope scope;
    private volatile /* synthetic */ int shutdown$volatile;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: RealImageLoader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {116, 128, 132}, m = "execute", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: coil3.RealImageLoader$execute$3, reason: invalid class name */
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealImageLoader.this.execute(null, 0, this);
        }
    }

    private final /* synthetic */ int getShutdown$volatile() {
        return this.shutdown$volatile;
    }

    private final /* synthetic */ void setShutdown$volatile(int i) {
        this.shutdown$volatile = i;
    }

    public RealImageLoader(Options options) {
        this.options = options;
        this.scope = RealImageLoaderKt.CoroutineScope(options.getLogger());
        SystemCallbacks SystemCallbacks = SystemCallbacksKt.SystemCallbacks(this);
        this.systemCallbacks = SystemCallbacks;
        RealImageLoader realImageLoader = this;
        RequestService RequestService = RequestService_androidKt.RequestService(realImageLoader, SystemCallbacks, options.getLogger());
        this.requestService = RequestService;
        options.getMemoryCacheLazy();
        options.getDiskCacheLazy();
        this.components = RealImageLoaderKt.addCommonComponents(RealImageLoader_nonNativeKt.addAppleComponents(RealImageLoader_jvmCommonKt.addJvmComponents(RealImageLoader_androidKt.addAndroidComponents(RealImageLoaderKt.addServiceLoaderComponents(options.getComponentRegistry().newBuilder(), options), options), options), options)).add(new EngineInterceptor(realImageLoader, SystemCallbacks, RequestService, options.getLogger())).build();
        this.shutdown$volatile = 0;
    }

    public final Options getOptions() {
        return this.options;
    }

    @Override // coil3.ImageLoader
    public ImageRequest.Defaults getDefaults() {
        return this.options.getDefaults();
    }

    @Override // coil3.ImageLoader
    public MemoryCache getMemoryCache() {
        return this.options.getMemoryCacheLazy().getValue();
    }

    @Override // coil3.ImageLoader
    public DiskCache getDiskCache() {
        return this.options.getDiskCacheLazy().getValue();
    }

    @Override // coil3.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil3.ImageLoader
    public Disposable enqueue(ImageRequest request) {
        return RealImageLoader_androidKt.getDisposable(request, BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null));
    }

    @Override // coil3.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        if (RealImageLoader_androidKt.needsExecuteOnMainDispatcher(imageRequest)) {
            return CoroutineScopeKt.coroutineScope(new AnonymousClass2(imageRequest, this, null), continuation);
        }
        return execute(imageRequest, 1, continuation);
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: coil3.RealImageLoader$execute$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        final /* synthetic */ ImageRequest $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RealImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.this$0 = realImageLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
            this.label = 1;
            Object objAwait = RealImageLoader_androidKt.getDisposable(this.$request, deferredAsync$default).getJob().await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(1:(7:13|114|14|75|(1:77)(2:78|(1:80)(2:83|84))|81|82)(2:18|19))(13:20|109|21|22|23|115|68|69|111|70|71|(5:74|75|(0)(0)|81|82)|73)|113|95|(3:97|98|99)(2:100|101))(4:26|107|27|45))(6:32|(1:34)(1:35)|36|117|37|(2:39|(3:41|(2:44|45)|73)(1:46))(2:91|92))|105|47|(1:54)(1:53)|55|(2:(1:58)(1:59)|60)|61|(1:63)|64|(9:67|23|115|68|69|111|70|71|(0))|73|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #4 {all -> 0x01ca, blocks: (B:95:0x01b3, B:97:0x01b7, B:100:0x01c6, B:101:0x01c9), top: B:113:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:14:0x0047, B:75:0x0170, B:77:0x0176, B:78:0x0181, B:80:0x0185, B:83:0x0193, B:84:0x0198), top: B:114:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:14:0x0047, B:75:0x0170, B:77:0x0176, B:78:0x0181, B:80:0x0185, B:83:0x0193, B:84:0x0198), top: B:114:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b7 A[Catch: all -> 0x01ca, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:95:0x01b3, B:97:0x01b7, B:100:0x01c6, B:101:0x01c9), top: B:113:0x01b3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        AnonymousClass3 anonymousClass3;
        RequestDelegate requestDelegate;
        ImageRequest imageRequestUpdateRequest;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        Image image;
        ImageRequest imageRequest3;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        MemoryCache memoryCache;
        MemoryCache.Value value;
        EventListener eventListener3;
        ImageResult imageResult;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        }
        Object objWithContext = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(anonymousClass3.getContext()), i == 0);
            requestDelegate.assertActive();
            imageRequestUpdateRequest = this.requestService.updateRequest(imageRequest);
            EventListener eventListenerCreate = this.options.getEventListenerFactory().create(imageRequestUpdateRequest);
            try {
                if (Intrinsics.areEqual(imageRequestUpdateRequest.getData(), NullRequestData.INSTANCE)) {
                    throw new NullRequestDataException();
                }
                requestDelegate.start();
                if (i == 0) {
                    anonymousClass3.L$0 = this;
                    anonymousClass3.L$1 = requestDelegate;
                    anonymousClass3.L$2 = imageRequestUpdateRequest;
                    anonymousClass3.L$3 = eventListenerCreate;
                    anonymousClass3.label = 1;
                    if (requestDelegate.awaitStarted(anonymousClass3) != coroutine_suspended) {
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestUpdateRequest;
                        eventListener2 = eventListenerCreate;
                        requestDelegate3 = requestDelegate;
                        requestDelegate = requestDelegate3;
                    }
                    return coroutine_suspended;
                }
                realImageLoader2 = this;
                imageRequest2 = imageRequestUpdateRequest;
                eventListener2 = eventListenerCreate;
            } catch (Throwable th) {
                th = th;
                realImageLoader = this;
                requestDelegate2 = requestDelegate;
                eventListener = eventListenerCreate;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    image = (Image) anonymousClass3.L$4;
                    eventListener2 = (EventListener) anonymousClass3.L$3;
                    ImageRequest imageRequest4 = (ImageRequest) anonymousClass3.L$2;
                    requestDelegate4 = (RequestDelegate) anonymousClass3.L$1;
                    RealImageLoader realImageLoader4 = (RealImageLoader) anonymousClass3.L$0;
                    try {
                        ResultKt.throwOnFailure(objWithContext);
                        imageRequest3 = imageRequest4;
                        realImageLoader3 = realImageLoader4;
                        Image image2 = image;
                        try {
                            Size size = (Size) objWithContext;
                            eventListener2.resolveSizeEnd(imageRequest3, size);
                            CoroutineContext interceptorCoroutineContext = imageRequest3.getInterceptorCoroutineContext();
                            eventListener3 = eventListener2;
                            try {
                                RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(imageRequest3, realImageLoader3, size, eventListener3, image2, null);
                                anonymousClass3.L$0 = realImageLoader3;
                                anonymousClass3.L$1 = requestDelegate4;
                                anonymousClass3.L$2 = imageRequest3;
                                anonymousClass3.L$3 = eventListener2;
                                anonymousClass3.L$4 = null;
                                anonymousClass3.label = 3;
                                objWithContext = BuildersKt.withContext(interceptorCoroutineContext, realImageLoader$execute$result$1, anonymousClass3);
                                if (objWithContext != coroutine_suspended) {
                                    eventListener = eventListener2;
                                    requestDelegate2 = requestDelegate4;
                                    imageRequestUpdateRequest = imageRequest3;
                                    realImageLoader = realImageLoader3;
                                    imageResult = (ImageResult) objWithContext;
                                    if (!(imageResult instanceof SuccessResult)) {
                                    }
                                    return imageResult;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th2) {
                                th = th2;
                                eventListener2 = eventListener3;
                                eventListener = eventListener2;
                                requestDelegate2 = requestDelegate4;
                                imageRequestUpdateRequest = imageRequest3;
                                realImageLoader = realImageLoader3;
                                if (!(th instanceof CancellationException)) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        eventListener = eventListener2;
                        imageRequestUpdateRequest = imageRequest4;
                        requestDelegate2 = requestDelegate4;
                        realImageLoader = realImageLoader4;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eventListener = (EventListener) anonymousClass3.L$3;
                    imageRequestUpdateRequest = (ImageRequest) anonymousClass3.L$2;
                    requestDelegate2 = (RequestDelegate) anonymousClass3.L$1;
                    realImageLoader = (RealImageLoader) anonymousClass3.L$0;
                    try {
                        ResultKt.throwOnFailure(objWithContext);
                        imageResult = (ImageResult) objWithContext;
                        if (!(imageResult instanceof SuccessResult)) {
                            realImageLoader.onSuccess((SuccessResult) imageResult, imageRequestUpdateRequest.getTarget(), eventListener);
                        } else {
                            if (!(imageResult instanceof ErrorResult)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            realImageLoader.onError((ErrorResult) imageResult, imageRequestUpdateRequest.getTarget(), eventListener);
                        }
                        return imageResult;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                try {
                    if (!(th instanceof CancellationException)) {
                        realImageLoader.onCancel(imageRequestUpdateRequest, eventListener);
                        throw th;
                    }
                    ErrorResult ErrorResult = UtilsKt.ErrorResult(imageRequestUpdateRequest, th);
                    realImageLoader.onError(ErrorResult, imageRequestUpdateRequest.getTarget(), eventListener);
                    return ErrorResult;
                } finally {
                    requestDelegate2.complete();
                }
            }
            eventListener2 = (EventListener) anonymousClass3.L$3;
            imageRequest2 = (ImageRequest) anonymousClass3.L$2;
            requestDelegate3 = (RequestDelegate) anonymousClass3.L$1;
            realImageLoader2 = (RealImageLoader) anonymousClass3.L$0;
            try {
                ResultKt.throwOnFailure(objWithContext);
                requestDelegate = requestDelegate3;
            } catch (Throwable th6) {
                th = th6;
                eventListener = eventListener2;
                imageRequestUpdateRequest = imageRequest2;
                requestDelegate2 = requestDelegate3;
                realImageLoader = realImageLoader2;
                if (!(th instanceof CancellationException)) {
                }
            }
        }
        MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
        image = (placeholderMemoryCacheKey == null || (memoryCache = realImageLoader2.getMemoryCache()) == null || (value = memoryCache.get(placeholderMemoryCacheKey)) == null) ? null : value.getImage();
        Target target = imageRequest2.getTarget();
        if (target != null) {
            target.onStart(image == null ? imageRequest2.placeholder() : image);
        }
        eventListener2.onStart(imageRequest2);
        ImageRequest.Listener listener = imageRequest2.getListener();
        if (listener != null) {
            listener.onStart(imageRequest2);
        }
        SizeResolver sizeResolver = imageRequest2.getSizeResolver();
        eventListener2.resolveSizeStart(imageRequest2, sizeResolver);
        anonymousClass3.L$0 = realImageLoader2;
        anonymousClass3.L$1 = requestDelegate;
        anonymousClass3.L$2 = imageRequest2;
        anonymousClass3.L$3 = eventListener2;
        anonymousClass3.L$4 = image;
        anonymousClass3.label = 2;
        Object size2 = sizeResolver.size(anonymousClass3);
        if (size2 != coroutine_suspended) {
            imageRequest3 = imageRequest2;
            realImageLoader3 = realImageLoader2;
            requestDelegate4 = requestDelegate;
            objWithContext = size2;
            Image image22 = image;
            Size size3 = (Size) objWithContext;
            eventListener2.resolveSizeEnd(imageRequest3, size3);
            CoroutineContext interceptorCoroutineContext2 = imageRequest3.getInterceptorCoroutineContext();
            eventListener3 = eventListener2;
            RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1(imageRequest3, realImageLoader3, size3, eventListener3, image22, null);
            anonymousClass3.L$0 = realImageLoader3;
            anonymousClass3.L$1 = requestDelegate4;
            anonymousClass3.L$2 = imageRequest3;
            anonymousClass3.L$3 = eventListener2;
            anonymousClass3.L$4 = null;
            anonymousClass3.label = 3;
            objWithContext = BuildersKt.withContext(interceptorCoroutineContext2, realImageLoader$execute$result$12, anonymousClass3);
            if (objWithContext != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // coil3.ImageLoader
    public void shutdown() {
        if (shutdown$volatile$FU.getAndSet(this, 1) != 0) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil3.ImageLoader
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this.options);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(SuccessResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        DataSource dataSource = result.getDataSource();
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, UtilsKt.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
            }
        }
        if (target instanceof TransitionTarget) {
            SuccessResult successResult = result;
            Transition transitionCreate = ImageRequests_androidKt.getTransitionFactory(successResult.getRequest()).create((TransitionTarget) target, successResult);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(successResult.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onSuccess(result.getImage());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(ErrorResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Throwable throwable = result.getThrowable();
            if (logger.getMinLevel().compareTo(Logger.Level.Error) <= 0) {
                logger.log("RealImageLoader", Logger.Level.Error, "🚨 Failed - " + request.getData(), throwable);
            }
        }
        if (target instanceof TransitionTarget) {
            ErrorResult errorResult = result;
            Transition transitionCreate = ImageRequests_androidKt.getTransitionFactory(errorResult.getRequest()).create((TransitionTarget) target, errorResult);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(errorResult.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onError(result.getImage());
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    private final void onCancel(ImageRequest request, EventListener eventListener) {
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, "🏗 Cancelled - " + request.getData(), null);
            }
        }
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\"\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jj\u0010)\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0017\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcoil3/RealImageLoader$Options;", "", "application", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "defaults", "Lcoil3/request/ImageRequest$Defaults;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil3/memory/MemoryCache;", "diskCacheLazy", "Lcoil3/disk/DiskCache;", "eventListenerFactory", "Lcoil3/EventListener$Factory;", "componentRegistry", "Lcoil3/ComponentRegistry;", "logger", "Lcoil3/util/Logger;", "<init>", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)V", "getApplication", "()Landroid/content/Context;", "Landroid/content/Context;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil3/EventListener$Factory;", "getComponentRegistry", "()Lcoil3/ComponentRegistry;", "getLogger", "()Lcoil3/util/Logger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Landroid/content/Context;Lcoil3/request/ImageRequest$Defaults;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/EventListener$Factory;Lcoil3/ComponentRegistry;Lcoil3/util/Logger;)Lcoil3/RealImageLoader$Options;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final Context application;
        private final ComponentRegistry componentRegistry;
        private final ImageRequest.Defaults defaults;
        private final Lazy<DiskCache> diskCacheLazy;
        private final EventListener.Factory eventListenerFactory;
        private final Logger logger;
        private final Lazy<MemoryCache> memoryCacheLazy;

        public static /* synthetic */ Options copy$default(Options options, Context context, ImageRequest.Defaults defaults, Lazy lazy, Lazy lazy2, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger, int i, Object obj) {
            if ((i & 1) != 0) {
                context = options.application;
            }
            if ((i & 2) != 0) {
                defaults = options.defaults;
            }
            if ((i & 4) != 0) {
                lazy = options.memoryCacheLazy;
            }
            if ((i & 8) != 0) {
                lazy2 = options.diskCacheLazy;
            }
            if ((i & 16) != 0) {
                factory = options.eventListenerFactory;
            }
            if ((i & 32) != 0) {
                componentRegistry = options.componentRegistry;
            }
            if ((i & 64) != 0) {
                logger = options.logger;
            }
            ComponentRegistry componentRegistry2 = componentRegistry;
            Logger logger2 = logger;
            EventListener.Factory factory2 = factory;
            Lazy lazy3 = lazy;
            return options.copy(context, defaults, lazy3, lazy2, factory2, componentRegistry2, logger2);
        }

        /* renamed from: component1, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        /* renamed from: component2, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<MemoryCache> component3() {
            return this.memoryCacheLazy;
        }

        public final Lazy<DiskCache> component4() {
            return this.diskCacheLazy;
        }

        /* renamed from: component5, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: component6, reason: from getter */
        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        /* renamed from: component7, reason: from getter */
        public final Logger getLogger() {
            return this.logger;
        }

        public final Options copy(Context application, ImageRequest.Defaults defaults, Lazy<? extends MemoryCache> memoryCacheLazy, Lazy<? extends DiskCache> diskCacheLazy, EventListener.Factory eventListenerFactory, ComponentRegistry componentRegistry, Logger logger) {
            return new Options(application, defaults, memoryCacheLazy, diskCacheLazy, eventListenerFactory, componentRegistry, logger);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.areEqual(this.application, options.application) && Intrinsics.areEqual(this.defaults, options.defaults) && Intrinsics.areEqual(this.memoryCacheLazy, options.memoryCacheLazy) && Intrinsics.areEqual(this.diskCacheLazy, options.diskCacheLazy) && Intrinsics.areEqual(this.eventListenerFactory, options.eventListenerFactory) && Intrinsics.areEqual(this.componentRegistry, options.componentRegistry) && Intrinsics.areEqual(this.logger, options.logger);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
            Logger logger = this.logger;
            return iHashCode + (logger == null ? 0 : logger.hashCode());
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Options(Context context, ImageRequest.Defaults defaults, Lazy<? extends MemoryCache> lazy, Lazy<? extends DiskCache> lazy2, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            this.application = context;
            this.defaults = defaults;
            this.memoryCacheLazy = lazy;
            this.diskCacheLazy = lazy2;
            this.eventListenerFactory = factory;
            this.componentRegistry = componentRegistry;
            this.logger = logger;
        }

        public final Context getApplication() {
            return this.application;
        }

        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final Lazy<MemoryCache> getMemoryCacheLazy() {
            return this.memoryCacheLazy;
        }

        public final Lazy<DiskCache> getDiskCacheLazy() {
            return this.diskCacheLazy;
        }

        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        public final Logger getLogger() {
            return this.logger;
        }
    }
}
