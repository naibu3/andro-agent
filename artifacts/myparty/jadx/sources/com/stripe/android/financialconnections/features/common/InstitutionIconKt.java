package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.location.LocationRequestCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionIcon.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"InstitutionIcon", "", "institutionIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "disablePlaceholder", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "InstitutionPlaceholder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstitutionIconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstitutionIcon$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        InstitutionIcon(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstitutionPlaceholder$lambda$1(Modifier modifier, int i, Composer composer, int i2) {
        InstitutionPlaceholder(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstitutionIcon(final String str, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        boolean zBooleanValue;
        final Modifier modifierM3321shadows4CzXII$default;
        Modifier modifier3;
        Modifier modifier4;
        final boolean z3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1092343159);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1092343159, i3, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon (InstitutionIcon.kt:24)");
                    }
                    ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    zBooleanValue = ((Boolean) objConsume).booleanValue();
                    modifierM3321shadows4CzXII$default = ShadowKt.m3321shadows4CzXII$default(SizeKt.m1065size3ABfNKs(companion, Dp.m6117constructorimpl(56)), Dp.m6117constructorimpl(1), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12)), true, 0L, 0L, 24, null);
                    if (str == null || !z4) {
                        modifier3 = companion;
                        if (!zBooleanValue || str == null) {
                            modifier4 = modifier3;
                            composerStartRestartGroup.startReplaceGroup(-855769930);
                            InstitutionPlaceholder(modifierM3321shadows4CzXII$default, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-855681239);
                            ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localImageLoader);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            modifier4 = modifier3;
                            StripeImageKt.StripeImage(str, (StripeImageLoader) objConsume2, null, modifierM3321shadows4CzXII$default, ContentScale.INSTANCE.getCrop(), null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-208683345, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.InstitutionIconKt.InstitutionIcon.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer2, int i6) {
                                    Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-208683345, i6, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon.<anonymous> (InstitutionIcon.kt:45)");
                                    }
                                    InstitutionIconKt.InstitutionPlaceholder(modifierM3321shadows4CzXII$default, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1510239003, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.InstitutionIconKt.InstitutionIcon.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer2, int i6) {
                                    Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1510239003, i6, -1, "com.stripe.android.financialconnections.features.common.InstitutionIcon.<anonymous> (InstitutionIcon.kt:44)");
                                    }
                                    BoxKt.Box(BackgroundKt.m575backgroundbw27NRU$default(modifierM3321shadows4CzXII$default, FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7632getBackgroundSecondary0d7_KjU(), null, 2, null), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 805331328 | (StripeImageLoader.$stable << 3), 6, 480);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-855909833);
                        BoxKt.Box(BackgroundKt.m575backgroundbw27NRU$default(modifierM3321shadows4CzXII$default, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier4 = companion;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    modifier5 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.InstitutionIconKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstitutionIconKt.InstitutionIcon$lambda$0(str, modifier5, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            z2 = z;
            if ((i3 & 147) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Boolean> localInspectionMode2 = InspectionModeKt.getLocalInspectionMode();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localInspectionMode2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zBooleanValue = ((Boolean) objConsume3).booleanValue();
                modifierM3321shadows4CzXII$default = ShadowKt.m3321shadows4CzXII$default(SizeKt.m1065size3ABfNKs(companion, Dp.m6117constructorimpl(56)), Dp.m6117constructorimpl(1), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12)), true, 0L, 0L, 24, null);
                if (str == null) {
                    modifier3 = companion;
                    if (!zBooleanValue) {
                        modifier4 = modifier3;
                        composerStartRestartGroup.startReplaceGroup(-855769930);
                        InstitutionPlaceholder(modifierM3321shadows4CzXII$default, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z4;
                        modifier5 = modifier4;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstitutionPlaceholder(Modifier modifier, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1265667876);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1265667876, i2, -1, "com.stripe.android.financialconnections.features.common.InstitutionPlaceholder (InstitutionIcon.kt:52)");
            }
            modifier2 = modifier;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_brandicon_institution, composerStartRestartGroup, 0), "Bank icon placeholder", modifier2, (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i2 << 6) & 896) | 24624, LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.InstitutionIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstitutionIconKt.InstitutionPlaceholder$lambda$1(modifier2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
