package com.stripe.android.customersheet.analytics;

import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.analytics.CustomerSheetEvent;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.customersheet.data.CustomerSheetSession;
import com.stripe.android.model.CardBrand;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: DefaultCustomerSheetEventReporter.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010!J\b\u0010#\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00102\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00103\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00104\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u00105\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u000200H\u0016J\u0010\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u000b2\u0006\u00109\u001a\u00020<H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V", "onInit", "", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "onLoadSucceeded", "customerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "onLoadFailed", "error", "", "onScreenPresented", "screen", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;", "onScreenHidden", "onPaymentMethodSelected", "code", "", "onConfirmPaymentMethodSucceeded", "type", "syncDefaultEnabled", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "onConfirmPaymentMethodFailed", "onEditTapped", "onEditCompleted", "onRemovePaymentMethodSucceeded", "onRemovePaymentMethodFailed", "onAttachPaymentMethodSucceeded", "style", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;", "onAttachPaymentMethodCanceled", "onAttachPaymentMethodFailed", "onShowPaymentOptionBrands", "source", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;", "selectedBrand", "Lcom/stripe/android/model/CardBrand;", "onHidePaymentOptionBrands", "onBrandChoiceSelected", "onUpdatePaymentMethodSucceeded", "onUpdatePaymentMethodFailed", "onCardNumberCompleted", "onDisallowedCardBrandEntered", "brand", "onAnalyticsEvent", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "fireEvent", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCustomerSheetEventReporter implements CustomerSheetEventReporter {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final CoroutineContext workContext;

    /* compiled from: DefaultCustomerSheetEventReporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomerSheetEventReporter.Screen.values().length];
            try {
                iArr[CustomerSheetEventReporter.Screen.EditPaymentMethod.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CustomerSheetEventReporter.CardBrandChoiceEventSource.values().length];
            try {
                iArr2[CustomerSheetEventReporter.CardBrandChoiceEventSource.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CustomerSheetEventReporter.CardBrandChoiceEventSource.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Inject
    public DefaultCustomerSheetEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onInit(CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type integrationType) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        fireEvent(new CustomerSheetEvent.Init(configuration, integrationType));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onLoadSucceeded(CustomerSheetSession customerSheetSession) {
        Intrinsics.checkNotNullParameter(customerSheetSession, "customerSheetSession");
        fireEvent(new CustomerSheetEvent.LoadSucceeded(customerSheetSession));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onLoadFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new CustomerSheetEvent.LoadFailed(error));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onScreenPresented(CustomerSheetEventReporter.Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        fireEvent(new CustomerSheetEvent.ScreenPresented(screen));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onScreenHidden(CustomerSheetEventReporter.Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (WhenMappings.$EnumSwitchMapping$0[screen.ordinal()] == 1) {
            fireEvent(new CustomerSheetEvent.ScreenHidden(screen));
        }
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onPaymentMethodSelected(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        fireEvent(new CustomerSheetEvent.SelectPaymentMethod(code));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onConfirmPaymentMethodSucceeded(String type, Boolean syncDefaultEnabled) {
        Intrinsics.checkNotNullParameter(type, "type");
        fireEvent(new CustomerSheetEvent.ConfirmPaymentMethodSucceeded(type, syncDefaultEnabled));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onConfirmPaymentMethodFailed(String type, Boolean syncDefaultEnabled) {
        Intrinsics.checkNotNullParameter(type, "type");
        fireEvent(new CustomerSheetEvent.ConfirmPaymentMethodFailed(type, syncDefaultEnabled));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onEditTapped() {
        fireEvent(new CustomerSheetEvent.EditTapped());
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onEditCompleted() {
        fireEvent(new CustomerSheetEvent.EditCompleted());
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onRemovePaymentMethodSucceeded() {
        fireEvent(new CustomerSheetEvent.RemovePaymentMethodSucceeded());
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onRemovePaymentMethodFailed() {
        fireEvent(new CustomerSheetEvent.RemovePaymentMethodFailed());
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onAttachPaymentMethodSucceeded(CustomerSheetEventReporter.AddPaymentMethodStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        fireEvent(new CustomerSheetEvent.AttachPaymentMethodSucceeded(style));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onAttachPaymentMethodCanceled(CustomerSheetEventReporter.AddPaymentMethodStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (style == CustomerSheetEventReporter.AddPaymentMethodStyle.SetupIntent) {
            fireEvent(new CustomerSheetEvent.AttachPaymentMethodCanceled());
        }
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onAttachPaymentMethodFailed(CustomerSheetEventReporter.AddPaymentMethodStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        fireEvent(new CustomerSheetEvent.AttachPaymentMethodFailed(style));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onShowPaymentOptionBrands(CustomerSheetEventReporter.CardBrandChoiceEventSource source, CardBrand selectedBrand) {
        CustomerSheetEvent.ShowPaymentOptionBrands.Source source2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
        int i = WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
        if (i == 1) {
            source2 = CustomerSheetEvent.ShowPaymentOptionBrands.Source.Add;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source2 = CustomerSheetEvent.ShowPaymentOptionBrands.Source.Edit;
        }
        fireEvent(new CustomerSheetEvent.ShowPaymentOptionBrands(source2, selectedBrand));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onHidePaymentOptionBrands(CustomerSheetEventReporter.CardBrandChoiceEventSource source, CardBrand selectedBrand) {
        CustomerSheetEvent.HidePaymentOptionBrands.Source source2;
        Intrinsics.checkNotNullParameter(source, "source");
        int i = WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
        if (i == 1) {
            source2 = CustomerSheetEvent.HidePaymentOptionBrands.Source.Add;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source2 = CustomerSheetEvent.HidePaymentOptionBrands.Source.Edit;
        }
        fireEvent(new CustomerSheetEvent.HidePaymentOptionBrands(source2, selectedBrand));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onBrandChoiceSelected(CustomerSheetEventReporter.CardBrandChoiceEventSource source, CardBrand selectedBrand) {
        CustomerSheetEvent.BrandChoiceSelected.Source source2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(selectedBrand, "selectedBrand");
        int i = WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
        if (i == 1) {
            source2 = CustomerSheetEvent.BrandChoiceSelected.Source.Add;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source2 = CustomerSheetEvent.BrandChoiceSelected.Source.Edit;
        }
        fireEvent(new CustomerSheetEvent.BrandChoiceSelected(source2, selectedBrand));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onUpdatePaymentMethodSucceeded(CardBrand selectedBrand) {
        fireEvent(new CustomerSheetEvent.UpdatePaymentOptionSucceeded(selectedBrand));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onUpdatePaymentMethodFailed(CardBrand selectedBrand, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(new CustomerSheetEvent.UpdatePaymentOptionFailed(selectedBrand, error));
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onCardNumberCompleted() {
        fireEvent(new CustomerSheetEvent.CardNumberCompleted());
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onDisallowedCardBrandEntered(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        fireEvent(new CustomerSheetEvent.CardBrandDisallowed(brand));
    }

    /* compiled from: DefaultCustomerSheetEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$onAnalyticsEvent$1", f = "DefaultCustomerSheetEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$onAnalyticsEvent$1, reason: invalid class name and case insensitive filesystem */
    static final class C08351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08351(AnalyticsEvent analyticsEvent, Continuation<? super C08351> continuation) {
            super(2, continuation);
            this.$event = analyticsEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultCustomerSheetEventReporter.this.new C08351(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DefaultCustomerSheetEventReporter.this.analyticsRequestExecutor.executeAsync(DefaultCustomerSheetEventReporter.this.analyticsRequestFactory.createRequest(this.$event, MapsKt.emptyMap()));
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.customersheet.analytics.CustomerSheetEventReporter
    public void onAnalyticsEvent(AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C08351(event, null), 3, null);
    }

    /* compiled from: DefaultCustomerSheetEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$fireEvent$1", f = "DefaultCustomerSheetEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.analytics.DefaultCustomerSheetEventReporter$fireEvent$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CustomerSheetEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomerSheetEvent customerSheetEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = customerSheetEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultCustomerSheetEventReporter.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AnalyticsRequestExecutor analyticsRequestExecutor = DefaultCustomerSheetEventReporter.this.analyticsRequestExecutor;
                AnalyticsRequestFactory analyticsRequestFactory = DefaultCustomerSheetEventReporter.this.analyticsRequestFactory;
                CustomerSheetEvent customerSheetEvent = this.$event;
                analyticsRequestExecutor.executeAsync(analyticsRequestFactory.createRequest(customerSheetEvent, customerSheetEvent.getAdditionalParams()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireEvent(CustomerSheetEvent event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(event, null), 3, null);
    }
}
