package com.stripe.android.financialconnections.features.exit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ExitModal.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$ExitModalKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ExitModalKt$lambda3$1 INSTANCE = new ComposableSingletons$ExitModalKt$lambda3$1();

    ComposableSingletons$ExitModalKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1374968111, i, -1, "com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt.lambda-3.<anonymous> (ExitModal.kt:104)");
            }
            TextResource.StringId stringId = new TextResource.StringId(R.string.stripe_exit_modal_desc, CollectionsKt.listOf("MerchantName"));
            composer.startReplaceGroup(-1038670139);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1038669147);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.exit.ComposableSingletons$ExitModalKt$lambda-3$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ExitModalKt.ExitModalContent(stringId, false, function0, (Function0) objRememberedValue2, composer, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
