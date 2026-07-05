package com.stripe.android.link.ui.wallet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.link.ui.wallet.AddBankAccountState;
import com.stripe.android.link.ui.wallet.AddPaymentMethodOption;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.CvcCheck;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletUiState.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u000e\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u0004J\u0014\u0010W\u001a\u00020\u00002\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u000fHÆ\u0003J\t\u0010b\u001a\u00020\u000fHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010g\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010i\u001a\u00020\u0019HÆ\u0003J\t\u0010j\u001a\u00020\u0019HÆ\u0003J\t\u0010k\u001a\u00020\u001cHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\u0082\u0002\u0010p\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u000b2\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020uHÖ\u0001J\t\u0010v\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010*R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010*R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0011\u0010\u001f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010*R\u0011\u0010 \u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0013\u0010?\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010F\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010-R\u0011\u0010H\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bI\u0010*R\u0011\u0010J\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bJ\u0010*R\u0011\u0010K\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010S\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bT\u0010*¨\u0006w"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletUiState;", "", "paymentDetailsList", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "email", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "selectedItemId", "isProcessing", "", "isSettingUp", "merchantName", "primaryButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "secondaryButtonLabel", "hasCompleted", "addPaymentMethodOptions", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "collectMissingBillingDetailsForExistingPaymentMethods", "userSetIsExpanded", "cardBeingUpdated", "errorMessage", "expiryDateInput", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "cvcInput", "addBankAccountState", "Lcom/stripe/android/link/ui/wallet/AddBankAccountState;", "alertMessage", "paymentSelectionHint", "isAutoSelecting", "hasAttemptedAutoSelection", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZ)V", "getPaymentDetailsList", "()Ljava/util/List;", "getEmail", "()Ljava/lang/String;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "getSelectedItemId", "()Z", "getMerchantName", "getPrimaryButtonLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getSecondaryButtonLabel", "getHasCompleted", "getAddPaymentMethodOptions", "getCollectMissingBillingDetailsForExistingPaymentMethods", "getUserSetIsExpanded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCardBeingUpdated", "getErrorMessage", "getExpiryDateInput", "()Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getCvcInput", "getAddBankAccountState", "()Lcom/stripe/android/link/ui/wallet/AddBankAccountState;", "getAlertMessage", "getPaymentSelectionHint", "getHasAttemptedAutoSelection", "selectedItem", "getSelectedItem", "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "selectedCard", "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "getSelectedCard", "()Lcom/stripe/android/model/ConsumerPaymentDetails$Card;", "mandate", "getMandate", "shouldShowLoadingState", "getShouldShowLoadingState", "isExpanded", "primaryButtonState", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "getPrimaryButtonState", "()Lcom/stripe/android/link/ui/PrimaryButtonState;", "addBankAccountOption", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;", "getAddBankAccountOption", "()Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;", "canAddNewPaymentMethod", "getCanAddNewPaymentMethod", "isItemAvailable", "item", "updateWithResponse", "response", "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ZLjava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/wallet/AddBankAccountState;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZZ)Lcom/stripe/android/link/ui/wallet/WalletUiState;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletUiState {
    public static final int $stable = 0;
    private final AddBankAccountState addBankAccountState;
    private final List<AddPaymentMethodOption> addPaymentMethodOptions;
    private final ResolvableString alertMessage;
    private final String cardBeingUpdated;
    private final CardBrandFilter cardBrandFilter;
    private final boolean collectMissingBillingDetailsForExistingPaymentMethods;
    private final FormFieldEntry cvcInput;
    private final String email;
    private final ResolvableString errorMessage;
    private final FormFieldEntry expiryDateInput;
    private final boolean hasAttemptedAutoSelection;
    private final boolean hasCompleted;
    private final boolean isAutoSelecting;
    private final boolean isProcessing;
    private final boolean isSettingUp;
    private final String merchantName;
    private final List<ConsumerPaymentDetails.PaymentDetails> paymentDetailsList;
    private final String paymentSelectionHint;
    private final ResolvableString primaryButtonLabel;
    private final ResolvableString secondaryButtonLabel;
    private final String selectedItemId;
    private final Boolean userSetIsExpanded;

    public static /* synthetic */ WalletUiState copy$default(WalletUiState walletUiState, List list, String str, CardBrandFilter cardBrandFilter, String str2, boolean z, boolean z2, String str3, ResolvableString resolvableString, ResolvableString resolvableString2, boolean z3, List list2, boolean z4, Boolean bool, String str4, ResolvableString resolvableString3, FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, AddBankAccountState addBankAccountState, ResolvableString resolvableString4, String str5, boolean z5, boolean z6, int i, Object obj) {
        boolean z7;
        boolean z8;
        List list3 = (i & 1) != 0 ? walletUiState.paymentDetailsList : list;
        String str6 = (i & 2) != 0 ? walletUiState.email : str;
        CardBrandFilter cardBrandFilter2 = (i & 4) != 0 ? walletUiState.cardBrandFilter : cardBrandFilter;
        String str7 = (i & 8) != 0 ? walletUiState.selectedItemId : str2;
        boolean z9 = (i & 16) != 0 ? walletUiState.isProcessing : z;
        boolean z10 = (i & 32) != 0 ? walletUiState.isSettingUp : z2;
        String str8 = (i & 64) != 0 ? walletUiState.merchantName : str3;
        ResolvableString resolvableString5 = (i & 128) != 0 ? walletUiState.primaryButtonLabel : resolvableString;
        ResolvableString resolvableString6 = (i & 256) != 0 ? walletUiState.secondaryButtonLabel : resolvableString2;
        boolean z11 = (i & 512) != 0 ? walletUiState.hasCompleted : z3;
        List list4 = (i & 1024) != 0 ? walletUiState.addPaymentMethodOptions : list2;
        boolean z12 = (i & 2048) != 0 ? walletUiState.collectMissingBillingDetailsForExistingPaymentMethods : z4;
        Boolean bool2 = (i & 4096) != 0 ? walletUiState.userSetIsExpanded : bool;
        String str9 = (i & 8192) != 0 ? walletUiState.cardBeingUpdated : str4;
        List list5 = list3;
        ResolvableString resolvableString7 = (i & 16384) != 0 ? walletUiState.errorMessage : resolvableString3;
        FormFieldEntry formFieldEntry3 = (i & 32768) != 0 ? walletUiState.expiryDateInput : formFieldEntry;
        FormFieldEntry formFieldEntry4 = (i & 65536) != 0 ? walletUiState.cvcInput : formFieldEntry2;
        AddBankAccountState addBankAccountState2 = (i & 131072) != 0 ? walletUiState.addBankAccountState : addBankAccountState;
        ResolvableString resolvableString8 = (i & 262144) != 0 ? walletUiState.alertMessage : resolvableString4;
        String str10 = (i & 524288) != 0 ? walletUiState.paymentSelectionHint : str5;
        boolean z13 = (i & 1048576) != 0 ? walletUiState.isAutoSelecting : z5;
        if ((i & 2097152) != 0) {
            z8 = z13;
            z7 = walletUiState.hasAttemptedAutoSelection;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return walletUiState.copy(list5, str6, cardBrandFilter2, str7, z9, z10, str8, resolvableString5, resolvableString6, z11, list4, z12, bool2, str9, resolvableString7, formFieldEntry3, formFieldEntry4, addBankAccountState2, resolvableString8, str10, z8, z7);
    }

    public final List<ConsumerPaymentDetails.PaymentDetails> component1() {
        return this.paymentDetailsList;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final List<AddPaymentMethodOption> component11() {
        return this.addPaymentMethodOptions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCollectMissingBillingDetailsForExistingPaymentMethods() {
        return this.collectMissingBillingDetailsForExistingPaymentMethods;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getUserSetIsExpanded() {
        return this.userSetIsExpanded;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCardBeingUpdated() {
        return this.cardBeingUpdated;
    }

    /* renamed from: component15, reason: from getter */
    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component16, reason: from getter */
    public final FormFieldEntry getExpiryDateInput() {
        return this.expiryDateInput;
    }

    /* renamed from: component17, reason: from getter */
    public final FormFieldEntry getCvcInput() {
        return this.cvcInput;
    }

    /* renamed from: component18, reason: from getter */
    public final AddBankAccountState getAddBankAccountState() {
        return this.addBankAccountState;
    }

    /* renamed from: component19, reason: from getter */
    public final ResolvableString getAlertMessage() {
        return this.alertMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component20, reason: from getter */
    public final String getPaymentSelectionHint() {
        return this.paymentSelectionHint;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsAutoSelecting() {
        return this.isAutoSelecting;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getHasAttemptedAutoSelection() {
        return this.hasAttemptedAutoSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSelectedItemId() {
        return this.selectedItemId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsProcessing() {
        return this.isProcessing;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSettingUp() {
        return this.isSettingUp;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component8, reason: from getter */
    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    /* renamed from: component9, reason: from getter */
    public final ResolvableString getSecondaryButtonLabel() {
        return this.secondaryButtonLabel;
    }

    public final WalletUiState copy(List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetailsList, String email, CardBrandFilter cardBrandFilter, String selectedItemId, boolean isProcessing, boolean isSettingUp, String merchantName, ResolvableString primaryButtonLabel, ResolvableString secondaryButtonLabel, boolean hasCompleted, List<? extends AddPaymentMethodOption> addPaymentMethodOptions, boolean collectMissingBillingDetailsForExistingPaymentMethods, Boolean userSetIsExpanded, String cardBeingUpdated, ResolvableString errorMessage, FormFieldEntry expiryDateInput, FormFieldEntry cvcInput, AddBankAccountState addBankAccountState, ResolvableString alertMessage, String paymentSelectionHint, boolean isAutoSelecting, boolean hasAttemptedAutoSelection) {
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        Intrinsics.checkNotNullParameter(secondaryButtonLabel, "secondaryButtonLabel");
        Intrinsics.checkNotNullParameter(addPaymentMethodOptions, "addPaymentMethodOptions");
        Intrinsics.checkNotNullParameter(expiryDateInput, "expiryDateInput");
        Intrinsics.checkNotNullParameter(cvcInput, "cvcInput");
        Intrinsics.checkNotNullParameter(addBankAccountState, "addBankAccountState");
        return new WalletUiState(paymentDetailsList, email, cardBrandFilter, selectedItemId, isProcessing, isSettingUp, merchantName, primaryButtonLabel, secondaryButtonLabel, hasCompleted, addPaymentMethodOptions, collectMissingBillingDetailsForExistingPaymentMethods, userSetIsExpanded, cardBeingUpdated, errorMessage, expiryDateInput, cvcInput, addBankAccountState, alertMessage, paymentSelectionHint, isAutoSelecting, hasAttemptedAutoSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletUiState)) {
            return false;
        }
        WalletUiState walletUiState = (WalletUiState) other;
        return Intrinsics.areEqual(this.paymentDetailsList, walletUiState.paymentDetailsList) && Intrinsics.areEqual(this.email, walletUiState.email) && Intrinsics.areEqual(this.cardBrandFilter, walletUiState.cardBrandFilter) && Intrinsics.areEqual(this.selectedItemId, walletUiState.selectedItemId) && this.isProcessing == walletUiState.isProcessing && this.isSettingUp == walletUiState.isSettingUp && Intrinsics.areEqual(this.merchantName, walletUiState.merchantName) && Intrinsics.areEqual(this.primaryButtonLabel, walletUiState.primaryButtonLabel) && Intrinsics.areEqual(this.secondaryButtonLabel, walletUiState.secondaryButtonLabel) && this.hasCompleted == walletUiState.hasCompleted && Intrinsics.areEqual(this.addPaymentMethodOptions, walletUiState.addPaymentMethodOptions) && this.collectMissingBillingDetailsForExistingPaymentMethods == walletUiState.collectMissingBillingDetailsForExistingPaymentMethods && Intrinsics.areEqual(this.userSetIsExpanded, walletUiState.userSetIsExpanded) && Intrinsics.areEqual(this.cardBeingUpdated, walletUiState.cardBeingUpdated) && Intrinsics.areEqual(this.errorMessage, walletUiState.errorMessage) && Intrinsics.areEqual(this.expiryDateInput, walletUiState.expiryDateInput) && Intrinsics.areEqual(this.cvcInput, walletUiState.cvcInput) && Intrinsics.areEqual(this.addBankAccountState, walletUiState.addBankAccountState) && Intrinsics.areEqual(this.alertMessage, walletUiState.alertMessage) && Intrinsics.areEqual(this.paymentSelectionHint, walletUiState.paymentSelectionHint) && this.isAutoSelecting == walletUiState.isAutoSelecting && this.hasAttemptedAutoSelection == walletUiState.hasAttemptedAutoSelection;
    }

    public int hashCode() {
        int iHashCode = ((((this.paymentDetailsList.hashCode() * 31) + this.email.hashCode()) * 31) + this.cardBrandFilter.hashCode()) * 31;
        String str = this.selectedItemId;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isProcessing)) * 31) + Boolean.hashCode(this.isSettingUp)) * 31) + this.merchantName.hashCode()) * 31) + this.primaryButtonLabel.hashCode()) * 31) + this.secondaryButtonLabel.hashCode()) * 31) + Boolean.hashCode(this.hasCompleted)) * 31) + this.addPaymentMethodOptions.hashCode()) * 31) + Boolean.hashCode(this.collectMissingBillingDetailsForExistingPaymentMethods)) * 31;
        Boolean bool = this.userSetIsExpanded;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.cardBeingUpdated;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResolvableString resolvableString = this.errorMessage;
        int iHashCode5 = (((((((iHashCode4 + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + this.expiryDateInput.hashCode()) * 31) + this.cvcInput.hashCode()) * 31) + this.addBankAccountState.hashCode()) * 31;
        ResolvableString resolvableString2 = this.alertMessage;
        int iHashCode6 = (iHashCode5 + (resolvableString2 == null ? 0 : resolvableString2.hashCode())) * 31;
        String str3 = this.paymentSelectionHint;
        return ((((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAutoSelecting)) * 31) + Boolean.hashCode(this.hasAttemptedAutoSelection);
    }

    public String toString() {
        return "WalletUiState(paymentDetailsList=" + this.paymentDetailsList + ", email=" + this.email + ", cardBrandFilter=" + this.cardBrandFilter + ", selectedItemId=" + this.selectedItemId + ", isProcessing=" + this.isProcessing + ", isSettingUp=" + this.isSettingUp + ", merchantName=" + this.merchantName + ", primaryButtonLabel=" + this.primaryButtonLabel + ", secondaryButtonLabel=" + this.secondaryButtonLabel + ", hasCompleted=" + this.hasCompleted + ", addPaymentMethodOptions=" + this.addPaymentMethodOptions + ", collectMissingBillingDetailsForExistingPaymentMethods=" + this.collectMissingBillingDetailsForExistingPaymentMethods + ", userSetIsExpanded=" + this.userSetIsExpanded + ", cardBeingUpdated=" + this.cardBeingUpdated + ", errorMessage=" + this.errorMessage + ", expiryDateInput=" + this.expiryDateInput + ", cvcInput=" + this.cvcInput + ", addBankAccountState=" + this.addBankAccountState + ", alertMessage=" + this.alertMessage + ", paymentSelectionHint=" + this.paymentSelectionHint + ", isAutoSelecting=" + this.isAutoSelecting + ", hasAttemptedAutoSelection=" + this.hasAttemptedAutoSelection + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletUiState(List<? extends ConsumerPaymentDetails.PaymentDetails> paymentDetailsList, String email, CardBrandFilter cardBrandFilter, String str, boolean z, boolean z2, String merchantName, ResolvableString primaryButtonLabel, ResolvableString secondaryButtonLabel, boolean z3, List<? extends AddPaymentMethodOption> addPaymentMethodOptions, boolean z4, Boolean bool, String str2, ResolvableString resolvableString, FormFieldEntry expiryDateInput, FormFieldEntry cvcInput, AddBankAccountState addBankAccountState, ResolvableString resolvableString2, String str3, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(paymentDetailsList, "paymentDetailsList");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        Intrinsics.checkNotNullParameter(secondaryButtonLabel, "secondaryButtonLabel");
        Intrinsics.checkNotNullParameter(addPaymentMethodOptions, "addPaymentMethodOptions");
        Intrinsics.checkNotNullParameter(expiryDateInput, "expiryDateInput");
        Intrinsics.checkNotNullParameter(cvcInput, "cvcInput");
        Intrinsics.checkNotNullParameter(addBankAccountState, "addBankAccountState");
        this.paymentDetailsList = paymentDetailsList;
        this.email = email;
        this.cardBrandFilter = cardBrandFilter;
        this.selectedItemId = str;
        this.isProcessing = z;
        this.isSettingUp = z2;
        this.merchantName = merchantName;
        this.primaryButtonLabel = primaryButtonLabel;
        this.secondaryButtonLabel = secondaryButtonLabel;
        this.hasCompleted = z3;
        this.addPaymentMethodOptions = addPaymentMethodOptions;
        this.collectMissingBillingDetailsForExistingPaymentMethods = z4;
        this.userSetIsExpanded = bool;
        this.cardBeingUpdated = str2;
        this.errorMessage = resolvableString;
        this.expiryDateInput = expiryDateInput;
        this.cvcInput = cvcInput;
        this.addBankAccountState = addBankAccountState;
        this.alertMessage = resolvableString2;
        this.paymentSelectionHint = str3;
        this.isAutoSelecting = z5;
        this.hasAttemptedAutoSelection = z6;
    }

    public final List<ConsumerPaymentDetails.PaymentDetails> getPaymentDetailsList() {
        return this.paymentDetailsList;
    }

    public final String getEmail() {
        return this.email;
    }

    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    public final String getSelectedItemId() {
        return this.selectedItemId;
    }

    public final boolean isProcessing() {
        return this.isProcessing;
    }

    public final boolean isSettingUp() {
        return this.isSettingUp;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    public final ResolvableString getSecondaryButtonLabel() {
        return this.secondaryButtonLabel;
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final List<AddPaymentMethodOption> getAddPaymentMethodOptions() {
        return this.addPaymentMethodOptions;
    }

    public final boolean getCollectMissingBillingDetailsForExistingPaymentMethods() {
        return this.collectMissingBillingDetailsForExistingPaymentMethods;
    }

    public final Boolean getUserSetIsExpanded() {
        return this.userSetIsExpanded;
    }

    public final String getCardBeingUpdated() {
        return this.cardBeingUpdated;
    }

    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WalletUiState(java.util.List r27, java.lang.String r28, com.stripe.android.CardBrandFilter r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, com.stripe.android.core.strings.ResolvableString r34, com.stripe.android.core.strings.ResolvableString r35, boolean r36, java.util.List r37, boolean r38, java.lang.Boolean r39, java.lang.String r40, com.stripe.android.core.strings.ResolvableString r41, com.stripe.android.uicore.forms.FormFieldEntry r42, com.stripe.android.uicore.forms.FormFieldEntry r43, com.stripe.android.link.ui.wallet.AddBankAccountState r44, com.stripe.android.core.strings.ResolvableString r45, java.lang.String r46, boolean r47, boolean r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto La
            r16 = r2
            goto Lc
        La:
            r16 = r39
        Lc:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L13
            r17 = r2
            goto L15
        L13:
            r17 = r40
        L15:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L1c
            r18 = r2
            goto L1e
        L1c:
            r18 = r41
        L1e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2e
            com.stripe.android.uicore.forms.FormFieldEntry r1 = new com.stripe.android.uicore.forms.FormFieldEntry
            r1.<init>(r2, r4, r3, r2)
            r19 = r1
            goto L30
        L2e:
            r19 = r42
        L30:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L3d
            com.stripe.android.uicore.forms.FormFieldEntry r1 = new com.stripe.android.uicore.forms.FormFieldEntry
            r1.<init>(r2, r4, r3, r2)
            r20 = r1
            goto L3f
        L3d:
            r20 = r43
        L3f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L4b
            com.stripe.android.link.ui.wallet.AddBankAccountState$Idle r1 = com.stripe.android.link.ui.wallet.AddBankAccountState.Idle.INSTANCE
            com.stripe.android.link.ui.wallet.AddBankAccountState r1 = (com.stripe.android.link.ui.wallet.AddBankAccountState) r1
            r21 = r1
            goto L4d
        L4b:
            r21 = r44
        L4d:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L55
            r22 = r2
            goto L57
        L55:
            r22 = r45
        L57:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L5f
            r23 = r2
            goto L61
        L5f:
            r23 = r46
        L61:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L69
            r24 = r4
            goto L6b
        L69:
            r24 = r47
        L6b:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L8d
            r25 = r4
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r4 = r27
            goto La9
        L8d:
            r25 = r48
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
        La9:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.wallet.WalletUiState.<init>(java.util.List, java.lang.String, com.stripe.android.CardBrandFilter, java.lang.String, boolean, boolean, java.lang.String, com.stripe.android.core.strings.ResolvableString, com.stripe.android.core.strings.ResolvableString, boolean, java.util.List, boolean, java.lang.Boolean, java.lang.String, com.stripe.android.core.strings.ResolvableString, com.stripe.android.uicore.forms.FormFieldEntry, com.stripe.android.uicore.forms.FormFieldEntry, com.stripe.android.link.ui.wallet.AddBankAccountState, com.stripe.android.core.strings.ResolvableString, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final FormFieldEntry getExpiryDateInput() {
        return this.expiryDateInput;
    }

    public final FormFieldEntry getCvcInput() {
        return this.cvcInput;
    }

    public final AddBankAccountState getAddBankAccountState() {
        return this.addBankAccountState;
    }

    public final ResolvableString getAlertMessage() {
        return this.alertMessage;
    }

    public final String getPaymentSelectionHint() {
        return this.paymentSelectionHint;
    }

    public final boolean isAutoSelecting() {
        return this.isAutoSelecting;
    }

    public final boolean getHasAttemptedAutoSelection() {
        return this.hasAttemptedAutoSelection;
    }

    public final ConsumerPaymentDetails.PaymentDetails getSelectedItem() {
        Object next;
        if (this.selectedItemId == null) {
            return (ConsumerPaymentDetails.PaymentDetails) CollectionsKt.firstOrNull((List) this.paymentDetailsList);
        }
        Iterator<T> it = this.paymentDetailsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ConsumerPaymentDetails.PaymentDetails) next).getId(), this.selectedItemId)) {
                break;
            }
        }
        return (ConsumerPaymentDetails.PaymentDetails) next;
    }

    public final ConsumerPaymentDetails.Card getSelectedCard() {
        ConsumerPaymentDetails.PaymentDetails selectedItem = getSelectedItem();
        if (selectedItem instanceof ConsumerPaymentDetails.Card) {
            return (ConsumerPaymentDetails.Card) selectedItem;
        }
        return null;
    }

    public final ResolvableString getMandate() {
        ConsumerPaymentDetails.PaymentDetails selectedItem = getSelectedItem();
        if (selectedItem != null) {
            return WalletUiStateKt.makeMandateText(selectedItem, this.isSettingUp, this.merchantName);
        }
        return null;
    }

    public final boolean getShouldShowLoadingState() {
        return this.paymentDetailsList.isEmpty() || this.isAutoSelecting;
    }

    public final boolean isExpanded() {
        Boolean bool = this.userSetIsExpanded;
        if (bool != null) {
            return bool.booleanValue();
        }
        ConsumerPaymentDetails.PaymentDetails selectedItem = getSelectedItem();
        return selectedItem == null || !isItemAvailable(selectedItem);
    }

    public final PrimaryButtonState getPrimaryButtonState() {
        ConsumerPaymentDetails.PaymentDetails selectedItem;
        CvcCheck cvcCheck;
        ConsumerPaymentDetails.PaymentDetails selectedItem2 = getSelectedItem();
        ConsumerPaymentDetails.Card card = selectedItem2 instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) selectedItem2 : null;
        boolean z = true;
        boolean z2 = card != null && card.isExpired();
        boolean requiresRecollection = (card == null || (cvcCheck = card.getCvcCheck()) == null) ? false : cvcCheck.getRequiresRecollection();
        boolean z3 = (this.expiryDateInput.isComplete() && this.cvcInput.isComplete()) ? false : true;
        boolean zIsComplete = this.cvcInput.isComplete();
        if ((!z2 || !z3) && ((!requiresRecollection || zIsComplete) && this.cardBeingUpdated == null && (selectedItem = getSelectedItem()) != null && isItemAvailable(selectedItem) && !(this.addBankAccountState instanceof AddBankAccountState.Processing))) {
            z = false;
        }
        if (this.hasCompleted) {
            return PrimaryButtonState.Completed;
        }
        if (this.isProcessing) {
            return PrimaryButtonState.Processing;
        }
        if (z) {
            return PrimaryButtonState.Disabled;
        }
        return PrimaryButtonState.Enabled;
    }

    public final AddPaymentMethodOption.Bank getAddBankAccountOption() {
        AddPaymentMethodOption.Bank bank;
        Iterator<T> it = this.addPaymentMethodOptions.iterator();
        do {
            bank = null;
            if (!it.hasNext()) {
                break;
            }
            AddPaymentMethodOption addPaymentMethodOption = (AddPaymentMethodOption) it.next();
            if (addPaymentMethodOption instanceof AddPaymentMethodOption.Bank) {
                bank = (AddPaymentMethodOption.Bank) addPaymentMethodOption;
            }
        } while (bank == null);
        return bank;
    }

    public final boolean getCanAddNewPaymentMethod() {
        return !this.addPaymentMethodOptions.isEmpty();
    }

    public final boolean isItemAvailable(ConsumerPaymentDetails.PaymentDetails item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return !(item instanceof ConsumerPaymentDetails.Card) || this.cardBrandFilter.isAccepted(((ConsumerPaymentDetails.Card) item).getBrand());
    }

    public final WalletUiState updateWithResponse(List<LinkPaymentMethod.ConsumerPaymentDetails> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<LinkPaymentMethod.ConsumerPaymentDetails> list = response;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LinkPaymentMethod.ConsumerPaymentDetails) it.next()).getDetails());
        }
        return copy$default(this, arrayList, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, null, null, false, false, 4186094, null);
    }
}
