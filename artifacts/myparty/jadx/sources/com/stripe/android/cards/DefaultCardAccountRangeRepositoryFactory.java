package com.stripe.android.cards;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001 B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "context", "Landroid/content/Context;", "productUsageTokens", "", "", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "<init>", "(Landroid/content/Context;Ljava/util/Set;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "(Landroid/content/Context;Ljava/util/Set;)V", "appContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "cardAccountRangeRepository", "Lkotlin/Lazy;", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "create", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "createWithStripeRepository", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "createRemoteCardAccountRangeSource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "fireAnalyticsEvent", "", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "NullCardAccountRangeSource", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Context appContext;
    private final Lazy<DefaultCardAccountRangeRepository> cardAccountRangeRepository;
    private final Set<String> productUsageTokens;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultCardAccountRangeRepositoryFactory(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createRemoteCardAccountRangeSource$lambda$5$lambda$4(String str) {
        return str;
    }

    @Inject
    public DefaultCardAccountRangeRepositoryFactory(Context context, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsageTokens, AnalyticsRequestExecutor analyticsRequestExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.productUsageTokens = productUsageTokens;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.appContext = context.getApplicationContext();
        this.cardAccountRangeRepository = LazyKt.lazy(new Function0() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultCardAccountRangeRepositoryFactory.cardAccountRangeRepository$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DefaultCardAccountRangeRepository cardAccountRangeRepository$lambda$0(DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory) {
        InMemoryCardAccountRangeStore inMemoryCardAccountRangeStore = new InMemoryCardAccountRangeStore();
        return new DefaultCardAccountRangeRepository(new InMemoryCardAccountRangeSource(inMemoryCardAccountRangeStore), defaultCardAccountRangeRepositoryFactory.createRemoteCardAccountRangeSource(inMemoryCardAccountRangeStore), new StaticCardAccountRangeSource(null, 1, 0 == true ? 1 : 0), inMemoryCardAccountRangeStore);
    }

    public /* synthetic */ DefaultCardAccountRangeRepositoryFactory(Context context, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultCardAccountRangeRepositoryFactory(Context context, Set<String> productUsageTokens) {
        this(context, productUsageTokens, new DefaultAnalyticsRequestExecutor());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository create() throws IllegalStateException {
        return this.cardAccountRangeRepository.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository createWithStripeRepository(StripeRepository stripeRepository, String publishableKey) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        InMemoryCardAccountRangeStore inMemoryCardAccountRangeStore = new InMemoryCardAccountRangeStore();
        InMemoryCardAccountRangeSource inMemoryCardAccountRangeSource = new InMemoryCardAccountRangeSource(inMemoryCardAccountRangeStore);
        ApiRequest.Options options = new ApiRequest.Options(publishableKey, null, null, 6, null);
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return new DefaultCardAccountRangeRepository(inMemoryCardAccountRangeSource, new RemoteCardAccountRangeSource(stripeRepository, options, inMemoryCardAccountRangeStore, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext, publishableKey, this.productUsageTokens)), new StaticCardAccountRangeSource(null, 1, 0 == true ? 1 : 0), inMemoryCardAccountRangeStore);
    }

    private final CardAccountRangeSource createRemoteCardAccountRangeSource(CardAccountRangeStore store) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory = this;
            PaymentConfiguration.Companion companion2 = PaymentConfiguration.INSTANCE;
            Context appContext = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            objM9118constructorimpl = Result.m9118constructorimpl(companion2.getInstance(appContext).getPublishableKey());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            fireAnalyticsEvent((String) objM9118constructorimpl, PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) != null) {
            fireAnalyticsEvent(ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY, PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
            final String str = (String) objM9118constructorimpl;
            Context appContext2 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
            StripeApiRepository stripeApiRepository = new StripeApiRepository(appContext2, new Function0() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultCardAccountRangeRepositoryFactory.createRemoteCardAccountRangeSource$lambda$5$lambda$4(str);
                }
            }, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, false ? 1 : 0);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            Context appContext3 = this.appContext;
            Intrinsics.checkNotNullExpressionValue(appContext3, "appContext");
            return new RemoteCardAccountRangeSource(stripeApiRepository, options, store, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(appContext3, str, this.productUsageTokens));
        }
        return new NullCardAccountRangeSource();
    }

    private final void fireAnalyticsEvent(String publishableKey, PaymentAnalyticsEvent event) {
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(new PaymentAnalyticsRequestFactory(appContext, publishableKey, this.productUsageTokens), event, null, null, null, null, null, 62, null));
    }

    /* compiled from: DefaultCardAccountRangeRepositoryFactory.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory$NullCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "<init>", "()V", "getAccountRanges", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NullCardAccountRangeSource implements CardAccountRangeSource {
        private final StateFlow<Boolean> loading = StateFlowsKt.stateFlowOf(false);

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
            return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
        }

        @Override // com.stripe.android.cards.CardAccountRangeSource
        public StateFlow<Boolean> getLoading() {
            return this.loading;
        }
    }
}
