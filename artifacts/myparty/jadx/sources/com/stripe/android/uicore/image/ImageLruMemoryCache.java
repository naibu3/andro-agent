package com.stripe.android.uicore.image;

import android.util.LruCache;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageLruMemoryCache.kt */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u000eJ\f\u0010\u0015\u001a\u00020\u0010*\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/uicore/image/ImageLruMemoryCache;", "", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "", "<init>", "(I)V", "getMaxSize", "()I", "lruCache", "com/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1", "getLruCache$annotations", "()V", "Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;", "put", "", SDKConstants.PARAM_KEY, "", "image", "Lcom/stripe/android/uicore/image/LoadedImage;", "get", "clear", "toKey", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageLruMemoryCache {
    public static final int $stable = 0;
    private final ImageLruMemoryCache$lruCache$1 lruCache;
    private final int maxSize;

    public ImageLruMemoryCache() {
        this(0, 1, null);
    }

    private static /* synthetic */ void getLruCache$annotations() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.stripe.android.uicore.image.ImageLruMemoryCache$lruCache$1] */
    public ImageLruMemoryCache(final int i) {
        this.maxSize = i;
        this.lruCache = new LruCache<String, LoadedImage>(i) { // from class: com.stripe.android.uicore.image.ImageLruMemoryCache$lruCache$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, LoadedImage image) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(image, "image");
                return image.getBitmap().getByteCount() / 1024;
            }
        };
    }

    public /* synthetic */ ImageLruMemoryCache(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8 : i);
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final void put(String key, LoadedImage image) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(image, "image");
        synchronized (this) {
            if (get(toKey(key)) == null) {
                put(toKey(key), image);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final LoadedImage get(String key) {
        LoadedImage loadedImage;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this) {
            loadedImage = get(toKey(key));
        }
        return loadedImage;
    }

    public final void clear() {
        synchronized (this) {
            evictAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final String toKey(String str) {
        return String.valueOf(str.hashCode());
    }
}
