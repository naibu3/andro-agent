package io.qonversion.sandwich;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.PreferenceManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.QonversionConfig;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
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
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionSandwich.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002,/\u0018\u00002\u00020\u0001:\u0001^B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0010J\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010\u0014\u001a\u00020\u0015JK\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010'\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`)2\u0006\u0010*\u001a\u00020 H\u0002J\u0015\u0010+\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u00100J\u0016\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015JL\u00103\u001a\u00020\f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010;\u001a\u00020 J\u000e\u0010<\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u000e2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\fJ\u000e\u0010C\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010D\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015JS\u0010E\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010F\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u000e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010GJ\u0018\u0010H\u001a\u00020\f2\b\u0010I\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010J\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010J\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010K\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010L\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000eJ\u0016\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000eJ\u0016\u0010R\u001a\u00020\f2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010U\u001a\u00020\fJ\u0006\u0010V\u001a\u00020\fJ\u000e\u0010W\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010X\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010Y\u001a\u00020Z*\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\u000eH\u0002J\f\u0010\\\u001a\u00020Z*\u00020ZH\u0002J\u0016\u0010]\u001a\u00020Z*\u00020Z2\b\u00108\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lio/qonversion/sandwich/QonversionSandwich;", "", "application", "Landroid/app/Application;", "activityProvider", "Lio/qonversion/sandwich/ActivityProvider;", "qonversionEventsListener", "Lio/qonversion/sandwich/QonversionEventsListener;", "(Landroid/app/Application;Lio/qonversion/sandwich/ActivityProvider;Lio/qonversion/sandwich/QonversionEventsListener;)V", "noActivityForPurchaseError", "Lcom/qonversion/android/sdk/dto/QonversionError;", "addAttributionData", "", "providerKey", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "attachUserToExperiment", "experimentId", "groupId", "resultListener", "Lio/qonversion/sandwich/ResultListener;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "checkEntitlements", "checkTrialIntroEligibility", "ids", "", "configurePurchaseOptions", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "offerId", "applyOffer", "", "oldProduct", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "updatePolicyKey", "contextKeys", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "emptyResult", "Lio/qonversion/sandwich/BridgeData;", "success", "getEntitlementsCallback", "io/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1", "(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;", "getUserCallback", "io/qonversion/sandwich/QonversionSandwich$getUserCallback$1", "(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;", "identify", "userId", "initialize", "context", "Landroid/content/Context;", "projectKey", "launchModeKey", "environmentKey", "entitlementsCacheLifetimeKey", "proxyUrl", "kidsMode", "isFallbackFileAccessible", "loadProduct", "productId", "offeringId", "callback", "Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;", "logout", "offerings", "products", "purchase", "oldProductId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V", "remoteConfig", "contextKey", "remoteConfigList", "includeEmptyContextKey", "restore", "setCustomProperty", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setDefinedProperty", "propertyKey", "storeSdkInfo", Constants.ScionAnalytics.PARAM_SOURCE, "version", "syncHistoricalData", "syncPurchases", "userInfo", "userProperties", "setEntitlementsCacheLifetime", "Lcom/qonversion/android/sdk/QonversionConfig$Builder;", "lifetimeKey", "setEntitlementsUpdateListener", "setEnvironment", "ProductCallback", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QonversionSandwich {
    private final ActivityProvider activityProvider;
    private final Application application;
    private final QonversionError noActivityForPurchaseError;
    private final QonversionEventsListener qonversionEventsListener;

    /* compiled from: QonversionSandwich.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;", "", "onLoadingFailed", "", "onProductLoaded", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private interface ProductCallback {
        void onLoadingFailed();

        void onProductLoaded(QProduct product);
    }

    public QonversionSandwich(Application application, ActivityProvider activityProvider, QonversionEventsListener qonversionEventsListener) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(qonversionEventsListener, "qonversionEventsListener");
        this.application = application;
        this.activityProvider = activityProvider;
        this.qonversionEventsListener = qonversionEventsListener;
        this.noActivityForPurchaseError = new QonversionError(QonversionErrorCode.PurchaseInvalid, "Current Android activity is null, cannot perform the action.", null, 4, null);
    }

    public final void initialize(Context context, String projectKey, String launchModeKey, String environmentKey, String entitlementsCacheLifetimeKey, String proxyUrl, boolean kidsMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projectKey, "projectKey");
        Intrinsics.checkNotNullParameter(launchModeKey, "launchModeKey");
        QonversionConfig.Builder entitlementsUpdateListener = setEntitlementsUpdateListener(setEntitlementsCacheLifetime(setEnvironment(new QonversionConfig.Builder(context, projectKey, QLaunchMode.valueOf(launchModeKey)), environmentKey), entitlementsCacheLifetimeKey));
        if (proxyUrl != null) {
            entitlementsUpdateListener.setProxyURL(proxyUrl);
        }
        if (kidsMode) {
            entitlementsUpdateListener.enableKidsMode();
        }
        Qonversion.INSTANCE.initialize(entitlementsUpdateListener.build());
    }

    public final void storeSdkInfo(String source, String version) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(version, "version");
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.application).edit();
        editorEdit.putString("com.qonversion.keys.sourceVersion", version);
        editorEdit.putString("com.qonversion.keys.source", source);
        editorEdit.apply();
    }

    public final void purchase(final String productId, final String offerId, final Boolean applyOffer, final String oldProductId, final String updatePolicyKey, final List<String> contextKeys, ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        final Activity currentActivity = this.activityProvider.getCurrentActivity();
        if (currentActivity == null) {
            resultListener.onError(MappersKt.toSandwichError(this.noActivityForPurchaseError));
        } else {
            final C02041 entitlementsCallback = getEntitlementsCallback(resultListener);
            Qonversion.INSTANCE.getSharedInstance().products(new QonversionProductsCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.purchase.1
                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onSuccess(Map<String, QProduct> products) {
                    Intrinsics.checkNotNullParameter(products, "products");
                    QProduct qProduct = products.get(productId);
                    QProduct qProduct2 = products.get(oldProductId);
                    QPurchaseOptions qPurchaseOptionsConfigurePurchaseOptions = this.configurePurchaseOptions(offerId, applyOffer, qProduct2, updatePolicyKey, contextKeys);
                    if (qProduct != null && qProduct2 != null) {
                        Qonversion.INSTANCE.getSharedInstance().updatePurchase(currentActivity, qProduct, qPurchaseOptionsConfigurePurchaseOptions, entitlementsCallback);
                    } else if (qProduct != null) {
                        Qonversion.INSTANCE.getSharedInstance().purchase(currentActivity, qProduct, qPurchaseOptionsConfigurePurchaseOptions, entitlementsCallback);
                    } else {
                        entitlementsCallback.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
                    }
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    entitlementsCallback.onError(error);
                }
            });
        }
    }

    public final void checkEntitlements(ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().checkEntitlements(getEntitlementsCallback(resultListener));
    }

    public final void offerings(final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().offerings(new QonversionOfferingsCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.offerings.1
            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onSuccess(QOfferings offerings) {
                Intrinsics.checkNotNullParameter(offerings, "offerings");
                resultListener.onSuccess(MappersKt.toMap(offerings));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void products(final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().products(new QonversionProductsCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.products.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(Map<String, QProduct> products) {
                Intrinsics.checkNotNullParameter(products, "products");
                resultListener.onSuccess(MappersKt.toProductsMap(products));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void restore(ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().restore(getEntitlementsCallback(resultListener));
    }

    public final void syncPurchases() {
        Qonversion.INSTANCE.getSharedInstance().syncPurchases();
    }

    public final void checkTrialIntroEligibility(List<String> ids, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().checkTrialIntroEligibility(ids, new QonversionEligibilityCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.checkTrialIntroEligibility.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
            public void onSuccess(Map<String, QEligibility> eligibilities) {
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                resultListener.onSuccess(MappersKt.toEligibilityMap(eligibilities));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void userInfo(ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().userInfo(getUserCallback(resultListener));
    }

    public final void identify(String userId, ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().identify(userId, getUserCallback(resultListener));
    }

    public final void setDefinedProperty(String propertyKey, String value) {
        Intrinsics.checkNotNullParameter(propertyKey, "propertyKey");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Qonversion.INSTANCE.getSharedInstance().setUserProperty(QUserPropertyKey.valueOf(propertyKey), value);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void setCustomProperty(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Qonversion.INSTANCE.getSharedInstance().setCustomUserProperty(key, value);
    }

    public final void userProperties(final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().userProperties(new QonversionUserPropertiesCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.userProperties.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback
            public void onSuccess(QUserProperties userProperties) {
                Intrinsics.checkNotNullParameter(userProperties, "userProperties");
                resultListener.onSuccess(MappersKt.toMap(userProperties));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void logout() {
        Qonversion.INSTANCE.getSharedInstance().logout();
    }

    public final void addAttributionData(String providerKey, Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(providerKey, "providerKey");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Qonversion.INSTANCE.getSharedInstance().attribution(data, QAttributionProvider.valueOf(providerKey));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void remoteConfig(String contextKey, final ResultListener resultListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        QonversionRemoteConfigCallback qonversionRemoteConfigCallback = new QonversionRemoteConfigCallback() { // from class: io.qonversion.sandwich.QonversionSandwich$remoteConfig$callback$1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onSuccess(QRemoteConfig remoteConfig) {
                Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                resultListener.onSuccess(MappersKt.toMap(remoteConfig));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        };
        if (contextKey != null) {
            Qonversion.INSTANCE.getSharedInstance().remoteConfig(contextKey, qonversionRemoteConfigCallback);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Qonversion.INSTANCE.getSharedInstance().remoteConfig(qonversionRemoteConfigCallback);
        }
    }

    public final void remoteConfigList(List<String> contextKeys, boolean includeEmptyContextKey, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().remoteConfigList(contextKeys, includeEmptyContextKey, new QonversionRemoteConfigListCallback() { // from class: io.qonversion.sandwich.QonversionSandwich$remoteConfigList$callback$1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(QRemoteConfigList remoteConfigList) {
                Intrinsics.checkNotNullParameter(remoteConfigList, "remoteConfigList");
                resultListener.onSuccess(MappersKt.toMap(remoteConfigList));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void remoteConfigList(final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().remoteConfigList(new QonversionRemoteConfigListCallback() { // from class: io.qonversion.sandwich.QonversionSandwich$remoteConfigList$callback$2
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(QRemoteConfigList remoteConfigList) {
                Intrinsics.checkNotNullParameter(remoteConfigList, "remoteConfigList");
                resultListener.onSuccess(MappersKt.toMap(remoteConfigList));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void attachUserToExperiment(String experimentId, String groupId, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().attachUserToExperiment(experimentId, groupId, new QonversionExperimentAttachCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.attachUserToExperiment.1
            @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
            public void onSuccess() {
                resultListener.onSuccess(this.emptyResult(true));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void detachUserFromExperiment(String experimentId, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().detachUserFromExperiment(experimentId, new QonversionExperimentAttachCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.detachUserFromExperiment.1
            @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
            public void onSuccess() {
                resultListener.onSuccess(this.emptyResult(true));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void attachUserToRemoteConfiguration(String remoteConfigurationId, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().attachUserToRemoteConfiguration(remoteConfigurationId, new QonversionRemoteConfigurationAttachCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.attachUserToRemoteConfiguration.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
            public void onSuccess() {
                resultListener.onSuccess(this.emptyResult(true));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void detachUserFromRemoteConfiguration(String remoteConfigurationId, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().detachUserFromRemoteConfiguration(remoteConfigurationId, new QonversionRemoteConfigurationAttachCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.detachUserFromRemoteConfiguration.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
            public void onSuccess() {
                resultListener.onSuccess(this.emptyResult(true));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    public final void syncHistoricalData() {
        Qonversion.INSTANCE.getSharedInstance().syncHistoricalData();
    }

    public final void isFallbackFileAccessible(ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        resultListener.onSuccess(emptyResult(Qonversion.INSTANCE.getSharedInstance().isFallbackFileAccessible()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> emptyResult(boolean success) {
        return MapsKt.mapOf(TuplesKt.to("success", Boolean.valueOf(success)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QPurchaseOptions configurePurchaseOptions(String offerId, Boolean applyOffer, QProduct oldProduct, String updatePolicyKey, List<String> contextKeys) {
        QPurchaseUpdatePolicy qPurchaseUpdatePolicyValueOf;
        QPurchaseOptions.Builder builder = new QPurchaseOptions.Builder();
        if (oldProduct != null) {
            builder.setOldProduct(oldProduct);
        }
        if (updatePolicyKey != null) {
            try {
                qPurchaseUpdatePolicyValueOf = QPurchaseUpdatePolicy.valueOf(updatePolicyKey);
            } catch (IllegalArgumentException unused) {
                qPurchaseUpdatePolicyValueOf = null;
            }
            if (qPurchaseUpdatePolicyValueOf != null) {
                builder.setUpdatePolicy(qPurchaseUpdatePolicyValueOf);
            }
        }
        if (offerId != null) {
            builder.setOfferId(offerId);
        }
        if (Intrinsics.areEqual((Object) applyOffer, (Object) false)) {
            builder.removeOffer();
        }
        if (contextKeys != null) {
            builder.setContextKeys(contextKeys);
        }
        return builder.build();
    }

    private final void loadProduct(final String productId, final String offeringId, final ProductCallback callback) {
        if (offeringId == null) {
            callback.onLoadingFailed();
        } else {
            Qonversion.INSTANCE.getSharedInstance().offerings(new QonversionOfferingsCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.loadProduct.1
                @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
                public void onSuccess(QOfferings offerings) {
                    Intrinsics.checkNotNullParameter(offerings, "offerings");
                    QOffering qOfferingOfferingForID = offerings.offeringForID(offeringId);
                    if (qOfferingOfferingForID == null) {
                        callback.onLoadingFailed();
                        return;
                    }
                    QProduct qProductProductForID = qOfferingOfferingForID.productForID(productId);
                    if (qProductProductForID == null) {
                        callback.onLoadingFailed();
                    } else {
                        callback.onProductLoaded(qProductProductForID);
                    }
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    callback.onLoadingFailed();
                }
            });
        }
    }

    private final QonversionConfig.Builder setEnvironment(QonversionConfig.Builder builder, String str) {
        if (str != null) {
            try {
                builder.setEnvironment(QEnvironment.valueOf(str));
            } catch (IllegalArgumentException unused) {
                Log.w("Qonversion", "No environment found for key " + str);
            }
        }
        return builder;
    }

    private final QonversionConfig.Builder setEntitlementsCacheLifetime(QonversionConfig.Builder builder, String str) {
        if (str != null) {
            try {
                builder.setEntitlementsCacheLifetime(QEntitlementsCacheLifetime.valueOf(str));
            } catch (IllegalArgumentException unused) {
                Log.w("Qonversion", "No entitlements cache lifetime found for key " + str);
            }
        }
        return builder;
    }

    private final QonversionConfig.Builder setEntitlementsUpdateListener(QonversionConfig.Builder builder) {
        builder.setEntitlementsUpdateListener(new QEntitlementsUpdateListener() { // from class: io.qonversion.sandwich.QonversionSandwich$setEntitlementsUpdateListener$1$1
            @Override // com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener
            public void onEntitlementsUpdated(Map<String, QEntitlement> entitlements) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                this.this$0.qonversionEventsListener.onEntitlementsUpdated(MappersKt.toEntitlementsMap(entitlements));
            }
        });
        return builder;
    }

    /* compiled from: QonversionSandwich.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¨\u0006\u000b"}, d2 = {"io/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "onSuccess", "entitlements", "", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: io.qonversion.sandwich.QonversionSandwich$getEntitlementsCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C02041 implements QonversionEntitlementsCallback {
        final /* synthetic */ ResultListener $resultListener;

        C02041(ResultListener resultListener) {
            this.$resultListener = resultListener;
        }

        @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
        public void onSuccess(Map<String, QEntitlement> entitlements) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            this.$resultListener.onSuccess(MappersKt.toEntitlementsMap(entitlements));
        }

        @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
        public void onError(QonversionError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.$resultListener.onError(MappersKt.toSandwichError(error));
        }
    }

    private final C02041 getEntitlementsCallback(ResultListener resultListener) {
        return new C02041(resultListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.qonversion.sandwich.QonversionSandwich$getUserCallback$1] */
    private final C02051 getUserCallback(final ResultListener resultListener) {
        return new QonversionUserCallback() { // from class: io.qonversion.sandwich.QonversionSandwich.getUserCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onSuccess(QUser user) {
                Intrinsics.checkNotNullParameter(user, "user");
                resultListener.onSuccess(MappersKt.toMap(user));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        };
    }
}
