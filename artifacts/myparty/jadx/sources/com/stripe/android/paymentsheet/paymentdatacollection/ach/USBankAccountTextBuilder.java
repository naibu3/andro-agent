package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.core.strings.transformations.Replace;
import com.stripe.android.paymentsheet.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: USBankAccountTextBuilder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountTextBuilder;", "", "<init>", "()V", "buildMandateAndMicrodepositsText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isVerifyingMicrodeposits", "", "isSaveForFutureUseSelected", "isInstantDebits", "isSetupFlow", "buildMandateText", "getTermsLink", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class USBankAccountTextBuilder {
    public static final int $stable = 0;
    public static final USBankAccountTextBuilder INSTANCE = new USBankAccountTextBuilder();

    private USBankAccountTextBuilder() {
    }

    public final ResolvableString buildMandateAndMicrodepositsText(String merchantName, boolean isVerifyingMicrodeposits, boolean isSaveForFutureUseSelected, boolean isInstantDebits, boolean isSetupFlow) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        ResolvableString resolvableStringBuildMandateText = buildMandateText(merchantName, isSaveForFutureUseSelected, isInstantDebits, isSetupFlow);
        ResolvableString resolvableStringResolvableString$default = isVerifyingMicrodeposits ? ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_microdeposit, new Object[]{merchantName}, null, 4, null) : null;
        return resolvableStringResolvableString$default != null ? ResolvableStringUtilsKt.plus(ResolvableStringUtilsKt.plus(resolvableStringResolvableString$default, ResolvableStringUtilsKt.getResolvableString(" ")), resolvableStringBuildMandateText) : resolvableStringBuildMandateText;
    }

    public final ResolvableString buildMandateText(String merchantName, boolean isSaveForFutureUseSelected, boolean isInstantDebits, boolean isSetupFlow) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        List listListOf = CollectionsKt.listOf((Object[]) new Replace[]{new Replace("<terms>", "<a href=\"" + getTermsLink(isInstantDebits) + "\">"), new Replace("</terms>", "</a>")});
        if (isSaveForFutureUseSelected || isSetupFlow) {
            return ResolvableStringUtilsKt.resolvableString(R.string.stripe_paymentsheet_ach_save_mandate, new Object[]{merchantName}, listListOf);
        }
        return ResolvableStringUtilsKt.resolvableString(R.string.stripe_paymentsheet_ach_continue_mandate, new Object[0], listListOf);
    }

    private final String getTermsLink(boolean isInstantDebits) {
        if (isInstantDebits) {
            return "https://link.com/terms/ach-authorization";
        }
        if (isInstantDebits) {
            throw new NoWhenBranchMatchedException();
        }
        return "https://stripe.com/ach-payments/authorization";
    }
}
