package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.NetworkTypeDetector;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.model.Token;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentAnalyticsRequestFactory.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002CDBS\b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\r\u0010\u000eB)\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\r\u0010\u0012B\u001f\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\r\u0010\u0013B1\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\r\u0010\u0015J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0016J\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\"J#\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J'\u0010(\u001a\u00020\u00192\n\u0010)\u001a\u00060\u0007j\u0002`*2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b+J+\u0010,\u001a\u00020\u00192\u000e\u0010)\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`*2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b-J%\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00072\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b0J%\u00101\u001a\u00020\u00192\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0002\b2J\u001b\u00103\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b4J\u001b\u00105\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b6J\u001b\u00107\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0000¢\u0006\u0002\b8J#\u00109\u001a\u00020\u00192\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b<J!\u0010=\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b>JU\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020 2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\bAJR\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0002J,\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001d2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006E"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "packageManager", "Landroid/content/pm/PackageManager;", "packageInfo", "Landroid/content/pm/PackageInfo;", "packageName", "", "publishableKeyProvider", "Ljavax/inject/Provider;", "networkTypeProvider", "defaultProductUsageTokens", "", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/Set;)V", "context", "Landroid/content/Context;", "publishableKey", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "(Landroid/content/Context;Ljavax/inject/Provider;)V", "Lkotlin/Function0;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "getDefaultProductUsageTokens$payments_core_release", "()Ljava/util/Set;", "createRequest", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "additionalParams", "", "", "create3ds2Challenge", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "uiTypeCode", "create3ds2Challenge$payments_core_release", "createTokenCreation", "productUsageTokens", "tokenType", "Lcom/stripe/android/model/Token$Type;", "createTokenCreation$payments_core_release", "createPaymentMethodCreation", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "createPaymentMethodCreation$payments_core_release", "createPaymentMethodUpdate", "createPaymentMethodUpdate$payments_core_release", "createSourceCreation", "sourceType", "createSourceCreation$payments_core_release", "createAddSource", "createAddSource$payments_core_release", "createDeleteSource", "createDeleteSource$payments_core_release", "createAttachPaymentMethod", "createAttachPaymentMethod$payments_core_release", "createDetachPaymentMethod", "createDetachPaymentMethod$payments_core_release", "createPaymentIntentConfirmation", "paymentMethodType", "errorMessage", "createPaymentIntentConfirmation$payments_core_release", "createSetupIntentConfirmation", "createSetupIntentConfirmation$payments_core_release", "threeDS2UiType", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "createRequest$payments_core_release", "createTokenTypeParam", "ThreeDS2UiType", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentAnalyticsRequestFactory extends AnalyticsRequestFactory {
    public static final String FIELD_3DS2_UI_TYPE = "3ds2_ui_type";
    public static final String FIELD_ERROR_MESSAGE = "error_message";
    public static final String FIELD_PRODUCT_USAGE = "product_usage";
    public static final String FIELD_SOURCE_TYPE = "source_type";
    public static final String FIELD_TOKEN_TYPE = "token_type";
    private final Set<String> defaultProductUsageTokens;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String str) {
        return str;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, provider2, (i & 32) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getDefaultProductUsageTokens$payments_core_release() {
        return this.defaultProductUsageTokens;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Provider<String> networkTypeProvider, Set<String> defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider, networkTypeProvider, null, 32, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(networkTypeProvider, "networkTypeProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (Set<String>) ((i & 4) != 0 ? SetsKt.emptySet() : set));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, final String publishableKey, Set<String> defaultProductUsageTokens) {
        this(context, (Function0<String>) new Function0() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentAnalyticsRequestFactory._init_$lambda$0(publishableKey);
            }
        }, defaultProductUsageTokens);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    public PaymentAnalyticsRequestFactory(Context context, Provider<String> publishableKeyProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        String str = packageName == null ? "" : packageName;
        final NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector(context);
        this(packageManager, packageInfo, str, publishableKeyProvider, new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return networkTypeDetector.invoke();
            }
        }, null, 32, null);
    }

    @Inject
    public PaymentAnalyticsRequestFactory(Context context, @Named("publishableKey") final Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> defaultProductUsageTokens) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultProductUsageTokens, "defaultProductUsageTokens");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfo = contextUtils.getPackageInfo(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        packageName = packageName == null ? "" : packageName;
        Provider provider = new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda0
            @Override // javax.inject.Provider
            public final Object get() {
                return PaymentAnalyticsRequestFactory._init_$lambda$1(publishableKeyProvider);
            }
        };
        final NetworkTypeDetector networkTypeDetector = new NetworkTypeDetector(context);
        this(packageManager, packageInfo, packageName, provider, new Provider() { // from class: com.stripe.android.networking.PaymentAnalyticsRequestFactory$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return networkTypeDetector.invoke();
            }
        }, defaultProductUsageTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(Function0 function0) {
        return (String) function0.invoke();
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestFactory
    public AnalyticsRequest createRequest(AnalyticsEvent event, Map<String, ? extends Object> additionalParams) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Set<String> set = this.defaultProductUsageTokens;
        if (set.isEmpty()) {
            set = null;
        }
        Map mapMapOf = set != null ? MapsKt.mapOf(TuplesKt.to(FIELD_PRODUCT_USAGE, CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null))) : null;
        if (mapMapOf == null) {
            mapMapOf = MapsKt.emptyMap();
        }
        return super.createRequest(event, MapsKt.plus(mapMapOf, additionalParams));
    }

    public final /* synthetic */ AnalyticsRequest create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent event, String uiTypeCode) {
        Intrinsics.checkNotNullParameter(event, "event");
        return createRequest$payments_core_release$default(this, event, null, null, null, ThreeDS2UiType.INSTANCE.fromUiTypeCode(uiTypeCode), null, 46, null);
    }

    public final /* synthetic */ AnalyticsRequest createTokenCreation$payments_core_release(Set productUsageTokens, Token.Type tokenType) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.TokenCreate, productUsageTokens, null, tokenType, null, null, 52, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodCreation$payments_core_release(String paymentMethodCode, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodUpdate$payments_core_release(String paymentMethodCode, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentMethodUpdate, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public static /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createSourceCreation$payments_core_release(str, set);
    }

    public final /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release(String sourceType, Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SourceCreate, productUsageTokens, sourceType, null, null, null, 56, null);
    }

    public static /* synthetic */ AnalyticsRequest createAddSource$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createAddSource$payments_core_release(set, str);
    }

    public final /* synthetic */ AnalyticsRequest createAddSource$payments_core_release(Set productUsageTokens, String sourceType) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAddSource, productUsageTokens, sourceType, null, null, null, 56, null);
    }

    public final /* synthetic */ AnalyticsRequest createDeleteSource$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDeleteSource, productUsageTokens, null, null, null, null, 60, null);
    }

    public final /* synthetic */ AnalyticsRequest createAttachPaymentMethod$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAttachPaymentMethod, productUsageTokens, null, null, null, null, 60, null);
    }

    public final /* synthetic */ AnalyticsRequest createDetachPaymentMethod$payments_core_release(Set productUsageTokens) {
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens, null, null, null, null, 60, null);
    }

    public static /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str, str2);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release(String paymentMethodType, String errorMessage) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createSetupIntentConfirmation$payments_core_release(String paymentMethodType, String errorMessage) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SetupIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public static /* synthetic */ AnalyticsRequest createRequest$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return paymentAnalyticsRequestFactory.createRequest$payments_core_release(paymentAnalyticsEvent, set, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : threeDS2UiType, (i & 32) != 0 ? null : str2);
    }

    public final /* synthetic */ AnalyticsRequest createRequest$payments_core_release(PaymentAnalyticsEvent event, Set productUsageTokens, String sourceType, Token.Type tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        return createRequest(event, additionalParams(productUsageTokens, sourceType, tokenType, threeDS2UiType, errorMessage));
    }

    static /* synthetic */ Map additionalParams$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, String str2, int i, Object obj) {
        ThreeDS2UiType threeDS2UiType2;
        String str3;
        String str4;
        Token.Type type2;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        if ((i & 1) != 0) {
            set = SetsKt.emptySet();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            type = null;
        }
        if ((i & 8) != 0) {
            threeDS2UiType2 = null;
            str4 = str;
            str3 = str2;
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
            type2 = type;
        } else {
            threeDS2UiType2 = threeDS2UiType;
            str3 = str2;
            str4 = str;
            type2 = type;
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        return paymentAnalyticsRequestFactory2.additionalParams(set, str4, type2, threeDS2UiType2, str3);
    }

    private final Map<String, Object> additionalParams(Set<String> productUsageTokens, String sourceType, Token.Type tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        Set setPlus = SetsKt.plus((Set) this.defaultProductUsageTokens, (Iterable) productUsageTokens);
        if (setPlus.isEmpty()) {
            setPlus = null;
        }
        Map mapMapOf = setPlus != null ? MapsKt.mapOf(TuplesKt.to(FIELD_PRODUCT_USAGE, CollectionsKt.joinToString$default(setPlus, ",", null, null, 0, null, null, 62, null))) : null;
        if (mapMapOf == null) {
            mapMapOf = MapsKt.emptyMap();
        }
        Map mapMapOf2 = sourceType != null ? MapsKt.mapOf(TuplesKt.to(FIELD_SOURCE_TYPE, sourceType)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(MapsKt.plus(mapMapOf, mapMapOf2), createTokenTypeParam(sourceType, tokenType));
        Map mapMapOf3 = threeDS2UiType != null ? MapsKt.mapOf(TuplesKt.to(FIELD_3DS2_UI_TYPE, threeDS2UiType.toString())) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        Map mapMapOf4 = errorMessage != null ? MapsKt.mapOf(TuplesKt.to("error_message", errorMessage)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus2, mapMapOf4);
    }

    static /* synthetic */ Map createTokenTypeParam$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Token.Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            type = null;
        }
        return paymentAnalyticsRequestFactory.createTokenTypeParam(str, type);
    }

    private final Map<String, String> createTokenTypeParam(String sourceType, Token.Type tokenType) {
        String code;
        if (tokenType != null) {
            code = tokenType.getCode();
        } else {
            code = sourceType == null ? "unknown" : null;
        }
        Map<String, String> mapMapOf = code != null ? MapsKt.mapOf(TuplesKt.to(FIELD_TOKEN_TYPE, code)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentAnalyticsRequestFactory.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u0003H\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "code", "", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ThreeDS2UiType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ThreeDS2UiType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        private final String typeName;
        public static final ThreeDS2UiType None = new ThreeDS2UiType("None", 0, null, "none");
        public static final ThreeDS2UiType Text = new ThreeDS2UiType("Text", 1, "01", "text");
        public static final ThreeDS2UiType SingleSelect = new ThreeDS2UiType("SingleSelect", 2, "02", "single_select");
        public static final ThreeDS2UiType MultiSelect = new ThreeDS2UiType("MultiSelect", 3, "03", "multi_select");
        public static final ThreeDS2UiType Oob = new ThreeDS2UiType("Oob", 4, "04", "oob");
        public static final ThreeDS2UiType Html = new ThreeDS2UiType("Html", 5, "05", "html");

        private static final /* synthetic */ ThreeDS2UiType[] $values() {
            return new ThreeDS2UiType[]{None, Text, SingleSelect, MultiSelect, Oob, Html};
        }

        public static EnumEntries<ThreeDS2UiType> getEntries() {
            return $ENTRIES;
        }

        private ThreeDS2UiType(String str, int i, String str2, String str3) {
            this.code = str2;
            this.typeName = str3;
        }

        static {
            ThreeDS2UiType[] threeDS2UiTypeArr$values = $values();
            $VALUES = threeDS2UiTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(threeDS2UiTypeArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.typeName;
        }

        /* compiled from: PaymentAnalyticsRequestFactory.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$Companion;", "", "<init>", "()V", "fromUiTypeCode", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "uiTypeCode", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ThreeDS2UiType fromUiTypeCode(String uiTypeCode) {
                ThreeDS2UiType next;
                Iterator<ThreeDS2UiType> it = ThreeDS2UiType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, uiTypeCode)) {
                        break;
                    }
                }
                ThreeDS2UiType threeDS2UiType = next;
                return threeDS2UiType == null ? ThreeDS2UiType.None : threeDS2UiType;
            }
        }

        public static ThreeDS2UiType valueOf(String str) {
            return (ThreeDS2UiType) Enum.valueOf(ThreeDS2UiType.class, str);
        }

        public static ThreeDS2UiType[] values() {
            return (ThreeDS2UiType[]) $VALUES.clone();
        }
    }
}
