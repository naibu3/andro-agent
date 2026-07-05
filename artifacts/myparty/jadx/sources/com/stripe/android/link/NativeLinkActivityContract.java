package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeLinkActivityContract.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/link/NativeLinkActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "Lcom/stripe/android/link/LinkActivityResult;", "paymentElementCallbackIdentifier", "", "<init>", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeLinkActivityContract extends ActivityResultContract<LinkActivityContract.Args, LinkActivityResult> {
    public static final int $stable = 0;
    private final String paymentElementCallbackIdentifier;

    @Inject
    public NativeLinkActivityContract(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, LinkActivityContract.Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        PaymentConfiguration companion = PaymentConfiguration.INSTANCE.getInstance(context);
        LinkActivity.Companion companion2 = LinkActivity.INSTANCE;
        LinkConfiguration configuration$paymentsheet_release = input.getConfiguration$paymentsheet_release();
        String stripeAccountId = companion.getStripeAccountId();
        String publishableKey = companion.getPublishableKey();
        LinkExpressMode linkExpressMode$paymentsheet_release = input.getLinkExpressMode$paymentsheet_release();
        LinkLaunchMode launchMode$paymentsheet_release = input.getLaunchMode$paymentsheet_release();
        return companion2.createIntent$paymentsheet_release(context, new NativeLinkArgs(configuration$paymentsheet_release, publishableKey, stripeAccountId, linkExpressMode$paymentsheet_release, input.getLinkAccountInfo$paymentsheet_release(), this.paymentElementCallbackIdentifier, launchMode$paymentsheet_release));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public LinkActivityResult parseResult(int resultCode, Intent intent) {
        Bundle extras;
        if (resultCode == 0) {
            return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
        }
        if (resultCode == 73563) {
            LinkActivityResult linkActivityResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (LinkActivityResult) BundleCompat.getParcelable(extras, LinkActivityContract.EXTRA_RESULT, LinkActivityResult.class);
            return linkActivityResult == null ? new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null) : linkActivityResult;
        }
        return new LinkActivityResult.Canceled(null, LinkAccountUpdate.None.INSTANCE, 1, null);
    }
}
