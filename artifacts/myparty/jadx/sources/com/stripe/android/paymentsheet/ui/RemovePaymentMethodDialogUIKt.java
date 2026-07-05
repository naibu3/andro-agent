package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemovePaymentMethodDialogUI.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0003H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002¨\u0006\u000b"}, d2 = {"RemovePaymentMethodDialogUI", "", "paymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "onConfirmListener", "Lkotlin/Function0;", "onDismissListener", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getRemoveDialogTitle", "Lcom/stripe/android/core/strings/ResolvableString;", "getRemoveDialogDescription", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemovePaymentMethodDialogUIKt {

    /* compiled from: RemovePaymentMethodDialogUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RemovePaymentMethodDialogUI$lambda$0(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        RemovePaymentMethodDialogUI(displayableSavedPaymentMethod, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RemovePaymentMethodDialogUI(final DisplayableSavedPaymentMethod paymentMethod, Function0<Unit> onConfirmListener, Function0<Unit> onDismissListener, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(onConfirmListener, "onConfirmListener");
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-404084240);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(paymentMethod) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConfirmListener) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissListener) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404084240, i2, -1, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:18)");
            }
            int i3 = i2 << 12;
            function0 = onConfirmListener;
            function02 = onDismissListener;
            SimpleDialogElementUIKt.SimpleDialogElementUI(ResolvableStringComposeUtilsKt.resolve(getRemoveDialogTitle(paymentMethod), composerStartRestartGroup, 0), ResolvableStringComposeUtilsKt.resolve(getRemoveDialogDescription(paymentMethod), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_remove, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_cancel, composerStartRestartGroup, 0), true, function0, function02, composerStartRestartGroup, (458752 & i3) | 24576 | (i3 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onConfirmListener;
            function02 = onDismissListener;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RemovePaymentMethodDialogUIKt.RemovePaymentMethodDialogUI$lambda$0(paymentMethod, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ResolvableString getRemoveDialogTitle(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        PaymentMethod.Type type = displayableSavedPaymentMethod.getPaymentMethod().type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (displayableSavedPaymentMethod.getPaymentMethod().isLinkPaymentMethod()) {
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_remove_bank_account_question_title, new Object[0], null, 4, null);
            }
            return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_remove_card_title, new Object[0], null, 4, null);
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_remove_bank_account_question_title, new Object[0], null, 4, null);
            }
            return ResolvableStringUtilsKt.resolvableString("", new Object[0]);
        }
        LinkPaymentDetails linkPaymentDetails = displayableSavedPaymentMethod.getPaymentMethod().getLinkPaymentDetails();
        if (linkPaymentDetails instanceof LinkPaymentDetails.BankAccount) {
            return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_remove_bank_account_question_title, new Object[0], null, 4, null);
        }
        if (linkPaymentDetails instanceof LinkPaymentDetails.Card) {
            return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_remove_card_title, new Object[0], null, 4, null);
        }
        if (linkPaymentDetails != null) {
            throw new NoWhenBranchMatchedException();
        }
        return ResolvableStringUtilsKt.resolvableString("", new Object[0]);
    }

    private static final ResolvableString getRemoveDialogDescription(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        PaymentMethod.Type type = displayableSavedPaymentMethod.getPaymentMethod().type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (displayableSavedPaymentMethod.getPaymentMethod().isLinkPaymentMethod()) {
                int i2 = com.stripe.android.paymentsheet.R.string.stripe_bank_account_with_last_4;
                LinkPaymentDetails linkPaymentDetails = displayableSavedPaymentMethod.getPaymentMethod().getLinkPaymentDetails();
                return ResolvableStringUtilsKt.resolvableString$default(i2, new Object[]{linkPaymentDetails != null ? linkPaymentDetails.getLast4() : null}, null, 4, null);
            }
            int i3 = R.string.stripe_card_with_last_4;
            String strBrandDisplayName = displayableSavedPaymentMethod.brandDisplayName();
            PaymentMethod.Card card = displayableSavedPaymentMethod.getPaymentMethod().card;
            return ResolvableStringUtilsKt.resolvableString$default(i3, new Object[]{strBrandDisplayName, card != null ? card.last4 : null}, null, 4, null);
        }
        if (i == 2) {
            LinkPaymentDetails linkPaymentDetails2 = displayableSavedPaymentMethod.getPaymentMethod().getLinkPaymentDetails();
            if (linkPaymentDetails2 instanceof LinkPaymentDetails.BankAccount) {
                return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_bank_account_with_last_4, new Object[]{((LinkPaymentDetails.BankAccount) linkPaymentDetails2).getLast4()}, null, 4, null);
            }
            if (linkPaymentDetails2 instanceof LinkPaymentDetails.Card) {
                return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_card_with_last_4, new Object[]{displayableSavedPaymentMethod.brandDisplayName(), ((LinkPaymentDetails.Card) linkPaymentDetails2).getLast4()}, null, 4, null);
            }
            if (linkPaymentDetails2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return ResolvableStringUtilsKt.resolvableString("", new Object[0]);
        }
        if (i == 3) {
            int i4 = com.stripe.android.paymentsheet.R.string.stripe_bank_account_with_last_4;
            PaymentMethod.SepaDebit sepaDebit = displayableSavedPaymentMethod.getPaymentMethod().sepaDebit;
            return ResolvableStringUtilsKt.resolvableString$default(i4, new Object[]{sepaDebit != null ? sepaDebit.last4 : null}, null, 4, null);
        }
        if (i == 4) {
            int i5 = com.stripe.android.paymentsheet.R.string.stripe_bank_account_with_last_4;
            PaymentMethod.USBankAccount uSBankAccount = displayableSavedPaymentMethod.getPaymentMethod().usBankAccount;
            return ResolvableStringUtilsKt.resolvableString$default(i5, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
        }
        return ResolvableStringUtilsKt.resolvableString("", new Object[0]);
    }
}
