package com.stripe.android.paymentelement.embedded;

import com.stripe.android.core.injection.ViewModelScope;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmbeddedRowSelectionImmediateActionHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;", "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "internalRowSelectionCallback", "Ljavax/inject/Provider;", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljavax/inject/Provider;)V", "invoke", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedRowSelectionImmediateActionHandler implements EmbeddedRowSelectionImmediateActionHandler {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final Provider<Function0<Unit>> internalRowSelectionCallback;

    @Inject
    public DefaultEmbeddedRowSelectionImmediateActionHandler(@ViewModelScope CoroutineScope coroutineScope, Provider<Function0<Unit>> internalRowSelectionCallback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(internalRowSelectionCallback, "internalRowSelectionCallback");
        this.coroutineScope = coroutineScope;
        this.internalRowSelectionCallback = internalRowSelectionCallback;
    }

    @Override // com.stripe.android.paymentelement.embedded.EmbeddedRowSelectionImmediateActionHandler
    public void invoke() {
        Function0<Unit> function0 = this.internalRowSelectionCallback.get();
        if (function0 != null) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DefaultEmbeddedRowSelectionImmediateActionHandler$invoke$1$1(function0, null), 3, null);
        }
    }
}
