package com.stripe.android.financialconnections.domain;

import androidx.autofill.HintConstants;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: SaveAccountToLink.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010 JR\u0010!\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182*\u0010#\u001a&\b\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130&\u0012\u0006\u0012\u0004\u0018\u00010\u00010$H\u0082@¢\u0006\u0002\u0010'J\u001c\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150%H\u0082@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020)H\u0082@¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010\u0017\u001a\u000200H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;", "", "locale", "Ljava/util/Locale;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "attachedPaymentAccountRepository", "Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;", "successContentRepository", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "accountsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "isNetworkingRelinkSession", "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;", "<init>", "(Ljava/util/Locale;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/AttachedPaymentAccountRepository;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;)V", "new", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "selectedAccounts", "", "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "country", "shouldPollAccountNumbers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existing", "consumerSessionClientSecret", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureReadyAccounts", "partnerAccounts", "action", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "(ZLjava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitAccountNumbersReady", "", "linkedAccountIds", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableNetworking", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeSavedToLinkMessage", "manifest", "", "storeFailedToSaveToLinkMessage", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SaveAccountToLink {
    public static final int $stable = 8;
    private final FinancialConnectionsAccountsRepository accountsRepository;
    private final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final IsNetworkingRelinkSession isNetworkingRelinkSession;
    private final Locale locale;
    private final FinancialConnectionsManifestRepository repository;
    private final SuccessContentRepository successContentRepository;

    /* compiled from: SaveAccountToLink.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink", f = "SaveAccountToLink.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY, 90, 92}, m = "ensureReadyAccounts", n = {"this", "action", "selectedAccountIds", "this", "action", "selectedAccountIds", "this", "selectedAccountIds"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.domain.SaveAccountToLink$ensureReadyAccounts$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SaveAccountToLink.this.ensureReadyAccounts(false, null, null, this);
        }
    }

    @Inject
    public SaveAccountToLink(Locale locale, FinancialConnectionsSheetConfiguration configuration, AttachedPaymentAccountRepository attachedPaymentAccountRepository, SuccessContentRepository successContentRepository, FinancialConnectionsManifestRepository repository, FinancialConnectionsAccountsRepository accountsRepository, IsNetworkingRelinkSession isNetworkingRelinkSession) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(attachedPaymentAccountRepository, "attachedPaymentAccountRepository");
        Intrinsics.checkNotNullParameter(successContentRepository, "successContentRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(accountsRepository, "accountsRepository");
        Intrinsics.checkNotNullParameter(isNetworkingRelinkSession, "isNetworkingRelinkSession");
        this.locale = locale;
        this.configuration = configuration;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.successContentRepository = successContentRepository;
        this.repository = repository;
        this.accountsRepository = accountsRepository;
        this.isNetworkingRelinkSession = isNetworkingRelinkSession;
    }

    /* compiled from: SaveAccountToLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "selectedAccountIds", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$new$2", f = "SaveAccountToLink.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.SaveAccountToLink$new$2, reason: invalid class name and case insensitive filesystem */
    static final class C08602 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super FinancialConnectionsSessionManifest>, Object> {
        final /* synthetic */ String $country;
        final /* synthetic */ String $email;
        final /* synthetic */ String $phoneNumber;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08602(String str, String str2, String str3, Continuation<? super C08602> continuation) {
            super(2, continuation);
            this.$email = str;
            this.$country = str2;
            this.$phoneNumber = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08602 c08602 = SaveAccountToLink.this.new C08602(this.$email, this.$country, this.$phoneNumber, continuation);
            c08602.L$0 = obj;
            return c08602;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return invoke2((Set<String>) set, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((C08602) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Set<String> set = (Set) this.L$0;
            FinancialConnectionsManifestRepository financialConnectionsManifestRepository = SaveAccountToLink.this.repository;
            String financialConnectionsSessionClientSecret = SaveAccountToLink.this.configuration.getFinancialConnectionsSessionClientSecret();
            Locale locale = SaveAccountToLink.this.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            String languageTag = locale.toLanguageTag();
            this.label = 1;
            Object objPostSaveAccountsToLink = financialConnectionsManifestRepository.postSaveAccountsToLink(financialConnectionsSessionClientSecret, this.$email, this.$country, languageTag, this.$phoneNumber, null, set, this);
            return objPostSaveAccountsToLink == coroutine_suspended ? coroutine_suspended : objPostSaveAccountsToLink;
        }
    }

    /* renamed from: new, reason: not valid java name */
    public final Object m7289new(String str, String str2, List<CachedPartnerAccount> list, String str3, boolean z, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return ensureReadyAccounts(z, list, new C08602(str, str3, str2, null), continuation);
    }

    /* compiled from: SaveAccountToLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "selectedAccountIds", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$existing$2", f = "SaveAccountToLink.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.SaveAccountToLink$existing$2, reason: invalid class name and case insensitive filesystem */
    static final class C08592 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super FinancialConnectionsSessionManifest>, Object> {
        final /* synthetic */ String $consumerSessionClientSecret;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08592(String str, Continuation<? super C08592> continuation) {
            super(2, continuation);
            this.$consumerSessionClientSecret = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08592 c08592 = SaveAccountToLink.this.new C08592(this.$consumerSessionClientSecret, continuation);
            c08592.L$0 = obj;
            return c08592;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return invoke2((Set<String>) set, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
            return ((C08592) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Set<String> set = (Set) this.L$0;
            this.label = 1;
            Object objPostSaveAccountsToLink = SaveAccountToLink.this.repository.postSaveAccountsToLink(SaveAccountToLink.this.configuration.getFinancialConnectionsSessionClientSecret(), null, null, null, null, this.$consumerSessionClientSecret, set, this);
            return objPostSaveAccountsToLink == coroutine_suspended ? coroutine_suspended : objPostSaveAccountsToLink;
        }
    }

    public final Object existing(String str, List<CachedPartnerAccount> list, boolean z, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return ensureReadyAccounts(z, list, new C08592(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d A[PHI: r2 r10 r11 r12
      0x016d: PHI (r2v15 com.stripe.android.financialconnections.domain.SaveAccountToLink) = 
      (r2v13 com.stripe.android.financialconnections.domain.SaveAccountToLink)
      (r2v13 com.stripe.android.financialconnections.domain.SaveAccountToLink)
      (r2v19 com.stripe.android.financialconnections.domain.SaveAccountToLink)
     binds: [B:72:0x015a, B:74:0x016a, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r10v33 java.lang.Object) = (r10v29 java.lang.Object), (r10v29 java.lang.Object), (r10v50 java.lang.Object) binds: [B:72:0x015a, B:74:0x016a, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r11v14 java.util.Set) = (r11v10 java.util.Set), (r11v10 java.util.Set), (r11v27 java.util.Set) binds: [B:72:0x015a, B:74:0x016a, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r12v6 kotlin.jvm.functions.Function2<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>) = 
      (r12v3 kotlin.jvm.functions.Function2<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
      (r12v3 kotlin.jvm.functions.Function2<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
      (r12v19 kotlin.jvm.functions.Function2<? super java.util.Set<java.lang.String>, ? super kotlin.coroutines.Continuation<? super com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest>, ? extends java.lang.Object>)
     binds: [B:72:0x015a, B:74:0x016a, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureReadyAccounts(boolean z, List<CachedPartnerAccount> list, Function2<? super Set<String>, ? super Continuation<? super FinancialConnectionsSessionManifest>, ? extends Object> function2, Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM9118constructorimpl;
        SaveAccountToLink saveAccountToLink;
        Set set;
        Throwable th;
        Set set2;
        SaveAccountToLink saveAccountToLink2;
        Object objM9118constructorimpl2;
        Set set3;
        SaveAccountToLink saveAccountToLink3;
        Object objM9118constructorimpl3;
        Object objM9118constructorimpl4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (list != null) {
                List<CachedPartnerAccount> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedPartnerAccount) it.next()).getId());
                }
                Set setEmptySet = CollectionsKt.toSet(arrayList);
                if (setEmptySet == null) {
                    setEmptySet = SetsKt.emptySet();
                }
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String linkedAccountId = ((CachedPartnerAccount) it2.next()).getLinkedAccountId();
                        if (linkedAccountId != null) {
                            arrayList2.add(linkedAccountId);
                        }
                    }
                    Set setEmptySet2 = CollectionsKt.toSet(arrayList2);
                    if (setEmptySet2 == null) {
                        setEmptySet2 = SetsKt.emptySet();
                    }
                    List<CachedPartnerAccount> list3 = list;
                    if (list3 == null || list3.isEmpty()) {
                        AttachedPaymentAccountRepository.State state = this.attachedPaymentAccountRepository.get();
                        if ((state != null ? state.getAttachedPaymentAccount() : null) instanceof PaymentAccountParams.BankAccount) {
                            Result.Companion companion = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                        } else {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Must have a bank account attached if no accounts are selected")));
                        }
                    } else {
                        if (z) {
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                SaveAccountToLink saveAccountToLink4 = this;
                                anonymousClass1.L$0 = this;
                                anonymousClass1.L$1 = function2;
                                anonymousClass1.L$2 = setEmptySet;
                                anonymousClass1.label = 1;
                                if (awaitAccountNumbersReady(setEmptySet2, anonymousClass1) != coroutine_suspended) {
                                    saveAccountToLink2 = this;
                                    set2 = setEmptySet;
                                }
                            } catch (Throwable th2) {
                                Set set4 = setEmptySet;
                                th = th2;
                                set2 = set4;
                                saveAccountToLink2 = this;
                                Result.Companion companion4 = Result.INSTANCE;
                                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                                saveAccountToLink = saveAccountToLink2;
                                set = set2;
                                objM9118constructorimpl = objM9118constructorimpl2;
                                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
                                }
                                saveAccountToLink = saveAccountToLink3;
                                set = set3;
                                objM9118constructorimpl3 = objM9118constructorimpl4;
                                if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                                }
                                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
                                }
                                ResultKt.throwOnFailure(objM9118constructorimpl3);
                                return objM9118constructorimpl3;
                            }
                            return coroutine_suspended;
                        }
                        Result.Companion companion5 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    }
                    saveAccountToLink = this;
                    set = setEmptySet;
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
                        anonymousClass1.L$0 = saveAccountToLink;
                        anonymousClass1.L$1 = function2;
                        anonymousClass1.L$2 = set;
                        anonymousClass1.L$3 = objM9118constructorimpl;
                        anonymousClass1.label = 2;
                        if (saveAccountToLink.disableNetworking(anonymousClass1) != coroutine_suspended) {
                            if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    saveAccountToLink = saveAccountToLink3;
                    set = set3;
                    objM9118constructorimpl3 = objM9118constructorimpl4;
                }
            }
            if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
            }
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
            }
            ResultKt.throwOnFailure(objM9118constructorimpl3);
            return objM9118constructorimpl3;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set3 = (Set) anonymousClass1.L$1;
                saveAccountToLink3 = (SaveAccountToLink) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    objM9118constructorimpl4 = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objInvoke);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion6 = Result.INSTANCE;
                    objM9118constructorimpl4 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    saveAccountToLink = saveAccountToLink3;
                    set = set3;
                    objM9118constructorimpl3 = objM9118constructorimpl4;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                    }
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
                    }
                    ResultKt.throwOnFailure(objM9118constructorimpl3);
                    return objM9118constructorimpl3;
                }
                saveAccountToLink = saveAccountToLink3;
                set = set3;
                objM9118constructorimpl3 = objM9118constructorimpl4;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) objM9118constructorimpl3;
                    if (!saveAccountToLink.isNetworkingRelinkSession.invoke()) {
                        saveAccountToLink.storeSavedToLinkMessage(financialConnectionsSessionManifest, set.size());
                    }
                }
                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null && !saveAccountToLink.isNetworkingRelinkSession.invoke()) {
                    saveAccountToLink.storeFailedToSaveToLinkMessage(set.size());
                }
                ResultKt.throwOnFailure(objM9118constructorimpl3);
                return objM9118constructorimpl3;
            }
            objM9118constructorimpl = anonymousClass1.L$3;
            set = (Set) anonymousClass1.L$2;
            function2 = (Function2) anonymousClass1.L$1;
            saveAccountToLink = (SaveAccountToLink) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    anonymousClass1.L$0 = saveAccountToLink;
                    anonymousClass1.L$1 = set;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 3;
                    objInvoke = function2.invoke(set, anonymousClass1);
                } catch (Throwable th4) {
                    th = th4;
                    set3 = set;
                    saveAccountToLink3 = saveAccountToLink;
                    Result.Companion companion62 = Result.INSTANCE;
                    objM9118constructorimpl4 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    saveAccountToLink = saveAccountToLink3;
                    set = set3;
                    objM9118constructorimpl3 = objM9118constructorimpl4;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                    }
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
                    }
                    ResultKt.throwOnFailure(objM9118constructorimpl3);
                    return objM9118constructorimpl3;
                }
                if (objInvoke != coroutine_suspended) {
                    set3 = set;
                    saveAccountToLink3 = saveAccountToLink;
                    objM9118constructorimpl4 = Result.m9118constructorimpl((FinancialConnectionsSessionManifest) objInvoke);
                    saveAccountToLink = saveAccountToLink3;
                    set = set3;
                    objM9118constructorimpl3 = objM9118constructorimpl4;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                    }
                    if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
                        saveAccountToLink.storeFailedToSaveToLinkMessage(set.size());
                    }
                    ResultKt.throwOnFailure(objM9118constructorimpl3);
                    return objM9118constructorimpl3;
                }
                return coroutine_suspended;
            }
            objM9118constructorimpl3 = Result.m9118constructorimpl(objM9118constructorimpl);
            if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
            }
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
            }
            ResultKt.throwOnFailure(objM9118constructorimpl3);
            return objM9118constructorimpl3;
        }
        set2 = (Set) anonymousClass1.L$2;
        function2 = (Function2) anonymousClass1.L$1;
        saveAccountToLink2 = (SaveAccountToLink) anonymousClass1.L$0;
        try {
            ResultKt.throwOnFailure(objInvoke);
        } catch (Throwable th5) {
            th = th5;
            Result.Companion companion42 = Result.INSTANCE;
            objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
            saveAccountToLink = saveAccountToLink2;
            set = set2;
            objM9118constructorimpl = objM9118constructorimpl2;
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
            }
            saveAccountToLink = saveAccountToLink3;
            set = set3;
            objM9118constructorimpl3 = objM9118constructorimpl4;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
            }
            if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
            }
            ResultKt.throwOnFailure(objM9118constructorimpl3);
            return objM9118constructorimpl3;
        }
        objM9118constructorimpl2 = Result.m9118constructorimpl(Unit.INSTANCE);
        saveAccountToLink = saveAccountToLink2;
        set = set2;
        objM9118constructorimpl = objM9118constructorimpl2;
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
        }
        saveAccountToLink = saveAccountToLink3;
        set = set3;
        objM9118constructorimpl3 = objM9118constructorimpl4;
        if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl3) != null) {
        }
        ResultKt.throwOnFailure(objM9118constructorimpl3);
        return objM9118constructorimpl3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitAccountNumbersReady(Set<String> set, Continuation<? super Unit> continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        Object objRetryOnException = ErrorsKt.retryOnException(new PollTimingOptions(Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.SECONDS)), 20, 0L, 4, null), new AnonymousClass2(null), new AnonymousClass3(set, null), continuation);
        return objRetryOnException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRetryOnException : Unit.INSTANCE;
    }

    /* compiled from: SaveAccountToLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$2", f = "SaveAccountToLink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ErrorsKt.getShouldRetry((Throwable) this.L$0));
        }
    }

    /* compiled from: SaveAccountToLink.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$3", f = "SaveAccountToLink.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.SaveAccountToLink$awaitAccountNumbersReady$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $linkedAccountIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Set<String> set, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$linkedAccountIds = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SaveAccountToLink.this.new AnonymousClass3(this.$linkedAccountIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (SaveAccountToLink.this.accountsRepository.pollAccountNumbers(this.$linkedAccountIds, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object disableNetworking(Continuation<? super Unit> continuation) {
        Object objDisableNetworking = this.repository.disableNetworking(this.configuration.getFinancialConnectionsSessionClientSecret(), "account_numbers_not_available", null, continuation);
        return objDisableNetworking == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDisableNetworking : Unit.INSTANCE;
    }

    private final void storeSavedToLinkMessage(FinancialConnectionsSessionManifest manifest, int selectedAccounts) {
        TextResource.PluralId pluralId;
        SuccessPane successPane;
        String subCaption;
        SuccessPane successPane2;
        String caption;
        SuccessContentRepository successContentRepository = this.successContentRepository;
        TextUpdate displayText = manifest.getDisplayText();
        TextResource.Text text = (displayText == null || (successPane2 = displayText.getSuccessPane()) == null || (caption = successPane2.getCaption()) == null) ? null : new TextResource.Text(caption);
        TextUpdate displayText2 = manifest.getDisplayText();
        if (displayText2 != null && (successPane = displayText2.getSuccessPane()) != null && (subCaption = successPane.getSubCaption()) != null) {
            pluralId = new TextResource.Text(subCaption);
        } else {
            pluralId = new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular, R.string.stripe_success_pane_desc_link_success_plural, Math.max(1, selectedAccounts), null, 8, null);
        }
        successContentRepository.set(pluralId, text);
    }

    private final void storeFailedToSaveToLinkMessage(int selectedAccounts) {
        SuccessContentRepository.set$default(this.successContentRepository, new TextResource.PluralId(R.string.stripe_success_pane_desc_link_error_singular, R.string.stripe_success_pane_desc_link_error_plural, Math.max(1, selectedAccounts), null, 8, null), null, 2, null);
    }
}
