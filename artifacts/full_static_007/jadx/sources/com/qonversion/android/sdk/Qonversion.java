package com.qonversion.android.sdk;

import android.app.Activity;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.QonversionInternal;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Qonversion.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 D2\u00020\u0001:\u0001DJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH&J$\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0012H&J\u001e\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0007\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\"H&J \u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u0012H'J(\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\u0012H&J \u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020-H&J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020-H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u000200H&J&\u0010/\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u00102\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u000200H&J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0018\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u00105\u001a\u00020;2\u0006\u00106\u001a\u00020\u0005H&J\b\u0010<\u001a\u00020\u0003H&J\b\u0010=\u001a\u00020\u0003H&J \u0010>\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020\u0012H'J(\u0010>\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u001bH&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020CH&¨\u0006E"}, d2 = {"Lcom/qonversion/android/sdk/Qonversion;", "", "attachUserToExperiment", "", "experimentId", "", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attribution", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "provider", "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "checkEntitlements", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "checkTrialIntroEligibility", "productIds", "", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "identify", "userID", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "isFallbackFileAccessible", "", "logout", "offerings", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "products", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "purchase", "context", "Landroid/app/Activity;", "purchaseModel", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "options", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "remoteConfig", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "contextKey", "remoteConfigList", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "includeEmptyContextKey", "restore", "setCustomUserProperty", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setEntitlementsUpdateListener", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "setUserProperty", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "syncHistoricalData", "syncPurchases", "updatePurchase", "purchaseUpdateModel", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "userInfo", "userProperties", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Qonversion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    static Qonversion getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    @JvmStatic
    static Qonversion initialize(QonversionConfig qonversionConfig) {
        return INSTANCE.initialize(qonversionConfig);
    }

    void attachUserToExperiment(String experimentId, String groupId, QonversionExperimentAttachCallback callback);

    void attachUserToRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback);

    void attribution(Map<String, ? extends Object> data, QAttributionProvider provider);

    void checkEntitlements(QonversionEntitlementsCallback callback);

    void checkTrialIntroEligibility(List<String> productIds, QonversionEligibilityCallback callback);

    void detachUserFromExperiment(String experimentId, QonversionExperimentAttachCallback callback);

    void detachUserFromRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback);

    void identify(String userID);

    void identify(String userID, QonversionUserCallback callback);

    boolean isFallbackFileAccessible();

    void logout();

    void offerings(QonversionOfferingsCallback callback);

    void products(QonversionProductsCallback callback);

    @Deprecated(message = "Use the new purchase() method", replaceWith = @ReplaceWith(expression = "purchase(context, TODO(\"pass product here\"), callback)", imports = {}))
    void purchase(Activity context, QPurchaseModel purchaseModel, QonversionEntitlementsCallback callback);

    void purchase(Activity context, QProduct product, QPurchaseOptions options, QonversionEntitlementsCallback callback);

    void purchase(Activity context, QProduct product, QonversionEntitlementsCallback callback);

    void remoteConfig(QonversionRemoteConfigCallback callback);

    void remoteConfig(String contextKey, QonversionRemoteConfigCallback callback);

    void remoteConfigList(QonversionRemoteConfigListCallback callback);

    void remoteConfigList(List<String> contextKeys, boolean includeEmptyContextKey, QonversionRemoteConfigListCallback callback);

    void restore(QonversionEntitlementsCallback callback);

    void setCustomUserProperty(String key, String value);

    void setEntitlementsUpdateListener(QEntitlementsUpdateListener entitlementsUpdateListener);

    void setUserProperty(QUserPropertyKey key, String value);

    void syncHistoricalData();

    void syncPurchases();

    @Deprecated(message = "Use the new updatePurchase() method", replaceWith = @ReplaceWith(expression = "updatePurchase(context, TODO(\"pass product here\"), TODO(\"pass purchase options here\"), callback)", imports = {}))
    void updatePurchase(Activity context, QPurchaseUpdateModel purchaseUpdateModel, QonversionEntitlementsCallback callback);

    void updatePurchase(Activity context, QProduct product, QPurchaseOptions options, QonversionEntitlementsCallback callback);

    void userInfo(QonversionUserCallback callback);

    void userProperties(QonversionUserPropertiesCallback callback);

    /* compiled from: Qonversion.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/Qonversion$Companion;", "", "()V", "backingInstance", "Lcom/qonversion/android/sdk/Qonversion;", "shared", "getSharedInstance$annotations", "getSharedInstance", "()Lcom/qonversion/android/sdk/Qonversion;", "initialize", "config", "Lcom/qonversion/android/sdk/QonversionConfig;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Qonversion backingInstance;

        @JvmStatic
        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        private Companion() {
        }

        public final Qonversion getSharedInstance() {
            Qonversion qonversion = backingInstance;
            if (qonversion != null) {
                return qonversion;
            }
            throw new UninitializedPropertyAccessException("Qonversion has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion.");
        }

        @JvmStatic
        public final Qonversion initialize(QonversionConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            Qonversion qonversion = backingInstance;
            if (qonversion != null) {
                Log.e("Qonversion", "Qonversion has been initialized already. Multiple instances of Qonversion are not supported now.");
                return qonversion;
            }
            QonversionInternal qonversionInternal = new QonversionInternal(new InternalConfig(config), config.getApplication());
            backingInstance = qonversionInternal;
            return qonversionInternal;
        }
    }
}
