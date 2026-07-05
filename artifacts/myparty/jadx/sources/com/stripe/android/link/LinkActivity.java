package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import com.stripe.android.R;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.paymentsheet.utils.EdgeToEdgeKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkActivity.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\f\u0010\u0018\u001a\u00020\u0015*\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"R$\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/link/LinkActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_release$annotations", "getViewModelFactory$paymentsheet_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/link/LinkActivityViewModel;", "getViewModel$paymentsheet_release", "()Lcom/stripe/android/link/LinkActivityViewModel;", "setViewModel$paymentsheet_release", "(Lcom/stripe/android/link/LinkActivityViewModel;)V", "webLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setTheme", "Lcom/stripe/android/link/LinkLaunchMode;", "observeBackPress", "dismissWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkActivityResult;", "onDestroy", "finish", "launchWebFlow", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkActivity extends ComponentActivity {
    public static final String EXTRA_ARGS = "native_link_args";
    public static final int RESULT_COMPLETE = 73563;
    private LinkActivityViewModel viewModel;
    private ViewModelProvider.Factory viewModelFactory = LinkActivityViewModel.Companion.factory$default(LinkActivityViewModel.INSTANCE, null, 1, null);
    private ActivityResultLauncher<LinkActivityContract.Args> webLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getViewModelFactory$paymentsheet_release$annotations() {
    }

    /* renamed from: getViewModelFactory$paymentsheet_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final void setViewModelFactory$paymentsheet_release(ViewModelProvider.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }

    /* renamed from: getViewModel$paymentsheet_release, reason: from getter */
    public final LinkActivityViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setViewModel$paymentsheet_release(LinkActivityViewModel linkActivityViewModel) {
        this.viewModel = linkActivityViewModel;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.viewModel = (LinkActivityViewModel) new ViewModelProvider(this, this.viewModelFactory).get(LinkActivityViewModel.class);
        } catch (NoArgsException e) {
            Logger.INSTANCE.getInstance(false).error("Failed to create LinkActivityViewModel", e);
            setResult(0);
            finish();
        }
        final LinkActivityViewModel linkActivityViewModel = this.viewModel;
        if (linkActivityViewModel == null) {
            return;
        }
        setTheme(linkActivityViewModel.getLinkLaunchMode());
        linkActivityViewModel.registerForActivityResult(this, this);
        this.webLauncher = registerForActivityResult(linkActivityViewModel.getActivityRetainedComponent().getWebLinkActivityContract(), new ActivityResultCallback() { // from class: com.stripe.android.link.LinkActivity$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LinkActivity.onCreate$lambda$0(linkActivityViewModel, (LinkActivityResult) obj);
            }
        });
        linkActivityViewModel.setLaunchWebFlow(new AnonymousClass2(this));
        getLifecycle().addObserver(linkActivityViewModel);
        observeBackPress();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1514588233, true, new AnonymousClass3(linkActivityViewModel, this)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(LinkActivityViewModel linkActivityViewModel, LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        linkActivityViewModel.handleResult(result);
    }

    /* compiled from: LinkActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<LinkConfiguration, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, LinkActivity.class, "launchWebFlow", "launchWebFlow(Lcom/stripe/android/link/LinkConfiguration;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkConfiguration linkConfiguration) {
            invoke2(linkConfiguration);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkConfiguration p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((LinkActivity) this.receiver).launchWebFlow(p0);
        }
    }

    /* compiled from: LinkActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ LinkActivityViewModel $vm;
        final /* synthetic */ LinkActivity this$0;

        AnonymousClass3(LinkActivityViewModel linkActivityViewModel, LinkActivity linkActivity) {
            this.$vm = linkActivityViewModel;
            this.this$0 = linkActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1514588233, i, -1, "com.stripe.android.link.LinkActivity.onCreate.<anonymous> (LinkActivity.kt:58)");
                }
                composer.startReplaceGroup(2139284852);
                boolean zChangedInstance = composer.changedInstance(this.$vm);
                final LinkActivityViewModel linkActivityViewModel = this.$vm;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.link.LinkActivity$onCreate$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(LinkActivity.AnonymousClass3.invoke$lambda$1$lambda$0(linkActivityViewModel, (ModalBottomSheetValue) obj));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(2139287303);
                boolean zChangedInstance2 = composer.changedInstance(this.$vm) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState) | composer.changedInstance(this.this$0);
                LinkActivityViewModel linkActivityViewModel2 = this.$vm;
                LinkActivity linkActivity = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (Function2) new LinkActivity$onCreate$3$1$1(linkActivityViewModel2, stripeBottomSheetStateRememberStripeBottomSheetState, linkActivity, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
                LinkScreenContentKt.LinkScreenContent(this.$vm, stripeBottomSheetStateRememberStripeBottomSheetState, composer, StripeBottomSheetState.$stable << 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1$lambda$0(LinkActivityViewModel linkActivityViewModel, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return linkActivityViewModel.getCanDismissSheet();
        }
    }

    private final void setTheme(LinkLaunchMode linkLaunchMode) {
        if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) || (linkLaunchMode instanceof LinkLaunchMode.Authentication)) {
            setTheme(R.style.StripePaymentSheetDefaultTheme);
        } else {
            if (!(linkLaunchMode instanceof LinkLaunchMode.Confirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            setTheme(R.style.StripeTransparentTheme);
        }
        EdgeToEdgeKt.renderEdgeToEdge(this);
    }

    private final void observeBackPress() {
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.link.LinkActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkActivity.observeBackPress$lambda$1(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeBackPress$lambda$1(LinkActivity linkActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        LinkActivityViewModel linkActivityViewModel = linkActivity.viewModel;
        if (linkActivityViewModel != null) {
            linkActivityViewModel.handleBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissWithResult(LinkActivityResult result) {
        setResult(RESULT_COMPLETE, new Intent().putExtras(BundleKt.bundleOf(TuplesKt.to(LinkActivityContract.EXTRA_RESULT, result))));
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        LinkActivityViewModel linkActivityViewModel = this.viewModel;
        if (linkActivityViewModel != null) {
            linkActivityViewModel.unregisterActivity();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }

    public final void launchWebFlow(LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ActivityResultLauncher<LinkActivityContract.Args> activityResultLauncher = this.webLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(new LinkActivityContract.Args(configuration, LinkExpressMode.DISABLED, new LinkAccountUpdate.Value(null, null), LinkLaunchMode.Full.INSTANCE));
        }
    }

    /* compiled from: LinkActivity.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/LinkActivity$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "RESULT_COMPLETE", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "Lcom/stripe/android/link/NativeLinkArgs;", "createIntent$paymentsheet_release", "getArgs", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getArgs$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent$paymentsheet_release(Context context, NativeLinkArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intentPutExtra = new Intent(context, (Class<?>) LinkActivity.class).putExtra(LinkActivity.EXTRA_ARGS, args);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final NativeLinkArgs getArgs$paymentsheet_release(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return (NativeLinkArgs) savedStateHandle.get(LinkActivity.EXTRA_ARGS);
        }
    }
}
