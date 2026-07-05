package com.stripe.android.financialconnections.features.accountupdate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.Image;
import defpackage.Alignment;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.VerticalAlignment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccountUpdateRequiredModal.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.features.accountupdate.ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$AccountUpdateRequiredModalKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AccountUpdateRequiredModalKt$lambda1$1 INSTANCE = new ComposableSingletons$AccountUpdateRequiredModalKt$lambda1$1();

    ComposableSingletons$AccountUpdateRequiredModalKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1062202223, i, -1, "com.stripe.android.financialconnections.features.accountupdate.ComposableSingletons$AccountUpdateRequiredModalKt.lambda-1.<anonymous> (AccountUpdateRequiredModal.kt:61)");
            }
            NoticeSheetState.NoticeSheetContent.UpdateRequired updateRequired = new NoticeSheetState.NoticeSheetContent.UpdateRequired(new FinancialConnectionsGenericInfoScreen("sampleScreen1", new FinancialConnectionsGenericInfoScreen.Header("Update required", "Backend driven update subtitle. An update is required on this account!", new Image("BrandIcon"), Alignment.Left), null, new FinancialConnectionsGenericInfoScreen.Footer((String) null, new FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction("primaryCta1", "Continue", null), new FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction("primaryCta1", "Cancel", null), (String) null, 1, (DefaultConstructorMarker) null), new FinancialConnectionsGenericInfoScreen.Options(true, VerticalAlignment.Default)), new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability(null));
            composer.startReplaceGroup(-1292546460);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.accountupdate.ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1292545596);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.accountupdate.ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AccountUpdateRequiredModalKt.AccountUpdateRequiredModalContent(updateRequired, function0, (Function0) objRememberedValue2, composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
