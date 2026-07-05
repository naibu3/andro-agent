package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", ViewProps.FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", ViewProps.FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", ViewProps.FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", ViewProps.FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", ViewProps.LETTER_SPACING, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", ViewProps.TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", ViewProps.LINE_HEIGHT, ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x040c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2532TextfLXpl1I(final String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        long jM3693getUnspecified0d7_KjU;
        int i9;
        long jM6321getUnspecifiedXSAIIZE;
        int i10;
        final FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        int i25;
        int i26;
        int iM6055getClipgIe3tQ8;
        boolean z2;
        final int i27;
        TextKt$Text$1 textKt$Text$1;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        TextStyle textStyle2;
        FontStyle fontStyle3;
        long j5;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j6;
        int i28;
        long j7;
        long j8;
        Composer composer2;
        final int i29;
        final long j9;
        final Modifier modifier3;
        final boolean z3;
        final Function1<? super TextLayoutResult, Unit> function12;
        final long j10;
        final FontWeight fontWeight4;
        final FontFamily fontFamily4;
        final long j11;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j12;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)104@5368L7,127@6086L145:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i30 = i5 & 2;
        if (i30 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                i8 = i30;
                jM3693getUnspecified0d7_KjU = j;
            } else {
                i8 = i30;
                jM3693getUnspecified0d7_KjU = j;
                if ((i3 & 896) == 0) {
                    i6 |= composerStartRestartGroup.changed(jM3693getUnspecified0d7_KjU) ? 256 : 128;
                }
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i6 |= 3072;
                jM6321getUnspecifiedXSAIIZE = j2;
            } else {
                jM6321getUnspecifiedXSAIIZE = j2;
                if ((i3 & 7168) == 0) {
                    i6 |= composerStartRestartGroup.changed(jM6321getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i6 |= 24576;
                fontStyle2 = fontStyle;
            } else {
                fontStyle2 = fontStyle;
                if ((i3 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
            }
            i11 = i5 & 32;
            if (i11 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i3 & 458752) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                }
            }
            i12 = i5 & 64;
            if (i12 == 0) {
                i6 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                }
            }
            i13 = i5 & 128;
            if (i13 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i5 & 256;
            if (i14 == 0) {
                i6 |= 100663296;
            } else {
                if ((i3 & 234881024) == 0) {
                    i6 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                    i6 |= 805306368;
                } else {
                    if ((i3 & 1879048192) == 0) {
                        i16 = i15;
                        i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i17 = i5 & 1024;
                    if (i17 == 0) {
                        i19 = i4 | 6;
                        i18 = i17;
                    } else if ((i4 & 14) == 0) {
                        i18 = i17;
                        i19 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i17;
                        i19 = i4;
                    }
                    i20 = i5 & 2048;
                    if (i20 == 0) {
                        i19 |= 48;
                    } else {
                        if ((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                            i19 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        }
                        int i31 = i19;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                            i22 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else {
                            int i32 = i31;
                            if ((i4 & 896) == 0) {
                                i32 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                            }
                            i22 = i32;
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                            i24 = i22 | 3072;
                        } else {
                            int i33 = i22;
                            if ((i4 & 7168) == 0) {
                                i24 = i33 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i24 = i33;
                            }
                        }
                        i25 = i5 & 16384;
                        if (i25 == 0) {
                            if ((i4 & 57344) == 0) {
                                i26 = i24 | (composerStartRestartGroup.changed(function1) ? 16384 : 8192);
                            }
                            if ((i4 & 458752) == 0) {
                                i26 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(textStyle)) ? 131072 : 65536;
                            }
                            if ((i6 & 1533916891) == 306783378 || (i26 & 374491) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        jM3693getUnspecified0d7_KjU = Color.INSTANCE.m3693getUnspecified0d7_KjU();
                                    }
                                    if (i9 != 0) {
                                        jM6321getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE();
                                    }
                                    if (i10 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i11 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i12 != 0) {
                                        fontFamily2 = null;
                                    }
                                    long jM6321getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i14 == 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i16 == 0 ? textAlign : null;
                                    long jM6321getUnspecifiedXSAIIZE3 = i18 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j4;
                                    iM6055getClipgIe3tQ8 = i20 == 0 ? TextOverflow.INSTANCE.m6055getClipgIe3tQ8() : i;
                                    z2 = i21 == 0 ? true : z;
                                    i27 = i23 == 0 ? Integer.MAX_VALUE : i2;
                                    textKt$Text$1 = i25 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    if ((i5 & 32768) == 0) {
                                        TextAlign textAlign5 = textAlign4;
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        textStyle2 = (TextStyle) objConsume;
                                        i26 &= -458753;
                                        textAlign2 = textAlign5;
                                        textDecoration2 = textDecoration4;
                                    } else {
                                        textAlign2 = textAlign4;
                                        textDecoration2 = textDecoration4;
                                        textStyle2 = textStyle;
                                    }
                                    fontStyle3 = fontStyle2;
                                    j5 = jM6321getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j6 = jM6321getUnspecifiedXSAIIZE2;
                                    i28 = i26;
                                    j7 = jM6321getUnspecifiedXSAIIZE3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 32768) != 0) {
                                        i26 &= -458753;
                                    }
                                    j6 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j7 = j4;
                                    iM6055getClipgIe3tQ8 = i;
                                    z2 = z;
                                    i27 = i2;
                                    textKt$Text$1 = function1;
                                    textStyle2 = textStyle;
                                    fontStyle3 = fontStyle2;
                                    j5 = jM6321getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    i28 = i26;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1968784669, i6, i28, "androidx.compose.material3.Text (Text.kt:88)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(79582607);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "*109@5483L7");
                                if (jM3693getUnspecified0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                    j8 = jM3693getUnspecified0d7_KjU;
                                } else {
                                    long jM5632getColor0d7_KjU = textStyle2.m5632getColor0d7_KjU();
                                    if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        jM5632getColor0d7_KjU = ((Color) objConsume2).m3667unboximpl();
                                    }
                                    j8 = jM5632getColor0d7_KjU;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j8, j5, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j6, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j7, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
                                int i34 = (i6 & WebSocketProtocol.PAYLOAD_SHORT) | ((i28 >> 3) & 7168);
                                int i35 = i28 << 9;
                                BasicTextKt.m1313BasicTextBpD7jsM(text, modifier2, textStyleMerge, textKt$Text$1, iM6055getClipgIe3tQ8, z2, i27, composerStartRestartGroup, (i35 & 3670016) | i34 | (i35 & 57344) | (i35 & 458752), 0);
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i29 = iM6055getClipgIe3tQ8;
                                j9 = jM3693getUnspecified0d7_KjU;
                                modifier3 = modifier2;
                                z3 = z2;
                                function12 = textKt$Text$1;
                                j10 = j5;
                                fontWeight4 = fontWeight3;
                                fontStyle2 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j11 = j6;
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                j12 = j7;
                                textStyle3 = textStyle2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                textAlign3 = textAlign;
                                i29 = i;
                                z3 = z;
                                i27 = i2;
                                function12 = function1;
                                textStyle3 = textStyle;
                                composer2 = composerStartRestartGroup;
                                j9 = jM3693getUnspecified0d7_KjU;
                                j10 = jM6321getUnspecifiedXSAIIZE;
                                modifier3 = modifier2;
                                fontWeight4 = fontWeight2;
                                fontFamily4 = fontFamily2;
                                j11 = j3;
                                textDecoration3 = textDecoration;
                                j12 = j4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
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

                                public final void invoke(Composer composer3, int i36) {
                                    TextKt.m2532TextfLXpl1I(text, modifier3, j9, j10, fontStyle2, fontWeight4, fontFamily4, j11, textDecoration3, textAlign3, j12, i29, z3, i27, function12, textStyle3, composer3, i3 | 1, i4, i5);
                                }
                            });
                            return;
                        }
                        i24 |= 24576;
                        i26 = i24;
                        if ((i4 & 458752) == 0) {
                        }
                        if ((i6 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i8 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if ((i5 & 32768) == 0) {
                                }
                                fontStyle3 = fontStyle2;
                                j5 = jM6321getUnspecifiedXSAIIZE;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j6 = jM6321getUnspecifiedXSAIIZE2;
                                i28 = i26;
                                j7 = jM6321getUnspecifiedXSAIIZE3;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(79582607);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "*109@5483L7");
                                if (jM3693getUnspecified0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j8, j5, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j6, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j7, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
                                int i342 = (i6 & WebSocketProtocol.PAYLOAD_SHORT) | ((i28 >> 3) & 7168);
                                int i352 = i28 << 9;
                                BasicTextKt.m1313BasicTextBpD7jsM(text, modifier2, textStyleMerge2, textKt$Text$1, iM6055getClipgIe3tQ8, z2, i27, composerStartRestartGroup, (i352 & 3670016) | i342 | (i352 & 57344) | (i352 & 458752), 0);
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i29 = iM6055getClipgIe3tQ8;
                                j9 = jM3693getUnspecified0d7_KjU;
                                modifier3 = modifier2;
                                z3 = z2;
                                function12 = textKt$Text$1;
                                j10 = j5;
                                fontWeight4 = fontWeight3;
                                fontStyle2 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j11 = j6;
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                j12 = j7;
                                textStyle3 = textStyle2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    int i312 = i19;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    i25 = i5 & 16384;
                    if (i25 == 0) {
                    }
                    i26 = i24;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i16 = i15;
                i17 = i5 & 1024;
                if (i17 == 0) {
                }
                i20 = i5 & 2048;
                if (i20 == 0) {
                }
                int i3122 = i19;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                i25 = i5 & 16384;
                if (i25 == 0) {
                }
                i26 = i24;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 1024;
            if (i17 == 0) {
            }
            i20 = i5 & 2048;
            if (i20 == 0) {
            }
            int i31222 = i19;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            i25 = i5 & 16384;
            if (i25 == 0) {
            }
            i26 = i24;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        i11 = i5 & 32;
        if (i11 == 0) {
        }
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 1024;
        if (i17 == 0) {
        }
        i20 = i5 & 2048;
        if (i20 == 0) {
        }
        int i312222 = i19;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        i25 = i5 & 16384;
        if (i25 == 0) {
        }
        i26 = i24;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0443 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013b  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2531Text4IGK_g(final AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        long jM3693getUnspecified0d7_KjU;
        int i9;
        long jM6321getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        int i25;
        int i26;
        int i27;
        int i28;
        int iM6055getClipgIe3tQ8;
        boolean z2;
        final int i29;
        Map<String, InlineTextContent> mapEmptyMap;
        TextKt$Text$3 textKt$Text$3;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        TextStyle textStyle2;
        FontFamily fontFamily3;
        long j5;
        FontStyle fontStyle3;
        FontWeight fontWeight3;
        long j6;
        int i30;
        long j7;
        long j8;
        Composer composer2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final Map<String, InlineTextContent> map2;
        final TextStyle textStyle3;
        final int i31;
        final long j9;
        final Modifier modifier3;
        final boolean z3;
        final long j10;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j11;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)206@10226L7,228@10943L167:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                i8 = i32;
                jM3693getUnspecified0d7_KjU = j;
            } else {
                i8 = i32;
                jM3693getUnspecified0d7_KjU = j;
                if ((i3 & 896) == 0) {
                    i6 |= composerStartRestartGroup.changed(jM3693getUnspecified0d7_KjU) ? 256 : 128;
                }
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i6 |= 3072;
                jM6321getUnspecifiedXSAIIZE = j2;
            } else {
                jM6321getUnspecifiedXSAIIZE = j2;
                if ((i3 & 7168) == 0) {
                    i6 |= composerStartRestartGroup.changed(jM6321getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i6 |= 24576;
                fontStyle2 = fontStyle;
            } else {
                fontStyle2 = fontStyle;
                if ((i3 & 57344) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
            }
            i11 = i5 & 32;
            if (i11 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                fontWeight2 = fontWeight;
            } else {
                fontWeight2 = fontWeight;
                if ((i3 & 458752) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                }
            }
            i12 = i5 & 64;
            if (i12 == 0) {
                i6 |= 1572864;
                fontFamily2 = fontFamily;
            } else {
                fontFamily2 = fontFamily;
                if ((i3 & 3670016) == 0) {
                    i6 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                }
            }
            i13 = i5 & 128;
            if (i13 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i14 = i5 & 256;
            if (i14 == 0) {
                i6 |= 100663296;
            } else {
                if ((i3 & 234881024) == 0) {
                    i6 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                    i6 |= 805306368;
                } else {
                    if ((i3 & 1879048192) == 0) {
                        i16 = i15;
                        i6 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i17 = i5 & 1024;
                    if (i17 == 0) {
                        i19 = i4 | 6;
                        i18 = i17;
                    } else if ((i4 & 14) == 0) {
                        i18 = i17;
                        i19 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i17;
                        i19 = i4;
                    }
                    i20 = i5 & 2048;
                    if (i20 == 0) {
                        i19 |= 48;
                    } else {
                        if ((i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                            i19 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        }
                        int i33 = i19;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                            i22 = i33 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else {
                            int i34 = i33;
                            if ((i4 & 896) == 0) {
                                i34 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                            }
                            i22 = i34;
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                            i24 = i22 | 3072;
                        } else {
                            int i35 = i22;
                            if ((i4 & 7168) == 0) {
                                i24 = i35 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i24 = i35;
                            }
                        }
                        i25 = i5 & 16384;
                        if (i25 != 0) {
                            i24 |= 8192;
                        }
                        i26 = i5 & 32768;
                        if (i26 != 0) {
                            i27 = i24 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            int i36 = i24;
                            if ((i4 & 458752) == 0) {
                                i27 = i36 | (composerStartRestartGroup.changed(function1) ? 131072 : 65536);
                            } else {
                                i27 = i36;
                            }
                        }
                        if ((i4 & 3670016) == 0) {
                            i27 |= ((i5 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if (i25 == 16384) {
                            i28 = i25;
                            if ((1533916891 & i6) == 306783378 && (i27 & 2995931) == 599186 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                fontFamily4 = fontFamily2;
                                j9 = jM3693getUnspecified0d7_KjU;
                                textAlign3 = textAlign;
                                i31 = i;
                                z3 = z;
                                i29 = i2;
                                map2 = map;
                                function12 = function1;
                                textStyle3 = textStyle;
                                composer2 = composerStartRestartGroup;
                                j10 = jM6321getUnspecifiedXSAIIZE;
                                modifier3 = modifier2;
                                fontStyle4 = fontStyle2;
                                fontWeight4 = fontWeight2;
                                j11 = j3;
                                textDecoration3 = textDecoration;
                                j12 = j4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
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

                                public final void invoke(Composer composer3, int i37) {
                                    TextKt.m2531Text4IGK_g(text, modifier3, j9, j10, fontStyle4, fontWeight4, fontFamily4, j11, textDecoration3, textAlign3, j12, i31, z3, i29, map2, function12, textStyle3, composer3, i3 | 1, i4, i5);
                                }
                            });
                            return;
                        }
                        i28 = i25;
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                jM3693getUnspecified0d7_KjU = Color.INSTANCE.m3693getUnspecified0d7_KjU();
                            }
                            if (i9 != 0) {
                                jM6321getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE();
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            }
                            if (i11 != 0) {
                                fontWeight2 = null;
                            }
                            if (i12 != 0) {
                                fontFamily2 = null;
                            }
                            long jM6321getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j3;
                            TextDecoration textDecoration4 = i14 == 0 ? null : textDecoration;
                            TextAlign textAlign4 = i16 == 0 ? textAlign : null;
                            long jM6321getUnspecifiedXSAIIZE3 = i18 == 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j4;
                            iM6055getClipgIe3tQ8 = i20 == 0 ? TextOverflow.INSTANCE.m6055getClipgIe3tQ8() : i;
                            z2 = i21 == 0 ? true : z;
                            i29 = i23 == 0 ? Integer.MAX_VALUE : i2;
                            if (i28 == 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                                i27 &= -57345;
                            } else {
                                mapEmptyMap = map;
                            }
                            textKt$Text$3 = i26 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if ((i5 & 65536) == 0) {
                                TextAlign textAlign5 = textAlign4;
                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                textStyle2 = (TextStyle) objConsume;
                                i27 &= -3670017;
                                textAlign2 = textAlign5;
                                textDecoration2 = textDecoration4;
                            } else {
                                textAlign2 = textAlign4;
                                textDecoration2 = textDecoration4;
                                textStyle2 = textStyle;
                            }
                            fontFamily3 = fontFamily2;
                            j5 = jM6321getUnspecifiedXSAIIZE;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            j6 = jM6321getUnspecifiedXSAIIZE2;
                            i30 = i27;
                            j7 = jM6321getUnspecifiedXSAIIZE3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if (i28 != 0) {
                                i27 &= -57345;
                            }
                            if ((i5 & 65536) != 0) {
                                i27 &= -3670017;
                            }
                            j6 = j3;
                            textDecoration2 = textDecoration;
                            textAlign2 = textAlign;
                            j7 = j4;
                            iM6055getClipgIe3tQ8 = i;
                            z2 = z;
                            i29 = i2;
                            mapEmptyMap = map;
                            textKt$Text$3 = function1;
                            textStyle2 = textStyle;
                            fontFamily3 = fontFamily2;
                            j5 = jM6321getUnspecifiedXSAIIZE;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            i30 = i27;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(224529679, i6, i30, "androidx.compose.material3.Text (Text.kt:189)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(79587464);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "*210@10340L7");
                        if (jM3693getUnspecified0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                            j8 = jM3693getUnspecified0d7_KjU;
                        } else {
                            long jM5632getColor0d7_KjU = textStyle2.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                jM5632getColor0d7_KjU = ((Color) objConsume2).m3667unboximpl();
                            }
                            j8 = jM5632getColor0d7_KjU;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextStyle textStyleMerge = textStyle2.merge(new TextStyle(j8, j5, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j6, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j7, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
                        int i37 = 16777216 | (i6 & 14) | (i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i30 >> 6) & 7168);
                        int i38 = i30 << 9;
                        BasicTextKt.m1311BasicText4YKlhWE(text, modifier2, textStyleMerge, textKt$Text$3, iM6055getClipgIe3tQ8, z2, i29, mapEmptyMap, composerStartRestartGroup, (i38 & 3670016) | i37 | (57344 & i38) | (i38 & 458752), 0);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Map<String, InlineTextContent> map3 = mapEmptyMap;
                        function12 = textKt$Text$3;
                        map2 = map3;
                        textStyle3 = textStyle2;
                        i31 = iM6055getClipgIe3tQ8;
                        j9 = jM3693getUnspecified0d7_KjU;
                        modifier3 = modifier2;
                        z3 = z2;
                        j10 = j5;
                        fontWeight4 = fontWeight3;
                        fontStyle4 = fontStyle3;
                        fontFamily4 = fontFamily3;
                        j11 = j6;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j12 = j7;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    int i332 = i19;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    i25 = i5 & 16384;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 32768;
                    if (i26 != 0) {
                    }
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i25 == 16384) {
                    }
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) == 0) {
                        if (i8 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if ((i5 & 65536) == 0) {
                        }
                        fontFamily3 = fontFamily2;
                        j5 = jM6321getUnspecifiedXSAIIZE;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        j6 = jM6321getUnspecifiedXSAIIZE2;
                        i30 = i27;
                        j7 = jM6321getUnspecifiedXSAIIZE3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(79587464);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "*210@10340L7");
                        if (jM3693getUnspecified0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        TextStyle textStyleMerge2 = textStyle2.merge(new TextStyle(j8, j5, fontWeight3, fontStyle3, (FontSynthesis) null, fontFamily3, (String) null, j6, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j7, (TextIndent) null, 175952, (DefaultConstructorMarker) null));
                        int i372 = 16777216 | (i6 & 14) | (i6 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i30 >> 6) & 7168);
                        int i382 = i30 << 9;
                        BasicTextKt.m1311BasicText4YKlhWE(text, modifier2, textStyleMerge2, textKt$Text$3, iM6055getClipgIe3tQ8, z2, i29, mapEmptyMap, composerStartRestartGroup, (i382 & 3670016) | i372 | (57344 & i382) | (i382 & 458752), 0);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Map<String, InlineTextContent> map32 = mapEmptyMap;
                        function12 = textKt$Text$3;
                        map2 = map32;
                        textStyle3 = textStyle2;
                        i31 = iM6055getClipgIe3tQ8;
                        j9 = jM3693getUnspecified0d7_KjU;
                        modifier3 = modifier2;
                        z3 = z2;
                        j10 = j5;
                        fontWeight4 = fontWeight3;
                        fontStyle4 = fontStyle3;
                        fontFamily4 = fontFamily3;
                        j11 = j6;
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        j12 = j7;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i16 = i15;
                i17 = i5 & 1024;
                if (i17 == 0) {
                }
                i20 = i5 & 2048;
                if (i20 == 0) {
                }
                int i3322 = i19;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                i25 = i5 & 16384;
                if (i25 != 0) {
                }
                i26 = i5 & 32768;
                if (i26 != 0) {
                }
                if ((i4 & 3670016) == 0) {
                }
                if (i25 == 16384) {
                }
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) == 0) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 1024;
            if (i17 == 0) {
            }
            i20 = i5 & 2048;
            if (i20 == 0) {
            }
            int i33222 = i19;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            i25 = i5 & 16384;
            if (i25 != 0) {
            }
            i26 = i5 & 32768;
            if (i26 != 0) {
            }
            if ((i4 & 3670016) == 0) {
            }
            if (i25 == 16384) {
            }
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        i11 = i5 & 32;
        if (i11 == 0) {
        }
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 1024;
        if (i17 == 0) {
        }
        i20 = i5 & 2048;
        if (i20 == 0) {
        }
        int i332222 = i19;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        i25 = i5 & 16384;
        if (i25 != 0) {
        }
        i26 = i5 & 32768;
        if (i26 != 0) {
        }
        if ((i4 & 3670016) == 0) {
        }
        if (i25 == 16384) {
        }
        composerStartRestartGroup.startDefaults();
        if ((i3 & 1) == 0) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProvideTextStyle)P(1)259@12067L7,260@12092L80:Text.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:258)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) objConsume).merge(value))}, content, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt.ProvideTextStyle.1
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

            public final void invoke(Composer composer2, int i3) {
                TextKt.ProvideTextStyle(value, content, composer2, i | 1);
            }
        });
    }
}
