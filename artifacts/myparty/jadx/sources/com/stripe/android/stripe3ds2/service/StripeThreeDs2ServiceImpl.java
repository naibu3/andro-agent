package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import com.stripe.android.stripe3ds2.init.DefaultSecurityChecker;
import com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.PublicKeyFactory;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionFactory;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeThreeDs2ServiceImpl.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00019B?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u0017B+\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u001aB1\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u001bB1\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010\u001cBQ\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u000f\u0010#JZ\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\r2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u00103\u001a\u000204H\u0016JR\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\r2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u0010(\u001a\u00020)H\u0002J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002012\u0006\u00108\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006:"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "transactionFactory", "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;", "publicKeyFactory", "Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "warnings", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;Ljava/util/List;)V", "context", "Landroid/content/Context;", NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;)V", "sdkReferenceNumber", "", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "ephemeralKeyPairGenerator", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "securityChecker", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "appInfoRepository", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lkotlin/coroutines/CoroutineContext;)V", "getWarnings", "()Ljava/util/List;", "createTransaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "directoryServerID", ChallengeRequestData.FIELD_MESSAGE_VERSION, NamedConstantsKt.IS_LIVE_MODE, "directoryServerName", "rootCerts", "Ljava/security/cert/X509Certificate;", "dsPublicKey", "Ljava/security/PublicKey;", "keyId", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "cleanup", "", "getPublicKey", "directoryServerId", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeThreeDs2ServiceImpl implements StripeThreeDs2Service {
    private static final Companion Companion = new Companion(null);
    private static final String STRIPE_SDK_REFERENCE_NUMBER = "3DS_LOA_SDK_STIN_020200_00960";
    private final ErrorReporter errorReporter;
    private final ImageCache imageCache;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PublicKeyFactory publicKeyFactory;
    private final TransactionFactory transactionFactory;
    private final List<Warning> warnings;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, CoroutineContext workContext) {
        this(context, false, workContext, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    public StripeThreeDs2ServiceImpl(MessageVersionRegistry messageVersionRegistry, ImageCache imageCache, ErrorReporter errorReporter, TransactionFactory transactionFactory, PublicKeyFactory publicKeyFactory, List<Warning> warnings) {
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(transactionFactory, "transactionFactory");
        Intrinsics.checkNotNullParameter(publicKeyFactory, "publicKeyFactory");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        this.messageVersionRegistry = messageVersionRegistry;
        this.imageCache = imageCache;
        this.errorReporter = errorReporter;
        this.transactionFactory = transactionFactory;
        this.publicKeyFactory = publicKeyFactory;
        this.warnings = warnings;
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public List<Warning> getWarnings() {
        return this.warnings;
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z, coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext workContext) {
        this(context, STRIPE_SDK_REFERENCE_NUMBER, z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, String str, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? false : z, coroutineContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, String sdkReferenceNumber, boolean z, CoroutineContext workContext) {
        this(context, ImageCache.Default.INSTANCE, sdkReferenceNumber, z, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, boolean z, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(context, imageCache, str, new DefaultErrorReporter(applicationContext, null, null, Logger.INSTANCE.get(z), null, null, null, 0, 246, null), coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, CoroutineContext coroutineContext) {
        this(context, imageCache, str, errorReporter, new StripeEphemeralKeyPairGenerator(errorReporter), new DefaultSecurityChecker(null, 1, 0 == true ? 1 : 0), new MessageVersionRegistry(), new DefaultAppInfoRepository(context, coroutineContext), coroutineContext);
    }

    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, SecurityChecker securityChecker, MessageVersionRegistry messageVersionRegistry, AppInfoRepository appInfoRepository, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        DefaultTransactionFactory defaultTransactionFactory = new DefaultTransactionFactory(new DefaultAuthenticationRequestParametersFactory(new DeviceDataFactoryImpl(applicationContext, appInfoRepository, messageVersionRegistry), new DeviceParamNotAvailableFactoryImpl(), securityChecker, ephemeralKeyPairGenerator, appInfoRepository, messageVersionRegistry, str, errorReporter, coroutineContext), ephemeralKeyPairGenerator, str);
        DefaultTransactionFactory defaultTransactionFactory2 = defaultTransactionFactory;
        this(messageVersionRegistry, imageCache, errorReporter, defaultTransactionFactory2, new PublicKeyFactory(context, errorReporter), securityChecker.getWarnings());
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public Transaction createTransaction(SdkTransactionId sdkTransactionId, String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, StripeUiCustomization uiCustomization) throws SDKRuntimeException, InvalidInputException {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerID, "directoryServerID");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(dsPublicKey, "dsPublicKey");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        return createTransaction(directoryServerID, messageVersion, isLiveMode, directoryServerName, rootCerts, dsPublicKey, keyId, sdkTransactionId);
    }

    private final Transaction createTransaction(String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, SdkTransactionId sdkTransactionId) {
        if (!this.messageVersionRegistry.isSupported(messageVersion)) {
            if (messageVersion == null) {
                messageVersion = "";
            }
            throw new InvalidInputException("Message version is unsupported: " + messageVersion, null, 2, null);
        }
        return this.transactionFactory.create(directoryServerID, rootCerts, dsPublicKey, keyId, sdkTransactionId, isLiveMode, Brand.INSTANCE.lookup$3ds2sdk_release(directoryServerName, this.errorReporter));
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public void cleanup() {
        this.imageCache.clear();
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public PublicKey getPublicKey(String directoryServerId) {
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        return this.publicKeyFactory.create(directoryServerId);
    }

    /* compiled from: StripeThreeDs2ServiceImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2ServiceImpl$Companion;", "", "<init>", "()V", "STRIPE_SDK_REFERENCE_NUMBER", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
