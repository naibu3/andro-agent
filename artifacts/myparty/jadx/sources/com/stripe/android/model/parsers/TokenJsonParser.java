package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: TokenJsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Token;", "<init>", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenJsonParser implements ModelJsonParser<Token> {
    public static final String FIELD_BANK_ACCOUNT = "bank_account";
    public static final String FIELD_CREATED = "created";
    public static final String FIELD_ID = "id";
    public static final String FIELD_LIVEMODE = "livemode";
    public static final String FIELD_OBJECT = "object";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_USED = "used";

    /* compiled from: TokenJsonParser.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Token.Type.values().length];
            try {
                iArr[Token.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Token.Type.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Token parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "id");
        Long lOptLong = StripeJsonUtils.INSTANCE.optLong(json, "created");
        Token.Type typeFromCode = Token.Type.INSTANCE.fromCode(StripeJsonUtils.optString(json, "type"));
        if (typeFromCode == null || strOptString == null || lOptLong == null) {
            return null;
        }
        boolean zOptBoolean = StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_USED);
        boolean zOptBoolean2 = StripeJsonUtils.INSTANCE.optBoolean(json, FIELD_LIVEMODE);
        Date date = new Date(TimeUnit.SECONDS.toMillis(lOptLong.longValue()));
        int i = WhenMappings.$EnumSwitchMapping$0[typeFromCode.ordinal()];
        if (i == 1) {
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(Token.Type.Card.getCode());
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            return new Token(strOptString, Token.Type.Card, date, zOptBoolean2, zOptBoolean, null, new CardJsonParser().parse(jSONObjectOptJSONObject), 32, null);
        }
        if (i == 2) {
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(Token.Type.BankAccount.getCode());
            if (jSONObjectOptJSONObject2 == null) {
                return null;
            }
            return new Token(strOptString, Token.Type.BankAccount, date, zOptBoolean2, zOptBoolean, new BankAccountJsonParser().parse(jSONObjectOptJSONObject2), null, 64, null);
        }
        return new Token(strOptString, typeFromCode, date, zOptBoolean2, zOptBoolean, null, null, 96, null);
    }
}
