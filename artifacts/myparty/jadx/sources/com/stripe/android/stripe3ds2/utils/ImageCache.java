package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.webkit.Profile;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageCache.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H¦\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "", "clear", "", "get", "Landroid/graphics/Bitmap;", SDKConstants.PARAM_KEY, "", "set", "bitmap", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImageCache {
    void clear();

    Bitmap get(String key);

    void set(String key, Bitmap bitmap);

    /* compiled from: ImageCache.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\nH\u0096\u0002J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000bH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "<init>", "()V", "KB", "", "MAX_SIZE", "cacheSize", "cache", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "getCache$3ds2sdk_release$annotations", "getCache$3ds2sdk_release", "()Landroid/util/LruCache;", "get", SDKConstants.PARAM_KEY, "set", "", "bitmap", "clear", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default implements ImageCache {
        public static final Default INSTANCE = new Default();
        private static final int KB = 1024;
        private static final int MAX_SIZE = 10240;
        private static final LruCache<String, Bitmap> cache;
        private static final int cacheSize;

        public static /* synthetic */ void getCache$3ds2sdk_release$annotations() {
        }

        private Default() {
        }

        static {
            final int iMin = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), MAX_SIZE);
            cacheSize = iMin;
            cache = new LruCache<String, Bitmap>(iMin) { // from class: com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                public int sizeOf(String key, Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    return bitmap.getByteCount() / 1024;
                }
            };
        }

        public final LruCache<String, Bitmap> getCache$3ds2sdk_release() {
            return cache;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public Bitmap get(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return cache.get(key);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void set(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            cache.put(key, bitmap);
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void clear() {
            cache.evictAll();
        }
    }
}
