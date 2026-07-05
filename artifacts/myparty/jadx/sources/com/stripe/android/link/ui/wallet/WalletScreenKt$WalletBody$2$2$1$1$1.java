package com.stripe.android.link.ui.wallet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WalletScreenKt$WalletBody$2$2$1$1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
    final /* synthetic */ Function1<AddPaymentMethodOption, Unit> $onAddPaymentMethodOptionClicked;
    final /* synthetic */ WalletUiState $state;

    /* JADX WARN: Multi-variable type inference failed */
    WalletScreenKt$WalletBody$2$2$1$1$1(WalletUiState walletUiState, Function1<? super AddPaymentMethodOption, Unit> function1, CoroutineScope coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> function12) {
        this.$state = walletUiState;
        this.$onAddPaymentMethodOptionClicked = function1;
        this.$coroutineScope = coroutineScope;
        this.$hideBottomSheetContent = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope showBottomSheetContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "$this$showBottomSheetContent");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1251160851, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:195)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, WalletScreenKt.WALLET_SCREEN_ADD_PAYMENT_METHOD_MENU);
            List<AddPaymentMethodOption> addPaymentMethodOptions = this.$state.getAddPaymentMethodOptions();
            composer.startReplaceGroup(1967694082);
            boolean zChanged = composer.changed(this.$onAddPaymentMethodOptionClicked) | composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent);
            final Function1<AddPaymentMethodOption, Unit> function1 = this.$onAddPaymentMethodOptionClicked;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final Function1<Continuation<? super Unit>, Object> function12 = this.$hideBottomSheetContent;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$2$2$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WalletScreenKt$WalletBody$2$2$1$1$1.invoke$lambda$1$lambda$0(function1, coroutineScope, function12, (AddPaymentMethodOption) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AddPaymentMethodMenuKt.AddPaymentMethodMenu(modifierTestTag, addPaymentMethodOptions, (Function1) objRememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, CoroutineScope coroutineScope, Function1 function12, AddPaymentMethodOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        function1.invoke(option);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WalletScreenKt$WalletBody$2$2$1$1$1$1$1$1(function12, null), 3, null);
        return Unit.INSTANCE;
    }
}
