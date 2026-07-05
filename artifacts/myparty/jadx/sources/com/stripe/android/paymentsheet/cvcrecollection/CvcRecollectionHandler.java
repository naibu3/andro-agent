package com.stripe.android.paymentsheet.cvcrecollection;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionData;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: CvcRecollectionHandler.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J*\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "", "launch", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;", "cvcRecollectionEnabled", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "requiresCVCRecollection", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CvcRecollectionHandler {
    boolean cvcRecollectionEnabled(StripeIntent stripeIntent, PaymentElementLoader.InitializationMode initializationMode);

    void launch(PaymentMethod paymentMethod, Function1<? super CvcRecollectionData, Unit> launch);

    boolean requiresCVCRecollection(StripeIntent stripeIntent, PaymentMethod paymentMethod, PaymentMethodOptionsParams optionsParams, PaymentElementLoader.InitializationMode initializationMode);
}
