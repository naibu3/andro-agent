package com.reactnativestripesdk.addresssheet;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSheetEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000e\u000fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "eventType", "Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;", "eventMap", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "(IILcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;Lcom/facebook/react/bridge/WritableMap;)V", "getEventData", "getEventName", "", "EventType", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressSheetEvent extends Event<AddressSheetEvent> {
    public static final String ON_ERROR = "topErrorAction";
    public static final String ON_SUBMIT = "topSubmitAction";
    private final WritableMap eventMap;
    private final EventType eventType;
    public static final int $stable = 8;

    /* compiled from: AddressSheetEvent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OnSubmit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.OnError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressSheetEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetEvent$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "OnSubmit", "OnError", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType OnSubmit = new EventType("OnSubmit", 0);
        public static final EventType OnError = new EventType("OnError", 1);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{OnSubmit, OnError};
        }

        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        private EventType(String str, int i) {
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventTypeArr$values);
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSheetEvent(int i, int i2, EventType eventType, WritableMap writableMap) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.eventMap = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData, reason: from getter */
    protected WritableMap getEventMap() {
        return this.eventMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.eventType.ordinal()];
        if (i == 1) {
            return ON_SUBMIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ON_ERROR;
    }
}
