package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormCompleteEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/reactnativestripesdk/FormCompleteEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "formDetails", "", "", "", "<init>", "(IILjava/util/Map;)V", "getEventName", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormCompleteEvent extends Event<FormCompleteEvent> {
    public static final String EVENT_NAME = "topCompleteAction";
    private final Map<String, Object> formDetails;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCompleteEvent(int i, int i2, Map<String, Object> formDetails) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(formDetails, "formDetails");
        this.formDetails = formDetails;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topCompleteAction";
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getError() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("accountNumber", String.valueOf(this.formDetails.get("accountNumber")));
        writableMapCreateMap.putString("bsbNumber", String.valueOf(this.formDetails.get("bsbNumber")));
        writableMapCreateMap.putString("email", String.valueOf(this.formDetails.get("email")));
        writableMapCreateMap.putString("name", String.valueOf(this.formDetails.get("name")));
        return writableMapCreateMap;
    }
}
