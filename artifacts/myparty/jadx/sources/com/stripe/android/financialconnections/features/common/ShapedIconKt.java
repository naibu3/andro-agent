package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ShapedIcon.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0017H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"ShapedIcon", "", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "modifier", "Landroidx/compose/ui/Modifier;", "iconSize", "Lcom/stripe/android/financialconnections/features/common/IconSize;", "backgroundShape", "Landroidx/compose/ui/graphics/Shape;", "contentDescription", "", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "url", "errorPainter", "flushed", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/runtime/Composer;II)V", "LocalIcon", "(Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "IconWrapperBox", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/features/common/IconSize;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShapedIconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconWrapperBox$lambda$4(Modifier modifier, IconSize iconSize, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconWrapperBox(modifier, iconSize, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalIcon$lambda$2(IconSize iconSize, Painter painter, String str, int i, Composer composer, int i2) {
        LocalIcon(iconSize, painter, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShapedIcon$lambda$0(Painter painter, Modifier modifier, IconSize iconSize, Shape shape, String str, int i, int i2, Composer composer, int i3) {
        ShapedIcon(painter, modifier, iconSize, shape, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShapedIcon$lambda$1(String str, Modifier modifier, IconSize iconSize, Shape shape, String str2, Painter painter, boolean z, int i, int i2, Composer composer, int i3) {
        ShapedIcon(str, modifier, iconSize, shape, str2, painter, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShapedIcon(final Painter painter, Modifier modifier, IconSize iconSize, Shape shape, final String str, Composer composer, final int i, final int i2) {
        int i3;
        IconSize iconSize2;
        Shape shape2;
        final IconSize iconSize3;
        Modifier modifier2;
        Shape circleShape;
        final Modifier modifier3;
        final IconSize iconSize4;
        final Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(716371143);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i;
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
        if (i5 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                iconSize2 = iconSize;
                i3 |= composerStartRestartGroup.changed(iconSize2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    int i6 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    shape2 = shape;
                }
                i3 |= i6;
            } else {
                shape2 = shape;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i4 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    IconSize iconSize5 = i5 == 0 ? IconSize.Medium : iconSize2;
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        modifier2 = modifier;
                        iconSize3 = iconSize5;
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(716371143, i3, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:34)");
                        }
                        int i7 = i3 >> 3;
                        IconWrapperBox(modifier2, iconSize3, circleShape, ComposableLambdaKt.rememberComposableLambda(-982781912, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-982781912, i8, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:40)");
                                    }
                                    ShapedIconKt.LocalIcon(iconSize3, painter, str, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 14) | 3072 | (i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i7 & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        iconSize4 = iconSize3;
                        shape3 = circleShape;
                    } else {
                        iconSize3 = iconSize5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    iconSize3 = iconSize2;
                }
                circleShape = shape2;
                modifier2 = modifier;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i72 = i3 >> 3;
                IconWrapperBox(modifier2, iconSize3, circleShape, ComposableLambdaKt.rememberComposableLambda(-982781912, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-982781912, i8, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:40)");
                            }
                            ShapedIconKt.LocalIcon(iconSize3, painter, str, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i72 & 14) | 3072 | (i72 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i72 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                iconSize4 = iconSize3;
                shape3 = circleShape;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                iconSize4 = iconSize2;
                shape3 = shape2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShapedIconKt.ShapedIcon$lambda$0(painter, modifier3, iconSize4, shape3, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        iconSize2 = iconSize;
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShapedIcon(final String url, Modifier modifier, IconSize iconSize, Shape shape, final String str, Painter painter, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        IconSize iconSize2;
        Shape circleShape;
        String str2;
        int i5;
        Painter painter2;
        int i6;
        boolean z2;
        int i7;
        final IconSize iconSize3;
        final Painter painter3;
        final boolean z3;
        Modifier modifier3;
        Composer composer2;
        final Shape shape2;
        final IconSize iconSize4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(url, "url");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654712672);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(url) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    iconSize2 = iconSize;
                    i3 |= composerStartRestartGroup.changed(iconSize2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        circleShape = shape;
                        int i9 = composerStartRestartGroup.changed(circleShape) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        circleShape = shape;
                    }
                    i3 |= i9;
                } else {
                    circleShape = shape;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    }
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else {
                        if ((196608 & i) == 0) {
                            painter2 = painter;
                            i3 |= composerStartRestartGroup.changedInstance(painter2) ? 131072 : 65536;
                        }
                        i6 = i2 & 64;
                        if (i6 == 0) {
                            if ((1572864 & i) == 0) {
                                z2 = z;
                                i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                            }
                            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        iconSize2 = IconSize.Medium;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        circleShape = RoundedCornerShapeKt.getCircleShape();
                                    }
                                    if (i5 != 0) {
                                        painter2 = null;
                                    }
                                    if (i6 == 0) {
                                        i7 = i3;
                                        z3 = false;
                                        iconSize3 = iconSize2;
                                        painter3 = painter2;
                                    } else {
                                        i7 = i3;
                                        iconSize3 = iconSize2;
                                        painter3 = painter2;
                                        z3 = z2;
                                    }
                                    modifier3 = companion;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    i7 = i3;
                                    iconSize3 = iconSize2;
                                    painter3 = painter2;
                                    z3 = z2;
                                    modifier3 = modifier2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1654712672, i7, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon (ShapedIcon.kt:69)");
                                }
                                final String str3 = str2;
                                z2 = z3;
                                painter2 = painter3;
                                int i10 = i7 >> 3;
                                Modifier modifier5 = modifier3;
                                composer2 = composerStartRestartGroup;
                                Shape shape3 = circleShape;
                                IconWrapperBox(modifier5, iconSize3, shape3, ComposableLambdaKt.rememberComposableLambda(-1200239329, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1200239329, i11, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:75)");
                                            }
                                            Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, z3 ? iconSize3.getSize() : iconSize3.getPaddedSize());
                                            ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composer3.consume(localImageLoader);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            StripeImageLoader stripeImageLoader = (StripeImageLoader) objConsume;
                                            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.stripe_ic_person, composer3, 0);
                                            ContentScale crop = ContentScale.INSTANCE.getCrop();
                                            String str4 = url;
                                            String str5 = str3;
                                            final Painter painter4 = painter3;
                                            final IconSize iconSize5 = iconSize3;
                                            final String str6 = str3;
                                            StripeImageKt.StripeImage(str4, stripeImageLoader, str5, modifierM1065size3ABfNKs, crop, null, painterPainterResource, null, false, ComposableLambdaKt.rememberComposableLambda(-1183890906, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.3.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer4, Integer num) {
                                                    invoke(boxWithConstraintsScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer4, int i12) {
                                                    Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                                                    if ((i12 & 17) != 16 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1183890906, i12, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous>.<anonymous> (ShapedIcon.kt:84)");
                                                        }
                                                        Painter painter5 = painter4;
                                                        if (painter5 != null) {
                                                            ShapedIconKt.LocalIcon(iconSize5, painter5, str6, composer4, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }, composer3, 54), null, composer3, (StripeImageLoader.$stable << 3) | 805330944, 0, 1440);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, (i10 & 896) | (i10 & 14) | 3072 | (i10 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape2 = shape3;
                                iconSize4 = iconSize3;
                                modifier4 = modifier5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                composer2 = composerStartRestartGroup;
                                iconSize4 = iconSize2;
                                shape2 = circleShape;
                            }
                            final Painter painter4 = painter2;
                            final boolean z4 = z2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ShapedIconKt.ShapedIcon$lambda$1(url, modifier4, iconSize4, shape2, str, painter4, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        z2 = z;
                        if ((599187 & i3) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                modifier3 = companion;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final String str32 = str2;
                                z2 = z3;
                                painter2 = painter3;
                                int i102 = i7 >> 3;
                                Modifier modifier52 = modifier3;
                                composer2 = composerStartRestartGroup;
                                Shape shape32 = circleShape;
                                IconWrapperBox(modifier52, iconSize3, shape32, ComposableLambdaKt.rememberComposableLambda(-1200239329, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        if ((i11 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1200239329, i11, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous> (ShapedIcon.kt:75)");
                                            }
                                            Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, z3 ? iconSize3.getSize() : iconSize3.getPaddedSize());
                                            ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composer3.consume(localImageLoader);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            StripeImageLoader stripeImageLoader = (StripeImageLoader) objConsume;
                                            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.stripe_ic_person, composer3, 0);
                                            ContentScale crop = ContentScale.INSTANCE.getCrop();
                                            String str4 = url;
                                            String str5 = str32;
                                            final Painter painter42 = painter3;
                                            final IconSize iconSize5 = iconSize3;
                                            final String str6 = str32;
                                            StripeImageKt.StripeImage(str4, stripeImageLoader, str5, modifierM1065size3ABfNKs, crop, null, painterPainterResource, null, false, ComposableLambdaKt.rememberComposableLambda(-1183890906, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt.ShapedIcon.3.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer4, Integer num) {
                                                    invoke(boxWithConstraintsScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer4, int i12) {
                                                    Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                                                    if ((i12 & 17) != 16 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1183890906, i12, -1, "com.stripe.android.financialconnections.features.common.ShapedIcon.<anonymous>.<anonymous> (ShapedIcon.kt:84)");
                                                        }
                                                        Painter painter5 = painter42;
                                                        if (painter5 != null) {
                                                            ShapedIconKt.LocalIcon(iconSize5, painter5, str6, composer4, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }, composer3, 54), null, composer3, (StripeImageLoader.$stable << 3) | 805330944, 0, 1440);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, (i102 & 896) | (i102 & 14) | 3072 | (i102 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                shape2 = shape32;
                                iconSize4 = iconSize3;
                                modifier4 = modifier52;
                            }
                        }
                        final Painter painter42 = painter2;
                        final boolean z42 = z2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    painter2 = painter;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                    }
                    z2 = z;
                    if ((599187 & i3) == 599186) {
                    }
                    final Painter painter422 = painter2;
                    final boolean z422 = z2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str2 = str;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                painter2 = painter;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                if ((599187 & i3) == 599186) {
                }
                final Painter painter4222 = painter2;
                final boolean z4222 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            iconSize2 = iconSize;
            if ((i & 3072) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            str2 = str;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            painter2 = painter;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            if ((599187 & i3) == 599186) {
            }
            final Painter painter42222 = painter2;
            final boolean z42222 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        iconSize2 = iconSize;
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        str2 = str;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        painter2 = painter;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        if ((599187 & i3) == 599186) {
        }
        final Painter painter422222 = painter2;
        final boolean z422222 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LocalIcon(final IconSize iconSize, Painter painter, String str, Composer composer, final int i) {
        int i2;
        final Painter painter2;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-202466975);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconSize) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(painter) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202466975, i2, -1, "com.stripe.android.financialconnections.features.common.LocalIcon (ShapedIcon.kt:102)");
            }
            painter2 = painter;
            str2 = str;
            IconKt.m1925Iconww6aTOc(painter2, str2, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, iconSize.getPaddedSize()), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7637getIconTint0d7_KjU(), composerStartRestartGroup, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            painter2 = painter;
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShapedIconKt.LocalIcon$lambda$2(iconSize, painter2, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void IconWrapperBox(Modifier modifier, final IconSize iconSize, final Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-352947287);
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
            i3 |= composerStartRestartGroup.changed(iconSize) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-352947287, i3, -1, "com.stripe.android.financialconnections.features.common.IconWrapperBox (ShapedIcon.kt:117)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m574backgroundbw27NRU(SizeKt.m1065size3ABfNKs(modifier, iconSize.getSize()), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7636getIconBackground0d7_KjU(), shape), shape);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
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
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 9) & 14));
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
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ShapedIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShapedIconKt.IconWrapperBox$lambda$4(modifier2, iconSize, shape, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
