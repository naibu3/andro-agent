package com.stripe.android.paymentelement.confirmation.cpms;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.CustomPaymentMethodResult;
import com.stripe.android.paymentelement.CustomPaymentMethodResultHandler;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomPaymentMethodProxyActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0015J\b\u0010\r\u001a\u00020\u0007H\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "hasConfirmStarted", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onResume", "onSaveInstanceState", "outState", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomPaymentMethodProxyActivity extends AppCompatActivity {
    public static final String EXTRA_BILLING_DETAILS = "extra_payment_method_billing_details";
    public static final String EXTRA_CUSTOM_PAYMENT_METHOD_TYPE = "extra_custom_method_type";
    public static final String EXTRA_PAYMENT_ELEMENT_IDENTIFIER = "payment_element_identifier";
    public static final String HAS_CONFIRM_STARTED_KEY = "has_confirm_started";
    private boolean hasConfirmStarted;
    public static final int $stable = 8;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.hasConfirmStarted = savedInstanceState.getBoolean("has_confirm_started");
        }
        Bundle extras = getIntent().getExtras();
        PaymentSheet.CustomPaymentMethod customPaymentMethod = extras != null ? (PaymentSheet.CustomPaymentMethod) BundleCompat.getParcelable(extras, EXTRA_CUSTOM_PAYMENT_METHOD_TYPE, PaymentSheet.CustomPaymentMethod.class) : null;
        String stringExtra = getIntent().getStringExtra("payment_element_identifier");
        PaymentMethod.BillingDetails billingDetails = extras != null ? (PaymentMethod.BillingDetails) BundleCompat.getParcelable(extras, EXTRA_BILLING_DETAILS, PaymentMethod.BillingDetails.class) : null;
        if (customPaymentMethod == null || this.hasConfirmStarted || stringExtra == null) {
            return;
        }
        this.hasConfirmStarted = true;
        PaymentElementCallbacks paymentElementCallbacks = PaymentElementCallbackReferences.INSTANCE.get(stringExtra);
        if (paymentElementCallbacks == null || (confirmCustomPaymentMethodCallback = paymentElementCallbacks.getConfirmCustomPaymentMethodCallback()) == null) {
            return;
        }
        if (billingDetails == null) {
            billingDetails = new PaymentMethod.BillingDetails(null, null, null, null, 15, null);
        }
        confirmCustomPaymentMethodCallback.onConfirmCustomPaymentMethod(customPaymentMethod, billingDetails);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PaymentSheet.CustomPaymentMethod customPaymentMethod = (PaymentSheet.CustomPaymentMethod) BundleCompat.getParcelable(extras, EXTRA_CUSTOM_PAYMENT_METHOD_TYPE, PaymentSheet.CustomPaymentMethod.class);
        CustomPaymentMethodResult customPaymentMethodResult = (CustomPaymentMethodResult) BundleCompat.getParcelable(extras, CustomPaymentMethodResultHandler.EXTRA_CUSTOM_PAYMENT_METHOD_RESULT, CustomPaymentMethodResult.class);
        if (customPaymentMethod == null && customPaymentMethodResult == null) {
            finish();
        } else if (customPaymentMethodResult != null) {
            setResult(-1, new Intent().putExtras(InternalCustomPaymentMethodResult.INSTANCE.fromCustomPaymentMethodResult(customPaymentMethodResult).toBundle()));
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("has_confirm_started", this.hasConfirmStarted);
        super.onSaveInstanceState(outState);
    }
}
