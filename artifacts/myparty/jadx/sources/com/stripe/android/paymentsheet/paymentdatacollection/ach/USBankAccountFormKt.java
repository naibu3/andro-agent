package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.LinkMode;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.BankFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.ui.PromoBadgeKt;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElement;
import com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUIKt;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.AddressController;
import com.stripe.android.uicore.elements.AddressElementUIKt;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.H6TextKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
import com.stripe.android.uicore.elements.SameAsShippingController;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import com.stripe.android.uicore.elements.SameAsShippingElementUIKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: USBankAccountForm.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u009b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0002\u0010&\u001a\u001f\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010)\u001aa\u0010*\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0002\u0010+\u001a1\u0010,\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0004\b/\u00100\u001a;\u00101\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u00102\u001ae\u00103\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u00012\b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0002\u00108\u001aA\u00109\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u00012\b\u00106\u001a\u0004\u0018\u0001072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0002\u0010;\u001a1\u0010<\u001a\u00020\u00042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u00105\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010>\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006?²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010AX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010AX\u008a\u0084\u0002²\u0006\n\u0010B\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {USBankAccountFormKt.TEST_TAG_BILLING_DETAILS, "", USBankAccountFormKt.TEST_TAG_ACCOUNT_DETAILS, "USBankAccountForm", "", "formArgs", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "usBankAccountFormArgs", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "onCompleted", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "BankAccountForm", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "instantDebits", "isPaymentFlow", "showCheckboxes", "nameController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "emailController", "phoneController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "addressController", "Lcom/stripe/android/uicore/elements/AddressController;", "lastTextFieldIdentifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "sameAsShippingElement", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "saveForFutureUseElement", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "setAsDefaultPaymentMethodElement", "Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;", "onRemoveAccount", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/AddressController;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PromoDisclaimer", "promoText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BillingDetailsForm", "(ZLcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;ZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/AddressController;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Landroidx/compose/runtime/Composer;I)V", "PhoneSection", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "PhoneSection-6fMdlN4", "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddressSection", "(ZLcom/stripe/android/uicore/elements/AddressController;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountDetailsForm", "bankName", "last4", "promoBadgeState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;", "(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BankAccountDetails", "onIconButtonClick", "(Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$PromoBadgeState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AccountDetailsRemoveBankDialog", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "openDialog"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class USBankAccountFormKt {
    public static final String TEST_TAG_ACCOUNT_DETAILS = "TEST_TAG_ACCOUNT_DETAILS";
    public static final String TEST_TAG_BILLING_DETAILS = "TEST_TAG_BILLING_DETAILS";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsForm$lambda$40(Modifier modifier, boolean z, boolean z2, String str, String str2, BankFormScreenState.PromoBadgeState promoBadgeState, SaveForFutureUseElement saveForFutureUseElement, SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountDetailsForm(modifier, z, z2, str, str2, promoBadgeState, saveForFutureUseElement, setAsDefaultPaymentMethodElement, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsRemoveBankDialog$lambda$47(Function0 function0, Function0 function02, String str, int i, Composer composer, int i2) {
        AccountDetailsRemoveBankDialog(function0, function02, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressSection$lambda$27(boolean z, AddressController addressController, IdentifierSpec identifierSpec, SameAsShippingElement sameAsShippingElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddressSection(z, addressController, identifierSpec, sameAsShippingElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountDetails$lambda$42(String str, boolean z, String str2, BankFormScreenState.PromoBadgeState promoBadgeState, Function0 function0, int i, Composer composer, int i2) {
        BankAccountDetails(str, z, str2, promoBadgeState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BankAccountForm$lambda$10(BankFormScreenState bankFormScreenState, FormArguments formArguments, boolean z, boolean z2, boolean z3, TextFieldController textFieldController, TextFieldController textFieldController2, PhoneNumberController phoneNumberController, AddressController addressController, IdentifierSpec identifierSpec, SameAsShippingElement sameAsShippingElement, SaveForFutureUseElement saveForFutureUseElement, SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, Modifier modifier, boolean z4, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        BankAccountForm(bankFormScreenState, formArguments, z, z2, z3, textFieldController, textFieldController2, phoneNumberController, addressController, identifierSpec, sameAsShippingElement, saveForFutureUseElement, setAsDefaultPaymentMethodElement, modifier, z4, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BillingDetailsForm$lambda$15(boolean z, FormArguments formArguments, boolean z2, boolean z3, TextFieldController textFieldController, TextFieldController textFieldController2, PhoneNumberController phoneNumberController, AddressController addressController, IdentifierSpec identifierSpec, SameAsShippingElement sameAsShippingElement, int i, Composer composer, int i2) {
        BillingDetailsForm(z, formArguments, z2, z3, textFieldController, textFieldController2, phoneNumberController, addressController, identifierSpec, sameAsShippingElement, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneSection_6fMdlN4$lambda$20(boolean z, PhoneNumberController phoneNumberController, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m8354PhoneSection6fMdlN4(z, phoneNumberController, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoDisclaimer$lambda$11(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromoDisclaimer(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit USBankAccountForm$lambda$6(FormArguments formArguments, USBankAccountFormArguments uSBankAccountFormArguments, Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        USBankAccountForm(formArguments, uSBankAccountFormArguments, function0, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void USBankAccountForm(final FormArguments formArgs, final USBankAccountFormArguments usBankAccountFormArgs, final Function0<Unit> onCompleted, Modifier modifier, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(formArgs, "formArgs");
        Intrinsics.checkNotNullParameter(usBankAccountFormArgs, "usBankAccountFormArgs");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-358694232);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(formArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(usBankAccountFormArgs) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCompleted) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-358694232, i4, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountForm (USBankAccountForm.kt:80)");
                }
                AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory = usBankAccountFormArgs.getAutocompleteAddressInteractorFactory();
                composerStartRestartGroup.startReplaceGroup(-163336694);
                zChangedInstance = composerStartRestartGroup.changedInstance(usBankAccountFormArgs) | composerStartRestartGroup.changedInstance(formArgs);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return USBankAccountFormKt.USBankAccountForm$lambda$1$lambda$0(usBankAccountFormArgs, formArgs);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                USBankAccountFormViewModel.Factory factory = new USBankAccountFormViewModel.Factory(autocompleteAddressInteractorFactory, (Function0) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(USBankAccountFormViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                USBankAccountFormViewModel uSBankAccountFormViewModel = (USBankAccountFormViewModel) viewModel;
                boolean z2 = false;
                State stateCollectAsState = StateFlowsComposeKt.collectAsState(uSBankAccountFormViewModel.getCurrentScreenState(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(uSBankAccountFormViewModel.getLastTextFieldIdentifier(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(uSBankAccountFormViewModel.getAddressElement().getAddressController(), null, composerStartRestartGroup, 0, 1);
                if (!USBankAccountForm$lambda$2(stateCollectAsState).isProcessing() && z) {
                    z2 = true;
                }
                USBankAccountEmittersKt.USBankAccountEmitters(uSBankAccountFormViewModel, usBankAccountFormArgs, onCompleted, composerStartRestartGroup, i4 & PointerIconCompat.TYPE_TEXT);
                BankFormScreenState bankFormScreenStateUSBankAccountForm$lambda$2 = USBankAccountForm$lambda$2(stateCollectAsState);
                boolean instantDebits = usBankAccountFormArgs.getInstantDebits();
                boolean isPaymentFlow = usBankAccountFormArgs.getIsPaymentFlow();
                boolean showCheckbox = usBankAccountFormArgs.getShowCheckbox();
                TextFieldController nameController = uSBankAccountFormViewModel.getNameController();
                TextFieldController emailController = uSBankAccountFormViewModel.getEmailController();
                PhoneNumberController phoneController = uSBankAccountFormViewModel.getPhoneController();
                AddressController addressControllerUSBankAccountForm$lambda$4 = USBankAccountForm$lambda$4(stateCollectAsState3);
                IdentifierSpec identifierSpecUSBankAccountForm$lambda$3 = USBankAccountForm$lambda$3(stateCollectAsState2);
                SameAsShippingElement sameAsShippingElement = uSBankAccountFormViewModel.getSameAsShippingElement();
                SaveForFutureUseElement saveForFutureUseElement = uSBankAccountFormViewModel.getSaveForFutureUseElement();
                boolean z3 = z2;
                SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement = uSBankAccountFormViewModel.getSetAsDefaultPaymentMethodElement();
                composerStartRestartGroup.startReplaceGroup(-163257923);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uSBankAccountFormViewModel);
                USBankAccountFormKt$USBankAccountForm$1$1 uSBankAccountFormKt$USBankAccountForm$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || uSBankAccountFormKt$USBankAccountForm$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    uSBankAccountFormKt$USBankAccountForm$1$1RememberedValue = new USBankAccountFormKt$USBankAccountForm$1$1(uSBankAccountFormViewModel);
                    composerStartRestartGroup.updateRememberedValue(uSBankAccountFormKt$USBankAccountForm$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BankAccountForm(bankFormScreenStateUSBankAccountForm$lambda$2, formArgs, instantDebits, isPaymentFlow, showCheckbox, nameController, emailController, phoneController, addressControllerUSBankAccountForm$lambda$4, identifierSpecUSBankAccountForm$lambda$3, sameAsShippingElement, saveForFutureUseElement, setAsDefaultPaymentMethodElement, modifier5, z3, (Function0) uSBankAccountFormKt$USBankAccountForm$1$1RememberedValue, composerStartRestartGroup, ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (PhoneNumberController.$stable << 21) | (AddressController.$stable << 24) | (IdentifierSpec.$stable << 27), SameAsShippingElement.$stable | (SaveForFutureUseElement.$stable << 3) | (SetAsDefaultPaymentMethodElement.$stable << 6) | (i4 & 7168), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return USBankAccountFormKt.USBankAccountForm$lambda$6(formArgs, usBankAccountFormArgs, onCompleted, modifier3, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory2 = usBankAccountFormArgs.getAutocompleteAddressInteractorFactory();
            composerStartRestartGroup.startReplaceGroup(-163336694);
            zChangedInstance = composerStartRestartGroup.changedInstance(usBankAccountFormArgs) | composerStartRestartGroup.changedInstance(formArgs);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return USBankAccountFormKt.USBankAccountForm$lambda$1$lambda$0(usBankAccountFormArgs, formArgs);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                USBankAccountFormViewModel.Factory factory2 = new USBankAccountFormViewModel.Factory(autocompleteAddressInteractorFactory2, (Function0) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current != null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final USBankAccountFormViewModel.Args USBankAccountForm$lambda$1$lambda$0(USBankAccountFormArguments uSBankAccountFormArguments, FormArguments formArguments) {
        boolean instantDebits = uSBankAccountFormArguments.getInstantDebits();
        PaymentMethodIncentive incentive = uSBankAccountFormArguments.getIncentive();
        LinkMode linkMode = uSBankAccountFormArguments.getLinkMode();
        String hostedSurface = uSBankAccountFormArguments.getHostedSurface();
        boolean showCheckbox = uSBankAccountFormArguments.getShowCheckbox();
        boolean isCompleteFlow = uSBankAccountFormArguments.getIsCompleteFlow();
        boolean isPaymentFlow = uSBankAccountFormArguments.getIsPaymentFlow();
        String stripeIntentId = uSBankAccountFormArguments.getStripeIntentId();
        String clientSecret = uSBankAccountFormArguments.getClientSecret();
        String onBehalfOf = uSBankAccountFormArguments.getOnBehalfOf();
        PaymentSelection draftPaymentSelection = uSBankAccountFormArguments.getDraftPaymentSelection();
        return new USBankAccountFormViewModel.Args(instantDebits, incentive, linkMode, formArguments, showCheckbox, isCompleteFlow, isPaymentFlow, stripeIntentId, clientSecret, onBehalfOf, draftPaymentSelection instanceof PaymentSelection.New.USBankAccount ? (PaymentSelection.New.USBankAccount) draftPaymentSelection : null, uSBankAccountFormArguments.getShippingDetails(), hostedSurface, uSBankAccountFormArguments.getFinancialConnectionsAvailability(), uSBankAccountFormArguments.getSetAsDefaultPaymentMethodEnabled(), uSBankAccountFormArguments.getSetAsDefaultMatchesSaveForFutureUse());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankAccountForm(final BankFormScreenState state, final FormArguments formArgs, final boolean z, final boolean z2, final boolean z3, final TextFieldController nameController, final TextFieldController emailController, final PhoneNumberController phoneController, final AddressController addressController, final IdentifierSpec identifierSpec, final SameAsShippingElement sameAsShippingElement, final SaveForFutureUseElement saveForFutureUseElement, final SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, Modifier modifier, final boolean z4, final Function0<Unit> onRemoveAccount, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        BankFormScreenState.LinkedBankAccount linkedBankAccount;
        ResolvableString promoDisclaimerText;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(formArgs, "formArgs");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneController, "phoneController");
        Intrinsics.checkNotNullParameter(addressController, "addressController");
        Intrinsics.checkNotNullParameter(saveForFutureUseElement, "saveForFutureUseElement");
        Intrinsics.checkNotNullParameter(onRemoveAccount, "onRemoveAccount");
        Composer composerStartRestartGroup = composer.startRestartGroup(-261034153);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(formArgs) ? 32 : 16;
        }
        int i11 = i4;
        if ((i3 & 4) != 0) {
            i11 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i11 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i11 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i11 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i11 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i11 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i11 |= composerStartRestartGroup.changedInstance(nameController) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i11 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i11 |= composerStartRestartGroup.changedInstance(emailController) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i5 = 12582912;
                    } else {
                        if ((12582912 & i) == 0) {
                            i5 = (16777216 & i) == 0 ? composerStartRestartGroup.changed(phoneController) : composerStartRestartGroup.changedInstance(phoneController) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) != 0) {
                            i6 = 100663296;
                        } else {
                            if ((100663296 & i) == 0) {
                                i6 = (134217728 & i) == 0 ? composerStartRestartGroup.changed(addressController) : composerStartRestartGroup.changedInstance(addressController) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 512) == 0) {
                                i7 = 805306368;
                            } else {
                                if ((805306368 & i) == 0) {
                                    i7 = (1073741824 & i) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? 536870912 : 268435456;
                                }
                                i8 = i11;
                                if ((i3 & 1024) != 0) {
                                    i9 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i9 = i2 | ((i2 & 8) == 0 ? composerStartRestartGroup.changed(sameAsShippingElement) : composerStartRestartGroup.changedInstance(sameAsShippingElement) ? 4 : 2);
                                } else {
                                    i9 = i2;
                                }
                                if ((i3 & 2048) != 0) {
                                    i9 |= 48;
                                } else if ((i2 & 48) == 0) {
                                    i9 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(saveForFutureUseElement) : composerStartRestartGroup.changedInstance(saveForFutureUseElement) ? 32 : 16;
                                }
                                if ((i3 & 4096) != 0) {
                                    i9 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    i9 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(setAsDefaultPaymentMethodElement) : composerStartRestartGroup.changedInstance(setAsDefaultPaymentMethodElement) ? 256 : 128;
                                }
                                i10 = i3 & 8192;
                                if (i10 != 0) {
                                    i9 |= 3072;
                                } else {
                                    if ((i2 & 3072) == 0) {
                                        i9 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        if ((i2 & 24576) == 0) {
                                            i9 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                        }
                                        if ((i3 & 32768) != 0) {
                                            i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i9 |= composerStartRestartGroup.changedInstance(onRemoveAccount) ? 131072 : 65536;
                                        }
                                        if ((i8 & 306783379) != 306783378 || (74899 & i9) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                            Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-261034153, i8, i9, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BankAccountForm (USBankAccountForm.kt:153)");
                                            }
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                            Modifier modifier3 = companion;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                                composerStartRestartGroup.createNode(constructor);
                                            } else {
                                                composerStartRestartGroup.useNode();
                                            }
                                            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            int i12 = (i9 >> 6) & 896;
                                            int i13 = i8 >> 3;
                                            int i14 = ((i8 >> 6) & 14) | (i8 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i12 | (i8 & 7168) | (57344 & i13) | (458752 & i13) | (PhoneNumberController.$stable << 18) | (3670016 & i13) | (AddressController.$stable << 21) | (29360128 & i13) | (IdentifierSpec.$stable << 24) | (i13 & 234881024) | (SameAsShippingElement.$stable << 27) | ((i9 << 27) & 1879048192);
                                            int i15 = i9;
                                            composer2 = composerStartRestartGroup;
                                            BillingDetailsForm(z, formArgs, z4, z2, nameController, emailController, phoneController, addressController, identifierSpec, sameAsShippingElement, composer2, i14);
                                            linkedBankAccount = state.getLinkedBankAccount();
                                            composer2.startReplaceGroup(1872714773);
                                            if (linkedBankAccount != null) {
                                                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null);
                                                String bankName = linkedBankAccount.getBankName();
                                                String last4 = linkedBankAccount.getLast4();
                                                BankFormScreenState.PromoBadgeState promoBadgeState = state.getPromoBadgeState();
                                                int i16 = ((i8 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | i12 | (SaveForFutureUseElement.$stable << 18);
                                                int i17 = i15 << 15;
                                                AccountDetailsForm(modifierM1024paddingqDBjuR0$default, z3, z4, bankName, last4, promoBadgeState, saveForFutureUseElement, setAsDefaultPaymentMethodElement, onRemoveAccount, composer2, i16 | (3670016 & i17) | (SetAsDefaultPaymentMethodElement.$stable << 21) | (i17 & 29360128) | ((i15 << 9) & 234881024), 0);
                                                composer2 = composer2;
                                                Unit unit = Unit.INSTANCE;
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            composer2.endReplaceGroup();
                                            promoDisclaimerText = state.getPromoDisclaimerText();
                                            composer2.startReplaceGroup(1872734312);
                                            if (promoDisclaimerText != null) {
                                                PromoDisclaimer(ResolvableStringComposeUtilsKt.resolve(promoDisclaimerText, composer2, 0), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(12), 0.0f, 0.0f, 13, null), composer2, 48, 0);
                                                Unit unit3 = Unit.INSTANCE;
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                            composer2.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier2 = modifier3;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            modifier2 = modifier;
                                            composer2 = composerStartRestartGroup;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return USBankAccountFormKt.BankAccountForm$lambda$10(state, formArgs, z, z2, z3, nameController, emailController, phoneController, addressController, identifierSpec, sameAsShippingElement, saveForFutureUseElement, setAsDefaultPaymentMethodElement, modifier2, z4, onRemoveAccount, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i9 |= 24576;
                                    if ((i3 & 32768) != 0) {
                                    }
                                    if ((i8 & 306783379) != 306783378) {
                                        if (i10 == 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        Modifier modifier32 = companion;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3150constructorimpl.getInserting()) {
                                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            int i122 = (i9 >> 6) & 896;
                                            int i132 = i8 >> 3;
                                            int i142 = ((i8 >> 6) & 14) | (i8 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i122 | (i8 & 7168) | (57344 & i132) | (458752 & i132) | (PhoneNumberController.$stable << 18) | (3670016 & i132) | (AddressController.$stable << 21) | (29360128 & i132) | (IdentifierSpec.$stable << 24) | (i132 & 234881024) | (SameAsShippingElement.$stable << 27) | ((i9 << 27) & 1879048192);
                                            int i152 = i9;
                                            composer2 = composerStartRestartGroup;
                                            BillingDetailsForm(z, formArgs, z4, z2, nameController, emailController, phoneController, addressController, identifierSpec, sameAsShippingElement, composer2, i142);
                                            linkedBankAccount = state.getLinkedBankAccount();
                                            composer2.startReplaceGroup(1872714773);
                                            if (linkedBankAccount != null) {
                                            }
                                            composer2.endReplaceGroup();
                                            promoDisclaimerText = state.getPromoDisclaimerText();
                                            composer2.startReplaceGroup(1872734312);
                                            if (promoDisclaimerText != null) {
                                            }
                                            composer2.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier2 = modifier32;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i3 & 16384) != 0) {
                                }
                                if ((i3 & 32768) != 0) {
                                }
                                if ((i8 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i11 |= i7;
                            i8 = i11;
                            if ((i3 & 1024) != 0) {
                            }
                            if ((i3 & 2048) != 0) {
                            }
                            if ((i3 & 4096) != 0) {
                            }
                            i10 = i3 & 8192;
                            if (i10 != 0) {
                            }
                            if ((i3 & 16384) != 0) {
                            }
                            if ((i3 & 32768) != 0) {
                            }
                            if ((i8 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i11 |= i6;
                        if ((i3 & 512) == 0) {
                        }
                        i11 |= i7;
                        i8 = i11;
                        if ((i3 & 1024) != 0) {
                        }
                        if ((i3 & 2048) != 0) {
                        }
                        if ((i3 & 4096) != 0) {
                        }
                        i10 = i3 & 8192;
                        if (i10 != 0) {
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        if ((i3 & 32768) != 0) {
                        }
                        if ((i8 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i11 |= i5;
                    if ((i3 & 256) != 0) {
                    }
                    i11 |= i6;
                    if ((i3 & 512) == 0) {
                    }
                    i11 |= i7;
                    i8 = i11;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    i10 = i3 & 8192;
                    if (i10 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i3 & 32768) != 0) {
                    }
                    if ((i8 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                i11 |= i5;
                if ((i3 & 256) != 0) {
                }
                i11 |= i6;
                if ((i3 & 512) == 0) {
                }
                i11 |= i7;
                i8 = i11;
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                i10 = i3 & 8192;
                if (i10 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                if ((i8 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            i11 |= i5;
            if ((i3 & 256) != 0) {
            }
            i11 |= i6;
            if ((i3 & 512) == 0) {
            }
            i11 |= i7;
            i8 = i11;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            i10 = i3 & 8192;
            if (i10 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            if ((i8 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i11 |= i5;
        if ((i3 & 256) != 0) {
        }
        i11 |= i6;
        if ((i3 & 512) == 0) {
        }
        i11 |= i7;
        i8 = i11;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        i10 = i3 & 8192;
        if (i10 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        if ((i8 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PromoDisclaimer(String str, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1104697245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1104697245, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PromoDisclaimer (USBankAccountForm.kt:195)");
            }
            str2 = str;
            MandateTextUIKt.m8662MandateJ7GKdg(str2, modifier2, 0, 0, null, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return USBankAccountFormKt.PromoDisclaimer$lambda$11(str2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    private static final void BillingDetailsForm(final boolean z, final FormArguments formArguments, final boolean z2, final boolean z3, final TextFieldController textFieldController, final TextFieldController textFieldController2, final PhoneNumberController phoneNumberController, final AddressController addressController, final IdentifierSpec identifierSpec, final SameAsShippingElement sameAsShippingElement, Composer composer, final int i) {
        int i2;
        FormArguments formArguments2;
        String strStringResource;
        String str;
        String str2;
        float f;
        ?? r11;
        Object obj;
        final boolean z4;
        int i3;
        int iM5783getNexteUduSuo;
        Composer composerStartRestartGroup = composer.startRestartGroup(-741145595);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            formArguments2 = formArguments;
            i2 |= composerStartRestartGroup.changedInstance(formArguments2) ? 32 : 16;
        } else {
            formArguments2 = formArguments;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFieldController) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFieldController2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(addressController) : composerStartRestartGroup.changedInstance(addressController) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= (1073741824 & i) == 0 ? composerStartRestartGroup.changed(sameAsShippingElement) : composerStartRestartGroup.changedInstance(sameAsShippingElement) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741145595, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsForm (USBankAccountForm.kt:215)");
            }
            int i4 = i2;
            Modifier modifierTestTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), TEST_TAG_BILLING_DETAILS);
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
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1178597682);
                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_pay_with_bank_title, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1178496622);
                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_save_bank_title, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            H6TextKt.H6Text(strStringResource, null, false, composerStartRestartGroup, 0, 6);
            boolean z5 = !z ? formArguments2.getBillingDetailsCollectionConfiguration().getName() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never : formArguments2.getBillingDetailsCollectionConfiguration().getName() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always;
            composerStartRestartGroup.startReplaceGroup(100545041);
            if (!z5) {
                str = "C73@3429L9:Box.kt#2w3rfo";
                str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                f = 0.0f;
                r11 = 1;
                obj = null;
            } else {
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                str = "C73@3429L9:Box.kt#2w3rfo";
                r11 = 1;
                f = 0.0f;
                obj = null;
                TextFieldUIKt.TextFieldSection(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), textFieldController, false, null, ComposableLambdaKt.rememberComposableLambda(1091024005, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$BillingDetailsForm$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1091024005, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsForm.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:247)");
                            }
                            TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController, z2, ImeAction.INSTANCE.m5783getNexteUduSuo(), null, null, 0, 0, null, false, false, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24582, 12);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(100565968);
            if (formArguments.getBillingDetailsCollectionConfiguration().getEmail() != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never) {
                Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, r11, obj), Dp.m6117constructorimpl(0));
                Alignment centerEnd2 = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, str2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, str);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                i3 = 16;
                z4 = z2;
                TextFieldUIKt.TextFieldSection(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), textFieldController2, false, null, ComposableLambdaKt.rememberComposableLambda(408850478, r11, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$BillingDetailsForm$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        int iM5783getNexteUduSuo2;
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(408850478, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BillingDetailsForm.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:266)");
                            }
                            TextFieldController textFieldController3 = textFieldController2;
                            boolean z6 = z4;
                            if (Intrinsics.areEqual(identifierSpec, IdentifierSpec.INSTANCE.getEmail())) {
                                iM5783getNexteUduSuo2 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                            } else {
                                iM5783getNexteUduSuo2 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                            }
                            TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController3, z6, iM5783getNexteUduSuo2, null, null, 0, 0, null, false, false, composer2, 0, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24582, 12);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                z4 = z2;
                i3 = 16;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(100594382);
            if (formArguments.getBillingDetailsCollectionConfiguration().getPhone() == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always) {
                if (Intrinsics.areEqual(identifierSpec, IdentifierSpec.INSTANCE.getPhone())) {
                    iM5783getNexteUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                } else {
                    iM5783getNexteUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
                }
                m8354PhoneSection6fMdlN4(z4, phoneNumberController, iM5783getNexteUduSuo, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(i3), 0.0f, 0.0f, 13, null), composerStartRestartGroup, ((i4 >> 6) & 14) | 3072 | (PhoneNumberController.$stable << 3) | ((i4 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(100609784);
            if (formArguments.getBillingDetailsCollectionConfiguration().getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full) {
                int i5 = i4 >> 18;
                Composer composer2 = composerStartRestartGroup;
                AddressSection(z2, addressController, identifierSpec, sameAsShippingElement, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(i3), 0.0f, 0.0f, 13, null), composer2, ((i4 >> 6) & 14) | 24576 | (AddressController.$stable << 3) | (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (IdentifierSpec.$stable << 6) | (i5 & 896) | (SameAsShippingElement.$stable << 9) | (i5 & 7168), 0);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return USBankAccountFormKt.BillingDetailsForm$lambda$15(z, formArguments, z2, z3, textFieldController, textFieldController2, phoneNumberController, addressController, identifierSpec, sameAsShippingElement, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: PhoneSection-6fMdlN4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8354PhoneSection6fMdlN4(final boolean z, final PhoneNumberController phoneNumberController, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        FieldError fieldErrorPhoneSection_6fMdlN4$lambda$16;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(745689175);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(745689175, i4, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection (USBankAccountForm.kt:309)");
                }
                fieldErrorPhoneSection_6fMdlN4$lambda$16 = PhoneSection_6fMdlN4$lambda$16(StateFlowsComposeKt.collectAsState(phoneNumberController.getError(), null, composerStartRestartGroup, 0, 1));
                composerStartRestartGroup.startReplaceGroup(631985919);
                if (fieldErrorPhoneSection_6fMdlN4$lambda$16 != null) {
                    strStringResource = null;
                } else {
                    Object[] formatArgs = fieldErrorPhoneSection_6fMdlN4$lambda$16.getFormatArgs();
                    composerStartRestartGroup.startReplaceGroup(631986777);
                    strStringResource = formatArgs == null ? null : StringResources_androidKt.stringResource(fieldErrorPhoneSection_6fMdlN4$lambda$16.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(631986347);
                    if (strStringResource == null) {
                        strStringResource = StringResources_androidKt.stringResource(fieldErrorPhoneSection_6fMdlN4$lambda$16.getErrorMessage(), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                SectionUIKt.Section(null, strStringResource, modifier4, false, ComposableLambdaKt.rememberComposableLambda(-167506789, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$PhoneSection$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-167506789, i6, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection.<anonymous>.<anonymous> (USBankAccountForm.kt:332)");
                            }
                            PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z, phoneNumberController, null, null, false, false, null, null, i, composer2, PhoneNumberController.$stable << 3, 252);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 896) | 24582, 8);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return USBankAccountFormKt.PhoneSection_6fMdlN4$lambda$20(z, phoneNumberController, i, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fieldErrorPhoneSection_6fMdlN4$lambda$16 = PhoneSection_6fMdlN4$lambda$16(StateFlowsComposeKt.collectAsState(phoneNumberController.getError(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(631985919);
            if (fieldErrorPhoneSection_6fMdlN4$lambda$16 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
            Alignment centerEnd2 = Alignment.INSTANCE.getCenterEnd();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd2, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                SectionUIKt.Section(null, strStringResource, modifier4, false, ComposableLambdaKt.rememberComposableLambda(-167506789, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$PhoneSection$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-167506789, i6, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.PhoneSection.<anonymous>.<anonymous> (USBankAccountForm.kt:332)");
                            }
                            PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z, phoneNumberController, null, null, false, false, null, null, i, composer2, PhoneNumberController.$stable << 3, 252);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 896) | 24582, 8);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AddressSection(final boolean z, final AddressController addressController, final IdentifierSpec identifierSpec, final SameAsShippingElement sameAsShippingElement, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        FieldError fieldErrorAddressSection$lambda$21;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM3150constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272277033);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(addressController) : composerStartRestartGroup.changedInstance(addressController) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(sameAsShippingElement) : composerStartRestartGroup.changedInstance(sameAsShippingElement) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1272277033, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection (USBankAccountForm.kt:349)");
                }
                fieldErrorAddressSection$lambda$21 = AddressSection$lambda$21(StateFlowsComposeKt.collectAsState(addressController.getError(), null, composerStartRestartGroup, 0, 1));
                composerStartRestartGroup.startReplaceGroup(543093753);
                if (fieldErrorAddressSection$lambda$21 != null) {
                    strStringResource = null;
                } else {
                    Object[] formatArgs = fieldErrorAddressSection$lambda$21.getFormatArgs();
                    composerStartRestartGroup.startReplaceGroup(543094611);
                    strStringResource = formatArgs == null ? null : StringResources_androidKt.stringResource(fieldErrorAddressSection$lambda$21.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(543094181);
                    if (strStringResource == null) {
                        strStringResource = StringResources_androidKt.stringResource(fieldErrorAddressSection$lambda$21.getErrorMessage(), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SectionUIKt.Section(ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.ui.core.R.string.stripe_billing_details, new Object[0], null, 4, null), strStringResource, null, false, ComposableLambdaKt.rememberComposableLambda(1444792713, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$AddressSection$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1444792713, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:372)");
                            }
                            AddressElementUIKt.AddressElementUI(z, addressController, SetsKt.emptySet(), identifierSpec, null, composer2, (AddressController.$stable << 3) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | (IdentifierSpec.$stable << 9), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                composerStartRestartGroup.startReplaceGroup(-433063262);
                if (sameAsShippingElement != null) {
                    SameAsShippingElementUIKt.SameAsShippingElementUI(sameAsShippingElement.getController(), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(12), 0.0f, 0.0f, 13, null), composerStartRestartGroup, SameAsShippingController.$stable | 48, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return USBankAccountFormKt.AddressSection$lambda$27(z, addressController, identifierSpec, sameAsShippingElement, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fieldErrorAddressSection$lambda$21 = AddressSection$lambda$21(StateFlowsComposeKt.collectAsState(addressController.getError(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(543093753);
            if (fieldErrorAddressSection$lambda$21 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(0));
            Alignment centerEnd2 = Alignment.INSTANCE.getCenterEnd();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd2, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl2.getInserting()) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    SectionUIKt.Section(ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.ui.core.R.string.stripe_billing_details, new Object[0], null, 4, null), strStringResource, null, false, ComposableLambdaKt.rememberComposableLambda(1444792713, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$AddressSection$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1444792713, i5, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AddressSection.<anonymous>.<anonymous>.<anonymous> (USBankAccountForm.kt:372)");
                                }
                                AddressElementUIKt.AddressElementUI(z, addressController, SetsKt.emptySet(), identifierSpec, null, composer2, (AddressController.$stable << 3) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | (IdentifierSpec.$stable << 9), 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                    composerStartRestartGroup.startReplaceGroup(-433063262);
                    if (sameAsShippingElement != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AccountDetailsForm(Modifier modifier, final boolean z, final boolean z2, final String str, String str2, final BankFormScreenState.PromoBadgeState promoBadgeState, final SaveForFutureUseElement saveForFutureUseElement, final SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        Object objRememberedValue;
        final MutableState mutableState;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        int i4;
        int i5;
        String str3;
        final Modifier modifier3;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean z4;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1712712382);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= composerStartRestartGroup.changed(promoBadgeState) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(saveForFutureUseElement) : composerStartRestartGroup.changedInstance(saveForFutureUseElement) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(setAsDefaultPaymentMethodElement) : composerStartRestartGroup.changedInstance(setAsDefaultPaymentMethodElement) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1712712382, i3, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsForm (USBankAccountForm.kt:397)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1846436796);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return USBankAccountFormKt.AccountDetailsForm$lambda$29$lambda$28();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        Modifier modifierTestTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), TEST_TAG_ACCOUNT_DETAILS);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierTestTag);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        float f = 8;
                        H6TextKt.H6Text(StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_title_bank_account, composerStartRestartGroup, 0), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f), 7, null), false, composerStartRestartGroup, 48, 4);
                        composerStartRestartGroup.startReplaceGroup(-670091437);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return USBankAccountFormKt.AccountDetailsForm$lambda$35$lambda$33$lambda$32(mutableState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = i3 >> 6;
                        i4 = i7 & 896;
                        i5 = i3;
                        Modifier modifier4 = companion;
                        BankAccountDetails(str, z3, str2, promoBadgeState, (Function0) objRememberedValue2, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i4 | (i7 & 7168));
                        str3 = str2;
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-670088813);
                        if (z) {
                            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 0.0f, 0.0f, 13, null);
                            int i8 = (i7 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(z2, saveForFutureUseElement, modifierM1024paddingqDBjuR0$default, composerStartRestartGroup, (SaveForFutureUseElement.$stable << 3) | i8 | ((i5 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                            if (setAsDefaultPaymentMethodElement != null) {
                                SetAsDefaultPaymentMethodElementUIKt.SetAsDefaultPaymentMethodElementUI(z2, setAsDefaultPaymentMethodElement, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 0.0f, 0.0f, 13, null), composerStartRestartGroup, i8 | (SetAsDefaultPaymentMethodElement.$stable << 3), 0);
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (AccountDetailsForm$lambda$30(mutableState) && str3 != null) {
                            composerStartRestartGroup.startReplaceGroup(1846474325);
                            zChanged2 = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return USBankAccountFormKt.AccountDetailsForm$lambda$37$lambda$36(mutableState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function02 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1846476948);
                            z4 = (234881024 & i5) == 67108864;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return USBankAccountFormKt.AccountDetailsForm$lambda$39$lambda$38(function0);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            AccountDetailsRemoveBankDialog(function02, (Function0) objRememberedValue4, str3, composerStartRestartGroup, i4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str3 = str2;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final String str4 = str3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return USBankAccountFormKt.AccountDetailsForm$lambda$40(modifier3, z, z2, str, str4, promoBadgeState, saveForFutureUseElement, setAsDefaultPaymentMethodElement, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1846436796);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    Modifier modifierTestTag2 = TestTagKt.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), TEST_TAG_ACCOUNT_DETAILS);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting()) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        float f2 = 8;
                        H6TextKt.H6Text(StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_title_bank_account, composerStartRestartGroup, 0), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f2), 7, null), false, composerStartRestartGroup, 48, 4);
                        composerStartRestartGroup.startReplaceGroup(-670091437);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return USBankAccountFormKt.AccountDetailsForm$lambda$35$lambda$33$lambda$32(mutableState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            int i72 = i3 >> 6;
                            i4 = i72 & 896;
                            i5 = i3;
                            Modifier modifier42 = companion;
                            BankAccountDetails(str, z3, str2, promoBadgeState, (Function0) objRememberedValue2, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i4 | (i72 & 7168));
                            str3 = str2;
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(-670088813);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            if (AccountDetailsForm$lambda$30(mutableState)) {
                                composerStartRestartGroup.startReplaceGroup(1846474325);
                                zChanged2 = composerStartRestartGroup.changed(mutableState);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return USBankAccountFormKt.AccountDetailsForm$lambda$37$lambda$36(mutableState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    Function0 function022 = (Function0) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1846476948);
                                    if ((234881024 & i5) == 67108864) {
                                    }
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!z4) {
                                        objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return USBankAccountFormKt.AccountDetailsForm$lambda$39$lambda$38(function0);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceGroup();
                                        AccountDetailsRemoveBankDialog(function022, (Function0) objRememberedValue4, str3, composerStartRestartGroup, i4);
                                    }
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AccountDetailsForm$lambda$29$lambda$28() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean AccountDetailsForm$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AccountDetailsForm$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsForm$lambda$35$lambda$33$lambda$32(MutableState mutableState) {
        AccountDetailsForm$lambda$31(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsForm$lambda$37$lambda$36(MutableState mutableState) {
        AccountDetailsForm$lambda$31(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsForm$lambda$39$lambda$38(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void BankAccountDetails(final String str, final boolean z, final String str2, final BankFormScreenState.PromoBadgeState promoBadgeState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z2;
        String str3;
        BankFormScreenState.PromoBadgeState promoBadgeState2;
        Function0<Unit> function02;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2029602721);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            promoBadgeState2 = promoBadgeState;
            i2 |= composerStartRestartGroup.changed(promoBadgeState2) ? 2048 : 1024;
        } else {
            promoBadgeState2 = promoBadgeState;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2029602721, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BankAccountDetails (USBankAccountForm.kt:456)");
            }
            ProvidableCompositionLocal<IconStyle> localIconStyle = StripeThemeKt.getLocalIconStyle();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localIconStyle);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            IconStyle iconStyle = (IconStyle) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1996899866);
            boolean zChanged = ((i2 & 14) == 4) | composerStartRestartGroup.changed(iconStyle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TransformToBankIcon transformToBankIcon = TransformToBankIcon.INSTANCE;
                if (iconStyle == IconStyle.Outlined) {
                    i3 = com.stripe.android.ui.core.R.drawable.stripe_ic_paymentsheet_pm_bank_outlined;
                } else {
                    i3 = com.stripe.android.ui.core.R.drawable.stripe_ic_paymentsheet_pm_bank;
                }
                objRememberedValue = Integer.valueOf(transformToBankIcon.invoke(str, i3));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            composerStartRestartGroup.endReplaceGroup();
            SectionUIKt.m8829SectionCardfWhpE4E(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 0L, null, ComposableLambdaKt.rememberComposableLambda(1816408804, true, new AnonymousClass1(function02, z2, iIntValue, str, str3, promoBadgeState2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return USBankAccountFormKt.BankAccountDetails$lambda$42(str, z, str2, promoBadgeState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: USBankAccountForm.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$BankAccountDetails$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $bankIcon;
        final /* synthetic */ String $bankName;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ String $last4;
        final /* synthetic */ Function0<Unit> $onIconButtonClick;
        final /* synthetic */ BankFormScreenState.PromoBadgeState $promoBadgeState;

        AnonymousClass1(Function0<Unit> function0, boolean z, int i, String str, String str2, BankFormScreenState.PromoBadgeState promoBadgeState) {
            this.$onIconButtonClick = function0;
            this.$enabled = z;
            this.$bankIcon = i;
            this.$bankName = str;
            this.$last4 = str2;
            this.$promoBadgeState = promoBadgeState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1816408804, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.BankAccountDetails.<anonymous> (USBankAccountForm.kt:470)");
                }
                float f = 8;
                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.m1022paddingVpY3zN4$default(SizeKt.m1053heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(56), 0.0f, 2, null), 0.0f, Dp.m6117constructorimpl(12), 1, null), Dp.m6117constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, Dp.m6117constructorimpl(f), 0.0f, 11, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                final Function0<Unit> function0 = this.$onIconButtonClick;
                boolean z = this.$enabled;
                int i2 = this.$bankIcon;
                String str = this.$bankName;
                String str2 = this.$last4;
                BankFormScreenState.PromoBadgeState promoBadgeState = this.$promoBadgeState;
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1024paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f));
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically2, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                float f2 = 24;
                ImageKt.Image(PainterResources_androidKt.painterResource(i2, composer, 0), (String) null, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
                TextKt.m2076Text4IGK_g(str + " •••• " + str2, rowScopeInstance2.weight(AlphaKt.alpha(Modifier.INSTANCE, !z ? 0.5f : 1.0f), 1.0f, false), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8728getOnComponent0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 48, 129016);
                composer.startReplaceGroup(852169216);
                if (promoBadgeState != null) {
                    PromoBadgeKt.PromoBadge(promoBadgeState.getPromoText(), null, promoBadgeState.getEligible(), false, composer, 0, 10);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f2));
                composer.startReplaceGroup(-844422544);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$BankAccountDetails$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return USBankAccountFormKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IconButtonKt.IconButton((Function0) objRememberedValue, modifierM1065size3ABfNKs, z, null, ComposableSingletons$USBankAccountFormKt.INSTANCE.m8344getLambda1$paymentsheet_release(), composer, 24624, 8);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final void AccountDetailsRemoveBankDialog(final Function0<Unit> function0, final Function0<Unit> function02, final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(488911789);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488911789, i2, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.AccountDetailsRemoveBankDialog (USBankAccountForm.kt:527)");
            }
            String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_remove_bank_account_title, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_bank_account_ending_in, new Object[]{str}, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_remove, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_cancel, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1353538920);
            int i3 = i2 & 14;
            boolean z = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | (i3 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return USBankAccountFormKt.AccountDetailsRemoveBankDialog$lambda$44$lambda$43(function0, function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function03 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1353541930);
            boolean z2 = i3 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return USBankAccountFormKt.AccountDetailsRemoveBankDialog$lambda$46$lambda$45(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SimpleDialogElementUIKt.SimpleDialogElementUI(strStringResource, strStringResource2, strStringResource3, strStringResource4, true, function03, (Function0) objRememberedValue2, composerStartRestartGroup, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return USBankAccountFormKt.AccountDetailsRemoveBankDialog$lambda$47(function0, function02, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsRemoveBankDialog$lambda$44$lambda$43(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsRemoveBankDialog$lambda$46$lambda$45(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final BankFormScreenState USBankAccountForm$lambda$2(State<BankFormScreenState> state) {
        return state.getValue();
    }

    private static final IdentifierSpec USBankAccountForm$lambda$3(State<IdentifierSpec> state) {
        return state.getValue();
    }

    private static final AddressController USBankAccountForm$lambda$4(State<AddressController> state) {
        return state.getValue();
    }

    private static final FieldError PhoneSection_6fMdlN4$lambda$16(State<FieldError> state) {
        return state.getValue();
    }

    private static final FieldError AddressSection$lambda$21(State<FieldError> state) {
        return state.getValue();
    }
}
