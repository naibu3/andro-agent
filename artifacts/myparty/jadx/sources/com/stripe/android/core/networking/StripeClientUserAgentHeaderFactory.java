package com.stripe.android.core.networking;

import android.os.Build;
import com.stripe.android.core.AppInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: StripeClientUserAgentHeaderFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "", "systemPropertySupplier", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "create", "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "createHeaderValue", "Lorg/json/JSONObject;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeClientUserAgentHeaderFactory {
    private static final Function1<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = new Function1() { // from class: com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return StripeClientUserAgentHeaderFactory.DEFAULT_SYSTEM_PROPERTY_SUPPLIER$lambda$0((String) obj);
        }
    };
    public static final String HEADER_STRIPE_CLIENT_USER_AGENT = "X-Stripe-Client-User-Agent";
    private static final String PROP_USER_AGENT = "http.agent";
    private final Function1<String, String> systemPropertySupplier;

    /* JADX WARN: Multi-variable type inference failed */
    public StripeClientUserAgentHeaderFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeClientUserAgentHeaderFactory(Function1<? super String, String> systemPropertySupplier) {
        Intrinsics.checkNotNullParameter(systemPropertySupplier, "systemPropertySupplier");
        this.systemPropertySupplier = systemPropertySupplier;
    }

    public /* synthetic */ StripeClientUserAgentHeaderFactory(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_SYSTEM_PROPERTY_SUPPLIER : function1);
    }

    public static /* synthetic */ Map create$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.create(appInfo);
    }

    public final Map<String, String> create(AppInfo appInfo) {
        return MapsKt.mapOf(TuplesKt.to(HEADER_STRIPE_CLIENT_USER_AGENT, createHeaderValue(appInfo).toString()));
    }

    public static /* synthetic */ JSONObject createHeaderValue$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.createHeaderValue(appInfo);
    }

    public final JSONObject createHeaderValue(AppInfo appInfo) {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("os.name", "android"), TuplesKt.to("os.version", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("bindings.version", "21.22.2"), TuplesKt.to(RequestHeadersFactory.LANG, "Java"), TuplesKt.to("publisher", "Stripe"), TuplesKt.to(PROP_USER_AGENT, this.systemPropertySupplier.invoke(PROP_USER_AGENT)));
        Map<String, Map<String, String>> mapCreateClientHeaders$stripe_core_release = appInfo != null ? appInfo.createClientHeaders$stripe_core_release() : null;
        if (mapCreateClientHeaders$stripe_core_release == null) {
            mapCreateClientHeaders$stripe_core_release = MapsKt.emptyMap();
        }
        return new JSONObject(MapsKt.plus(mapMapOf, mapCreateClientHeaders$stripe_core_release));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DEFAULT_SYSTEM_PROPERTY_SUPPLIER$lambda$0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String property = System.getProperty(name);
        return property == null ? "" : property;
    }
}
