package com.stripe.android.financialconnections.presentation;

import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0005\u001a\u0002H\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00010\u0007H\u0000¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"withState", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "B", "viewModel", "block", "Lkotlin/Function1;", "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsViewModelKt {
    public static final <A extends FinancialConnectionsViewModel<B>, B, C> C withState(A viewModel, Function1<? super B, ? extends C> block) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke((Object) viewModel.getStateFlow().getValue());
    }
}
