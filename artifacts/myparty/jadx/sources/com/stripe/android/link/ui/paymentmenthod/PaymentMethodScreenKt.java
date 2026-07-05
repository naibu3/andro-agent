package com.stripe.android.link.ui.paymentmenthod;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.ui.ErrorTextKt;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.link.ui.ScrollableTopLevelColumnKt;
import com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.ui.PaymentMethodFormKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: PaymentMethodScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a9\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"PaymentMethodScreen", "", "viewModel", "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;", "(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Landroidx/compose/runtime/Composer;I)V", "PaymentMethodBody", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;", "onFormFieldValuesChanged", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "onPayClicked", "Lkotlin/Function0;", "(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PAYMENT_METHOD_ERROR_TAG", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodScreenKt {
    public static final String PAYMENT_METHOD_ERROR_TAG = "payment_method_error_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodBody$lambda$6(PaymentMethodState paymentMethodState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        PaymentMethodBody(paymentMethodState, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodScreen$lambda$3(PaymentMethodViewModel paymentMethodViewModel, int i, Composer composer, int i2) {
        PaymentMethodScreen(paymentMethodViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PaymentMethodScreen(final PaymentMethodViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1131186091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1131186091, i2, -1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreen (PaymentMethodScreen.kt:26)");
            }
            PaymentMethodState paymentMethodStatePaymentMethodScreen$lambda$0 = PaymentMethodScreen$lambda$0(StateFlowsComposeKt.collectAsState(viewModel.getState(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(-456660781);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            PaymentMethodScreenKt$PaymentMethodScreen$1$1 paymentMethodScreenKt$PaymentMethodScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || paymentMethodScreenKt$PaymentMethodScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                paymentMethodScreenKt$PaymentMethodScreen$1$1RememberedValue = new PaymentMethodScreenKt$PaymentMethodScreen$1$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(paymentMethodScreenKt$PaymentMethodScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) paymentMethodScreenKt$PaymentMethodScreen$1$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(-456659090);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            PaymentMethodScreenKt$PaymentMethodScreen$2$1 paymentMethodScreenKt$PaymentMethodScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || paymentMethodScreenKt$PaymentMethodScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                paymentMethodScreenKt$PaymentMethodScreen$2$1RememberedValue = new PaymentMethodScreenKt$PaymentMethodScreen$2$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(paymentMethodScreenKt$PaymentMethodScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            PaymentMethodBody(paymentMethodStatePaymentMethodScreen$lambda$0, function1, (Function0) ((KFunction) paymentMethodScreenKt$PaymentMethodScreen$2$1RememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodScreenKt.PaymentMethodScreen$lambda$3(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentMethodBody(final PaymentMethodState state, final Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, final Function0<Unit> onPayClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(onPayClicked, "onPayClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1455578917);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFormFieldValuesChanged) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayClicked) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1455578917, i2, -1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody (PaymentMethodScreen.kt:41)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            FocusManager focusManager = (FocusManager) objConsume;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1544594131);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentMethodScreenKt.PaymentMethodBody$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Object objM3243rememberSaveable = RememberSaveableKt.m3243rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable, "rememberSaveable(...)");
            ScrollableTopLevelColumnKt.ScrollableTopLevelColumn(null, ComposableLambdaKt.rememberComposableLambda(-223809425, true, new AnonymousClass1(state, focusManager, onPayClicked, (String) objM3243rememberSaveable, onFormFieldValuesChanged), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodScreenKt.PaymentMethodBody$lambda$6(state, onFormFieldValuesChanged, onPayClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PaymentMethodBody$lambda$5$lambda$4() {
        return UUID.randomUUID().toString();
    }

    /* compiled from: PaymentMethodScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt$PaymentMethodBody$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ Function1<FormFieldValues, Unit> $onFormFieldValuesChanged;
        final /* synthetic */ Function0<Unit> $onPayClicked;
        final /* synthetic */ PaymentMethodState $state;
        final /* synthetic */ String $uuid;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PaymentMethodState paymentMethodState, FocusManager focusManager, Function0<Unit> function0, String str, Function1<? super FormFieldValues, Unit> function1) {
            this.$state = paymentMethodState;
            this.$focusManager = focusManager;
            this.$onPayClicked = function0;
            this.$uuid = str;
            this.$onFormFieldValuesChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope ScrollableTopLevelColumn, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(ScrollableTopLevelColumn) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-223809425, i2, -1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous> (PaymentMethodScreen.kt:46)");
                }
                final String str = this.$uuid;
                final PaymentMethodState paymentMethodState = this.$state;
                final Function1<FormFieldValues, Unit> function1 = this.$onFormFieldValuesChanged;
                ColorKt.StripeThemeForLink(null, ComposableLambdaKt.rememberComposableLambda(-840217084, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt.PaymentMethodBody.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-840217084, i3, -1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodScreen.kt:47)");
                            }
                            PaymentMethodFormKt.PaymentMethodForm(str, paymentMethodState.getFormArguments(), true, function1, paymentMethodState.getFormElements(), null, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 48, 1);
                boolean z = this.$state.getErrorMessage() != null;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                final PaymentMethodState paymentMethodState2 = this.$state;
                AnimatedVisibilityKt.AnimatedVisibility(ScrollableTopLevelColumn, z, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(866035015, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt.PaymentMethodBody.1.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                        Composer composer3;
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(866035015, i3, -1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodScreen.kt:60)");
                        }
                        String strResolve = null;
                        Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, PaymentMethodScreenKt.PAYMENT_METHOD_ERROR_TAG), 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null);
                        ResolvableString errorMessage = paymentMethodState2.getErrorMessage();
                        if (errorMessage == null) {
                            composer3 = composer2;
                        } else {
                            composer3 = composer2;
                            strResolve = ResolvableStringComposeUtilsKt.resolve(errorMessage, composer3, 0);
                        }
                        if (strResolve == null) {
                            strResolve = "";
                        }
                        ErrorTextKt.ErrorText(strResolve, modifierM1024paddingqDBjuR0$default, null, composer3, 48, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, (i2 & 14) | 1573248, 28);
                Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 1, null);
                String strResolve = ResolvableStringComposeUtilsKt.resolve(this.$state.getPrimaryButtonLabel(), composer, 0);
                PrimaryButtonState primaryButtonState = this.$state.getPrimaryButtonState();
                composer.startReplaceGroup(703930788);
                boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changed(this.$onPayClicked);
                final FocusManager focusManager = this.$focusManager;
                final Function0<Unit> function0 = this.$onPayClicked;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodScreenKt$PaymentMethodBody$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0(focusManager, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PrimaryButtonKt.PrimaryButton(modifierM1022paddingVpY3zN4$default, strResolve, primaryButtonState, (Function0) objRememberedValue, null, Integer.valueOf(R.drawable.stripe_ic_lock), composer, 6, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, Function0 function0) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final PaymentMethodState PaymentMethodScreen$lambda$0(State<PaymentMethodState> state) {
        return state.getValue();
    }
}
