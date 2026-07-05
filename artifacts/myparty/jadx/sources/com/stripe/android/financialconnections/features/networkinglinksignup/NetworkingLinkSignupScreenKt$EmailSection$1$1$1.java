package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.PointerIconCompat;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkSignupScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NetworkingLinkSignupScreenKt$EmailSection$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Boolean> $focused$delegate;
    final /* synthetic */ boolean $showFullForm;

    NetworkingLinkSignupScreenKt$EmailSection$1$1$1(FocusRequester focusRequester, boolean z, TextFieldController textFieldController, boolean z2, MutableState<Boolean> mutableState) {
        this.$focusRequester = focusRequester;
        this.$showFullForm = z;
        this.$emailController = textFieldController;
        this.$enabled = z2;
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
                ComposerKt.traceEventStart(-763771920, i, -1, "com.stripe.android.financialconnections.features.networkinglinksignup.EmailSection.<anonymous>.<anonymous>.<anonymous> (NetworkingLinkSignupScreen.kt:330)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, this.$focusRequester);
            composer.startReplaceGroup(1240881318);
            final MutableState<Boolean> mutableState = this.$focused$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$EmailSection$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NetworkingLinkSignupScreenKt$EmailSection$1$1$1.invoke$lambda$1$lambda$0(mutableState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TextFieldUIKt.m8846TextFieldZkbtPhE(this.$emailController, this.$enabled, this.$showFullForm ? ImeAction.INSTANCE.m5783getNexteUduSuo() : ImeAction.INSTANCE.m5781getDoneeUduSuo(), FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue), null, 0, 0, null, false, false, composer, 0, PointerIconCompat.TYPE_TEXT);
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
        NetworkingLinkSignupScreenKt.EmailSection$lambda$36(mutableState, it.isFocused());
        return Unit.INSTANCE;
    }
}
