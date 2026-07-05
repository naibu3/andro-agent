package com.stripe.android.uicore.text;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* compiled from: MiddleEllipsisText.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"MiddleEllipsisText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", ViewProps.FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", ViewProps.FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", ViewProps.FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", ViewProps.FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", ViewProps.LETTER_SPACING, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", ViewProps.TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", ViewProps.LINE_HEIGHT, "softWrap", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Landroidx/compose/ui/text/TextStyle;", "ellipsisChar", "", "ellipsisCharCount", "", "MiddleEllipsisText-oiE5lR0", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;CILandroidx/compose/runtime/Composer;III)V", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiddleEllipsisTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiddleEllipsisText_oiE5lR0$lambda$5(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, boolean z, Function1 function1, TextStyle textStyle, char c, int i, int i2, int i3, int i4, Composer composer, int i5) {
        m8903MiddleEllipsisTextoiE5lR0(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, z, function1, textStyle, c, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiddleEllipsisText_oiE5lR0$lambda$1$lambda$0(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /* renamed from: MiddleEllipsisText-oiE5lR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8903MiddleEllipsisTextoiE5lR0(final String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, boolean z, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, char c, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        long jM3693getUnspecified0d7_KjU;
        int i8;
        long jM6321getUnspecifiedXSAIIZE;
        int i9;
        final FontStyle fontStyle2;
        int i10;
        FontWeight fontWeight2;
        int i11;
        FontFamily fontFamily2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        long jM6321getUnspecifiedXSAIIZE2;
        long jM6321getUnspecifiedXSAIIZE3;
        boolean z2;
        TextAlign textAlign2;
        Function1<? super TextLayoutResult, Unit> function12;
        Function1<? super TextLayoutResult, Unit> function13;
        TextDecoration textDecoration2;
        TextStyle textStyle2;
        Function1<? super TextLayoutResult, Unit> function14;
        final TextDecoration textDecoration3;
        int i25;
        TextStyle textStyle3;
        char c2;
        long j5;
        FontWeight fontWeight3;
        final TextAlign textAlign3;
        final int i26;
        final boolean z3;
        final FontFamily fontFamily3;
        final long j6;
        final long j7;
        final long j8;
        final FontWeight fontWeight4;
        final long j9;
        TextStyle textStyle4;
        char c3;
        Modifier modifier3;
        Composer composer2;
        Composer composer3;
        final Modifier modifier4;
        final long j10;
        final FontWeight fontWeight5;
        final FontFamily fontFamily4;
        final long j11;
        final TextDecoration textDecoration4;
        final TextAlign textAlign4;
        final long j12;
        final boolean z4;
        final Function1<? super TextLayoutResult, Unit> function15;
        final TextStyle textStyle5;
        final int i27;
        final char c4;
        final long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-444925138);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
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
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                i7 = i28;
                jM3693getUnspecified0d7_KjU = j;
            } else {
                i7 = i28;
                jM3693getUnspecified0d7_KjU = j;
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i5 |= composerStartRestartGroup.changed(jM3693getUnspecified0d7_KjU) ? 256 : 128;
                }
            }
            i8 = i4 & 8;
            if (i8 == 0) {
                i5 |= 3072;
                jM6321getUnspecifiedXSAIIZE = j2;
            } else {
                jM6321getUnspecifiedXSAIIZE = j2;
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changed(jM6321getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i9 = i4 & 16;
            if (i9 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i5 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i13 = i4 & 256;
                if (i13 != 0) {
                    i5 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i14 = i4 & 512;
                    if (i14 == 0) {
                        i5 |= 805306368;
                    } else {
                        if ((i2 & 805306368) == 0) {
                            i15 = i14;
                            i5 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i18 = i3 | 6;
                            i17 = i16;
                        } else if ((i3 & 6) == 0) {
                            i17 = i16;
                            i18 = i3 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i17 = i16;
                            i18 = i3;
                        }
                        i19 = i4 & 2048;
                        if (i19 != 0) {
                            i18 |= 48;
                        } else {
                            if ((i3 & 48) == 0) {
                                i18 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                            }
                            int i29 = i18;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i29 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else {
                                i21 = i29;
                                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    i21 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                                }
                                if ((i3 & 3072) == 0) {
                                    i21 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(textStyle)) ? 2048 : 1024;
                                }
                                int i30 = i21;
                                i22 = i4 & 16384;
                                if (i22 == 0) {
                                    i23 = i30;
                                    if ((i3 & 24576) == 0) {
                                        i23 |= composerStartRestartGroup.changed(c) ? 16384 : 8192;
                                    }
                                    i24 = i4 & 32768;
                                    if (i24 == 0) {
                                        i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i23 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                                    }
                                    int i31 = i23;
                                    if ((i5 & 306783379) == 306783378 || (74899 & i31) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i7 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i6 != 0) {
                                                jM3693getUnspecified0d7_KjU = Color.INSTANCE.m3693getUnspecified0d7_KjU();
                                            }
                                            if (i8 != 0) {
                                                jM6321getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE();
                                            }
                                            if (i9 != 0) {
                                                fontStyle2 = null;
                                            }
                                            if (i10 != 0) {
                                                fontWeight2 = null;
                                            }
                                            if (i11 != 0) {
                                                fontFamily2 = null;
                                            }
                                            jM6321getUnspecifiedXSAIIZE2 = i12 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j3;
                                            TextDecoration textDecoration5 = i13 == 0 ? null : textDecoration;
                                            TextAlign textAlign5 = i15 == 0 ? textAlign : null;
                                            jM6321getUnspecifiedXSAIIZE3 = i17 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j4;
                                            z2 = i19 == 0 ? true : z;
                                            if (i20 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(419720206);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                textAlign2 = textAlign5;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return MiddleEllipsisTextKt.MiddleEllipsisText_oiE5lR0$lambda$1$lambda$0((TextLayoutResult) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                function12 = (Function1) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                textAlign2 = textAlign5;
                                                function12 = function1;
                                            }
                                            if ((i4 & 8192) == 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                function13 = function12;
                                                textDecoration2 = textDecoration5;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                textStyle2 = (TextStyle) objConsume;
                                                i31 &= -7169;
                                            } else {
                                                function13 = function12;
                                                textDecoration2 = textDecoration5;
                                                textStyle2 = textStyle;
                                            }
                                            char c5 = i22 == 0 ? FilenameUtils.EXTENSION_SEPARATOR : c;
                                            function14 = function13;
                                            textDecoration3 = textDecoration2;
                                            if (i24 == 0) {
                                                textStyle3 = textStyle2;
                                                c2 = c5;
                                                j5 = jM3693getUnspecified0d7_KjU;
                                                fontWeight3 = fontWeight2;
                                                i25 = 3;
                                            } else {
                                                i25 = i;
                                                textStyle3 = textStyle2;
                                                c2 = c5;
                                                j5 = jM3693getUnspecified0d7_KjU;
                                                fontWeight3 = fontWeight2;
                                            }
                                            textAlign3 = textAlign2;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i4 & 8192) != 0) {
                                                i31 &= -7169;
                                            }
                                            jM6321getUnspecifiedXSAIIZE2 = j3;
                                            textDecoration3 = textDecoration;
                                            jM6321getUnspecifiedXSAIIZE3 = j4;
                                            z2 = z;
                                            function14 = function1;
                                            textStyle3 = textStyle;
                                            c2 = c;
                                            i25 = i;
                                            j5 = jM3693getUnspecified0d7_KjU;
                                            fontWeight3 = fontWeight2;
                                            textAlign3 = textAlign;
                                        }
                                        final FontStyle fontStyle3 = fontStyle2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-444925138, i5, i31, "com.stripe.android.uicore.text.MiddleEllipsisText (MiddleEllipsisText.kt:49)");
                                        }
                                        if (text.length() != 0) {
                                            composerStartRestartGroup.startReplaceGroup(126578353);
                                            int i32 = (i31 & 14) | ((i31 << 3) & 896);
                                            int i33 = i31 << 9;
                                            FontFamily fontFamily5 = fontFamily2;
                                            FontWeight fontWeight6 = fontWeight3;
                                            long j14 = jM6321getUnspecifiedXSAIIZE2;
                                            boolean z5 = z2;
                                            long j15 = jM6321getUnspecifiedXSAIIZE;
                                            textStyle4 = textStyle3;
                                            i26 = i25;
                                            Modifier modifier5 = modifier2;
                                            TextDecoration textDecoration6 = textDecoration3;
                                            TextAlign textAlign6 = textAlign3;
                                            long j16 = jM6321getUnspecifiedXSAIIZE3;
                                            TextKt.m2076Text4IGK_g(text, (Modifier) null, j5, j15, fontStyle3, fontWeight6, fontFamily5, j14, textDecoration6, textAlign6, j16, 0, z5, 0, 0, function14, textStyle4, composerStartRestartGroup, i5 & 2147483534, i32 | (458752 & i33) | (i33 & 3670016), 26626);
                                            z3 = z5;
                                            j7 = j16;
                                            textDecoration3 = textDecoration6;
                                            textAlign3 = textAlign6;
                                            j6 = j14;
                                            fontFamily3 = fontFamily5;
                                            fontStyle3 = fontStyle3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            j8 = j5;
                                            fontWeight4 = fontWeight6;
                                            c3 = c2;
                                            composer2 = composerStartRestartGroup;
                                            j9 = j15;
                                            modifier3 = modifier5;
                                        } else {
                                            FontWeight fontWeight7 = fontWeight3;
                                            Modifier modifier6 = modifier2;
                                            final TextStyle textStyle6 = textStyle3;
                                            i26 = i25;
                                            z3 = z2;
                                            long j17 = jM6321getUnspecifiedXSAIIZE;
                                            fontFamily3 = fontFamily2;
                                            j6 = jM6321getUnspecifiedXSAIIZE2;
                                            j7 = jM6321getUnspecifiedXSAIIZE3;
                                            composerStartRestartGroup.startReplaceGroup(127282735);
                                            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                            final String strRepeat = StringsKt.repeat(String.valueOf(c2), i26);
                                            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                            characterInstance.setText(text);
                                            final ArrayList arrayList = new ArrayList();
                                            while (true) {
                                                j8 = j5;
                                                if (characterInstance.next() == -1) {
                                                    break;
                                                }
                                                arrayList.add(Integer.valueOf(characterInstance.current()));
                                                j5 = j8;
                                            }
                                            int i34 = i5;
                                            final char c6 = c2;
                                            final Function1<? super TextLayoutResult, Unit> function16 = function14;
                                            fontWeight4 = fontWeight7;
                                            j9 = j17;
                                            Function2 function2 = new Function2() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return MiddleEllipsisTextKt.MiddleEllipsisText_oiE5lR0$lambda$4(objectRef, text, c6, j8, j9, fontStyle3, fontWeight4, fontFamily3, j6, textDecoration3, textAlign3, j7, z3, textStyle6, strRepeat, function16, i26, arrayList, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                                                }
                                            };
                                            function14 = function16;
                                            textStyle4 = textStyle6;
                                            c3 = c6;
                                            modifier3 = modifier6;
                                            composer2 = composerStartRestartGroup;
                                            SubcomposeLayoutKt.SubcomposeLayout(modifier3, function2, composer2, (i34 >> 3) & 14, 0);
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3 = composer2;
                                        modifier4 = modifier3;
                                        j10 = j9;
                                        fontStyle2 = fontStyle3;
                                        fontWeight5 = fontWeight4;
                                        fontFamily4 = fontFamily3;
                                        j11 = j6;
                                        textDecoration4 = textDecoration3;
                                        textAlign4 = textAlign3;
                                        j12 = j7;
                                        z4 = z3;
                                        function15 = function14;
                                        textStyle5 = textStyle4;
                                        i27 = i26;
                                        c4 = c3;
                                        j13 = j8;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        textAlign4 = textAlign;
                                        z4 = z;
                                        function15 = function1;
                                        textStyle5 = textStyle;
                                        c4 = c;
                                        i27 = i;
                                        composer3 = composerStartRestartGroup;
                                        j13 = jM3693getUnspecified0d7_KjU;
                                        j10 = jM6321getUnspecifiedXSAIIZE;
                                        modifier4 = modifier2;
                                        fontWeight5 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j11 = j3;
                                        textDecoration4 = textDecoration;
                                        j12 = j4;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return MiddleEllipsisTextKt.MiddleEllipsisText_oiE5lR0$lambda$5(text, modifier4, j13, j10, fontStyle2, fontWeight5, fontFamily4, j11, textDecoration4, textAlign4, j12, z4, function15, textStyle5, c4, i27, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i23 = i30 | 24576;
                                i24 = i4 & 32768;
                                if (i24 == 0) {
                                }
                                int i312 = i23;
                                if ((i5 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0) {
                                        if (i7 != 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i20 == 0) {
                                        }
                                        if ((i4 & 8192) == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        function14 = function13;
                                        textDecoration3 = textDecoration2;
                                        if (i24 == 0) {
                                        }
                                        textAlign3 = textAlign2;
                                        final FontStyle fontStyle32 = fontStyle2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (text.length() != 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composer3 = composer2;
                                        modifier4 = modifier3;
                                        j10 = j9;
                                        fontStyle2 = fontStyle32;
                                        fontWeight5 = fontWeight4;
                                        fontFamily4 = fontFamily3;
                                        j11 = j6;
                                        textDecoration4 = textDecoration3;
                                        textAlign4 = textAlign3;
                                        j12 = j7;
                                        z4 = z3;
                                        function15 = function14;
                                        textStyle5 = textStyle4;
                                        i27 = i26;
                                        c4 = c3;
                                        j13 = j8;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i302 = i21;
                            i22 = i4 & 16384;
                            if (i22 == 0) {
                            }
                            i24 = i4 & 32768;
                            if (i24 == 0) {
                            }
                            int i3122 = i23;
                            if ((i5 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        int i292 = i18;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i3022 = i21;
                        i22 = i4 & 16384;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 32768;
                        if (i24 == 0) {
                        }
                        int i31222 = i23;
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 != 0) {
                    }
                    int i2922 = i18;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i30222 = i21;
                    i22 = i4 & 16384;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 32768;
                    if (i24 == 0) {
                    }
                    int i312222 = i23;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i14 = i4 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i19 = i4 & 2048;
                if (i19 != 0) {
                }
                int i29222 = i18;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i302222 = i21;
                i22 = i4 & 16384;
                if (i22 == 0) {
                }
                i24 = i4 & 32768;
                if (i24 == 0) {
                }
                int i3122222 = i23;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            i13 = i4 & 256;
            if (i13 != 0) {
            }
            i14 = i4 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i19 = i4 & 2048;
            if (i19 != 0) {
            }
            int i292222 = i18;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i3022222 = i21;
            i22 = i4 & 16384;
            if (i22 == 0) {
            }
            i24 = i4 & 32768;
            if (i24 == 0) {
            }
            int i31222222 = i23;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i8 = i4 & 8;
        if (i8 == 0) {
        }
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        fontStyle2 = fontStyle;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        i13 = i4 & 256;
        if (i13 != 0) {
        }
        i14 = i4 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i19 = i4 & 2048;
        if (i19 != 0) {
        }
        int i2922222 = i18;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i30222222 = i21;
        i22 = i4 & 16384;
        if (i22 == 0) {
        }
        i24 = i4 & 32768;
        if (i24 == 0) {
        }
        int i312222222 = i23;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final MeasureResult MiddleEllipsisText_oiE5lR0$lambda$4(final Ref.ObjectRef objectRef, final String str, char c, final long j, final long j2, final FontStyle fontStyle, final FontWeight fontWeight, final FontFamily fontFamily, final long j3, final TextDecoration textDecoration, final TextAlign textAlign, final long j4, final boolean z, final TextStyle textStyle, final String str2, final Function1 function1, final int i, final List list, SubcomposeMeasureScope SubcomposeLayout, final Constraints constraints) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        SubcomposeLayout.subcompose("MiddleEllipsisText_calculate", ComposableLambdaKt.composableLambdaInstance(566593623, true, new MiddleEllipsisTextKt$MiddleEllipsisText$2$1(str, c, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, z, textStyle, objectRef))).get(0).mo4993measureBRTryo0(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
        if (((TextLayoutResult) objectRef.element) == null) {
            return MeasureScope.layout$default(SubcomposeLayout, 0, 0, null, new Function1() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MiddleEllipsisTextKt.MiddleEllipsisText_oiE5lR0$lambda$4$lambda$2((Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        final Placeable placeableMo4993measureBRTryo0 = SubcomposeLayout.subcompose("MiddleEllipsisText_apply", ComposableLambdaKt.composableLambdaInstance(-1570169603, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$MiddleEllipsisText$2$placeable$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:62:0x0200 A[LOOP:2: B:49:0x01bf->B:62:0x0200, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0225 A[EDGE_INSN: B:85:0x0225->B:68:0x0225 BREAK  A[LOOP:0: B:20:0x00c6->B:67:0x021d, LOOP_LABEL: LOOP:0: B:20:0x00c6->B:67:0x021d], SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(Composer composer, int i2) {
                int i3;
                int i4;
                String str3;
                String str4;
                Object objM9118constructorimpl;
                int iIntValue;
                Object objM9118constructorimpl2;
                if ((i2 & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1570169603, i2, -1, "com.stripe.android.uicore.text.MiddleEllipsisText.<anonymous>.<anonymous> (MiddleEllipsisText.kt:99)");
                    }
                    composer.startReplaceGroup(-600926062);
                    boolean zChanged = composer.changed(str) | composer.changed(str2) | composer.changed(objectRef.element);
                    Ref.ObjectRef<TextLayoutResult> objectRef2 = objectRef;
                    String str5 = str;
                    Constraints constraints2 = constraints;
                    int i5 = i;
                    List<Integer> list2 = list;
                    String str6 = str2;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        TextLayoutResult textLayoutResult = objectRef2.element;
                        Intrinsics.checkNotNull(textLayoutResult);
                        String str7 = str5;
                        if (textLayoutResult.getBoundingBox(StringsKt.getLastIndex(str7)).getRight() > Constraints.m6070getMaxWidthimpl(constraints2.getValue())) {
                            TextLayoutResult textLayoutResult2 = objectRef2.element;
                            Intrinsics.checkNotNull(textLayoutResult2);
                            float fM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(constraints2.getValue()) - (textLayoutResult2.getBoundingBox(StringsKt.getLastIndex(str7) + 1).getWidth() * i5);
                            int lastIndex = StringsKt.getLastIndex(str7);
                            int lastIndex2 = CollectionsKt.getLastIndex(list2);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int size = list2.size();
                            float width = 0.0f;
                            float width2 = 0.0f;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = lastIndex2;
                            int i10 = lastIndex;
                            loop0: while (i7 < size && i6 < i10) {
                                TextLayoutResult textLayoutResult3 = objectRef2.element;
                                Intrinsics.checkNotNull(textLayoutResult3);
                                Rect boundingBox = textLayoutResult3.getBoundingBox(i6);
                                TextLayoutResult textLayoutResult4 = objectRef2.element;
                                Intrinsics.checkNotNull(textLayoutResult4);
                                Rect boundingBox2 = textLayoutResult4.getBoundingBox(i10);
                                if (width2 <= width && width2 + boundingBox.getWidth() + width <= fM6070getMaxWidthimpl) {
                                    if (i8 == 0) {
                                        iIntValue = list2.get(i8).intValue();
                                    } else {
                                        iIntValue = list2.get(i8).intValue() - list2.get(i8 - 1).intValue();
                                    }
                                    int i11 = i6;
                                    int i12 = iIntValue;
                                    int i13 = i10;
                                    ArrayList arrayList3 = new ArrayList();
                                    i3 = size;
                                    i4 = i7;
                                    int i14 = i11;
                                    for (int i15 = 0; i15 < i12; i15++) {
                                        try {
                                            Result.Companion companion = Result.INSTANCE;
                                            arrayList3.add(Character.valueOf(str5.charAt(i14)));
                                            TextLayoutResult textLayoutResult5 = objectRef2.element;
                                            Intrinsics.checkNotNull(textLayoutResult5);
                                            width2 += textLayoutResult5.getBoundingBox(i14).getWidth();
                                            i14++;
                                            objM9118constructorimpl2 = Result.m9118constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th) {
                                            Result.Companion companion2 = Result.INSTANCE;
                                            objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                                        }
                                        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl2) != null) {
                                            break loop0;
                                        }
                                    }
                                    if (width2 + width <= fM6070getMaxWidthimpl) {
                                        arrayList.addAll(arrayList3);
                                        i8++;
                                    }
                                    str3 = str5;
                                    i6 = i14;
                                    i10 = i13;
                                    i7 = i4 + 1;
                                    size = i3;
                                    str5 = str3;
                                } else {
                                    int i16 = i6;
                                    int i17 = i10;
                                    i3 = size;
                                    i4 = i7;
                                    if (width2 < width || width2 + width + boundingBox2.getWidth() > fM6070getMaxWidthimpl) {
                                        break;
                                    }
                                    int i18 = i9 - 1;
                                    int iIntValue2 = list2.get(i9).intValue() - list2.get(i18).intValue();
                                    ArrayList arrayList4 = new ArrayList();
                                    int i19 = i17;
                                    int i20 = 0;
                                    while (i20 < iIntValue2) {
                                        try {
                                            Result.Companion companion3 = Result.INSTANCE;
                                            str4 = str5;
                                            try {
                                                arrayList4.add(0, Character.valueOf(str5.charAt(i19)));
                                                TextLayoutResult textLayoutResult6 = objectRef2.element;
                                                Intrinsics.checkNotNull(textLayoutResult6);
                                                width += textLayoutResult6.getBoundingBox(i19).getWidth();
                                                i19--;
                                                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Result.Companion companion4 = Result.INSTANCE;
                                                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                                                if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str4 = str5;
                                        }
                                        if (Result.m9121exceptionOrNullimpl(objM9118constructorimpl) == null) {
                                            break loop0;
                                        }
                                        i20++;
                                        str5 = str4;
                                    }
                                    str3 = str5;
                                    if (width2 + width <= fM6070getMaxWidthimpl) {
                                        arrayList2.addAll(0, arrayList4);
                                        i10 = i19;
                                        i6 = i16;
                                        i9 = i18;
                                    } else {
                                        i10 = i19;
                                        i6 = i16;
                                    }
                                    i7 = i4 + 1;
                                    size = i3;
                                    str5 = str3;
                                }
                            }
                            str5 = CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null) + str6 + CollectionsKt.joinToString$default(arrayList2, "", null, null, 0, null, null, 62, null);
                        }
                        composer.updateRememberedValue(str5);
                        objRememberedValue = str5;
                    }
                    composer.endReplaceGroup();
                    TextKt.m2076Text4IGK_g((String) objRememberedValue, (Modifier) null, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, 0, z, 1, 0, function1, textStyle, composer, 0, 3072, 18434);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        })).get(0).mo4993measureBRTryo0(constraints.getValue());
        return MeasureScope.layout$default(SubcomposeLayout, placeableMo4993measureBRTryo0.getWidth(), placeableMo4993measureBRTryo0.getHeight(), null, new Function1() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiddleEllipsisTextKt.MiddleEllipsisText_oiE5lR0$lambda$4$lambda$3(placeableMo4993measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiddleEllipsisText_oiE5lR0$lambda$4$lambda$2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiddleEllipsisText_oiE5lR0$lambda$4$lambda$3(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
