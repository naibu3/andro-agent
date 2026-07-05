package com.stripe.android;

import android.content.Intent;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.exception.CardException;
import com.stripe.android.hcaptcha.HCaptchaInterfaceKt;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.PiiTokenParams;
import com.stripe.android.model.PossibleBrands;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeKtx.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\t\u001a2\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u000f\u001aB\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u0015\u001a2\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u001a\u001a2\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\u001f\u001a2\u0010 \u001a\u00020\u001c*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010#\u001a2\u0010$\u001a\u00020\u001c*\u00020\u00022\u0006\u0010%\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010&\u001a2\u0010'\u001a\u00020\u001c*\u00020\u00022\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010*\u001a4\u0010+\u001a\u00020\u001c*\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010&\u001a2\u0010-\u001a\u00020\u001c*\u00020\u00022\u0006\u0010.\u001a\u00020/2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u00100\u001a2\u00101\u001a\u000202*\u00020\u00022\u0006\u00103\u001a\u0002042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u00105\u001a\u001e\u00106\u001a\u000207*\u00020\u00022\n\b\u0002\u00108\u001a\u0004\u0018\u000109H\u0087@¢\u0006\u0002\u0010:\u001a6\u0010;\u001a\u00020<*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0?H\u0086@¢\u0006\u0002\u0010@\u001a6\u0010A\u001a\u00020B*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0?H\u0086@¢\u0006\u0002\u0010@\u001a2\u0010C\u001a\u00020\u0017*\u00020\u00022\b\b\u0001\u0010D\u001a\u00020\b2\b\b\u0001\u0010=\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010&\u001a6\u0010E\u001a\u00020B*\u00020\u00022\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0?H\u0086@¢\u0006\u0002\u0010H\u001a&\u0010I\u001a\u00020J*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010K\u001a&\u0010L\u001a\u00020<*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010K\u001a.\u0010M\u001a\u0002HN\"\n\b\u0000\u0010N\u0018\u0001*\u00020O2\u0012\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HN0R0QH\u0082\b¢\u0006\u0002\u0010S\u001a\"\u0010T\u001a\u00020\u0001*\u00020\u00022\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0086@¢\u0006\u0002\u0010Y\u001a\"\u0010Z\u001a\u00020[*\u00020\u00022\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0086@¢\u0006\u0002\u0010Y\u001a\"\u0010\\\u001a\u00020\u0017*\u00020\u00022\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0086@¢\u0006\u0002\u0010Y\u001a9\u0010M\u001a\u0002HN\"\n\b\u0000\u0010N\u0018\u0001*\u00020O2\u0006\u0010]\u001a\u00020^2\u0012\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002HN0R0QH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010_\u001a*\u0010`\u001a\u00020<*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\u0006\u0010a\u001a\u00020V2\u0006\u0010b\u001a\u00020VH\u0086@¢\u0006\u0002\u0010c\u001a\"\u0010`\u001a\u00020<*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\u0006\u0010d\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010e\u001a*\u0010f\u001a\u00020B*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\u0006\u0010a\u001a\u00020V2\u0006\u0010b\u001a\u00020VH\u0086@¢\u0006\u0002\u0010c\u001a\"\u0010f\u001a\u00020B*\u00020\u00022\u0006\u0010=\u001a\u00020\b2\u0006\u0010d\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010e\u001a\u001a\u0010g\u001a\u00020h*\u00020\u00022\u0006\u0010i\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010j\u001aH\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000b0R*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010l\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0087@¢\u0006\u0002\u0010m\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"confirmAlipayPayment", "Lcom/stripe/android/PaymentIntentResult;", "Lcom/stripe/android/Stripe;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "idempotencyKey", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "paymentMethodUpdateParams", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "ephemeralKeySecret", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSource", "Lcom/stripe/android/model/Source;", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAccountToken", "Lcom/stripe/android/model/Token;", "accountParams", "Lcom/stripe/android/model/AccountParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPiiToken", "personalId", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCvcUpdateToken", "cvc", "createPersonToken", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PersonTokenParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/core/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/stripe/android/Stripe;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "clientSecret", "expand", "", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "retrieveSource", "sourceId", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "runApiRequest", "ApiObject", "Lcom/stripe/android/core/model/StripeModel;", "block", "Lkotlin/Function0;", "Lkotlin/Result;", "(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/core/model/StripeModel;", "getPaymentIntentResult", "requestCode", "", "data", "Landroid/content/Intent;", "(Lcom/stripe/android/Stripe;ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "getAuthenticateSourceResult", "isValidParam", "", "(ZLkotlin/jvm/functions/Function0;)Lcom/stripe/android/core/model/StripeModel;", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "(Lcom/stripe/android/Stripe;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySetupIntentWithMicrodeposits", "retrievePossibleBrands", "Lcom/stripe/android/model/PossibleBrands;", "cardNumber", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "customerId", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeKtxKt {

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {1099}, m = "attachPaymentMethod", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$attachPaymentMethod$1, reason: invalid class name */
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
            Object objAttachPaymentMethod = StripeKtxKt.attachPaymentMethod(null, null, null, null, null, null, this);
            return objAttachPaymentMethod == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAttachPaymentMethod : Result.m9117boximpl(objAttachPaymentMethod);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {68}, m = "confirmAlipayPayment", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$confirmAlipayPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07791(Continuation<? super C07791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.confirmAlipayPayment(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {751}, m = "confirmPaymentIntent", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$confirmPaymentIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07801(Continuation<? super C07801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.confirmPaymentIntent(null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {681}, m = "confirmSetupIntent", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$confirmSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07811(Continuation<? super C07811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.confirmSetupIntent(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {714}, m = "confirmWeChatPayPayment", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07821(Continuation<? super C07821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.confirmWeChatPayPayment(null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {457}, m = "createFile", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$createFile$1, reason: invalid class name and case insensitive filesystem */
    static final class C07831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07831(Continuation<? super C07831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.createFile(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "createPaymentMethod", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$createPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C07841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07841(Continuation<? super C07841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.createPaymentMethod(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {0, 0, 1, 1}, l = {491, TypedValues.PositionType.TYPE_CURVE_FIT, 514}, m = "createRadarSession", n = {"$this$createRadarSession", "activity", "$this$createRadarSession", "radarSession"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.StripeKtxKt$createRadarSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C07851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07851(Continuation<? super C07851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.createRadarSession(null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {196}, m = "createSource", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$createSource$1, reason: invalid class name and case insensitive filesystem */
    static final class C07861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07861(Continuation<? super C07861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.createSource(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {864}, m = "getAuthenticateSourceResult", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07871(Continuation<? super C07871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.getAuthenticateSourceResult(null, 0, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {801}, m = "getPaymentIntentResult", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$getPaymentIntentResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07881(Continuation<? super C07881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.getPaymentIntentResult(null, 0, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {833}, m = "getSetupIntentResult", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$getSetupIntentResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07891(Continuation<? super C07891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.getSetupIntentResult(null, 0, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {559}, m = "retrievePaymentIntent", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$retrievePaymentIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07901(Continuation<? super C07901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.retrievePaymentIntent(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {1078}, m = "retrievePossibleBrands", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$retrievePossibleBrands$1, reason: invalid class name and case insensitive filesystem */
    static final class C07911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07911(Continuation<? super C07911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.retrievePossibleBrands(null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {600}, m = "retrieveSetupIntent", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$retrieveSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07921(Continuation<? super C07921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.retrieveSetupIntent(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {641}, m = "retrieveSource", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$retrieveSource$1, reason: invalid class name and case insensitive filesystem */
    static final class C07931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07931(Continuation<? super C07931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.retrieveSource(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {154}, m = "updatePaymentMethod", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$updatePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C07941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07941(Continuation<? super C07941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.updatePaymentMethod(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {921}, m = "verifyPaymentIntentWithMicrodeposits", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$1, reason: invalid class name and case insensitive filesystem */
    static final class C07951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07951(Continuation<? super C07951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.verifyPaymentIntentWithMicrodeposits(null, null, 0, 0, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {963}, m = "verifyPaymentIntentWithMicrodeposits", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3, reason: invalid class name */
    static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.verifyPaymentIntentWithMicrodeposits(null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {PointerIconCompat.TYPE_CROSSHAIR}, m = "verifySetupIntentWithMicrodeposits", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$1, reason: invalid class name and case insensitive filesystem */
    static final class C07961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07961(Continuation<? super C07961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.verifySetupIntentWithMicrodeposits(null, null, 0, 0, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", i = {}, l = {1049}, m = "verifySetupIntentWithMicrodeposits", n = {}, s = {})
    /* renamed from: com.stripe.android.StripeKtxKt$verifySetupIntentWithMicrodeposits$3, reason: invalid class name and case insensitive filesystem */
    static final class C07973 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07973(Continuation<? super C07973> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtxKt.verifySetupIntentWithMicrodeposits(null, null, null, this);
        }
    }

    public static final Object createRadarSession(Stripe stripe, Continuation<? super RadarSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return createRadarSession$default(stripe, null, continuation, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmAlipayPayment(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, Continuation<? super PaymentIntentResult> continuation) throws StripeException {
        C07791 c07791;
        Object objMo7195confirmAndAuthenticateAlipayBWLJW6A;
        if (continuation instanceof C07791) {
            c07791 = (C07791) continuation;
            if ((c07791.label & Integer.MIN_VALUE) != 0) {
                c07791.label -= Integer.MIN_VALUE;
            } else {
                c07791 = new C07791(continuation);
            }
        }
        Object obj = c07791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07791.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentController paymentController = stripe.getPaymentController();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str, null, 4, null);
            c07791.label = 1;
            objMo7195confirmAndAuthenticateAlipayBWLJW6A = paymentController.mo7195confirmAndAuthenticateAlipayBWLJW6A(confirmPaymentIntentParams, alipayAuthenticator, options, c07791);
            if (objMo7195confirmAndAuthenticateAlipayBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo7195confirmAndAuthenticateAlipayBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7195confirmAndAuthenticateAlipayBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo7195confirmAndAuthenticateAlipayBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 4) != 0) {
            str = stripe.getStripeAccountId();
        }
        return confirmAlipayPayment(stripe, confirmPaymentIntentParams, alipayAuthenticator, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createPaymentMethod(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super PaymentMethod> continuation) throws StripeException {
        C07841 c07841;
        Object objMo8025createPaymentMethod0E7RQCE;
        if (continuation instanceof C07841) {
            c07841 = (C07841) continuation;
            if ((c07841.label & Integer.MIN_VALUE) != 0) {
                c07841.label -= Integer.MIN_VALUE;
            } else {
                c07841 = new C07841(continuation);
            }
        }
        Object obj = c07841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07841.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, str);
            c07841.label = 1;
            objMo8025createPaymentMethod0E7RQCE = stripeRepository.mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, c07841);
            if (objMo8025createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8025createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8025createPaymentMethod0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8025createPaymentMethod0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createPaymentMethod(stripe, paymentMethodCreateParams, str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object updatePaymentMethod(Stripe stripe, String str, PaymentMethodUpdateParams paymentMethodUpdateParams, String str2, String str3, String str4, Continuation<? super PaymentMethod> continuation) throws StripeException {
        C07941 c07941;
        Object objMo8060updatePaymentMethodBWLJW6A;
        if (continuation instanceof C07941) {
            c07941 = (C07941) continuation;
            if ((c07941.label & Integer.MIN_VALUE) != 0) {
                c07941.label -= Integer.MIN_VALUE;
            } else {
                c07941 = new C07941(continuation);
            }
        }
        Object obj = c07941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07941.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(str2, str4, str3);
            c07941.label = 1;
            objMo8060updatePaymentMethodBWLJW6A = stripeRepository.mo8060updatePaymentMethodBWLJW6A(str, paymentMethodUpdateParams, options, c07941);
            if (objMo8060updatePaymentMethodBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8060updatePaymentMethodBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8060updatePaymentMethodBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8060updatePaymentMethodBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object updatePaymentMethod$default(Stripe stripe, String str, PaymentMethodUpdateParams paymentMethodUpdateParams, String str2, String str3, String str4, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 8) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            str4 = stripe.getStripeAccountId();
        }
        return updatePaymentMethod(stripe, str, paymentMethodUpdateParams, str2, str5, str4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createSource(Stripe stripe, SourceParams sourceParams, String str, String str2, Continuation<? super Source> continuation) throws StripeException {
        C07861 c07861;
        Object objMo8029createSource0E7RQCE;
        if (continuation instanceof C07861) {
            c07861 = (C07861) continuation;
            if ((c07861.label & Integer.MIN_VALUE) != 0) {
                c07861.label -= Integer.MIN_VALUE;
            } else {
                c07861 = new C07861(continuation);
            }
        }
        Object obj = c07861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07861.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, str);
            c07861.label = 1;
            objMo8029createSource0E7RQCE = stripeRepository.mo8029createSource0E7RQCE(sourceParams, options, c07861);
            if (objMo8029createSource0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8029createSource0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8029createSource0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8029createSource0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createSource(stripe, sourceParams, str, str2, continuation);
    }

    public static /* synthetic */ Object createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createAccountToken(stripe, accountParams, str, str2, continuation);
    }

    public static final Object createAccountToken(Stripe stripe, AccountParams accountParams, String str, String str2, Continuation<? super Token> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(accountParams, str2, str, continuation);
    }

    public static /* synthetic */ Object createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createBankAccountToken(stripe, bankAccountTokenParams, str, str2, continuation);
    }

    public static final Object createBankAccountToken(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation<? super Token> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(bankAccountTokenParams, str2, str, continuation);
    }

    public static /* synthetic */ Object createPiiToken$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId();
        }
        return createPiiToken(stripe, str, str2, str3, continuation);
    }

    public static final Object createPiiToken(Stripe stripe, String str, String str2, String str3, Continuation<? super Token> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(new PiiTokenParams(str), str3, str2, continuation);
    }

    public static /* synthetic */ Object createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, Continuation continuation, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createCardToken(stripe, cardParams, str, str2, continuation);
    }

    public static final Object createCardToken(Stripe stripe, CardParams cardParams, String str, String str2, Continuation<? super Token> continuation) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(cardParams, str2, str, continuation);
    }

    public static /* synthetic */ Object createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId();
        }
        return createCvcUpdateToken(stripe, str, str2, str3, continuation);
    }

    public static final Object createCvcUpdateToken(Stripe stripe, String str, String str2, String str3, Continuation<? super Token> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(new CvcTokenParams(str), str3, str2, continuation);
    }

    public static /* synthetic */ Object createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createPersonToken(stripe, personTokenParams, str, str2, continuation);
    }

    public static final Object createPersonToken(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, Continuation<? super Token> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(personTokenParams, str2, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createFile(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, Continuation<? super StripeFile> continuation) throws StripeException {
        C07831 c07831;
        Object objMo8022createFile0E7RQCE;
        if (continuation instanceof C07831) {
            c07831 = (C07831) continuation;
            if ((c07831.label & Integer.MIN_VALUE) != 0) {
                c07831.label -= Integer.MIN_VALUE;
            } else {
                c07831 = new C07831(continuation);
            }
        }
        Object obj = c07831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07831.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, str);
            c07831.label = 1;
            objMo8022createFile0E7RQCE = stripeRepository.mo8022createFile0E7RQCE(stripeFileParams, options, c07831);
            if (objMo8022createFile0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8022createFile0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8022createFile0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8022createFile0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, Continuation continuation, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createFile(stripe, stripeFileParams, str, str2, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        if (r15 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createRadarSession(Stripe stripe, FragmentActivity fragmentActivity, Continuation<? super RadarSession> continuation) throws StripeException {
        C07851 c07851;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        Throwable thM9121exceptionOrNullimpl;
        FragmentActivity fragmentActivity2;
        Object objMo8026createRadarSessiongIAlus;
        Object objM9118constructorimpl3;
        Stripe stripe2;
        RadarSessionWithHCaptcha radarSessionWithHCaptcha;
        if (continuation instanceof C07851) {
            c07851 = (C07851) continuation;
            if ((c07851.label & Integer.MIN_VALUE) != 0) {
                c07851.label -= Integer.MIN_VALUE;
            } else {
                c07851 = new C07851(continuation);
            }
        }
        C07851 c078512 = c07851;
        Object obj = c078512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c078512.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c078512.L$0 = stripe;
            fragmentActivity2 = fragmentActivity;
            c078512.L$1 = fragmentActivity2;
            c078512.label = 1;
            objMo8026createRadarSessiongIAlus = stripeRepository.mo8026createRadarSessiongIAlus(options, c078512);
            if (objMo8026createRadarSessiongIAlus != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            FragmentActivity fragmentActivity3 = (FragmentActivity) c078512.L$1;
            Stripe stripe3 = (Stripe) c078512.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8026createRadarSessiongIAlus = ((Result) obj).getValue();
            fragmentActivity2 = fragmentActivity3;
            stripe = stripe3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM9118constructorimpl3 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objM9118constructorimpl3);
                objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl3);
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl2 = Result.m9118constructorimpl(new RadarSession(((RadarSessionWithHCaptcha) objM9118constructorimpl).getId()));
                } else {
                    objM9118constructorimpl2 = Result.m9118constructorimpl(objM9118constructorimpl);
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl == null) {
                    return (StripeModel) objM9118constructorimpl2;
                }
                throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
            }
            radarSessionWithHCaptcha = (RadarSessionWithHCaptcha) c078512.L$1;
            stripe2 = (Stripe) c078512.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            Stripe stripe4 = stripe2;
            StripeRepository stripeRepository2 = stripe4.getStripeRepository();
            String id = radarSessionWithHCaptcha.getId();
            ApiRequest.Options options2 = new ApiRequest.Options(stripe4.getPublishableKey(), stripe4.getStripeAccountId(), null, 4, null);
            c078512.L$0 = null;
            c078512.L$1 = null;
            c078512.label = 3;
            objM9118constructorimpl3 = stripeRepository2.mo8015attachHCaptchaToRadarSessionyxL6bBk(id, str, null, options2, c078512);
        }
        if (!Result.m9125isSuccessimpl(objMo8026createRadarSessiongIAlus)) {
            objM9118constructorimpl = Result.m9118constructorimpl(objMo8026createRadarSessiongIAlus);
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            }
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
            if (thM9121exceptionOrNullimpl == null) {
            }
        } else {
            Result.Companion companion3 = Result.INSTANCE;
            RadarSessionWithHCaptcha radarSessionWithHCaptcha2 = (RadarSessionWithHCaptcha) objMo8026createRadarSessiongIAlus;
            String passiveCaptchaSiteKey = radarSessionWithHCaptcha2.getPassiveCaptchaSiteKey();
            String str2 = passiveCaptchaSiteKey;
            if (str2 == null || str2.length() == 0 || fragmentActivity2 == null) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl3 = Result.m9118constructorimpl(radarSessionWithHCaptcha2);
                ResultKt.throwOnFailure(objM9118constructorimpl3);
                objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl3);
                if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl == null) {
                }
            } else {
                String passiveCaptchaRqdata = radarSessionWithHCaptcha2.getPassiveCaptchaRqdata();
                c078512.L$0 = stripe;
                c078512.L$1 = radarSessionWithHCaptcha2;
                c078512.label = 2;
                Object objPerformPassiveHCaptcha = HCaptchaInterfaceKt.performPassiveHCaptcha(fragmentActivity2, passiveCaptchaSiteKey, passiveCaptchaRqdata, c078512);
                if (objPerformPassiveHCaptcha == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripe2 = stripe;
                radarSessionWithHCaptcha = radarSessionWithHCaptcha2;
                obj = objPerformPassiveHCaptcha;
                String str3 = (String) obj;
                Stripe stripe42 = stripe2;
                StripeRepository stripeRepository22 = stripe42.getStripeRepository();
                String id2 = radarSessionWithHCaptcha.getId();
                ApiRequest.Options options22 = new ApiRequest.Options(stripe42.getPublishableKey(), stripe42.getStripeAccountId(), null, 4, null);
                c078512.L$0 = null;
                c078512.L$1 = null;
                c078512.label = 3;
                objM9118constructorimpl3 = stripeRepository22.mo8015attachHCaptchaToRadarSessionyxL6bBk(id2, str3, null, options22, c078512);
            }
        }
    }

    public static /* synthetic */ Object createRadarSession$default(Stripe stripe, FragmentActivity fragmentActivity, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 1) != 0) {
            fragmentActivity = null;
        }
        return createRadarSession(stripe, fragmentActivity, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrievePaymentIntent(Stripe stripe, String str, String str2, List<String> list, Continuation<? super PaymentIntent> continuation) throws StripeException {
        C07901 c07901;
        Object objMo8049retrievePaymentIntentBWLJW6A;
        if (continuation instanceof C07901) {
            c07901 = (C07901) continuation;
            if ((c07901.label & Integer.MIN_VALUE) != 0) {
                c07901.label -= Integer.MIN_VALUE;
            } else {
                c07901 = new C07901(continuation);
            }
        }
        Object obj = c07901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07901.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, null, 4, null);
            c07901.label = 1;
            objMo8049retrievePaymentIntentBWLJW6A = stripeRepository.mo8049retrievePaymentIntentBWLJW6A(str, options, list, c07901);
            if (objMo8049retrievePaymentIntentBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8049retrievePaymentIntentBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8049retrievePaymentIntentBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8049retrievePaymentIntentBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object retrievePaymentIntent$default(Stripe stripe, String str, String str2, List list, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return retrievePaymentIntent(stripe, str, str2, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrieveSetupIntent(Stripe stripe, String str, String str2, List<String> list, Continuation<? super SetupIntent> continuation) throws StripeException {
        C07921 c07921;
        Object objMo8051retrieveSetupIntentBWLJW6A;
        if (continuation instanceof C07921) {
            c07921 = (C07921) continuation;
            if ((c07921.label & Integer.MIN_VALUE) != 0) {
                c07921.label -= Integer.MIN_VALUE;
            } else {
                c07921 = new C07921(continuation);
            }
        }
        Object obj = c07921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07921.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, null, 4, null);
            c07921.label = 1;
            objMo8051retrieveSetupIntentBWLJW6A = stripeRepository.mo8051retrieveSetupIntentBWLJW6A(str, options, list, c07921);
            if (objMo8051retrieveSetupIntentBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8051retrieveSetupIntentBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8051retrieveSetupIntentBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8051retrieveSetupIntentBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object retrieveSetupIntent$default(Stripe stripe, String str, String str2, List list, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return retrieveSetupIntent(stripe, str, str2, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrieveSource(Stripe stripe, String str, String str2, String str3, Continuation<? super Source> continuation) throws StripeException {
        C07931 c07931;
        Object objMo8052retrieveSourceBWLJW6A;
        if (continuation instanceof C07931) {
            c07931 = (C07931) continuation;
            if ((c07931.label & Integer.MIN_VALUE) != 0) {
                c07931.label -= Integer.MIN_VALUE;
            } else {
                c07931 = new C07931(continuation);
            }
        }
        Object obj = c07931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07931.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str3, null, 4, null);
            c07931.label = 1;
            objMo8052retrieveSourceBWLJW6A = stripeRepository.mo8052retrieveSourceBWLJW6A(str, str2, options, c07931);
            if (objMo8052retrieveSourceBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8052retrieveSourceBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8052retrieveSourceBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8052retrieveSourceBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object retrieveSource$default(Stripe stripe, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId();
        }
        return retrieveSource(stripe, str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmSetupIntent(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, List<String> list, Continuation<? super SetupIntent> continuation) throws StripeException {
        C07811 c07811;
        Object objMo8021confirmSetupIntentBWLJW6A;
        if (continuation instanceof C07811) {
            c07811 = (C07811) continuation;
            if ((c07811.label & Integer.MIN_VALUE) != 0) {
                c07811.label -= Integer.MIN_VALUE;
            } else {
                c07811 = new C07811(continuation);
            }
        }
        Object obj = c07811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07811.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), str);
            c07811.label = 1;
            objMo8021confirmSetupIntentBWLJW6A = stripeRepository.mo8021confirmSetupIntentBWLJW6A(confirmSetupIntentParams, options, list, c07811);
            if (objMo8021confirmSetupIntentBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8021confirmSetupIntentBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8021confirmSetupIntentBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8021confirmSetupIntentBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object confirmSetupIntent$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, List list, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return confirmSetupIntent(stripe, confirmSetupIntentParams, str, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmWeChatPayPayment(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super WeChatPayNextAction> continuation) throws StripeException {
        C07821 c07821;
        Object objMo7196confirmWeChatPay0E7RQCE;
        if (continuation instanceof C07821) {
            c07821 = (C07821) continuation;
            if ((c07821.label & Integer.MIN_VALUE) != 0) {
                c07821.label -= Integer.MIN_VALUE;
            } else {
                c07821 = new C07821(continuation);
            }
        }
        Object obj = c07821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07821.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentController paymentController = stripe.getPaymentController();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str, null, 4, null);
            c07821.label = 1;
            objMo7196confirmWeChatPay0E7RQCE = paymentController.mo7196confirmWeChatPay0E7RQCE(confirmPaymentIntentParams, options, c07821);
            if (objMo7196confirmWeChatPay0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo7196confirmWeChatPay0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7196confirmWeChatPay0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo7196confirmWeChatPay0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.getStripeAccountId();
        }
        return confirmWeChatPayPayment(stripe, confirmPaymentIntentParams, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object confirmPaymentIntent(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super PaymentIntent> continuation) throws StripeException {
        C07801 c07801;
        Object objM8065confirmPaymentIntentBWLJW6A$default;
        if (continuation instanceof C07801) {
            c07801 = (C07801) continuation;
            if ((c07801.label & Integer.MIN_VALUE) != 0) {
                c07801.label -= Integer.MIN_VALUE;
            } else {
                c07801 = new C07801(continuation);
            }
        }
        C07801 c078012 = c07801;
        Object obj = c078012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c078012.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), str);
            c078012.label = 1;
            objM8065confirmPaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8065confirmPaymentIntentBWLJW6A$default(stripeRepository, confirmPaymentIntentParams, options, null, c078012, 4, null);
            if (objM8065confirmPaymentIntentBWLJW6A$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8065confirmPaymentIntentBWLJW6A$default = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8065confirmPaymentIntentBWLJW6A$default);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objM8065confirmPaymentIntentBWLJW6A$default;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    public static /* synthetic */ Object confirmPaymentIntent$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        return confirmPaymentIntent(stripe, confirmPaymentIntentParams, str, continuation);
    }

    private static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(Function0<? extends Result<? extends ApiObject>> function0) throws StripeException {
        Object value = function0.invoke().getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
        if (thM9121exceptionOrNullimpl == null) {
            return (ApiObject) value;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getPaymentIntentResult(Stripe stripe, int i, Intent intent, Continuation<? super PaymentIntentResult> continuation) throws StripeException {
        C07881 c07881;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        if (continuation instanceof C07881) {
            c07881 = (C07881) continuation;
            if ((c07881.label & Integer.MIN_VALUE) != 0) {
                c07881.label -= Integer.MIN_VALUE;
            } else {
                c07881 = new C07881(continuation);
            }
        }
        Object obj = c07881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zIsPaymentResult = stripe.isPaymentResult(i, intent);
            try {
                Result.Companion companion = Result.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (zIsPaymentResult) {
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                    PaymentController paymentController = stripe.getPaymentController();
                    c07881.label = 1;
                    objM9118constructorimpl2 = paymentController.mo7198getPaymentIntentResultgIAlus(intent, c07881);
                    if (objM9118constructorimpl2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
                }
            } else {
                throw new IllegalArgumentException("Incorrect requestCode and data for PaymentIntentResult.".toString());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM9118constructorimpl2 = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
        if (thM9121exceptionOrNullimpl2 == null) {
            return (StripeModel) objM9118constructorimpl2;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getSetupIntentResult(Stripe stripe, int i, Intent intent, Continuation<? super SetupIntentResult> continuation) throws IllegalArgumentException, StripeException {
        C07891 c07891;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        if (continuation instanceof C07891) {
            c07891 = (C07891) continuation;
            if ((c07891.label & Integer.MIN_VALUE) != 0) {
                c07891.label -= Integer.MIN_VALUE;
            } else {
                c07891 = new C07891(continuation);
            }
        }
        Object obj = c07891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zIsSetupResult = stripe.isSetupResult(i, intent);
            try {
                Result.Companion companion = Result.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (zIsSetupResult) {
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                    PaymentController paymentController = stripe.getPaymentController();
                    c07891.label = 1;
                    objM9118constructorimpl2 = paymentController.mo7199getSetupIntentResultgIAlus(intent, c07891);
                    if (objM9118constructorimpl2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
                }
            } else {
                throw new IllegalArgumentException("Incorrect requestCode and data for SetupIntentResult.".toString());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM9118constructorimpl2 = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
        if (thM9121exceptionOrNullimpl2 == null) {
            return (StripeModel) objM9118constructorimpl2;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getAuthenticateSourceResult(Stripe stripe, int i, Intent intent, Continuation<? super Source> continuation) throws StripeException {
        C07871 c07871;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        if (continuation instanceof C07871) {
            c07871 = (C07871) continuation;
            if ((c07871.label & Integer.MIN_VALUE) != 0) {
                c07871.label -= Integer.MIN_VALUE;
            } else {
                c07871 = new C07871(continuation);
            }
        }
        Object obj = c07871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zIsAuthenticateSourceResult = stripe.isAuthenticateSourceResult(i, intent);
            try {
                Result.Companion companion = Result.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (zIsAuthenticateSourceResult) {
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                    PaymentController paymentController = stripe.getPaymentController();
                    c07871.label = 1;
                    objM9118constructorimpl2 = paymentController.mo7197getAuthenticateSourceResultgIAlus(intent, c07871);
                    if (objM9118constructorimpl2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
                }
            } else {
                throw new IllegalArgumentException("Incorrect requestCode and data for Source.".toString());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM9118constructorimpl2 = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
        if (thM9121exceptionOrNullimpl2 == null) {
            return (StripeModel) objM9118constructorimpl2;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2);
    }

    public static final /* synthetic */ <ApiObject extends StripeModel> ApiObject runApiRequest(boolean z, Function0<? extends Result<? extends ApiObject>> block) throws StripeException {
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (z) {
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                objM9118constructorimpl2 = block.invoke().getValue();
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
            }
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
            if (thM9121exceptionOrNullimpl2 == null) {
                return (ApiObject) objM9118constructorimpl2;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2);
        }
        Intrinsics.reifiedOperationMarker(4, "ApiObject");
        throw new IllegalArgumentException(("Incorrect requestCode and data for " + StripeModel.class.getSimpleName() + ".").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifyPaymentIntentWithMicrodeposits(Stripe stripe, String str, int i, int i2, Continuation<? super PaymentIntent> continuation) throws StripeException {
        C07951 c07951;
        Object objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk;
        if (continuation instanceof C07951) {
            c07951 = (C07951) continuation;
            if ((c07951.label & Integer.MIN_VALUE) != 0) {
                c07951.label -= Integer.MIN_VALUE;
            } else {
                c07951 = new C07951(continuation);
            }
        }
        C07951 c079512 = c07951;
        Object obj = c079512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c079512.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c079512.label = 1;
            objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk = stripeRepository.mo8062verifyPaymentIntentWithMicrodepositsyxL6bBk(str, i, i2, options, c079512);
            if (objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifyPaymentIntentWithMicrodeposits(Stripe stripe, String str, String str2, Continuation<? super PaymentIntent> continuation) throws StripeException {
        AnonymousClass3 anonymousClass3;
        Object objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        }
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass3.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            anonymousClass3.label = 1;
            objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A = stripeRepository.mo8061verifyPaymentIntentWithMicrodepositsBWLJW6A(str, str2, options, anonymousClass3);
            if (objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifySetupIntentWithMicrodeposits(Stripe stripe, String str, int i, int i2, Continuation<? super SetupIntent> continuation) throws StripeException {
        C07961 c07961;
        Object objMo8064verifySetupIntentWithMicrodepositsyxL6bBk;
        if (continuation instanceof C07961) {
            c07961 = (C07961) continuation;
            if ((c07961.label & Integer.MIN_VALUE) != 0) {
                c07961.label -= Integer.MIN_VALUE;
            } else {
                c07961 = new C07961(continuation);
            }
        }
        C07961 c079612 = c07961;
        Object obj = c079612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c079612.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c079612.label = 1;
            objMo8064verifySetupIntentWithMicrodepositsyxL6bBk = stripeRepository.mo8064verifySetupIntentWithMicrodepositsyxL6bBk(str, i, i2, options, c079612);
            if (objMo8064verifySetupIntentWithMicrodepositsyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8064verifySetupIntentWithMicrodepositsyxL6bBk = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8064verifySetupIntentWithMicrodepositsyxL6bBk);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8064verifySetupIntentWithMicrodepositsyxL6bBk;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object verifySetupIntentWithMicrodeposits(Stripe stripe, String str, String str2, Continuation<? super SetupIntent> continuation) throws StripeException {
        C07973 c07973;
        Object objMo8063verifySetupIntentWithMicrodepositsBWLJW6A;
        if (continuation instanceof C07973) {
            c07973 = (C07973) continuation;
            if ((c07973.label & Integer.MIN_VALUE) != 0) {
                c07973.label -= Integer.MIN_VALUE;
            } else {
                c07973 = new C07973(continuation);
            }
        }
        Object obj = c07973.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07973.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c07973.label = 1;
            objMo8063verifySetupIntentWithMicrodepositsBWLJW6A = stripeRepository.mo8063verifySetupIntentWithMicrodepositsBWLJW6A(str, str2, options, c07973);
            if (objMo8063verifySetupIntentWithMicrodepositsBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8063verifySetupIntentWithMicrodepositsBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8063verifySetupIntentWithMicrodepositsBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objMo8063verifySetupIntentWithMicrodepositsBWLJW6A;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retrievePossibleBrands(Stripe stripe, String str, Continuation<? super PossibleBrands> continuation) throws StripeException {
        C07911 c07911;
        Object objMo8044retrieveCardMetadata0E7RQCE;
        if (continuation instanceof C07911) {
            c07911 = (C07911) continuation;
            if ((c07911.label & Integer.MIN_VALUE) != 0) {
                c07911.label -= Integer.MIN_VALUE;
            } else {
                c07911 = new C07911(continuation);
            }
        }
        Object obj = c07911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07911.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c07911.label = 1;
            objMo8044retrieveCardMetadata0E7RQCE = stripeRepository.mo8044retrieveCardMetadata0E7RQCE(str, options, c07911);
            if (objMo8044retrieveCardMetadata0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8044retrieveCardMetadata0E7RQCE = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objMo8044retrieveCardMetadata0E7RQCE)) {
            Result.Companion companion = Result.INSTANCE;
            List<AccountRange> accountRanges = ((CardMetadata) objMo8044retrieveCardMetadata0E7RQCE).getAccountRanges();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountRanges, 10));
            Iterator<T> it = accountRanges.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountRange) it.next()).getBrand());
            }
            objMo8044retrieveCardMetadata0E7RQCE = new PossibleBrands(CollectionsKt.distinct(arrayList));
        }
        Object objM9118constructorimpl = Result.m9118constructorimpl(objMo8044retrieveCardMetadata0E7RQCE);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return (StripeModel) objM9118constructorimpl;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object attachPaymentMethod(Stripe stripe, String str, String str2, String str3, String str4, String str5, Continuation<? super Result<PaymentMethod>> continuation) {
        AnonymousClass1 anonymousClass1;
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
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = stripe.getStripeRepository();
        Set<String> setEmptySet = SetsKt.emptySet();
        ApiRequest.Options options = new ApiRequest.Options(str3, str5, str4);
        anonymousClass1.label = 1;
        Object objMo8016attachPaymentMethodyxL6bBk = stripeRepository.mo8016attachPaymentMethodyxL6bBk(str2, setEmptySet, str, options, anonymousClass1);
        return objMo8016attachPaymentMethodyxL6bBk == coroutine_suspended ? coroutine_suspended : objMo8016attachPaymentMethodyxL6bBk;
    }

    public static /* synthetic */ Object attachPaymentMethod$default(Stripe stripe, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        String str6 = str4;
        if ((i & 16) != 0) {
            str5 = stripe.getStripeAccountId();
        }
        return attachPaymentMethod(stripe, str, str2, str3, str6, str5, continuation);
    }
}
