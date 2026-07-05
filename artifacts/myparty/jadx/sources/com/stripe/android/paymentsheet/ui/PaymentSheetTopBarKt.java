package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PaymentSheetTopBar.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aA\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\"\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {PaymentSheetTopBarKt.SHEET_NAVIGATION_BUTTON_TAG, "", "PaymentSheetTopBarHeight", "Landroidx/compose/ui/unit/Dp;", "getPaymentSheetTopBarHeight", "()F", "F", "PaymentSheetTopBar", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "canNavigateBack", "", "isEnabled", "handleBackPressed", "Lkotlin/Function0;", "elevation", "PaymentSheetTopBar-FJfuzF0", "(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZLkotlin/jvm/functions/Function0;FLandroidx/compose/runtime/Composer;II)V", "onNavigationIconPressed", "PaymentSheetTopBar--jt2gSs", "(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EditButton", "labelResourceId", "", "tintColor", "Landroidx/compose/ui/graphics/Color;", ViewProps.ON_CLICK, "EditButton-FNF3uiM", "(IZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TestModeBadge", "(Landroidx/compose/runtime/Composer;I)V", "PaymentSheetTopBar_Preview", "TestModeBadge_Preview", "PAYMENT_SHEET_EDIT_BUTTON_TEST_TAG", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetTopBarKt {
    public static final String PAYMENT_SHEET_EDIT_BUTTON_TEST_TAG = "PaymentSheetEditButton";
    private static final float PaymentSheetTopBarHeight = Dp.m6117constructorimpl(56);
    public static final String SHEET_NAVIGATION_BUTTON_TAG = "SHEET_NAVIGATION_BUTTON_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditButton_FNF3uiM$lambda$6(int i, boolean z, long j, Function0 function0, int i2, Composer composer, int i3) {
        m8490EditButtonFNF3uiM(i, z, j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetTopBar_FJfuzF0$lambda$0(PaymentSheetTopBarState paymentSheetTopBarState, boolean z, boolean z2, Function0 function0, float f, int i, int i2, Composer composer, int i3) {
        m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarState, z, z2, function0, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetTopBar_Preview$lambda$9(int i, Composer composer, int i2) {
        PaymentSheetTopBar_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetTopBar__jt2gSs$lambda$1(PaymentSheetTopBarState paymentSheetTopBarState, boolean z, boolean z2, float f, Function0 function0, int i, Composer composer, int i2) {
        m8491PaymentSheetTopBarjt2gSs(paymentSheetTopBarState, z, z2, f, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TestModeBadge$lambda$8(int i, Composer composer, int i2) {
        TestModeBadge(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TestModeBadge_Preview$lambda$10(int i, Composer composer, int i2) {
        TestModeBadge_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final float getPaymentSheetTopBarHeight() {
        return PaymentSheetTopBarHeight;
    }

    /* renamed from: PaymentSheetTopBar-FJfuzF0, reason: not valid java name */
    public static final void m8492PaymentSheetTopBarFJfuzF0(PaymentSheetTopBarState paymentSheetTopBarState, boolean z, boolean z2, Function0<Unit> handleBackPressed, float f, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function0;
        final boolean z3;
        final boolean z4;
        final PaymentSheetTopBarState paymentSheetTopBarState2;
        final float f2;
        Intrinsics.checkNotNullParameter(handleBackPressed, "handleBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(284933000);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(paymentSheetTopBarState) ? 4 : 2) | i;
        } else {
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
            i3 |= composerStartRestartGroup.changedInstance(handleBackPressed) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f2 = f;
            function0 = handleBackPressed;
            z3 = z2;
            z4 = z;
            paymentSheetTopBarState2 = paymentSheetTopBarState;
        } else {
            if (i4 != 0) {
                f = Dp.m6117constructorimpl(0);
            }
            float f3 = f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284933000, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:49)");
            }
            if (paymentSheetTopBarState != null) {
                m8491PaymentSheetTopBarjt2gSs(paymentSheetTopBarState, z, z2, f3, handleBackPressed, composerStartRestartGroup, (i3 & 1022) | ((i3 >> 3) & 7168) | ((i3 << 3) & 57344));
                paymentSheetTopBarState2 = paymentSheetTopBarState;
                z4 = z;
                z3 = z2;
                function0 = handleBackPressed;
            } else {
                function0 = handleBackPressed;
                z3 = z2;
                z4 = z;
                paymentSheetTopBarState2 = paymentSheetTopBarState;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.PaymentSheetTopBar_FJfuzF0$lambda$0(paymentSheetTopBarState2, z4, z3, function0, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: PaymentSheetTopBar--jt2gSs, reason: not valid java name */
    public static final void m8491PaymentSheetTopBarjt2gSs(final PaymentSheetTopBarState state, final boolean z, boolean z2, final float f, final Function0<Unit> onNavigationIconPressed, Composer composer, final int i) {
        int i2;
        boolean z3;
        final boolean z4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNavigationIconPressed, "onNavigationIconPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1583235568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNavigationIconPressed) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1583235568, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:68)");
            }
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final long jM8724getAppBarIcon0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8724getAppBarIcon0d7_KjU();
            long jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1485633716, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485633716, i4, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:74)");
                        }
                        if (state.getShowTestModeLabel()) {
                            PaymentSheetTopBarKt.TestModeBadge(composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            PaymentSheetTopBarKt$PaymentSheetTopBar$3 paymentSheetTopBarKt$PaymentSheetTopBar$3 = new PaymentSheetTopBarKt$PaymentSheetTopBar$3((SoftwareKeyboardController) objConsume, onNavigationIconPressed, z2, z3, jM8724getAppBarIcon0d7_KjU);
            z4 = z2;
            AppBarKt.m1765TopAppBarxWeB9s(composableLambdaRememberComposableLambda, null, ComposableLambdaKt.rememberComposableLambda(1984190518, true, paymentSheetTopBarKt$PaymentSheetTopBar$3, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1793907103, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TopAppBar, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                    if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1793907103, i4, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:108)");
                        }
                        if (state.getShowEditMenu()) {
                            PaymentSheetTopBarKt.m8490EditButtonFNF3uiM(state.getEditMenuLabel(), z4, jM8724getAppBarIcon0d7_KjU, state.getOnEditIconPressed(), composer2, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), jM1837getSurface0d7_KjU, 0L, f, composerStartRestartGroup, ((i3 << 9) & 3670016) | 3462, 34);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z5 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.PaymentSheetTopBar__jt2gSs$lambda$1(state, z, z5, f, onNavigationIconPressed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EditButton-FNF3uiM, reason: not valid java name */
    public static final void m8490EditButtonFNF3uiM(final int i, final boolean z, final long j, final Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        Typeface font;
        Composer composerStartRestartGroup = composer.startRestartGroup(-555214987);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555214987, i3, -1, "com.stripe.android.paymentsheet.ui.EditButton (PaymentSheetTopBar.kt:126)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume2;
            StripeTypography stripeTypography = StripeThemeKt.getStripeTypography(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable);
            composerStartRestartGroup.startReplaceGroup(-1272516412);
            boolean zChanged = composerStartRestartGroup.changed(stripeTypography);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Integer fontFamily = stripeTypography.getFontFamily();
                if (fontFamily == null || (font = ResourcesCompat.getFont(context, fontFamily.intValue())) == null) {
                    font = Typeface.DEFAULT;
                }
                objRememberedValue = font;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Typeface typeface = (Typeface) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1272510751);
            boolean zChanged2 = composerStartRestartGroup.changed(stripeTypography);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = TextUnit.m6300boximpl(density.mo714toSp0xMU5do(Dp.m6117constructorimpl(Dp.m6117constructorimpl(TextUnit.m6310getValueimpl(StripeThemeDefaults.INSTANCE.getTypography().m8756getSmallFontSizeXSAIIZE())) * stripeTypography.getFontSizeMultiplier())));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final long packedValue = ((TextUnit) objRememberedValue2).getPackedValue();
            composerStartRestartGroup.endReplaceGroup();
            IconButtonKt.IconButton(function0, PaddingKt.m1024paddingqDBjuR0$default(TestTagKt.testTag(Modifier.INSTANCE, PAYMENT_SHEET_EDIT_BUTTON_TEST_TAG), 0.0f, 0.0f, Dp.m6117constructorimpl(10), 0.0f, 11, null), z, null, ComposableLambdaKt.rememberComposableLambda(1983637009, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$EditButton$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1983637009, i4, -1, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:149)");
                        }
                        String upperCase = StringResources_androidKt.stringResource(i, composer2, 0).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        long j2 = j;
                        long j3 = packedValue;
                        Typeface typeface2 = typeface;
                        Intrinsics.checkNotNull(typeface2);
                        TextKt.m2076Text4IGK_g(upperCase, (Modifier) null, j2, j3, (FontStyle) null, (FontWeight) null, AndroidTypeface_androidKt.FontFamily(typeface2), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 130994);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 24624 | ((i3 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.EditButton_FNF3uiM$lambda$6(i, z, j, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TestModeBadge(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1806667293);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1806667293, i, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge (PaymentSheetTopBar.kt:160)");
            }
            long jColorResource = ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_testmode_background, composerStartRestartGroup, 0);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_testmode_text, composerStartRestartGroup, 0);
            Modifier modifierM1021paddingVpY3zN4 = PaddingKt.m1021paddingVpY3zN4(BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, jColorResource, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(5))), Dp.m6117constructorimpl(6), Dp.m6117constructorimpl(2));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1021paddingVpY3zN4);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g("TEST", (Modifier) null, jColorResource2, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196614, 0, 131034);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.TestModeBadge$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentSheetTopBar_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(861074475);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(861074475, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar_Preview (PaymentSheetTopBar.kt:179)");
            }
            StripeColors colorsLight = StripeThemeDefaults.INSTANCE.getColorsLight();
            StripeThemeKt.StripeTheme(colorsLight.m8723copyKvvhxLA((32 & 1) != 0 ? colorsLight.component : 0L, (32 & 2) != 0 ? colorsLight.componentBorder : 0L, (32 & 4) != 0 ? colorsLight.componentDivider : 0L, (32 & 8) != 0 ? colorsLight.onComponent : 0L, (32 & 16) != 0 ? colorsLight.subtitle : 0L, (32 & 32) != 0 ? colorsLight.textCursor : 0L, (32 & 64) != 0 ? colorsLight.placeholderText : 0L, (32 & 128) != 0 ? colorsLight.appBarIcon : Color.INSTANCE.m3691getRed0d7_KjU(), (32 & 256) != 0 ? colorsLight.materialColors : null), null, null, null, null, null, null, ComposableSingletons$PaymentSheetTopBarKt.INSTANCE.m8438getLambda1$paymentsheet_release(), composerStartRestartGroup, StripeColors.$stable | 12582912, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.PaymentSheetTopBar_Preview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TestModeBadge_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(342298502);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342298502, i, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge_Preview (PaymentSheetTopBar.kt:200)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$PaymentSheetTopBarKt.INSTANCE.m8439getLambda2$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetTopBarKt.TestModeBadge_Preview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
