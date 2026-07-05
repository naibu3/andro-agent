package com.qonversion.android.sdk.internal.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH&J+\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H&¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H&J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\bH&J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH&J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH&J1\u0010\u0019\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u0002H\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H&¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/Cache;", "", "getBool", "", "key", "", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getObject", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "adapter", "Lcom/squareup/moshi/JsonAdapter;", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;", "getString", "putBool", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putFloat", "putInt", "putLong", "putObject", "(Ljava/lang/String;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;)V", "putString", "remove", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Cache {
    boolean getBool(String key, boolean defValue);

    float getFloat(String key, float defValue);

    int getInt(String key, int defValue);

    long getLong(String key, long defValue);

    <T> T getObject(String key, JsonAdapter<T> adapter);

    String getString(String key, String defValue);

    void putBool(String key, boolean value);

    void putFloat(String key, float value);

    void putInt(String key, int value);

    void putLong(String key, long value);

    <T> void putObject(String key, T value, JsonAdapter<T> adapter);

    void putString(String key, String value);

    void remove(String key);

    /* compiled from: Cache.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean getBool$default(Cache cache, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cache.getBool(str, z);
        }
    }
}
