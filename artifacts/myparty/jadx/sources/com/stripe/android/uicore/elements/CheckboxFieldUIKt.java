package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.CheckboxColors;
import androidx.compose.material.CheckboxDefaults;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.CheckboxFieldController;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: CheckboxFieldUI.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001az\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\n\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002"}, d2 = {"CheckboxFieldUI", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lcom/stripe/android/uicore/elements/CheckboxFieldController;", ViewProps.ENABLED, "", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/CheckboxFieldController;ZLandroidx/compose/runtime/Composer;II)V", "CheckboxFieldUIView", "isChecked", "debugTag", "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "error", "(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Error", "color", "Landroidx/compose/ui/graphics/Color;", "Error-RPmYEkk", "(Lkotlin/jvm/functions/Function2;JLandroidx/compose/runtime/Composer;I)V", "CheckboxFieldUIViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release", "Lcom/stripe/android/uicore/elements/FieldError;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckboxFieldUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxFieldUI$lambda$4(Modifier modifier, CheckboxFieldController checkboxFieldController, boolean z, int i, int i2, Composer composer, int i3) {
        CheckboxFieldUI(modifier, checkboxFieldController, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxFieldUIView$lambda$12(Modifier modifier, boolean z, boolean z2, String str, Function1 function1, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        CheckboxFieldUIView(modifier, z, z2, str, function1, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxFieldUIViewPreview$lambda$16(int i, Composer composer, int i2) {
        CheckboxFieldUIViewPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Error_RPmYEkk$lambda$14(Function2 function2, long j, int i, Composer composer, int i2) {
        m8780ErrorRPmYEkk(function2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxFieldUI(Modifier modifier, final CheckboxFieldController controller, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean zChangedInstance;
        CheckboxFieldUIKt$CheckboxFieldUI$1$1 checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue;
        final Modifier modifier2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer composerStartRestartGroup = composer.startRestartGroup(1442026933);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                boolean z4 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1442026933, i3, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI (CheckboxFieldUI.kt:41)");
                }
                State stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.isChecked(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(controller.getError(), null, composerStartRestartGroup, 0, 1);
                boolean zCheckboxFieldUI$lambda$0 = CheckboxFieldUI$lambda$0(stateCollectAsState);
                String debugTag = controller.getDebugTag();
                composerStartRestartGroup.startReplaceGroup(677755765);
                zChangedInstance = composerStartRestartGroup.changedInstance(controller);
                checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue = new CheckboxFieldUIKt$CheckboxFieldUI$1$1(controller);
                    composerStartRestartGroup.updateRememberedValue(checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue);
                Function2<Composer, Integer, String> function2 = new Function2<Composer, Integer, String>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt.CheckboxFieldUI.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ String invoke(Composer composer2, Integer num) {
                        return invoke(composer2, num.intValue());
                    }

                    public final String invoke(Composer composer2, int i6) {
                        String strStringResource;
                        composer2.startReplaceGroup(-67320510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-67320510, i6, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous> (CheckboxFieldUI.kt:52)");
                        }
                        CheckboxFieldController.LabelResource labelResource = controller.getLabelResource();
                        if (labelResource == null) {
                            strStringResource = null;
                        } else {
                            int labelId = labelResource.getLabelId();
                            Object[] formatArgs = labelResource.getFormatArgs();
                            strStringResource = StringResources_androidKt.stringResource(labelId, Arrays.copyOf(formatArgs, formatArgs.length), composer2, 0);
                        }
                        if (strStringResource == null) {
                            strStringResource = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return strStringResource;
                    }
                };
                final FieldError fieldErrorCheckboxFieldUI$lambda$1 = CheckboxFieldUI$lambda$1(stateCollectAsState2);
                Modifier modifier3 = modifier;
                CheckboxFieldUIView(modifier3, zCheckboxFieldUI$lambda$0, z4, debugTag, function1, function2, fieldErrorCheckboxFieldUI$lambda$1 != null ? new Function2<Composer, Integer, String>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$CheckboxFieldUI$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ String invoke(Composer composer2, Integer num) {
                        return invoke(composer2, num.intValue());
                    }

                    public final String invoke(Composer composer2, int i6) {
                        composer2.startReplaceGroup(-1785165957);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1785165957, i6, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)");
                        }
                        Object[] formatArgs = fieldErrorCheckboxFieldUI$lambda$1.getFormatArgs();
                        composer2.startReplaceGroup(-956550707);
                        String strStringResource = formatArgs == null ? null : StringResources_androidKt.stringResource(fieldErrorCheckboxFieldUI$lambda$1.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composer2, 0);
                        composer2.endReplaceGroup();
                        if (strStringResource == null) {
                            strStringResource = StringResources_androidKt.stringResource(fieldErrorCheckboxFieldUI$lambda$1.getErrorMessage(), composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return strStringResource;
                    }
                } : null, composerStartRestartGroup, i3 & 910, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z3 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CheckboxFieldUIKt.CheckboxFieldUI$lambda$4(modifier2, controller, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        z2 = z;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(controller.isChecked(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState22 = StateFlowsComposeKt.collectAsState(controller.getError(), null, composerStartRestartGroup, 0, 1);
            boolean zCheckboxFieldUI$lambda$02 = CheckboxFieldUI$lambda$0(stateCollectAsState3);
            String debugTag2 = controller.getDebugTag();
            composerStartRestartGroup.startReplaceGroup(677755765);
            zChangedInstance = composerStartRestartGroup.changedInstance(controller);
            checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue = new CheckboxFieldUIKt$CheckboxFieldUI$1$1(controller);
                composerStartRestartGroup.updateRememberedValue(checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Function1 function12 = (Function1) ((KFunction) checkboxFieldUIKt$CheckboxFieldUI$1$1RememberedValue);
                Function2<Composer, Integer, String> function22 = new Function2<Composer, Integer, String>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt.CheckboxFieldUI.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ String invoke(Composer composer2, Integer num) {
                        return invoke(composer2, num.intValue());
                    }

                    public final String invoke(Composer composer2, int i6) {
                        String strStringResource;
                        composer2.startReplaceGroup(-67320510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-67320510, i6, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous> (CheckboxFieldUI.kt:52)");
                        }
                        CheckboxFieldController.LabelResource labelResource = controller.getLabelResource();
                        if (labelResource == null) {
                            strStringResource = null;
                        } else {
                            int labelId = labelResource.getLabelId();
                            Object[] formatArgs = labelResource.getFormatArgs();
                            strStringResource = StringResources_androidKt.stringResource(labelId, Arrays.copyOf(formatArgs, formatArgs.length), composer2, 0);
                        }
                        if (strStringResource == null) {
                            strStringResource = "";
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return strStringResource;
                    }
                };
                final FieldError fieldErrorCheckboxFieldUI$lambda$12 = CheckboxFieldUI$lambda$1(stateCollectAsState22);
                Modifier modifier32 = modifier;
                CheckboxFieldUIView(modifier32, zCheckboxFieldUI$lambda$02, z4, debugTag2, function12, function22, fieldErrorCheckboxFieldUI$lambda$12 != null ? new Function2<Composer, Integer, String>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$CheckboxFieldUI$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ String invoke(Composer composer2, Integer num) {
                        return invoke(composer2, num.intValue());
                    }

                    public final String invoke(Composer composer2, int i6) {
                        composer2.startReplaceGroup(-1785165957);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1785165957, i6, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)");
                        }
                        Object[] formatArgs = fieldErrorCheckboxFieldUI$lambda$12.getFormatArgs();
                        composer2.startReplaceGroup(-956550707);
                        String strStringResource = formatArgs == null ? null : StringResources_androidKt.stringResource(fieldErrorCheckboxFieldUI$lambda$12.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composer2, 0);
                        composer2.endReplaceGroup();
                        if (strStringResource == null) {
                            strStringResource = StringResources_androidKt.stringResource(fieldErrorCheckboxFieldUI$lambda$12.getErrorMessage(), composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return strStringResource;
                    }
                } : null, composerStartRestartGroup, i3 & 910, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                z3 = z4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void CheckboxFieldUIView(Modifier modifier, final boolean z, final boolean z2, final String debugTag, final Function1<? super Boolean, Unit> onValueChange, final Function2<? super Composer, ? super Integer, String> label, final Function2<? super Composer, ? super Integer, String> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        CheckboxColors checkboxColorsM1811colorszjMxDiM;
        Composer composer2;
        long j;
        Composer composer3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-602050013);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(debugTag) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(label) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-602050013, i3, -1, "com.stripe.android.uicore.elements.CheckboxFieldUIView (CheckboxFieldUI.kt:75)");
            }
            if (z) {
                i4 = R.string.selected;
            } else {
                i4 = R.string.not_selected;
            }
            final String strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
            long jM1827getError0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).getMaterialColors().m1827getError0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-483755633);
            if (function2 == null) {
                composer2 = composerStartRestartGroup;
                checkboxColorsM1811colorszjMxDiM = null;
            } else {
                checkboxColorsM1811colorszjMxDiM = CheckboxDefaults.INSTANCE.m1811colorszjMxDiM(jM1827getError0d7_KjU, jM1827getError0d7_KjU, jM1827getError0d7_KjU, 0L, 0L, composerStartRestartGroup, CheckboxDefaults.$stable << 15, 24);
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-483755611);
            if (checkboxColorsM1811colorszjMxDiM == null) {
                j = jM1827getError0d7_KjU;
                checkboxColorsM1811colorszjMxDiM = CheckboxDefaults.INSTANCE.m1811colorszjMxDiM(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1837getSurface0d7_KjU(), 0L, 0L, composer2, CheckboxDefaults.$stable << 15, 24);
            } else {
                j = jM1827getError0d7_KjU;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-483740860);
            boolean zChanged = composer2.changed(strStringResource);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CheckboxFieldUIKt.CheckboxFieldUIView$lambda$8$lambda$7(strStringResource, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier4 = companion;
            int i6 = i3;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTagKt.testTag(ToggleableKt.m1278toggleableXHw0xAI(Modifier.INSTANCE, z, z2, Role.m5405boximpl(Role.INSTANCE.m5413getCheckboxo7Vup1c()), onValueChange), debugTag), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Composer composer4 = composer2;
            CheckboxKt.Checkbox(z, null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 11, null), z2, null, checkboxColorsM1811colorszjMxDiM, composer4, ((i6 >> 3) & 14) | 432 | ((i6 << 3) & 7168), 16);
            composer3 = composer4;
            TextKt.m2076Text4IGK_g(label.invoke(composer3, Integer.valueOf((i6 >> 15) & 14)), (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer3, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getSubtitle1(), composer3, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.startReplaceGroup(-244075763);
            if (function2 != null) {
                m8780ErrorRPmYEkk(function2, j, composer3, 0);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckboxFieldUIKt.CheckboxFieldUIView$lambda$12(modifier3, z, z2, debugTag, onValueChange, label, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxFieldUIView$lambda$8$lambda$7(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setStateDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* renamed from: Error-RPmYEkk, reason: not valid java name */
    private static final void m8780ErrorRPmYEkk(final Function2<? super Composer, ? super Integer, String> function2, long j, Composer composer, final int i) {
        int i2;
        final long j2 = j;
        Composer composerStartRestartGroup = composer.startRestartGroup(1442355652);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442355652, i3, -1, "com.stripe.android.uicore.elements.Error (CheckboxFieldUI.kt:140)");
            }
            float f = 8;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1926Iconww6aTOc(InfoKt.getInfo(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6117constructorimpl(f), 0.0f, 11, null), j, composerStartRestartGroup, ((i3 << 6) & 7168) | 432, 0);
            j2 = j;
            TextKt.m2076Text4IGK_g(function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14)), (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 << 3) & 896, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckboxFieldUIKt.Error_RPmYEkk$lambda$14(function2, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CheckboxFieldUIViewPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1121526158);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1121526158, i, -1, "com.stripe.android.uicore.elements.CheckboxFieldUIViewPreview (CheckboxFieldUI.kt:162)");
            }
            composerStartRestartGroup.startReplaceGroup(1140137365);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final boolean zBooleanValue = ((Boolean) mutableState.component1()).booleanValue();
            final Function1 function1Component2 = mutableState.component2();
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(400197788, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt.CheckboxFieldUIViewPreview.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(400197788, i2, -1, "com.stripe.android.uicore.elements.CheckboxFieldUIViewPreview.<anonymous> (CheckboxFieldUI.kt:168)");
                        }
                        CheckboxFieldUIKt.CheckboxFieldUIView(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), zBooleanValue, true, "", function1Component2, new Function2<Composer, Integer, String>() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt.CheckboxFieldUIViewPreview.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ String invoke(Composer composer3, Integer num) {
                                return invoke(composer3, num.intValue());
                            }

                            public final String invoke(Composer composer3, int i3) {
                                composer3.startReplaceGroup(691338793);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(691338793, i3, -1, "com.stripe.android.uicore.elements.CheckboxFieldUIViewPreview.<anonymous>.<anonymous> (CheckboxFieldUI.kt:175)");
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return "I understand that Stripe will be collecting Direct Debits on behalf of Test Business Name and confirm that I am the account holder and the only person required to authorise debits from this account.";
                            }
                        }, null, composer2, 1576326, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.CheckboxFieldUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckboxFieldUIKt.CheckboxFieldUIViewPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean CheckboxFieldUI$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final FieldError CheckboxFieldUI$lambda$1(State<FieldError> state) {
        return state.getValue();
    }
}
