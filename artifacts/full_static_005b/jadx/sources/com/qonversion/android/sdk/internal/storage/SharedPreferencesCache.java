package com.qonversion.android.sdk.internal.storage;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPreferencesCache.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000fH\u0016J+\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J1\u0010\u001c\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u0002H\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H\u0016¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lcom/qonversion/android/sdk/internal/storage/Cache;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getBool", "", "key", "", "defValue", "getFloat", "", "getInt", "", "getLong", "", "getObject", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "adapter", "Lcom/squareup/moshi/JsonAdapter;", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;", "getString", "putBool", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putFloat", "putInt", "putLong", "putObject", "(Ljava/lang/String;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;)V", "putString", "remove", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SharedPreferencesCache implements Cache {
    private final SharedPreferences preferences;

    public SharedPreferencesCache(SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putInt(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().putInt(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public int getInt(String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferences.getInt(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public boolean getBool(String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferences.getBoolean(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putBool(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().putBoolean(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putFloat(String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().putFloat(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public float getFloat(String key, float defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferences.getFloat(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putLong(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().putLong(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public long getLong(String key, long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferences.getLong(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().putString(key, value).apply();
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public String getString(String key, String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferences.getString(key, defValue);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public <T> void putObject(String key, T value, JsonAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        String json = adapter.toJson(value);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        putString(key, json);
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public <T> T getObject(String key, JsonAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        String string = getString(key, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return adapter.fromJson(string);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.qonversion.android.sdk.internal.storage.Cache
    public void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences.edit().remove(key).apply();
    }
}
