package com.stripe.android.link.ui.updatecard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.CardEditConfiguration;
import com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.EditCardPayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UpdateCardScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$UpdateCardScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$UpdateCardScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$UpdateCardScreenKt$lambda1$1();

    ComposableSingletons$UpdateCardScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852519330, i, -1, "com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt.lambda-1.<anonymous> (UpdateCardScreen.kt:102)");
            }
            DefaultEditCardDetailsInteractor.Factory factory = new DefaultEditCardDetailsInteractor.Factory();
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composer);
            CardEditConfiguration cardEditConfiguration = new CardEditConfiguration(DefaultCardBrandFilter.INSTANCE, false, true);
            EditCardPayload.Companion companion = EditCardPayload.INSTANCE;
            CardBrand cardBrand = CardBrand.Visa;
            CvcCheck cvcCheck = CvcCheck.Pass;
            EditCardPayload editCardPayloadCreate = companion.create(new ConsumerPaymentDetails.Card("card_id_1234", "4242", false, "Fancy Card", new ConsumerPaymentDetails.BillingAddress(null, null, null, null, null, "42424", CountryCode.INSTANCE.getUS()), null, 2500, 4, cardBrand, CollectionsKt.listOf("VISA"), cvcCheck, "credit", 32, null), (String) null);
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = new PaymentSheet.BillingDetailsCollectionConfiguration(null, null, null, null, false, 31, null);
            composer.startReplaceGroup(-1519175111);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$UpdateCardScreenKt$lambda1$1.invoke$lambda$1$lambda$0((CardBrand) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1<? super CardBrand, Unit> function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1519173447);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$UpdateCardScreenKt$lambda1$1.invoke$lambda$3$lambda$2((CardUpdateParams) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EditCardDetailsInteractor editCardDetailsInteractorCreate = factory.create(coroutineScope, cardEditConfiguration, true, editCardPayloadCreate, billingDetailsCollectionConfiguration, function1, (Function1) objRememberedValue3);
            UpdateCardScreenState updateCardScreenState = new UpdateCardScreenState("card_id_1234", null, ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_update_card_confirm_cta), false, null, null, ResolvableStringUtilsKt.getResolvableString("Random error."), false);
            composer.startReplaceGroup(-1519150503);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.stripe.android.link.ui.updatecard.ComposableSingletons$UpdateCardScreenKt$lambda-1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            UpdateCardScreenKt.UpdateCardScreenBody(editCardDetailsInteractorCreate, updateCardScreenState, (Function0) objRememberedValue4, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CardUpdateParams cardUpdateParams) {
        return Unit.INSTANCE;
    }
}
