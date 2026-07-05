package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EmbeddedSelectionChooser.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSelectionChooser;", "", "choose", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "previousSelection", "newSelection", "newConfiguration", "Lcom/stripe/android/common/model/CommonConfiguration;", "formSheetAction", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedSelectionChooser {
    PaymentSelection choose(PaymentMethodMetadata paymentMethodMetadata, List<PaymentMethod> paymentMethods, PaymentSelection previousSelection, PaymentSelection newSelection, CommonConfiguration newConfiguration, EmbeddedPaymentElement.FormSheetAction formSheetAction);
}
