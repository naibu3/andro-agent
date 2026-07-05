package com.stripe.android.paymentelement.embedded.content;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedLinkHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;", "", "linkEmail", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLinkEmail", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EmbeddedLinkHelper {
    StateFlow<String> getLinkEmail();
}
