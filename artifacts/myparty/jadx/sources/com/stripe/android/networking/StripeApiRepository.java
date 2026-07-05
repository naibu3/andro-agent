package com.stripe.android.networking;

import android.content.Context;
import android.net.http.HttpResponseCache;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.wallet.WalletConstants;
import com.stripe.android.Stripe;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.cards.Bin;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.common.di.MobileSessionIdModuleKt;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.ExceptionUtilsKt;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.frauddetection.FraudDetectionDataParamsUtils;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.model.parsers.StripeFileJsonParser;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.exception.CardException;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsShare;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerShippingAddresses;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.IssuingCardPin;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodMessage;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.model.PaymentMethodsList;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import com.stripe.android.model.parsers.CardMetadataJsonParser;
import com.stripe.android.model.parsers.ConsumerPaymentDetailsJsonParser;
import com.stripe.android.model.parsers.ConsumerPaymentDetailsShareJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.ConsumerShippingAddressesParser;
import com.stripe.android.model.parsers.CustomerJsonParser;
import com.stripe.android.model.parsers.ElementsSessionJsonParser;
import com.stripe.android.model.parsers.FinancialConnectionsSessionJsonParser;
import com.stripe.android.model.parsers.FpxBankStatusesJsonParser;
import com.stripe.android.model.parsers.IssuingCardPinJsonParser;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.parsers.PaymentMethodMessageJsonParser;
import com.stripe.android.model.parsers.PaymentMethodsListJsonParser;
import com.stripe.android.model.parsers.RadarSessionWithHCaptchaJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.model.parsers.SourceJsonParser;
import com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.utils.StripeUrlUtils;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: StripeApiRepository.kt */
@Metadata(d1 = {"\u0000ò\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Í\u00022\u00020\u0001:\u0004Ì\u0002Í\u0002B¯\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 BS\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\"J4\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0004\b1\u00102J4\u00103\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0004\b7\u00108J4\u00109\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u00105\u001a\u0002062\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0082@¢\u0006\u0004\b:\u00108J4\u0010;\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0004\b<\u00102J&\u0010=\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\b>\u0010?J&\u0010@\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bB\u0010?J.\u0010C\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bF\u0010GJ4\u0010H\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010I\u001a\u00020J2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0004\bK\u0010LJ4\u0010M\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010I\u001a\u00020J2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0082@¢\u0006\u0004\bN\u0010LJ4\u0010O\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0004\bP\u00102J.\u0010Q\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010R\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bS\u0010GJ&\u0010T\u001a\b\u0012\u0004\u0012\u00020U0*2\u0006\u0010V\u001a\u00020W2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bX\u0010YJ.\u0010Z\u001a\b\u0012\u0004\u0012\u00020U0*2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\b[\u0010GJ&\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0*2\u0006\u0010^\u001a\u00020_2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\b`\u0010aJ.\u0010b\u001a\b\u0012\u0004\u0012\u00020]0*2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020e2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bf\u0010gJ0\u0010h\u001a\b\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010\u00062\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bk\u0010GJ&\u0010l\u001a\b\u0012\u0004\u0012\u00020m0*2\u0006\u0010n\u001a\u00020o2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0004\bp\u0010qJL\u0010r\u001a\b\u0012\u0004\u0012\u00020U0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0004\bv\u0010wJD\u0010x\u001a\b\u0012\u0004\u0012\u00020U0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0004\by\u0010zJ<\u0010{\u001a\b\u0012\u0004\u0012\u00020]0*2\u0006\u0010j\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0004\b|\u0010}J5\u0010~\u001a\b\u0012\u0004\u0012\u00020]0*2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J>\u0010~\u001a\b\u0012\u0004\u0012\u00020]0*2\u0007\u0010\u0081\u0001\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u0082\u0001\u0010}J?\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]000*2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JN\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u0089\u0001\u0010wJI\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J7\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020i0*2\u0006\u0010j\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J<\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060*2\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J?\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u009a\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0003\u0010\u009b\u0001J\"\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010*2\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J,\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010*2\b\u0010¢\u0001\u001a\u00030£\u00012\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J,\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010*2\b\u0010¨\u0001\u001a\u00030©\u00012\u0006\u0010u\u001a\u00020.H\u0097@¢\u0006\u0006\bª\u0001\u0010«\u0001J)\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010*2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u00ad\u0001\u0010?J,\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030¯\u00010*2\b\u0010°\u0001\u001a\u00030±\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b²\u0001\u0010³\u0001J0\u0010´\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060µ\u00010*2\u0007\u0010¶\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b·\u0001\u0010?J\"\u0010¸\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010*2\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bº\u0001\u0010\u009f\u0001J)\u0010»\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010*2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b¼\u0001\u0010?J?\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010*2\u0007\u0010¾\u0001\u001a\u00020\u00062\u0007\u0010¿\u0001\u001a\u00020\u00062\t\u0010À\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bÁ\u0001\u0010\u0097\u0001JI\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020]0*2\u0007\u0010Ã\u0001\u001a\u00020\u00062\u0007\u0010Ä\u0001\u001a\u00020\u00062\u0014\u0010Å\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010Æ\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bÇ\u0001\u0010È\u0001J5\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00010*2\u0007\u0010Ã\u0001\u001a\u00020\u00062\t\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\bÌ\u0001\u0010GJ,\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010*2\b\u0010Ï\u0001\u001a\u00030Ð\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J4\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010*2\u0006\u0010D\u001a\u00020\u00062\b\u0010Ï\u0001\u001a\u00030Ô\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J4\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010*2\u0006\u0010R\u001a\u00020\u00062\b\u0010Ï\u0001\u001a\u00030Ô\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bØ\u0001\u0010Ö\u0001J\u0017\u0010Ù\u0001\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u0006H\u0001¢\u0006\u0003\bÚ\u0001J\u0017\u0010Û\u0001\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006H\u0001¢\u0006\u0003\bÜ\u0001JH\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0007\u0010Þ\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0006\bß\u0001\u0010à\u0001JH\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u00062\u0007\u0010Þ\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0096@¢\u0006\u0006\bâ\u0001\u0010à\u0001J=\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\b\u0010ä\u0001\u001a\u00030å\u00012\b\u0010æ\u0001\u001a\u00030å\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bç\u0001\u0010è\u0001J1\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u0002040*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010é\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\bê\u0001\u0010GJ=\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\b\u0010ä\u0001\u001a\u00030å\u00012\b\u0010æ\u0001\u001a\u00030å\u00012\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bì\u0001\u0010è\u0001J1\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020A0*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010é\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\bí\u0001\u0010GJ_\u0010î\u0001\u001a\t\u0012\u0005\u0012\u00030ï\u00010*2\r\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\b\u0010ñ\u0001\u001a\u00030å\u00012\u0007\u0010ò\u0001\u001a\u00020\u00062\u0007\u0010ó\u0001\u001a\u00020\u00062\u0007\u0010ô\u0001\u001a\u00020\u00062\u0007\u0010õ\u0001\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u0017\u0010ø\u0001\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0001¢\u0006\u0003\bù\u0001J\u0017\u0010ú\u0001\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006H\u0001¢\u0006\u0003\bû\u0001J,\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010*2\b\u0010Ï\u0001\u001a\u00030þ\u00012\u0006\u0010-\u001a\u00020.H\u0096@¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J*\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030¡\u00010*2\u0007\u0010\u0082\u0002\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u0083\u0002\u0010?J:\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0085\u00020*2\u0006\u0010u\u001a\u00020.2\u0016\u0010Ï\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010Æ\u0001H\u0096@¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J9\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020*2\u0006\u0010,\u001a\u00020\u00062\r\u0010\u008a\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u008b\u0002\u0010\u0091\u0001J)\u0010\u008c\u0002\u001a\t\u0012\u0005\u0012\u00030\u008d\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u008e\u0002\u0010?J2\u0010\u008f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020*2\u0006\u0010,\u001a\u00020\u00062\u0007\u0010\u0091\u0002\u001a\u00020\u00062\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0005\b\u0092\u0002\u0010GJ4\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020*2\u0006\u0010,\u001a\u00020\u00062\b\u0010\u0094\u0002\u001a\u00030\u0095\u00022\u0006\u0010u\u001a\u00020.H\u0096@¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J8\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010*2\b\u0010Ï\u0001\u001a\u00030þ\u00012\u0006\u0010-\u001a\u00020.2\n\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0099\u0002H\u0082@¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\u001a\u0010\u009c\u0002\u001a\u00030\u0090\u00022\u000e\u0010\u009d\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060µ\u0001H\u0002Jy\u0010\u009e\u0002\u001a\t\u0012\u0005\u0012\u0003H\u009f\u00020*\"\n\b\u0000\u0010\u009f\u0002*\u00030 \u00022\b\u0010¡\u0002\u001a\u00030¢\u00022\u000f\u0010£\u0002\u001a\n\u0012\u0005\u0012\u0003H\u009f\u00020¤\u000226\b\u0002\u0010¥\u0002\u001a/\u0012#\u0012!\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060µ\u00010*¢\u0006\u000f\b§\u0002\u0012\n\b¨\u0002\u0012\u0005\b\b(©\u0002\u0012\u0005\u0012\u00030\u0090\u00020¦\u0002H\u0082@¢\u0006\u0006\bª\u0002\u0010«\u0002JZ\u0010¬\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060µ\u00012\b\u0010¡\u0002\u001a\u00030¢\u000224\u0010¥\u0002\u001a/\u0012#\u0012!\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060µ\u00010*¢\u0006\u000f\b§\u0002\u0012\n\b¨\u0002\u0012\u0005\b\b(©\u0002\u0012\u0005\u0012\u00030\u0090\u00020¦\u0002H\u0081@¢\u0006\u0006\b\u00ad\u0002\u0010®\u0002J>\u0010¯\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060µ\u00012\b\u0010°\u0002\u001a\u00030±\u00022\u0018\u0010¥\u0002\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010²\u0002\u0012\u0005\u0012\u00030\u0090\u00020¦\u0002H\u0081@¢\u0006\u0006\b³\u0002\u0010´\u0002J\n\u0010µ\u0002\u001a\u00030¶\u0002H\u0002J\u0014\u0010·\u0002\u001a\u00030\u0090\u00022\b\u0010¸\u0002\u001a\u00030¶\u0002H\u0002J\n\u0010¹\u0002\u001a\u00030\u0090\u0002H\u0002J\u0014\u0010º\u0002\u001a\u00030\u0090\u00022\b\u0010»\u0002\u001a\u00030\u0099\u0002H\u0002J\u001a\u0010º\u0002\u001a\u00030\u0090\u00022\b\u0010Ï\u0001\u001a\u00030¼\u0002H\u0001¢\u0006\u0003\b½\u0002J-\u0010¾\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¿\u00020Æ\u00012\u0006\u0010,\u001a\u00020\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0002J'\u0010À\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Á\u00022\u000f\b\u0002\u0010Â\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002J\u0018\u0010Ã\u0002\u001a\u00020\u00062\r\u0010Â\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016JD\u0010Ä\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¿\u00020Æ\u00012\u0015\u0010Ï\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¿\u00020Æ\u00012\b\u0010^\u001a\u0004\u0018\u00010_2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010WH\u0002J%\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u0002060**\u0002062\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J%\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020J0**\u00020J2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0006\bÆ\u0002\u0010È\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R*\u0010É\u0002\u001a\u0004\u0018\u00010\u0006*\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060µ\u00010*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002¨\u0006Î\u0002"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "Lcom/stripe/android/networking/StripeRepository;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsageTokens", "", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "fraudDetectionDataParamsUtils", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;", "betas", "Lcom/stripe/android/StripeApiBeta;", "apiVersion", "sdkVersion", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "appContext", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "fraudDetectionData", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "getFraudDetectionData", "()Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "retrieveStripeIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "clientSecret", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "expandFields", "", "retrieveStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntentInternal", "confirmPaymentIntentInternal-BWLJW6A", "retrievePaymentIntent", "retrievePaymentIntent-BWLJW6A", "refreshPaymentIntent", "refreshPaymentIntent-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "refreshSetupIntent-0E7RQCE", "cancelPaymentIntentSource", "paymentIntentId", "sourceId", "cancelPaymentIntentSource-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntentInternal", "confirmSetupIntentInternal-BWLJW6A", "retrieveSetupIntent", "retrieveSetupIntent-BWLJW6A", "cancelSetupIntentSource", "setupIntentId", "cancelSetupIntentSource-BWLJW6A", "createSource", "Lcom/stripe/android/model/Source;", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource-0E7RQCE", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSource", "retrieveSource-BWLJW6A", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod-0E7RQCE", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "paymentMethodUpdateParams", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "updatePaymentMethod-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultPaymentMethod", "Lcom/stripe/android/model/Customer;", "customerId", "setDefaultPaymentMethod-BWLJW6A", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken-0E7RQCE", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCustomerSource", "publishableKey", "sourceType", "requestOptions", "addCustomerSource-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "attachPaymentMethod-yxL6bBk", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "detachPaymentMethod-BWLJW6A", "(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerSessionClientSecret", "detachPaymentMethod-yxL6bBk", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "getPaymentMethods-BWLJW6A", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource-bMdYcbs", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCustomer", "retrieveCustomer-BWLJW6A", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "", "newPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus-gIAlu-s", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata-0E7RQCE", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth-0E7RQCE", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete3ds2Auth", "complete3ds2Auth-0E7RQCE", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "createFile-0E7RQCE", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "Lcom/stripe/android/core/networking/StripeResponse;", "url", "retrieveObject-0E7RQCE", "createRadarSession", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "createRadarSession-gIAlu-s", "createSavedPaymentMethodRadarSession", "createSavedPaymentMethodRadarSession-0E7RQCE", "attachHCaptchaToRadarSession", "radarSessionToken", "hcaptchaToken", "hcaptchaEKey", "attachHCaptchaToRadarSession-yxL6bBk", "sharePaymentDetails", "consumerSessionClientSecret", "id", "extraParams", "", "sharePaymentDetails-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "consumerAccountPublishableKey", "logOut-BWLJW6A", "createFinancialConnectionsSessionForDeferredPayments", "Lcom/stripe/android/model/FinancialConnectionsSession;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE", "(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentIntentFinancialConnectionsSession", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSetupIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession-BWLJW6A", "getPaymentIntentFinancialConnectionsSessionUrl", "getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release", "getSetupIntentFinancialConnectionsSessionUrl", "getSetupIntentFinancialConnectionsSessionUrl$payments_core_release", "attachFinancialConnectionsSessionToPaymentIntent", "financialConnectionsSessionId", "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToSetupIntent", "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "", "secondAmount", "verifyPaymentIntentWithMicrodeposits-yxL6bBk", "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "verifyPaymentIntentWithMicrodeposits-BWLJW6A", "verifySetupIntentWithMicrodeposits", "verifySetupIntentWithMicrodeposits-yxL6bBk", "verifySetupIntentWithMicrodeposits-BWLJW6A", "retrievePaymentMethodMessage", "Lcom/stripe/android/model/PaymentMethodMessage;", "paymentMethods", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "currency", "country", "locale", "logoColor", "retrievePaymentMethodMessage-eH_QyT8", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetachPaymentMethodUrl", "getDetachPaymentMethodUrl$payments_core_release", "getElementsDetachPaymentMethodUrl", "getElementsDetachPaymentMethodUrl$payments_core_release", "retrieveElementsSession", "Lcom/stripe/android/model/ElementsSession;", "Lcom/stripe/android/model/ElementsSessionParams;", "retrieveElementsSession-0E7RQCE", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCardMetadata", "cardNumber", "retrieveCardMetadata-0E7RQCE", "retrieveCardElementConfig", "Lcom/stripe/android/model/MobileCardElementConfig;", "retrieveCardElementConfig-0E7RQCE", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "listPaymentDetails-BWLJW6A", "listShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "listShippingAddresses-0E7RQCE", "deletePaymentDetails", "", "paymentDetailsId", "deletePaymentDetails-BWLJW6A", "updatePaymentDetails", "paymentDetailsUpdateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyticsEvent", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "retrieveElementsSession-BWLJW6A", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleApiError", "response", "fetchStripeModelResult", "ModelType", "Lcom/stripe/android/core/model/StripeModel;", "apiRequest", "Lcom/stripe/android/core/networking/ApiRequest;", "jsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "onResponse", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "fetchStripeModelResult-BWLJW6A", "(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeApiRequest", "makeApiRequest$payments_core_release", "(Lcom/stripe/android/core/networking/ApiRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeFileUploadRequest", "fileUploadRequest", "Lcom/stripe/android/core/networking/FileUploadRequest;", "Lcom/stripe/android/core/networking/RequestId;", "makeFileUploadRequest$payments_core_release", "(Lcom/stripe/android/core/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableDnsCache", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "resetDnsCache", "dnsCacheData", "fireFraudDetectionDataRequest", "fireAnalyticsRequest", "event", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "fireAnalyticsRequest$payments_core_release", "createClientSecretParam", "", "buildPaymentUserAgentPair", "Lkotlin/Pair;", "attribution", "buildPaymentUserAgent", "maybeAddPaymentUserAgent", "maybeForDashboard", "maybeForDashboard-0E7RQCE", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "errorMessage", "getErrorMessage", "(Ljava/lang/Object;)Ljava/lang/String;", "DnsCacheData", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeApiRepository implements StripeRepository {
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    private static final String PAYMENT_USER_AGENT = "payment_user_agent";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final ApiRequest.Factory apiRequestFactory;
    private final AppInfo appInfo;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final Context context;
    private final FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Set<String> productUsageTokens;
    private final Function0<String> publishableKeyProvider;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: StripeApiRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", i = {}, l = {961}, m = "updateIssuingCardPin", n = {}, s = {})
    /* renamed from: com.stripe.android.networking.StripeApiRepository$updateIssuingCardPin$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeApiRepository.this.updateIssuingCardPin(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider) {
        this(context, publishableKeyProvider, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo) {
        this(context, publishableKeyProvider, appInfo, null, null, null, null, null, null, null, null, null, null, null, null, 32760, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger) {
        this(context, publishableKeyProvider, appInfo, logger, null, null, null, null, null, null, null, null, null, null, null, 32752, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, null, null, null, null, null, null, null, null, null, null, 32736, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, null, null, null, null, null, null, null, null, null, 32704, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, null, null, null, null, null, null, null, null, 32640, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, null, null, null, null, null, null, null, 32512, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, null, null, null, null, null, null, 32256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, null, null, null, null, null, 31744, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, null, null, null, null, 30720, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, null, null, null, 28672, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, null, null, 24576, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, cardAccountRangeRepositoryFactory, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, apiVersion, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
    }

    public StripeApiRepository(Context context, Function0<String> publishableKeyProvider, AppInfo appInfo, Logger logger, CoroutineContext workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion, String sdkVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.context = context;
        this.publishableKeyProvider = publishableKeyProvider;
        this.appInfo = appInfo;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
        this.stripeNetworkClient = stripeNetworkClient;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils;
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
        fireFraudDetectionDataRequest();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(workContext), null, null, new AnonymousClass2(null), 3, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StripeApiRepository(android.content.Context r17, kotlin.jvm.functions.Function0 r18, com.stripe.android.core.AppInfo r19, com.stripe.android.core.Logger r20, kotlin.coroutines.CoroutineContext r21, java.util.Set r22, com.stripe.android.core.networking.StripeNetworkClient r23, com.stripe.android.core.networking.AnalyticsRequestExecutor r24, com.stripe.android.core.frauddetection.FraudDetectionDataRepository r25, com.stripe.android.cards.CardAccountRangeRepository.Factory r26, com.stripe.android.networking.PaymentAnalyticsRequestFactory r27, com.stripe.android.core.frauddetection.FraudDetectionDataParamsUtils r28, java.util.Set r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.<init>(android.content.Context, kotlin.jvm.functions.Function0, com.stripe.android.core.AppInfo, com.stripe.android.core.Logger, kotlin.coroutines.CoroutineContext, java.util.Set, com.stripe.android.core.networking.StripeNetworkClient, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.core.frauddetection.FraudDetectionDataRepository, com.stripe.android.cards.CardAccountRangeRepository$Factory, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.core.frauddetection.FraudDetectionDataParamsUtils, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public StripeApiRepository(Context appContext, @Named("publishableKey") Function0<String> publishableKeyProvider, @IOContext CoroutineContext workContext, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    private final FraudDetectionData getFraudDetectionData() {
        return this.fraudDetectionDataRepository.getCached();
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.StripeApiRepository$2", f = "StripeApiRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.networking.StripeApiRepository$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeApiRepository.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HttpResponseCache.install(new File(StripeApiRepository.this.context.getCacheDir(), "stripe_api_repository_cache"), 10485760L);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8053retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends StripeIntent>> continuation) {
        StripeApiRepository$retrieveStripeIntent$1 stripeApiRepository$retrieveStripeIntent$1;
        if (continuation instanceof StripeApiRepository$retrieveStripeIntent$1) {
            stripeApiRepository$retrieveStripeIntent$1 = (StripeApiRepository$retrieveStripeIntent$1) continuation;
            if ((stripeApiRepository$retrieveStripeIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveStripeIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveStripeIntent$1 = new StripeApiRepository$retrieveStripeIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveStripeIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveStripeIntent$1.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        if (PaymentIntent.ClientSecret.INSTANCE.isMatch(str)) {
            stripeApiRepository$retrieveStripeIntent$1.label = 1;
            Object objMo8049retrievePaymentIntentBWLJW6A = mo8049retrievePaymentIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
            if (objMo8049retrievePaymentIntentBWLJW6A != coroutine_suspended) {
                return objMo8049retrievePaymentIntentBWLJW6A;
            }
        } else if (SetupIntent.ClientSecret.INSTANCE.isMatch(str)) {
            stripeApiRepository$retrieveStripeIntent$1.label = 2;
            Object objMo8051retrieveSetupIntentBWLJW6A = mo8051retrieveSetupIntentBWLJW6A(str, options, list, stripeApiRepository$retrieveStripeIntent$1);
            if (objMo8051retrieveSetupIntentBWLJW6A != coroutine_suspended) {
                return objMo8051retrieveSetupIntentBWLJW6A;
            }
        } else {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Invalid client secret.")));
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: confirmPaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8020confirmPaymentIntentBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$confirmPaymentIntent$1 stripeApiRepository$confirmPaymentIntent$1;
        Object objM8009maybeForDashboard0E7RQCE;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$confirmPaymentIntent$1) {
            stripeApiRepository$confirmPaymentIntent$1 = (StripeApiRepository$confirmPaymentIntent$1) continuation;
            if ((stripeApiRepository$confirmPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmPaymentIntent$1 = new StripeApiRepository$confirmPaymentIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$confirmPaymentIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$confirmPaymentIntent$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stripeApiRepository$confirmPaymentIntent$1.L$0 = this;
            stripeApiRepository$confirmPaymentIntent$1.L$1 = options;
            stripeApiRepository$confirmPaymentIntent$1.L$2 = list;
            stripeApiRepository$confirmPaymentIntent$1.label = 1;
            objM8009maybeForDashboard0E7RQCE = m8009maybeForDashboard0E7RQCE(confirmPaymentIntentParams, options, stripeApiRepository$confirmPaymentIntent$1);
            if (objM8009maybeForDashboard0E7RQCE != coroutine_suspended) {
                stripeApiRepository = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        list = (List) stripeApiRepository$confirmPaymentIntent$1.L$2;
        options = (ApiRequest.Options) stripeApiRepository$confirmPaymentIntent$1.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$confirmPaymentIntent$1.L$0;
        ResultKt.throwOnFailure(obj);
        objM8009maybeForDashboard0E7RQCE = ((Result) obj).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8009maybeForDashboard0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            stripeApiRepository$confirmPaymentIntent$1.L$0 = null;
            stripeApiRepository$confirmPaymentIntent$1.L$1 = null;
            stripeApiRepository$confirmPaymentIntent$1.L$2 = null;
            stripeApiRepository$confirmPaymentIntent$1.label = 2;
            Object objM8005confirmPaymentIntentInternalBWLJW6A = stripeApiRepository.m8005confirmPaymentIntentInternalBWLJW6A((ConfirmPaymentIntentParams) objM8009maybeForDashboard0E7RQCE, options, list, stripeApiRepository$confirmPaymentIntent$1);
            return objM8005confirmPaymentIntentInternalBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8005confirmPaymentIntentInternalBWLJW6A;
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: confirmPaymentIntentInternal-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8005confirmPaymentIntentInternalBWLJW6A(final ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$confirmPaymentIntentInternal$1) {
            stripeApiRepository$confirmPaymentIntentInternal$1 = (StripeApiRepository$confirmPaymentIntentInternal$1) continuation;
            if ((stripeApiRepository$confirmPaymentIntentInternal$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmPaymentIntentInternal$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmPaymentIntentInternal$1 = new StripeApiRepository$confirmPaymentIntentInternal$1(this, continuation);
            }
        }
        StripeApiRepository$confirmPaymentIntentInternal$1 stripeApiRepository$confirmPaymentIntentInternal$12 = stripeApiRepository$confirmPaymentIntentInternal$1;
        Object obj = stripeApiRepository$confirmPaymentIntentInternal$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$confirmPaymentIntentInternal$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmPaymentIntentParams.toParamMap();
        if (options.getApiKeyIsUserKey()) {
            paramMap = MapsKt.minus(paramMap, "client_secret");
        }
        Map<String, ?> mapAddFraudDetectionData = fraudDetectionDataParamsUtils.addFraudDetectionData(MapsKt.plus(maybeAddPaymentUserAgent(paramMap, confirmPaymentIntentParams.getPaymentMethodCreateParams(), confirmPaymentIntentParams.getSourceParams()), INSTANCE.createExpandParam(list)), getFraudDetectionData());
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getConfirmPaymentIntentUrl$payments_core_release((String) objM9118constructorimpl), options, mapAddFraudDetectionData, false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.confirmPaymentIntentInternal_BWLJW6A$lambda$5(confirmPaymentIntentParams, this, (Result) obj2);
            }
        };
        stripeApiRepository$confirmPaymentIntentInternal$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$confirmPaymentIntentInternal$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmPaymentIntentInternal_BWLJW6A$lambda$5(ConfirmPaymentIntentParams confirmPaymentIntentParams, StripeApiRepository stripeApiRepository, Result result) {
        String type;
        PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
        if (paymentMethodCreateParams == null || (type = paymentMethodCreateParams.getTypeCode()) == null) {
            SourceParams sourceParams = confirmPaymentIntentParams.getSourceParams();
            type = sourceParams != null ? sourceParams.getType() : null;
        }
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(type, stripeApiRepository.getErrorMessage(result.getValue())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrievePaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8049retrievePaymentIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$retrievePaymentIntent$1 stripeApiRepository$retrievePaymentIntent$1;
        Object objM9118constructorimpl;
        Map<String, Object> mapCreateClientSecretParam;
        if (continuation instanceof StripeApiRepository$retrievePaymentIntent$1) {
            stripeApiRepository$retrievePaymentIntent$1 = (StripeApiRepository$retrievePaymentIntent$1) continuation;
            if ((stripeApiRepository$retrievePaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrievePaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrievePaymentIntent$1 = new StripeApiRepository$retrievePaymentIntent$1(this, continuation);
            }
        }
        StripeApiRepository$retrievePaymentIntent$1 stripeApiRepository$retrievePaymentIntent$12 = stripeApiRepository$retrievePaymentIntent$1;
        Object obj = stripeApiRepository$retrievePaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrievePaymentIntent$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        String str2 = (String) objM9118constructorimpl;
        if (!options.getApiKeyIsUserKey()) {
            mapCreateClientSecretParam = createClientSecretParam(str, list);
        } else {
            mapCreateClientSecretParam = INSTANCE.createExpandParam(list);
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrievePaymentIntentUrl$payments_core_release(str2), options, mapCreateClientSecretParam, false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.retrievePaymentIntent_BWLJW6A$lambda$8(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$retrievePaymentIntent$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, paymentIntentJsonParser, function1, stripeApiRepository$retrievePaymentIntent$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrievePaymentIntent_BWLJW6A$lambda$8(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRetrieve, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: refreshPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8041refreshPaymentIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$refreshPaymentIntent$1 stripeApiRepository$refreshPaymentIntent$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$refreshPaymentIntent$1) {
            stripeApiRepository$refreshPaymentIntent$1 = (StripeApiRepository$refreshPaymentIntent$1) continuation;
            if ((stripeApiRepository$refreshPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$refreshPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$refreshPaymentIntent$1 = new StripeApiRepository$refreshPaymentIntent$1(this, continuation);
            }
        }
        StripeApiRepository$refreshPaymentIntent$1 stripeApiRepository$refreshPaymentIntent$12 = stripeApiRepository$refreshPaymentIntent$1;
        Object obj = stripeApiRepository$refreshPaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$refreshPaymentIntent$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRefreshPaymentIntentUrl$payments_core_release((String) objM9118constructorimpl), options, createClientSecretParam(str, CollectionsKt.emptyList()), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.refreshPaymentIntent_0E7RQCE$lambda$11(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$refreshPaymentIntent$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$refreshPaymentIntent$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshPaymentIntent_0E7RQCE$lambda$11(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.PaymentIntentRefresh, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: refreshSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8042refreshSetupIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$refreshSetupIntent$1 stripeApiRepository$refreshSetupIntent$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$refreshSetupIntent$1) {
            stripeApiRepository$refreshSetupIntent$1 = (StripeApiRepository$refreshSetupIntent$1) continuation;
            if ((stripeApiRepository$refreshSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$refreshSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$refreshSetupIntent$1 = new StripeApiRepository$refreshSetupIntent$1(this, continuation);
            }
        }
        StripeApiRepository$refreshSetupIntent$1 stripeApiRepository$refreshSetupIntent$12 = stripeApiRepository$refreshSetupIntent$1;
        Object obj = stripeApiRepository$refreshSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$refreshSetupIntent$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRefreshSetupIntentUrl$payments_core_release((String) objM9118constructorimpl), options, createClientSecretParam(str, CollectionsKt.emptyList()), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.refreshSetupIntent_0E7RQCE$lambda$14(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$refreshSetupIntent$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$refreshSetupIntent$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshSetupIntent_0E7RQCE$lambda$14(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRefresh, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: cancelPaymentIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8017cancelPaymentIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$cancelPaymentIntentSource$1 stripeApiRepository$cancelPaymentIntentSource$1;
        if (continuation instanceof StripeApiRepository$cancelPaymentIntentSource$1) {
            stripeApiRepository$cancelPaymentIntentSource$1 = (StripeApiRepository$cancelPaymentIntentSource$1) continuation;
            if ((stripeApiRepository$cancelPaymentIntentSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$cancelPaymentIntentSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$cancelPaymentIntentSource$1 = new StripeApiRepository$cancelPaymentIntentSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$cancelPaymentIntentSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$cancelPaymentIntentSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getCancelPaymentIntentSourceUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("source", str2)), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.cancelPaymentIntentSource_BWLJW6A$lambda$15(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$cancelPaymentIntentSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$cancelPaymentIntentSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelPaymentIntentSource_BWLJW6A$lambda$15(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.PaymentIntentCancelSource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: confirmSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8021confirmSetupIntentBWLJW6A(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$confirmSetupIntent$1 stripeApiRepository$confirmSetupIntent$1;
        Object objM8010maybeForDashboard0E7RQCE;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$confirmSetupIntent$1) {
            stripeApiRepository$confirmSetupIntent$1 = (StripeApiRepository$confirmSetupIntent$1) continuation;
            if ((stripeApiRepository$confirmSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmSetupIntent$1 = new StripeApiRepository$confirmSetupIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$confirmSetupIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$confirmSetupIntent$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stripeApiRepository$confirmSetupIntent$1.L$0 = this;
            stripeApiRepository$confirmSetupIntent$1.L$1 = options;
            stripeApiRepository$confirmSetupIntent$1.L$2 = list;
            stripeApiRepository$confirmSetupIntent$1.label = 1;
            objM8010maybeForDashboard0E7RQCE = m8010maybeForDashboard0E7RQCE(confirmSetupIntentParams, options, stripeApiRepository$confirmSetupIntent$1);
            if (objM8010maybeForDashboard0E7RQCE != coroutine_suspended) {
                stripeApiRepository = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        list = (List) stripeApiRepository$confirmSetupIntent$1.L$2;
        options = (ApiRequest.Options) stripeApiRepository$confirmSetupIntent$1.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$confirmSetupIntent$1.L$0;
        ResultKt.throwOnFailure(obj);
        objM8010maybeForDashboard0E7RQCE = ((Result) obj).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8010maybeForDashboard0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            stripeApiRepository$confirmSetupIntent$1.L$0 = null;
            stripeApiRepository$confirmSetupIntent$1.L$1 = null;
            stripeApiRepository$confirmSetupIntent$1.L$2 = null;
            stripeApiRepository$confirmSetupIntent$1.label = 2;
            Object objM8006confirmSetupIntentInternalBWLJW6A = stripeApiRepository.m8006confirmSetupIntentInternalBWLJW6A((ConfirmSetupIntentParams) objM8010maybeForDashboard0E7RQCE, options, list, stripeApiRepository$confirmSetupIntent$1);
            return objM8006confirmSetupIntentInternalBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8006confirmSetupIntentInternalBWLJW6A;
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: confirmSetupIntentInternal-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8006confirmSetupIntentInternalBWLJW6A(final ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$confirmSetupIntentInternal$1 stripeApiRepository$confirmSetupIntentInternal$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$confirmSetupIntentInternal$1) {
            stripeApiRepository$confirmSetupIntentInternal$1 = (StripeApiRepository$confirmSetupIntentInternal$1) continuation;
            if ((stripeApiRepository$confirmSetupIntentInternal$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$confirmSetupIntentInternal$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$confirmSetupIntentInternal$1 = new StripeApiRepository$confirmSetupIntentInternal$1(this, continuation);
            }
        }
        StripeApiRepository$confirmSetupIntentInternal$1 stripeApiRepository$confirmSetupIntentInternal$12 = stripeApiRepository$confirmSetupIntentInternal$1;
        Object obj = stripeApiRepository$confirmSetupIntentInternal$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$confirmSetupIntentInternal$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion4 = INSTANCE;
        String confirmSetupIntentUrl$payments_core_release = companion4.getConfirmSetupIntentUrl$payments_core_release((String) objM9118constructorimpl);
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmSetupIntentParams.toParamMap();
        if (options.getApiKeyIsUserKey()) {
            paramMap = MapsKt.minus(paramMap, "client_secret");
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, confirmSetupIntentUrl$payments_core_release, options, fraudDetectionDataParamsUtils.addFraudDetectionData(MapsKt.plus(maybeAddPaymentUserAgent$default(this, paramMap, confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release(), null, 4, null), companion4.createExpandParam(list)), getFraudDetectionData()), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.confirmSetupIntentInternal_BWLJW6A$lambda$20(this.f$0, confirmSetupIntentParams, (Result) obj2);
            }
        };
        stripeApiRepository$confirmSetupIntentInternal$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$confirmSetupIntentInternal$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmSetupIntentInternal_BWLJW6A$lambda$20(StripeApiRepository stripeApiRepository, ConfirmSetupIntentParams confirmSetupIntentParams, Result result) {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = stripeApiRepository.paymentAnalyticsRequestFactory;
        PaymentMethodCreateParams paymentMethodCreateParams$payments_core_release = confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release();
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(paymentAnalyticsRequestFactory.createSetupIntentConfirmation$payments_core_release(paymentMethodCreateParams$payments_core_release != null ? paymentMethodCreateParams$payments_core_release.getTypeCode() : null, stripeApiRepository.getErrorMessage(result.getValue())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8051retrieveSetupIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$retrieveSetupIntent$1 stripeApiRepository$retrieveSetupIntent$1;
        Object objM9118constructorimpl;
        Map<String, Object> mapCreateClientSecretParam;
        if (continuation instanceof StripeApiRepository$retrieveSetupIntent$1) {
            stripeApiRepository$retrieveSetupIntent$1 = (StripeApiRepository$retrieveSetupIntent$1) continuation;
            if ((stripeApiRepository$retrieveSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveSetupIntent$1 = new StripeApiRepository$retrieveSetupIntent$1(this, continuation);
            }
        }
        StripeApiRepository$retrieveSetupIntent$1 stripeApiRepository$retrieveSetupIntent$12 = stripeApiRepository$retrieveSetupIntent$1;
        Object obj = stripeApiRepository$retrieveSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveSetupIntent$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        String str2 = (String) objM9118constructorimpl;
        if (!options.getApiKeyIsUserKey()) {
            mapCreateClientSecretParam = createClientSecretParam(str, list);
        } else {
            mapCreateClientSecretParam = INSTANCE.createExpandParam(list);
        }
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrieveSetupIntentUrl$payments_core_release(str2), options, mapCreateClientSecretParam, false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.retrieveSetupIntent_BWLJW6A$lambda$23(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$retrieveSetupIntent$12.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, setupIntentJsonParser, function1, stripeApiRepository$retrieveSetupIntent$12);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveSetupIntent_BWLJW6A$lambda$23(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SetupIntentRetrieve, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: cancelSetupIntentSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8018cancelSetupIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$cancelSetupIntentSource$1 stripeApiRepository$cancelSetupIntentSource$1;
        if (continuation instanceof StripeApiRepository$cancelSetupIntentSource$1) {
            stripeApiRepository$cancelSetupIntentSource$1 = (StripeApiRepository$cancelSetupIntentSource$1) continuation;
            if ((stripeApiRepository$cancelSetupIntentSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$cancelSetupIntentSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$cancelSetupIntentSource$1 = new StripeApiRepository$cancelSetupIntentSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$cancelSetupIntentSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$cancelSetupIntentSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getCancelSetupIntentSourceUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("source", str2)), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.cancelSetupIntentSource_BWLJW6A$lambda$24(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$cancelSetupIntentSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$cancelSetupIntentSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelSetupIntentSource_BWLJW6A$lambda$24(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.SetupIntentCancelSource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createSource-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8029createSource0E7RQCE(final SourceParams sourceParams, ApiRequest.Options options, Continuation<? super Result<Source>> continuation) {
        StripeApiRepository$createSource$1 stripeApiRepository$createSource$1;
        if (continuation instanceof StripeApiRepository$createSource$1) {
            stripeApiRepository$createSource$1 = (StripeApiRepository$createSource$1) continuation;
            if ((stripeApiRepository$createSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createSource$1 = new StripeApiRepository$createSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String sourcesUrl$payments_core_release = INSTANCE.getSourcesUrl$payments_core_release();
        Map mapPlus = MapsKt.plus(sourceParams.toParamMap(), buildPaymentUserAgentPair(sourceParams.getAttribution$payments_core_release()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, sourcesUrl$payments_core_release, options, MapsKt.plus(mapPlus, params), false, 8, null);
        SourceJsonParser sourceJsonParser = new SourceJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createSource_0E7RQCE$lambda$25(this.f$0, sourceParams, (Result) obj2);
            }
        };
        stripeApiRepository$createSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, sourceJsonParser, function1, stripeApiRepository$createSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSource_0E7RQCE$lambda$25(StripeApiRepository stripeApiRepository, SourceParams sourceParams, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createSourceCreation$payments_core_release(sourceParams.getType(), sourceParams.getAttribution$payments_core_release()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveSource-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8052retrieveSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Source>> continuation) {
        StripeApiRepository$retrieveSource$1 stripeApiRepository$retrieveSource$1;
        if (continuation instanceof StripeApiRepository$retrieveSource$1) {
            stripeApiRepository$retrieveSource$1 = (StripeApiRepository$retrieveSource$1) continuation;
            if ((stripeApiRepository$retrieveSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveSource$1 = new StripeApiRepository$retrieveSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrieveSourceApiUrl$payments_core_release(str), options, SourceParams.INSTANCE.createRetrieveSourceParams(str2), false, 8, null);
        SourceJsonParser sourceJsonParser = new SourceJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.retrieveSource_BWLJW6A$lambda$26(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$retrieveSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, sourceJsonParser, function1, stripeApiRepository$retrieveSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveSource_BWLJW6A$lambda$26(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.SourceRetrieve, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8025createPaymentMethod0E7RQCE(final PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) {
        StripeApiRepository$createPaymentMethod$1 stripeApiRepository$createPaymentMethod$1;
        if (continuation instanceof StripeApiRepository$createPaymentMethod$1) {
            stripeApiRepository$createPaymentMethod$1 = (StripeApiRepository$createPaymentMethod$1) continuation;
            if ((stripeApiRepository$createPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createPaymentMethod$1 = new StripeApiRepository$createPaymentMethod$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String paymentMethodsUrl$payments_core_release = INSTANCE.getPaymentMethodsUrl$payments_core_release();
        Map mapPlus = MapsKt.plus(paymentMethodCreateParams.toParamMap(), buildPaymentUserAgentPair(paymentMethodCreateParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, paymentMethodsUrl$payments_core_release, options, MapsKt.plus(mapPlus, params), false, 8, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createPaymentMethod_0E7RQCE$lambda$27(this.f$0, paymentMethodCreateParams, (Result) obj2);
            }
        };
        stripeApiRepository$createPaymentMethod$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$createPaymentMethod$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPaymentMethod_0E7RQCE$lambda$27(StripeApiRepository stripeApiRepository, PaymentMethodCreateParams paymentMethodCreateParams, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createPaymentMethodCreation$payments_core_release(paymentMethodCreateParams.getCode$payments_core_release(), paymentMethodCreateParams.getAttribution()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: updatePaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8060updatePaymentMethodBWLJW6A(String str, final PaymentMethodUpdateParams paymentMethodUpdateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) {
        StripeApiRepository$updatePaymentMethod$1 stripeApiRepository$updatePaymentMethod$1;
        if (continuation instanceof StripeApiRepository$updatePaymentMethod$1) {
            stripeApiRepository$updatePaymentMethod$1 = (StripeApiRepository$updatePaymentMethod$1) continuation;
            if ((stripeApiRepository$updatePaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$updatePaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$updatePaymentMethod$1 = new StripeApiRepository$updatePaymentMethod$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$updatePaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$updatePaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getPaymentMethodUrl$payments_core_release(str), options, paymentMethodUpdateParams.toParamMap(), false, 8, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.updatePaymentMethod_BWLJW6A$lambda$28(this.f$0, paymentMethodUpdateParams, (Result) obj2);
            }
        };
        stripeApiRepository$updatePaymentMethod$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$updatePaymentMethod$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePaymentMethod_BWLJW6A$lambda$28(StripeApiRepository stripeApiRepository, PaymentMethodUpdateParams paymentMethodUpdateParams, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createPaymentMethodUpdate$payments_core_release(paymentMethodUpdateParams.getType().code, paymentMethodUpdateParams.getProductUsageTokens$payments_core_release()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: setDefaultPaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8056setDefaultPaymentMethodBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation) {
        StripeApiRepository$setDefaultPaymentMethod$1 stripeApiRepository$setDefaultPaymentMethod$1;
        if (continuation instanceof StripeApiRepository$setDefaultPaymentMethod$1) {
            stripeApiRepository$setDefaultPaymentMethod$1 = (StripeApiRepository$setDefaultPaymentMethod$1) continuation;
            if ((stripeApiRepository$setDefaultPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$setDefaultPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$setDefaultPaymentMethod$1 = new StripeApiRepository$setDefaultPaymentMethod$1(this, continuation);
            }
        }
        StripeApiRepository$setDefaultPaymentMethod$1 stripeApiRepository$setDefaultPaymentMethod$12 = stripeApiRepository$setDefaultPaymentMethod$1;
        Object obj = stripeApiRepository$setDefaultPaymentMethod$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$setDefaultPaymentMethod$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getSetDefaultPaymentMethodUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("payment_method", str2 == null ? "" : str2)), false, 8, null);
        CustomerJsonParser customerJsonParser = new CustomerJsonParser();
        stripeApiRepository$setDefaultPaymentMethod$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, customerJsonParser, null, stripeApiRepository$setDefaultPaymentMethod$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createToken-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8030createToken0E7RQCE(final TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Result<Token>> continuation) {
        StripeApiRepository$createToken$1 stripeApiRepository$createToken$1;
        if (continuation instanceof StripeApiRepository$createToken$1) {
            stripeApiRepository$createToken$1 = (StripeApiRepository$createToken$1) continuation;
            if ((stripeApiRepository$createToken$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createToken$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createToken$1 = new StripeApiRepository$createToken$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createToken$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createToken$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String tokensUrl$payments_core_release = INSTANCE.getTokensUrl$payments_core_release();
        Map mapPlus = MapsKt.plus(tokenParams.toParamMap(), buildPaymentUserAgentPair(tokenParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData != null ? fraudDetectionData.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, tokensUrl$payments_core_release, options, MapsKt.plus(mapPlus, params), false, 8, null);
        TokenJsonParser tokenJsonParser = new TokenJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createToken_0E7RQCE$lambda$29(this.f$0, tokenParams, (Result) obj2);
            }
        };
        stripeApiRepository$createToken$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, tokenJsonParser, function1, stripeApiRepository$createToken$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createToken_0E7RQCE$lambda$29(StripeApiRepository stripeApiRepository, TokenParams tokenParams, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createTokenCreation$payments_core_release(tokenParams.getAttribution(), tokenParams.getTokenType()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: addCustomerSource-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8012addCustomerSourcebMdYcbs(String str, String str2, final Set<String> set, String str3, final String str4, ApiRequest.Options options, Continuation<? super Result<Source>> continuation) {
        StripeApiRepository$addCustomerSource$1 stripeApiRepository$addCustomerSource$1;
        if (continuation instanceof StripeApiRepository$addCustomerSource$1) {
            stripeApiRepository$addCustomerSource$1 = (StripeApiRepository$addCustomerSource$1) continuation;
            if ((stripeApiRepository$addCustomerSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$addCustomerSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$addCustomerSource$1 = new StripeApiRepository$addCustomerSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$addCustomerSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$addCustomerSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getAddCustomerSourceUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("source", str3)), false, 8, null);
        SourceJsonParser sourceJsonParser = new SourceJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.addCustomerSource_bMdYcbs$lambda$30(this.f$0, set, str4, (Result) obj2);
            }
        };
        stripeApiRepository$addCustomerSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, sourceJsonParser, function1, stripeApiRepository$addCustomerSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addCustomerSource_bMdYcbs$lambda$30(StripeApiRepository stripeApiRepository, Set set, String str, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createAddSource$payments_core_release(set, str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: deleteCustomerSource-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8031deleteCustomerSourcehUnOzRk(String str, String str2, final Set<String> set, String str3, ApiRequest.Options options, Continuation<? super Result<Source>> continuation) {
        StripeApiRepository$deleteCustomerSource$1 stripeApiRepository$deleteCustomerSource$1;
        if (continuation instanceof StripeApiRepository$deleteCustomerSource$1) {
            stripeApiRepository$deleteCustomerSource$1 = (StripeApiRepository$deleteCustomerSource$1) continuation;
            if ((stripeApiRepository$deleteCustomerSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$deleteCustomerSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$deleteCustomerSource$1 = new StripeApiRepository$deleteCustomerSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$deleteCustomerSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$deleteCustomerSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateDelete$default = ApiRequest.Factory.createDelete$default(this.apiRequestFactory, INSTANCE.getDeleteCustomerSourceUrl$payments_core_release(str, str3), options, null, 4, null);
        SourceJsonParser sourceJsonParser = new SourceJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.deleteCustomerSource_hUnOzRk$lambda$31(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$deleteCustomerSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateDelete$default, sourceJsonParser, function1, stripeApiRepository$deleteCustomerSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCustomerSource_hUnOzRk$lambda$31(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createDeleteSource$payments_core_release(set));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachPaymentMethod-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8016attachPaymentMethodyxL6bBk(String str, final Set<String> set, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) {
        StripeApiRepository$attachPaymentMethod$1 stripeApiRepository$attachPaymentMethod$1;
        if (continuation instanceof StripeApiRepository$attachPaymentMethod$1) {
            stripeApiRepository$attachPaymentMethod$1 = (StripeApiRepository$attachPaymentMethod$1) continuation;
            if ((stripeApiRepository$attachPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$attachPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$attachPaymentMethod$1 = new StripeApiRepository$attachPaymentMethod$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$attachPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$attachPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        fireFraudDetectionDataRequest();
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getAttachPaymentMethodUrl$payments_core_release(str2), options, MapsKt.mapOf(TuplesKt.to("customer", str)), false, 8, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.attachPaymentMethod_yxL6bBk$lambda$32(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$attachPaymentMethod$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$attachPaymentMethod$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachPaymentMethod_yxL6bBk$lambda$32(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createAttachPaymentMethod$payments_core_release(set));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: detachPaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8033detachPaymentMethodBWLJW6A(final Set<String> set, String str, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        StripeApiRepository$detachPaymentMethod$1 stripeApiRepository$detachPaymentMethod$1;
        if (continuation instanceof StripeApiRepository$detachPaymentMethod$1) {
            stripeApiRepository$detachPaymentMethod$1 = (StripeApiRepository$detachPaymentMethod$1) continuation;
            if ((stripeApiRepository$detachPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$detachPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$detachPaymentMethod$1 = new StripeApiRepository$detachPaymentMethod$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$detachPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$detachPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, getDetachPaymentMethodUrl$payments_core_release(str), options, null, false, 12, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.detachPaymentMethod_BWLJW6A$lambda$33(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$detachPaymentMethod$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$detachPaymentMethod$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detachPaymentMethod_BWLJW6A$lambda$33(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createDetachPaymentMethod$payments_core_release(set));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: detachPaymentMethod-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8034detachPaymentMethodyxL6bBk(String str, final Set<String> set, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        StripeApiRepository$detachPaymentMethod$3 stripeApiRepository$detachPaymentMethod$3;
        if (continuation instanceof StripeApiRepository$detachPaymentMethod$3) {
            stripeApiRepository$detachPaymentMethod$3 = (StripeApiRepository$detachPaymentMethod$3) continuation;
            if ((stripeApiRepository$detachPaymentMethod$3.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$detachPaymentMethod$3.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$detachPaymentMethod$3 = new StripeApiRepository$detachPaymentMethod$3(this, continuation);
            }
        }
        Object obj = stripeApiRepository$detachPaymentMethod$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$detachPaymentMethod$3.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, getElementsDetachPaymentMethodUrl$payments_core_release(str2), options, MapsKt.mapOf(TuplesKt.to("customer_session_client_secret", str)), false, 8, null);
        PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.detachPaymentMethod_yxL6bBk$lambda$34(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$detachPaymentMethod$3.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentMethodJsonParser, function1, stripeApiRepository$detachPaymentMethod$3);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detachPaymentMethod_yxL6bBk$lambda$34(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.paymentAnalyticsRequestFactory.createDetachPaymentMethod$payments_core_release(set));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: getPaymentMethods-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8037getPaymentMethodsBWLJW6A(ListPaymentMethodsParams listPaymentMethodsParams, final Set<String> set, ApiRequest.Options options, Continuation<? super Result<? extends List<PaymentMethod>>> continuation) {
        StripeApiRepository$getPaymentMethods$1 stripeApiRepository$getPaymentMethods$1;
        Object objM8007fetchStripeModelResultBWLJW6A;
        if (continuation instanceof StripeApiRepository$getPaymentMethods$1) {
            stripeApiRepository$getPaymentMethods$1 = (StripeApiRepository$getPaymentMethods$1) continuation;
            if ((stripeApiRepository$getPaymentMethods$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getPaymentMethods$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$getPaymentMethods$1 = new StripeApiRepository$getPaymentMethods$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$getPaymentMethods$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$getPaymentMethods$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getPaymentMethodsUrl$payments_core_release(), options, listPaymentMethodsParams.toParamMap(), false, 8, null);
            PaymentMethodsListJsonParser paymentMethodsListJsonParser = new PaymentMethodsListJsonParser();
            Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return StripeApiRepository.getPaymentMethods_BWLJW6A$lambda$35(this.f$0, set, (Result) obj2);
                }
            };
            stripeApiRepository$getPaymentMethods$1.label = 1;
            objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, paymentMethodsListJsonParser, function1, stripeApiRepository$getPaymentMethods$1);
            if (objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8007fetchStripeModelResultBWLJW6A = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objM8007fetchStripeModelResultBWLJW6A)) {
            return Result.m9118constructorimpl(objM8007fetchStripeModelResultBWLJW6A);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(((PaymentMethodsList) objM8007fetchStripeModelResultBWLJW6A).getPaymentMethods());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPaymentMethods_BWLJW6A$lambda$35(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerRetrievePaymentMethods, set, null, null, null, null, 60, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: setDefaultCustomerSource-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8055setDefaultCustomerSourcebMdYcbs(String str, String str2, final Set<String> set, String str3, final String str4, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation) {
        StripeApiRepository$setDefaultCustomerSource$1 stripeApiRepository$setDefaultCustomerSource$1;
        if (continuation instanceof StripeApiRepository$setDefaultCustomerSource$1) {
            stripeApiRepository$setDefaultCustomerSource$1 = (StripeApiRepository$setDefaultCustomerSource$1) continuation;
            if ((stripeApiRepository$setDefaultCustomerSource$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$setDefaultCustomerSource$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$setDefaultCustomerSource$1 = new StripeApiRepository$setDefaultCustomerSource$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$setDefaultCustomerSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$setDefaultCustomerSource$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRetrieveCustomerUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("default_source", str3)), false, 8, null);
        CustomerJsonParser customerJsonParser = new CustomerJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.setDefaultCustomerSource_bMdYcbs$lambda$37(this.f$0, set, str4, (Result) obj2);
            }
        };
        stripeApiRepository$setDefaultCustomerSource$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, customerJsonParser, function1, stripeApiRepository$setDefaultCustomerSource$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDefaultCustomerSource_bMdYcbs$lambda$37(StripeApiRepository stripeApiRepository, Set set, String str, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerSetDefaultSource, set, str, null, null, null, 56, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: setCustomerShippingInfo-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8054setCustomerShippingInfohUnOzRk(String str, String str2, final Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation) {
        StripeApiRepository$setCustomerShippingInfo$1 stripeApiRepository$setCustomerShippingInfo$1;
        if (continuation instanceof StripeApiRepository$setCustomerShippingInfo$1) {
            stripeApiRepository$setCustomerShippingInfo$1 = (StripeApiRepository$setCustomerShippingInfo$1) continuation;
            if ((stripeApiRepository$setCustomerShippingInfo$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$setCustomerShippingInfo$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$setCustomerShippingInfo$1 = new StripeApiRepository$setCustomerShippingInfo$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$setCustomerShippingInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$setCustomerShippingInfo$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getRetrieveCustomerUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("shipping", shippingInformation.toParamMap())), false, 8, null);
        CustomerJsonParser customerJsonParser = new CustomerJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.setCustomerShippingInfo_hUnOzRk$lambda$38(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$setCustomerShippingInfo$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, customerJsonParser, function1, stripeApiRepository$setCustomerShippingInfo$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomerShippingInfo_hUnOzRk$lambda$38(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerSetShippingInfo, set, null, null, null, null, 60, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveCustomer-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8045retrieveCustomerBWLJW6A(String str, final Set<String> set, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation) {
        StripeApiRepository$retrieveCustomer$1 stripeApiRepository$retrieveCustomer$1;
        if (continuation instanceof StripeApiRepository$retrieveCustomer$1) {
            stripeApiRepository$retrieveCustomer$1 = (StripeApiRepository$retrieveCustomer$1) continuation;
            if ((stripeApiRepository$retrieveCustomer$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveCustomer$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveCustomer$1 = new StripeApiRepository$retrieveCustomer$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveCustomer$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveCustomer$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getRetrieveCustomerUrl$payments_core_release(str), options, null, false, 12, null);
        CustomerJsonParser customerJsonParser = new CustomerJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.retrieveCustomer_BWLJW6A$lambda$39(this.f$0, set, (Result) obj2);
            }
        };
        stripeApiRepository$retrieveCustomer$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, customerJsonParser, function1, stripeApiRepository$retrieveCustomer$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveCustomer_BWLJW6A$lambda$39(StripeApiRepository stripeApiRepository, Set set, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CustomerRetrieve, set, null, null, null, null, 60, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveIssuingCardPin-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8047retrieveIssuingCardPinyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<String>> continuation) {
        StripeApiRepository$retrieveIssuingCardPin$1 stripeApiRepository$retrieveIssuingCardPin$1;
        Object objM8007fetchStripeModelResultBWLJW6A;
        if (continuation instanceof StripeApiRepository$retrieveIssuingCardPin$1) {
            stripeApiRepository$retrieveIssuingCardPin$1 = (StripeApiRepository$retrieveIssuingCardPin$1) continuation;
            if ((stripeApiRepository$retrieveIssuingCardPin$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveIssuingCardPin$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveIssuingCardPin$1 = new StripeApiRepository$retrieveIssuingCardPin$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveIssuingCardPin$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveIssuingCardPin$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRequest.Factory factory = this.apiRequestFactory;
            Companion companion = INSTANCE;
            ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(factory, companion.getIssuingCardPinUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("verification", companion.createVerificationParam(str2, str3))), false, 8, null);
            IssuingCardPinJsonParser issuingCardPinJsonParser = new IssuingCardPinJsonParser();
            Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return StripeApiRepository.retrieveIssuingCardPin_yxL6bBk$lambda$40(this.f$0, (Result) obj2);
                }
            };
            stripeApiRepository$retrieveIssuingCardPin$1.label = 1;
            objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, issuingCardPinJsonParser, function1, stripeApiRepository$retrieveIssuingCardPin$1);
            if (objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8007fetchStripeModelResultBWLJW6A = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objM8007fetchStripeModelResultBWLJW6A)) {
            return Result.m9118constructorimpl(objM8007fetchStripeModelResultBWLJW6A);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9118constructorimpl(((IssuingCardPin) objM8007fetchStripeModelResultBWLJW6A).getPin());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveIssuingCardPin_yxL6bBk$lambda$40(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.IssuingRetrievePin);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateIssuingCardPin(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Throwable> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM9118constructorimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objMakeApiRequest$payments_core_release = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository = this;
                ApiRequest.Factory factory = this.apiRequestFactory;
                Companion companion2 = INSTANCE;
                ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion2.getIssuingCardPinUrl$payments_core_release(str), options, MapsKt.mapOf(TuplesKt.to("verification", companion2.createVerificationParam(str3, str4)), TuplesKt.to("pin", str2)), false, 8, null);
                Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StripeApiRepository.updateIssuingCardPin$lambda$43$lambda$42(this.f$0, (Result) obj);
                    }
                };
                anonymousClass1.label = 1;
                objMakeApiRequest$payments_core_release = makeApiRequest$payments_core_release(apiRequestCreatePost$default, function1, anonymousClass1);
                if (objMakeApiRequest$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objMakeApiRequest$payments_core_release);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateIssuingCardPin$lambda$43$lambda$42(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.IssuingUpdatePin);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: getFpxBankStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8036getFpxBankStatusgIAlus(ApiRequest.Options options, Continuation<? super Result<BankStatuses>> continuation) {
        StripeApiRepository$getFpxBankStatus$1 stripeApiRepository$getFpxBankStatus$1;
        if (continuation instanceof StripeApiRepository$getFpxBankStatus$1) {
            stripeApiRepository$getFpxBankStatus$1 = (StripeApiRepository$getFpxBankStatus$1) continuation;
            if ((stripeApiRepository$getFpxBankStatus$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getFpxBankStatus$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$getFpxBankStatus$1 = new StripeApiRepository$getFpxBankStatus$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$getFpxBankStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$getFpxBankStatus$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getApiUrl("fpx/bank_statuses"), ApiRequest.Options.copy$default(options, null, null, null, 5, null), MapsKt.mapOf(TuplesKt.to(BankAccountJsonParser.FIELD_ACCOUNT_HOLDER_TYPE, "individual")), false, 8, null);
        FpxBankStatusesJsonParser fpxBankStatusesJsonParser = new FpxBankStatusesJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.getFpxBankStatus_gIAlu_s$lambda$44(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$getFpxBankStatus$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, fpxBankStatusesJsonParser, function1, stripeApiRepository$getFpxBankStatus$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFpxBankStatus_gIAlu_s$lambda$44(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.FpxBankStatusesRetrieve);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: getCardMetadata-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8035getCardMetadata0E7RQCE(Bin bin, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation) {
        StripeApiRepository$getCardMetadata$1 stripeApiRepository$getCardMetadata$1;
        Object objM8008fetchStripeModelResultBWLJW6A$default;
        StripeApiRepository stripeApiRepository;
        if (continuation instanceof StripeApiRepository$getCardMetadata$1) {
            stripeApiRepository$getCardMetadata$1 = (StripeApiRepository$getCardMetadata$1) continuation;
            if ((stripeApiRepository$getCardMetadata$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$getCardMetadata$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$getCardMetadata$1 = new StripeApiRepository$getCardMetadata$1(this, continuation);
            }
        }
        StripeApiRepository$getCardMetadata$1 stripeApiRepository$getCardMetadata$12 = stripeApiRepository$getCardMetadata$1;
        Object obj = stripeApiRepository$getCardMetadata$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$getCardMetadata$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getEdgeUrl("card-metadata"), ApiRequest.Options.copy$default(options, null, null, null, 5, null), MapsKt.mapOf(TuplesKt.to(SDKConstants.PARAM_KEY, options.getApiKey()), TuplesKt.to("bin_prefix", bin.getValue())), false, 8, null);
            CardMetadataJsonParser cardMetadataJsonParser = new CardMetadataJsonParser(bin);
            stripeApiRepository$getCardMetadata$12.L$0 = this;
            stripeApiRepository$getCardMetadata$12.label = 1;
            objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreateGet$default, cardMetadataJsonParser, null, stripeApiRepository$getCardMetadata$12, 4, null);
            if (objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            stripeApiRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StripeApiRepository stripeApiRepository2 = (StripeApiRepository) stripeApiRepository$getCardMetadata$12.L$0;
            ResultKt.throwOnFailure(obj);
            objM8008fetchStripeModelResultBWLJW6A$default = ((Result) obj).getValue();
            stripeApiRepository = stripeApiRepository2;
        }
        if (Result.m9121exceptionOrNullimpl(objM8008fetchStripeModelResultBWLJW6A$default) != null) {
            stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.CardMetadataLoadFailure);
        }
        return objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: start3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8058start3ds2Auth0E7RQCE(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        StripeApiRepository$start3ds2Auth$1 stripeApiRepository$start3ds2Auth$1;
        if (continuation instanceof StripeApiRepository$start3ds2Auth$1) {
            stripeApiRepository$start3ds2Auth$1 = (StripeApiRepository$start3ds2Auth$1) continuation;
            if ((stripeApiRepository$start3ds2Auth$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$start3ds2Auth$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$start3ds2Auth$1 = new StripeApiRepository$start3ds2Auth$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$start3ds2Auth$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$start3ds2Auth$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getApiUrl("3ds2/authenticate"), options, stripe3ds2AuthParams.toParamMap(), false, 8, null);
        Stripe3ds2AuthResultJsonParser stripe3ds2AuthResultJsonParser = new Stripe3ds2AuthResultJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.start3ds2Auth_0E7RQCE$lambda$46(this.f$0, (Result) obj2);
            }
        };
        stripeApiRepository$start3ds2Auth$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, stripe3ds2AuthResultJsonParser, function1, stripeApiRepository$start3ds2Auth$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start3ds2Auth_0E7RQCE$lambda$46(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Start, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: complete3ds2Auth-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8019complete3ds2Auth0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        StripeApiRepository$complete3ds2Auth$1 stripeApiRepository$complete3ds2Auth$1;
        if (continuation instanceof StripeApiRepository$complete3ds2Auth$1) {
            stripeApiRepository$complete3ds2Auth$1 = (StripeApiRepository$complete3ds2Auth$1) continuation;
            if ((stripeApiRepository$complete3ds2Auth$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$complete3ds2Auth$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$complete3ds2Auth$1 = new StripeApiRepository$complete3ds2Auth$1(this, continuation);
            }
        }
        StripeApiRepository$complete3ds2Auth$1 stripeApiRepository$complete3ds2Auth$12 = stripeApiRepository$complete3ds2Auth$1;
        Object obj = stripeApiRepository$complete3ds2Auth$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$complete3ds2Auth$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getApiUrl("3ds2/challenge_complete"), options, MapsKt.mapOf(TuplesKt.to("source", str)), false, 8, null);
        Stripe3ds2AuthResultJsonParser stripe3ds2AuthResultJsonParser = new Stripe3ds2AuthResultJsonParser();
        stripeApiRepository$complete3ds2Auth$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, stripe3ds2AuthResultJsonParser, null, stripeApiRepository$complete3ds2Auth$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createFile-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8022createFile0E7RQCE(StripeFileParams stripeFileParams, ApiRequest.Options options, Continuation<? super Result<StripeFile>> continuation) {
        StripeApiRepository$createFile$1 stripeApiRepository$createFile$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$createFile$1) {
            stripeApiRepository$createFile$1 = (StripeApiRepository$createFile$1) continuation;
            if ((stripeApiRepository$createFile$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createFile$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createFile$1 = new StripeApiRepository$createFile$1(this, continuation);
            }
        }
        Object objMakeFileUploadRequest$payments_core_release = stripeApiRepository$createFile$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createFile$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objMakeFileUploadRequest$payments_core_release);
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository = this;
                FileUploadRequest fileUploadRequest = new FileUploadRequest(stripeFileParams, options, this.appInfo, null, 8, null);
                Function1<? super RequestId, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StripeApiRepository.createFile_0E7RQCE$lambda$48$lambda$47(this.f$0, (RequestId) obj);
                    }
                };
                stripeApiRepository$createFile$1.label = 1;
                objMakeFileUploadRequest$payments_core_release = makeFileUploadRequest$payments_core_release(fileUploadRequest, function1, stripeApiRepository$createFile$1);
                if (objMakeFileUploadRequest$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMakeFileUploadRequest$payments_core_release);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objMakeFileUploadRequest$payments_core_release);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m9118constructorimpl(new StripeFileJsonParser().parse(ResponseJsonKt.responseJson((StripeResponse) objM9118constructorimpl)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl = ResultKt.createFailure(th2);
            }
        }
        return Result.m9118constructorimpl(objM9118constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createFile_0E7RQCE$lambda$48$lambda$47(StripeApiRepository stripeApiRepository, RequestId requestId) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.FileCreate);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveObject-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8048retrieveObject0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<StripeResponse<String>>> continuation) {
        StripeApiRepository$retrieveObject$1 stripeApiRepository$retrieveObject$1;
        if (continuation instanceof StripeApiRepository$retrieveObject$1) {
            stripeApiRepository$retrieveObject$1 = (StripeApiRepository$retrieveObject$1) continuation;
            if ((stripeApiRepository$retrieveObject$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveObject$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveObject$1 = new StripeApiRepository$retrieveObject$1(this, continuation);
            }
        }
        Object objMakeApiRequest$payments_core_release = stripeApiRepository$retrieveObject$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveObject$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
                if (!StripeUrlUtils.INSTANCE.isStripeUrl$payments_core_release(str)) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Unrecognized domain: " + str)));
                }
                Result.Companion companion2 = Result.INSTANCE;
                StripeApiRepository stripeApiRepository = this;
                ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, str, options, null, false, 12, null);
                Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StripeApiRepository.retrieveObject_0E7RQCE$lambda$51$lambda$50(this.f$0, (Result) obj);
                    }
                };
                stripeApiRepository$retrieveObject$1.label = 1;
                objMakeApiRequest$payments_core_release = makeApiRequest$payments_core_release(apiRequestCreateGet$default, function1, stripeApiRepository$retrieveObject$1);
                if (objMakeApiRequest$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
            }
            return Result.m9118constructorimpl((StripeResponse) objMakeApiRequest$payments_core_release);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveObject_0E7RQCE$lambda$51$lambda$50(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest(PaymentAnalyticsEvent.StripeUrlRetrieve);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x004d, TRY_ENTER, TryCatch #2 {all -> 0x004d, blocks: (B:19:0x0049, B:31:0x0071, B:32:0x0078, B:33:0x0083), top: B:57:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:19:0x0049, B:31:0x0071, B:32:0x0078, B:33:0x0083), top: B:57:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002a, B:44:0x00df, B:41:0x00a3), top: B:55:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createRadarSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8026createRadarSessiongIAlus(ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation) {
        StripeApiRepository$createRadarSession$1 stripeApiRepository$createRadarSession$1;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        final StripeApiRepository stripeApiRepository;
        Object objM9118constructorimpl2;
        Object objM8007fetchStripeModelResultBWLJW6A;
        if (continuation instanceof StripeApiRepository$createRadarSession$1) {
            stripeApiRepository$createRadarSession$1 = (StripeApiRepository$createRadarSession$1) continuation;
            if ((stripeApiRepository$createRadarSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createRadarSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createRadarSession$1 = new StripeApiRepository$createRadarSession$1(this, continuation);
            }
        }
        StripeApiRepository$createRadarSession$1 stripeApiRepository$createRadarSession$12 = stripeApiRepository$createRadarSession$1;
        Object latest = stripeApiRepository$createRadarSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createRadarSession$12.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(latest);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                StripeApiRepository stripeApiRepository2 = this;
            } catch (Throwable th2) {
                th = th2;
                stripeApiRepository = this;
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                ApiRequest.Options options2 = options;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                }
            }
            if (!Stripe.INSTANCE.getAdvancedFraudSignalsEnabled()) {
                throw new IllegalArgumentException("Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session.".toString());
            }
            FraudDetectionDataRepository fraudDetectionDataRepository = this.fraudDetectionDataRepository;
            stripeApiRepository$createRadarSession$12.L$0 = this;
            stripeApiRepository$createRadarSession$12.L$1 = options;
            stripeApiRepository$createRadarSession$12.label = 1;
            latest = fraudDetectionDataRepository.getLatest(stripeApiRepository$createRadarSession$12);
            if (latest != coroutine_suspended) {
                stripeApiRepository = this;
                if (latest == null) {
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latest);
            objM8007fetchStripeModelResultBWLJW6A = ((Result) latest).getValue();
            objM9118constructorimpl = Result.m9118constructorimpl(Result.m9117boximpl(objM8007fetchStripeModelResultBWLJW6A));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9117boximpl(Result.m9118constructorimpl(ResultKt.createFailure(StripeException.INSTANCE.create(thM9121exceptionOrNullimpl))));
            }
            return ((Result) objM9118constructorimpl).getValue();
        }
        options = (ApiRequest.Options) stripeApiRepository$createRadarSession$12.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$createRadarSession$12.L$0;
        try {
            ResultKt.throwOnFailure(latest);
            if (latest == null) {
                objM9118constructorimpl2 = Result.m9118constructorimpl((FraudDetectionData) latest);
            } else {
                throw new IllegalArgumentException("Could not obtain fraud data required to create a Radar Session.".toString());
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion32 = Result.INSTANCE;
            objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
            ApiRequest.Options options22 = options;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            }
        }
        ApiRequest.Options options222 = options;
        if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            Result.Companion companion5 = Result.INSTANCE;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(stripeApiRepository.apiRequestFactory, INSTANCE.getApiUrl("radar/session"), options222, MapsKt.plus(((FraudDetectionData) objM9118constructorimpl2).getParams(), buildPaymentUserAgentPair$default(stripeApiRepository, null, 1, null)), false, 8, null);
            RadarSessionWithHCaptchaJsonParser radarSessionWithHCaptchaJsonParser = new RadarSessionWithHCaptchaJsonParser();
            Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StripeApiRepository.createRadarSession_gIAlu_s$lambda$56$lambda$55(this.f$0, (Result) obj);
                }
            };
            stripeApiRepository$createRadarSession$12.L$0 = null;
            stripeApiRepository$createRadarSession$12.L$1 = null;
            stripeApiRepository$createRadarSession$12.label = 2;
            objM8007fetchStripeModelResultBWLJW6A = stripeApiRepository.m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, radarSessionWithHCaptchaJsonParser, function1, stripeApiRepository$createRadarSession$12);
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return ((Result) objM9118constructorimpl).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createRadarSession_gIAlu_s$lambda$56$lambda$55(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.RadarSessionCreate, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:19:0x004e, B:31:0x0079, B:32:0x0080, B:33:0x008b), top: B:54:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:19:0x004e, B:31:0x0079, B:32:0x0080, B:33:0x008b), top: B:54:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002a, B:44:0x00f7, B:41:0x00ab), top: B:55:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createSavedPaymentMethodRadarSession-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8027createSavedPaymentMethodRadarSession0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation) {
        StripeApiRepository$createSavedPaymentMethodRadarSession$1 stripeApiRepository$createSavedPaymentMethodRadarSession$1;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        final StripeApiRepository stripeApiRepository;
        Object objM9118constructorimpl2;
        Object objM8007fetchStripeModelResultBWLJW6A;
        if (continuation instanceof StripeApiRepository$createSavedPaymentMethodRadarSession$1) {
            stripeApiRepository$createSavedPaymentMethodRadarSession$1 = (StripeApiRepository$createSavedPaymentMethodRadarSession$1) continuation;
            if ((stripeApiRepository$createSavedPaymentMethodRadarSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createSavedPaymentMethodRadarSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createSavedPaymentMethodRadarSession$1 = new StripeApiRepository$createSavedPaymentMethodRadarSession$1(this, continuation);
            }
        }
        StripeApiRepository$createSavedPaymentMethodRadarSession$1 stripeApiRepository$createSavedPaymentMethodRadarSession$12 = stripeApiRepository$createSavedPaymentMethodRadarSession$1;
        Object latest = stripeApiRepository$createSavedPaymentMethodRadarSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createSavedPaymentMethodRadarSession$12.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(latest);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                StripeApiRepository stripeApiRepository2 = this;
            } catch (Throwable th2) {
                th = th2;
                stripeApiRepository = this;
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                ApiRequest.Options options2 = options;
                if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                }
            }
            if (!Stripe.INSTANCE.getAdvancedFraudSignalsEnabled()) {
                throw new IllegalArgumentException("Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session.".toString());
            }
            FraudDetectionDataRepository fraudDetectionDataRepository = this.fraudDetectionDataRepository;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$0 = this;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$1 = str;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$2 = options;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.label = 1;
            latest = fraudDetectionDataRepository.getLatest(stripeApiRepository$createSavedPaymentMethodRadarSession$12);
            if (latest != coroutine_suspended) {
                stripeApiRepository = this;
                if (latest == null) {
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latest);
            objM8007fetchStripeModelResultBWLJW6A = ((Result) latest).getValue();
            objM9118constructorimpl = Result.m9118constructorimpl(Result.m9117boximpl(objM8007fetchStripeModelResultBWLJW6A));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9117boximpl(Result.m9118constructorimpl(ResultKt.createFailure(StripeException.INSTANCE.create(thM9121exceptionOrNullimpl))));
            }
            return ((Result) objM9118constructorimpl).getValue();
        }
        options = (ApiRequest.Options) stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$2;
        str = (String) stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$1;
        stripeApiRepository = (StripeApiRepository) stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$0;
        try {
            ResultKt.throwOnFailure(latest);
            if (latest == null) {
                objM9118constructorimpl2 = Result.m9118constructorimpl((FraudDetectionData) latest);
            } else {
                throw new IllegalArgumentException("Could not obtain fraud data required to create a Radar Session.".toString());
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion32 = Result.INSTANCE;
            objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
            ApiRequest.Options options22 = options;
            if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            }
        }
        ApiRequest.Options options222 = options;
        if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            Result.Companion companion5 = Result.INSTANCE;
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(stripeApiRepository.apiRequestFactory, INSTANCE.getApiUrl("radar/saved_payment_method_session"), options222, MapsKt.plus(MapsKt.plus(((FraudDetectionData) objM9118constructorimpl2).getParams(), buildPaymentUserAgentPair$default(stripeApiRepository, null, 1, null)), MapsKt.mapOf(TuplesKt.to("payment_method", str))), false, 8, null);
            RadarSessionWithHCaptchaJsonParser radarSessionWithHCaptchaJsonParser = new RadarSessionWithHCaptchaJsonParser();
            Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StripeApiRepository.createSavedPaymentMethodRadarSession_0E7RQCE$lambda$62$lambda$61(this.f$0, (Result) obj);
                }
            };
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$0 = null;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$1 = null;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.L$2 = null;
            stripeApiRepository$createSavedPaymentMethodRadarSession$12.label = 2;
            objM8007fetchStripeModelResultBWLJW6A = stripeApiRepository.m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, radarSessionWithHCaptchaJsonParser, function1, stripeApiRepository$createSavedPaymentMethodRadarSession$12);
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            return ((Result) objM9118constructorimpl).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSavedPaymentMethodRadarSession_0E7RQCE$lambda$62$lambda$61(StripeApiRepository stripeApiRepository, Result result) {
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.RadarSessionCreate, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachHCaptchaToRadarSession-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8015attachHCaptchaToRadarSessionyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation) {
        StripeApiRepository$attachHCaptchaToRadarSession$1 stripeApiRepository$attachHCaptchaToRadarSession$1;
        Map mapEmptyMap;
        if (continuation instanceof StripeApiRepository$attachHCaptchaToRadarSession$1) {
            stripeApiRepository$attachHCaptchaToRadarSession$1 = (StripeApiRepository$attachHCaptchaToRadarSession$1) continuation;
            if ((stripeApiRepository$attachHCaptchaToRadarSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$attachHCaptchaToRadarSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$attachHCaptchaToRadarSession$1 = new StripeApiRepository$attachHCaptchaToRadarSession$1(this, continuation);
            }
        }
        StripeApiRepository$attachHCaptchaToRadarSession$1 stripeApiRepository$attachHCaptchaToRadarSession$12 = stripeApiRepository$attachHCaptchaToRadarSession$1;
        Object obj = stripeApiRepository$attachHCaptchaToRadarSession$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$attachHCaptchaToRadarSession$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        String apiUrl = INSTANCE.getApiUrl("radar/session/%s/attach_hcaptcha_token", str);
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("passive_captcha_token", str2));
        if (str3 == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("passive_captcha_ekey", str3))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, apiUrl, options, MapsKt.plus(mapMapOf, mapEmptyMap), false, 8, null);
        RadarSessionWithHCaptchaJsonParser radarSessionWithHCaptchaJsonParser = new RadarSessionWithHCaptchaJsonParser();
        stripeApiRepository$attachHCaptchaToRadarSession$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, radarSessionWithHCaptchaJsonParser, null, stripeApiRepository$attachHCaptchaToRadarSession$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: sharePaymentDetails-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8057sharePaymentDetailsyxL6bBk(String str, String str2, Map<String, ?> map, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation) {
        StripeApiRepository$sharePaymentDetails$1 stripeApiRepository$sharePaymentDetails$1;
        Object objM8008fetchStripeModelResultBWLJW6A$default;
        if (continuation instanceof StripeApiRepository$sharePaymentDetails$1) {
            stripeApiRepository$sharePaymentDetails$1 = (StripeApiRepository$sharePaymentDetails$1) continuation;
            if ((stripeApiRepository$sharePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$sharePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$sharePaymentDetails$1 = new StripeApiRepository$sharePaymentDetails$1(this, continuation);
            }
        }
        StripeApiRepository$sharePaymentDetails$1 stripeApiRepository$sharePaymentDetails$12 = stripeApiRepository$sharePaymentDetails$1;
        Object obj = stripeApiRepository$sharePaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$sharePaymentDetails$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getSharePaymentDetailsUrl$payments_core_release(), options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str))), TuplesKt.to("id", str2), buildPaymentUserAgentPair$default(this, null, 1, null)), map == null ? MapsKt.emptyMap() : map), false, 8, null);
            ConsumerPaymentDetailsShareJsonParser consumerPaymentDetailsShareJsonParser = ConsumerPaymentDetailsShareJsonParser.INSTANCE;
            stripeApiRepository$sharePaymentDetails$12.label = 1;
            objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, consumerPaymentDetailsShareJsonParser, null, stripeApiRepository$sharePaymentDetails$12, 4, null);
            if (objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8008fetchStripeModelResultBWLJW6A$default = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objM8008fetchStripeModelResultBWLJW6A$default)) {
            return Result.m9118constructorimpl(objM8008fetchStripeModelResultBWLJW6A$default);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(((ConsumerPaymentDetailsShare) objM8008fetchStripeModelResultBWLJW6A$default).getPaymentMethod());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: logOut-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8040logOutBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<ConsumerSession>> continuation) {
        StripeApiRepository$logOut$1 stripeApiRepository$logOut$1;
        if (continuation instanceof StripeApiRepository$logOut$1) {
            stripeApiRepository$logOut$1 = (StripeApiRepository$logOut$1) continuation;
            if ((stripeApiRepository$logOut$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$logOut$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$logOut$1 = new StripeApiRepository$logOut$1(this, continuation);
            }
        }
        StripeApiRepository$logOut$1 stripeApiRepository$logOut$12 = stripeApiRepository$logOut$1;
        Object obj = stripeApiRepository$logOut$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$logOut$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getLogoutConsumerUrl$payments_core_release(), options, MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)))), false, 8, null);
        ConsumerSessionJsonParser consumerSessionJsonParser = new ConsumerSessionJsonParser();
        stripeApiRepository$logOut$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, consumerSessionJsonParser, null, stripeApiRepository$logOut$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createFinancialConnectionsSessionForDeferredPayments-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8023createFinancialConnectionsSessionForDeferredPayments0E7RQCE(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1;
        if (continuation instanceof StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1) {
            stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 = (StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1) continuation;
            if ((stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1 = new StripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getDeferredFinancialConnectionsSessionUrl$payments_core_release(), options, createFinancialConnectionsSessionForDeferredPaymentParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createFinancialConnectionsSessionForDeferredPayments_0E7RQCE$lambda$66((Result) obj2);
            }
        };
        stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, function1, stripeApiRepository$createFinancialConnectionsSessionForDeferredPayments$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createFinancialConnectionsSessionForDeferredPayments_0E7RQCE$lambda$66(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createPaymentIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8024createPaymentIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1;
        if (continuation instanceof StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1) {
            stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 = (StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1) continuation;
            if ((stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1 = new StripeApiRepository$createPaymentIntentFinancialConnectionsSession$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createPaymentIntentFinancialConnectionsSession_BWLJW6A$lambda$67((Result) obj2);
            }
        };
        stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, function1, stripeApiRepository$createPaymentIntentFinancialConnectionsSession$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createPaymentIntentFinancialConnectionsSession_BWLJW6A$lambda$67(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: createSetupIntentFinancialConnectionsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8028createSetupIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        StripeApiRepository$createSetupIntentFinancialConnectionsSession$1 stripeApiRepository$createSetupIntentFinancialConnectionsSession$1;
        if (continuation instanceof StripeApiRepository$createSetupIntentFinancialConnectionsSession$1) {
            stripeApiRepository$createSetupIntentFinancialConnectionsSession$1 = (StripeApiRepository$createSetupIntentFinancialConnectionsSession$1) continuation;
            if ((stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$createSetupIntentFinancialConnectionsSession$1 = new StripeApiRepository$createSetupIntentFinancialConnectionsSession$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(str), options, createFinancialConnectionsSessionParams.toMap(), false, 8, null);
        FinancialConnectionsSessionJsonParser financialConnectionsSessionJsonParser = new FinancialConnectionsSessionJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.createSetupIntentFinancialConnectionsSession_BWLJW6A$lambda$68((Result) obj2);
            }
        };
        stripeApiRepository$createSetupIntentFinancialConnectionsSession$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, financialConnectionsSessionJsonParser, function1, stripeApiRepository$createSetupIntentFinancialConnectionsSession$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createSetupIntentFinancialConnectionsSession_BWLJW6A$lambda$68(Result result) {
        return Unit.INSTANCE;
    }

    public final /* synthetic */ String getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(String paymentIntentId) {
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        return INSTANCE.getApiUrl("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    public final /* synthetic */ String getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(String setupIntentId) {
        Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
        return INSTANCE.getApiUrl("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1;
        if (continuation instanceof StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1) {
            stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 = (StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1) continuation;
            if ((stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1 = new StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = INSTANCE;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion.getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(str2, str3), options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("client_secret", str)), companion.createExpandParam(list)), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.attachFinancialConnectionsSessionToPaymentIntent_hUnOzRk$lambda$69((Result) obj2);
            }
        };
        stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachFinancialConnectionsSessionToPaymentIntent_hUnOzRk$lambda$69(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: attachFinancialConnectionsSessionToSetupIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1;
        if (continuation instanceof StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1) {
            stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 = (StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1) continuation;
            if ((stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1 = new StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = INSTANCE;
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(factory, companion.getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(str2, str3), options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("client_secret", str)), companion.createExpandParam(list)), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.attachFinancialConnectionsSessionToSetupIntent_hUnOzRk$lambda$70((Result) obj2);
            }
        };
        stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, setupIntentJsonParser, function1, stripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachFinancialConnectionsSessionToSetupIntent_hUnOzRk$lambda$70(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: verifyPaymentIntentWithMicrodeposits-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8062verifyPaymentIntentWithMicrodepositsyxL6bBk(String str, int i, int i2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1 stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1) {
            stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1 = (StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1) continuation;
            if ((stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1 = new StripeApiRepository$verifyPaymentIntentWithMicrodeposits$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release((String) objM9118constructorimpl), options, MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("amounts", CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2)}))), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.verifyPaymentIntentWithMicrodeposits_yxL6bBk$lambda$73((Result) obj2);
            }
        };
        stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$verifyPaymentIntentWithMicrodeposits$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPaymentIntentWithMicrodeposits_yxL6bBk$lambda$73(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: verifyPaymentIntentWithMicrodeposits-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8061verifyPaymentIntentWithMicrodepositsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3 stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3) {
            stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3 = (StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3) continuation;
            if ((stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3 = new StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3(this, continuation);
            }
        }
        StripeApiRepository$verifyPaymentIntentWithMicrodeposits$3 stripeApiRepository$verifyPaymentIntentWithMicrodeposits$32 = stripeApiRepository$verifyPaymentIntentWithMicrodeposits$3;
        Object obj = stripeApiRepository$verifyPaymentIntentWithMicrodeposits$32.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$verifyPaymentIntentWithMicrodeposits$32.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(str).getPaymentIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release((String) objM9118constructorimpl), options, MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("descriptor_code", str2)), false, 8, null);
        PaymentIntentJsonParser paymentIntentJsonParser = new PaymentIntentJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.verifyPaymentIntentWithMicrodeposits_BWLJW6A$lambda$76((Result) obj2);
            }
        };
        stripeApiRepository$verifyPaymentIntentWithMicrodeposits$32.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreatePost$default, paymentIntentJsonParser, function1, stripeApiRepository$verifyPaymentIntentWithMicrodeposits$32);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyPaymentIntentWithMicrodeposits_BWLJW6A$lambda$76(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: verifySetupIntentWithMicrodeposits-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8064verifySetupIntentWithMicrodepositsyxL6bBk(String str, int i, int i2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$verifySetupIntentWithMicrodeposits$1 stripeApiRepository$verifySetupIntentWithMicrodeposits$1;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$verifySetupIntentWithMicrodeposits$1) {
            stripeApiRepository$verifySetupIntentWithMicrodeposits$1 = (StripeApiRepository$verifySetupIntentWithMicrodeposits$1) continuation;
            if ((stripeApiRepository$verifySetupIntentWithMicrodeposits$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$verifySetupIntentWithMicrodeposits$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$verifySetupIntentWithMicrodeposits$1 = new StripeApiRepository$verifySetupIntentWithMicrodeposits$1(this, continuation);
            }
        }
        StripeApiRepository$verifySetupIntentWithMicrodeposits$1 stripeApiRepository$verifySetupIntentWithMicrodeposits$12 = stripeApiRepository$verifySetupIntentWithMicrodeposits$1;
        Object obj = stripeApiRepository$verifySetupIntentWithMicrodeposits$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stripeApiRepository$verifySetupIntentWithMicrodeposits$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release((String) objM9118constructorimpl), options, MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("amounts", CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2)}))), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        stripeApiRepository$verifySetupIntentWithMicrodeposits$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, setupIntentJsonParser, null, stripeApiRepository$verifySetupIntentWithMicrodeposits$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: verifySetupIntentWithMicrodeposits-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8063verifySetupIntentWithMicrodepositsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripeApiRepository$verifySetupIntentWithMicrodeposits$2 stripeApiRepository$verifySetupIntentWithMicrodeposits$2;
        Object objM9118constructorimpl;
        if (continuation instanceof StripeApiRepository$verifySetupIntentWithMicrodeposits$2) {
            stripeApiRepository$verifySetupIntentWithMicrodeposits$2 = (StripeApiRepository$verifySetupIntentWithMicrodeposits$2) continuation;
            if ((stripeApiRepository$verifySetupIntentWithMicrodeposits$2.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$verifySetupIntentWithMicrodeposits$2.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$verifySetupIntentWithMicrodeposits$2 = new StripeApiRepository$verifySetupIntentWithMicrodeposits$2(this, continuation);
            }
        }
        StripeApiRepository$verifySetupIntentWithMicrodeposits$2 stripeApiRepository$verifySetupIntentWithMicrodeposits$22 = stripeApiRepository$verifySetupIntentWithMicrodeposits$2;
        Object obj = stripeApiRepository$verifySetupIntentWithMicrodeposits$22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$verifySetupIntentWithMicrodeposits$22.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new SetupIntent.ClientSecret(str).getSetupIntentId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release((String) objM9118constructorimpl), options, MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("descriptor_code", str2)), false, 8, null);
        SetupIntentJsonParser setupIntentJsonParser = new SetupIntentJsonParser();
        stripeApiRepository$verifySetupIntentWithMicrodeposits$22.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, setupIntentJsonParser, null, stripeApiRepository$verifySetupIntentWithMicrodeposits$22, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrievePaymentMethodMessage-eH_QyT8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8050retrievePaymentMethodMessageeH_QyT8(List<String> list, int i, String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Result<PaymentMethodMessage>> continuation) {
        StripeApiRepository$retrievePaymentMethodMessage$1 stripeApiRepository$retrievePaymentMethodMessage$1;
        if (continuation instanceof StripeApiRepository$retrievePaymentMethodMessage$1) {
            stripeApiRepository$retrievePaymentMethodMessage$1 = (StripeApiRepository$retrievePaymentMethodMessage$1) continuation;
            if ((stripeApiRepository$retrievePaymentMethodMessage$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrievePaymentMethodMessage$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrievePaymentMethodMessage$1 = new StripeApiRepository$retrievePaymentMethodMessage$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrievePaymentMethodMessage$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripeApiRepository$retrievePaymentMethodMessage$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest.Factory factory = this.apiRequestFactory;
        int i3 = 0;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, Boxing.boxInt(i)), TuplesKt.to(PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "android"), TuplesKt.to("country", str2), TuplesKt.to("currency", str), TuplesKt.to("locale", str3), TuplesKt.to("logo_color", str4));
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj2 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Pair("payment_methods[" + i3 + "]", (String) obj2));
            i3 = i4;
        }
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(factory, "https://ppm.stripe.com/content", options, MapsKt.plus(mapMapOf, arrayList), false, 8, null);
        PaymentMethodMessageJsonParser paymentMethodMessageJsonParser = new PaymentMethodMessageJsonParser();
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return StripeApiRepository.retrievePaymentMethodMessage_eH_QyT8$lambda$82((Result) obj3);
            }
        };
        stripeApiRepository$retrievePaymentMethodMessage$1.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(apiRequestCreateGet$default, paymentMethodMessageJsonParser, function1, stripeApiRepository$retrievePaymentMethodMessage$1);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrievePaymentMethodMessage_eH_QyT8$lambda$82(Result result) {
        return Unit.INSTANCE;
    }

    public final String getDetachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        return INSTANCE.getApiUrl("payment_methods/%s/detach", paymentMethodId);
    }

    public final String getElementsDetachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        return INSTANCE.getApiUrl("elements/payment_methods/%s/detach", paymentMethodId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveElementsSession-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8046retrieveElementsSession0E7RQCE(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, Continuation<? super Result<ElementsSession>> continuation) {
        StripeApiRepository$retrieveElementsSession$1 stripeApiRepository$retrieveElementsSession$1;
        if (continuation instanceof StripeApiRepository$retrieveElementsSession$1) {
            stripeApiRepository$retrieveElementsSession$1 = (StripeApiRepository$retrieveElementsSession$1) continuation;
            if ((stripeApiRepository$retrieveElementsSession$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveElementsSession$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveElementsSession$1 = new StripeApiRepository$retrieveElementsSession$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$retrieveElementsSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveElementsSession$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        stripeApiRepository$retrieveElementsSession$1.label = 1;
        Object objM8011retrieveElementsSessionBWLJW6A = m8011retrieveElementsSessionBWLJW6A(elementsSessionParams, options, null, stripeApiRepository$retrieveElementsSession$1);
        return objM8011retrieveElementsSessionBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8011retrieveElementsSessionBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveCardMetadata-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8044retrieveCardMetadata0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation) {
        StripeApiRepository$retrieveCardMetadata$1 stripeApiRepository$retrieveCardMetadata$1;
        Bin bin;
        if (continuation instanceof StripeApiRepository$retrieveCardMetadata$1) {
            stripeApiRepository$retrieveCardMetadata$1 = (StripeApiRepository$retrieveCardMetadata$1) continuation;
            if ((stripeApiRepository$retrieveCardMetadata$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveCardMetadata$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveCardMetadata$1 = new StripeApiRepository$retrieveCardMetadata$1(this, continuation);
            }
        }
        Object accountRanges = stripeApiRepository$retrieveCardMetadata$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveCardMetadata$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(accountRanges);
            CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(str);
            bin = unvalidated.getBin();
            if (bin == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new InvalidRequestException(null, null, 0, "cardNumber cannot be less than 6 characters", null, 23, null)));
            }
            CardAccountRangeRepository cardAccountRangeRepositoryCreateWithStripeRepository = this.cardAccountRangeRepositoryFactory.createWithStripeRepository(this, this.publishableKeyProvider.invoke());
            stripeApiRepository$retrieveCardMetadata$1.L$0 = bin;
            stripeApiRepository$retrieveCardMetadata$1.label = 1;
            accountRanges = cardAccountRangeRepositoryCreateWithStripeRepository.getAccountRanges(unvalidated, stripeApiRepository$retrieveCardMetadata$1);
            if (accountRanges == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bin = (Bin) stripeApiRepository$retrieveCardMetadata$1.L$0;
            ResultKt.throwOnFailure(accountRanges);
        }
        List listEmptyList = (List) accountRanges;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9118constructorimpl(new CardMetadata(bin, listEmptyList));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: retrieveCardElementConfig-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8043retrieveCardElementConfig0E7RQCE(ApiRequest.Options options, Map<String, String> map, Continuation<? super Result<MobileCardElementConfig>> continuation) {
        StripeApiRepository$retrieveCardElementConfig$1 stripeApiRepository$retrieveCardElementConfig$1;
        if (continuation instanceof StripeApiRepository$retrieveCardElementConfig$1) {
            stripeApiRepository$retrieveCardElementConfig$1 = (StripeApiRepository$retrieveCardElementConfig$1) continuation;
            if ((stripeApiRepository$retrieveCardElementConfig$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveCardElementConfig$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveCardElementConfig$1 = new StripeApiRepository$retrieveCardElementConfig$1(this, continuation);
            }
        }
        StripeApiRepository$retrieveCardElementConfig$1 stripeApiRepository$retrieveCardElementConfig$12 = stripeApiRepository$retrieveCardElementConfig$1;
        Object obj = stripeApiRepository$retrieveCardElementConfig$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveCardElementConfig$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreateGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, INSTANCE.getMobileCardElementConfigUrl$payments_core_release(), options, map, false, 8, null);
        MobileCardElementConfigParser mobileCardElementConfigParser = new MobileCardElementConfigParser();
        stripeApiRepository$retrieveCardElementConfig$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreateGet$default, mobileCardElementConfigParser, null, stripeApiRepository$retrieveCardElementConfig$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: listPaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8038listPaymentDetailsBWLJW6A(String str, Set<String> set, ApiRequest.Options options, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        StripeApiRepository$listPaymentDetails$1 stripeApiRepository$listPaymentDetails$1;
        if (continuation instanceof StripeApiRepository$listPaymentDetails$1) {
            stripeApiRepository$listPaymentDetails$1 = (StripeApiRepository$listPaymentDetails$1) continuation;
            if ((stripeApiRepository$listPaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$listPaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$listPaymentDetails$1 = new StripeApiRepository$listPaymentDetails$1(this, continuation);
            }
        }
        StripeApiRepository$listPaymentDetails$1 stripeApiRepository$listPaymentDetails$12 = stripeApiRepository$listPaymentDetails$1;
        Object obj = stripeApiRepository$listPaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$listPaymentDetails$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getListConsumerPaymentDetailsUrl$payments_core_release(), options, MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str))), TuplesKt.to("types", CollectionsKt.toList(set))), false, 8, null);
        ConsumerPaymentDetailsJsonParser consumerPaymentDetailsJsonParser = ConsumerPaymentDetailsJsonParser.INSTANCE;
        stripeApiRepository$listPaymentDetails$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, consumerPaymentDetailsJsonParser, null, stripeApiRepository$listPaymentDetails$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: listShippingAddresses-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8039listShippingAddresses0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<ConsumerShippingAddresses>> continuation) {
        StripeApiRepository$listShippingAddresses$1 stripeApiRepository$listShippingAddresses$1;
        if (continuation instanceof StripeApiRepository$listShippingAddresses$1) {
            stripeApiRepository$listShippingAddresses$1 = (StripeApiRepository$listShippingAddresses$1) continuation;
            if ((stripeApiRepository$listShippingAddresses$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$listShippingAddresses$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$listShippingAddresses$1 = new StripeApiRepository$listShippingAddresses$1(this, continuation);
            }
        }
        StripeApiRepository$listShippingAddresses$1 stripeApiRepository$listShippingAddresses$12 = stripeApiRepository$listShippingAddresses$1;
        Object obj = stripeApiRepository$listShippingAddresses$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$listShippingAddresses$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getListShippingAddresses$payments_core_release(), options, MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)))), false, 8, null);
        ConsumerShippingAddressesParser consumerShippingAddressesParser = ConsumerShippingAddressesParser.INSTANCE;
        stripeApiRepository$listShippingAddresses$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, consumerShippingAddressesParser, null, stripeApiRepository$listShippingAddresses$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: deletePaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8032deletePaymentDetailsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Unit>> continuation) {
        StripeApiRepository$deletePaymentDetails$1 stripeApiRepository$deletePaymentDetails$1;
        if (continuation instanceof StripeApiRepository$deletePaymentDetails$1) {
            stripeApiRepository$deletePaymentDetails$1 = (StripeApiRepository$deletePaymentDetails$1) continuation;
            if ((stripeApiRepository$deletePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$deletePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$deletePaymentDetails$1 = new StripeApiRepository$deletePaymentDetails$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$deletePaymentDetails$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$deletePaymentDetails$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository = this;
                ApiRequest apiRequestCreateDelete = this.apiRequestFactory.createDelete(INSTANCE.getConsumerPaymentDetailsUrl$payments_core_release(str2), options, MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)))));
                Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return StripeApiRepository.deletePaymentDetails_BWLJW6A$lambda$84$lambda$83((Result) obj2);
                    }
                };
                stripeApiRepository$deletePaymentDetails$1.label = 1;
                if (makeApiRequest$payments_core_release(apiRequestCreateDelete, function1, stripeApiRepository$deletePaymentDetails$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deletePaymentDetails_BWLJW6A$lambda$84$lambda$83(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.networking.StripeRepository
    /* renamed from: updatePaymentDetails-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8059updatePaymentDetailsBWLJW6A(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, Continuation<? super Result<ConsumerPaymentDetails>> continuation) {
        StripeApiRepository$updatePaymentDetails$1 stripeApiRepository$updatePaymentDetails$1;
        if (continuation instanceof StripeApiRepository$updatePaymentDetails$1) {
            stripeApiRepository$updatePaymentDetails$1 = (StripeApiRepository$updatePaymentDetails$1) continuation;
            if ((stripeApiRepository$updatePaymentDetails$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$updatePaymentDetails$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$updatePaymentDetails$1 = new StripeApiRepository$updatePaymentDetails$1(this, continuation);
            }
        }
        StripeApiRepository$updatePaymentDetails$1 stripeApiRepository$updatePaymentDetails$12 = stripeApiRepository$updatePaymentDetails$1;
        Object obj = stripeApiRepository$updatePaymentDetails$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$updatePaymentDetails$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ApiRequest apiRequestCreatePost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, INSTANCE.getConsumerPaymentDetailsUrl$payments_core_release(consumerPaymentDetailsUpdateParams.getId()), options, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("request_surface", LinkApiRepository.REQUEST_SURFACE), TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str)))), consumerPaymentDetailsUpdateParams.toParamMap()), false, 8, null);
        ConsumerPaymentDetailsJsonParser consumerPaymentDetailsJsonParser = ConsumerPaymentDetailsJsonParser.INSTANCE;
        stripeApiRepository$updatePaymentDetails$12.label = 1;
        Object objM8008fetchStripeModelResultBWLJW6A$default = m8008fetchStripeModelResultBWLJW6A$default(this, apiRequestCreatePost$default, consumerPaymentDetailsJsonParser, null, stripeApiRepository$updatePaymentDetails$12, 4, null);
        return objM8008fetchStripeModelResultBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8008fetchStripeModelResultBWLJW6A$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: retrieveElementsSession-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8011retrieveElementsSessionBWLJW6A(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, final PaymentAnalyticsEvent paymentAnalyticsEvent, Continuation<? super Result<ElementsSession>> continuation) {
        StripeApiRepository$retrieveElementsSession$2 stripeApiRepository$retrieveElementsSession$2;
        if (continuation instanceof StripeApiRepository$retrieveElementsSession$2) {
            stripeApiRepository$retrieveElementsSession$2 = (StripeApiRepository$retrieveElementsSession$2) continuation;
            if ((stripeApiRepository$retrieveElementsSession$2.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$retrieveElementsSession$2.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$retrieveElementsSession$2 = new StripeApiRepository$retrieveElementsSession$2(this, continuation);
            }
        }
        StripeApiRepository$retrieveElementsSession$2 stripeApiRepository$retrieveElementsSession$22 = stripeApiRepository$retrieveElementsSession$2;
        Object obj = stripeApiRepository$retrieveElementsSession$22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$retrieveElementsSession$22.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        if (options.getApiKeyIsUserKey()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Invalid API key")));
        }
        fireFraudDetectionDataRequest();
        ElementsSessionJsonParser elementsSessionJsonParser = new ElementsSessionJsonParser(elementsSessionParams, options.getApiKeyIsLiveMode(), null, 4, null);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("type", elementsSessionParams.getType());
        mapCreateMapBuilder.put("mobile_app_id", elementsSessionParams.getAppId());
        String clientSecret = elementsSessionParams.getClientSecret();
        if (clientSecret != null) {
            mapCreateMapBuilder.put("client_secret", clientSecret);
        }
        mapCreateMapBuilder.put("locale", elementsSessionParams.getLocale());
        String customerSessionClientSecret = elementsSessionParams.getCustomerSessionClientSecret();
        if (customerSessionClientSecret != null) {
            mapCreateMapBuilder.put("customer_session_client_secret", customerSessionClientSecret);
        }
        String legacyCustomerEphemeralKey = elementsSessionParams.getLegacyCustomerEphemeralKey();
        if (legacyCustomerEphemeralKey != null) {
            mapCreateMapBuilder.put("legacy_customer_ephemeral_key", legacyCustomerEphemeralKey);
        }
        List<String> externalPaymentMethods = elementsSessionParams.getExternalPaymentMethods();
        if (externalPaymentMethods.isEmpty()) {
            externalPaymentMethods = null;
        }
        if (externalPaymentMethods != null) {
            mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_EXTERNAL_PAYMENT_METHODS, externalPaymentMethods);
        }
        List<String> customPaymentMethods = elementsSessionParams.getCustomPaymentMethods();
        if (customPaymentMethods.isEmpty()) {
            customPaymentMethods = null;
        }
        if (customPaymentMethods != null) {
            mapCreateMapBuilder.put(PaymentSheetEvent.FIELD_CUSTOM_PAYMENT_METHODS, customPaymentMethods);
        }
        String mobileSessionId = elementsSessionParams.getMobileSessionId();
        if (mobileSessionId != null) {
            if (mobileSessionId.length() <= 0) {
                mobileSessionId = null;
            }
            if (mobileSessionId != null) {
                mapCreateMapBuilder.put(MobileSessionIdModuleKt.MOBILE_SESSION_ID, mobileSessionId);
            }
        }
        String savedPaymentMethodSelectionId = elementsSessionParams.getSavedPaymentMethodSelectionId();
        if (savedPaymentMethodSelectionId != null) {
            mapCreateMapBuilder.put("client_default_payment_method", savedPaymentMethodSelectionId);
        }
        ElementsSessionParams.SellerDetails sellerDetails = elementsSessionParams.getSellerDetails();
        if (sellerDetails != null) {
            mapCreateMapBuilder.putAll(sellerDetails.toQueryParams());
        }
        ElementsSessionParams.DeferredIntentType deferredIntentType = elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType ? (ElementsSessionParams.DeferredIntentType) elementsSessionParams : null;
        if (deferredIntentType != null) {
            mapCreateMapBuilder.putAll(deferredIntentType.getDeferredIntentParams().toQueryParams());
        }
        Map mapBuild = MapsKt.build(mapCreateMapBuilder);
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion2 = INSTANCE;
        Function1<? super Result<StripeResponse<String>>, Unit> function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return StripeApiRepository.retrieveElementsSession_BWLJW6A$lambda$100(paymentAnalyticsEvent, this, (Result) obj2);
            }
        };
        stripeApiRepository$retrieveElementsSession$22.label = 1;
        Object objM8007fetchStripeModelResultBWLJW6A = m8007fetchStripeModelResultBWLJW6A(ApiRequest.Factory.createGet$default(factory, companion2.getApiUrl("elements/sessions"), options, MapsKt.plus(mapBuild, companion2.createExpandParam(elementsSessionParams.getExpandFields())), false, 8, null), elementsSessionJsonParser, function1, stripeApiRepository$retrieveElementsSession$22);
        return objM8007fetchStripeModelResultBWLJW6A == coroutine_suspended ? coroutine_suspended : objM8007fetchStripeModelResultBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveElementsSession_BWLJW6A$lambda$100(PaymentAnalyticsEvent paymentAnalyticsEvent, StripeApiRepository stripeApiRepository, Result result) {
        if (paymentAnalyticsEvent != null) {
            stripeApiRepository.fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripeApiRepository.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
        }
        return Unit.INSTANCE;
    }

    private final void handleApiError(StripeResponse<String> response) throws CardException, InvalidRequestException, PermissionException, RateLimitException, APIException, AuthenticationException {
        RequestId requestId = response.getRequestId();
        String value = requestId != null ? requestId.getValue() : null;
        int code = response.getCode();
        StripeError stripeErrorWithLocalizedMessage = StripeErrorMappingKt.withLocalizedMessage(new StripeErrorJsonParser().parse(ResponseJsonKt.responseJson(response)), this.context);
        if (code != 429) {
            switch (code) {
                case 400:
                case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                    throw new InvalidRequestException(stripeErrorWithLocalizedMessage, value, code, null, null, 24, null);
                case TypedValues.CycleType.TYPE_CURVE_FIT /* 401 */:
                    throw new AuthenticationException(stripeErrorWithLocalizedMessage, value);
                case 402:
                    throw new CardException(stripeErrorWithLocalizedMessage, value);
                case TypedValues.CycleType.TYPE_ALPHA /* 403 */:
                    throw new PermissionException(stripeErrorWithLocalizedMessage, value);
                default:
                    throw new APIException(stripeErrorWithLocalizedMessage, value, code, null, null, 24, null);
            }
        }
        throw new RateLimitException(stripeErrorWithLocalizedMessage, value, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: fetchStripeModelResult-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ModelType extends StripeModel> Object m8007fetchStripeModelResultBWLJW6A(ApiRequest apiRequest, ModelJsonParser<? extends ModelType> modelJsonParser, Function1<? super Result<StripeResponse<String>>, Unit> function1, Continuation<? super Result<? extends ModelType>> continuation) {
        StripeApiRepository$fetchStripeModelResult$1 stripeApiRepository$fetchStripeModelResult$1;
        if (continuation instanceof StripeApiRepository$fetchStripeModelResult$1) {
            stripeApiRepository$fetchStripeModelResult$1 = (StripeApiRepository$fetchStripeModelResult$1) continuation;
            if ((stripeApiRepository$fetchStripeModelResult$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$fetchStripeModelResult$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$fetchStripeModelResult$1 = new StripeApiRepository$fetchStripeModelResult$1(this, continuation);
            }
        }
        Object objMakeApiRequest$payments_core_release = stripeApiRepository$fetchStripeModelResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$fetchStripeModelResult$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository = this;
                stripeApiRepository$fetchStripeModelResult$1.L$0 = modelJsonParser;
                stripeApiRepository$fetchStripeModelResult$1.label = 1;
                objMakeApiRequest$payments_core_release = makeApiRequest$payments_core_release(apiRequest, function1, stripeApiRepository$fetchStripeModelResult$1);
                if (objMakeApiRequest$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                modelJsonParser = (ModelJsonParser) stripeApiRepository$fetchStripeModelResult$1.L$0;
                ResultKt.throwOnFailure(objMakeApiRequest$payments_core_release);
            }
            StripeModel stripeModel = modelJsonParser.parse(ResponseJsonKt.responseJson((StripeResponse) objMakeApiRequest$payments_core_release));
            if (stripeModel != null) {
                return Result.m9118constructorimpl(stripeModel);
            }
            throw new APIException(null, null, 0, "Unable to parse response with " + modelJsonParser.getClass().getSimpleName(), null, 23, null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: fetchStripeModelResult-BWLJW6A$default, reason: not valid java name */
    static /* synthetic */ Object m8008fetchStripeModelResultBWLJW6A$default(StripeApiRepository stripeApiRepository, ApiRequest apiRequest, ModelJsonParser modelJsonParser, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return StripeApiRepository.fetchStripeModelResult_BWLJW6A$lambda$101((Result) obj2);
                }
            };
        }
        return stripeApiRepository.m8007fetchStripeModelResultBWLJW6A(apiRequest, modelJsonParser, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchStripeModelResult_BWLJW6A$lambda$101(Result result) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeApiRequest$payments_core_release(ApiRequest apiRequest, Function1<? super Result<StripeResponse<String>>, Unit> function1, Continuation<? super StripeResponse<String>> continuation) throws Throwable {
        StripeApiRepository$makeApiRequest$1 stripeApiRepository$makeApiRequest$1;
        DnsCacheData dnsCacheDataDisableDnsCache;
        StripeApiRepository stripeApiRepository;
        Object objExecuteRequest;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$makeApiRequest$1) {
            stripeApiRepository$makeApiRequest$1 = (StripeApiRepository$makeApiRequest$1) continuation;
            if ((stripeApiRepository$makeApiRequest$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$makeApiRequest$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$makeApiRequest$1 = new StripeApiRepository$makeApiRequest$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$makeApiRequest$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$makeApiRequest$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dnsCacheDataDisableDnsCache = disableDnsCache();
            try {
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository2 = this;
                stripeApiRepository$makeApiRequest$1.L$0 = this;
                stripeApiRepository$makeApiRequest$1.L$1 = apiRequest;
                stripeApiRepository$makeApiRequest$1.L$2 = function1;
                stripeApiRepository$makeApiRequest$1.L$3 = dnsCacheDataDisableDnsCache;
                stripeApiRepository$makeApiRequest$1.label = 1;
                objExecuteRequest = this.stripeNetworkClient.executeRequest(apiRequest, stripeApiRepository$makeApiRequest$1);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeApiRepository = this;
                objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
            } catch (Throwable th) {
                th = th;
                stripeApiRepository = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                function1.invoke(Result.m9117boximpl(objM9118constructorimpl));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DnsCacheData dnsCacheData = (DnsCacheData) stripeApiRepository$makeApiRequest$1.L$3;
            function1 = (Function1) stripeApiRepository$makeApiRequest$1.L$2;
            ApiRequest apiRequest2 = (ApiRequest) stripeApiRepository$makeApiRequest$1.L$1;
            StripeApiRepository stripeApiRepository3 = (StripeApiRepository) stripeApiRepository$makeApiRequest$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                dnsCacheDataDisableDnsCache = dnsCacheData;
                apiRequest = apiRequest2;
                stripeApiRepository = stripeApiRepository3;
                objExecuteRequest = obj;
                try {
                    objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    function1.invoke(Result.m9117boximpl(objM9118constructorimpl));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                }
            } catch (Throwable th3) {
                dnsCacheDataDisableDnsCache = dnsCacheData;
                apiRequest = apiRequest2;
                stripeApiRepository = stripeApiRepository3;
                th = th3;
                Result.Companion companion222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                function1.invoke(Result.m9117boximpl(objM9118constructorimpl));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        function1.invoke(Result.m9117boximpl(objM9118constructorimpl));
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            if (thM9121exceptionOrNullimpl instanceof IOException) {
                throw APIConnectionException.INSTANCE.create((IOException) thM9121exceptionOrNullimpl, apiRequest.getBaseUrl());
            }
            throw thM9121exceptionOrNullimpl;
        }
        StripeResponse<String> stripeResponse = (StripeResponse) objM9118constructorimpl;
        if (stripeResponse.getIsError()) {
            stripeApiRepository.handleApiError(stripeResponse);
        }
        stripeApiRepository.resetDnsCache(dnsCacheDataDisableDnsCache);
        return stripeResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object makeFileUploadRequest$payments_core_release(FileUploadRequest fileUploadRequest, Function1<? super RequestId, Unit> function1, Continuation<? super StripeResponse<String>> continuation) throws Throwable {
        StripeApiRepository$makeFileUploadRequest$1 stripeApiRepository$makeFileUploadRequest$1;
        DnsCacheData dnsCacheDataDisableDnsCache;
        StripeApiRepository stripeApiRepository;
        Object objExecuteRequest;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof StripeApiRepository$makeFileUploadRequest$1) {
            stripeApiRepository$makeFileUploadRequest$1 = (StripeApiRepository$makeFileUploadRequest$1) continuation;
            if ((stripeApiRepository$makeFileUploadRequest$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$makeFileUploadRequest$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$makeFileUploadRequest$1 = new StripeApiRepository$makeFileUploadRequest$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$makeFileUploadRequest$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$makeFileUploadRequest$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            dnsCacheDataDisableDnsCache = disableDnsCache();
            try {
                Result.Companion companion = Result.INSTANCE;
                StripeApiRepository stripeApiRepository2 = this;
                stripeApiRepository$makeFileUploadRequest$1.L$0 = this;
                stripeApiRepository$makeFileUploadRequest$1.L$1 = fileUploadRequest;
                stripeApiRepository$makeFileUploadRequest$1.L$2 = function1;
                stripeApiRepository$makeFileUploadRequest$1.L$3 = dnsCacheDataDisableDnsCache;
                stripeApiRepository$makeFileUploadRequest$1.label = 1;
                objExecuteRequest = this.stripeNetworkClient.executeRequest(fileUploadRequest, stripeApiRepository$makeFileUploadRequest$1);
                if (objExecuteRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeApiRepository = this;
                objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
            } catch (Throwable th) {
                th = th;
                stripeApiRepository = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                StripeResponse stripeResponse = (StripeResponse) (!Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
                function1.invoke(stripeResponse != null ? stripeResponse.getRequestId() : null);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DnsCacheData dnsCacheData = (DnsCacheData) stripeApiRepository$makeFileUploadRequest$1.L$3;
            function1 = (Function1) stripeApiRepository$makeFileUploadRequest$1.L$2;
            FileUploadRequest fileUploadRequest2 = (FileUploadRequest) stripeApiRepository$makeFileUploadRequest$1.L$1;
            StripeApiRepository stripeApiRepository3 = (StripeApiRepository) stripeApiRepository$makeFileUploadRequest$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                dnsCacheDataDisableDnsCache = dnsCacheData;
                fileUploadRequest = fileUploadRequest2;
                stripeApiRepository = stripeApiRepository3;
                objExecuteRequest = obj;
                try {
                    objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objExecuteRequest);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    StripeResponse stripeResponse2 = (StripeResponse) (!Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
                    function1.invoke(stripeResponse2 != null ? stripeResponse2.getRequestId() : null);
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                }
            } catch (Throwable th3) {
                dnsCacheDataDisableDnsCache = dnsCacheData;
                fileUploadRequest = fileUploadRequest2;
                stripeApiRepository = stripeApiRepository3;
                th = th3;
                Result.Companion companion222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                StripeResponse stripeResponse22 = (StripeResponse) (!Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
                function1.invoke(stripeResponse22 != null ? stripeResponse22.getRequestId() : null);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        StripeResponse stripeResponse222 = (StripeResponse) (!Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
        function1.invoke(stripeResponse222 != null ? stripeResponse222.getRequestId() : null);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            if (thM9121exceptionOrNullimpl instanceof IOException) {
                throw APIConnectionException.INSTANCE.create((IOException) thM9121exceptionOrNullimpl, fileUploadRequest.getUrl());
            }
            throw thM9121exceptionOrNullimpl;
        }
        StripeResponse<String> stripeResponse3 = (StripeResponse) objM9118constructorimpl;
        if (stripeResponse3.getIsError()) {
            stripeApiRepository.handleApiError(stripeResponse3);
        }
        stripeApiRepository.resetDnsCache(dnsCacheDataDisableDnsCache);
        return stripeResponse3;
    }

    private final DnsCacheData disableDnsCache() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            StripeApiRepository stripeApiRepository = this;
            String property = Security.getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, AppEventsConstants.EVENT_PARAM_VALUE_NO);
            objM9118constructorimpl = Result.m9118constructorimpl(new DnsCacheData.Success(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        DnsCacheData.Failure failure = DnsCacheData.Failure.INSTANCE;
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = failure;
        }
        return (DnsCacheData) objM9118constructorimpl;
    }

    private final void resetDnsCache(DnsCacheData dnsCacheData) {
        if (dnsCacheData instanceof DnsCacheData.Success) {
            String originalDnsCacheTtl = ((DnsCacheData.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
        }
    }

    private final void fireFraudDetectionDataRequest() {
        this.fraudDetectionDataRepository.refresh();
    }

    private final void fireAnalyticsRequest(PaymentAnalyticsEvent event) {
        fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, event, null, null, null, null, null, 62, null));
    }

    public final void fireAnalyticsRequest$payments_core_release(AnalyticsRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.analyticsRequestExecutor.executeAsync(params);
    }

    private final Map<String, Object> createClientSecretParam(String clientSecret, List<String> expandFields) {
        return MapsKt.plus(MapsKt.mapOf(TuplesKt.to("client_secret", clientSecret)), INSTANCE.createExpandParam(expandFields));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Pair buildPaymentUserAgentPair$default(StripeApiRepository stripeApiRepository, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt.emptySet();
        }
        return stripeApiRepository.buildPaymentUserAgentPair(set);
    }

    private final Pair<String, String> buildPaymentUserAgentPair(Set<String> attribution) {
        return TuplesKt.to(PAYMENT_USER_AGENT, buildPaymentUserAgent(attribution));
    }

    @Override // com.stripe.android.networking.StripeRepository
    public String buildPaymentUserAgent(Set<String> attribution) {
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        return CollectionsKt.joinToString$default(SetsKt.plus(SetsKt.plus(SetsKt.setOf("stripe-android/21.22.2"), (Iterable) this.productUsageTokens), (Iterable) attribution), ";", null, null, 0, null, null, 62, null);
    }

    static /* synthetic */ Map maybeAddPaymentUserAgent$default(StripeApiRepository stripeApiRepository, Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams, int i, Object obj) {
        if ((i & 4) != 0) {
            sourceParams = null;
        }
        return stripeApiRepository.maybeAddPaymentUserAgent(map, paymentMethodCreateParams, sourceParams);
    }

    private final Map<String, Object> maybeAddPaymentUserAgent(Map<String, ? extends Object> params, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Set<String> setEmptySet;
        Set setEmptySet2;
        Object obj = params.get("payment_method_data");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            if (paymentMethodCreateParams == null || (setEmptySet2 = paymentMethodCreateParams.getAttribution()) == null) {
                setEmptySet2 = SetsKt.emptySet();
            }
            Map<String, Object> mapPlus = MapsKt.plus(params, TuplesKt.to("payment_method_data", MapsKt.plus(map, buildPaymentUserAgentPair(setEmptySet2))));
            if (mapPlus != null) {
                return mapPlus;
            }
        }
        Object obj2 = params.get(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA);
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 == null) {
            return params;
        }
        if (sourceParams == null || (setEmptySet = sourceParams.getAttribution$payments_core_release()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        return MapsKt.plus(params, TuplesKt.to(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, MapsKt.plus(map2, buildPaymentUserAgentPair(setEmptySet))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: maybeForDashboard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8009maybeForDashboard0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<ConfirmPaymentIntentParams>> continuation) {
        StripeApiRepository$maybeForDashboard$1 stripeApiRepository$maybeForDashboard$1;
        Object objMo8025createPaymentMethod0E7RQCE;
        if (continuation instanceof StripeApiRepository$maybeForDashboard$1) {
            stripeApiRepository$maybeForDashboard$1 = (StripeApiRepository$maybeForDashboard$1) continuation;
            if ((stripeApiRepository$maybeForDashboard$1.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$maybeForDashboard$1.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$maybeForDashboard$1 = new StripeApiRepository$maybeForDashboard$1(this, continuation);
            }
        }
        Object obj = stripeApiRepository$maybeForDashboard$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$maybeForDashboard$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!options.getApiKeyIsUserKey() || confirmPaymentIntentParams.getPaymentMethodCreateParams() == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(confirmPaymentIntentParams);
            }
            PaymentMethodCreateParams paymentMethodCreateParams = confirmPaymentIntentParams.getPaymentMethodCreateParams();
            stripeApiRepository$maybeForDashboard$1.L$0 = confirmPaymentIntentParams;
            stripeApiRepository$maybeForDashboard$1.label = 1;
            objMo8025createPaymentMethod0E7RQCE = mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, stripeApiRepository$maybeForDashboard$1);
            if (objMo8025createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmPaymentIntentParams = (ConfirmPaymentIntentParams) stripeApiRepository$maybeForDashboard$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8025createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objMo8025createPaymentMethod0E7RQCE)) {
            return Result.m9118constructorimpl(objMo8025createPaymentMethod0E7RQCE);
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            ConfirmPaymentIntentParams.Companion companion3 = ConfirmPaymentIntentParams.INSTANCE;
            String clientSecret = confirmPaymentIntentParams.getClientSecret();
            String str = ((PaymentMethod) objMo8025createPaymentMethod0E7RQCE).id;
            Intrinsics.checkNotNull(str);
            return Result.m9118constructorimpl(companion3.createForDashboard$payments_core_release(clientSecret, str, confirmPaymentIntentParams.getPaymentMethodOptions()));
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: maybeForDashboard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8010maybeForDashboard0E7RQCE(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, Continuation<? super Result<ConfirmSetupIntentParams>> continuation) {
        StripeApiRepository$maybeForDashboard$3 stripeApiRepository$maybeForDashboard$3;
        Object objMo8025createPaymentMethod0E7RQCE;
        if (continuation instanceof StripeApiRepository$maybeForDashboard$3) {
            stripeApiRepository$maybeForDashboard$3 = (StripeApiRepository$maybeForDashboard$3) continuation;
            if ((stripeApiRepository$maybeForDashboard$3.label & Integer.MIN_VALUE) != 0) {
                stripeApiRepository$maybeForDashboard$3.label -= Integer.MIN_VALUE;
            } else {
                stripeApiRepository$maybeForDashboard$3 = new StripeApiRepository$maybeForDashboard$3(this, continuation);
            }
        }
        Object obj = stripeApiRepository$maybeForDashboard$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripeApiRepository$maybeForDashboard$3.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!options.getApiKeyIsUserKey() || confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release() == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(confirmSetupIntentParams);
            }
            PaymentMethodCreateParams paymentMethodCreateParams$payments_core_release = confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release();
            stripeApiRepository$maybeForDashboard$3.L$0 = confirmSetupIntentParams;
            stripeApiRepository$maybeForDashboard$3.label = 1;
            objMo8025createPaymentMethod0E7RQCE = mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParams$payments_core_release, options, stripeApiRepository$maybeForDashboard$3);
            if (objMo8025createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmSetupIntentParams = (ConfirmSetupIntentParams) stripeApiRepository$maybeForDashboard$3.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8025createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objMo8025createPaymentMethod0E7RQCE)) {
            return Result.m9118constructorimpl(objMo8025createPaymentMethod0E7RQCE);
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            ConfirmSetupIntentParams.Companion companion3 = ConfirmSetupIntentParams.INSTANCE;
            String clientSecret = confirmSetupIntentParams.getClientSecret();
            String str = ((PaymentMethod) objMo8025createPaymentMethod0E7RQCE).id;
            Intrinsics.checkNotNull(str);
            return Result.m9118constructorimpl(companion3.createForDashboard$payments_core_release(clientSecret, str, confirmSetupIntentParams.getPaymentMethodOptions()));
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final String getErrorMessage(Object obj) {
        Object objM9118constructorimpl;
        StripeResponse<String> stripeResponse = (StripeResponse) (Result.m9124isFailureimpl(obj) ? null : obj);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj);
        if (thM9121exceptionOrNullimpl != null) {
            return ExceptionUtilsKt.getSafeAnalyticsMessage(thM9121exceptionOrNullimpl);
        }
        if (stripeResponse == null || !stripeResponse.getIsError()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            handleApiError(stripeResponse);
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl2 != null) {
            return ExceptionUtilsKt.getSafeAnalyticsMessage(thM9121exceptionOrNullimpl2);
        }
        return null;
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "<init>", "()V", "Success", "Failure", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class DnsCacheData {
        public /* synthetic */ DnsCacheData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DnsCacheData() {
        }

        /* compiled from: StripeApiRepository.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "originalDnsCacheTtl", "", "<init>", "(Ljava/lang/String;)V", "getOriginalDnsCacheTtl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends DnsCacheData {
            public static final int $stable = 0;
            private final String originalDnsCacheTtl;

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.originalDnsCacheTtl;
                }
                return success.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public final Success copy(String originalDnsCacheTtl) {
                return new Success(originalDnsCacheTtl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.originalDnsCacheTtl, ((Success) other).originalDnsCacheTtl);
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.originalDnsCacheTtl + ")";
            }

            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public Success(String str) {
                super(null);
                this.originalDnsCacheTtl = str;
            }
        }

        /* compiled from: StripeApiRepository.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failure extends DnsCacheData {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2054089437;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
                super(null);
            }
        }
    }

    /* compiled from: StripeApiRepository.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\bO\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0015\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0015J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001¢\u0006\u0002\b/J\u0015\u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0001¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001¢\u0006\u0002\b6J\u001d\u00107\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0001¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0001¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005H\u0001¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0005H\u0001¢\u0006\u0002\bCJ\u001d\u0010D\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0001¢\u0006\u0002\bFJ\u001d\u0010G\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0001¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0001¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005H\u0001¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0005H\u0001¢\u0006\u0002\bPJ\u0015\u0010Q\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0000¢\u0006\u0002\bRJ\u0015\u0010S\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0001¢\u0006\u0002\bTJ)\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010X\"\u00020\u0001H\u0002¢\u0006\u0002\u0010YJ\u0010\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0002J(\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050]0\b2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050]H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006_"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$Companion;", "", "<init>", "()V", "DNS_CACHE_TTL_PROPERTY_NAME", "", "PAYMENT_USER_AGENT", "createVerificationParam", "", "verificationId", "userOneTimeCode", "tokensUrl", "getTokensUrl$payments_core_release", "()Ljava/lang/String;", "sourcesUrl", "getSourcesUrl$payments_core_release", "paymentMethodsUrl", "getPaymentMethodsUrl$payments_core_release", "logoutConsumerUrl", "getLogoutConsumerUrl$payments_core_release", "consumerPaymentDetailsUrl", "getConsumerPaymentDetailsUrl$payments_core_release", "listConsumerPaymentDetailsUrl", "getListConsumerPaymentDetailsUrl$payments_core_release", "listShippingAddresses", "getListShippingAddresses$payments_core_release", "sharePaymentDetailsUrl", "getSharePaymentDetailsUrl$payments_core_release", "deferredFinancialConnectionsSessionUrl", "getDeferredFinancialConnectionsSessionUrl$payments_core_release", "mobileCardElementConfigUrl", "getMobileCardElementConfigUrl$payments_core_release", "getConsumerPaymentDetailsUrl", "paymentDetailsId", "getRetrievePaymentIntentUrl", "paymentIntentId", "getRetrievePaymentIntentUrl$payments_core_release", "getRefreshPaymentIntentUrl", "getRefreshPaymentIntentUrl$payments_core_release", "getRefreshSetupIntentUrl", "getRefreshSetupIntentUrl$payments_core_release", "getConfirmPaymentIntentUrl", "getConfirmPaymentIntentUrl$payments_core_release", "getCancelPaymentIntentSourceUrl", "getCancelPaymentIntentSourceUrl$payments_core_release", "getRetrieveSetupIntentUrl", "setupIntentId", "getRetrieveSetupIntentUrl$payments_core_release", "getConfirmSetupIntentUrl", "getConfirmSetupIntentUrl$payments_core_release", "getCancelSetupIntentSourceUrl", "getCancelSetupIntentSourceUrl$payments_core_release", "getAddCustomerSourceUrl", "customerId", "getAddCustomerSourceUrl$payments_core_release", "getDeleteCustomerSourceUrl", "sourceId", "getDeleteCustomerSourceUrl$payments_core_release", "getAttachPaymentMethodUrl", "paymentMethodId", "getAttachPaymentMethodUrl$payments_core_release", "getRetrieveCustomerUrl", "getRetrieveCustomerUrl$payments_core_release", "getRetrieveSourceApiUrl", "getRetrieveSourceApiUrl$payments_core_release", "getRetrieveTokenApiUrl", "tokenId", "getRetrieveTokenApiUrl$payments_core_release", "getAttachFinancialConnectionsSessionToPaymentIntentUrl", "financialConnectionsSessionId", "getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release", "getAttachFinancialConnectionsSessionToSetupIntentUrl", "getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release", "getVerifyMicrodepositsOnPaymentIntentUrl", "clientSecret", "getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release", "getVerifyMicrodepositsOnSetupIntentUrl", "getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release", "getIssuingCardPinUrl", "cardId", "getIssuingCardPinUrl$payments_core_release", "getPaymentMethodUrl", "getPaymentMethodUrl$payments_core_release", "getSetDefaultPaymentMethodUrl", "getSetDefaultPaymentMethodUrl$payments_core_release", "getApiUrl", "path", CardScanActivity.ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getEdgeUrl", "getMerchantUiUrl", "createExpandParam", "", "expandFields", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> createVerificationParam(String verificationId, String userOneTimeCode) {
            return MapsKt.mapOf(TuplesKt.to("id", verificationId), TuplesKt.to("one_time_code", userOneTimeCode));
        }

        public final /* synthetic */ String getTokensUrl$payments_core_release() {
            return getApiUrl("tokens");
        }

        public final /* synthetic */ String getSourcesUrl$payments_core_release() {
            return getApiUrl("sources");
        }

        public final /* synthetic */ String getPaymentMethodsUrl$payments_core_release() {
            return getApiUrl("payment_methods");
        }

        public final /* synthetic */ String getLogoutConsumerUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/log_out");
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details");
        }

        public final /* synthetic */ String getListConsumerPaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details/list");
        }

        public final /* synthetic */ String getListShippingAddresses$payments_core_release() {
            return getApiUrl("consumers/shipping_addresses/list");
        }

        public final /* synthetic */ String getSharePaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details/share");
        }

        public final /* synthetic */ String getDeferredFinancialConnectionsSessionUrl$payments_core_release() {
            return getApiUrl("connections/link_account_sessions_for_deferred_payment");
        }

        public final String getMobileCardElementConfigUrl$payments_core_release() {
            return getMerchantUiUrl("mobile-card-element-config");
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release(String paymentDetailsId) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            return getApiUrl("consumers/payment_details/" + paymentDetailsId);
        }

        public final /* synthetic */ String getRetrievePaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String getRefreshPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getRefreshSetupIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getConfirmPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String getCancelPaymentIntentSourceUrl$payments_core_release(String paymentIntentId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String getConfirmSetupIntentUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String getCancelSetupIntentSourceUrl$payments_core_release(String setupIntentId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String getAddCustomerSourceUrl$payments_core_release(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return getApiUrl("customers/%s/sources", customerId);
        }

        public final /* synthetic */ String getDeleteCustomerSourceUrl$payments_core_release(String customerId, String sourceId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return getApiUrl("customers/%s/sources/%s", customerId, sourceId);
        }

        public final /* synthetic */ String getAttachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            return getApiUrl("payment_methods/%s/attach", paymentMethodId);
        }

        public final /* synthetic */ String getRetrieveCustomerUrl$payments_core_release(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return getApiUrl("customers/%s", customerId);
        }

        public final /* synthetic */ String getRetrieveSourceApiUrl$payments_core_release(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return getApiUrl("sources/%s", sourceId);
        }

        public final /* synthetic */ String getRetrieveTokenApiUrl$payments_core_release(String tokenId) {
            Intrinsics.checkNotNullParameter(tokenId, "tokenId");
            return getApiUrl("tokens/%s", tokenId);
        }

        public final /* synthetic */ String getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(String paymentIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(String setupIntentId, String financialConnectionsSessionId) {
            Intrinsics.checkNotNullParameter(setupIntentId, "setupIntentId");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return getApiUrl("payment_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return getApiUrl("setup_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String getIssuingCardPinUrl$payments_core_release(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return getApiUrl("issuing/cards/%s/pin", cardId);
        }

        public final /* synthetic */ String getPaymentMethodUrl$payments_core_release(String paymentMethodId) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            return getApiUrl("payment_methods/" + paymentMethodId);
        }

        public final String getSetDefaultPaymentMethodUrl$payments_core_release(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            return getApiUrl("elements/customers/" + customerId + "/set_default_payment_method");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String path, Object... args) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ENGLISH;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(locale, path, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return getApiUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String path) {
            return "https://api.stripe.com/v1/" + path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEdgeUrl(String path) {
            return "https://api.stripe.com/edge-internal/" + path;
        }

        private final String getMerchantUiUrl(String path) {
            return "https://merchant-ui-api.stripe.com/elements/" + path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, List<String>> createExpandParam(List<String> expandFields) {
            if (expandFields.isEmpty()) {
                expandFields = null;
            }
            Map<String, List<String>> mapMapOf = expandFields != null ? MapsKt.mapOf(TuplesKt.to("expand", expandFields)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }
    }
}
