package com.stripe.android.core.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Storage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/core/storage/SharedPreferencesStorage;", "Lcom/stripe/android/core/storage/Storage;", "context", "Landroid/content/Context;", "purpose", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "storeValue", "", SDKConstants.PARAM_KEY, "value", "", "", "", "getString", "defaultValue", "getLong", "getInt", "getFloat", "getBoolean", "remove", "clear", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPreferencesStorage implements Storage {
    private static final Companion Companion = new Companion(null);
    private static final String logTag;
    private final Context context;
    private final String purpose;

    /* renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    private final Lazy sharedPrefs;

    public SharedPreferencesStorage(Context context, String purpose) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.context = context;
        this.purpose = purpose;
        this.sharedPrefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.core.storage.SharedPreferencesStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SharedPreferencesStorage.sharedPrefs_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPrefs_delegate$lambda$0(SharedPreferencesStorage sharedPreferencesStorage) {
        return sharedPreferencesStorage.context.getSharedPreferences("stripe_shared_prefs", 0);
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putString(this.purpose + "_" + key, value);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putLong(this.purpose + "_" + key, value);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putInt(this.purpose + "_" + key, value);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putFloat(this.purpose + "_" + key, value);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean storeValue(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putBoolean(this.purpose + "_" + key, value);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to store " + value + " for " + key);
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                String string = sharedPrefs.getString(this.purpose + "_" + key, defaultValue);
                if (string != null) {
                    return string;
                }
            }
            Log.e(logTag, "Unable to retrieve a String for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                Log.e(logTag, key + " is not a String", th);
            } else {
                Log.d(logTag, "Error retrieving String for " + key, th);
            }
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public long getLong(String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                return sharedPrefs.getLong(this.purpose + "_" + key, defaultValue);
            }
            Log.e(logTag, "Unable to retrieve a Long for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                Log.e(logTag, key + " is not a Long", th);
            } else {
                Log.d(logTag, "Error retrieving Long for " + key, th);
            }
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public int getInt(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                return sharedPrefs.getInt(this.purpose + "_" + key, defaultValue);
            }
            Log.e(logTag, "Unable to retrieve an Int for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                Log.e(logTag, key + " is not a Int", th);
            } else {
                Log.d(logTag, "Error retrieving Int for " + key, th);
            }
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public float getFloat(String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                return sharedPrefs.getFloat(this.purpose + "_" + key, defaultValue);
            }
            Log.e(logTag, "Unable to retrieve a Float for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                Log.e(logTag, key + " is not a Float", th);
            } else {
                Log.d(logTag, "Error retrieving Float for " + key, th);
            }
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean getBoolean(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences sharedPrefs = getSharedPrefs();
            if (sharedPrefs != null) {
                return sharedPrefs.getBoolean(this.purpose + "_" + key, defaultValue);
            }
            Log.e(logTag, "Unable to retrieve a Boolean for " + key);
            return defaultValue;
        } catch (Throwable th) {
            if (th instanceof ClassCastException) {
                Log.e(logTag, key + " is not a Boolean", th);
            } else {
                Log.d(logTag, "Error retrieving Boolean for " + key, th);
            }
            return defaultValue;
        }
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.remove(key);
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to remove values");
        return false;
    }

    @Override // com.stripe.android.core.storage.Storage
    public boolean clear() {
        SharedPreferences sharedPrefs = getSharedPrefs();
        if (sharedPrefs != null) {
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.clear();
            return editorEdit.commit();
        }
        Log.e(logTag, "Shared preferences is unavailable to clear values");
        return false;
    }

    /* compiled from: Storage.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/storage/SharedPreferencesStorage$Companion;", "", "<init>", "()V", "logTag", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("SharedPreferencesStorage", "getSimpleName(...)");
        logTag = "SharedPreferencesStorage";
    }
}
