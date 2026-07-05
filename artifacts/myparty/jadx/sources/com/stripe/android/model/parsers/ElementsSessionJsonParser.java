package com.stripe.android.model.parsers;

import com.facebook.internal.NativeProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.utils.FeatureFlags;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.LinkConsumerIncentive;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PassiveCaptchaParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ElementsSessionJsonParser.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016JD\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010(\u001a\u00020)2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010+2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00120/2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/ElementsSession;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/ElementsSessionParams;", NamedConstantsKt.IS_LIVE_MODE, "", "timeProvider", "Lkotlin/Function0;", "", "<init>", "(Lcom/stripe/android/model/ElementsSessionParams;ZLkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "parseStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "elementsSessionId", "", "paymentMethodPreference", "orderedPaymentMethodTypes", "Lorg/json/JSONArray;", "unactivatedPaymentMethodTypes", "linkFundingSources", "countryCode", "parseLinkSettings", "Lcom/stripe/android/model/ElementsSession$LinkSettings;", "parseCustomPaymentMethods", "", "Lcom/stripe/android/model/ElementsSession$CustomPaymentMethod;", "parseCustomer", "Lcom/stripe/android/model/ElementsSession$Customer;", "enableLinkInSpm", "parsePaymentMethodsWithLinkDetails", "Lcom/stripe/android/model/PaymentMethod;", "parsePaymentMethods", "parseCustomerSession", "Lcom/stripe/android/model/ElementsSession$Customer$Session;", "parseComponents", "Lcom/stripe/android/model/ElementsSession$Customer$Components;", "parsePaymentElementComponent", "Lcom/stripe/android/model/ElementsSession$Customer$Components$MobilePaymentElement;", "parseCustomerSheetComponent", "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;", "parseCardBrandChoice", "Lcom/stripe/android/model/ElementsSession$CardBrandChoice;", "parseLinkFlags", "", "parseSessionFlags", "Lcom/stripe/android/model/ElementsSession$Flag;", "parseExperimentAssignments", "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ElementsSessionJsonParser implements ModelJsonParser<ElementsSession> {
    private static final String ARB_ID = "arb_id";
    private static final String FIELD_CARD_BRAND_CHOICE = "card_brand_choice";
    private static final String FIELD_COMPONENTS = "components";
    private static final String FIELD_COUNTRY_CODE = "country_code";
    private static final String FIELD_CUSTOMER = "customer";
    private static final String FIELD_CUSTOMER_API_KEY = "api_key";
    private static final String FIELD_CUSTOMER_API_KEY_EXPIRY = "api_key_expiry";
    private static final String FIELD_CUSTOMER_ID = "id";
    private static final String FIELD_CUSTOMER_LIVE_MODE = "livemode";
    private static final String FIELD_CUSTOMER_NAME = "customer";
    private static final String FIELD_CUSTOMER_PAYMENT_METHODS = "payment_methods";
    private static final String FIELD_CUSTOMER_PAYMENT_METHODS_WITH_LINK_DETAILS = "payment_methods_with_link_details";
    private static final String FIELD_CUSTOMER_SESSION = "customer_session";
    private static final String FIELD_CUSTOMER_SHEET = "customer_sheet";
    private static final String FIELD_CUSTOM_PAYMENT_METHODS_DATA = "custom_payment_method_data";
    private static final String FIELD_DEFAULT_PAYMENT_METHOD = "default_payment_method";
    private static final String FIELD_DISABLE_LINK_SIGNUP = "link_mobile_disable_signup";
    private static final String FIELD_ELEMENTS_SESSION_ID = "session_id";
    private static final String FIELD_ELIGIBLE = "eligible";
    private static final String FIELD_ENABLED = "enabled";
    private static final String FIELD_EXPERIMENTS_ASSIGNMENTS = "experiment_assignments";
    private static final String FIELD_EXPERIMENTS_DATA = "experiments_data";
    private static final String FIELD_EXTERNAL_PAYMENT_METHOD_DATA = "external_payment_method_data";
    private static final String FIELD_FEATURES = "features";
    private static final String FIELD_FLAGS = "flags";
    public static final String FIELD_GOOGLE_PAY_PREFERENCE = "google_pay_preference";
    private static final String FIELD_LINK_ENABLE_DISPLAYABLE_DEFAULT_VALUES_IN_ECE = "link_enable_displayable_default_values_in_ece";
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    private static final String FIELD_LINK_MOBILE_DISABLE_RUX_IN_FLOW_CONTROLLER = "link_mobile_disable_rux_in_flow_controller";
    private static final String FIELD_LINK_MOBILE_SKIP_WALLET_IN_FLOW_CONTROLLER = "link_mobile_skip_wallet_in_flow_controller";
    private static final String FIELD_LINK_MODE = "link_mode";
    private static final String FIELD_LINK_PASSTHROUGH_MODE_ENABLED = "link_passthrough_mode_enabled";
    private static final String FIELD_LINK_SETTINGS = "link_settings";
    private static final String FIELD_LINK_SIGN_UP_OPT_IN_FEATURE_ENABLED = "link_sign_up_opt_in_feature_enabled";
    private static final String FIELD_LINK_SIGN_UP_OPT_IN_INITIAL_VALUE = "link_sign_up_opt_in_initial_value";
    private static final String FIELD_LINK_SUPPRESS_2FA_MODAL = "link_mobile_suppress_2fa_modal";
    private static final String FIELD_MERCHANT_COUNTRY = "merchant_country";
    private static final String FIELD_MOBILE_PAYMENT_ELEMENT = "mobile_payment_element";
    private static final String FIELD_OBJECT = "object";
    private static final String FIELD_ORDERED_PAYMENT_METHOD_TYPES = "ordered_payment_method_types";
    private static final String FIELD_ORDERED_PAYMENT_METHOD_TYPESAND_WALLETS = "ordered_payment_method_types_and_wallets";
    private static final String FIELD_PASSIVE_CAPTCHA = "passive_captcha";
    private static final String FIELD_PAYMENT_METHOD_ALLOW_REDISPLAY_OVERRIDE = "payment_method_save_allow_redisplay_override";
    private static final String FIELD_PAYMENT_METHOD_PREFERENCE = "payment_method_preference";
    private static final String FIELD_PAYMENT_METHOD_REMOVE = "payment_method_remove";
    private static final String FIELD_PAYMENT_METHOD_REMOVE_LAST = "payment_method_remove_last";
    private static final String FIELD_PAYMENT_METHOD_SAVE = "payment_method_save";
    private static final String FIELD_PAYMENT_METHOD_SET_AS_DEFAULT = "payment_method_set_as_default";
    private static final String FIELD_PAYMENT_METHOD_SPECS = "payment_method_specs";
    private static final String FIELD_PAYMENT_METHOD_SYNC_DEFAULT = "payment_method_sync_default";
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final String FIELD_PREFERRED_NETWORKS = "preferred_networks";
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private static final String FIELD_USE_LINK_ATTESTATION_ENDPOINTS = "link_mobile_use_attestation_endpoints";
    private static final String VALUE_ENABLED = "enabled";
    private final boolean isLiveMode;
    private final ElementsSessionParams params;
    private final Function0<Long> timeProvider;
    public static final int $stable = 8;
    private static final CustomPaymentMethodJsonParser CUSTOM_PAYMENT_METHOD_JSON_PARSER = new CustomPaymentMethodJsonParser();

    public ElementsSessionJsonParser(ElementsSessionParams params, boolean z, Function0<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.params = params;
        this.isLiveMode = z;
        this.timeProvider = timeProvider;
    }

    public /* synthetic */ ElementsSessionJsonParser(ElementsSessionParams elementsSessionParams, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(elementsSessionParams, z, (i & 4) != 0 ? new Function0() { // from class: com.stripe.android.model.parsers.ElementsSessionJsonParser$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(System.currentTimeMillis());
            }
        } : function0);
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ElementsSession parse(JSONObject json) throws JSONException {
        Map<ElementsSession.Flag, Boolean> mapEmptyMap;
        ElementsSession.ExperimentsData experimentsData;
        Map<ElementsSession.ExperimentAssignment, String> mapEmptyMap2;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObjectMapToJsonObject = StripeJsonUtils.INSTANCE.mapToJsonObject(StripeJsonUtils.INSTANCE.optMap(json, FIELD_PAYMENT_METHOD_PREFERENCE));
        String strOptString = StripeJsonUtils.optString(jSONObjectMapToJsonObject, "object");
        if (jSONObjectMapToJsonObject != null && Intrinsics.areEqual(FIELD_PAYMENT_METHOD_PREFERENCE, strOptString)) {
            String strOptString2 = jSONObjectMapToJsonObject.optString(FIELD_COUNTRY_CODE);
            JSONArray jSONArrayOptJSONArray = json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES);
            JSONArray jSONArrayOptJSONArray2 = json.optJSONArray(FIELD_PAYMENT_METHOD_SPECS);
            String string = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null;
            JSONArray jSONArrayOptJSONArray3 = json.optJSONArray(FIELD_EXTERNAL_PAYMENT_METHOD_DATA);
            String string2 = jSONArrayOptJSONArray3 != null ? jSONArrayOptJSONArray3.toString() : null;
            JSONArray jSONArrayOptJSONArray4 = jSONObjectMapToJsonObject.optJSONArray(FIELD_ORDERED_PAYMENT_METHOD_TYPES);
            List<String> listJsonArrayToList = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_ORDERED_PAYMENT_METHOD_TYPESAND_WALLETS));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("flags");
            if (jSONObjectOptJSONObject == null || (mapEmptyMap = parseSessionFlags(jSONObjectOptJSONObject)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map<ElementsSession.Flag, Boolean> map = mapEmptyMap;
            String strOptString3 = json.optString("session_id");
            ElementsSession.Customer customer = parseCustomer(json.optJSONObject("customer"), Intrinsics.areEqual((Object) map.get(ElementsSession.Flag.ELEMENTS_ENABLE_LINK_SPM), (Object) true));
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(FIELD_LINK_SETTINGS);
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray(FIELD_LINK_FUNDING_SOURCES) : null;
            Intrinsics.checkNotNull(strOptString2);
            StripeIntent stripeIntent = parseStripeIntent(strOptString3, jSONObjectMapToJsonObject, jSONArrayOptJSONArray4, jSONArrayOptJSONArray, jSONArrayOptJSONArray5, strOptString2);
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(FIELD_EXPERIMENTS_DATA);
            if (jSONObjectOptJSONObject3 != null) {
                String strOptString4 = jSONObjectOptJSONObject3.optString(ARB_ID);
                Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(FIELD_EXPERIMENTS_ASSIGNMENTS);
                if (jSONObjectOptJSONObject4 == null || (mapEmptyMap2 = parseExperimentAssignments(jSONObjectOptJSONObject4)) == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                experimentsData = new ElementsSession.ExperimentsData(strOptString4, mapEmptyMap2);
            } else {
                experimentsData = null;
            }
            List<ElementsSession.CustomPaymentMethod> customPaymentMethods = parseCustomPaymentMethods(json.optJSONArray(FIELD_CUSTOM_PAYMENT_METHODS_DATA));
            ElementsSession.CardBrandChoice cardBrandChoice = parseCardBrandChoice(json);
            String strOptString5 = json.optString(FIELD_GOOGLE_PAY_PREFERENCE);
            String strOptString6 = json.optString(FIELD_MERCHANT_COUNTRY);
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(FIELD_PASSIVE_CAPTCHA);
            PassiveCaptchaParams passiveCaptchaParams = jSONObjectOptJSONObject5 != null ? new PassiveCaptchaJsonParser().parse(jSONObjectOptJSONObject5) : null;
            if (stripeIntent != null) {
                ElementsSession.LinkSettings linkSettings = parseLinkSettings(jSONObjectOptJSONObject2, jSONArrayOptJSONArray5);
                boolean z = !Intrinsics.areEqual(strOptString5, "disabled");
                Intrinsics.checkNotNull(strOptString3);
                String string3 = StringsKt.isBlank(strOptString3) ? null : strOptString3;
                if (string3 == null) {
                    string3 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                }
                return new ElementsSession(linkSettings, string, string2, stripeIntent, listJsonArrayToList, map, experimentsData, customer, strOptString6, cardBrandChoice, z, null, customPaymentMethods, string3, passiveCaptchaParams, 2048, null);
            }
        }
        return null;
    }

    private final StripeIntent parseStripeIntent(String elementsSessionId, JSONObject paymentMethodPreference, JSONArray orderedPaymentMethodTypes, JSONArray unactivatedPaymentMethodTypes, JSONArray linkFundingSources, String countryCode) throws JSONException {
        JSONObject jSONObject;
        if (paymentMethodPreference == null || (jSONObject = paymentMethodPreference.optJSONObject(this.params.getType())) == null) {
            jSONObject = new JSONObject();
        }
        if (orderedPaymentMethodTypes != null) {
            jSONObject.put(FIELD_PAYMENT_METHOD_TYPES, orderedPaymentMethodTypes);
        }
        jSONObject.put(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES, unactivatedPaymentMethodTypes);
        jSONObject.put(FIELD_LINK_FUNDING_SOURCES, linkFundingSources);
        jSONObject.put(FIELD_COUNTRY_CODE, countryCode);
        ElementsSessionParams elementsSessionParams = this.params;
        if (elementsSessionParams instanceof ElementsSessionParams.PaymentIntentType) {
            return new PaymentIntentJsonParser().parse(jSONObject);
        }
        if (elementsSessionParams instanceof ElementsSessionParams.SetupIntentType) {
            return new SetupIntentJsonParser().parse(jSONObject);
        }
        if (!(elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType)) {
            throw new NoWhenBranchMatchedException();
        }
        DeferredIntentParams.Mode mode = ((ElementsSessionParams.DeferredIntentType) elementsSessionParams).getDeferredIntentParams().getMode();
        if (mode instanceof DeferredIntentParams.Mode.Payment) {
            return new DeferredPaymentIntentJsonParser(elementsSessionId, (DeferredIntentParams.Mode.Payment) ((ElementsSessionParams.DeferredIntentType) this.params).getDeferredIntentParams().getMode(), this.isLiveMode, this.timeProvider).parse(jSONObject);
        }
        if (!(mode instanceof DeferredIntentParams.Mode.Setup)) {
            throw new NoWhenBranchMatchedException();
        }
        return new DeferredSetupIntentJsonParser(elementsSessionId, (DeferredIntentParams.Mode.Setup) ((ElementsSessionParams.DeferredIntentType) this.params).getDeferredIntentParams().getMode(), this.isLiveMode, this.timeProvider).parse(jSONObject);
    }

    private final ElementsSession.LinkSettings parseLinkSettings(JSONObject json, JSONArray linkFundingSources) throws JSONException {
        LinkMode linkMode;
        Map<String, Boolean> mapEmptyMap;
        String strOptString;
        LinkMode next;
        boolean z = json != null && json.optBoolean(FIELD_DISABLE_LINK_SIGNUP);
        boolean z2 = json != null && json.optBoolean(FIELD_LINK_PASSTHROUGH_MODE_ENABLED);
        boolean z3 = json != null && json.optBoolean(FIELD_USE_LINK_ATTESTATION_ENDPOINTS);
        boolean z4 = json != null && json.optBoolean(FIELD_LINK_MOBILE_DISABLE_RUX_IN_FLOW_CONTROLLER);
        boolean z5 = json != null && json.optBoolean(FIELD_LINK_SUPPRESS_2FA_MODAL);
        boolean z6 = json != null && json.optBoolean(FIELD_LINK_ENABLE_DISPLAYABLE_DEFAULT_VALUES_IN_ECE);
        boolean z7 = json != null && json.optBoolean(FIELD_LINK_MOBILE_SKIP_WALLET_IN_FLOW_CONTROLLER);
        boolean z8 = json != null && json.optBoolean(FIELD_LINK_SIGN_UP_OPT_IN_FEATURE_ENABLED);
        boolean z9 = json != null && json.optBoolean(FIELD_LINK_SIGN_UP_OPT_IN_INITIAL_VALUE);
        LinkConsumerIncentive linkConsumerIncentive = null;
        if (json == null || (strOptString = json.optString("link_mode")) == null) {
            linkMode = null;
        } else {
            Iterator<LinkMode> it = LinkMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getValue(), strOptString)) {
                    break;
                }
            }
            linkMode = next;
        }
        if (json == null || (mapEmptyMap = parseLinkFlags(json)) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map<String, Boolean> map = mapEmptyMap;
        if (FeatureFlags.INSTANCE.getInstantDebitsIncentives().isEnabled()) {
            JSONObject jSONObjectOptJSONObject = json != null ? json.optJSONObject("link_consumer_incentive") : null;
            if (jSONObjectOptJSONObject != null) {
                linkConsumerIncentive = LinkConsumerIncentiveJsonParser.INSTANCE.parse(jSONObjectOptJSONObject);
            }
        }
        return new ElementsSession.LinkSettings(ModelJsonParser.INSTANCE.jsonArrayToList(linkFundingSources), z2, linkMode, map, z, linkConsumerIncentive, z3, z5, z4, z6, z7, z8, z9);
    }

    private final List<ElementsSession.CustomPaymentMethod> parseCustomPaymentMethods(JSONArray json) {
        if (json == null) {
            return CollectionsKt.emptyList();
        }
        IntRange intRangeUntil = RangesKt.until(0, json.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            CustomPaymentMethodJsonParser customPaymentMethodJsonParser = CUSTOM_PAYMENT_METHOD_JSON_PARSER;
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(iNextInt);
            Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(...)");
            ElementsSession.CustomPaymentMethod customPaymentMethod = customPaymentMethodJsonParser.parse(jSONObjectOptJSONObject);
            if (customPaymentMethod != null) {
                arrayList.add(customPaymentMethod);
            }
        }
        return arrayList;
    }

    private final ElementsSession.Customer parseCustomer(JSONObject json, boolean enableLinkInSpm) throws JSONException {
        List<PaymentMethod> paymentMethods;
        if (json == null) {
            return null;
        }
        if (enableLinkInSpm) {
            paymentMethods = parsePaymentMethodsWithLinkDetails(json);
        } else {
            paymentMethods = parsePaymentMethods(json);
        }
        ElementsSession.Customer.Session customerSession = parseCustomerSession(json.optJSONObject(FIELD_CUSTOMER_SESSION));
        if (customerSession == null) {
            return null;
        }
        String strOptString = json.optString(FIELD_DEFAULT_PAYMENT_METHOD);
        Intrinsics.checkNotNull(strOptString);
        return new ElementsSession.Customer(paymentMethods, StringsKt.isBlank(strOptString) ? null : strOptString, customerSession);
    }

    private final List<PaymentMethod> parsePaymentMethodsWithLinkDetails(JSONObject json) throws JSONException {
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(FIELD_CUSTOMER_PAYMENT_METHODS_WITH_LINK_DETAILS);
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                PaymentMethodWithLinkDetailsJsonParser paymentMethodWithLinkDetailsJsonParser = PaymentMethodWithLinkDetailsJsonParser.INSTANCE;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(...)");
                PaymentMethod paymentMethod = paymentMethodWithLinkDetailsJsonParser.parse(jSONObjectOptJSONObject);
                if (paymentMethod != null) {
                    arrayList.add(paymentMethod);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final List<PaymentMethod> parsePaymentMethods(JSONObject json) {
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(FIELD_CUSTOMER_PAYMENT_METHODS);
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                PaymentMethodJsonParser paymentMethodJsonParser = new PaymentMethodJsonParser();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(...)");
                PaymentMethod paymentMethod = paymentMethodJsonParser.parse(jSONObjectOptJSONObject);
                if (paymentMethod != null) {
                    arrayList.add(paymentMethod);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final ElementsSession.Customer.Session parseCustomerSession(JSONObject json) {
        String strOptString;
        ElementsSession.Customer.Components components;
        if (json == null || (strOptString = json.optString("id")) == null) {
            return null;
        }
        boolean zOptBoolean = json.optBoolean("livemode");
        String strOptString2 = json.optString(FIELD_CUSTOMER_API_KEY);
        if (strOptString2 == null) {
            return null;
        }
        int iOptInt = json.optInt(FIELD_CUSTOMER_API_KEY_EXPIRY);
        String strOptString3 = json.optString("customer");
        if (strOptString3 == null || (components = parseComponents(json.optJSONObject(FIELD_COMPONENTS))) == null) {
            return null;
        }
        return new ElementsSession.Customer.Session(strOptString, zOptBoolean, strOptString2, iOptInt, strOptString3, components);
    }

    private final ElementsSession.Customer.Components parseComponents(JSONObject json) {
        if (json == null) {
            return null;
        }
        ElementsSession.Customer.Components.MobilePaymentElement paymentElementComponent = parsePaymentElementComponent(json.optJSONObject(FIELD_MOBILE_PAYMENT_ELEMENT));
        ElementsSession.Customer.Components.CustomerSheet customerSheetComponent = parseCustomerSheetComponent(json.optJSONObject("customer_sheet"));
        if (customerSheetComponent == null) {
            return null;
        }
        return new ElementsSession.Customer.Components(paymentElementComponent, customerSheetComponent);
    }

    private final ElementsSession.Customer.Components.MobilePaymentElement parsePaymentElementComponent(JSONObject json) {
        PaymentMethod.AllowRedisplay next;
        if (json == null) {
            return ElementsSession.Customer.Components.MobilePaymentElement.Disabled.INSTANCE;
        }
        if (json.optBoolean(ViewProps.ENABLED)) {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_FEATURES);
            if (jSONObjectOptJSONObject == null) {
                return ElementsSession.Customer.Components.MobilePaymentElement.Disabled.INSTANCE;
            }
            String strOptString = jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_SAVE);
            String strOptString2 = jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_REMOVE);
            String strOptString3 = jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_REMOVE_LAST);
            String strOptString4 = jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_SET_AS_DEFAULT);
            String strOptString5 = jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_ALLOW_REDISPLAY_OVERRIDE);
            Iterator<PaymentMethod.AllowRedisplay> it = PaymentMethod.AllowRedisplay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getValue(), strOptString5)) {
                    break;
                }
            }
            return new ElementsSession.Customer.Components.MobilePaymentElement.Enabled(Intrinsics.areEqual(strOptString, ViewProps.ENABLED), Intrinsics.areEqual(strOptString2, ViewProps.ENABLED), Intrinsics.areEqual(strOptString3, ViewProps.ENABLED), next, Intrinsics.areEqual(strOptString4, ViewProps.ENABLED));
        }
        return ElementsSession.Customer.Components.MobilePaymentElement.Disabled.INSTANCE;
    }

    private final ElementsSession.Customer.Components.CustomerSheet parseCustomerSheetComponent(JSONObject json) {
        if (json == null) {
            return ElementsSession.Customer.Components.CustomerSheet.Disabled.INSTANCE;
        }
        if (json.optBoolean(ViewProps.ENABLED)) {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(FIELD_FEATURES);
            if (jSONObjectOptJSONObject == null) {
                return ElementsSession.Customer.Components.CustomerSheet.Disabled.INSTANCE;
            }
            return new ElementsSession.Customer.Components.CustomerSheet.Enabled(Intrinsics.areEqual(jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_REMOVE), ViewProps.ENABLED), Intrinsics.areEqual(jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_REMOVE_LAST), ViewProps.ENABLED), Intrinsics.areEqual(jSONObjectOptJSONObject.optString(FIELD_PAYMENT_METHOD_SYNC_DEFAULT), ViewProps.ENABLED));
        }
        return ElementsSession.Customer.Components.CustomerSheet.Disabled.INSTANCE;
    }

    private final ElementsSession.CardBrandChoice parseCardBrandChoice(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("card_brand_choice");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("preferred_networks");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (strOptString != null) {
                    arrayList.add(strOptString);
                }
            }
        }
        return new ElementsSession.CardBrandChoice(jSONObjectOptJSONObject.optBoolean("eligible", false), CollectionsKt.toList(arrayList));
    }

    private final Map<String, Boolean> parseLinkFlags(JSONObject json) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = json.get(next);
            if (obj instanceof Boolean) {
                linkedHashMap.put(next, obj);
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }

    private final Map<ElementsSession.Flag, Boolean> parseSessionFlags(JSONObject json) throws JSONException {
        ElementsSession.Flag next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next2 = itKeys.next();
            Object obj = json.get(next2);
            Iterator<ElementsSession.Flag> it = ElementsSession.Flag.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getFlagValue(), next2)) {
                    break;
                }
            }
            ElementsSession.Flag flag = next;
            if (flag != null && (obj instanceof Boolean)) {
                linkedHashMap.put(flag, obj);
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }

    private final Map<ElementsSession.ExperimentAssignment, String> parseExperimentAssignments(JSONObject json) throws JSONException {
        ElementsSession.ExperimentAssignment next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = json.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next2 = itKeys.next();
            Object obj = json.get(next2);
            Iterator<ElementsSession.ExperimentAssignment> it = ElementsSession.ExperimentAssignment.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getExperimentValue(), next2)) {
                    break;
                }
            }
            ElementsSession.ExperimentAssignment experimentAssignment = next;
            if (experimentAssignment != null && (obj instanceof String)) {
                linkedHashMap.put(experimentAssignment, obj);
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }
}
