package com.stripe.android.paymentsheet.repositories;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.IntentConfigurationKtxKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001aL\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a>\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u001d\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u001d2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u001d0 H\u0082\b¢\u0006\u0002\u0010\"\"\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"withoutWeChatPay", "Lcom/stripe/android/model/StripeIntent;", "toElementsSessionParams", "Lcom/stripe/android/model/ElementsSessionParams;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customPaymentMethods", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "externalPaymentMethods", "", "savedPaymentMethodSelectionId", "mobileSessionId", "appId", "toElementSessionParam", "toSellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "customerSessionClientSecret", "getCustomerSessionClientSecret", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;", "legacyCustomerEphemeralKey", "getLegacyCustomerEphemeralKey", "toStripeIntent", "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getResultOrElse", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, ViewProps.TRANSFORM, "Lkotlin/Function1;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ElementsSessionRepositoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent withoutWeChatPay(StripeIntent stripeIntent) {
        List<String> paymentMethodTypes = stripeIntent.getPaymentMethodTypes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paymentMethodTypes) {
            if (!Intrinsics.areEqual((String) obj, PaymentMethod.Type.WeChatPay.code)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListListOf = arrayList;
        if (arrayListListOf.isEmpty()) {
            arrayListListOf = CollectionsKt.listOf("card");
        }
        List list = arrayListListOf;
        if (stripeIntent instanceof PaymentIntent) {
            return PaymentIntent.copy$default((PaymentIntent) stripeIntent, null, list, null, 0L, null, null, null, null, null, 0L, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 16777213, null);
        }
        if (stripeIntent instanceof SetupIntent) {
            return SetupIntent.copy$default((SetupIntent) stripeIntent, null, null, 0L, null, null, null, false, null, null, list, null, null, null, null, null, null, null, 130559, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ElementsSessionParams toElementsSessionParams(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.CustomerConfiguration customerConfiguration, List<PaymentSheet.CustomPaymentMethod> customPaymentMethods, List<String> externalPaymentMethods, String str, String mobileSessionId, String appId) {
        Intrinsics.checkNotNullParameter(initializationMode, "<this>");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
        Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
        Intrinsics.checkNotNullParameter(mobileSessionId, "mobileSessionId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        String customerSessionClientSecret = customerConfiguration != null ? getCustomerSessionClientSecret(customerConfiguration) : null;
        String legacyCustomerEphemeralKey = customerConfiguration != null ? getLegacyCustomerEphemeralKey(customerConfiguration) : null;
        List<String> elementSessionParam = toElementSessionParam(customPaymentMethods);
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return new ElementsSessionParams.PaymentIntentType(((PaymentElementLoader.InitializationMode.PaymentIntent) initializationMode).getClientSecret(), null, customerSessionClientSecret, legacyCustomerEphemeralKey, str, mobileSessionId, elementSessionParam, externalPaymentMethods, appId, 2, null);
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
            return new ElementsSessionParams.SetupIntentType(((PaymentElementLoader.InitializationMode.SetupIntent) initializationMode).getClientSecret(), null, customerSessionClientSecret, legacyCustomerEphemeralKey, str, mobileSessionId, elementSessionParam, externalPaymentMethods, appId, 2, null);
        }
        if (!(initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = (PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode;
        return new ElementsSessionParams.DeferredIntentType(null, IntentConfigurationKtxKt.toDeferredIntentParams(deferredIntent.getIntentConfiguration()), elementSessionParam, externalPaymentMethods, str, customerSessionClientSecret, legacyCustomerEphemeralKey, mobileSessionId, appId, toSellerDetails(deferredIntent.getIntentConfiguration()), 1, null);
    }

    private static final List<String> toElementSessionParam(List<PaymentSheet.CustomPaymentMethod> list) {
        List<PaymentSheet.CustomPaymentMethod> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaymentSheet.CustomPaymentMethod) it.next()).getId());
        }
        return arrayList;
    }

    private static final ElementsSessionParams.SellerDetails toSellerDetails(PaymentSheet.IntentConfiguration intentConfiguration) {
        PaymentSheet.IntentConfiguration.IntentBehavior intentBehavior = intentConfiguration.getIntentBehavior();
        if (!(intentBehavior instanceof PaymentSheet.IntentConfiguration.IntentBehavior.SharedPaymentToken)) {
            if (intentBehavior instanceof PaymentSheet.IntentConfiguration.IntentBehavior.Default) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentSheet.IntentConfiguration.SellerDetails sellerDetails = ((PaymentSheet.IntentConfiguration.IntentBehavior.SharedPaymentToken) intentConfiguration.getIntentBehavior()).getSellerDetails();
        if (sellerDetails == null) {
            return null;
        }
        return new ElementsSessionParams.SellerDetails(sellerDetails.getNetworkId(), sellerDetails.getExternalId());
    }

    private static final String getCustomerSessionClientSecret(PaymentSheet.CustomerConfiguration customerConfiguration) {
        PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customerConfiguration.getAccessType$paymentsheet_release();
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession) {
            return ((PaymentSheet.CustomerAccessType.CustomerSession) customerConfiguration.getAccessType$paymentsheet_release()).getCustomerSessionClientSecret();
        }
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String getLegacyCustomerEphemeralKey(PaymentSheet.CustomerConfiguration customerConfiguration) {
        PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customerConfiguration.getAccessType$paymentsheet_release();
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession) {
            return null;
        }
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) {
            return ((PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) customerConfiguration.getAccessType$paymentsheet_release()).getEphemeralKeySecret();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent toStripeIntent(ElementsSessionParams.DeferredIntentType deferredIntentType, ApiRequest.Options options) {
        DeferredIntentParams deferredIntentParams = deferredIntentType.getDeferredIntentParams();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        DeferredIntentParams.Mode mode = deferredIntentParams.getMode();
        if (mode instanceof DeferredIntentParams.Mode.Payment) {
            DeferredIntentParams.Mode.Payment payment = (DeferredIntentParams.Mode.Payment) mode;
            return new PaymentIntent(deferredIntentParams.getPaymentMethodConfigurationId(), deferredIntentParams.getPaymentMethodTypes(), Long.valueOf(payment.getAmount()), 0L, null, null, deferredIntentType.getClientSecret(), null, null, timeInMillis, deferredIntentParams.getMode().getCurrency(), null, options.getApiKeyIsLiveMode(), null, null, null, null, null, null, null, CollectionsKt.emptyList(), null, null, payment.getPaymentMethodOptionsJsonString(), 7334072, null);
        }
        if (!(mode instanceof DeferredIntentParams.Mode.Setup)) {
            throw new NoWhenBranchMatchedException();
        }
        return new SetupIntent(deferredIntentParams.getPaymentMethodConfigurationId(), null, timeInMillis, null, deferredIntentType.getClientSecret(), null, options.getApiKeyIsLiveMode(), null, null, deferredIntentParams.getPaymentMethodTypes(), null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, 69760, null);
    }

    private static final <T> Object getResultOrElse(Object obj, Function1<? super Throwable, ? extends Result<? extends T>> function1) {
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
        return thM9121exceptionOrNullimpl != null ? function1.invoke(thM9121exceptionOrNullimpl).getValue() : obj;
    }
}
