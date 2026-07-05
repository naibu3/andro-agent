package com.stripe.android.shoppay.bridge;

import android.webkit.JavascriptInterface;
import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.Logger;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import com.stripe.android.shoppay.ShopPayArgs;
import com.stripe.android.shoppay.bridge.BridgeResponse;
import com.stripe.android.shoppay.bridge.ShopPayConfirmationState;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* compiled from: DefaultShopPayBridgeHandler.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0017J\b\u0010%\u001a\u00020!H\u0017J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0017J\b\u0010'\u001a\u00020!H\u0017J\u0010\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0017J\u0010\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0017J\u0010\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0017J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0017J\u001a\u0010,\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!H\u0002J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001a\u00101\u001a\u00020!\"\b\b\u0000\u00102*\u0002002\u0006\u0010\"\u001a\u00020!H\u0002J^\u00103\u001a\u00020!\"\b\b\u0000\u00102*\u0002002\u0006\u0010\"\u001a\u00020!2\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001c052&\b\u0004\u00107\u001a \b\u0001\u0012\u0004\u0012\u000209\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H20:\u0012\u0006\u0012\u0004\u0018\u00010;08H\u0082\b¢\u0006\u0002\u0010<R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;", "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;", "handleClickRequestJsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;", "shippingRateRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;", "shippingRateChangeRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;", "confirmationRequestJsonParser", "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;", "shopPayArgs", "Lcom/stripe/android/shoppay/ShopPayArgs;", "shopPayHandlers", "Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "<init>", "(Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lcom/stripe/android/shoppay/ShopPayArgs;Lcom/stripe/android/paymentsheet/ShopPayHandlers;)V", "logger", "Lcom/stripe/android/core/Logger;", "_confirmationState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;", "confirmationState", "Lkotlinx/coroutines/flow/StateFlow;", "getConfirmationState", "()Lkotlinx/coroutines/flow/StateFlow;", "onECEClickCallback", "Lkotlin/Function0;", "", "setOnECEClickCallback", "callback", "consoleLog", "level", "", "message", "origin", "url", "getStripePublishableKey", "handleECEClick", "getShopPayInitParams", "calculateShipping", "calculateShippingRateChange", "confirmPayment", "ready", "logMessage", "emoji", "wrapInBridgeResponse", "response", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "createErrorResponse", ExifInterface.GPS_DIRECTION_TRUE, "handleRequest", "onError", "Lkotlin/Function1;", "", "requestHandler", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler implements ShopPayBridgeHandler {
    public static final int $stable = 8;
    private final MutableStateFlow<ShopPayConfirmationState> _confirmationState;
    private final ModelJsonParser<ConfirmationRequest> confirmationRequestJsonParser;
    private final StateFlow<ShopPayConfirmationState> confirmationState;
    private final ModelJsonParser<HandleClickRequest> handleClickRequestJsonParser;
    private final Logger logger;
    private Function0<Unit> onECEClickCallback;
    private final ModelJsonParser<ShippingRateChangeRequest> shippingRateChangeRequestJsonParser;
    private final ModelJsonParser<ShippingCalculationRequest> shippingRateRequestJsonParser;
    private final ShopPayArgs shopPayArgs;
    private final ShopPayHandlers shopPayHandlers;

    @Inject
    public DefaultShopPayBridgeHandler(ModelJsonParser<HandleClickRequest> handleClickRequestJsonParser, ModelJsonParser<ShippingCalculationRequest> shippingRateRequestJsonParser, ModelJsonParser<ShippingRateChangeRequest> shippingRateChangeRequestJsonParser, ModelJsonParser<ConfirmationRequest> confirmationRequestJsonParser, ShopPayArgs shopPayArgs, ShopPayHandlers shopPayHandlers) {
        Intrinsics.checkNotNullParameter(handleClickRequestJsonParser, "handleClickRequestJsonParser");
        Intrinsics.checkNotNullParameter(shippingRateRequestJsonParser, "shippingRateRequestJsonParser");
        Intrinsics.checkNotNullParameter(shippingRateChangeRequestJsonParser, "shippingRateChangeRequestJsonParser");
        Intrinsics.checkNotNullParameter(confirmationRequestJsonParser, "confirmationRequestJsonParser");
        Intrinsics.checkNotNullParameter(shopPayArgs, "shopPayArgs");
        Intrinsics.checkNotNullParameter(shopPayHandlers, "shopPayHandlers");
        this.handleClickRequestJsonParser = handleClickRequestJsonParser;
        this.shippingRateRequestJsonParser = shippingRateRequestJsonParser;
        this.shippingRateChangeRequestJsonParser = shippingRateChangeRequestJsonParser;
        this.confirmationRequestJsonParser = confirmationRequestJsonParser;
        this.shopPayArgs = shopPayArgs;
        this.shopPayHandlers = shopPayHandlers;
        this.logger = Logger.INSTANCE.getInstance(false);
        MutableStateFlow<ShopPayConfirmationState> MutableStateFlow = StateFlowKt.MutableStateFlow(ShopPayConfirmationState.Pending.INSTANCE);
        this._confirmationState = MutableStateFlow;
        this.confirmationState = MutableStateFlow;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    public StateFlow<ShopPayConfirmationState> getConfirmationState() {
        return this.confirmationState;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    public void setOnECEClickCallback(Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onECEClickCallback = callback;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public void consoleLog(String level, String message, String origin, String url) {
        String str;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(url, "url");
        String lowerCase = level.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "error")) {
            str = "❌";
        } else {
            str = Intrinsics.areEqual(lowerCase, "warn") ? "⚠️" : "📝";
        }
        String str2 = !Intrinsics.areEqual(origin, url) ? "[" + origin + "]" : "";
        String upperCase = level.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        logMessage("Console " + upperCase + str2 + ": " + message, str);
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String getStripePublishableKey() {
        return this.shopPayArgs.getPublishableKey();
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String getShopPayInitParams() {
        Iterator<T> it = this.shopPayArgs.getShopPayConfiguration().getLineItems().iterator();
        int amount = 0;
        while (it.hasNext()) {
            amount += ((PaymentSheet.ShopPayConfiguration.LineItem) it.next()).getAmount();
        }
        return wrapInBridgeResponse(new ShopPayInitParamsResponse(this.shopPayArgs.getShopPayConfiguration().getShopId(), this.shopPayArgs.getCustomerSessionClientSecret(), amount));
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public void ready(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        logMessage$default(this, message, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void logMessage$default(DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "📝";
        }
        defaultShopPayBridgeHandler.logMessage(str, str2);
    }

    private final void logMessage(String message, String emoji) {
        this.logger.debug(emoji + " " + message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String wrapInBridgeResponse(JsonSerializer response) {
        String string = new BridgeResponse.Data(response).toJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends JsonSerializer> String createErrorResponse(String message) {
        String string = new BridgeResponse.Error(message).toJson().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    static /* synthetic */ String handleRequest$default(DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, String str, Function1 function1, Function2 function2, int i, Object obj) {
        Object objM9118constructorimpl;
        if ((i & 2) != 0) {
            function1 = new Function1<Throwable, Unit>() { // from class: com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler.handleRequest.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(str);
            logMessage$default(defaultShopPayBridgeHandler, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$handleRequest$2$1(function2, jSONObject, defaultShopPayBridgeHandler, null), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            function1.invoke(thM9121exceptionOrNullimpl);
            defaultShopPayBridgeHandler.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = defaultShopPayBridgeHandler.createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }

    private final <T extends JsonSerializer> String handleRequest(String message, Function1<? super Throwable, Unit> onError, Function2<? super JSONObject, ? super Continuation<? super T>, ? extends Object> requestHandler) {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultShopPayBridgeHandler defaultShopPayBridgeHandler = this;
            JSONObject jSONObject = new JSONObject(message);
            logMessage$default(this, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$handleRequest$2$1(requestHandler, jSONObject, this, null), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            onError.invoke(thM9121exceptionOrNullimpl);
            this.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String handleECEClick(String message) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultShopPayBridgeHandler defaultShopPayBridgeHandler = this;
            JSONObject jSONObject = new JSONObject(message);
            logMessage$default(this, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1(jSONObject, this, null, this), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String calculateShipping(String message) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultShopPayBridgeHandler defaultShopPayBridgeHandler = this;
            JSONObject jSONObject = new JSONObject(message);
            logMessage$default(this, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1(jSONObject, this, null, this), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String calculateShippingRateChange(String message) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultShopPayBridgeHandler defaultShopPayBridgeHandler = this;
            JSONObject jSONObject = new JSONObject(message);
            logMessage$default(this, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$calculateShippingRateChange$$inlined$handleRequest$default$1(jSONObject, this, null, this), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }

    @Override // com.stripe.android.shoppay.bridge.ShopPayBridgeHandler
    @JavascriptInterface
    public String confirmPayment(String message) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultShopPayBridgeHandler defaultShopPayBridgeHandler = this;
            JSONObject jSONObject = new JSONObject(message);
            logMessage$default(this, "Received request: " + jSONObject, null, 2, null);
            objM9118constructorimpl = Result.m9118constructorimpl((String) BuildersKt__BuildersKt.runBlocking$default(null, new DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1(jSONObject, this, null, this), 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this._confirmationState.tryEmit(new ShopPayConfirmationState.Failure(thM9121exceptionOrNullimpl));
            this.logger.error("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage(), thM9121exceptionOrNullimpl);
            objM9118constructorimpl = createErrorResponse("❌ Error parsing request: " + thM9121exceptionOrNullimpl.getMessage());
        }
        return (String) objM9118constructorimpl;
    }
}
