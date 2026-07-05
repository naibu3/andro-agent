package com.stripe.android.core.injection;

import kotlin.Metadata;

/* compiled from: Injectable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/core/injection/Injectable;", "FallbackInitializeParam", "", "fallbackInitialize", "Lcom/stripe/android/core/injection/Injector;", "arg", "(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Injectable<FallbackInitializeParam> {
    Injector fallbackInitialize(FallbackInitializeParam arg);
}
