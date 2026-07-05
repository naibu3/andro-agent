package com.stripe.android.uicore.image;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.Logger;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: StripeImageLoader.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0002\b J0\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0083@¢\u0006\u0004\b\"\u0010\u001aJ \u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0083@¢\u0006\u0004\b#\u0010\u001cJ:\u0010$\u001a\u0002H%\"\u0004\b\u0000\u0010%2\u0006\u0010\u0015\u001a\u00020\u00102\u001c\u0010&\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0(\u0012\u0006\u0012\u0004\u0018\u00010\u00010'H\u0082@¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageLoader;", "", "context", "Landroid/content/Context;", "logger", "Lcom/stripe/android/core/Logger;", "memoryCache", "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;", "networkImageDecoder", "Lcom/stripe/android/uicore/image/NetworkImageDecoder;", "diskCache", "Lcom/stripe/android/uicore/image/ImageLruDiskCache;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V", "imageLoadMutexes", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/sync/Mutex;", "load", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "url", "width", "", "height", "load-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromMemory", "loadFromMemory-CmtIpJM", "loadFromDisk", "loadFromDisk-CmtIpJM", "loadFromNetwork", "loadFromNetwork-BWLJW6A", "loadFromNetwork-gIAlu-s", "withMutexByUrlLock", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "debug", "", "message", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeImageLoader {
    private static final String TAG = "StripeImageLoader";
    private final ImageLruDiskCache diskCache;
    private final ConcurrentHashMap<String, Mutex> imageLoadMutexes;
    private final Logger logger;
    private final ImageLruMemoryCache memoryCache;
    private final NetworkImageDecoder networkImageDecoder;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: StripeImageLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader", f = "StripeImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {149, 123}, m = "withMutexByUrlLock", n = {"this", "url", "action", "$this$withLock_u24default$iv", "this", "url", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.uicore.image.StripeImageLoader$withMutexByUrlLock$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeImageLoader.this.withMutexByUrlLock(null, null, this);
        }
    }

    public StripeImageLoader(Context context, Logger logger, ImageLruMemoryCache imageLruMemoryCache, NetworkImageDecoder networkImageDecoder, ImageLruDiskCache imageLruDiskCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkImageDecoder, "networkImageDecoder");
        this.logger = logger;
        this.memoryCache = imageLruMemoryCache;
        this.networkImageDecoder = networkImageDecoder;
        this.diskCache = imageLruDiskCache;
        this.imageLoadMutexes = new ConcurrentHashMap<>();
    }

    public /* synthetic */ StripeImageLoader(Context context, Logger logger, ImageLruMemoryCache imageLruMemoryCache, NetworkImageDecoder networkImageDecoder, ImageLruDiskCache imageLruDiskCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Logger.INSTANCE.getInstance(StripeImageLoaderKt.isDebuggable(context)) : logger, (i & 4) != 0 ? new ImageLruMemoryCache(0, 1, null) : imageLruMemoryCache, (i & 8) != 0 ? new NetworkImageDecoder() : networkImageDecoder, (i & 16) != 0 ? new ImageLruDiskCache(context, "stripe_image_cache", 0L, 4, null) : imageLruDiskCache);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: load-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8886loadBWLJW6A(String str, int i, int i2, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$load$1 stripeImageLoader$load$1;
        if (continuation instanceof StripeImageLoader$load$1) {
            stripeImageLoader$load$1 = (StripeImageLoader$load$1) continuation;
            if ((stripeImageLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$load$1.label -= Integer.MIN_VALUE;
            } else {
                stripeImageLoader$load$1 = new StripeImageLoader$load$1(this, continuation);
            }
        }
        Object objWithContext = stripeImageLoader$load$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stripeImageLoader$load$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io = Dispatchers.getIO();
            StripeImageLoader$load$2 stripeImageLoader$load$2 = new StripeImageLoader$load$2(this, str, i, i2, null);
            stripeImageLoader$load$1.label = 1;
            objWithContext = BuildersKt.withContext(io, stripeImageLoader$load$2, stripeImageLoader$load$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: load-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8887loadgIAlus(String str, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$load$3 stripeImageLoader$load$3;
        if (continuation instanceof StripeImageLoader$load$3) {
            stripeImageLoader$load$3 = (StripeImageLoader$load$3) continuation;
            if ((stripeImageLoader$load$3.label & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$load$3.label -= Integer.MIN_VALUE;
            } else {
                stripeImageLoader$load$3 = new StripeImageLoader$load$3(this, continuation);
            }
        }
        Object objWithContext = stripeImageLoader$load$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeImageLoader$load$3.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io = Dispatchers.getIO();
            StripeImageLoader$load$4 stripeImageLoader$load$4 = new StripeImageLoader$load$4(this, str, null);
            stripeImageLoader$load$3.label = 1;
            objWithContext = BuildersKt.withContext(io, stripeImageLoader$load$4, stripeImageLoader$load$3);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadFromMemory-CmtIpJM, reason: not valid java name */
    public final Result<Bitmap> m8883loadFromMemoryCmtIpJM(String url) {
        ImageLruMemoryCache imageLruMemoryCache = this.memoryCache;
        LoadedImage loadedImage = imageLruMemoryCache != null ? imageLruMemoryCache.get(url) : null;
        if (loadedImage != null) {
            debug("Image loaded from memory cache");
        } else {
            debug("Image not found on memory cache");
        }
        if (loadedImage == null) {
            return null;
        }
        ImageLruDiskCache imageLruDiskCache = this.diskCache;
        if (imageLruDiskCache != null) {
            imageLruDiskCache.put(url, loadedImage);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9117boximpl(Result.m9118constructorimpl(loadedImage.getBitmap()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadFromDisk-CmtIpJM, reason: not valid java name */
    public final Result<Bitmap> m8882loadFromDiskCmtIpJM(String url) {
        ImageLruDiskCache imageLruDiskCache = this.diskCache;
        LoadedImage loadedImage = imageLruDiskCache != null ? imageLruDiskCache.get(url) : null;
        if (loadedImage != null) {
            debug("Image loaded from disk cache");
        } else {
            debug("Image not found on disk cache");
        }
        if (loadedImage == null) {
            return null;
        }
        ImageLruMemoryCache imageLruMemoryCache = this.memoryCache;
        if (imageLruMemoryCache != null) {
            imageLruMemoryCache.put(url, loadedImage);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9117boximpl(Result.m9118constructorimpl(loadedImage.getBitmap()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: loadFromNetwork-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8884loadFromNetworkBWLJW6A(String str, int i, int i2, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$loadFromNetwork$1 stripeImageLoader$loadFromNetwork$1;
        StripeImageLoader stripeImageLoader;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        Bitmap bitmap;
        if (continuation instanceof StripeImageLoader$loadFromNetwork$1) {
            stripeImageLoader$loadFromNetwork$1 = (StripeImageLoader$loadFromNetwork$1) continuation;
            if ((stripeImageLoader$loadFromNetwork$1.label & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$loadFromNetwork$1.label -= Integer.MIN_VALUE;
            } else {
                stripeImageLoader$loadFromNetwork$1 = new StripeImageLoader$loadFromNetwork$1(this, continuation);
            }
        }
        Object objDecode = stripeImageLoader$loadFromNetwork$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stripeImageLoader$loadFromNetwork$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objDecode);
            try {
                Result.Companion companion = Result.INSTANCE;
                debug("Image " + str + " loading from internet (" + i + " x " + i2 + ")");
                NetworkImageDecoder networkImageDecoder = this.networkImageDecoder;
                URL url = new URL(str);
                stripeImageLoader$loadFromNetwork$1.L$0 = this;
                stripeImageLoader$loadFromNetwork$1.L$1 = str;
                stripeImageLoader$loadFromNetwork$1.label = 1;
                objDecode = networkImageDecoder.decode(url, i, i2, stripeImageLoader$loadFromNetwork$1);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeImageLoader = this;
            } catch (Throwable th) {
                th = th;
                stripeImageLoader = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) stripeImageLoader$loadFromNetwork$1.L$1;
            stripeImageLoader = (StripeImageLoader) stripeImageLoader$loadFromNetwork$1.L$0;
            try {
                ResultKt.throwOnFailure(objDecode);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        LoadedImage loadedImage = (LoadedImage) objDecode;
        if (loadedImage != null) {
            ImageLruDiskCache imageLruDiskCache = stripeImageLoader.diskCache;
            if (imageLruDiskCache != null) {
                imageLruDiskCache.put(str, loadedImage);
            }
            ImageLruMemoryCache imageLruMemoryCache = stripeImageLoader.memoryCache;
            if (imageLruMemoryCache != null) {
                imageLruMemoryCache.put(str, loadedImage);
            }
            bitmap = loadedImage.getBitmap();
        } else {
            bitmap = null;
        }
        objM9118constructorimpl = Result.m9118constructorimpl(bitmap);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            stripeImageLoader.logger.error("StripeImageLoader: Could not load image from network", thM9121exceptionOrNullimpl);
        }
        return objM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: loadFromNetwork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8885loadFromNetworkgIAlus(String str, Continuation<? super Result<Bitmap>> continuation) {
        StripeImageLoader$loadFromNetwork$4 stripeImageLoader$loadFromNetwork$4;
        StripeImageLoader stripeImageLoader;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        Bitmap bitmap;
        if (continuation instanceof StripeImageLoader$loadFromNetwork$4) {
            stripeImageLoader$loadFromNetwork$4 = (StripeImageLoader$loadFromNetwork$4) continuation;
            if ((stripeImageLoader$loadFromNetwork$4.label & Integer.MIN_VALUE) != 0) {
                stripeImageLoader$loadFromNetwork$4.label -= Integer.MIN_VALUE;
            } else {
                stripeImageLoader$loadFromNetwork$4 = new StripeImageLoader$loadFromNetwork$4(this, continuation);
            }
        }
        Object objDecode = stripeImageLoader$loadFromNetwork$4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeImageLoader$loadFromNetwork$4.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objDecode);
            try {
                Result.Companion companion = Result.INSTANCE;
                debug("Image " + str + " loading from internet");
                NetworkImageDecoder networkImageDecoder = this.networkImageDecoder;
                URL url = new URL(str);
                stripeImageLoader$loadFromNetwork$4.L$0 = this;
                stripeImageLoader$loadFromNetwork$4.L$1 = str;
                stripeImageLoader$loadFromNetwork$4.label = 1;
                objDecode = networkImageDecoder.decode(url, stripeImageLoader$loadFromNetwork$4);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeImageLoader = this;
            } catch (Throwable th) {
                th = th;
                stripeImageLoader = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) stripeImageLoader$loadFromNetwork$4.L$1;
            stripeImageLoader = (StripeImageLoader) stripeImageLoader$loadFromNetwork$4.L$0;
            try {
                ResultKt.throwOnFailure(objDecode);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        LoadedImage loadedImage = (LoadedImage) objDecode;
        if (loadedImage != null) {
            ImageLruDiskCache imageLruDiskCache = stripeImageLoader.diskCache;
            if (imageLruDiskCache != null) {
                imageLruDiskCache.put(str, loadedImage);
            }
            ImageLruMemoryCache imageLruMemoryCache = stripeImageLoader.memoryCache;
            if (imageLruMemoryCache != null) {
                imageLruMemoryCache.put(str, loadedImage);
            }
            bitmap = loadedImage.getBitmap();
        } else {
            bitmap = null;
        }
        objM9118constructorimpl = Result.m9118constructorimpl(bitmap);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            stripeImageLoader.logger.error("StripeImageLoader: Could not load image from network", thM9121exceptionOrNullimpl);
        }
        return objM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object withMutexByUrlLock(String str, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        StripeImageLoader stripeImageLoader;
        Mutex mutexPutIfAbsent;
        Mutex mutex2;
        String str2;
        StripeImageLoader stripeImageLoader2;
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
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                ConcurrentHashMap<String, Mutex> concurrentHashMap = this.imageLoadMutexes;
                Mutex mutexMutex$default = concurrentHashMap.get(str);
                if (mutexMutex$default == null && (mutexPutIfAbsent = concurrentHashMap.putIfAbsent(str, (mutexMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
                    mutexMutex$default = mutexPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(mutexMutex$default, "getOrPut(...)");
                mutex = mutexMutex$default;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.L$2 = function1;
                anonymousClass1.L$3 = mutex;
                anonymousClass1.label = 1;
                if (mutex.lock(null, anonymousClass1) != coroutine_suspended) {
                    stripeImageLoader = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) anonymousClass1.L$2;
                str2 = (String) anonymousClass1.L$1;
                stripeImageLoader2 = (StripeImageLoader) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    mutex2.unlock(null);
                    stripeImageLoader2.imageLoadMutexes.remove(str2);
                    return objInvoke;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) anonymousClass1.L$3;
            function1 = (Function1) anonymousClass1.L$2;
            String str3 = (String) anonymousClass1.L$1;
            stripeImageLoader = (StripeImageLoader) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            mutex = mutex3;
            str = str3;
            anonymousClass1.L$0 = stripeImageLoader;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = mutex;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 2;
            objInvoke = function1.invoke(anonymousClass1);
            if (objInvoke != coroutine_suspended) {
                str2 = str;
                mutex2 = mutex;
                stripeImageLoader2 = stripeImageLoader;
                mutex2.unlock(null);
                stripeImageLoader2.imageLoadMutexes.remove(str2);
                return objInvoke;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    private final void debug(String message) {
        this.logger.debug("StripeImageLoader: " + message);
    }

    /* compiled from: StripeImageLoader.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;", "", "<init>", "()V", "TAG", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
