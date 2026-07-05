package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: PollAuthorizationSessionAccounts.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u000e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000bH\u0002¨\u0006\f"}, d2 = {"toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "businessName", "", "canRetry", "", "showManualEntry", "toPollIntervalMs", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollAuthorizationSessionAccountsKt {

    /* compiled from: PollAuthorizationSessionAccounts.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsAuthorizationSession.Flow.values().length];
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH_WEBVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.FINICITY_CONNECT_V2_LITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinancialConnectionsAuthorizationSession.Flow.MX_CONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeException toDomainException(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, String str, boolean z, boolean z2) {
        Map<String, String> extraFields;
        String str2;
        Map<String, String> extraFields2;
        if (financialConnectionsInstitution == null) {
            return stripeException;
        }
        StripeError stripeError = stripeException.getStripeError();
        if (Intrinsics.areEqual((stripeError == null || (extraFields2 = stripeError.getExtraFields()) == null) ? null : extraFields2.get("reason"), "no_supported_payment_method_type_accounts_found")) {
            StripeError stripeError2 = stripeException.getStripeError();
            int i = (stripeError2 == null || (extraFields = stripeError2.getExtraFields()) == null || (str2 = extraFields.get("total_accounts_count")) == null) ? 0 : Integer.parseInt(str2);
            if (str == null) {
                str = "";
            }
            return new AccountNoneEligibleForPaymentMethodError(i, financialConnectionsInstitution, str, stripeException);
        }
        return new AccountLoadError(z2, z, financialConnectionsInstitution, stripeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toPollIntervalMs(FinancialConnectionsAuthorizationSession.Flow flow) {
        Duration.Companion companion = Duration.INSTANCE;
        long jM10493getInWholeMillisecondsimpl = Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(1.75d, DurationUnit.SECONDS));
        int i = flow == null ? -1 : WhenMappings.$EnumSwitchMapping$0[flow.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return 0L;
        }
        if (i != 5) {
            return jM10493getInWholeMillisecondsimpl;
        }
        Duration.Companion companion2 = Duration.INSTANCE;
        return Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(0.5d, DurationUnit.SECONDS));
    }
}
