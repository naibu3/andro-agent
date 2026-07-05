package com.stripe.android.shoppay.bridge;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import com.stripe.android.shoppay.ShopPayArgs;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler_Factory implements Factory<DefaultShopPayBridgeHandler> {
    private final Provider<ModelJsonParser<ConfirmationRequest>> confirmationRequestJsonParserProvider;
    private final Provider<ModelJsonParser<HandleClickRequest>> handleClickRequestJsonParserProvider;
    private final Provider<ModelJsonParser<ShippingRateChangeRequest>> shippingRateChangeRequestJsonParserProvider;
    private final Provider<ModelJsonParser<ShippingCalculationRequest>> shippingRateRequestJsonParserProvider;
    private final Provider<ShopPayArgs> shopPayArgsProvider;
    private final Provider<ShopPayHandlers> shopPayHandlersProvider;

    public DefaultShopPayBridgeHandler_Factory(Provider<ModelJsonParser<HandleClickRequest>> provider, Provider<ModelJsonParser<ShippingCalculationRequest>> provider2, Provider<ModelJsonParser<ShippingRateChangeRequest>> provider3, Provider<ModelJsonParser<ConfirmationRequest>> provider4, Provider<ShopPayArgs> provider5, Provider<ShopPayHandlers> provider6) {
        this.handleClickRequestJsonParserProvider = provider;
        this.shippingRateRequestJsonParserProvider = provider2;
        this.shippingRateChangeRequestJsonParserProvider = provider3;
        this.confirmationRequestJsonParserProvider = provider4;
        this.shopPayArgsProvider = provider5;
        this.shopPayHandlersProvider = provider6;
    }

    @Override // javax.inject.Provider
    public DefaultShopPayBridgeHandler get() {
        return newInstance(this.handleClickRequestJsonParserProvider.get(), this.shippingRateRequestJsonParserProvider.get(), this.shippingRateChangeRequestJsonParserProvider.get(), this.confirmationRequestJsonParserProvider.get(), this.shopPayArgsProvider.get(), this.shopPayHandlersProvider.get());
    }

    public static DefaultShopPayBridgeHandler_Factory create(javax.inject.Provider<ModelJsonParser<HandleClickRequest>> provider, javax.inject.Provider<ModelJsonParser<ShippingCalculationRequest>> provider2, javax.inject.Provider<ModelJsonParser<ShippingRateChangeRequest>> provider3, javax.inject.Provider<ModelJsonParser<ConfirmationRequest>> provider4, javax.inject.Provider<ShopPayArgs> provider5, javax.inject.Provider<ShopPayHandlers> provider6) {
        return new DefaultShopPayBridgeHandler_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static DefaultShopPayBridgeHandler_Factory create(Provider<ModelJsonParser<HandleClickRequest>> provider, Provider<ModelJsonParser<ShippingCalculationRequest>> provider2, Provider<ModelJsonParser<ShippingRateChangeRequest>> provider3, Provider<ModelJsonParser<ConfirmationRequest>> provider4, Provider<ShopPayArgs> provider5, Provider<ShopPayHandlers> provider6) {
        return new DefaultShopPayBridgeHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DefaultShopPayBridgeHandler newInstance(ModelJsonParser<HandleClickRequest> modelJsonParser, ModelJsonParser<ShippingCalculationRequest> modelJsonParser2, ModelJsonParser<ShippingRateChangeRequest> modelJsonParser3, ModelJsonParser<ConfirmationRequest> modelJsonParser4, ShopPayArgs shopPayArgs, ShopPayHandlers shopPayHandlers) {
        return new DefaultShopPayBridgeHandler(modelJsonParser, modelJsonParser2, modelJsonParser3, modelJsonParser4, shopPayArgs, shopPayHandlers);
    }
}
