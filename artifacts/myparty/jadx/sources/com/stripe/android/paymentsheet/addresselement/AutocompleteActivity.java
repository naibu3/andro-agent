package com.stripe.android.paymentsheet.addresselement;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AutocompleteActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "starterArgs", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "setResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AutocompleteActivity.starterArgs_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public AutocompleteActivity() {
        final AutocompleteActivity autocompleteActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AutocompleteViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return autocompleteActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutocompleteActivity.viewModel_delegate$lambda$1(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? autocompleteActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final AutocompleteContract.Args getStarterArgs() {
        return (AutocompleteContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutocompleteContract.Args starterArgs_delegate$lambda$0(AutocompleteActivity autocompleteActivity) {
        AutocompleteContract.Args.Companion companion = AutocompleteContract.Args.INSTANCE;
        Intent intent = autocompleteActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent$paymentsheet_release(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AutocompleteViewModel getViewModel() {
        return (AutocompleteViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$1(AutocompleteActivity autocompleteActivity) {
        AutocompleteContract.Args starterArgs = autocompleteActivity.getStarterArgs();
        if (starterArgs != null) {
            return new AutocompleteViewModel.Factory(starterArgs);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AutocompleteContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            finish();
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        AutocompleteAppearanceContext appearanceContext$paymentsheet_release = starterArgs.getAppearanceContext$paymentsheet_release();
        appearanceContext$paymentsheet_release.applyAppearance();
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-854911592, true, new AnonymousClass1(starterArgs, appearanceContext$paymentsheet_release)), 1, null);
    }

    /* compiled from: AutocompleteActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$onCreate$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AutocompleteAppearanceContext $appearanceContext;
        final /* synthetic */ AutocompleteContract.Args $starterArgs;

        AnonymousClass1(AutocompleteContract.Args args, AutocompleteAppearanceContext autocompleteAppearanceContext) {
            this.$starterArgs = args;
            this.$appearanceContext = autocompleteAppearanceContext;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-854911592, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous> (AutocompleteActivity.kt:45)");
                }
                final StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer, 0, 3);
                Unit unit = Unit.INSTANCE;
                composer.startReplaceGroup(-1747446829);
                boolean zChangedInstance = composer.changedInstance(AutocompleteActivity.this) | composer.changedInstance(this.$starterArgs) | composer.changedInstance(stripeBottomSheetStateRememberStripeBottomSheetState);
                AutocompleteActivity autocompleteActivity = AutocompleteActivity.this;
                AutocompleteContract.Args args = this.$starterArgs;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (Function2) new AutocompleteActivity$onCreate$1$1$1(autocompleteActivity, args, stripeBottomSheetStateRememberStripeBottomSheetState, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
                composer.startReplaceGroup(-1747421946);
                boolean zChangedInstance2 = composer.changedInstance(AutocompleteActivity.this);
                final AutocompleteActivity autocompleteActivity2 = AutocompleteActivity.this;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$onCreate$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AutocompleteActivity.AnonymousClass1.invoke$lambda$2$lambda$1(autocompleteActivity2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue2, composer, 0, 1);
                AutocompleteAppearanceContext autocompleteAppearanceContext = this.$appearanceContext;
                final AutocompleteActivity autocompleteActivity3 = AutocompleteActivity.this;
                final AutocompleteAppearanceContext autocompleteAppearanceContext2 = this.$appearanceContext;
                autocompleteAppearanceContext.Theme(ComposableLambdaKt.rememberComposableLambda(-1690993354, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.1.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1690993354, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous>.<anonymous> (AutocompleteActivity.kt:72)");
                            }
                            StripeBottomSheetState stripeBottomSheetState = stripeBottomSheetStateRememberStripeBottomSheetState;
                            AutocompleteViewModel viewModel = autocompleteActivity3.getViewModel();
                            composer2.startReplaceGroup(-1980176668);
                            boolean zChangedInstance3 = composer2.changedInstance(viewModel);
                            AutocompleteActivity$onCreate$1$3$1$1 autocompleteActivity$onCreate$1$3$1$1RememberedValue = composer2.rememberedValue();
                            if (zChangedInstance3 || autocompleteActivity$onCreate$1$3$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                autocompleteActivity$onCreate$1$3$1$1RememberedValue = new AutocompleteActivity$onCreate$1$3$1$1(viewModel);
                                composer2.updateRememberedValue(autocompleteActivity$onCreate$1$3$1$1RememberedValue);
                            }
                            composer2.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) autocompleteActivity$onCreate$1$3$1$1RememberedValue);
                            final AutocompleteActivity autocompleteActivity4 = autocompleteActivity3;
                            final AutocompleteAppearanceContext autocompleteAppearanceContext3 = autocompleteAppearanceContext2;
                            ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetState, null, 0.0f, function0, ComposableLambdaKt.rememberComposableLambda(-1329885986, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.1.3.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1329885986, i3, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AutocompleteActivity.kt:76)");
                                        }
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final AutocompleteActivity autocompleteActivity5 = autocompleteActivity4;
                                        final AutocompleteAppearanceContext autocompleteAppearanceContext4 = autocompleteAppearanceContext3;
                                        SurfaceKt.m2015SurfaceFjzlyU(modifierFillMaxSize$default, null, 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1374566682, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.1.3.2.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i4) {
                                                if ((i4 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1374566682, i4, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AutocompleteActivity.kt:77)");
                                                    }
                                                    AutocompleteScreenKt.AutocompleteScreenUI(autocompleteActivity5.getViewModel(), autocompleteAppearanceContext4, PlacesClientProxy.Companion.getPlacesPoweredByGoogleDrawable$default(PlacesClientProxy.INSTANCE, DarkThemeKt.isSystemInDarkTheme(composer4, 0), null, 2, null), true, composer4, 3072);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composer3, 54), composer3, 1572870, 62);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, StripeBottomSheetState.$stable | 24576, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(AutocompleteActivity autocompleteActivity) {
            autocompleteActivity.getViewModel().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        String id$paymentsheet_release;
        super.onStop();
        if (isFinishing() || isChangingConfigurations()) {
            return;
        }
        AutocompleteContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null || (id$paymentsheet_release = starterArgs.getId$paymentsheet_release()) == null) {
            id$paymentsheet_release = "";
        }
        setResult(new AutocompleteContract.Result.Address(id$paymentsheet_release, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResult(AutocompleteContract.Result result) {
        setResult(-1, new Intent().putExtras(result.toBundle()));
    }
}
