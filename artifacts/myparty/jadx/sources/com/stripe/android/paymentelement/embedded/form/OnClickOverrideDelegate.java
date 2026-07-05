package com.stripe.android.paymentelement.embedded.form;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: OnClickOverrideDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\t\u001a\u00020\u0004H&R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;", "", "onClickOverride", "Lkotlin/Function0;", "", "getOnClickOverride", "()Lkotlin/jvm/functions/Function0;", "set", ViewProps.ON_CLICK, "clear", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface OnClickOverrideDelegate {
    void clear();

    Function0<Unit> getOnClickOverride();

    void set(Function0<Unit> onClick);
}
