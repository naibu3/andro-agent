package com.stripe.android.model.parsers;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.SetupIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DeferredSetupIntentJsonParser.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/SetupIntent;", "elementsSessionId", "", "setupMode", "Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;", NamedConstantsKt.IS_LIVE_MODE, "", "timeProvider", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;ZLkotlin/jvm/functions/Function0;)V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeferredSetupIntentJsonParser implements ModelJsonParser<SetupIntent> {
    private static final String FIELD_COUNTRY_CODE = "country_code";
    private static final String FIELD_LINK_FUNDING_SOURCES = "link_funding_sources";
    private static final String FIELD_PAYMENT_METHOD_TYPES = "payment_method_types";
    private static final String FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES = "unactivated_payment_method_types";
    private final String elementsSessionId;
    private final boolean isLiveMode;
    private final DeferredIntentParams.Mode.Setup setupMode;
    private final Function0<Long> timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DeferredSetupIntentJsonParser(String str, DeferredIntentParams.Mode.Setup setupMode, boolean z, Function0<Long> timeProvider) {
        Intrinsics.checkNotNullParameter(setupMode, "setupMode");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.elementsSessionId = str;
        this.setupMode = setupMode;
        this.isLiveMode = z;
        this.timeProvider = timeProvider;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SetupIntent parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        List<String> listJsonArrayToList = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_PAYMENT_METHOD_TYPES));
        List<String> listJsonArrayToList2 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList2, 10));
        Iterator<T> it = listJsonArrayToList2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = arrayList;
        List<String> listJsonArrayToList3 = ModelJsonParser.INSTANCE.jsonArrayToList(json.optJSONArray(FIELD_LINK_FUNDING_SOURCES));
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listJsonArrayToList3, 10));
        Iterator<T> it2 = listJsonArrayToList3.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            arrayList3.add(lowerCase2);
        }
        String strOptString = StripeJsonUtils.optString(json, FIELD_COUNTRY_CODE);
        String str = this.elementsSessionId;
        boolean z = this.isLiveMode;
        return new SetupIntent(str, null, this.timeProvider.invoke().longValue(), strOptString, null, null, z, null, null, listJsonArrayToList, null, this.setupMode.getSetupFutureUsage(), null, arrayList2, arrayList3, null, null, 69760, null);
    }

    /* compiled from: DeferredSetupIntentJsonParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser$Companion;", "", "<init>", "()V", "FIELD_COUNTRY_CODE", "", "FIELD_PAYMENT_METHOD_TYPES", "FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES", "FIELD_LINK_FUNDING_SOURCES", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
