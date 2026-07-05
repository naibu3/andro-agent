package com.stripe.android.link.account;

import androidx.autofill.HintConstants;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.link.LinkEventException;
import com.stripe.android.link.account.LinkAuthResult;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.model.EmailSource;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.attestation.AttestationError;
import com.stripe.attestation.IntegrityRequestManager;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLinkAuth.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J0\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\u001dJ@\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b!\u0010\u0016J:\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b#\u0010\u001dJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000bH\u0002J\u0019\u0010)\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0002¢\u0006\u0002\u0010*J\f\u0010)\u001a\u00020\u000f*\u00020'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010+\u001a\u00020\u001b*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020\u001b*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0018\u0010.\u001a\u00020\u001b*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0018\u0010/\u001a\u00020\u001b*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010,¨\u00060"}, d2 = {"Lcom/stripe/android/link/account/DefaultLinkAuth;", "Lcom/stripe/android/link/account/LinkAuth;", "linkGate", "Lcom/stripe/android/link/gate/LinkGate;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "integrityRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", NamedConstantsKt.APPLICATION_ID, "", "<init>", "(Lcom/stripe/android/link/gate/LinkGate;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljava/lang/String;)V", "signUp", "Lcom/stripe/android/link/account/LinkAuthResult;", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "name", "consentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookUp", "emailSource", "Lcom/stripe/android/model/EmailSource;", "startSession", "", "customerId", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", "Lkotlin/Result;", "Lcom/stripe/android/link/model/LinkAccount;", "mobileSignUp-hUnOzRk", "mobileLookUp", "mobileLookUp-yxL6bBk", "reportError", "", "error", "", "operation", "toLinkAuthResult", "(Ljava/lang/Object;)Lcom/stripe/android/link/account/LinkAuthResult;", "isAttestationError", "(Ljava/lang/Throwable;)Z", "isIntegrityManagerError", "isBackendAttestationError", "isAccountError", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkAuth implements LinkAuth {
    public static final int $stable = 8;
    private final String applicationId;
    private final ErrorReporter errorReporter;
    private final IntegrityRequestManager integrityRequestManager;
    private final LinkAccountManager linkAccountManager;
    private final LinkGate linkGate;

    /* compiled from: DefaultLinkAuth.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAuth", f = "DefaultLinkAuth.kt", i = {0, 1}, l = {57, 64}, m = "lookUp", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.link.account.DefaultLinkAuth$lookUp$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLinkAuth.this.lookUp(null, null, false, null, this);
        }
    }

    /* compiled from: DefaultLinkAuth.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAuth", f = "DefaultLinkAuth.kt", i = {0, 1}, l = {31, 39}, m = "signUp", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.link.account.DefaultLinkAuth$signUp$1, reason: invalid class name and case insensitive filesystem */
    static final class C10361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10361(Continuation<? super C10361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLinkAuth.this.signUp(null, null, null, null, null, this);
        }
    }

    @Inject
    public DefaultLinkAuth(LinkGate linkGate, LinkAccountManager linkAccountManager, IntegrityRequestManager integrityRequestManager, ErrorReporter errorReporter, @Named("application_id") String applicationId) {
        Intrinsics.checkNotNullParameter(linkGate, "linkGate");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(integrityRequestManager, "integrityRequestManager");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.linkGate = linkGate;
        this.linkAccountManager = linkAccountManager;
        this.integrityRequestManager = integrityRequestManager;
        this.errorReporter = errorReporter;
        this.applicationId = applicationId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r11 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object signUp(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super LinkAuthResult> continuation) {
        C10361 c10361;
        DefaultLinkAuth defaultLinkAuth;
        Object objMo7720signUphUnOzRk;
        Object value;
        DefaultLinkAuth defaultLinkAuth2;
        if (continuation instanceof C10361) {
            c10361 = (C10361) continuation;
            if ((c10361.label & Integer.MIN_VALUE) != 0) {
                c10361.label -= Integer.MIN_VALUE;
            } else {
                c10361 = new C10361(continuation);
            }
        }
        C10361 c103612 = c10361;
        Object obj = c103612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c103612.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.linkGate.getUseAttestationEndpoints()) {
                c103612.L$0 = this;
                c103612.label = 1;
                objMo7720signUphUnOzRk = m7726mobileSignUphUnOzRk(str, str2, str3, str4, signUpConsentAction, c103612);
                defaultLinkAuth = this;
            } else {
                defaultLinkAuth = this;
                LinkAccountManager linkAccountManager = defaultLinkAuth.linkAccountManager;
                c103612.L$0 = defaultLinkAuth;
                c103612.label = 2;
                objMo7720signUphUnOzRk = linkAccountManager.mo7720signUphUnOzRk(str, str2, str3, str4, signUpConsentAction, c103612);
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAuth2 = (DefaultLinkAuth) c103612.L$0;
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
        }
        return defaultLinkAuth2.toLinkAuthResult(value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r9 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.link.account.LinkAuth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lookUp(String str, EmailSource emailSource, boolean z, String str2, Continuation<? super LinkAuthResult> continuation) {
        AnonymousClass1 anonymousClass1;
        DefaultLinkAuth defaultLinkAuth;
        Object objMo7714lookupConsumerBWLJW6A;
        DefaultLinkAuth defaultLinkAuth2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.linkGate.getUseAttestationEndpoints()) {
                anonymousClass12.L$0 = this;
                anonymousClass12.label = 1;
                defaultLinkAuth = this;
                Object objM7725mobileLookUpyxL6bBk = defaultLinkAuth.m7725mobileLookUpyxL6bBk(str, emailSource, z, str2, anonymousClass12);
                if (objM7725mobileLookUpyxL6bBk != coroutine_suspended) {
                    objMo7714lookupConsumerBWLJW6A = objM7725mobileLookUpyxL6bBk;
                    defaultLinkAuth2 = defaultLinkAuth;
                }
                return coroutine_suspended;
            }
            defaultLinkAuth = this;
            LinkAccountManager linkAccountManager = defaultLinkAuth.linkAccountManager;
            anonymousClass12.L$0 = defaultLinkAuth;
            anonymousClass12.label = 2;
            objMo7714lookupConsumerBWLJW6A = linkAccountManager.mo7714lookupConsumerBWLJW6A(str, z, str2, anonymousClass12);
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultLinkAuth2 = (DefaultLinkAuth) anonymousClass12.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7714lookupConsumerBWLJW6A = ((Result) obj).getValue();
        }
        return defaultLinkAuth2.toLinkAuthResult(objMo7714lookupConsumerBWLJW6A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: mobileSignUp-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7726mobileSignUphUnOzRk(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAuth$mobileSignUp$1 defaultLinkAuth$mobileSignUp$1;
        DefaultLinkAuth defaultLinkAuth;
        String str5;
        Object objM8936requestTokengIAlus$default;
        DefaultLinkAuth defaultLinkAuth2;
        String str6;
        String str7;
        SignUpConsentAction signUpConsentAction2;
        String str8;
        DefaultLinkAuth defaultLinkAuth3;
        Object objMo7716mobileSignUpeH_QyT8;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof DefaultLinkAuth$mobileSignUp$1) {
            defaultLinkAuth$mobileSignUp$1 = (DefaultLinkAuth$mobileSignUp$1) continuation;
            if ((defaultLinkAuth$mobileSignUp$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAuth$mobileSignUp$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAuth$mobileSignUp$1 = new DefaultLinkAuth$mobileSignUp$1(this, continuation);
            }
        }
        DefaultLinkAuth$mobileSignUp$1 defaultLinkAuth$mobileSignUp$12 = defaultLinkAuth$mobileSignUp$1;
        Object obj = defaultLinkAuth$mobileSignUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultLinkAuth$mobileSignUp$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultLinkAuth defaultLinkAuth4 = this;
                IntegrityRequestManager integrityRequestManager = this.integrityRequestManager;
                defaultLinkAuth$mobileSignUp$12.L$0 = this;
                defaultLinkAuth$mobileSignUp$12.L$1 = str;
                defaultLinkAuth$mobileSignUp$12.L$2 = str2;
                defaultLinkAuth$mobileSignUp$12.L$3 = str3;
                str5 = str4;
                defaultLinkAuth$mobileSignUp$12.L$4 = str5;
                defaultLinkAuth$mobileSignUp$12.L$5 = signUpConsentAction;
                defaultLinkAuth$mobileSignUp$12.L$6 = this;
                defaultLinkAuth$mobileSignUp$12.label = 1;
                objM8936requestTokengIAlus$default = IntegrityRequestManager.DefaultImpls.m8936requestTokengIAlus$default(integrityRequestManager, null, defaultLinkAuth$mobileSignUp$12, 1, null);
                if (objM8936requestTokengIAlus$default != coroutine_suspended) {
                    defaultLinkAuth2 = this;
                    str6 = str2;
                    str7 = str3;
                    signUpConsentAction2 = signUpConsentAction;
                    str8 = str;
                    defaultLinkAuth3 = defaultLinkAuth2;
                    ResultKt.throwOnFailure(objM8936requestTokengIAlus$default);
                    LinkAccountManager linkAccountManager = defaultLinkAuth3.linkAccountManager;
                    String str9 = defaultLinkAuth3.applicationId;
                    defaultLinkAuth$mobileSignUp$12.L$0 = defaultLinkAuth2;
                    defaultLinkAuth$mobileSignUp$12.L$1 = null;
                    defaultLinkAuth$mobileSignUp$12.L$2 = null;
                    defaultLinkAuth$mobileSignUp$12.L$3 = null;
                    defaultLinkAuth$mobileSignUp$12.L$4 = null;
                    defaultLinkAuth$mobileSignUp$12.L$5 = null;
                    defaultLinkAuth$mobileSignUp$12.L$6 = null;
                    defaultLinkAuth$mobileSignUp$12.label = 2;
                    objMo7716mobileSignUpeH_QyT8 = linkAccountManager.mo7716mobileSignUpeH_QyT8(str8, str6, str7, str5, (String) objM8936requestTokengIAlus$default, str9, signUpConsentAction2, defaultLinkAuth$mobileSignUp$12);
                    if (objMo7716mobileSignUpeH_QyT8 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                defaultLinkAuth = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        if (i == 1) {
            defaultLinkAuth3 = (DefaultLinkAuth) defaultLinkAuth$mobileSignUp$12.L$6;
            SignUpConsentAction signUpConsentAction3 = (SignUpConsentAction) defaultLinkAuth$mobileSignUp$12.L$5;
            String str10 = (String) defaultLinkAuth$mobileSignUp$12.L$4;
            str7 = (String) defaultLinkAuth$mobileSignUp$12.L$3;
            String str11 = (String) defaultLinkAuth$mobileSignUp$12.L$2;
            str8 = (String) defaultLinkAuth$mobileSignUp$12.L$1;
            DefaultLinkAuth defaultLinkAuth5 = (DefaultLinkAuth) defaultLinkAuth$mobileSignUp$12.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM8936requestTokengIAlus$default = ((Result) obj).getValue();
                str5 = str10;
                str6 = str11;
                defaultLinkAuth2 = defaultLinkAuth5;
                signUpConsentAction2 = signUpConsentAction3;
                try {
                    ResultKt.throwOnFailure(objM8936requestTokengIAlus$default);
                    LinkAccountManager linkAccountManager2 = defaultLinkAuth3.linkAccountManager;
                    String str92 = defaultLinkAuth3.applicationId;
                    defaultLinkAuth$mobileSignUp$12.L$0 = defaultLinkAuth2;
                    defaultLinkAuth$mobileSignUp$12.L$1 = null;
                    defaultLinkAuth$mobileSignUp$12.L$2 = null;
                    defaultLinkAuth$mobileSignUp$12.L$3 = null;
                    defaultLinkAuth$mobileSignUp$12.L$4 = null;
                    defaultLinkAuth$mobileSignUp$12.L$5 = null;
                    defaultLinkAuth$mobileSignUp$12.L$6 = null;
                    defaultLinkAuth$mobileSignUp$12.label = 2;
                    objMo7716mobileSignUpeH_QyT8 = linkAccountManager2.mo7716mobileSignUpeH_QyT8(str8, str6, str7, str5, (String) objM8936requestTokengIAlus$default, str92, signUpConsentAction2, defaultLinkAuth$mobileSignUp$12);
                    if (objMo7716mobileSignUpeH_QyT8 != coroutine_suspended) {
                        defaultLinkAuth = defaultLinkAuth2;
                        ResultKt.throwOnFailure(objMo7716mobileSignUpeH_QyT8);
                        objM9118constructorimpl = Result.m9118constructorimpl((LinkAccount) objMo7716mobileSignUpeH_QyT8);
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    defaultLinkAuth = defaultLinkAuth2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return objM9118constructorimpl;
                }
            } catch (Throwable th3) {
                th = th3;
                defaultLinkAuth = defaultLinkAuth5;
                Result.Companion companion222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defaultLinkAuth = (DefaultLinkAuth) defaultLinkAuth$mobileSignUp$12.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            objMo7716mobileSignUpeH_QyT8 = ((Result) obj).getValue();
            ResultKt.throwOnFailure(objMo7716mobileSignUpeH_QyT8);
            objM9118constructorimpl = Result.m9118constructorimpl((LinkAccount) objMo7716mobileSignUpeH_QyT8);
        } catch (Throwable th4) {
            th = th4;
            Result.Companion companion2222 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return objM9118constructorimpl;
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLinkAuth.reportError(thM9121exceptionOrNullimpl, "signup");
        }
        return objM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: mobileLookUp-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7725mobileLookUpyxL6bBk(String str, EmailSource emailSource, boolean z, String str2, Continuation<? super Result<LinkAccount>> continuation) {
        DefaultLinkAuth$mobileLookUp$1 defaultLinkAuth$mobileLookUp$1;
        Throwable th;
        DefaultLinkAuth defaultLinkAuth;
        Object objM8936requestTokengIAlus$default;
        EmailSource emailSource2;
        boolean z2;
        int i;
        DefaultLinkAuth defaultLinkAuth2;
        String str3;
        DefaultLinkAuth defaultLinkAuth3;
        Object objMo7715mobileLookupConsumerbMdYcbs;
        Object value;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof DefaultLinkAuth$mobileLookUp$1) {
            defaultLinkAuth$mobileLookUp$1 = (DefaultLinkAuth$mobileLookUp$1) continuation;
            if ((defaultLinkAuth$mobileLookUp$1.label & Integer.MIN_VALUE) != 0) {
                defaultLinkAuth$mobileLookUp$1.label -= Integer.MIN_VALUE;
            } else {
                defaultLinkAuth$mobileLookUp$1 = new DefaultLinkAuth$mobileLookUp$1(this, continuation);
            }
        }
        DefaultLinkAuth$mobileLookUp$1 defaultLinkAuth$mobileLookUp$12 = defaultLinkAuth$mobileLookUp$1;
        Object obj = defaultLinkAuth$mobileLookUp$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultLinkAuth$mobileLookUp$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultLinkAuth defaultLinkAuth4 = this;
                IntegrityRequestManager integrityRequestManager = this.integrityRequestManager;
                defaultLinkAuth$mobileLookUp$12.L$0 = this;
                defaultLinkAuth$mobileLookUp$12.L$1 = str;
                defaultLinkAuth$mobileLookUp$12.L$2 = emailSource;
                defaultLinkAuth$mobileLookUp$12.L$3 = str2;
                defaultLinkAuth$mobileLookUp$12.L$4 = this;
                defaultLinkAuth$mobileLookUp$12.Z$0 = z;
                defaultLinkAuth$mobileLookUp$12.label = 1;
                objM8936requestTokengIAlus$default = IntegrityRequestManager.DefaultImpls.m8936requestTokengIAlus$default(integrityRequestManager, null, defaultLinkAuth$mobileLookUp$12, 1, null);
                if (objM8936requestTokengIAlus$default != coroutine_suspended) {
                    emailSource2 = emailSource;
                    z2 = z;
                    i = 2;
                    defaultLinkAuth2 = this;
                    str3 = str;
                    defaultLinkAuth3 = defaultLinkAuth2;
                    String str4 = str2;
                    ResultKt.throwOnFailure(objM8936requestTokengIAlus$default);
                    LinkAccountManager linkAccountManager = defaultLinkAuth3.linkAccountManager;
                    String str5 = defaultLinkAuth3.applicationId;
                    defaultLinkAuth$mobileLookUp$12.L$0 = defaultLinkAuth2;
                    defaultLinkAuth$mobileLookUp$12.L$1 = null;
                    defaultLinkAuth$mobileLookUp$12.L$2 = null;
                    defaultLinkAuth$mobileLookUp$12.L$3 = null;
                    defaultLinkAuth$mobileLookUp$12.L$4 = null;
                    defaultLinkAuth$mobileLookUp$12.label = i;
                    objMo7715mobileLookupConsumerbMdYcbs = linkAccountManager.mo7715mobileLookupConsumerbMdYcbs(str3, emailSource2, (String) objM8936requestTokengIAlus$default, str5, z2, str4, defaultLinkAuth$mobileLookUp$12);
                    if (objMo7715mobileLookupConsumerbMdYcbs != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                defaultLinkAuth = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        if (i2 == 1) {
            boolean z3 = defaultLinkAuth$mobileLookUp$12.Z$0;
            defaultLinkAuth3 = (DefaultLinkAuth) defaultLinkAuth$mobileLookUp$12.L$4;
            str2 = (String) defaultLinkAuth$mobileLookUp$12.L$3;
            EmailSource emailSource3 = (EmailSource) defaultLinkAuth$mobileLookUp$12.L$2;
            String str6 = (String) defaultLinkAuth$mobileLookUp$12.L$1;
            DefaultLinkAuth defaultLinkAuth5 = (DefaultLinkAuth) defaultLinkAuth$mobileLookUp$12.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM8936requestTokengIAlus$default = ((Result) obj).getValue();
                emailSource2 = emailSource3;
                defaultLinkAuth2 = defaultLinkAuth5;
                z2 = z3;
                i = 2;
                str3 = str6;
                String str42 = str2;
                try {
                    ResultKt.throwOnFailure(objM8936requestTokengIAlus$default);
                    LinkAccountManager linkAccountManager2 = defaultLinkAuth3.linkAccountManager;
                    String str52 = defaultLinkAuth3.applicationId;
                    defaultLinkAuth$mobileLookUp$12.L$0 = defaultLinkAuth2;
                    defaultLinkAuth$mobileLookUp$12.L$1 = null;
                    defaultLinkAuth$mobileLookUp$12.L$2 = null;
                    defaultLinkAuth$mobileLookUp$12.L$3 = null;
                    defaultLinkAuth$mobileLookUp$12.L$4 = null;
                    defaultLinkAuth$mobileLookUp$12.label = i;
                    objMo7715mobileLookupConsumerbMdYcbs = linkAccountManager2.mo7715mobileLookupConsumerbMdYcbs(str3, emailSource2, (String) objM8936requestTokengIAlus$default, str52, z2, str42, defaultLinkAuth$mobileLookUp$12);
                    if (objMo7715mobileLookupConsumerbMdYcbs != coroutine_suspended) {
                        DefaultLinkAuth defaultLinkAuth6 = defaultLinkAuth2;
                        value = objMo7715mobileLookupConsumerbMdYcbs;
                        defaultLinkAuth = defaultLinkAuth6;
                        ResultKt.throwOnFailure(value);
                        objM9118constructorimpl = Result.m9118constructorimpl((LinkAccount) value);
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    DefaultLinkAuth defaultLinkAuth7 = defaultLinkAuth2;
                    th = th3;
                    defaultLinkAuth = defaultLinkAuth7;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return objM9118constructorimpl;
                }
            } catch (Throwable th4) {
                th = th4;
                defaultLinkAuth = defaultLinkAuth5;
                Result.Companion companion222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return objM9118constructorimpl;
            }
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defaultLinkAuth = (DefaultLinkAuth) defaultLinkAuth$mobileLookUp$12.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
            ResultKt.throwOnFailure(value);
            objM9118constructorimpl = Result.m9118constructorimpl((LinkAccount) value);
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion2222 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return objM9118constructorimpl;
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            defaultLinkAuth.reportError(thM9121exceptionOrNullimpl, Constants.LOCALEMATCHER_LOOKUP);
        }
        return objM9118constructorimpl;
    }

    private final void reportError(Throwable error, String operation) {
        ErrorReporter.ExpectedErrorEvent expectedErrorEvent;
        if (isBackendAttestationError(error)) {
            expectedErrorEvent = ErrorReporter.ExpectedErrorEvent.LINK_NATIVE_FAILED_TO_ATTEST_REQUEST;
        } else if (!isIntegrityManagerError(error)) {
            return;
        } else {
            expectedErrorEvent = ErrorReporter.ExpectedErrorEvent.LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN;
        }
        this.errorReporter.report(expectedErrorEvent, new LinkEventException(error), MapsKt.mapOf(TuplesKt.to("operation", operation)));
    }

    private final LinkAuthResult toLinkAuthResult(Object obj) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ResultKt.throwOnFailure(obj);
            LinkAccount linkAccount = (LinkAccount) obj;
            if (linkAccount != null) {
                return new LinkAuthResult.Success(linkAccount);
            }
            return LinkAuthResult.NoLinkAccountFound.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                objM9118constructorimpl = toLinkAuthResult(thM9121exceptionOrNullimpl);
            }
            return (LinkAuthResult) objM9118constructorimpl;
        }
    }

    private final LinkAuthResult toLinkAuthResult(Throwable th) {
        if (isAttestationError(th)) {
            return new LinkAuthResult.AttestationFailed(th);
        }
        if (isAccountError(th)) {
            return new LinkAuthResult.AccountError(th);
        }
        return new LinkAuthResult.Error(th);
    }

    private final boolean isAttestationError(Throwable th) {
        return isIntegrityManagerError(th) || isBackendAttestationError(th);
    }

    private final boolean isIntegrityManagerError(Throwable th) {
        return th instanceof AttestationError;
    }

    private final boolean isBackendAttestationError(Throwable th) {
        if (!(th instanceof APIException)) {
            return false;
        }
        StripeError stripeError = ((APIException) th).getStripeError();
        return Intrinsics.areEqual(stripeError != null ? stripeError.getCode() : null, "link_failed_to_attest_request");
    }

    private final boolean isAccountError(Throwable th) {
        if (!(th instanceof APIException)) {
            return false;
        }
        StripeError stripeError = ((APIException) th).getStripeError();
        return Intrinsics.areEqual(stripeError != null ? stripeError.getCode() : null, "link_consumer_details_not_available");
    }
}
