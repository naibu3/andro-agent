package com.stripe.android.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.stripe.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BecsDebitMandateAcceptanceTextFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "create", "", "companyName", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BecsDebitMandateAcceptanceTextFactory {
    public static final int $stable = 8;
    private final Context context;

    public BecsDebitMandateAcceptanceTextFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final CharSequence create(String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        String string = this.context.getString(R.string.stripe_becs_mandate_acceptance, companyName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Spanned spannedFromHtml = Html.fromHtml(string, 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }
}
