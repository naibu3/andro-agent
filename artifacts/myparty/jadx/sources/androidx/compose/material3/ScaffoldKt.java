package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a´\u0001\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u008a\u0001\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00132\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\u0002\b\u000e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000eH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material3.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m6117constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    @ExperimentalMaterial3Api
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2412ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, WindowInsets windowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function2M2248getLambda1$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M2249getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M2250getLambda3$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M2251getLambda4$material3_release;
        int iM2299getEndERTFSPs;
        int i10;
        int i11;
        long jM2170getBackground0d7_KjU;
        long jM2230contentColorForek8zF_U;
        WindowInsets contentWindowInsets;
        long j3;
        long j4;
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final int i13;
        final WindowInsets windowInsets2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219521777);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)81@4088L11,82@4138L31,83@4228L19,86@4306L405:Scaffold.kt#uh7d8r");
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                function25 = function2;
                i4 |= composerStartRestartGroup.changed(function25) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & 896) == 0) {
                    function26 = function22;
                    i4 |= composerStartRestartGroup.changed(function26) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        function27 = function23;
                        i4 |= composerStartRestartGroup.changed(function27) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((57344 & i2) == 0) {
                            function28 = function24;
                            i4 |= composerStartRestartGroup.changed(function28) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & 458752) == 0) {
                            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 3670016) == 0) {
                            i9 = i15;
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i15;
                        }
                        if ((i2 & 29360128) == 0) {
                            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                        }
                        if ((234881024 & i2) == 0) {
                            i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(windowInsets)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            i14 = (1879048192 & i2) == 0 ? composerStartRestartGroup.changed(content) ? 536870912 : 268435456 : 805306368;
                            if ((1533916891 & i4) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    function2M2248getLambda1$material3_release = i16 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2248getLambda1$material3_release() : function25;
                                    function2M2249getLambda2$material3_release = i5 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2249getLambda2$material3_release() : function26;
                                    function2M2250getLambda3$material3_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2250getLambda3$material3_release() : function27;
                                    function2M2251getLambda4$material3_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2251getLambda4$material3_release() : function28;
                                    iM2299getEndERTFSPs = i8 == 0 ? FabPosition.INSTANCE.m2299getEndERTFSPs() : i;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        jM2170getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m2170getBackground0d7_KjU();
                                    } else {
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        jM2170getBackground0d7_KjU = j;
                                    }
                                    if ((i3 & 128) == 0) {
                                        jM2230contentColorForek8zF_U = ColorSchemeKt.m2230contentColorForek8zF_U(jM2170getBackground0d7_KjU, composerStartRestartGroup, (i4 >> 18) & 14);
                                        i4 &= i11;
                                    } else {
                                        jM2230contentColorForek8zF_U = j2;
                                    }
                                    int i17 = i10;
                                    if ((i3 & 256) == 0) {
                                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                        i4 &= i17;
                                    } else {
                                        contentWindowInsets = windowInsets;
                                    }
                                    j3 = jM2170getBackground0d7_KjU;
                                    j4 = jM2230contentColorForek8zF_U;
                                    modifier2 = companion;
                                    i12 = -1219521777;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    iM2299getEndERTFSPs = i;
                                    j3 = j;
                                    j4 = j2;
                                    function2M2248getLambda1$material3_release = function25;
                                    function2M2249getLambda2$material3_release = function26;
                                    function2M2250getLambda3$material3_release = function27;
                                    function2M2251getLambda4$material3_release = function28;
                                    i12 = -1219521777;
                                    modifier2 = modifier;
                                    contentWindowInsets = windowInsets;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i12, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:74)");
                                }
                                final int i18 = i4;
                                final Function2<? super Composer, ? super Integer, Unit> function213 = function2M2248getLambda1$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function2M2249getLambda2$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function2M2250getLambda3$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2M2251getLambda4$material3_release;
                                final int i19 = iM2299getEndERTFSPs;
                                final WindowInsets windowInsets3 = contentWindowInsets;
                                int i20 = i4 >> 12;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2457SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        ComposerKt.sourceInformation(composer3, "C87@4398L307:Scaffold.kt#uh7d8r");
                                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                            }
                                            int i22 = i19;
                                            Function2<Composer, Integer, Unit> function217 = function213;
                                            Function3<PaddingValues, Composer, Integer, Unit> function3 = content;
                                            Function2<Composer, Integer, Unit> function218 = function215;
                                            Function2<Composer, Integer, Unit> function219 = function216;
                                            WindowInsets windowInsets4 = windowInsets3;
                                            Function2<Composer, Integer, Unit> function220 = function214;
                                            int i23 = i18;
                                            ScaffoldKt.m2413ScaffoldLayoutFMILGgc(i22, function217, function3, function218, function219, windowInsets4, function220, composer3, ((i23 >> 15) & 14) | (i23 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i23 >> 21) & 896) | (i23 & 7168) | (57344 & i23) | ((i23 >> 9) & 458752) | ((i23 << 12) & 3670016));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, (i4 & 14) | 12582912 | (i20 & 896) | (i20 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function29 = function2M2248getLambda1$material3_release;
                                function210 = function2M2249getLambda2$material3_release;
                                function211 = function2M2250getLambda3$material3_release;
                                function212 = function2M2251getLambda4$material3_release;
                                i13 = iM2299getEndERTFSPs;
                                windowInsets2 = contentWindowInsets;
                                modifier3 = modifier2;
                                j5 = j3;
                                j6 = j4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                windowInsets2 = windowInsets;
                                composer2 = composerStartRestartGroup;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                modifier3 = modifier;
                                i13 = i;
                                j5 = j;
                                j6 = j2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i21) {
                                    ScaffoldKt.m2412ScaffoldTvnljyQ(modifier3, function29, function210, function211, function212, i13, j5, j6, windowInsets2, content, composer3, i2 | 1, i3);
                                }
                            });
                            return;
                        }
                        i4 |= i14;
                        if ((1533916891 & i4) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if ((i3 & 128) == 0) {
                                }
                                int i172 = i10;
                                if ((i3 & 256) == 0) {
                                }
                                j3 = jM2170getBackground0d7_KjU;
                                j4 = jM2230contentColorForek8zF_U;
                                modifier2 = companion;
                                i12 = -1219521777;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final int i182 = i4;
                                final Function2<? super Composer, ? super Integer, Unit> function2132 = function2M2248getLambda1$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function2142 = function2M2249getLambda2$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function2152 = function2M2250getLambda3$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function2162 = function2M2251getLambda4$material3_release;
                                final int i192 = iM2299getEndERTFSPs;
                                final WindowInsets windowInsets32 = contentWindowInsets;
                                int i202 = i4 >> 12;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2457SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        ComposerKt.sourceInformation(composer3, "C87@4398L307:Scaffold.kt#uh7d8r");
                                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:86)");
                                            }
                                            int i22 = i192;
                                            Function2<Composer, Integer, Unit> function217 = function2132;
                                            Function3<PaddingValues, Composer, Integer, Unit> function3 = content;
                                            Function2<Composer, Integer, Unit> function218 = function2152;
                                            Function2<Composer, Integer, Unit> function219 = function2162;
                                            WindowInsets windowInsets4 = windowInsets32;
                                            Function2<Composer, Integer, Unit> function220 = function2142;
                                            int i23 = i182;
                                            ScaffoldKt.m2413ScaffoldLayoutFMILGgc(i22, function217, function3, function218, function219, windowInsets4, function220, composer3, ((i23 >> 15) & 14) | (i23 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i23 >> 21) & 896) | (i23 & 7168) | (57344 & i23) | ((i23 >> 9) & 458752) | ((i23 << 12) & 3670016));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, (i4 & 14) | 12582912 | (i202 & 896) | (i202 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function29 = function2M2248getLambda1$material3_release;
                                function210 = function2M2249getLambda2$material3_release;
                                function211 = function2M2250getLambda3$material3_release;
                                function212 = function2M2251getLambda4$material3_release;
                                i13 = iM2299getEndERTFSPs;
                                windowInsets2 = contentWindowInsets;
                                modifier3 = modifier2;
                                j5 = j3;
                                j6 = j4;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function28 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    if ((i2 & 29360128) == 0) {
                    }
                    if ((234881024 & i2) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i14;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function28 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                if ((234881024 & i2) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i4 |= i14;
                if ((1533916891 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function28 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((234881024 & i2) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i14;
            if ((1533916891 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function28 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((234881024 & i2) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i14;
        if ((1533916891 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2413ScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)123@5669L6544,123@5652L6561:Scaffold.kt#uh7d8r");
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(i) ? 4 : 2) | i2 : i2;
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            obj = function3;
            i3 |= composerStartRestartGroup.changed(obj) ? 256 : 128;
        } else {
            obj = function3;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function24) ? 1048576 : 524288;
        }
        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:113)");
            }
            Object[] objArr = {function2, function22, windowInsets, function23, FabPosition.m2291boximpl(i), function24, obj};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged = false;
            for (int i4 = 0; i4 < 7; i4++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i4]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final int i5 = i3;
                objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m2415invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m2415invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j);
                        final int iM6069getMaxHeightimpl = Constraints.m6069getMaxHeightimpl(j);
                        final long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final int i6 = i;
                        final WindowInsets windowInsets2 = windowInsets;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        final int i7 = i5;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.layout$default(SubcomposeLayout, iM6070getMaxWidthimpl, iM6069getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Object next;
                                Object next2;
                                Object next3;
                                final FabPlacement fabPlacement;
                                Object next4;
                                Integer numValueOf;
                                Object next5;
                                Object next6;
                                Placeable.PlacementScope layout = placementScope;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, function25);
                                long j2 = jM6061copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
                                Iterator<T> it = listSubcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo4993measureBRTryo0(j2));
                                }
                                final ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = arrayList2;
                                Iterator it2 = arrayList3.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        while (true) {
                                            Object next7 = it2.next();
                                            int height2 = ((Placeable) next7).getHeight();
                                            if (height < height2) {
                                                next = next7;
                                                height = height2;
                                            }
                                            if (!it2.hasNext()) {
                                                break;
                                            } else {
                                                layout = placementScope;
                                            }
                                        }
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                final int height3 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                                WindowInsets windowInsets3 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                long j3 = jM6061copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose2, 10));
                                Iterator<T> it3 = listSubcompose2.iterator();
                                while (it3.hasNext()) {
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                    arrayList4.add(((Measurable) it3.next()).mo4993measureBRTryo0(ConstraintsKt.m6089offsetNN6EwU(j3, (-windowInsets3.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope2))));
                                }
                                ArrayList arrayList5 = arrayList4;
                                Iterator it4 = arrayList5.iterator();
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (it4.hasNext()) {
                                        int height4 = ((Placeable) next2).getHeight();
                                        while (true) {
                                            Object next8 = it4.next();
                                            int height5 = ((Placeable) next8).getHeight();
                                            if (height4 < height5) {
                                                next2 = next8;
                                                height4 = height5;
                                            }
                                            if (!it4.hasNext()) {
                                                break;
                                            } else {
                                                layout = placementScope;
                                            }
                                        }
                                    }
                                } else {
                                    next2 = null;
                                }
                                Placeable placeable2 = (Placeable) next2;
                                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                                Iterator it5 = arrayList5.iterator();
                                if (it5.hasNext()) {
                                    next3 = it5.next();
                                    if (it5.hasNext()) {
                                        int width = ((Placeable) next3).getWidth();
                                        while (true) {
                                            Object next9 = it5.next();
                                            int width2 = ((Placeable) next9).getWidth();
                                            if (width < width2) {
                                                next3 = next9;
                                                width = width2;
                                            }
                                            if (!it5.hasNext()) {
                                                break;
                                            } else {
                                                layout = placementScope;
                                            }
                                        }
                                    }
                                } else {
                                    next3 = null;
                                }
                                Placeable placeable3 = (Placeable) next3;
                                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                List<Measurable> listSubcompose3 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, function27);
                                WindowInsets windowInsets4 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeLayout;
                                long j4 = jM6061copyZbe2FdA$default;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator<T> it6 = listSubcompose3.iterator();
                                while (it6.hasNext()) {
                                    SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope3;
                                    Placeable placeableMo4993measureBRTryo0 = ((Measurable) it6.next()).mo4993measureBRTryo0(ConstraintsKt.m6089offsetNN6EwU(j4, (-windowInsets4.getLeft(subcomposeMeasureScope4, subcomposeMeasureScope3.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope4, subcomposeMeasureScope3.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope4)));
                                    if (placeableMo4993measureBRTryo0.getHeight() == 0 || placeableMo4993measureBRTryo0.getWidth() == 0) {
                                        placeableMo4993measureBRTryo0 = null;
                                    }
                                    if (placeableMo4993measureBRTryo0 != null) {
                                        arrayList6.add(placeableMo4993measureBRTryo0);
                                    }
                                }
                                ArrayList<Placeable> arrayList7 = arrayList6;
                                if (arrayList7.isEmpty()) {
                                    fabPlacement = null;
                                } else {
                                    ArrayList arrayList8 = arrayList7;
                                    Iterator it7 = arrayList8.iterator();
                                    if (it7.hasNext()) {
                                        next5 = it7.next();
                                        if (it7.hasNext()) {
                                            int width4 = ((Placeable) next5).getWidth();
                                            do {
                                                Object next10 = it7.next();
                                                int width5 = ((Placeable) next10).getWidth();
                                                if (width4 < width5) {
                                                    next5 = next10;
                                                    width4 = width5;
                                                }
                                            } while (it7.hasNext());
                                        }
                                    } else {
                                        next5 = null;
                                    }
                                    Intrinsics.checkNotNull(next5);
                                    int width6 = ((Placeable) next5).getWidth();
                                    Iterator it8 = arrayList8.iterator();
                                    if (it8.hasNext()) {
                                        next6 = it8.next();
                                        if (it8.hasNext()) {
                                            int height7 = ((Placeable) next6).getHeight();
                                            do {
                                                Object next11 = it8.next();
                                                int height8 = ((Placeable) next11).getHeight();
                                                if (height7 < height8) {
                                                    next6 = next11;
                                                    height7 = height8;
                                                }
                                            } while (it8.hasNext());
                                        }
                                    } else {
                                        next6 = null;
                                    }
                                    Intrinsics.checkNotNull(next6);
                                    fabPlacement = new FabPlacement(FabPosition.m2294equalsimpl0(i6, FabPosition.INSTANCE.m2299getEndERTFSPs()) ? SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? (iM6070getMaxWidthimpl - SubcomposeLayout.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width6 : SubcomposeLayout.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing) : (iM6070getMaxWidthimpl - width6) / 2, width6, ((Placeable) next6).getHeight());
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope5 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function29 = function28;
                                final int i8 = i7;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
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

                                    public final void invoke(Composer composer2, int i9) {
                                        ComposerKt.sourceInformation(composer2, "C196@9017L144:Scaffold.kt#uh7d8r");
                                        if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1455477816, i9, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:195)");
                                            }
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, function29, composer2, ((i8 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }));
                                long j5 = jM6061copyZbe2FdA$default;
                                ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose4, 10));
                                Iterator<T> it9 = listSubcompose4.iterator();
                                while (it9.hasNext()) {
                                    arrayList9.add(((Measurable) it9.next()).mo4993measureBRTryo0(j5));
                                }
                                final ArrayList arrayList10 = arrayList9;
                                ArrayList arrayList11 = arrayList10;
                                Iterator it10 = arrayList11.iterator();
                                if (it10.hasNext()) {
                                    next4 = it10.next();
                                    if (it10.hasNext()) {
                                        int height9 = ((Placeable) next4).getHeight();
                                        while (true) {
                                            Object next12 = it10.next();
                                            int height10 = ((Placeable) next12).getHeight();
                                            if (height9 < height10) {
                                                next4 = next12;
                                                height9 = height10;
                                            }
                                            if (!it10.hasNext()) {
                                                break;
                                            } else {
                                                layout = placementScope;
                                            }
                                        }
                                    }
                                } else {
                                    next4 = null;
                                }
                                Placeable placeable4 = (Placeable) next4;
                                final Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope6 = SubcomposeLayout;
                                    numValueOf = Integer.valueOf(numValueOf2 == null ? fabPlacement.getHeight() + subcomposeMeasureScope6.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets2.getBottom(subcomposeMeasureScope6) : numValueOf2.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope6.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing));
                                } else {
                                    numValueOf = null;
                                }
                                int iIntValue = height6 != 0 ? height6 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(SubcomposeLayout)) : 0;
                                SubcomposeMeasureScope subcomposeMeasureScope7 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final WindowInsets windowInsets5 = windowInsets2;
                                final SubcomposeMeasureScope subcomposeMeasureScope8 = SubcomposeLayout;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                final int i9 = i7;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope7.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
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

                                    public final void invoke(Composer composer2, int i10) {
                                        float top;
                                        float bottom;
                                        Integer num;
                                        ComposerKt.sourceInformation(composer2, "C240@11062L21:Scaffold.kt#uh7d8r");
                                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1643221465, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:222)");
                                            }
                                            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope8);
                                            if (arrayList2.isEmpty()) {
                                                top = paddingValuesAsPaddingValues.getTop();
                                            } else {
                                                top = subcomposeMeasureScope8.mo709toDpu2uoSUM(height3);
                                            }
                                            if (arrayList10.isEmpty() || (num = numValueOf2) == null) {
                                                bottom = paddingValuesAsPaddingValues.getBottom();
                                            } else {
                                                bottom = subcomposeMeasureScope8.mo709toDpu2uoSUM(num.intValue());
                                            }
                                            function33.invoke(PaddingKt.m1016PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope8.getLayoutDirection()), top, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope8.getLayoutDirection()), bottom), composer2, Integer.valueOf((i9 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }));
                                long j6 = jM6061copyZbe2FdA$default;
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose5, 10));
                                Iterator<T> it11 = listSubcompose5.iterator();
                                while (it11.hasNext()) {
                                    arrayList12.add(((Measurable) it11.next()).mo4993measureBRTryo0(j6));
                                }
                                Iterator it12 = arrayList12.iterator();
                                while (it12.hasNext()) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) it12.next(), 0, 0, 0.0f, 4, null);
                                    layout = placementScope;
                                    fabPlacement = fabPlacement;
                                }
                                FabPlacement fabPlacement2 = fabPlacement;
                                Iterator it13 = arrayList3.iterator();
                                while (it13.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it13.next(), 0, 0, 0.0f, 4, null);
                                }
                                int i10 = iM6070getMaxWidthimpl;
                                WindowInsets windowInsets6 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope9 = SubcomposeLayout;
                                int i11 = iM6069getMaxHeightimpl;
                                Iterator it14 = arrayList5.iterator();
                                while (it14.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it14.next(), windowInsets6.getLeft(subcomposeMeasureScope9, subcomposeMeasureScope9.getLayoutDirection()) + ((i10 - width3) / 2), i11 - iIntValue, 0.0f, 4, null);
                                }
                                int i12 = iM6069getMaxHeightimpl;
                                Iterator it15 = arrayList11.iterator();
                                while (it15.hasNext()) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) it15.next(), 0, i12 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
                                }
                                if (fabPlacement2 != null) {
                                    int i13 = iM6069getMaxHeightimpl;
                                    for (Placeable placeable5 : arrayList7) {
                                        int left = fabPlacement2.getLeft();
                                        Intrinsics.checkNotNull(numValueOf);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i13 - numValueOf.intValue(), 0.0f, 4, null);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(Composer composer2, int i6) {
                ScaffoldKt.m2413ScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, i2 | 1);
            }
        });
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
