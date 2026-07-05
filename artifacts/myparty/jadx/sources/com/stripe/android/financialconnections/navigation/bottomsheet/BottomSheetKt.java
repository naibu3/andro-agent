package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ModalBottomSheetLayout", "", "bottomSheetNavigator", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ModalBottomSheetLayout-4erKP6g", "(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetLayout_4erKP6g$lambda$0(BottomSheetNavigator bottomSheetNavigator, Modifier modifier, Shape shape, float f, long j, long j2, long j3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7536ModalBottomSheetLayout4erKP6g(bottomSheetNavigator, modifier, shape, f, j, j2, j3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* renamed from: ModalBottomSheetLayout-4erKP6g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7536ModalBottomSheetLayout4erKP6g(final BottomSheetNavigator bottomSheetNavigator, Modifier modifier, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape large;
        float fM1935getElevationD9Ej5fM;
        long jM1837getSurface0d7_KjU;
        long jM1851contentColorForek8zF_U;
        long scrimColor;
        int i4;
        int i5;
        final Modifier modifier3;
        final Shape shape2;
        final float f2;
        final long j4;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bottomSheetNavigator, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1849857857);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bottomSheetNavigator) : composerStartRestartGroup.changedInstance(bottomSheetNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i2 & 4) == 0) {
                    large = shape;
                    int i7 = composerStartRestartGroup.changed(large) ? 256 : 128;
                    i3 |= i7;
                } else {
                    large = shape;
                }
                i3 |= i7;
            } else {
                large = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    fM1935getElevationD9Ej5fM = f;
                    int i8 = composerStartRestartGroup.changed(fM1935getElevationD9Ej5fM) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    fM1935getElevationD9Ej5fM = f;
                }
                i3 |= i8;
            } else {
                fM1935getElevationD9Ej5fM = f;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    jM1837getSurface0d7_KjU = j;
                    int i9 = composerStartRestartGroup.changed(jM1837getSurface0d7_KjU) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    jM1837getSurface0d7_KjU = j;
                }
                i3 |= i9;
            } else {
                jM1837getSurface0d7_KjU = j;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    jM1851contentColorForek8zF_U = j2;
                    int i10 = composerStartRestartGroup.changed(jM1851contentColorForek8zF_U) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    jM1851contentColorForek8zF_U = j2;
                }
                i3 |= i10;
            } else {
                jM1851contentColorForek8zF_U = j2;
            }
            if ((1572864 & i) != 0) {
                scrimColor = j3;
                i4 = i3 | (((i2 & 64) == 0 && composerStartRestartGroup.changed(scrimColor)) ? 1048576 : 524288);
            } else {
                scrimColor = j3;
                i4 = i3;
            }
            if ((i2 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
            }
            i5 = i4;
            if ((i5 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    long j7 = scrimColor;
                    Modifier modifier4 = modifier2;
                    Shape shape3 = large;
                    float f3 = fM1935getElevationD9Ej5fM;
                    long j8 = jM1837getSurface0d7_KjU;
                    long j9 = jM1851contentColorForek8zF_U;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i11 = i5 << 6;
                    ModalBottomSheetKt.m1936ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent$financial_connections_release(), modifier4, bottomSheetNavigator.getSheetState(), false, shape3, f3, j8, j9, j7, content, composerStartRestartGroup, (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (ModalBottomSheetState.$stable << 6) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    shape2 = shape3;
                    f2 = f3;
                    j4 = j8;
                    j5 = j9;
                    j6 = j7;
                } else {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        i5 &= -897;
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                    }
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                        fM1935getElevationD9Ej5fM = ModalBottomSheetDefaults.INSTANCE.m1935getElevationD9Ej5fM();
                    }
                    if ((i2 & 16) != 0) {
                        jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU();
                        i5 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(jM1837getSurface0d7_KjU, composerStartRestartGroup, (i5 >> 12) & 14);
                        i5 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, ModalBottomSheetDefaults.$stable);
                        i5 &= -3670017;
                    }
                    long j72 = scrimColor;
                    Modifier modifier42 = modifier2;
                    Shape shape32 = large;
                    float f32 = fM1935getElevationD9Ej5fM;
                    long j82 = jM1837getSurface0d7_KjU;
                    long j92 = jM1851contentColorForek8zF_U;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1849857857, i5, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.ModalBottomSheetLayout (BottomSheet.kt:45)");
                    }
                    int i112 = i5 << 6;
                    ModalBottomSheetKt.m1936ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent$financial_connections_release(), modifier42, bottomSheetNavigator.getSheetState(), false, shape32, f32, j82, j92, j72, content, composerStartRestartGroup, (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (ModalBottomSheetState.$stable << 6) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | (i112 & 1879048192), 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier42;
                    shape2 = shape32;
                    f2 = f32;
                    j4 = j82;
                    j5 = j92;
                    j6 = j72;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j4 = jM1837getSurface0d7_KjU;
                j6 = scrimColor;
                shape2 = large;
                f2 = fM1935getElevationD9Ej5fM;
                j5 = jM1851contentColorForek8zF_U;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomSheetKt.ModalBottomSheetLayout_4erKP6g$lambda$0(bottomSheetNavigator, modifier3, shape2, f2, j4, j5, j6, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i5 = i4;
        if ((i5 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                long j722 = scrimColor;
                Modifier modifier422 = modifier2;
                Shape shape322 = large;
                float f322 = fM1935getElevationD9Ej5fM;
                long j822 = jM1837getSurface0d7_KjU;
                long j922 = jM1851contentColorForek8zF_U;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i5 << 6;
                ModalBottomSheetKt.m1936ModalBottomSheetLayoutGs3lGvM(bottomSheetNavigator.getSheetContent$financial_connections_release(), modifier422, bottomSheetNavigator.getSheetState(), false, shape322, f322, j822, j922, j722, content, composerStartRestartGroup, (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (ModalBottomSheetState.$stable << 6) | (57344 & i1122) | (458752 & i1122) | (3670016 & i1122) | (29360128 & i1122) | (234881024 & i1122) | (i1122 & 1879048192), 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier422;
                shape2 = shape322;
                f2 = f322;
                j4 = j822;
                j5 = j922;
                j6 = j722;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
