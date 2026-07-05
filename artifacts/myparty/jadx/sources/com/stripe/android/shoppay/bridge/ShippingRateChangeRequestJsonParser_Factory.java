package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ShippingRateChangeRequestJsonParser_Factory implements Factory<ShippingRateChangeRequestJsonParser> {
    private final Provider<ModelJsonParser<ECEShippingRate>> shippingRateParserProvider;

    public ShippingRateChangeRequestJsonParser_Factory(Provider<ModelJsonParser<ECEShippingRate>> provider) {
        this.shippingRateParserProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShippingRateChangeRequestJsonParser get() {
        return newInstance(this.shippingRateParserProvider.get());
    }

    public static ShippingRateChangeRequestJsonParser_Factory create(javax.inject.Provider<ModelJsonParser<ECEShippingRate>> provider) {
        return new ShippingRateChangeRequestJsonParser_Factory(Providers.asDaggerProvider(provider));
    }

    public static ShippingRateChangeRequestJsonParser_Factory create(Provider<ModelJsonParser<ECEShippingRate>> provider) {
        return new ShippingRateChangeRequestJsonParser_Factory(provider);
    }

    public static ShippingRateChangeRequestJsonParser newInstance(ModelJsonParser<ECEShippingRate> modelJsonParser) {
        return new ShippingRateChangeRequestJsonParser(modelJsonParser);
    }
}
