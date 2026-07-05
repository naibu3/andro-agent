package com.stripe.android.networking;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerShippingAddresses;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.MobileCardElementConfig;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodMessage;
import com.stripe.android.model.PaymentMethodUpdateParams;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;

/* compiled from: StripeRepository.kt */
@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b\u0014\u0010\fJ&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b!\u0010\"J6\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0004\b$\u0010\fJ&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b&\u0010\u0017J.\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b)\u0010\u001cJ&\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b.\u0010/J.\u00100\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b1\u0010\u001cJ&\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u00104\u001a\u0002052\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b6\u00107J.\u00108\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b<\u0010=J0\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\u0006\u0010@\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\bA\u0010\u001cJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\bF\u0010GJL\u0010H\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010@\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bN\u0010OJD\u0010P\u001a\b\u0012\u0004\u0012\u00020+0\u00032\u0006\u0010@\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bQ\u0010RJ<\u0010S\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u0010@\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u00109\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bT\u0010UJ4\u0010V\u001a\b\u0012\u0004\u0012\u0002030\u00032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u00109\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bW\u0010XJ<\u0010V\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u0010Y\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u00109\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bZ\u0010UJ:\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\n0\u00032\u0006\u0010\\\u001a\u00020]2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\b^\u0010_JL\u0010`\u001a\b\u0012\u0004\u0012\u00020?0\u00032\u0006\u0010@\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\ba\u0010OJD\u0010b\u001a\b\u0012\u0004\u0012\u00020?0\u00032\u0006\u0010@\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010c\u001a\u00020d2\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\be\u0010fJ4\u0010g\u001a\b\u0012\u0004\u0012\u00020?0\u00032\u0006\u0010@\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bh\u0010iJ6\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0004\bn\u0010oJ8\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0002\u0010sJ\u001e\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u00032\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\bv\u0010wJ&\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u00032\u0006\u0010z\u001a\u00020{2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0004\b|\u0010}J*\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00032\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J(\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b\u0085\u0001\u0010\u0017J,\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u00032\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J0\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00060\u008d\u00010\u00032\u0007\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b\u008f\u0001\u0010\u0017J!\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u00032\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b\u0092\u0001\u0010wJ)\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u00032\u0006\u00109\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b\u0094\u0001\u0010\u0017J>\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u00032\u0007\u0010\u0096\u0001\u001a\u00020\u00062\u0007\u0010\u0097\u0001\u001a\u00020\u00062\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b\u0099\u0001\u0010oJI\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0007\u0010\u009b\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020\u00062\u0014\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u009e\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J5\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u00010\u00032\u0007\u0010\u009b\u0001\u001a\u00020\u00062\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b¤\u0001\u0010\u001cJ,\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u00032\b\u0010§\u0001\u001a\u00030¨\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b©\u0001\u0010ª\u0001J4\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010§\u0001\u001a\u00030¬\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J4\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u00032\u0006\u0010(\u001a\u00020\u00062\b\u0010§\u0001\u001a\u00030¬\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b°\u0001\u0010®\u0001JH\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0006\b³\u0001\u0010´\u0001JH\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH§@¢\u0006\u0006\b¶\u0001\u0010´\u0001J=\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010¸\u0001\u001a\u00030¹\u00012\b\u0010º\u0001\u001a\u00030¹\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\b»\u0001\u0010¼\u0001J1\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0007\u0010½\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\b¾\u0001\u0010\u001cJ=\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010¸\u0001\u001a\u00030¹\u00012\b\u0010º\u0001\u001a\u00030¹\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\bÀ\u0001\u0010¼\u0001J1\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0007\u0010½\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\bÁ\u0001\u0010\u001cJ_\u0010Â\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\u00032\r\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\u0010Å\u0001\u001a\u00030¹\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00062\u0007\u0010Ç\u0001\u001a\u00020\u00062\u0007\u0010È\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J,\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Í\u00010\u00032\b\u0010§\u0001\u001a\u00030Î\u00012\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J)\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020y0\u00032\u0007\u0010Ò\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\bÓ\u0001\u0010\u0017J<\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Õ\u00010\u00032\u0006\u0010M\u001a\u00020\b2\u0018\b\u0002\u0010§\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u009e\u0001H§@¢\u0006\u0006\bÖ\u0001\u0010×\u0001J8\u0010Ø\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\r\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060K2\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\bÛ\u0001\u0010iJ)\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Ý\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\bÞ\u0001\u0010\u0017J2\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0007\u0010á\u0001\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0005\bâ\u0001\u0010\u001cJ4\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010ä\u0001\u001a\u00030å\u00012\u0006\u0010M\u001a\u00020\bH§@¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001a\u0010è\u0001\u001a\u00020\u00062\u000f\b\u0002\u0010é\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060KH'¨\u0006ê\u0001"}, d2 = {"Lcom/stripe/android/networking/StripeRepository;", "", "retrieveStripeIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "clientSecret", "", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/stripe/android/core/networking/ApiRequest$Options;", "expandFields", "", "retrieveStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentIntent", "retrievePaymentIntent-BWLJW6A", "refreshPaymentIntent", "refreshPaymentIntent-0E7RQCE", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentIntentSource", "paymentIntentId", "sourceId", "cancelPaymentIntentSource-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent-BWLJW6A", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSetupIntent-BWLJW6A", "refreshSetupIntent", "refreshSetupIntent-0E7RQCE", "cancelSetupIntentSource", "setupIntentId", "cancelSetupIntentSource-BWLJW6A", "createSource", "Lcom/stripe/android/model/Source;", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource-0E7RQCE", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSource", "retrieveSource-BWLJW6A", "createPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod-0E7RQCE", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "paymentMethodUpdateParams", "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "updatePaymentMethod-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultPaymentMethod", "Lcom/stripe/android/model/Customer;", "customerId", "setDefaultPaymentMethod-BWLJW6A", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken-0E7RQCE", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCustomerSource", "publishableKey", "productUsageTokens", "", "sourceType", "requestOptions", "addCustomerSource-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "attachPaymentMethod-yxL6bBk", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "detachPaymentMethod-BWLJW6A", "(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customerSessionClientSecret", "detachPaymentMethod-yxL6bBk", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "getPaymentMethods-BWLJW6A", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource-bMdYcbs", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCustomer", "retrieveCustomer-BWLJW6A", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "", "newPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus-gIAlu-s", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata-0E7RQCE", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth-0E7RQCE", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete3ds2Auth", "complete3ds2Auth-0E7RQCE", "createFile", "Lcom/stripe/android/core/model/StripeFile;", "fileParams", "Lcom/stripe/android/core/model/StripeFileParams;", "createFile-0E7RQCE", "(Lcom/stripe/android/core/model/StripeFileParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "Lcom/stripe/android/core/networking/StripeResponse;", "url", "retrieveObject-0E7RQCE", "createRadarSession", "Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "createRadarSession-gIAlu-s", "createSavedPaymentMethodRadarSession", "createSavedPaymentMethodRadarSession-0E7RQCE", "attachHCaptchaToRadarSession", "radarSessionToken", "hcaptchaToken", "hcaptchaEKey", "attachHCaptchaToRadarSession-yxL6bBk", "sharePaymentDetails", "consumerSessionClientSecret", "id", "extraParams", "", "sharePaymentDetails-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOut", "Lcom/stripe/android/model/ConsumerSession;", "consumerAccountPublishableKey", "logOut-BWLJW6A", "createFinancialConnectionsSessionForDeferredPayments", "Lcom/stripe/android/model/FinancialConnectionsSession;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "createFinancialConnectionsSessionForDeferredPayments-0E7RQCE", "(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentIntentFinancialConnectionsSession", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "createPaymentIntentFinancialConnectionsSession-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSetupIntentFinancialConnectionsSession", "createSetupIntentFinancialConnectionsSession-BWLJW6A", "attachFinancialConnectionsSessionToPaymentIntent", "financialConnectionsSessionId", "attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachFinancialConnectionsSessionToSetupIntent", "attachFinancialConnectionsSessionToSetupIntent-hUnOzRk", "verifyPaymentIntentWithMicrodeposits", "firstAmount", "", "secondAmount", "verifyPaymentIntentWithMicrodeposits-yxL6bBk", "(Ljava/lang/String;IILcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "verifyPaymentIntentWithMicrodeposits-BWLJW6A", "verifySetupIntentWithMicrodeposits", "verifySetupIntentWithMicrodeposits-yxL6bBk", "verifySetupIntentWithMicrodeposits-BWLJW6A", "retrievePaymentMethodMessage", "Lcom/stripe/android/model/PaymentMethodMessage;", "paymentMethods", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "currency", "country", "locale", "logoColor", "retrievePaymentMethodMessage-eH_QyT8", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveElementsSession", "Lcom/stripe/android/model/ElementsSession;", "Lcom/stripe/android/model/ElementsSessionParams;", "retrieveElementsSession-0E7RQCE", "(Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCardMetadata", "cardNumber", "retrieveCardMetadata-0E7RQCE", "retrieveCardElementConfig", "Lcom/stripe/android/model/MobileCardElementConfig;", "retrieveCardElementConfig-0E7RQCE", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentMethodTypes", "listPaymentDetails-BWLJW6A", "listShippingAddresses", "Lcom/stripe/android/model/ConsumerShippingAddresses;", "listShippingAddresses-0E7RQCE", "deletePaymentDetails", "", "paymentDetailsId", "deletePaymentDetails-BWLJW6A", "updatePaymentDetails", "paymentDetailsUpdateParams", "Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;", "updatePaymentDetails-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildPaymentUserAgent", "attribution", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StripeRepository {
    /* renamed from: addCustomerSource-bMdYcbs */
    Object mo8012addCustomerSourcebMdYcbs(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Result<Source>> continuation);

    /* renamed from: attachFinancialConnectionsSessionToPaymentIntent-hUnOzRk */
    Object mo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: attachFinancialConnectionsSessionToSetupIntent-hUnOzRk */
    Object mo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk(String str, String str2, String str3, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: attachHCaptchaToRadarSession-yxL6bBk */
    Object mo8015attachHCaptchaToRadarSessionyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation);

    /* renamed from: attachPaymentMethod-yxL6bBk */
    Object mo8016attachPaymentMethodyxL6bBk(String str, Set<String> set, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    String buildPaymentUserAgent(Set<String> attribution);

    /* renamed from: cancelPaymentIntentSource-BWLJW6A */
    Object mo8017cancelPaymentIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: cancelSetupIntentSource-BWLJW6A */
    Object mo8018cancelSetupIntentSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: complete3ds2Auth-0E7RQCE */
    Object mo8019complete3ds2Auth0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation);

    /* renamed from: confirmPaymentIntent-BWLJW6A */
    Object mo8020confirmPaymentIntentBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: confirmSetupIntent-BWLJW6A */
    Object mo8021confirmSetupIntentBWLJW6A(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: createFile-0E7RQCE */
    Object mo8022createFile0E7RQCE(StripeFileParams stripeFileParams, ApiRequest.Options options, Continuation<? super Result<StripeFile>> continuation);

    /* renamed from: createFinancialConnectionsSessionForDeferredPayments-0E7RQCE */
    Object mo8023createFinancialConnectionsSessionForDeferredPayments0E7RQCE(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createPaymentIntentFinancialConnectionsSession-BWLJW6A */
    Object mo8024createPaymentIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createPaymentMethod-0E7RQCE */
    Object mo8025createPaymentMethod0E7RQCE(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: createRadarSession-gIAlu-s */
    Object mo8026createRadarSessiongIAlus(ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation);

    /* renamed from: createSavedPaymentMethodRadarSession-0E7RQCE */
    Object mo8027createSavedPaymentMethodRadarSession0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<RadarSessionWithHCaptcha>> continuation);

    /* renamed from: createSetupIntentFinancialConnectionsSession-BWLJW6A */
    Object mo8028createSetupIntentFinancialConnectionsSessionBWLJW6A(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, Continuation<? super Result<FinancialConnectionsSession>> continuation);

    /* renamed from: createSource-0E7RQCE */
    Object mo8029createSource0E7RQCE(SourceParams sourceParams, ApiRequest.Options options, Continuation<? super Result<Source>> continuation);

    /* renamed from: createToken-0E7RQCE */
    Object mo8030createToken0E7RQCE(TokenParams tokenParams, ApiRequest.Options options, Continuation<? super Result<Token>> continuation);

    /* renamed from: deleteCustomerSource-hUnOzRk */
    Object mo8031deleteCustomerSourcehUnOzRk(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, Continuation<? super Result<Source>> continuation);

    /* renamed from: deletePaymentDetails-BWLJW6A */
    Object mo8032deletePaymentDetailsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Unit>> continuation);

    /* renamed from: detachPaymentMethod-BWLJW6A */
    Object mo8033detachPaymentMethodBWLJW6A(Set<String> set, String str, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: detachPaymentMethod-yxL6bBk */
    Object mo8034detachPaymentMethodyxL6bBk(String str, Set<String> set, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: getCardMetadata-0E7RQCE */
    Object mo8035getCardMetadata0E7RQCE(Bin bin, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation);

    /* renamed from: getFpxBankStatus-gIAlu-s */
    Object mo8036getFpxBankStatusgIAlus(ApiRequest.Options options, Continuation<? super Result<BankStatuses>> continuation);

    /* renamed from: getPaymentMethods-BWLJW6A */
    Object mo8037getPaymentMethodsBWLJW6A(ListPaymentMethodsParams listPaymentMethodsParams, Set<String> set, ApiRequest.Options options, Continuation<? super Result<? extends List<PaymentMethod>>> continuation);

    /* renamed from: listPaymentDetails-BWLJW6A */
    Object mo8038listPaymentDetailsBWLJW6A(String str, Set<String> set, ApiRequest.Options options, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* renamed from: listShippingAddresses-0E7RQCE */
    Object mo8039listShippingAddresses0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<ConsumerShippingAddresses>> continuation);

    /* renamed from: logOut-BWLJW6A */
    Object mo8040logOutBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<ConsumerSession>> continuation);

    /* renamed from: refreshPaymentIntent-0E7RQCE */
    Object mo8041refreshPaymentIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: refreshSetupIntent-0E7RQCE */
    Object mo8042refreshSetupIntent0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: retrieveCardElementConfig-0E7RQCE */
    Object mo8043retrieveCardElementConfig0E7RQCE(ApiRequest.Options options, Map<String, String> map, Continuation<? super Result<MobileCardElementConfig>> continuation);

    /* renamed from: retrieveCardMetadata-0E7RQCE */
    Object mo8044retrieveCardMetadata0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<CardMetadata>> continuation);

    /* renamed from: retrieveCustomer-BWLJW6A */
    Object mo8045retrieveCustomerBWLJW6A(String str, Set<String> set, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation);

    /* renamed from: retrieveElementsSession-0E7RQCE */
    Object mo8046retrieveElementsSession0E7RQCE(ElementsSessionParams elementsSessionParams, ApiRequest.Options options, Continuation<? super Result<ElementsSession>> continuation);

    /* renamed from: retrieveIssuingCardPin-yxL6bBk */
    Object mo8047retrieveIssuingCardPinyxL6bBk(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super Result<String>> continuation);

    /* renamed from: retrieveObject-0E7RQCE */
    Object mo8048retrieveObject0E7RQCE(String str, ApiRequest.Options options, Continuation<? super Result<StripeResponse<String>>> continuation);

    /* renamed from: retrievePaymentIntent-BWLJW6A */
    Object mo8049retrievePaymentIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: retrievePaymentMethodMessage-eH_QyT8 */
    Object mo8050retrievePaymentMethodMessageeH_QyT8(List<String> list, int i, String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Result<PaymentMethodMessage>> continuation);

    /* renamed from: retrieveSetupIntent-BWLJW6A */
    Object mo8051retrieveSetupIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: retrieveSource-BWLJW6A */
    Object mo8052retrieveSourceBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Source>> continuation);

    /* renamed from: retrieveStripeIntent-BWLJW6A */
    Object mo8053retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends StripeIntent>> continuation);

    /* renamed from: setCustomerShippingInfo-hUnOzRk */
    Object mo8054setCustomerShippingInfohUnOzRk(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation);

    /* renamed from: setDefaultCustomerSource-bMdYcbs */
    Object mo8055setDefaultCustomerSourcebMdYcbs(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation);

    /* renamed from: setDefaultPaymentMethod-BWLJW6A */
    Object mo8056setDefaultPaymentMethodBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<Customer>> continuation);

    /* renamed from: sharePaymentDetails-yxL6bBk */
    Object mo8057sharePaymentDetailsyxL6bBk(String str, String str2, Map<String, ?> map, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: start3ds2Auth-0E7RQCE */
    Object mo8058start3ds2Auth0E7RQCE(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, Continuation<? super Result<Stripe3ds2AuthResult>> continuation);

    Object updateIssuingCardPin(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super Throwable> continuation);

    /* renamed from: updatePaymentDetails-BWLJW6A */
    Object mo8059updatePaymentDetailsBWLJW6A(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, Continuation<? super Result<ConsumerPaymentDetails>> continuation);

    /* renamed from: updatePaymentMethod-BWLJW6A */
    Object mo8060updatePaymentMethodBWLJW6A(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, ApiRequest.Options options, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: verifyPaymentIntentWithMicrodeposits-BWLJW6A */
    Object mo8061verifyPaymentIntentWithMicrodepositsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: verifyPaymentIntentWithMicrodeposits-yxL6bBk */
    Object mo8062verifyPaymentIntentWithMicrodepositsyxL6bBk(String str, int i, int i2, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation);

    /* renamed from: verifySetupIntentWithMicrodeposits-BWLJW6A */
    Object mo8063verifySetupIntentWithMicrodepositsBWLJW6A(String str, String str2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* renamed from: verifySetupIntentWithMicrodeposits-yxL6bBk */
    Object mo8064verifySetupIntentWithMicrodepositsyxL6bBk(String str, int i, int i2, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation);

    /* compiled from: StripeRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrieveStripeIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8070retrieveStripeIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo8053retrieveStripeIntentBWLJW6A(str, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: confirmPaymentIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8065confirmPaymentIntentBWLJW6A$default(StripeRepository stripeRepository, ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPaymentIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo8020confirmPaymentIntentBWLJW6A(confirmPaymentIntentParams, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrievePaymentIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8068retrievePaymentIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo8049retrievePaymentIntentBWLJW6A(str, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: confirmSetupIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8066confirmSetupIntentBWLJW6A$default(StripeRepository stripeRepository, ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSetupIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo8021confirmSetupIntentBWLJW6A(confirmSetupIntentParams, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrieveSetupIntent-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8069retrieveSetupIntentBWLJW6A$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.emptyList();
            }
            return stripeRepository.mo8051retrieveSetupIntentBWLJW6A(str, options, list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: retrieveCardElementConfig-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m8067retrieveCardElementConfig0E7RQCE$default(StripeRepository stripeRepository, ApiRequest.Options options, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveCardElementConfig-0E7RQCE");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return stripeRepository.mo8043retrieveCardElementConfig0E7RQCE(options, map, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String buildPaymentUserAgent$default(StripeRepository stripeRepository, Set set, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildPaymentUserAgent");
            }
            if ((i & 1) != 0) {
                set = SetsKt.emptySet();
            }
            return stripeRepository.buildPaymentUserAgent(set);
        }
    }
}
