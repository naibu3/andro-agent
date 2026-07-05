package com.stripe.android.link.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkAppBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$LinkAppBarKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$LinkAppBarKt$lambda3$1 INSTANCE = new ComposableSingletons$LinkAppBarKt$lambda3$1();

    ComposableSingletons$LinkAppBarKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(957945807, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-3.<anonymous> (LinkAppBar.kt:183)");
            }
            LinkAppBarState linkAppBarState = new LinkAppBarState(false, true, ResolvableStringUtilsKt.getResolvableString("Add a payment method"), false);
            composer.startReplaceGroup(312415217);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LinkAppBarKt.LinkAppBar(linkAppBarState, null, (Function0) objRememberedValue, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
