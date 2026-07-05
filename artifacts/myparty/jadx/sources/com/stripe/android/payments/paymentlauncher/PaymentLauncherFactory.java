package com.stripe.android.payments.paymentlauncher;

import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherFactory.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;", "", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "statusBarColor", "", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;)V", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;)V", "Ljava/lang/Integer;", "create", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherFactory {
    public static final int $stable = 8;
    private final ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher;
    private final Integer statusBarColor;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String create$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String create$lambda$1(String str) {
        return str;
    }

    public PaymentLauncherFactory(ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher, Integer num) {
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
        this.statusBarColor = num;
    }

    /* compiled from: PaymentLauncherFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 implements ActivityResultCallback, FunctionAdapter {
        final /* synthetic */ PaymentLauncher.InternalPaymentResultCallback $tmp0;

        AnonymousClass1(PaymentLauncher.InternalPaymentResultCallback internalPaymentResultCallback) {
            this.$tmp0 = internalPaymentResultCallback;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.$tmp0, PaymentLauncher.InternalPaymentResultCallback.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(InternalPaymentResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.$tmp0.onPaymentResult(p0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentLauncherFactory(ComponentActivity activity, PaymentLauncher.InternalPaymentResultCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(new PaymentLauncherContract(), new AnonymousClass1(callback));
        Window window = activity.getWindow();
        this((ActivityResultLauncher<PaymentLauncherContract.Args>) activityResultLauncherRegisterForActivityResult, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
    }

    /* compiled from: PaymentLauncherFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements ActivityResultCallback, FunctionAdapter {
        final /* synthetic */ PaymentLauncher.InternalPaymentResultCallback $tmp0;

        AnonymousClass2(PaymentLauncher.InternalPaymentResultCallback internalPaymentResultCallback) {
            this.$tmp0 = internalPaymentResultCallback;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.$tmp0, PaymentLauncher.InternalPaymentResultCallback.class, "onPaymentResult", "onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(InternalPaymentResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.$tmp0.onPaymentResult(p0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentLauncherFactory(Fragment fragment, PaymentLauncher.InternalPaymentResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new PaymentLauncherContract(), new AnonymousClass2(callback));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        Window window = fragment.requireActivity().getWindow();
        this((ActivityResultLauncher<PaymentLauncherContract.Args>) activityResultLauncherRegisterForActivityResult, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
    }

    public static /* synthetic */ PaymentLauncher create$default(PaymentLauncherFactory paymentLauncherFactory, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return paymentLauncherFactory.create(str, str2);
    }

    public final PaymentLauncher create(final String publishableKey, final String stripeAccountId) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Set of = SetsKt.setOf("PaymentLauncher");
        return new StripePaymentLauncher(new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentLauncherFactory.create$lambda$0(publishableKey);
            }
        }, new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentLauncherFactory.create$lambda$1(stripeAccountId);
            }
        }, this.hostActivityLauncher, this.statusBarColor, false, false, of);
    }
}
