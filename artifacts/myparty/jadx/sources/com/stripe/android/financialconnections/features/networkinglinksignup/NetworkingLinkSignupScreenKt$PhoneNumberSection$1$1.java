package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkSignupScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Boolean> $focused$delegate;
    final /* synthetic */ NetworkingLinkSignupState.Payload $payload;

    NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1(NetworkingLinkSignupState.Payload payload, FocusRequester focusRequester, MutableState<Boolean> mutableState) {
        this.$payload = payload;
        this.$focusRequester = focusRequester;
        this.$focused$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(761906335, i, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.PhoneNumberSection.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:262)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1047089676);
            final MutableState<Boolean> mutableState = this.$focused$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1.invoke$lambda$1$lambda$0(mutableState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue);
            boolean zPhoneNumberSection$lambda$24 = NetworkingLinkSignupScreenKt.PhoneNumberSection$lambda$24(this.$focused$delegate);
            PhoneNumberController phoneController = this.$payload.getPhoneController();
            int iM5780getDefaulteUduSuo = ImeAction.INSTANCE.m5780getDefaulteUduSuo();
            final NetworkingLinkSignupState.Payload payload = this.$payload;
            PhoneNumberElementUIKt.m8822PhoneNumberCollectionSectionfhH9uAM(true, phoneController, modifierOnFocusChanged, ComposableLambdaKt.rememberComposableLambda(171475711, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$PhoneNumberSection$1$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(171475711, i2, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.PhoneNumberSection.<anonymous>.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:265)");
                        }
                        float f = 8;
                        DropdownFieldUIKt.DropDown(payload.getPhoneController().getCountryDropdownController(), true, PaddingKt.m1021paddingVpY3zN4(BackgroundKt.m575backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(2), 0.0f, Dp.m6117constructorimpl(6), 0.0f, 10, null), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f))), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7632getBackgroundSecondary0d7_KjU(), null, 2, null), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(12)), false, composer2, DropdownFieldController.$stable | 3120, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), zPhoneNumberSection$lambda$24, null, false, false, this.$focusRequester, iM5780getDefaulteUduSuo, composer, (PhoneNumberController.$stable << 3) | 805309446, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkingLinkSignupScreenKt.PhoneNumberSection$lambda$25(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }
}
