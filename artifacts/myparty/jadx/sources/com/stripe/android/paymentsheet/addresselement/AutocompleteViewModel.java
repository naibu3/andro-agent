package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.addresselement.analytics.AddressLauncherEventReporter;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.DaggerAutocompleteViewModelFactoryComponent;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.ui.core.elements.autocomplete.model.TransformGoogleToStripeAddressKt;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AutocompleteViewModel.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 32\u00020\u0001:\u0005/0123B+\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "placesClient", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "autocompleteArgs", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "eventReporter", "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;", "application", "Landroid/app/Application;", "<init>", "(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V", "_predictions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "predictions", "Lkotlinx/coroutines/flow/StateFlow;", "getPredictions", "()Lkotlinx/coroutines/flow/StateFlow;", "_loading", "", "loading", "getLoading", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;", "event", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "config", "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "textFieldController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getTextFieldController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "queryFlow", "", "debouncer", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;", "selectPrediction", "", "prediction", "onBackPressed", "onEnterAddressManually", "clearQuery", "Debouncer", "Factory", "Event", "Args", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteViewModel extends AndroidViewModel {
    public static final int MAX_DISPLAYED_RESULTS = 4;
    public static final int MIN_CHARS_AUTOCOMPLETE = 3;
    public static final long SEARCH_DEBOUNCE_MS = 1000;
    private final MutableSharedFlow<Event> _event;
    private final MutableStateFlow<Boolean> _loading;
    private final MutableStateFlow<List<AutocompletePrediction>> _predictions;
    private final Args autocompleteArgs;
    private final SimpleTextFieldConfig config;
    private final Debouncer debouncer;
    private final SharedFlow<Event> event;
    private final AddressLauncherEventReporter eventReporter;
    private final PlacesClientProxy placesClient;
    private final StateFlow<String> queryFlow;
    private final SimpleTextFieldController textFieldController;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public AutocompleteViewModel(PlacesClientProxy placesClientProxy, Args autocompleteArgs, AddressLauncherEventReporter eventReporter, Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(autocompleteArgs, "autocompleteArgs");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(application, "application");
        this.placesClient = placesClientProxy;
        this.autocompleteArgs = autocompleteArgs;
        this.eventReporter = eventReporter;
        this._predictions = StateFlowKt.MutableStateFlow(null);
        this._loading = StateFlowKt.MutableStateFlow(false);
        MutableSharedFlow<Event> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        SimpleTextFieldConfig simpleTextFieldConfig = new SimpleTextFieldConfig(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_address_label_address, new Object[0], null, 4, null), 0, 0, StateFlowKt.MutableStateFlow(null), 6, null);
        this.config = simpleTextFieldConfig;
        Object[] objArr = null == true ? 1 : 0;
        SimpleTextFieldController simpleTextFieldController = new SimpleTextFieldController(simpleTextFieldConfig, objArr, null, null, 14, null);
        this.textFieldController = simpleTextFieldController;
        StateFlow<String> fieldValue = simpleTextFieldController.getFieldValue();
        this.queryFlow = fieldValue;
        Debouncer debouncer = new Debouncer();
        this.debouncer = debouncer;
        AutocompleteViewModel autocompleteViewModel = this;
        debouncer.startWatching(ViewModelKt.getViewModelScope(autocompleteViewModel), fieldValue, new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutocompleteViewModel._init_$lambda$0(this.f$0, (String) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(autocompleteViewModel), null, null, new AnonymousClass2(null), 3, null);
        String country = autocompleteArgs.getCountry();
        if (country != null) {
            eventReporter.onShow(country);
        }
    }

    public final StateFlow<List<AutocompletePrediction>> getPredictions() {
        return this._predictions;
    }

    public final StateFlow<Boolean> getLoading() {
        return this._loading;
    }

    public final SharedFlow<Event> getEvent() {
        return this.event;
    }

    public final SimpleTextFieldController getTextFieldController() {
        return this.textFieldController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(AutocompleteViewModel autocompleteViewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(autocompleteViewModel), null, null, new AutocompleteViewModel$1$1(autocompleteViewModel, it, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2", f = "AutocompleteViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutocompleteViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AutocompleteViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ AutocompleteViewModel this$0;

            AnonymousClass1(AutocompleteViewModel autocompleteViewModel) {
                this.this$0 = autocompleteViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((String) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(String str, Continuation<? super Unit> continuation) {
                if (str.length() == 0) {
                    MutableStateFlow<TextFieldIcon> trailingIcon = this.this$0.config.getTrailingIcon();
                    while (!trailingIcon.compareAndSet(trailingIcon.getValue(), null)) {
                    }
                } else {
                    MutableStateFlow<TextFieldIcon> trailingIcon2 = this.this$0.config.getTrailingIcon();
                    final AutocompleteViewModel autocompleteViewModel = this.this$0;
                    while (!trailingIcon2.compareAndSet(trailingIcon2.getValue(), new TextFieldIcon.Trailing(com.stripe.android.R.drawable.stripe_ic_clear, null, true, new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AutocompleteViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$2$lambda$1(autocompleteViewModel);
                        }
                    }, 2, null))) {
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$2$lambda$1(AutocompleteViewModel autocompleteViewModel) {
                autocompleteViewModel.clearQuery();
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
                if (AutocompleteViewModel.this.queryFlow.collect(new AnonymousClass1(AutocompleteViewModel.this), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$selectPrediction$1", f = "AutocompleteViewModel.kt", i = {}, l = {OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 119, 136}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$selectPrediction$1, reason: invalid class name and case insensitive filesystem */
    static final class C11171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AutocompletePrediction $prediction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11171(AutocompletePrediction autocompletePrediction, Continuation<? super C11171> continuation) {
            super(2, continuation);
            this.$prediction = autocompletePrediction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutocompleteViewModel.this.new C11171(this.$prediction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        
            if (r1.emit(r2, r12) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
        
            if (r13.emit(r1, r12) == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo8667fetchPlacegIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AutocompleteViewModel.this._loading.setValue(Boxing.boxBoolean(true));
                PlacesClientProxy placesClientProxy = AutocompleteViewModel.this.placesClient;
                if (placesClientProxy != null) {
                    this.label = 1;
                    objMo8667fetchPlacegIAlus = placesClientProxy.mo8667fetchPlacegIAlus(this.$prediction.getPlaceId(), this);
                    if (objMo8667fetchPlacegIAlus != coroutine_suspended) {
                        AutocompleteViewModel autocompleteViewModel = AutocompleteViewModel.this;
                        if (Result.m9121exceptionOrNullimpl(objMo8667fetchPlacegIAlus) != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objMo8667fetchPlacegIAlus = ((Result) obj).getValue();
            AutocompleteViewModel autocompleteViewModel2 = AutocompleteViewModel.this;
            if (Result.m9121exceptionOrNullimpl(objMo8667fetchPlacegIAlus) != null) {
                autocompleteViewModel2._loading.setValue(Boxing.boxBoolean(false));
                Address addressTransformGoogleToStripeAddress = TransformGoogleToStripeAddressKt.transformGoogleToStripeAddress(((FetchPlaceResponse) objMo8667fetchPlacegIAlus).getPlace(), autocompleteViewModel2.getApplication());
                MutableSharedFlow mutableSharedFlow = autocompleteViewModel2._event;
                Event.GoBack goBack = new Event.GoBack(new AddressDetails(null, new PaymentSheet.Address(addressTransformGoogleToStripeAddress.getCity(), addressTransformGoogleToStripeAddress.getCountry(), addressTransformGoogleToStripeAddress.getLine1(), addressTransformGoogleToStripeAddress.getLine2(), addressTransformGoogleToStripeAddress.getPostalCode(), addressTransformGoogleToStripeAddress.getState()), null, null, 13, null));
                this.label = 2;
            } else {
                autocompleteViewModel2._loading.setValue(Boxing.boxBoolean(false));
                MutableSharedFlow mutableSharedFlow2 = autocompleteViewModel2._event;
                Event.GoBack goBack2 = new Event.GoBack(null);
                this.label = 3;
            }
        }
    }

    public final void selectPrediction(AutocompletePrediction prediction) {
        Intrinsics.checkNotNullParameter(prediction, "prediction");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11171(prediction, null), 3, null);
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$onBackPressed$1", f = "AutocompleteViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$onBackPressed$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutocompleteViewModel.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                if (AutocompleteViewModel.this._event.emit(new Event.GoBack(null), this) == coroutine_suspended) {
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

    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$onEnterAddressManually$1", f = "AutocompleteViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$onEnterAddressManually$1, reason: invalid class name and case insensitive filesystem */
    static final class C11161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11161(Continuation<? super C11161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutocompleteViewModel.this.new C11161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AddressDetails addressDetails;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = AutocompleteViewModel.this._event;
                if (StringsKt.isBlank((CharSequence) AutocompleteViewModel.this.queryFlow.getValue())) {
                    addressDetails = null;
                } else {
                    String str = null;
                    String str2 = null;
                    Boolean bool = null;
                    addressDetails = new AddressDetails(str2, new PaymentSheet.Address(null, str, (String) AutocompleteViewModel.this.queryFlow.getValue(), null, null, null, 59, null), str, bool, 13, 0 == true ? 1 : 0);
                }
                this.label = 1;
                if (mutableSharedFlow.emit(new Event.EnterManually(addressDetails), this) == coroutine_suspended) {
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

    public final void onEnterAddressManually() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11161(null), 3, null);
    }

    public final void clearQuery() {
        this.textFieldController.onRawValueChange("");
        this._predictions.setValue(null);
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;", "", "<init>", "()V", "searchJob", "Lkotlinx/coroutines/Job;", "startWatching", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "queryFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "onValidQuery", "Lkotlin/Function1;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Debouncer {
        public static final int $stable = 8;
        private Job searchJob;

        public final void startWatching(CoroutineScope coroutineScope, StateFlow<String> queryFlow, Function1<? super String, Unit> onValidQuery) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(queryFlow, "queryFlow");
            Intrinsics.checkNotNullParameter(onValidQuery, "onValidQuery");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AutocompleteViewModel$Debouncer$startWatching$1(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\rJ-\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "type", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;)V", "autoCompleteViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)V", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Type", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final Type type;

        private Factory(Type type) {
            this.type = type;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) this.type.create(modelClass, extras);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider, Args args) {
            this(new Type.WithinAddressElement(autoCompleteViewModelSubcomponentBuilderProvider, args));
            Intrinsics.checkNotNullParameter(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            Intrinsics.checkNotNullParameter(args, "args");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(AutocompleteContract.Args args) {
            this(new Type.Isolated(args));
            Intrinsics.checkNotNullParameter(args, "args");
        }

        /* compiled from: AutocompleteViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bJ-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;", "", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "WithinAddressElement", "Isolated", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$Isolated;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$WithinAddressElement;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Type {
            <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras);

            /* compiled from: AutocompleteViewModel.kt */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$WithinAddressElement;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;", "autoCompleteViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "<init>", "(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class WithinAddressElement implements Type {
                public static final int $stable = 8;
                private final Args args;
                private final Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider;

                public WithinAddressElement(Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider, Args args) {
                    Intrinsics.checkNotNullParameter(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
                    Intrinsics.checkNotNullParameter(args, "args");
                    this.autoCompleteViewModelSubcomponentBuilderProvider = autoCompleteViewModelSubcomponentBuilderProvider;
                    this.args = args;
                }

                @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.Type
                public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    AutocompleteViewModel autoCompleteViewModel = this.autoCompleteViewModelSubcomponentBuilderProvider.get().application(CreationExtrasKtxKt.requireApplication(extras)).configuration(this.args).build().getAutoCompleteViewModel();
                    Intrinsics.checkNotNull(autoCompleteViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.Type.WithinAddressElement.create");
                    return autoCompleteViewModel;
                }
            }

            /* compiled from: AutocompleteViewModel.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type$Isolated;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory$Type;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Isolated implements Type {
                public static final int $stable = 0;
                private final AutocompleteContract.Args args;

                public Isolated(AutocompleteContract.Args args) {
                    Intrinsics.checkNotNullParameter(args, "args");
                    this.args = args;
                }

                @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.Type
                public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    AutocompleteViewModel autocompleteViewModel = DaggerAutocompleteViewModelFactoryComponent.factory().build(CreationExtrasKtxKt.requireApplication(extras), this.args).getAutocompleteViewModel();
                    Intrinsics.checkNotNull(autocompleteViewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.Type.Isolated.create");
                    return autocompleteViewModel;
                }
            }
        }
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;", "", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "EnterManually", "GoBack", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$EnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$GoBack;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Event {
        AddressDetails getAddressDetails();

        /* compiled from: AutocompleteViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$EnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EnterManually implements Event {
            public static final int $stable = 0;
            private final AddressDetails addressDetails;

            public static /* synthetic */ EnterManually copy$default(EnterManually enterManually, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressDetails = enterManually.addressDetails;
                }
                return enterManually.copy(addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final EnterManually copy(AddressDetails addressDetails) {
                return new EnterManually(addressDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EnterManually) && Intrinsics.areEqual(this.addressDetails, ((EnterManually) other).addressDetails);
            }

            public int hashCode() {
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    return 0;
                }
                return addressDetails.hashCode();
            }

            public String toString() {
                return "EnterManually(addressDetails=" + this.addressDetails + ")";
            }

            public EnterManually(AddressDetails addressDetails) {
                this.addressDetails = addressDetails;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Event
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }

        /* compiled from: AutocompleteViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$GoBack;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoBack implements Event {
            public static final int $stable = 0;
            private final AddressDetails addressDetails;

            public static /* synthetic */ GoBack copy$default(GoBack goBack, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressDetails = goBack.addressDetails;
                }
                return goBack.copy(addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final GoBack copy(AddressDetails addressDetails) {
                return new GoBack(addressDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoBack) && Intrinsics.areEqual(this.addressDetails, ((GoBack) other).addressDetails);
            }

            public int hashCode() {
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    return 0;
                }
                return addressDetails.hashCode();
            }

            public String toString() {
                return "GoBack(addressDetails=" + this.addressDetails + ")";
            }

            public GoBack(AddressDetails addressDetails) {
                this.addressDetails = addressDetails;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Event
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }
    }

    /* compiled from: AutocompleteViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;", "", "country", "", "<init>", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final String country;

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.country;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final Args copy(String country) {
            return new Args(country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.country, ((Args) other).country);
        }

        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.country + ")";
        }

        public Args(String str) {
            this.country = str;
        }

        public final String getCountry() {
            return this.country;
        }
    }
}
