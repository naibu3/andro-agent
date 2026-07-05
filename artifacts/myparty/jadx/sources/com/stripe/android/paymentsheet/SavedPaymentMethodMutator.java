package com.stripe.android.paymentsheet;

import androidx.lifecycle.ViewModelKt;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.NavigationHandler;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.PaymentOptionsItemsMapper;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0095\u0003\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018\u0012á\u0001\u0010\u0019\u001aÜ\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012+\u0012)\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b('\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003\u0012\u0006\u0010+\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-J\u0006\u0010H\u001a\u00020\u0012J\u000e\u0010I\u001a\u00020\u00122\u0006\u0010(\u001a\u00020&J\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010K\u001a\u000200H\u0082@¢\u0006\u0004\bL\u0010MJ\u0016\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u000200H\u0082@¢\u0006\u0002\u0010MJ\u000e\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u001bJ\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120%2\u0006\u0010(\u001a\u00020&H\u0080@¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\u0004\u0018\u00010 2\u0006\u0010(\u001a\u00020&H\u0086@¢\u0006\u0002\u0010SJ<\u0010U\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0014\b\u0002\u0010V\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020&H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010.R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018X\u0082\u0004¢\u0006\u0002\n\u0000Ré\u0001\u0010\u0019\u001aÜ\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012+\u0012)\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b('\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110&¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R.\u00103\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002050\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00102R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00102¨\u0006["}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "", "paymentMethodMetadataFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setSelection", "Lkotlin/Function1;", "", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "prePaymentMethodRemoveActions", "Lkotlin/coroutines/Continuation;", "postPaymentMethodRemoveActions", "Lkotlin/Function0;", "onUpdatePaymentMethod", "Lkotlin/Function5;", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "", "Lkotlin/ParameterName;", "name", "canRemove", "", "performRemove", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "cardUpdateParams", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "updateExecutor", "paymentMethod", "setDefaultPaymentMethodExecutor", "isLinkEnabled", "isNotPaymentFlow", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Z)V", "Lkotlin/jvm/functions/Function1;", "defaultPaymentMethodId", "", "getDefaultPaymentMethodId", "()Lkotlinx/coroutines/flow/StateFlow;", "providePaymentMethodName", "code", "Lcom/stripe/android/core/strings/ResolvableString;", "getProvidePaymentMethodName", "()Lkotlin/jvm/functions/Function1;", "paymentOptionsItemsMapper", "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;", "getPaymentOptionsItemsMapper", "()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;", "paymentOptionsItemsMapper$delegate", "Lkotlin/Lazy;", "paymentOptionsItems", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "getPaymentOptionsItems", "canEdit", "getCanEdit", "_editing", "Lkotlinx/coroutines/flow/MutableStateFlow;", "editing", "getEditing$paymentsheet_release", "toggleEditing", "removePaymentMethod", "removePaymentMethodInternal", "paymentMethodId", "removePaymentMethodInternal-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDeletedPaymentMethodFromState", "updatePaymentMethod", "displayableSavedPaymentMethod", "setDefaultPaymentMethod", "setDefaultPaymentMethod-gIAlu-s$paymentsheet_release", "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePaymentMethodInEditScreen", "modifyCardPaymentMethod", "onSuccess", "modifyCardPaymentMethod-BWLJW6A", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelectedPaymentMethod", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedPaymentMethodMutator {
    private final MutableStateFlow<Boolean> _editing;
    private final StateFlow<Boolean> canEdit;
    private final CoroutineScope coroutineScope;
    private final CustomerRepository customerRepository;
    private final CustomerStateHolder customerStateHolder;
    private final StateFlow<String> defaultPaymentMethodId;
    private final StateFlow<Boolean> editing;
    private final EventReporter eventReporter;
    private final Function5<DisplayableSavedPaymentMethod, Boolean, Function1<? super Continuation<? super Throwable>, ? extends Object>, Function2<? super CardUpdateParams, ? super Continuation<? super Result<PaymentMethod>>, ? extends Object>, Function2<? super PaymentMethod, ? super Continuation<? super Result<Unit>>, ? extends Object>, Unit> onUpdatePaymentMethod;
    private final StateFlow<PaymentMethodMetadata> paymentMethodMetadataFlow;
    private final StateFlow<List<PaymentOptionsItem>> paymentOptionsItems;

    /* renamed from: paymentOptionsItemsMapper$delegate, reason: from kotlin metadata */
    private final Lazy paymentOptionsItemsMapper;
    private final Function0<Unit> postPaymentMethodRemoveActions;
    private final Function1<Continuation<? super Unit>, Object> prePaymentMethodRemoveActions;
    private final Function1<String, ResolvableString> providePaymentMethodName;
    private final StateFlow<PaymentSelection> selection;
    private final Function1<PaymentSelection, Unit> setSelection;
    private final CoroutineContext uiContext;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0}, l = {247}, m = "removePaymentMethodInEditScreen", n = {"this", "paymentMethodId"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1, reason: invalid class name and case insensitive filesystem */
    static final class C11091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11091(Continuation<? super C11091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SavedPaymentMethodMutator.this.removePaymentMethodInEditScreen(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedPaymentMethodMutator(StateFlow<PaymentMethodMetadata> paymentMethodMetadataFlow, EventReporter eventReporter, CoroutineScope coroutineScope, CoroutineContext workContext, CoroutineContext uiContext, CustomerRepository customerRepository, StateFlow<? extends PaymentSelection> selection, Function1<? super PaymentSelection, Unit> setSelection, CustomerStateHolder customerStateHolder, Function1<? super Continuation<? super Unit>, ? extends Object> prePaymentMethodRemoveActions, Function0<Unit> postPaymentMethodRemoveActions, Function5<? super DisplayableSavedPaymentMethod, ? super Boolean, ? super Function1<? super Continuation<? super Throwable>, ? extends Object>, ? super Function2<? super CardUpdateParams, ? super Continuation<? super Result<PaymentMethod>>, ? extends Object>, ? super Function2<? super PaymentMethod, ? super Continuation<? super Result<Unit>>, ? extends Object>, Unit> onUpdatePaymentMethod, final StateFlow<Boolean> isLinkEnabled, final boolean z) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadataFlow, "paymentMethodMetadataFlow");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(setSelection, "setSelection");
        Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
        Intrinsics.checkNotNullParameter(prePaymentMethodRemoveActions, "prePaymentMethodRemoveActions");
        Intrinsics.checkNotNullParameter(postPaymentMethodRemoveActions, "postPaymentMethodRemoveActions");
        Intrinsics.checkNotNullParameter(onUpdatePaymentMethod, "onUpdatePaymentMethod");
        Intrinsics.checkNotNullParameter(isLinkEnabled, "isLinkEnabled");
        this.paymentMethodMetadataFlow = paymentMethodMetadataFlow;
        this.eventReporter = eventReporter;
        this.coroutineScope = coroutineScope;
        this.workContext = workContext;
        this.uiContext = uiContext;
        this.customerRepository = customerRepository;
        this.selection = selection;
        this.setSelection = setSelection;
        this.customerStateHolder = customerStateHolder;
        this.prePaymentMethodRemoveActions = prePaymentMethodRemoveActions;
        this.postPaymentMethodRemoveActions = postPaymentMethodRemoveActions;
        this.onUpdatePaymentMethod = onUpdatePaymentMethod;
        this.defaultPaymentMethodId = StateFlowsKt.combineAsStateFlow(customerStateHolder.getCustomer(), paymentMethodMetadataFlow, new Function2() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SavedPaymentMethodMutator.defaultPaymentMethodId$lambda$0((CustomerState) obj, (PaymentMethodMetadata) obj2);
            }
        });
        this.providePaymentMethodName = new Function1() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedPaymentMethodMutator.providePaymentMethodName$lambda$2(this.f$0, (String) obj);
            }
        };
        this.paymentOptionsItemsMapper = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavedPaymentMethodMutator.paymentOptionsItemsMapper_delegate$lambda$6(this.f$0, isLinkEnabled, z);
            }
        });
        StateFlow<List<PaymentOptionsItem>> stateFlowInvoke = getPaymentOptionsItemsMapper().invoke();
        this.paymentOptionsItems = stateFlowInvoke;
        this.canEdit = StateFlowsKt.combineAsStateFlow(customerStateHolder.getCanRemove(), stateFlowInvoke, new Function2() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SavedPaymentMethodMutator.canEdit$lambda$8(this.f$0, ((Boolean) obj).booleanValue(), (List) obj2));
            }
        });
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._editing = MutableStateFlow;
        this.editing = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(null), 3, null);
    }

    public final StateFlow<String> getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String defaultPaymentMethodId$lambda$0(CustomerState customerState, PaymentMethodMetadata paymentMethodMetadata) {
        CustomerMetadata customerMetadata;
        if (paymentMethodMetadata == null || (customerMetadata = paymentMethodMetadata.getCustomerMetadata()) == null || !customerMetadata.isPaymentMethodSetAsDefaultEnabled() || customerState == null) {
            return null;
        }
        return customerState.getDefaultPaymentMethodId();
    }

    public final Function1<String, ResolvableString> getProvidePaymentMethodName() {
        return this.providePaymentMethodName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString providePaymentMethodName$lambda$2(SavedPaymentMethodMutator savedPaymentMethodMutator, String str) {
        ResolvableString displayName = null;
        if (str != null) {
            PaymentMethodMetadata value = savedPaymentMethodMutator.paymentMethodMetadataFlow.getValue();
            SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = value != null ? value.supportedPaymentMethodForCode(str) : null;
            if (supportedPaymentMethodSupportedPaymentMethodForCode != null) {
                displayName = supportedPaymentMethodSupportedPaymentMethodForCode.getDisplayName();
            }
        }
        return ResolvableStringUtilsKt.orEmpty(displayName);
    }

    private final PaymentOptionsItemsMapper getPaymentOptionsItemsMapper() {
        return (PaymentOptionsItemsMapper) this.paymentOptionsItemsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentOptionsItemsMapper paymentOptionsItemsMapper_delegate$lambda$6(final SavedPaymentMethodMutator savedPaymentMethodMutator, StateFlow stateFlow, boolean z) {
        return new PaymentOptionsItemsMapper(StateFlowsKt.mapAsStateFlow(savedPaymentMethodMutator.paymentMethodMetadataFlow, new Function1() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedPaymentMethodMutator.paymentOptionsItemsMapper_delegate$lambda$6$lambda$3((PaymentMethodMetadata) obj);
            }
        }), savedPaymentMethodMutator.customerStateHolder.getCustomer(), StateFlowsKt.mapAsStateFlow(savedPaymentMethodMutator.paymentMethodMetadataFlow, new Function1() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SavedPaymentMethodMutator.paymentOptionsItemsMapper_delegate$lambda$6$lambda$4((PaymentMethodMetadata) obj));
            }
        }), stateFlow, savedPaymentMethodMutator.providePaymentMethodName, z, new Function0() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SavedPaymentMethodMutator.paymentOptionsItemsMapper_delegate$lambda$6$lambda$5(this.f$0));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerMetadata paymentOptionsItemsMapper_delegate$lambda$6$lambda$3(PaymentMethodMetadata paymentMethodMetadata) {
        if (paymentMethodMetadata != null) {
            return paymentMethodMetadata.getCustomerMetadata();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean paymentOptionsItemsMapper_delegate$lambda$6$lambda$4(PaymentMethodMetadata paymentMethodMetadata) {
        return paymentMethodMetadata != null && paymentMethodMetadata.isGooglePayReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean paymentOptionsItemsMapper_delegate$lambda$6$lambda$5(SavedPaymentMethodMutator savedPaymentMethodMutator) {
        PaymentMethodMetadata value = savedPaymentMethodMutator.paymentMethodMetadataFlow.getValue();
        return (value != null ? value.getCbcEligibility() : null) instanceof CardBrandChoiceEligibility.Eligible;
    }

    public final StateFlow<List<PaymentOptionsItem>> getPaymentOptionsItems() {
        return this.paymentOptionsItems;
    }

    public final StateFlow<Boolean> getCanEdit() {
        return this.canEdit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canEdit$lambda$8(SavedPaymentMethodMutator savedPaymentMethodMutator, boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (z) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof PaymentOptionsItem.SavedPaymentMethod) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return false;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((PaymentOptionsItem.SavedPaymentMethod) it.next()).isModifiable(savedPaymentMethodMutator.customerStateHolder.getCanUpdateFullPaymentMethodDetails().getValue().booleanValue())) {
                return true;
            }
        }
        return false;
    }

    public final StateFlow<Boolean> getEditing$paymentsheet_release() {
        return this.editing;
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$1", f = "SavedPaymentMethodMutator.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlow = SavedPaymentMethodMutator.this.selection;
                final SavedPaymentMethodMutator savedPaymentMethodMutator = SavedPaymentMethodMutator.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        if (paymentSelection instanceof PaymentSelection.Saved) {
                            savedPaymentMethodMutator.customerStateHolder.updateMostRecentlySelectedSavedPaymentMethod(((PaymentSelection.Saved) paymentSelection).getPaymentMethod());
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> canEdit = SavedPaymentMethodMutator.this.getCanEdit();
                final SavedPaymentMethodMutator savedPaymentMethodMutator = SavedPaymentMethodMutator.this;
                this.label = 1;
                if (canEdit.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (!z && savedPaymentMethodMutator.getEditing$paymentsheet_release().getValue().booleanValue()) {
                            savedPaymentMethodMutator._editing.setValue(Boxing.boxBoolean(false));
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$3", f = "SavedPaymentMethodMutator.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<PaymentMethod>> paymentMethods = SavedPaymentMethodMutator.this.customerStateHolder.getPaymentMethods();
                final SavedPaymentMethodMutator savedPaymentMethodMutator = SavedPaymentMethodMutator.this;
                this.label = 1;
                if (paymentMethods.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<PaymentMethod>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<PaymentMethod> list, Continuation<? super Unit> continuation) {
                        if (list.isEmpty() && savedPaymentMethodMutator.getEditing$paymentsheet_release().getValue().booleanValue()) {
                            savedPaymentMethodMutator._editing.setValue(Boxing.boxBoolean(false));
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    public final void toggleEditing() {
        MutableStateFlow<Boolean> mutableStateFlow = this._editing;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), Boolean.valueOf(!r1.booleanValue())));
    }

    public final void removePaymentMethod(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String str = paymentMethod.id;
        if (str == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.workContext, null, new C11081(str, null), 2, null);
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethod$1", f = "SavedPaymentMethodMutator.kt", i = {}, l = {139, 140}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C11081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11081(String str, Continuation<? super C11081> continuation) {
            super(2, continuation);
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new C11081(this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r5.this$0.removeDeletedPaymentMethodFromState(r5.$paymentMethodId, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (SavedPaymentMethodMutator.this.m8235removePaymentMethodInternalgIAlus(this.$paymentMethodId, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r6, r7, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: removePaymentMethodInternal-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8235removePaymentMethodInternalgIAlus(String str, Continuation<? super Result<PaymentMethod>> continuation) {
        SavedPaymentMethodMutator$removePaymentMethodInternal$1 savedPaymentMethodMutator$removePaymentMethodInternal$1;
        CustomerState value;
        boolean zBooleanValue;
        SavedPaymentMethodMutator savedPaymentMethodMutator;
        if (continuation instanceof SavedPaymentMethodMutator$removePaymentMethodInternal$1) {
            savedPaymentMethodMutator$removePaymentMethodInternal$1 = (SavedPaymentMethodMutator$removePaymentMethodInternal$1) continuation;
            if ((savedPaymentMethodMutator$removePaymentMethodInternal$1.label & Integer.MIN_VALUE) != 0) {
                savedPaymentMethodMutator$removePaymentMethodInternal$1.label -= Integer.MIN_VALUE;
            } else {
                savedPaymentMethodMutator$removePaymentMethodInternal$1 = new SavedPaymentMethodMutator$removePaymentMethodInternal$1(this, continuation);
            }
        }
        Object obj = savedPaymentMethodMutator$removePaymentMethodInternal$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = savedPaymentMethodMutator$removePaymentMethodInternal$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            value = this.customerStateHolder.getCustomer().getValue();
            if (value == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration")));
            }
            zBooleanValue = this.customerStateHolder.getCanRemoveDuplicate().getValue().booleanValue();
            PaymentSelection value2 = this.selection.getValue();
            PaymentSelection.Saved saved = value2 instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value2 : null;
            PaymentMethod paymentMethod = saved != null ? saved.getPaymentMethod() : null;
            if (Intrinsics.areEqual(paymentMethod != null ? paymentMethod.id : null, str)) {
                CoroutineContext coroutineContext = this.uiContext;
                SavedPaymentMethodMutator$removePaymentMethodInternal$2 savedPaymentMethodMutator$removePaymentMethodInternal$2 = new SavedPaymentMethodMutator$removePaymentMethodInternal$2(this, null);
                savedPaymentMethodMutator$removePaymentMethodInternal$1.L$0 = this;
                savedPaymentMethodMutator$removePaymentMethodInternal$1.L$1 = str;
                savedPaymentMethodMutator$removePaymentMethodInternal$1.L$2 = value;
                savedPaymentMethodMutator$removePaymentMethodInternal$1.Z$0 = zBooleanValue;
                savedPaymentMethodMutator$removePaymentMethodInternal$1.label = 1;
            }
            savedPaymentMethodMutator = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            boolean z = savedPaymentMethodMutator$removePaymentMethodInternal$1.Z$0;
            value = (CustomerState) savedPaymentMethodMutator$removePaymentMethodInternal$1.L$2;
            String str2 = (String) savedPaymentMethodMutator$removePaymentMethodInternal$1.L$1;
            savedPaymentMethodMutator = (SavedPaymentMethodMutator) savedPaymentMethodMutator$removePaymentMethodInternal$1.L$0;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = z;
            str = str2;
        }
        CustomerRepository customerRepository = savedPaymentMethodMutator.customerRepository;
        CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(value.getId(), value.getEphemeralKeySecret(), value.getCustomerSessionClientSecret());
        savedPaymentMethodMutator$removePaymentMethodInternal$1.L$0 = null;
        savedPaymentMethodMutator$removePaymentMethodInternal$1.L$1 = null;
        savedPaymentMethodMutator$removePaymentMethodInternal$1.L$2 = null;
        savedPaymentMethodMutator$removePaymentMethodInternal$1.label = 2;
        Object objMo8416detachPaymentMethodBWLJW6A = customerRepository.mo8416detachPaymentMethodBWLJW6A(customerInfo, str, zBooleanValue, savedPaymentMethodMutator$removePaymentMethodInternal$1);
        return objMo8416detachPaymentMethodBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8416detachPaymentMethodBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeDeletedPaymentMethodFromState(String str, Continuation<? super Unit> continuation) {
        Object next;
        PaymentMethod.Type type;
        String str2;
        CustomerState value = this.customerStateHolder.getCustomer().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        Iterator<T> it = value.getPaymentMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).id, str)) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) next;
        if (paymentMethod != null && (type = paymentMethod.type) != null && (str2 = type.code) != null) {
            this.eventReporter.onRemoveSavedPaymentMethod(str2);
        }
        Object objWithContext = BuildersKt.withContext(this.uiContext, new AnonymousClass4(value, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removeDeletedPaymentMethodFromState$4", f = "SavedPaymentMethodMutator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removeDeletedPaymentMethodFromState$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CustomerState $currentCustomer;
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CustomerState customerState, String str, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$currentCustomer = customerState;
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new AnonymousClass4(this.$currentCustomer, this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PaymentMethod paymentMethod;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CustomerStateHolder customerStateHolder = SavedPaymentMethodMutator.this.customerStateHolder;
                CustomerState customerState = this.$currentCustomer;
                List<PaymentMethod> paymentMethods = customerState.getPaymentMethods();
                String str = this.$paymentMethodId;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : paymentMethods) {
                    if (!Intrinsics.areEqual(((PaymentMethod) obj2).id, str)) {
                        arrayList.add(obj2);
                    }
                }
                customerStateHolder.setCustomerState(CustomerState.copy$default(customerState, null, null, null, arrayList, null, 23, null));
                Object value = SavedPaymentMethodMutator.this.selection.getValue();
                PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
                if (Intrinsics.areEqual((saved == null || (paymentMethod = saved.getPaymentMethod()) == null) ? null : paymentMethod.id, this.$paymentMethodId)) {
                    SavedPaymentMethodMutator.this.setSelection.invoke(null);
                }
                SavedPaymentMethodMutator.this.postPaymentMethodRemoveActions.invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updatePaymentMethod(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        PaymentMethod paymentMethod = displayableSavedPaymentMethod.getPaymentMethod();
        this.onUpdatePaymentMethod.invoke(displayableSavedPaymentMethod, this.customerStateHolder.getCanRemove().getValue(), new C11111(paymentMethod, null), new C11122(paymentMethod, null), new C11133(this));
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$updatePaymentMethod$1", f = "SavedPaymentMethodMutator.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$updatePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C11111 extends SuspendLambda implements Function1<Continuation<? super Throwable>, Object> {
        final /* synthetic */ PaymentMethod $paymentMethod;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11111(PaymentMethod paymentMethod, Continuation<? super C11111> continuation) {
            super(1, continuation);
            this.$paymentMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new C11111(this.$paymentMethod, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Throwable> continuation) {
            return ((C11111) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objRemovePaymentMethodInEditScreen = SavedPaymentMethodMutator.this.removePaymentMethodInEditScreen(this.$paymentMethod, this);
            return objRemovePaymentMethodInEditScreen == coroutine_suspended ? coroutine_suspended : objRemovePaymentMethodInEditScreen;
        }
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "cardBrand", "Lcom/stripe/android/paymentsheet/CardUpdateParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$updatePaymentMethod$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$updatePaymentMethod$2, reason: invalid class name and case insensitive filesystem */
    static final class C11122 extends SuspendLambda implements Function2<CardUpdateParams, Continuation<? super Result<? extends PaymentMethod>>, Object> {
        final /* synthetic */ PaymentMethod $paymentMethod;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11122(PaymentMethod paymentMethod, Continuation<? super C11122> continuation) {
            super(2, continuation);
            this.$paymentMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11122 c11122 = SavedPaymentMethodMutator.this.new C11122(this.$paymentMethod, continuation);
            c11122.L$0 = obj;
            return c11122;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
            return ((C11122) create(cardUpdateParams, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CardUpdateParams cardUpdateParams, Continuation<? super Result<? extends PaymentMethod>> continuation) {
            return invoke2(cardUpdateParams, (Continuation<? super Result<PaymentMethod>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM8234modifyCardPaymentMethodBWLJW6A$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardUpdateParams cardUpdateParams = (CardUpdateParams) this.L$0;
                this.label = 1;
                objM8234modifyCardPaymentMethodBWLJW6A$default = SavedPaymentMethodMutator.m8234modifyCardPaymentMethodBWLJW6A$default(SavedPaymentMethodMutator.this, this.$paymentMethod, cardUpdateParams, null, this, 4, null);
                if (objM8234modifyCardPaymentMethodBWLJW6A$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM8234modifyCardPaymentMethodBWLJW6A$default = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objM8234modifyCardPaymentMethodBWLJW6A$default);
        }
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$updatePaymentMethod$3, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C11133 extends FunctionReferenceImpl implements Function2<PaymentMethod, Continuation<? super Result<? extends Unit>>, Object>, SuspendFunction {
        C11133(Object obj) {
            super(2, obj, SavedPaymentMethodMutator.class, "setDefaultPaymentMethod", "setDefaultPaymentMethod-gIAlu-s$paymentsheet_release(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Result<Unit>> continuation) {
            Object objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release = ((SavedPaymentMethodMutator) this.receiver).m8237setDefaultPaymentMethodgIAlus$paymentsheet_release(paymentMethod, continuation);
            return objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release : Result.m9117boximpl(objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: setDefaultPaymentMethod-gIAlu-s$paymentsheet_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8237setDefaultPaymentMethodgIAlus$paymentsheet_release(PaymentMethod paymentMethod, Continuation<? super Result<Unit>> continuation) {
        SavedPaymentMethodMutator$setDefaultPaymentMethod$1 savedPaymentMethodMutator$setDefaultPaymentMethod$1;
        PaymentMethod paymentMethod2;
        Object obj;
        SavedPaymentMethodMutator savedPaymentMethodMutator;
        PaymentMethod paymentMethod3;
        SavedPaymentMethodMutator savedPaymentMethodMutator2;
        if (continuation instanceof SavedPaymentMethodMutator$setDefaultPaymentMethod$1) {
            savedPaymentMethodMutator$setDefaultPaymentMethod$1 = (SavedPaymentMethodMutator$setDefaultPaymentMethod$1) continuation;
            if ((savedPaymentMethodMutator$setDefaultPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                savedPaymentMethodMutator$setDefaultPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                savedPaymentMethodMutator$setDefaultPaymentMethod$1 = new SavedPaymentMethodMutator$setDefaultPaymentMethod$1(this, continuation);
            }
        }
        Object obj2 = savedPaymentMethodMutator$setDefaultPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = savedPaymentMethodMutator$setDefaultPaymentMethod$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            CustomerState value = this.customerStateHolder.getCustomer().getValue();
            if (value == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Unable to set default payment method when customer is null.")));
            }
            CustomerRepository customerRepository = this.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(value.getId(), value.getEphemeralKeySecret(), value.getCustomerSessionClientSecret());
            String str = paymentMethod.id;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$0 = this;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$1 = paymentMethod;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.label = 1;
            Object objMo8418setDefaultPaymentMethod0E7RQCE = customerRepository.mo8418setDefaultPaymentMethod0E7RQCE(customerInfo, str, savedPaymentMethodMutator$setDefaultPaymentMethod$1);
            if (objMo8418setDefaultPaymentMethod0E7RQCE != coroutine_suspended) {
                paymentMethod2 = paymentMethod;
                obj = objMo8418setDefaultPaymentMethod0E7RQCE;
                savedPaymentMethodMutator = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$2;
            paymentMethod3 = (PaymentMethod) savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$1;
            savedPaymentMethodMutator2 = (SavedPaymentMethodMutator) savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$0;
            ResultKt.throwOnFailure(obj2);
            EventReporter eventReporter = savedPaymentMethodMutator2.eventReporter;
            PaymentMethod.Type type = paymentMethod3.type;
            eventReporter.onSetAsDefaultPaymentMethodSucceeded(type != null ? type.code : null);
            if (Result.m9125isSuccessimpl(obj)) {
                return Result.m9118constructorimpl(obj);
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(Unit.INSTANCE);
        }
        PaymentMethod paymentMethod4 = (PaymentMethod) savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$1;
        savedPaymentMethodMutator = (SavedPaymentMethodMutator) savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$0;
        ResultKt.throwOnFailure(obj2);
        Object value2 = ((Result) obj2).getValue();
        paymentMethod2 = paymentMethod4;
        obj = value2;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
        if (thM9121exceptionOrNullimpl != null) {
            EventReporter eventReporter2 = savedPaymentMethodMutator.eventReporter;
            PaymentMethod.Type type2 = paymentMethod2.type;
            eventReporter2.onSetAsDefaultPaymentMethodFailed(type2 != null ? type2.code : null, thM9121exceptionOrNullimpl);
        }
        if (Result.m9125isSuccessimpl(obj)) {
            CoroutineContext coroutineContext = savedPaymentMethodMutator.uiContext;
            SavedPaymentMethodMutator$setDefaultPaymentMethod$3$1 savedPaymentMethodMutator$setDefaultPaymentMethod$3$1 = new SavedPaymentMethodMutator$setDefaultPaymentMethod$3$1(savedPaymentMethodMutator, paymentMethod2, null);
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$0 = savedPaymentMethodMutator;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$1 = paymentMethod2;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.L$2 = obj;
            savedPaymentMethodMutator$setDefaultPaymentMethod$1.label = 2;
            if (BuildersKt.withContext(coroutineContext, savedPaymentMethodMutator$setDefaultPaymentMethod$3$1, savedPaymentMethodMutator$setDefaultPaymentMethod$1) != coroutine_suspended) {
                paymentMethod3 = paymentMethod2;
                savedPaymentMethodMutator2 = savedPaymentMethodMutator;
                EventReporter eventReporter3 = savedPaymentMethodMutator2.eventReporter;
                PaymentMethod.Type type3 = paymentMethod3.type;
                eventReporter3.onSetAsDefaultPaymentMethodSucceeded(type3 != null ? type3.code : null);
            }
            return coroutine_suspended;
        }
        if (Result.m9125isSuccessimpl(obj)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removePaymentMethodInEditScreen(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
        C11091 c11091;
        String str;
        Object objM8235removePaymentMethodInternalgIAlus;
        SavedPaymentMethodMutator savedPaymentMethodMutator;
        if (continuation instanceof C11091) {
            c11091 = (C11091) continuation;
            if ((c11091.label & Integer.MIN_VALUE) != 0) {
                c11091.label -= Integer.MIN_VALUE;
            } else {
                c11091 = new C11091(continuation);
            }
        }
        Object obj = c11091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11091.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            str = paymentMethod.id;
            Intrinsics.checkNotNull(str);
            c11091.L$0 = this;
            c11091.L$1 = str;
            c11091.label = 1;
            objM8235removePaymentMethodInternalgIAlus = m8235removePaymentMethodInternalgIAlus(str, c11091);
            if (objM8235removePaymentMethodInternalgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            savedPaymentMethodMutator = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c11091.L$1;
            savedPaymentMethodMutator = (SavedPaymentMethodMutator) c11091.L$0;
            ResultKt.throwOnFailure(obj);
            objM8235removePaymentMethodInternalgIAlus = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objM8235removePaymentMethodInternalgIAlus)) {
            BuildersKt__Builders_commonKt.launch$default(savedPaymentMethodMutator.coroutineScope, savedPaymentMethodMutator.uiContext, null, savedPaymentMethodMutator.new C11102(str, null), 2, null);
        }
        return Result.m9121exceptionOrNullimpl(objM8235removePaymentMethodInternalgIAlus);
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethodInEditScreen$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {251, 252}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$removePaymentMethodInEditScreen$2, reason: invalid class name and case insensitive filesystem */
    static final class C11102 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $paymentMethodId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11102(String str, Continuation<? super C11102> continuation) {
            super(2, continuation);
            this.$paymentMethodId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SavedPaymentMethodMutator.this.new C11102(this.$paymentMethodId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11102) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r4.this$0.removeDeletedPaymentMethodFromState(r4.$paymentMethodId, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = SavedPaymentMethodMutator.this.prePaymentMethodRemoveActions;
                this.label = 1;
                if (function1.invoke(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: modifyCardPaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8236modifyCardPaymentMethodBWLJW6A(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Function1<? super PaymentMethod, Unit> function1, Continuation<? super Result<PaymentMethod>> continuation) {
        SavedPaymentMethodMutator$modifyCardPaymentMethod$1 savedPaymentMethodMutator$modifyCardPaymentMethod$1;
        CustomerState value;
        CardUpdateParams cardUpdateParams2;
        Object objMo8419updatePaymentMethodBWLJW6A;
        SavedPaymentMethodMutator savedPaymentMethodMutator;
        Function1<? super PaymentMethod, Unit> function12;
        Object obj;
        CardUpdateParams cardUpdateParams3;
        SavedPaymentMethodMutator savedPaymentMethodMutator2;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof SavedPaymentMethodMutator$modifyCardPaymentMethod$1) {
            savedPaymentMethodMutator$modifyCardPaymentMethod$1 = (SavedPaymentMethodMutator$modifyCardPaymentMethod$1) continuation;
            if ((savedPaymentMethodMutator$modifyCardPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                savedPaymentMethodMutator$modifyCardPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                savedPaymentMethodMutator$modifyCardPaymentMethod$1 = new SavedPaymentMethodMutator$modifyCardPaymentMethod$1(this, continuation);
            }
        }
        Object obj2 = savedPaymentMethodMutator$modifyCardPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = savedPaymentMethodMutator$modifyCardPaymentMethod$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            value = this.customerStateHolder.getCustomer().getValue();
            if (value == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Could not update payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration")));
            }
            CustomerRepository customerRepository = this.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(value.getId(), value.getEphemeralKeySecret(), value.getCustomerSessionClientSecret());
            String str = paymentMethod.id;
            Intrinsics.checkNotNull(str);
            PaymentMethodUpdateParams.Companion companion2 = PaymentMethodUpdateParams.INSTANCE;
            CardBrand cardBrand = cardUpdateParams.getCardBrand();
            PaymentMethodUpdateParams paymentMethodUpdateParamsCreateCard$default = PaymentMethodUpdateParams.Companion.createCard$default(companion2, cardUpdateParams.getExpiryMonth(), cardUpdateParams.getExpiryYear(), cardBrand != null ? new PaymentMethodUpdateParams.Card.Networks(cardBrand.getCode()) : null, cardUpdateParams.getBillingDetails(), null, SetsKt.setOf(PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER), 16, null);
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$0 = this;
            cardUpdateParams2 = cardUpdateParams;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$1 = cardUpdateParams2;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$2 = function1;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$3 = value;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.label = 1;
            objMo8419updatePaymentMethodBWLJW6A = customerRepository.mo8419updatePaymentMethodBWLJW6A(customerInfo, str, paymentMethodUpdateParamsCreateCard$default, savedPaymentMethodMutator$modifyCardPaymentMethod$1);
            if (objMo8419updatePaymentMethodBWLJW6A != coroutine_suspended) {
                savedPaymentMethodMutator = this;
                function12 = function1;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$2;
            cardUpdateParams3 = (CardUpdateParams) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$1;
            savedPaymentMethodMutator2 = (SavedPaymentMethodMutator) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$0;
            ResultKt.throwOnFailure(obj2);
            savedPaymentMethodMutator2.eventReporter.onUpdatePaymentMethodSucceeded(cardUpdateParams3.getCardBrand());
            savedPaymentMethodMutator = savedPaymentMethodMutator2;
            objMo8419updatePaymentMethodBWLJW6A = obj;
            cardUpdateParams2 = cardUpdateParams3;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8419updatePaymentMethodBWLJW6A);
            if (thM9121exceptionOrNullimpl != null) {
                savedPaymentMethodMutator.eventReporter.onUpdatePaymentMethodFailed(cardUpdateParams2.getCardBrand(), thM9121exceptionOrNullimpl);
            }
            return objMo8419updatePaymentMethodBWLJW6A;
        }
        value = (CustomerState) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$3;
        Function1<? super PaymentMethod, Unit> function13 = (Function1) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$2;
        CardUpdateParams cardUpdateParams4 = (CardUpdateParams) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$1;
        SavedPaymentMethodMutator savedPaymentMethodMutator3 = (SavedPaymentMethodMutator) savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$0;
        ResultKt.throwOnFailure(obj2);
        objMo8419updatePaymentMethodBWLJW6A = ((Result) obj2).getValue();
        function12 = function13;
        cardUpdateParams2 = cardUpdateParams4;
        savedPaymentMethodMutator = savedPaymentMethodMutator3;
        CustomerState customerState = value;
        if (Result.m9125isSuccessimpl(objMo8419updatePaymentMethodBWLJW6A)) {
            CoroutineContext coroutineContext = savedPaymentMethodMutator.uiContext;
            SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1 savedPaymentMethodMutator$modifyCardPaymentMethod$4$1 = new SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1(savedPaymentMethodMutator, (PaymentMethod) objMo8419updatePaymentMethodBWLJW6A, customerState, function12, null);
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$0 = savedPaymentMethodMutator;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$1 = cardUpdateParams2;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$2 = objMo8419updatePaymentMethodBWLJW6A;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.L$3 = null;
            savedPaymentMethodMutator$modifyCardPaymentMethod$1.label = 2;
            if (BuildersKt.withContext(coroutineContext, savedPaymentMethodMutator$modifyCardPaymentMethod$4$1, savedPaymentMethodMutator$modifyCardPaymentMethod$1) != coroutine_suspended) {
                obj = objMo8419updatePaymentMethodBWLJW6A;
                cardUpdateParams3 = cardUpdateParams2;
                savedPaymentMethodMutator2 = savedPaymentMethodMutator;
                savedPaymentMethodMutator2.eventReporter.onUpdatePaymentMethodSucceeded(cardUpdateParams3.getCardBrand());
                savedPaymentMethodMutator = savedPaymentMethodMutator2;
                objMo8419updatePaymentMethodBWLJW6A = obj;
                cardUpdateParams2 = cardUpdateParams3;
            }
            return coroutine_suspended;
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8419updatePaymentMethodBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
        }
        return objMo8419updatePaymentMethodBWLJW6A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: modifyCardPaymentMethod-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m8234modifyCardPaymentMethodBWLJW6A$default(SavedPaymentMethodMutator savedPaymentMethodMutator, PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SavedPaymentMethodMutator.modifyCardPaymentMethod_BWLJW6A$lambda$15((PaymentMethod) obj2);
                }
            };
        }
        return savedPaymentMethodMutator.m8236modifyCardPaymentMethodBWLJW6A(paymentMethod, cardUpdateParams, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyCardPaymentMethod_BWLJW6A$lambda$15(PaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelectedPaymentMethod(PaymentMethod paymentMethod) {
        PaymentMethod paymentMethod2;
        PaymentSelection value = this.selection.getValue();
        String str = null;
        PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
        if (saved != null && (paymentMethod2 = saved.getPaymentMethod()) != null) {
            str = paymentMethod2.id;
        }
        return Intrinsics.areEqual(str, paymentMethod.id);
    }

    /* compiled from: SavedPaymentMethodMutator.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ·\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u001e\u0010\u000f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001027\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001427\u0010\u001b\u001a3\b\u0001\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00190\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0002¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;", "", "<init>", "()V", "popWithDelay", "", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateBackOnPaymentMethodRemoved", "onUpdatePaymentMethod", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "canRemove", "", "performRemove", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "updatePaymentMethodExecutor", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "Lkotlin/ParameterName;", "name", "cardUpdateParams", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "setDefaultPaymentMethodExecutor", "paymentMethod", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "create", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object popWithDelay(BaseSheetViewModel baseSheetViewModel, Continuation<? super Unit> continuation) {
            baseSheetViewModel.getNavigationHandler().pop();
            Object objWithContext = BuildersKt.withContext(baseSheetViewModel.getWorkContext(), new SavedPaymentMethodMutator$Companion$popWithDelay$2(null), continuation);
            return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object navigateBackOnPaymentMethodRemoved(BaseSheetViewModel baseSheetViewModel, Continuation<? super Unit> continuation) {
            PaymentSheetScreen value = baseSheetViewModel.getNavigationHandler().getPreviousScreen().getValue();
            if (value instanceof PaymentSheetScreen.SelectSavedPaymentMethods) {
                if (baseSheetViewModel.getCustomerStateHolder().getPaymentMethods().getValue().size() == 1) {
                    DefaultAddPaymentMethodInteractor.Companion companion = DefaultAddPaymentMethodInteractor.INSTANCE;
                    PaymentMethodMetadata value2 = baseSheetViewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
                    if (value2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    baseSheetViewModel.getNavigationHandler().resetTo(CollectionsKt.listOf(new PaymentSheetScreen.AddFirstPaymentMethod(companion.create(baseSheetViewModel, value2))));
                } else {
                    Object objPopWithDelay = popWithDelay(baseSheetViewModel, continuation);
                    return objPopWithDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPopWithDelay : Unit.INSTANCE;
                }
            } else {
                if ((value instanceof PaymentSheetScreen.ManageSavedPaymentMethods) || (value instanceof PaymentSheetScreen.VerticalMode)) {
                    Object objPopWithDelay2 = popWithDelay(baseSheetViewModel, continuation);
                    return objPopWithDelay2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPopWithDelay2 : Unit.INSTANCE;
                }
                if (!(value instanceof PaymentSheetScreen.AddAnotherPaymentMethod) && !(value instanceof PaymentSheetScreen.AddFirstPaymentMethod) && !(value instanceof PaymentSheetScreen.CvcRecollection) && !Intrinsics.areEqual(value, PaymentSheetScreen.Loading.INSTANCE) && !(value instanceof PaymentSheetScreen.UpdatePaymentMethod) && !(value instanceof PaymentSheetScreen.VerticalModeForm) && value != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }

        private final void onUpdatePaymentMethod(final BaseSheetViewModel viewModel, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean canRemove, Function1<? super Continuation<? super Throwable>, ? extends Object> performRemove, Function2<? super CardUpdateParams, ? super Continuation<? super Result<PaymentMethod>>, ? extends Object> updatePaymentMethodExecutor, Function2<? super PaymentMethod, ? super Continuation<? super Result<Unit>>, ? extends Object> setDefaultPaymentMethodExecutor) {
            CustomerMetadata customerMetadata;
            if (Intrinsics.areEqual(displayableSavedPaymentMethod.getSavedPaymentMethod(), SavedPaymentMethod.Unexpected.INSTANCE)) {
                return;
            }
            PaymentMethodMetadata value = viewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            boolean zIsLiveMode = value.getStripeIntent().isLiveMode();
            NavigationHandler<PaymentSheetScreen> navigationHandler = viewModel.getNavigationHandler();
            boolean zBooleanValue = viewModel.getCustomerStateHolder().getCanUpdateFullPaymentMethodDetails().getValue().booleanValue();
            PaymentSheetCardBrandFilter paymentSheetCardBrandFilter = new PaymentSheetCardBrandFilter(viewModel.getConfig().getCardBrandAcceptance$paymentsheet_release());
            PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode address = CommonConfigurationKt.asCommonConfiguration(viewModel.getConfig()).getBillingDetailsCollectionConfiguration().getAddress();
            PaymentMethodMetadata value2 = viewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
            boolean z = (value2 == null || (customerMetadata = value2.getCustomerMetadata()) == null || !customerMetadata.isPaymentMethodSetAsDefaultEnabled()) ? false : true;
            CustomerState value3 = viewModel.getCustomerStateHolder().getCustomer().getValue();
            navigationHandler.transitionTo(new PaymentSheetScreen.UpdatePaymentMethod(new DefaultUpdatePaymentMethodInteractor(zIsLiveMode, canRemove, displayableSavedPaymentMethod, paymentSheetCardBrandFilter, address, zBooleanValue, displayableSavedPaymentMethod.isDefaultPaymentMethod(value3 != null ? value3.getDefaultPaymentMethodId() : null), z, new SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2(performRemove, null), new SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3(updatePaymentMethodExecutor, null), setDefaultPaymentMethodExecutor, new Function1() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SavedPaymentMethodMutator.Companion.onUpdatePaymentMethod$lambda$0(viewModel, (CardBrand) obj);
                }
            }, new SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$1(viewModel.getNavigationHandler()), null, 8192, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onUpdatePaymentMethod$lambda$0(BaseSheetViewModel baseSheetViewModel, CardBrand it) {
            Intrinsics.checkNotNullParameter(it, "it");
            baseSheetViewModel.getEventReporter().onBrandChoiceSelected(EventReporter.CardBrandChoiceEventSource.Edit, it);
            return Unit.INSTANCE;
        }

        public final SavedPaymentMethodMutator create(final BaseSheetViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            BaseSheetViewModel baseSheetViewModel = viewModel;
            SavedPaymentMethodMutator savedPaymentMethodMutator = new SavedPaymentMethodMutator(viewModel.getPaymentMethodMetadata$paymentsheet_release(), viewModel.getEventReporter(), ViewModelKt.getViewModelScope(baseSheetViewModel), viewModel.getWorkContext(), Dispatchers.getMain(), viewModel.getCustomerRepository(), viewModel.getSelection$paymentsheet_release(), new SavedPaymentMethodMutator$Companion$create$1(viewModel), viewModel.getCustomerStateHolder(), new SavedPaymentMethodMutator$Companion$create$2(viewModel, null), new Function0() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function5() { // from class: com.stripe.android.paymentsheet.SavedPaymentMethodMutator$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function5
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return SavedPaymentMethodMutator.Companion.create$lambda$2(viewModel, (DisplayableSavedPaymentMethod) obj, ((Boolean) obj2).booleanValue(), (Function1) obj3, (Function2) obj4, (Function2) obj5);
                }
            }, viewModel.getLinkHandler().isLinkEnabled(), !viewModel.getIsCompleteFlow());
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(baseSheetViewModel), null, null, new SavedPaymentMethodMutator$Companion$create$5$1(viewModel, savedPaymentMethodMutator, null), 3, null);
            return savedPaymentMethodMutator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$2(BaseSheetViewModel baseSheetViewModel, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, Function1 performRemove, Function2 updatePaymentMethodExecutor, Function2 setDefaultPaymentMethodExecutor) {
            Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            Intrinsics.checkNotNullParameter(performRemove, "performRemove");
            Intrinsics.checkNotNullParameter(updatePaymentMethodExecutor, "updatePaymentMethodExecutor");
            Intrinsics.checkNotNullParameter(setDefaultPaymentMethodExecutor, "setDefaultPaymentMethodExecutor");
            SavedPaymentMethodMutator.INSTANCE.onUpdatePaymentMethod(baseSheetViewModel, displayableSavedPaymentMethod, z, performRemove, updatePaymentMethodExecutor, setDefaultPaymentMethodExecutor);
            return Unit.INSTANCE;
        }
    }
}
