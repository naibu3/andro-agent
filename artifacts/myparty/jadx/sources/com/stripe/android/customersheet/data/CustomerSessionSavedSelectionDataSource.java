package com.stripe.android.customersheet.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import com.stripe.android.customersheet.util.SyncDefaultPaymentMethodUtilsKt;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SavedSelectionKt;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerSessionSavedSelectionDataSource.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B<\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0082@¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0002\u0010!J \u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0082@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "elementsSessionManager", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "prefsRepositoryFactory", "Lkotlin/Function1;", "", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V", "retrieveSavedSelection", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "customerSessionElementsSession", "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;", "(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useDefaultPaymentMethodFromBackend", "customer", "Lcom/stripe/android/model/ElementsSession$Customer;", "useLocallySavedSelection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSavedSelection", "", BaseSheetViewModel.SAVE_SELECTION, "shouldSyncDefault", "", "(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSelectionToPrefs", "(Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSelectionToBackend", "ephemeralKey", "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;", "(Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPrefsRepository", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSessionSavedSelectionDataSource implements CustomerSheetSavedSelectionDataSource {
    public static final int $stable = 8;
    private final CustomerRepository customerRepository;
    private final CustomerSessionElementsSessionManager elementsSessionManager;
    private final Function1<String, PrefsRepository> prefsRepositoryFactory;
    private final CoroutineContext workContext;

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource", f = "CustomerSessionSavedSelectionDataSource.kt", i = {0}, l = {111}, m = "createPrefsRepository", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$createPrefsRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSessionSavedSelectionDataSource.this.createPrefsRepository(this);
        }
    }

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {100}, m = "saveSelectionToBackend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$saveSelectionToBackend$1, reason: invalid class name and case insensitive filesystem */
    static final class C08461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C08461(Continuation<? super C08461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSessionSavedSelectionDataSource.this.saveSelectionToBackend(null, null, this);
        }
    }

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource", f = "CustomerSessionSavedSelectionDataSource.kt", i = {0}, l = {86}, m = "saveSelectionToPrefs", n = {BaseSheetViewModel.SAVE_SELECTION}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$saveSelectionToPrefs$1, reason: invalid class name and case insensitive filesystem */
    static final class C08471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08471(Continuation<? super C08471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSessionSavedSelectionDataSource.this.saveSelectionToPrefs(null, this);
        }
    }

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, 56}, m = "useLocallySavedSelection", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$useLocallySavedSelection$1, reason: invalid class name and case insensitive filesystem */
    static final class C08491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08491(Continuation<? super C08491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSessionSavedSelectionDataSource.this.useLocallySavedSelection(this);
        }
    }

    @Inject
    public CustomerSessionSavedSelectionDataSource(CustomerSessionElementsSessionManager elementsSessionManager, CustomerRepository customerRepository, Function1<String, PrefsRepository> prefsRepositoryFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(elementsSessionManager, "elementsSessionManager");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.customerRepository = customerRepository;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.workContext = workContext;
    }

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {28, 34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<SavedSelection>>, Object> {
        final /* synthetic */ CustomerSessionElementsSession $customerSessionElementsSession;
        int label;
        final /* synthetic */ CustomerSessionSavedSelectionDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CustomerSessionElementsSession customerSessionElementsSession, CustomerSessionSavedSelectionDataSource customerSessionSavedSelectionDataSource, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$customerSessionElementsSession = customerSessionElementsSession;
            this.this$0 = customerSessionSavedSelectionDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$customerSessionElementsSession, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<SavedSelection>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        
            if (r5 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo7269fetchElementsSessionIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CustomerSessionElementsSession customerSessionElementsSession = this.$customerSessionElementsSession;
                if (customerSessionElementsSession == null) {
                    this.label = 1;
                    objMo7269fetchElementsSessionIoAF18A = this.this$0.elementsSessionManager.mo7269fetchElementsSessionIoAF18A(this);
                    if (objMo7269fetchElementsSessionIoAF18A != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                Result.Companion companion = Result.INSTANCE;
                objMo7269fetchElementsSessionIoAF18A = Result.m9118constructorimpl(customerSessionElementsSession);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (CustomerSheetDataResult) obj;
                }
                ResultKt.throwOnFailure(obj);
                objMo7269fetchElementsSessionIoAF18A = ((Result) obj).getValue();
            }
            CustomerSessionSavedSelectionDataSource customerSessionSavedSelectionDataSource = this.this$0;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7269fetchElementsSessionIoAF18A);
            if (thM9121exceptionOrNullimpl == null) {
                CustomerSessionElementsSession customerSessionElementsSession2 = (CustomerSessionElementsSession) objMo7269fetchElementsSessionIoAF18A;
                if (SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodsEnabledForCustomerSheet(customerSessionElementsSession2.getElementsSession())) {
                    return customerSessionSavedSelectionDataSource.useDefaultPaymentMethodFromBackend(customerSessionElementsSession2.getCustomer());
                }
                this.label = 2;
                obj = customerSessionSavedSelectionDataSource.useLocallySavedSelection(this);
            } else {
                return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
            }
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource
    public Object retrieveSavedSelection(CustomerSessionElementsSession customerSessionElementsSession, Continuation<? super CustomerSheetDataResult<SavedSelection>> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(customerSessionElementsSession, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSheetDataResult<SavedSelection> useDefaultPaymentMethodFromBackend(ElementsSession.Customer customer) {
        PaymentSelection defaultPaymentMethodAsPaymentSelection = SyncDefaultPaymentMethodUtilsKt.getDefaultPaymentMethodAsPaymentSelection(customer.getPaymentMethods(), customer.getDefaultPaymentMethod());
        return CustomerSheetDataResult.INSTANCE.success(defaultPaymentMethodAsPaymentSelection != null ? SavedSelectionKt.toSavedSelection(defaultPaymentMethodAsPaymentSelection) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object useLocallySavedSelection(Continuation<? super CustomerSheetDataResult<SavedSelection>> continuation) {
        C08491 c08491;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        CustomerSheetDataResult.Companion companion;
        if (continuation instanceof C08491) {
            c08491 = (C08491) continuation;
            if ((c08491.label & Integer.MIN_VALUE) != 0) {
                c08491.label -= Integer.MIN_VALUE;
            } else {
                c08491 = new C08491(continuation);
            }
        }
        Object objCreatePrefsRepository = c08491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08491.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(objCreatePrefsRepository);
            c08491.label = 1;
            objCreatePrefsRepository = createPrefsRepository(c08491);
            if (objCreatePrefsRepository != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (CustomerSheetDataResult.Companion) c08491.L$0;
            ResultKt.throwOnFailure(objCreatePrefsRepository);
            objM9118constructorimpl = Result.m9118constructorimpl(companion.success((SavedSelection) objCreatePrefsRepository));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                return (CustomerSheetDataResult.Success) objM9118constructorimpl;
            }
            return CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
        }
        ResultKt.throwOnFailure(objCreatePrefsRepository);
        CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) objCreatePrefsRepository;
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            Result.Companion companion3 = Result.INSTANCE;
            CustomerSheetDataResult.Companion companion4 = CustomerSheetDataResult.INSTANCE;
            PrefsRepository prefsRepository = (PrefsRepository) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue();
            c08491.L$0 = companion4;
            c08491.label = 2;
            objCreatePrefsRepository = prefsRepository.getSavedSelection(true, false, c08491);
            if (objCreatePrefsRepository != coroutine_suspended) {
                companion = companion4;
                objM9118constructorimpl = Result.m9118constructorimpl(companion.success((SavedSelection) objCreatePrefsRepository));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
            }
            return coroutine_suspended;
        }
        if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerSheetDataResult.Failure failure = (CustomerSheetDataResult.Failure) customerSheetDataResult;
        return CustomerSheetDataResult.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    /* compiled from: CustomerSessionSavedSelectionDataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$setSavedSelection$2", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {73, 75, 77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$setSavedSelection$2, reason: invalid class name and case insensitive filesystem */
    static final class C08482 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<Unit>>, Object> {
        final /* synthetic */ SavedSelection $selection;
        final /* synthetic */ boolean $shouldSyncDefault;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08482(boolean z, SavedSelection savedSelection, Continuation<? super C08482> continuation) {
            super(2, continuation);
            this.$shouldSyncDefault = z;
            this.$selection = savedSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSessionSavedSelectionDataSource.this.new C08482(this.$shouldSyncDefault, this.$selection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<Unit>> continuation) {
            return ((C08482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        
            if (r4.saveSelectionToPrefs(r5, r7) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objCreateFailure = ResultKt.createFailure(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objCreateFailure = CustomerSessionSavedSelectionDataSource.this.elementsSessionManager.mo7268fetchCustomerSessionEphemeralKeyIoAF18A(this);
                if (objCreateFailure != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
            }
            ResultKt.throwOnFailure(obj);
            objCreateFailure = ((Result) obj).getValue();
            boolean z = this.$shouldSyncDefault;
            CustomerSessionSavedSelectionDataSource customerSessionSavedSelectionDataSource = CustomerSessionSavedSelectionDataSource.this;
            SavedSelection savedSelection = this.$selection;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion2 = Result.INSTANCE;
                CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) objCreateFailure;
                if (z) {
                    this.label = 2;
                    if (customerSessionSavedSelectionDataSource.saveSelectionToBackend(cachedCustomerEphemeralKey, savedSelection, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                } else {
                    this.label = 3;
                }
                return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
        }
    }

    @Override // com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource
    public Object setSavedSelection(SavedSelection savedSelection, boolean z, Continuation<? super CustomerSheetDataResult<Unit>> continuation) {
        return BuildersKt.withContext(this.workContext, new C08482(z, savedSelection, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveSelectionToPrefs(SavedSelection savedSelection, Continuation<? super Unit> continuation) {
        C08471 c08471;
        Object objM9118constructorimpl;
        CustomerSheetDataResult.Companion companion;
        if (continuation instanceof C08471) {
            c08471 = (C08471) continuation;
            if ((c08471.label & Integer.MIN_VALUE) != 0) {
                c08471.label -= Integer.MIN_VALUE;
            } else {
                c08471 = new C08471(continuation);
            }
        }
        Object objCreatePrefsRepository = c08471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08471.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objCreatePrefsRepository);
            c08471.L$0 = savedSelection;
            c08471.label = 1;
            objCreatePrefsRepository = createPrefsRepository(c08471);
            if (objCreatePrefsRepository == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            savedSelection = (SavedSelection) c08471.L$0;
            ResultKt.throwOnFailure(objCreatePrefsRepository);
        }
        CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) objCreatePrefsRepository;
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                companion = CustomerSheetDataResult.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (!((PrefsRepository) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue()).setSavedSelection(savedSelection)) {
                throw new IOException("Unable to persist payment option " + savedSelection);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(companion.success(Unit.INSTANCE));
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
            } else {
                CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
            }
        } else {
            if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerSheetDataResult.Failure failure = (CustomerSheetDataResult.Failure) customerSheetDataResult;
            CustomerSheetDataResult.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveSelectionToBackend(CachedCustomerEphemeralKey cachedCustomerEphemeralKey, SavedSelection savedSelection, Continuation<? super Unit> continuation) {
        C08461 c08461;
        Object objMo8418setDefaultPaymentMethod0E7RQCE;
        if (continuation instanceof C08461) {
            c08461 = (C08461) continuation;
            if ((c08461.label & Integer.MIN_VALUE) != 0) {
                c08461.label -= Integer.MIN_VALUE;
            } else {
                c08461 = new C08461(continuation);
            }
        }
        Object obj = c08461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08461.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SavedSelection.PaymentMethod paymentMethod = savedSelection instanceof SavedSelection.PaymentMethod ? (SavedSelection.PaymentMethod) savedSelection : null;
            String id = paymentMethod != null ? paymentMethod.getId() : null;
            CustomerRepository customerRepository = this.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(cachedCustomerEphemeralKey.getCustomerId(), cachedCustomerEphemeralKey.getEphemeralKey(), cachedCustomerEphemeralKey.getCustomerSessionClientSecret());
            c08461.label = 1;
            objMo8418setDefaultPaymentMethod0E7RQCE = customerRepository.mo8418setDefaultPaymentMethod0E7RQCE(customerInfo, id, c08461);
            if (objMo8418setDefaultPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8418setDefaultPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objMo8418setDefaultPaymentMethod0E7RQCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPrefsRepository(Continuation<? super CustomerSheetDataResult<PrefsRepository>> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo7268fetchCustomerSessionEphemeralKeyIoAF18A;
        CustomerSessionSavedSelectionDataSource customerSessionSavedSelectionDataSource;
        Object objM9118constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CustomerSessionElementsSessionManager customerSessionElementsSessionManager = this.elementsSessionManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objMo7268fetchCustomerSessionEphemeralKeyIoAF18A = customerSessionElementsSessionManager.mo7268fetchCustomerSessionEphemeralKeyIoAF18A(anonymousClass1);
            if (objMo7268fetchCustomerSessionEphemeralKeyIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerSessionSavedSelectionDataSource = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customerSessionSavedSelectionDataSource = (CustomerSessionSavedSelectionDataSource) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7268fetchCustomerSessionEphemeralKeyIoAF18A = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo7268fetchCustomerSessionEphemeralKeyIoAF18A)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(customerSessionSavedSelectionDataSource.prefsRepositoryFactory.invoke(((CachedCustomerEphemeralKey) objMo7268fetchCustomerSessionEphemeralKeyIoAF18A).getCustomerId()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objMo7268fetchCustomerSessionEphemeralKeyIoAF18A = ResultKt.createFailure(th);
            }
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo7268fetchCustomerSessionEphemeralKeyIoAF18A);
        }
        return CustomerSheetDataResultKtxKt.toCustomerSheetDataResult(objM9118constructorimpl);
    }
}
