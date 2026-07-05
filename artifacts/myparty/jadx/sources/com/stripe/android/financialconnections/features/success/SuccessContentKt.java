package com.stripe.android.financialconnections.features.success;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.core.location.LocationRequestCompat;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.text.MiddleEllipsisTextKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SuccessContent.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"\u001a?\u0010#\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0003¢\u0006\u0002\u0010(\u001a-\u0010)\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00102\b\b\u0002\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010,\u001a+\u0010-\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010.\u001a\u0017\u0010/\u001a\u00020\t2\b\b\u0001\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\u001a\u0017\u00103\u001a\u00020\t2\b\b\u0001\u00100\u001a\u000201H\u0001¢\u0006\u0002\u00102\u001a\u0015\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u000206H\u0002¢\u0006\u0002\u00107\u001a\u001b\u00108\u001a\u000209*\u00020:2\u0006\u0010;\u001a\u00020\u0016H\u0002¢\u0006\u0004\b<\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010\u001a\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010?\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u000209X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020+X\u008a\u0084\u0002"}, d2 = {"ENTER_TRANSITION_DURATION_MS", "", "SLIDE_IN_ANIMATION_FRACTION", "ICON_SIZE", "SUCCESS_BODY_OFFSET", "FADE_IN_ANIMATION", "Landroidx/compose/animation/EnterTransition;", "SUCCESS_SLIDE_IN_ANIMATION", "SuccessContent", "", "completeSessionAsync", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "payloadAsync", "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;", "onDoneClick", "Lkotlin/Function0;", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SuccessContentInternal", "overrideAnimationForPreview", "", "overrideSuccessBodyHeightForPreview", "Landroidx/compose/ui/unit/Dp;", "SuccessContentInternal-8GFhAUE", "(ZLandroidx/compose/ui/unit/Dp;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SpinnerToSuccessAnimation", "showSpinner", "initialSuccessBodyHeight", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/ui/TextResource;", "title", "modifier", "Landroidx/compose/ui/Modifier;", "SpinnerToSuccessAnimation-8GFhAUE", "(ZLandroidx/compose/ui/unit/Dp;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SuccessFooter", "loading", ViewProps.ENABLED, "merchantName", "", "(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SpinnerToCheckmark", "targetCheckmarkScale", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SuccessBody", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SuccessScreenPreview", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/success/SuccessState;", "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Landroidx/compose/runtime/Composer;I)V", "SuccessScreenAnimationCompletedPreview", "calculateBodyHeightForPreview", "config", "Landroid/content/res/Configuration;", "(Landroid/content/res/Configuration;)F", "calculateFinalSpinnerOffset", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "successBodyHeight", "calculateFinalSpinnerOffset-3ABfNKs", "(Landroidx/compose/ui/unit/Density;F)J", "financial-connections_release", "payload", "spinnerPosition", "checkmarkScale"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuccessContentKt {
    private static final int ENTER_TRANSITION_DURATION_MS = 1000;
    private static final EnterTransition FADE_IN_ANIMATION;
    private static final int ICON_SIZE = 56;
    private static final int SLIDE_IN_ANIMATION_FRACTION = 4;
    private static final int SUCCESS_BODY_OFFSET = 88;
    private static final EnterTransition SUCCESS_SLIDE_IN_ANIMATION;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinnerToCheckmark$lambda$38(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SpinnerToCheckmark(z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SpinnerToSuccessAnimation_8GFhAUE$lambda$14$lambda$13() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinnerToSuccessAnimation_8GFhAUE$lambda$29(boolean z, Dp dp, TextResource textResource, TextResource textResource2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7487SpinnerToSuccessAnimation8GFhAUE(z, dp, textResource, textResource2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessBody$lambda$46(TextResource textResource, TextResource textResource2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SuccessBody(textResource, textResource2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessContent$lambda$1(Async async, Async async2, Function0 function0, int i, Composer composer, int i2) {
        SuccessContent(async, async2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessContentInternal_8GFhAUE$lambda$12(boolean z, Dp dp, Async async, Async async2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m7488SuccessContentInternal8GFhAUE(z, dp, async, async2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessFooter$lambda$33(Modifier modifier, boolean z, boolean z2, String str, Function0 function0, int i, int i2, Composer composer, int i3) {
        SuccessFooter(modifier, z, z2, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessScreenAnimationCompletedPreview$lambda$48(SuccessState successState, int i, Composer composer, int i2) {
        SuccessScreenAnimationCompletedPreview(successState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessScreenPreview$lambda$47(SuccessState successState, int i, Composer composer, int i2) {
        SuccessScreenPreview(successState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null);
        FADE_IN_ANIMATION = enterTransitionFadeIn$default;
        SUCCESS_SLIDE_IN_ANIMATION = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(SuccessContentKt.SUCCESS_SLIDE_IN_ANIMATION$lambda$0(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SUCCESS_SLIDE_IN_ANIMATION$lambda$0(int i) {
        return i / 4;
    }

    public static final void SuccessContent(Async<FinancialConnectionsSession> completeSessionAsync, Async<SuccessState.Payload> payloadAsync, Function0<Unit> onDoneClick, Composer composer, final int i) {
        int i2;
        final Async<FinancialConnectionsSession> async;
        final Async<SuccessState.Payload> async2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(completeSessionAsync, "completeSessionAsync");
        Intrinsics.checkNotNullParameter(payloadAsync, "payloadAsync");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(702297639);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(completeSessionAsync) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(payloadAsync) : composerStartRestartGroup.changedInstance(payloadAsync) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDoneClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(702297639, i2, -1, "com.stripe.android.financialconnections.features.success.SuccessContent (SuccessContent.kt:95)");
            }
            async = completeSessionAsync;
            async2 = payloadAsync;
            function0 = onDoneClick;
            m7488SuccessContentInternal8GFhAUE(false, null, async2, async, function0, composerStartRestartGroup, ((i2 << 3) & 896) | ((i2 << 9) & 7168) | ((i2 << 6) & 57344), 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            async = completeSessionAsync;
            async2 = payloadAsync;
            function0 = onDoneClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuccessContentKt.SuccessContent$lambda$1(async, async2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /* renamed from: SuccessContentInternal-8GFhAUE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7488SuccessContentInternal8GFhAUE(boolean z, Dp dp, final Async<SuccessState.Payload> async, Async<FinancialConnectionsSession> async2, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Dp dp2;
        final boolean z3;
        boolean z4;
        Object objRememberedValue;
        MutableState mutableState;
        boolean z5;
        Object objRememberedValue2;
        SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$7;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$72;
        String str;
        TextResource textResource;
        MutableState mutableState2;
        boolean z6;
        int currentCompositeKeyHash2;
        Composer composerM3150constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final boolean z7;
        final Dp dp3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Async<FinancialConnectionsSession> async3 = async2;
        Composer composerStartRestartGroup = composer.startRestartGroup(227504024);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                dp2 = dp;
                i3 |= composerStartRestartGroup.changed(dp2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(async) : composerStartRestartGroup.changedInstance(async) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(async3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                z3 = i4 == 0 ? false : z2;
                Dp dp4 = i5 == 0 ? null : dp2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(227504024, i3, -1, "com.stripe.android.financialconnections.features.success.SuccessContentInternal (SuccessContent.kt:110)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(-915371179);
                z4 = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$3$lambda$2(z3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.startReplaceGroup(-915368839);
                z5 = (i6 & 896) != 256 || ((i6 & 512) != 0 && composerStartRestartGroup.changed(async));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(async.invoke(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final MutableState mutableState3 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                payloadSuccessContentInternal_8GFhAUE$lambda$7 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState3);
                composerStartRestartGroup.startReplaceGroup(-915366385);
                if (payloadSuccessContentInternal_8GFhAUE$lambda$7 != null) {
                    composerStartRestartGroup.startReplaceGroup(-915365957);
                    if (!payloadSuccessContentInternal_8GFhAUE$lambda$7.getSkipSuccessPane()) {
                        composerStartRestartGroup.startReplaceGroup(-432526961);
                        boolean zChanged = composerStartRestartGroup.changed(mutableState);
                        SuccessContentKt$SuccessContentInternal$1$1$1 successContentKt$SuccessContentInternal$1$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || successContentKt$SuccessContentInternal$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            successContentKt$SuccessContentInternal$1$1$1RememberedValue = new SuccessContentKt$SuccessContentInternal$1$1$1(mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(successContentKt$SuccessContentInternal$1$1$1RememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect((Object) true, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) successContentKt$SuccessContentInternal$1$1$1RememberedValue, composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(24));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                boolean z8 = z3;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                payloadSuccessContentInternal_8GFhAUE$lambda$72 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState3);
                if (payloadSuccessContentInternal_8GFhAUE$lambda$72 == null) {
                    TextResource content = payloadSuccessContentInternal_8GFhAUE$lambda$72.getContent();
                    str = "C73@3429L9:Box.kt#2w3rfo";
                    textResource = content;
                } else {
                    str = "C73@3429L9:Box.kt#2w3rfo";
                    textResource = null;
                }
                SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$73 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState3);
                TextResource title = payloadSuccessContentInternal_8GFhAUE$lambda$73 == null ? payloadSuccessContentInternal_8GFhAUE$lambda$73.getTitle() : null;
                if (!SuccessContentInternal_8GFhAUE$lambda$4(mutableState) || SuccessContentInternal_8GFhAUE$lambda$7(mutableState3) == null) {
                    mutableState2 = mutableState;
                    z6 = true;
                } else {
                    mutableState2 = mutableState;
                    z6 = false;
                }
                String str2 = str;
                Dp dp5 = dp4;
                final MutableState mutableState4 = mutableState2;
                m7487SpinnerToSuccessAnimation8GFhAUE(z6, dp5, textResource, title, null, composerStartRestartGroup, i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 16);
                Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, str2);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                async3 = async2;
                AnimatedVisibilityKt.AnimatedVisibility(!SuccessContentInternal_8GFhAUE$lambda$4(mutableState4), (Modifier) null, FADE_IN_ANIMATION, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-450504524, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessContentInternal$2$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-450504524, i7, -1, "com.stripe.android.financialconnections.features.success.SuccessContentInternal.<anonymous>.<anonymous>.<anonymous> (SuccessContent.kt:140)");
                        }
                        SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$74 = SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$7(mutableState3);
                        SuccessContentKt.SuccessFooter(null, async3 instanceof Async.Loading, !SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$4(mutableState4), payloadSuccessContentInternal_8GFhAUE$lambda$74 != null ? payloadSuccessContentInternal_8GFhAUE$lambda$74.getBusinessName() : null, function0, composer2, 0, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 26);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z8;
                dp3 = dp5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z7 = z2;
                dp3 = dp2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$12(z7, dp3, async, async3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        dp2 = dp;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-915371179);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$3$lambda$2(z3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i62 = i3;
                mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.startReplaceGroup(-915368839);
                if ((i62 & 896) != 256) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z5) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(async.invoke(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        final MutableState<SuccessState.Payload> mutableState32 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        payloadSuccessContentInternal_8GFhAUE$lambda$7 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState32);
                        composerStartRestartGroup.startReplaceGroup(-915366385);
                        if (payloadSuccessContentInternal_8GFhAUE$lambda$7 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(24));
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        boolean z82 = z3;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting()) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            payloadSuccessContentInternal_8GFhAUE$lambda$72 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState32);
                            if (payloadSuccessContentInternal_8GFhAUE$lambda$72 == null) {
                            }
                            SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$732 = SuccessContentInternal_8GFhAUE$lambda$7(mutableState32);
                            if (payloadSuccessContentInternal_8GFhAUE$lambda$732 == null) {
                            }
                            if (SuccessContentInternal_8GFhAUE$lambda$4(mutableState)) {
                                mutableState2 = mutableState;
                                z6 = true;
                                String str22 = str;
                                Dp dp52 = dp4;
                                final MutableState<Boolean> mutableState42 = mutableState2;
                                m7487SpinnerToSuccessAnimation8GFhAUE(z6, dp52, textResource, title, null, composerStartRestartGroup, i62 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 16);
                                Modifier modifierAlign2 = boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign2);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!composerM3150constructorimpl2.getInserting()) {
                                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, str22);
                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                    async3 = async2;
                                    AnimatedVisibilityKt.AnimatedVisibility(!SuccessContentInternal_8GFhAUE$lambda$4(mutableState42), (Modifier) null, FADE_IN_ANIMATION, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-450504524, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessContentInternal$2$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                            invoke(animatedVisibilityScope, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i7) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-450504524, i7, -1, "com.stripe.android.financialconnections.features.success.SuccessContentInternal.<anonymous>.<anonymous>.<anonymous> (SuccessContent.kt:140)");
                                            }
                                            SuccessState.Payload payloadSuccessContentInternal_8GFhAUE$lambda$74 = SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$7(mutableState32);
                                            SuccessContentKt.SuccessFooter(null, async3 instanceof Async.Loading, !SuccessContentKt.SuccessContentInternal_8GFhAUE$lambda$4(mutableState42), payloadSuccessContentInternal_8GFhAUE$lambda$74 != null ? payloadSuccessContentInternal_8GFhAUE$lambda$74.getBusinessName() : null, function0, composer2, 0, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 26);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z7 = z82;
                                    dp3 = dp52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SuccessContentInternal_8GFhAUE$lambda$3$lambda$2(boolean z) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SuccessContentInternal_8GFhAUE$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SuccessContentInternal_8GFhAUE$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuccessState.Payload SuccessContentInternal_8GFhAUE$lambda$7(MutableState<SuccessState.Payload> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b  */
    /* renamed from: SpinnerToSuccessAnimation-8GFhAUE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m7487SpinnerToSuccessAnimation8GFhAUE(final boolean z, final Dp dp, final TextResource textResource, final TextResource textResource2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Density density;
        HapticFeedback hapticFeedback;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        Ref.BooleanRef booleanRef;
        Object objRememberedValue2;
        boolean z2;
        Object objRememberedValue3;
        final MutableFloatState mutableFloatState;
        Object objRememberedValue4;
        MutableState mutableState;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue5;
        boolean zChangedInstance;
        Object objRememberedValue6;
        final State<IntOffset> stateM470animateIntOffsetAsStateHyPO7BM;
        boolean zChanged2;
        Object objRememberedValue7;
        final Modifier modifier3;
        float fM6117constructorimpl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1548446839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(textResource2) : composerStartRestartGroup.changedInstance(textResource2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1548446839, i3, -1, "com.stripe.android.financialconnections.features.success.SpinnerToSuccessAnimation (SuccessContent.kt:158)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume;
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localHapticFeedback);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                hapticFeedback = (HapticFeedback) objConsume2;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                booleanRef = new Ref.BooleanRef();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(2080531537);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$14$lambda$13());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                booleanRef.element = ((Boolean) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6)).booleanValue();
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(2080533512);
                int i5 = i3 & 14;
                z2 = i5 != 4;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$16$lambda$15(z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableFloatState = (MutableFloatState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.startReplaceGroup(2080536549);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    if (dp != null) {
                        fM6117constructorimpl = dp.m6131unboximpl();
                    } else {
                        fM6117constructorimpl = Dp.m6117constructorimpl(0);
                    }
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6115boximpl(fM6117constructorimpl), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2080538817);
                if (!z && !booleanRef.element) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new SuccessContentKt$SpinnerToSuccessAnimation$1(hapticFeedback, booleanRef, null), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float fSpinnerToSuccessAnimation_8GFhAUE$lambda$20 = SpinnerToSuccessAnimation_8GFhAUE$lambda$20(mutableState);
                composerStartRestartGroup.startReplaceGroup(1960697393);
                zChanged = composerStartRestartGroup.changed(fSpinnerToSuccessAnimation_8GFhAUE$lambda$20);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = IntOffset.m6236boximpl(m7490calculateFinalSpinnerOffset3ABfNKs(density, SpinnerToSuccessAnimation_8GFhAUE$lambda$20(mutableState)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                long packedValue = ((IntOffset) objRememberedValue5).getPackedValue();
                composerStartRestartGroup.endReplaceGroup();
                if (z) {
                    packedValue = IntOffset.INSTANCE.m6255getZeronOccac();
                }
                composerStartRestartGroup.startReplaceGroup(1960709557);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(mutableFloatState);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$24$lambda$23(coroutineScope, mutableFloatState, (IntOffset) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                stateM470animateIntOffsetAsStateHyPO7BM = AnimateAsStateKt.m470animateIntOffsetAsStateHyPO7BM(packedValue, null, "SpinnerPositionOffset", (Function1) objRememberedValue6, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(56));
                composerStartRestartGroup.startReplaceGroup(1960719834);
                zChanged2 = composerStartRestartGroup.changed(stateM470animateIntOffsetAsStateHyPO7BM);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$27$lambda$26(stateM470animateIntOffsetAsStateHyPO7BM, (Density) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                CrossfadeKt.Crossfade(Boolean.valueOf(z), OffsetKt.offset(modifierM1065size3ABfNKs, (Function1) objRememberedValue7), (FiniteAnimationSpec<Float>) null, "SpinnerToCheckmarkCrossfade", ComposableLambdaKt.rememberComposableLambda(-303768988, true, new SuccessContentKt$SpinnerToSuccessAnimation$2$2(mutableFloatState), composerStartRestartGroup, 54), composerStartRestartGroup, i5 | 27648, 4);
                AnimatedVisibilityKt.AnimatedVisibility(!z, (Modifier) null, SUCCESS_SLIDE_IN_ANIMATION, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-167121685, true, new SuccessContentKt$SpinnerToSuccessAnimation$2$3(textResource, textResource2, density, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 26);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$29(z, dp, textResource, textResource2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            density = (Density) objConsume3;
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume22 = composerStartRestartGroup.consume(localHapticFeedback2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            hapticFeedback = (HapticFeedback) objConsume22;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            booleanRef = new Ref.BooleanRef();
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(2080531537);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier42 = modifier2;
            booleanRef.element = ((Boolean) RememberSaveableKt.m3243rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6)).booleanValue();
            Object[] objArr22 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(2080533512);
            int i52 = i3 & 14;
            if (i52 != 4) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$16$lambda$15(z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                mutableFloatState = (MutableFloatState) RememberSaveableKt.m3243rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.startReplaceGroup(2080536549);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2080538817);
                if (!z) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new SuccessContentKt$SpinnerToSuccessAnimation$1(hapticFeedback, booleanRef, null), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier42, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    float fSpinnerToSuccessAnimation_8GFhAUE$lambda$202 = SpinnerToSuccessAnimation_8GFhAUE$lambda$20(mutableState);
                    composerStartRestartGroup.startReplaceGroup(1960697393);
                    zChanged = composerStartRestartGroup.changed(fSpinnerToSuccessAnimation_8GFhAUE$lambda$202);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue5 = IntOffset.m6236boximpl(m7490calculateFinalSpinnerOffset3ABfNKs(density, SpinnerToSuccessAnimation_8GFhAUE$lambda$20(mutableState)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        long packedValue2 = ((IntOffset) objRememberedValue5).getPackedValue();
                        composerStartRestartGroup.endReplaceGroup();
                        if (z) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1960709557);
                        zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(mutableFloatState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue6 = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$24$lambda$23(coroutineScope, mutableFloatState, (IntOffset) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            composerStartRestartGroup.endReplaceGroup();
                            stateM470animateIntOffsetAsStateHyPO7BM = AnimateAsStateKt.m470animateIntOffsetAsStateHyPO7BM(packedValue2, null, "SpinnerPositionOffset", (Function1) objRememberedValue6, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                            Modifier modifierM1065size3ABfNKs2 = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(56));
                            composerStartRestartGroup.startReplaceGroup(1960719834);
                            zChanged2 = composerStartRestartGroup.changed(stateM470animateIntOffsetAsStateHyPO7BM);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue7 = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$27$lambda$26(stateM470animateIntOffsetAsStateHyPO7BM, (Density) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                composerStartRestartGroup.endReplaceGroup();
                                CrossfadeKt.Crossfade(Boolean.valueOf(z), OffsetKt.offset(modifierM1065size3ABfNKs2, (Function1) objRememberedValue7), (FiniteAnimationSpec<Float>) null, "SpinnerToCheckmarkCrossfade", ComposableLambdaKt.rememberComposableLambda(-303768988, true, new SuccessContentKt$SpinnerToSuccessAnimation$2$2(mutableFloatState), composerStartRestartGroup, 54), composerStartRestartGroup, i52 | 27648, 4);
                                AnimatedVisibilityKt.AnimatedVisibility(!z, (Modifier) null, SUCCESS_SLIDE_IN_ANIMATION, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-167121685, true, new SuccessContentKt$SpinnerToSuccessAnimation$2$3(textResource, textResource2, density, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 26);
                                composerStartRestartGroup = composerStartRestartGroup;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SpinnerToSuccessAnimation_8GFhAUE$lambda$17(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableFloatState SpinnerToSuccessAnimation_8GFhAUE$lambda$16$lambda$15(boolean z) {
        return PrimitiveSnapshotStateKt.mutableFloatStateOf(z ? 0.0f : 1.0f);
    }

    private static final float SpinnerToSuccessAnimation_8GFhAUE$lambda$20(MutableState<Dp> mutableState) {
        return mutableState.getValue().m6131unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpinnerToSuccessAnimation_8GFhAUE$lambda$21(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m6115boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$24$lambda$23(CoroutineScope coroutineScope, MutableFloatState mutableFloatState, IntOffset intOffset) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SuccessContentKt$SpinnerToSuccessAnimation$2$spinnerPosition$2$1$1(mutableFloatState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$27$lambda$26(State state, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m6236boximpl(SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$25(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuccessFooter(Modifier modifier, final boolean z, final boolean z2, final String str, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        boolean z4;
        Function0<Unit> function02;
        final Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2107415353);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2107415353, i3, -1, "com.stripe.android.financialconnections.features.success.SuccessFooter (SuccessContent.kt:236)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
                composerStartRestartGroup.startReplaceGroup(-139616145);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SuccessContentKt.SuccessFooter$lambda$32$lambda$31$lambda$30((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), "done_button"), 0.0f, 1, null), null, null, z4, z3, ComposableLambdaKt.rememberComposableLambda(-1959956342, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessFooter$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i5) {
                        String strStringResource;
                        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                        if ((i5 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1959956342, i5, -1, "com.stripe.android.financialconnections.features.success.SuccessFooter.<anonymous>.<anonymous> (SuccessContent.kt:247)");
                            }
                            if (str == null) {
                                composer2.startReplaceGroup(1023202853);
                                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_success_pane_done, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1023205537);
                                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_success_pane_done_with_merchant, new Object[]{str}, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            MiddleEllipsisTextKt.m8903MiddleEllipsisTextoiE5lR0(strStringResource, null, 0L, 0L, null, null, null, 0L, null, null, 0L, false, null, null, (char) 0, 0, composer2, 0, 0, 65534);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 1572864 | ((i3 << 6) & 57344) | ((i3 << 12) & 458752), 12);
                SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
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
                companion = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SuccessContentKt.SuccessFooter$lambda$33(companion, z, z2, str, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function02 = function0;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion22);
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
                composerStartRestartGroup.startReplaceGroup(-139616145);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), "done_button"), 0.0f, 1, null), null, null, z4, z3, ComposableLambdaKt.rememberComposableLambda(-1959956342, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessFooter$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i5) {
                        String strStringResource;
                        Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                        if ((i5 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1959956342, i5, -1, "com.stripe.android.financialconnections.features.success.SuccessFooter.<anonymous>.<anonymous> (SuccessContent.kt:247)");
                            }
                            if (str == null) {
                                composer2.startReplaceGroup(1023202853);
                                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_success_pane_done, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1023205537);
                                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_success_pane_done_with_merchant, new Object[]{str}, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            MiddleEllipsisTextKt.m8903MiddleEllipsisTextoiE5lR0(strStringResource, null, 0L, 0L, null, null, null, 0L, null, null, 0L, false, null, null, (char) 0, 0, composer2, 0, 0, 65534);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 1572864 | ((i3 << 6) & 57344) | ((i3 << 12) & 458752), 12);
                SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessFooter$lambda$32$lambda$31$lambda$30(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpinnerToCheckmark(final boolean z, final Function0<Float> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1403936941);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1403936941, i3, -1, "com.stripe.android.financialconnections.features.success.SpinnerToCheckmark (SuccessContent.kt:264)");
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(function0.invoke().floatValue(), AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "CheckmarkScale", null, composerStartRestartGroup, 3120, 20);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1302460316);
                LoadingContentKt.m7359LoadingSpinneruFdPcIQ(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), 0.0f, null, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1302569343);
                Alignment center = Alignment.INSTANCE.getCenter();
                Modifier modifierM574backgroundbw27NRU = BackgroundKt.m574backgroundbw27NRU(SizeKt.m1065size3ABfNKs(modifier, Dp.m6117constructorimpl(56)), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7639getPrimary0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM574backgroundbw27NRU);
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
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1649960856);
                boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SuccessContentKt.SpinnerToCheckmark$lambda$37$lambda$36$lambda$35(stateAnimateFloatAsState, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.stripe_success_pane_title, composerStartRestartGroup, 0), GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7640getPrimaryAccent0d7_KjU(), composerStartRestartGroup, 0, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuccessContentKt.SpinnerToCheckmark$lambda$38(z, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SpinnerToCheckmark$lambda$37$lambda$36$lambda$35(State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(SpinnerToCheckmark$lambda$34(state));
        graphicsLayer.setScaleY(SpinnerToCheckmark$lambda$34(state));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuccessBody(final TextResource textResource, final TextResource textResource2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2010724275);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textResource2) : composerStartRestartGroup.changedInstance(textResource2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2010724275, i4, -1, "com.stripe.android.financialconnections.features.success.SuccessBody (SuccessContent.kt:303)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
                composerStartRestartGroup.startReplaceGroup(-90664377);
                if (textResource2 != null) {
                    composer2 = composerStartRestartGroup;
                } else {
                    TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingXLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                    composerStartRestartGroup.startReplaceGroup(-1039066280);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SuccessContentKt.SuccessBody$lambda$45$lambda$41$lambda$40$lambda$39((String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    TextKt.m7586AnnotatedTextrm0N8CA(textResource2, (Function1) objRememberedValue, textStyleM5615copyp1EtxEg$default, null, null, 0, 0, composer2, 48, 120);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-90653805);
                if (textResource != null) {
                    TextStyle textStyleM5615copyp1EtxEg$default2 = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                    Map mapMapOf = MapsKt.mapOf(TuplesKt.to(StringAnnotation.BOLD, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMediumEmphasized(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null).toSpanStyle()));
                    composer2.startReplaceGroup(-1039048392);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SuccessContentKt.SuccessBody$lambda$45$lambda$44$lambda$43$lambda$42((String) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    TextKt.m7586AnnotatedTextrm0N8CA(textResource, (Function1) objRememberedValue2, textStyleM5615copyp1EtxEg$default2, null, mapMapOf, 0, 0, composer3, (i4 & 14) | 48, LocationRequestCompat.QUALITY_LOW_POWER);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SuccessContentKt.SuccessBody$lambda$46(textResource, textResource2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(16));
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, centerHorizontally2, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
                composerStartRestartGroup.startReplaceGroup(-90664377);
                if (textResource2 != null) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-90653805);
                if (textResource != null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessBody$lambda$45$lambda$41$lambda$40$lambda$39(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessBody$lambda$45$lambda$44$lambda$43$lambda$42(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: SuccessContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessScreenPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C09701 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SuccessState $state;

        C09701(SuccessState successState) {
            this.$state = successState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1824955331, i, -1, "com.stripe.android.financialconnections.features.success.SuccessScreenPreview.<anonymous> (SuccessContent.kt:347)");
                }
                Async<FinancialConnectionsSession> completeSession = this.$state.getCompleteSession();
                Async<SuccessState.Payload> payload = this.$state.getPayload();
                composer.startReplaceGroup(-507701209);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessScreenPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SuccessContentKt.m7488SuccessContentInternal8GFhAUE(false, null, payload, completeSession, (Function0) objRememberedValue, composer, 24582, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void SuccessScreenPreview(@PreviewParameter(provider = SuccessPreviewParameterProvider.class) final SuccessState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-979923380);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-979923380, i2, -1, "com.stripe.android.financialconnections.features.success.SuccessScreenPreview (SuccessContent.kt:345)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(-1824955331, true, new C09701(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuccessContentKt.SuccessScreenPreview$lambda$47(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SuccessContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessScreenAnimationCompletedPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SuccessState $state;

        AnonymousClass1(SuccessState successState) {
            this.$state = successState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1187572822, i, -1, "com.stripe.android.financialconnections.features.success.SuccessScreenAnimationCompletedPreview.<anonymous> (SuccessContent.kt:365)");
                }
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(composer);
                float fCalculateBodyHeightForPreview = SuccessContentKt.calculateBodyHeightForPreview((Configuration) objConsume);
                Async<FinancialConnectionsSession> completeSession = this.$state.getCompleteSession();
                Async<SuccessState.Payload> payload = this.$state.getPayload();
                Dp dpM6115boximpl = Dp.m6115boximpl(fCalculateBodyHeightForPreview);
                composer.startReplaceGroup(1624199488);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SuccessScreenAnimationCompletedPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SuccessContentKt.m7488SuccessContentInternal8GFhAUE(true, dpM6115boximpl, payload, completeSession, (Function0) objRememberedValue, composer, 24582, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final void SuccessScreenAnimationCompletedPreview(@PreviewParameter(provider = SuccessPreviewParameterProvider.class) final SuccessState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-559132507);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559132507, i2, -1, "com.stripe.android.financialconnections.features.success.SuccessScreenAnimationCompletedPreview (SuccessContent.kt:363)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(1187572822, true, new AnonymousClass1(state), composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuccessContentKt.SuccessScreenAnimationCompletedPreview$lambda$48(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateBodyHeightForPreview(Configuration configuration) {
        if (configuration.orientation == 1) {
            return Dp.m6117constructorimpl(120);
        }
        return Dp.m6117constructorimpl(72);
    }

    /* renamed from: calculateFinalSpinnerOffset-3ABfNKs, reason: not valid java name */
    private static final long m7490calculateFinalSpinnerOffset3ABfNKs(Density density, float f) {
        long jM6138DpOffsetYgX7TsA = DpKt.m6138DpOffsetYgX7TsA(Dp.m6117constructorimpl(0), Dp.m6117constructorimpl(Dp.m6117constructorimpl(Dp.m6117constructorimpl(Dp.m6117constructorimpl(SUCCESS_BODY_OFFSET) + f) / 2) * (-1)));
        return IntOffsetKt.IntOffset(density.mo706roundToPx0680j_4(DpOffset.m6178getXD9Ej5fM(jM6138DpOffsetYgX7TsA)), density.mo706roundToPx0680j_4(DpOffset.m6180getYD9Ej5fM(jM6138DpOffsetYgX7TsA)));
    }

    private static final long SpinnerToSuccessAnimation_8GFhAUE$lambda$28$lambda$25(State<IntOffset> state) {
        return state.getValue().getPackedValue();
    }

    private static final float SpinnerToCheckmark$lambda$34(State<Float> state) {
        return state.getValue().floatValue();
    }
}
