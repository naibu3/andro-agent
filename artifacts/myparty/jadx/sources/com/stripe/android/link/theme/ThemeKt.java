package com.stripe.android.link.theme;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.common.util.UriUtil;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.model.LinkAppearance;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00170\u001b¢\u0006\u0002\b\u001cH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#\u001a,\u0010$\u001a\u00020\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00170\u001b¢\u0006\u0002\b\u001cH\u0001¢\u0006\u0002\u0010'\u001a\u0014\u0010(\u001a\u00020\u001f*\u00020\u00062\u0006\u0010)\u001a\u00020\u0019H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u0016\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\"\u0016\u0010\u0010\u001a\u00020\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e\"\u0016\u0010\u0012\u001a\u00020\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e\"\u0016\u0010\u0014\u001a\u00020\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000e¨\u0006*"}, d2 = {"LocalLinkTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/stripe/android/link/theme/LinkTypography;", "getLocalLinkTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalLinkColors", "Lcom/stripe/android/link/theme/LinkColors;", "getLocalLinkColors", "LocalLinkShapes", "Lcom/stripe/android/link/theme/LinkShapes;", "getLocalLinkShapes", "MinimumTouchTargetSize", "Landroidx/compose/ui/unit/Dp;", "getMinimumTouchTargetSize", "()F", "F", "PrimaryButtonHeight", "getPrimaryButtonHeight", "AppBarHeight", "getAppBarHeight", "HorizontalPadding", "getHorizontalPadding", "DefaultLinkTheme", "", "darkTheme", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "debugColors", "Landroidx/compose/material/Colors;", "debugColor", "Landroidx/compose/ui/graphics/Color;", "debugColors-8_81llA", "(J)Landroidx/compose/material/Colors;", "LinkAppearanceTheme", "appearance", "Lcom/stripe/android/link/model/LinkAppearance;", "(Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "toMaterialColors", "isLight", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThemeKt {
    private static final ProvidableCompositionLocal<LinkTypography> LocalLinkTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.link.theme.ThemeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThemeKt.LocalLinkTypography$lambda$0();
        }
    });
    private static final ProvidableCompositionLocal<LinkColors> LocalLinkColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.link.theme.ThemeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThemeKt.LocalLinkColors$lambda$1();
        }
    });
    private static final ProvidableCompositionLocal<LinkShapes> LocalLinkShapes = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.link.theme.ThemeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThemeKt.LocalLinkShapes$lambda$2();
        }
    });
    private static final float MinimumTouchTargetSize = Dp.m6117constructorimpl(48);
    private static final float PrimaryButtonHeight = Dp.m6117constructorimpl(56);
    private static final float AppBarHeight = Dp.m6117constructorimpl(70);
    private static final float HorizontalPadding = Dp.m6117constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultLinkTheme$lambda$3(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        DefaultLinkTheme(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkAppearanceTheme$lambda$8(LinkAppearance linkAppearance, Function2 function2, int i, int i2, Composer composer, int i3) {
        LinkAppearanceTheme(linkAppearance, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ProvidableCompositionLocal<LinkTypography> getLocalLinkTypography() {
        return LocalLinkTypography;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkTypography LocalLinkTypography$lambda$0() {
        throw new IllegalStateException("No Typography provided".toString());
    }

    public static final ProvidableCompositionLocal<LinkColors> getLocalLinkColors() {
        return LocalLinkColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkColors LocalLinkColors$lambda$1() {
        throw new IllegalStateException("No Colors provided".toString());
    }

    public static final ProvidableCompositionLocal<LinkShapes> getLocalLinkShapes() {
        return LocalLinkShapes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkShapes LocalLinkShapes$lambda$2() {
        throw new IllegalStateException("No Shapes provided".toString());
    }

    public static final float getMinimumTouchTargetSize() {
        return MinimumTouchTargetSize;
    }

    public static final float getPrimaryButtonHeight() {
        return PrimaryButtonHeight;
    }

    public static final float getAppBarHeight() {
        return AppBarHeight;
    }

    public static final float getHorizontalPadding() {
        return HorizontalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultLinkTheme(final boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1857868198);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalLinkTypography.provides(TypeKt.getLinkTypography()), LocalLinkColors.provides(LinkThemeConfig.INSTANCE.colors(z)), LocalLinkShapes.provides(LinkShapes.INSTANCE)}, ComposableLambdaKt.rememberComposableLambda(1231946522, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ThemeKt.DefaultLinkTheme.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1231946522, i4, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:42)");
                            }
                            Colors colorsM7818debugColors8_81llA$default = ThemeKt.m7818debugColors8_81llA$default(0L, 1, null);
                            final Function2<Composer, Integer, Unit> function2 = content;
                            MaterialThemeKt.MaterialTheme(colorsM7818debugColors8_81llA$default, null, null, ComposableLambdaKt.rememberComposableLambda(446093550, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ThemeKt.DefaultLinkTheme.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i5) {
                                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(446093550, i5, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous>.<anonymous> (Theme.kt:45)");
                                    }
                                    function2.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 3072, 6);
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
            } else {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1857868198, i3, -1, "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:36)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalLinkTypography.provides(TypeKt.getLinkTypography()), LocalLinkColors.provides(LinkThemeConfig.INSTANCE.colors(z)), LocalLinkShapes.provides(LinkShapes.INSTANCE)}, ComposableLambdaKt.rememberComposableLambda(1231946522, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ThemeKt.DefaultLinkTheme.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1231946522, i4, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:42)");
                            }
                            Colors colorsM7818debugColors8_81llA$default = ThemeKt.m7818debugColors8_81llA$default(0L, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            MaterialThemeKt.MaterialTheme(colorsM7818debugColors8_81llA$default, null, null, ComposableLambdaKt.rememberComposableLambda(446093550, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ThemeKt.DefaultLinkTheme.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i5) {
                                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(446093550, i5, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous>.<anonymous> (Theme.kt:45)");
                                    }
                                    function2.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 3072, 6);
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
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.theme.ThemeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.DefaultLinkTheme$lambda$3(z, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: debugColors-8_81llA$default, reason: not valid java name */
    static /* synthetic */ Colors m7818debugColors8_81llA$default(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m3690getMagenta0d7_KjU();
        }
        return m7817debugColors8_81llA(j);
    }

    /* renamed from: debugColors-8_81llA, reason: not valid java name */
    private static final Colors m7817debugColors8_81llA(long j) {
        return new Colors(j, j, j, j, j, j, j, j, j, j, j, j, true, null);
    }

    public static final void LinkAppearanceTheme(LinkAppearance linkAppearance, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final boolean zIsSystemInDarkTheme;
        final LinkAppearance linkAppearance2 = linkAppearance;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1419140723);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(linkAppearance2) : composerStartRestartGroup.changedInstance(linkAppearance2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Unit unit = null;
            if (i4 != 0) {
                linkAppearance2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1419140723, i3, -1, "com.stripe.android.link.theme.LinkAppearanceTheme (Theme.kt:76)");
            }
            composerStartRestartGroup.startReplaceGroup(1481825708);
            if (linkAppearance2 != null) {
                LinkAppearance.Style style = linkAppearance2.getStyle();
                composerStartRestartGroup.startReplaceGroup(1481825560);
                if (style == LinkAppearance.Style.ALWAYS_LIGHT) {
                    zIsSystemInDarkTheme = false;
                } else if (style == LinkAppearance.Style.ALWAYS_DARK) {
                    zIsSystemInDarkTheme = true;
                } else {
                    if (style != LinkAppearance.Style.AUTOMATIC) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                LinkColors linkColorsColors = LinkThemeConfig.INSTANCE.colors(zIsSystemInDarkTheme);
                LinkAppearance.Colors darkColors = zIsSystemInDarkTheme ? linkAppearance2.getDarkColors() : linkAppearance2.getLightColors();
                final LinkColors linkColorsM7766copyZLJeMyA$default = LinkColors.m7766copyZLJeMyA$default(linkColorsColors, 0L, 0L, 0L, 0L, 0L, darkColors.getBorderSelected(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, darkColors.getPrimary(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8355807, null);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                composerStartRestartGroup.startReplaceGroup(1419590238);
                boolean zChanged = composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(zIsSystemInDarkTheme);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.uiMode = (zIsSystemInDarkTheme ? 32 : 16) | (configuration.uiMode & (-49));
                    objRememberedValue = context.createConfigurationContext(configuration);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Context context2 = (Context) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                Intrinsics.checkNotNull(context2);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalLinkColors.provides(linkColorsM7766copyZLJeMyA$default), LocalLinkTypography.provides(TypeKt.getLinkTypography()), LocalLinkShapes.provides(LinkShapes.INSTANCE), localContext2.provides(context2)}, ComposableLambdaKt.rememberComposableLambda(1306867111, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.theme.ThemeKt$LinkAppearanceTheme$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1306867111, i5, -1, "com.stripe.android.link.theme.LinkAppearanceTheme.<anonymous>.<anonymous> (Theme.kt:111)");
                            }
                            MaterialThemeKt.MaterialTheme(ThemeKt.toMaterialColors(linkColorsM7766copyZLJeMyA$default, !zIsSystemInDarkTheme), null, null, content, composer2, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (unit == null) {
                DefaultLinkTheme(false, content, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.LinkAppearanceTheme$lambda$8(linkAppearance2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors toMaterialColors(LinkColors linkColors, boolean z) {
        if (z) {
            return new Colors(linkColors.m7796getButtonPrimary0d7_KjU(), linkColors.m7796getButtonPrimary0d7_KjU(), linkColors.m7797getButtonTertiary0d7_KjU(), linkColors.m7797getButtonTertiary0d7_KjU(), linkColors.m7804getSurfaceBackdrop0d7_KjU(), linkColors.m7805getSurfacePrimary0d7_KjU(), linkColors.m7795getButtonCritical0d7_KjU(), linkColors.m7813getTextWhite0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7813getTextWhite0d7_KjU(), true, null);
        }
        return new Colors(linkColors.m7796getButtonPrimary0d7_KjU(), linkColors.m7796getButtonPrimary0d7_KjU(), linkColors.m7797getButtonTertiary0d7_KjU(), linkColors.m7797getButtonTertiary0d7_KjU(), linkColors.m7804getSurfaceBackdrop0d7_KjU(), linkColors.m7805getSurfacePrimary0d7_KjU(), linkColors.m7795getButtonCritical0d7_KjU(), linkColors.m7813getTextWhite0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7810getTextPrimary0d7_KjU(), linkColors.m7813getTextWhite0d7_KjU(), false, null);
    }
}
