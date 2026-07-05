package com.stripe.android.link.ui.wallet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.menu.LinkMenuKt;
import com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.paymentsheet.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletPaymentMethodMenu.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"WalletPaymentMethodMenu", "", "modifier", "Landroidx/compose/ui/Modifier;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "onSetDefaultClick", "Lkotlin/Function0;", "onRemoveClick", "onUpdateClick", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "removeLabel", "", "getRemoveLabel", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)I", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPaymentMethodMenuKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletPaymentMethodMenu$lambda$4(Modifier modifier, ConsumerPaymentDetails.PaymentDetails paymentDetails, Function0 function0, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        WalletPaymentMethodMenu(modifier, paymentDetails, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void WalletPaymentMethodMenu(Modifier modifier, final ConsumerPaymentDetails.PaymentDetails paymentDetails, final Function0<Unit> onSetDefaultClick, final Function0<Unit> onRemoveClick, final Function0<Unit> onUpdateClick, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(onSetDefaultClick, "onSetDefaultClick");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Intrinsics.checkNotNullParameter(onUpdateClick, "onUpdateClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(542686095);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paymentDetails) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSetDefaultClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRemoveClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUpdateClick) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(542686095, i3, -1, "com.stripe.android.link.ui.wallet.WalletPaymentMethodMenu (WalletPaymentMethodMenu.kt:17)");
            }
            composerStartRestartGroup.startReplaceGroup(1072333675);
            boolean zChanged = composerStartRestartGroup.changed(paymentDetails);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (!paymentDetails.getIsDefault()) {
                    listCreateListBuilder.add(WalletPaymentMethodMenuItem.SetAsDefault.INSTANCE);
                }
                if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                    listCreateListBuilder.add(WalletPaymentMethodMenuItem.Update.INSTANCE);
                }
                listCreateListBuilder.add(new WalletPaymentMethodMenuItem.RemoveItem(ResolvableStringUtilsKt.getResolvableString(getRemoveLabel(paymentDetails))));
                objRememberedValue = CollectionsKt.build(listCreateListBuilder);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1072352533);
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WalletPaymentMethodMenuKt.WalletPaymentMethodMenu$lambda$3$lambda$2(onSetDefaultClick, onRemoveClick, onUpdateClick, (WalletPaymentMethodMenuItem) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = i3 & 14;
            Modifier modifier3 = modifier;
            LinkMenuKt.LinkMenu(modifier3, list, (Function1) objRememberedValue2, composerStartRestartGroup, i5, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletPaymentMethodMenuKt.WalletPaymentMethodMenu$lambda$4(modifier2, paymentDetails, onSetDefaultClick, onRemoveClick, onUpdateClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletPaymentMethodMenu$lambda$3$lambda$2(Function0 function0, Function0 function02, Function0 function03, WalletPaymentMethodMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof WalletPaymentMethodMenuItem.SetAsDefault) {
            function0.invoke();
        } else if (item instanceof WalletPaymentMethodMenuItem.RemoveItem) {
            function02.invoke();
        } else {
            if (!(item instanceof WalletPaymentMethodMenuItem.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            function03.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final int getRemoveLabel(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        if ((paymentDetails instanceof ConsumerPaymentDetails.Card) || (paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
            return R.string.stripe_paymentsheet_remove_card;
        }
        if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
            return R.string.stripe_wallet_remove_linked_account;
        }
        throw new NoWhenBranchMatchedException();
    }
}
