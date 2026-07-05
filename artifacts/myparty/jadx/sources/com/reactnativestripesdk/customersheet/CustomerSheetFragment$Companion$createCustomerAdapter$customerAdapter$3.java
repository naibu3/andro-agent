package com.reactnativestripesdk.customersheet;

import com.reactnativestripesdk.customersheet.CustomerSheetFragment;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.CustomerEphemeralKey;
import com.stripe.android.customersheet.CustomerEphemeralKeyProvider;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3 implements CustomerEphemeralKeyProvider, FunctionAdapter {
    final /* synthetic */ Function0<CustomerAdapter.Result<CustomerEphemeralKey>> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3(Function0<? extends CustomerAdapter.Result<CustomerEphemeralKey>> function0) {
        this.$tmp0 = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CustomerEphemeralKeyProvider) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, Intrinsics.Kotlin.class, "suspendConversion1", "createCustomerAdapter$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.customersheet.CustomerEphemeralKeyProvider
    public final Object provideCustomerEphemeralKey(Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return CustomerSheetFragment.Companion.createCustomerAdapter$suspendConversion1(this.$tmp0, continuation);
    }
}
