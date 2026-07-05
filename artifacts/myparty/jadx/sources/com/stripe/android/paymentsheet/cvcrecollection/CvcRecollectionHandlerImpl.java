package com.stripe.android.paymentsheet.cvcrecollection;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionData;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionHandlerImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\f\u0010\u0013\u001a\u00020\u000b*\u00020\u0007H\u0002J\f\u0010\u0014\u001a\u00020\u000b*\u00020\rH\u0002¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandlerImpl;", "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "<init>", "()V", "launch", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;", "cvcRecollectionEnabled", "", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "requiresCVCRecollection", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "isCard", "supportsCvcRecollection", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CvcRecollectionHandlerImpl implements CvcRecollectionHandler {
    public static final int $stable = 0;

    @Override // com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler
    public void launch(PaymentMethod paymentMethod, Function1<? super CvcRecollectionData, Unit> launch) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(launch, "launch");
        CvcRecollectionData cvcRecollectionDataFromPaymentSelection = CvcRecollectionData.INSTANCE.fromPaymentSelection(paymentMethod.card);
        if (cvcRecollectionDataFromPaymentSelection == null) {
            throw new IllegalStateException("unable to create CvcRecollectionData");
        }
        launch.invoke(cvcRecollectionDataFromPaymentSelection);
    }

    @Override // com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler
    public boolean cvcRecollectionEnabled(StripeIntent stripeIntent, PaymentElementLoader.InitializationMode initializationMode) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) {
            PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = (PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode;
            return deferredIntent.getIntentConfiguration().getRequireCvcRecollection() && (deferredIntent.getIntentConfiguration().getMode() instanceof PaymentSheet.IntentConfiguration.Mode.Payment);
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return supportsCvcRecollection(stripeIntent);
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler
    public boolean requiresCVCRecollection(StripeIntent stripeIntent, PaymentMethod paymentMethod, PaymentMethodOptionsParams optionsParams, PaymentElementLoader.InitializationMode initializationMode) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        return isCard(paymentMethod) && cvcRecollectionEnabled(stripeIntent, initializationMode);
    }

    private final boolean isCard(PaymentMethod paymentMethod) {
        return paymentMethod.type == PaymentMethod.Type.Card;
    }

    private final boolean supportsCvcRecollection(StripeIntent stripeIntent) {
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getRequireCvcRecollection();
        }
        if (stripeIntent instanceof SetupIntent) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
