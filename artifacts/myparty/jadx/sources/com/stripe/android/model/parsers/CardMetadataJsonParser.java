package com.stripe.android.model.parsers;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CardMetadataJsonParser.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/parsers/CardMetadataJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "<init>", "(Lcom/stripe/android/cards/Bin;)V", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "parse", "json", "Lorg/json/JSONObject;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardMetadataJsonParser implements ModelJsonParser<CardMetadata> {
    public static final int $stable = 8;
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Bin bin;

    public CardMetadataJsonParser(Bin bin) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        this.bin = bin;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public CardMetadata parse(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            AccountRangeJsonParser accountRangeJsonParser = this.accountRangeJsonParser;
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(iNextInt);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            AccountRange accountRange = accountRangeJsonParser.parse(jSONObject);
            if (accountRange != null) {
                arrayList.add(accountRange);
            }
        }
        return new CardMetadata(this.bin, arrayList);
    }
}
