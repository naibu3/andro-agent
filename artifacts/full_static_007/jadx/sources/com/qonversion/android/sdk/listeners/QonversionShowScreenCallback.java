package com.qonversion.android.sdk.listeners;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QonversionError;
import kotlin.Metadata;

/* compiled from: QonversionCallback.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "onSuccess", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QonversionShowScreenCallback {
    void onError(QonversionError error);

    void onSuccess();
}
