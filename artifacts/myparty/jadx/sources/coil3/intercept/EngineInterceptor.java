package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Image;
import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.decode.DecodeResult;
import coil3.decode.Decoder;
import coil3.decode.FileImageSource;
import coil3.decode.ImageSource;
import coil3.fetch.FetchResult;
import coil3.fetch.Fetcher;
import coil3.fetch.ImageFetchResult;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.Interceptor;
import coil3.memory.MemoryCache;
import coil3.memory.MemoryCacheService;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.request.Options;
import coil3.request.RequestService;
import coil3.request.SuccessResult;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import coil3.util.UtilsKt;
import coil3.util.Utils_androidKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EngineInterceptor.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002'(B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ6\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\"J>\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcoil3/intercept/EngineInterceptor;", "Lcoil3/intercept/Interceptor;", "imageLoader", "Lcoil3/ImageLoader;", "systemCallbacks", "Lcoil3/util/SystemCallbacks;", "requestService", "Lcoil3/request/RequestService;", "logger", "Lcoil3/util/Logger;", "<init>", "(Lcoil3/ImageLoader;Lcoil3/util/SystemCallbacks;Lcoil3/request/RequestService;Lcoil3/util/Logger;)V", "memoryCacheService", "Lcoil3/memory/MemoryCacheService;", "intercept", "Lcoil3/request/ImageResult;", "chain", "Lcoil3/intercept/Interceptor$Chain;", "(Lcoil3/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "request", "Lcoil3/request/ImageRequest;", "mappedData", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil3/request/Options;", "eventListener", "Lcoil3/EventListener;", "(Lcoil3/request/ImageRequest;Ljava/lang/Object;Lcoil3/request/Options;Lcoil3/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "Lcoil3/fetch/FetchResult;", "components", "Lcoil3/ComponentRegistry;", "(Lcoil3/ComponentRegistry;Lcoil3/request/ImageRequest;Ljava/lang/Object;Lcoil3/request/Options;Lcoil3/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decode", "fetchResult", "Lcoil3/fetch/SourceFetchResult;", "(Lcoil3/fetch/SourceFetchResult;Lcoil3/ComponentRegistry;Lcoil3/request/ImageRequest;Ljava/lang/Object;Lcoil3/request/Options;Lcoil3/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ExecuteResult", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngineInterceptor implements Interceptor {
    public static final String TAG = "EngineInterceptor";
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final MemoryCacheService memoryCacheService;
    private final RequestService requestService;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: EngineInterceptor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {192}, m = "decode", n = {"this", "fetchResult", "components", "request", "mappedData", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "eventListener", "decoder", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    /* renamed from: coil3.intercept.EngineInterceptor$decode$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.decode(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {115, 119, 137}, m = "execute", n = {"this", "request", "mappedData", "eventListener", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "components", "fetchResult", "this", "request", "eventListener", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: coil3.intercept.EngineInterceptor$execute$1, reason: invalid class name and case insensitive filesystem */
    static final class C06811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C06811(Continuation<? super C06811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.execute(null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {158}, m = "fetch", n = {"this", "components", "request", "mappedData", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "eventListener", "fetcher", "searchIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: coil3.intercept.EngineInterceptor$fetch$1, reason: invalid class name and case insensitive filesystem */
    static final class C06821 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C06821(Continuation<? super C06821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.fetch(null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0}, l = {64}, m = "intercept", n = {"chain"}, s = {"L$0"})
    /* renamed from: coil3.intercept.EngineInterceptor$intercept$1, reason: invalid class name and case insensitive filesystem */
    static final class C06831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C06831(Continuation<? super C06831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.intercept(null, this);
        }
    }

    public EngineInterceptor(ImageLoader imageLoader, SystemCallbacks systemCallbacks, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(Interceptor.Chain chain, Continuation<? super ImageResult> continuation) throws Throwable {
        C06831 c06831;
        Throwable th;
        if (continuation instanceof C06831) {
            c06831 = (C06831) continuation;
            if ((c06831.label & Integer.MIN_VALUE) != 0) {
                c06831.label -= Integer.MIN_VALUE;
            } else {
                c06831 = new C06831(continuation);
            }
        }
        Object obj = c06831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c06831.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            try {
                ImageRequest request = chain.getRequest();
                Object data = request.getData();
                Size size = chain.getSize();
                EventListener eventListener = UtilsKt.getEventListener(chain);
                Options options = this.requestService.options(request, size);
                Scale scale = options.getScale();
                eventListener.mapStart(request, data);
                Object map = this.imageLoader.getComponents().map(data, options);
                eventListener.mapEnd(request, map);
                MemoryCache.Key keyNewCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
                MemoryCache.Value cacheValue = keyNewCacheKey != null ? this.memoryCacheService.getCacheValue(request, keyNewCacheKey, size, scale) : null;
                if (cacheValue != null) {
                    return this.memoryCacheService.newResult(chain, request, keyNewCacheKey, cacheValue);
                }
                CoroutineContext fetcherCoroutineContext = request.getFetcherCoroutineContext();
                try {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(request, map, options, eventListener, keyNewCacheKey, chain, null);
                    c06831.L$0 = chain;
                    c06831.label = 1;
                    Object objWithContext = BuildersKt.withContext(fetcherCoroutineContext, anonymousClass2, c06831);
                    return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
                } catch (Throwable th2) {
                    th = th2;
                    chain = chain;
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    return UtilsKt.ErrorResult(chain.getRequest(), th);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (!(th instanceof CancellationException)) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: coil3.intercept.EngineInterceptor$intercept$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
        final /* synthetic */ MemoryCache.Key $cacheKey;
        final /* synthetic */ Interceptor.Chain $chain;
        final /* synthetic */ EventListener $eventListener;
        final /* synthetic */ Object $mappedData;
        final /* synthetic */ Options $options;
        final /* synthetic */ ImageRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.$mappedData = obj;
            this.$options = options;
            this.$eventListener = eventListener;
            this.$cacheKey = key;
            this.$chain = chain;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EngineInterceptor.this.new AnonymousClass2(this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SuccessResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = EngineInterceptor.this.execute(this.$request, this.$mappedData, this.$options, this.$eventListener, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            EngineInterceptor.this.systemCallbacks.registerMemoryPressureCallbacks();
            boolean cacheValue = EngineInterceptor.this.memoryCacheService.setCacheValue(this.$cacheKey, this.$request, executeResult);
            Image image = executeResult.getImage();
            ImageRequest imageRequest = this.$request;
            DataSource dataSource = executeResult.getDataSource();
            MemoryCache.Key key = this.$cacheKey;
            if (!cacheValue) {
                key = null;
            }
            return new SuccessResult(image, imageRequest, dataSource, key, executeResult.getDiskCacheKey(), executeResult.isSampled(), UtilsKt.isPlaceholderCached(this.$chain));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c8, code lost:
    
        if (r0 == r9) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, coil3.request.Options] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, coil3.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, coil3.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) throws Throwable {
        C06811 c06811;
        SourceFetchResult sourceFetchResult;
        ImageSource source;
        EngineInterceptor engineInterceptor;
        ImageRequest imageRequest2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef;
        T t;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ImageRequest imageRequest3;
        EventListener eventListener3;
        ExecuteResult executeResult;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        EngineInterceptor engineInterceptor2;
        SourceFetchResult sourceFetchResult2;
        ImageSource source2;
        Object obj3;
        Object obj4;
        if (continuation instanceof C06811) {
            c06811 = (C06811) continuation;
            if ((c06811.label & Integer.MIN_VALUE) != 0) {
                c06811.label -= Integer.MIN_VALUE;
            } else {
                c06811 = new C06811(continuation);
            }
        }
        C06811 c068112 = c06811;
        Object obj5 = c068112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Ref.ObjectRef objectRef8 = c068112.label;
        try {
            if (objectRef8 == 0) {
                ResultKt.throwOnFailure(obj5);
                Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                objectRef9.element = options;
                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                objectRef10.element = this.imageLoader.getComponents();
                Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                try {
                    objectRef9.element = this.requestService.updateOptions((Options) objectRef9.element);
                    if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                        objectRef10.element = UtilsKt.addFirst(UtilsKt.addFirst(((ComponentRegistry) objectRef10.element).newBuilder(), imageRequest.getFetcherFactory()), imageRequest.getDecoderFactory()).build();
                    }
                    ComponentRegistry componentRegistry = (ComponentRegistry) objectRef10.element;
                    Options options2 = (Options) objectRef9.element;
                    c068112.L$0 = this;
                    c068112.L$1 = imageRequest;
                    c068112.L$2 = obj;
                    c068112.L$3 = eventListener;
                    c068112.L$4 = objectRef9;
                    c068112.L$5 = objectRef10;
                    c068112.L$6 = objectRef11;
                    c068112.L$7 = objectRef11;
                    c068112.label = 1;
                    Object objFetch = fetch(componentRegistry, imageRequest, obj, options2, eventListener, c068112);
                    if (objFetch != coroutine_suspended) {
                        engineInterceptor = this;
                        imageRequest2 = imageRequest;
                        obj2 = obj;
                        eventListener2 = eventListener;
                        objectRef = objectRef9;
                        t = objFetch;
                        objectRef2 = objectRef10;
                        objectRef3 = objectRef11;
                        objectRef4 = objectRef3;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    objectRef8 = objectRef11;
                    T t2 = objectRef8.element;
                    if (t2 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult != null) {
                    }
                    throw th;
                }
            }
            if (objectRef8 == 1) {
                objectRef3 = (Ref.ObjectRef) c068112.L$7;
                objectRef4 = (Ref.ObjectRef) c068112.L$6;
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) c068112.L$5;
                Ref.ObjectRef objectRef13 = (Ref.ObjectRef) c068112.L$4;
                EventListener eventListener4 = (EventListener) c068112.L$3;
                Object obj6 = c068112.L$2;
                ImageRequest imageRequest4 = (ImageRequest) c068112.L$1;
                EngineInterceptor engineInterceptor3 = (EngineInterceptor) c068112.L$0;
                try {
                    ResultKt.throwOnFailure(obj5);
                    objectRef2 = objectRef12;
                    objectRef = objectRef13;
                    eventListener2 = eventListener4;
                    obj2 = obj6;
                    imageRequest2 = imageRequest4;
                    engineInterceptor = engineInterceptor3;
                    t = obj5;
                } catch (Throwable th2) {
                    th = th2;
                    objectRef8 = objectRef4;
                    T t22 = objectRef8.element;
                    if (t22 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult != null) {
                        UtilsKt.closeQuietly(source);
                    }
                    throw th;
                }
            } else {
                if (objectRef8 != 2) {
                    if (objectRef8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj5);
                    obj4 = obj5;
                    ExecuteResult executeResult2 = (ExecuteResult) obj4;
                    Utils_androidKt.prepareToDraw(executeResult2.getImage());
                    return executeResult2;
                }
                objectRef5 = (Ref.ObjectRef) c068112.L$4;
                objectRef7 = (Ref.ObjectRef) c068112.L$3;
                eventListener3 = (EventListener) c068112.L$2;
                imageRequest3 = (ImageRequest) c068112.L$1;
                engineInterceptor2 = (EngineInterceptor) c068112.L$0;
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
                Ref.ObjectRef objectRef14 = objectRef7;
                executeResult = (ExecuteResult) obj3;
                objectRef6 = objectRef14;
                engineInterceptor = engineInterceptor2;
                EventListener eventListener5 = eventListener3;
                ImageRequest imageRequest5 = imageRequest3;
                T t3 = objectRef5.element;
                sourceFetchResult2 = t3 instanceof SourceFetchResult ? (SourceFetchResult) t3 : null;
                if (sourceFetchResult2 != null && (source2 = sourceFetchResult2.getSource()) != null) {
                    UtilsKt.closeQuietly(source2);
                }
                Options options3 = (Options) objectRef6.element;
                Logger logger = engineInterceptor.logger;
                c068112.L$0 = null;
                c068112.L$1 = null;
                c068112.L$2 = null;
                c068112.L$3 = null;
                c068112.L$4 = null;
                c068112.L$5 = null;
                c068112.L$6 = null;
                c068112.L$7 = null;
                c068112.label = 3;
                Object objTransform = EngineInterceptorKt.transform(executeResult, imageRequest5, options3, eventListener5, logger, c068112);
                obj4 = objTransform;
            }
            objectRef3.element = t;
            FetchResult fetchResult = (FetchResult) objectRef4.element;
            if (!(fetchResult instanceof SourceFetchResult)) {
                objectRef5 = objectRef4;
                imageRequest3 = imageRequest2;
                Ref.ObjectRef objectRef15 = objectRef;
                eventListener3 = eventListener2;
                if (!(fetchResult instanceof ImageFetchResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                executeResult = new ExecuteResult(((ImageFetchResult) objectRef5.element).getImage(), ((ImageFetchResult) objectRef5.element).getIsSampled(), ((ImageFetchResult) objectRef5.element).getDataSource(), null);
                objectRef6 = objectRef15;
                EventListener eventListener52 = eventListener3;
                ImageRequest imageRequest52 = imageRequest3;
                T t32 = objectRef5.element;
                if (t32 instanceof SourceFetchResult) {
                }
                if (sourceFetchResult2 != null) {
                }
                Options options32 = (Options) objectRef6.element;
                Logger logger2 = engineInterceptor.logger;
                c068112.L$0 = null;
                c068112.L$1 = null;
                c068112.L$2 = null;
                c068112.L$3 = null;
                c068112.L$4 = null;
                c068112.L$5 = null;
                c068112.L$6 = null;
                c068112.L$7 = null;
                c068112.label = 3;
                Object objTransform2 = EngineInterceptorKt.transform(executeResult, imageRequest52, options32, eventListener52, logger2, c068112);
                obj4 = objTransform2;
            } else {
                CoroutineContext decoderCoroutineContext = imageRequest2.getDecoderCoroutineContext();
                Ref.ObjectRef objectRef16 = objectRef4;
                try {
                    objectRef5 = objectRef16;
                    imageRequest3 = imageRequest2;
                    objectRef7 = objectRef;
                    eventListener3 = eventListener2;
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef16, objectRef2, imageRequest2, obj2, objectRef, eventListener2, null);
                    c068112.L$0 = engineInterceptor;
                    c068112.L$1 = imageRequest3;
                    c068112.L$2 = eventListener3;
                    c068112.L$3 = objectRef7;
                    c068112.L$4 = objectRef5;
                    c068112.L$5 = null;
                    c068112.L$6 = null;
                    c068112.L$7 = null;
                    c068112.label = 2;
                    Object objWithContext = BuildersKt.withContext(decoderCoroutineContext, engineInterceptor$execute$executeResult$1, c068112);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    engineInterceptor2 = engineInterceptor;
                    obj3 = objWithContext;
                    Ref.ObjectRef objectRef142 = objectRef7;
                    executeResult = (ExecuteResult) obj3;
                    objectRef6 = objectRef142;
                    engineInterceptor = engineInterceptor2;
                    EventListener eventListener522 = eventListener3;
                    ImageRequest imageRequest522 = imageRequest3;
                    T t322 = objectRef5.element;
                    if (t322 instanceof SourceFetchResult) {
                    }
                    if (sourceFetchResult2 != null) {
                        UtilsKt.closeQuietly(source2);
                    }
                    Options options322 = (Options) objectRef6.element;
                    Logger logger22 = engineInterceptor.logger;
                    c068112.L$0 = null;
                    c068112.L$1 = null;
                    c068112.L$2 = null;
                    c068112.L$3 = null;
                    c068112.L$4 = null;
                    c068112.L$5 = null;
                    c068112.L$6 = null;
                    c068112.L$7 = null;
                    c068112.label = 3;
                    Object objTransform22 = EngineInterceptorKt.transform(executeResult, imageRequest522, options322, eventListener522, logger22, c068112);
                    obj4 = objTransform22;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef8 = objectRef16;
                    T t222 = objectRef8.element;
                    sourceFetchResult = t222 instanceof SourceFetchResult ? (SourceFetchResult) t222 : null;
                    if (sourceFetchResult != null && (source = sourceFetchResult.getSource()) != null) {
                        UtilsKt.closeQuietly(source);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super FetchResult> continuation) {
        C06821 c06821;
        int i;
        EngineInterceptor engineInterceptor;
        Pair<Fetcher, Integer> pairNewFetcher;
        ImageSource source;
        if (continuation instanceof C06821) {
            c06821 = (C06821) continuation;
            if ((c06821.label & Integer.MIN_VALUE) != 0) {
                c06821.label -= Integer.MIN_VALUE;
            } else {
                c06821 = new C06821(continuation);
            }
        }
        Object obj2 = c06821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c06821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            i = 0;
            engineInterceptor = this;
            pairNewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
            if (pairNewFetcher != null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = c06821.I$0;
            Fetcher fetcher = (Fetcher) c06821.L$6;
            EventListener eventListener2 = (EventListener) c06821.L$5;
            options = (Options) c06821.L$4;
            Object obj3 = c06821.L$3;
            ImageRequest imageRequest2 = (ImageRequest) c06821.L$2;
            ComponentRegistry componentRegistry2 = (ComponentRegistry) c06821.L$1;
            engineInterceptor = (EngineInterceptor) c06821.L$0;
            ResultKt.throwOnFailure(obj2);
            C06821 c068212 = c06821;
            int i4 = i3;
            componentRegistry = componentRegistry2;
            C06821 c068213 = c068212;
            Fetcher first = fetcher;
            imageRequest = imageRequest2;
            eventListener = eventListener2;
            obj = obj3;
            FetchResult fetchResult = (FetchResult) obj2;
            try {
                eventListener.fetchEnd(imageRequest, first, options, fetchResult);
                if (fetchResult == null) {
                    return fetchResult;
                }
                i = i4;
                c06821 = c068213;
                pairNewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
                if (pairNewFetcher != null) {
                    throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                }
                first = pairNewFetcher.getFirst();
                int iIntValue = pairNewFetcher.getSecond().intValue() + 1;
                eventListener.fetchStart(imageRequest, first, options);
                c06821.L$0 = engineInterceptor;
                c06821.L$1 = componentRegistry;
                c06821.L$2 = imageRequest;
                c06821.L$3 = obj;
                c06821.L$4 = options;
                c06821.L$5 = eventListener;
                c06821.L$6 = first;
                c06821.I$0 = iIntValue;
                c06821.label = 1;
                Object objFetch = first.fetch(c06821);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                C06821 c068214 = c06821;
                i4 = iIntValue;
                obj2 = objFetch;
                c068213 = c068214;
                FetchResult fetchResult2 = (FetchResult) obj2;
                eventListener.fetchEnd(imageRequest, first, options, fetchResult2);
                if (fetchResult2 == null) {
                }
            } catch (Throwable th) {
                SourceFetchResult sourceFetchResult = fetchResult2 instanceof SourceFetchResult ? (SourceFetchResult) fetchResult2 : null;
                if (sourceFetchResult != null && (source = sourceFetchResult.getSource()) != null) {
                    UtilsKt.closeQuietly(source);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:21:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(SourceFetchResult sourceFetchResult, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        EngineInterceptor engineInterceptor;
        Pair<Decoder, Integer> pairNewDecoder;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            i = 0;
            engineInterceptor = this;
            pairNewDecoder = componentRegistry.newDecoder(sourceFetchResult, options, engineInterceptor.imageLoader, i);
            if (pairNewDecoder != null) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = anonymousClass1.I$0;
            Decoder decoder = (Decoder) anonymousClass1.L$7;
            EventListener eventListener2 = (EventListener) anonymousClass1.L$6;
            Options options2 = (Options) anonymousClass1.L$5;
            Object obj3 = anonymousClass1.L$4;
            ImageRequest imageRequest2 = (ImageRequest) anonymousClass1.L$3;
            ComponentRegistry componentRegistry2 = (ComponentRegistry) anonymousClass1.L$2;
            SourceFetchResult sourceFetchResult2 = (SourceFetchResult) anonymousClass1.L$1;
            engineInterceptor = (EngineInterceptor) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj2);
            AnonymousClass1 anonymousClass12 = anonymousClass1;
            int i4 = i3;
            sourceFetchResult = sourceFetchResult2;
            AnonymousClass1 anonymousClass13 = anonymousClass12;
            eventListener = eventListener2;
            imageRequest = imageRequest2;
            options = options2;
            obj = obj3;
            DecodeResult decodeResult = (DecodeResult) obj2;
            eventListener.decodeEnd(imageRequest, decoder, options, decodeResult);
            if (decodeResult != null) {
                i = i4;
                componentRegistry = componentRegistry2;
                anonymousClass1 = anonymousClass13;
                pairNewDecoder = componentRegistry.newDecoder(sourceFetchResult, options, engineInterceptor.imageLoader, i);
                if (pairNewDecoder != null) {
                    throw new IllegalStateException(("Unable to create a decoder that supports: " + obj).toString());
                }
                Decoder first = pairNewDecoder.getFirst();
                int iIntValue = pairNewDecoder.getSecond().intValue() + 1;
                eventListener.decodeStart(imageRequest, first, options);
                anonymousClass1.L$0 = engineInterceptor;
                anonymousClass1.L$1 = sourceFetchResult;
                anonymousClass1.L$2 = componentRegistry;
                anonymousClass1.L$3 = imageRequest;
                anonymousClass1.L$4 = obj;
                anonymousClass1.L$5 = options;
                anonymousClass1.L$6 = eventListener;
                anonymousClass1.L$7 = first;
                anonymousClass1.I$0 = iIntValue;
                anonymousClass1.label = 1;
                Object objDecode = first.decode(anonymousClass1);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                componentRegistry2 = componentRegistry;
                decoder = first;
                AnonymousClass1 anonymousClass14 = anonymousClass1;
                i4 = iIntValue;
                obj2 = objDecode;
                anonymousClass13 = anonymousClass14;
                DecodeResult decodeResult2 = (DecodeResult) obj2;
                eventListener.decodeEnd(imageRequest, decoder, options, decodeResult2);
                if (decodeResult2 != null) {
                }
            } else {
                Image image = decodeResult2.getImage();
                boolean isSampled = decodeResult2.getIsSampled();
                DataSource dataSource = sourceFetchResult.getDataSource();
                ImageSource source = sourceFetchResult.getSource();
                FileImageSource fileImageSource = source instanceof FileImageSource ? (FileImageSource) source : null;
                return new ExecuteResult(image, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey() : null);
            }
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "", "image", "Lcoil3/Image;", "isSampled", "", "dataSource", "Lcoil3/decode/DataSource;", "diskCacheKey", "", "<init>", "(Lcoil3/Image;ZLcoil3/decode/DataSource;Ljava/lang/String;)V", "getImage", "()Lcoil3/Image;", "()Z", "getDataSource", "()Lcoil3/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {
        private final DataSource dataSource;
        private final String diskCacheKey;
        private final Image image;
        private final boolean isSampled;

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Image image, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                image = executeResult.image;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(image, z, dataSource, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        /* renamed from: component3, reason: from getter */
        public final DataSource getDataSource() {
            return this.dataSource;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public final ExecuteResult copy(Image image, boolean isSampled, DataSource dataSource, String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) other;
            return Intrinsics.areEqual(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && Intrinsics.areEqual(this.diskCacheKey, executeResult.diskCacheKey);
        }

        public int hashCode() {
            int iHashCode = ((((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode()) * 31;
            String str = this.diskCacheKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ')';
        }

        public ExecuteResult(Image image, boolean z, DataSource dataSource, String str) {
            this.image = image;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final Image getImage() {
            return this.image;
        }

        public final boolean isSampled() {
            return this.isSampled;
        }

        public final DataSource getDataSource() {
            return this.dataSource;
        }

        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }
    }
}
