package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.databinding.StripeAddPaymentMethodRowBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethodRowView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeAddPaymentMethodRowBinding;", "label", "Landroidx/appcompat/widget/AppCompatTextView;", "getLabel$payments_core_release", "()Landroidx/appcompat/widget/AppCompatTextView;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddPaymentMethodRowView extends FrameLayout {
    public static final int $stable = 8;
    private final AppCompatTextView label;
    private final StripeAddPaymentMethodRowBinding viewBinding;

    private AddPaymentMethodRowView(Context context) {
        super(context);
        StripeAddPaymentMethodRowBinding stripeAddPaymentMethodRowBindingInflate = StripeAddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeAddPaymentMethodRowBindingInflate, "inflate(...)");
        this.viewBinding = stripeAddPaymentMethodRowBindingInflate;
        AppCompatTextView label = stripeAddPaymentMethodRowBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        this.label = label;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setFocusable(true);
        setClickable(true);
    }

    /* renamed from: getLabel$payments_core_release, reason: from getter */
    public final AppCompatTextView getLabel() {
        return this.label;
    }
}
