package com.stripe.android.stripe3ds2.transaction;

import com.facebook.internal.security.OidcSecurityUtil;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JwsValidator.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", NamedConstantsKt.IS_LIVE_MODE, "", "rootCerts", "", "Ljava/security/cert/X509Certificate;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "getPayload", "Lorg/json/JSONObject;", "jws", "", "certificateFromString", "base64", "isValid", "jwsObject", "Lcom/nimbusds/jose/JWSObject;", "getVerifier", "Lcom/nimbusds/jose/JWSVerifier;", "jwsHeader", "Lcom/nimbusds/jose/JWSHeader;", "getPublicKeyFromHeader", "Ljava/security/PublicKey;", "isCertificateChainValid", "encodedChainCerts", "Lcom/nimbusds/jose/util/Base64;", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultJwsValidator implements JwsValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ErrorReporter errorReporter;
    private final boolean isLiveMode;
    private final List<X509Certificate> rootCerts;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultJwsValidator(boolean z, List<? extends X509Certificate> rootCerts, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.isLiveMode = z;
        this.rootCerts = rootCerts;
        this.errorReporter = errorReporter;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.JwsValidator
    public JSONObject getPayload(String jws) throws JSONException, JOSEException, CertificateException, ParseException {
        Intrinsics.checkNotNullParameter(jws, "jws");
        JWSObject jWSObject = JWSObject.parse(jws);
        if (!this.isLiveMode) {
            List x509CertChain = jWSObject.getHeader().getX509CertChain();
            if (x509CertChain != null && !x509CertChain.isEmpty()) {
                List x509CertChain2 = jWSObject.getHeader().getX509CertChain();
                Intrinsics.checkNotNullExpressionValue(x509CertChain2, "getX509CertChain(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = x509CertChain2.iterator();
                while (it.hasNext()) {
                    String string = ((Base64) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    X509Certificate x509CertificateCertificateFromString = certificateFromString(string);
                    if (x509CertificateCertificateFromString != null) {
                        arrayList.add(x509CertificateCertificateFromString);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    Intrinsics.checkNotNull(jWSObject);
                    if (isValid(jWSObject, arrayList2)) {
                        return new JSONObject(jWSObject.getPayload().toString());
                    }
                }
                throw new IllegalStateException("Could not validate JWS");
            }
            return new JSONObject(jWSObject.getPayload().toString());
        }
        Intrinsics.checkNotNull(jWSObject);
        if (isValid(jWSObject, this.rootCerts)) {
            return new JSONObject(jWSObject.getPayload().toString());
        }
        throw new IllegalStateException("Could not validate JWS");
    }

    private final X509Certificate certificateFromString(String base64) throws CertificateException {
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(kotlin.io.encoding.Base64.decode$default(kotlin.io.encoding.Base64.INSTANCE, base64, 0, 0, 6, (Object) null)));
        if (certificateGenerateCertificate instanceof X509Certificate) {
            return (X509Certificate) certificateGenerateCertificate;
        }
        return null;
    }

    private final boolean isValid(JWSObject jwsObject, List<? extends X509Certificate> rootCerts) throws JOSEException, CertificateException {
        if (jwsObject.getHeader().getJWK() != null) {
            this.errorReporter.reportError(new IllegalArgumentException("Encountered a JWK in " + jwsObject.getHeader()));
        }
        Companion companion = INSTANCE;
        JWSHeader header = jwsObject.getHeader();
        Intrinsics.checkNotNullExpressionValue(header, "getHeader(...)");
        JWSHeader jWSHeaderSanitizedJwsHeader$3ds2sdk_release = companion.sanitizedJwsHeader$3ds2sdk_release(header);
        if (isCertificateChainValid(jWSHeaderSanitizedJwsHeader$3ds2sdk_release.getX509CertChain(), rootCerts)) {
            return jwsObject.verify(getVerifier(jWSHeaderSanitizedJwsHeader$3ds2sdk_release));
        }
        return false;
    }

    private final JWSVerifier getVerifier(JWSHeader jwsHeader) throws JOSEException, CertificateException {
        String str;
        DefaultJWSVerifierFactory defaultJWSVerifierFactory = new DefaultJWSVerifierFactory();
        if (Intrinsics.areEqual(jwsHeader.getAlgorithm(), JWSAlgorithm.ES256)) {
            str = "SHA256withECDSA";
        } else {
            str = OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
        }
        defaultJWSVerifierFactory.getJCAContext().setProvider(Signature.getInstance(str).getProvider());
        JWSVerifier jWSVerifierCreateJWSVerifier = defaultJWSVerifierFactory.createJWSVerifier(jwsHeader, getPublicKeyFromHeader(jwsHeader));
        Intrinsics.checkNotNullExpressionValue(jWSVerifierCreateJWSVerifier, "createJWSVerifier(...)");
        return jWSVerifierCreateJWSVerifier;
    }

    private final PublicKey getPublicKeyFromHeader(JWSHeader jwsHeader) throws CertificateException {
        List x509CertChain = jwsHeader.getX509CertChain();
        Intrinsics.checkNotNullExpressionValue(x509CertChain, "getX509CertChain(...)");
        PublicKey publicKey = X509CertUtils.parseWithException(((Base64) CollectionsKt.first(x509CertChain)).decode()).getPublicKey();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    public final boolean isCertificateChainValid(List<? extends Base64> encodedChainCerts, List<? extends X509Certificate> rootCerts) {
        Object objM9118constructorimpl;
        List<? extends Base64> list;
        Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultJwsValidator defaultJwsValidator = this;
            list = encodedChainCerts;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty".toString());
        }
        if (rootCerts.isEmpty()) {
            throw new IllegalArgumentException("Root certificates are empty".toString());
        }
        INSTANCE.validateChain(encodedChainCerts, rootCerts);
        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.errorReporter.reportError(thM9121exceptionOrNullimpl);
        }
        return Result.m9125isSuccessimpl(objM9118constructorimpl);
    }

    /* compiled from: JwsValidator.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;", "", "<init>", "()V", "validateChain", "", "encodedChainCerts", "", "Lcom/nimbusds/jose/util/Base64;", "rootCerts", "Ljava/security/cert/X509Certificate;", "createKeyStore", "Ljava/security/KeyStore;", "sanitizedJwsHeader", "Lcom/nimbusds/jose/JWSHeader;", "jwsHeader", "sanitizedJwsHeader$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateChain(List<? extends Base64> encodedChainCerts, List<? extends X509Certificate> rootCerts) throws GeneralSecurityException, IOException, ParseException {
            List<X509Certificate> list = X509CertChainUtils.parse((List<Base64>) encodedChainCerts);
            KeyStore keyStoreCreateKeyStore = createKeyStore(rootCerts);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(list.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStoreCreateKeyStore, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(list)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore createKeyStore(List<? extends X509Certificate> rootCerts) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i = 0;
            for (Object obj : rootCerts) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                keyStore.setCertificateEntry(str, rootCerts.get(i));
                i = i2;
            }
            Intrinsics.checkNotNull(keyStore);
            return keyStore;
        }

        public final JWSHeader sanitizedJwsHeader$3ds2sdk_release(JWSHeader jwsHeader) {
            Intrinsics.checkNotNullParameter(jwsHeader, "jwsHeader");
            JWSHeader jWSHeaderBuild = new JWSHeader.Builder(jwsHeader).jwk(null).build();
            Intrinsics.checkNotNullExpressionValue(jWSHeaderBuild, "build(...)");
            return jWSHeaderBuild;
        }
    }
}
