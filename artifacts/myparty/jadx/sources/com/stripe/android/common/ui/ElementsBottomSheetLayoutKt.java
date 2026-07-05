package com.stripe.android.common.ui;

import android.os.Build;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfo;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfoKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ElementsBottomSheetLayout.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"ElementsBottomSheetLayout", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "modifier", "Landroidx/compose/ui/Modifier;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "onDismissed", "Lkotlin/Function0;", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/runtime/Composable;", "ElementsBottomSheetLayout-TN_CM5M", "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "skipHideAnimation", "", "getSkipHideAnimation", "()Z", "isRunningUnitTest", "isRunningUiTest", "paymentsheet_release", "statusBarColorAlpha", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ElementsBottomSheetLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ElementsBottomSheetLayout_TN_CM5M$lambda$4(StripeBottomSheetState stripeBottomSheetState, Modifier modifier, float f, Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetState, modifier, f, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSkipHideAnimation() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* renamed from: ElementsBottomSheetLayout-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7218ElementsBottomSheetLayoutTN_CM5M(final StripeBottomSheetState state, Modifier modifier, float f, final Function0<Unit> onDismissed, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float fM6117constructorimpl;
        int i4;
        final Modifier modifier3;
        SystemUiController systemUiControllerRememberSystemUiController;
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM;
        boolean z;
        ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1 elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue;
        State<Float> stateAnimateFloatAsState;
        boolean zChanged;
        ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1 elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue;
        boolean zChanged2;
        ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1 elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(562638930);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i2 & 4) == 0) {
                    fM6117constructorimpl = f;
                    int i6 = composerStartRestartGroup.changed(fM6117constructorimpl) ? 256 : 128;
                    i3 |= i6;
                } else {
                    fM6117constructorimpl = f;
                }
                i3 |= i6;
            } else {
                fM6117constructorimpl = f;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismissed) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        Modifier modifier4 = companion;
                        i4 = i3 & (-897);
                        modifier3 = modifier4;
                        fM6117constructorimpl = Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).getBottomSheetCornerRadius());
                    } else {
                        Modifier modifier5 = companion;
                        i4 = i3;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(562638930, i4, -1, "com.stripe.android.common.ui.ElementsBottomSheetLayout (ElementsBottomSheetLayout.kt:28)");
                }
                systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                boolean z2 = true;
                stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM = StripeBottomSheetLayoutInfoKt.m8857rememberStripeBottomSheetLayoutInfoHde_KZM(fM6117constructorimpl, 0L, Color.m3656copywmQWz5c$default(Color.INSTANCE.m3683getBlack0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, ((i4 >> 6) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                float f3 = fM6117constructorimpl;
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1310521416);
                int i7 = i4 & 14;
                z = i7 != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state));
                elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1(state, null);
                    composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue, composerStartRestartGroup, 6);
                if (state.getModalBottomSheetState().getTargetValue() != ModalBottomSheetValue.Expanded) {
                    z2 = false;
                }
                stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z2 ? Color.m3659getAlphaimpl(stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM.m8855getScrimColor0d7_KjU()) : 0.0f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, "StatusBarColorAlpha", null, composerStartRestartGroup, 3120, 20);
                Float fValueOf = Float.valueOf(ElementsBottomSheetLayout_TN_CM5M$lambda$1(stateAnimateFloatAsState));
                composerStartRestartGroup.startReplaceGroup(-1310508480);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changedInstance(stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1(systemUiControllerRememberSystemUiController, stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM, stateAnimateFloatAsState, null);
                    composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(systemUiControllerRememberSystemUiController, fValueOf, (Function2) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1310501978);
                zChanged2 = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController);
                elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1(systemUiControllerRememberSystemUiController, null);
                    composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(systemUiControllerRememberSystemUiController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue, composerStartRestartGroup, 0);
                StripeBottomSheetLayoutKt.StripeBottomSheetLayout(state, stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM, modifier3, onDismissed, content, composerStartRestartGroup, (i4 & 57344) | StripeBottomSheetState.$stable | i7 | (StripeBottomSheetLayoutInfo.$stable << 3) | ((i4 << 3) & 896) | (i4 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = f3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f2 = fM6117constructorimpl;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ElementsBottomSheetLayoutKt.ElementsBottomSheetLayout_TN_CM5M$lambda$4(state, modifier3, f2, onDismissed, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                boolean z22 = true;
                stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM = StripeBottomSheetLayoutInfoKt.m8857rememberStripeBottomSheetLayoutInfoHde_KZM(fM6117constructorimpl, 0L, Color.m3656copywmQWz5c$default(Color.INSTANCE.m3683getBlack0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, ((i4 >> 6) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                float f32 = fM6117constructorimpl;
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1310521416);
                int i72 = i4 & 14;
                if (i72 != 4) {
                    elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1(state, null);
                        composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1$1RememberedValue, composerStartRestartGroup, 6);
                        if (state.getModalBottomSheetState().getTargetValue() != ModalBottomSheetValue.Expanded) {
                        }
                        stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z22 ? Color.m3659getAlphaimpl(stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM.m8855getScrimColor0d7_KjU()) : 0.0f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, "StatusBarColorAlpha", null, composerStartRestartGroup, 3120, 20);
                        Float fValueOf2 = Float.valueOf(ElementsBottomSheetLayout_TN_CM5M$lambda$1(stateAnimateFloatAsState));
                        composerStartRestartGroup.startReplaceGroup(-1310508480);
                        zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changedInstance(stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                        elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1(systemUiControllerRememberSystemUiController, stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM, stateAnimateFloatAsState, null);
                            composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(systemUiControllerRememberSystemUiController, fValueOf2, (Function2) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1RememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1310501978);
                            zChanged2 = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController);
                            elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue = new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1(systemUiControllerRememberSystemUiController, null);
                                composerStartRestartGroup.updateRememberedValue(elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(systemUiControllerRememberSystemUiController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) elementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1RememberedValue, composerStartRestartGroup, 0);
                                StripeBottomSheetLayoutKt.StripeBottomSheetLayout(state, stripeBottomSheetLayoutInfoM8857rememberStripeBottomSheetLayoutInfoHde_KZM, modifier3, onDismissed, content, composerStartRestartGroup, (i4 & 57344) | StripeBottomSheetState.$stable | i72 | (StripeBottomSheetLayoutInfo.$stable << 3) | ((i4 << 3) & 896) | (i4 & 7168), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f32;
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

    private static final boolean isRunningUnitTest() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            String lowerCase = FINGERPRINT.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            objM9118constructorimpl = Result.m9118constructorimpl(Boolean.valueOf(Intrinsics.areEqual(lowerCase, "robolectric")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = false;
        }
        return ((Boolean) objM9118constructorimpl).booleanValue();
    }

    private static final boolean isRunningUiTest() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9125isSuccessimpl(objM9118constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ElementsBottomSheetLayout_TN_CM5M$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
