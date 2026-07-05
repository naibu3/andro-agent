package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: AutomationsEventListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\tH&¨\u0006\u000b"}, d2 = {"Lio/qonversion/sandwich/AutomationsEventListener;", "", "onAutomationEvent", "", NotificationCompat.CATEGORY_EVENT, "Lio/qonversion/sandwich/AutomationsEventListener$Event;", "payload", "", "", "Lio/qonversion/sandwich/BridgeData;", "Event", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface AutomationsEventListener {
    void onAutomationEvent(Event event, Map<String, ? extends Object> payload);

    /* compiled from: AutomationsEventListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onAutomationEvent$default(AutomationsEventListener automationsEventListener, Event event, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAutomationEvent");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            automationsEventListener.onAutomationEvent(event, map);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AutomationsEventListener.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/qonversion/sandwich/AutomationsEventListener$Event;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "ScreenShown", "ActionStarted", "ActionFailed", "ActionFinished", "AutomationsFinished", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Event {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        private final String key;
        public static final Event ScreenShown = new Event("ScreenShown", 0, "automations_screen_shown");
        public static final Event ActionStarted = new Event("ActionStarted", 1, "automations_action_started");
        public static final Event ActionFailed = new Event("ActionFailed", 2, "automations_action_failed");
        public static final Event ActionFinished = new Event("ActionFinished", 3, "automations_action_finished");
        public static final Event AutomationsFinished = new Event("AutomationsFinished", 4, "automations_finished");

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{ScreenShown, ActionStarted, ActionFailed, ActionFinished, AutomationsFinished};
        }

        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        private Event(String str, int i, String str2) {
            this.key = str2;
        }

        public final String getKey() {
            return this.key;
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventArr$values);
        }
    }
}
