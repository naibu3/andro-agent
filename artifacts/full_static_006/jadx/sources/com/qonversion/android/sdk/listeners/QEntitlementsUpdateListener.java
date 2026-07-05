package com.qonversion.android.sdk.listeners;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: QEntitlementsUpdateListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "", "onEntitlementsUpdated", "", "entitlements", "", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QEntitlementsUpdateListener {
    void onEntitlementsUpdated(Map<String, QEntitlement> entitlements);
}
