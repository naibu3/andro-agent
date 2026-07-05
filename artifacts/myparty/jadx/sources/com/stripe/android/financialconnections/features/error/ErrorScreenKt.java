package com.stripe.android.financialconnections.features.error;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.exception.PartnerAuthError;
import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.error.ErrorScreenKt;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.ComposeExtensionsKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: ErrorScreen.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001aK\u0010\u0003\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\r\u001aM\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00012\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"ErrorScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;", "onSelectBankClick", "Lkotlin/Function0;", "onManualEntryClick", "onCloseFromErrorClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "error", "allowManualEntry", "", "onSelectAnotherBank", "onEnterDetailsManually", "(Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ErrorScreenPreview", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/error/ErrorState;", "(Lcom/stripe/android/financialconnections/features/error/ErrorState;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$10(Throwable th, boolean z, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        ErrorContent(th, z, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$7(Async async, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        ErrorContent(async, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreen$lambda$6(int i, Composer composer, int i2) {
        ErrorScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorScreenPreview$lambda$11(ErrorState errorState, int i, Composer composer, int i2) {
        ErrorScreenPreview(errorState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ErrorScreen(Composer composer, final int i) {
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804679152);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1804679152, i, -1, "com.stripe.android.financialconnections.features.error.ErrorScreen (ErrorScreen.kt:26)");
            }
            ErrorViewModel.Companion companion = ErrorViewModel.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1481344674);
            ViewModelProvider.Factory factory = companion.factory(ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel().getActivityRetainedComponent());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ErrorViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceGroup();
            ErrorViewModel errorViewModel = (ErrorViewModel) ((FinancialConnectionsViewModel) viewModel);
            Object objParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(854715727);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue, composerStartRestartGroup, 54, 0);
            Async<ErrorState.Payload> payload = ErrorScreen$lambda$2(StateFlowsComposeKt.collectAsState(errorViewModel.getStateFlow(), null, composerStartRestartGroup, 0, 1)).getPayload();
            composerStartRestartGroup.startReplaceGroup(854720169);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(errorViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (KFunction) new ErrorScreenKt$ErrorScreen$2$1(errorViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(854722058);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(errorViewModel);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function0) new ErrorScreenKt$ErrorScreen$3$1(errorViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(854724114);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(objParentViewModel);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = (KFunction) new ErrorScreenKt$ErrorScreen$4$1(objParentViewModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ErrorContent(payload, function0, (Function0) kFunction, (Function1) ((KFunction) objRememberedValue4), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorScreenKt.ErrorScreen$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorContent(final Async<ErrorState.Payload> async, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function1<? super Throwable, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(700717446);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(async) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(700717446, i2, -1, "com.stripe.android.financialconnections.features.error.ErrorContent (ErrorScreen.kt:45)");
            }
            if (Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) || (async instanceof Async.Loading)) {
                function03 = function0;
                function04 = function02;
                function12 = function1;
                composerStartRestartGroup.startReplaceGroup(192492243);
                LoadingContentKt.FullScreenGenericLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (async instanceof Async.Success) {
                composerStartRestartGroup.startReplaceGroup(192496272);
                Async.Success success = (Async.Success) async;
                function03 = function0;
                function04 = function02;
                function12 = function1;
                ErrorContent(((ErrorState.Payload) success.invoke()).getError(), ((ErrorState.Payload) success.invoke()).getAllowManualEntry(), function03, function04, function12, composerStartRestartGroup, (i2 << 3) & 65408);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function03 = function0;
                function04 = function02;
                function12 = function1;
                if (!(async instanceof Async.Fail)) {
                    composerStartRestartGroup.startReplaceGroup(192491077);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(192509113);
                int i3 = i2 << 3;
                ErrorContent(((Async.Fail) async).getError(), false, function03, function04, function12, composerStartRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function05 = function03;
            final Function0<Unit> function06 = function04;
            final Function1<? super Throwable, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorScreenKt.ErrorContent$lambda$7(async, function05, function06, function13, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorContent(final Throwable th, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super Throwable, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1831008218);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831008218, i2, -1, "com.stripe.android.financialconnections.features.error.ErrorContent (ErrorScreen.kt:77)");
            }
            if (th instanceof InstitutionPlannedDowntimeError) {
                composerStartRestartGroup.startReplaceGroup(192526684);
                ErrorContentKt.InstitutionPlannedDowntimeErrorContent((InstitutionPlannedDowntimeError) th, function0, function02, composerStartRestartGroup, (i2 >> 3) & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            } else if (th instanceof InstitutionUnplannedDowntimeError) {
                composerStartRestartGroup.startReplaceGroup(192534526);
                ErrorContentKt.InstitutionUnplannedDowntimeErrorContent((InstitutionUnplannedDowntimeError) th, function0, function02, composerStartRestartGroup, (i2 >> 3) & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            } else if (th instanceof PartnerAuthError) {
                composerStartRestartGroup.startReplaceGroup(192541785);
                ErrorContentKt.InstitutionUnknownErrorContent(function0, composerStartRestartGroup, (i2 >> 6) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(192545590);
                composerStartRestartGroup.startReplaceGroup(192548225);
                boolean zChangedInstance = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | composerStartRestartGroup.changedInstance(th);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ErrorScreenKt.ErrorContent$lambda$9$lambda$8(z, function02, function1, th);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorContentKt.UnclassifiedErrorContent(z, (Function0) objRememberedValue, composerStartRestartGroup, (i2 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorScreenKt.ErrorContent$lambda$10(th, z, function0, function02, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorContent$lambda$9$lambda$8(boolean z, Function0 function0, Function1 function1, Throwable th) {
        if (z) {
            function0.invoke();
        } else {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ErrorScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.error.ErrorScreenKt$ErrorScreenPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ErrorState $state;

        AnonymousClass1(ErrorState errorState) {
            this.$state = errorState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1893985100, i, -1, "com.stripe.android.financialconnections.features.error.ErrorScreenPreview.<anonymous> (ErrorScreen.kt:113)");
                }
                Async<ErrorState.Payload> payload = this.$state.getPayload();
                composer.startReplaceGroup(855614525);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$ErrorScreenPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(855615709);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$ErrorScreenPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(855616989);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$ErrorScreenPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ErrorScreenKt.AnonymousClass1.invoke$lambda$5$lambda$4((Throwable) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                ErrorScreenKt.ErrorContent(payload, function0, function02, (Function1) objRememberedValue3, composer, 3504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final void ErrorScreenPreview(@PreviewParameter(provider = ErrorPreviewParameterProvider.class) final ErrorState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1893833635);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893833635, i2, -1, "com.stripe.android.financialconnections.features.error.ErrorScreenPreview (ErrorScreen.kt:111)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(1893985100, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ErrorScreenKt.ErrorScreenPreview$lambda$11(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ErrorState ErrorScreen$lambda$2(State<ErrorState> state) {
        return state.getValue();
    }
}
