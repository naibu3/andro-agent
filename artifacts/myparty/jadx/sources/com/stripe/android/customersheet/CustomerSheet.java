package com.stripe.android.customersheet;

import android.app.Application;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetConfigViewModel;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.CustomerSheetResult;
import com.stripe.android.customersheet.PaymentOptionSelection;
import com.stripe.android.customersheet.util.CustomerSheetHacks;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.utils.AnimationConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;

/* compiled from: CustomerSheet.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u0001:\u0005&'()*BQ\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet;", "", "application", "Landroid/app/Application;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "callback", "Lcom/stripe/android/customersheet/CustomerSheetResultCallback;", "statusBarColor", "Lkotlin/Function0;", "", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Lkotlin/jvm/functions/Function0;)V", "customerSheetActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "viewModel", "Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;", "configure", "", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "present", "resetCustomer", "retrievePaymentOptionSelection", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCustomerSheetResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "Configuration", "IntentConfiguration", "CustomerSessionClientSecret", "CustomerSessionProvider", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheet {
    private final Application application;
    private final CustomerSheetResultCallback callback;
    private final ActivityResultLauncher<CustomerSheetContract.Args> customerSheetActivityLauncher;
    private final CustomerSheetIntegration.Type integrationType;
    private final PaymentOptionFactory paymentOptionFactory;
    private final Function0<Integer> statusBarColor;
    private final CustomerSheetConfigViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CustomerSheet create(ComponentActivity componentActivity, CustomerAdapter customerAdapter, CustomerSheetResultCallback customerSheetResultCallback) {
        return INSTANCE.create(componentActivity, customerAdapter, customerSheetResultCallback);
    }

    @JvmStatic
    public static final CustomerSheet create(ComponentActivity componentActivity, CustomerSessionProvider customerSessionProvider, CustomerSheetResultCallback customerSheetResultCallback) {
        return INSTANCE.create(componentActivity, customerSessionProvider, customerSheetResultCallback);
    }

    @JvmStatic
    public static final CustomerSheet create(Fragment fragment, CustomerAdapter customerAdapter, CustomerSheetResultCallback customerSheetResultCallback) {
        return INSTANCE.create(fragment, customerAdapter, customerSheetResultCallback);
    }

    @JvmStatic
    public static final CustomerSheet create(Fragment fragment, CustomerSessionProvider customerSessionProvider, CustomerSheetResultCallback customerSheetResultCallback) {
        return INSTANCE.create(fragment, customerSessionProvider, customerSheetResultCallback);
    }

    public CustomerSheet(Application application, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, CustomerSheetIntegration.Type integrationType, PaymentOptionFactory paymentOptionFactory, CustomerSheetResultCallback callback, Function0<Integer> statusBarColor) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
        this.application = application;
        this.integrationType = integrationType;
        this.paymentOptionFactory = paymentOptionFactory;
        this.callback = callback;
        this.statusBarColor = statusBarColor;
        this.customerSheetActivityLauncher = activityResultRegistryOwner.getActivityResultRegistry().register("CustomerSheet", new CustomerSheetContract(), new CustomerSheet$customerSheetActivityLauncher$1(this));
        this.viewModel = (CustomerSheetConfigViewModel) new ViewModelProvider(viewModelStoreOwner, CustomerSheetConfigViewModel.Factory.INSTANCE).get(CustomerSheetConfigViewModel.class);
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.customersheet.CustomerSheet.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                CustomerSheet.this.customerSheetActivityLauncher.unregister();
                super.onDestroy(owner);
            }
        });
    }

    public final void configure(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.viewModel.setConfigureRequest(new CustomerSheetConfigureRequest(configuration));
    }

    public final void present() {
        CustomerSheetConfigureRequest configureRequest = this.viewModel.getConfigureRequest();
        if (configureRequest == null) {
            this.callback.onCustomerSheetResult(new CustomerSheetResult.Failed(new IllegalStateException("Must call `configure` first before attempting to present `CustomerSheet`!")));
            return;
        }
        CustomerSheetContract.Args args = new CustomerSheetContract.Args(this.integrationType, configureRequest.getConfiguration(), this.statusBarColor.invoke());
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(this.application.getApplicationContext(), AnimationConstants.INSTANCE.getFADE_IN(), AnimationConstants.INSTANCE.getFADE_OUT());
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        this.customerSheetActivityLauncher.launch(args, activityOptionsCompatMakeCustomAnimation);
    }

    public final void resetCustomer() {
        this.viewModel.setConfigureRequest(null);
        CustomerSheetHacks.INSTANCE.clear();
    }

    public final Object retrievePaymentOptionSelection(Continuation<? super CustomerSheetResult> continuation) {
        CustomerSheetConfigureRequest configureRequest = this.viewModel.getConfigureRequest();
        if (configureRequest == null) {
            return new CustomerSheetResult.Failed(new IllegalStateException("Must call `configure` first before attempting to fetch the saved payment option!"));
        }
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(configureRequest, null), continuation);
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerSheetResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2", f = "CustomerSheet.kt", i = {0, 1}, l = {142, 143}, m = "invokeSuspend", n = {"paymentMethodsDeferred", "savedSelection"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetResult>, Object> {
        final /* synthetic */ CustomerSheetConfigureRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerSheetConfigureRequest customerSheetConfigureRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = customerSheetConfigureRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CustomerSheet.this.new AnonymousClass2(this.$request, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Object paymentOption$paymentsheet_release;
            Object objM9118constructorimpl;
            Object objM9118constructorimpl2;
            PaymentSelection paymentSelection$paymentsheet_release;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            PaymentOptionSelection paymentOptionSelection$paymentsheet_release = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1(null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerSheet$retrievePaymentOptionSelection$2$paymentMethodsDeferred$1(null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 1;
                obj = deferredAsync$default2.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentOption$paymentsheet_release = this.L$0;
                ResultKt.throwOnFailure(obj);
                final Object value = ((Result) obj).getValue();
                if (Result.m9125isSuccessimpl(paymentOption$paymentsheet_release)) {
                    Result.Companion companion = Result.INSTANCE;
                    SavedSelection savedSelection = (SavedSelection) paymentOption$paymentsheet_release;
                    paymentOption$paymentsheet_release = savedSelection != null ? CustomerAdapter.PaymentOption.INSTANCE.toPaymentOption$paymentsheet_release(savedSelection) : null;
                }
                objM9118constructorimpl = Result.m9118constructorimpl(paymentOption$paymentsheet_release);
                CustomerSheet customerSheet = CustomerSheet.this;
                CustomerSheetConfigureRequest customerSheetConfigureRequest = this.$request;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    objM9118constructorimpl2 = Result.m9118constructorimpl(objM9118constructorimpl);
                } else {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        final CustomerAdapter.PaymentOption paymentOption = (CustomerAdapter.PaymentOption) objM9118constructorimpl;
                        if (paymentOption != null && (paymentSelection$paymentsheet_release = paymentOption.toPaymentSelection$paymentsheet_release(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return CustomerSheet.AnonymousClass2.invokeSuspend$lambda$3$lambda$2(value, paymentOption, (String) obj2);
                            }
                        })) != null) {
                            paymentOptionSelection$paymentsheet_release = CustomerSheet.INSTANCE.toPaymentOptionSelection$paymentsheet_release(paymentSelection$paymentsheet_release, customerSheet.paymentOptionFactory, customerSheetConfigureRequest.getConfiguration().getGooglePayEnabled());
                        }
                        objM9118constructorimpl2 = Result.m9118constructorimpl(paymentOptionSelection$paymentsheet_release);
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    }
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl != null) {
                    return new CustomerSheetResult.Selected((PaymentOptionSelection) objM9118constructorimpl2);
                }
                return new CustomerSheetResult.Failed(thM9121exceptionOrNullimpl);
            }
            deferredAsync$default = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object value2 = ((Result) obj).getValue();
            this.L$0 = value2;
            this.label = 2;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait != coroutine_suspended) {
                paymentOption$paymentsheet_release = value2;
                obj = objAwait;
                final Object value3 = ((Result) obj).getValue();
                if (Result.m9125isSuccessimpl(paymentOption$paymentsheet_release)) {
                }
                objM9118constructorimpl = Result.m9118constructorimpl(paymentOption$paymentsheet_release);
                CustomerSheet customerSheet2 = CustomerSheet.this;
                CustomerSheetConfigureRequest customerSheetConfigureRequest2 = this.$request;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl != null) {
                }
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentMethod invokeSuspend$lambda$3$lambda$2(Object obj, CustomerAdapter.PaymentOption paymentOption, String str) {
            Object obj2 = null;
            if (Result.m9124isFailureimpl(obj)) {
                obj = null;
            }
            List list = (List) obj;
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((PaymentMethod) next).id, paymentOption.getId())) {
                    obj2 = next;
                    break;
                }
            }
            return (PaymentMethod) obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomerSheetResult(InternalCustomerSheetResult result) {
        this.callback.onCustomerSheetResult(result.toPublicResult(this.paymentOptionFactory));
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u0001:\u000212By\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0016J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020+J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00063"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "Landroid/os/Parcelable;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "googlePayEnabled", "", "headerTextForSelectionScreen", "", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "merchantDisplayName", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V", "(Ljava/lang/String;)V", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getGooglePayEnabled", "()Z", "getHeaderTextForSelectionScreen", "()Ljava/lang/String;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getMerchantDisplayName", "getPreferredNetworks", "()Ljava/util/List;", "getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release", "getPaymentMethodOrder$paymentsheet_release", "getCardBrandAcceptance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Configuration implements Parcelable {
        private final boolean allowsRemovalOfLastSavedPaymentMethod;
        private final PaymentSheet.Appearance appearance;
        private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
        private final PaymentSheet.BillingDetails defaultBillingDetails;
        private final boolean googlePayEnabled;
        private final String headerTextForSelectionScreen;
        private final String merchantDisplayName;
        private final List<String> paymentMethodOrder;
        private final List<CardBrand> preferredNetworks;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CustomerSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSheet.Appearance appearanceCreateFromParcel = PaymentSheet.Appearance.CREATOR.createFromParcel(parcel);
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                String string = parcel.readString();
                PaymentSheet.BillingDetails billingDetailsCreateFromParcel = PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel);
                PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = i; i3 != i2; i3++) {
                    arrayList.add(CardBrand.valueOf(parcel.readString()));
                }
                return new Configuration(appearanceCreateFromParcel, z, string, billingDetailsCreateFromParcel, billingDetailsCollectionConfigurationCreateFromParcel, string2, arrayList, parcel.readInt() != 0 ? 1 : i, parcel.createStringArrayList(), (PaymentSheet.CardBrandAcceptance) parcel.readParcelable(Configuration.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        @JvmStatic
        public static final Builder builder(String str) {
            return INSTANCE.builder(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.appearance, configuration.appearance) && this.googlePayEnabled == configuration.googlePayEnabled && Intrinsics.areEqual(this.headerTextForSelectionScreen, configuration.headerTextForSelectionScreen) && Intrinsics.areEqual(this.defaultBillingDetails, configuration.defaultBillingDetails) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.merchantDisplayName, configuration.merchantDisplayName) && Intrinsics.areEqual(this.preferredNetworks, configuration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == configuration.allowsRemovalOfLastSavedPaymentMethod && Intrinsics.areEqual(this.paymentMethodOrder, configuration.paymentMethodOrder) && Intrinsics.areEqual(this.cardBrandAcceptance, configuration.cardBrandAcceptance);
        }

        public int hashCode() {
            int iHashCode = ((this.appearance.hashCode() * 31) + Boolean.hashCode(this.googlePayEnabled)) * 31;
            String str = this.headerTextForSelectionScreen;
            return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultBillingDetails.hashCode()) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.merchantDisplayName.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.cardBrandAcceptance.hashCode();
        }

        public String toString() {
            return "Configuration(appearance=" + this.appearance + ", googlePayEnabled=" + this.googlePayEnabled + ", headerTextForSelectionScreen=" + this.headerTextForSelectionScreen + ", defaultBillingDetails=" + this.defaultBillingDetails + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", merchantDisplayName=" + this.merchantDisplayName + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ", paymentMethodOrder=" + this.paymentMethodOrder + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.appearance.writeToParcel(dest, flags);
            dest.writeInt(this.googlePayEnabled ? 1 : 0);
            dest.writeString(this.headerTextForSelectionScreen);
            this.defaultBillingDetails.writeToParcel(dest, flags);
            this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
            dest.writeString(this.merchantDisplayName);
            List<CardBrand> list = this.preferredNetworks;
            dest.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.allowsRemovalOfLastSavedPaymentMethod ? 1 : 0);
            dest.writeStringList(this.paymentMethodOrder);
            dest.writeParcelable(this.cardBrandAcceptance, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(PaymentSheet.Appearance appearance, boolean z, String str, PaymentSheet.BillingDetails defaultBillingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, String merchantDisplayName, List<? extends CardBrand> preferredNetworks, boolean z2, List<String> paymentMethodOrder, PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(defaultBillingDetails, "defaultBillingDetails");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
            Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
            this.appearance = appearance;
            this.googlePayEnabled = z;
            this.headerTextForSelectionScreen = str;
            this.defaultBillingDetails = defaultBillingDetails;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.merchantDisplayName = merchantDisplayName;
            this.preferredNetworks = preferredNetworks;
            this.allowsRemovalOfLastSavedPaymentMethod = z2;
            this.paymentMethodOrder = paymentMethodOrder;
            this.cardBrandAcceptance = cardBrandAcceptance;
        }

        public /* synthetic */ Configuration(PaymentSheet.Appearance appearance, boolean z, String str, PaymentSheet.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, String str2, List list, boolean z2, List list2, PaymentSheet.CardBrandAcceptance cardBrandAcceptance, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ConfigurationDefaults.INSTANCE.getAppearance() : appearance, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ConfigurationDefaults.INSTANCE.getHeaderTextForSelectionScreen() : str, (i & 8) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetails() : billingDetails, (i & 16) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration() : billingDetailsCollectionConfiguration, str2, (i & 64) != 0 ? ConfigurationDefaults.INSTANCE.getPreferredNetworks() : list, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? ConfigurationDefaults.INSTANCE.getPaymentMethodOrder() : list2, (i & 512) != 0 ? ConfigurationDefaults.INSTANCE.getCardBrandAcceptance() : cardBrandAcceptance);
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final boolean getGooglePayEnabled() {
            return this.googlePayEnabled;
        }

        public final String getHeaderTextForSelectionScreen() {
            return this.headerTextForSelectionScreen;
        }

        public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        public final List<CardBrand> getPreferredNetworks() {
            return this.preferredNetworks;
        }

        /* renamed from: getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release, reason: from getter */
        public final boolean getAllowsRemovalOfLastSavedPaymentMethod() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        public final List<String> getPaymentMethodOrder$paymentsheet_release() {
            return this.paymentMethodOrder;
        }

        /* renamed from: getCardBrandAcceptance$paymentsheet_release, reason: from getter */
        public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName) {
            this(ConfigurationDefaults.INSTANCE.getAppearance(), false, ConfigurationDefaults.INSTANCE.getHeaderTextForSelectionScreen(), ConfigurationDefaults.INSTANCE.getBillingDetails(), ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration(), merchantDisplayName, null, true, null, null, 832, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        public final Builder newBuilder() {
            return new Builder(this.merchantDisplayName).appearance(this.appearance).googlePayEnabled(this.googlePayEnabled).headerTextForSelectionScreen(this.headerTextForSelectionScreen).defaultBillingDetails(this.defaultBillingDetails).billingDetailsCollectionConfiguration(this.billingDetailsCollectionConfiguration).allowsRemovalOfLastSavedPaymentMethod(this.allowsRemovalOfLastSavedPaymentMethod).paymentMethodOrder(this.paymentMethodOrder);
        }

        /* compiled from: CustomerSheet.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;", "", "merchantDisplayName", "", "<init>", "(Ljava/lang/String;)V", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "googlePayEnabled", "", "headerTextForSelectionScreen", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "details", "configuration", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowsRemovalOfLastSavedPaymentMethod;
            private PaymentSheet.Appearance appearance;
            private PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
            private PaymentSheet.CardBrandAcceptance cardBrandAcceptance;
            private PaymentSheet.BillingDetails defaultBillingDetails;
            private boolean googlePayEnabled;
            private String headerTextForSelectionScreen;
            private final String merchantDisplayName;
            private List<String> paymentMethodOrder;
            private List<? extends CardBrand> preferredNetworks;

            public Builder(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.appearance = ConfigurationDefaults.INSTANCE.getAppearance();
                this.headerTextForSelectionScreen = ConfigurationDefaults.INSTANCE.getHeaderTextForSelectionScreen();
                this.defaultBillingDetails = ConfigurationDefaults.INSTANCE.getBillingDetails();
                this.billingDetailsCollectionConfiguration = ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration();
                this.preferredNetworks = ConfigurationDefaults.INSTANCE.getPreferredNetworks();
                this.allowsRemovalOfLastSavedPaymentMethod = true;
                this.paymentMethodOrder = ConfigurationDefaults.INSTANCE.getPaymentMethodOrder();
                this.cardBrandAcceptance = ConfigurationDefaults.INSTANCE.getCardBrandAcceptance();
            }

            public final Builder appearance(PaymentSheet.Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Builder googlePayEnabled(boolean googlePayEnabled) {
                this.googlePayEnabled = googlePayEnabled;
                return this;
            }

            public final Builder headerTextForSelectionScreen(String headerTextForSelectionScreen) {
                this.headerTextForSelectionScreen = headerTextForSelectionScreen;
                return this;
            }

            public final Builder defaultBillingDetails(PaymentSheet.BillingDetails details) {
                Intrinsics.checkNotNullParameter(details, "details");
                this.defaultBillingDetails = details;
                return this;
            }

            public final Builder billingDetailsCollectionConfiguration(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.billingDetailsCollectionConfiguration = configuration;
                return this;
            }

            public final Builder preferredNetworks(List<? extends CardBrand> preferredNetworks) {
                Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
                this.preferredNetworks = preferredNetworks;
                return this;
            }

            public final Builder allowsRemovalOfLastSavedPaymentMethod(boolean allowsRemovalOfLastSavedPaymentMethod) {
                this.allowsRemovalOfLastSavedPaymentMethod = allowsRemovalOfLastSavedPaymentMethod;
                return this;
            }

            public final Builder paymentMethodOrder(List<String> paymentMethodOrder) {
                Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
                this.paymentMethodOrder = paymentMethodOrder;
                return this;
            }

            public final Builder cardBrandAcceptance(PaymentSheet.CardBrandAcceptance cardBrandAcceptance) {
                Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
                this.cardBrandAcceptance = cardBrandAcceptance;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.appearance, this.googlePayEnabled, this.headerTextForSelectionScreen, this.defaultBillingDetails, this.billingDetailsCollectionConfiguration, this.merchantDisplayName, this.preferredNetworks, this.allowsRemovalOfLastSavedPaymentMethod, this.paymentMethodOrder, this.cardBrandAcceptance);
            }
        }

        /* compiled from: CustomerSheet.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Companion;", "", "<init>", "()V", "builder", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration$Builder;", "merchantDisplayName", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Builder builder(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                return new Builder(merchantDisplayName);
            }
        }
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0017\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;", "", "paymentMethodTypes", "", "", "<init>", "(Ljava/util/List;)V", "getPaymentMethodTypes$paymentsheet_release", "()Ljava/util/List;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IntentConfiguration {
        public static final int $stable = 8;
        private final List<String> paymentMethodTypes;

        public IntentConfiguration(List<String> paymentMethodTypes) {
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            this.paymentMethodTypes = paymentMethodTypes;
        }

        public final List<String> getPaymentMethodTypes$paymentsheet_release() {
            return this.paymentMethodTypes;
        }

        /* compiled from: CustomerSheet.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration$Builder;", "", "<init>", "()V", "paymentMethodTypes", "", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private List<String> paymentMethodTypes = CollectionsKt.emptyList();

            public final Builder paymentMethodTypes(List<String> paymentMethodTypes) {
                Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
                this.paymentMethodTypes = paymentMethodTypes;
                return this;
            }

            public final IntentConfiguration build() {
                return new IntentConfiguration(this.paymentMethodTypes);
            }
        }
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;", "", "customerId", "", "clientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId$paymentsheet_release", "()Ljava/lang/String;", "getClientSecret$paymentsheet_release", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomerSessionClientSecret {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String clientSecret;
        private final String customerId;

        @JvmStatic
        public static final CustomerSessionClientSecret create(String str, String str2) {
            return INSTANCE.create(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerSessionClientSecret)) {
                return false;
            }
            CustomerSessionClientSecret customerSessionClientSecret = (CustomerSessionClientSecret) obj;
            return Intrinsics.areEqual(this.customerId, customerSessionClientSecret.customerId) && Intrinsics.areEqual(this.clientSecret, customerSessionClientSecret.clientSecret);
        }

        public int hashCode() {
            return (this.customerId.hashCode() * 31) + this.clientSecret.hashCode();
        }

        public String toString() {
            return "CustomerSessionClientSecret(customerId=" + this.customerId + ", clientSecret=" + this.clientSecret + ")";
        }

        public CustomerSessionClientSecret(String customerId, String clientSecret) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.customerId = customerId;
            this.clientSecret = clientSecret;
        }

        /* renamed from: getCustomerId$paymentsheet_release, reason: from getter */
        public final String getCustomerId() {
            return this.customerId;
        }

        /* renamed from: getClientSecret$paymentsheet_release, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* compiled from: CustomerSheet.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;", "customerId", "", "clientSecret", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CustomerSessionClientSecret create(String customerId, String clientSecret) {
                Intrinsics.checkNotNullParameter(customerId, "customerId");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new CustomerSessionClientSecret(customerId, clientSecret);
            }
        }
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H¦@¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;", "", "<init>", "()V", "intentConfiguration", "Lkotlin/Result;", "Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;", "intentConfiguration-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideSetupIntentClientSecret", "", "customerId", "provideSetupIntentClientSecret-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "providesCustomerSessionClientSecret", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;", "providesCustomerSessionClientSecret-IoAF18A", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CustomerSessionProvider {
        public static final int $stable = 0;

        /* renamed from: intentConfiguration-IoAF18A, reason: not valid java name */
        public Object m7242intentConfigurationIoAF18A(Continuation<? super Result<IntentConfiguration>> continuation) {
            return m7241intentConfigurationIoAF18A$suspendImpl(this, continuation);
        }

        /* renamed from: provideSetupIntentClientSecret-gIAlu-s, reason: not valid java name */
        public abstract Object m7243provideSetupIntentClientSecretgIAlus(String str, Continuation<? super Result<String>> continuation);

        /* renamed from: providesCustomerSessionClientSecret-IoAF18A, reason: not valid java name */
        public abstract Object m7244providesCustomerSessionClientSecretIoAF18A(Continuation<? super Result<CustomerSessionClientSecret>> continuation);

        /* renamed from: intentConfiguration-IoAF18A$suspendImpl, reason: not valid java name */
        static /* synthetic */ Object m7241intentConfigurationIoAF18A$suspendImpl(CustomerSessionProvider customerSessionProvider, Continuation<? super Result<IntentConfiguration>> continuation) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(new IntentConfiguration.Builder().build());
        }
    }

    /* compiled from: CustomerSheet.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007JM\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001eJ%\u0010\u001f\u001a\u0004\u0018\u00010 *\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&¨\u0006'"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheet$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/customersheet/CustomerSheet;", "activity", "Landroidx/activity/ComponentActivity;", "customerAdapter", "Lcom/stripe/android/customersheet/CustomerAdapter;", "callback", "Lcom/stripe/android/customersheet/CustomerSheetResultCallback;", "customerSessionProvider", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;", "fragment", "Landroidx/fragment/app/Fragment;", "getInstance", "application", "Landroid/app/Application;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "statusBarColor", "Lkotlin/Function0;", "", "integration", "Lcom/stripe/android/customersheet/CustomerSheetIntegration;", "getInstance$paymentsheet_release", "toPaymentOptionSelection", "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "canUseGooglePay", "", "toPaymentOptionSelection$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CustomerSheet create(final ComponentActivity activity, CustomerAdapter customerAdapter, CustomerSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(customerAdapter, "customerAdapter");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return getInstance$paymentsheet_release(application, activity, activity, activity, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheet$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheet.Companion.create$lambda$0(activity);
                }
            }, new CustomerSheetIntegration.Adapter(customerAdapter), callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer create$lambda$0(ComponentActivity componentActivity) {
            return Integer.valueOf(componentActivity.getWindow().getStatusBarColor());
        }

        @JvmStatic
        public final CustomerSheet create(final ComponentActivity activity, CustomerSessionProvider customerSessionProvider, CustomerSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(customerSessionProvider, "customerSessionProvider");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return getInstance$paymentsheet_release(application, activity, activity, activity, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheet$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheet.Companion.create$lambda$1(activity);
                }
            }, new CustomerSheetIntegration.CustomerSession(customerSessionProvider), callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer create$lambda$1(ComponentActivity componentActivity) {
            return Integer.valueOf(componentActivity.getWindow().getStatusBarColor());
        }

        @JvmStatic
        public final CustomerSheet create(final Fragment fragment, CustomerAdapter customerAdapter, CustomerSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(customerAdapter, "customerAdapter");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Application application = fragment.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            Object host = fragment.getHost();
            FragmentActivity fragmentActivity = host instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) host : null;
            if (fragmentActivity == null) {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                fragmentActivity = fragmentActivityRequireActivity;
            }
            return getInstance$paymentsheet_release(application, fragment, fragment, fragmentActivity, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheet$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheet.Companion.create$lambda$2(fragment);
                }
            }, new CustomerSheetIntegration.Adapter(customerAdapter), callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer create$lambda$2(Fragment fragment) {
            Window window;
            FragmentActivity activity = fragment.getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }

        @JvmStatic
        public final CustomerSheet create(final Fragment fragment, CustomerSessionProvider customerSessionProvider, CustomerSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(customerSessionProvider, "customerSessionProvider");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Application application = fragment.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            Object host = fragment.getHost();
            FragmentActivity fragmentActivity = host instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) host : null;
            if (fragmentActivity == null) {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                fragmentActivity = fragmentActivityRequireActivity;
            }
            return getInstance$paymentsheet_release(application, fragment, fragment, fragmentActivity, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheet$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheet.Companion.create$lambda$3(fragment);
                }
            }, new CustomerSheetIntegration.CustomerSession(customerSessionProvider), callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Integer create$lambda$3(Fragment fragment) {
            Window window;
            FragmentActivity activity = fragment.getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }

        public final CustomerSheet getInstance$paymentsheet_release(Application application, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, Function0<Integer> statusBarColor, CustomerSheetIntegration integration, CustomerSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
            Intrinsics.checkNotNullParameter(integration, "integration");
            Intrinsics.checkNotNullParameter(callback, "callback");
            CustomerSheetHacks.INSTANCE.initialize(application, lifecycleOwner, integration);
            CustomerSheetIntegration.Type type = integration.getType();
            Resources resources = application.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Application application2 = application;
            return new CustomerSheet(application, lifecycleOwner, activityResultRegistryOwner, viewModelStoreOwner, type, new PaymentOptionFactory(new PaymentSelection.IconLoader(resources, new StripeImageLoader(application2, null, null, null, null, 30, null)), application2), callback, statusBarColor);
        }

        public final PaymentOptionSelection toPaymentOptionSelection$paymentsheet_release(PaymentSelection paymentSelection, PaymentOptionFactory paymentOptionFactory, boolean z) {
            Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
            if (paymentSelection instanceof PaymentSelection.GooglePay) {
                return z ? new PaymentOptionSelection.GooglePay(paymentOptionFactory.create(paymentSelection)) : null;
            }
            if (paymentSelection instanceof PaymentSelection.Saved) {
                return new PaymentOptionSelection.PaymentMethod(((PaymentSelection.Saved) paymentSelection).getPaymentMethod(), paymentOptionFactory.create(paymentSelection));
            }
            return null;
        }
    }
}
