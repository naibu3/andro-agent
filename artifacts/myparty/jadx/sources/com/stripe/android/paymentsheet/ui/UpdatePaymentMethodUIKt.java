package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor;
import com.stripe.android.paymentsheet.utils.TestMetadataKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UpdatePaymentMethodUI.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a5\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a9\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\"\u001a'\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010*\u001a\u0016\u0010+\u001a\u0004\u0018\u00010,*\u00020-2\u0006\u0010.\u001a\u00020\tH\u0002\"\u000e\u0010/\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u00101\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u00102\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u00109\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006:²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002"}, d2 = {"UpdatePaymentMethodUI", "", "interactor", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "DetailsCannotBeChangedText", "shouldShowCardBrandDropdown", "", "context", "Landroid/content/Context;", "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "SetAsDefaultPaymentMethodCheckbox", "isChecked", "isEnabled", "onCheckChanged", "Lkotlin/Function1;", "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UpdatePaymentMethodButtons", "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Landroidx/compose/runtime/Composer;I)V", "BankAccountUI", "name", "", "email", "bankName", "last4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SepaDebitUI", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Landroidx/compose/runtime/Composer;I)V", "bankAccountFieldLabel", "bankAccountFieldText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "BankAccountTextField", "value", "label", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UpdatePaymentMethodUi", "DeletePaymentMethodUi", "PreviewUpdatePaymentMethodUI", "(Landroidx/compose/runtime/Composer;I)V", "getDetailsCannotBeChangedText", "Lcom/stripe/android/core/strings/ResolvableString;", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "canUpdateCardBrand", "UPDATE_PM_EXPIRY_FIELD_TEST_TAG", "UPDATE_PM_CVC_FIELD_TEST_TAG", "UPDATE_PM_REMOVE_BUTTON_TEST_TAG", "UPDATE_PM_SAVE_BUTTON_TEST_TAG", "UPDATE_PM_ERROR_MESSAGE_TEST_TAG", "UPDATE_PM_US_BANK_ACCOUNT_TEST_TAG", "UPDATE_PM_SEPA_DEBIT_TEST_TAG", "UPDATE_PM_CARD_TEST_TAG", "UPDATE_PM_DETAILS_SUBTITLE_TEST_TAG", "UPDATE_PM_SCREEN_TEST_TAG", "UPDATE_PM_SET_AS_DEFAULT_CHECKBOX_TEST_TAG", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;", "status", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdatePaymentMethodUIKt {
    public static final String UPDATE_PM_CARD_TEST_TAG = "update_payment_method_card_ui";
    public static final String UPDATE_PM_CVC_FIELD_TEST_TAG = "update_payment_method_cvc";
    public static final String UPDATE_PM_DETAILS_SUBTITLE_TEST_TAG = "update_payment_method_subtitle";
    public static final String UPDATE_PM_ERROR_MESSAGE_TEST_TAG = "update_payment_method_error_message";
    public static final String UPDATE_PM_EXPIRY_FIELD_TEST_TAG = "update_payment_method_expiry_date";
    public static final String UPDATE_PM_REMOVE_BUTTON_TEST_TAG = "update_payment_method_remove_button";
    public static final String UPDATE_PM_SAVE_BUTTON_TEST_TAG = "update_payment_method_save_button";
    public static final String UPDATE_PM_SCREEN_TEST_TAG = "update_payment_method_screen";
    public static final String UPDATE_PM_SEPA_DEBIT_TEST_TAG = "update_payment_method_sepa_debit_ui";
    public static final String UPDATE_PM_SET_AS_DEFAULT_CHECKBOX_TEST_TAG = "update_payment_method_set_as_default_checkbox";
    public static final String UPDATE_PM_US_BANK_ACCOUNT_TEST_TAG = "update_payment_method_bank_account_ui";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountTextField$lambda$14(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BankAccountTextField(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountUI$lambda$10(String str, String str2, String str3, String str4, int i, Composer composer, int i2) {
        BankAccountUI(str, str2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountUI$lambda$13(String str, String str2, String str3, String str4, Modifier modifier, int i, Composer composer, int i2) {
        BankAccountUI(str, str2, str3, str4, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeletePaymentMethodUi$lambda$30(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, int i, Composer composer, int i2) {
        DeletePaymentMethodUi(updatePaymentMethodInteractor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailsCannotBeChangedText$lambda$7(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, boolean z, Context context, int i, Composer composer, int i2) {
        DetailsCannotBeChangedText(updatePaymentMethodInteractor, z, context, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUpdatePaymentMethodUI$lambda$38(int i, Composer composer, int i2) {
        PreviewUpdatePaymentMethodUI(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SepaDebitUI$lambda$11(String str, String str2, PaymentMethod.SepaDebit sepaDebit, int i, Composer composer, int i2) {
        SepaDebitUI(str, str2, sepaDebit, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetAsDefaultPaymentMethodCheckbox$lambda$8(boolean z, boolean z2, Function1 function1, int i, Composer composer, int i2) {
        SetAsDefaultPaymentMethodCheckbox(z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethodButtons$lambda$9(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, int i, Composer composer, int i2) {
        UpdatePaymentMethodButtons(updatePaymentMethodInteractor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethodUI$lambda$5(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, Modifier modifier, int i, Composer composer, int i2) {
        UpdatePaymentMethodUI(updatePaymentMethodInteractor, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethodUi$lambda$18(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, int i, Composer composer, int i2) {
        UpdatePaymentMethodUi(updatePaymentMethodInteractor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UpdatePaymentMethodUI(final UpdatePaymentMethodInteractor interactor, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(233170768);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(233170768, i3, -1, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUI (UpdatePaymentMethodUI.kt:45)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
            boolean z = interactor.isModifiablePaymentMethod() && interactor.getDisplayableSavedPaymentMethod().canChangeCbc();
            Modifier modifierTestTag = TestTagKt.testTag(PaddingKt.padding(modifier, outerFormInsets), UPDATE_PM_SCREEN_TEST_TAG);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierTestTag);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SavedPaymentMethod savedPaymentMethod = interactor.getDisplayableSavedPaymentMethod().getSavedPaymentMethod();
            if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
                composerStartRestartGroup.startReplaceGroup(-1141122961);
                CardDetailsUIKt.CardDetailsEditUI(interactor.getEditCardDetailsInteractor(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
                composerStartRestartGroup.startReplaceGroup(-1140910053);
                SavedPaymentMethod.Link link = (SavedPaymentMethod.Link) savedPaymentMethod;
                LinkPaymentDetails paymentDetails = link.getPaymentDetails();
                if (paymentDetails instanceof LinkPaymentDetails.BankAccount) {
                    composerStartRestartGroup.startReplaceGroup(-1140804994);
                    BankAccountUI(null, null, ((LinkPaymentDetails.BankAccount) link.getPaymentDetails()).getBankName(), ((LinkPaymentDetails.BankAccount) link.getPaymentDetails()).getLast4(), composerStartRestartGroup, 54);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(paymentDetails instanceof LinkPaymentDetails.Card)) {
                        composerStartRestartGroup.startReplaceGroup(1210122983);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1140430545);
                    CardDetailsUIKt.CardDetailsEditUI(interactor.getEditCardDetailsInteractor(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) {
                composerStartRestartGroup.startReplaceGroup(1210146519);
                PaymentMethod.BillingDetails billingDetails = interactor.getDisplayableSavedPaymentMethod().getPaymentMethod().billingDetails;
                String str = billingDetails != null ? billingDetails.name : null;
                PaymentMethod.BillingDetails billingDetails2 = interactor.getDisplayableSavedPaymentMethod().getPaymentMethod().billingDetails;
                SepaDebitUI(str, billingDetails2 != null ? billingDetails2.email : null, ((SavedPaymentMethod.SepaDebit) savedPaymentMethod).getSepaDebit(), composerStartRestartGroup, PaymentMethod.SepaDebit.$stable << 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) {
                composerStartRestartGroup.startReplaceGroup(1210157413);
                PaymentMethod.BillingDetails billingDetails3 = interactor.getDisplayableSavedPaymentMethod().getPaymentMethod().billingDetails;
                String str2 = billingDetails3 != null ? billingDetails3.name : null;
                PaymentMethod.BillingDetails billingDetails4 = interactor.getDisplayableSavedPaymentMethod().getPaymentMethod().billingDetails;
                SavedPaymentMethod.USBankAccount uSBankAccount = (SavedPaymentMethod.USBankAccount) savedPaymentMethod;
                BankAccountUI(str2, billingDetails4 != null ? billingDetails4.email : null, uSBankAccount.getUsBankAccount().bankName, uSBankAccount.getUsBankAccount().last4, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(1210112924);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1139430361);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean z2 = (interactor.getIsExpiredCard() || (interactor.isModifiablePaymentMethod() && interactor.getCanUpdateFullPaymentMethodDetails())) ? false : true;
            composerStartRestartGroup.startReplaceGroup(1210177089);
            if (z2) {
                DetailsCannotBeChangedText(interactor, z, context, composerStartRestartGroup, i3 & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1210182128);
            if (interactor.getShouldShowSetAsDefaultCheckbox()) {
                boolean setAsDefaultCheckboxChecked = UpdatePaymentMethodUI$lambda$0(stateCollectAsState).getSetAsDefaultCheckboxChecked();
                boolean setAsDefaultCheckboxEnabled = interactor.getSetAsDefaultCheckboxEnabled();
                composerStartRestartGroup.startReplaceGroup(1210190164);
                boolean z3 = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UpdatePaymentMethodUIKt.UpdatePaymentMethodUI$lambda$4$lambda$2$lambda$1(interactor, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SetAsDefaultPaymentMethodCheckbox(setAsDefaultCheckboxChecked, setAsDefaultCheckboxEnabled, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ResolvableString error = UpdatePaymentMethodUI$lambda$0(stateCollectAsState).getError();
            composerStartRestartGroup.startReplaceGroup(1210198698);
            if (error != null) {
                ErrorMessageKt.ErrorMessage(error.resolve(context), TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(12), 0.0f, 0.0f, 13, null), UPDATE_PM_ERROR_MESSAGE_TEST_TAG), composerStartRestartGroup, 48, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            UpdatePaymentMethodButtons(interactor, composerStartRestartGroup, i3 & 14);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.UpdatePaymentMethodUI$lambda$5(interactor, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethodUI$lambda$4$lambda$2$lambda$1(UpdatePaymentMethodInteractor updatePaymentMethodInteractor, boolean z) {
        updatePaymentMethodInteractor.handleViewAction(new UpdatePaymentMethodInteractor.ViewAction.SetAsDefaultCheckboxChanged(z));
        return Unit.INSTANCE;
    }

    private static final void DetailsCannotBeChangedText(final UpdatePaymentMethodInteractor updatePaymentMethodInteractor, final boolean z, final Context context, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804106837);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(updatePaymentMethodInteractor) : composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(context) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1804106837, i2, -1, "com.stripe.android.paymentsheet.ui.DetailsCannotBeChangedText (UpdatePaymentMethodUI.kt:130)");
            }
            ResolvableString detailsCannotBeChangedText = getDetailsCannotBeChangedText(updatePaymentMethodInteractor.getDisplayableSavedPaymentMethod(), z && updatePaymentMethodInteractor.getHasValidBrandChoices());
            if (detailsCannotBeChangedText != null) {
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(detailsCannotBeChangedText.resolve(context), TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), UPDATE_PM_DETAILS_SUBTITLE_TEST_TAG), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle2(), composer2, 196656, 0, 65496);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.DetailsCannotBeChangedText$lambda$7(updatePaymentMethodInteractor, z, context, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SetAsDefaultPaymentMethodCheckbox(final boolean z, final boolean z2, final Function1<? super Boolean, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(667432056);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(667432056, i2, -1, "com.stripe.android.paymentsheet.ui.SetAsDefaultPaymentMethodCheckbox (UpdatePaymentMethodUI.kt:151)");
            }
            int i3 = ((i2 << 6) & 896) | 6;
            int i4 = i2 << 9;
            CheckboxElementUIKt.CheckboxElementUI(TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(12), 0.0f, 0.0f, 13, null), UPDATE_PM_SET_AS_DEFAULT_CHECKBOX_TEST_TAG), null, z, ResolvableStringComposeUtilsKt.resolve(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_set_as_default_payment_method), composerStartRestartGroup, 0), z2, function1, composerStartRestartGroup, i3 | (57344 & i4) | (i4 & 458752), 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.SetAsDefaultPaymentMethodCheckbox$lambda$8(z, z2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void UpdatePaymentMethodButtons(final UpdatePaymentMethodInteractor updatePaymentMethodInteractor, Composer composer, final int i) {
        int i2;
        float fM6117constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(1266436192);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(updatePaymentMethodInteractor) : composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1266436192, i2, -1, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodButtons (UpdatePaymentMethodUI.kt:166)");
            }
            boolean shouldShowSaveButton = updatePaymentMethodInteractor.getShouldShowSaveButton();
            composerStartRestartGroup.startReplaceGroup(-1749805493);
            if (shouldShowSaveButton) {
                SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(32)), composerStartRestartGroup, 6);
                UpdatePaymentMethodUi(updatePaymentMethodInteractor, composerStartRestartGroup, i2 & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (updatePaymentMethodInteractor.getCanRemove()) {
                if (shouldShowSaveButton) {
                    fM6117constructorimpl = Dp.m6117constructorimpl(16);
                } else {
                    fM6117constructorimpl = Dp.m6117constructorimpl(32);
                }
                SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, fM6117constructorimpl), composerStartRestartGroup, 0);
                DeletePaymentMethodUi(updatePaymentMethodInteractor, composerStartRestartGroup, i2 & 14);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.UpdatePaymentMethodButtons$lambda$9(updatePaymentMethodInteractor, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BankAccountUI(String str, String str2, final String str3, final String str4, Composer composer, final int i) {
        int i2;
        String str5;
        final String str6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1706605851);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1706605851, i2, -1, "com.stripe.android.paymentsheet.ui.BankAccountUI (UpdatePaymentMethodUI.kt:192)");
            }
            str5 = str2;
            BankAccountUI(str, str5, StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_title_bank_account, composerStartRestartGroup, 0), ResolvableStringComposeUtilsKt.resolve(ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_bank_account_info, new Object[]{str3, str4}, null, 4, null), composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, UPDATE_PM_US_BANK_ACCOUNT_TEST_TAG), composerStartRestartGroup, (i2 & 14) | 24576 | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
            str6 = str;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str5 = str2;
            str6 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str7 = str5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.BankAccountUI$lambda$10(str6, str7, str3, str4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SepaDebitUI(String str, String str2, final PaymentMethod.SepaDebit sepaDebit, Composer composer, final int i) {
        int i2;
        final String str3;
        final String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025714736);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(sepaDebit) : composerStartRestartGroup.changedInstance(sepaDebit) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025714736, i2, -1, "com.stripe.android.paymentsheet.ui.SepaDebitUI (UpdatePaymentMethodUI.kt:211)");
            }
            str3 = str;
            str4 = str2;
            BankAccountUI(str3, str4, StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_iban, composerStartRestartGroup, 0), ResolvableStringComposeUtilsKt.resolve(ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_bank_account_last_4, new Object[]{sepaDebit.last4}, null, 4, null), composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, UPDATE_PM_SEPA_DEBIT_TEST_TAG), composerStartRestartGroup, (i2 & 14) | 24576 | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.SepaDebitUI$lambda$11(str3, str4, sepaDebit, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BankAccountUI(final String str, final String str2, final String str3, final String str4, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2062362472);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062362472, i3, -1, "com.stripe.android.paymentsheet.ui.BankAccountUI (UpdatePaymentMethodUI.kt:231)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2082143547);
            if (str != null) {
                BankAccountTextField(str, StringResources_androidKt.stringResource(com.stripe.android.core.R.string.stripe_address_label_full_name, composerStartRestartGroup, 0), null, composerStartRestartGroup, i3 & 14, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-2082136272);
            if (str2 != null) {
                BankAccountTextField(str2, StringResources_androidKt.stringResource(com.stripe.android.uicore.R.string.stripe_email, composerStartRestartGroup, 0), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), composerStartRestartGroup, ((i3 >> 3) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            BankAccountTextField(str4, str3, null, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.BankAccountUI$lambda$13(str, str2, str3, str4, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BankAccountTextField(final String str, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1006809205);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1006809205, i3, -1, "com.stripe.android.paymentsheet.ui.BankAccountTextField (UpdatePaymentMethodUI.kt:260)");
                }
                CardKt.m1809CardFjzlyU(companion, null, 0L, 0L, StripeThemeKt.getBorderStroke(MaterialTheme.INSTANCE, false, composerStartRestartGroup, MaterialTheme.$stable | 48), Dp.m6117constructorimpl(0), ComposableLambdaKt.rememberComposableLambda(-783242280, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt.BankAccountTextField.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-783242280, i5, -1, "com.stripe.android.paymentsheet.ui.BankAccountTextField.<anonymous> (UpdatePaymentMethodUI.kt:266)");
                            }
                            CommonTextFieldKt.CommonTextField(str, str2, null, null, null, false, false, null, null, null, null, null, composer2, 0, 0, 4092);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 1769472, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdatePaymentMethodUIKt.BankAccountTextField$lambda$14(str, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            CardKt.m1809CardFjzlyU(companion, null, 0L, 0L, StripeThemeKt.getBorderStroke(MaterialTheme.INSTANCE, false, composerStartRestartGroup, MaterialTheme.$stable | 48), Dp.m6117constructorimpl(0), ComposableLambdaKt.rememberComposableLambda(-783242280, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt.BankAccountTextField.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-783242280, i5, -1, "com.stripe.android.paymentsheet.ui.BankAccountTextField.<anonymous> (UpdatePaymentMethodUI.kt:266)");
                        }
                        CommonTextFieldKt.CommonTextField(str, str2, null, null, null, false, false, null, null, null, null, null, composer2, 0, 0, 4092);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 1769472, 14);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void UpdatePaymentMethodUi(final UpdatePaymentMethodInteractor updatePaymentMethodInteractor, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1663653971);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(updatePaymentMethodInteractor) : composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1663653971, i2, -1, "com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUi (UpdatePaymentMethodUI.kt:274)");
            }
            boolean z = false;
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(updatePaymentMethodInteractor.getState(), null, composerStartRestartGroup, 0, 1);
            boolean z2 = UpdatePaymentMethodUi$lambda$15(stateCollectAsState).getStatus() == UpdatePaymentMethodInteractor.Status.Updating;
            UpdatePaymentMethodUi$lambda$15(stateCollectAsState).isSaveButtonEnabled();
            String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_save, composerStartRestartGroup, 0);
            boolean zIsSaveButtonEnabled = UpdatePaymentMethodUi$lambda$15(stateCollectAsState).isSaveButtonEnabled();
            Modifier modifierTestMetadata = TestMetadataKt.testMetadata(TestTagKt.testTag(Modifier.INSTANCE, UPDATE_PM_SAVE_BUTTON_TEST_TAG), "isLoading=" + z2);
            composerStartRestartGroup.startReplaceGroup(-800830923);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor))) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePaymentMethodUIKt.UpdatePaymentMethodUi$lambda$17$lambda$16(updatePaymentMethodInteractor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            com.stripe.android.common.ui.PrimaryButtonKt.PrimaryButton(strStringResource, zIsSaveButtonEnabled, (Function0) objRememberedValue, modifierTestMetadata, z2, false, composerStartRestartGroup, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.UpdatePaymentMethodUi$lambda$18(updatePaymentMethodInteractor, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethodUi$lambda$17$lambda$16(UpdatePaymentMethodInteractor updatePaymentMethodInteractor) {
        updatePaymentMethodInteractor.handleViewAction(UpdatePaymentMethodInteractor.ViewAction.SaveButtonPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    private static final void DeletePaymentMethodUi(final UpdatePaymentMethodInteractor updatePaymentMethodInteractor, Composer composer, final int i) {
        int i2;
        State state;
        ResolvableString resolvableString;
        long j;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-339950287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(updatePaymentMethodInteractor) : composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-339950287, i2, -1, "com.stripe.android.paymentsheet.ui.DeletePaymentMethodUi (UpdatePaymentMethodUI.kt:292)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(512314161);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$20$lambda$19();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            StateFlow<UpdatePaymentMethodInteractor.State> state2 = updatePaymentMethodInteractor.getState();
            composerStartRestartGroup.startReplaceGroup(512316581);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$22$lambda$21((UpdatePaymentMethodInteractor.State) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = true;
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(StateFlowsKt.mapAsStateFlow(state2, (Function1) objRememberedValue2), null, composerStartRestartGroup, 0, 1);
            ResolvableString resolvableString2 = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_remove);
            long jM1827getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU();
            if (DeletePaymentMethodUi$lambda$23(stateCollectAsState) == UpdatePaymentMethodInteractor.Status.Idle) {
                state = stateCollectAsState;
                resolvableString = resolvableString2;
                j = jM1827getError0d7_KjU;
                z = true;
            } else {
                state = stateCollectAsState;
                resolvableString = resolvableString2;
                j = jM1827getError0d7_KjU;
                z = false;
            }
            boolean z3 = DeletePaymentMethodUi$lambda$23(state) == UpdatePaymentMethodInteractor.Status.Removing;
            composerStartRestartGroup.startReplaceGroup(512326840);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$25$lambda$24(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            RemoveButtonKt.m8531RemoveButton8V94_ZQ(resolvableString, j, z, z3, (Function0) objRememberedValue3, UPDATE_PM_REMOVE_BUTTON_TEST_TAG, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                DisplayableSavedPaymentMethod displayableSavedPaymentMethod = updatePaymentMethodInteractor.getDisplayableSavedPaymentMethod();
                composerStartRestartGroup.startReplaceGroup(512334643);
                boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(updatePaymentMethodInteractor))) {
                    z2 = false;
                }
                boolean z4 = zChanged2 | z2;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$27$lambda$26(mutableState, updatePaymentMethodInteractor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function0 = (Function0) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(512340205);
                boolean zChanged3 = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$29$lambda$28(mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                RemovePaymentMethodDialogUIKt.RemovePaymentMethodDialogUI(displayableSavedPaymentMethod, function0, (Function0) objRememberedValue5, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.DeletePaymentMethodUi$lambda$30(updatePaymentMethodInteractor, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DeletePaymentMethodUi$lambda$20$lambda$19() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdatePaymentMethodInteractor.Status DeletePaymentMethodUi$lambda$22$lambda$21(UpdatePaymentMethodInteractor.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeletePaymentMethodUi$lambda$25$lambda$24(MutableState mutableState) {
        mutableState.setValue(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeletePaymentMethodUi$lambda$27$lambda$26(MutableState mutableState, UpdatePaymentMethodInteractor updatePaymentMethodInteractor) {
        mutableState.setValue(false);
        updatePaymentMethodInteractor.handleViewAction(UpdatePaymentMethodInteractor.ViewAction.RemovePaymentMethod.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeletePaymentMethodUi$lambda$29$lambda$28(MutableState mutableState) {
        mutableState.setValue(false);
        return Unit.INSTANCE;
    }

    private static final void PreviewUpdatePaymentMethodUI(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1114053744);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1114053744, i, -1, "com.stripe.android.paymentsheet.ui.PreviewUpdatePaymentMethodUI (UpdatePaymentMethodUI.kt:317)");
            }
            DisplayableSavedPaymentMethod displayableSavedPaymentMethodCreate$default = DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("4242"), new PaymentMethod("002", null, false, PaymentMethod.Type.Card.code, PaymentMethod.Type.Card, null, null, new PaymentMethod.Card(CardBrand.Visa, null, null, null, null, null, null, null, null, null, null, null, 4094, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 2096992, null), false, false, 12, null);
            PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode = PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic;
            DefaultCardBrandFilter defaultCardBrandFilter = DefaultCardBrandFilter.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(339967562);
            UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1 updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1RememberedValue = new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1(null);
                composerStartRestartGroup.updateRememberedValue(updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1RememberedValue);
            }
            Function2 function2 = (Function2) updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$1$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(339969271);
            UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1 updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1RememberedValue = new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1(null);
                composerStartRestartGroup.updateRememberedValue(updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1RememberedValue);
            }
            Function3 function3 = (Function3) updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$2$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(339972479);
            UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1 updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1RememberedValue = new UpdatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1(null);
                composerStartRestartGroup.updateRememberedValue(updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1RememberedValue);
            }
            Function2 function22 = (Function2) updatePaymentMethodUIKt$PreviewUpdatePaymentMethodUI$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(339976324);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePaymentMethodUIKt.PreviewUpdatePaymentMethodUI$lambda$35$lambda$34((CardBrand) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(339980452);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            UpdatePaymentMethodUI(new DefaultUpdatePaymentMethodInteractor(false, true, displayableSavedPaymentMethodCreate$default, defaultCardBrandFilter, addressCollectionMode, true, false, true, function2, function3, function22, function1, (Function0) objRememberedValue2, null, 8192, null), Modifier.INSTANCE, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePaymentMethodUIKt.PreviewUpdatePaymentMethodUI$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUpdatePaymentMethodUI$lambda$35$lambda$34(CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final ResolvableString getDetailsCannotBeChangedText(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z) {
        Integer numValueOf;
        int i;
        int i2;
        SavedPaymentMethod savedPaymentMethod = displayableSavedPaymentMethod.getSavedPaymentMethod();
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            if (z) {
                i2 = com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_only_card_brand_can_be_changed;
            } else {
                i2 = com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_card_details_cannot_be_changed;
            }
            numValueOf = Integer.valueOf(i2);
        } else if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
            LinkPaymentDetails paymentDetails = ((SavedPaymentMethod.Link) displayableSavedPaymentMethod.getSavedPaymentMethod()).getPaymentDetails();
            if (paymentDetails instanceof LinkPaymentDetails.BankAccount) {
                i = com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_bank_account_details_cannot_be_changed;
            } else {
                if (!(paymentDetails instanceof LinkPaymentDetails.Card)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_card_details_cannot_be_changed;
            }
            numValueOf = Integer.valueOf(i);
        } else if (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) {
            numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_bank_account_details_cannot_be_changed);
        } else if (savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) {
            numValueOf = Integer.valueOf(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_sepa_debit_details_cannot_be_changed);
        } else {
            if (!Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            return ResolvableStringUtilsKt.getResolvableString(numValueOf.intValue());
        }
        return null;
    }

    private static final UpdatePaymentMethodInteractor.State UpdatePaymentMethodUI$lambda$0(State<UpdatePaymentMethodInteractor.State> state) {
        return state.getValue();
    }

    private static final UpdatePaymentMethodInteractor.State UpdatePaymentMethodUi$lambda$15(State<UpdatePaymentMethodInteractor.State> state) {
        return state.getValue();
    }

    private static final UpdatePaymentMethodInteractor.Status DeletePaymentMethodUi$lambda$23(State<? extends UpdatePaymentMethodInteractor.Status> state) {
        return state.getValue();
    }
}
