package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: QonversionEventsListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u0007H&¨\u0006\b"}, d2 = {"Lio/qonversion/sandwich/QonversionEventsListener;", "", "onEntitlementsUpdated", "", "entitlements", "", "", "Lio/qonversion/sandwich/BridgeData;", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QonversionEventsListener {
    void onEntitlementsUpdated(Map<String, ? extends Object> entitlements);
}
