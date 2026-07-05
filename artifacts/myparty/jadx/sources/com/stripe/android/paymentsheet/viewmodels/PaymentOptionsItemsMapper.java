package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactory;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PaymentOptionsItemsMapper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0003H\u0086\u0002J?\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u001bR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;", "", "customerMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "customerState", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "isGooglePayReady", "", "isLinkEnabled", "nameProvider", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/core/strings/ResolvableString;", "isNotPaymentFlow", "isCbcEligible", "Lkotlin/Function0;", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;)V", "invoke", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "createPaymentOptionsItems", "paymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "defaultPaymentMethodId", "(Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsItemsMapper {
    public static final int $stable = 8;
    private final StateFlow<CustomerMetadata> customerMetadata;
    private final StateFlow<CustomerState> customerState;
    private final Function0<Boolean> isCbcEligible;
    private final StateFlow<Boolean> isGooglePayReady;
    private final StateFlow<Boolean> isLinkEnabled;
    private final boolean isNotPaymentFlow;
    private final Function1<String, ResolvableString> nameProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsItemsMapper(StateFlow<CustomerMetadata> customerMetadata, StateFlow<CustomerState> customerState, StateFlow<Boolean> isGooglePayReady, StateFlow<Boolean> isLinkEnabled, Function1<? super String, ? extends ResolvableString> nameProvider, boolean z, Function0<Boolean> isCbcEligible) {
        Intrinsics.checkNotNullParameter(customerMetadata, "customerMetadata");
        Intrinsics.checkNotNullParameter(customerState, "customerState");
        Intrinsics.checkNotNullParameter(isGooglePayReady, "isGooglePayReady");
        Intrinsics.checkNotNullParameter(isLinkEnabled, "isLinkEnabled");
        Intrinsics.checkNotNullParameter(nameProvider, "nameProvider");
        Intrinsics.checkNotNullParameter(isCbcEligible, "isCbcEligible");
        this.customerMetadata = customerMetadata;
        this.customerState = customerState;
        this.isGooglePayReady = isGooglePayReady;
        this.isLinkEnabled = isLinkEnabled;
        this.nameProvider = nameProvider;
        this.isNotPaymentFlow = z;
        this.isCbcEligible = isCbcEligible;
    }

    public final StateFlow<List<PaymentOptionsItem>> invoke() {
        return StateFlowsKt.combineAsStateFlow(this.customerState, this.isLinkEnabled, this.isGooglePayReady, this.customerMetadata, new Function4() { // from class: com.stripe.android.paymentsheet.viewmodels.PaymentOptionsItemsMapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PaymentOptionsItemsMapper.invoke$lambda$0(this.f$0, (CustomerState) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), (CustomerMetadata) obj4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invoke$lambda$0(PaymentOptionsItemsMapper paymentOptionsItemsMapper, CustomerState customerState, Boolean bool, boolean z, CustomerMetadata customerMetadata) {
        List<PaymentMethod> listEmptyList;
        if (customerState == null || (listEmptyList = customerState.getPaymentMethods()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        String defaultPaymentMethodId = null;
        if (customerMetadata != null && customerMetadata.isPaymentMethodSetAsDefaultEnabled() && customerState != null) {
            defaultPaymentMethodId = customerState.getDefaultPaymentMethodId();
        }
        List<PaymentOptionsItem> listCreatePaymentOptionsItems = paymentOptionsItemsMapper.createPaymentOptionsItems(listEmptyList, bool, z, defaultPaymentMethodId);
        return listCreatePaymentOptionsItems == null ? CollectionsKt.emptyList() : listCreatePaymentOptionsItems;
    }

    private final List<PaymentOptionsItem> createPaymentOptionsItems(List<PaymentMethod> paymentMethods, Boolean isLinkEnabled, boolean isGooglePayReady, String defaultPaymentMethodId) {
        boolean z;
        if (isLinkEnabled == null) {
            return null;
        }
        PaymentOptionsStateFactory paymentOptionsStateFactory = PaymentOptionsStateFactory.INSTANCE;
        boolean z2 = false;
        if (isGooglePayReady && this.isNotPaymentFlow) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        return paymentOptionsStateFactory.createPaymentOptionsList(paymentMethods, z2, (isLinkEnabled.booleanValue() && this.isNotPaymentFlow) ? true : z, this.nameProvider, this.isCbcEligible.invoke().booleanValue(), defaultPaymentMethodId);
    }
}
