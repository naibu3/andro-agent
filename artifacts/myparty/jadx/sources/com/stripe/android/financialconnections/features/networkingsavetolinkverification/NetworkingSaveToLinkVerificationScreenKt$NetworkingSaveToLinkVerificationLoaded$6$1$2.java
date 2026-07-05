package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import com.stripe.android.financialconnections.features.common.VerificationSectionKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingSaveToLinkVerificationScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Async<Unit> $confirmVerificationAsync;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ NetworkingSaveToLinkVerificationState.Payload $payload;
    final /* synthetic */ MutableState<Boolean> $shouldRequestFocus$delegate;

    NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$2(FocusRequester focusRequester, NetworkingSaveToLinkVerificationState.Payload payload, Async<Unit> async, MutableState<Boolean> mutableState) {
        this.$focusRequester = focusRequester;
        this.$payload = payload;
        this.$confirmVerificationAsync = async;
        this.$shouldRequestFocus$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(601289103, i, -1, "com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (NetworkingSaveToLinkVerificationScreen.kt:123)");
            }
            FocusRequester focusRequester = this.$focusRequester;
            OTPElement otpElement = this.$payload.getOtpElement();
            Async<Unit> async = this.$confirmVerificationAsync;
            boolean z = !(async instanceof Async.Loading);
            Throwable error = MavericksExtensionsKt.getError(async);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1543332065);
            boolean zChanged = composer.changed(this.$shouldRequestFocus$delegate);
            final MutableState<Boolean> mutableState = this.$shouldRequestFocus$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NetworkingSaveToLinkVerificationScreenKt$NetworkingSaveToLinkVerificationLoaded$6$1$2.invoke$lambda$1$lambda$0(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            VerificationSectionKt.VerificationSection(focusRequester, otpElement, z, error, OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue), composer, (OTPElement.$stable << 3) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded$lambda$12(mutableState, true);
        return Unit.INSTANCE;
    }
}
