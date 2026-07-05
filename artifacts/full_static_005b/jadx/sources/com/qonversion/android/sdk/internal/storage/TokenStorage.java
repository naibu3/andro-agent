package com.qonversion.android.sdk.internal.storage;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenStorage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "Lcom/qonversion/android/sdk/internal/storage/Storage;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "delete", "", "load", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TokenStorage implements Storage {
    private static final String TOKEN_KEY = "token_key";
    private final SharedPreferences preferences;

    public TokenStorage(SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Storage
    public String load() {
        String string = this.preferences.getString(TOKEN_KEY, "");
        return string == null ? "" : string;
    }

    @Override // com.qonversion.android.sdk.internal.storage.Storage
    public void delete() {
        this.preferences.edit().remove(TOKEN_KEY).apply();
    }
}
