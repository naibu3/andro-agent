package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.InteractiveComponentSizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleDefaults;
import androidx.compose.material.RippleKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.common.ui.LoadingIndicatorKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RemoveButton.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u00020\u00118CX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {RemoveButtonKt.REMOVE_BUTTON_LOADING, "", "RemoveButton", "", "title", "Lcom/stripe/android/core/strings/ResolvableString;", ViewProps.BORDER_COLOR, "Landroidx/compose/ui/graphics/Color;", "idle", "", "removing", "onRemove", "Lkotlin/Function0;", "testTag", "RemoveButton-8V94_ZQ", "(Lcom/stripe/android/core/strings/ResolvableString;JZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ErrorRippleConfiguration", "Landroidx/compose/material/RippleConfiguration;", "getErrorRippleConfiguration$annotations", "()V", "getErrorRippleConfiguration", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RippleConfiguration;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveButtonKt {
    public static final String REMOVE_BUTTON_LOADING = "REMOVE_BUTTON_LOADING";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RemoveButton_8V94_ZQ$lambda$0(ResolvableString resolvableString, long j, boolean z, boolean z2, Function0 function0, String str, int i, Composer composer, int i2) {
        m8531RemoveButton8V94_ZQ(resolvableString, j, z, z2, function0, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getErrorRippleConfiguration$annotations() {
    }

    /* renamed from: RemoveButton-8V94_ZQ, reason: not valid java name */
    public static final void m8531RemoveButton8V94_ZQ(final ResolvableString title, final long j, final boolean z, final boolean z2, final Function0<Unit> onRemove, final String testTag, Composer composer, final int i) {
        int i2;
        boolean z3;
        float high;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1527990196);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRemove) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(testTag) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1527990196, i2, -1, "com.stripe.android.paymentsheet.ui.RemoveButton (RemoveButton.kt:46)");
            }
            final PrimaryButtonShape shape = PrimaryButtonTheme.INSTANCE.getShape(composerStartRestartGroup, 6);
            ProvidedValue[] providedValueArr = new ProvidedValue[2];
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(701673942);
                high = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(701674802);
                high = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
            }
            composerStartRestartGroup.endReplaceGroup();
            providedValueArr[0] = localContentAlpha.provides(Float.valueOf(high));
            providedValueArr[1] = RippleKt.getLocalRippleConfiguration().provides(getErrorRippleConfiguration(composerStartRestartGroup, 0));
            final boolean z4 = z3;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-920900340, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.RemoveButtonKt$RemoveButton$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-920900340, i3, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous> (RemoveButton.kt:52)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, testTag), 0.0f, 1, null);
                        final boolean z5 = z2;
                        final PrimaryButtonShape primaryButtonShape = shape;
                        final long j2 = j;
                        final boolean z6 = z4;
                        final Function0<Unit> function0 = onRemove;
                        final ResolvableString resolvableString = title;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement().provides(false), ComposableLambdaKt.rememberComposableLambda(1986889554, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.RemoveButtonKt$RemoveButton$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1986889554, i4, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous> (RemoveButton.kt:58)");
                                    }
                                    Modifier modifierM1050defaultMinSizeVpY3zN4$default = SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, 1, null), 0.0f, primaryButtonShape.m8524getHeightD9Ej5fM(), 1, null);
                                    BorderStroke borderStrokeM602BorderStrokecXLIe8U = BorderStrokeKt.m602BorderStrokecXLIe8U(Dp.m6117constructorimpl(RangesKt.coerceAtLeast(primaryButtonShape.m8522getBorderStrokeWidthD9Ej5fM(), Dp.m6117constructorimpl(2))), j2);
                                    RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(primaryButtonShape.m8523getCornerRadiusD9Ej5fM());
                                    boolean z7 = z6 && !z5;
                                    final ResolvableString resolvableString2 = resolvableString;
                                    ButtonKt.TextButton(function0, modifierM1050defaultMinSizeVpY3zN4$default, z7, null, null, roundedCornerShapeM1303RoundedCornerShape0680j_4, borderStrokeM602BorderStrokecXLIe8U, null, null, ComposableLambdaKt.rememberComposableLambda(-86515505, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.RemoveButtonKt$RemoveButton$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope TextButton, Composer composer4, int i5) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i5 & 17) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-86515505, i5, -1, "com.stripe.android.paymentsheet.ui.RemoveButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RemoveButton.kt:71)");
                                                }
                                                ResolvableString resolvableString3 = resolvableString2;
                                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume = composer4.consume(localContext);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                String strResolve = resolvableString3.resolve((Context) objConsume);
                                                long jM1827getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composer4, MaterialTheme.$stable).m1827getError0d7_KjU();
                                                ProvidableCompositionLocal<Float> localContentAlpha2 = ContentAlphaKt.getLocalContentAlpha();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume2 = composer4.consume(localContentAlpha2);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                TextKt.m2076Text4IGK_g(strResolve, (Modifier) null, Color.m3656copywmQWz5c$default(jM1827getError0d7_KjU, ((Number) objConsume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, StripeThemeKt.getComposeTextStyle(StripeTheme.INSTANCE.getPrimaryButtonStyle(), composer4, PrimaryButtonStyle.$stable), composer4, 0, 0, 65530);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 805306368, 408);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        composer2.startReplaceGroup(-245667074);
                        if (z5) {
                            float f = 8;
                            LoadingIndicatorKt.m7225LoadingIndicatoriJQMabo(TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), Dp.m6117constructorimpl(f), 0.0f, Dp.m6117constructorimpl(f), 0.0f, 10, null), RemoveButtonKt.REMOVE_BUTTON_LOADING), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1827getError0d7_KjU(), composer2, 0, 0);
                        }
                        composer2.endReplaceGroup();
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.RemoveButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RemoveButtonKt.RemoveButton_8V94_ZQ$lambda$0(title, j, z, z2, onRemove, testTag, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final RippleConfiguration getErrorRippleConfiguration(Composer composer, int i) {
        composer.startReplaceGroup(1718696063);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1718696063, i, -1, "com.stripe.android.paymentsheet.ui.<get-ErrorRippleConfiguration> (RemoveButton.kt:99)");
        }
        RippleConfiguration rippleConfiguration = new RippleConfiguration(RippleDefaults.INSTANCE.m1980rippleColor5vOe2sY(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1827getError0d7_KjU(), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).isLight()), RippleDefaults.INSTANCE.m1979rippleAlphaDxMtmZc(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1827getError0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).isLight()), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleConfiguration;
    }
}
