package com.stripe.android.shoppay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.shoppay.ShopPayActivityResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayActivityContract.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;", "Lcom/stripe/android/shoppay/ShopPayActivityResult;", "paymentElementCallbackIdentifier", "", "<init>", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShopPayActivityContract extends ActivityResultContract<Args, ShopPayActivityResult> {
    public static final int $stable = 0;
    public static final String EXTRA_RESULT = "com.stripe.android.shoppay.ShopPayActivityContract.extra_result";
    private final String paymentElementCallbackIdentifier;

    @Inject
    public ShopPayActivityContract(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        PaymentConfiguration companion = PaymentConfiguration.INSTANCE.getInstance(context);
        return ShopPayActivity.INSTANCE.createIntent$paymentsheet_release(context, new ShopPayArgs(input.getShopPayConfiguration(), companion.getPublishableKey(), companion.getStripeAccountId(), this.paymentElementCallbackIdentifier, input.getCustomerSessionClientSecret(), input.getBusinessName()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public ShopPayActivityResult parseResult(int resultCode, Intent intent) {
        Bundle extras;
        ShopPayActivityResult shopPayActivityResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (ShopPayActivityResult) BundleCompat.getParcelable(extras, EXTRA_RESULT, ShopPayActivityResult.class);
        return shopPayActivityResult == null ? new ShopPayActivityResult.Failed(new Throwable("No result")) : shopPayActivityResult;
    }

    /* compiled from: ShopPayActivityContract.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;", "", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "customerSessionClientSecret", "", "businessName", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/lang/String;)V", "getShopPayConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getCustomerSessionClientSecret", "()Ljava/lang/String;", "getBusinessName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 8;
        private final String businessName;
        private final String customerSessionClientSecret;
        private final PaymentSheet.ShopPayConfiguration shopPayConfiguration;

        public static /* synthetic */ Args copy$default(Args args, PaymentSheet.ShopPayConfiguration shopPayConfiguration, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                shopPayConfiguration = args.shopPayConfiguration;
            }
            if ((i & 2) != 0) {
                str = args.customerSessionClientSecret;
            }
            if ((i & 4) != 0) {
                str2 = args.businessName;
            }
            return args.copy(shopPayConfiguration, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
            return this.shopPayConfiguration;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBusinessName() {
            return this.businessName;
        }

        public final Args copy(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String customerSessionClientSecret, String businessName) {
            Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
            Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
            Intrinsics.checkNotNullParameter(businessName, "businessName");
            return new Args(shopPayConfiguration, customerSessionClientSecret, businessName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.shopPayConfiguration, args.shopPayConfiguration) && Intrinsics.areEqual(this.customerSessionClientSecret, args.customerSessionClientSecret) && Intrinsics.areEqual(this.businessName, args.businessName);
        }

        public int hashCode() {
            return (((this.shopPayConfiguration.hashCode() * 31) + this.customerSessionClientSecret.hashCode()) * 31) + this.businessName.hashCode();
        }

        public String toString() {
            return "Args(shopPayConfiguration=" + this.shopPayConfiguration + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", businessName=" + this.businessName + ")";
        }

        public Args(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String customerSessionClientSecret, String businessName) {
            Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
            Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
            Intrinsics.checkNotNullParameter(businessName, "businessName");
            this.shopPayConfiguration = shopPayConfiguration;
            this.customerSessionClientSecret = customerSessionClientSecret;
            this.businessName = businessName;
        }

        public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
            return this.shopPayConfiguration;
        }

        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        public final String getBusinessName() {
            return this.businessName;
        }
    }
}
