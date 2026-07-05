package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: UpdatePaymentMethodInteractor.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 v2\u00020\u0001:\u0002uvB»\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00127\u0010\u000e\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002`\u0017\u0012P\u0010\u0018\u001aL\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019j\u0002`\u001d\u0012;\u0010\u001e\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002` \u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\"\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%\u0012\b\b\u0002\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0010\u0010X\u001a\u00020S2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020S2\u0006\u0010Y\u001a\u00020\\H\u0002J\u0012\u0010]\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020\u001fH\u0002J\b\u0010g\u001a\u00020\u001fH\u0002J\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001cH\u0082@¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH\u0082@¢\u0006\u0004\bl\u0010jJ(\u0010m\u001a\u00020n2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH\u0002J\u0010\u0010q\u001a\u00020\u001f2\u0006\u0010r\u001a\u00020\u0003H\u0002J\b\u0010s\u001a\u00020\u0003H\u0002J\n\u0010t\u001a\u0004\u0018\u00010<H\u0002J\b\u0010A\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010+R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+RA\u0010\u000e\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002`\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u00104RZ\u0010\u0018\u001aL\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019j\u0002`\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u00105RE\u0010\u001e\u001a7\b\u0001\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002` X\u0082\u0004¢\u0006\u0004\n\u0002\u00104R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0014\u0010C\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0016\u0010D\u001a\u0004\u0018\u00010<X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010+R\u0014\u0010H\u001a\u00020IX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010+R\u0014\u0010N\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010+R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00030QX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020_0QX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020_0QX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010b¨\u0006w"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;", NamedConstantsKt.IS_LIVE_MODE, "", "canRemove", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "addressCollectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "canUpdateFullPaymentMethodDetails", "isDefaultPaymentMethod", "shouldShowSetAsDefaultCheckbox", "removeExecutor", "Lkotlin/Function2;", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlin/ParameterName;", "name", "paymentMethod", "Lkotlin/coroutines/Continuation;", "", "", "Lcom/stripe/android/paymentsheet/ui/PaymentMethodRemoveOperation;", "updatePaymentMethodExecutor", "Lkotlin/Function3;", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "cardUpdateParams", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/ui/UpdateCardPaymentMethodOperation;", "setDefaultPaymentMethodExecutor", "", "Lcom/stripe/android/paymentsheet/ui/PaymentMethodSetAsDefaultOperation;", "onBrandChoiceSelected", "Lkotlin/Function1;", "Lcom/stripe/android/model/CardBrand;", "onUpdateSuccess", "Lkotlin/Function0;", "editCardDetailsInteractorFactory", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;", "<init>", "(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;)V", "getCanRemove", "()Z", "getDisplayableSavedPaymentMethod", "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "getAddressCollectionMode", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "getCanUpdateFullPaymentMethodDetails", "getShouldShowSetAsDefaultCheckbox", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function3;", "getEditCardDetailsInteractorFactory", "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "status", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;", "initialSetAsDefaultCheckedValue", "setAsDefaultCheckboxChecked", "hasValidBrandChoices", "getHasValidBrandChoices", "isExpiredCard", "screenTitle", "getScreenTitle", "()Lcom/stripe/android/core/strings/ResolvableString;", "isModifiablePaymentMethod", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "getTopBarState", "()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "setAsDefaultCheckboxEnabled", "getSetAsDefaultCheckboxEnabled", "shouldShowSaveButton", "getShouldShowSaveButton", "_setAsDefaultValueChanged", "Lkotlinx/coroutines/flow/StateFlow;", "editCardDetailsInteractor", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "getEditCardDetailsInteractor", "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "editCardDetailsInteractor$delegate", "Lkotlin/Lazy;", "createEditCardDetailsInteractorForCard", "savedPaymentMethodCard", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;", "createEditCardDetailsInteractorForLink", "Lcom/stripe/android/model/LinkPaymentDetails$Card;", "onCardUpdateParamsChanged", "_state", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;", ServerProtocol.DIALOG_PARAM_STATE, "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;", "removePaymentMethod", "savePaymentMethod", "maybeUpdateCard", "maybeUpdateCard-CmtIpJM", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeSetDefaultPaymentMethod", "maybeSetDefaultPaymentMethod-CmtIpJM", "getUpdateResult", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;", "updateCardBrandResult", "setDefaultPaymentMethodResult", "onSetAsDefaultCheckboxChanged", "isChecked", "paymentMethodIsExpiredCard", "getInitialError", "UpdateResult", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultUpdatePaymentMethodInteractor implements UpdatePaymentMethodInteractor {
    private final StateFlow<Boolean> _setAsDefaultValueChanged;
    private final StateFlow<UpdatePaymentMethodInteractor.State> _state;
    private final PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode;
    private final boolean canRemove;
    private final boolean canUpdateFullPaymentMethodDetails;
    private final CardBrandFilter cardBrandFilter;
    private final MutableStateFlow<CardUpdateParams> cardUpdateParams;
    private final CoroutineScope coroutineScope;
    private final DisplayableSavedPaymentMethod displayableSavedPaymentMethod;

    /* renamed from: editCardDetailsInteractor$delegate, reason: from kotlin metadata */
    private final Lazy editCardDetailsInteractor;
    private final EditCardDetailsInteractor.Factory editCardDetailsInteractorFactory;
    private final MutableStateFlow<ResolvableString> error;
    private final boolean hasValidBrandChoices;
    private final boolean initialSetAsDefaultCheckedValue;
    private final boolean isDefaultPaymentMethod;
    private final boolean isExpiredCard;
    private final Function1<CardBrand, Unit> onBrandChoiceSelected;
    private final Function0<Unit> onUpdateSuccess;
    private final Function2<PaymentMethod, Continuation<? super Throwable>, Object> removeExecutor;
    private final ResolvableString screenTitle;
    private final MutableStateFlow<Boolean> setAsDefaultCheckboxChecked;
    private final boolean setAsDefaultCheckboxEnabled;
    private final Function2<PaymentMethod, Continuation<? super Result<Unit>>, Object> setDefaultPaymentMethodExecutor;
    private final boolean shouldShowSaveButton;
    private final boolean shouldShowSetAsDefaultCheckbox;
    private final StateFlow<UpdatePaymentMethodInteractor.State> state;
    private final MutableStateFlow<UpdatePaymentMethodInteractor.Status> status;
    private final PaymentSheetTopBarState topBarState;
    private final Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<PaymentMethod>>, Object> updatePaymentMethodExecutor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ResolvableString setDefaultPaymentMethodErrorMessage = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_set_default_payment_method_failed_error_message);
    private static final ResolvableString updateCardBrandErrorMessage = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_set_default_payment_method_failed_error_message);
    private static final ResolvableString updatesFailedErrorMessage = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_card_updates_failed_error_message);

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultUpdatePaymentMethodInteractor(boolean z, boolean z2, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, CardBrandFilter cardBrandFilter, PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode, boolean z3, boolean z4, boolean z5, Function2<? super PaymentMethod, ? super Continuation<? super Throwable>, ? extends Object> removeExecutor, Function3<? super PaymentMethod, ? super CardUpdateParams, ? super Continuation<? super Result<PaymentMethod>>, ? extends Object> updatePaymentMethodExecutor, Function2<? super PaymentMethod, ? super Continuation<? super Result<Unit>>, ? extends Object> setDefaultPaymentMethodExecutor, Function1<? super CardBrand, Unit> onBrandChoiceSelected, Function0<Unit> onUpdateSuccess, EditCardDetailsInteractor.Factory editCardDetailsInteractorFactory) {
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(addressCollectionMode, "addressCollectionMode");
        Intrinsics.checkNotNullParameter(removeExecutor, "removeExecutor");
        Intrinsics.checkNotNullParameter(updatePaymentMethodExecutor, "updatePaymentMethodExecutor");
        Intrinsics.checkNotNullParameter(setDefaultPaymentMethodExecutor, "setDefaultPaymentMethodExecutor");
        Intrinsics.checkNotNullParameter(onBrandChoiceSelected, "onBrandChoiceSelected");
        Intrinsics.checkNotNullParameter(onUpdateSuccess, "onUpdateSuccess");
        Intrinsics.checkNotNullParameter(editCardDetailsInteractorFactory, "editCardDetailsInteractorFactory");
        this.canRemove = z2;
        this.displayableSavedPaymentMethod = displayableSavedPaymentMethod;
        this.cardBrandFilter = cardBrandFilter;
        this.addressCollectionMode = addressCollectionMode;
        this.canUpdateFullPaymentMethodDetails = z3;
        this.isDefaultPaymentMethod = z4;
        this.shouldShowSetAsDefaultCheckbox = z5;
        this.removeExecutor = removeExecutor;
        this.updatePaymentMethodExecutor = updatePaymentMethodExecutor;
        this.setDefaultPaymentMethodExecutor = setDefaultPaymentMethodExecutor;
        this.onBrandChoiceSelected = onBrandChoiceSelected;
        this.onUpdateSuccess = onUpdateSuccess;
        this.editCardDetailsInteractorFactory = editCardDetailsInteractorFactory;
        boolean z6 = true;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        MutableStateFlow<ResolvableString> MutableStateFlow = StateFlowKt.MutableStateFlow(getInitialError());
        this.error = MutableStateFlow;
        MutableStateFlow<UpdatePaymentMethodInteractor.Status> MutableStateFlow2 = StateFlowKt.MutableStateFlow(UpdatePaymentMethodInteractor.Status.Idle);
        this.status = MutableStateFlow2;
        this.initialSetAsDefaultCheckedValue = z4;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.valueOf(z4));
        this.setAsDefaultCheckboxChecked = MutableStateFlow3;
        MutableStateFlow<CardUpdateParams> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.cardUpdateParams = MutableStateFlow4;
        this.hasValidBrandChoices = hasValidBrandChoices();
        this.isExpiredCard = paymentMethodIsExpiredCard();
        this.screenTitle = UpdatePaymentMethodInteractor.INSTANCE.screenTitle(getDisplayableSavedPaymentMethod());
        this.topBarState = PaymentSheetTopBarStateFactory.INSTANCE.create(z, PaymentSheetTopBarState.Editable.Never.INSTANCE);
        this.setAsDefaultCheckboxEnabled = !z4;
        if (!isModifiablePaymentMethod() && (!getShouldShowSetAsDefaultCheckbox() || z4)) {
            z6 = false;
        }
        this.shouldShowSaveButton = z6;
        StateFlow<Boolean> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(MutableStateFlow3, new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultUpdatePaymentMethodInteractor._setAsDefaultValueChanged$lambda$0(this.f$0, ((Boolean) obj).booleanValue()));
            }
        });
        this._setAsDefaultValueChanged = stateFlowMapAsStateFlow;
        this.editCardDetailsInteractor = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultUpdatePaymentMethodInteractor.editCardDetailsInteractor_delegate$lambda$1(this.f$0);
            }
        });
        StateFlow<UpdatePaymentMethodInteractor.State> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(MutableStateFlow, MutableStateFlow2, MutableStateFlow3, stateFlowMapAsStateFlow, MutableStateFlow4, new Function5() { // from class: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return DefaultUpdatePaymentMethodInteractor._state$lambda$4(this.f$0, (ResolvableString) obj, (UpdatePaymentMethodInteractor.Status) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (CardUpdateParams) obj5);
            }
        });
        this._state = stateFlowCombineAsStateFlow;
        this.state = stateFlowCombineAsStateFlow;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getCanRemove() {
        return this.canRemove;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public DisplayableSavedPaymentMethod getDisplayableSavedPaymentMethod() {
        return this.displayableSavedPaymentMethod;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode getAddressCollectionMode() {
        return this.addressCollectionMode;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getCanUpdateFullPaymentMethodDetails() {
        return this.canUpdateFullPaymentMethodDetails;
    }

    /* renamed from: isDefaultPaymentMethod, reason: from getter */
    public final boolean getIsDefaultPaymentMethod() {
        return this.isDefaultPaymentMethod;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getShouldShowSetAsDefaultCheckbox() {
        return this.shouldShowSetAsDefaultCheckbox;
    }

    public final EditCardDetailsInteractor.Factory getEditCardDetailsInteractorFactory() {
        return this.editCardDetailsInteractorFactory;
    }

    public /* synthetic */ DefaultUpdatePaymentMethodInteractor(boolean z, boolean z2, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, CardBrandFilter cardBrandFilter, PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode, boolean z3, boolean z4, boolean z5, Function2 function2, Function3 function3, Function2 function22, Function1 function1, Function0 function0, EditCardDetailsInteractor.Factory factory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, displayableSavedPaymentMethod, cardBrandFilter, addressCollectionMode, z3, z4, z5, function2, function3, function22, function1, function0, (i & 8192) != 0 ? new DefaultEditCardDetailsInteractor.Factory() : factory);
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getHasValidBrandChoices() {
        return this.hasValidBrandChoices;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    /* renamed from: isExpiredCard, reason: from getter */
    public boolean getIsExpiredCard() {
        return this.isExpiredCard;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public ResolvableString getScreenTitle() {
        return this.screenTitle;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean isModifiablePaymentMethod() {
        return getDisplayableSavedPaymentMethod().isModifiable(getCanUpdateFullPaymentMethodDetails());
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public PaymentSheetTopBarState getTopBarState() {
        return this.topBarState;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getSetAsDefaultCheckboxEnabled() {
        return this.setAsDefaultCheckboxEnabled;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public boolean getShouldShowSaveButton() {
        return this.shouldShowSaveButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _setAsDefaultValueChanged$lambda$0(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor, boolean z) {
        return z != defaultUpdatePaymentMethodInteractor.initialSetAsDefaultCheckedValue;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public EditCardDetailsInteractor getEditCardDetailsInteractor() {
        return (EditCardDetailsInteractor) this.editCardDetailsInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCardDetailsInteractor editCardDetailsInteractor_delegate$lambda$1(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor) {
        SavedPaymentMethod savedPaymentMethod = defaultUpdatePaymentMethodInteractor.getDisplayableSavedPaymentMethod().getSavedPaymentMethod();
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            return defaultUpdatePaymentMethodInteractor.createEditCardDetailsInteractorForCard((SavedPaymentMethod.Card) savedPaymentMethod);
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
            LinkPaymentDetails paymentDetails = ((SavedPaymentMethod.Link) savedPaymentMethod).getPaymentDetails();
            LinkPaymentDetails.Card card = paymentDetails instanceof LinkPaymentDetails.Card ? (LinkPaymentDetails.Card) paymentDetails : null;
            if (card == null) {
                throw new IllegalArgumentException("Link payment method is not a card");
            }
            return defaultUpdatePaymentMethodInteractor.createEditCardDetailsInteractorForLink(card);
        }
        throw new IllegalArgumentException("Card or Link payment method required for creating EditCardDetailsInteractor");
    }

    private final EditCardDetailsInteractor createEditCardDetailsInteractorForCard(SavedPaymentMethod.Card savedPaymentMethodCard) {
        boolean zIsModifiable = getDisplayableSavedPaymentMethod().isModifiable(getCanUpdateFullPaymentMethodDetails());
        EditCardPayload editCardPayloadCreate = EditCardPayload.INSTANCE.create(savedPaymentMethodCard.getCard(), savedPaymentMethodCard.getBillingDetails());
        CardEditConfiguration cardEditConfiguration = new CardEditConfiguration(getCardBrandFilter(), zIsModifiable && getDisplayableSavedPaymentMethod().canChangeCbc(), zIsModifiable && getCanUpdateFullPaymentMethodDetails());
        EditCardDetailsInteractor.Factory factory = this.editCardDetailsInteractorFactory;
        CoroutineScope coroutineScope = this.coroutineScope;
        Function1<CardBrand, Unit> function1 = this.onBrandChoiceSelected;
        PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode = getAddressCollectionMode();
        return factory.create(coroutineScope, cardEditConfiguration, true, editCardPayloadCreate, new PaymentSheet.BillingDetailsCollectionConfiguration(PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never, PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never, PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never, addressCollectionMode, false, 16, null), function1, new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultUpdatePaymentMethodInteractor.createEditCardDetailsInteractorForCard$lambda$2(this.f$0, (CardUpdateParams) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createEditCardDetailsInteractorForCard$lambda$2(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor, CardUpdateParams cardUpdateParams) {
        defaultUpdatePaymentMethodInteractor.onCardUpdateParamsChanged(cardUpdateParams);
        return Unit.INSTANCE;
    }

    private final EditCardDetailsInteractor createEditCardDetailsInteractorForLink(LinkPaymentDetails.Card savedPaymentMethodCard) {
        EditCardPayload editCardPayloadCreate = EditCardPayload.INSTANCE.create(savedPaymentMethodCard);
        CardEditConfiguration cardEditConfiguration = new CardEditConfiguration(getCardBrandFilter(), false, false);
        EditCardDetailsInteractor.Factory factory = this.editCardDetailsInteractorFactory;
        CoroutineScope coroutineScope = this.coroutineScope;
        Function1<CardBrand, Unit> function1 = this.onBrandChoiceSelected;
        PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode = PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never;
        PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode collectionMode = PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never;
        return factory.create(coroutineScope, cardEditConfiguration, true, editCardPayloadCreate, new PaymentSheet.BillingDetailsCollectionConfiguration(PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never, PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never, collectionMode, addressCollectionMode, false, 16, null), function1, new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultUpdatePaymentMethodInteractor.createEditCardDetailsInteractorForLink$lambda$3(this.f$0, (CardUpdateParams) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createEditCardDetailsInteractorForLink$lambda$3(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor, CardUpdateParams cardUpdateParams) {
        defaultUpdatePaymentMethodInteractor.onCardUpdateParamsChanged(cardUpdateParams);
        return Unit.INSTANCE;
    }

    private final void onCardUpdateParamsChanged(CardUpdateParams cardUpdateParams) {
        this.cardUpdateParams.setValue(cardUpdateParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdatePaymentMethodInteractor.State _state$lambda$4(DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor, ResolvableString resolvableString, UpdatePaymentMethodInteractor.Status status, boolean z, boolean z2, CardUpdateParams cardUpdateParams) {
        Intrinsics.checkNotNullParameter(status, "status");
        boolean z3 = true;
        boolean z4 = (z2 || cardUpdateParams != null) && status == UpdatePaymentMethodInteractor.Status.Idle;
        if (!defaultUpdatePaymentMethodInteractor.isDefaultPaymentMethod && !z) {
            z3 = false;
        }
        return new UpdatePaymentMethodInteractor.State(resolvableString, status, z3, z4);
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public StateFlow<UpdatePaymentMethodInteractor.State> getState() {
        return this.state;
    }

    @Override // com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor
    public void handleViewAction(UpdatePaymentMethodInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (Intrinsics.areEqual(viewAction, UpdatePaymentMethodInteractor.ViewAction.RemovePaymentMethod.INSTANCE)) {
            removePaymentMethod();
            return;
        }
        if (Intrinsics.areEqual(viewAction, UpdatePaymentMethodInteractor.ViewAction.SaveButtonPressed.INSTANCE)) {
            savePaymentMethod();
        } else if (viewAction instanceof UpdatePaymentMethodInteractor.ViewAction.SetAsDefaultCheckboxChanged) {
            onSetAsDefaultCheckboxChanged(((UpdatePaymentMethodInteractor.ViewAction.SetAsDefaultCheckboxChanged) viewAction).isChecked());
        } else {
            if (!(viewAction instanceof UpdatePaymentMethodInteractor.ViewAction.CardUpdateParamsChanged)) {
                throw new NoWhenBranchMatchedException();
            }
            onCardUpdateParamsChanged(((UpdatePaymentMethodInteractor.ViewAction.CardUpdateParamsChanged) viewAction).getCardUpdateParams());
        }
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1", f = "UpdatePaymentMethodInteractor.kt", i = {3}, l = {263, 264, 266, 268, 269}, m = "invokeSuspend", n = {"removeError"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultUpdatePaymentMethodInteractor.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        
            if (r9.emit(r1, r8) != r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[PHI: r9
          0x0081: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v0 java.lang.Object) binds: [B:23:0x007e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[PHI: r1
          0x009a: PHI (r1v9 java.lang.Throwable) = (r1v8 java.lang.Throwable), (r1v15 java.lang.Throwable) binds: [B:26:0x0097, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DefaultUpdatePaymentMethodInteractor.this.error.emit(DefaultUpdatePaymentMethodInteractor.this.getInitialError(), this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    Function2 function2 = DefaultUpdatePaymentMethodInteractor.this.removeExecutor;
                    PaymentMethod paymentMethod = DefaultUpdatePaymentMethodInteractor.this.getDisplayableSavedPaymentMethod().getPaymentMethod();
                    this.label = 3;
                    obj = function2.invoke(paymentMethod, this);
                    if (obj != coroutine_suspended) {
                        th = (Throwable) obj;
                        this.L$0 = th;
                        this.label = 4;
                        if (DefaultUpdatePaymentMethodInteractor.this.status.emit(UpdatePaymentMethodInteractor.Status.Idle, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    th = (Throwable) obj;
                    this.L$0 = th;
                    this.label = 4;
                    if (DefaultUpdatePaymentMethodInteractor.this.status.emit(UpdatePaymentMethodInteractor.Status.Idle, this) != coroutine_suspended) {
                        MutableStateFlow mutableStateFlow = DefaultUpdatePaymentMethodInteractor.this.error;
                        if (th != null) {
                        }
                        ResolvableString initialError = DefaultUpdatePaymentMethodInteractor.this.getInitialError();
                        this.L$0 = null;
                        this.label = 5;
                    }
                    return coroutine_suspended;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                th = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow2 = DefaultUpdatePaymentMethodInteractor.this.error;
                if (th != null || (initialError = ExceptionKtKt.stripeErrorMessage(th)) == null) {
                    ResolvableString initialError2 = DefaultUpdatePaymentMethodInteractor.this.getInitialError();
                }
                this.L$0 = null;
                this.label = 5;
            }
            this.label = 2;
            if (DefaultUpdatePaymentMethodInteractor.this.status.emit(UpdatePaymentMethodInteractor.Status.Removing, this) != coroutine_suspended) {
                Function2 function22 = DefaultUpdatePaymentMethodInteractor.this.removeExecutor;
                PaymentMethod paymentMethod2 = DefaultUpdatePaymentMethodInteractor.this.getDisplayableSavedPaymentMethod().getPaymentMethod();
                this.label = 3;
                obj = function22.invoke(paymentMethod2, this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    private final void removePaymentMethod() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$savePaymentMethod$1", f = "UpdatePaymentMethodInteractor.kt", i = {3}, l = {275, 276, 278, 279, 287, 292}, m = "invokeSuspend", n = {"updateCardBrandResult"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor$savePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C11461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C11461(Continuation<? super C11461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultUpdatePaymentMethodInteractor.this.new C11461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        
            if (r5.this$0.status.emit(com.stripe.android.paymentsheet.ui.UpdatePaymentMethodInteractor.Status.Idle, r5) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[PHI: r6
          0x0072: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x006f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[PHI: r1 r6
          0x0086: PHI (r1v8 kotlin.Result) = (r1v7 kotlin.Result), (r1v16 kotlin.Result) binds: [B:22:0x0083, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
          0x0086: PHI (r6v12 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:22:0x0083, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Result result;
            UpdateResult updateResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DefaultUpdatePaymentMethodInteractor.this.error.emit(DefaultUpdatePaymentMethodInteractor.this.getInitialError(), this) != coroutine_suspended) {
                        this.label = 2;
                        if (DefaultUpdatePaymentMethodInteractor.this.status.emit(UpdatePaymentMethodInteractor.Status.Updating, this) != coroutine_suspended) {
                            this.label = 3;
                            obj = DefaultUpdatePaymentMethodInteractor.this.m8458maybeUpdateCardCmtIpJM(this);
                            if (obj != coroutine_suspended) {
                                result = (Result) obj;
                                this.L$0 = result;
                                this.label = 4;
                                obj = DefaultUpdatePaymentMethodInteractor.this.m8457maybeSetDefaultPaymentMethodCmtIpJM(this);
                                if (obj != coroutine_suspended) {
                                    updateResult = DefaultUpdatePaymentMethodInteractor.this.getUpdateResult(result, (Result) obj);
                                    if (!(updateResult instanceof UpdateResult.Error)) {
                                        this.L$0 = null;
                                        this.label = 5;
                                        if (DefaultUpdatePaymentMethodInteractor.this.error.emit(((UpdateResult.Error) updateResult).getErrorMessage(), this) != coroutine_suspended) {
                                        }
                                    } else if (Intrinsics.areEqual(updateResult, UpdateResult.Success.INSTANCE)) {
                                        DefaultUpdatePaymentMethodInteractor.this.onUpdateSuccess.invoke();
                                    } else if (!Intrinsics.areEqual(updateResult, UpdateResult.NoUpdatesMade.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.L$0 = null;
                                    this.label = 6;
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    this.label = 2;
                    if (DefaultUpdatePaymentMethodInteractor.this.status.emit(UpdatePaymentMethodInteractor.Status.Updating, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    obj = DefaultUpdatePaymentMethodInteractor.this.m8458maybeUpdateCardCmtIpJM(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    result = (Result) obj;
                    this.L$0 = result;
                    this.label = 4;
                    obj = DefaultUpdatePaymentMethodInteractor.this.m8457maybeSetDefaultPaymentMethodCmtIpJM(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    result = (Result) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    updateResult = DefaultUpdatePaymentMethodInteractor.this.getUpdateResult(result, (Result) obj);
                    if (!(updateResult instanceof UpdateResult.Error)) {
                    }
                    this.L$0 = null;
                    this.label = 6;
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void savePaymentMethod() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C11461(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: maybeUpdateCard-CmtIpJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8458maybeUpdateCardCmtIpJM(Continuation<? super Result<PaymentMethod>> continuation) {
        DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1 defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;
        DefaultUpdatePaymentMethodInteractor defaultUpdatePaymentMethodInteractor;
        if (continuation instanceof DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1) {
            defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1 = (DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1) continuation;
            if ((defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.label & Integer.MIN_VALUE) != 0) {
                defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.label -= Integer.MIN_VALUE;
            } else {
                defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1 = new DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1(this, continuation);
            }
        }
        Object objInvoke = defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CardUpdateParams value = this.cardUpdateParams.getValue();
            if (value == null) {
                return null;
            }
            Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<PaymentMethod>>, Object> function3 = this.updatePaymentMethodExecutor;
            PaymentMethod paymentMethod = getDisplayableSavedPaymentMethod().getPaymentMethod();
            defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.L$0 = this;
            defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.label = 1;
            objInvoke = function3.invoke(paymentMethod, value, defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultUpdatePaymentMethodInteractor = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultUpdatePaymentMethodInteractor = (DefaultUpdatePaymentMethodInteractor) defaultUpdatePaymentMethodInteractor$maybeUpdateCard$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        Object value2 = ((Result) objInvoke).getValue();
        if (Result.m9125isSuccessimpl(value2)) {
            defaultUpdatePaymentMethodInteractor.cardUpdateParams.setValue(null);
        }
        return Result.m9117boximpl(value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeSetDefaultPaymentMethod-CmtIpJM, reason: not valid java name */
    public final Object m8457maybeSetDefaultPaymentMethodCmtIpJM(Continuation<? super Result<Unit>> continuation) {
        if (!this._setAsDefaultValueChanged.getValue().booleanValue() || !this.setAsDefaultCheckboxChecked.getValue().booleanValue()) {
            return null;
        }
        Object objInvoke = this.setDefaultPaymentMethodExecutor.invoke(getDisplayableSavedPaymentMethod().getPaymentMethod(), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : (Result) objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateResult getUpdateResult(Result<PaymentMethod> updateCardBrandResult, Result<Unit> setDefaultPaymentMethodResult) {
        if (updateCardBrandResult == null && setDefaultPaymentMethodResult == null) {
            return UpdateResult.NoUpdatesMade.INSTANCE;
        }
        if (updateCardBrandResult != null && Result.m9124isFailureimpl(updateCardBrandResult.getValue()) && setDefaultPaymentMethodResult != null && Result.m9124isFailureimpl(setDefaultPaymentMethodResult.getValue())) {
            return new UpdateResult.Error(updatesFailedErrorMessage);
        }
        if (updateCardBrandResult != null && Result.m9124isFailureimpl(updateCardBrandResult.getValue())) {
            return new UpdateResult.Error(updateCardBrandErrorMessage);
        }
        if (setDefaultPaymentMethodResult != null && Result.m9124isFailureimpl(setDefaultPaymentMethodResult.getValue())) {
            return new UpdateResult.Error(setDefaultPaymentMethodErrorMessage);
        }
        return UpdateResult.Success.INSTANCE;
    }

    private final void onSetAsDefaultCheckboxChanged(boolean isChecked) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this.setAsDefaultCheckboxChecked;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(isChecked)));
    }

    private final boolean paymentMethodIsExpiredCard() {
        SavedPaymentMethod savedPaymentMethod = getDisplayableSavedPaymentMethod().getSavedPaymentMethod();
        SavedPaymentMethod.Card card = savedPaymentMethod instanceof SavedPaymentMethod.Card ? (SavedPaymentMethod.Card) savedPaymentMethod : null;
        if (card != null) {
            return card.isExpired();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResolvableString getInitialError() {
        if (!paymentMethodIsExpiredCard() || isModifiablePaymentMethod()) {
            return null;
        }
        return UpdatePaymentMethodInteractor.INSTANCE.getExpiredErrorMessage();
    }

    private final boolean hasValidBrandChoices() {
        ArrayList arrayList;
        PaymentMethod.Card.Networks networks;
        Set<String> available;
        PaymentMethod.Card card = getDisplayableSavedPaymentMethod().getPaymentMethod().card;
        if (card == null || (networks = card.networks) == null || (available = networks.getAvailable()) == null) {
            arrayList = null;
        } else {
            Set<String> set = available;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(CardBrand.INSTANCE.fromCode((String) it.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (getCardBrandFilter().isAccepted((CardBrand) obj)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        return (arrayList != null ? arrayList.size() : 0) > 1;
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;", "", "<init>", "()V", "Error", "Success", "NoUpdatesMade", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class UpdateResult {
        public static final int $stable = 0;

        public /* synthetic */ UpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getErrorMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends UpdateResult {
            public static final int $stable = 8;
            private final ResolvableString errorMessage;

            public static /* synthetic */ Error copy$default(Error error, ResolvableString resolvableString, int i, Object obj) {
                if ((i & 1) != 0) {
                    resolvableString = error.errorMessage;
                }
                return error.copy(resolvableString);
            }

            /* renamed from: component1, reason: from getter */
            public final ResolvableString getErrorMessage() {
                return this.errorMessage;
            }

            public final Error copy(ResolvableString errorMessage) {
                return new Error(errorMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.errorMessage, ((Error) other).errorMessage);
            }

            public int hashCode() {
                ResolvableString resolvableString = this.errorMessage;
                if (resolvableString == null) {
                    return 0;
                }
                return resolvableString.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.errorMessage + ")";
            }

            public Error(ResolvableString resolvableString) {
                super(null);
                this.errorMessage = resolvableString;
            }

            public final ResolvableString getErrorMessage() {
                return this.errorMessage;
            }
        }

        private UpdateResult() {
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends UpdateResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1668296709;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
                super(null);
            }
        }

        /* compiled from: UpdatePaymentMethodInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;", "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NoUpdatesMade extends UpdateResult {
            public static final int $stable = 0;
            public static final NoUpdatesMade INSTANCE = new NoUpdatesMade();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoUpdatesMade)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 789824118;
            }

            public String toString() {
                return "NoUpdatesMade";
            }

            private NoUpdatesMade() {
                super(null);
            }
        }
    }

    /* compiled from: UpdatePaymentMethodInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;", "", "<init>", "()V", "setDefaultPaymentMethodErrorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "getSetDefaultPaymentMethodErrorMessage$paymentsheet_release$annotations", "getSetDefaultPaymentMethodErrorMessage$paymentsheet_release", "()Lcom/stripe/android/core/strings/ResolvableString;", "updateCardBrandErrorMessage", "getUpdateCardBrandErrorMessage$paymentsheet_release$annotations", "getUpdateCardBrandErrorMessage$paymentsheet_release", "updatesFailedErrorMessage", "getUpdatesFailedErrorMessage$paymentsheet_release$annotations", "getUpdatesFailedErrorMessage$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSetDefaultPaymentMethodErrorMessage$paymentsheet_release$annotations() {
        }

        public static /* synthetic */ void getUpdateCardBrandErrorMessage$paymentsheet_release$annotations() {
        }

        public static /* synthetic */ void getUpdatesFailedErrorMessage$paymentsheet_release$annotations() {
        }

        private Companion() {
        }

        public final ResolvableString getSetDefaultPaymentMethodErrorMessage$paymentsheet_release() {
            return DefaultUpdatePaymentMethodInteractor.setDefaultPaymentMethodErrorMessage;
        }

        public final ResolvableString getUpdateCardBrandErrorMessage$paymentsheet_release() {
            return DefaultUpdatePaymentMethodInteractor.updateCardBrandErrorMessage;
        }

        public final ResolvableString getUpdatesFailedErrorMessage$paymentsheet_release() {
            return DefaultUpdatePaymentMethodInteractor.updatesFailedErrorMessage;
        }
    }
}
