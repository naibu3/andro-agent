package com.qonversion.android.sdk.internal.services;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: QUserInfoService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "", "preferences", "Lcom/qonversion/android/sdk/internal/storage/Cache;", "tokenStorage", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V", "deleteUser", "", "generateRandomUserID", "", "getPartnersIdentityId", "logoutIfNeeded", "", "obtainUserID", "storePartnersIdentityId", "userID", "storeQonversionUserId", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QUserInfoService {
    public static final String TEST_UID = "40egafre6_e_";
    private final Cache preferences;
    private final TokenStorage tokenStorage;

    @Inject
    public QUserInfoService(Cache preferences, TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.preferences = preferences;
        this.tokenStorage = tokenStorage;
    }

    public final String obtainUserID() {
        String strLoad;
        String string = this.preferences.getString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        String str = string;
        if (str == null || str.length() == 0) {
            strLoad = this.tokenStorage.load();
            this.tokenStorage.delete();
        } else {
            strLoad = string;
        }
        String str2 = strLoad;
        if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(strLoad, TEST_UID)) {
            strLoad = generateRandomUserID();
        }
        if (str == null || str.length() == 0 || Intrinsics.areEqual(string, TEST_UID)) {
            this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, strLoad);
            this.preferences.putString(Constants.PREFS_ORIGINAL_USER_ID_KEY, strLoad);
        }
        return strLoad;
    }

    public final void storeQonversionUserId(String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, userID);
    }

    public final void storePartnersIdentityId(String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, userID);
    }

    public final String getPartnersIdentityId() {
        return this.preferences.getString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
    }

    public final boolean logoutIfNeeded() {
        String string = this.preferences.getString(Constants.PREFS_ORIGINAL_USER_ID_KEY, null);
        String string2 = this.preferences.getString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
        if (Intrinsics.areEqual(string, string2)) {
            return false;
        }
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, string);
        return true;
    }

    public final void deleteUser() {
        this.preferences.putString(Constants.PREFS_ORIGINAL_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_QONVERSION_USER_ID_KEY, null);
        this.preferences.putString(Constants.PREFS_PARTNER_IDENTITY_ID_KEY, null);
        this.tokenStorage.delete();
    }

    private final String generateRandomUserID() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "QON_" + new Regex("-").replace(string, "");
    }
}
