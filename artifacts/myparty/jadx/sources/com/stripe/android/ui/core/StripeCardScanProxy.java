package com.stripe.android.ui.core;

import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.stripecardscan.cardscan.CardScanConfiguration;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.ui.core.StripeCardScanProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeCardScanProxy.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JE\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000eH&¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/ui/core/StripeCardScanProxy;", "", "present", "", "configuration", "Lcom/stripe/android/stripecardscan/cardscan/CardScanConfiguration;", "attachCardScanFragment", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentContainer", "", "onFinished", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StripeCardScanProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void attachCardScanFragment(LifecycleOwner lifecycleOwner, FragmentManager supportFragmentManager, int fragmentContainer, Function1<? super CardScanSheetResult, Unit> onFinished);

    void present(CardScanConfiguration configuration);

    /* compiled from: StripeCardScanProxy.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0014¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/ui/core/StripeCardScanProxy$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/ui/core/StripeCardScanProxy;", "fragment", "Landroidx/fragment/app/Fragment;", "onFinished", "Lkotlin/Function1;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lkotlin/ParameterName;", "name", "cardScanSheetResult", "", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "provider", "Lkotlin/Function0;", "isStripeCardScanAvailable", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "removeCardScanFragment", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, final Fragment fragment, final Function1 function1, ErrorReporter errorReporter, Function0 function0, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            if ((i & 8) != 0) {
                function0 = new Function0() { // from class: com.stripe.android.ui.core.StripeCardScanProxy$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StripeCardScanProxy.Companion.create$lambda$0(fragment, function1);
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(fragment, (Function1<? super CardScanSheetResult, Unit>) function1, errorReporter, (Function0<? extends StripeCardScanProxy>) function02, isStripeCardScanAvailable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DefaultStripeCardScanProxy create$lambda$0(Fragment fragment, Function1 function1) {
            return new DefaultStripeCardScanProxy(CardScanSheet.Companion.create$default(CardScanSheet.Companion, fragment, new StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0(function1), (ActivityResultRegistry) null, 4, (Object) null));
        }

        public final StripeCardScanProxy create(Fragment fragment, Function1<? super CardScanSheetResult, Unit> onFinished, ErrorReporter errorReporter, Function0<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(onFinished, "onFinished");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy(errorReporter);
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, final AppCompatActivity appCompatActivity, final Function1 function1, ErrorReporter errorReporter, Function0 function0, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            if ((i & 8) != 0) {
                function0 = new Function0() { // from class: com.stripe.android.ui.core.StripeCardScanProxy$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StripeCardScanProxy.Companion.create$lambda$1(appCompatActivity, function1);
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(appCompatActivity, (Function1<? super CardScanSheetResult, Unit>) function1, errorReporter, (Function0<? extends StripeCardScanProxy>) function02, isStripeCardScanAvailable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DefaultStripeCardScanProxy create$lambda$1(AppCompatActivity appCompatActivity, Function1 function1) {
            return new DefaultStripeCardScanProxy(CardScanSheet.Companion.create$default(CardScanSheet.Companion, appCompatActivity, new StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0(function1), (ActivityResultRegistry) null, 4, (Object) null));
        }

        public final StripeCardScanProxy create(AppCompatActivity activity, Function1<? super CardScanSheetResult, Unit> onFinished, ErrorReporter errorReporter, Function0<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(onFinished, "onFinished");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy(errorReporter);
        }

        public static /* synthetic */ void removeCardScanFragment$default(Companion companion, FragmentManager fragmentManager, IsStripeCardScanAvailable isStripeCardScanAvailable, int i, Object obj) {
            if ((i & 2) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            companion.removeCardScanFragment(fragmentManager, isStripeCardScanAvailable);
        }

        public final void removeCardScanFragment(FragmentManager supportFragmentManager, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            Intrinsics.checkNotNullParameter(supportFragmentManager, "supportFragmentManager");
            Intrinsics.checkNotNullParameter(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                CardScanSheet.Companion.removeCardScanFragment(supportFragmentManager);
            }
        }
    }
}
