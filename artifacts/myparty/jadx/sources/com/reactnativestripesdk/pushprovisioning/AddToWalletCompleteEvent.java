package com.reactnativestripesdk.pushprovisioning;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;

/* compiled from: AddToWalletCompleteEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/AddToWalletCompleteEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "error", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/facebook/react/bridge/WritableMap;)V", "getEventName", "", "getEventData", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddToWalletCompleteEvent extends Event<AddToWalletCompleteEvent> {
    public static final String EVENT_NAME = "topCompleteAction";
    private final WritableMap error;
    public static final int $stable = 8;

    public AddToWalletCompleteEvent(int i, int i2, WritableMap writableMap) {
        super(i, i2);
        this.error = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topCompleteAction";
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData, reason: from getter */
    protected WritableMap getError() {
        return this.error;
    }
}
