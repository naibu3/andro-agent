package com.stripe.android.uicore.text;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: MiddleEllipsisText.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MiddleEllipsisTextKt$MiddleEllipsisText$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $color;
    final /* synthetic */ char $ellipsisChar;
    final /* synthetic */ FontFamily $fontFamily;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ FontStyle $fontStyle;
    final /* synthetic */ FontWeight $fontWeight;
    final /* synthetic */ long $letterSpacing;
    final /* synthetic */ long $lineHeight;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ String $text;
    final /* synthetic */ TextAlign $textAlign;
    final /* synthetic */ TextDecoration $textDecoration;
    final /* synthetic */ Ref.ObjectRef<TextLayoutResult> $textLayoutResult;

    MiddleEllipsisTextKt$MiddleEllipsisText$2$1(String str, char c, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, boolean z, TextStyle textStyle, Ref.ObjectRef<TextLayoutResult> objectRef) {
        this.$text = str;
        this.$ellipsisChar = c;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = fontStyle;
        this.$fontWeight = fontWeight;
        this.$fontFamily = fontFamily;
        this.$letterSpacing = j3;
        this.$textDecoration = textDecoration;
        this.$textAlign = textAlign;
        this.$lineHeight = j4;
        this.$softWrap = z;
        this.$style = textStyle;
        this.$textLayoutResult = objectRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(566593623, i, -1, "com.stripe.android.uicore.text.MiddleEllipsisText.<anonymous>.<anonymous> (MiddleEllipsisText.kt:79)");
        }
        String str = this.$text + this.$ellipsisChar;
        long j = this.$color;
        long j2 = this.$fontSize;
        FontStyle fontStyle = this.$fontStyle;
        FontWeight fontWeight = this.$fontWeight;
        FontFamily fontFamily = this.$fontFamily;
        long j3 = this.$letterSpacing;
        TextDecoration textDecoration = this.$textDecoration;
        TextAlign textAlign = this.$textAlign;
        long j4 = this.$lineHeight;
        boolean z = this.$softWrap;
        final Ref.ObjectRef<TextLayoutResult> objectRef = this.$textLayoutResult;
        TextKt.m2076Text4IGK_g(str, (Modifier) null, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, 0, z, 0, 0, (Function1<? super TextLayoutResult, Unit>) new Function1() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$MiddleEllipsisText$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiddleEllipsisTextKt$MiddleEllipsisText$2$1.invoke$lambda$0(objectRef, (TextLayoutResult) obj);
            }
        }, this.$style, composer, 0, 0, 26626);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$0(Ref.ObjectRef objectRef, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }
}
