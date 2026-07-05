package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedPaymentMethodsExtension.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u000b"}, d2 = {"toDisplayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "Lcom/stripe/android/model/PaymentMethod;", "providePaymentMethodName", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "defaultPaymentMethodId", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedPaymentMethodsExtensionKt {
    public static final DisplayableSavedPaymentMethod toDisplayableSavedPaymentMethod(PaymentMethod paymentMethod, Function1<? super String, ? extends ResolvableString> providePaymentMethodName, PaymentMethodMetadata paymentMethodMetadata, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        Intrinsics.checkNotNullParameter(providePaymentMethodName, "providePaymentMethodName");
        DisplayableSavedPaymentMethod.Companion companion = DisplayableSavedPaymentMethod.INSTANCE;
        PaymentMethod.Type type = paymentMethod.type;
        return companion.create(providePaymentMethodName.invoke(type != null ? type.code : null), paymentMethod, (paymentMethodMetadata != null ? paymentMethodMetadata.getCbcEligibility() : null) instanceof CardBrandChoiceEligibility.Eligible, paymentMethod.id != null && Intrinsics.areEqual(paymentMethod.id, str));
    }
}
