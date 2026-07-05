package com.stripe.android.paymentelement.confirmation.injection;

import com.stripe.android.paymentelement.confirmation.bacs.BacsConfirmationModule;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodConfirmationModule;
import com.stripe.android.paymentelement.confirmation.epms.ExternalPaymentMethodConfirmationModule;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationModule;
import com.stripe.android.paymentelement.confirmation.link.LinkConfirmationModule;
import com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationModule;
import com.stripe.android.paymentelement.confirmation.shoppay.ShopPayConfirmationModule;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: PaymentElementConfirmationModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/injection/PaymentElementConfirmationModule;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {DefaultConfirmationModule.class, BacsConfirmationModule.class, ExternalPaymentMethodConfirmationModule.class, CustomPaymentMethodConfirmationModule.class, GooglePayConfirmationModule.class, LinkConfirmationModule.class, LinkInlineSignupConfirmationModule.class, ShopPayConfirmationModule.class})
/* loaded from: classes5.dex */
public interface PaymentElementConfirmationModule {
}
