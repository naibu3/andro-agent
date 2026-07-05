package com.stripe.android.financialconnections.repository;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.imageutils.TiffUtil;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.model.AuthorizationRepairResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitutionSelected;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;

/* compiled from: FinancialConnectionsManifestRepository.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 a2\u00020\u0001:\u0001aB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0&H\u0096@¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\u001e\u00102\u001a\u0002032\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0096@¢\u0006\u0002\u00104J4\u00105\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020!2\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0096@¢\u0006\u0002\u0010<J\u001e\u0010=\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0096@¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0096@¢\u0006\u0002\u0010>J&\u0010@\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u0010A\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0002\u0010BJ(\u0010C\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!2\b\u0010D\u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010BJ\u0016\u0010E\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010,JX\u0010F\u001a\u00020+2\u0006\u0010 \u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010!2\b\u0010H\u001a\u0004\u0018\u00010!2\b\u0010\b\u001a\u0004\u0018\u00010!2\b\u0010I\u001a\u0004\u0018\u00010!2\b\u0010J\u001a\u0004\u0018\u00010!2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010LH\u0096@¢\u0006\u0002\u0010MJ*\u0010N\u001a\u00020+2\u0006\u0010 \u001a\u00020!2\b\u0010O\u001a\u0004\u0018\u00010!2\b\u0010P\u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010BJ\u0016\u0010Q\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010,J\u0016\u0010R\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010,J\u001c\u0010S\u001a\u00020T2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0&H\u0016J\u0018\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u0010X\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010Y\u001a\u00020.H\u0002J\u0018\u0010Z\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010[\u001a\u00020\rH\u0002J\u0018\u0010\\\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010]\u001a\u00020+H\u0002J\u001a\u0010^\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\b\u0010_\u001a\u0004\u0018\u00010`H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "initialSync", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V", "getRequestExecutor", "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "getApiRequestFactory", "()Lcom/stripe/android/core/networking/ApiRequest$Factory;", "getProvideApiRequestOptions", "()Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "getLocale", "()Ljava/util/Locale;", "getLogger", "()Lcom/stripe/android/core/Logger;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "cachedSynchronizeSessionResponse", "getOrSynchronizeFinancialConnectionsSession", "clientSecret", "", NamedConstantsKt.APPLICATION_ID, "supportsAppVerification", "", "reFetchCondition", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synchronize", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markConsentAcquired", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionEvent", "clientTimestamp", "Ljava/util/Date;", "sessionId", "authSessionEvents", "", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAuthorizationSession", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveAuthorizationSession", "repairAuthorizationSession", "coreAuthorization", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeAuthorizationSession", "publicToken", "postMarkLinkingMoreAccounts", "postSaveAccountsToLink", "email", "country", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "consumerSessionClientSecret", "selectedAccounts", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableNetworking", "disabledReason", "clientSuggestedNextPaneOnDisableNetworking", "postMarkLinkVerified", "postMarkLinkStepUpVerified", "updateLocalManifest", "", "block", "updateActiveInstitution", "source", "updateCachedActiveAuthSession", "authSession", "updateCachedSynchronizeSessionResponse", "synchronizeSessionResponse", "updateCachedManifest", "manifest", "updateIDConsentContentPane", "pane", "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FinancialConnectionsManifestRepositoryImpl implements FinancialConnectionsManifestRepository {
    public static final String PARAMS_FULLSCREEN = "fullscreen";
    public static final String PARAMS_HIDE_CLOSE_BUTTON = "hide_close_button";
    public static final String PARAMS_SUPPORT_APP_VERIFICATION = "supports_app_verification";
    public static final String PARAMS_VERIFY_APP_ID = "verified_app_id";
    public static final String cancelAuthSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions/cancel";
    public static final String consentAcquiredUrl = "https://api.stripe.com/v1/link_account_sessions/consent_acquired";
    public static final String disableNetworking = "https://api.stripe.com/v1/link_account_sessions/disable_networking";
    public static final String eventsAuthSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions/events";
    public static final String generateRepairUrl = "https://api.stripe.com/v1/connections/repair_sessions/generate_url";
    private static final String institutionSelectedUrl = "https://api.stripe.com/v1/link_account_sessions/institution_selected";
    public static final String linkMoreAccountsUrl = "https://api.stripe.com/v1/link_account_sessions/link_more_accounts";
    public static final String linkStepUpVerifiedUrl = "https://api.stripe.com/v1/link_account_sessions/link_step_up_authentication_verified";
    public static final String linkVerifiedUrl = "https://api.stripe.com/v1/link_account_sessions/link_verified";
    public static final String retrieveAuthSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions/retrieve";
    public static final String saveAccountToLinkUrl = "https://api.stripe.com/v1/link_account_sessions/save_accounts_to_link";
    public static final String synchronizeSessionUrl = "https://api.stripe.com/v1/financial_connections/sessions/synchronize";
    private final ApiRequest.Factory apiRequestFactory;
    private SynchronizeSessionResponse cachedSynchronizeSessionResponse;
    private final Locale locale;
    private final Logger logger;
    private final Mutex mutex;
    private final ProvideApiRequestOptions provideApiRequestOptions;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {362}, m = "cancelAuthorizationSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1, reason: invalid class name */
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
            return FinancialConnectionsManifestRepositoryImpl.this.cancelAuthorizationSession(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {432}, m = "completeAuthorizationSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10021 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10021(Continuation<? super C10021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.completeAuthorizationSession(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {509}, m = "disableNetworking", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$disableNetworking$1, reason: invalid class name and case insensitive filesystem */
    static final class C10031 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10031(Continuation<? super C10031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.disableNetworking(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0, 0, 0, 0, 0, 1}, l = {661, 235}, m = "getOrSynchronizeFinancialConnectionsSession", n = {"this", "clientSecret", NamedConstantsKt.APPLICATION_ID, "reFetchCondition", "$this$withLock_u24default$iv", "supportsAppVerification", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C10041(Continuation<? super C10041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.getOrSynchronizeFinancialConnectionsSession(null, null, false, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0, 0, 1, 1}, l = {661, TiffUtil.TIFF_TAG_ORIENTATION}, m = "markConsentAcquired", n = {"this", "clientSecret", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1, reason: invalid class name and case insensitive filesystem */
    static final class C10051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C10051(Continuation<? super C10051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.markConsentAcquired(null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0}, l = {296}, m = "postAuthorizationSession", n = {"this", "institution"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10061(Continuation<? super C10061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.postAuthorizationSession(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {547}, m = "postMarkLinkStepUpVerified", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1, reason: invalid class name and case insensitive filesystem */
    static final class C10071 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10071(Continuation<? super C10071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.postMarkLinkStepUpVerified(null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {528}, m = "postMarkLinkVerified", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1, reason: invalid class name and case insensitive filesystem */
    static final class C10081 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10081(Continuation<? super C10081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.postMarkLinkVerified(null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {451}, m = "postMarkLinkingMoreAccounts", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1, reason: invalid class name and case insensitive filesystem */
    static final class C10091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10091(Continuation<? super C10091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.postMarkLinkingMoreAccounts(null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {486}, m = "postSaveAccountsToLink", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1, reason: invalid class name and case insensitive filesystem */
    static final class C10101 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10101(Continuation<? super C10101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.postSaveAccountsToLink(null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {393}, m = "repairAuthorizationSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10111(Continuation<? super C10111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.repairAuthorizationSession(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {373}, m = "retrieveAuthorizationSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C10121 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10121(Continuation<? super C10121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.retrieveAuthorizationSession(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0, 0}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "selectInstitution", n = {"this", "institution"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$selectInstitution$1, reason: invalid class name and case insensitive filesystem */
    static final class C10131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10131(Continuation<? super C10131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.selectInstitution(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl", f = "FinancialConnectionsManifestRepository.kt", i = {0}, l = {242}, m = "synchronize", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl$synchronize$1, reason: invalid class name and case insensitive filesystem */
    static final class C10141 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10141(Continuation<? super C10141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsManifestRepositoryImpl.this.synchronize(null, null, false, this);
        }
    }

    public FinancialConnectionsManifestRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger logger, SynchronizeSessionResponse synchronizeSessionResponse) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.requestExecutor = requestExecutor;
        this.apiRequestFactory = apiRequestFactory;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    public final FinancialConnectionsRequestExecutor getRequestExecutor() {
        return this.requestExecutor;
    }

    public final ApiRequest.Factory getApiRequestFactory() {
        return this.apiRequestFactory;
    }

    public final ProvideApiRequestOptions getProvideApiRequestOptions() {
        return this.provideApiRequestOptions;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Mutex getMutex() {
        return this.mutex;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOrSynchronizeFinancialConnectionsSession(String str, String str2, boolean z, Function1<? super SynchronizeSessionResponse, Boolean> function1, Continuation<? super SynchronizeSessionResponse> continuation) throws Throwable {
        C10041 c10041;
        Mutex mutex;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Mutex mutex2;
        SynchronizeSessionResponse synchronizeSessionResponse;
        if (continuation instanceof C10041) {
            c10041 = (C10041) continuation;
            if ((c10041.label & Integer.MIN_VALUE) != 0) {
                c10041.label -= Integer.MIN_VALUE;
            } else {
                c10041 = new C10041(continuation);
            }
        }
        Object obj = c10041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10041.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                c10041.L$0 = this;
                c10041.L$1 = str;
                c10041.L$2 = str2;
                c10041.L$3 = function1;
                c10041.L$4 = mutex;
                c10041.Z$0 = z;
                c10041.label = 1;
                if (mutex.lock(null, c10041) != coroutine_suspended) {
                    financialConnectionsManifestRepositoryImpl = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c10041.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    mutex = mutex2;
                    mutex.unlock(null);
                    return synchronizeSessionResponse;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            z = c10041.Z$0;
            Mutex mutex3 = (Mutex) c10041.L$4;
            function1 = (Function1) c10041.L$3;
            str2 = (String) c10041.L$2;
            String str3 = (String) c10041.L$1;
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10041.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            str = str3;
            synchronizeSessionResponse = financialConnectionsManifestRepositoryImpl.cachedSynchronizeSessionResponse;
            if (synchronizeSessionResponse == null || function1.invoke(synchronizeSessionResponse).booleanValue()) {
                synchronizeSessionResponse = null;
            }
            if (synchronizeSessionResponse == null) {
                c10041.L$0 = mutex;
                c10041.L$1 = null;
                c10041.L$2 = null;
                c10041.L$3 = null;
                c10041.L$4 = null;
                c10041.label = 2;
                Object objSynchronize = financialConnectionsManifestRepositoryImpl.synchronize(str2, str, z, c10041);
                if (objSynchronize != coroutine_suspended) {
                    Mutex mutex4 = mutex;
                    obj = objSynchronize;
                    mutex2 = mutex4;
                    synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            mutex.unlock(null);
            return synchronizeSessionResponse;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object synchronize(String str, String str2, boolean z, Continuation<? super SynchronizeSessionResponse> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10141 c10141;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10141) {
            c10141 = (C10141) continuation;
            if ((c10141.label & Integer.MIN_VALUE) != 0) {
                c10141.label -= Integer.MIN_VALUE;
            } else {
                c10141 = new C10141(continuation);
            }
        }
        Object obj2 = c10141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10141.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/financial_connections/sessions/synchronize", this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("manifest.active_auth_session")), TuplesKt.to("emit_events", Boxing.boxBoolean(true)), TuplesKt.to("locale", this.locale.toLanguageTag()), TuplesKt.to("mobile", MapsKt.mapOf(TuplesKt.to("fullscreen", Boxing.boxBoolean(true)), TuplesKt.to("hide_close_button", Boxing.boxBoolean(true)), TuplesKt.to(PARAMS_SUPPORT_APP_VERIFICATION, Boxing.boxBoolean(z)), TuplesKt.to(PARAMS_VERIFY_APP_ID, str), TuplesKt.to("application_id", str))), TuplesKt.to("client_secret", str2)), false, 8, null);
            KSerializer<SynchronizeSessionResponse> kSerializerSerializer = SynchronizeSessionResponse.INSTANCE.serializer();
            c10141.L$0 = this;
            c10141.label = 1;
            Object objExecute = financialConnectionsRequestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10141);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10141.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedSynchronizeSessionResponse("get/fetch", (SynchronizeSessionResponse) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markConsentAcquired(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws Throwable {
        C10051 c10051;
        String str2;
        Mutex mutex;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Mutex mutex2;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl2;
        Object obj;
        if (continuation instanceof C10051) {
            c10051 = (C10051) continuation;
            if ((c10051.label & Integer.MIN_VALUE) != 0) {
                c10051.label -= Integer.MIN_VALUE;
            } else {
                c10051 = new C10051(continuation);
            }
        }
        Object obj2 = c10051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10051.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                Mutex mutex3 = this.mutex;
                c10051.L$0 = this;
                str2 = str;
                c10051.L$1 = str2;
                c10051.L$2 = mutex3;
                c10051.label = 1;
                if (mutex3.lock(null, c10051) != coroutine_suspended) {
                    mutex = mutex3;
                    financialConnectionsManifestRepositoryImpl = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c10051.L$1;
                financialConnectionsManifestRepositoryImpl2 = (FinancialConnectionsManifestRepositoryImpl) c10051.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    financialConnectionsManifestRepositoryImpl2.updateCachedManifest("consent acquired", (FinancialConnectionsSessionManifest) obj);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) c10051.L$2;
            String str3 = (String) c10051.L$1;
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10051.L$0;
            ResultKt.throwOnFailure(obj2);
            mutex = mutex4;
            str2 = str3;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(financialConnectionsManifestRepositoryImpl.apiRequestFactory, consentAcquiredUrl, financialConnectionsManifestRepositoryImpl.provideApiRequestOptions.invoke(false), MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session")), TuplesKt.to("client_secret", str2)), false, 8, null);
            KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            c10051.L$0 = financialConnectionsManifestRepositoryImpl;
            c10051.L$1 = mutex;
            c10051.L$2 = null;
            c10051.label = 2;
            Object objExecute = financialConnectionsManifestRepositoryImpl.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10051);
            if (objExecute != coroutine_suspended) {
                mutex2 = mutex;
                financialConnectionsManifestRepositoryImpl2 = financialConnectionsManifestRepositoryImpl;
                obj = objExecute;
                financialConnectionsManifestRepositoryImpl2.updateCachedManifest("consent acquired", (FinancialConnectionsSessionManifest) obj);
                mutex2.unlock(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postAuthorizationSession(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10061 c10061;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10061) {
            c10061 = (C10061) continuation;
            if ((c10061.label & Integer.MIN_VALUE) != 0) {
                c10061.label -= Integer.MIN_VALUE;
            } else {
                c10061 = new C10061(continuation);
            }
        }
        Object obj2 = c10061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10061.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, FinancialConnectionsRepositoryImpl.authorizationSessionUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("use_mobile_handoff", Boxing.boxBoolean(false)), TuplesKt.to("use_abstract_flow", Boxing.boxBoolean(true)), TuplesKt.to("return_url", "auth-redirect/" + str2), TuplesKt.to("institution", financialConnectionsInstitution.getId())), false, 8, null);
            KSerializer<FinancialConnectionsAuthorizationSession> kSerializerSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            c10061.L$0 = this;
            c10061.L$1 = financialConnectionsInstitution;
            c10061.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10061);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsInstitution = (FinancialConnectionsInstitution) c10061.L$1;
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10061.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateActiveInstitution("postAuthorizationSession", financialConnectionsInstitution);
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("postAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object selectInstitution(String str, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsInstitutionSelected> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10131 c10131;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        if (continuation instanceof C10131) {
            c10131 = (C10131) continuation;
            if ((c10131.label & Integer.MIN_VALUE) != 0) {
                c10131.label -= Integer.MIN_VALUE;
            } else {
                c10131 = new C10131(continuation);
            }
        }
        Object objExecute = c10131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10131.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecute);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, institutionSelectedUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("currently_selected_institution", financialConnectionsInstitution.getId())), false, 8, null);
            KSerializer<FinancialConnectionsInstitutionSelected> kSerializerSerializer = FinancialConnectionsInstitutionSelected.INSTANCE.serializer();
            c10131.L$0 = this;
            c10131.L$1 = financialConnectionsInstitution;
            c10131.label = 1;
            objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10131);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsInstitution = (FinancialConnectionsInstitution) c10131.L$1;
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10131.L$0;
            ResultKt.throwOnFailure(objExecute);
        }
        FinancialConnectionsInstitutionSelected financialConnectionsInstitutionSelected = (FinancialConnectionsInstitutionSelected) objExecute;
        financialConnectionsManifestRepositoryImpl.updateActiveInstitution("selectInstitution", financialConnectionsInstitution);
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("selectInstitution", financialConnectionsInstitutionSelected.getManifest());
        TextUpdate text = financialConnectionsInstitutionSelected.getText();
        financialConnectionsManifestRepositoryImpl.updateIDConsentContentPane("selectInstitution", text != null ? text.getIdConsentContentPane() : null);
        return objExecute;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    public Object postAuthorizationSessionEvent(String str, Date date, String str2, List<? extends AuthSessionEvent> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) {
        ApiRequest.Factory factory = this.apiRequestFactory;
        ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(true);
        int i = 0;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("client_timestamp", String.valueOf(date.getTime())), TuplesKt.to("id", str2));
        List<? extends AuthSessionEvent> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to("frontend_events[" + i + "]", ((AuthSessionEvent) obj).toMap()));
            i = i2;
        }
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(factory, eventsAuthSessionUrl, optionsInvoke, MapsKt.plus(mapMapOf, arrayList), false, 8, null), FinancialConnectionsAuthorizationSession.INSTANCE.serializer(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cancelAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, cancelAuthSessionUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str)), false, 8, null);
            KSerializer<FinancialConnectionsAuthorizationSession> kSerializerSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, anonymousClass1);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("cancelAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10121 c10121;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10121) {
            c10121 = (C10121) continuation;
            if ((c10121.label & Integer.MIN_VALUE) != 0) {
                c10121.label -= Integer.MIN_VALUE;
            } else {
                c10121 = new C10121(continuation);
            }
        }
        Object obj2 = c10121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10121.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, retrieveAuthSessionUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str), TuplesKt.to("emit_events", Boxing.boxBoolean(true))), false, 8, null);
            KSerializer<FinancialConnectionsAuthorizationSession> kSerializerSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            c10121.L$0 = this;
            c10121.label = 1;
            Object objExecute = financialConnectionsRequestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10121);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10121.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("retrieveAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object repairAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10111 c10111;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        if (continuation instanceof C10111) {
            c10111 = (C10111) continuation;
            if ((c10111.label & Integer.MIN_VALUE) != 0) {
                c10111.label -= Integer.MIN_VALUE;
            } else {
                c10111 = new C10111(continuation);
            }
        }
        Object objExecute = c10111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10111.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objExecute);
            FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = this.requestExecutor;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, generateRepairUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("core_authorization", str2), TuplesKt.to("return_url", "auth-redirect/" + str3)), false, 8, null);
            KSerializer<AuthorizationRepairResponse> kSerializerSerializer = AuthorizationRepairResponse.INSTANCE.serializer();
            c10111.L$0 = this;
            c10111.label = 1;
            objExecute = financialConnectionsRequestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10111);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10111.L$0;
            ResultKt.throwOnFailure(objExecute);
        }
        AuthorizationRepairResponse authorizationRepairResponse = (AuthorizationRepairResponse) objExecute;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = new FinancialConnectionsAuthorizationSession(authorizationRepairResponse.getId(), FinancialConnectionsSessionManifest.Pane.SUCCESS, authorizationRepairResponse.getFlow(), null, null, null, authorizationRepairResponse.getUrl(), (String) null, Boxing.boxBoolean(authorizationRepairResponse.isOAuth()), authorizationRepairResponse.getDisplay(), 184, (DefaultConstructorMarker) null);
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("repairAuthorizationSession", financialConnectionsAuthorizationSession);
        return financialConnectionsAuthorizationSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object completeAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10021 c10021;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10021) {
            c10021 = (C10021) continuation;
            if ((c10021.label & Integer.MIN_VALUE) != 0) {
                c10021.label -= Integer.MIN_VALUE;
            } else {
                c10021 = new C10021(continuation);
            }
        }
        Object obj2 = c10021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10021.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest.Factory factory = this.apiRequestFactory;
            ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(true);
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str), TuplesKt.to("public_token", str3));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMapOf.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, FinancialConnectionsRepositoryImpl.authorizeSessionUrl, optionsInvoke, linkedHashMap, false, 8, null);
            KSerializer<FinancialConnectionsAuthorizationSession> kSerializerSerializer = FinancialConnectionsAuthorizationSession.INSTANCE.serializer();
            c10021.L$0 = this;
            c10021.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10021);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10021.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedActiveAuthSession("completeAuthorizationSession", (FinancialConnectionsAuthorizationSession) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postMarkLinkingMoreAccounts(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10091 c10091;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10091) {
            c10091 = (C10091) continuation;
            if ((c10091.label & Integer.MIN_VALUE) != 0) {
                c10091.label -= Integer.MIN_VALUE;
            } else {
                c10091 = new C10091(continuation);
            }
        }
        Object obj2 = c10091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10091.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, linkMoreAccountsUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session")), TuplesKt.to("client_secret", str)), false, 8, null);
            KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            c10091.L$0 = this;
            c10091.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10091);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10091.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postMarkLinkingMoreAccounts", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postSaveAccountsToLink(String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10101 c10101;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10101) {
            c10101 = (C10101) continuation;
            if ((c10101.label & Integer.MIN_VALUE) != 0) {
                c10101.label -= Integer.MIN_VALUE;
            } else {
                c10101 = new C10101(continuation);
            }
        }
        Object obj2 = c10101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10101.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            if (set != null) {
                Set<String> set2 = set;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                int i2 = 0;
                for (Object obj3 : set2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(TuplesKt.to("selected_accounts[" + i2 + "]", (String) obj3));
                    i2 = i3;
                }
                Map mapEmptyMap = MapsKt.toMap(arrayList);
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, saveAccountToLinkUrl, this.provideApiRequestOptions.invoke(false), MapsKt.plus(com.stripe.android.financialconnections.utils.CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str6), TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session")), TuplesKt.to("country", str3), TuplesKt.to("locale", str4), TuplesKt.to("email_address", str2), TuplesKt.to("phone_number", str5))), mapEmptyMap), false, 8, null);
                KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
                c10101.L$0 = this;
                c10101.label = 1;
                Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10101);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsManifestRepositoryImpl = this;
                obj = objExecute;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10101.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object disableNetworking(String str, String str2, String str3, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10031 c10031;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10031) {
            c10031 = (C10031) continuation;
            if ((c10031.label & Integer.MIN_VALUE) != 0) {
                c10031.label -= Integer.MIN_VALUE;
            } else {
                c10031 = new C10031(continuation);
            }
        }
        Object obj2 = c10031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10031.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, disableNetworking, this.provideApiRequestOptions.invoke(false), com.stripe.android.financialconnections.utils.CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session")), TuplesKt.to("client_requested_next_pane_on_disable_networking", str3), TuplesKt.to("disabled_reason", str2))), false, 8, null);
            KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            c10031.L$0 = this;
            c10031.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10031);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10031.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postSaveAccountsToLink", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postMarkLinkVerified(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10081 c10081;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10081) {
            c10081 = (C10081) continuation;
            if ((c10081.label & Integer.MIN_VALUE) != 0) {
                c10081.label -= Integer.MIN_VALUE;
            } else {
                c10081 = new C10081(continuation);
            }
        }
        Object obj2 = c10081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10081.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, linkVerifiedUrl, this.provideApiRequestOptions.invoke(false), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session"))), false, 8, null);
            KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            c10081.L$0 = this;
            c10081.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10081);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10081.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postMarkLinkVerified", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postMarkLinkStepUpVerified(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIException, AuthenticationException {
        C10071 c10071;
        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl;
        Object obj;
        if (continuation instanceof C10071) {
            c10071 = (C10071) continuation;
            if ((c10071.label & Integer.MIN_VALUE) != 0) {
                c10071.label -= Integer.MIN_VALUE;
            } else {
                c10071 = new C10071(continuation);
            }
        }
        Object obj2 = c10071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10071.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, linkStepUpVerifiedUrl, this.provideApiRequestOptions.invoke(false), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("expand", CollectionsKt.listOf("active_auth_session"))), false, 8, null);
            KSerializer<FinancialConnectionsSessionManifest> kSerializerSerializer = FinancialConnectionsSessionManifest.INSTANCE.serializer();
            c10071.L$0 = this;
            c10071.label = 1;
            Object objExecute = this.requestExecutor.execute(apiRequestCreatePost$default, kSerializerSerializer, c10071);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsManifestRepositoryImpl = this;
            obj = objExecute;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) c10071.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsManifestRepositoryImpl.updateCachedManifest("postMarkLinkStepUpVerified", (FinancialConnectionsSessionManifest) obj);
        return obj;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository
    public void updateLocalManifest(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestInvoke = block.invoke(manifest)) == null) {
            return;
        }
        updateCachedManifest("updateLocalManifest", financialConnectionsSessionManifestInvoke);
    }

    private final void updateActiveInstitution(String source, FinancialConnectionsInstitution institution) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestCopy$default;
        this.logger.debug("SYNC_CACHE: updating local active institution from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestCopy$default = FinancialConnectionsSessionManifest.copy$default(manifest, false, false, null, false, false, null, false, false, false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, null, institution, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null)) == null) {
            return;
        }
        updateCachedManifest("updating active institution", financialConnectionsSessionManifestCopy$default);
    }

    private final void updateCachedActiveAuthSession(String source, FinancialConnectionsAuthorizationSession authSession) {
        FinancialConnectionsSessionManifest manifest;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifestCopy$default;
        this.logger.debug("SYNC_CACHE: updating local active auth session from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        if (synchronizeSessionResponse == null || (manifest = synchronizeSessionResponse.getManifest()) == null || (financialConnectionsSessionManifestCopy$default = FinancialConnectionsSessionManifest.copy$default(manifest, false, false, null, false, false, null, false, false, false, false, false, false, null, null, null, null, false, false, null, null, null, null, null, authSession, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, 16383, null)) == null) {
            return;
        }
        updateCachedManifest("updating active auth session", financialConnectionsSessionManifestCopy$default);
    }

    private final void updateCachedSynchronizeSessionResponse(String source, SynchronizeSessionResponse synchronizeSessionResponse) {
        this.logger.debug("SYNC_CACHE: updating local sync object from " + source);
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse;
    }

    private final void updateCachedManifest(String source, FinancialConnectionsSessionManifest manifest) {
        this.logger.debug("SYNC_CACHE: updating local manifest from " + source);
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponse != null ? SynchronizeSessionResponse.copy$default(synchronizeSessionResponse, manifest, null, null, 6, null) : null;
    }

    private final void updateIDConsentContentPane(String source, IDConsentContentPane pane) {
        this.logger.debug("SYNC_CACHE: updating local sync object from " + source + " with ID consent content pane");
        SynchronizeSessionResponse synchronizeSessionResponse = this.cachedSynchronizeSessionResponse;
        SynchronizeSessionResponse synchronizeSessionResponseCopy$default = null;
        if (synchronizeSessionResponse != null) {
            TextUpdate text = synchronizeSessionResponse.getText();
            synchronizeSessionResponseCopy$default = SynchronizeSessionResponse.copy$default(synchronizeSessionResponse, null, text != null ? TextUpdate.copy$default(text, null, null, null, null, null, null, null, pane, 127, null) : null, null, 5, null);
        }
        this.cachedSynchronizeSessionResponse = synchronizeSessionResponseCopy$default;
    }
}
