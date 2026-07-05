package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.TokenizationMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SourceCardDataJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SourceTypeModel$Card;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceCardDataJsonParser implements ModelJsonParser<SourceTypeModel.Card> {
    public static final int $stable = 0;
    private static final String FIELD_ADDRESS_LINE1_CHECK = "address_line1_check";
    private static final String FIELD_ADDRESS_ZIP_CHECK = "address_zip_check";
    private static final String FIELD_BRAND = "brand";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_CVC_CHECK = "cvc_check";
    private static final String FIELD_DYNAMIC_LAST4 = "dynamic_last4";
    private static final String FIELD_EXP_MONTH = "exp_month";
    private static final String FIELD_EXP_YEAR = "exp_year";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_LAST4 = "last4";
    private static final String FIELD_THREE_D_SECURE = "three_d_secure";
    private static final String FIELD_TOKENIZATION_METHOD = "tokenization_method";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SourceTypeModel.Card parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new SourceTypeModel.Card(StripeJsonUtils.optString(json, FIELD_ADDRESS_LINE1_CHECK), StripeJsonUtils.optString(json, FIELD_ADDRESS_ZIP_CHECK), Card.INSTANCE.getCardBrand(StripeJsonUtils.optString(json, "brand")), StripeJsonUtils.optString(json, "country"), StripeJsonUtils.optString(json, FIELD_CVC_CHECK), StripeJsonUtils.optString(json, FIELD_DYNAMIC_LAST4), StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_MONTH), StripeJsonUtils.INSTANCE.optInteger(json, FIELD_EXP_YEAR), CardFunding.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_FUNDING)), StripeJsonUtils.optString(json, "last4"), SourceTypeModel.Card.ThreeDSecureStatus.INSTANCE.fromCode(StripeJsonUtils.optString(json, "three_d_secure")), TokenizationMethod.INSTANCE.fromCode(StripeJsonUtils.optString(json, FIELD_TOKENIZATION_METHOD)));
    }
}
