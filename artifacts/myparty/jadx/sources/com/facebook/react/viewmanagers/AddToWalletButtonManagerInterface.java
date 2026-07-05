package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface AddToWalletButtonManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAndroidAssetSource(T t, ReadableMap readableMap);

    void setCardDetails(T t, Dynamic dynamic);

    void setEphemeralKey(T t, Dynamic dynamic);

    void setIOSButtonStyle(T t, String str);

    void setTestEnv(T t, boolean z);

    void setToken(T t, Dynamic dynamic);
}
