package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.LoadingIndicatorKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PollingScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000b\u001a9\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001c²\u0006\n\u0010\u0007\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"PollingScreen", "", "viewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "uiState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "onCancel", "Lkotlin/Function0;", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ActivePolling", "remainingDuration", "Lkotlin/time/Duration;", "ctaText", "", "ActivePolling-ABIMYHs", "(JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "FailedPolling", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberActivePollingMessage", "", "rememberActivePollingMessage-rnQQ1Ag", "(JILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ActivePollingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "FailedPollingScreenPreview", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingScreenKt {

    /* compiled from: PollingScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollingState.values().length];
            try {
                iArr[PollingState.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollingState.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PollingState.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PollingState.Failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActivePollingScreenPreview$lambda$12(int i, Composer composer, int i2) {
        ActivePollingScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActivePolling_ABIMYHs$lambda$8(long j, Function0 function0, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m8391ActivePollingABIMYHs(j, function0, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedPolling$lambda$9(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FailedPolling(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedPollingScreenPreview$lambda$13(int i, Composer composer, int i2) {
        FailedPollingScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PollingScreen$lambda$5(PollingViewModel pollingViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PollingScreen(pollingViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PollingScreen$lambda$6(PollingUiState pollingUiState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PollingScreen(pollingUiState, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PollingScreen(final PollingViewModel viewModel, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1574771667);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1574771667, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:55)");
            }
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getUiState(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(50638743);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PollingScreenKt.PollingScreen$lambda$3$lambda$2(viewModel, lifecycleOwner, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            PollingUiState pollingUiStatePollingScreen$lambda$0 = PollingScreen$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(50647513);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            PollingScreenKt$PollingScreen$2$1 pollingScreenKt$PollingScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || pollingScreenKt$PollingScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                pollingScreenKt$PollingScreen$2$1RememberedValue = new PollingScreenKt$PollingScreen$2$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(pollingScreenKt$PollingScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            PollingScreen(pollingUiStatePollingScreen$lambda$0, (Function0) ((KFunction) pollingScreenKt$PollingScreen$2$1RememberedValue), SizeKt.fillMaxHeight(modifier, 0.67f), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PollingScreenKt.PollingScreen$lambda$5(viewModel, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult PollingScreen$lambda$3$lambda$2(PollingViewModel pollingViewModel, final LifecycleOwner lifecycleOwner, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final PollingLifecycleObserver pollingLifecycleObserver = new PollingLifecycleObserver(pollingViewModel);
        lifecycleOwner.getLifecycle().addObserver(pollingLifecycleObserver);
        return new DisposableEffectResult() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$PollingScreen$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(pollingLifecycleObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PollingScreen(final PollingUiState pollingUiState, Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1466224530);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pollingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466224530, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:79)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[pollingUiState.getPollingState().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                composerStartRestartGroup.startReplaceGroup(1570430552);
                m8391ActivePollingABIMYHs(pollingUiState.m8396getDurationRemainingUwyO8pc(), function0, modifier3, pollingUiState.getCtaText(), composerStartRestartGroup, i3 & PointerIconCompat.TYPE_TEXT, 0);
                function02 = function0;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 4) {
                    composerStartRestartGroup.startReplaceGroup(50655432);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1570689154);
                FailedPolling(function0, modifier3, composerStartRestartGroup, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                composerStartRestartGroup.endReplaceGroup();
                function02 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PollingScreenKt.PollingScreen$lambda$6(pollingUiState, function02, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: ActivePolling-ABIMYHs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8391ActivePollingABIMYHs(final long j, final Function0<Unit> function0, Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(882210043);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                }
                if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(882210043, i4, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePolling (PollingScreen.kt:106)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Modifier modifierPadding = PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.stripe_paymentsheet_outer_spacing_top, composerStartRestartGroup, 0), 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    LoadingIndicatorKt.m7225LoadingIndicatoriJQMabo(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8409getExtendedD9Ej5fM(), 7, null), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8724getAppBarIcon0d7_KjU(), composerStartRestartGroup, 6, 0);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_upi_polling_header, composerStartRestartGroup, 0);
                    TextStyle h4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getH4();
                    int iM6006getCentere0LSkKk = TextAlign.INSTANCE.m6006getCentere0LSkKk();
                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8410getNormalD9Ej5fM(), 7, null);
                    TextAlign textAlignM5999boximpl = TextAlign.m5999boximpl(iM6006getCentere0LSkKk);
                    composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    TextKt.m2076Text4IGK_g(strStringResource, modifierM1024paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM5999boximpl, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, h4, composer2, 48, 0, 65020);
                    String strM8392rememberActivePollingMessagernQQ1Ag = m8392rememberActivePollingMessagernQQ1Ag(j, i, composer2, (i4 & 14) | ((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                    int iM6006getCentere0LSkKk2 = TextAlign.INSTANCE.m6006getCentere0LSkKk();
                    long jM5633getFontSizeXSAIIZE = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1().m5633getFontSizeXSAIIZE();
                    TextUnitKt.m6323checkArithmeticR2X_6o(jM5633getFontSizeXSAIIZE);
                    TextKt.m2076Text4IGK_g(strM8392rememberActivePollingMessagernQQ1Ag, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8410getNormalD9Ej5fM(), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(iM6006getCentere0LSkKk2), TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM5633getFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM5633getFontSizeXSAIIZE) * 1.3f), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 129532);
                    ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8376getLambda1$paymentsheet_release(), composer2, ((i4 >> 3) & 14) | 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PollingScreenKt.ActivePolling_ABIMYHs$lambda$8(j, function0, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            modifier2 = modifier;
            if ((i3 & 8) != 0) {
            }
            if ((i4 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Modifier modifierPadding2 = PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.stripe_paymentsheet_outer_spacing_top, composerStartRestartGroup, 0), 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    LoadingIndicatorKt.m7225LoadingIndicatoriJQMabo(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8409getExtendedD9Ej5fM(), 7, null), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8724getAppBarIcon0d7_KjU(), composerStartRestartGroup, 6, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_upi_polling_header, composerStartRestartGroup, 0);
                    TextStyle h42 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getH4();
                    int iM6006getCentere0LSkKk3 = TextAlign.INSTANCE.m6006getCentere0LSkKk();
                    Modifier modifierM1024paddingqDBjuR0$default2 = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8410getNormalD9Ej5fM(), 7, null);
                    TextAlign textAlignM5999boximpl2 = TextAlign.m5999boximpl(iM6006getCentere0LSkKk3);
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    TextKt.m2076Text4IGK_g(strStringResource2, modifierM1024paddingqDBjuR0$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM5999boximpl2, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, h42, composer2, 48, 0, 65020);
                    String strM8392rememberActivePollingMessagernQQ1Ag2 = m8392rememberActivePollingMessagernQQ1Ag(j, i, composer2, (i4 & 14) | ((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                    int iM6006getCentere0LSkKk22 = TextAlign.INSTANCE.m6006getCentere0LSkKk();
                    long jM5633getFontSizeXSAIIZE2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1().m5633getFontSizeXSAIIZE();
                    TextUnitKt.m6323checkArithmeticR2X_6o(jM5633getFontSizeXSAIIZE2);
                    TextKt.m2076Text4IGK_g(strM8392rememberActivePollingMessagernQQ1Ag2, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Spacing.INSTANCE.m8410getNormalD9Ej5fM(), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(iM6006getCentere0LSkKk22), TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM5633getFontSizeXSAIIZE2), TextUnit.m6310getValueimpl(jM5633getFontSizeXSAIIZE2) * 1.3f), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 129532);
                    ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8376getLambda1$paymentsheet_release(), composer2, ((i4 >> 3) & 14) | 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 8) != 0) {
        }
        if ((i4 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FailedPolling(final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-826407987);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-826407987, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling (PollingScreen.kt:144)");
                }
                composer2 = composerStartRestartGroup;
                modifier3 = companion;
                ScaffoldKt.m1986Scaffold27mzLpw(modifier3, null, ComposableLambdaKt.rememberComposableLambda(108078738, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt.FailedPolling.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(108078738, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous> (PollingScreen.kt:147)");
                            }
                            float fM6117constructorimpl = Dp.m6117constructorimpl(0);
                            long jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer3, MaterialTheme.$stable).m1837getSurface0d7_KjU();
                            Function2<Composer, Integer, Unit> function2M8377getLambda2$paymentsheet_release = ComposableSingletons$PollingScreenKt.INSTANCE.m8377getLambda2$paymentsheet_release();
                            final Function0<Unit> function02 = function0;
                            AppBarKt.m1765TopAppBarxWeB9s(function2M8377getLambda2$paymentsheet_release, null, ComposableLambdaKt.rememberComposableLambda(-1411609844, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt.FailedPolling.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1411609844, i6, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous>.<anonymous> (PollingScreen.kt:152)");
                                        }
                                        IconButtonKt.IconButton(function02, null, false, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8378getLambda3$paymentsheet_release(), composer4, 24576, 14);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), null, jM1837getSurface0d7_KjU, 0L, fM6117constructorimpl, composer3, 1573254, 42);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableSingletons$PollingScreenKt.INSTANCE.m8379getLambda4$paymentsheet_release(), composer2, ((i3 >> 3) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 12582912, 131066);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PollingScreenKt.FailedPolling$lambda$9(function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            modifier3 = companion;
            ScaffoldKt.m1986Scaffold27mzLpw(modifier3, null, ComposableLambdaKt.rememberComposableLambda(108078738, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt.FailedPolling.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(108078738, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous> (PollingScreen.kt:147)");
                        }
                        float fM6117constructorimpl = Dp.m6117constructorimpl(0);
                        long jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer3, MaterialTheme.$stable).m1837getSurface0d7_KjU();
                        Function2<Composer, Integer, Unit> function2M8377getLambda2$paymentsheet_release = ComposableSingletons$PollingScreenKt.INSTANCE.m8377getLambda2$paymentsheet_release();
                        final Function0<Unit> function02 = function0;
                        AppBarKt.m1765TopAppBarxWeB9s(function2M8377getLambda2$paymentsheet_release, null, ComposableLambdaKt.rememberComposableLambda(-1411609844, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt.FailedPolling.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1411609844, i6, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous>.<anonymous> (PollingScreen.kt:152)");
                                    }
                                    IconButtonKt.IconButton(function02, null, false, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8378getLambda3$paymentsheet_release(), composer4, 24576, 14);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), null, jM1837getSurface0d7_KjU, 0L, fM6117constructorimpl, composer3, 1573254, 42);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableSingletons$PollingScreenKt.INSTANCE.m8379getLambda4$paymentsheet_release(), composer2, ((i3 >> 3) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 12582912, 131066);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: rememberActivePollingMessage-rnQQ1Ag, reason: not valid java name */
    private static final String m8392rememberActivePollingMessagernQQ1Ag(long j, int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1139194821);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1139194821, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.rememberActivePollingMessage (PollingScreen.kt:206)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceGroup(211879540);
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(j)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            long jM10494getInWholeMinutesimpl = Duration.m10494getInWholeMinutesimpl(j);
            int iM10499getSecondsComponentimpl = Duration.m10499getSecondsComponentimpl(j);
            Duration.m10498getNanosecondsComponentimpl(j);
            objRememberedValue = context.getString(i, jM10494getInWholeMinutesimpl + ":" + StringsKt.padStart(String.valueOf(iM10499getSecondsComponentimpl), 2, '0'));
            composer.updateRememberedValue(objRememberedValue);
        }
        String str = (String) objRememberedValue;
        composer.endReplaceGroup();
        Intrinsics.checkNotNull(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    private static final void ActivePollingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-816023731);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-816023731, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ActivePollingScreenPreview (PollingScreen.kt:234)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8381getLambda6$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PollingScreenKt.ActivePollingScreenPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void FailedPollingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(705722564);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705722564, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPollingScreenPreview (PollingScreen.kt:251)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$PollingScreenKt.INSTANCE.m8383getLambda8$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PollingScreenKt.FailedPollingScreenPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PollingUiState PollingScreen$lambda$0(State<PollingUiState> state) {
        return state.getValue();
    }
}
