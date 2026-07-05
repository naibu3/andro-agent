package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* compiled from: ManualEntryFormState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\rJ\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0002R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/Validator;", "", "<init>", "()V", "getRoutingErrorIdOrNull", "", "input", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getAccountErrorIdOrNull", "getAccountConfirmIdOrNull", "accountInput", "accountConfirmInput", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "isUSRoutingNumber", "", "ROUTING_NUMBER_LENGTH", "ACCOUNT_NUMBER_MAX_LENGTH", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class Validator {
    private static final int ACCOUNT_NUMBER_MAX_LENGTH = 17;
    public static final Validator INSTANCE = new Validator();
    private static final int ROUTING_NUMBER_LENGTH = 9;

    private Validator() {
    }

    public final Integer getRoutingErrorIdOrNull(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            return Integer.valueOf(R.string.stripe_validation_routing_required);
        }
        if (input.length() != 9) {
            return Integer.valueOf(R.string.stripe_validation_routing_too_short);
        }
        if (isUSRoutingNumber(input)) {
            return null;
        }
        return Integer.valueOf(R.string.stripe_validation_no_us_routing);
    }

    public final Integer getAccountErrorIdOrNull(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            return Integer.valueOf(R.string.stripe_validation_account_required);
        }
        if (input.length() > 17) {
            return Integer.valueOf(R.string.stripe_validation_account_too_long);
        }
        return null;
    }

    public final Integer getAccountConfirmIdOrNull(String accountInput, String accountConfirmInput) {
        Intrinsics.checkNotNullParameter(accountInput, "accountInput");
        Intrinsics.checkNotNullParameter(accountConfirmInput, "accountConfirmInput");
        if (getAccountErrorIdOrNull(accountInput) != null || Intrinsics.areEqual(accountInput, accountConfirmInput)) {
            return null;
        }
        return Integer.valueOf(R.string.stripe_validation_account_confirm_mismatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int isUSRoutingNumber$lambda$0(int i) {
        int i2 = i % 3;
        if (i2 != 0) {
            return i2 != 1 ? 1 : 7;
        }
        return 3;
    }

    private final boolean isUSRoutingNumber(String str) {
        Function1 function1 = new Function1() { // from class: com.stripe.android.financialconnections.features.manualentry.Validator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(Validator.isUSRoutingNumber$lambda$0(((Integer) obj).intValue()));
            }
        };
        String str2 = str;
        if (new Regex("^\\d{9}$").matches(str2)) {
            int i = 0;
            int iDigitToInt = 0;
            int i2 = 0;
            while (i < str2.length()) {
                iDigitToInt += CharsKt.digitToInt(str2.charAt(i), 10) * ((Number) function1.invoke(Integer.valueOf(i2))).intValue();
                i++;
                i2++;
            }
            if (iDigitToInt % 10 == 0) {
                return true;
            }
        }
        return false;
    }
}
