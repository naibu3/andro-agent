package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface CardFormManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t);

    void focus(T t);

    void setAutofocus(T t, boolean z);

    void setCardStyle(T t, Dynamic dynamic);

    void setDangerouslyGetFullCardDetails(T t, boolean z);

    void setDefaultValues(T t, Dynamic dynamic);

    void setDisabled(T t, boolean z);

    void setPlaceholders(T t, Dynamic dynamic);

    void setPostalCodeEnabled(T t, boolean z);

    void setPreferredNetworks(T t, ReadableArray readableArray);
}
