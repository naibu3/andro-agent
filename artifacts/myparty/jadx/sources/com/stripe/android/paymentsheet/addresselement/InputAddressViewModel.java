package com.stripe.android.paymentsheet.addresselement;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AddressElementScreen;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: InputAddressViewModel.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002LMB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u00107\u001a\u00020\u00122\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\b\u00109\u001a\u00020\u0014H\u0002J$\u0010:\u001a\u00020\u00122\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020<\u0018\u00010\u00192\u0006\u00105\u001a\u00020\u0017J\u0010\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0014H\u0007J\u000e\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0017J\u000e\u0010A\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0017J\b\u0010B\u001a\u00020\u0017H\u0002J\u001c\u0010C\u001a\u00020\u00172\b\u0010D\u001a\u0004\u0018\u00010\u00142\b\u0010E\u001a\u0004\u0018\u00010\u0014H\u0002J\u0019\u0010F\u001a\u00020\u0017*\u0004\u0018\u00010\u001b2\b\u0010G\u001a\u0004\u0018\u00010\u001bH\u0082\u0004J\f\u0010H\u001a\u00020\u0014*\u00020IH\u0002J\u0010\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140#¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020*X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00170#¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170#¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%¨\u0006N"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "eventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;)V", "getArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "eventListener", "Lkotlin/Function1;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "", "initialBillingAddress", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "initialShippingAddress", "initialInputsAreTheSame", "", "unparsedBillingAddress", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "parsedBillingAddress", "_shippingSameAsBillingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;", "previousUserInput", "setShippingSameAsShippingAtLeastOnce", "shippingSameAsBillingState", "Lkotlinx/coroutines/flow/StateFlow;", "getShippingSameAsBillingState", "()Lkotlinx/coroutines/flow/StateFlow;", "_collectedAddress", "collectedAddress", "getCollectedAddress", "autocompleteConfig", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "getAutocompleteConfig", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "addressFormController", "Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;", "getAddressFormController", "()Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;", "_formEnabled", "formEnabled", "getFormEnabled", "_checkboxChecked", "checkboxChecked", "getCheckboxChecked", "register", "onEvent", "getCurrentAddress", "clickPrimaryButton", "completedFormValues", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "dismissWithAddress", "addressDetails", "clickBillingSameAsShipping", "newValue", "clickCheckbox", "canUseShippingSameAsBilling", "addressesAreTheSame", "addressOne", "addressTwo", "softEquals", "other", "toAddressDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "onAutocomplete", "country", "ShippingSameAsBillingState", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputAddressViewModel extends ViewModel implements AutocompleteAddressInteractor {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _checkboxChecked;
    private final MutableStateFlow<AddressDetails> _collectedAddress;
    private final MutableStateFlow<Boolean> _formEnabled;
    private final MutableStateFlow<ShippingSameAsBillingState> _shippingSameAsBillingState;
    private final AddressFormController addressFormController;
    private final AddressElementActivityContract.Args args;
    private final AutocompleteAddressInteractor.Config autocompleteConfig;
    private final StateFlow<Boolean> checkboxChecked;
    private final StateFlow<AddressDetails> collectedAddress;
    private Function1<? super AutocompleteAddressInteractor.Event, Unit> eventListener;
    private final AddressLauncherEventReporter eventReporter;
    private final StateFlow<Boolean> formEnabled;
    private final AddressDetails initialBillingAddress;
    private final boolean initialInputsAreTheSame;
    private final AddressDetails initialShippingAddress;
    private final AddressElementNavigator navigator;
    private Map<IdentifierSpec, String> parsedBillingAddress;
    private Map<IdentifierSpec, String> previousUserInput;
    private boolean setShippingSameAsShippingAtLeastOnce;
    private final StateFlow<ShippingSameAsBillingState> shippingSameAsBillingState;
    private final Map<IdentifierSpec, String> unparsedBillingAddress;

    public final AddressElementActivityContract.Args getArgs() {
        return this.args;
    }

    public final AddressElementNavigator getNavigator() {
        return this.navigator;
    }

    @Inject
    public InputAddressViewModel(AddressElementActivityContract.Args args, AddressElementNavigator navigator, AddressLauncherEventReporter eventReporter) {
        ShippingSameAsBillingState.Hide show;
        AddressDetails address;
        Boolean boolIsCheckboxSelected;
        Map identifierMap$default;
        Set<String> autocompleteCountries;
        PaymentSheet.BillingDetails billingAddress$paymentsheet_release;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        this.args = args;
        this.navigator = navigator;
        this.eventReporter = eventReporter;
        AddressLauncher.Configuration config$paymentsheet_release = args.getConfig$paymentsheet_release();
        AddressDetails addressDetails = (config$paymentsheet_release == null || (billingAddress$paymentsheet_release = config$paymentsheet_release.getBillingAddress$paymentsheet_release()) == null) ? null : toAddressDetails(billingAddress$paymentsheet_release);
        this.initialBillingAddress = addressDetails;
        AddressLauncher.Configuration config$paymentsheet_release2 = args.getConfig$paymentsheet_release();
        AddressDetails address2 = config$paymentsheet_release2 != null ? config$paymentsheet_release2.getAddress() : null;
        this.initialShippingAddress = address2;
        boolean zAddressesAreTheSame = addressesAreTheSame(addressDetails, address2);
        this.initialInputsAreTheSame = zAddressesAreTheSame;
        this.unparsedBillingAddress = addressDetails != null ? AddressDetailsKt.toIdentifierMap$default(addressDetails, null, 1, null) : null;
        if (canUseShippingSameAsBilling()) {
            show = new ShippingSameAsBillingState.Show((addressDetails != null && address2 == null) || zAddressesAreTheSame);
        } else {
            show = ShippingSameAsBillingState.Hide.INSTANCE;
        }
        MutableStateFlow<ShippingSameAsBillingState> MutableStateFlow = StateFlowKt.MutableStateFlow(show);
        this._shippingSameAsBillingState = MutableStateFlow;
        this.previousUserInput = (zAddressesAreTheSame || address2 == null) ? null : AddressDetailsKt.toIdentifierMap$default(address2, null, 1, null);
        ShippingSameAsBillingState value = MutableStateFlow.getValue();
        this.setShippingSameAsShippingAtLeastOnce = (value instanceof ShippingSameAsBillingState.Show) && ((ShippingSameAsBillingState.Show) value).isChecked();
        this.shippingSameAsBillingState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AddressDetails> MutableStateFlow2 = StateFlowKt.MutableStateFlow(address2 != null ? address2 : addressDetails);
        this._collectedAddress = MutableStateFlow2;
        this.collectedAddress = MutableStateFlow2;
        AddressLauncher.Configuration config$paymentsheet_release3 = args.getConfig$paymentsheet_release();
        String googlePlacesApiKey = config$paymentsheet_release3 != null ? config$paymentsheet_release3.getGooglePlacesApiKey() : null;
        AddressLauncher.Configuration config$paymentsheet_release4 = args.getConfig$paymentsheet_release();
        this.autocompleteConfig = new AutocompleteAddressInteractor.Config(googlePlacesApiKey, (config$paymentsheet_release4 == null || (autocompleteCountries = config$paymentsheet_release4.getAutocompleteCountries()) == null) ? SetsKt.emptySet() : autocompleteCountries, false, 4, null);
        AddressDetails value2 = MutableStateFlow2.getValue();
        this.addressFormController = new AddressFormController((value2 == null || (identifierMap$default = AddressDetailsKt.toIdentifierMap$default(value2, null, 1, null)) == null) ? MapsKt.emptyMap() : identifierMap$default, args.getConfig$paymentsheet_release(), this);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._formEnabled = MutableStateFlow3;
        this.formEnabled = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._checkboxChecked = MutableStateFlow4;
        this.checkboxChecked = MutableStateFlow4;
        InputAddressViewModel inputAddressViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(inputAddressViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(inputAddressViewModel), null, null, new AnonymousClass2(null), 3, null);
        AddressLauncher.Configuration config$paymentsheet_release5 = args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release5 == null || (address = config$paymentsheet_release5.getAddress()) == null || (boolIsCheckboxSelected = address.isCheckboxSelected()) == null) {
            return;
        }
        MutableStateFlow4.setValue(Boolean.valueOf(boolIsCheckboxSelected.booleanValue()));
    }

    public final StateFlow<ShippingSameAsBillingState> getShippingSameAsBillingState() {
        return this.shippingSameAsBillingState;
    }

    public final StateFlow<AddressDetails> getCollectedAddress() {
        return this.collectedAddress;
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public AutocompleteAddressInteractor.Config getAutocompleteConfig() {
        return this.autocompleteConfig;
    }

    public final AddressFormController getAddressFormController() {
        return this.addressFormController;
    }

    public final StateFlow<Boolean> getFormEnabled() {
        return this.formEnabled;
    }

    public final StateFlow<Boolean> getCheckboxChecked() {
        return this.checkboxChecked;
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$1", f = "InputAddressViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InputAddressViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow resultFlow = InputAddressViewModel.this.getNavigator().getResultFlow("AutocompleteEvent");
                if (resultFlow != null) {
                    final InputAddressViewModel inputAddressViewModel = InputAddressViewModel.this;
                    this.label = 1;
                    if (resultFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((AddressElementNavigator.AutocompleteEvent) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(AddressElementNavigator.AutocompleteEvent autocompleteEvent, Continuation<? super Unit> continuation) {
                            String name;
                            PaymentSheet.Address address;
                            String phoneNumber;
                            Boolean boolIsCheckboxSelected;
                            AddressDetails addressDetails = (AddressDetails) inputAddressViewModel._collectedAddress.getValue();
                            AddressDetails addressDetails2 = autocompleteEvent != null ? autocompleteEvent.getAddressDetails() : null;
                            if (addressDetails == null || (name = addressDetails.getName()) == null) {
                                name = addressDetails2 != null ? addressDetails2.getName() : null;
                            }
                            if (addressDetails2 == null || (address = addressDetails2.getAddress()) == null) {
                                address = addressDetails != null ? addressDetails.getAddress() : null;
                            }
                            if (addressDetails == null || (phoneNumber = addressDetails.getPhoneNumber()) == null) {
                                phoneNumber = addressDetails2 != null ? addressDetails2.getPhoneNumber() : null;
                            }
                            if (addressDetails == null || (boolIsCheckboxSelected = addressDetails.isCheckboxSelected()) == null) {
                                boolIsCheckboxSelected = addressDetails2 != null ? addressDetails2.isCheckboxSelected() : null;
                            }
                            AddressDetails addressDetails3 = new AddressDetails(name, address, phoneNumber, boolIsCheckboxSelected);
                            Map identifierMap$default = AddressDetailsKt.toIdentifierMap$default(addressDetails3, null, 1, null);
                            if (autocompleteEvent instanceof AddressElementNavigator.AutocompleteEvent.OnEnterManually) {
                                Function1 function1 = inputAddressViewModel.eventListener;
                                if (function1 != null) {
                                    function1.invoke(new AutocompleteAddressInteractor.Event.OnExpandForm(identifierMap$default));
                                }
                            } else if (autocompleteEvent instanceof AddressElementNavigator.AutocompleteEvent.OnBack) {
                                Function1 function12 = inputAddressViewModel.eventListener;
                                if (function12 != null) {
                                    function12.invoke(new AutocompleteAddressInteractor.Event.OnValues(identifierMap$default));
                                }
                            } else if (autocompleteEvent != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object objEmit = inputAddressViewModel._collectedAddress.emit(addressDetails3, continuation);
                            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2", f = "InputAddressViewModel.kt", i = {}, l = {OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InputAddressViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InputAddressViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "formValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2$1", f = "InputAddressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Map<IdentifierSpec, ? extends FormFieldEntry>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InputAddressViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InputAddressViewModel inputAddressViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = inputAddressViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<IdentifierSpec, FormFieldEntry>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<IdentifierSpec, FormFieldEntry> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Map map = (Map) this.L$0;
                if (((ShippingSameAsBillingState) this.this$0._shippingSameAsBillingState.getValue()) instanceof ShippingSameAsBillingState.Show) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((FormFieldEntry) entry.getValue()).getValue());
                    }
                    if ((this.this$0.setShippingSameAsShippingAtLeastOnce || Intrinsics.areEqual(linkedHashMap, this.this$0.unparsedBillingAddress)) && this.this$0.parsedBillingAddress == null) {
                        this.this$0.parsedBillingAddress = linkedHashMap;
                    }
                    boolean zAreEqual = Intrinsics.areEqual(linkedHashMap, this.this$0.parsedBillingAddress);
                    if (!zAreEqual) {
                        this.this$0.previousUserInput = linkedHashMap;
                    }
                    this.this$0._shippingSameAsBillingState.setValue(new ShippingSameAsBillingState.Show(zAreEqual));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(InputAddressViewModel.this.getAddressFormController().getUncompletedFormValues(), new AnonymousClass1(InputAddressViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public void register(Function1<? super AutocompleteAddressInteractor.Event, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.eventListener = onEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressDetails getCurrentAddress() {
        Map<IdentifierSpec, FormFieldEntry> currentFormValues = this.addressFormController.getCurrentFormValues();
        FormFieldEntry formFieldEntry = currentFormValues.get(IdentifierSpec.INSTANCE.getName());
        String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
        FormFieldEntry formFieldEntry2 = currentFormValues.get(IdentifierSpec.INSTANCE.getCity());
        String value2 = formFieldEntry2 != null ? formFieldEntry2.getValue() : null;
        FormFieldEntry formFieldEntry3 = currentFormValues.get(IdentifierSpec.INSTANCE.getCountry());
        String value3 = formFieldEntry3 != null ? formFieldEntry3.getValue() : null;
        FormFieldEntry formFieldEntry4 = currentFormValues.get(IdentifierSpec.INSTANCE.getLine1());
        String value4 = formFieldEntry4 != null ? formFieldEntry4.getValue() : null;
        FormFieldEntry formFieldEntry5 = currentFormValues.get(IdentifierSpec.INSTANCE.getLine2());
        String value5 = formFieldEntry5 != null ? formFieldEntry5.getValue() : null;
        FormFieldEntry formFieldEntry6 = currentFormValues.get(IdentifierSpec.INSTANCE.getPostalCode());
        String value6 = formFieldEntry6 != null ? formFieldEntry6.getValue() : null;
        FormFieldEntry formFieldEntry7 = currentFormValues.get(IdentifierSpec.INSTANCE.getState());
        PaymentSheet.Address address = new PaymentSheet.Address(value2, value3, value4, value5, value6, formFieldEntry7 != null ? formFieldEntry7.getValue() : null);
        FormFieldEntry formFieldEntry8 = currentFormValues.get(IdentifierSpec.INSTANCE.getPhone());
        return new AddressDetails(value, address, formFieldEntry8 != null ? formFieldEntry8.getValue() : null, null, 8, null);
    }

    public final void clickPrimaryButton(Map<IdentifierSpec, FormFieldEntry> completedFormValues, boolean checkboxChecked) {
        FormFieldEntry formFieldEntry;
        FormFieldEntry formFieldEntry2;
        FormFieldEntry formFieldEntry3;
        FormFieldEntry formFieldEntry4;
        FormFieldEntry formFieldEntry5;
        FormFieldEntry formFieldEntry6;
        FormFieldEntry formFieldEntry7;
        FormFieldEntry formFieldEntry8;
        this._formEnabled.setValue(false);
        String value = null;
        String value2 = (completedFormValues == null || (formFieldEntry8 = completedFormValues.get(IdentifierSpec.INSTANCE.getName())) == null) ? null : formFieldEntry8.getValue();
        PaymentSheet.Address address = new PaymentSheet.Address((completedFormValues == null || (formFieldEntry7 = completedFormValues.get(IdentifierSpec.INSTANCE.getCity())) == null) ? null : formFieldEntry7.getValue(), (completedFormValues == null || (formFieldEntry6 = completedFormValues.get(IdentifierSpec.INSTANCE.getCountry())) == null) ? null : formFieldEntry6.getValue(), (completedFormValues == null || (formFieldEntry5 = completedFormValues.get(IdentifierSpec.INSTANCE.getLine1())) == null) ? null : formFieldEntry5.getValue(), (completedFormValues == null || (formFieldEntry4 = completedFormValues.get(IdentifierSpec.INSTANCE.getLine2())) == null) ? null : formFieldEntry4.getValue(), (completedFormValues == null || (formFieldEntry3 = completedFormValues.get(IdentifierSpec.INSTANCE.getPostalCode())) == null) ? null : formFieldEntry3.getValue(), (completedFormValues == null || (formFieldEntry2 = completedFormValues.get(IdentifierSpec.INSTANCE.getState())) == null) ? null : formFieldEntry2.getValue());
        if (completedFormValues != null && (formFieldEntry = completedFormValues.get(IdentifierSpec.INSTANCE.getPhone())) != null) {
            value = formFieldEntry.getValue();
        }
        dismissWithAddress(new AddressDetails(value2, address, value, Boolean.valueOf(checkboxChecked)));
    }

    public final void dismissWithAddress(AddressDetails addressDetails) {
        String country;
        PaymentSheet.Address address;
        Intrinsics.checkNotNullParameter(addressDetails, "addressDetails");
        PaymentSheet.Address address2 = addressDetails.getAddress();
        if (address2 != null && (country = address2.getCountry()) != null) {
            AddressLauncherEventReporter addressLauncherEventReporter = this.eventReporter;
            AddressDetails value = this.collectedAddress.getValue();
            addressLauncherEventReporter.onCompleted(country, ((value == null || (address = value.getAddress()) == null) ? null : address.getLine1()) != null, Integer.valueOf(AddressUtilsKt.editDistance(addressDetails, this.collectedAddress.getValue())));
        }
        this.navigator.dismiss(new AddressLauncherResult.Succeeded(addressDetails));
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$clickBillingSameAsShipping$1", f = "InputAddressViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$clickBillingSameAsShipping$1, reason: invalid class name and case insensitive filesystem */
    static final class C11191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $newValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11191(boolean z, Continuation<? super C11191> continuation) {
            super(2, continuation);
            this.$newValue = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InputAddressViewModel.this.new C11191(this.$newValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((ShippingSameAsBillingState) InputAddressViewModel.this._shippingSameAsBillingState.getValue()) instanceof ShippingSameAsBillingState.Show) {
                ShippingSameAsBillingState.Show show = new ShippingSameAsBillingState.Show(this.$newValue);
                InputAddressViewModel.this.setShippingSameAsShippingAtLeastOnce = true;
                if (show.isChecked()) {
                    Map map = InputAddressViewModel.this.parsedBillingAddress;
                    if (map == null) {
                        map = InputAddressViewModel.this.unparsedBillingAddress;
                    }
                    if (map != null && (function1 = InputAddressViewModel.this.eventListener) != null) {
                        function1.invoke(new AutocompleteAddressInteractor.Event.OnValues(map));
                    }
                } else {
                    Function1 function12 = InputAddressViewModel.this.eventListener;
                    if (function12 != null) {
                        Map mapEmptyMap = InputAddressViewModel.this.previousUserInput;
                        if (mapEmptyMap == null) {
                            mapEmptyMap = MapsKt.emptyMap();
                        }
                        function12.invoke(new AutocompleteAddressInteractor.Event.OnValues(mapEmptyMap));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void clickBillingSameAsShipping(boolean newValue) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11191(newValue, null), 3, null);
    }

    public final void clickCheckbox(boolean newValue) {
        this._checkboxChecked.setValue(Boolean.valueOf(newValue));
    }

    private final boolean canUseShippingSameAsBilling() {
        AddressDetails addressDetails;
        String country;
        AddressLauncher.Configuration config$paymentsheet_release = this.args.getConfig$paymentsheet_release();
        if (config$paymentsheet_release == null || (addressDetails = this.initialBillingAddress) == null) {
            return false;
        }
        PaymentSheet.Address address = addressDetails.getAddress();
        if (address == null || (country = address.getCountry()) == null) {
            return true;
        }
        Set<String> allowedCountries = config$paymentsheet_release.getAllowedCountries();
        if (allowedCountries.isEmpty()) {
            allowedCountries = null;
        }
        if (allowedCountries == null) {
            allowedCountries = CountryUtils.INSTANCE.getSupportedBillingCountries();
        }
        return allowedCountries.contains(country);
    }

    private final boolean addressesAreTheSame(AddressDetails addressOne, AddressDetails addressTwo) {
        if (addressOne != null && addressTwo != null && softEquals(addressOne.getName(), addressTwo.getName()) && softEquals(addressOne.getPhoneNumber(), addressTwo.getPhoneNumber())) {
            PaymentSheet.Address address = addressOne.getAddress();
            String line1 = address != null ? address.getLine1() : null;
            PaymentSheet.Address address2 = addressTwo.getAddress();
            if (softEquals(line1, address2 != null ? address2.getLine1() : null)) {
                PaymentSheet.Address address3 = addressOne.getAddress();
                String line2 = address3 != null ? address3.getLine2() : null;
                PaymentSheet.Address address4 = addressTwo.getAddress();
                if (softEquals(line2, address4 != null ? address4.getLine2() : null)) {
                    PaymentSheet.Address address5 = addressOne.getAddress();
                    String city = address5 != null ? address5.getCity() : null;
                    PaymentSheet.Address address6 = addressTwo.getAddress();
                    if (softEquals(city, address6 != null ? address6.getCity() : null)) {
                        PaymentSheet.Address address7 = addressOne.getAddress();
                        String state = address7 != null ? address7.getState() : null;
                        PaymentSheet.Address address8 = addressTwo.getAddress();
                        if (softEquals(state, address8 != null ? address8.getState() : null)) {
                            PaymentSheet.Address address9 = addressOne.getAddress();
                            String country = address9 != null ? address9.getCountry() : null;
                            PaymentSheet.Address address10 = addressTwo.getAddress();
                            if (softEquals(country, address10 != null ? address10.getCountry() : null)) {
                                PaymentSheet.Address address11 = addressOne.getAddress();
                                String postalCode = address11 != null ? address11.getPostalCode() : null;
                                PaymentSheet.Address address12 = addressTwo.getAddress();
                                if (softEquals(postalCode, address12 != null ? address12.getPostalCode() : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean softEquals(String str, String str2) {
        if (Intrinsics.areEqual(str, str2)) {
            return true;
        }
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            return false;
        }
        String str4 = str2;
        return str4 == null || str4.length() == 0;
    }

    private final AddressDetails toAddressDetails(PaymentSheet.BillingDetails billingDetails) {
        return new AddressDetails(billingDetails.getName(), billingDetails.getAddress(), billingDetails.getPhone(), null, 8, null);
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$onAutocomplete$1", f = "InputAddressViewModel.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$onAutocomplete$1, reason: invalid class name and case insensitive filesystem */
    static final class C11201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $country;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11201(String str, Continuation<? super C11201> continuation) {
            super(2, continuation);
            this.$country = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InputAddressViewModel.this.new C11201(this.$country, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (InputAddressViewModel.this._collectedAddress.emit(InputAddressViewModel.this.getCurrentAddress(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InputAddressViewModel.this.getNavigator().navigateTo(new AddressElementScreen.Autocomplete(this.$country));
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor
    public void onAutocomplete(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11201(country, null), 3, null);
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;", "", "Hide", "Show", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Hide;", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShippingSameAsBillingState {

        /* compiled from: InputAddressViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Hide;", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Hide implements ShippingSameAsBillingState {
            public static final int $stable = 0;
            public static final Hide INSTANCE = new Hide();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Hide)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1452598596;
            }

            public String toString() {
                return "Hide";
            }

            private Hide() {
            }
        }

        /* compiled from: InputAddressViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState$Show;", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Show implements ShippingSameAsBillingState {
            public static final int $stable = 0;
            private final boolean isChecked;

            public static /* synthetic */ Show copy$default(Show show, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = show.isChecked;
                }
                return show.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public final Show copy(boolean isChecked) {
                return new Show(isChecked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Show) && this.isChecked == ((Show) other).isChecked;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "Show(isChecked=" + this.isChecked + ")";
            }

            public Show(boolean z) {
                this.isChecked = z;
            }

            public final boolean isChecked() {
                return this.isChecked;
            }
        }
    }

    /* compiled from: InputAddressViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "inputAddressViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;", "<init>", "(Ljavax/inject/Provider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider;

        public Factory(Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider) {
            Intrinsics.checkNotNullParameter(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
            this.inputAddressViewModelSubcomponentBuilderProvider = inputAddressViewModelSubcomponentBuilderProvider;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            InputAddressViewModel inputAddressViewModel = this.inputAddressViewModelSubcomponentBuilderProvider.get().build().getInputAddressViewModel();
            Intrinsics.checkNotNull(inputAddressViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return inputAddressViewModel;
        }
    }
}
