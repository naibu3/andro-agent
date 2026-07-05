package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class ConfirmationRequestJsonParser_Factory implements Factory<ConfirmationRequestJsonParser> {
    private final Provider<ModelJsonParser<ECEShippingRate>> shippingRateParserProvider;

    public ConfirmationRequestJsonParser_Factory(Provider<ModelJsonParser<ECEShippingRate>> provider) {
        this.shippingRateParserProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmationRequestJsonParser get() {
        return newInstance(this.shippingRateParserProvider.get());
    }

    public static ConfirmationRequestJsonParser_Factory create(javax.inject.Provider<ModelJsonParser<ECEShippingRate>> provider) {
        return new ConfirmationRequestJsonParser_Factory(Providers.asDaggerProvider(provider));
    }

    public static ConfirmationRequestJsonParser_Factory create(Provider<ModelJsonParser<ECEShippingRate>> provider) {
        return new ConfirmationRequestJsonParser_Factory(provider);
    }

    public static ConfirmationRequestJsonParser newInstance(ModelJsonParser<ECEShippingRate> modelJsonParser) {
        return new ConfirmationRequestJsonParser(modelJsonParser);
    }
}
