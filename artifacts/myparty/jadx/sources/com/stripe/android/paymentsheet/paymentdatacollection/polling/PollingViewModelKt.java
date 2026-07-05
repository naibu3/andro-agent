package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\f\u0010\r\u001a\u00020\u0004*\u00020\u000eH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {PollingViewModelKt.KEY_CURRENT_POLLING_START_TIME, "", "toFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "countdownFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/time/Duration;", "duration", "countdownFlow-LRDsOJo", "(J)Lkotlinx/coroutines/flow/Flow;", "toPollingState", "Lcom/stripe/android/model/StripeIntent$Status;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingViewModelKt {
    private static final String KEY_CURRENT_POLLING_START_TIME = "KEY_CURRENT_POLLING_START_TIME";

    /* compiled from: PollingViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PollingState.values().length];
            try {
                iArr[PollingState.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollingState.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollingState.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PollingState.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StripeIntent.Status.values().length];
            try {
                iArr2[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StripeIntent.Status.Succeeded.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StripeIntent.Status.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StripeIntent.Status.Processing.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresConfirmation.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final PaymentFlowResult.Unvalidated toFlowResult(PollingState pollingState, PollingContract.Args args) {
        Intrinsics.checkNotNullParameter(pollingState, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        int i = WhenMappings.$EnumSwitchMapping$0[pollingState.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return new PaymentFlowResult.Unvalidated(args.getClientSecret(), 1, null, false, null, null, args.getStripeAccountId(), 60, null);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new PaymentFlowResult.Unvalidated(args.getClientSecret(), 3, null, false, null, null, args.getStripeAccountId(), 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: countdownFlow-LRDsOJo, reason: not valid java name */
    public static final Flow<Duration> m8408countdownFlowLRDsOJo(long j) {
        return FlowKt.flow(new PollingViewModelKt$countdownFlow$1(j, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollingState toPollingState(StripeIntent.Status status) {
        switch (WhenMappings.$EnumSwitchMapping$1[status.ordinal()]) {
            case 1:
                return PollingState.Active;
            case 2:
                return PollingState.Success;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return PollingState.Failed;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
