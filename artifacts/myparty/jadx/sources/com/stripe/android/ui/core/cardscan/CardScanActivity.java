package com.stripe.android.ui.core.cardscan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleCompat;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.stripecardscan.cardscan.CardScanConfiguration;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.StripeCardScanProxy;
import com.stripe.android.ui.core.databinding.StripeActivityCardScanBinding;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardScanActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/ui/core/cardscan/CardScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewBinding", "Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;", "getViewBinding", "()Lcom/stripe/android/ui/core/databinding/StripeActivityCardScanBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onScanFinished", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardScanActivity extends AppCompatActivity {
    public static final String ARGS = "args";
    public static final String CARD_SCAN_PARCELABLE_NAME = "CardScanActivityResult";

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.ui.core.cardscan.CardScanActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CardScanActivity.viewBinding_delegate$lambda$0(this.f$0);
        }
    });
    public static final int $stable = 8;

    private final StripeActivityCardScanBinding getViewBinding() {
        return (StripeActivityCardScanBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeActivityCardScanBinding viewBinding_delegate$lambda$0(CardScanActivity cardScanActivity) {
        return StripeActivityCardScanBinding.inflate(cardScanActivity.getLayoutInflater());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewBinding().getRoot());
        Bundle extras = getIntent().getExtras();
        CardScanConfiguration cardScanConfiguration = extras != null ? (CardScanConfiguration) BundleCompat.getParcelable(extras, ARGS, CardScanConfiguration.class) : null;
        if (cardScanConfiguration == null) {
            onScanFinished((CardScanSheetResult) new CardScanSheetResult.Failed(new IllegalArgumentException("CardScanConfiguration not found")));
            return;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        StripeCardScanProxy.Companion.create$default(StripeCardScanProxy.INSTANCE, this, anonymousClass1, companion.createFallbackInstance(applicationContext, SetsKt.setOf("CardScan")), (Function0) null, (IsStripeCardScanAvailable) null, 24, (Object) null).present(cardScanConfiguration);
    }

    /* compiled from: CardScanActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.ui.core.cardscan.CardScanActivity$onCreate$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CardScanSheetResult, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardScanSheetResult cardScanSheetResult) {
            invoke2(cardScanSheetResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardScanSheetResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardScanActivity) this.receiver).onScanFinished(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScanFinished(CardScanSheetResult result) {
        Intent intentPutExtra = new Intent().putExtra(CARD_SCAN_PARCELABLE_NAME, (Parcelable) result);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        setResult(-1, intentPutExtra);
        finish();
    }
}
