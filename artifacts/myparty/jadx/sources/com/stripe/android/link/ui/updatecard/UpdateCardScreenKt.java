package com.stripe.android.link.ui.updatecard;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.ErrorTextKt;
import com.stripe.android.link.ui.LinkLoadingScreenKt;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.link.ui.ScrollableTopLevelColumnKt;
import com.stripe.android.link.ui.updatecard.UpdateCardScreenKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.CardDetailsUIKt;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: UpdateCardScreen.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"UpdateCardScreen", "", "viewModel", "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;", "(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Landroidx/compose/runtime/Composer;I)V", "UpdateCardScreenBody", "interactor", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;", "onUpdateClicked", "Lkotlin/Function0;", "(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UpdateCardScreenBodyPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateCardScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateCardScreen$lambda$2(UpdateCardScreenViewModel updateCardScreenViewModel, int i, Composer composer, int i2) {
        UpdateCardScreen(updateCardScreenViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateCardScreenBody$lambda$3(EditCardDetailsInteractor editCardDetailsInteractor, UpdateCardScreenState updateCardScreenState, Function0 function0, int i, Composer composer, int i2) {
        UpdateCardScreenBody(editCardDetailsInteractor, updateCardScreenState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateCardScreenBodyPreview$lambda$4(int i, Composer composer, int i2) {
        UpdateCardScreenBodyPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdateCardScreen(final UpdateCardScreenViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1351879179);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1351879179, i2, -1, "com.stripe.android.link.ui.updatecard.UpdateCardScreen (UpdateCardScreen.kt:38)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getState(), null, composerStartRestartGroup, 0, 1);
            EditCardDetailsInteractor interactor = viewModel.getInteractor();
            if (interactor == null) {
                composerStartRestartGroup.startReplaceGroup(893580052);
                LinkLoadingScreenKt.m7860LinkLoadingScreenhXAe_Q4(null, null, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(893581338);
                UpdateCardScreenState updateCardScreenStateUpdateCardScreen$lambda$0 = UpdateCardScreen$lambda$0(stateCollectAsState);
                composerStartRestartGroup.startReplaceGroup(893584923);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
                UpdateCardScreenKt$UpdateCardScreen$1$1 updateCardScreenKt$UpdateCardScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || updateCardScreenKt$UpdateCardScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    updateCardScreenKt$UpdateCardScreen$1$1RememberedValue = new UpdateCardScreenKt$UpdateCardScreen$1$1(viewModel);
                    composerStartRestartGroup.updateRememberedValue(updateCardScreenKt$UpdateCardScreen$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                UpdateCardScreenBody(interactor, updateCardScreenStateUpdateCardScreen$lambda$0, (Function0) ((KFunction) updateCardScreenKt$UpdateCardScreen$1$1RememberedValue), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateCardScreenKt.UpdateCardScreen$lambda$2(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UpdateCardScreenBody(final EditCardDetailsInteractor interactor, final UpdateCardScreenState state, final Function0<Unit> onUpdateClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onUpdateClicked, "onUpdateClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-140166277);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUpdateClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-140166277, i2, -1, "com.stripe.android.link.ui.updatecard.UpdateCardScreenBody (UpdateCardScreen.kt:55)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ScrollableTopLevelColumnKt.ScrollableTopLevelColumn(null, ComposableLambdaKt.rememberComposableLambda(634694897, true, new AnonymousClass1(state, (FocusManager) objConsume, onUpdateClicked, interactor), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateCardScreenKt.UpdateCardScreenBody$lambda$3(interactor, state, onUpdateClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UpdateCardScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt$UpdateCardScreenBody$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ EditCardDetailsInteractor $interactor;
        final /* synthetic */ Function0<Unit> $onUpdateClicked;
        final /* synthetic */ UpdateCardScreenState $state;

        AnonymousClass1(UpdateCardScreenState updateCardScreenState, FocusManager focusManager, Function0<Unit> function0, EditCardDetailsInteractor editCardDetailsInteractor) {
            this.$state = updateCardScreenState;
            this.$focusManager = focusManager;
            this.$onUpdateClicked = function0;
            this.$interactor = editCardDetailsInteractor;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ScrollableTopLevelColumn, Composer composer, int i) {
            int i2;
            Object obj;
            int i3;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
            if ((i & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634694897, i, -1, "com.stripe.android.link.ui.updatecard.UpdateCardScreenBody.<anonymous> (UpdateCardScreen.kt:59)");
                }
                final EditCardDetailsInteractor editCardDetailsInteractor = this.$interactor;
                ColorKt.StripeThemeForLink(null, ComposableLambdaKt.rememberComposableLambda(1708315324, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt.UpdateCardScreenBody.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1708315324, i4, -1, "com.stripe.android.link.ui.updatecard.UpdateCardScreenBody.<anonymous>.<anonymous> (UpdateCardScreen.kt:60)");
                            }
                            CardDetailsUIKt.CardDetailsEditUI(editCardDetailsInteractor, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), composer2, 48, 1);
                composer2.startReplaceGroup(-2147184559);
                if (this.$state.getShouldShowDefaultTag()) {
                    TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_update_card_default_card, composer2, 0), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), LinkTheme.INSTANCE.getColors(composer2, 6).m7811getTextSecondary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer2, 6).getBodyEmphasized(), composer, 48, 0, 65528);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                ResolvableString error = this.$state.getError();
                composer2.startReplaceGroup(-2147173235);
                if (error == null) {
                    i2 = 1;
                    i3 = 0;
                    obj = null;
                } else {
                    i2 = 1;
                    obj = null;
                    i3 = 0;
                    ErrorTextKt.ErrorText(ResolvableStringComposeUtilsKt.resolve(error, composer2, 0), PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), null, composer2, 48, 4);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), i2, obj);
                String strResolve = ResolvableStringComposeUtilsKt.resolve(this.$state.getPrimaryButtonLabel(), composer2, i3);
                PrimaryButtonState primaryButtonState = this.$state.getPrimaryButtonState();
                composer2.startReplaceGroup(-2147160003);
                boolean zChangedInstance = composer2.changedInstance(this.$focusManager) | composer2.changed(this.$onUpdateClicked);
                final FocusManager focusManager = this.$focusManager;
                final Function0<Unit> function0 = this.$onUpdateClicked;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt$UpdateCardScreenBody$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdateCardScreenKt.AnonymousClass1.invoke$lambda$2$lambda$1(focusManager, function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                PrimaryButtonKt.PrimaryButton(modifierM1022paddingVpY3zN4$default, strResolve, primaryButtonState, (Function0) objRememberedValue, null, null, composer, 6, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(FocusManager focusManager, Function0 function0) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void UpdateCardScreenBodyPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(123961622);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123961622, i, -1, "com.stripe.android.link.ui.updatecard.UpdateCardScreenBodyPreview (UpdateCardScreen.kt:97)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$UpdateCardScreenKt.INSTANCE.m7917getLambda2$paymentsheet_release(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateCardScreenKt.UpdateCardScreenBodyPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final UpdateCardScreenState UpdateCardScreen$lambda$0(State<UpdateCardScreenState> state) {
        return state.getValue();
    }
}
