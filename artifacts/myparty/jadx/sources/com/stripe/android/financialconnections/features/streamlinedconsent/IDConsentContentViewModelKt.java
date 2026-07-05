package com.stripe.android.financialconnections.features.streamlinedconsent;

import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: IDConsentContentViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002¨\u0006\u0006"}, d2 = {"withPayload", "", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;", "block", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IDConsentContentViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void withPayload(IDConsentContentViewModel iDConsentContentViewModel, Function1<? super IDConsentContentState.Payload, Unit> function1) {
        IDConsentContentState.Payload payloadInvoke = iDConsentContentViewModel.getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null) {
            return;
        }
        function1.invoke(payloadInvoke);
    }
}
