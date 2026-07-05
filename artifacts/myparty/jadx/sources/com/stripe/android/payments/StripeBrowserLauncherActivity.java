package com.stripe.android.payments;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: StripeBrowserLauncherActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "launchBrowser", CardScanActivity.ARGS, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "finishWithSuccess", "finishWithFailure", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeBrowserLauncherActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public StripeBrowserLauncherActivity() {
        final StripeBrowserLauncherActivity stripeBrowserLauncherActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(StripeBrowserLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return stripeBrowserLauncherActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StripeBrowserLauncherActivity.viewModel_delegate$lambda$0();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? stripeBrowserLauncherActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final StripeBrowserLauncherViewModel getViewModel() {
        return (StripeBrowserLauncherViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0() {
        return new StripeBrowserLauncherViewModel.Factory();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        PaymentBrowserAuthContract.Args args$payments_core_release = companion.parseArgs$payments_core_release(intent);
        if (args$payments_core_release == null) {
            finish();
            ErrorReporter.Companion companion2 = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion2, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.BROWSER_LAUNCHER_NULL_ARGS, null, null, 6, null);
            return;
        }
        if (getViewModel().getHasLaunched()) {
            finishWithSuccess(args$payments_core_release);
        } else {
            launchBrowser(args$payments_core_release);
        }
    }

    private final void launchBrowser(final PaymentBrowserAuthContract.Args args) {
        try {
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.stripe.android.payments.StripeBrowserLauncherActivity$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    StripeBrowserLauncherActivity.launchBrowser$lambda$1(this.f$0, args, (ActivityResult) obj);
                }
            }).launch(getViewModel().createLaunchIntent(args));
            getViewModel().setHasLaunched(true);
        } catch (ActivityNotFoundException e) {
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND, StripeException.INSTANCE.create(e), null, 4, null);
            finishWithFailure(args);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchBrowser$lambda$1(StripeBrowserLauncherActivity stripeBrowserLauncherActivity, PaymentBrowserAuthContract.Args args, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        stripeBrowserLauncherActivity.finishWithSuccess(args);
    }

    private final void finishWithSuccess(PaymentBrowserAuthContract.Args args) {
        setResult(-1, getViewModel().getResultIntent(args));
        finish();
    }

    private final void finishWithFailure(PaymentBrowserAuthContract.Args args) {
        setResult(-1, getViewModel().getFailureIntent(args));
        finish();
    }
}
