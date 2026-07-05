package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.wallet.WalletConstants;
import com.google.mlkit.common.MlKitException;
import com.stripe.android.PaymentController;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
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
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
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
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Stripe.kt */
@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB?\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u000b\u0010\u0014B3\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0015B+\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J2\u0010$\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0007J*\u0010*\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020+0(H\u0007J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010.\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104J(\u00105\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0007J:\u00106\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007082\f\u0010'\u001a\b\u0012\u0004\u0012\u0002090(H\u0007J,\u0010:\u001a\u0002092\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0007J\u001c\u0010;\u001a\u0002092\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010=\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010=\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010@\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010@\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010A\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104J(\u0010B\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020C0(H\u0007J:\u0010D\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007082\f\u0010'\u001a\b\u0012\u0004\u0012\u00020E0(H\u0007J,\u0010F\u001a\u00020E2\u0006\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0007J\u001c\u0010G\u001a\u00020E2\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020K0(H\u0007JF\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020K0(H\u0007J(\u0010Q\u001a\u00020K2\u0006\u0010I\u001a\u00020J2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010R\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J$\u0010R\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010U\u001a\u00020\u00102\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104J\u001c\u0010V\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020T0(J6\u0010W\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020Y2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020T0(H\u0007J(\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020Y2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010\\\u001a\u00020\u001f2\b\b\u0001\u0010]\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020T0(H\u0007J(\u0010^\u001a\u00020T2\b\b\u0001\u0010]\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010_\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020a2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010c\u001a\u00020b2\u0006\u0010`\u001a\u00020a2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010g\u001a\u00020b2\u0006\u0010e\u001a\u00020f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010h\u001a\u00020\u001f2\u0006\u0010i\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010j\u001a\u00020b2\u0006\u0010i\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010k\u001a\u00020\u001f2\u0006\u0010l\u001a\u00020m2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010n\u001a\u00020b2\u0006\u0010l\u001a\u00020m2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J8\u0010o\u001a\u00020\u001f2\b\b\u0001\u0010p\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010q\u001a\u00020b2\u0006\u0010p\u001a\u00020\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J6\u0010r\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020s2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0007J(\u0010t\u001a\u00020b2\u0006\u0010[\u001a\u00020s2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J.\u0010u\u001a\u00020b2\u0006\u0010v\u001a\u00020w2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007H\u0080@¢\u0006\u0004\bx\u0010yJ4\u0010z\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020w2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020b0(H\u0002J6\u0010{\u001a\u00020\u001f2\u0006\u0010|\u001a\u00020}2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020~0(H\u0007J(\u0010\u007f\u001a\u00020~2\u0006\u0010|\u001a\u00020}2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J1\u0010\u0080\u0001\u001a\u00020\u001f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\r\u0010'\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010(2\u000b\b\u0002\u0010 \u001a\u0005\u0018\u00010\u0082\u0001H\u0007J1\u0010\u0083\u0001\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u0002022\u0007\u0010\u0085\u0001\u001a\u0002022\f\u0010'\u001a\b\u0012\u0004\u0012\u0002090(H\u0007J(\u0010\u0083\u0001\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u0002090(H\u0007J1\u0010\u0087\u0001\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\u0007\u0010\u0084\u0001\u001a\u0002022\u0007\u0010\u0085\u0001\u001a\u0002022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020E0(H\u0007J(\u0010\u0087\u0001\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020E0(H\u0007J\u001f\u0010\u0088\u0001\u001a\u00020\u001f2\u0007\u0010\u0089\u0001\u001a\u00020\u00072\r\u0010'\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010(JS\u0010\u008b\u0001\u001a\u00020\u001f\"\n\b\u0000\u0010\u008c\u0001*\u00030\u008d\u00012\r\u0010'\u001a\t\u0012\u0005\u0012\u0003H\u008c\u00010(2'\u0010\u008e\u0001\u001a\"\b\u0001\u0012\u0013\u0012\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u008c\u00010\u0091\u00010\u0090\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008f\u0001H\u0002¢\u0006\u0003\u0010\u0092\u0001J<\u0010\u0093\u0001\u001a\u00020\u001f\"\n\b\u0000\u0010\u008c\u0001*\u00030\u008d\u00012\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008c\u00010\u0091\u00012\r\u0010'\u001a\t\u0012\u0005\u0012\u0003H\u008c\u00010(H\u0082@¢\u0006\u0003\u0010\u0095\u0001JW\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0097\u00010\u0091\u0001\"\u0005\b\u0000\u0010\u008c\u0001\"\u0005\b\u0001\u0010\u0097\u0001*\n\u0012\u0005\u0012\u0003H\u008c\u00010\u0091\u00012\u001d\u0010\u0098\u0001\u001a\u0018\u0012\u0005\u0012\u0003H\u008c\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u0097\u00010\u0091\u00010\u008f\u0001H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/stripe/android/Stripe;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentController", "Lcom/stripe/android/PaymentController;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "context", "Landroid/content/Context;", NamedConstantsKt.ENABLE_LOGGING, "", "betas", "", "Lcom/stripe/android/StripeApiBeta;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V", "getStripeRepository$payments_core_release", "()Lcom/stripe/android/networking/StripeRepository;", "getPaymentController$payments_core_release", "()Lcom/stripe/android/PaymentController;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "getPublishableKey$payments_core_release", "confirmPayment", "", "activity", "Landroidx/activity/ComponentActivity;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmAlipayPayment", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "callback", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/PaymentIntentResult;", "confirmWeChatPayPayment", "Lcom/stripe/android/model/WeChatPayNextAction;", "fragment", "Landroidx/fragment/app/Fragment;", "handleNextActionForPayment", "clientSecret", "isPaymentResult", "requestCode", "", "data", "Landroid/content/Intent;", "onPaymentResult", "retrievePaymentIntent", "expand", "", "Lcom/stripe/android/model/PaymentIntent;", "retrievePaymentIntentSynchronous", "confirmPaymentIntentSynchronous", "idempotencyKey", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionForSetupIntent", "isSetupResult", "onSetupResult", "Lcom/stripe/android/SetupIntentResult;", "retrieveSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "retrieveSetupIntentSynchronous", "confirmSetupIntentSynchronous", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethod;", "updatePaymentMethod", "paymentMethodId", "paymentMethodUpdateParams", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "ephemeralKeySecret", "createPaymentMethodSynchronous", "authenticateSource", "source", "Lcom/stripe/android/model/Source;", "isAuthenticateSourceResult", "onAuthenticateSourceResult", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSourceSynchronous", NativeProtocol.WEB_DIALOG_PARAMS, "retrieveSource", "sourceId", "retrieveSourceSynchronous", "createAccountToken", "accountParams", "Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/Token;", "createAccountTokenSynchronous", "createBankAccountToken", "bankAccountTokenParams", "Lcom/stripe/android/model/BankAccountTokenParams;", "createBankAccountTokenSynchronous", "createPiiToken", "personalId", "createPiiTokenSynchronous", "createCardToken", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardTokenSynchronous", "createCvcUpdateToken", "cvc", "createCvcUpdateTokenSynchronous", "createPersonToken", "Lcom/stripe/android/model/PersonTokenParams;", "createPersonTokenSynchronous", "createTokenOrThrow", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createTokenOrThrow$payments_core_release", "(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "createFile", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "Lcom/stripe/android/core/model/StripeFile;", "createFileSynchronous", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "Landroidx/appcompat/app/AppCompatActivity;", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "secondAmount", "descriptorCode", "verifySetupIntentWithMicrodeposits", "retrievePossibleBrands", "cardNumber", "Lcom/stripe/android/model/PossibleBrands;", "executeAsyncForResult", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/core/model/StripeModel;", "apiMethod", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V", "dispatchResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "block", "flatMap-KWTtemM$payments_core_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Stripe {
    public static final String VERSION = "AndroidBindings/21.22.2";
    public static final String VERSION_NAME = "21.22.2";
    private static AppInfo appInfo;
    private final PaymentController paymentController;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final String API_VERSION = ApiVersion.INSTANCE.get().getCode();
    private static boolean advancedFraudSignalsEnabled = true;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey) {
        this(context, publishableKey, (String) null, false, (Set) null, 28, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey, String str) {
        this(context, publishableKey, str, false, (Set) null, 24, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey, String str, boolean z) {
        this(context, publishableKey, str, z, (Set) null, 16, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(String str) {
        return str;
    }

    public static final boolean getAdvancedFraudSignalsEnabled() {
        return INSTANCE.getAdvancedFraudSignalsEnabled();
    }

    public static final AppInfo getAppInfo() {
        return INSTANCE.getAppInfo();
    }

    public static final void setAdvancedFraudSignalsEnabled(boolean z) {
        INSTANCE.setAdvancedFraudSignalsEnabled(z);
    }

    public static final void setAppInfo(AppInfo appInfo2) {
        INSTANCE.setAppInfo(appInfo2);
    }

    public final void authenticateSource(ComponentActivity activity, Source source) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        authenticateSource$default(this, activity, source, (String) null, 4, (Object) null);
    }

    public final void authenticateSource(Fragment fragment, Source source) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(source, "source");
        authenticateSource$default(this, fragment, source, (String) null, 4, (Object) null);
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(callback, "callback");
        confirmAlipayPayment$default(this, confirmPaymentIntentParams, authenticator, null, callback, 4, null);
    }

    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, activity, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, fragment, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}")
    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        return confirmPaymentIntentSynchronous$default(this, confirmPaymentIntentParams, null, 2, null);
    }

    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, activity, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, fragment, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    @Deprecated(message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}")
    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        return confirmSetupIntentSynchronous$default(this, confirmSetupIntentParams, null, 2, null);
    }

    @Deprecated(message = "Use the WeChat Pay module instead.")
    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiResultCallback<? super WeChatPayNextAction> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        confirmWeChatPayPayment$default(this, confirmPaymentIntentParams, null, callback, 2, null);
    }

    public final void createAccountToken(AccountParams accountParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createAccountToken$default(this, accountParams, null, null, callback, 6, null);
    }

    public final void createAccountToken(AccountParams accountParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createAccountToken$default(this, accountParams, str, null, callback, 4, null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, null, null, 6, null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, str, null, 4, null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, null, null, callback, 6, null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, str, null, callback, 4, null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, null, null, 6, null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, str, null, 4, null);
    }

    public final void createCardToken(CardParams cardParams, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCardToken$default(this, cardParams, null, null, callback, 6, null);
    }

    public final void createCardToken(CardParams cardParams, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCardToken$default(this, cardParams, str, null, callback, 4, null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, null, null, 6, null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String str) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, str, null, 4, null);
    }

    public final void createCvcUpdateToken(String cvc, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCvcUpdateToken$default(this, cvc, null, null, callback, 6, null);
    }

    public final void createCvcUpdateToken(String cvc, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createCvcUpdateToken$default(this, cvc, str, null, callback, 4, null);
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, null, null, 6, null);
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc, String str) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, str, null, 4, null);
    }

    public final void createFile(StripeFileParams fileParams, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createFile$default(this, fileParams, null, null, callback, 6, null);
    }

    public final void createFile(StripeFileParams fileParams, String str, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createFile$default(this, fileParams, str, null, callback, 4, null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, null, null, 6, null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String str) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, str, null, 4, null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, null, null, callback, 6, null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, str, null, callback, 4, null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, null, null, 6, null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, str, null, 4, null);
    }

    public final void createPersonToken(PersonTokenParams params, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPersonToken$default(this, params, null, null, callback, 6, null);
    }

    public final void createPersonToken(PersonTokenParams params, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPersonToken$default(this, params, str, null, callback, 4, null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createPersonTokenSynchronous$default(this, params, null, null, 6, null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params, String str) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createPersonTokenSynchronous$default(this, params, str, null, 4, null);
    }

    public final void createPiiToken(String personalId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPiiToken$default(this, personalId, null, null, callback, 6, null);
    }

    public final void createPiiToken(String personalId, String str, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createPiiToken$default(this, personalId, str, null, callback, 4, null);
    }

    public final Token createPiiTokenSynchronous(String personalId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, null, null, 6, null);
    }

    public final Token createPiiTokenSynchronous(String personalId, String str) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, str, null, 4, null);
    }

    public final void createRadarSession(ApiResultCallback<? super RadarSession> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        createRadarSession$default(this, null, callback, null, 5, null);
    }

    public final void createRadarSession(String str, ApiResultCallback<? super RadarSession> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        createRadarSession$default(this, str, callback, null, 4, null);
    }

    public final void createSource(SourceParams sourceParams, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createSource$default(this, sourceParams, null, null, callback, 6, null);
    }

    public final void createSource(SourceParams sourceParams, String str, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createSource$default(this, sourceParams, str, null, callback, 4, null);
    }

    public final Source createSourceSynchronous(SourceParams params) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createSourceSynchronous$default(this, params, null, null, 6, null);
    }

    public final Source createSourceSynchronous(SourceParams params, String str) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return createSourceSynchronous$default(this, params, str, null, 4, null);
    }

    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForPayment(Fragment fragment, String clientSecret) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    public final void retrievePaymentIntent(String clientSecret, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrievePaymentIntent$default(this, clientSecret, null, null, callback, 6, null);
    }

    public final void retrievePaymentIntent(String clientSecret, String str, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrievePaymentIntent$default(this, clientSecret, str, null, callback, 4, null);
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrievePaymentIntentSynchronous$default(this, clientSecret, null, null, 6, null);
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret, String str) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrievePaymentIntentSynchronous$default(this, clientSecret, str, null, 4, null);
    }

    public final void retrieveSetupIntent(String clientSecret, ApiResultCallback<? super SetupIntent> callback) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSetupIntent$default(this, clientSecret, null, null, callback, 6, null);
    }

    public final void retrieveSetupIntent(String clientSecret, String str, ApiResultCallback<? super SetupIntent> callback) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSetupIntent$default(this, clientSecret, str, null, callback, 4, null);
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSetupIntentSynchronous$default(this, clientSecret, null, null, 6, null);
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret, String str) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSetupIntentSynchronous$default(this, clientSecret, str, null, 4, null);
    }

    public final void retrieveSource(String sourceId, String clientSecret, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        retrieveSource$default(this, sourceId, clientSecret, null, callback, 4, null);
    }

    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return retrieveSourceSynchronous$default(this, sourceId, clientSecret, null, 4, null);
    }

    public final void updatePaymentMethod(String paymentMethodId, PaymentMethodUpdateParams paymentMethodUpdateParams, String ephemeralKeySecret, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(paymentMethodUpdateParams, "paymentMethodUpdateParams");
        Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        updatePaymentMethod$default(this, paymentMethodId, paymentMethodUpdateParams, ephemeralKeySecret, null, null, callback, 24, null);
    }

    public final void updatePaymentMethod(String paymentMethodId, PaymentMethodUpdateParams paymentMethodUpdateParams, String ephemeralKeySecret, String str, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(paymentMethodUpdateParams, "paymentMethodUpdateParams");
        Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        updatePaymentMethod$default(this, paymentMethodId, paymentMethodUpdateParams, ephemeralKeySecret, str, null, callback, 16, null);
    }

    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.publishableKey = new ApiKeyValidator().requireValid(publishableKey);
    }

    /* renamed from: getStripeRepository$payments_core_release, reason: from getter */
    public final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    /* renamed from: getPaymentController$payments_core_release, reason: from getter */
    public final PaymentController getPaymentController() {
        return this.paymentController;
    }

    /* renamed from: getStripeAccountId$payments_core_release, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public /* synthetic */ Stripe(StripeRepository stripeRepository, PaymentController paymentController, String str, String str2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, paymentController, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* renamed from: getPublishableKey$payments_core_release, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public /* synthetic */ Stripe(Context context, String str, String str2, boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (Set<? extends StripeApiBeta>) ((i & 16) != 0 ? SetsKt.emptySet() : set));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Stripe(Context context, final String publishableKey, String str, boolean z, Set<? extends StripeApiBeta> betas) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        this(applicationContext, new StripeApiRepository(applicationContext2, new Function0() { // from class: com.stripe.android.Stripe$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Stripe._init_$lambda$0(publishableKey);
            }
        }, appInfo, Logger.INSTANCE.getInstance(z), null, null, null, null, null, null, null, null, betas, null, null, 28656, null), ApiKeyValidator.INSTANCE.get().requireValid(publishableKey), str, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Stripe(Context context, StripeRepository stripeRepository, final String str, String str2, boolean z) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(stripeRepository, new StripePaymentController(applicationContext, new Function0() { // from class: com.stripe.android.Stripe$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Stripe._init_$lambda$1(str);
            }
        }, stripeRepository, z, null, null, null, null, null, 496, null), str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, Dispatchers.getIO());
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(componentActivity, confirmPaymentIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmPayment$1", f = "Stripe.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07371(ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super C07371> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07371(this.$activity, this.$confirmPaymentIntentParams, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startConfirmAndAuth(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this.$activity, null, 2, null), this.$confirmPaymentIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C07371(activity, confirmPaymentIntentParams, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmAlipayPayment(confirmPaymentIntentParams, alipayAuthenticator, str, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/PaymentIntentResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmAlipayPayment$1", f = "Stripe.kt", i = {}, l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmAlipayPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07361 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentIntentResult>>, Object> {
        final /* synthetic */ AlipayAuthenticator $authenticator;
        final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07361(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, Continuation<? super C07361> continuation) {
            super(1, continuation);
            this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
            this.$authenticator = alipayAuthenticator;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07361(this.$confirmPaymentIntentParams, this.$authenticator, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentIntentResult>> continuation) {
            return invoke2((Continuation<? super Result<PaymentIntentResult>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentIntentResult>> continuation) {
            return ((C07361) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7195confirmAndAuthenticateAlipayBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7195confirmAndAuthenticateAlipayBWLJW6A = Stripe.this.getPaymentController().mo7195confirmAndAuthenticateAlipayBWLJW6A(this.$confirmPaymentIntentParams, this.$authenticator, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this);
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
            return Result.m9117boximpl(objMo7195confirmAndAuthenticateAlipayBWLJW6A);
        }
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, String stripeAccountId, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07361(confirmPaymentIntentParams, authenticator, stripeAccountId, null));
    }

    public static /* synthetic */ void confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmWeChatPayPayment(confirmPaymentIntentParams, str, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/WeChatPayNextAction;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmWeChatPayPayment$1", f = "Stripe.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmWeChatPayPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07431 extends SuspendLambda implements Function1<Continuation<? super Result<? extends WeChatPayNextAction>>, Object> {
        final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07431(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super C07431> continuation) {
            super(1, continuation);
            this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07431(this.$confirmPaymentIntentParams, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends WeChatPayNextAction>> continuation) {
            return invoke2((Continuation<? super Result<WeChatPayNextAction>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<WeChatPayNextAction>> continuation) {
            return ((C07431) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7196confirmWeChatPay0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7196confirmWeChatPay0E7RQCE = Stripe.this.getPaymentController().mo7196confirmWeChatPay0E7RQCE(this.$confirmPaymentIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this);
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
            return Result.m9117boximpl(objMo7196confirmWeChatPay0E7RQCE);
        }
    }

    @Deprecated(message = "Use the WeChat Pay module instead.")
    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, String stripeAccountId, ApiResultCallback<? super WeChatPayNextAction> callback) {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07431(confirmPaymentIntentParams, stripeAccountId, null));
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(fragment, confirmPaymentIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmPayment$2", f = "Stripe.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmPayment$2, reason: invalid class name and case insensitive filesystem */
    static final class C07382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07382(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super C07382> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07382(this.$fragment, this.$confirmPaymentIntentParams, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startConfirmAndAuth(AuthActivityStarterHost.INSTANCE.create(this.$fragment), this.$confirmPaymentIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C07382(fragment, confirmPaymentIntentParams, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(componentActivity, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$handleNextActionForPayment$1", f = "Stripe.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$handleNextActionForPayment$1, reason: invalid class name and case insensitive filesystem */
    static final class C07601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07601(ComponentActivity componentActivity, String str, String str2, Continuation<? super C07601> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07601(this.$activity, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startAuth(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this.$activity, null, 2, null), new PaymentIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), PaymentController.StripeIntentType.PaymentIntent, this) == coroutine_suspended) {
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

    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C07601(activity, clientSecret, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(fragment, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$handleNextActionForPayment$2", f = "Stripe.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$handleNextActionForPayment$2, reason: invalid class name and case insensitive filesystem */
    static final class C07612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07612(Fragment fragment, String str, String str2, Continuation<? super C07612> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07612(this.$fragment, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startAuth(AuthActivityStarterHost.INSTANCE.create(this.$fragment), new PaymentIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), PaymentController.StripeIntentType.PaymentIntent, this) == coroutine_suspended) {
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

    public final void handleNextActionForPayment(Fragment fragment, String clientSecret, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C07612(fragment, clientSecret, stripeAccountId, null), 3, null);
    }

    public final boolean isPaymentResult(int requestCode, Intent data) {
        return data != null && this.paymentController.shouldHandlePaymentResult(requestCode, data);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/PaymentIntentResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$onPaymentResult$1", f = "Stripe.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$onPaymentResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07651 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentIntentResult>>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07651(Intent intent, Continuation<? super C07651> continuation) {
            super(1, continuation);
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07651(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentIntentResult>> continuation) {
            return invoke2((Continuation<? super Result<PaymentIntentResult>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentIntentResult>> continuation) {
            return ((C07651) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7198getPaymentIntentResultgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7198getPaymentIntentResultgIAlus = Stripe.this.getPaymentController().mo7198getPaymentIntentResultgIAlus(this.$data, this);
                if (objMo7198getPaymentIntentResultgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7198getPaymentIntentResultgIAlus = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo7198getPaymentIntentResultgIAlus);
        }
    }

    public final boolean onPaymentResult(int requestCode, Intent data, ApiResultCallback<? super PaymentIntentResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (data == null || !isPaymentResult(requestCode, data)) {
            return false;
        }
        executeAsyncForResult(callback, new C07651(data, null));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void retrievePaymentIntent$default(Stripe stripe, String str, String str2, List list, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        stripe.retrievePaymentIntent(str, str2, list, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrievePaymentIntent$1", f = "Stripe.kt", i = {}, l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrievePaymentIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07671 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ List<String> $expand;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07671(String str, String str2, List<String> list, Continuation<? super C07671> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
            this.$expand = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07671(this.$clientSecret, this.$stripeAccountId, this.$expand, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super Result<PaymentIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentIntent>> continuation) {
            return ((C07671) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8049retrievePaymentIntentBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8049retrievePaymentIntentBWLJW6A = Stripe.this.getStripeRepository().mo8049retrievePaymentIntentBWLJW6A(this.$clientSecret, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this.$expand, this);
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
            return Result.m9117boximpl(objMo8049retrievePaymentIntentBWLJW6A);
        }
    }

    public final void retrievePaymentIntent(String clientSecret, String stripeAccountId, List<String> expand, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07671(clientSecret, stripeAccountId, expand, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentIntent retrievePaymentIntentSynchronous$default(Stripe stripe, String str, String str2, List list, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return stripe.retrievePaymentIntentSynchronous(str, str2, list);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/PaymentIntent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrievePaymentIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrievePaymentIntentSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentIntent>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ List<String> $expand;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07681(String str, String str2, List<String> list, Continuation<? super C07681> continuation) {
            super(2, continuation);
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
            this.$expand = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07681(this.$clientSecret, this.$stripeAccountId, this.$expand, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentIntent> continuation) {
            return ((C07681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8049retrievePaymentIntentBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8049retrievePaymentIntentBWLJW6A = Stripe.this.getStripeRepository().mo8049retrievePaymentIntentBWLJW6A(new PaymentIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this.$expand, this);
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
                return objMo8049retrievePaymentIntentBWLJW6A;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret, String stripeAccountId, List<String> expand) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        return (PaymentIntent) BuildersKt__BuildersKt.runBlocking$default(null, new C07681(clientSecret, stripeAccountId, expand, null), 1, null);
    }

    public static /* synthetic */ PaymentIntent confirmPaymentIntentSynchronous$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmPaymentIntentSynchronous(confirmPaymentIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/PaymentIntent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmPaymentIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmPaymentIntentSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentIntent>, Object> {
        final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
        final /* synthetic */ String $idempotencyKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07391(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, Continuation<? super C07391> continuation) {
            super(2, continuation);
            this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
            this.$idempotencyKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07391(this.$confirmPaymentIntentParams, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentIntent> continuation) {
            return ((C07391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objM8065confirmPaymentIntentBWLJW6A$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objM8065confirmPaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8065confirmPaymentIntentBWLJW6A$default(Stripe.this.getStripeRepository(), this.$confirmPaymentIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), this.$idempotencyKey), null, this, 4, null);
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
                return objM8065confirmPaymentIntentBWLJW6A$default;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    @Deprecated(message = "use {@link #confirmPayment(Activity, ConfirmPaymentIntentParams)}")
    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams, String idempotencyKey) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        return (PaymentIntent) BuildersKt__BuildersKt.runBlocking$default(null, new C07391(confirmPaymentIntentParams, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(componentActivity, confirmSetupIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmSetupIntent$1", f = "Stripe.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07401(ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, Continuation<? super C07401> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$confirmSetupIntentParams = confirmSetupIntentParams;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07401(this.$activity, this.$confirmSetupIntentParams, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startConfirmAndAuth(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this.$activity, null, 2, null), this.$confirmSetupIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C07401(activity, confirmSetupIntentParams, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(fragment, confirmSetupIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmSetupIntent$2", f = "Stripe.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmSetupIntent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07412(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str, Continuation<? super C07412> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$confirmSetupIntentParams = confirmSetupIntentParams;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07412(this.$fragment, this.$confirmSetupIntentParams, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startConfirmAndAuth(AuthActivityStarterHost.INSTANCE.create(this.$fragment), this.$confirmSetupIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C07412(fragment, confirmSetupIntentParams, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(componentActivity, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$handleNextActionForSetupIntent$1", f = "Stripe.kt", i = {}, l = {565}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$handleNextActionForSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07621(ComponentActivity componentActivity, String str, String str2, Continuation<? super C07621> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07621(this.$activity, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startAuth(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this.$activity, null, 2, null), new SetupIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), PaymentController.StripeIntentType.SetupIntent, this) == coroutine_suspended) {
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

    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C07621(activity, clientSecret, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, Fragment fragment, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(fragment, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$handleNextActionForSetupIntent$2", f = "Stripe.kt", i = {}, l = {595}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$handleNextActionForSetupIntent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07632(Fragment fragment, String str, String str2, Continuation<? super C07632> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07632(this.$fragment, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Stripe.this.getPaymentController().startAuth(AuthActivityStarterHost.INSTANCE.create(this.$fragment), new SetupIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), PaymentController.StripeIntentType.SetupIntent, this) == coroutine_suspended) {
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

    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C07632(fragment, clientSecret, stripeAccountId, null), 3, null);
    }

    public final boolean isSetupResult(int requestCode, Intent data) {
        return data != null && this.paymentController.shouldHandleSetupResult(requestCode, data);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/SetupIntentResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$onSetupResult$1", f = "Stripe.kt", i = {}, l = {633}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$onSetupResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07661 extends SuspendLambda implements Function1<Continuation<? super Result<? extends SetupIntentResult>>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07661(Intent intent, Continuation<? super C07661> continuation) {
            super(1, continuation);
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07661(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends SetupIntentResult>> continuation) {
            return invoke2((Continuation<? super Result<SetupIntentResult>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<SetupIntentResult>> continuation) {
            return ((C07661) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7199getSetupIntentResultgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7199getSetupIntentResultgIAlus = Stripe.this.getPaymentController().mo7199getSetupIntentResultgIAlus(this.$data, this);
                if (objMo7199getSetupIntentResultgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7199getSetupIntentResultgIAlus = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo7199getSetupIntentResultgIAlus);
        }
    }

    public final boolean onSetupResult(int requestCode, Intent data, ApiResultCallback<? super SetupIntentResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (data == null || !isSetupResult(requestCode, data)) {
            return false;
        }
        executeAsyncForResult(callback, new C07661(data, null));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void retrieveSetupIntent$default(Stripe stripe, String str, String str2, List list, ApiResultCallback apiResultCallback, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        stripe.retrieveSetupIntent(str, str2, list, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/SetupIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSetupIntent$1", f = "Stripe.kt", i = {}, l = {668}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrieveSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C07701 extends SuspendLambda implements Function1<Continuation<? super Result<? extends SetupIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ List<String> $expand;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07701(String str, String str2, List<String> list, Continuation<? super C07701> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
            this.$expand = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07701(this.$clientSecret, this.$stripeAccountId, this.$expand, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super Result<SetupIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<SetupIntent>> continuation) {
            return ((C07701) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8051retrieveSetupIntentBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8051retrieveSetupIntentBWLJW6A = Stripe.this.getStripeRepository().mo8051retrieveSetupIntentBWLJW6A(this.$clientSecret, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this.$expand, this);
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
            return Result.m9117boximpl(objMo8051retrieveSetupIntentBWLJW6A);
        }
    }

    public final void retrieveSetupIntent(String clientSecret, String stripeAccountId, List<String> expand, ApiResultCallback<? super SetupIntent> callback) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07701(clientSecret, stripeAccountId, expand, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetupIntent retrieveSetupIntentSynchronous$default(Stripe stripe, String str, String str2, List list, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return stripe.retrieveSetupIntentSynchronous(str, str2, list);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/SetupIntent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSetupIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {TypedValues.TransitionType.TYPE_STAGGERED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrieveSetupIntentSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SetupIntent>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ List<String> $expand;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07711(String str, String str2, List<String> list, Continuation<? super C07711> continuation) {
            super(2, continuation);
            this.$clientSecret = str;
            this.$stripeAccountId = str2;
            this.$expand = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07711(this.$clientSecret, this.$stripeAccountId, this.$expand, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SetupIntent> continuation) {
            return ((C07711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8051retrieveSetupIntentBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8051retrieveSetupIntentBWLJW6A = Stripe.this.getStripeRepository().mo8051retrieveSetupIntentBWLJW6A(new SetupIntent.ClientSecret(this.$clientSecret).getValue$payments_core_release(), new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this.$expand, this);
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
                return objMo8051retrieveSetupIntentBWLJW6A;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret, String stripeAccountId, List<String> expand) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(expand, "expand");
        return (SetupIntent) BuildersKt__BuildersKt.runBlocking$default(null, new C07711(clientSecret, stripeAccountId, expand, null), 1, null);
    }

    public static /* synthetic */ SetupIntent confirmSetupIntentSynchronous$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        return stripe.confirmSetupIntentSynchronous(confirmSetupIntentParams, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/SetupIntent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$confirmSetupIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {743}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$confirmSetupIntentSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SetupIntent>, Object> {
        final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
        final /* synthetic */ String $idempotencyKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07421(ConfirmSetupIntentParams confirmSetupIntentParams, String str, Continuation<? super C07421> continuation) {
            super(2, continuation);
            this.$confirmSetupIntentParams = confirmSetupIntentParams;
            this.$idempotencyKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07421(this.$confirmSetupIntentParams, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SetupIntent> continuation) {
            return ((C07421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objM8066confirmSetupIntentBWLJW6A$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objM8066confirmSetupIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8066confirmSetupIntentBWLJW6A$default(Stripe.this.getStripeRepository(), this.$confirmSetupIntentParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), this.$idempotencyKey), null, this, 4, null);
                if (objM8066confirmSetupIntentBWLJW6A$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM8066confirmSetupIntentBWLJW6A$default = ((Result) obj).getValue();
            }
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8066confirmSetupIntentBWLJW6A$default);
            if (thM9121exceptionOrNullimpl == null) {
                return objM8066confirmSetupIntentBWLJW6A$default;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    @Deprecated(message = "use {@link #confirmSetupIntent(Activity, ConfirmSetupIntentParams)}")
    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams, String idempotencyKey) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(confirmSetupIntentParams, "confirmSetupIntentParams");
        return (SetupIntent) BuildersKt__BuildersKt.runBlocking$default(null, new C07421(confirmSetupIntentParams, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPaymentMethod(paymentMethodCreateParams, str, str2, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createPaymentMethod$1", f = "Stripe.kt", i = {}, l = {779}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C07501 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentMethod>>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07501(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super C07501> continuation) {
            super(1, continuation);
            this.$paymentMethodCreateParams = paymentMethodCreateParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07501(this.$paymentMethodCreateParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentMethod>> continuation) {
            return invoke2((Continuation<? super Result<PaymentMethod>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentMethod>> continuation) {
            return ((C07501) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8025createPaymentMethod0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8025createPaymentMethod0E7RQCE = Stripe.this.getStripeRepository().mo8025createPaymentMethod0E7RQCE(this.$paymentMethodCreateParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
            return Result.m9117boximpl(objMo8025createPaymentMethod0E7RQCE);
        }
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07501(paymentMethodCreateParams, stripeAccountId, idempotencyKey, null));
    }

    public static /* synthetic */ void updatePaymentMethod$default(Stripe stripe, String str, PaymentMethodUpdateParams paymentMethodUpdateParams, String str2, String str3, String str4, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            str4 = stripe.stripeAccountId;
        }
        stripe.updatePaymentMethod(str, paymentMethodUpdateParams, str2, str5, str4, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$updatePaymentMethod$1", f = "Stripe.kt", i = {}, l = {815}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$updatePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C07741 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentMethod>>, Object> {
        final /* synthetic */ String $ephemeralKeySecret;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $paymentMethodId;
        final /* synthetic */ PaymentMethodUpdateParams $paymentMethodUpdateParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07741(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, String str2, String str3, String str4, Continuation<? super C07741> continuation) {
            super(1, continuation);
            this.$paymentMethodId = str;
            this.$paymentMethodUpdateParams = paymentMethodUpdateParams;
            this.$ephemeralKeySecret = str2;
            this.$stripeAccountId = str3;
            this.$idempotencyKey = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07741(this.$paymentMethodId, this.$paymentMethodUpdateParams, this.$ephemeralKeySecret, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentMethod>> continuation) {
            return invoke2((Continuation<? super Result<PaymentMethod>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentMethod>> continuation) {
            return ((C07741) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8060updatePaymentMethodBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8060updatePaymentMethodBWLJW6A = Stripe.this.getStripeRepository().mo8060updatePaymentMethodBWLJW6A(this.$paymentMethodId, this.$paymentMethodUpdateParams, new ApiRequest.Options(this.$ephemeralKeySecret, this.$stripeAccountId, this.$idempotencyKey), this);
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
            return Result.m9117boximpl(objMo8060updatePaymentMethodBWLJW6A);
        }
    }

    public final void updatePaymentMethod(String paymentMethodId, PaymentMethodUpdateParams paymentMethodUpdateParams, String ephemeralKeySecret, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(paymentMethodUpdateParams, "paymentMethodUpdateParams");
        Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07741(paymentMethodId, paymentMethodUpdateParams, ephemeralKeySecret, stripeAccountId, idempotencyKey, null));
    }

    public static /* synthetic */ PaymentMethod createPaymentMethodSynchronous$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPaymentMethodSynchronous(paymentMethodCreateParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createPaymentMethodSynchronous$1", f = "Stripe.kt", i = {}, l = {855}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createPaymentMethodSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PaymentMethod>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07511(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super C07511> continuation) {
            super(2, continuation);
            this.$paymentMethodCreateParams = paymentMethodCreateParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07511(this.$paymentMethodCreateParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentMethod> continuation) {
            return ((C07511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8025createPaymentMethod0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8025createPaymentMethod0E7RQCE = Stripe.this.getStripeRepository().mo8025createPaymentMethod0E7RQCE(this.$paymentMethodCreateParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
                return objMo8025createPaymentMethod0E7RQCE;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String idempotencyKey, String stripeAccountId) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        return (PaymentMethod) BuildersKt__BuildersKt.runBlocking$default(null, new C07511(paymentMethodCreateParams, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, ComponentActivity componentActivity, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(componentActivity, source, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$authenticateSource$1", f = "Stripe.kt", i = {}, l = {888}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$authenticateSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComponentActivity $activity;
        final /* synthetic */ Source $source;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentActivity componentActivity, Source source, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.$source = source;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new AnonymousClass1(this.$activity, this.$source, this.$stripeAccountId, continuation);
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
                if (Stripe.this.getPaymentController().startAuthenticateSource(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this.$activity, null, 2, null), this.$source, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void authenticateSource(ComponentActivity activity, Source source, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new AnonymousClass1(activity, source, stripeAccountId, null), 3, null);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, Fragment fragment, Source source, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(fragment, source, str);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$authenticateSource$2", f = "Stripe.kt", i = {}, l = {914}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$authenticateSource$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ Source $source;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Fragment fragment, Source source, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.$source = source;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new AnonymousClass2(this.$fragment, this.$source, this.$stripeAccountId, continuation);
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
                this.label = 1;
                if (Stripe.this.getPaymentController().startAuthenticateSource(AuthActivityStarterHost.INSTANCE.create(this.$fragment), this.$source, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this) == coroutine_suspended) {
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

    public final void authenticateSource(Fragment fragment, Source source, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(source, "source");
        LifecycleOwnerKt.getLifecycleScope(fragment).launchWhenCreated(new AnonymousClass2(fragment, source, stripeAccountId, null));
    }

    public final boolean isAuthenticateSourceResult(int requestCode, Intent data) {
        return data != null && this.paymentController.shouldHandleSourceResult(requestCode, data);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/Source;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$onAuthenticateSourceResult$1", f = "Stripe.kt", i = {}, l = {946}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$onAuthenticateSourceResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07641 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Source>>, Object> {
        final /* synthetic */ Intent $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07641(Intent intent, Continuation<? super C07641> continuation) {
            super(1, continuation);
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07641(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Source>> continuation) {
            return invoke2((Continuation<? super Result<Source>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Source>> continuation) {
            return ((C07641) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7197getAuthenticateSourceResultgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo7197getAuthenticateSourceResultgIAlus = Stripe.this.getPaymentController().mo7197getAuthenticateSourceResultgIAlus(this.$data, this);
                if (objMo7197getAuthenticateSourceResultgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7197getAuthenticateSourceResultgIAlus = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo7197getAuthenticateSourceResultgIAlus);
        }
    }

    public final void onAuthenticateSourceResult(Intent data, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07641(data, null));
    }

    public static /* synthetic */ void createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createSource(sourceParams, str, str2, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/Source;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createSource$1", f = "Stripe.kt", i = {}, l = {971}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createSource$1, reason: invalid class name and case insensitive filesystem */
    static final class C07551 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Source>>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ SourceParams $sourceParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07551(SourceParams sourceParams, String str, String str2, Continuation<? super C07551> continuation) {
            super(1, continuation);
            this.$sourceParams = sourceParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07551(this.$sourceParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Source>> continuation) {
            return invoke2((Continuation<? super Result<Source>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Source>> continuation) {
            return ((C07551) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8029createSource0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8029createSource0E7RQCE = Stripe.this.getStripeRepository().mo8029createSource0E7RQCE(this.$sourceParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
            return Result.m9117boximpl(objMo8029createSource0E7RQCE);
        }
    }

    public final void createSource(SourceParams sourceParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceParams, "sourceParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07551(sourceParams, stripeAccountId, idempotencyKey, null));
    }

    public static /* synthetic */ Source createSourceSynchronous$default(Stripe stripe, SourceParams sourceParams, String str, String str2, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createSourceSynchronous(sourceParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Source;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createSourceSynchronous$1", f = "Stripe.kt", i = {}, l = {PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createSourceSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Source>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ SourceParams $params;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07561(SourceParams sourceParams, String str, String str2, Continuation<? super C07561> continuation) {
            super(2, continuation);
            this.$params = sourceParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07561(this.$params, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Source> continuation) {
            return ((C07561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8029createSource0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8029createSource0E7RQCE = Stripe.this.getStripeRepository().mo8029createSource0E7RQCE(this.$params, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
                return objMo8029createSource0E7RQCE;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final Source createSourceSynchronous(SourceParams params, String idempotencyKey, String stripeAccountId) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return (Source) BuildersKt__BuildersKt.runBlocking$default(null, new C07561(params, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void retrieveSource$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.retrieveSource(str, str2, str3, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/Source;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSource$1", f = "Stripe.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrieveSource$1, reason: invalid class name and case insensitive filesystem */
    static final class C07721 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Source>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $sourceId;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07721(String str, String str2, String str3, Continuation<? super C07721> continuation) {
            super(1, continuation);
            this.$sourceId = str;
            this.$clientSecret = str2;
            this.$stripeAccountId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07721(this.$sourceId, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Source>> continuation) {
            return invoke2((Continuation<? super Result<Source>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Source>> continuation) {
            return ((C07721) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8052retrieveSourceBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8052retrieveSourceBWLJW6A = Stripe.this.getStripeRepository().mo8052retrieveSourceBWLJW6A(this.$sourceId, this.$clientSecret, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this);
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
            return Result.m9117boximpl(objMo8052retrieveSourceBWLJW6A);
        }
    }

    public final void retrieveSource(String sourceId, String clientSecret, String stripeAccountId, ApiResultCallback<? super Source> callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07721(sourceId, clientSecret, stripeAccountId, null));
    }

    public static /* synthetic */ Source retrieveSourceSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.retrieveSourceSynchronous(str, str2, str3);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Source;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSourceSynchronous$1", f = "Stripe.kt", i = {}, l = {1097}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrieveSourceSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Source>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $sourceId;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07731(String str, String str2, String str3, Continuation<? super C07731> continuation) {
            super(2, continuation);
            this.$sourceId = str;
            this.$clientSecret = str2;
            this.$stripeAccountId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07731(this.$sourceId, this.$clientSecret, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Source> continuation) {
            return ((C07731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8052retrieveSourceBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8052retrieveSourceBWLJW6A = Stripe.this.getStripeRepository().mo8052retrieveSourceBWLJW6A(this.$sourceId, this.$clientSecret, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this);
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
                return objMo8052retrieveSourceBWLJW6A;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret, String stripeAccountId) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return (Source) BuildersKt__BuildersKt.runBlocking$default(null, new C07731(sourceId, clientSecret, stripeAccountId, null), 1, null);
    }

    public static /* synthetic */ void createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createAccountToken(accountParams, str, str2, apiResultCallback);
    }

    public final void createAccountToken(AccountParams accountParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(accountParams, stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createAccountTokenSynchronous$default(Stripe stripe, AccountParams accountParams, String str, String str2, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createAccountTokenSynchronous(accountParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createAccountTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createAccountTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ AccountParams $accountParams;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07441(AccountParams accountParams, String str, String str2, Continuation<? super C07441> continuation) {
            super(2, continuation);
            this.$accountParams = accountParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07441(this.$accountParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(this.$accountParams, this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String idempotencyKey, String stripeAccountId) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(accountParams, "accountParams");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07441(accountParams, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createBankAccountToken(bankAccountTokenParams, str, str2, apiResultCallback);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(bankAccountTokenParams, stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createBankAccountTokenSynchronous$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createBankAccountTokenSynchronous(bankAccountTokenParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createBankAccountTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createBankAccountTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ BankAccountTokenParams $bankAccountTokenParams;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07451(BankAccountTokenParams bankAccountTokenParams, String str, String str2, Continuation<? super C07451> continuation) {
            super(2, continuation);
            this.$bankAccountTokenParams = bankAccountTokenParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07451(this.$bankAccountTokenParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(this.$bankAccountTokenParams, this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String idempotencyKey, String stripeAccountId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(bankAccountTokenParams, "bankAccountTokenParams");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07451(bankAccountTokenParams, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createPiiToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createPiiToken(str, str2, str3, apiResultCallback);
    }

    public final void createPiiToken(String personalId, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(new PiiTokenParams(personalId), stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createPiiTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createPiiTokenSynchronous(str, str2, str3);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createPiiTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1316}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createPiiTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $personalId;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07531(String str, String str2, String str3, Continuation<? super C07531> continuation) {
            super(2, continuation);
            this.$personalId = str;
            this.$stripeAccountId = str2;
            this.$idempotencyKey = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07531(this.$personalId, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(new PiiTokenParams(this.$personalId), this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createPiiTokenSynchronous(String personalId, String idempotencyKey, String stripeAccountId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(personalId, "personalId");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07531(personalId, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createCardToken(cardParams, str, str2, apiResultCallback);
    }

    public final void createCardToken(CardParams cardParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(cardParams, stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createCardTokenSynchronous$default(Stripe stripe, CardParams cardParams, String str, String str2, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createCardTokenSynchronous(cardParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createCardTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1387}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createCardTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ CardParams $cardParams;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07461(CardParams cardParams, String str, String str2, Continuation<? super C07461> continuation) {
            super(2, continuation);
            this.$cardParams = cardParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07461(this.$cardParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(this.$cardParams, this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String idempotencyKey, String stripeAccountId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07461(cardParams, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createCvcUpdateToken(str, str2, str3, apiResultCallback);
    }

    public final void createCvcUpdateToken(String cvc, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(new CvcTokenParams(cvc), stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createCvcUpdateTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createCvcUpdateTokenSynchronous(str, str2, str3);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createCvcUpdateTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1456}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createCvcUpdateTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ String $cvc;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07471(String str, String str2, String str3, Continuation<? super C07471> continuation) {
            super(2, continuation);
            this.$cvc = str;
            this.$stripeAccountId = str2;
            this.$idempotencyKey = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07471(this.$cvc, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(new CvcTokenParams(this.$cvc), this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc, String idempotencyKey, String stripeAccountId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07471(cvc, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPersonToken(personTokenParams, str, str2, apiResultCallback);
    }

    public final void createPersonToken(PersonTokenParams params, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super Token> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        createToken(params, stripeAccountId, idempotencyKey, callback);
    }

    public static /* synthetic */ Token createPersonTokenSynchronous$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPersonTokenSynchronous(personTokenParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/Token;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createPersonTokenSynchronous$1", f = "Stripe.kt", i = {}, l = {1522}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createPersonTokenSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Token>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ PersonTokenParams $params;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07521(PersonTokenParams personTokenParams, String str, String str2, Continuation<? super C07521> continuation) {
            super(2, continuation);
            this.$params = personTokenParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07521(this.$params, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Token> continuation) {
            return ((C07521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
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
            Object objCreateTokenOrThrow$payments_core_release = Stripe.this.createTokenOrThrow$payments_core_release(this.$params, this.$stripeAccountId, this.$idempotencyKey, this);
            return objCreateTokenOrThrow$payments_core_release == coroutine_suspended ? coroutine_suspended : objCreateTokenOrThrow$payments_core_release;
        }
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params, String idempotencyKey, String stripeAccountId) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Intrinsics.checkNotNullParameter(params, "params");
        return (Token) BuildersKt__BuildersKt.runBlocking$default(null, new C07521(params, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ Object createTokenOrThrow$payments_core_release$default(Stripe stripe, TokenParams tokenParams, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return stripe.createTokenOrThrow$payments_core_release(tokenParams, str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTokenOrThrow$payments_core_release(TokenParams tokenParams, String str, String str2, Continuation<? super Token> continuation) throws StripeException {
        Stripe$createTokenOrThrow$1 stripe$createTokenOrThrow$1;
        Object objMo8030createToken0E7RQCE;
        if (continuation instanceof Stripe$createTokenOrThrow$1) {
            stripe$createTokenOrThrow$1 = (Stripe$createTokenOrThrow$1) continuation;
            if ((stripe$createTokenOrThrow$1.label & Integer.MIN_VALUE) != 0) {
                stripe$createTokenOrThrow$1.label -= Integer.MIN_VALUE;
            } else {
                stripe$createTokenOrThrow$1 = new Stripe$createTokenOrThrow$1(this, continuation);
            }
        }
        Object obj = stripe$createTokenOrThrow$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripe$createTokenOrThrow$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = new ApiRequest.Options(this.publishableKey, str, str2);
            stripe$createTokenOrThrow$1.label = 1;
            objMo8030createToken0E7RQCE = stripeRepository.mo8030createToken0E7RQCE(tokenParams, options, stripe$createTokenOrThrow$1);
            if (objMo8030createToken0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8030createToken0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8030createToken0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            return objMo8030createToken0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
    }

    static /* synthetic */ void createToken$default(Stripe stripe, TokenParams tokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        stripe.createToken(tokenParams, str, str2, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/Token;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createToken$1", f = "Stripe.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createToken$1, reason: invalid class name and case insensitive filesystem */
    static final class C07571 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Token>>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        final /* synthetic */ TokenParams $tokenParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07571(TokenParams tokenParams, String str, String str2, Continuation<? super C07571> continuation) {
            super(1, continuation);
            this.$tokenParams = tokenParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07571(this.$tokenParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Token>> continuation) {
            return invoke2((Continuation<? super Result<Token>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Token>> continuation) {
            return ((C07571) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8030createToken0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8030createToken0E7RQCE = Stripe.this.getStripeRepository().mo8030createToken0E7RQCE(this.$tokenParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
                if (objMo8030createToken0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8030createToken0E7RQCE = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo8030createToken0E7RQCE);
        }
    }

    private final void createToken(TokenParams tokenParams, String stripeAccountId, String idempotencyKey, ApiResultCallback<? super Token> callback) {
        executeAsyncForResult(callback, new C07571(tokenParams, stripeAccountId, idempotencyKey, null));
    }

    public static /* synthetic */ void createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createFile(stripeFileParams, str, str2, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/core/model/StripeFile;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createFile$1", f = "Stripe.kt", i = {}, l = {1581}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createFile$1, reason: invalid class name and case insensitive filesystem */
    static final class C07481 extends SuspendLambda implements Function1<Continuation<? super Result<? extends StripeFile>>, Object> {
        final /* synthetic */ StripeFileParams $fileParams;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07481(StripeFileParams stripeFileParams, String str, String str2, Continuation<? super C07481> continuation) {
            super(1, continuation);
            this.$fileParams = stripeFileParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07481(this.$fileParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends StripeFile>> continuation) {
            return invoke2((Continuation<? super Result<StripeFile>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<StripeFile>> continuation) {
            return ((C07481) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8022createFile0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8022createFile0E7RQCE = Stripe.this.getStripeRepository().mo8022createFile0E7RQCE(this.$fileParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
            return Result.m9117boximpl(objMo8022createFile0E7RQCE);
        }
    }

    public final void createFile(StripeFileParams fileParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super StripeFile> callback) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07481(fileParams, stripeAccountId, idempotencyKey, null));
    }

    public static /* synthetic */ StripeFile createFileSynchronous$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createFileSynchronous(stripeFileParams, str, str2);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/core/model/StripeFile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createFileSynchronous$1", f = "Stripe.kt", i = {}, l = {1608}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$createFileSynchronous$1, reason: invalid class name and case insensitive filesystem */
    static final class C07491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StripeFile>, Object> {
        final /* synthetic */ StripeFileParams $fileParams;
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07491(StripeFileParams stripeFileParams, String str, String str2, Continuation<? super C07491> continuation) {
            super(2, continuation);
            this.$fileParams = stripeFileParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe.this.new C07491(this.$fileParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super StripeFile> continuation) {
            return ((C07491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objMo8022createFile0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8022createFile0E7RQCE = Stripe.this.getStripeRepository().mo8022createFile0E7RQCE(this.$fileParams, new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey), this);
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
                return objMo8022createFile0E7RQCE;
            }
            throw StripeException.INSTANCE.create(thM9121exceptionOrNullimpl);
        }
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String idempotencyKey, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(fileParams, "fileParams");
        return (StripeFile) BuildersKt__BuildersKt.runBlocking$default(null, new C07491(fileParams, stripeAccountId, idempotencyKey, null), 1, null);
    }

    public static /* synthetic */ void createRadarSession$default(Stripe stripe, String str, ApiResultCallback apiResultCallback, AppCompatActivity appCompatActivity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe.stripeAccountId;
        }
        if ((i & 4) != 0) {
            appCompatActivity = null;
        }
        stripe.createRadarSession(str, apiResultCallback, appCompatActivity);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/RadarSession;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$createRadarSession$1", f = "Stripe.kt", i = {1}, l = {1639, 1656, 1662}, m = "invokeSuspend", n = {"radarSession"}, s = {"L$2"})
    /* renamed from: com.stripe.android.Stripe$createRadarSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C07541 extends SuspendLambda implements Function1<Continuation<? super Result<? extends RadarSession>>, Object> {
        final /* synthetic */ AppCompatActivity $activity;
        final /* synthetic */ String $stripeAccountId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07541(String str, AppCompatActivity appCompatActivity, Continuation<? super C07541> continuation) {
            super(1, continuation);
            this.$stripeAccountId = str;
            this.$activity = appCompatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07541(this.$stripeAccountId, this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends RadarSession>> continuation) {
            return invoke2((Continuation<? super Result<RadarSession>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<RadarSession>> continuation) {
            return ((C07541) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        
            if (r14 != r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objCreateFailure;
            Object objM9118constructorimpl;
            Object objM9118constructorimpl2;
            Stripe stripe;
            String str;
            Object objM9118constructorimpl3;
            RadarSessionWithHCaptcha radarSessionWithHCaptcha;
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
                objCreateFailure = Stripe.this.getStripeRepository().mo8026createRadarSessiongIAlus(new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, null, 4, null), this);
                if (objCreateFailure != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objCreateFailure = ((Result) obj).getValue();
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
                    return Result.m9117boximpl(objM9118constructorimpl2);
                }
                radarSessionWithHCaptcha = (RadarSessionWithHCaptcha) this.L$2;
                String str2 = (String) this.L$1;
                stripe = (Stripe) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                StripeRepository stripeRepository = stripe.getStripeRepository();
                String id = radarSessionWithHCaptcha.getId();
                ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str, null, 4, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                objM9118constructorimpl3 = stripeRepository.mo8015attachHCaptchaToRadarSessionyxL6bBk(id, (String) obj, null, options, this);
            }
            AppCompatActivity appCompatActivity = this.$activity;
            stripe = Stripe.this;
            str = this.$stripeAccountId;
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion3 = Result.INSTANCE;
                RadarSessionWithHCaptcha radarSessionWithHCaptcha2 = (RadarSessionWithHCaptcha) objCreateFailure;
                String passiveCaptchaSiteKey = radarSessionWithHCaptcha2.getPassiveCaptchaSiteKey();
                String str3 = passiveCaptchaSiteKey;
                if (str3 == null || str3.length() == 0 || appCompatActivity == null) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM9118constructorimpl3 = Result.m9118constructorimpl(radarSessionWithHCaptcha2);
                    ResultKt.throwOnFailure(objM9118constructorimpl3);
                    objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl3);
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    return Result.m9117boximpl(objM9118constructorimpl2);
                }
                String passiveCaptchaRqdata = radarSessionWithHCaptcha2.getPassiveCaptchaRqdata();
                this.L$0 = stripe;
                this.L$1 = str;
                this.L$2 = radarSessionWithHCaptcha2;
                this.label = 2;
                Object objPerformPassiveHCaptcha = HCaptchaInterfaceKt.performPassiveHCaptcha(appCompatActivity, passiveCaptchaSiteKey, passiveCaptchaRqdata, this);
                if (objPerformPassiveHCaptcha == coroutine_suspended) {
                    return coroutine_suspended;
                }
                radarSessionWithHCaptcha = radarSessionWithHCaptcha2;
                obj = objPerformPassiveHCaptcha;
                StripeRepository stripeRepository2 = stripe.getStripeRepository();
                String id2 = radarSessionWithHCaptcha.getId();
                ApiRequest.Options options2 = new ApiRequest.Options(stripe.getPublishableKey(), str, null, 4, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                objM9118constructorimpl3 = stripeRepository2.mo8015attachHCaptchaToRadarSessionyxL6bBk(id2, (String) obj, null, options2, this);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
            if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            }
            return Result.m9117boximpl(objM9118constructorimpl2);
        }
    }

    public final void createRadarSession(String stripeAccountId, ApiResultCallback<? super RadarSession> callback, AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07541(stripeAccountId, activity, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$1", f = "Stripe.kt", i = {}, l = {1700}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$1, reason: invalid class name and case insensitive filesystem */
    static final class C07751 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ int $firstAmount;
        final /* synthetic */ int $secondAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07751(String str, int i, int i2, Continuation<? super C07751> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$firstAmount = i;
            this.$secondAmount = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07751(this.$clientSecret, this.$firstAmount, this.$secondAmount, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super Result<PaymentIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentIntent>> continuation) {
            return ((C07751) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk = Stripe.this.getStripeRepository().mo8062verifyPaymentIntentWithMicrodepositsyxL6bBk(this.$clientSecret, this.$firstAmount, this.$secondAmount, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), null, 4, null), this);
                if (objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk);
        }
    }

    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, int firstAmount, int secondAmount, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07751(clientSecret, firstAmount, secondAmount, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$2", f = "Stripe.kt", i = {}, l = {1732}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$2, reason: invalid class name and case insensitive filesystem */
    static final class C07762 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PaymentIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $descriptorCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07762(String str, String str2, Continuation<? super C07762> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$descriptorCode = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07762(this.$clientSecret, this.$descriptorCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super Result<PaymentIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentIntent>> continuation) {
            return ((C07762) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A = Stripe.this.getStripeRepository().mo8061verifyPaymentIntentWithMicrodepositsBWLJW6A(this.$clientSecret, this.$descriptorCode, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), null, 4, null), this);
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
            return Result.m9117boximpl(objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A);
        }
    }

    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super PaymentIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(descriptorCode, "descriptorCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07762(clientSecret, descriptorCode, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/SetupIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$1", f = "Stripe.kt", i = {}, l = {1766}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$1, reason: invalid class name and case insensitive filesystem */
    static final class C07771 extends SuspendLambda implements Function1<Continuation<? super Result<? extends SetupIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ int $firstAmount;
        final /* synthetic */ int $secondAmount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07771(String str, int i, int i2, Continuation<? super C07771> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$firstAmount = i;
            this.$secondAmount = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07771(this.$clientSecret, this.$firstAmount, this.$secondAmount, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super Result<SetupIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<SetupIntent>> continuation) {
            return ((C07771) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8064verifySetupIntentWithMicrodepositsyxL6bBk;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8064verifySetupIntentWithMicrodepositsyxL6bBk = Stripe.this.getStripeRepository().mo8064verifySetupIntentWithMicrodepositsyxL6bBk(this.$clientSecret, this.$firstAmount, this.$secondAmount, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), null, 4, null), this);
                if (objMo8064verifySetupIntentWithMicrodepositsyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo8064verifySetupIntentWithMicrodepositsyxL6bBk = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objMo8064verifySetupIntentWithMicrodepositsyxL6bBk);
        }
    }

    public final void verifySetupIntentWithMicrodeposits(String clientSecret, int firstAmount, int secondAmount, ApiResultCallback<? super SetupIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07771(clientSecret, firstAmount, secondAmount, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/SetupIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$2", f = "Stripe.kt", i = {}, l = {1798}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$2, reason: invalid class name and case insensitive filesystem */
    static final class C07782 extends SuspendLambda implements Function1<Continuation<? super Result<? extends SetupIntent>>, Object> {
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ String $descriptorCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07782(String str, String str2, Continuation<? super C07782> continuation) {
            super(1, continuation);
            this.$clientSecret = str;
            this.$descriptorCode = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07782(this.$clientSecret, this.$descriptorCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super Result<SetupIntent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<SetupIntent>> continuation) {
            return ((C07782) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8063verifySetupIntentWithMicrodepositsBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8063verifySetupIntentWithMicrodepositsBWLJW6A = Stripe.this.getStripeRepository().mo8063verifySetupIntentWithMicrodepositsBWLJW6A(this.$clientSecret, this.$descriptorCode, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), null, 4, null), this);
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
            return Result.m9117boximpl(objMo8063verifySetupIntentWithMicrodepositsBWLJW6A);
        }
    }

    public final void verifySetupIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super SetupIntent> callback) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(descriptorCode, "descriptorCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07782(clientSecret, descriptorCode, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PossibleBrands;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$retrievePossibleBrands$1", f = "Stripe.kt", i = {}, l = {1821}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$retrievePossibleBrands$1, reason: invalid class name and case insensitive filesystem */
    static final class C07691 extends SuspendLambda implements Function1<Continuation<? super Result<? extends PossibleBrands>>, Object> {
        final /* synthetic */ String $cardNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07691(String str, Continuation<? super C07691> continuation) {
            super(1, continuation);
            this.$cardNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C07691(this.$cardNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PossibleBrands>> continuation) {
            return invoke2((Continuation<? super Result<PossibleBrands>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PossibleBrands>> continuation) {
            return ((C07691) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo8044retrieveCardMetadata0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8044retrieveCardMetadata0E7RQCE = Stripe.this.getStripeRepository().mo8044retrieveCardMetadata0E7RQCE(this.$cardNumber, new ApiRequest.Options(Stripe.this.getPublishableKey(), Stripe.this.getStripeAccountId(), null, 4, null), this);
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
            return Result.m9117boximpl(Result.m9118constructorimpl(objMo8044retrieveCardMetadata0E7RQCE));
        }
    }

    public final void retrievePossibleBrands(String cardNumber, ApiResultCallback<? super PossibleBrands> callback) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C07691(cardNumber, null));
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$executeAsyncForResult$1", f = "Stripe.kt", i = {}, l = {1839, 1840}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$executeAsyncForResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C07591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Result<? extends T>>, Object> $apiMethod;
        final /* synthetic */ ApiResultCallback<T> $callback;
        int label;
        final /* synthetic */ Stripe this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07591(Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function1, Stripe stripe, ApiResultCallback<? super T> apiResultCallback, Continuation<? super C07591> continuation) {
            super(2, continuation);
            this.$apiMethod = function1;
            this.this$0 = stripe;
            this.$callback = apiResultCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C07591(this.$apiMethod, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r5.this$0.dispatchResult(r6, r5.$callback, r5) == r0) goto L15;
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
                Function1<Continuation<? super Result<? extends T>>, Object> function1 = this.$apiMethod;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj != coroutine_suspended) {
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
            Object value = ((Result) obj).getValue();
            this.label = 2;
        }
    }

    private final <T extends StripeModel> void executeAsyncForResult(ApiResultCallback<? super T> callback, Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> apiMethod) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C07591(apiMethod, this, callback, null), 3, null);
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe$dispatchResult$2", f = "Stripe.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.Stripe$dispatchResult$2, reason: invalid class name and case insensitive filesystem */
    static final class C07582 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiResultCallback<T> $callback;
        final /* synthetic */ Object $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07582(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super C07582> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.$callback = apiResultCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C07582(this.$result, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$result;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
            if (thM9121exceptionOrNullimpl == null) {
                apiResultCallback.onSuccess((StripeModel) obj2);
            } else {
                apiResultCallback.onError(StripeException.INSTANCE.create(thM9121exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends StripeModel> Object dispatchResult(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C07582(obj, apiResultCallback, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: flatMap-KWTtemM$payments_core_release, reason: not valid java name */
    public final <T, R> Object m7201flatMapKWTtemM$payments_core_release(Object obj, Function1<? super T, ? extends Result<? extends R>> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!Result.m9125isSuccessimpl(obj)) {
            return Result.m9118constructorimpl(obj);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object value = block.invoke(obj).getValue();
            ResultKt.throwOnFailure(value);
            return Result.m9118constructorimpl(value);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* compiled from: Stripe.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/Stripe$Companion;", "", "<init>", "()V", "API_VERSION", "", "VERSION_NAME", "getVERSION_NAME$annotations", "VERSION", "getVERSION$annotations", "appInfo", "Lcom/stripe/android/core/AppInfo;", "getAppInfo$annotations", "getAppInfo", "()Lcom/stripe/android/core/AppInfo;", "setAppInfo", "(Lcom/stripe/android/core/AppInfo;)V", "advancedFraudSignalsEnabled", "", "getAdvancedFraudSignalsEnabled$annotations", "getAdvancedFraudSignalsEnabled", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getAdvancedFraudSignalsEnabled$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getAppInfo$annotations() {
        }

        @Deprecated(message = "Use StripeSdkVersion.VERSION instead", replaceWith = @ReplaceWith(expression = "StripeSdkVersion.VERSION", imports = {"com.stripe.android.core.version.StripeSdkVersion"}))
        public static /* synthetic */ void getVERSION$annotations() {
        }

        @Deprecated(message = "Use StripeSdkVersion.VERSION_NAME instead", replaceWith = @ReplaceWith(expression = "StripeSdkVersion.VERSION_NAME", imports = {"com.stripe.android.core.version.StripeSdkVersion"}))
        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        private Companion() {
        }

        public final AppInfo getAppInfo() {
            return Stripe.appInfo;
        }

        public final void setAppInfo(AppInfo appInfo) {
            Stripe.appInfo = appInfo;
        }

        public final boolean getAdvancedFraudSignalsEnabled() {
            return Stripe.advancedFraudSignalsEnabled;
        }

        public final void setAdvancedFraudSignalsEnabled(boolean z) {
            Stripe.advancedFraudSignalsEnabled = z;
        }
    }
}
