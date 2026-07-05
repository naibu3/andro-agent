package com.stripe.android.financialconnections.domain;

import android.app.Application;
import androidx.autofill.HintConstants;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.features.error.ErrorExtKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LookupAccount.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0086B¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/domain/LookupAccount;", "", "application", "Landroid/app/Application;", "requestIntegrityToken", "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "invoke", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "", "phone", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "emailSource", "Lcom/stripe/android/model/EmailSource;", "verifiedFlow", "", "sessionId", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LookupAccount {
    public static final int $stable = 8;
    private final Application application;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsConsumerSessionRepository consumerSessionRepository;
    private final RequestIntegrityToken requestIntegrityToken;

    /* compiled from: LookupAccount.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.LookupAccount", f = "LookupAccount.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {32, 34, 44}, m = "invoke", n = {"email", "phone", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "emailSource", "sessionId", "$this$invoke_u24lambda_u240", "email", "phone", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "email", "phone", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.domain.LookupAccount$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LookupAccount.this.invoke(null, null, null, null, false, null, null, this);
        }
    }

    @Inject
    public LookupAccount(Application application, RequestIntegrityToken requestIntegrityToken, FinancialConnectionsConsumerSessionRepository consumerSessionRepository, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(requestIntegrityToken, "requestIntegrityToken");
        Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.application = application;
        this.requestIntegrityToken = requestIntegrityToken;
        this.consumerSessionRepository = consumerSessionRepository;
        this.configuration = configuration;
    }

    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013e, code lost:
    
        if (r0 == r6) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:48:0x0148, B:39:0x010a, B:40:0x010d, B:41:0x0116, B:24:0x0088, B:35:0x00c2), top: B:61:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:48:0x0148, B:39:0x010a, B:40:0x010d, B:41:0x0116, B:24:0x0088, B:35:0x00c2), top: B:61:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, String str2, String str3, EmailSource emailSource, boolean z, String str4, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super ConsumerSessionLookup> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String str5;
        String str6;
        String str7;
        EmailSource emailSource2;
        LookupAccount lookupAccount;
        String str8;
        ConsumerSessionLookup consumerSessionLookup;
        Object objM9118constructorimpl;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objPostConsumerSession = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                try {
                    if (i == 2) {
                        String str12 = (String) anonymousClass1.L$2;
                        String str13 = (String) anonymousClass1.L$1;
                        String str14 = (String) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(objPostConsumerSession);
                        str7 = str12;
                        str8 = str13;
                        str6 = str14;
                        if (objPostConsumerSession == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        consumerSessionLookup = (ConsumerSessionLookup) objPostConsumerSession;
                        objM9118constructorimpl = Result.m9118constructorimpl(consumerSessionLookup);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str15 = (String) anonymousClass1.L$2;
                        str10 = (String) anonymousClass1.L$1;
                        String str16 = (String) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(objPostConsumerSession);
                        str11 = str15;
                        str9 = str16;
                        if (objPostConsumerSession != null) {
                            consumerSessionLookup = (ConsumerSessionLookup) objPostConsumerSession;
                            str6 = str9;
                            str8 = str10;
                            str7 = str11;
                            objM9118constructorimpl = Result.m9118constructorimpl(consumerSessionLookup);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    str11 = str9;
                    str9 = str11;
                }
            } else {
                lookupAccount = (LookupAccount) anonymousClass1.L$5;
                String str17 = (String) anonymousClass1.L$4;
                emailSource2 = (EmailSource) anonymousClass1.L$3;
                str7 = (String) anonymousClass1.L$2;
                str8 = (String) anonymousClass1.L$1;
                str6 = (String) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(objPostConsumerSession);
                    str5 = str17;
                    FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = lookupAccount.consumerSessionRepository;
                    String lowerCase = str6.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String string = StringsKt.trim((CharSequence) lowerCase).toString();
                    String packageName = lookupAccount.application.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    anonymousClass1.L$0 = str6;
                    anonymousClass1.L$1 = str8;
                    anonymousClass1.L$2 = str7;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 2;
                    objPostConsumerSession = financialConnectionsConsumerSessionRepository.mobileLookupConsumerSession(string, emailSource2, (String) objPostConsumerSession, str5, packageName, anonymousClass1);
                    if (objPostConsumerSession == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (objPostConsumerSession == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str11 = str7;
                    str10 = str8;
                    str9 = str6;
                }
            }
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            str6 = str9;
            str8 = str10;
            str7 = str11;
        } else {
            ResultKt.throwOnFailure(objPostConsumerSession);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                LookupAccount lookupAccount2 = this;
                if (z) {
                    RequestIntegrityToken requestIntegrityToken = this.requestIntegrityToken;
                    FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.LOOKUP;
                    anonymousClass1.L$0 = str9;
                    anonymousClass1.L$1 = str10;
                    anonymousClass1.L$2 = str11;
                    anonymousClass1.L$3 = emailSource;
                    str5 = str4;
                    anonymousClass1.L$4 = str5;
                    anonymousClass1.L$5 = this;
                    anonymousClass1.label = 1;
                    objPostConsumerSession = requestIntegrityToken.invoke(attestationEndpoint, pane, anonymousClass1);
                    if (objPostConsumerSession != coroutine_suspended) {
                        str6 = str9;
                        str7 = str11;
                        emailSource2 = emailSource;
                        lookupAccount = this;
                        str8 = str10;
                        FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository2 = lookupAccount.consumerSessionRepository;
                        String lowerCase2 = str6.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        String string2 = StringsKt.trim((CharSequence) lowerCase2).toString();
                        String packageName2 = lookupAccount.application.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                        anonymousClass1.L$0 = str6;
                        anonymousClass1.L$1 = str8;
                        anonymousClass1.L$2 = str7;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 2;
                        objPostConsumerSession = financialConnectionsConsumerSessionRepository2.mobileLookupConsumerSession(string2, emailSource2, (String) objPostConsumerSession, str5, packageName2, anonymousClass1);
                        if (objPostConsumerSession == coroutine_suspended) {
                        }
                        if (objPostConsumerSession == null) {
                        }
                    }
                } else {
                    FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository3 = this.consumerSessionRepository;
                    String lowerCase3 = str9.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    String string3 = StringsKt.trim((CharSequence) lowerCase3).toString();
                    String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                    anonymousClass1.L$0 = str9;
                    anonymousClass1.L$1 = str10;
                    anonymousClass1.L$2 = str11;
                    anonymousClass1.label = 3;
                    objPostConsumerSession = financialConnectionsConsumerSessionRepository3.postConsumerSession(string3, financialConnectionsSessionClientSecret, anonymousClass1);
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return objM9118constructorimpl;
        }
        throw ErrorExtKt.toAttestationErrorIfApplicable(thM9121exceptionOrNullimpl, new ElementsSessionContext.PrefillDetails(str6, str8, str7));
    }
}
