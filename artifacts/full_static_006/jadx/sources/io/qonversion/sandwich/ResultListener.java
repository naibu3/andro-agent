package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ResultListener.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¨\u0006\n"}, d2 = {"Lio/qonversion/sandwich/ResultListener;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lio/qonversion/sandwich/SandwichError;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface ResultListener {
    void onError(SandwichError error);

    void onSuccess(Map<String, ? extends Object> data);
}
