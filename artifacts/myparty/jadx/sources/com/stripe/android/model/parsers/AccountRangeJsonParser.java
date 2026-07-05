package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccountRangeJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/AccountRange;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "serialize", "accountRange", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountRangeJsonParser implements ModelJsonParser<AccountRange> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_HIGH = "account_range_high";

    @Deprecated
    public static final String FIELD_ACCOUNT_RANGE_LOW = "account_range_low";

    @Deprecated
    public static final String FIELD_BRAND = "brand";

    @Deprecated
    public static final String FIELD_COUNTRY = "country";

    @Deprecated
    public static final String FIELD_PAN_LENGTH = "pan_length";

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public AccountRange parse(JSONObject json) {
        AccountRange.BrandInfo next;
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, FIELD_ACCOUNT_RANGE_HIGH);
        String strOptString2 = StripeJsonUtils.optString(json, FIELD_ACCOUNT_RANGE_LOW);
        Integer numOptInteger = StripeJsonUtils.INSTANCE.optInteger(json, FIELD_PAN_LENGTH);
        String strOptString3 = StripeJsonUtils.optString(json, "brand");
        Iterator<AccountRange.BrandInfo> it = AccountRange.BrandInfo.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getBrandName(), strOptString3)) {
                break;
            }
        }
        AccountRange.BrandInfo brandInfo = next;
        if (strOptString == null || strOptString2 == null || numOptInteger == null || brandInfo == null) {
            return null;
        }
        return new AccountRange(new BinRange(strOptString2, strOptString), numOptInteger.intValue(), brandInfo, StripeJsonUtils.optString(json, "country"));
    }

    public final JSONObject serialize(AccountRange accountRange) throws JSONException {
        Intrinsics.checkNotNullParameter(accountRange, "accountRange");
        JSONObject jSONObjectPut = new JSONObject().put(FIELD_ACCOUNT_RANGE_LOW, accountRange.getBinRange().getLow()).put(FIELD_ACCOUNT_RANGE_HIGH, accountRange.getBinRange().getHigh()).put(FIELD_PAN_LENGTH, accountRange.getPanLength()).put("brand", accountRange.getBrandInfo().getBrandName()).put("country", accountRange.getCountry());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* compiled from: AccountRangeJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/AccountRangeJsonParser$Companion;", "", "<init>", "()V", "FIELD_ACCOUNT_RANGE_HIGH", "", "FIELD_ACCOUNT_RANGE_LOW", "FIELD_PAN_LENGTH", "FIELD_BRAND", "FIELD_COUNTRY", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
