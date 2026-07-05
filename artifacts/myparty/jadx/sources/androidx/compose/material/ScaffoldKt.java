package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a§\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u009f\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u00122\u0013\b\u0002\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a¨\u0001\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u00192\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b22\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0012¢\u0006\u0002\b2H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010;\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", ViewProps.BACKGROUND_COLOR, "contentColor", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m6117constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1569641925, "C(rememberScaffoldState)72@2753L39,73@2837L32,74@2889L62:Scaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -694661784, "CC(remember):Scaffold.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:74)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -694660090, "CC(remember):Scaffold.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return scaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1987Scaffoldu4IkXBM(final WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        ScaffoldState scaffoldStateRememberScaffoldState;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M1864getLambda2$material_release;
        int i8;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1865getLambda3$material_release;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function2M1866getLambda4$material_release;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j6;
        boolean z3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        boolean z4;
        CornerBasedShape large;
        float fM1882getElevationD9Ej5fM;
        Shape shape2;
        int i21;
        long jM1837getSurface0d7_KjU;
        long jM1851contentColorForek8zF_U;
        int i22;
        long scrimColor;
        long jM1826getBackground0d7_KjU;
        int i23;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        long jM1851contentColorForek8zF_U2;
        int i24;
        long j7;
        int i25;
        Shape shape3;
        int i26;
        Shape shape4;
        boolean z5;
        Object objRememberedValue;
        Shape shape5;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final ScaffoldState scaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final float f2;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        final Shape shape6;
        final Modifier modifier3;
        final boolean z6;
        final int i27;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1288630565);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scaffold)P(4,15,16,18,1,17,12,13:c#material.FabPosition,14,6,9,11,8:c#ui.unit.Dp,5:c#ui.graphics.Color,7:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)185@8382L23,194@8892L6,196@9007L6,197@9055L38,198@9140L10,199@9195L6,200@9240L32,203@9348L86,206@9463L948:Scaffold.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i4 & 4) == 0) {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                    int i29 = composerStartRestartGroup.changed(scaffoldStateRememberScaffoldState) ? 256 : 128;
                    i5 |= i29;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                i5 |= i29;
            } else {
                scaffoldStateRememberScaffoldState = scaffoldState;
            }
            i6 = i4 & 8;
            int i30 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function2M1864getLambda2$material_release = function22;
                        i5 |= composerStartRestartGroup.changedInstance(function2M1864getLambda2$material_release) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function3M1865getLambda3$material_release = function3;
                    } else {
                        function3M1865getLambda3$material_release = function3;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function3M1865getLambda3$material_release) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function2M1866getLambda4$material_release = function23;
                    } else {
                        function2M1866getLambda4$material_release = function23;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function2M1866getLambda4$material_release) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                            }
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i17 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            int i31 = i17;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i19 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else {
                                i19 = i31;
                                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    i19 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                                }
                                if ((i3 & 3072) == 0) {
                                    if ((i4 & 8192) == 0) {
                                        i20 = i18;
                                        if (composerStartRestartGroup.changed(j)) {
                                            i30 = 2048;
                                        }
                                    } else {
                                        i20 = i18;
                                    }
                                    i19 |= i30;
                                } else {
                                    i20 = i18;
                                }
                                int i32 = i20;
                                if ((i3 & 24576) == 0) {
                                    i19 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j2)) ? 16384 : 8192;
                                }
                                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i19 |= ((32768 & i4) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
                                }
                                if ((i3 & 1572864) == 0) {
                                    i19 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j4)) ? 1048576 : 524288;
                                }
                                if ((12582912 & i3) == 0) {
                                    j6 = j5;
                                    i19 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(j6)) ? 8388608 : 4194304;
                                } else {
                                    j6 = j5;
                                }
                                if ((262144 & i4) == 0) {
                                    if ((i3 & 100663296) == 0) {
                                        i19 |= composerStartRestartGroup.changedInstance(function33) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i28 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if ((i4 & 4) != 0) {
                                                i5 &= -897;
                                                scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function2M1863getLambda1$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1863getLambda1$material_release() : function2;
                                            if (i7 != 0) {
                                                function2M1864getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1864getLambda2$material_release();
                                            }
                                            if (i8 != 0) {
                                                function3M1865getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1865getLambda3$material_release();
                                            }
                                            if (i9 != 0) {
                                                function2M1866getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1866getLambda4$material_release();
                                            }
                                            int iM1913getEnd5ygKITE = i10 == 0 ? FabPosition.INSTANCE.m1913getEnd5ygKITE() : i;
                                            z3 = i12 == 0 ? false : z;
                                            function34 = i14 == 0 ? null : function32;
                                            z4 = i16 == 0 ? true : z2;
                                            Function2<? super Composer, ? super Integer, Unit> function28 = function2M1863getLambda1$material_release;
                                            int i33 = iM1913getEnd5ygKITE;
                                            if ((i4 & 2048) == 0) {
                                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                                i19 &= -113;
                                            } else {
                                                large = shape;
                                            }
                                            int i34 = i19;
                                            fM1882getElevationD9Ej5fM = i32 == 0 ? DrawerDefaults.INSTANCE.m1882getElevationD9Ej5fM() : f;
                                            if ((i4 & 8192) == 0) {
                                                shape2 = large;
                                                i21 = i5;
                                                jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1837getSurface0d7_KjU();
                                                i34 &= -7169;
                                            } else {
                                                shape2 = large;
                                                i21 = i5;
                                                jM1837getSurface0d7_KjU = j;
                                            }
                                            if ((i4 & 16384) == 0) {
                                                jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(jM1837getSurface0d7_KjU, composerStartRestartGroup, (i34 >> 9) & 14);
                                                i34 &= -57345;
                                            } else {
                                                jM1851contentColorForek8zF_U = j2;
                                            }
                                            if ((32768 & i4) == 0) {
                                                i22 = 6;
                                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                                i34 &= -458753;
                                            } else {
                                                i22 = 6;
                                                scrimColor = j3;
                                            }
                                            if ((i4 & 65536) == 0) {
                                                i23 = i34 & (-3670017);
                                                jM1826getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i22).m1826getBackground0d7_KjU();
                                            } else {
                                                jM1826getBackground0d7_KjU = j4;
                                                i23 = i34;
                                            }
                                            if ((i4 & 131072) == 0) {
                                                function24 = function28;
                                                i24 = i23 & (-29360129);
                                                jM1851contentColorForek8zF_U2 = ColorsKt.m1851contentColorForek8zF_U(jM1826getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                                i26 = i21;
                                                j7 = jM1826getBackground0d7_KjU;
                                                i25 = i33;
                                                shape3 = shape2;
                                            } else {
                                                function24 = function28;
                                                jM1851contentColorForek8zF_U2 = j5;
                                                i24 = i23;
                                                j7 = jM1826getBackground0d7_KjU;
                                                i25 = i33;
                                                shape3 = shape2;
                                                i26 = i21;
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i4 & 4) != 0) {
                                                i5 &= -897;
                                            }
                                            if ((i4 & 2048) != 0) {
                                                i19 &= -113;
                                            }
                                            int i35 = i19;
                                            if ((i4 & 8192) != 0) {
                                                i35 &= -7169;
                                            }
                                            if ((i4 & 16384) != 0) {
                                                i35 &= -57345;
                                            }
                                            if ((32768 & i4) != 0) {
                                                i35 &= -458753;
                                            }
                                            if ((i4 & 65536) != 0) {
                                                i35 &= -3670017;
                                            }
                                            if ((i4 & 131072) != 0) {
                                                i35 &= -29360129;
                                            }
                                            i25 = i;
                                            z3 = z;
                                            function34 = function32;
                                            z4 = z2;
                                            shape3 = shape;
                                            fM1882getElevationD9Ej5fM = f;
                                            jM1851contentColorForek8zF_U = j2;
                                            scrimColor = j3;
                                            j7 = j4;
                                            jM1851contentColorForek8zF_U2 = j6;
                                            function24 = function2;
                                            i24 = i35;
                                            i26 = i5;
                                            jM1837getSurface0d7_KjU = j;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        final int i36 = i25;
                                        if (ComposerKt.isTraceInProgress()) {
                                            shape4 = shape3;
                                        } else {
                                            shape4 = shape3;
                                            ComposerKt.traceEventStart(-1288630565, i26, i24, "androidx.compose.material.Scaffold (Scaffold.kt:202)");
                                        }
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1364492366, "CC(remember):Scaffold.kt#9igjgp");
                                        z5 = (i26 & 14) != 4;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new MutableWindowInsets(windowInsets);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        final boolean z8 = z3;
                                        final Function2<? super Composer, ? super Integer, Unit> function29 = function2M1864getLambda2$material_release;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37 = function3M1865getLambda3$material_release;
                                        final ScaffoldState scaffoldState3 = scaffoldStateRememberScaffoldState;
                                        final Function2<? super Composer, ? super Integer, Unit> function210 = function2M1866getLambda4$material_release;
                                        final long j13 = j7;
                                        final long j14 = jM1851contentColorForek8zF_U2;
                                        Function2<? super Composer, ? super Integer, Unit> function211 = function24;
                                        int i37 = i26;
                                        final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer3, Integer num) {
                                                invoke(modifier4, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Modifier modifier4, Composer composer3, int i38) {
                                                int i39;
                                                ComposerKt.sourceInformation(composer3, "C209@9593L236,215@9918L487,207@9500L905:Scaffold.kt#jmzs0o");
                                                if ((i38 & 6) == 0) {
                                                    i39 = i38 | (composer3.changed(modifier4) ? 4 : 2);
                                                } else {
                                                    i39 = i38;
                                                }
                                                if ((i39 & 19) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-219833176, i39, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)");
                                                    }
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 339310311, "CC(remember):Scaffold.kt#9igjgp");
                                                    boolean zChanged = composer3.changed(mutableWindowInsets) | composer3.changed(windowInsets);
                                                    final MutableWindowInsets mutableWindowInsets2 = mutableWindowInsets;
                                                    final WindowInsets windowInsets2 = windowInsets;
                                                    Object objRememberedValue2 = composer3.rememberedValue();
                                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                                invoke2(windowInsets3);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(WindowInsets windowInsets3) {
                                                                mutableWindowInsets2.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier4, (Function1) objRememberedValue2);
                                                    long j15 = j13;
                                                    long j16 = j14;
                                                    final boolean z9 = z8;
                                                    final int i40 = i36;
                                                    final Function2<Composer, Integer, Unit> function212 = function24;
                                                    final Function3<PaddingValues, Composer, Integer, Unit> function38 = function33;
                                                    final Function2<Composer, Integer, Unit> function213 = function210;
                                                    final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets;
                                                    final Function2<Composer, Integer, Unit> function214 = function29;
                                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function39 = function37;
                                                    final ScaffoldState scaffoldState4 = scaffoldState3;
                                                    SurfaceKt.m2015SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j15, j16, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i41) {
                                                            ComposerKt.sourceInformation(composer4, "C222@10213L85,216@9932L463:Scaffold.kt#jmzs0o");
                                                            if ((i41 & 3) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1772955108, i41, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)");
                                                                }
                                                                boolean z10 = z9;
                                                                int i42 = i40;
                                                                Function2<Composer, Integer, Unit> function215 = function212;
                                                                Function3<PaddingValues, Composer, Integer, Unit> function310 = function38;
                                                                final Function3<SnackbarHostState, Composer, Integer, Unit> function311 = function39;
                                                                final ScaffoldState scaffoldState5 = scaffoldState4;
                                                                ScaffoldKt.m1988ScaffoldLayouti1QSOvI(z10, i42, function215, function310, ComposableLambdaKt.rememberComposableLambda(433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                        invoke(composer5, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer5, int i43) {
                                                                        ComposerKt.sourceInformation(composer5, "C223@10235L45:Scaffold.kt#jmzs0o");
                                                                        if ((i43 & 3) == 2 && composer5.getSkipping()) {
                                                                            composer5.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(433906483, i43, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:223)");
                                                                        }
                                                                        function311.invoke(scaffoldState5.getSnackbarHostState(), composer5, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }, composer4, 54), function213, mutableWindowInsets3, function214, composer4, 24576);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }, composer3, 54), composer3, 1572864, 50);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        if (function34 == null) {
                                            composerStartRestartGroup.startReplaceGroup(651509775);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "242@10912L19,232@10454L487");
                                            int i38 = i24 << 9;
                                            Shape shape7 = shape4;
                                            DrawerKt.m1885ModalDrawerGs3lGvM(function34, modifier2, scaffoldStateRememberScaffoldState.getDrawerState(), z4, shape7, fM1882getElevationD9Ej5fM, jM1837getSurface0d7_KjU, jM1851contentColorForek8zF_U, scrimColor, ComposableLambdaKt.rememberComposableLambda(-1409196448, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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

                                                public final void invoke(Composer composer3, int i39) {
                                                    ComposerKt.sourceInformation(composer3, "C242@10914L15:Scaffold.kt#jmzs0o");
                                                    if ((i39 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1409196448, i39, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:242)");
                                                    }
                                                    composableLambdaRememberComposableLambda.invoke(Modifier.INSTANCE, composer3, 54);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i37 >> 27) & 14) | 805306368 | (i37 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i38 & 7168) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38) | (i38 & 234881024), 0);
                                            shape5 = shape7;
                                            composer2 = composerStartRestartGroup;
                                            composer2.endReplaceGroup();
                                        } else {
                                            shape5 = shape4;
                                            composer2 = composerStartRestartGroup;
                                            composer2.startReplaceGroup(652000071);
                                            ComposerKt.sourceInformation(composer2, "245@10963L15");
                                            composableLambdaRememberComposableLambda.invoke(modifier2, composer2, Integer.valueOf(((i37 >> 3) & 14) | 48));
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function25 = function211;
                                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                                        function26 = function2M1866getLambda4$material_release;
                                        f2 = fM1882getElevationD9Ej5fM;
                                        j8 = jM1851contentColorForek8zF_U;
                                        j9 = scrimColor;
                                        j10 = j7;
                                        j11 = jM1851contentColorForek8zF_U2;
                                        shape6 = shape5;
                                        modifier3 = modifier2;
                                        z6 = z4;
                                        boolean z9 = z3;
                                        i27 = i36;
                                        Function2<? super Composer, ? super Integer, Unit> function212 = function2M1864getLambda2$material_release;
                                        z7 = z9;
                                        long j15 = jM1837getSurface0d7_KjU;
                                        function27 = function212;
                                        function35 = function3M1865getLambda3$material_release;
                                        function36 = function34;
                                        j12 = j15;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i27 = i;
                                        j12 = j;
                                        j8 = j2;
                                        j9 = j3;
                                        j10 = j4;
                                        composer2 = composerStartRestartGroup;
                                        j11 = j6;
                                        function27 = function2M1864getLambda2$material_release;
                                        function35 = function3M1865getLambda3$material_release;
                                        modifier3 = modifier2;
                                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                                        function26 = function2M1866getLambda4$material_release;
                                        function25 = function2;
                                        z7 = z;
                                        function36 = function32;
                                        z6 = z2;
                                        shape6 = shape;
                                        f2 = f;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                                            public final void invoke(Composer composer3, int i39) {
                                                ScaffoldKt.m1987Scaffoldu4IkXBM(windowInsets, modifier3, scaffoldState2, function25, function27, function35, function26, i27, z7, function36, z6, shape6, f2, j12, j8, j9, j10, j11, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i19 |= 100663296;
                                if ((i5 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0) {
                                        if (i28 != 0) {
                                        }
                                        if ((i4 & 4) != 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function282 = function2M1863getLambda1$material_release;
                                        int i332 = iM1913getEnd5ygKITE;
                                        if ((i4 & 2048) == 0) {
                                        }
                                        int i342 = i19;
                                        if (i32 == 0) {
                                        }
                                        if ((i4 & 8192) == 0) {
                                        }
                                        if ((i4 & 16384) == 0) {
                                        }
                                        if ((32768 & i4) == 0) {
                                        }
                                        if ((i4 & 65536) == 0) {
                                        }
                                        if ((i4 & 131072) == 0) {
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        final int i362 = i25;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1364492366, "CC(remember):Scaffold.kt#9igjgp");
                                        if ((i26 & 14) != 4) {
                                        }
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!z5) {
                                            objRememberedValue = new MutableWindowInsets(windowInsets);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            final MutableWindowInsets mutableWindowInsets2 = (MutableWindowInsets) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final boolean z82 = z3;
                                            final Function2<? super Composer, ? super Integer, Unit> function292 = function2M1864getLambda2$material_release;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function372 = function3M1865getLambda3$material_release;
                                            final ScaffoldState scaffoldState32 = scaffoldStateRememberScaffoldState;
                                            final Function2<? super Composer, ? super Integer, Unit> function2102 = function2M1866getLambda4$material_release;
                                            final long j132 = j7;
                                            final long j142 = jM1851contentColorForek8zF_U2;
                                            Function2<? super Composer, ? super Integer, Unit> function2112 = function24;
                                            int i372 = i26;
                                            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier4, Composer composer3, Integer num) {
                                                    invoke(modifier4, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Modifier modifier4, Composer composer3, int i382) {
                                                    int i39;
                                                    ComposerKt.sourceInformation(composer3, "C209@9593L236,215@9918L487,207@9500L905:Scaffold.kt#jmzs0o");
                                                    if ((i382 & 6) == 0) {
                                                        i39 = i382 | (composer3.changed(modifier4) ? 4 : 2);
                                                    } else {
                                                        i39 = i382;
                                                    }
                                                    if ((i39 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-219833176, i39, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)");
                                                        }
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 339310311, "CC(remember):Scaffold.kt#9igjgp");
                                                        boolean zChanged = composer3.changed(mutableWindowInsets2) | composer3.changed(windowInsets);
                                                        final MutableWindowInsets mutableWindowInsets22 = mutableWindowInsets2;
                                                        final WindowInsets windowInsets2 = windowInsets;
                                                        Object objRememberedValue2 = composer3.rememberedValue();
                                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                                    invoke2(windowInsets3);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(WindowInsets windowInsets3) {
                                                                    mutableWindowInsets22.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier4, (Function1) objRememberedValue2);
                                                        long j152 = j132;
                                                        long j16 = j142;
                                                        final boolean z92 = z82;
                                                        final int i40 = i362;
                                                        final Function2<? super Composer, ? super Integer, Unit> function2122 = function24;
                                                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function38 = function33;
                                                        final Function2<? super Composer, ? super Integer, Unit> function213 = function2102;
                                                        final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets2;
                                                        final Function2<? super Composer, ? super Integer, Unit> function214 = function292;
                                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function372;
                                                        final ScaffoldState scaffoldState4 = scaffoldState32;
                                                        SurfaceKt.m2015SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j152, j16, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i41) {
                                                                ComposerKt.sourceInformation(composer4, "C222@10213L85,216@9932L463:Scaffold.kt#jmzs0o");
                                                                if ((i41 & 3) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1772955108, i41, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)");
                                                                    }
                                                                    boolean z10 = z92;
                                                                    int i42 = i40;
                                                                    Function2<Composer, Integer, Unit> function215 = function2122;
                                                                    Function3<PaddingValues, Composer, Integer, Unit> function310 = function38;
                                                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function311 = function39;
                                                                    final ScaffoldState scaffoldState5 = scaffoldState4;
                                                                    ScaffoldKt.m1988ScaffoldLayouti1QSOvI(z10, i42, function215, function310, ComposableLambdaKt.rememberComposableLambda(433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                            invoke(composer5, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer5, int i43) {
                                                                            ComposerKt.sourceInformation(composer5, "C223@10235L45:Scaffold.kt#jmzs0o");
                                                                            if ((i43 & 3) == 2 && composer5.getSkipping()) {
                                                                                composer5.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(433906483, i43, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:223)");
                                                                            }
                                                                            function311.invoke(scaffoldState5.getSnackbarHostState(), composer5, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer4, 54), function213, mutableWindowInsets3, function214, composer4, 24576);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }, composer3, 54), composer3, 1572864, 50);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }, composerStartRestartGroup, 54);
                                            if (function34 == null) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function25 = function2112;
                                            scaffoldState2 = scaffoldStateRememberScaffoldState;
                                            function26 = function2M1866getLambda4$material_release;
                                            f2 = fM1882getElevationD9Ej5fM;
                                            j8 = jM1851contentColorForek8zF_U;
                                            j9 = scrimColor;
                                            j10 = j7;
                                            j11 = jM1851contentColorForek8zF_U2;
                                            shape6 = shape5;
                                            modifier3 = modifier2;
                                            z6 = z4;
                                            boolean z92 = z3;
                                            i27 = i362;
                                            Function2<? super Composer, ? super Integer, Unit> function2122 = function2M1864getLambda2$material_release;
                                            z7 = z92;
                                            long j152 = jM1837getSurface0d7_KjU;
                                            function27 = function2122;
                                            function35 = function3M1865getLambda3$material_release;
                                            function36 = function34;
                                            j12 = j152;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i322 = i20;
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((12582912 & i3) == 0) {
                            }
                            if ((262144 & i4) == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i312 = i17;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i3222 = i20;
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((12582912 & i3) == 0) {
                        }
                        if ((262144 & i4) == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i3122 = i17;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i32222 = i20;
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((12582912 & i3) == 0) {
                    }
                    if ((262144 & i4) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function2M1864getLambda2$material_release = function22;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i31222 = i17;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i322222 = i20;
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((12582912 & i3) == 0) {
                }
                if ((262144 & i4) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function2M1864getLambda2$material_release = function22;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i312222 = i17;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i3222222 = i20;
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((12582912 & i3) == 0) {
            }
            if ((262144 & i4) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        i6 = i4 & 8;
        int i302 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function2M1864getLambda2$material_release = function22;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i3122222 = i17;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i32222222 = i20;
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        if ((262144 & i4) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1986Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M1867getLambda5$material_release;
        int i6;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1869getLambda7$material_release;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function2M1870getLambda8$material_release;
        int i9;
        int iM1913getEnd5ygKITE;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j6;
        CornerBasedShape large;
        float fM1882getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i19;
        long jM1837getSurface0d7_KjU;
        long jM1851contentColorForek8zF_U;
        int i20;
        int i21;
        long scrimColor;
        int i22;
        long jM1826getBackground0d7_KjU;
        Shape shape2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        ScaffoldState scaffoldState2;
        long j7;
        long j8;
        int i23;
        int i24;
        Function2<? super Composer, ? super Integer, Unit> function26;
        long j9;
        long j10;
        long j11;
        boolean z4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        boolean z5;
        Composer composer2;
        final Modifier modifier4;
        final ScaffoldState scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final int i25;
        final boolean z6;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37;
        final boolean z7;
        final Shape shape3;
        final float f2;
        final long j12;
        final long j13;
        final long j14;
        final long j15;
        final long j16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1037492569);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)313@14827L23,322@15337L6,324@15452L6,325@15500L38,326@15585L10,327@15640L6,328@15685L32,331@15776L495:Scaffold.kt#jmzs0o");
        int i26 = i4 & 1;
        if (i26 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i4 & 2) == 0) {
                scaffoldStateRememberScaffoldState = scaffoldState;
                int i27 = composerStartRestartGroup.changed(scaffoldStateRememberScaffoldState) ? 32 : 16;
                i5 |= i27;
            } else {
                scaffoldStateRememberScaffoldState = scaffoldState;
            }
            i5 |= i27;
        } else {
            scaffoldStateRememberScaffoldState = scaffoldState;
        }
        int i28 = i4 & 4;
        if (i28 != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                function2M1867getLambda5$material_release = function2;
                i5 |= composerStartRestartGroup.changedInstance(function2M1867getLambda5$material_release) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function3M1869getLambda7$material_release = function3;
                        i5 |= composerStartRestartGroup.changedInstance(function3M1869getLambda7$material_release) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function2M1870getLambda8$material_release = function23;
                    } else {
                        function2M1870getLambda8$material_release = function23;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function2M1870getLambda8$material_release) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        iM1913getEnd5ygKITE = i;
                    } else {
                        iM1913getEnd5ygKITE = i;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(iM1913getEnd5ygKITE) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changedInstance(function32) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                            }
                            if ((i3 & 6) != 0) {
                                i15 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                            } else {
                                i15 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 != 0) {
                                if ((i3 & 48) == 0) {
                                    i17 = i16;
                                    i15 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                                }
                                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    i18 = i26;
                                    i15 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
                                } else {
                                    i18 = i26;
                                }
                                if ((i3 & 3072) == 0) {
                                    j6 = j2;
                                    i15 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j6)) ? 2048 : 1024;
                                } else {
                                    j6 = j2;
                                }
                                if ((i3 & 24576) == 0) {
                                    i15 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j3)) ? 16384 : 8192;
                                }
                                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i15 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                                }
                                if ((i3 & 1572864) == 0) {
                                    i15 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j5)) ? 1048576 : 524288;
                                }
                                if ((i4 & 131072) != 0) {
                                    i15 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    i15 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                                }
                                if ((306783379 & i5) != 306783378 || (i15 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i18 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                        }
                                        if (i28 != 0) {
                                            function2M1867getLambda5$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1867getLambda5$material_release();
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function2M1868getLambda6$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1868getLambda6$material_release() : function22;
                                        if (i7 != 0) {
                                            function3M1869getLambda7$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1869getLambda7$material_release();
                                        }
                                        if (i8 != 0) {
                                            function2M1870getLambda8$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1870getLambda8$material_release();
                                        }
                                        if (i9 != 0) {
                                            iM1913getEnd5ygKITE = FabPosition.INSTANCE.m1913getEnd5ygKITE();
                                        }
                                        if (i10 != 0) {
                                            z3 = false;
                                        }
                                        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = i12 == 0 ? null : function32;
                                        boolean z8 = i14 == 0 ? true : z2;
                                        if ((i4 & 1024) == 0) {
                                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                            i15 &= -15;
                                        } else {
                                            large = shape;
                                        }
                                        int i29 = i15;
                                        fM1882getElevationD9Ej5fM = i17 == 0 ? DrawerDefaults.INSTANCE.m1882getElevationD9Ej5fM() : f;
                                        if ((i4 & 4096) == 0) {
                                            function24 = function2M1868getLambda6$material_release;
                                            i19 = i29 & (-897);
                                            jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1837getSurface0d7_KjU();
                                        } else {
                                            function24 = function2M1868getLambda6$material_release;
                                            i19 = i29;
                                            jM1837getSurface0d7_KjU = j;
                                        }
                                        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function38;
                                        if ((i4 & 8192) == 0) {
                                            jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(jM1837getSurface0d7_KjU, composerStartRestartGroup, (i19 >> 6) & 14);
                                            i19 &= -7169;
                                        } else {
                                            jM1851contentColorForek8zF_U = j2;
                                        }
                                        if ((i4 & 16384) == 0) {
                                            int i30 = i19;
                                            i20 = 6;
                                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                            i21 = i30 & (-57345);
                                        } else {
                                            int i31 = i19;
                                            i20 = 6;
                                            i21 = i31;
                                            scrimColor = j3;
                                        }
                                        int i32 = i21;
                                        if ((i4 & 32768) == 0) {
                                            jM1826getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i20).m1826getBackground0d7_KjU();
                                            i22 = i32 & (-458753);
                                        } else {
                                            i22 = i32;
                                            jM1826getBackground0d7_KjU = j4;
                                        }
                                        if ((i4 & 65536) == 0) {
                                            long jM1851contentColorForek8zF_U2 = ColorsKt.m1851contentColorForek8zF_U(jM1826getBackground0d7_KjU, composerStartRestartGroup, (i22 >> 15) & 14);
                                            int i33 = i22 & (-3670017);
                                            Function2<? super Composer, ? super Integer, Unit> function210 = function2M1867getLambda5$material_release;
                                            shape2 = large;
                                            modifier3 = modifier2;
                                            function25 = function210;
                                            ScaffoldState scaffoldState4 = scaffoldStateRememberScaffoldState;
                                            function34 = function3M1869getLambda7$material_release;
                                            scaffoldState2 = scaffoldState4;
                                            j7 = jM1851contentColorForek8zF_U2;
                                            j8 = jM1826getBackground0d7_KjU;
                                            i24 = i33;
                                            i23 = i5;
                                            j9 = scrimColor;
                                            function26 = function24;
                                        } else {
                                            Function2<? super Composer, ? super Integer, Unit> function211 = function2M1867getLambda5$material_release;
                                            shape2 = large;
                                            modifier3 = modifier2;
                                            function25 = function211;
                                            ScaffoldState scaffoldState5 = scaffoldStateRememberScaffoldState;
                                            function34 = function3M1869getLambda7$material_release;
                                            scaffoldState2 = scaffoldState5;
                                            j7 = j5;
                                            j8 = jM1826getBackground0d7_KjU;
                                            i23 = i5;
                                            i24 = i22;
                                            function26 = function24;
                                            j9 = scrimColor;
                                        }
                                        j10 = jM1851contentColorForek8zF_U;
                                        j11 = jM1837getSurface0d7_KjU;
                                        z4 = z3;
                                        function35 = function39;
                                        z5 = z8;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i15 &= -15;
                                        }
                                        i24 = i15;
                                        if ((i4 & 4096) != 0) {
                                            i24 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i24 &= -7169;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            i24 &= -57345;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i24 &= -458753;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            i24 &= -3670017;
                                        }
                                        ScaffoldState scaffoldState6 = scaffoldStateRememberScaffoldState;
                                        function34 = function3M1869getLambda7$material_release;
                                        scaffoldState2 = scaffoldState6;
                                        function35 = function32;
                                        fM1882getElevationD9Ej5fM = f;
                                        j11 = j;
                                        j9 = j3;
                                        j8 = j4;
                                        j7 = j5;
                                        j10 = j6;
                                        modifier3 = modifier2;
                                        i23 = i5;
                                        z4 = z3;
                                        function25 = function2M1867getLambda5$material_release;
                                        function26 = function22;
                                        z5 = z2;
                                        shape2 = shape;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1037492569, i23, i24, "androidx.compose.material.Scaffold (Scaffold.kt:330)");
                                    }
                                    int i34 = i24 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m1987Scaffoldu4IkXBM(WindowInsetsKt.m1090WindowInsetsa9UjIt4$default(Dp.m6117constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier3, scaffoldState2, function25, function26, function34, function2M1870getLambda8$material_release, iM1913getEnd5ygKITE, z4, function35, z5, shape2, fM1882getElevationD9Ej5fM, j11, j10, j9, j8, j7, function33, composer2, (i23 << 3) & 2147483632, ((i23 >> 27) & 14) | (i34 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i34 & 896) | (i34 & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (29360128 & i34) | (i34 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    scaffoldState3 = scaffoldState2;
                                    function27 = function25;
                                    function28 = function26;
                                    function36 = function34;
                                    function29 = function2M1870getLambda8$material_release;
                                    i25 = iM1913getEnd5ygKITE;
                                    z6 = z4;
                                    function37 = function35;
                                    z7 = z5;
                                    shape3 = shape2;
                                    f2 = fM1882getElevationD9Ej5fM;
                                    j12 = j11;
                                    j13 = j10;
                                    j14 = j9;
                                    j15 = j8;
                                    j16 = j7;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    f2 = f;
                                    j14 = j3;
                                    j15 = j4;
                                    j16 = j5;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    scaffoldState3 = scaffoldStateRememberScaffoldState;
                                    i25 = iM1913getEnd5ygKITE;
                                    z6 = z3;
                                    function27 = function2M1867getLambda5$material_release;
                                    function37 = function32;
                                    shape3 = shape;
                                    j12 = j;
                                    j13 = j6;
                                    function36 = function3M1869getLambda7$material_release;
                                    function29 = function2M1870getLambda8$material_release;
                                    function28 = function22;
                                    z7 = z2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
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

                                        public final void invoke(Composer composer3, int i35) {
                                            ScaffoldKt.m1986Scaffold27mzLpw(modifier4, scaffoldState3, function27, function28, function36, function29, i25, z6, function37, z7, shape3, f2, j12, j13, j14, j15, j16, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 |= 48;
                            i17 = i16;
                            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            if ((306783379 & i5) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0) {
                                    if (i18 != 0) {
                                    }
                                    if ((i4 & 2) != 0) {
                                    }
                                    if (i28 != 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if ((i4 & 1024) == 0) {
                                    }
                                    int i292 = i15;
                                    if (i17 == 0) {
                                    }
                                    if ((i4 & 4096) == 0) {
                                    }
                                    Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function392 = function38;
                                    if ((i4 & 8192) == 0) {
                                    }
                                    if ((i4 & 16384) == 0) {
                                    }
                                    int i322 = i21;
                                    if ((i4 & 32768) == 0) {
                                    }
                                    if ((i4 & 65536) == 0) {
                                    }
                                    j10 = jM1851contentColorForek8zF_U;
                                    j11 = jM1837getSurface0d7_KjU;
                                    z4 = z3;
                                    function35 = function392;
                                    z5 = z8;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i342 = i24 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m1987Scaffoldu4IkXBM(WindowInsetsKt.m1090WindowInsetsa9UjIt4$default(Dp.m6117constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier3, scaffoldState2, function25, function26, function34, function2M1870getLambda8$material_release, iM1913getEnd5ygKITE, z4, function35, z5, shape2, fM1882getElevationD9Ej5fM, j11, j10, j9, j8, j7, function33, composer2, (i23 << 3) & 2147483632, ((i23 >> 27) & 14) | (i342 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i342 & 896) | (i342 & 7168) | (57344 & i342) | (458752 & i342) | (3670016 & i342) | (29360128 & i342) | (i342 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    scaffoldState3 = scaffoldState2;
                                    function27 = function25;
                                    function28 = function26;
                                    function36 = function34;
                                    function29 = function2M1870getLambda8$material_release;
                                    i25 = iM1913getEnd5ygKITE;
                                    z6 = z4;
                                    function37 = function35;
                                    z7 = z5;
                                    shape3 = shape2;
                                    f2 = fM1882getElevationD9Ej5fM;
                                    j12 = j11;
                                    j13 = j10;
                                    j14 = j9;
                                    j15 = j8;
                                    j16 = j7;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i14 = i13;
                        if ((i3 & 6) != 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                        }
                        i17 = i16;
                        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        if ((306783379 & i5) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i3 & 6) != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    if ((306783379 & i5) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M1869getLambda7$material_release = function3;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i3 & 6) != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i17 = i16;
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                if ((306783379 & i5) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function3M1869getLambda7$material_release = function3;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i3 & 6) != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((306783379 & i5) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function2M1867getLambda5$material_release = function2;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function3M1869getLambda7$material_release = function3;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i3 & 6) != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((306783379 & i5) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m1988ScaffoldLayouti1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-468424875);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScaffoldLayout)P(5,4:c#material.FabPosition,7,1,6,3,2)391@17701L6677,391@17684L6694:Scaffold.kt#jmzs0o");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function32 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function25 = function23;
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
        } else {
            function25 = function23;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:390)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -771533477, "CC(remember):Scaffold.kt#9igjgp");
            boolean z2 = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                i4 = 0;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1990invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult m1990invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        final FabPlacement fabPlacement;
                        Object obj3;
                        Integer numValueOf;
                        final ArrayList arrayList;
                        final Integer num;
                        final int i5;
                        int iIntValue;
                        int iIntValue2;
                        int height;
                        int height2;
                        Object obj4;
                        Object obj5;
                        int i6;
                        int i7;
                        int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j);
                        final int iM6069getMaxHeightimpl = Constraints.m6069getMaxHeightimpl(j);
                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList2 = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            arrayList2.add(listSubcompose.get(i8).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (arrayList3.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList3.get(0);
                            int height3 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList3);
                            if (1 <= lastIndex) {
                                int i9 = 1;
                                while (true) {
                                    Object obj6 = arrayList3.get(i9);
                                    int height4 = ((Placeable) obj6).getHeight();
                                    if (height3 < height4) {
                                        obj = obj6;
                                        height3 = height4;
                                    }
                                    if (i9 == lastIndex) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height5 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        ArrayList arrayList4 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                            arrayList4.add(listSubcompose2.get(i10).mo4993measureBRTryo0(ConstraintsKt.m6089offsetNN6EwU(jM6061copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2))));
                            i10++;
                            listSubcompose2 = listSubcompose2;
                        }
                        final ArrayList arrayList5 = arrayList4;
                        if (arrayList5.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList5.get(0);
                            int height6 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex2) {
                                Object obj7 = obj2;
                                int i11 = height6;
                                int i12 = 1;
                                while (true) {
                                    Object obj8 = arrayList5.get(i12);
                                    int height7 = ((Placeable) obj8).getHeight();
                                    if (i11 < height7) {
                                        obj7 = obj8;
                                        i11 = height7;
                                    }
                                    if (i12 == lastIndex2) {
                                        break;
                                    }
                                    i12++;
                                }
                                obj2 = obj7;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets3 = windowInsets;
                        ArrayList arrayList6 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            int i14 = height8;
                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                            arrayList6.add(listSubcompose3.get(i13).mo4993measureBRTryo0(ConstraintsKt.m6089offsetNN6EwU(jM6061copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope3))));
                            i13++;
                            height8 = i14;
                            listSubcompose3 = listSubcompose3;
                            arrayList3 = arrayList3;
                        }
                        int i15 = height8;
                        ArrayList arrayList7 = arrayList3;
                        final ArrayList arrayList8 = arrayList6;
                        if (arrayList8.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (arrayList8.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList8.get(0);
                                int width = ((Placeable) obj4).getWidth();
                                int lastIndex3 = CollectionsKt.getLastIndex(arrayList8);
                                if (1 <= lastIndex3) {
                                    Object obj9 = obj4;
                                    int i16 = width;
                                    int i17 = 1;
                                    while (true) {
                                        Object obj10 = arrayList8.get(i17);
                                        int width2 = ((Placeable) obj10).getWidth();
                                        if (i16 < width2) {
                                            obj9 = obj10;
                                            i16 = width2;
                                        }
                                        if (i17 == lastIndex3) {
                                            break;
                                        }
                                        i17++;
                                    }
                                    obj4 = obj9;
                                }
                            }
                            Placeable placeable3 = (Placeable) obj4;
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (arrayList8.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList8.get(0);
                                int height9 = ((Placeable) obj5).getHeight();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList8);
                                if (1 <= lastIndex4) {
                                    Object obj11 = obj5;
                                    int i18 = height9;
                                    int i19 = 1;
                                    while (true) {
                                        Object obj12 = arrayList8.get(i19);
                                        int height10 = ((Placeable) obj12).getHeight();
                                        if (i18 < height10) {
                                            obj11 = obj12;
                                            i18 = height10;
                                        }
                                        if (i19 == lastIndex4) {
                                            break;
                                        }
                                        i19++;
                                    }
                                    obj5 = obj11;
                                }
                            }
                            Placeable placeable4 = (Placeable) obj5;
                            int height11 = placeable4 != null ? placeable4.getHeight() : 0;
                            if (width3 != 0 && height11 != 0) {
                                int i20 = i;
                                if (FabPosition.m1908equalsimpl0(i20, FabPosition.INSTANCE.m1914getStart5ygKITE())) {
                                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        i6 = subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        fabPlacement = new FabPlacement(z, i6, width3, height11);
                                    } else {
                                        i7 = subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        i6 = (iM6070getMaxWidthimpl - i7) - width3;
                                        fabPlacement = new FabPlacement(z, i6, width3, height11);
                                    }
                                } else {
                                    if (FabPosition.m1908equalsimpl0(i20, FabPosition.INSTANCE.m1913getEnd5ygKITE())) {
                                        if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                            i7 = subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                            i6 = (iM6070getMaxWidthimpl - i7) - width3;
                                        } else {
                                            i6 = subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        }
                                    } else {
                                        i6 = (iM6070getMaxWidthimpl - width3) / 2;
                                    }
                                    fabPlacement = new FabPlacement(z, i6, width3, height11);
                                }
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function27 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(424088350, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i21) {
                                ComposerKt.sourceInformation(composer2, "C476@21201L132:Scaffold.kt#jmzs0o");
                                if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(424088350, i21, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:476)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function27, composer2, ProvidedValue.$stable);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        ArrayList arrayList9 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            arrayList9.add(listSubcompose4.get(i21).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        final ArrayList arrayList10 = arrayList9;
                        if (arrayList10.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList10.get(0);
                            int height12 = ((Placeable) obj3).getHeight();
                            int lastIndex5 = CollectionsKt.getLastIndex(arrayList10);
                            if (1 <= lastIndex5) {
                                int i22 = 1;
                                while (true) {
                                    Object obj13 = arrayList10.get(i22);
                                    int height13 = ((Placeable) obj13).getHeight();
                                    if (height12 < height13) {
                                        height12 = height13;
                                        obj3 = obj13;
                                    }
                                    if (i22 == lastIndex5) {
                                        break;
                                    }
                                    i22++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) obj3;
                        final Integer numValueOf2 = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                        if (fabPlacement != null) {
                            WindowInsets windowInsets4 = windowInsets;
                            boolean z3 = z;
                            if (numValueOf2 == null) {
                                height2 = fabPlacement.getHeight() + subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets4.getBottom(subcomposeMeasureScope);
                            } else {
                                if (z3) {
                                    iIntValue2 = numValueOf2.intValue();
                                    height = fabPlacement.getHeight() / 2;
                                } else {
                                    iIntValue2 = numValueOf2.intValue() + fabPlacement.getHeight();
                                    height = subcomposeMeasureScope.mo706roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                height2 = height + iIntValue2;
                            }
                            numValueOf = Integer.valueOf(height2);
                        } else {
                            numValueOf = null;
                        }
                        if (i15 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
                            }
                            arrayList = arrayList7;
                            num = numValueOf;
                            i5 = i15 + iIntValue;
                        } else {
                            arrayList = arrayList7;
                            num = numValueOf;
                            i5 = 0;
                        }
                        int i23 = iM6069getMaxHeightimpl - height5;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets5 = windowInsets;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        final Integer num2 = numValueOf2;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-570781649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num3) {
                                invoke(composer2, num3.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i24) {
                                float fM6117constructorimpl;
                                float bottom;
                                Integer num3;
                                ComposerKt.sourceInformation(composer2, "C527@23357L21:Scaffold.kt#jmzs0o");
                                if ((i24 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-570781649, i24, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:510)");
                                    }
                                    PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope);
                                    if (arrayList.isEmpty()) {
                                        fM6117constructorimpl = paddingValuesAsPaddingValues.getTop();
                                    } else {
                                        fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                    }
                                    if (arrayList10.isEmpty() || (num3 = numValueOf2) == null) {
                                        bottom = paddingValuesAsPaddingValues.getBottom();
                                    } else {
                                        bottom = subcomposeMeasureScope.mo709toDpu2uoSUM(num3.intValue());
                                    }
                                    function34.invoke(PaddingKt.m1016PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fM6117constructorimpl, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        ArrayList arrayList11 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        int i24 = 0;
                        while (i24 < size5) {
                            long j2 = jM6061copyZbe2FdA$default;
                            arrayList11.add(listSubcompose5.get(i24).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j2, 0, 0, 0, i23, 7, null)));
                            i24++;
                            jM6061copyZbe2FdA$default = j2;
                        }
                        final ArrayList arrayList12 = arrayList11;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        final ArrayList arrayList13 = arrayList;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM6070getMaxWidthimpl, iM6069getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                List<Placeable> list = arrayList12;
                                int i25 = height5;
                                int size6 = list.size();
                                for (int i26 = 0; i26 < size6; i26++) {
                                    Placeable.PlacementScope.place$default(placementScope, list.get(i26), 0, i25, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList13;
                                int size7 = list2.size();
                                for (int i27 = 0; i27 < size7; i27++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i27), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList5;
                                int i28 = iM6069getMaxHeightimpl;
                                int i29 = i5;
                                int size8 = list3.size();
                                for (int i30 = 0; i30 < size8; i30++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i30), 0, i28 - i29, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList10;
                                int i31 = iM6069getMaxHeightimpl;
                                Integer num3 = num2;
                                int size9 = list4.size();
                                for (int i32 = 0; i32 < size9; i32++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i32), 0, i31 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList8;
                                FabPlacement fabPlacement3 = fabPlacement2;
                                int i33 = iM6069getMaxHeightimpl;
                                Integer num4 = num;
                                int size10 = list5.size();
                                for (int i34 = 0; i34 < size10; i34++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i34), fabPlacement3 != null ? fabPlacement3.getLeft() : 0, i33 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i4 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i5) {
                    ScaffoldKt.m1988ScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
