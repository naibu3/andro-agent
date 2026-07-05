package com.stripe.android.link.model;

import com.stripe.android.paymentsheet.state.LinkState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toLoginState", "Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;", "Lcom/stripe/android/link/model/AccountStatus;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountStatusKt {

    /* compiled from: AccountStatus.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            try {
                iArr[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountStatus.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountStatus.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LinkState.LoginState toLoginState(AccountStatus accountStatus) {
        Intrinsics.checkNotNullParameter(accountStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[accountStatus.ordinal()];
        if (i == 1) {
            return LinkState.LoginState.LoggedIn;
        }
        if (i == 2 || i == 3) {
            return LinkState.LoginState.NeedsVerification;
        }
        if (i == 4 || i == 5) {
            return LinkState.LoginState.LoggedOut;
        }
        throw new NoWhenBranchMatchedException();
    }
}
