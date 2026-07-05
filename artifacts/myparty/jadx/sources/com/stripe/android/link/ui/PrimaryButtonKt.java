package com.stripe.android.link.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.LinkThemeConfig;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimaryButton.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u00012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019\"\u0010\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019\"\u000e\u0010\u001b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"PrimaryButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "label", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/PrimaryButtonState;", "onButtonClick", "Lkotlin/Function0;", "iconStart", "", "iconEnd", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonIcon", PaymentSheetAppearanceKeys.ICON, "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "completePaymentButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "PrimaryButtonIconWidth", "Landroidx/compose/ui/unit/Dp;", "F", "PrimaryButtonIconHeight", "ProgressIndicatorTestTag", "CompletedIconTestTag", PrimaryButtonKt.PrimaryButtonTag, "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrimaryButtonKt {
    public static final String CompletedIconTestTag = "CompletedIcon";
    public static final String PrimaryButtonTag = "PrimaryButtonTag";
    public static final String ProgressIndicatorTestTag = "CircularProgressIndicator";
    private static final float PrimaryButtonIconWidth = Dp.m6117constructorimpl(13);
    private static final float PrimaryButtonIconHeight = Dp.m6117constructorimpl(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$0(Modifier modifier, String str, PrimaryButtonState primaryButtonState, Function0 function0, Integer num, Integer num2, int i, int i2, Composer composer, int i3) {
        PrimaryButton(modifier, str, primaryButtonState, function0, num, num2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonIcon$lambda$3(Integer num, int i, Composer composer, int i2) {
        PrimaryButtonIcon(num, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$4(int i, Composer composer, int i2) {
        PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(Modifier modifier, final String label, final PrimaryButtonState state, final Function0<Unit> onButtonClick, Integer num, Integer num2, Composer composer, final int i, final int i2) {
        int i3;
        Integer num3;
        int i4;
        Integer num4;
        final Modifier modifier2;
        final Integer num5;
        float high;
        final Integer num6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2033045204);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                num3 = num;
                i3 |= composerStartRestartGroup.changed(num3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    num4 = num2;
                    i3 |= composerStartRestartGroup.changed(num4) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    modifier2 = modifier;
                    if (i6 != 0) {
                        num3 = null;
                    }
                    num5 = i4 == 0 ? null : num4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2033045204, i3, -1, "com.stripe.android.link.ui.PrimaryButton (PrimaryButton.kt:50)");
                    }
                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    if (state != PrimaryButtonState.Disabled) {
                        composerStartRestartGroup.startReplaceGroup(-2079245373);
                        high = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-2079244513);
                        high = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Integer num7 = num3;
                    CompositionLocalKt.CompositionLocalProvider(localContentAlpha.provides(Float.valueOf(high)), ComposableLambdaKt.rememberComposableLambda(-1381760492, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.PrimaryButtonKt.PrimaryButton.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num8) {
                            invoke(composer2, num8.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1381760492, i7, -1, "com.stripe.android.link.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:55)");
                                }
                                Modifier modifier3 = modifier2;
                                Function0<Unit> function0 = onButtonClick;
                                PrimaryButtonState primaryButtonState = state;
                                Integer num8 = num7;
                                String str = label;
                                Integer num9 = num5;
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier3);
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
                                float f = 0;
                                ButtonKt.Button(function0, TestTagKt.testTag(SizeKt.fillMaxWidth$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, ThemeKt.getPrimaryButtonHeight()), 0.0f, 1, null), PrimaryButtonKt.PrimaryButtonTag), primaryButtonState == PrimaryButtonState.Enabled, null, ButtonDefaults.INSTANCE.m1800elevationR_JCAzs(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), composer2, (ButtonDefaults.$stable << 15) | 28086, 0), LinkTheme.INSTANCE.getShapes(composer2, 6).getDefault(), null, ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(LinkTheme.INSTANCE.getColors(composer2, 6).m7794getButtonBrand0d7_KjU(), 0L, LinkTheme.INSTANCE.getColors(composer2, 6).m7794getButtonBrand0d7_KjU(), 0L, composer2, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.rememberComposableLambda(-1131378722, true, new PrimaryButtonKt$PrimaryButton$1$1$1(primaryButtonState, num8, str, num9), composer2, 54), composer2, 805306416, 328);
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
                    num6 = num7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    num6 = num3;
                    num5 = num4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.PrimaryButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PrimaryButtonKt.PrimaryButton$lambda$0(modifier2, label, state, onButtonClick, num6, num5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            num4 = num2;
            if ((74899 & i3) != 74898) {
                if (i5 != 0) {
                }
                modifier2 = modifier;
                if (i6 != 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Float> localContentAlpha2 = ContentAlphaKt.getLocalContentAlpha();
                if (state != PrimaryButtonState.Disabled) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final Integer num72 = num3;
                CompositionLocalKt.CompositionLocalProvider(localContentAlpha2.provides(Float.valueOf(high)), ComposableLambdaKt.rememberComposableLambda(-1381760492, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.PrimaryButtonKt.PrimaryButton.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num8) {
                        invoke(composer2, num8.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1381760492, i7, -1, "com.stripe.android.link.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:55)");
                            }
                            Modifier modifier3 = modifier2;
                            Function0<Unit> function0 = onButtonClick;
                            PrimaryButtonState primaryButtonState = state;
                            Integer num8 = num72;
                            String str = label;
                            Integer num9 = num5;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier3);
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
                            float f = 0;
                            ButtonKt.Button(function0, TestTagKt.testTag(SizeKt.fillMaxWidth$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, ThemeKt.getPrimaryButtonHeight()), 0.0f, 1, null), PrimaryButtonKt.PrimaryButtonTag), primaryButtonState == PrimaryButtonState.Enabled, null, ButtonDefaults.INSTANCE.m1800elevationR_JCAzs(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), composer2, (ButtonDefaults.$stable << 15) | 28086, 0), LinkTheme.INSTANCE.getShapes(composer2, 6).getDefault(), null, ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(LinkTheme.INSTANCE.getColors(composer2, 6).m7794getButtonBrand0d7_KjU(), 0L, LinkTheme.INSTANCE.getColors(composer2, 6).m7794getButtonBrand0d7_KjU(), 0L, composer2, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.rememberComposableLambda(-1131378722, true, new PrimaryButtonKt$PrimaryButton$1$1$1(primaryButtonState, num8, str, num9), composer2, 54), composer2, 805306416, 328);
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
                }
                num6 = num72;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        num3 = num;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        num4 = num2;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrimaryButtonIcon(final Integer num, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111548925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2111548925, i2, -1, "com.stripe.android.link.ui.PrimaryButtonIcon (PrimaryButton.kt:113)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = PrimaryButtonIconWidth;
            Modifier modifierM1070width3ABfNKs = SizeKt.m1070width3ABfNKs(companion, f);
            float f2 = PrimaryButtonIconHeight;
            Modifier modifierM1051height3ABfNKs = SizeKt.m1051height3ABfNKs(modifierM1070width3ABfNKs, f2);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1051height3ABfNKs);
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
            composerStartRestartGroup.startReplaceGroup(-279038081);
            if (num != null) {
                Painter painterPainterResource = PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, 0);
                Modifier modifierM1051height3ABfNKs2 = SizeKt.m1051height3ABfNKs(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, f), f2);
                long jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release = LinkThemeConfig.INSTANCE.m7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                IconKt.m1925Iconww6aTOc(painterPainterResource, (String) null, modifierM1051height3ABfNKs2, Color.m3656copywmQWz5c$default(jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release, ((Number) objConsume).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 432, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.PrimaryButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonKt.PrimaryButtonIcon$lambda$3(num, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final ResolvableString completePaymentButtonLabel(StripeIntent stripeIntent, LinkLaunchMode linkLaunchMode) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.Confirmation)) {
            if (stripeIntent instanceof PaymentIntent) {
                PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
                Long amount = paymentIntent.getAmount();
                if (amount == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                long jLongValue = amount.longValue();
                String currency = paymentIntent.getCurrency();
                if (currency == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                return new Amount(jLongValue, currency).buildPayButtonLabel();
            }
            if (!(stripeIntent instanceof SetupIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_continue_button_label);
        }
        if (!(linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) && !(linkLaunchMode instanceof LinkLaunchMode.Authentication)) {
            throw new NoWhenBranchMatchedException();
        }
        return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_continue_button_label);
    }

    private static final void PrimaryButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-314814269);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-314814269, i, -1, "com.stripe.android.link.ui.PrimaryButtonPreview (PrimaryButton.kt:174)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$PrimaryButtonKt.INSTANCE.m7840getLambda1$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.PrimaryButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimaryButtonKt.PrimaryButtonPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
