package com.stripe.android.paymentsheet;

import com.facebook.react.modules.dialog.AlertFragment;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsStateFactory.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ \u0010\u0013\u001a\u0004\u0018\u00010\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\\\u0010\u0017\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;", "", "<init>", "()V", "createPaymentOptionsList", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "paymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "showGooglePay", "", "showLink", "nameProvider", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/core/strings/ResolvableString;", "isCbcEligible", "defaultPaymentMethodId", "getSelectedItem", AlertFragment.ARG_ITEMS, "currentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "create", "Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsStateFactory {
    public static final int $stable = 0;
    public static final PaymentOptionsStateFactory INSTANCE = new PaymentOptionsStateFactory();

    private PaymentOptionsStateFactory() {
    }

    public final List<PaymentOptionsItem> createPaymentOptionsList(List<PaymentMethod> paymentMethods, boolean showGooglePay, boolean showLink, Function1<? super String, ? extends ResolvableString> nameProvider, boolean isCbcEligible, String defaultPaymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(nameProvider, "nameProvider");
        PaymentOptionsItem[] paymentOptionsItemArr = new PaymentOptionsItem[3];
        paymentOptionsItemArr[0] = PaymentOptionsItem.AddCard.INSTANCE;
        PaymentOptionsItem.GooglePay googlePay = PaymentOptionsItem.GooglePay.INSTANCE;
        if (!showGooglePay) {
            googlePay = null;
        }
        paymentOptionsItemArr[1] = googlePay;
        PaymentOptionsItem.Link link = PaymentOptionsItem.Link.INSTANCE;
        if (!showLink) {
            link = null;
        }
        paymentOptionsItemArr[2] = link;
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) paymentOptionsItemArr);
        List<PaymentMethod> list = paymentMethods;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PaymentMethod paymentMethod : list) {
            DisplayableSavedPaymentMethod.Companion companion = DisplayableSavedPaymentMethod.INSTANCE;
            PaymentMethod.Type type = paymentMethod.type;
            arrayList.add(new PaymentOptionsItem.SavedPaymentMethod(companion.create(nameProvider.invoke(type != null ? type.code : null), paymentMethod, isCbcEligible, paymentMethod.id != null && Intrinsics.areEqual(paymentMethod.id, defaultPaymentMethodId))));
        }
        return CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) arrayList);
    }

    public final PaymentOptionsItem getSelectedItem(List<? extends PaymentOptionsItem> items, PaymentSelection currentSelection) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (currentSelection != null) {
            return PaymentOptionsStateFactoryKt.findSelectedItem(items, currentSelection);
        }
        return null;
    }

    public final PaymentOptionsState create(List<PaymentMethod> paymentMethods, boolean showGooglePay, boolean showLink, PaymentSelection currentSelection, Function1<? super String, ? extends ResolvableString> nameProvider, boolean isCbcEligible, String defaultPaymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(nameProvider, "nameProvider");
        List<PaymentOptionsItem> listCreatePaymentOptionsList = createPaymentOptionsList(paymentMethods, showGooglePay, showLink, nameProvider, isCbcEligible, defaultPaymentMethodId);
        return new PaymentOptionsState(listCreatePaymentOptionsList, getSelectedItem(listCreatePaymentOptionsList, currentSelection));
    }
}
