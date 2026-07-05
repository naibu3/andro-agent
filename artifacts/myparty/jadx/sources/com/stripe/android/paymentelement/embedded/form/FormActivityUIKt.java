package com.stripe.android.paymentelement.embedded.form;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.common.ui.BottomSheetScaffoldKt;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.ui.ErrorMessageKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt;
import com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt;
import com.stripe.android.paymentsheet.utils.ComposeUtilsKt;
import com.stripe.android.paymentsheet.utils.EventReporterProviderUtilKt;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import com.stripe.android.paymentsheet.verticalmode.VerticalModeFormInteractor;
import com.stripe.android.paymentsheet.verticalmode.VerticalModeFormUIKt;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormActivityUI.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000e\u001a3\u0010\u0010\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0015\"\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"FormActivityUI", "", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "onProcessingCompleted", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;", "onDismissed", "(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "USBankAccountMandate", "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Landroidx/compose/runtime/Composer;I)V", "FormActivityError", "FormActivityPrimaryButton", "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FormActivityTopBar", NamedConstantsKt.IS_LIVE_MODE, "", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", FormActivityUIKt.EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON, "", "paymentsheet_release", "interactorState", "Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor$State;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormActivityUIKt {
    public static final String EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON = "EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormActivityError$lambda$5(FormActivityStateHelper.State state, int i, Composer composer, int i2) {
        FormActivityError(state, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormActivityPrimaryButton$lambda$9(FormActivityStateHelper.State state, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        FormActivityPrimaryButton(state, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormActivityTopBar$lambda$11(boolean z, Function0 function0, int i, Composer composer, int i2) {
        FormActivityTopBar(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormActivityUI$lambda$1(DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor, EventReporter eventReporter, Function0 function0, Function0 function02, FormActivityStateHelper.State state, Function0 function03, int i, Composer composer, int i2) {
        FormActivityUI(defaultVerticalModeFormInteractor, eventReporter, function0, function02, state, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit USBankAccountMandate$lambda$3(FormActivityStateHelper.State state, int i, Composer composer, int i2) {
        USBankAccountMandate(state, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FormActivityUI(final DefaultVerticalModeFormInteractor interactor, final EventReporter eventReporter, final Function0<Unit> onClick, final Function0<Unit> onProcessingCompleted, final FormActivityStateHelper.State state, final Function0<Unit> onDismissed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onProcessingCompleted, "onProcessingCompleted");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1745641878);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(eventReporter) : composerStartRestartGroup.changedInstance(eventReporter) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onProcessingCompleted) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissed) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1745641878, i3, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityUI (FormActivityUI.kt:46)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            ComposeUtilsKt.DismissKeyboardOnProcessing(FormActivityUI$lambda$0(StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1)).isProcessing(), composerStartRestartGroup, 0);
            EventReporterProviderUtilKt.EventReporterProvider(eventReporter, ComposableLambdaKt.rememberComposableLambda(1972493450, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt.FormActivityUI.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1972493450, i4, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityUI.<anonymous> (FormActivityUI.kt:53)");
                        }
                        final DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor = interactor;
                        final Function0<Unit> function0 = onDismissed;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-430365911, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt.FormActivityUI.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-430365911, i5, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityUI.<anonymous>.<anonymous> (FormActivityUI.kt:55)");
                                    }
                                    FormActivityUIKt.FormActivityTopBar(defaultVerticalModeFormInteractor.getIsLiveMode(), function0, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54);
                        final DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor2 = interactor;
                        final FormActivityStateHelper.State state2 = state;
                        final Function0<Unit> function02 = onProcessingCompleted;
                        final Function0<Unit> function03 = onClick;
                        BottomSheetScaffoldKt.BottomSheetScaffold(composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1449160712, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt.FormActivityUI.1.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1449160712, i5, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityUI.<anonymous>.<anonymous> (FormActivityUI.kt:61)");
                                    }
                                    VerticalModeFormUIKt.VerticalModeFormUI(defaultVerticalModeFormInteractor2, false, null, composer3, 48, 4);
                                    FormActivityUIKt.USBankAccountMandate(state2, composer3, 0);
                                    FormActivityUIKt.FormActivityError(state2, composer3, 0);
                                    SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(40)), composer3, 6);
                                    FormActivityUIKt.FormActivityPrimaryButton(state2, function02, function03, composer3, 0, 0);
                                    ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), null, scrollStateRememberScrollState, composer2, 54, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormActivityUIKt.FormActivityUI$lambda$1(interactor, eventReporter, onClick, onProcessingCompleted, state, onDismissed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void USBankAccountMandate(final FormActivityStateHelper.State state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1582674586);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1582674586, i2, -1, "com.stripe.android.paymentelement.embedded.form.USBankAccountMandate (FormActivityUI.kt:83)");
            }
            ResolvableString mandateText = state.getMandateText();
            if (mandateText != null) {
                MandateTextUIKt.m8662MandateJ7GKdg(ResolvableStringComposeUtilsKt.resolve(mandateText, composerStartRestartGroup, 0), PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), 0, 0, null, composerStartRestartGroup, 0, 28);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormActivityUIKt.USBankAccountMandate$lambda$3(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FormActivityError(final FormActivityStateHelper.State state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-358244546);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358244546, i2, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityError (FormActivityUI.kt:97)");
            }
            ResolvableString error = state.getError();
            if (error != null) {
                ErrorMessageKt.ErrorMessage(ResolvableStringComposeUtilsKt.resolve(error, composerStartRestartGroup, 0), PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), composerStartRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormActivityUIKt.FormActivityError$lambda$5(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FormActivityPrimaryButton(final FormActivityStateHelper.State state, Function0<Unit> function0, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1520623326);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(-1122881448);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            }
            Function0<Unit> function03 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520623326, i3, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityPrimaryButton (FormActivityUI.kt:113)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = i3 << 12;
            PrimaryButtonNewKt.PrimaryButton(ResolvableStringComposeUtilsKt.resolve(state.getPrimaryButtonLabel(), composerStartRestartGroup, 0), state.getShouldDisplayLockIcon(), state.isEnabled(), TestTagKt.testTag(Modifier.INSTANCE, EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON), state.getProcessingState(), function03, onClick, composerStartRestartGroup, (458752 & i5) | 3072 | (i5 & 3670016), 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function03;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormActivityUIKt.FormActivityPrimaryButton$lambda$9(state, function02, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FormActivityTopBar(final boolean z, final Function0<Unit> onDismissed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(731344249);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissed) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731344249, i2, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityTopBar (FormActivityUI.kt:133)");
            }
            final long jM8724getAppBarIcon0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8724getAppBarIcon0d7_KjU();
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getStart()), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(293537523);
            if (!z) {
                PaymentSheetTopBarKt.TestModeBadge(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            IconButtonKt.IconButton(onDismissed, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), true, null, ComposableLambdaKt.rememberComposableLambda(754772631, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$FormActivityTopBar$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(754772631, i3, -1, "com.stripe.android.paymentelement.embedded.form.FormActivityTopBar.<anonymous>.<anonymous> (FormActivityUI.kt:149)");
                        }
                        IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_paymentsheet_close, composer2, 0), StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_close, composer2, 0), (Modifier) null, jM8724getAppBarIcon0d7_KjU, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 24960, 8);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivityUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormActivityUIKt.FormActivityTopBar$lambda$11(z, onDismissed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final VerticalModeFormInteractor.State FormActivityUI$lambda$0(State<VerticalModeFormInteractor.State> state) {
        return state.getValue();
    }
}
