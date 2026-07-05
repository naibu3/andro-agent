package com.qonversion.android.sdk.listeners;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: QonversionCallback.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "onSuccess", "products", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QonversionProductsCallback {
    void onError(QonversionError error);

    void onSuccess(Map<String, QProduct> products);
}
