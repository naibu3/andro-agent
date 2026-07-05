package com.google.accompanist.themeadapter.material3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
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

/* compiled from: Mdc3Theme.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aT\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00060\bR\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"emptyShapes", "Landroidx/compose/material3/Shapes;", "sThemeGetKeyMethod", "Ljava/lang/reflect/Method;", "sThemeGetKeyMethodFetched", "", SDKConstants.PARAM_KEY, "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "getKey", "(Landroid/content/res/Resources$Theme;)Ljava/lang/Object;", "Mdc3Theme", "", "context", "Landroid/content/Context;", "readColorScheme", "readTypography", "readShapes", "setTextColors", "setDefaultFontFamily", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroid/content/Context;ZZZZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "createMdc3Theme", "Lcom/google/accompanist/themeadapter/material3/Theme3Parameters;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "themeadapter-material3_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Mdc3Theme {
    private static final Shapes emptyShapes = new Shapes(null, null, null, null, null, 31, null);
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
    public static final void Mdc3Theme(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
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
        ColorScheme colorScheme;
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
        Composer composerStartRestartGroup = composer.startRestartGroup(1697610479);
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
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material3.Mdc3Theme.Mdc3Theme.2
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
                                                Mdc3Theme.Mdc3Theme(context4, z16, z17, z18, z19, z20, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                                        ComposerKt.traceEventStart(1697610479, i10, -1, "com.google.accompanist.themeadapter.material3.Mdc3Theme (Mdc3Theme.kt:83)");
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
                                    composerStartRestartGroup.startReplaceableGroup(-629742027);
                                    zChanged = composerStartRestartGroup.changed(theme2);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = createMdc3Theme$default(context3, layoutDirection, null, z11, z12, z13, z14, z15, 4, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    Theme3Parameters theme3Parameters = (Theme3Parameters) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colorScheme = theme3Parameters.getColorScheme();
                                    composerStartRestartGroup.startReplaceableGroup(-629741622);
                                    if (colorScheme == null) {
                                        colorScheme = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    ColorScheme colorScheme2 = colorScheme;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    typography = theme3Parameters.getTypography();
                                    composerStartRestartGroup.startReplaceableGroup(-629741547);
                                    if (typography == null) {
                                        typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    Typography typography2 = typography;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shapes = theme3Parameters.getShapes();
                                    composerStartRestartGroup.startReplaceableGroup(-629741478);
                                    if (shapes == null) {
                                        shapes = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    MaterialThemeKt.MaterialTheme(colorScheme2, shapes, typography2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1475884955, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material3.Mdc3Theme.Mdc3Theme.1
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
                                                    ComposerKt.traceEventStart(1475884955, i12, -1, "com.google.accompanist.themeadapter.material3.Mdc3Theme.<anonymous> (Mdc3Theme.kt:114)");
                                                }
                                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m2176getOnBackground0d7_KjU())), content, composer2, ProvidedValue.$stable);
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
                                composerStartRestartGroup.startReplaceableGroup(-629742027);
                                zChanged = composerStartRestartGroup.changed(theme2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = createMdc3Theme$default(context3, layoutDirection, null, z11, z12, z13, z14, z15, 4, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    Theme3Parameters theme3Parameters2 = (Theme3Parameters) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    colorScheme = theme3Parameters2.getColorScheme();
                                    composerStartRestartGroup.startReplaceableGroup(-629741622);
                                    if (colorScheme == null) {
                                    }
                                    ColorScheme colorScheme22 = colorScheme;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    typography = theme3Parameters2.getTypography();
                                    composerStartRestartGroup.startReplaceableGroup(-629741547);
                                    if (typography == null) {
                                    }
                                    Typography typography22 = typography;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shapes = theme3Parameters2.getShapes();
                                    composerStartRestartGroup.startReplaceableGroup(-629741478);
                                    if (shapes == null) {
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    MaterialThemeKt.MaterialTheme(colorScheme22, shapes, typography22, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1475884955, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.themeadapter.material3.Mdc3Theme.Mdc3Theme.1
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
                                                    ComposerKt.traceEventStart(1475884955, i12, -1, "com.google.accompanist.themeadapter.material3.Mdc3Theme.<anonymous> (Mdc3Theme.kt:114)");
                                                }
                                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m2176getOnBackground0d7_KjU())), content, composer2, ProvidedValue.$stable);
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
                                composerStartRestartGroup.startReplaceableGroup(-629742027);
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

    public static /* synthetic */ Theme3Parameters createMdc3Theme$default(Context context, LayoutDirection layoutDirection, Density density, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        return createMdc3Theme(context, layoutDirection, (i & 4) != 0 ? AndroidDensity_androidKt.Density(context) : density, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) == 0 ? z3 : true, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x010b  */
    @Deprecated(message = "\n   Material ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-material/\n")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Theme3Parameters createMdc3Theme(Context context, LayoutDirection layoutDirection, Density density, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Resources.NotFoundException {
        ColorScheme colorSchemeM2231darkColorSchemeG1PFcw;
        Typography typography;
        Shapes shapes;
        FontFamily fontFamily;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.ThemeAdapterMaterial3Theme);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.ThemeAdapterMaterial3Theme_isMaterial3Theme)) {
            throw new IllegalArgumentException("createMdc3Theme requires the host context's theme to extend Theme.Material3".toString());
        }
        if (z) {
            long jM7003parseColormxwnekA$default = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorPrimary, 0L, 2, null);
            long jM7003parseColormxwnekA$default2 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnPrimary, 0L, 2, null);
            long jM7003parseColormxwnekA$default3 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorPrimaryInverse, 0L, 2, null);
            long jM7003parseColormxwnekA$default4 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorPrimaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default5 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnPrimaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default6 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorSecondary, 0L, 2, null);
            long jM7003parseColormxwnekA$default7 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnSecondary, 0L, 2, null);
            long jM7003parseColormxwnekA$default8 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorSecondaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default9 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnSecondaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default10 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorTertiary, 0L, 2, null);
            long jM7003parseColormxwnekA$default11 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnTertiary, 0L, 2, null);
            long jM7003parseColormxwnekA$default12 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorTertiaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default13 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnTertiaryContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default14 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_android_colorBackground, 0L, 2, null);
            long jM7003parseColormxwnekA$default15 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnBackground, 0L, 2, null);
            long jM7003parseColormxwnekA$default16 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorSurface, 0L, 2, null);
            long jM7003parseColormxwnekA$default17 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnSurface, 0L, 2, null);
            long jM7003parseColormxwnekA$default18 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorSurfaceVariant, 0L, 2, null);
            long jM7003parseColormxwnekA$default19 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnSurfaceVariant, 0L, 2, null);
            long jM7003parseColormxwnekA$default20 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_elevationOverlayColor, 0L, 2, null);
            long jM7003parseColormxwnekA$default21 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorSurfaceInverse, 0L, 2, null);
            long jM7003parseColormxwnekA$default22 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnSurfaceInverse, 0L, 2, null);
            long jM7003parseColormxwnekA$default23 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOutline, 0L, 2, null);
            long jM7003parseColormxwnekA$default24 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOutlineVariant, 0L, 2, null);
            long jM7003parseColormxwnekA$default25 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorError, 0L, 2, null);
            long jM7003parseColormxwnekA$default26 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnError, 0L, 2, null);
            long jM7003parseColormxwnekA$default27 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorErrorContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default28 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_colorOnErrorContainer, 0L, 2, null);
            long jM7003parseColormxwnekA$default29 = ResourceUtilsKt.m7003parseColormxwnekA$default(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_scrimBackground, 0L, 2, null);
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.ThemeAdapterMaterial3Theme_isLightTheme, true)) {
                colorSchemeM2231darkColorSchemeG1PFcw = ColorSchemeKt.m2233lightColorSchemeG1PFcw(jM7003parseColormxwnekA$default, jM7003parseColormxwnekA$default2, jM7003parseColormxwnekA$default4, jM7003parseColormxwnekA$default5, jM7003parseColormxwnekA$default3, jM7003parseColormxwnekA$default6, jM7003parseColormxwnekA$default7, jM7003parseColormxwnekA$default8, jM7003parseColormxwnekA$default9, jM7003parseColormxwnekA$default10, jM7003parseColormxwnekA$default11, jM7003parseColormxwnekA$default12, jM7003parseColormxwnekA$default13, jM7003parseColormxwnekA$default14, jM7003parseColormxwnekA$default15, jM7003parseColormxwnekA$default16, jM7003parseColormxwnekA$default17, jM7003parseColormxwnekA$default18, jM7003parseColormxwnekA$default19, jM7003parseColormxwnekA$default20, jM7003parseColormxwnekA$default21, jM7003parseColormxwnekA$default22, jM7003parseColormxwnekA$default25, jM7003parseColormxwnekA$default26, jM7003parseColormxwnekA$default27, jM7003parseColormxwnekA$default28, jM7003parseColormxwnekA$default23, jM7003parseColormxwnekA$default24, jM7003parseColormxwnekA$default29);
            } else {
                colorSchemeM2231darkColorSchemeG1PFcw = ColorSchemeKt.m2231darkColorSchemeG1PFcw(jM7003parseColormxwnekA$default, jM7003parseColormxwnekA$default2, jM7003parseColormxwnekA$default4, jM7003parseColormxwnekA$default5, jM7003parseColormxwnekA$default3, jM7003parseColormxwnekA$default6, jM7003parseColormxwnekA$default7, jM7003parseColormxwnekA$default8, jM7003parseColormxwnekA$default9, jM7003parseColormxwnekA$default10, jM7003parseColormxwnekA$default11, jM7003parseColormxwnekA$default12, jM7003parseColormxwnekA$default13, jM7003parseColormxwnekA$default14, jM7003parseColormxwnekA$default15, jM7003parseColormxwnekA$default16, jM7003parseColormxwnekA$default17, jM7003parseColormxwnekA$default18, jM7003parseColormxwnekA$default19, jM7003parseColormxwnekA$default20, jM7003parseColormxwnekA$default21, jM7003parseColormxwnekA$default22, jM7003parseColormxwnekA$default25, jM7003parseColormxwnekA$default26, jM7003parseColormxwnekA$default27, jM7003parseColormxwnekA$default28, jM7003parseColormxwnekA$default23, jM7003parseColormxwnekA$default24, jM7003parseColormxwnekA$default29);
            }
        } else {
            colorSchemeM2231darkColorSchemeG1PFcw = null;
        }
        if (!z2) {
            typography = null;
        } else if (z5) {
            FontFamilyWithWeight fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_fontFamily);
            if (fontFamily2 == null) {
                fontFamily2 = ResourceUtilsKt.parseFontFamily(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_android_fontFamily);
            }
            if (fontFamily2 != null) {
                fontFamily = fontFamily2.getFontFamily();
            }
            typography = new Typography(ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplayLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplayMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplaySmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineSmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleSmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodyLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodyMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodySmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelSmall), density, z4, fontFamily));
        } else {
            fontFamily = null;
            typography = new Typography(ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplayLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplayMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceDisplaySmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceHeadlineSmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceTitleSmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodyLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodyMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceBodySmall), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelLarge), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelMedium), density, z4, fontFamily), ResourceUtilsKt.parseTextAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_textAppearanceLabelSmall), density, z4, fontFamily));
        }
        if (z3) {
            int resourceIdOrThrow = TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_shapeAppearanceCornerExtraSmall);
            Shapes shapes2 = emptyShapes;
            shapes = new Shapes(ResourceUtilsKt.parseShapeAppearance(context, resourceIdOrThrow, layoutDirection, shapes2.getExtraSmall()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_shapeAppearanceCornerSmall), layoutDirection, shapes2.getSmall()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_shapeAppearanceCornerMedium), layoutDirection, shapes2.getMedium()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_shapeAppearanceCornerLarge), layoutDirection, shapes2.getLarge()), ResourceUtilsKt.parseShapeAppearance(context, TypedArrayKt.getResourceIdOrThrow(typedArrayObtainStyledAttributes, R.styleable.ThemeAdapterMaterial3Theme_shapeAppearanceCornerExtraLarge), layoutDirection, shapes2.getExtraLarge()));
        } else {
            shapes = null;
        }
        Theme3Parameters theme3Parameters = new Theme3Parameters(colorSchemeM2231darkColorSchemeG1PFcw, typography, shapes);
        typedArrayObtainStyledAttributes.recycle();
        return theme3Parameters;
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
