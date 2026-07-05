package com.stripe.android.paymentelement.embedded.content;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.coroutines.CoalescingOrchestrator;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: EmbeddedConfigurationHandler.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003%&'BU\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e0\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationHandler;", "paymentElementLoader", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "sheetStateHolder", "Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "internalRowSelectionCallback", "Ljavax/inject/Provider;", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "isLiveModeProvider", "", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentelement/embedded/content/SheetStateHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ljavax/inject/Provider;Lkotlin/jvm/functions/Function0;)V", "value", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;", "cache", "getCache", "()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;", "setCache", "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;)V", "inFlightRequest", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;", "configure", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "configure-0E7RQCE", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Arguments", ConfigurationCache.KEY, "InFlightRequest", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultEmbeddedConfigurationHandler implements EmbeddedConfigurationHandler {
    public static final int $stable = 8;
    private final EventReporter eventReporter;
    private volatile InFlightRequest inFlightRequest;
    private final Provider<Function0<Unit>> internalRowSelectionCallback;
    private final Function0<Boolean> isLiveModeProvider;
    private final PaymentElementLoader paymentElementLoader;
    private final SavedStateHandle savedStateHandle;
    private final SheetStateHolder sheetStateHolder;

    @Inject
    public DefaultEmbeddedConfigurationHandler(PaymentElementLoader paymentElementLoader, SavedStateHandle savedStateHandle, SheetStateHolder sheetStateHolder, EventReporter eventReporter, Provider<Function0<Unit>> internalRowSelectionCallback, @Named(NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider) {
        Intrinsics.checkNotNullParameter(paymentElementLoader, "paymentElementLoader");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(sheetStateHolder, "sheetStateHolder");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(internalRowSelectionCallback, "internalRowSelectionCallback");
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        this.paymentElementLoader = paymentElementLoader;
        this.savedStateHandle = savedStateHandle;
        this.sheetStateHolder = sheetStateHolder;
        this.eventReporter = eventReporter;
        this.internalRowSelectionCallback = internalRowSelectionCallback;
        this.isLiveModeProvider = isLiveModeProvider;
    }

    private final ConfigurationCache getCache() {
        return (ConfigurationCache) this.savedStateHandle.get(ConfigurationCache.KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCache(ConfigurationCache configurationCache) {
        this.savedStateHandle.set(ConfigurationCache.KEY, configurationCache);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r0 == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (r0 == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.stripe.android.paymentelement.embedded.content.EmbeddedConfigurationHandler
    /* renamed from: configure-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8106configure0E7RQCE(PaymentSheet.IntentConfiguration intentConfiguration, EmbeddedPaymentElement.Configuration configuration, Continuation<? super Result<PaymentElementLoader.State>> continuation) {
        DefaultEmbeddedConfigurationHandler$configure$1 defaultEmbeddedConfigurationHandler$configure$1;
        if (continuation instanceof DefaultEmbeddedConfigurationHandler$configure$1) {
            defaultEmbeddedConfigurationHandler$configure$1 = (DefaultEmbeddedConfigurationHandler$configure$1) continuation;
            if ((defaultEmbeddedConfigurationHandler$configure$1.label & Integer.MIN_VALUE) != 0) {
                defaultEmbeddedConfigurationHandler$configure$1.label -= Integer.MIN_VALUE;
            } else {
                defaultEmbeddedConfigurationHandler$configure$1 = new DefaultEmbeddedConfigurationHandler$configure$1(this, continuation);
            }
        }
        DefaultEmbeddedConfigurationHandler$configure$1 defaultEmbeddedConfigurationHandler$configure$12 = defaultEmbeddedConfigurationHandler$configure$1;
        Object objInvoke = defaultEmbeddedConfigurationHandler$configure$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultEmbeddedConfigurationHandler$configure$12.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return ((Result) objInvoke).getValue();
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
            return ((Result) objInvoke).getValue();
        }
        ResultKt.throwOnFailure(objInvoke);
        CommonConfiguration commonConfigurationAsCommonConfiguration = CommonConfigurationKt.asCommonConfiguration(configuration);
        this.eventReporter.onInit(commonConfigurationAsCommonConfiguration, configuration.getAppearance(), null, new PaymentSheetEvent.ConfigurationSpecificPayload.Embedded(this.internalRowSelectionCallback.get() != null, configuration), true);
        PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = new PaymentElementLoader.InitializationMode.DeferredIntent(intentConfiguration);
        try {
            deferredIntent.validate();
            commonConfigurationAsCommonConfiguration.validate(this.isLiveModeProvider.invoke().booleanValue());
            Arguments arguments = new Arguments(intentConfiguration, commonConfigurationAsCommonConfiguration);
            ConfigurationCache cache = getCache();
            if (cache != null && Intrinsics.areEqual(cache.getArguments(), arguments)) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(cache.getResultState());
            }
            setCache(null);
            InFlightRequest inFlightRequest = this.inFlightRequest;
            if (inFlightRequest != null) {
                if (Intrinsics.areEqual(inFlightRequest.getArguments(), arguments)) {
                    Function1<Continuation<? super Result<PaymentElementLoader.State>>, Object> result = inFlightRequest.getResult();
                    defaultEmbeddedConfigurationHandler$configure$12.label = 1;
                    objInvoke = result.invoke(defaultEmbeddedConfigurationHandler$configure$12);
                } else {
                    inFlightRequest.getCancellationHandle().invoke();
                }
            }
            this.inFlightRequest = null;
            if (this.sheetStateHolder.getSheetIsOpen()) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Configuring while a sheet is open is not supported.")));
            }
            final CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
            CoalescingOrchestrator coalescingOrchestrator = new CoalescingOrchestrator(new DefaultEmbeddedConfigurationHandler$configure$coalescingOrchestrator$1(CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default), this, deferredIntent, commonConfigurationAsCommonConfiguration, intentConfiguration, null), null, null, 6, null);
            this.inFlightRequest = new InFlightRequest(arguments, new DefaultEmbeddedConfigurationHandler$configure$4(coalescingOrchestrator), new Function0() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultEmbeddedConfigurationHandler.configure_0E7RQCE$lambda$2(completableJobSupervisorJob$default);
                }
            });
            defaultEmbeddedConfigurationHandler$configure$12.label = 2;
            objInvoke = coalescingOrchestrator.get(defaultEmbeddedConfigurationHandler$configure$12);
        } catch (IllegalArgumentException e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure_0E7RQCE$lambda$2(CompletableJob completableJob) {
        Job.DefaultImpls.cancel$default((Job) completableJob, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* compiled from: EmbeddedConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;", "Landroid/os/Parcelable;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/common/model/CommonConfiguration;)V", "getIntentConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "getConfiguration", "()Lcom/stripe/android/common/model/CommonConfiguration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {
        private final CommonConfiguration configuration;
        private final PaymentSheet.IntentConfiguration intentConfiguration;
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EmbeddedConfigurationHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Arguments(PaymentSheet.IntentConfiguration.CREATOR.createFromParcel(parcel), CommonConfiguration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, PaymentSheet.IntentConfiguration intentConfiguration, CommonConfiguration commonConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                intentConfiguration = arguments.intentConfiguration;
            }
            if ((i & 2) != 0) {
                commonConfiguration = arguments.configuration;
            }
            return arguments.copy(intentConfiguration, commonConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
            return this.intentConfiguration;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonConfiguration getConfiguration() {
            return this.configuration;
        }

        public final Arguments copy(PaymentSheet.IntentConfiguration intentConfiguration, CommonConfiguration configuration) {
            Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Arguments(intentConfiguration, configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return Intrinsics.areEqual(this.intentConfiguration, arguments.intentConfiguration) && Intrinsics.areEqual(this.configuration, arguments.configuration);
        }

        public int hashCode() {
            return (this.intentConfiguration.hashCode() * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "Arguments(intentConfiguration=" + this.intentConfiguration + ", configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.intentConfiguration.writeToParcel(dest, flags);
            this.configuration.writeToParcel(dest, flags);
        }

        public Arguments(PaymentSheet.IntentConfiguration intentConfiguration, CommonConfiguration configuration) {
            Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.intentConfiguration = intentConfiguration;
            this.configuration = configuration;
        }

        public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
            return this.intentConfiguration;
        }

        public final CommonConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: EmbeddedConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$ConfigurationCache;", "Landroid/os/Parcelable;", "arguments", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;", "resultState", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;)V", "getArguments", "()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;", "getResultState", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfigurationCache implements Parcelable {
        public static final String KEY = "ConfigurationCache";
        private final Arguments arguments;
        private final PaymentElementLoader.State resultState;
        public static final Parcelable.Creator<ConfigurationCache> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EmbeddedConfigurationHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConfigurationCache> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationCache createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfigurationCache(Arguments.CREATOR.createFromParcel(parcel), PaymentElementLoader.State.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationCache[] newArray(int i) {
                return new ConfigurationCache[i];
            }
        }

        public static /* synthetic */ ConfigurationCache copy$default(ConfigurationCache configurationCache, Arguments arguments, PaymentElementLoader.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                arguments = configurationCache.arguments;
            }
            if ((i & 2) != 0) {
                state = configurationCache.resultState;
            }
            return configurationCache.copy(arguments, state);
        }

        /* renamed from: component1, reason: from getter */
        public final Arguments getArguments() {
            return this.arguments;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentElementLoader.State getResultState() {
            return this.resultState;
        }

        public final ConfigurationCache copy(Arguments arguments, PaymentElementLoader.State resultState) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(resultState, "resultState");
            return new ConfigurationCache(arguments, resultState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfigurationCache)) {
                return false;
            }
            ConfigurationCache configurationCache = (ConfigurationCache) other;
            return Intrinsics.areEqual(this.arguments, configurationCache.arguments) && Intrinsics.areEqual(this.resultState, configurationCache.resultState);
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.resultState.hashCode();
        }

        public String toString() {
            return "ConfigurationCache(arguments=" + this.arguments + ", resultState=" + this.resultState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.arguments.writeToParcel(dest, flags);
            this.resultState.writeToParcel(dest, flags);
        }

        public ConfigurationCache(Arguments arguments, PaymentElementLoader.State resultState) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(resultState, "resultState");
            this.arguments = arguments;
            this.resultState = resultState;
        }

        public final Arguments getArguments() {
            return this.arguments;
        }

        public final PaymentElementLoader.State getResultState() {
            return this.resultState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmbeddedConfigurationHandler.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J*\u0010\u0016\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR/\u0010\u0004\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;", "", "arguments", "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "cancellationHandle", "Lkotlin/Function0;", "", "<init>", "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getArguments", "()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;", "getResult", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getCancellationHandle", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class InFlightRequest {
        private final Arguments arguments;
        private final Function0<Unit> cancellationHandle;
        private final Function1<Continuation<? super Result<PaymentElementLoader.State>>, Object> result;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InFlightRequest copy$default(InFlightRequest inFlightRequest, Arguments arguments, Function1 function1, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                arguments = inFlightRequest.arguments;
            }
            if ((i & 2) != 0) {
                function1 = inFlightRequest.result;
            }
            if ((i & 4) != 0) {
                function0 = inFlightRequest.cancellationHandle;
            }
            return inFlightRequest.copy(arguments, function1, function0);
        }

        /* renamed from: component1, reason: from getter */
        public final Arguments getArguments() {
            return this.arguments;
        }

        public final Function1<Continuation<? super Result<PaymentElementLoader.State>>, Object> component2() {
            return this.result;
        }

        public final Function0<Unit> component3() {
            return this.cancellationHandle;
        }

        public final InFlightRequest copy(Arguments arguments, Function1<? super Continuation<? super Result<PaymentElementLoader.State>>, ? extends Object> result, Function0<Unit> cancellationHandle) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(cancellationHandle, "cancellationHandle");
            return new InFlightRequest(arguments, result, cancellationHandle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InFlightRequest)) {
                return false;
            }
            InFlightRequest inFlightRequest = (InFlightRequest) other;
            return Intrinsics.areEqual(this.arguments, inFlightRequest.arguments) && Intrinsics.areEqual(this.result, inFlightRequest.result) && Intrinsics.areEqual(this.cancellationHandle, inFlightRequest.cancellationHandle);
        }

        public int hashCode() {
            return (((this.arguments.hashCode() * 31) + this.result.hashCode()) * 31) + this.cancellationHandle.hashCode();
        }

        public String toString() {
            return "InFlightRequest(arguments=" + this.arguments + ", result=" + this.result + ", cancellationHandle=" + this.cancellationHandle + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InFlightRequest(Arguments arguments, Function1<? super Continuation<? super Result<PaymentElementLoader.State>>, ? extends Object> result, Function0<Unit> cancellationHandle) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(cancellationHandle, "cancellationHandle");
            this.arguments = arguments;
            this.result = result;
            this.cancellationHandle = cancellationHandle;
        }

        public final Arguments getArguments() {
            return this.arguments;
        }

        public final Function1<Continuation<? super Result<PaymentElementLoader.State>>, Object> getResult() {
            return this.result;
        }

        public final Function0<Unit> getCancellationHandle() {
            return this.cancellationHandle;
        }
    }
}
