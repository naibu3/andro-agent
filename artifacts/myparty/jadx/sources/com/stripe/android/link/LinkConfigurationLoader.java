package com.stripe.android.link;

import com.stripe.android.link.LinkController;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: LinkConfigurationLoader.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/link/LinkConfigurationLoader;", "", "load", "Lkotlin/Result;", "Lcom/stripe/android/link/LinkConfiguration;", "configuration", "Lcom/stripe/android/link/LinkController$Configuration;", "load-gIAlu-s", "(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkConfigurationLoader {
    /* renamed from: load-gIAlu-s */
    Object mo7675loadgIAlus(LinkController.Configuration configuration, Continuation<? super Result<LinkConfiguration>> continuation);
}
