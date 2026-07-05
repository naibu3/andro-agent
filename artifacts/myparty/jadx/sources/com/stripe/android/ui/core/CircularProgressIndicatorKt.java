package com.stripe.android.ui.core;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorDefaults;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.platform.InspectionModeKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CircularProgressIndicator.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", ViewProps.BACKGROUND_COLOR, "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "TEST_PROGRESS", "", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularProgressIndicatorKt {
    private static final float TEST_PROGRESS = 0.6f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$0(Modifier modifier, long j, float f, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m8618CircularProgressIndicatorLxG7B9w(modifier, j, f, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8618CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM1833getPrimary0d7_KjU;
        float fM1956getStrokeWidthD9Ej5fM;
        long j3;
        int i5;
        long j4;
        int iM4010getButtKaPHkGw;
        Modifier modifier3;
        float f2;
        long j5;
        Object objConsume;
        Composer composer2;
        int i6;
        long j6;
        float f3;
        long j7;
        Modifier modifier4;
        final Modifier modifier5;
        final long j8;
        final float f4;
        final long j9;
        final int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1612004165);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jM1833getPrimary0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM1833getPrimary0d7_KjU) ? 32 : 16;
                i4 |= i9;
            } else {
                jM1833getPrimary0d7_KjU = j;
            }
            i4 |= i9;
        } else {
            jM1833getPrimary0d7_KjU = j;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            if ((i3 & 4) == 0) {
                fM1956getStrokeWidthD9Ej5fM = f;
                int i10 = composerStartRestartGroup.changed(fM1956getStrokeWidthD9Ej5fM) ? 256 : 128;
                i4 |= i10;
            } else {
                fM1956getStrokeWidthD9Ej5fM = f;
            }
            i4 |= i10;
        } else {
            fM1956getStrokeWidthD9Ej5fM = f;
        }
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                j3 = j2;
                i4 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i5 = i;
                    int i12 = composerStartRestartGroup.changed(i5) ? 16384 : 8192;
                    i4 |= i12;
                } else {
                    i5 = i;
                }
                i4 |= i12;
            } else {
                i5 = i;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jM1833getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU();
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        fM1956getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1956getStrokeWidthD9Ej5fM();
                    }
                    long jM3692getTransparent0d7_KjU = i11 == 0 ? Color.INSTANCE.m3692getTransparent0d7_KjU() : j3;
                    if ((i3 & 16) == 0) {
                        i4 &= -57345;
                        iM4010getButtKaPHkGw = StrokeCap.INSTANCE.m4010getButtKaPHkGw();
                        f2 = fM1956getStrokeWidthD9Ej5fM;
                        j4 = jM3692getTransparent0d7_KjU;
                        modifier3 = companion;
                        j5 = jM1833getPrimary0d7_KjU;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1612004165, i4, -1, "com.stripe.android.ui.core.CircularProgressIndicator (CircularProgressIndicator.kt:21)");
                        }
                        ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        objConsume = composerStartRestartGroup.consume(localInspectionMode);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (!((Boolean) objConsume).booleanValue()) {
                            composerStartRestartGroup.startReplaceGroup(624878673);
                            int i13 = i4 << 3;
                            i6 = iM4010getButtKaPHkGw;
                            j6 = j4;
                            f3 = f2;
                            j7 = j5;
                            modifier4 = modifier3;
                            ProgressIndicatorKt.m1957CircularProgressIndicatorDUhRLBM(0.6f, modifier4, j7, f3, j6, i6, composerStartRestartGroup, (i13 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = composerStartRestartGroup;
                            int i14 = iM4010getButtKaPHkGw;
                            long j10 = j4;
                            float f5 = f2;
                            long j11 = j5;
                            composer2.startReplaceGroup(625159223);
                            ProgressIndicatorKt.m1958CircularProgressIndicatorLxG7B9w(modifier3, j11, f5, j10, i14, composer2, i4 & 65534, 0);
                            i6 = i14;
                            j6 = j10;
                            f3 = f5;
                            j7 = j11;
                            modifier4 = modifier3;
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j8 = j7;
                        f4 = f3;
                        j9 = j6;
                        i7 = i6;
                    } else {
                        j4 = jM3692getTransparent0d7_KjU;
                        iM4010getButtKaPHkGw = i5;
                        modifier3 = companion;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    j4 = j3;
                    iM4010getButtKaPHkGw = i5;
                }
                j5 = jM1833getPrimary0d7_KjU;
                f2 = fM1956getStrokeWidthD9Ej5fM;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Boolean> localInspectionMode2 = InspectionModeKt.getLocalInspectionMode();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                objConsume = composerStartRestartGroup.consume(localInspectionMode2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (!((Boolean) objConsume).booleanValue()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier4;
                j8 = j7;
                f4 = f3;
                j9 = j6;
                i7 = i6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
                j8 = jM1833getPrimary0d7_KjU;
                f4 = fM1956getStrokeWidthD9Ej5fM;
                j9 = j3;
                i7 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.CircularProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CircularProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$0(modifier5, j8, f4, j9, i7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        j3 = j2;
        if ((i2 & 24576) != 0) {
        }
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
