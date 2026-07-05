package com.google.accompanist.themeadapter.appcompat;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.Typography;
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
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.accompanist.themeadapter.core.FontFamilyWithWeight;
import com.google.accompanist.themeadapter.core.ResourceUtilsKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppCompatTheme.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a \u0010\r\u001a\u00020\u000e*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u000f"}, d2 = {"AppCompatTheme", "", "context", "Landroid/content/Context;", "readColors", "", "readTypography", PaymentSheetAppearanceKeys.SHAPES, "Landroidx/compose/material/Shapes;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroid/content/Context;ZZLandroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "createAppCompatTheme", "Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;", "themeadapter-appcompat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppCompatTheme {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppCompatTheme(Context context, boolean z, boolean z2, Shapes shapes, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        boolean z3;
        Shapes shapes2;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue;
        Colors colors;
        Typography typography;
        final boolean z5;
        final Shapes shapes3;
        final boolean z6;
        final Context context2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(684274148);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                z3 = z2;
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    shapes2 = shapes;
                    int i7 = composerStartRestartGroup.changed(shapes2) ? 2048 : 1024;
                    i4 |= i7;
                } else {
                    shapes2 = shapes;
                }
                i4 |= i7;
            } else {
                shapes2 = shapes;
            }
            if ((i2 & 16) == 0) {
                i4 |= 24576;
            } else if ((57344 & i) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if (i3 == 1 || (46811 & i4) != 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i3 != 0) {
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        context = (Context) objConsume;
                        i4 &= -15;
                    }
                    if (i5 != 0) {
                        z = true;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i3 != 0) {
                        i4 &= -15;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                }
                z4 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(684274148, i4, -1, "com.google.accompanist.themeadapter.appcompat.AppCompatTheme (AppCompatTheme.kt:114)");
                }
                Resources.Theme theme = context.getTheme();
                composerStartRestartGroup.startReplaceableGroup(-771108958);
                zChanged = composerStartRestartGroup.changed(theme);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = createAppCompatTheme(context, z, z4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ThemeParameters themeParameters = (ThemeParameters) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                colors = themeParameters.getColors();
                composerStartRestartGroup.startReplaceableGroup(-771108760);
                if (colors == null) {
                    colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                }
                Colors colors2 = colors;
                composerStartRestartGroup.endReplaceableGroup();
                typography = themeParameters.getTypography();
                composerStartRestartGroup.startReplaceableGroup(-771108695);
                if (typography == null) {
                    typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Shapes shapes4 = shapes2;
                MaterialThemeKt.MaterialTheme(colors2, typography, shapes4, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -568844616, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.appcompat.AppCompatTheme.AppCompatTheme.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-568844616, i8, -1, "com.google.accompanist.themeadapter.appcompat.AppCompatTheme.<anonymous> (AppCompatTheme.kt:129)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1828getOnBackground0d7_KjU())), content, composer2, ProvidedValue.$stable);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i4 >> 3) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                shapes3 = shapes4;
                z6 = z;
                context2 = context;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z5 = z3;
                shapes3 = shapes2;
                context2 = context;
                z6 = z;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.appcompat.AppCompatTheme.AppCompatTheme.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) throws Resources.NotFoundException {
                        AppCompatTheme.AppCompatTheme(context2, z6, z5, shapes3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        z3 = z2;
        if ((i & 7168) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i3 == 1) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i3 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                z4 = z3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Resources.Theme theme2 = context.getTheme();
                composerStartRestartGroup.startReplaceableGroup(-771108958);
                zChanged = composerStartRestartGroup.changed(theme2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = createAppCompatTheme(context, z, z4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    ThemeParameters themeParameters2 = (ThemeParameters) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    colors = themeParameters2.getColors();
                    composerStartRestartGroup.startReplaceableGroup(-771108760);
                    if (colors == null) {
                    }
                    Colors colors22 = colors;
                    composerStartRestartGroup.endReplaceableGroup();
                    typography = themeParameters2.getTypography();
                    composerStartRestartGroup.startReplaceableGroup(-771108695);
                    if (typography == null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Shapes shapes42 = shapes2;
                    MaterialThemeKt.MaterialTheme(colors22, typography, shapes42, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -568844616, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.appcompat.AppCompatTheme.AppCompatTheme.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-568844616, i8, -1, "com.google.accompanist.themeadapter.appcompat.AppCompatTheme.<anonymous> (AppCompatTheme.kt:129)");
                                }
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1828getOnBackground0d7_KjU())), content, composer2, ProvidedValue.$stable);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i4 >> 3) & 896) | 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    shapes3 = shapes42;
                    z6 = z;
                    context2 = context;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static /* synthetic */ ThemeParameters createAppCompatTheme$default(Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return createAppCompatTheme(context, z, z2);
    }

    @Deprecated(message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n")
    public static final ThemeParameters createAppCompatTheme(Context context, boolean z, boolean z2) throws Resources.NotFoundException {
        Colors colorsM1825copypvPzIIM;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.ThemeAdapterAppCompatTheme);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.ThemeAdapterAppCompatTheme_windowActionBar)) {
            throw new IllegalArgumentException("createAppCompatTheme requires the host context's theme to extend Theme.AppCompat".toString());
        }
        Typography typography = null;
        if (z) {
            Colors colorsM1855lightColors2qZNXz8$default = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeAdapterAppCompatTheme_isLightTheme, true) ? ColorsKt.m1855lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null) : ColorsKt.m1853darkColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
            long jM7003parseColormxwnekA$default = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_colorPrimary, 0L, 2, null);
            long jM7003parseColormxwnekA$default2 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_colorPrimaryDark, 0L, 2, null);
            long jM7000calculateOnColor8_81llA = ColorKt.m7000calculateOnColor8_81llA(jM7003parseColormxwnekA$default);
            long jM7003parseColormxwnekA$default3 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_colorAccent, 0L, 2, null);
            long jM7000calculateOnColor8_81llA2 = ColorKt.m7000calculateOnColor8_81llA(jM7003parseColormxwnekA$default3);
            long jM7003parseColormxwnekA$default4 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_android_textColorPrimary, 0L, 2, null);
            long jM3656copywmQWz5c$default = !Color.m3658equalsimpl0(jM7003parseColormxwnekA$default4, Color.INSTANCE.m3693getUnspecified0d7_KjU()) ? Color.m3656copywmQWz5c$default(jM7003parseColormxwnekA$default4, 1.0f, 0.0f, 0.0f, 0.0f, 14, null) : jM7003parseColormxwnekA$default4;
            long jM1837getSurface0d7_KjU = colorsM1855lightColors2qZNXz8$default.m1837getSurface0d7_KjU();
            long jM7001calculateOnColorWithTextColorPrimaryOWjLjI = ColorKt.m7001calculateOnColorWithTextColorPrimaryOWjLjI(jM1837getSurface0d7_KjU, jM3656copywmQWz5c$default);
            long jM7003parseColormxwnekA$default5 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_android_colorBackground, 0L, 2, null);
            long jM7001calculateOnColorWithTextColorPrimaryOWjLjI2 = ColorKt.m7001calculateOnColorWithTextColorPrimaryOWjLjI(jM7003parseColormxwnekA$default5, jM3656copywmQWz5c$default);
            long jM7003parseColormxwnekA$default6 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_colorError, 0L, 2, null);
            long jM7000calculateOnColor8_81llA3 = ColorKt.m7000calculateOnColor8_81llA(jM7003parseColormxwnekA$default6);
            Colors colors = colorsM1855lightColors2qZNXz8$default;
            colorsM1825copypvPzIIM = colors.m1825copypvPzIIM((8126 & 1) != 0 ? colors.m1833getPrimary0d7_KjU() : jM7003parseColormxwnekA$default, (8126 & 2) != 0 ? colors.m1834getPrimaryVariant0d7_KjU() : jM7003parseColormxwnekA$default2, (8126 & 4) != 0 ? colors.m1835getSecondary0d7_KjU() : jM7003parseColormxwnekA$default3, (8126 & 8) != 0 ? colors.m1836getSecondaryVariant0d7_KjU() : jM7003parseColormxwnekA$default3, (8126 & 16) != 0 ? colors.m1826getBackground0d7_KjU() : jM7003parseColormxwnekA$default5, (8126 & 32) != 0 ? colors.m1837getSurface0d7_KjU() : jM1837getSurface0d7_KjU, (8126 & 64) != 0 ? colors.m1827getError0d7_KjU() : jM7003parseColormxwnekA$default6, (8126 & 128) != 0 ? colors.m1830getOnPrimary0d7_KjU() : jM7000calculateOnColor8_81llA, (8126 & 256) != 0 ? colors.m1831getOnSecondary0d7_KjU() : jM7000calculateOnColor8_81llA2, (8126 & 512) != 0 ? colors.m1828getOnBackground0d7_KjU() : jM7001calculateOnColorWithTextColorPrimaryOWjLjI2, (8126 & 1024) != 0 ? colors.m1832getOnSurface0d7_KjU() : jM7001calculateOnColorWithTextColorPrimaryOWjLjI, (8126 & 2048) != 0 ? colors.m1829getOnError0d7_KjU() : jM7000calculateOnColor8_81llA3, (8126 & 4096) != 0 ? colors.isLight() : false);
        } else {
            colorsM1825copypvPzIIM = null;
        }
        if (z2) {
            FontFamilyWithWeight fontFamily = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_fontFamily);
            if (fontFamily == null) {
                fontFamily = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterAppCompatTheme_android_fontFamily);
            }
            if (fontFamily != null) {
                typography = new Typography(fontFamily.getFontFamily(), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
            }
        }
        ThemeParameters themeParameters = new ThemeParameters(colorsM1825copypvPzIIM, typography);
        typedArrayObtainStyledAttributes.recycle();
        return themeParameters;
    }
}
