package D0;

import android.util.Log;
import j0.AbstractC0150d;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final c f247a = new c();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        AbstractC0150d.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = b.f245a;
        String loggerName = logRecord.getLoggerName();
        AbstractC0150d.d(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i2 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC0150d.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strO = (String) b.f246b.get(loggerName);
        if (strO == null) {
            strO = q0.d.O(loggerName, 23);
        }
        if (Log.isLoggable(strO, i2)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i3 = 0;
            while (i3 < length) {
                int iG = q0.d.G(message, '\n', i3, 4);
                if (iG == -1) {
                    iG = length;
                }
                while (true) {
                    iMin = Math.min(iG, i3 + 4000);
                    String strSubstring = message.substring(i3, iMin);
                    AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, strO, strSubstring);
                    if (iMin >= iG) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
