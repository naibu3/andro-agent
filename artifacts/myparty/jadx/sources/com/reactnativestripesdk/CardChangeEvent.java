package com.reactnativestripesdk;

import androidx.autofill.HintConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardChangeEvent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativestripesdk/CardChangeEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "cardDetails", "", "", "", "postalCodeEnabled", "", "complete", "dangerouslyGetFullCardDetails", "<init>", "(IILjava/util/Map;ZZZ)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardChangeEvent extends Event<CardChangeEvent> {
    public static final String EVENT_NAME = "topCardChange";
    private final Map<String, Object> cardDetails;
    private final boolean complete;
    private final boolean dangerouslyGetFullCardDetails;
    private final boolean postalCodeEnabled;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardChangeEvent(int i, int i2, Map<String, Object> cardDetails, boolean z, boolean z2, boolean z3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        this.postalCodeEnabled = z;
        this.complete = z2;
        this.dangerouslyGetFullCardDetails = z3;
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
        Object obj = this.cardDetails.get("brand");
        writableMapCreateMap.putString("brand", obj != null ? obj.toString() : null);
        Object obj2 = this.cardDetails.get("last4");
        writableMapCreateMap.putString("last4", obj2 != null ? obj2.toString() : null);
        Integer num = (Integer) this.cardDetails.get("expiryMonth");
        if (num != null) {
            writableMapCreateMap.putInt("expiryMonth", num.intValue());
        } else {
            writableMapCreateMap.putNull("expiryMonth");
        }
        Integer num2 = (Integer) this.cardDetails.get("expiryYear");
        if (num2 != null) {
            writableMapCreateMap.putInt("expiryYear", num2.intValue());
        } else {
            writableMapCreateMap.putNull("expiryYear");
        }
        writableMapCreateMap.putBoolean("complete", this.complete);
        Object obj3 = this.cardDetails.get("validNumber");
        writableMapCreateMap.putString("validNumber", obj3 != null ? obj3.toString() : null);
        Object obj4 = this.cardDetails.get("validCVC");
        writableMapCreateMap.putString("validCVC", obj4 != null ? obj4.toString() : null);
        Object obj5 = this.cardDetails.get("validExpiryDate");
        writableMapCreateMap.putString("validExpiryDate", obj5 != null ? obj5.toString() : null);
        if (this.postalCodeEnabled) {
            Object obj6 = this.cardDetails.get(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            writableMapCreateMap.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, obj6 != null ? obj6.toString() : null);
        }
        if (this.dangerouslyGetFullCardDetails) {
            Object obj7 = this.cardDetails.get("number");
            writableMapCreateMap.putString("number", (obj7 == null || (string = obj7.toString()) == null) ? null : StringsKt.replace$default(string, " ", "", false, 4, (Object) null));
            Object obj8 = this.cardDetails.get("cvc");
            writableMapCreateMap.putString("cvc", obj8 != null ? obj8.toString() : null);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("card", writableMapCreateMap);
        return writableMapCreateMap2;
    }
}
