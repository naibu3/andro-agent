package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodInteractor;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethod.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\b*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0016\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"AddPaymentMethod", "", "interactor", "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "transformToPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "paymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "transformToPaymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "transformToExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "transformToPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "PAYMENT_SHEET_FORM_TEST_TAG", "getPAYMENT_SHEET_FORM_TEST_TAG$annotations", "()V", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddPaymentMethodKt {
    public static final String PAYMENT_SHEET_FORM_TEST_TAG = "PaymentSheetAddPaymentMethodForm";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$7(AddPaymentMethodInteractor addPaymentMethodInteractor, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddPaymentMethod(addPaymentMethodInteractor, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPAYMENT_SHEET_FORM_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddPaymentMethod(final AddPaymentMethodInteractor interactor, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final State stateCollectAsState;
        boolean z;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1093227002);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1093227002, i3, -1, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:28)");
                }
                stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
                boolean z2 = !AddPaymentMethod$lambda$0(stateCollectAsState).getProcessing();
                List<SupportedPaymentMethod> supportedPaymentMethods = AddPaymentMethod$lambda$0(stateCollectAsState).getSupportedPaymentMethods();
                String selectedPaymentMethodCode = AddPaymentMethod$lambda$0(stateCollectAsState).getSelectedPaymentMethodCode();
                PaymentMethodIncentive incentive = AddPaymentMethod$lambda$0(stateCollectAsState).getIncentive();
                List<FormElement> formElements = AddPaymentMethod$lambda$0(stateCollectAsState).getFormElements();
                composerStartRestartGroup.startReplaceGroup(581128853);
                int i5 = i3 & 14;
                z = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddPaymentMethodKt.AddPaymentMethod$lambda$2$lambda$1(interactor, (SupportedPaymentMethod) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                FormArguments arguments = AddPaymentMethod$lambda$0(stateCollectAsState).getArguments();
                USBankAccountFormArguments usBankAccountFormArguments = AddPaymentMethod$lambda$0(stateCollectAsState).getUsBankAccountFormArguments();
                int i6 = i3;
                composerStartRestartGroup.startReplaceGroup(581140548);
                zChanged = (i5 != 4 || ((i6 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor))) | composerStartRestartGroup.changed(stateCollectAsState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddPaymentMethodKt.AddPaymentMethod$lambda$4$lambda$3(interactor, stateCollectAsState, (FormFieldValues) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierTestTag = TestTagKt.testTag(companion, PAYMENT_SHEET_FORM_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(581151988);
                zChanged2 = (i5 != 4 || ((i6 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor))) | composerStartRestartGroup.changed(stateCollectAsState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddPaymentMethodKt.AddPaymentMethod$lambda$6$lambda$5(interactor, stateCollectAsState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = companion;
                PaymentElementKt.PaymentElement(z2, supportedPaymentMethods, selectedPaymentMethodCode, incentive, formElements, function1, arguments, usBankAccountFormArguments, function12, modifierTestTag, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddPaymentMethodKt.AddPaymentMethod$lambda$7(interactor, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
            boolean z22 = !AddPaymentMethod$lambda$0(stateCollectAsState).getProcessing();
            List<SupportedPaymentMethod> supportedPaymentMethods2 = AddPaymentMethod$lambda$0(stateCollectAsState).getSupportedPaymentMethods();
            String selectedPaymentMethodCode2 = AddPaymentMethod$lambda$0(stateCollectAsState).getSelectedPaymentMethodCode();
            PaymentMethodIncentive incentive2 = AddPaymentMethod$lambda$0(stateCollectAsState).getIncentive();
            List<FormElement> formElements2 = AddPaymentMethod$lambda$0(stateCollectAsState).getFormElements();
            composerStartRestartGroup.startReplaceGroup(581128853);
            int i52 = i3 & 14;
            if (i52 != 4) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddPaymentMethodKt.AddPaymentMethod$lambda$2$lambda$1(interactor, (SupportedPaymentMethod) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function1 function13 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    FormArguments arguments2 = AddPaymentMethod$lambda$0(stateCollectAsState).getArguments();
                    USBankAccountFormArguments usBankAccountFormArguments2 = AddPaymentMethod$lambda$0(stateCollectAsState).getUsBankAccountFormArguments();
                    int i62 = i3;
                    composerStartRestartGroup.startReplaceGroup(581140548);
                    if (i52 != 4) {
                        zChanged = (i52 != 4 || ((i62 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor))) | composerStartRestartGroup.changed(stateCollectAsState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AddPaymentMethodKt.AddPaymentMethod$lambda$4$lambda$3(interactor, stateCollectAsState, (FormFieldValues) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            Function1 function122 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierTestTag2 = TestTagKt.testTag(companion, PAYMENT_SHEET_FORM_TEST_TAG);
                            composerStartRestartGroup.startReplaceGroup(581151988);
                            if (i52 != 4) {
                                zChanged2 = (i52 != 4 || ((i62 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor))) | composerStartRestartGroup.changed(stateCollectAsState);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AddPaymentMethodKt.AddPaymentMethod$lambda$6$lambda$5(interactor, stateCollectAsState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifier3 = companion;
                                    PaymentElementKt.PaymentElement(z22, supportedPaymentMethods2, selectedPaymentMethodCode2, incentive2, formElements2, function13, arguments2, usBankAccountFormArguments2, function122, modifierTestTag2, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$2$lambda$1(AddPaymentMethodInteractor addPaymentMethodInteractor, SupportedPaymentMethod selectedLpm) {
        Intrinsics.checkNotNullParameter(selectedLpm, "selectedLpm");
        addPaymentMethodInteractor.handleViewAction(new AddPaymentMethodInteractor.ViewAction.OnPaymentMethodSelected(selectedLpm.getCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$4$lambda$3(AddPaymentMethodInteractor addPaymentMethodInteractor, State state, FormFieldValues formFieldValues) {
        addPaymentMethodInteractor.handleViewAction(new AddPaymentMethodInteractor.ViewAction.OnFormFieldValuesChanged(formFieldValues, AddPaymentMethod$lambda$0(state).getSelectedPaymentMethodCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$6$lambda$5(AddPaymentMethodInteractor addPaymentMethodInteractor, State state) {
        addPaymentMethodInteractor.handleViewAction(new AddPaymentMethodInteractor.ViewAction.ReportFieldInteraction(AddPaymentMethod$lambda$0(state).getSelectedPaymentMethodCode()));
        return Unit.INSTANCE;
    }

    public static final PaymentMethodCreateParams transformToPaymentMethodCreateParams(FormFieldValues formFieldValues, String paymentMethodCode, PaymentMethodMetadata paymentMethodMetadata) {
        Intrinsics.checkNotNullParameter(formFieldValues, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        return FieldValuesToParamsMapConverter.INSTANCE.transformToPaymentMethodCreateParams(formFieldValues.getFieldValuePairs(), paymentMethodCode, paymentMethodMetadata.requiresMandate(paymentMethodCode), paymentMethodMetadata.allowRedisplay(formFieldValues.getUserRequestedReuse(), paymentMethodCode));
    }

    public static /* synthetic */ PaymentMethodOptionsParams transformToPaymentMethodOptionsParams$default(FormFieldValues formFieldValues, String str, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, Object obj) {
        if ((i & 2) != 0) {
            setupFutureUsage = null;
        }
        return transformToPaymentMethodOptionsParams(formFieldValues, str, setupFutureUsage);
    }

    public static final PaymentMethodOptionsParams transformToPaymentMethodOptionsParams(FormFieldValues formFieldValues, String paymentMethodCode, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        Intrinsics.checkNotNullParameter(formFieldValues, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        return FieldValuesToParamsMapConverter.INSTANCE.transformToPaymentMethodOptionsParams(formFieldValues.getFieldValuePairs(), paymentMethodCode, setupFutureUsage);
    }

    public static final PaymentMethodExtraParams transformToExtraParams(FormFieldValues formFieldValues, String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(formFieldValues, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        return FieldValuesToParamsMapConverter.INSTANCE.transformToPaymentMethodExtraParams(formFieldValues.getFieldValuePairs(), paymentMethodCode);
    }

    public static final PaymentSelection transformToPaymentSelection(FormFieldValues formFieldValues, SupportedPaymentMethod paymentMethod, PaymentMethodMetadata paymentMethodMetadata) {
        Intrinsics.checkNotNullParameter(formFieldValues, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUseValue = PaymentSelectionKt.getSetupFutureUseValue(formFieldValues.getUserRequestedReuse(), paymentMethodMetadata.hasIntentToSetup(PaymentMethod.Type.Card.code));
        PaymentMethodCreateParams paymentMethodCreateParamsTransformToPaymentMethodCreateParams = transformToPaymentMethodCreateParams(formFieldValues, paymentMethod.getCode(), paymentMethodMetadata);
        PaymentMethodOptionsParams paymentMethodOptionsParamsTransformToPaymentMethodOptionsParams = transformToPaymentMethodOptionsParams(formFieldValues, paymentMethod.getCode(), setupFutureUseValue);
        PaymentMethodExtraParams paymentMethodExtraParamsTransformToExtraParams = transformToExtraParams(formFieldValues, paymentMethod.getCode());
        if (Intrinsics.areEqual(paymentMethod.getCode(), PaymentMethod.Type.Card.code)) {
            CardBrand.Companion companion = CardBrand.INSTANCE;
            FormFieldEntry formFieldEntry = formFieldValues.getFieldValuePairs().get(IdentifierSpec.INSTANCE.getCardBrand());
            return new PaymentSelection.New.Card(paymentMethodCreateParamsTransformToPaymentMethodCreateParams, companion.fromCode(formFieldEntry != null ? formFieldEntry.getValue() : null), formFieldValues.getUserRequestedReuse(), paymentMethodOptionsParamsTransformToPaymentMethodOptionsParams, paymentMethodExtraParamsTransformToExtraParams);
        }
        if (paymentMethodMetadata.isExternalPaymentMethod(paymentMethod.getCode())) {
            return new PaymentSelection.ExternalPaymentMethod(paymentMethod.getCode(), paymentMethodCreateParamsTransformToPaymentMethodCreateParams.getBillingDetails(), paymentMethod.getDisplayName(), paymentMethod.getIconResource(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl());
        }
        if (paymentMethodMetadata.isCustomPaymentMethod(paymentMethod.getCode())) {
            return new PaymentSelection.CustomPaymentMethod(paymentMethod.getCode(), paymentMethodCreateParamsTransformToPaymentMethodCreateParams.getBillingDetails(), paymentMethod.getDisplayName(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl());
        }
        return new PaymentSelection.New.GenericPaymentMethod(paymentMethod.getDisplayName(), paymentMethod.getIconResource(), paymentMethod.getLightThemeIconUrl(), paymentMethod.getDarkThemeIconUrl(), paymentMethodCreateParamsTransformToPaymentMethodCreateParams, formFieldValues.getUserRequestedReuse(), paymentMethodOptionsParamsTransformToPaymentMethodOptionsParams, paymentMethodExtraParamsTransformToExtraParams);
    }

    private static final AddPaymentMethodInteractor.State AddPaymentMethod$lambda$0(State<AddPaymentMethodInteractor.State> state) {
        return state.getValue();
    }
}
