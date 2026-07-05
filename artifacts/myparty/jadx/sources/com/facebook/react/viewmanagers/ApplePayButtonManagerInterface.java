package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface ApplePayButtonManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBorderRadius(T t, int i);

    void setButtonStyle(T t, int i);

    void setDisabled(T t, boolean z);

    void setHasCouponCodeCallback(T t, boolean z);

    void setHasOrderTrackingCallback(T t, boolean z);

    void setHasShippingContactCallback(T t, boolean z);

    void setHasShippingMethodCallback(T t, boolean z);

    void setType(T t, int i);
}
