package com.reactnativestripesdk;

import androidx.autofill.HintConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardFormCompleteEvent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativestripesdk/CardFormCompleteEvent;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/reactnativestripesdk/CardChangeEvent;", "surfaceId", "", "viewTag", "cardDetails", "", "", "", "complete", "", "dangerouslyGetFullCardDetails", "<init>", "(IILjava/util/Map;ZZ)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardFormCompleteEvent extends Event<CardChangeEvent> {
    public static final String EVENT_NAME = "topFormComplete";
    private final Map<String, Object> cardDetails;
    private final boolean complete;
    private final boolean dangerouslyGetFullCardDetails;
    public static final int $stable = 8;

    public CardFormCompleteEvent(int i, int i2, Map<String, Object> map, boolean z, boolean z2) {
        super(i, i2);
        this.cardDetails = map;
        this.complete = z;
        this.dangerouslyGetFullCardDetails = z2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getEventMap() {
        String string;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        Map<String, Object> map = this.cardDetails;
        if (map != null) {
            Object obj = map.get("brand");
            writableMapCreateMap.putString("brand", obj != null ? obj.toString() : null);
            Object obj2 = this.cardDetails.get("last4");
            writableMapCreateMap.putString("last4", obj2 != null ? obj2.toString() : null);
            Object obj3 = this.cardDetails.get("country");
            writableMapCreateMap.putString("country", obj3 != null ? obj3.toString() : null);
            Object obj4 = this.cardDetails.get("expiryMonth");
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            writableMapCreateMap.putInt("expiryMonth", ((Integer) obj4).intValue());
            Object obj5 = this.cardDetails.get("expiryYear");
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            writableMapCreateMap.putInt("expiryYear", ((Integer) obj5).intValue());
            writableMapCreateMap.putBoolean("complete", this.complete);
            Object obj6 = this.cardDetails.get(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            writableMapCreateMap.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, obj6 != null ? obj6.toString() : null);
            if (this.dangerouslyGetFullCardDetails) {
                Object obj7 = this.cardDetails.get("number");
                writableMapCreateMap.putString("number", (obj7 == null || (string = obj7.toString()) == null) ? null : StringsKt.replace$default(string, " ", "", false, 4, (Object) null));
                Object obj8 = this.cardDetails.get("cvc");
                writableMapCreateMap.putString("cvc", obj8 != null ? obj8.toString() : null);
            }
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("card", writableMapCreateMap);
        return writableMapCreateMap2;
    }
}
