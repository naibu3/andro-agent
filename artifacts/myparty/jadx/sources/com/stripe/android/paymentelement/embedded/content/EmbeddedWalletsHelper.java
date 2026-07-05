package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.state.WalletsState;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedWalletsHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;", "", "walletsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedWalletsHelper {
    StateFlow<WalletsState> walletsState(PaymentMethodMetadata paymentMethodMetadata);
}
