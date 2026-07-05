package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationResult;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewAction;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BacsMandateConfirmationViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel$Args;", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel$Args;)V", "_result", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlinx/coroutines/flow/SharedFlow;", "getResult", "()Lkotlinx/coroutines/flow/SharedFlow;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewState;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "", "action", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;", "onConfirmPress", "onModifyDetailsPressed", "onBackPress", "buildPayer", "Lcom/stripe/android/core/strings/ResolvableString;", "buildAddressAsHtml", "buildGuarantee", "Args", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BacsMandateConfirmationViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableSharedFlow<BacsMandateConfirmationResult> _result;
    private final MutableStateFlow<BacsMandateConfirmationViewState> _viewState;
    private final SharedFlow<BacsMandateConfirmationResult> result;
    private final StateFlow<BacsMandateConfirmationViewState> viewState;

    public BacsMandateConfirmationViewModel(Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        MutableSharedFlow<BacsMandateConfirmationResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<BacsMandateConfirmationViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new BacsMandateConfirmationViewState(args.getEmail(), args.getNameOnAccount(), CollectionsKt.joinToString$default(StringsKt.chunked(args.getSortCode(), 2), "-", null, null, 0, null, null, 62, null), args.getAccountNumber(), buildPayer(), buildAddressAsHtml(), buildGuarantee()));
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final SharedFlow<BacsMandateConfirmationResult> getResult() {
        return this.result;
    }

    public final StateFlow<BacsMandateConfirmationViewState> getViewState() {
        return this.viewState;
    }

    public final void handleViewAction(BacsMandateConfirmationViewAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof BacsMandateConfirmationViewAction.OnConfirmPressed) {
            onConfirmPress();
        } else if (action instanceof BacsMandateConfirmationViewAction.OnModifyDetailsPressed) {
            onModifyDetailsPressed();
        } else {
            if (!(action instanceof BacsMandateConfirmationViewAction.OnBackPressed)) {
                throw new NoWhenBranchMatchedException();
            }
            onBackPress();
        }
    }

    /* compiled from: BacsMandateConfirmationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onConfirmPress$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onConfirmPress$1, reason: invalid class name and case insensitive filesystem */
    static final class C11281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11281(Continuation<? super C11281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BacsMandateConfirmationViewModel.this.new C11281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BacsMandateConfirmationViewModel.this._result.emit(BacsMandateConfirmationResult.Confirmed.INSTANCE, this) == coroutine_suspended) {
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

    private final void onConfirmPress() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11281(null), 3, null);
    }

    /* compiled from: BacsMandateConfirmationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onModifyDetailsPressed$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onModifyDetailsPressed$1, reason: invalid class name and case insensitive filesystem */
    static final class C11291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11291(Continuation<? super C11291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BacsMandateConfirmationViewModel.this.new C11291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BacsMandateConfirmationViewModel.this._result.emit(BacsMandateConfirmationResult.ModifyDetails.INSTANCE, this) == coroutine_suspended) {
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

    private final void onModifyDetailsPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11291(null), 3, null);
    }

    /* compiled from: BacsMandateConfirmationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onBackPress$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onBackPress$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BacsMandateConfirmationViewModel.this.new AnonymousClass1(continuation);
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
                if (BacsMandateConfirmationViewModel.this._result.emit(BacsMandateConfirmationResult.Cancelled.INSTANCE, this) == coroutine_suspended) {
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

    private final void onBackPress() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final ResolvableString buildPayer() {
        return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_notice_default_payer);
    }

    private final ResolvableString buildAddressAsHtml() {
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bacs_support_address_format, new Object[]{ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_address_line_one), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_address_line_two), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_email), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_email)}, null, 4, null);
    }

    private final ResolvableString buildGuarantee() {
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bacs_guarantee_format, new Object[]{ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_guarantee_url), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_guarantee)}, null, 4, null);
    }

    /* compiled from: BacsMandateConfirmationViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel$Args;", "", "email", "", "nameOnAccount", "sortCode", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getNameOnAccount", "getSortCode", "getAccountNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String email;
        private final String nameOnAccount;
        private final String sortCode;

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.email;
            }
            if ((i & 2) != 0) {
                str2 = args.nameOnAccount;
            }
            if ((i & 4) != 0) {
                str3 = args.sortCode;
            }
            if ((i & 8) != 0) {
                str4 = args.accountNumber;
            }
            return args.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNameOnAccount() {
            return this.nameOnAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Args copy(String email, String nameOnAccount, String sortCode, String accountNumber) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(nameOnAccount, "nameOnAccount");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(email, nameOnAccount, sortCode, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.email, args.email) && Intrinsics.areEqual(this.nameOnAccount, args.nameOnAccount) && Intrinsics.areEqual(this.sortCode, args.sortCode) && Intrinsics.areEqual(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.nameOnAccount.hashCode()) * 31) + this.sortCode.hashCode()) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(email=" + this.email + ", nameOnAccount=" + this.nameOnAccount + ", sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ")";
        }

        public Args(String email, String nameOnAccount, String sortCode, String accountNumber) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(nameOnAccount, "nameOnAccount");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.email = email;
            this.nameOnAccount = nameOnAccount;
            this.sortCode = sortCode;
            this.accountNumber = accountNumber;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getNameOnAccount() {
            return this.nameOnAccount;
        }

        public final String getSortCode() {
            return this.sortCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: BacsMandateConfirmationViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final BacsMandateConfirmationContract.Args args;

        public Factory(BacsMandateConfirmationContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new BacsMandateConfirmationViewModel(new Args(this.args.getEmail(), this.args.getNameOnAccount(), this.args.getSortCode(), this.args.getAccountNumber()));
        }
    }
}
