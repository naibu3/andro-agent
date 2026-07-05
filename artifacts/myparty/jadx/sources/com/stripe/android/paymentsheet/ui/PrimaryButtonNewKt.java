package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.LoadingIndicatorKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt;
import com.stripe.android.paymentsheet.ui.PrimaryButtonProcessingState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrimaryButtonNew.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aW\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0001¢\u0006\u0002\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0003¢\u0006\u0002\u0010\u001d\u001aE\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00112&\u0010\u001f\u001a\"\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000e0 ¢\u0006\u0002\b$H\u0003¢\u0006\u0002\u0010%\u001a\r\u0010\u001c\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010&\u001a)\u0010'\u001a\u00020\u000e*\u00020(2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010+\u001a\u001f\u0010,\u001a\u00020\u000e*\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0003¢\u0006\u0002\u0010.\u001a\u001f\u0010/\u001a\u00020\u000e*\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0003¢\u0006\u0002\u0010.\u001a\u0017\u00100\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00101\u001a\r\u00102\u001a\u00020\u000eH\u0003¢\u0006\u0002\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {PrimaryButtonNewKt.PRIMARY_BUTTON_TEST_TAG, "", "FADE_ANIMATION_DURATION", "", "FADE_OUT_ANIMATION_DELAY", "fadeAnimation", "Landroidx/compose/animation/ContentTransform;", "PRE_SUCCESS_ANIMATION_DELAY", "", "POST_SUCCESS_ANIMATION_DELAY", "RIGHT_ALIGNED", "", "CENTER_ALIGNED", "PrimaryButton", "", "label", "locked", "", ViewProps.ENABLED, "modifier", "Landroidx/compose/ui/Modifier;", "processingState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;", "onProcessingCompleted", "Lkotlin/Function0;", ViewProps.ON_CLICK, "(Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Content", "areAnimationsDisabled", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ContentContainer", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isCompleted", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/runtime/Composer;I)Z", "StaticIncompleteProcessing", "Landroidx/compose/foundation/layout/BoxScope;", "text", BaseSheetViewModel.SAVE_PROCESSING, "(Landroidx/compose/foundation/layout/BoxScope;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;I)V", "AnimatedCompleteProcessing", "onAnimationCompleted", "(Landroidx/compose/foundation/layout/BoxScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StaticCompleteProcessing", "SuccessIcon", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "animationCompleted", "alignment", "animatedAlignment", "currentOnAnimationCompleted"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButtonNewKt {
    private static final float CENTER_ALIGNED = 0.0f;
    private static final int FADE_ANIMATION_DURATION = 100;
    private static final int FADE_OUT_ANIMATION_DELAY = 90;
    private static final long POST_SUCCESS_ANIMATION_DELAY = 1500;
    private static final long PRE_SUCCESS_ANIMATION_DELAY = 250;
    public static final String PRIMARY_BUTTON_TEST_TAG = "PRIMARY_BUTTON_TEST_TAG";
    private static final float RIGHT_ALIGNED = 1.0f;
    private static final ContentTransform fadeAnimation = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 90, null, 4, null), 0.0f, 2, null));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedCompleteProcessing$lambda$24(BoxScope boxScope, Function0 function0, int i, Composer composer, int i2) {
        AnimatedCompleteProcessing(boxScope, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(String str, PrimaryButtonProcessingState primaryButtonProcessingState, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        Content(str, primaryButtonProcessingState, z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentContainer$lambda$8(PrimaryButtonProcessingState primaryButtonProcessingState, boolean z, Function3 function3, int i, Composer composer, int i2) {
        ContentContainer(primaryButtonProcessingState, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$3(String str, boolean z, boolean z2, Modifier modifier, PrimaryButtonProcessingState primaryButtonProcessingState, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        PrimaryButton(str, z, z2, modifier, primaryButtonProcessingState, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$32(int i, Composer composer, int i2) {
        PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticCompleteProcessing$lambda$27(BoxScope boxScope, Function0 function0, int i, Composer composer, int i2) {
        StaticCompleteProcessing(boxScope, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticIncompleteProcessing$lambda$10(BoxScope boxScope, String str, boolean z, boolean z2, int i, Composer composer, int i2) {
        StaticIncompleteProcessing(boxScope, str, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessIcon$lambda$28(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SuccessIcon(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(final String label, final boolean z, final boolean z2, Modifier modifier, PrimaryButtonProcessingState primaryButtonProcessingState, Function0<Unit> function0, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z3;
        Modifier modifier2;
        int i4;
        final Function0<Unit> function02;
        Modifier.Companion companion;
        boolean z4;
        final boolean zAreAnimationsDisabled;
        boolean zChanged;
        Object objRememberedValue;
        long jM8503getBackground0d7_KjU;
        PrimaryButtonShape primaryButtonShape;
        Composer composer2;
        float disabled;
        final Modifier modifier3;
        final PrimaryButtonProcessingState primaryButtonProcessingState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        PrimaryButtonProcessingState.Idle idle = primaryButtonProcessingState;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1384026);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    if ((32768 & i) == 0 ? composerStartRestartGroup.changed(idle) : composerStartRestartGroup.changedInstance(idle)) {
                        i5 = 16384;
                    }
                    i3 |= i5;
                }
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) != 0) {
                            idle = new PrimaryButtonProcessingState.Idle(null);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(-1702720898);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        companion = modifier2;
                    }
                    final PrimaryButtonProcessingState primaryButtonProcessingState3 = idle;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1384026, i3, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton (PrimaryButtonNew.kt:93)");
                    }
                    z4 = primaryButtonProcessingState3 instanceof PrimaryButtonProcessingState.Completed;
                    zAreAnimationsDisabled = areAnimationsDisabled(composerStartRestartGroup, 0);
                    final PrimaryButtonColors colors = PrimaryButtonTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
                    PrimaryButtonShape shape = PrimaryButtonTheme.INSTANCE.getShape(composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(-1702711570);
                    zChanged = composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changed(colors);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        if (!z4) {
                            jM8503getBackground0d7_KjU = colors.m8507getSuccessBackground0d7_KjU();
                        } else {
                            jM8503getBackground0d7_KjU = colors.m8503getBackground0d7_KjU();
                        }
                        objRememberedValue = Color.m3647boximpl(jM8503getBackground0d7_KjU);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    long jM3667unboximpl = ((Color) objRememberedValue).m3667unboximpl();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1702704769);
                    if (zAreAnimationsDisabled) {
                        primaryButtonShape = shape;
                        composer2 = composerStartRestartGroup;
                        jM3667unboximpl = SingleValueAnimationKt.m453animateColorAsStateeuL9pac(jM3667unboximpl, AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null), "BackgroundAnimation", null, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 8).getValue().m3667unboximpl();
                    } else {
                        primaryButtonShape = shape;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    if (z2) {
                        composer2.startReplaceGroup(-1702692028);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, ContentAlpha.$stable);
                    } else {
                        composer2.startReplaceGroup(-1702692768);
                        disabled = ContentAlpha.INSTANCE.getHigh(composer2, ContentAlpha.$stable);
                    }
                    composer2.endReplaceGroup();
                    ProvidedValue<Float> providedValueProvides = localContentAlpha.provides(Float.valueOf(disabled));
                    final Modifier modifier4 = companion;
                    final long j = jM3667unboximpl;
                    final PrimaryButtonShape primaryButtonShape2 = primaryButtonShape;
                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(290964250, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt.PrimaryButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(290964250, i7, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous> (PrimaryButtonNew.kt:121)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function0<Unit> function03 = onClick;
                                PrimaryButtonShape primaryButtonShape3 = primaryButtonShape2;
                                boolean z5 = z2;
                                PrimaryButtonColors primaryButtonColors = colors;
                                long j2 = j;
                                final String str = label;
                                final PrimaryButtonProcessingState primaryButtonProcessingState4 = primaryButtonProcessingState3;
                                final boolean z6 = zAreAnimationsDisabled;
                                final boolean z7 = z3;
                                final Function0<Unit> function04 = function02;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ButtonKt.TextButton(function03, SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, PrimaryButtonNewKt.PRIMARY_BUTTON_TEST_TAG), 0.0f, 1, null), 0.0f, primaryButtonShape3.m8524getHeightD9Ej5fM(), 1, null), z5, null, null, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(primaryButtonShape3.m8523getCornerRadiusD9Ej5fM()), BorderStrokeKt.m602BorderStrokecXLIe8U(primaryButtonShape3.m8522getBorderStrokeWidthD9Ej5fM(), primaryButtonColors.m8504getBorder0d7_KjU()), ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(j2, 0L, j2, 0L, composer3, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.rememberComposableLambda(292028701, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButton$2$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                        invoke(rowScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope TextButton, Composer composer4, int i8) {
                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                        if ((i8 & 17) != 16 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(292028701, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButtonNew.kt:141)");
                                            }
                                            PrimaryButtonNewKt.Content(str, primaryButtonProcessingState4, z6, z7, function04, composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer3, 54), composer3, 805306368, 280);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    primaryButtonProcessingState2 = primaryButtonProcessingState3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    primaryButtonProcessingState2 = idle;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                final Function0<Unit> function03 = function02;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PrimaryButtonNewKt.PrimaryButton$lambda$3(label, z, z2, modifier3, primaryButtonProcessingState2, function03, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function02 = function0;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    final PrimaryButtonProcessingState primaryButtonProcessingState32 = idle;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = primaryButtonProcessingState32 instanceof PrimaryButtonProcessingState.Completed;
                    zAreAnimationsDisabled = areAnimationsDisabled(composerStartRestartGroup, 0);
                    final PrimaryButtonColors colors2 = PrimaryButtonTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
                    PrimaryButtonShape shape2 = PrimaryButtonTheme.INSTANCE.getShape(composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(-1702711570);
                    zChanged = composerStartRestartGroup.changed(z4) | composerStartRestartGroup.changed(colors2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        if (!z4) {
                        }
                        objRememberedValue = Color.m3647boximpl(jM8503getBackground0d7_KjU);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        long jM3667unboximpl2 = ((Color) objRememberedValue).m3667unboximpl();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1702704769);
                        if (zAreAnimationsDisabled) {
                        }
                        composer2.endReplaceGroup();
                        ProvidableCompositionLocal<Float> localContentAlpha2 = ContentAlphaKt.getLocalContentAlpha();
                        if (z2) {
                        }
                        composer2.endReplaceGroup();
                        ProvidedValue<Float> providedValueProvides2 = localContentAlpha2.provides(Float.valueOf(disabled));
                        final Modifier modifier42 = companion;
                        final long j2 = jM3667unboximpl2;
                        final PrimaryButtonShape primaryButtonShape22 = primaryButtonShape;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, ComposableLambdaKt.rememberComposableLambda(290964250, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt.PrimaryButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(290964250, i7, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous> (PrimaryButtonNew.kt:121)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    Function0<Unit> function032 = onClick;
                                    PrimaryButtonShape primaryButtonShape3 = primaryButtonShape22;
                                    boolean z5 = z2;
                                    PrimaryButtonColors primaryButtonColors = colors2;
                                    long j22 = j2;
                                    final String str = label;
                                    final PrimaryButtonProcessingState primaryButtonProcessingState4 = primaryButtonProcessingState32;
                                    final boolean z6 = zAreAnimationsDisabled;
                                    final boolean z7 = z3;
                                    final Function0<Unit> function04 = function02;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ButtonKt.TextButton(function032, SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, PrimaryButtonNewKt.PRIMARY_BUTTON_TEST_TAG), 0.0f, 1, null), 0.0f, primaryButtonShape3.m8524getHeightD9Ej5fM(), 1, null), z5, null, null, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(primaryButtonShape3.m8523getCornerRadiusD9Ej5fM()), BorderStrokeKt.m602BorderStrokecXLIe8U(primaryButtonShape3.m8522getBorderStrokeWidthD9Ej5fM(), primaryButtonColors.m8504getBorder0d7_KjU()), ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(j22, 0L, j22, 0L, composer3, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.rememberComposableLambda(292028701, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButton$2$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope TextButton, Composer composer4, int i8) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i8 & 17) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(292028701, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButtonNew.kt:141)");
                                                }
                                                PrimaryButtonNewKt.Content(str, primaryButtonProcessingState4, z6, z7, function04, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 805306368, 280);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        primaryButtonProcessingState2 = primaryButtonProcessingState32;
                    }
                }
            }
            final Function0 function032 = function02;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        final Function0 function0322 = function02;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final String str, final PrimaryButtonProcessingState primaryButtonProcessingState, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1287945468);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(primaryButtonProcessingState) : composerStartRestartGroup.changedInstance(primaryButtonProcessingState) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1287945468, i3, -1, "com.stripe.android.paymentsheet.ui.Content (PrimaryButtonNew.kt:160)");
            }
            int i4 = i3 >> 3;
            ContentContainer(primaryButtonProcessingState, z, ComposableLambdaKt.rememberComposableLambda(255009407, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt.Content.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer2, Integer num) {
                    invoke(bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z3, Composer composer2, int i5) {
                    int i6;
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changed(z3) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(255009407, i6, -1, "com.stripe.android.paymentsheet.ui.Content.<anonymous> (PrimaryButtonNew.kt:165)");
                        }
                        Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(8), 0.0f, 2, null);
                        boolean z4 = z;
                        Function0<Unit> function02 = function0;
                        PrimaryButtonProcessingState primaryButtonProcessingState2 = primaryButtonProcessingState;
                        String strStringResource = str;
                        boolean z5 = z2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z3) {
                            composer2.startReplaceGroup(-576054830);
                            if (z4) {
                                composer2.startReplaceGroup(-576014964);
                                PrimaryButtonNewKt.StaticCompleteProcessing(boxScopeInstance, function02, composer2, 6);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-575922646);
                                PrimaryButtonNewKt.AnimatedCompleteProcessing(boxScopeInstance, function02, composer2, 6);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-575803327);
                            composer2.startReplaceGroup(2059637786);
                            boolean z6 = primaryButtonProcessingState2 instanceof PrimaryButtonProcessingState.Idle;
                            if (!z6) {
                                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_primary_button_processing, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            PrimaryButtonNewKt.StaticIncompleteProcessing(boxScopeInstance, strStringResource, !z6, z5, composer2, 6);
                            composer2.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.Content$lambda$4(str, primaryButtonProcessingState, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ContentContainer(final PrimaryButtonProcessingState primaryButtonProcessingState, final boolean z, final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-30493128);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(primaryButtonProcessingState) : composerStartRestartGroup.changedInstance(primaryButtonProcessingState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-30493128, i2, -1, "com.stripe.android.paymentsheet.ui.ContentContainer (PrimaryButtonNew.kt:195)");
            }
            boolean z2 = primaryButtonProcessingState instanceof PrimaryButtonProcessingState.Completed;
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.Max);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-408399511);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                function3.invoke(Boolean.valueOf(z2), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-408299908);
                Boolean boolValueOf = Boolean.valueOf(z2);
                composerStartRestartGroup.startReplaceGroup(-1260092975);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PrimaryButtonNewKt.ContentContainer$lambda$7$lambda$6((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(boolValueOf, modifierHeight, (Function1) objRememberedValue, null, "ContentAnimation", null, ComposableLambdaKt.rememberComposableLambda(1130681137, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt.ContentContainer.3
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z3, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1130681137, i3, -1, "com.stripe.android.paymentsheet.ui.ContentContainer.<anonymous> (PrimaryButtonNew.kt:212)");
                        }
                        function3.invoke(Boolean.valueOf(z3), composer2, Integer.valueOf((i3 >> 3) & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597872, 40);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.ContentContainer$lambda$8(primaryButtonProcessingState, z, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ContentContainer$lambda$7$lambda$6(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return fadeAnimation;
    }

    private static final boolean areAnimationsDisabled(Composer composer, int i) {
        composer.startReplaceGroup(1257241529);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1257241529, i, -1, "com.stripe.android.paymentsheet.ui.areAnimationsDisabled (PrimaryButtonNew.kt:218)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceGroup(295279445);
        boolean zChanged = composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
            composer.updateRememberedValue(objRememberedValue);
        }
        float fFloatValue = ((Number) objRememberedValue).floatValue();
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localInspectionMode);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean z = ((Boolean) objConsume2).booleanValue() || fFloatValue <= 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StaticIncompleteProcessing(final BoxScope boxScope, final String str, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-190300587);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190300587, i2, -1, "com.stripe.android.paymentsheet.ui.StaticIncompleteProcessing (PrimaryButtonNew.kt:237)");
            }
            PrimaryButtonColors colors = PrimaryButtonTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
            PrimaryButtonTypography typography = PrimaryButtonTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            SystemFontFamily fontFamily = typography.getFontFamily();
            if (fontFamily == null) {
                fontFamily = FontFamily.INSTANCE.getDefault();
            }
            TextStyle textStyle = new TextStyle(0L, typography.m8528getFontSizeXSAIIZE(), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null);
            long jM8505getOnBackground0d7_KjU = colors.m8505getOnBackground0d7_KjU();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            long jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM8505getOnBackground0d7_KjU, ((Number) objConsume).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            TextKt.m2076Text4IGK_g(str2, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), jM3656copywmQWz5c$default, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, (i2 >> 3) & 14, 0, 65528);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(2041279202);
                LoadingIndicatorKt.m7225LoadingIndicatoriJQMabo(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), jM3656copywmQWz5c$default, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(2041438573);
                IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_lock, composerStartRestartGroup, 0), (String) null, boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), jM3656copywmQWz5c$default, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2041744171);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.StaticIncompleteProcessing$lambda$10(boxScope, str, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedCompleteProcessing(final BoxScope boxScope, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1926897466);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1926897466, i4, -1, "com.stripe.android.paymentsheet.ui.AnimatedCompleteProcessing (PrimaryButtonNew.kt:277)");
            }
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
            composerStartRestartGroup.startReplaceGroup(2016761205);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(2016763554);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(zBooleanValue ? 0.0f : 1.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            float fAnimatedCompleteProcessing$lambda$15 = AnimatedCompleteProcessing$lambda$15(mutableFloatState);
            composerStartRestartGroup.startReplaceGroup(2016774288);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PrimaryButtonNewKt.AnimatedCompleteProcessing$lambda$18$lambda$17(mutableState, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(fAnimatedCompleteProcessing$lambda$15, null, 0.0f, "CheckmarkAnimation", (Function1) objRememberedValue3, composerStartRestartGroup, 27648, 6);
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i4 >> 3) & 14);
            if (!zBooleanValue) {
                composerStartRestartGroup.startReplaceGroup(-1904246327);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2016783401);
                PrimaryButtonNewKt$AnimatedCompleteProcessing$1$1 primaryButtonNewKt$AnimatedCompleteProcessing$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (primaryButtonNewKt$AnimatedCompleteProcessing$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    primaryButtonNewKt$AnimatedCompleteProcessing$1$1RememberedValue = new PrimaryButtonNewKt$AnimatedCompleteProcessing$1$1(mutableFloatState, null);
                    composerStartRestartGroup.updateRememberedValue(primaryButtonNewKt$AnimatedCompleteProcessing$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) primaryButtonNewKt$AnimatedCompleteProcessing$1$1RememberedValue, composerStartRestartGroup, 6);
                Boolean boolValueOf = Boolean.valueOf(AnimatedCompleteProcessing$lambda$12(mutableState));
                Function0<Unit> function0AnimatedCompleteProcessing$lambda$20 = AnimatedCompleteProcessing$lambda$20(stateRememberUpdatedState);
                composerStartRestartGroup.startReplaceGroup(2016788968);
                boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                PrimaryButtonNewKt$AnimatedCompleteProcessing$2$1 primaryButtonNewKt$AnimatedCompleteProcessing$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || primaryButtonNewKt$AnimatedCompleteProcessing$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    primaryButtonNewKt$AnimatedCompleteProcessing$2$1RememberedValue = new PrimaryButtonNewKt$AnimatedCompleteProcessing$2$1(mutableState, stateRememberUpdatedState, null);
                    composerStartRestartGroup.updateRememberedValue(primaryButtonNewKt$AnimatedCompleteProcessing$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, function0AnimatedCompleteProcessing$lambda$20, (Function2) primaryButtonNewKt$AnimatedCompleteProcessing$2$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1903881302);
                Function0<Unit> function0AnimatedCompleteProcessing$lambda$202 = AnimatedCompleteProcessing$lambda$20(stateRememberUpdatedState);
                composerStartRestartGroup.startReplaceGroup(2016796124);
                boolean zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                PrimaryButtonNewKt$AnimatedCompleteProcessing$3$1 primaryButtonNewKt$AnimatedCompleteProcessing$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || primaryButtonNewKt$AnimatedCompleteProcessing$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    primaryButtonNewKt$AnimatedCompleteProcessing$3$1RememberedValue = new PrimaryButtonNewKt$AnimatedCompleteProcessing$3$1(stateRememberUpdatedState, null);
                    composerStartRestartGroup.updateRememberedValue(primaryButtonNewKt$AnimatedCompleteProcessing$3$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
                EffectsKt.LaunchedEffect(function0AnimatedCompleteProcessing$lambda$202, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) primaryButtonNewKt$AnimatedCompleteProcessing$3$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            SuccessIcon(boxScope.align(Modifier.INSTANCE, new BiasAlignment(AnimatedCompleteProcessing$lambda$19(stateAnimateFloatAsState), 0.0f)), composerStartRestartGroup, i3, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.AnimatedCompleteProcessing$lambda$24(boxScope, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnimatedCompleteProcessing$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AnimatedCompleteProcessing$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float AnimatedCompleteProcessing$lambda$15(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedCompleteProcessing$lambda$18$lambda$17(MutableState mutableState, float f) {
        if (f == 0.0f) {
            AnimatedCompleteProcessing$lambda$13(mutableState, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StaticCompleteProcessing(final BoxScope boxScope, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1387392527);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1387392527, i2, -1, "com.stripe.android.paymentsheet.ui.StaticCompleteProcessing (PrimaryButtonNew.kt:338)");
            }
            composerStartRestartGroup.startReplaceGroup(-449223304);
            boolean z = (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PrimaryButtonNewKt.StaticCompleteProcessing$lambda$26$lambda$25(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            SuccessIcon(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.StaticCompleteProcessing$lambda$27(boxScope, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticCompleteProcessing$lambda$26$lambda$25(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void SuccessIcon(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-651385313);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-651385313, i3, -1, "com.stripe.android.paymentsheet.ui.SuccessIcon (PrimaryButtonNew.kt:351)");
            }
            IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_checkmark, composerStartRestartGroup, 0), (String) null, modifier2, PrimaryButtonTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8506getOnSuccessBackground0d7_KjU(), composerStartRestartGroup, ((i3 << 6) & 896) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.SuccessIcon$lambda$28(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PrimaryButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(334922506);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334922506, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonPreview (PrimaryButtonNew.kt:362)");
            }
            composerStartRestartGroup.startReplaceGroup(2118332442);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new PrimaryButtonProcessingState.Idle(null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-76044640, true, new C11481((MutableState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonNewKt.PrimaryButtonPreview$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButtonProcessingState PrimaryButtonPreview$lambda$30(MutableState<PrimaryButtonProcessingState> mutableState) {
        return mutableState.getValue();
    }

    /* compiled from: PrimaryButtonNew.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C11481 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<PrimaryButtonProcessingState> $processingState$delegate;

        C11481(MutableState<PrimaryButtonProcessingState> mutableState) {
            this.$processingState$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            final MutableState<PrimaryButtonProcessingState> mutableState;
            final MutableState<PrimaryButtonProcessingState> mutableState2;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-76044640, i, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonPreview.<anonymous> (PrimaryButtonNew.kt:368)");
                }
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16));
                final MutableState<PrimaryButtonProcessingState> mutableState3 = this.$processingState$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                boolean z = PrimaryButtonNewKt.PrimaryButtonPreview$lambda$30(mutableState3) instanceof PrimaryButtonProcessingState.Idle;
                composer.startReplaceGroup(1287212114);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrimaryButtonNewKt.C11481.invoke$lambda$13$lambda$2$lambda$1$lambda$0(mutableState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RadioButtonKt.RadioButton(z, (Function0) objRememberedValue, null, false, null, null, composer, 48, 60);
                TextKt.m2076Text4IGK_g("Idle", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                boolean z2 = PrimaryButtonNewKt.PrimaryButtonPreview$lambda$30(mutableState3) instanceof PrimaryButtonProcessingState.Processing;
                composer.startReplaceGroup(1287224594);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState3;
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrimaryButtonNewKt.C11481.invoke$lambda$13$lambda$5$lambda$4$lambda$3(mutableState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState = mutableState3;
                }
                composer.endReplaceGroup();
                MutableState<PrimaryButtonProcessingState> mutableState4 = mutableState;
                RadioButtonKt.RadioButton(z2, (Function0) objRememberedValue2, null, false, null, null, composer, 48, 60);
                TextKt.m2076Text4IGK_g("Processing", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3150constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3150constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3157setimpl(composerM3150constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                boolean z3 = PrimaryButtonNewKt.PrimaryButtonPreview$lambda$30(mutableState4) instanceof PrimaryButtonProcessingState.Completed;
                composer.startReplaceGroup(1287237233);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = mutableState4;
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrimaryButtonNewKt.C11481.invoke$lambda$13$lambda$8$lambda$7$lambda$6(mutableState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                } else {
                    mutableState2 = mutableState4;
                }
                composer.endReplaceGroup();
                RadioButtonKt.RadioButton(z3, (Function0) objRememberedValue3, null, false, null, null, composer, 48, 60);
                TextKt.m2076Text4IGK_g(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                final Context context = (Context) objConsume;
                PrimaryButtonProcessingState primaryButtonProcessingStatePrimaryButtonPreview$lambda$30 = PrimaryButtonNewKt.PrimaryButtonPreview$lambda$30(mutableState2);
                composer.startReplaceGroup(-1669564656);
                boolean zChangedInstance = composer.changedInstance(context);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PrimaryButtonNewKt.C11481.invoke$lambda$13$lambda$10$lambda$9(context);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function0 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1669566164);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonNewKt$PrimaryButtonPreview$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                PrimaryButtonNewKt.PrimaryButton("Pay $50.99", false, true, null, primaryButtonProcessingStatePrimaryButtonPreview$lambda$30, function0, (Function0) objRememberedValue5, composer, 1573302, 8);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$2$lambda$1$lambda$0(MutableState mutableState) {
            PrimaryButtonNewKt.PrimaryButtonPreview$lambda$31(mutableState, new PrimaryButtonProcessingState.Idle(null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$5$lambda$4$lambda$3(MutableState mutableState) {
            PrimaryButtonNewKt.PrimaryButtonPreview$lambda$31(mutableState, PrimaryButtonProcessingState.Processing.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$8$lambda$7$lambda$6(MutableState mutableState) {
            PrimaryButtonNewKt.PrimaryButtonPreview$lambda$31(mutableState, PrimaryButtonProcessingState.Completed.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$10$lambda$9(Context context) {
            Toast.makeText(context, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, 1).show();
            return Unit.INSTANCE;
        }
    }

    private static final float AnimatedCompleteProcessing$lambda$19(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> AnimatedCompleteProcessing$lambda$20(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrimaryButtonPreview$lambda$31(MutableState<PrimaryButtonProcessingState> mutableState, PrimaryButtonProcessingState primaryButtonProcessingState) {
        mutableState.setValue(primaryButtonProcessingState);
    }
}
