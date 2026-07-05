package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromoBadge.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\u001a(\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002\"\u0018\u0010\u0012\u001a\u00020\u0007*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"PromoBadge", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", MobileCardElementConfigParser.FIELD_ELIGIBLE, "", "tinyMode", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "formatPromoText", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "FixedTextSize", "fixed", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isEnglishLanguage", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "copy", "Landroidx/compose/ui/unit/Density;", "fontScale", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoBadgeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FixedTextSize$lambda$1(boolean z, Function2 function2, int i, Composer composer, int i2) {
        FixedTextSize(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoBadge$lambda$0(String str, Modifier modifier, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        PromoBadge(str, modifier, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PromoBadge(final String text, final Modifier modifier, final boolean z, final boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-987606108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                z = true;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-987606108, i3, -1, "com.stripe.android.paymentsheet.ui.PromoBadge (PromoBadge.kt:32)");
            }
            FixedTextSize(z2, ComposableLambdaKt.rememberComposableLambda(-1648699462, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PromoBadgeKt.PromoBadge.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    long jM8726getComponentBorder0d7_KjU;
                    long jM8728getOnComponent0d7_KjU;
                    if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1648699462, i7, -1, "com.stripe.android.paymentsheet.ui.PromoBadge.<anonymous> (PromoBadge.kt:35)");
                        }
                        if (z) {
                            composer2.startReplaceGroup(1852033211);
                            PrimaryButtonStyle primaryButtonStyle = StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle();
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer2.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            jM8726getComponentBorder0d7_KjU = ColorKt.Color(StripeThemeKt.getSuccessBackgroundColor(primaryButtonStyle, (Context) objConsume));
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1852191125);
                            jM8726getComponentBorder0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8726getComponentBorder0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        if (z) {
                            composer2.startReplaceGroup(1852305081);
                            PrimaryButtonStyle primaryButtonStyle2 = StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle();
                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composer2.consume(localContext2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            jM8728getOnComponent0d7_KjU = ColorKt.Color(StripeThemeKt.getOnSuccessBackgroundColor(primaryButtonStyle2, (Context) objConsume2));
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1852464793);
                            jM8728getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        long j = jM8728getOnComponent0d7_KjU;
                        Modifier modifierM1021paddingVpY3zN4 = PaddingKt.m1021paddingVpY3zN4(BackgroundKt.m574backgroundbw27NRU(modifier, jM8726getComponentBorder0d7_KjU, MaterialTheme.INSTANCE.getShapes(composer2, MaterialTheme.$stable).getMedium()), Dp.m6117constructorimpl(z2 ? 4 : 6), Dp.m6117constructorimpl(z2 ? 0 : 4));
                        String str = text;
                        boolean z3 = z;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1021paddingVpY3zN4);
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
                        TextKt.m2076Text4IGK_g(PromoBadgeKt.formatPromoText(str, z3, composer2, 0), (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m5615copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getCaption(), 0L, StripeThemeDefaults.INSTANCE.getTypography().m8758getXSmallFontSizeXSAIIZE(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer2, 0, 0, 65530);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final boolean z3 = z;
        final boolean z4 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PromoBadgeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromoBadgeKt.PromoBadge$lambda$0(text, modifier2, z3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatPromoText(String str, boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-1728170473);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1728170473, i, -1, "com.stripe.android.paymentsheet.ui.formatPromoText (PromoBadge.kt:76)");
        }
        if (z) {
            composer.startReplaceGroup(-1522389995);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (isEnglishLanguage((Context) objConsume)) {
                str = "Get " + str;
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1522227307);
            str = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_bank_payment_promo_ineligible, new Object[]{str}, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    private static final void FixedTextSize(final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(273935381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(273935381, i2, -1, "com.stripe.android.paymentsheet.ui.FixedTextSize (PromoBadge.kt:94)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(243088591);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(copy((Density) objConsume, 1.0f)), ComposableLambdaKt.rememberComposableLambda(796961946, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PromoBadgeKt.FixedTextSize.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(796961946, i3, -1, "com.stripe.android.paymentsheet.ui.FixedTextSize.<anonymous> (PromoBadge.kt:98)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(243257727);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PromoBadgeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromoBadgeKt.FixedTextSize$lambda$1(z, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean isEnglishLanguage(Context context) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNull(locale);
        return Intrinsics.areEqual(locale.getLanguage(), Locale.ENGLISH.getLanguage());
    }

    static /* synthetic */ Density copy$default(Density density, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return copy(density, f);
    }

    private static final Density copy(Density density, float f) {
        return DensityKt.Density(density.getDensity(), f);
    }
}
