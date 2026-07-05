package com.google.accompanist.themeadapter.material;

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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.res.TypedArrayKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.google.accompanist.themeadapter.core.FontFamilyWithWeight;
import com.google.accompanist.themeadapter.core.ResourceUtilsKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MdcTheme.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aT\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00060\bR\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"emptyShapes", "Landroidx/compose/material/Shapes;", "sThemeGetKeyMethod", "Ljava/lang/reflect/Method;", "sThemeGetKeyMethodFetched", "", SDKConstants.PARAM_KEY, "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getKey", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "MdcTheme", "", "context", "Landroid/content/Context;", "readColors", "readTypography", "readShapes", "setTextColors", "setDefaultFontFamily", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroid/content/Context;ZZZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "createMdcTheme", "Lcom/google/accompanist/themeadapter/material/ThemeParameters;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "themeadapter-material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MdcTheme {
    private static final Shapes emptyShapes = new Shapes(null, null, null, 7, null);
    private static Method sThemeGetKeyMethod;
    private static boolean sThemeGetKeyMethodFetched;

    /* JADX WARN: Removed duplicated region for block: B:100:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @Deprecated(message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MdcTheme(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z6;
        int i3;
        boolean z7;
        int i4;
        boolean z8;
        int i5;
        boolean z9;
        int i6;
        boolean z10;
        int i7;
        Context context2;
        Context context3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Resources.Theme theme;
        Method method;
        Object theme2;
        LayoutDirection layoutDirection;
        boolean zChanged;
        Object objRememberedValue;
        Colors colors;
        Typography typography;
        Shapes shapes;
        final Context context4;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        final boolean z19;
        final boolean z20;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1864238106);
        int i9 = i2 & 1;
        int i10 = i9 != 0 ? i | 2 : i;
        int i11 = i2 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                z6 = z;
                i10 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 == 0) {
                i10 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    z7 = z2;
                    i10 |= composerStartRestartGroup.changed(z7) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 != 0) {
                    i10 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        z8 = z3;
                        i10 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
                    }
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i10 |= 24576;
                    } else {
                        if ((57344 & i) == 0) {
                            z9 = z4;
                            i10 |= composerStartRestartGroup.changed(z9) ? 16384 : 8192;
                        }
                        i6 = i2 & 32;
                        if (i6 != 0) {
                            i10 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            if ((458752 & i) == 0) {
                                z10 = z5;
                                i10 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
                            }
                            if ((i2 & 64) != 0) {
                                i8 = (i & 3670016) == 0 ? composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288 : 1572864;
                                if (i9 == 1) {
                                    i7 = i9;
                                    if ((i10 & 2995931) == 599186 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        context4 = context;
                                        z16 = z6;
                                        z17 = z7;
                                        z18 = z8;
                                        z19 = z9;
                                        z20 = z10;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material.MdcTheme.MdcTheme.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i12) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                                                MdcTheme.MdcTheme(context4, z16, z17, z18, z19, z20, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i7 = i9;
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i7 == 0) {
                                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localContext);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        context2 = (Context) objConsume;
                                        i10 &= -15;
                                    } else {
                                        context2 = context;
                                    }
                                    if (i11 != 0) {
                                        z6 = true;
                                    }
                                    if (i3 != 0) {
                                        z7 = true;
                                    }
                                    if (i4 != 0) {
                                        z8 = true;
                                    }
                                    if (i5 != 0) {
                                        z9 = false;
                                    }
                                    context3 = context2;
                                    z11 = z6;
                                    z12 = z7;
                                    z13 = z8;
                                    z14 = z9;
                                    if (i6 == 0) {
                                        z15 = false;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1864238106, i10, -1, "com.google.accompanist.themeadapter.material.MdcTheme (MdcTheme.kt:90)");
                                    }
                                    theme = context3.getTheme();
                                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                    if (!sThemeGetKeyMethodFetched) {
                                        try {
                                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                                            declaredMethod.setAccessible(true);
                                            sThemeGetKeyMethod = declaredMethod;
                                        } catch (ReflectiveOperationException unused) {
                                        }
                                        sThemeGetKeyMethodFetched = true;
                                    }
                                    method = sThemeGetKeyMethod;
                                    theme2 = null;
                                    if (method != null && method != null) {
                                        try {
                                            theme2 = method.invoke(theme, new Object[0]);
                                        } catch (ReflectiveOperationException unused2) {
                                            theme2 = Unit.INSTANCE;
                                        }
                                    }
                                    if (theme2 == null) {
                                        theme2 = context3.getTheme();
                                    }
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    layoutDirection = (LayoutDirection) objConsume2;
                                    composerStartRestartGroup.startReplaceableGroup(-535944850);
                                    zChanged = composerStartRestartGroup.changed(theme2);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = createMdcTheme$default(context3, layoutDirection, null, z11, z12, z13, z14, z15, 4, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ThemeParameters themeParameters = (ThemeParameters) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colors = themeParameters.getColors();
                                    composerStartRestartGroup.startReplaceableGroup(-535944461);
                                    if (colors == null) {
                                        colors = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    Colors colors2 = colors;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    typography = themeParameters.getTypography();
                                    composerStartRestartGroup.startReplaceableGroup(-535944396);
                                    if (typography == null) {
                                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    Typography typography2 = typography;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shapes = themeParameters.getShapes();
                                    composerStartRestartGroup.startReplaceableGroup(-535944327);
                                    if (shapes == null) {
                                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    MaterialThemeKt.MaterialTheme(colors2, typography2, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material.MdcTheme.MdcTheme.1
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

                                        public final void invoke(Composer composer2, int i12) {
                                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-125411654, i12, -1, "com.google.accompanist.themeadapter.material.MdcTheme.<anonymous> (MdcTheme.kt:121)");
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
                                    }), composerStartRestartGroup, 3072, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    context4 = context3;
                                    z16 = z11;
                                    z17 = z12;
                                    z18 = z13;
                                    z19 = z14;
                                    z20 = z15;
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if (i7 != 0) {
                                        i10 &= -15;
                                    }
                                    context3 = context;
                                    z11 = z6;
                                    z12 = z7;
                                    z13 = z8;
                                    z14 = z9;
                                }
                                z15 = z10;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                theme = context3.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!sThemeGetKeyMethodFetched) {
                                }
                                method = sThemeGetKeyMethod;
                                theme2 = null;
                                if (method != null) {
                                    theme2 = method.invoke(theme, new Object[0]);
                                }
                                if (theme2 == null) {
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume22 = composerStartRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                layoutDirection = (LayoutDirection) objConsume22;
                                composerStartRestartGroup.startReplaceableGroup(-535944850);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdcTheme$default(context3, layoutDirection, null, z11, z12, z13, z14, z15, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    ThemeParameters themeParameters2 = (ThemeParameters) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colors = themeParameters2.getColors();
                                    composerStartRestartGroup.startReplaceableGroup(-535944461);
                                    if (colors == null) {
                                    }
                                    Colors colors22 = colors;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    typography = themeParameters2.getTypography();
                                    composerStartRestartGroup.startReplaceableGroup(-535944396);
                                    if (typography == null) {
                                    }
                                    Typography typography22 = typography;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shapes = themeParameters2.getShapes();
                                    composerStartRestartGroup.startReplaceableGroup(-535944327);
                                    if (shapes == null) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    MaterialThemeKt.MaterialTheme(colors22, typography22, shapes, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -125411654, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material.MdcTheme.MdcTheme.1
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

                                        public final void invoke(Composer composer2, int i12) {
                                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-125411654, i12, -1, "com.google.accompanist.themeadapter.material.MdcTheme.<anonymous> (MdcTheme.kt:121)");
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
                                    }), composerStartRestartGroup, 3072, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    context4 = context3;
                                    z16 = z11;
                                    z17 = z12;
                                    z18 = z13;
                                    z19 = z14;
                                    z20 = z15;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i10 |= i8;
                            if (i9 == 1) {
                            }
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0) {
                                if (i7 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i3 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                context3 = context2;
                                z11 = z6;
                                z12 = z7;
                                z13 = z8;
                                z14 = z9;
                                if (i6 == 0) {
                                    z15 = z10;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                theme = context3.getTheme();
                                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                                if (!sThemeGetKeyMethodFetched) {
                                }
                                method = sThemeGetKeyMethod;
                                theme2 = null;
                                if (method != null) {
                                }
                                if (theme2 == null) {
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume222 = composerStartRestartGroup.consume(localLayoutDirection22);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                layoutDirection = (LayoutDirection) objConsume222;
                                composerStartRestartGroup.startReplaceableGroup(-535944850);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z10 = z5;
                        if ((i2 & 64) != 0) {
                        }
                        i10 |= i8;
                        if (i9 == 1) {
                        }
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z9 = z4;
                    i6 = i2 & 32;
                    if (i6 != 0) {
                    }
                    z10 = z5;
                    if ((i2 & 64) != 0) {
                    }
                    i10 |= i8;
                    if (i9 == 1) {
                    }
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z8 = z3;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                z9 = z4;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                z10 = z5;
                if ((i2 & 64) != 0) {
                }
                i10 |= i8;
                if (i9 == 1) {
                }
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z7 = z2;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            z8 = z3;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z9 = z4;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z10 = z5;
            if ((i2 & 64) != 0) {
            }
            i10 |= i8;
            if (i9 == 1) {
            }
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z6 = z;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z7 = z2;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z8 = z3;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z9 = z4;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z10 = z5;
        if ((i2 & 64) != 0) {
        }
        i10 |= i8;
        if (i9 == 1) {
        }
        composerStartRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static /* synthetic */ ThemeParameters createMdcTheme$default(Context context, LayoutDirection layoutDirection, Density density, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        return createMdcTheme(context, layoutDirection, (i & 4) != 0 ? AndroidDensity_androidKt.Density(context) : density, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) == 0 ? z3 : true, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    @Deprecated(message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ThemeParameters createMdcTheme(Context context, LayoutDirection layoutDirection, Density density, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Resources.NotFoundException {
        Colors colorsM1852darkColors2qZNXz8;
        Typography typographyMerge;
        Shapes shapes;
        FontFamily fontFamily;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.ThemeAdapterMaterialTheme);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.ThemeAdapterMaterialTheme_isMaterialTheme)) {
            throw new IllegalArgumentException("createMdcTheme requires the host context's theme to extend Theme.MaterialComponents".toString());
        }
        if (z) {
            long jM7003parseColormxwnekA$default = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorPrimary, 0L, 2, null);
            long jM7003parseColormxwnekA$default2 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorPrimaryVariant, 0L, 2, null);
            long jM7003parseColormxwnekA$default3 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnPrimary, 0L, 2, null);
            long jM7003parseColormxwnekA$default4 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSecondary, 0L, 2, null);
            long jM7003parseColormxwnekA$default5 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSecondaryVariant, 0L, 2, null);
            long jM7003parseColormxwnekA$default6 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnSecondary, 0L, 2, null);
            long jM7003parseColormxwnekA$default7 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_android_colorBackground, 0L, 2, null);
            long jM7003parseColormxwnekA$default8 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnBackground, 0L, 2, null);
            long jM7003parseColormxwnekA$default9 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorSurface, 0L, 2, null);
            long jM7003parseColormxwnekA$default10 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnSurface, 0L, 2, null);
            long jM7003parseColormxwnekA$default11 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorError, 0L, 2, null);
            long jM7003parseColormxwnekA$default12 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_colorOnError, 0L, 2, null);
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeAdapterMaterialTheme_isLightTheme, true)) {
                colorsM1852darkColors2qZNXz8 = ColorsKt.m1854lightColors2qZNXz8(jM7003parseColormxwnekA$default, jM7003parseColormxwnekA$default2, jM7003parseColormxwnekA$default4, jM7003parseColormxwnekA$default5, jM7003parseColormxwnekA$default7, jM7003parseColormxwnekA$default9, jM7003parseColormxwnekA$default11, jM7003parseColormxwnekA$default3, jM7003parseColormxwnekA$default6, jM7003parseColormxwnekA$default8, jM7003parseColormxwnekA$default10, jM7003parseColormxwnekA$default12);
            } else {
                colorsM1852darkColors2qZNXz8 = ColorsKt.m1852darkColors2qZNXz8(jM7003parseColormxwnekA$default, jM7003parseColormxwnekA$default2, jM7003parseColormxwnekA$default4, jM7003parseColormxwnekA$default5, jM7003parseColormxwnekA$default7, jM7003parseColormxwnekA$default9, jM7003parseColormxwnekA$default11, jM7003parseColormxwnekA$default3, jM7003parseColormxwnekA$default6, jM7003parseColormxwnekA$default8, jM7003parseColormxwnekA$default10, jM7003parseColormxwnekA$default12);
            }
        } else {
            colorsM1852darkColors2qZNXz8 = null;
        }
        if (!z2) {
            typographyMerge = null;
        } else if (z5) {
            FontFamilyWithWeight fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_fontFamily);
            if (fontFamily2 == null) {
                fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_android_fontFamily);
            }
            if (fontFamily2 != null) {
                fontFamily = fontFamily2.getFontFamily();
            }
            typographyMerge = TypographyKt.merge(new Typography(fontFamily != null ? FontFamily.INSTANCE.getDefault() : fontFamily, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline3), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline4), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline5), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline6), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceButton), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceCaption), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceOverline), density, z4, fontFamily));
        } else {
            fontFamily = null;
            typographyMerge = TypographyKt.merge(new Typography(fontFamily != null ? FontFamily.INSTANCE.getDefault() : fontFamily, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline3), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline4), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline5), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceHeadline6), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceSubtitle2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody1), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceBody2), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceButton), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceCaption), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_textAppearanceOverline), density, z4, fontFamily));
        }
        if (z3) {
            int resourceIdOrThrow = TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceSmallComponent);
            Shapes shapes2 = emptyShapes;
            shapes = new Shapes(ResourceUtilsKt.parseShapeAppearance(context, resourceIdOrThrow, layoutDirection, shapes2.getSmall()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceMediumComponent), layoutDirection, shapes2.getMedium()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterialTheme_shapeAppearanceLargeComponent), layoutDirection, shapes2.getLarge()));
        } else {
            shapes = null;
        }
        ThemeParameters themeParameters = new ThemeParameters(colorsM1852darkColors2qZNXz8, typographyMerge, shapes);
        typedArrayObtainStyledAttributes.recycle();
        return themeParameters;
    }

    private static final Object getKey(Resources.Theme theme) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!sThemeGetKeyMethodFetched) {
            try {
                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", new Class[0]);
                declaredMethod.setAccessible(true);
                sThemeGetKeyMethod = declaredMethod;
            } catch (ReflectiveOperationException unused) {
            }
            sThemeGetKeyMethodFetched = true;
        }
        Method method = sThemeGetKeyMethod;
        Object objInvoke = null;
        if (method == null) {
            return null;
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(theme, new Object[0]);
            } catch (ReflectiveOperationException unused2) {
                return Unit.INSTANCE;
            }
        }
        return objInvoke;
    }
}
