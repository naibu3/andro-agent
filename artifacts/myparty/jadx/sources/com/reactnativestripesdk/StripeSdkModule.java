package com.reactnativestripesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.reactnativestripesdk.CollectBankAccountLauncherFragment;
import com.reactnativestripesdk.FinancialConnectionsSheetFragment;
import com.reactnativestripesdk.GooglePayLauncherFragment;
import com.reactnativestripesdk.GooglePayPaymentMethodLauncherFragment;
import com.reactnativestripesdk.GooglePayRequestHelper;
import com.reactnativestripesdk.PaymentLauncherFragment;
import com.reactnativestripesdk.PaymentSheetFragment;
import com.reactnativestripesdk.StripeAbstractComposeView;
import com.reactnativestripesdk.addresssheet.AddressLauncherFragment;
import com.reactnativestripesdk.customersheet.CustomerSheetFragment;
import com.reactnativestripesdk.pushprovisioning.PushProvisioningProxy;
import com.reactnativestripesdk.utils.ConfirmPaymentErrorType;
import com.reactnativestripesdk.utils.CreateTokenErrorType;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.GooglePayErrorType;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Token;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StripeSdkModule.kt */
@ReactModule(name = "StripeSdk")
@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u00039\u0092\u0001\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0096\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u0010\u0010B\u001a\u00020<2\u0006\u0010C\u001a\u00020&H\u0002J \u0010D\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150E0EH\u0015J\u0018\u0010F\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010H\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010K\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010L\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001c\u0010+\u001a\u00020<2\b\u0010N\u001a\u0004\u0018\u00010&2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0017J \u0010O\u001a\u00020<2\u0006\u0010@\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010P\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010Q\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010R\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010S\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0002J\u0018\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\"\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u00020\u00152\b\u0010X\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\"\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020\u00152\b\u0010X\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J,\u0010[\u001a\u00020<2\u0006\u0010W\u001a\u00020\u00152\b\u0010C\u001a\u0004\u0018\u00010&2\b\u0010J\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010^\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010_\u001a\u00020<2\u0006\u0010Z\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010`\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010a\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010c\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010e\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010f\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010g\u001a\u00020<2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J(\u0010h\u001a\u00020<2\u0006\u0010b\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010i\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010j\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010k\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010l\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010m\u001a\u00020<2\u0006\u0010C\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010n\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010o\u001a\u00020<2\u0006\u0010p\u001a\u00020q2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010r\u001a\u00020<2\u0006\u0010s\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010t\u001a\u00020<2\u0006\u0010s\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0010\u0010u\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010v\u001a\u00020<2\b\u0010w\u001a\u0004\u0018\u00010\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010x\u001a\u00020<2\u0006\u0010]\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0017J \u0010y\u001a\u00020<2\u0006\u0010z\u001a\u00020&2\u0006\u0010{\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010|\u001a\u00020<2\u0006\u0010}\u001a\u00020~2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0018\u0010\u007f\u001a\u00020<2\u0006\u0010z\u001a\u00020&2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u0019\u0010\u0080\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020~2\u0006\u0010G\u001a\u00020\u0019H\u0017J\u001a\u0010\u0081\u0001\u001a\u00020<2\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0016J5\u0010\u0084\u0001\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0013\u0010\u0089\u0001\u001a\u00020<2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J4\u0010\u008a\u0001\u001a\u00020<2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010q2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010q2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010q2\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0016J\u0016\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\b\u0010G\u001a\u0004\u0018\u00010\u0019H\u0002J\t\u0010\u0094\u0001\u001a\u00020<H\u0002J\t\u0010\u0095\u0001\u001a\u00020<H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0015058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0004\n\u0002\u0010:R\u000f\u0010\u0090\u0001\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/reactnativestripesdk/StripeSdkModule;", "Lcom/reactnativestripesdk/NativeStripeSdkModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cardFieldView", "Lcom/reactnativestripesdk/CardFieldView;", "getCardFieldView", "()Lcom/reactnativestripesdk/CardFieldView;", "setCardFieldView", "(Lcom/reactnativestripesdk/CardFieldView;)V", "cardFormView", "Lcom/reactnativestripesdk/CardFormView;", "getCardFormView", "()Lcom/reactnativestripesdk/CardFormView;", "setCardFormView", "(Lcom/reactnativestripesdk/CardFormView;)V", "stripe", "Lcom/stripe/android/Stripe;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "urlScheme", "createPlatformPayPaymentMethodPromise", "Lcom/facebook/react/bridge/Promise;", "platformPayUsesDeprecatedTokenFlow", "", "paymentSheetFragment", "Lcom/reactnativestripesdk/PaymentSheetFragment;", "paymentLauncherFragment", "Lcom/reactnativestripesdk/PaymentLauncherFragment;", "collectBankAccountLauncherFragment", "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;", "customerSheetFragment", "Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;", "embeddedIntentCreationCallback", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/facebook/react/bridge/ReadableMap;", "getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release", "()Lkotlinx/coroutines/CompletableDeferred;", "setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release", "(Lkotlinx/coroutines/CompletableDeferred;)V", "customPaymentMethodResultCallback", "getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release", "setCustomPaymentMethodResultCallback$stripe_stripe_react_native_release", "composeCompatView", "Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;", "getComposeCompatView$stripe_stripe_react_native_release", "()Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;", "setComposeCompatView$stripe_stripe_react_native_release", "(Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;)V", "allStripeFragmentTags", "", "getAllStripeFragmentTags", "()Ljava/util/List;", "mActivityEventListener", "com/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1", "Lcom/reactnativestripesdk/StripeSdkModule$mActivityEventListener$1;", "dispatchActivityResultsToFragments", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "configure3dSecure", NativeProtocol.WEB_DIALOG_PARAMS, "getTypedExportedConstants", "", "initialise", BaseJavaModule.METHOD_TYPE_PROMISE, "initPaymentSheet", "presentPaymentSheet", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "confirmPaymentSheetPayment", "resetPaymentSheetCustomer", "intentCreationCallback", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "createPaymentMethod", "createToken", "createTokenFromPii", "createTokenFromBankAccount", "createTokenFromCard", "createTokenForCVCUpdate", "cvc", "handleNextAction", "paymentIntentClientSecret", "returnUrl", "handleNextActionForSetup", "setupIntentClientSecret", "confirmPayment", "retrievePaymentIntent", "clientSecret", "retrieveSetupIntent", "confirmSetupIntent", "isPlatformPaySupported", "confirmPlatformPay", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_PAYMENT_INTENT, "createPlatformPayPaymentMethod", "usesDeprecatedTokenFlow", "canAddCardToWallet", "isCardInWallet", "collectBankAccount", "verifyMicrodeposits", "collectBankAccountToken", "collectFinancialConnectionsAccounts", "initCustomerSheet", "customerAdapterOverrides", "presentCustomerSheet", "retrieveCustomerSheetPaymentOptionSelection", "customerAdapterFetchPaymentMethodsCallback", "paymentMethodJsonObjects", "Lcom/facebook/react/bridge/ReadableArray;", "customerAdapterAttachPaymentMethodCallback", "paymentMethodJson", "customerAdapterDetachPaymentMethodCallback", "customerAdapterSetSelectedPaymentOptionCallback", "customerAdapterFetchSelectedPaymentOptionCallback", "paymentOption", "customerAdapterSetupIntentClientSecretForCustomerAttachCallback", "createEmbeddedPaymentElement", "intentConfig", "configuration", "confirmEmbeddedPaymentElement", "viewTag", "", "updateEmbeddedPaymentElement", "clearEmbeddedPaymentOption", "handleURLCallback", "url", "openApplePaySetup", "configureOrderTracking", "orderTypeIdentifier", "orderIdentifier", "webServiceUrl", "authenticationToken", "dismissPlatformPay", "updatePlatformPaySheet", "summaryItems", "shippingMethods", "errors", "getCurrentActivityOrResolveWithError", "Landroidx/fragment/app/FragmentActivity;", "isRecreatingActivities", "activityLifecycleCallbacks", "com/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1", "Lcom/reactnativestripesdk/StripeSdkModule$activityLifecycleCallbacks$1;", "preventActivityRecreation", "setupComposeCompatView", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeSdkModule extends NativeStripeSdkModuleSpec {
    public static final String NAME = "StripeSdk";
    private final StripeSdkModule$activityLifecycleCallbacks$1 activityLifecycleCallbacks;
    private CardFieldView cardFieldView;
    private CardFormView cardFormView;
    private CollectBankAccountLauncherFragment collectBankAccountLauncherFragment;
    private StripeAbstractComposeView.CompatView composeCompatView;
    private Promise createPlatformPayPaymentMethodPromise;
    private CompletableDeferred<ReadableMap> customPaymentMethodResultCallback;
    private CustomerSheetFragment customerSheetFragment;
    private CompletableDeferred<ReadableMap> embeddedIntentCreationCallback;
    private boolean isRecreatingActivities;
    private final StripeSdkModule$mActivityEventListener$1 mActivityEventListener;
    private PaymentLauncherFragment paymentLauncherFragment;
    private PaymentSheetFragment paymentSheetFragment;
    private boolean platformPayUsesDeprecatedTokenFlow;
    private String publishableKey;
    private Stripe stripe;
    private String stripeAccountId;
    private String urlScheme;
    public static final int $stable = 8;

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void clearEmbeddedPaymentOption(double viewTag, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    public void configureOrderTracking(String orderTypeIdentifier, String orderIdentifier, String webServiceUrl, String authenticationToken, Promise promise) {
        Intrinsics.checkNotNullParameter(orderTypeIdentifier, "orderTypeIdentifier");
        Intrinsics.checkNotNullParameter(orderIdentifier, "orderIdentifier");
        Intrinsics.checkNotNullParameter(webServiceUrl, "webServiceUrl");
        Intrinsics.checkNotNullParameter(authenticationToken, "authenticationToken");
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void confirmEmbeddedPaymentElement(double viewTag, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void createEmbeddedPaymentElement(ReadableMap intentConfig, ReadableMap configuration, Promise promise) {
        Intrinsics.checkNotNullParameter(intentConfig, "intentConfig");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    public void dismissPlatformPay(Promise promise) {
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    public void handleURLCallback(String url, Promise promise) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    public void openApplePaySetup(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void updateEmbeddedPaymentElement(ReadableMap intentConfig, Promise promise) {
        Intrinsics.checkNotNullParameter(intentConfig, "intentConfig");
        Intrinsics.checkNotNullParameter(promise, "promise");
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    public void updatePlatformPaySheet(ReadableArray summaryItems, ReadableArray shippingMethods, ReadableArray errors, Promise promise) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.reactnativestripesdk.StripeSdkModule$mActivityEventListener$1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.reactnativestripesdk.StripeSdkModule$activityLifecycleCallbacks$1] */
    public StripeSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.embeddedIntentCreationCallback = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.customPaymentMethodResultCallback = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        ?? r0 = new BaseActivityEventListener() { // from class: com.reactnativestripesdk.StripeSdkModule$mActivityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) throws JSONException {
                Stripe stripe;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.this$0.stripe != null) {
                    if (requestCode == 414243) {
                        Promise promise = this.this$0.createPlatformPayPaymentMethodPromise;
                        if (promise != null) {
                            StripeSdkModule stripeSdkModule = this.this$0;
                            GooglePayRequestHelper.Companion companion = GooglePayRequestHelper.INSTANCE;
                            Stripe stripe2 = stripeSdkModule.stripe;
                            if (stripe2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("stripe");
                                stripe = null;
                            } else {
                                stripe = stripe2;
                            }
                            companion.handleGooglePaymentMethodResult$stripe_stripe_react_native_release(resultCode, data, stripe, stripeSdkModule.platformPayUsesDeprecatedTokenFlow, promise);
                            stripeSdkModule.createPlatformPayPaymentMethodPromise = null;
                            return;
                        }
                        Log.d("StripeReactNative", "No promise was found, Google Pay result went unhandled,");
                        return;
                    }
                    this.this$0.dispatchActivityResultsToFragments(requestCode, resultCode, data);
                }
            }
        };
        this.mActivityEventListener = r0;
        reactContext.addActivityEventListener((ActivityEventListener) r0);
        this.activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.reactnativestripesdk.StripeSdkModule$activityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (bundle != null) {
                    this.this$0.isRecreatingActivities = true;
                }
                if (this.this$0.isRecreatingActivities) {
                    String name = activity.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt.startsWith$default(name, com.stripe.android.BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                        activity.finish();
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.isRecreatingActivities = false;
            }
        };
    }

    public final CardFieldView getCardFieldView() {
        return this.cardFieldView;
    }

    public final void setCardFieldView(CardFieldView cardFieldView) {
        this.cardFieldView = cardFieldView;
    }

    public final CardFormView getCardFormView() {
        return this.cardFormView;
    }

    public final void setCardFormView(CardFormView cardFormView) {
        this.cardFormView = cardFormView;
    }

    public final CompletableDeferred<ReadableMap> getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release() {
        return this.embeddedIntentCreationCallback;
    }

    public final void setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release(CompletableDeferred<ReadableMap> completableDeferred) {
        Intrinsics.checkNotNullParameter(completableDeferred, "<set-?>");
        this.embeddedIntentCreationCallback = completableDeferred;
    }

    public final CompletableDeferred<ReadableMap> getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release() {
        return this.customPaymentMethodResultCallback;
    }

    public final void setCustomPaymentMethodResultCallback$stripe_stripe_react_native_release(CompletableDeferred<ReadableMap> completableDeferred) {
        Intrinsics.checkNotNullParameter(completableDeferred, "<set-?>");
        this.customPaymentMethodResultCallback = completableDeferred;
    }

    /* renamed from: getComposeCompatView$stripe_stripe_react_native_release, reason: from getter */
    public final StripeAbstractComposeView.CompatView getComposeCompatView() {
        return this.composeCompatView;
    }

    public final void setComposeCompatView$stripe_stripe_react_native_release(StripeAbstractComposeView.CompatView compatView) {
        this.composeCompatView = compatView;
    }

    private final List<String> getAllStripeFragmentTags() {
        return CollectionsKt.listOf((Object[]) new String[]{PaymentSheetFragment.TAG, PaymentLauncherFragment.TAG, CollectBankAccountLauncherFragment.TAG, FinancialConnectionsSheetFragment.TAG, AddressLauncherFragment.TAG, GooglePayLauncherFragment.TAG, CustomerSheetFragment.TAG});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchActivityResultsToFragments(int requestCode, int resultCode, Intent data) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity;
        ActivityResultRegistry activityResultRegistry;
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(null);
        if (currentActivityOrResolveWithError == null || (supportFragmentManager = currentActivityOrResolveWithError.getSupportFragmentManager()) == null) {
            return;
        }
        Iterator<String> it = getAllStripeFragmentTags().iterator();
        while (it.hasNext()) {
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(it.next());
            if (fragmentFindFragmentByTag != null && (activity = fragmentFindFragmentByTag.getActivity()) != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
                activityResultRegistry.dispatchResult(requestCode, resultCode, data);
            }
        }
    }

    private final void configure3dSecure(ReadableMap params) throws RuntimeException {
        PaymentAuthConfig.Stripe3ds2Config.Builder builder = new PaymentAuthConfig.Stripe3ds2Config.Builder();
        if (params.hasKey("timeout")) {
            builder.setTimeout(params.getInt("timeout"));
        }
        PaymentAuthConfig.INSTANCE.init(new PaymentAuthConfig.Builder().set3ds2Config(builder.setUiCustomization(MappersKt.mapToUICustomization(params)).build()).build());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    protected Map<String, Map<String, String>> getTypedExportedConstants() {
        return MapsKt.mapOf(TuplesKt.to("API_VERSIONS", MapsKt.mapOf(TuplesKt.to("CORE", ApiVersion.API_VERSION_CODE), TuplesKt.to("ISSUING", PushProvisioningProxy.INSTANCE.getApiVersion()))));
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void initialise(ReadableMap params, Promise promise) throws RuntimeException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr = MappersKt.getValOr(params, "publishableKey", null);
        Intrinsics.checkNotNull(valOr, "null cannot be cast to non-null type kotlin.String");
        ReadableMap mapOrNull = MappersKt.getMapOrNull(params, "appInfo");
        Intrinsics.checkNotNull(mapOrNull, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
        this.stripeAccountId = MappersKt.getValOr(params, NamedConstantsKt.STRIPE_ACCOUNT_ID, null);
        String valOr2 = MappersKt.getValOr(params, "urlScheme", null);
        if (!MappersKt.getBooleanOrFalse(params, "setReturnUrlSchemeOnAndroid")) {
            valOr2 = null;
        }
        this.urlScheme = valOr2;
        ReadableMap mapOrNull2 = MappersKt.getMapOrNull(params, "threeDSecureParams");
        if (mapOrNull2 != null) {
            configure3dSecure(mapOrNull2);
        }
        this.publishableKey = valOr;
        AddressLauncherFragment.INSTANCE.setPublishableKey$stripe_stripe_react_native_release(valOr);
        String valOr3 = MappersKt.getValOr(mapOrNull, "name", "");
        Intrinsics.checkNotNull(valOr3, "null cannot be cast to non-null type kotlin.String");
        Stripe.INSTANCE.setAppInfo(AppInfo.INSTANCE.create(valOr3, MappersKt.getValOr(mapOrNull, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, ""), MappersKt.getValOr(mapOrNull, "url", ""), MappersKt.getValOr(mapOrNull, "partnerId", "")));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        this.stripe = new Stripe((Context) reactApplicationContext, valOr, this.stripeAccountId, false, (Set) null, 24, (DefaultConstructorMarker) null);
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        companion.init(reactApplicationContext2, valOr, this.stripeAccountId);
        preventActivityRecreation();
        setupComposeCompatView();
        promise.resolve(null);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void initPaymentSheet(ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            PaymentSheetFragment paymentSheetFragment = this.paymentSheetFragment;
            if (paymentSheetFragment != null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                ExtensionsKt.removeFragment(paymentSheetFragment, reactApplicationContext);
            }
            Bundle bundleObject = MappersKt.toBundleObject(params);
            ReadableMap map = params.getMap("customPaymentMethodConfiguration");
            if (map != null) {
                bundleObject.putSerializable("customPaymentMethodConfigurationReadableMap", map.toHashMap());
            }
            PaymentSheetFragment.Companion companion = PaymentSheetFragment.INSTANCE;
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
            this.paymentSheetFragment = companion.create$stripe_stripe_react_native_release(reactApplicationContext2, bundleObject, promise);
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = currentActivityOrResolveWithError.getSupportFragmentManager().beginTransaction();
                PaymentSheetFragment paymentSheetFragment2 = this.paymentSheetFragment;
                Intrinsics.checkNotNull(paymentSheetFragment2);
                Integer.valueOf(fragmentTransactionBeginTransaction.add(paymentSheetFragment2, PaymentSheetFragment.TAG).commit());
            } catch (IllegalStateException e) {
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void presentPaymentSheet(ReadableMap options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.paymentSheetFragment == null) {
            promise.resolve(PaymentSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
            return;
        }
        if (options.hasKey("timeout")) {
            PaymentSheetFragment paymentSheetFragment = this.paymentSheetFragment;
            if (paymentSheetFragment != null) {
                paymentSheetFragment.presentWithTimeout(options.getInt("timeout"), promise);
                return;
            }
            return;
        }
        PaymentSheetFragment paymentSheetFragment2 = this.paymentSheetFragment;
        if (paymentSheetFragment2 != null) {
            paymentSheetFragment2.present(promise);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void confirmPaymentSheetPayment(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        PaymentSheetFragment paymentSheetFragment = this.paymentSheetFragment;
        if (paymentSheetFragment == null) {
            promise.resolve(PaymentSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        } else if (paymentSheetFragment != null) {
            paymentSheetFragment.confirmPayment(promise);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void resetPaymentSheetCustomer(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        PaymentSheet.Companion companion = PaymentSheet.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.resetCustomer(reactApplicationContext);
        promise.resolve(null);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void intentCreationCallback(ReadableMap params, Promise promise) {
        CompletableDeferred<ReadableMap> paymentSheetIntentCreationCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.embeddedIntentCreationCallback.complete(params);
        PaymentSheetFragment paymentSheetFragment = this.paymentSheetFragment;
        if (paymentSheetFragment == null) {
            promise.resolve(PaymentSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        } else {
            if (paymentSheetFragment == null || (paymentSheetIntentCreationCallback$stripe_stripe_react_native_release = paymentSheetFragment.getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release()) == null) {
                return;
            }
            paymentSheetIntentCreationCallback$stripe_stripe_react_native_release.complete(params);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customPaymentMethodResultCallback(ReadableMap result, Promise promise) {
        CompletableDeferred<ReadableMap> completableDeferred = this.customPaymentMethodResultCallback;
        if (result == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            result = writableMapCreateMap;
        }
        completableDeferred.complete(result);
        this.customPaymentMethodResultCallback = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (promise != null) {
            promise.resolve(null);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void createPaymentMethod(ReadableMap data, ReadableMap options, final Promise promise) {
        PaymentMethod.Type typeMapToPaymentMethodType;
        Stripe stripe;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr$default = MappersKt.getValOr$default(data, "paymentMethodType", null, 4, null);
        if (valOr$default == null || (typeMapToPaymentMethodType = MappersKt.mapToPaymentMethodType(valOr$default)) == null) {
            promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            PaymentMethodCreateParams paymentMethodCreateParamsCreatePaymentMethodParams = new PaymentMethodCreateParamsFactory(MappersKt.getMapOrNull(data, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).createPaymentMethodParams(typeMapToPaymentMethodType);
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            Stripe.createPaymentMethod$default(stripe, paymentMethodCreateParamsCreatePaymentMethodParams, null, null, new ApiResultCallback<PaymentMethod>() { // from class: com.reactnativestripesdk.StripeSdkModule.createPaymentMethod.1
                @Override // com.stripe.android.ApiResultCallback
                public void onError(Exception e) {
                    Intrinsics.checkNotNullParameter(e, "e");
                    promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, e));
                }

                @Override // com.stripe.android.ApiResultCallback
                public void onSuccess(PaymentMethod result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    promise.resolve(MappersKt.createResult("paymentMethod", MappersKt.mapFromPaymentMethod(result)));
                }
            }, 6, null);
        } catch (PaymentMethodCreateParamsException e) {
            promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), (Exception) e));
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void createToken(ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr = MappersKt.getValOr(params, "type", null);
        if (valOr == null) {
            promise.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), "type parameter is required"));
            return;
        }
        int iHashCode = valOr.hashCode();
        if (iHashCode != 80240) {
            if (iHashCode != 2092848) {
                if (iHashCode == 811305009 && valOr.equals("BankAccount")) {
                    createTokenFromBankAccount(params, promise);
                    return;
                }
            } else if (valOr.equals("Card")) {
                createTokenFromCard(params, promise);
                return;
            }
        } else if (valOr.equals("Pii")) {
            createTokenFromPii(params, promise);
            return;
        }
        promise.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), valOr + " type is not supported yet"));
    }

    private final void createTokenFromPii(ReadableMap params, Promise promise) {
        String valOr = MappersKt.getValOr(params, "personalId", null);
        if (valOr == null || BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new StripeSdkModule$createTokenFromPii$1$1(this, valOr, promise, null), 3, null) == null) {
            promise.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), "personalId parameter is required"));
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void createTokenFromBankAccount(ReadableMap params, Promise promise) {
        String valOr = MappersKt.getValOr(params, "accountHolderName", null);
        String valOr2 = MappersKt.getValOr(params, "accountHolderType", null);
        String valOr3 = MappersKt.getValOr(params, "accountNumber", null);
        String valOr4 = MappersKt.getValOr(params, "country", null);
        String valOr5 = MappersKt.getValOr(params, "currency", null);
        String valOr6 = MappersKt.getValOr(params, "routingNumber", null);
        Intrinsics.checkNotNull(valOr4);
        Intrinsics.checkNotNull(valOr5);
        Intrinsics.checkNotNull(valOr3);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C07301(new BankAccountTokenParams(valOr4, valOr5, valOr3, MappersKt.mapToBankAccountType(valOr2), valOr, valOr6), promise, null), 3, null);
    }

    /* compiled from: StripeSdkModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromBankAccount$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.StripeSdkModule$createTokenFromBankAccount$1, reason: invalid class name and case insensitive filesystem */
    static final class C07301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BankAccountTokenParams $bankAccountParams;
        final /* synthetic */ Promise $promise;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07301(BankAccountTokenParams bankAccountTokenParams, Promise promise, Continuation<? super C07301> continuation) {
            super(2, continuation);
            this.$bankAccountParams = bankAccountTokenParams;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07301 c07301 = StripeSdkModule.this.new C07301(this.$bankAccountParams, this.$promise, continuation);
            c07301.L$0 = obj;
            return c07301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StripeSdkModule stripeSdkModule = StripeSdkModule.this;
            BankAccountTokenParams bankAccountTokenParams = this.$bankAccountParams;
            Promise promise = this.$promise;
            try {
                Result.Companion companion = Result.INSTANCE;
                Stripe stripe = stripeSdkModule.stripe;
                if (stripe == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    stripe = null;
                }
                promise.resolve(MappersKt.createResult("token", MappersKt.mapFromToken(stripe.createBankAccountTokenSynchronous(bankAccountTokenParams, null, stripeSdkModule.stripeAccountId))));
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Promise promise2 = this.$promise;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                promise2.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), thM9121exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    private final void createTokenFromCard(ReadableMap params, Promise promise) {
        PaymentMethodCreateParams.Card cardParams;
        Map<String, Object> paramMap;
        Address cardAddress;
        CardFieldView cardFieldView = this.cardFieldView;
        if (cardFieldView == null || (cardParams = cardFieldView.getCardParams()) == null) {
            CardFormView cardFormView = this.cardFormView;
            cardParams = cardFormView != null ? cardFormView.getCardParams() : null;
        }
        if (cardParams == null || (paramMap = cardParams.toParamMap()) == null) {
            promise.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), "Card details not complete"));
            return;
        }
        CardFieldView cardFieldView2 = this.cardFieldView;
        if (cardFieldView2 == null || (cardAddress = cardFieldView2.getCardAddress()) == null) {
            CardFormView cardFormView2 = this.cardFormView;
            cardAddress = cardFormView2 != null ? cardFormView2.getCardAddress() : null;
        }
        ReadableMap mapOrNull = MappersKt.getMapOrNull(params, "address");
        Object obj = paramMap.get("number");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = paramMap.get("exp_month");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = paramMap.get("exp_year");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = paramMap.get("cvc");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C07311(new CardParams(str, iIntValue, iIntValue2, (String) obj4, MappersKt.getValOr(params, "name", null), MappersKt.mapToAddress(mapOrNull, cardAddress), MappersKt.getValOr(params, "currency", null), null, 128, null), promise, null), 3, null);
    }

    /* compiled from: StripeSdkModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromCard$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.StripeSdkModule$createTokenFromCard$1, reason: invalid class name and case insensitive filesystem */
    static final class C07311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardParams $cardParams;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07311(CardParams cardParams, Promise promise, Continuation<? super C07311> continuation) {
            super(2, continuation);
            this.$cardParams = cardParams;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new C07311(this.$cardParams, this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Stripe stripe = StripeSdkModule.this.stripe;
                    if (stripe == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stripe");
                        stripe = null;
                    }
                    this.$promise.resolve(MappersKt.createResult("token", MappersKt.mapFromToken(Stripe.createCardTokenSynchronous$default(stripe, this.$cardParams, null, StripeSdkModule.this.stripeAccountId, 2, null))));
                } catch (Exception e) {
                    this.$promise.resolve(ErrorsKt.createError(CreateTokenErrorType.Failed.toString(), e.getMessage()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void createTokenForCVCUpdate(String cvc, final Promise promise) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Stripe stripe = this.stripe;
        if (stripe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripe");
            stripe = null;
        }
        Stripe.createCvcUpdateToken$default(stripe, cvc, null, null, new ApiResultCallback<Token>() { // from class: com.reactnativestripesdk.StripeSdkModule.createTokenForCVCUpdate.1
            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(Token result) {
                Intrinsics.checkNotNullParameter(result, "result");
                String id = result.getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("tokenId", id);
                promise.resolve(writableNativeMap);
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, e));
            }
        }, 6, null);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void handleNextAction(String paymentIntentClientSecret, String returnUrl, Promise promise) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        PaymentLauncherFragment.Companion companion = PaymentLauncherFragment.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        Stripe stripe = this.stripe;
        if (stripe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripe");
            stripe = null;
        }
        String str = this.publishableKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        }
        this.paymentLauncherFragment = companion.forNextActionPayment(reactApplicationContext, stripe, str, this.stripeAccountId, promise, paymentIntentClientSecret);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void handleNextActionForSetup(String setupIntentClientSecret, String returnUrl, Promise promise) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        PaymentLauncherFragment.Companion companion = PaymentLauncherFragment.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        Stripe stripe = this.stripe;
        if (stripe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripe");
            stripe = null;
        }
        String str = this.publishableKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        }
        this.paymentLauncherFragment = companion.forNextActionSetup(reactApplicationContext, stripe, str, this.stripeAccountId, promise, setupIntentClientSecret);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void confirmPayment(String paymentIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) {
        PaymentMethod.Type typeMapToPaymentMethodType;
        Promise promise2;
        PaymentMethodCreateParamsException paymentMethodCreateParamsException;
        ConfirmPaymentIntentParams confirmPaymentIntentParams;
        PaymentLauncherFragment.Companion companion;
        ReactApplicationContext reactApplicationContext;
        Stripe stripe;
        String str;
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableMap mapOrNull = MappersKt.getMapOrNull(params, "paymentMethodData");
        if (params != null) {
            typeMapToPaymentMethodType = MappersKt.mapToPaymentMethodType(params.getString("paymentMethodType"));
            if (typeMapToPaymentMethodType == null) {
                promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), "You must provide paymentMethodType"));
                return;
            }
        } else {
            typeMapToPaymentMethodType = null;
        }
        try {
            ConfirmStripeIntentParams confirmStripeIntentParamsCreateParams = new PaymentMethodCreateParamsFactory(mapOrNull, options, this.cardFieldView, this.cardFormView).createParams(paymentIntentClientSecret, typeMapToPaymentMethodType, true);
            Intrinsics.checkNotNull(confirmStripeIntentParamsCreateParams, "null cannot be cast to non-null type com.stripe.android.model.ConfirmPaymentIntentParams");
            confirmPaymentIntentParams = (ConfirmPaymentIntentParams) confirmStripeIntentParamsCreateParams;
            String str2 = this.urlScheme;
            if (str2 != null) {
                try {
                    confirmPaymentIntentParams.setReturnUrl(MappersKt.mapToReturnURL(str2));
                } catch (PaymentMethodCreateParamsException e) {
                    paymentMethodCreateParamsException = e;
                    promise2 = promise;
                    promise2.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), (Exception) paymentMethodCreateParamsException));
                }
            }
            confirmPaymentIntentParams.setShipping(MappersKt.mapToShippingDetails(MappersKt.getMapOrNull(mapOrNull, "shippingDetails")));
            companion = PaymentLauncherFragment.INSTANCE;
            reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            promise2 = promise;
        } catch (PaymentMethodCreateParamsException e2) {
            e = e2;
            promise2 = promise;
        }
        try {
            this.paymentLauncherFragment = companion.forPayment(reactApplicationContext, stripe, str, this.stripeAccountId, promise2, paymentIntentClientSecret, confirmPaymentIntentParams);
        } catch (PaymentMethodCreateParamsException e3) {
            e = e3;
            paymentMethodCreateParamsException = e;
            promise2.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), (Exception) paymentMethodCreateParamsException));
        }
    }

    /* compiled from: StripeSdkModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$retrievePaymentIntent$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.StripeSdkModule$retrievePaymentIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07321(String str, Promise promise, Continuation<? super C07321> continuation) {
            super(2, continuation);
            this.$clientSecret = str;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new C07321(this.$clientSecret, this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Stripe stripe = StripeSdkModule.this.stripe;
                if (stripe == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    stripe = null;
                }
                this.$promise.resolve(MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult(Stripe.retrievePaymentIntentSynchronous$default(stripe, this.$clientSecret, null, null, 6, null))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void retrievePaymentIntent(String clientSecret, Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C07321(clientSecret, promise, null), 3, null);
    }

    /* compiled from: StripeSdkModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$retrieveSetupIntent$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.StripeSdkModule$retrieveSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07331(String str, Promise promise, Continuation<? super C07331> continuation) {
            super(2, continuation);
            this.$clientSecret = str;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new C07331(this.$clientSecret, this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Stripe stripe = StripeSdkModule.this.stripe;
                if (stripe == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    stripe = null;
                }
                this.$promise.resolve(MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult(Stripe.retrieveSetupIntentSynchronous$default(stripe, this.$clientSecret, null, null, 6, null))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void retrieveSetupIntent(String clientSecret, Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C07331(clientSecret, promise, null), 3, null);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void confirmSetupIntent(String setupIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) {
        PaymentMethod.Type typeMapToPaymentMethodType;
        Promise promise2;
        PaymentMethodCreateParamsException paymentMethodCreateParamsException;
        ConfirmSetupIntentParams confirmSetupIntentParams;
        PaymentLauncherFragment.Companion companion;
        ReactApplicationContext reactApplicationContext;
        Stripe stripe;
        String str;
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr$default = MappersKt.getValOr$default(params, "paymentMethodType", null, 4, null);
        if (valOr$default == null || (typeMapToPaymentMethodType = MappersKt.mapToPaymentMethodType(valOr$default)) == null) {
            promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            ConfirmStripeIntentParams confirmStripeIntentParamsCreateParams = new PaymentMethodCreateParamsFactory(MappersKt.getMapOrNull(params, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).createParams(setupIntentClientSecret, typeMapToPaymentMethodType, false);
            Intrinsics.checkNotNull(confirmStripeIntentParamsCreateParams, "null cannot be cast to non-null type com.stripe.android.model.ConfirmSetupIntentParams");
            confirmSetupIntentParams = (ConfirmSetupIntentParams) confirmStripeIntentParamsCreateParams;
            String str2 = this.urlScheme;
            if (str2 != null) {
                try {
                    confirmSetupIntentParams.setReturnUrl(MappersKt.mapToReturnURL(str2));
                } catch (PaymentMethodCreateParamsException e) {
                    paymentMethodCreateParamsException = e;
                    promise2 = promise;
                    promise2.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), (Exception) paymentMethodCreateParamsException));
                }
            }
            companion = PaymentLauncherFragment.INSTANCE;
            reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            promise2 = promise;
        } catch (PaymentMethodCreateParamsException e2) {
            e = e2;
            promise2 = promise;
        }
        try {
            this.paymentLauncherFragment = companion.forSetup(reactApplicationContext, stripe, str, this.stripeAccountId, promise2, setupIntentClientSecret, confirmSetupIntentParams);
        } catch (PaymentMethodCreateParamsException e3) {
            e = e3;
            paymentMethodCreateParamsException = e;
            promise2.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), (Exception) paymentMethodCreateParamsException));
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void isPlatformPaySupported(ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableMap map = params != null ? params.getMap("googlePay") : null;
        GooglePayPaymentMethodLauncherFragment.Companion companion = GooglePayPaymentMethodLauncherFragment.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        GooglePayPaymentMethodLauncherFragment googlePayPaymentMethodLauncherFragmentCreate = companion.create(reactApplicationContext, MappersKt.getBooleanOrFalse(map, "testEnv"), MappersKt.getBooleanOrFalse(map, "existingPaymentMethodRequired"), promise);
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            try {
                Integer.valueOf(currentActivityOrResolveWithError.getSupportFragmentManager().beginTransaction().add(googlePayPaymentMethodLauncherFragmentCreate, GooglePayPaymentMethodLauncherFragment.TAG).commit());
            } catch (IllegalStateException e) {
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void confirmPlatformPay(final String clientSecret, ReadableMap params, final boolean isPaymentIntent, final Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(ErrorsKt.createMissingInitError());
            return;
        }
        ReadableMap map = params.getMap("googlePay");
        if (map == null) {
            promise.resolve(ErrorsKt.createError(GooglePayErrorType.Failed.toString(), "You must provide the `googlePay` parameter."));
            return;
        }
        GooglePayLauncherFragment googlePayLauncherFragment = new GooglePayLauncherFragment();
        GooglePayLauncherFragment.Mode mode = isPaymentIntent ? GooglePayLauncherFragment.Mode.ForPayment : GooglePayLauncherFragment.Mode.ForSetup;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        googlePayLauncherFragment.presentGooglePaySheet(clientSecret, mode, map, reactApplicationContext, new Function2() { // from class: com.reactnativestripesdk.StripeSdkModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StripeSdkModule.confirmPlatformPay$lambda$17$lambda$16(promise, isPaymentIntent, this, clientSecret, (GooglePayLauncher.Result) obj, (WritableMap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmPlatformPay$lambda$17$lambda$16(final Promise promise, boolean z, StripeSdkModule stripeSdkModule, String str, GooglePayLauncher.Result result, WritableMap writableMap) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if (writableMap != null) {
            promise.resolve(writableMap);
        } else if (result != null) {
            if (Intrinsics.areEqual(result, GooglePayLauncher.Result.Completed.INSTANCE)) {
                Stripe stripe = null;
                if (z) {
                    Stripe stripe2 = stripeSdkModule.stripe;
                    if (stripe2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    } else {
                        stripe = stripe2;
                    }
                    stripe.retrievePaymentIntent(str, stripeSdkModule.stripeAccountId, CollectionsKt.listOf("payment_method"), new ApiResultCallback<PaymentIntent>() { // from class: com.reactnativestripesdk.StripeSdkModule$confirmPlatformPay$1$1$1
                        @Override // com.stripe.android.ApiResultCallback
                        public void onError(Exception e) {
                            Intrinsics.checkNotNullParameter(e, "e");
                            promise.resolve(MappersKt.createResult("paymentIntent", new WritableNativeMap()));
                        }

                        @Override // com.stripe.android.ApiResultCallback
                        public void onSuccess(PaymentIntent result2) {
                            Intrinsics.checkNotNullParameter(result2, "result");
                            promise.resolve(MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult(result2)));
                        }
                    });
                } else {
                    Stripe stripe3 = stripeSdkModule.stripe;
                    if (stripe3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    } else {
                        stripe = stripe3;
                    }
                    stripe.retrieveSetupIntent(str, stripeSdkModule.stripeAccountId, CollectionsKt.listOf("payment_method"), new ApiResultCallback<SetupIntent>() { // from class: com.reactnativestripesdk.StripeSdkModule$confirmPlatformPay$1$1$2
                        @Override // com.stripe.android.ApiResultCallback
                        public void onError(Exception e) {
                            Intrinsics.checkNotNullParameter(e, "e");
                            promise.resolve(MappersKt.createResult("setupIntent", new WritableNativeMap()));
                        }

                        @Override // com.stripe.android.ApiResultCallback
                        public void onSuccess(SetupIntent result2) {
                            Intrinsics.checkNotNullParameter(result2, "result");
                            promise.resolve(MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult(result2)));
                        }
                    });
                }
            } else if (Intrinsics.areEqual(result, GooglePayLauncher.Result.Canceled.INSTANCE)) {
                promise.resolve(ErrorsKt.createError(GooglePayErrorType.Canceled.toString(), "Google Pay has been canceled"));
            } else {
                if (!(result instanceof GooglePayLauncher.Result.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                promise.resolve(ErrorsKt.createError(GooglePayErrorType.Failed.toString(), ((GooglePayLauncher.Result.Failed) result).getError()));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void createPlatformPayPaymentMethod(ReadableMap params, boolean usesDeprecatedTokenFlow, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableMap map = params.getMap("googlePay");
        if (map == null) {
            promise.resolve(ErrorsKt.createError(GooglePayErrorType.Failed.toString(), "You must provide the `googlePay` parameter."));
            return;
        }
        this.platformPayUsesDeprecatedTokenFlow = usesDeprecatedTokenFlow;
        this.createPlatformPayPaymentMethodPromise = promise;
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            GooglePayRequestHelper.Companion companion = GooglePayRequestHelper.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            GooglePayRequestHelper.INSTANCE.createPaymentMethod$stripe_stripe_react_native_release(companion.createPaymentRequest$stripe_stripe_react_native_release(currentActivityOrResolveWithError, new GooglePayJsonFactory((Context) reactApplicationContext, false, 2, (DefaultConstructorMarker) null), map), currentActivityOrResolveWithError);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void canAddCardToWallet(ReadableMap params, final Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr = MappersKt.getValOr(params, "cardLastFour", null);
        if (valOr == null) {
            promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "You must provide cardLastFour"));
            return;
        }
        if (ExtensionsKt.getBooleanOr(params, "supportsTapToPay", true)) {
            PushProvisioningProxy pushProvisioningProxy = PushProvisioningProxy.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            if (!pushProvisioningProxy.isNFCEnabled(reactApplicationContext)) {
                promise.resolve(MappersKt.createCanAddCardResult$default(false, "UNSUPPORTED_DEVICE", null, 4, null));
                return;
            }
        }
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            PushProvisioningProxy.INSTANCE.isCardInWallet(currentActivityOrResolveWithError, valOr, new Function3() { // from class: com.reactnativestripesdk.StripeSdkModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StripeSdkModule.canAddCardToWallet$lambda$24$lambda$23(this.f$0, promise, ((Boolean) obj).booleanValue(), (WritableMap) obj2, (WritableMap) obj3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit canAddCardToWallet$lambda$24$lambda$23(StripeSdkModule stripeSdkModule, Promise promise, boolean z, WritableMap writableMap, WritableMap writableMap2) {
        WritableNativeMap writableNativeMapCreateCanAddCardResult;
        if (writableMap2 == null || (writableNativeMapCreateCanAddCardResult = MappersKt.createCanAddCardResult(false, "MISSING_CONFIGURATION", null)) == null) {
            writableNativeMapCreateCanAddCardResult = MappersKt.createCanAddCardResult(!z, z ? "CARD_ALREADY_EXISTS" : null, writableMap);
        }
        promise.resolve(writableNativeMapCreateCanAddCardResult);
        return Unit.INSTANCE;
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void isCardInWallet(ReadableMap params, final Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String valOr = MappersKt.getValOr(params, "cardLastFour", null);
        if (valOr == null) {
            promise.resolve(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "You must provide cardLastFour"));
            return;
        }
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            PushProvisioningProxy.INSTANCE.isCardInWallet(currentActivityOrResolveWithError, valOr, new Function3() { // from class: com.reactnativestripesdk.StripeSdkModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StripeSdkModule.isCardInWallet$lambda$28$lambda$27(this.f$0, promise, ((Boolean) obj).booleanValue(), (WritableMap) obj2, (WritableMap) obj3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isCardInWallet$lambda$28$lambda$27(StripeSdkModule stripeSdkModule, Promise promise, boolean z, WritableMap writableMap, WritableMap writableMap2) {
        if (writableMap2 == null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("isInWallet", z);
            writableNativeMap.putMap("token", writableMap);
            writableMap2 = writableNativeMap;
        }
        promise.resolve(writableMap2);
        return Unit.INSTANCE;
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void collectBankAccount(boolean isPaymentIntent, String clientSecret, ReadableMap params, Promise promise) {
        String str;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableMap mapOrNull = MappersKt.getMapOrNull(params, "paymentMethodData");
        if (MappersKt.mapToPaymentMethodType(MappersKt.getValOr(params, "paymentMethodType", null)) != PaymentMethod.Type.USBankAccount) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "collectBankAccount currently only accepts the USBankAccount payment method type."));
            return;
        }
        ReadableMap mapOrNull2 = MappersKt.getMapOrNull(mapOrNull, "billingDetails");
        String string = mapOrNull2 != null ? mapOrNull2.getString("name") : null;
        String str2 = string;
        if (str2 == null || str2.length() == 0) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "You must provide a name when collecting US bank account details."));
            return;
        }
        CollectBankAccountConfiguration.USBankAccount uSBankAccount = new CollectBankAccountConfiguration.USBankAccount(string, mapOrNull2.getString("email"));
        CollectBankAccountLauncherFragment.Companion companion = CollectBankAccountLauncherFragment.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        String str3 = this.publishableKey;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        } else {
            str = str3;
        }
        this.collectBankAccountLauncherFragment = companion.create(reactApplicationContext, str, this.stripeAccountId, clientSecret, isPaymentIntent, uSBankAccount, promise);
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = currentActivityOrResolveWithError.getSupportFragmentManager().beginTransaction();
                CollectBankAccountLauncherFragment collectBankAccountLauncherFragment = this.collectBankAccountLauncherFragment;
                Intrinsics.checkNotNull(collectBankAccountLauncherFragment);
                Integer.valueOf(fragmentTransactionBeginTransaction.add(collectBankAccountLauncherFragment, CollectBankAccountLauncherFragment.TAG).commit());
            } catch (IllegalStateException e) {
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void verifyMicrodeposits(boolean isPaymentIntent, String clientSecret, ReadableMap params, final Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReadableArray array = params.getArray("amounts");
        String string = params.getString("descriptorCode");
        if ((array != null && string != null) || (array == null && string == null)) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "You must provide either amounts OR descriptorCode, not both."));
            return;
        }
        ApiResultCallback<PaymentIntent> apiResultCallback = new ApiResultCallback<PaymentIntent>() { // from class: com.reactnativestripesdk.StripeSdkModule$verifyMicrodeposits$paymentCallback$1
            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e));
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(PaymentIntent result) {
                Intrinsics.checkNotNullParameter(result, "result");
                promise.resolve(MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult(result)));
            }
        };
        ApiResultCallback<SetupIntent> apiResultCallback2 = new ApiResultCallback<SetupIntent>() { // from class: com.reactnativestripesdk.StripeSdkModule$verifyMicrodeposits$setupCallback$1
            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e));
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(SetupIntent result) {
                Intrinsics.checkNotNullParameter(result, "result");
                promise.resolve(MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult(result)));
            }
        };
        Stripe stripe = null;
        if (array == null) {
            if (string != null) {
                if (isPaymentIntent) {
                    Stripe stripe2 = this.stripe;
                    if (stripe2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stripe");
                    } else {
                        stripe = stripe2;
                    }
                    stripe.verifyPaymentIntentWithMicrodeposits(clientSecret, string, apiResultCallback);
                    return;
                }
                Stripe stripe3 = this.stripe;
                if (stripe3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stripe");
                } else {
                    stripe = stripe3;
                }
                stripe.verifySetupIntentWithMicrodeposits(clientSecret, string, apiResultCallback2);
                return;
            }
            return;
        }
        if (array.size() != 2) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "Expected 2 integers in the amounts array, but received " + array.size()));
        } else {
            if (isPaymentIntent) {
                Stripe stripe4 = this.stripe;
                if (stripe4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stripe");
                } else {
                    stripe = stripe4;
                }
                stripe.verifyPaymentIntentWithMicrodeposits(clientSecret, array.getInt(0), array.getInt(1), apiResultCallback);
                return;
            }
            Stripe stripe5 = this.stripe;
            if (stripe5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stripe");
            } else {
                stripe = stripe5;
            }
            stripe.verifySetupIntentWithMicrodeposits(clientSecret, array.getInt(0), array.getInt(1), apiResultCallback2);
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void collectBankAccountToken(String clientSecret, ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(ErrorsKt.createMissingInitError());
            return;
        }
        FinancialConnectionsSheetFragment financialConnectionsSheetFragment = new FinancialConnectionsSheetFragment();
        FinancialConnectionsSheetFragment.Mode mode = FinancialConnectionsSheetFragment.Mode.ForToken;
        String str = this.publishableKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        }
        String str2 = this.stripeAccountId;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        financialConnectionsSheetFragment.presentFinancialConnectionsSheet(clientSecret, mode, str, str2, promise, reactApplicationContext);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void collectFinancialConnectionsAccounts(String clientSecret, ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(ErrorsKt.createMissingInitError());
            return;
        }
        FinancialConnectionsSheetFragment financialConnectionsSheetFragment = new FinancialConnectionsSheetFragment();
        FinancialConnectionsSheetFragment.Mode mode = FinancialConnectionsSheetFragment.Mode.ForSession;
        String str = this.publishableKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        }
        String str2 = this.stripeAccountId;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        financialConnectionsSheetFragment.presentFinancialConnectionsSheet(clientSecret, mode, str, str2, promise, reactApplicationContext);
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void initCustomerSheet(ReadableMap params, ReadableMap customerAdapterOverrides, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(customerAdapterOverrides, "customerAdapterOverrides");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(ErrorsKt.createMissingInitError());
            return;
        }
        FragmentActivity currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
            if (customerSheetFragment != null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                ExtensionsKt.removeFragment(customerSheetFragment, reactApplicationContext);
            }
            CustomerSheetFragment customerSheetFragment2 = new CustomerSheetFragment();
            customerSheetFragment2.setContext$stripe_stripe_react_native_release(getReactApplicationContext());
            customerSheetFragment2.setInitPromise$stripe_stripe_react_native_release(promise);
            Bundle bundleObject = MappersKt.toBundleObject(params);
            bundleObject.putBundle("customerAdapter", MappersKt.toBundleObject(customerAdapterOverrides));
            customerSheetFragment2.setArguments(bundleObject);
            this.customerSheetFragment = customerSheetFragment2;
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = currentActivityOrResolveWithError.getSupportFragmentManager().beginTransaction();
                CustomerSheetFragment customerSheetFragment3 = this.customerSheetFragment;
                Intrinsics.checkNotNull(customerSheetFragment3);
                Integer.valueOf(fragmentTransactionBeginTransaction.add(customerSheetFragment3, CustomerSheetFragment.TAG).commit());
            } catch (IllegalStateException e) {
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void presentCustomerSheet(ReadableMap params, Promise promise) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Long lValueOf = params.hasKey("timeout") ? Long.valueOf(params.getInt("timeout")) : null;
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            customerSheetFragment.present(lValueOf, promise);
        } else {
            promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void retrieveCustomerSheetPaymentOptionSelection(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            customerSheetFragment.retrievePaymentOptionSelection$stripe_stripe_react_native_release(promise);
        } else {
            promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        }
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterFetchPaymentMethodsCallback(ReadableArray paymentMethodJsonObjects, Promise promise) {
        CompletableDeferred<List<PaymentMethod>> fetchPaymentMethodsCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(paymentMethodJsonObjects, "paymentMethodJsonObjects");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = paymentMethodJsonObjects.toArrayList().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                PaymentMethod paymentMethodFromJson = companion.fromJson(new JSONObject((HashMap) next));
                if (paymentMethodFromJson != null) {
                    arrayList.add(paymentMethodFromJson);
                } else {
                    Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                }
            }
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (fetchPaymentMethodsCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getFetchPaymentMethodsCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(fetchPaymentMethodsCallback$stripe_stripe_react_native_release.complete(arrayList));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterAttachPaymentMethodCallback(ReadableMap paymentMethodJson, Promise promise) {
        CompletableDeferred<PaymentMethod> attachPaymentMethodCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(paymentMethodJson, "paymentMethodJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
            HashMap<String, Object> hashMap = paymentMethodJson.toHashMap();
            Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            PaymentMethod paymentMethodFromJson = companion.fromJson(new JSONObject(hashMap));
            if (paymentMethodFromJson == null) {
                Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                return;
            }
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (attachPaymentMethodCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getAttachPaymentMethodCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(attachPaymentMethodCallback$stripe_stripe_react_native_release.complete(paymentMethodFromJson));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterDetachPaymentMethodCallback(ReadableMap paymentMethodJson, Promise promise) {
        CompletableDeferred<PaymentMethod> detachPaymentMethodCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(paymentMethodJson, "paymentMethodJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
            HashMap<String, Object> hashMap = paymentMethodJson.toHashMap();
            Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            PaymentMethod paymentMethodFromJson = companion.fromJson(new JSONObject(hashMap));
            if (paymentMethodFromJson == null) {
                Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                return;
            }
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (detachPaymentMethodCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getDetachPaymentMethodCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(detachPaymentMethodCallback$stripe_stripe_react_native_release.complete(paymentMethodFromJson));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterSetSelectedPaymentOptionCallback(Promise promise) {
        CompletableDeferred<Unit> setSelectedPaymentOptionCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (setSelectedPaymentOptionCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(setSelectedPaymentOptionCallback$stripe_stripe_react_native_release.complete(Unit.INSTANCE));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterFetchSelectedPaymentOptionCallback(String paymentOption, Promise promise) {
        CompletableDeferred<String> fetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (fetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(fetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release.complete(paymentOption));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    @Override // com.reactnativestripesdk.NativeStripeSdkModuleSpec
    @ReactMethod
    public void customerAdapterSetupIntentClientSecretForCustomerAttachCallback(String clientSecret, Promise promise) {
        CompletableDeferred<String> setupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CustomerSheetFragment customerSheetFragment = this.customerSheetFragment;
        if (customerSheetFragment != null) {
            ReactNativeCustomerAdapter customerAdapter$stripe_stripe_react_native_release = customerSheetFragment.getCustomerAdapter();
            Boolean boolValueOf = (customerAdapter$stripe_stripe_react_native_release == null || (setupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release = customerAdapter$stripe_stripe_react_native_release.getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release()) == null) ? null : Boolean.valueOf(setupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release.complete(clientSecret));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                return;
            }
        }
        promise.resolve(CustomerSheetFragment.INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
    }

    private final FragmentActivity getCurrentActivityOrResolveWithError(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        if (promise != null) {
            promise.resolve(ErrorsKt.createMissingActivityError());
        }
        return null;
    }

    private final void preventActivityRecreation() {
        Application application;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (application = currentActivity.getApplication()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    private final void setupComposeCompatView() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativestripesdk.StripeSdkModule$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                StripeSdkModule.setupComposeCompatView$lambda$54(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupComposeCompatView$lambda$54(StripeSdkModule stripeSdkModule) {
        ViewGroup viewGroup;
        StripeAbstractComposeView.CompatView compatView = stripeSdkModule.composeCompatView;
        if (compatView == null) {
            ReactApplicationContext reactApplicationContext = stripeSdkModule.getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            compatView = new StripeAbstractComposeView.CompatView(reactApplicationContext);
            Activity currentActivity = stripeSdkModule.getCurrentActivity();
            if (currentActivity != null && (viewGroup = (ViewGroup) currentActivity.findViewById(android.R.id.content)) != null) {
                viewGroup.addView(compatView);
            }
        }
        stripeSdkModule.composeCompatView = compatView;
    }
}
