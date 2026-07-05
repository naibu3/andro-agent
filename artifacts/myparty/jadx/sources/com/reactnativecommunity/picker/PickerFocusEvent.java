package com.reactnativecommunity.picker;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes5.dex */
public class PickerFocusEvent extends Event<PickerFocusEvent> {
    public static final String EVENT_NAME = "topFocus";

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topFocus";
    }

    public PickerFocusEvent(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getError());
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    protected WritableMap getError() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(TypedValues.AttributesType.S_TARGET, getViewTag());
        return writableMapCreateMap;
    }
}
