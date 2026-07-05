package com.stripe.android.lpmfoundations.paymentmethod;

import com.caverock.androidsvg.SVGParser;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AffirmDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AfterpayClearpayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AlipayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AlmaDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AmazonPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.AuBecsDebitDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.BacsDebitDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.BancontactDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.BillieDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.BlikDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.BoletoDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.CardDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.CashAppPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.CryptoDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.EpsDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.FpxDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.GiroPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.GrabPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.IdealDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.InstantDebitsDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.KlarnaDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.KonbiniDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.MobilePayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.MultibancoDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.OxxoDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.P24Definition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.PayPalDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.RevolutPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.SatispayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.SepaDebitDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.SofortDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.SunbitDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.SwishDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.TwintDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.UpiDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.UsBankAccountDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.WeChatPayDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.ZipDefinition;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* compiled from: PaymentMethodRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodRegistry;", "", "<init>", "()V", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", "getAll", "()Ljava/util/Set;", "definitionsByCode", "", "", "getDefinitionsByCode", "()Ljava/util/Map;", "definitionsByCode$delegate", "Lkotlin/Lazy;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodRegistry {
    public static final PaymentMethodRegistry INSTANCE = new PaymentMethodRegistry();
    private static final Set<PaymentMethodDefinition> all = SetsKt.setOf((Object[]) new PaymentMethodDefinition[]{AffirmDefinition.INSTANCE, AfterpayClearpayDefinition.INSTANCE, AlipayDefinition.INSTANCE, AlmaDefinition.INSTANCE, AmazonPayDefinition.INSTANCE, AuBecsDebitDefinition.INSTANCE, BacsDebitDefinition.INSTANCE, BancontactDefinition.INSTANCE, BillieDefinition.INSTANCE, BlikDefinition.INSTANCE, BoletoDefinition.INSTANCE, CardDefinition.INSTANCE, CashAppPayDefinition.INSTANCE, CryptoDefinition.INSTANCE, EpsDefinition.INSTANCE, FpxDefinition.INSTANCE, GiroPayDefinition.INSTANCE, GrabPayDefinition.INSTANCE, IdealDefinition.INSTANCE, InstantDebitsDefinition.INSTANCE, KlarnaDefinition.INSTANCE, KonbiniDefinition.INSTANCE, MobilePayDefinition.INSTANCE, MultibancoDefinition.INSTANCE, OxxoDefinition.INSTANCE, P24Definition.INSTANCE, PayPalDefinition.INSTANCE, RevolutPayDefinition.INSTANCE, SatispayDefinition.INSTANCE, SepaDebitDefinition.INSTANCE, SofortDefinition.INSTANCE, SunbitDefinition.INSTANCE, SwishDefinition.INSTANCE, TwintDefinition.INSTANCE, UpiDefinition.INSTANCE, UsBankAccountDefinition.INSTANCE, WeChatPayDefinition.INSTANCE, ZipDefinition.INSTANCE});

    /* renamed from: definitionsByCode$delegate, reason: from kotlin metadata */
    private static final Lazy definitionsByCode = LazyKt.lazy(new Function0() { // from class: com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodRegistry$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentMethodRegistry.definitionsByCode_delegate$lambda$1();
        }
    });
    public static final int $stable = 8;

    private PaymentMethodRegistry() {
    }

    public final Set<PaymentMethodDefinition> getAll() {
        return all;
    }

    public final Map<String, PaymentMethodDefinition> getDefinitionsByCode() {
        return (Map) definitionsByCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map definitionsByCode_delegate$lambda$1() {
        Set<PaymentMethodDefinition> set = all;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(((PaymentMethodDefinition) obj).getType().code, obj);
        }
        return linkedHashMap;
    }
}
