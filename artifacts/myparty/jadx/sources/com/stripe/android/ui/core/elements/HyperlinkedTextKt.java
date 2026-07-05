package com.stripe.android.ui.core.elements;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HyperlinkedText.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"HyperlinkedText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "style", "Landroidx/compose/ui/text/TextStyle;", "HyperlinkedText-cf5BqRc", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "urlPattern", "Ljava/util/regex/Pattern;", "extractLinkAnnotations", "", "Lcom/stripe/android/ui/core/elements/LinkAnnotation;", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HyperlinkedTextKt {
    private static final Pattern urlPattern;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HyperlinkedText_cf5BqRc$lambda$7(String str, Modifier modifier, long j, TextStyle textStyle, int i, int i2, Composer composer, int i3) {
        m8654HyperlinkedTextcf5BqRc(str, modifier, j, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d A[LOOP:0: B:86:0x0157->B:88:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    /* renamed from: HyperlinkedText-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8654HyperlinkedTextcf5BqRc(final String text, Modifier modifier, long j, TextStyle textStyle, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        TextStyle textStyle2;
        long jM3693getUnspecified0d7_KjU;
        int i5;
        Modifier modifier3;
        TextStyle textStyle3;
        UriHandler uriHandler;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean z;
        Object objRememberedValue2;
        AnnotatedString annotatedString;
        boolean zChanged;
        HyperlinkedTextKt$HyperlinkedText$1$1 hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier4;
        final long j3;
        final TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1671475014);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    j2 = j;
                    i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        textStyle2 = textStyle;
                        int i7 = composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i3 |= i7;
                } else {
                    textStyle2 = textStyle;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        jM3693getUnspecified0d7_KjU = i4 == 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j2;
                        if ((i2 & 8) == 0) {
                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            textStyle3 = (TextStyle) objConsume;
                            i5 = i3 & (-7169);
                            modifier3 = modifier2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1671475014, i5, -1, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:25)");
                            }
                            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localUriHandler);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            uriHandler = (UriHandler) objConsume2;
                            composerStartRestartGroup.startReplaceGroup(-431032317);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-431029084);
                            z = (i5 & 14) != 4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                builder.append(text);
                                for (LinkAnnotation linkAnnotation : extractLinkAnnotations(text)) {
                                    builder.addStringAnnotation("URL", linkAnnotation.getUrl(), linkAnnotation.getStart(), linkAnnotation.getEnd());
                                }
                                objRememberedValue2 = builder.toAnnotatedString();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            annotatedString = (AnnotatedString) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-431014711);
                            zChanged = composerStartRestartGroup.changed(annotatedString) | composerStartRestartGroup.changedInstance(uriHandler);
                            hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue = new HyperlinkedTextKt$HyperlinkedText$1$1(mutableState, annotatedString, uriHandler, null);
                                composerStartRestartGroup.updateRememberedValue(hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier3, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue);
                            composerStartRestartGroup.startReplaceGroup(-430997090);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.stripe.android.ui.core.elements.HyperlinkedTextKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HyperlinkedTextKt.HyperlinkedText_cf5BqRc$lambda$6$lambda$5(mutableState, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            TextKt.m2077TextIbK3jfQ(annotatedString, modifierPointerInput, jM3693getUnspecified0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (Function1) objRememberedValue3, textStyle3, composer2, i5 & 896, ((i5 << 12) & 29360128) | 1572864, 65528);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            j3 = jM3693getUnspecified0d7_KjU;
                            textStyle4 = textStyle3;
                        } else {
                            i5 = i3;
                            modifier3 = modifier2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        jM3693getUnspecified0d7_KjU = j2;
                    }
                    textStyle3 = textStyle2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<UriHandler> localUriHandler2 = CompositionLocalsKt.getLocalUriHandler();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume22 = composerStartRestartGroup.consume(localUriHandler2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    uriHandler = (UriHandler) objConsume22;
                    composerStartRestartGroup.startReplaceGroup(-431032317);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-431029084);
                    if ((i5 & 14) != 4) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                        builder2.append(text);
                        while (r5.hasNext()) {
                        }
                        objRememberedValue2 = builder2.toAnnotatedString();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        annotatedString = (AnnotatedString) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-431014711);
                        zChanged = composerStartRestartGroup.changed(annotatedString) | composerStartRestartGroup.changedInstance(uriHandler);
                        hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue = new HyperlinkedTextKt$HyperlinkedText$1$1(mutableState, annotatedString, uriHandler, null);
                            composerStartRestartGroup.updateRememberedValue(hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier3, unit2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) hyperlinkedTextKt$HyperlinkedText$1$1RememberedValue);
                            composerStartRestartGroup.startReplaceGroup(-430997090);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            TextKt.m2077TextIbK3jfQ(annotatedString, modifierPointerInput2, jM3693getUnspecified0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (Function1) objRememberedValue3, textStyle3, composer2, i5 & 896, ((i5 << 12) & 29360128) | 1572864, 65528);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j3 = jM3693getUnspecified0d7_KjU;
                            textStyle4 = textStyle3;
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    j3 = j2;
                    textStyle4 = textStyle2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.HyperlinkedTextKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HyperlinkedTextKt.HyperlinkedText_cf5BqRc$lambda$7(text, modifier4, j3, textStyle4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            j2 = j;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        j2 = j;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HyperlinkedText_cf5BqRc$lambda$6$lambda$5(MutableState mutableState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    static {
        Pattern patternCompile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        urlPattern = patternCompile;
    }

    private static final List<LinkAnnotation> extractLinkAnnotations(String str) {
        Matcher matcher = urlPattern.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start(1);
            int iEnd = matcher.end();
            String strSubstring = str.substring(iStart, iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!StringsKt.startsWith$default(strSubstring, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(strSubstring, "https://", false, 2, (Object) null)) {
                strSubstring = "https://" + strSubstring;
            }
            arrayList.add(new LinkAnnotation(strSubstring, iStart, iEnd));
        }
        return arrayList;
    }
}
