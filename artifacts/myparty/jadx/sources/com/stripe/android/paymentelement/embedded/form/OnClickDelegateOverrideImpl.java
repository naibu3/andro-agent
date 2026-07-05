package com.stripe.android.paymentelement.embedded.form;

import com.facebook.react.uimanager.ViewProps;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnClickOverrideDelegate.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/OnClickDelegateOverrideImpl;", "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;", "<init>", "()V", "_onClickOverride", "Lkotlin/Function0;", "", "onClickOverride", "getOnClickOverride", "()Lkotlin/jvm/functions/Function0;", "set", ViewProps.ON_CLICK, "clear", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnClickDelegateOverrideImpl implements OnClickOverrideDelegate {
    public static final int $stable = 8;
    private Function0<Unit> _onClickOverride;

    @Override // com.stripe.android.paymentelement.embedded.form.OnClickOverrideDelegate
    public Function0<Unit> getOnClickOverride() {
        return this._onClickOverride;
    }

    @Override // com.stripe.android.paymentelement.embedded.form.OnClickOverrideDelegate
    public void set(Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this._onClickOverride = onClick;
    }

    @Override // com.stripe.android.paymentelement.embedded.form.OnClickOverrideDelegate
    public void clear() {
        this._onClickOverride = null;
    }
}
