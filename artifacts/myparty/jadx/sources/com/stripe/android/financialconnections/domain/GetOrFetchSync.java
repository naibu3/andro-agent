package com.stripe.android.financialconnections.domain;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetOrFetchSync.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0086B¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", NamedConstantsKt.APPLICATION_ID, "", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;)V", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "invoke", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "refetchCondition", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;", "supportsAppVerification", "", "(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RefetchCondition", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetOrFetchSync {
    public static final int $stable = 8;
    private final String applicationId;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsManifestRepository repository;

    @Inject
    public GetOrFetchSync(FinancialConnectionsManifestRepository repository, FinancialConnectionsSheetConfiguration configuration, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    public static /* synthetic */ Object invoke$default(GetOrFetchSync getOrFetchSync, RefetchCondition refetchCondition, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            refetchCondition = RefetchCondition.None.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return getOrFetchSync.invoke(refetchCondition, z, continuation);
    }

    public final Object invoke(RefetchCondition refetchCondition, boolean z, Continuation<? super SynchronizeSessionResponse> continuation) {
        return this.repository.getOrSynchronizeFinancialConnectionsSession(this.configuration.getFinancialConnectionsSessionClientSecret(), this.applicationId, z, new AnonymousClass2(refetchCondition), continuation);
    }

    /* compiled from: GetOrFetchSync.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.domain.GetOrFetchSync$invoke$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<SynchronizeSessionResponse, Boolean> {
        AnonymousClass2(Object obj) {
            super(1, obj, RefetchCondition.class, "shouldReFetch", "shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SynchronizeSessionResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(((RefetchCondition) this.receiver).shouldReFetch(p0));
        }
    }

    /* compiled from: GetOrFetchSync.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;", "", "shouldReFetch", "", "response", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "None", "Always", "IfMissingActiveAuthSession", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RefetchCondition {
        boolean shouldReFetch(SynchronizeSessionResponse response);

        /* compiled from: GetOrFetchSync.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$None;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;", "<init>", "()V", "shouldReFetch", "", "response", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class None implements RefetchCondition {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof None)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1660633189;
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public boolean shouldReFetch(SynchronizeSessionResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return false;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: GetOrFetchSync.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;", "<init>", "()V", "shouldReFetch", "", "response", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Always implements RefetchCondition {
            public static final int $stable = 0;
            public static final Always INSTANCE = new Always();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Always)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1484658098;
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public boolean shouldReFetch(SynchronizeSessionResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return true;
            }

            public String toString() {
                return "Always";
            }

            private Always() {
            }
        }

        /* compiled from: GetOrFetchSync.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$IfMissingActiveAuthSession;", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;", "<init>", "()V", "shouldReFetch", "", "response", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class IfMissingActiveAuthSession implements RefetchCondition {
            public static final int $stable = 0;
            public static final IfMissingActiveAuthSession INSTANCE = new IfMissingActiveAuthSession();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IfMissingActiveAuthSession)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1982328450;
            }

            public String toString() {
                return "IfMissingActiveAuthSession";
            }

            private IfMissingActiveAuthSession() {
            }

            @Override // com.stripe.android.financialconnections.domain.GetOrFetchSync.RefetchCondition
            public boolean shouldReFetch(SynchronizeSessionResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getManifest().getActiveAuthSession() == null;
            }
        }
    }
}
