package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.serialization.PopupPayload;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: WebLinkActivityContract.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/WebLinkActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/LinkActivityResult;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "handleCompleteResult", "parsePaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebLinkActivityContract extends ActivityResultContract<LinkActivityContract.Args, LinkActivityResult> {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;
    private final StripeRepository stripeRepository;

    @Inject
    public WebLinkActivityContract(StripeRepository stripeRepository, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.stripeRepository = stripeRepository;
        this.errorReporter = errorReporter;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, LinkActivityContract.Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        PaymentConfiguration companion = PaymentConfiguration.INSTANCE.getInstance(context);
        return LinkForegroundActivity.INSTANCE.createIntent(context, PopupPayload.INSTANCE.create(input.getConfiguration$paymentsheet_release(), context, companion.getPublishableKey(), companion.getStripeAccountId(), StripeRepository.DefaultImpls.buildPaymentUserAgent$default(this.stripeRepository, null, 1, null)).toUrl());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public LinkActivityResult parseResult(int resultCode, Intent intent) {
        Bundle extras;
        if (resultCode == 0) {
            return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
        }
        if (resultCode == 49871) {
            return handleCompleteResult(intent);
        }
        if (resultCode == 91367) {
            Exception exc = (intent == null || (extras = intent.getExtras()) == null) ? null : (Exception) BundleCompat.getSerializable(extras, LinkForegroundActivity.EXTRA_FAILURE, Exception.class);
            if (exc != null) {
                return new LinkActivityResult.Failed(exc, LinkAccountUpdate.None.INSTANCE);
            }
            return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
        }
        return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
    }

    private final LinkActivityResult handleCompleteResult(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
        }
        String queryParameter = data.getQueryParameter("link_status");
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode != -1097329270) {
                if (iHashCode == -599445191 && queryParameter.equals("complete")) {
                    String queryParameter2 = data.getQueryParameter("pm");
                    PaymentMethod paymentMethod = queryParameter2 != null ? parsePaymentMethod(queryParameter2) : null;
                    if (paymentMethod == null) {
                        return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
                    }
                    return new LinkActivityResult.PaymentMethodObtained(paymentMethod);
                }
            } else if (queryParameter.equals("logout")) {
                return new LinkActivityResult.Canceled(LinkActivityResult.Canceled.Reason.LoggedOut, LinkAccountUpdate.None.INSTANCE);
            }
        }
        return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
    }

    private final PaymentMethod parsePaymentMethod(String str) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentMethodJsonParser().parse(new JSONObject(new String(bArrDecode, Charsets.UTF_8))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.LINK_WEB_FAILED_TO_PARSE_RESULT_URI, new FailedToParseLinkResultUriException(thM9121exceptionOrNullimpl), null, 4, null);
            objM9118constructorimpl = null;
        }
        return (PaymentMethod) objM9118constructorimpl;
    }
}
