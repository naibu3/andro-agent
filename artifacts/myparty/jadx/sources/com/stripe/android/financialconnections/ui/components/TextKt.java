package com.stripe.android.financialconnections.ui.components;

import android.text.Annotation;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020 H\u0002\u001a-\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00032\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0005H\u0003¢\u0006\u0002\u0010#\u001a=\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u00102\b\b\u0001\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0)\"\u00020 H\u0001¢\u0006\u0002\u0010*¨\u0006+²\u0006\f\u0010,\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002"}, d2 = {"AnnotatedText", "", "text", "Lcom/stripe/android/financialconnections/ui/TextResource;", "onClickableTextClick", "Lkotlin/Function1;", "", "defaultStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "annotationStyles", "", "Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;", "Landroidx/compose/ui/text/SpanStyle;", "maxLines", "", ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "AnnotatedText-rm0N8CA", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Ljava/util/Map;IILandroidx/compose/runtime/Composer;II)V", "clickedAnnotation", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/TextLayoutResult;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "resource", "Landroidx/compose/ui/text/AnnotatedString;", "clickedAnnotation-d-4ec7I", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toAnnotation", "Landroid/text/Annotation;", "", "annotatedStringResource", "spanStyleForAnnotation", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "pluralStringResource", "singular", "plural", NewHtcHomeBadger.COUNT, "formatArgs", "", "(III[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "financial-connections_release", "pressedAnnotation", "layoutResult"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnnotatedText_rm0N8CA$lambda$12(TextResource textResource, Function1 function1, TextStyle textStyle, Modifier modifier, Map map, int i, int i2, int i3, int i4, Composer composer, int i5) {
        m7586AnnotatedTextrm0N8CA(textResource, function1, textStyle, modifier, map, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /* renamed from: AnnotatedText-rm0N8CA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7586AnnotatedTextrm0N8CA(final TextResource text, final Function1<? super String, Unit> onClickableTextClick, final TextStyle defaultStyle, Modifier modifier, Map<StringAnnotation, SpanStyle> map, int i, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        final Map<StringAnnotation, SpanStyle> mapMapOf;
        int i6;
        int i7;
        int i8;
        int iM6055getClipgIe3tQ8;
        int i9;
        final long jM7645getTextDefault0d7_KjU;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        AnnotatedString annotatedStringAnnotatedStringResource;
        Object objRememberedValue3;
        final MutableState mutableState2;
        boolean zChanged;
        AnnotatedString annotatedString;
        Function1<? super String, Unit> function1;
        TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$1;
        Object objRememberedValue4;
        final int i10;
        final int i11;
        final Map<StringAnnotation, SpanStyle> map2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1670114880);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? composerStartRestartGroup.changed(text) : composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(defaultStyle) ? 256 : 128;
        }
        int i12 = i4 & 8;
        if (i12 != 0) {
            i5 |= 3072;
        } else {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 24576) != 0) {
                if ((i4 & 16) == 0) {
                    mapMapOf = map;
                    int i13 = composerStartRestartGroup.changedInstance(mapMapOf) ? 16384 : 8192;
                    i5 |= i13;
                } else {
                    mapMapOf = map;
                }
                i5 |= i13;
            } else {
                mapMapOf = map;
            }
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((196608 & i3) == 0) {
                    i7 = i;
                    i5 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                    if ((1572864 & i3) == 0) {
                        iM6055getClipgIe3tQ8 = i2;
                        i5 |= composerStartRestartGroup.changed(iM6055getClipgIe3tQ8) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                                mapMapOf = MapsKt.mapOf(TuplesKt.to(StringAnnotation.CLICKABLE, SpanStyle.m5543copyGSF8kmg$default(defaultStyle.toSpanStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.INSTANCE.getUnderline(), null, null, null, 61439, null)));
                            }
                            if (i6 != 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                            if (i8 == 0) {
                                i9 = i5;
                                iM6055getClipgIe3tQ8 = TextOverflow.INSTANCE.m6055getClipgIe3tQ8();
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1670114880, i9, -1, "com.stripe.android.financialconnections.ui.components.AnnotatedText (Text.kt:42)");
                            }
                            jM7645getTextDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU();
                            composerStartRestartGroup.startReplaceGroup(1381270937);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1381275640);
                            zChangedInstance = composerStartRestartGroup.changedInstance(mapMapOf) | composerStartRestartGroup.changed(jM7645getTextDefault0d7_KjU);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TextKt.AnnotatedText_rm0N8CA$lambda$5$lambda$4(mapMapOf, jM7645getTextDefault0d7_KjU, mutableState, (Annotation) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            annotatedStringAnnotatedStringResource = annotatedStringResource(text, (Function1) objRememberedValue2, composerStartRestartGroup, i9 & 14, 0);
                            composerStartRestartGroup.startReplaceGroup(1381288588);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            mutableState2 = (MutableState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1381293076);
                            zChanged = composerStartRestartGroup.changed(annotatedStringAnnotatedStringResource) | ((i9 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                annotatedString = annotatedStringAnnotatedStringResource;
                                function1 = onClickableTextClick;
                                textKt$AnnotatedText$pressIndicator$1$1 = new TextKt$AnnotatedText$pressIndicator$1$1(annotatedString, mutableState2, mutableState, onClickableTextClick, null);
                                composerStartRestartGroup.updateRememberedValue(textKt$AnnotatedText$pressIndicator$1$1);
                            } else {
                                annotatedString = annotatedStringAnnotatedStringResource;
                                textKt$AnnotatedText$pressIndicator$1$1 = objRememberedValue5;
                                function1 = onClickableTextClick;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion, function1, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) textKt$AnnotatedText$pressIndicator$1$1));
                            composerStartRestartGroup.startReplaceGroup(1381320097);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TextKt.AnnotatedText_rm0N8CA$lambda$11$lambda$10(mutableState2, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i14 = iM6055getClipgIe3tQ8;
                            Map<StringAnnotation, SpanStyle> map3 = mapMapOf;
                            Modifier modifier4 = modifier2;
                            int i15 = i7;
                            BasicTextKt.m1314BasicTextRWo7tUw(annotatedString, modifierThen, defaultStyle, (Function1) objRememberedValue4, i14, true, i15, 0, null, null, composerStartRestartGroup, (i9 & 896) | 199680 | ((i9 >> 6) & 57344) | ((i9 << 3) & 3670016), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i10 = i14;
                            i11 = i15;
                            map2 = map3;
                            modifier3 = modifier4;
                        }
                        i9 = i5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM7645getTextDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(1381270937);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1381275640);
                        zChangedInstance = composerStartRestartGroup.changedInstance(mapMapOf) | composerStartRestartGroup.changed(jM7645getTextDefault0d7_KjU);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TextKt.AnnotatedText_rm0N8CA$lambda$5$lambda$4(mapMapOf, jM7645getTextDefault0d7_KjU, mutableState, (Annotation) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            annotatedStringAnnotatedStringResource = annotatedStringResource(text, (Function1) objRememberedValue2, composerStartRestartGroup, i9 & 14, 0);
                            composerStartRestartGroup.startReplaceGroup(1381288588);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState2 = (MutableState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1381293076);
                            zChanged = composerStartRestartGroup.changed(annotatedStringAnnotatedStringResource) | ((i9 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32);
                            Object objRememberedValue52 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                annotatedString = annotatedStringAnnotatedStringResource;
                                function1 = onClickableTextClick;
                                textKt$AnnotatedText$pressIndicator$1$1 = new TextKt$AnnotatedText$pressIndicator$1$1(annotatedString, mutableState2, mutableState, onClickableTextClick, null);
                                composerStartRestartGroup.updateRememberedValue(textKt$AnnotatedText$pressIndicator$1$1);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function1, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) textKt$AnnotatedText$pressIndicator$1$1));
                                composerStartRestartGroup.startReplaceGroup(1381320097);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i142 = iM6055getClipgIe3tQ8;
                                Map<StringAnnotation, SpanStyle> map32 = mapMapOf;
                                Modifier modifier42 = modifier2;
                                int i152 = i7;
                                BasicTextKt.m1314BasicTextRWo7tUw(annotatedString, modifierThen2, defaultStyle, (Function1) objRememberedValue4, i142, true, i152, 0, null, null, composerStartRestartGroup, (i9 & 896) | 199680 | ((i9 >> 6) & 57344) | ((i9 << 3) & 3670016), 896);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i10 = i142;
                                i11 = i152;
                                map2 = map32;
                                modifier3 = modifier42;
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        map2 = mapMapOf;
                        i11 = i7;
                        i10 = iM6055getClipgIe3tQ8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TextKt.AnnotatedText_rm0N8CA$lambda$12(text, onClickableTextClick, defaultStyle, modifier3, map2, i11, i10, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                iM6055getClipgIe3tQ8 = i2;
                if ((i5 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) == 0) {
                        if (i12 != 0) {
                        }
                        if ((i4 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 == 0) {
                            i9 = i5;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM7645getTextDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(1381270937);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1381275640);
                        zChangedInstance = composerStartRestartGroup.changedInstance(mapMapOf) | composerStartRestartGroup.changed(jM7645getTextDefault0d7_KjU);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i;
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            iM6055getClipgIe3tQ8 = i2;
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 24576) != 0) {
        }
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        iM6055getClipgIe3tQ8 = i2;
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final String AnnotatedText_rm0N8CA$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle AnnotatedText_rm0N8CA$lambda$5$lambda$4(Map map, long j, MutableState mutableState, Annotation annotation) {
        StringAnnotation next;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Iterator<StringAnnotation> it = StringAnnotation.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getValue(), annotation.getKey())) {
                break;
            }
        }
        SpanStyle spanStyle = (SpanStyle) map.get(next);
        if (!Intrinsics.areEqual(AnnotatedText_rm0N8CA$lambda$1(mutableState), annotation.getValue())) {
            return spanStyle;
        }
        if (spanStyle != null) {
            return SpanStyle.m5543copyGSF8kmg$default(spanStyle, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLayoutResult AnnotatedText_rm0N8CA$lambda$7(MutableState<TextLayoutResult> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnnotatedText_rm0N8CA$lambda$11$lambda$10(MutableState mutableState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clickedAnnotation-d-4ec7I, reason: not valid java name */
    public static final AnnotatedString.Range<String> m7588clickedAnnotationd4ec7I(TextLayoutResult textLayoutResult, long j, AnnotatedString annotatedString) {
        int iM5574getOffsetForPositionk4lQ0M = textLayoutResult.m5574getOffsetForPositionk4lQ0M(j);
        return (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations(StringAnnotation.CLICKABLE.getValue(), iM5574getOffsetForPositionk4lQ0M, iM5574getOffsetForPositionk4lQ0M));
    }

    private static final Annotation toAnnotation(Object obj) {
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 0 || style != 1) {
                return null;
            }
            return new Annotation(StringAnnotation.BOLD.getValue(), "");
        }
        if (obj instanceof URLSpan) {
            return new Annotation(StringAnnotation.CLICKABLE.getValue(), ((URLSpan) obj).getURL());
        }
        if (obj instanceof Annotation) {
            return (Annotation) obj;
        }
        return null;
    }

    private static final AnnotatedString annotatedStringResource(TextResource textResource, Function1<? super Annotation, SpanStyle> function1, Composer composer, int i, int i2) {
        composer.startReplaceGroup(134522096);
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(2008361362);
            TextKt$annotatedStringResource$1$1 textKt$annotatedStringResource$1$1RememberedValue = composer.rememberedValue();
            if (textKt$annotatedStringResource$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                textKt$annotatedStringResource$1$1RememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$annotatedStringResource$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(Annotation it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return null;
                    }
                };
                composer.updateRememberedValue(textKt$annotatedStringResource$1$1RememberedValue);
            }
            function1 = (Function1) textKt$annotatedStringResource$1$1RememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(134522096, i, -1, "com.stripe.android.financialconnections.ui.components.annotatedStringResource (Text.kt:119)");
        }
        SpannedString spannedString = new SpannedString(textResource.toText(composer, i & 14));
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String string = spannedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        builder.append(string);
        for (Object obj : spannedString.getSpans(0, spannedString.length(), Object.class)) {
            int spanStart = spannedString.getSpanStart(obj);
            int spanEnd = spannedString.getSpanEnd(obj);
            Annotation annotation = toAnnotation(obj);
            if (annotation != null) {
                String key = annotation.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
                String value = annotation.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                builder.addStringAnnotation(key, value, spanStart, spanEnd);
                SpanStyle spanStyleInvoke = function1.invoke(annotation);
                if (spanStyleInvoke != null) {
                    builder.addStyle(spanStyleInvoke, spanStart, spanEnd);
                }
            }
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }

    public static final String pluralStringResource(int i, int i2, int i3, Object[] formatArgs, Composer composer, int i4) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        composer.startReplaceGroup(1331052840);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331052840, i4, -1, "com.stripe.android.financialconnections.ui.components.pluralStringResource (Text.kt:149)");
        }
        if (i3 == 1) {
            composer.startReplaceGroup(1744123613);
            strStringResource = StringResources_androidKt.stringResource(i, Arrays.copyOf(formatArgs, formatArgs.length), composer, i4 & 14);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1744182079);
            strStringResource = StringResources_androidKt.stringResource(i2, Arrays.copyOf(formatArgs, formatArgs.length), composer, (i4 >> 3) & 14);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }
}
