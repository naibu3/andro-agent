package com.stripe.android.paymentsheet.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment;
import com.stripe.android.common.coroutines.CoroutinesKtxKt;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.AccountStatusKt;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.lpmfoundations.luxe.LpmRepository;
import com.stripe.android.lpmfoundations.luxe.SaveForFutureUseHelperKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadataKtxKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.financialconnections.GetFinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentElementLoader.kt */
@Singleton
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0089\u0001B·\u0001\b\u0007\u0012\u0019\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J.\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0096@¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020,H\u0002JN\u0010:\u001a\b\u0012\u0004\u0012\u0002080+2\u0006\u0010-\u001a\u00020.2\b\u0010;\u001a\u0004\u0018\u00010\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0=2\b\u0010A\u001a\u0004\u0018\u00010@H\u0082@¢\u0006\u0004\bB\u0010CJ4\u0010D\u001a\u00020E2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u0002082\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020KH\u0002J\"\u0010L\u001a\u00020M2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u0002082\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010N\u001a\u00020K2\u0006\u00107\u001a\u000208H\u0002J\u001a\u0010O\u001a\u0004\u0018\u00010G2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000208H\u0002J8\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u00101\u001a\u00020E2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020VH\u0082@¢\u0006\u0002\u0010WJ$\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0=2\u0006\u00101\u001a\u00020E2\u0006\u0010Z\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010[J<\u0010\\\u001a\u0004\u0018\u00010I2\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010G2\u0006\u0010-\u001a\u00020.2\b\u0010]\u001a\u0004\u0018\u00010^H\u0082@¢\u0006\u0002\u0010_J.\u0010`\u001a\u00020I2\u0006\u0010/\u001a\u0002002\u0006\u0010a\u001a\u00020b2\u0006\u00107\u001a\u0002082\u0006\u0010c\u001a\u00020KH\u0082@¢\u0006\u0002\u0010dJ<\u0010e\u001a\u0004\u0018\u00010b2\u0006\u0010/\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010G2\u0006\u00107\u001a\u0002082\u0006\u0010-\u001a\u00020.2\b\u0010]\u001a\u0004\u0018\u00010^H\u0082@¢\u0006\u0002\u0010fJ\u001e\u0010J\u001a\u00020K2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u0010gJ\u0012\u0010J\u001a\u00020K*\u000200H\u0082@¢\u0006\u0002\u0010hJ\u000e\u0010i\u001a\u00020KH\u0082@¢\u0006\u0002\u0010jJ@\u0010k\u001a\u0004\u0018\u00010l2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u00101\u001a\u00020E2\b\u0010;\u001a\u0004\u0018\u00010Q2\u0006\u0010J\u001a\u00020K2\u0006\u0010m\u001a\u00020KH\u0082@¢\u0006\u0002\u0010nJ&\u0010o\u001a\u00020T2\u0006\u0010/\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u0010pJ\u0018\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010/\u001a\u000200H\u0082@¢\u0006\u0002\u0010hJ&\u0010o\u001a\u00020T2\u0006\u0010/\u001a\u0002002\u0006\u0010J\u001a\u00020K2\u0006\u0010s\u001a\u00020KH\u0082@¢\u0006\u0002\u0010tJ\u0010\u0010u\u001a\u0002062\u0006\u0010v\u001a\u00020wH\u0002J\u0010\u0010x\u001a\u00020K2\u0006\u00101\u001a\u00020EH\u0002JJ\u0010y\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020,2\u0006\u0010z\u001a\u00020K2\u0006\u0010i\u001a\u00020K2\u0006\u0010{\u001a\u00020|2\u0006\u0010-\u001a\u00020.2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010}\u001a\u00020EH\u0002J\u0011\u0010~\u001a\u0002062\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J,\u0010\u0081\u0001\u001a\u0002062\u000f\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010=2\u0010\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010=H\u0002J\u0018\u0010\u0085\u0001\u001a\u0002062\r\u0010<\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010=H\u0002J\u000e\u0010\u0087\u0001\u001a\u00030\u0088\u0001*\u00020GH\u0002R!\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008a\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "googlePayRepositoryFactory", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "lpmRepository", "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;", "logger", "Lcom/stripe/android/core/Logger;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "retrieveCustomerEmail", "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;", "accountStatusProvider", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "logLinkHoldbackExperiment", "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "linkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "externalPaymentMethodsRepository", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;", "userFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "cvcRecollectionHandler", "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;Lcom/stripe/android/core/utils/UserFacingLogger;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;)V", "load", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "metadata", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;", "load-BWLJW6A", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logLinkExperimentExposures", "", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", ServerProtocol.DIALOG_PARAM_STATE, "retrieveElementsSession", "customer", "customPaymentMethods", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "externalPaymentMethods", "", "savedPaymentMethodSelectionId", "retrieveElementsSession-hUnOzRk", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerInfo", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;", "linkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "isGooglePayReady", "", "getCustomerMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "getDefaultPaymentMethodsEnabled", "createCustomerInfo", "createCustomerState", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "savedSelection", "Lkotlinx/coroutines/Deferred;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "cardBrandFilter", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;", "(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCustomerPaymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "customerConfig", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkState", "linkAppearance", "Lcom/stripe/android/link/model/LinkAppearance;", "(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinkState", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "linkSignUpDisabled", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ElementsSession;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkConfiguration", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/stripe/android/common/model/CommonConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isGooglePaySupported", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveInitialPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "isUsingWalletButtons", "(Lkotlinx/coroutines/Deferred;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/state/CustomerState;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSavedSelection", "(Lcom/stripe/android/common/model/CommonConfiguration;ZLcom/stripe/android/model/ElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSavedPaymentMethodSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;", "isLinkAvailable", "(Lcom/stripe/android/common/model/CommonConfiguration;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "warnUnactivatedIfNeeded", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "supportsIntent", "reportSuccessfulLoad", "isReloadingAfterProcessDeath", "linkDisplay", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "paymentMethodMetadata", "reportFailedLoad", "error", "", "logIfMissingExternalPaymentMethods", "requestedExternalPaymentMethods", "actualExternalPaymentMethods", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "logCustomPaymentMethodErrors", "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;", "toCustomerInfo", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "CustomerInfo", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentElementLoader implements PaymentElementLoader {
    public static final int $stable = 8;
    private final LinkAccountStatusProvider accountStatusProvider;
    private final CustomerRepository customerRepository;
    private final CvcRecollectionHandler cvcRecollectionHandler;
    private final ElementsSessionRepository elementsSessionRepository;
    private final ErrorReporter errorReporter;
    private final EventReporter eventReporter;
    private final ExternalPaymentMethodsRepository externalPaymentMethodsRepository;
    private final Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final LinkGate.Factory linkGateFactory;
    private final LinkStore linkStore;
    private final LogLinkHoldbackExperiment logLinkHoldbackExperiment;
    private final Logger logger;
    private final LpmRepository lpmRepository;
    private final Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory;
    private final RetrieveCustomerEmail retrieveCustomerEmail;
    private final UserFacingLogger userFacingLogger;
    private final CoroutineContext workContext;

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Test.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0, 1}, l = {TypedValues.CycleType.TYPE_WAVE_PHASE, 437}, m = "createCustomerState", n = {"metadata", "savedSelection", "cardBrandFilter", "cardBrandFilter"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$createCustomerState$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.createCustomerState(null, null, null, null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {572}, m = "createLinkConfiguration", n = {"this", "configuration", "elementsSession", "initializationMode", "linkAppearance", "cardBrandFilter", "shippingDetails", "customerPhone", "isCardBrandFilteringRequired"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$createLinkConfiguration$1, reason: invalid class name and case insensitive filesystem */
    static final class C11381 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C11381(Continuation<? super C11381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.createLinkConfiguration(null, null, null, null, null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0}, l = {480, 487}, m = "createLinkState", n = {"this", "elementsSession", "configuration"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$createLinkState$1, reason: invalid class name and case insensitive filesystem */
    static final class C11391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11391(Continuation<? super C11391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.createLinkState(null, null, null, null, null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0}, l = {644, 656}, m = "isGooglePayReady", n = {"this", "configuration", "elementsSession"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$isGooglePayReady$1, reason: invalid class name and case insensitive filesystem */
    static final class C11401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11401(Continuation<? super C11401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.isGooglePayReady(null, null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {}, l = {669}, m = "isGooglePayReady", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$isGooglePayReady$2, reason: invalid class name */
    static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.isGooglePayReady(null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0, 0, 0}, l = {TypedValues.PositionType.TYPE_TRANSITION_EASING}, m = "loadLinkState", n = {"this", "configuration", "linkConfiguration", "elementsSession", "linkSignUpDisabled"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$loadLinkState$1, reason: invalid class name and case insensitive filesystem */
    static final class C11411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C11411(Continuation<? super C11411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.loadLinkState(null, null, null, false, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {}, l = {457}, m = "retrieveCustomerPaymentMethods", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$retrieveCustomerPaymentMethods$1, reason: invalid class name and case insensitive filesystem */
    static final class C11421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11421(Continuation<? super C11421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.retrieveCustomerPaymentMethods(null, null, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {0, 0, 0}, l = {689}, m = "retrieveInitialPaymentSelection", n = {"customer", "isGooglePayReady", "isUsingWalletButtons"}, s = {"L$0", "Z$0", "Z$1"})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$retrieveInitialPaymentSelection$1, reason: invalid class name and case insensitive filesystem */
    static final class C11431 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C11431(Continuation<? super C11431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.retrieveInitialPaymentSelection(null, null, null, false, false, this);
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader", f = "PaymentElementLoader.kt", i = {}, l = {734}, m = "retrieveSavedPaymentMethodSelection", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader$retrieveSavedPaymentMethodSelection$1, reason: invalid class name and case insensitive filesystem */
    static final class C11441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11441(Continuation<? super C11441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultPaymentElementLoader.this.retrieveSavedPaymentMethodSelection(null, this);
        }
    }

    @Inject
    public DefaultPaymentElementLoader(Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, ElementsSessionRepository elementsSessionRepository, CustomerRepository customerRepository, LpmRepository lpmRepository, Logger logger, EventReporter eventReporter, ErrorReporter errorReporter, @IOContext CoroutineContext workContext, RetrieveCustomerEmail retrieveCustomerEmail, LinkAccountStatusProvider accountStatusProvider, LogLinkHoldbackExperiment logLinkHoldbackExperiment, LinkStore linkStore, LinkGate.Factory linkGateFactory, ExternalPaymentMethodsRepository externalPaymentMethodsRepository, UserFacingLogger userFacingLogger, CvcRecollectionHandler cvcRecollectionHandler) {
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(elementsSessionRepository, "elementsSessionRepository");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(retrieveCustomerEmail, "retrieveCustomerEmail");
        Intrinsics.checkNotNullParameter(accountStatusProvider, "accountStatusProvider");
        Intrinsics.checkNotNullParameter(logLinkHoldbackExperiment, "logLinkHoldbackExperiment");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        Intrinsics.checkNotNullParameter(linkGateFactory, "linkGateFactory");
        Intrinsics.checkNotNullParameter(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        Intrinsics.checkNotNullParameter(userFacingLogger, "userFacingLogger");
        Intrinsics.checkNotNullParameter(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.elementsSessionRepository = elementsSessionRepository;
        this.customerRepository = customerRepository;
        this.lpmRepository = lpmRepository;
        this.logger = logger;
        this.eventReporter = eventReporter;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.retrieveCustomerEmail = retrieveCustomerEmail;
        this.accountStatusProvider = accountStatusProvider;
        this.logLinkHoldbackExperiment = logLinkHoldbackExperiment;
        this.linkStore = linkStore;
        this.linkGateFactory = linkGateFactory;
        this.externalPaymentMethodsRepository = externalPaymentMethodsRepository;
        this.userFacingLogger = userFacingLogger;
        this.cvcRecollectionHandler = cvcRecollectionHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.state.PaymentElementLoader
    /* renamed from: load-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8425loadBWLJW6A(PaymentElementLoader.InitializationMode initializationMode, CommonConfiguration commonConfiguration, PaymentElementLoader.Metadata metadata, Continuation<? super Result<PaymentElementLoader.State>> continuation) {
        DefaultPaymentElementLoader$load$1 defaultPaymentElementLoader$load$1;
        if (continuation instanceof DefaultPaymentElementLoader$load$1) {
            defaultPaymentElementLoader$load$1 = (DefaultPaymentElementLoader$load$1) continuation;
            if ((defaultPaymentElementLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                defaultPaymentElementLoader$load$1.label -= Integer.MIN_VALUE;
            } else {
                defaultPaymentElementLoader$load$1 = new DefaultPaymentElementLoader$load$1(this, continuation);
            }
        }
        Object obj = defaultPaymentElementLoader$load$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultPaymentElementLoader$load$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        CoroutineContext coroutineContext = this.workContext;
        DefaultPaymentElementLoader$load$2 defaultPaymentElementLoader$load$2 = new DefaultPaymentElementLoader$load$2(this);
        DefaultPaymentElementLoader$load$3 defaultPaymentElementLoader$load$3 = new DefaultPaymentElementLoader$load$3(this, metadata, commonConfiguration, initializationMode, null);
        defaultPaymentElementLoader$load$1.label = 1;
        Object objRunCatching = CoroutinesKtxKt.runCatching(coroutineContext, defaultPaymentElementLoader$load$2, defaultPaymentElementLoader$load$3, defaultPaymentElementLoader$load$1);
        return objRunCatching == coroutine_suspended ? coroutine_suspended : objRunCatching;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logLinkExperimentExposures(ElementsSession elementsSession, PaymentElementLoader.State state) {
        this.logLinkHoldbackExperiment.invoke(ElementsSession.ExperimentAssignment.LINK_GLOBAL_HOLD_BACK, elementsSession, state);
        this.logLinkHoldbackExperiment.invoke(ElementsSession.ExperimentAssignment.LINK_AB_TEST, elementsSession, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: retrieveElementsSession-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8424retrieveElementsSessionhUnOzRk(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.CustomerConfiguration customerConfiguration, List<PaymentSheet.CustomPaymentMethod> list, List<String> list2, String str, Continuation<? super Result<ElementsSession>> continuation) {
        DefaultPaymentElementLoader$retrieveElementsSession$1 defaultPaymentElementLoader$retrieveElementsSession$1;
        if (continuation instanceof DefaultPaymentElementLoader$retrieveElementsSession$1) {
            defaultPaymentElementLoader$retrieveElementsSession$1 = (DefaultPaymentElementLoader$retrieveElementsSession$1) continuation;
            if ((defaultPaymentElementLoader$retrieveElementsSession$1.label & Integer.MIN_VALUE) != 0) {
                defaultPaymentElementLoader$retrieveElementsSession$1.label -= Integer.MIN_VALUE;
            } else {
                defaultPaymentElementLoader$retrieveElementsSession$1 = new DefaultPaymentElementLoader$retrieveElementsSession$1(this, continuation);
            }
        }
        DefaultPaymentElementLoader$retrieveElementsSession$1 defaultPaymentElementLoader$retrieveElementsSession$12 = defaultPaymentElementLoader$retrieveElementsSession$1;
        Object obj = defaultPaymentElementLoader$retrieveElementsSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultPaymentElementLoader$retrieveElementsSession$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ElementsSessionRepository elementsSessionRepository = this.elementsSessionRepository;
        defaultPaymentElementLoader$retrieveElementsSession$12.label = 1;
        Object objMo8420gethUnOzRk = elementsSessionRepository.mo8420gethUnOzRk(initializationMode, customerConfiguration, list, list2, str, defaultPaymentElementLoader$retrieveElementsSession$12);
        return objMo8420gethUnOzRk == coroutine_suspended ? coroutine_suspended : objMo8420gethUnOzRk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodMetadata createPaymentMethodMetadata(CommonConfiguration configuration, ElementsSession elementsSession, CustomerInfo customerInfo, LinkState linkState, boolean isGooglePayReady) {
        LpmRepository.Result sharedDataSpecs = this.lpmRepository.getSharedDataSpecs(elementsSession.getStripeIntent(), elementsSession.getPaymentMethodSpecs());
        if (sharedDataSpecs.getFailedToParseServerResponse()) {
            this.eventReporter.onLpmSpecFailure(sharedDataSpecs.getFailedToParseServerErrorMessage());
        }
        List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs = this.externalPaymentMethodsRepository.getExternalPaymentMethodSpecs(elementsSession.getExternalPaymentMethodData());
        logIfMissingExternalPaymentMethods(configuration.getExternalPaymentMethods(), externalPaymentMethodSpecs);
        logCustomPaymentMethodErrors(elementsSession.getCustomPaymentMethods());
        return PaymentMethodMetadata.INSTANCE.createForPaymentElement$paymentsheet_release(elementsSession, configuration, sharedDataSpecs.getSharedDataSpecs(), externalPaymentMethodSpecs, isGooglePayReady, linkState, getCustomerMetadata(configuration, elementsSession, customerInfo));
    }

    private final CustomerMetadata getCustomerMetadata(CommonConfiguration configuration, ElementsSession elementsSession, CustomerInfo customerInfo) {
        CustomerMetadata.Permissions permissionsCreateForPaymentSheetLegacyEphemeralKey$paymentsheet_release;
        boolean z = configuration.getCustomer() != null;
        boolean defaultPaymentMethodsEnabled = getDefaultPaymentMethodsEnabled(elementsSession);
        if (customerInfo instanceof CustomerInfo.CustomerSession) {
            permissionsCreateForPaymentSheetLegacyEphemeralKey$paymentsheet_release = CustomerMetadata.Permissions.INSTANCE.createForPaymentSheetCustomerSession$paymentsheet_release(configuration, ((CustomerInfo.CustomerSession) customerInfo).getElementsSessionCustomer());
        } else {
            permissionsCreateForPaymentSheetLegacyEphemeralKey$paymentsheet_release = CustomerMetadata.Permissions.INSTANCE.createForPaymentSheetLegacyEphemeralKey$paymentsheet_release(configuration);
        }
        return new CustomerMetadata(z, defaultPaymentMethodsEnabled, permissionsCreateForPaymentSheetLegacyEphemeralKey$paymentsheet_release);
    }

    private final boolean getDefaultPaymentMethodsEnabled(ElementsSession elementsSession) {
        ElementsSession.Customer.Session session;
        ElementsSession.Customer.Components components;
        ElementsSession.Customer customer = elementsSession.getCustomer();
        ElementsSession.Customer.Components.MobilePaymentElement mobilePaymentElement = (customer == null || (session = customer.getSession()) == null || (components = session.getComponents()) == null) ? null : components.getMobilePaymentElement();
        ElementsSession.Customer.Components.MobilePaymentElement.Enabled enabled = mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Enabled ? (ElementsSession.Customer.Components.MobilePaymentElement.Enabled) mobilePaymentElement : null;
        if (enabled != null) {
            return enabled.isPaymentMethodSetAsDefaultEnabled();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerInfo createCustomerInfo(CommonConfiguration configuration, ElementsSession elementsSession) {
        PaymentSheet.CustomerConfiguration customer = configuration.getCustomer();
        CustomerInfo.CustomerSession customerSession = null;
        PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customer != null ? customer.getAccessType$paymentsheet_release() : null;
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession) {
            ElementsSession.Customer customer2 = elementsSession.getCustomer();
            if (customer2 != null) {
                customerSession = new CustomerInfo.CustomerSession(customer2, ((PaymentSheet.CustomerAccessType.CustomerSession) accessType$paymentsheet_release).getCustomerSessionClientSecret());
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
                ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND, StripeException.INSTANCE.create(illegalStateException), null, 4, null);
                if (!elementsSession.getStripeIntent().isLiveMode()) {
                    throw illegalStateException;
                }
            }
            return customerSession;
        }
        if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) {
            return new CustomerInfo.Legacy(customer, (PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) accessType$paymentsheet_release);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCustomerState(CustomerInfo customerInfo, PaymentMethodMetadata paymentMethodMetadata, Deferred<? extends SavedSelection> deferred, PaymentSheetCardBrandFilter paymentSheetCardBrandFilter, Continuation<? super CustomerState> continuation) {
        AnonymousClass1 anonymousClass1;
        Deferred<? extends SavedSelection> deferred2;
        PaymentSheetCardBrandFilter paymentSheetCardBrandFilter2;
        CustomerState customerStateCreateForCustomerSession$paymentsheet_release;
        CustomerState.Companion companion;
        PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey legacyCustomerEphemeralKey;
        Deferred<? extends SavedSelection> deferred3;
        PaymentMethodMetadata paymentMethodMetadata2;
        String str;
        PaymentSheetCardBrandFilter paymentSheetCardBrandFilter3;
        PaymentMethodMetadata paymentMethodMetadata3 = paymentMethodMetadata;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst);
            if (customerInfo instanceof CustomerInfo.CustomerSession) {
                CustomerInfo.CustomerSession customerSession = (CustomerInfo.CustomerSession) customerInfo;
                customerStateCreateForCustomerSession$paymentsheet_release = CustomerState.INSTANCE.createForCustomerSession$paymentsheet_release(customerSession.getElementsSessionCustomer(), paymentMethodMetadata3.supportedSavedPaymentMethodTypes(), customerSession.getCustomerSessionClientSecret());
                deferred2 = deferred;
                paymentSheetCardBrandFilter2 = paymentSheetCardBrandFilter;
            } else {
                if (customerInfo instanceof CustomerInfo.Legacy) {
                    companion = CustomerState.INSTANCE;
                    CustomerInfo.Legacy legacy = (CustomerInfo.Legacy) customerInfo;
                    String id = legacy.getId();
                    PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey accessType = legacy.getAccessType();
                    PaymentSheet.CustomerConfiguration customerConfig = legacy.getCustomerConfig();
                    anonymousClass1.L$0 = paymentMethodMetadata3;
                    anonymousClass1.L$1 = deferred;
                    paymentSheetCardBrandFilter2 = paymentSheetCardBrandFilter;
                    anonymousClass1.L$2 = paymentSheetCardBrandFilter2;
                    anonymousClass1.L$3 = companion;
                    anonymousClass1.L$4 = id;
                    anonymousClass1.L$5 = accessType;
                    anonymousClass1.label = 1;
                    Object objRetrieveCustomerPaymentMethods = retrieveCustomerPaymentMethods(paymentMethodMetadata3, customerConfig, anonymousClass1);
                    if (objRetrieveCustomerPaymentMethods != coroutine_suspended) {
                        objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst = objRetrieveCustomerPaymentMethods;
                        legacyCustomerEphemeralKey = accessType;
                        deferred3 = deferred;
                        paymentMethodMetadata2 = paymentMethodMetadata3;
                        str = id;
                    }
                    return coroutine_suspended;
                }
                deferred2 = deferred;
                paymentSheetCardBrandFilter2 = paymentSheetCardBrandFilter;
                customerStateCreateForCustomerSession$paymentsheet_release = null;
            }
            if (customerStateCreateForCustomerSession$paymentsheet_release != null) {
                return null;
            }
            List<PaymentMethod> paymentMethods = customerStateCreateForCustomerSession$paymentsheet_release.getPaymentMethods();
            String defaultPaymentMethodId = customerStateCreateForCustomerSession$paymentsheet_release.getDefaultPaymentMethodId();
            CustomerMetadata customerMetadata = paymentMethodMetadata3.getCustomerMetadata();
            boolean zIsPaymentMethodSetAsDefaultEnabled = customerMetadata != null ? customerMetadata.isPaymentMethodSetAsDefaultEnabled() : false;
            anonymousClass1.L$0 = paymentSheetCardBrandFilter2;
            anonymousClass1.L$1 = customerStateCreateForCustomerSession$paymentsheet_release;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 2;
            objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst = PaymentElementLoaderKt.withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(paymentMethods, deferred2, zIsPaymentMethodSetAsDefaultEnabled, defaultPaymentMethodId, anonymousClass1);
            if (objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst != coroutine_suspended) {
                paymentSheetCardBrandFilter3 = paymentSheetCardBrandFilter2;
                CustomerState customerState = customerStateCreateForCustomerSession$paymentsheet_release;
                ArrayList arrayList = new ArrayList();
                while (r3.hasNext()) {
                }
                return CustomerState.copy$default(customerState, null, null, null, arrayList, null, 23, null);
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customerStateCreateForCustomerSession$paymentsheet_release = (CustomerState) anonymousClass1.L$1;
            paymentSheetCardBrandFilter3 = (PaymentSheetCardBrandFilter) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst);
            CustomerState customerState2 = customerStateCreateForCustomerSession$paymentsheet_release;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst) {
                if (paymentSheetCardBrandFilter3.isAccepted((PaymentMethod) obj)) {
                    arrayList2.add(obj);
                }
            }
            return CustomerState.copy$default(customerState2, null, null, null, arrayList2, null, 23, null);
        }
        legacyCustomerEphemeralKey = (PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) anonymousClass1.L$5;
        str = (String) anonymousClass1.L$4;
        companion = (CustomerState.Companion) anonymousClass1.L$3;
        PaymentSheetCardBrandFilter paymentSheetCardBrandFilter4 = (PaymentSheetCardBrandFilter) anonymousClass1.L$2;
        deferred3 = (Deferred) anonymousClass1.L$1;
        paymentMethodMetadata2 = (PaymentMethodMetadata) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst);
        paymentSheetCardBrandFilter2 = paymentSheetCardBrandFilter4;
        customerStateCreateForCustomerSession$paymentsheet_release = companion.createForLegacyEphemeralKey$paymentsheet_release(str, legacyCustomerEphemeralKey, (List) objWithDefaultPaymentMethodOrLastUsedPaymentMethodFirst);
        paymentMethodMetadata3 = paymentMethodMetadata2;
        deferred2 = deferred3;
        if (customerStateCreateForCustomerSession$paymentsheet_release != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveCustomerPaymentMethods(PaymentMethodMetadata paymentMethodMetadata, PaymentSheet.CustomerConfiguration customerConfiguration, Continuation<? super List<PaymentMethod>> continuation) {
        C11421 c11421;
        Object objMo8417getPaymentMethodsBWLJW6A;
        if (continuation instanceof C11421) {
            c11421 = (C11421) continuation;
            if ((c11421.label & Integer.MIN_VALUE) != 0) {
                c11421.label -= Integer.MIN_VALUE;
            } else {
                c11421 = new C11421(continuation);
            }
        }
        Object obj = c11421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11421.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<PaymentMethod.Type> listSupportedSavedPaymentMethodTypes = paymentMethodMetadata.supportedSavedPaymentMethodTypes();
            PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customerConfiguration.getAccessType$paymentsheet_release();
            PaymentSheet.CustomerAccessType.CustomerSession customerSession = accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession ? (PaymentSheet.CustomerAccessType.CustomerSession) accessType$paymentsheet_release : null;
            String customerSessionClientSecret = customerSession != null ? customerSession.getCustomerSessionClientSecret() : null;
            CustomerRepository customerRepository = this.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(customerConfiguration.getId(), customerConfiguration.getEphemeralKeySecret(), customerSessionClientSecret);
            boolean zIsLiveMode = paymentMethodMetadata.getStripeIntent().isLiveMode();
            c11421.label = 1;
            objMo8417getPaymentMethodsBWLJW6A = customerRepository.mo8417getPaymentMethodsBWLJW6A(customerInfo, listSupportedSavedPaymentMethodTypes, zIsLiveMode, c11421);
            if (objMo8417getPaymentMethodsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8417getPaymentMethodsBWLJW6A = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objMo8417getPaymentMethodsBWLJW6A);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objMo8417getPaymentMethodsBWLJW6A) {
            if (((PaymentMethod) obj2).hasExpectedDetails()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLinkState(ElementsSession elementsSession, CommonConfiguration commonConfiguration, CustomerInfo customerInfo, PaymentElementLoader.InitializationMode initializationMode, LinkAppearance linkAppearance, Continuation<? super LinkState> continuation) {
        C11391 c11391;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        ElementsSession elementsSession2;
        CommonConfiguration commonConfiguration2;
        if (continuation instanceof C11391) {
            c11391 = (C11391) continuation;
            if ((c11391.label & Integer.MIN_VALUE) != 0) {
                c11391.label -= Integer.MIN_VALUE;
            } else {
                c11391 = new C11391(continuation);
            }
        }
        C11391 c113912 = c11391;
        Object obj = c113912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c113912.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c113912.L$0 = this;
            c113912.L$1 = elementsSession;
            c113912.L$2 = commonConfiguration;
            c113912.label = 1;
            Object objCreateLinkConfiguration = createLinkConfiguration(commonConfiguration, customerInfo, elementsSession, initializationMode, linkAppearance, c113912);
            if (objCreateLinkConfiguration != coroutine_suspended) {
                defaultPaymentElementLoader = this;
                elementsSession2 = elementsSession;
                obj = objCreateLinkConfiguration;
                commonConfiguration2 = commonConfiguration;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        commonConfiguration2 = (CommonConfiguration) c113912.L$2;
        elementsSession2 = (ElementsSession) c113912.L$1;
        DefaultPaymentElementLoader defaultPaymentElementLoader2 = (DefaultPaymentElementLoader) c113912.L$0;
        ResultKt.throwOnFailure(obj);
        defaultPaymentElementLoader = defaultPaymentElementLoader2;
        LinkConfiguration linkConfiguration = (LinkConfiguration) obj;
        if (linkConfiguration == null) {
            return null;
        }
        boolean disableLinkSignup = elementsSession2.getDisableLinkSignup();
        c113912.L$0 = null;
        c113912.L$1 = null;
        c113912.L$2 = null;
        c113912.label = 2;
        Object objLoadLinkState = defaultPaymentElementLoader.loadLinkState(commonConfiguration2, linkConfiguration, elementsSession2, disableLinkSignup, c113912);
        return objLoadLinkState == coroutine_suspended ? coroutine_suspended : objLoadLinkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLinkState(CommonConfiguration commonConfiguration, LinkConfiguration linkConfiguration, ElementsSession elementsSession, boolean z, Continuation<? super LinkState> continuation) {
        C11411 c11411;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        LinkSignupMode linkSignupMode;
        String email;
        if (continuation instanceof C11411) {
            c11411 = (C11411) continuation;
            if ((c11411.label & Integer.MIN_VALUE) != 0) {
                c11411.label -= Integer.MIN_VALUE;
            } else {
                c11411 = new C11411(continuation);
            }
        }
        Object objInvoke = c11411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11411.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            LinkAccountStatusProvider linkAccountStatusProvider = this.accountStatusProvider;
            c11411.L$0 = this;
            c11411.L$1 = commonConfiguration;
            c11411.L$2 = linkConfiguration;
            c11411.L$3 = elementsSession;
            c11411.Z$0 = z;
            c11411.label = 1;
            objInvoke = linkAccountStatusProvider.invoke(linkConfiguration, c11411);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultPaymentElementLoader = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c11411.Z$0;
            elementsSession = (ElementsSession) c11411.L$3;
            linkConfiguration = (LinkConfiguration) c11411.L$2;
            commonConfiguration = (CommonConfiguration) c11411.L$1;
            defaultPaymentElementLoader = (DefaultPaymentElementLoader) c11411.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        AccountStatus accountStatus = (AccountStatus) objInvoke;
        LinkState.LoginState loginState = AccountStatusKt.toLoginState(accountStatus);
        boolean zIsSaveForFutureUseValueChangeable = SaveForFutureUseHelperKt.isSaveForFutureUseValueChangeable(PaymentMethod.Type.Card.code, PaymentMethodMetadataKtxKt.toPaymentSheetSaveConsentBehavior(elementsSession), elementsSession.getStripeIntent(), commonConfiguration.getCustomer() != null);
        boolean zHasUsedLink = defaultPaymentElementLoader.linkStore.hasUsedLink();
        LinkSignupMode linkSignupMode2 = null;
        if (elementsSession.getLinkSignUpOptInFeatureEnabled() && (email = linkConfiguration.getCustomerInfo().getEmail()) != null && !StringsKt.isBlank(email)) {
            linkSignupMode = LinkSignupMode.InsteadOfSaveForFutureUse;
        } else if (z || zHasUsedLink) {
            linkSignupMode = null;
        } else if (zIsSaveForFutureUseValueChangeable) {
            linkSignupMode = LinkSignupMode.AlongsideSaveForFutureUse;
        } else {
            linkSignupMode = LinkSignupMode.InsteadOfSaveForFutureUse;
        }
        boolean zContains = linkConfiguration.getStripeIntent().getLinkFundingSources().contains(PaymentMethod.Type.Card.code);
        boolean z2 = accountStatus == AccountStatus.SignedOut;
        if (zContains && z2) {
            linkSignupMode2 = linkSignupMode;
        }
        return new LinkState(linkConfiguration, loginState, linkSignupMode2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLinkConfiguration(CommonConfiguration commonConfiguration, CustomerInfo customerInfo, ElementsSession elementsSession, PaymentElementLoader.InitializationMode initializationMode, LinkAppearance linkAppearance, Continuation<? super LinkConfiguration> continuation) {
        C11381 c11381;
        DefaultCardBrandFilter paymentSheetCardBrandFilter;
        String phone;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        CardBrandFilter cardBrandFilter;
        AddressDetails addressDetails;
        ElementsSession elementsSession2;
        PaymentElementLoader.InitializationMode initializationMode2;
        LinkAppearance linkAppearance2;
        CommonConfiguration commonConfiguration2;
        int i;
        String str;
        ElementsSession.Customer.Session session;
        PaymentSheet.Address address;
        if (continuation instanceof C11381) {
            c11381 = (C11381) continuation;
            if ((c11381.label & Integer.MIN_VALUE) != 0) {
                c11381.label -= Integer.MIN_VALUE;
            } else {
                c11381 = new C11381(continuation);
            }
        }
        Object obj = c11381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!commonConfiguration.getLink().getShouldDisplay$paymentsheet_release() || !elementsSession.isLinkEnabled()) {
                return null;
            }
            int i3 = (!elementsSession.getLinkPassthroughModeEnabled() || Intrinsics.areEqual(commonConfiguration.getCardBrandAcceptance(), PaymentSheet.CardBrandAcceptance.All.INSTANCE)) ? 0 : 1;
            if (i3 != 0) {
                paymentSheetCardBrandFilter = new PaymentSheetCardBrandFilter(commonConfiguration.getCardBrandAcceptance());
            } else {
                paymentSheetCardBrandFilter = DefaultCardBrandFilter.INSTANCE;
            }
            AddressDetails shippingDetails = commonConfiguration.getShippingDetails();
            if (shippingDetails != null ? Intrinsics.areEqual(shippingDetails.isCheckboxSelected(), Boxing.boxBoolean(true)) : false) {
                phone = shippingDetails.getPhoneNumber();
            } else {
                PaymentSheet.BillingDetails defaultBillingDetails = commonConfiguration.getDefaultBillingDetails();
                phone = defaultBillingDetails != null ? defaultBillingDetails.getPhone() : null;
            }
            RetrieveCustomerEmail retrieveCustomerEmail = this.retrieveCustomerEmail;
            CustomerRepository.CustomerInfo customerInfo2 = customerInfo != null ? toCustomerInfo(customerInfo) : null;
            c11381.L$0 = this;
            c11381.L$1 = commonConfiguration;
            c11381.L$2 = elementsSession;
            c11381.L$3 = initializationMode;
            c11381.L$4 = linkAppearance;
            c11381.L$5 = paymentSheetCardBrandFilter;
            c11381.L$6 = shippingDetails;
            c11381.L$7 = phone;
            c11381.I$0 = i3;
            c11381.label = 1;
            Object objInvoke = retrieveCustomerEmail.invoke(commonConfiguration, customerInfo2, c11381);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultPaymentElementLoader = this;
            cardBrandFilter = paymentSheetCardBrandFilter;
            addressDetails = shippingDetails;
            elementsSession2 = elementsSession;
            initializationMode2 = initializationMode;
            linkAppearance2 = linkAppearance;
            commonConfiguration2 = commonConfiguration;
            i = i3;
            obj = objInvoke;
            str = phone;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c11381.I$0;
            str = (String) c11381.L$7;
            addressDetails = (AddressDetails) c11381.L$6;
            CardBrandFilter cardBrandFilter2 = (CardBrandFilter) c11381.L$5;
            LinkAppearance linkAppearance3 = (LinkAppearance) c11381.L$4;
            PaymentElementLoader.InitializationMode initializationMode3 = (PaymentElementLoader.InitializationMode) c11381.L$3;
            elementsSession2 = (ElementsSession) c11381.L$2;
            commonConfiguration2 = (CommonConfiguration) c11381.L$1;
            defaultPaymentElementLoader = (DefaultPaymentElementLoader) c11381.L$0;
            ResultKt.throwOnFailure(obj);
            cardBrandFilter = cardBrandFilter2;
            linkAppearance2 = linkAppearance3;
            initializationMode2 = initializationMode3;
        }
        String str2 = (String) obj;
        PaymentSheet.BillingDetails defaultBillingDetails2 = commonConfiguration2.getDefaultBillingDetails();
        String name = defaultBillingDetails2 != null ? defaultBillingDetails2.getName() : null;
        PaymentSheet.BillingDetails defaultBillingDetails3 = commonConfiguration2.getDefaultBillingDetails();
        LinkConfiguration.CustomerInfo customerInfo3 = new LinkConfiguration.CustomerInfo(name, str2, str, (defaultBillingDetails3 == null || (address = defaultBillingDetails3.getAddress()) == null) ? null : address.getCountry());
        ElementsSession.CardBrandChoice cardBrandChoice = elementsSession2.getCardBrandChoice();
        LinkConfiguration.CardBrandChoice cardBrandChoice2 = cardBrandChoice != null ? new LinkConfiguration.CardBrandChoice(cardBrandChoice.getEligible(), cardBrandChoice.getPreferredNetworks()) : null;
        StripeIntent stripeIntent = elementsSession2.getStripeIntent();
        String merchantDisplayName = commonConfiguration2.getMerchantDisplayName();
        String merchantCountry = elementsSession2.getMerchantCountry();
        AddressDetails addressDetails2 = (addressDetails == null || !Intrinsics.areEqual(addressDetails.isCheckboxSelected(), Boxing.boxBoolean(true))) ? null : addressDetails;
        boolean linkPassthroughModeEnabled = elementsSession2.getLinkPassthroughModeEnabled();
        FinancialConnectionsAvailability financialConnectionsAvailabilityInvoke$default = GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, elementsSession2, null, 2, null);
        Map<String, Boolean> linkFlags = elementsSession2.getLinkFlags();
        boolean useAttestationEndpointsForLink = elementsSession2.getUseAttestationEndpointsForLink();
        boolean suppressLink2faModal = elementsSession2.getSuppressLink2faModal();
        boolean disableRuxInFlowController = elementsSession2.getDisableRuxInFlowController();
        boolean linkEnableDisplayableDefaultValuesInEce = elementsSession2.getLinkEnableDisplayableDefaultValuesInEce();
        boolean linkSignUpOptInFeatureEnabled = elementsSession2.getLinkSignUpOptInFeatureEnabled();
        boolean linkSignUpOptInInitialValue = elementsSession2.getLinkSignUpOptInInitialValue();
        String elementsSessionId = elementsSession2.getElementsSessionId();
        ElementsSession.LinkSettings linkSettings = elementsSession2.getLinkSettings();
        LinkMode linkMode = linkSettings != null ? linkSettings.getLinkMode() : null;
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = commonConfiguration2.getBillingDetailsCollectionConfiguration();
        PaymentSheet.BillingDetails defaultBillingDetails4 = commonConfiguration2.getDefaultBillingDetails();
        boolean allowLinkDefaultOptIn = elementsSession2.getAllowLinkDefaultOptIn();
        String googlePlacesApiKey = commonConfiguration2.getGooglePlacesApiKey();
        boolean collectMissingBillingDetailsForExistingPaymentMethods = commonConfiguration2.getLink().getCollectMissingBillingDetailsForExistingPaymentMethods();
        boolean allowUserEmailEdits = commonConfiguration2.getLink().getAllowUserEmailEdits();
        boolean linkMobileSkipWalletInFlowController = elementsSession2.getLinkMobileSkipWalletInFlowController();
        ElementsSession.Customer customer = elementsSession2.getCustomer();
        LinkConfiguration linkConfiguration = new LinkConfiguration(stripeIntent, merchantDisplayName, merchantCountry, customerInfo3, addressDetails2, linkPassthroughModeEnabled, linkFlags, cardBrandChoice2, cardBrandFilter, financialConnectionsAvailabilityInvoke$default, billingDetailsCollectionConfiguration, defaultBillingDetails4, useAttestationEndpointsForLink, suppressLink2faModal, disableRuxInFlowController, initializationMode2, elementsSessionId, linkMode, allowLinkDefaultOptIn, googlePlacesApiKey, collectMissingBillingDetailsForExistingPaymentMethods, allowUserEmailEdits, linkEnableDisplayableDefaultValuesInEce, linkMobileSkipWalletInFlowController, linkAppearance2, linkSignUpOptInFeatureEnabled, linkSignUpOptInInitialValue, (customer == null || (session = customer.getSession()) == null) ? null : session.getCustomerId());
        boolean useNativeLink = defaultPaymentElementLoader.linkGateFactory.create(linkConfiguration).getUseNativeLink();
        if (i == 0 || useNativeLink) {
            return linkConfiguration;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isGooglePayReady(CommonConfiguration commonConfiguration, ElementsSession elementsSession, Continuation<? super Boolean> continuation) {
        C11401 c11401;
        DefaultPaymentElementLoader defaultPaymentElementLoader;
        if (continuation instanceof C11401) {
            c11401 = (C11401) continuation;
            if ((c11401.label & Integer.MIN_VALUE) != 0) {
                c11401.label -= Integer.MIN_VALUE;
            } else {
                c11401 = new C11401(continuation);
            }
        }
        Object objIsGooglePayReady = c11401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11401.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objIsGooglePayReady);
            if (!elementsSession.isGooglePayEnabled()) {
                this.userFacingLogger.logWarningWithoutPii("Google Pay is not enabled for this session.");
            } else if (commonConfiguration.getGooglePay() == null) {
                this.userFacingLogger.logWarningWithoutPii("GooglePayConfiguration is not set.");
            } else {
                c11401.L$0 = this;
                c11401.L$1 = commonConfiguration;
                c11401.L$2 = elementsSession;
                c11401.label = 1;
                objIsGooglePayReady = isGooglePayReady(commonConfiguration, c11401);
                if (objIsGooglePayReady != coroutine_suspended) {
                    defaultPaymentElementLoader = this;
                }
            }
            defaultPaymentElementLoader = this;
            if (elementsSession.isGooglePayEnabled()) {
                return Boxing.boxBoolean(false);
            }
            c11401.L$0 = null;
            c11401.L$1 = null;
            c11401.L$2 = null;
            c11401.label = 2;
            Object objIsGooglePayReady2 = defaultPaymentElementLoader.isGooglePayReady(commonConfiguration, c11401);
            return objIsGooglePayReady2 == coroutine_suspended ? coroutine_suspended : objIsGooglePayReady2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsGooglePayReady);
            return objIsGooglePayReady;
        }
        ElementsSession elementsSession2 = (ElementsSession) c11401.L$2;
        CommonConfiguration commonConfiguration2 = (CommonConfiguration) c11401.L$1;
        defaultPaymentElementLoader = (DefaultPaymentElementLoader) c11401.L$0;
        ResultKt.throwOnFailure(objIsGooglePayReady);
        elementsSession = elementsSession2;
        commonConfiguration = commonConfiguration2;
        if (!((Boolean) objIsGooglePayReady).booleanValue()) {
            defaultPaymentElementLoader.userFacingLogger.logWarningWithoutPii("Google Pay API check failed.\nPossible reasons:\n- Google Play service is not available on this device.\n- Google account is not signed in on this device.\nSee https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient#public-taskboolean-isreadytopay-isreadytopayrequest-request for more details.");
        }
        if (elementsSession.isGooglePayEnabled()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isGooglePayReady(CommonConfiguration commonConfiguration, Continuation<? super Boolean> continuation) {
        AnonymousClass2 anonymousClass2;
        boolean zBooleanValue;
        PaymentSheet.GooglePayConfiguration.Environment environment;
        GooglePayEnvironment googlePayEnvironment;
        Flow<Boolean> flowIsReady;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        }
        Object objFirst = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            PaymentSheet.GooglePayConfiguration googlePay = commonConfiguration.getGooglePay();
            if (googlePay != null && (environment = googlePay.getEnvironment()) != null) {
                Function1<GooglePayEnvironment, GooglePayRepository> function1 = this.googlePayRepositoryFactory;
                int i2 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
                if (i2 == 1) {
                    googlePayEnvironment = GooglePayEnvironment.Production;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    googlePayEnvironment = GooglePayEnvironment.Test;
                }
                GooglePayRepository googlePayRepositoryInvoke = function1.invoke(googlePayEnvironment);
                if (googlePayRepositoryInvoke != null && (flowIsReady = googlePayRepositoryInvoke.isReady()) != null) {
                    anonymousClass2.label = 1;
                    objFirst = FlowKt.first(flowIsReady, anonymousClass2);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            zBooleanValue = false;
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objFirst);
        zBooleanValue = ((Boolean) objFirst).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isGooglePaySupported(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepositoryFactory.invoke(GooglePayEnvironment.Production).isReady(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveInitialPaymentSelection(Deferred<? extends SavedSelection> deferred, PaymentMethodMetadata paymentMethodMetadata, CustomerState customerState, boolean z, boolean z2, Continuation<? super PaymentSelection> continuation) {
        C11431 c11431;
        boolean z3;
        boolean z4;
        Object objAwait;
        PaymentSelection.Saved paymentSelection;
        PaymentSelection.Saved saved;
        List<PaymentMethod> paymentMethods;
        Object next;
        List<PaymentMethod> paymentMethods2;
        PaymentMethod paymentMethod;
        PaymentSelection.Saved paymentSelection2;
        List<PaymentMethod> paymentMethods3;
        Object next2;
        CustomerState customerState2 = customerState;
        if (continuation instanceof C11431) {
            c11431 = (C11431) continuation;
            if ((c11431.label & Integer.MIN_VALUE) != 0) {
                c11431.label -= Integer.MIN_VALUE;
            } else {
                c11431 = new C11431(continuation);
            }
        }
        Object obj = c11431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11431.label;
        boolean z5 = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CustomerMetadata customerMetadata = paymentMethodMetadata.getCustomerMetadata();
            if (customerMetadata != null ? customerMetadata.isPaymentMethodSetAsDefaultEnabled() : false) {
                if (customerState2 == null || (paymentMethods = customerState2.getPaymentMethods()) == null) {
                    paymentSelection = null;
                    z4 = z2;
                    saved = paymentSelection;
                    z3 = z;
                } else {
                    Iterator<T> it = paymentMethods.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (customerState2.getDefaultPaymentMethodId() != null && Intrinsics.areEqual(((PaymentMethod) next).id, customerState2.getDefaultPaymentMethodId())) {
                            break;
                        }
                    }
                    PaymentMethod paymentMethod2 = (PaymentMethod) next;
                    if (paymentMethod2 != null) {
                        paymentSelection = PaymentElementLoaderKt.toPaymentSelection(paymentMethod2);
                    }
                    z4 = z2;
                    saved = paymentSelection;
                    z3 = z;
                }
                if (saved == null) {
                    return saved;
                }
                PaymentSelection.Saved paymentSelection3 = (customerState2 == null || (paymentMethods2 = customerState2.getPaymentMethods()) == null || (paymentMethod = (PaymentMethod) CollectionsKt.firstOrNull((List) paymentMethods2)) == null) ? null : PaymentElementLoaderKt.toPaymentSelection(paymentMethod);
                if (paymentSelection3 != null) {
                    return paymentSelection3;
                }
                PaymentSelection.GooglePay googlePay = PaymentSelection.GooglePay.INSTANCE;
                if (!z4 && z3) {
                    z5 = true;
                }
                return z5 ? googlePay : null;
            }
            c11431.L$0 = customerState2;
            z3 = z;
            c11431.Z$0 = z3;
            z4 = z2;
            c11431.Z$1 = z4;
            c11431.label = 1;
            objAwait = deferred.await(c11431);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z6 = c11431.Z$1;
            boolean z7 = c11431.Z$0;
            CustomerState customerState3 = (CustomerState) c11431.L$0;
            ResultKt.throwOnFailure(obj);
            z4 = z6;
            customerState2 = customerState3;
            objAwait = obj;
            z3 = z7;
        }
        SavedSelection savedSelection = (SavedSelection) objAwait;
        if (savedSelection instanceof SavedSelection.GooglePay) {
            PaymentSelection.GooglePay googlePay2 = PaymentSelection.GooglePay.INSTANCE;
            if (!(!z4 && z3)) {
                googlePay2 = null;
            }
            saved = googlePay2;
        } else if (savedSelection instanceof SavedSelection.Link) {
            PaymentSelection.Link link = new PaymentSelection.Link(null, null, null, 7, null);
            if (z4) {
                link = null;
            }
            saved = link;
        } else if (savedSelection instanceof SavedSelection.PaymentMethod) {
            if (customerState2 == null || (paymentMethods3 = customerState2.getPaymentMethods()) == null) {
                paymentSelection2 = null;
                saved = paymentSelection2;
            } else {
                Iterator<T> it2 = paymentMethods3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((PaymentMethod) next2).id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                        break;
                    }
                }
                PaymentMethod paymentMethod3 = (PaymentMethod) next2;
                if (paymentMethod3 != null) {
                    paymentSelection2 = PaymentElementLoaderKt.toPaymentSelection(paymentMethod3);
                }
                saved = paymentSelection2;
            }
        } else {
            if (!(savedSelection instanceof SavedSelection.None)) {
                throw new NoWhenBranchMatchedException();
            }
            saved = null;
        }
        if (saved == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveSavedSelection(CommonConfiguration commonConfiguration, boolean z, ElementsSession elementsSession, Continuation<? super SavedSelection> continuation) {
        return retrieveSavedSelection(commonConfiguration, z, elementsSession.isLinkEnabled(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveSavedPaymentMethodSelection(CommonConfiguration commonConfiguration, Continuation<? super SavedSelection.PaymentMethod> continuation) {
        C11441 c11441;
        if (continuation instanceof C11441) {
            c11441 = (C11441) continuation;
            if ((c11441.label & Integer.MIN_VALUE) != 0) {
                c11441.label -= Integer.MIN_VALUE;
            } else {
                c11441 = new C11441(continuation);
            }
        }
        Object objRetrieveSavedSelection = c11441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11441.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRetrieveSavedSelection);
            PaymentSheet.CustomerConfiguration customer = commonConfiguration.getCustomer();
            PaymentSheet.CustomerAccessType accessType$paymentsheet_release = customer != null ? customer.getAccessType$paymentsheet_release() : null;
            if (accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.CustomerSession) {
                c11441.label = 1;
                objRetrieveSavedSelection = retrieveSavedSelection(commonConfiguration, false, false, (Continuation<? super SavedSelection>) c11441);
                if (objRetrieveSavedSelection == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if ((accessType$paymentsheet_release instanceof PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey) || accessType$paymentsheet_release == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRetrieveSavedSelection);
        }
        if (objRetrieveSavedSelection instanceof SavedSelection.PaymentMethod) {
            return (SavedSelection.PaymentMethod) objRetrieveSavedSelection;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveSavedSelection(CommonConfiguration commonConfiguration, boolean z, boolean z2, Continuation<? super SavedSelection> continuation) {
        return this.prefsRepositoryFactory.invoke(commonConfiguration.getCustomer()).getSavedSelection(z, z2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void warnUnactivatedIfNeeded(StripeIntent stripeIntent) {
        if (stripeIntent.getUnactivatedPaymentMethods().isEmpty()) {
            return;
        }
        this.logger.warning("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + stripeIntent.getUnactivatedPaymentMethods() + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean supportsIntent(PaymentMethodMetadata metadata) {
        return !metadata.supportedPaymentMethodTypes().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportSuccessfulLoad(ElementsSession elementsSession, PaymentElementLoader.State state, boolean isReloadingAfterProcessDeath, boolean isGooglePaySupported, PaymentSheet.LinkConfiguration.Display linkDisplay, PaymentElementLoader.InitializationMode initializationMode, CustomerInfo customerInfo, PaymentMethodMetadata paymentMethodMetadata) {
        Boolean bool;
        Boolean boolValueOf;
        Throwable sessionsError = elementsSession.getSessionsError();
        if (sessionsError != null) {
            this.eventReporter.onElementsSessionLoadFailed(sessionsError);
        }
        boolean z = !state.getStripeIntent().isConfirmed() || isReloadingAfterProcessDeath;
        if (customerInfo instanceof CustomerInfo.CustomerSession) {
            ElementsSession.Customer customer = elementsSession.getCustomer();
            Boolean boolValueOf2 = Boolean.valueOf((customer != null ? customer.getDefaultPaymentMethod() : null) != null);
            CustomerMetadata customerMetadata = paymentMethodMetadata.getCustomerMetadata();
            bool = boolValueOf2;
            boolValueOf = Boolean.valueOf(customerMetadata != null && customerMetadata.isPaymentMethodSetAsDefaultEnabled());
        } else {
            bool = null;
            boolValueOf = null;
        }
        if (state.getValidationError() != null && z) {
            this.eventReporter.onLoadFailed(state.getValidationError());
            return;
        }
        EventReporter eventReporter = this.eventReporter;
        boolean z2 = state.getPaymentMethodMetadata().getLinkState() != null;
        ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
        LinkMode linkMode = linkSettings != null ? linkSettings.getLinkMode() : null;
        String currency = IntentKt.getCurrency(elementsSession.getStripeIntent());
        PaymentSelection paymentSelection = state.getPaymentSelection();
        FinancialConnectionsAvailability financialConnectionsAvailabilityInvoke$default = GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, elementsSession, null, 2, null);
        List<SupportedPaymentMethod> listSortedSupportedPaymentMethods = state.getPaymentMethodMetadata().sortedSupportedPaymentMethods();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedSupportedPaymentMethods, 10));
        Iterator<T> it = listSortedSupportedPaymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedPaymentMethod) it.next()).getCode());
        }
        eventReporter.onLoadSucceeded(paymentSelection, z2, linkMode, isGooglePaySupported, linkDisplay, currency, initializationMode, financialConnectionsAvailabilityInvoke$default, arrayList, this.cvcRecollectionHandler.cvcRecollectionEnabled(state.getPaymentMethodMetadata().getStripeIntent(), initializationMode), bool, boolValueOf, PaymentElementLoaderKt.paymentMethodOptionsSetupFutureUsageMap(elementsSession.getStripeIntent()), PaymentElementLoaderKt.setupFutureUsage(elementsSession.getStripeIntent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportFailedLoad(Throwable error) {
        this.logger.error("Failure loading PaymentSheetState", error);
        this.eventReporter.onLoadFailed(error);
    }

    private final void logIfMissingExternalPaymentMethods(List<String> requestedExternalPaymentMethods, List<ExternalPaymentMethodSpec> actualExternalPaymentMethods) {
        ArrayList arrayList;
        List<String> list = requestedExternalPaymentMethods;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (actualExternalPaymentMethods != null) {
            List<ExternalPaymentMethodSpec> list2 = actualExternalPaymentMethods;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ExternalPaymentMethodSpec) it.next()).getType());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        for (String str : requestedExternalPaymentMethods) {
            if (arrayList == null || !arrayList.contains(str)) {
                this.userFacingLogger.logWarningWithoutPii("Requested external payment method " + str + " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods");
            }
        }
    }

    private final void logCustomPaymentMethodErrors(List<? extends ElementsSession.CustomPaymentMethod> customPaymentMethods) {
        if (customPaymentMethods.isEmpty()) {
            return;
        }
        ArrayList<ElementsSession.CustomPaymentMethod.Unavailable> arrayList = new ArrayList();
        for (Object obj : customPaymentMethods) {
            if (obj instanceof ElementsSession.CustomPaymentMethod.Unavailable) {
                arrayList.add(obj);
            }
        }
        for (ElementsSession.CustomPaymentMethod.Unavailable unavailable : arrayList) {
            this.userFacingLogger.logWarningWithoutPii("Requested custom payment method " + unavailable.getType() + " contained an error \"" + unavailable.getError() + "\"!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PaymentElementLoader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;", "", "id", "", "getId", "()Ljava/lang/String;", "ephemeralKeySecret", "getEphemeralKeySecret", "CustomerSession", "Legacy", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface CustomerInfo {
        String getEphemeralKeySecret();

        String getId();

        /* compiled from: PaymentElementLoader.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$CustomerSession;", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;", "elementsSessionCustomer", "Lcom/stripe/android/model/ElementsSession$Customer;", "customerSessionClientSecret", "", "<init>", "(Lcom/stripe/android/model/ElementsSession$Customer;Ljava/lang/String;)V", "getElementsSessionCustomer", "()Lcom/stripe/android/model/ElementsSession$Customer;", "getCustomerSessionClientSecret", "()Ljava/lang/String;", "id", "getId", "ephemeralKeySecret", "getEphemeralKeySecret", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CustomerSession implements CustomerInfo {
            public static final int $stable = ElementsSession.Customer.$stable;
            private final String customerSessionClientSecret;
            private final ElementsSession.Customer elementsSessionCustomer;
            private final String ephemeralKeySecret;
            private final String id;

            public static /* synthetic */ CustomerSession copy$default(CustomerSession customerSession, ElementsSession.Customer customer, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    customer = customerSession.elementsSessionCustomer;
                }
                if ((i & 2) != 0) {
                    str = customerSession.customerSessionClientSecret;
                }
                return customerSession.copy(customer, str);
            }

            /* renamed from: component1, reason: from getter */
            public final ElementsSession.Customer getElementsSessionCustomer() {
                return this.elementsSessionCustomer;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            public final CustomerSession copy(ElementsSession.Customer elementsSessionCustomer, String customerSessionClientSecret) {
                Intrinsics.checkNotNullParameter(elementsSessionCustomer, "elementsSessionCustomer");
                Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
                return new CustomerSession(elementsSessionCustomer, customerSessionClientSecret);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomerSession)) {
                    return false;
                }
                CustomerSession customerSession = (CustomerSession) other;
                return Intrinsics.areEqual(this.elementsSessionCustomer, customerSession.elementsSessionCustomer) && Intrinsics.areEqual(this.customerSessionClientSecret, customerSession.customerSessionClientSecret);
            }

            public int hashCode() {
                return (this.elementsSessionCustomer.hashCode() * 31) + this.customerSessionClientSecret.hashCode();
            }

            public String toString() {
                return "CustomerSession(elementsSessionCustomer=" + this.elementsSessionCustomer + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
            }

            public CustomerSession(ElementsSession.Customer elementsSessionCustomer, String customerSessionClientSecret) {
                Intrinsics.checkNotNullParameter(elementsSessionCustomer, "elementsSessionCustomer");
                Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
                this.elementsSessionCustomer = elementsSessionCustomer;
                this.customerSessionClientSecret = customerSessionClientSecret;
                this.id = elementsSessionCustomer.getSession().getCustomerId();
                this.ephemeralKeySecret = elementsSessionCustomer.getSession().getApiKey();
            }

            public final ElementsSession.Customer getElementsSessionCustomer() {
                return this.elementsSessionCustomer;
            }

            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            @Override // com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader.CustomerInfo
            public String getId() {
                return this.id;
            }

            @Override // com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader.CustomerInfo
            public String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }
        }

        /* compiled from: PaymentElementLoader.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo$Legacy;", "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader$CustomerInfo;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "accessType", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;)V", "getCustomerConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getAccessType", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;", "id", "", "getId", "()Ljava/lang/String;", "ephemeralKeySecret", "getEphemeralKeySecret", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Legacy implements CustomerInfo {
            public static final int $stable = 0;
            private final PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey accessType;
            private final PaymentSheet.CustomerConfiguration customerConfig;
            private final String ephemeralKeySecret;
            private final String id;

            public static /* synthetic */ Legacy copy$default(Legacy legacy, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey legacyCustomerEphemeralKey, int i, Object obj) {
                if ((i & 1) != 0) {
                    customerConfiguration = legacy.customerConfig;
                }
                if ((i & 2) != 0) {
                    legacyCustomerEphemeralKey = legacy.accessType;
                }
                return legacy.copy(customerConfiguration, legacyCustomerEphemeralKey);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentSheet.CustomerConfiguration getCustomerConfig() {
                return this.customerConfig;
            }

            /* renamed from: component2, reason: from getter */
            public final PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey getAccessType() {
                return this.accessType;
            }

            public final Legacy copy(PaymentSheet.CustomerConfiguration customerConfig, PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey accessType) {
                Intrinsics.checkNotNullParameter(customerConfig, "customerConfig");
                Intrinsics.checkNotNullParameter(accessType, "accessType");
                return new Legacy(customerConfig, accessType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) other;
                return Intrinsics.areEqual(this.customerConfig, legacy.customerConfig) && Intrinsics.areEqual(this.accessType, legacy.accessType);
            }

            public int hashCode() {
                return (this.customerConfig.hashCode() * 31) + this.accessType.hashCode();
            }

            public String toString() {
                return "Legacy(customerConfig=" + this.customerConfig + ", accessType=" + this.accessType + ")";
            }

            public Legacy(PaymentSheet.CustomerConfiguration customerConfig, PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey accessType) {
                Intrinsics.checkNotNullParameter(customerConfig, "customerConfig");
                Intrinsics.checkNotNullParameter(accessType, "accessType");
                this.customerConfig = customerConfig;
                this.accessType = accessType;
                this.id = customerConfig.getId();
                this.ephemeralKeySecret = accessType.getEphemeralKeySecret();
            }

            public final PaymentSheet.CustomerConfiguration getCustomerConfig() {
                return this.customerConfig;
            }

            public final PaymentSheet.CustomerAccessType.LegacyCustomerEphemeralKey getAccessType() {
                return this.accessType;
            }

            @Override // com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader.CustomerInfo
            public String getId() {
                return this.id;
            }

            @Override // com.stripe.android.paymentsheet.state.DefaultPaymentElementLoader.CustomerInfo
            public String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }
        }
    }

    private final CustomerRepository.CustomerInfo toCustomerInfo(CustomerInfo customerInfo) {
        String id = customerInfo.getId();
        String ephemeralKeySecret = customerInfo.getEphemeralKeySecret();
        CustomerInfo.CustomerSession customerSession = customerInfo instanceof CustomerInfo.CustomerSession ? (CustomerInfo.CustomerSession) customerInfo : null;
        return new CustomerRepository.CustomerInfo(id, ephemeralKeySecret, customerSession != null ? customerSession.getCustomerSessionClientSecret() : null);
    }
}
