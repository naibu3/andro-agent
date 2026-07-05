package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface EmbeddedPaymentElementViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void clearPaymentOption(T t);

    void confirm(T t);

    void setConfiguration(T t, Dynamic dynamic);

    void setIntentConfiguration(T t, Dynamic dynamic);
}
