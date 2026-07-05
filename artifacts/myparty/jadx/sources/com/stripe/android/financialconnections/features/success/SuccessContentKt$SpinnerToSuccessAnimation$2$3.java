package com.stripe.android.financialconnections.features.success;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuccessContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SuccessContentKt$SpinnerToSuccessAnimation$2$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ TextResource $content;
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<Dp> $successBodyHeight$delegate;
    final /* synthetic */ TextResource $title;

    SuccessContentKt$SpinnerToSuccessAnimation$2$3(TextResource textResource, TextResource textResource2, Density density, MutableState<Dp> mutableState) {
        this.$content = textResource;
        this.$title = textResource2;
        this.$density = density;
        this.$successBodyHeight$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-167121685, i, -1, "com.stripe.android.financialconnections.features.success.SpinnerToSuccessAnimation.<anonymous>.<anonymous> (SuccessContent.kt:217)");
        }
        TextResource textResource = this.$content;
        TextResource textResource2 = this.$title;
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1307204663);
        boolean zChanged = composer.changed(this.$density);
        final Density density = this.$density;
        final MutableState<Dp> mutableState = this.$successBodyHeight$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.success.SuccessContentKt$SpinnerToSuccessAnimation$2$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SuccessContentKt$SpinnerToSuccessAnimation$2$3.invoke$lambda$2$lambda$1(density, mutableState, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SuccessContentKt.SuccessBody(textResource, textResource2, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Density density, MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SuccessContentKt.SpinnerToSuccessAnimation_8GFhAUE$lambda$21(mutableState, density.mo709toDpu2uoSUM(IntSize.m6286getHeightimpl(it.mo5001getSizeYbymL2g())));
        return Unit.INSTANCE;
    }
}
