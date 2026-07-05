package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import com.stripe.android.financialconnections.model.SuccessPane;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectNetworkedAccounts.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "successContentRepository", "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;", "consumerSessionClientSecret", "", "selectedAccountIds", "", "consentAcquired", "", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectNetworkedAccounts {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsAccountsRepository repository;
    private final SuccessContentRepository successContentRepository;

    /* compiled from: SelectNetworkedAccounts.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.SelectNetworkedAccounts", f = "SelectNetworkedAccounts.kt", i = {0}, l = {21}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.SelectNetworkedAccounts$invoke$1, reason: invalid class name */
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
            return SelectNetworkedAccounts.this.invoke(null, null, null, this);
        }
    }

    @Inject
    public SelectNetworkedAccounts(FinancialConnectionsSheetConfiguration configuration, SuccessContentRepository successContentRepository, FinancialConnectionsAccountsRepository repository) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(successContentRepository, "successContentRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.configuration = configuration;
        this.successContentRepository = successContentRepository;
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation) {
        AnonymousClass1 anonymousClass1;
        SelectNetworkedAccounts selectNetworkedAccounts;
        TextUpdate text;
        SuccessPane successPane;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objPostShareNetworkedAccounts = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objPostShareNetworkedAccounts);
            FinancialConnectionsAccountsRepository financialConnectionsAccountsRepository = this.repository;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            anonymousClass12.L$0 = this;
            anonymousClass12.label = 1;
            objPostShareNetworkedAccounts = financialConnectionsAccountsRepository.postShareNetworkedAccounts(financialConnectionsSessionClientSecret, str, set, bool, anonymousClass12);
            if (objPostShareNetworkedAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
            selectNetworkedAccounts = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selectNetworkedAccounts = (SelectNetworkedAccounts) anonymousClass12.L$0;
            ResultKt.throwOnFailure(objPostShareNetworkedAccounts);
        }
        Display display = ((ShareNetworkedAccountsResponse) objPostShareNetworkedAccounts).getDisplay();
        if (display != null && (text = display.getText()) != null && (successPane = text.getSuccessPane()) != null) {
            selectNetworkedAccounts.successContentRepository.set(new TextResource.Text(successPane.getSubCaption()), new TextResource.Text(successPane.getCaption()));
        }
        return objPostShareNetworkedAccounts;
    }
}
