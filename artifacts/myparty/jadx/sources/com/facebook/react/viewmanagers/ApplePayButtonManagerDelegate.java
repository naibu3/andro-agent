package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ApplePayButtonManagerInterface;

/* loaded from: classes4.dex */
public class ApplePayButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ApplePayButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ApplePayButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "buttonStyle":
                ((ApplePayButtonManagerInterface) this.mViewManager).setButtonStyle(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "hasShippingContactCallback":
                ((ApplePayButtonManagerInterface) this.mViewManager).setHasShippingContactCallback(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hasCouponCodeCallback":
                ((ApplePayButtonManagerInterface) this.mViewManager).setHasCouponCodeCallback(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "type":
                ((ApplePayButtonManagerInterface) this.mViewManager).setType(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "disabled":
                ((ApplePayButtonManagerInterface) this.mViewManager).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hasShippingMethodCallback":
                ((ApplePayButtonManagerInterface) this.mViewManager).setHasShippingMethodCallback(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "borderRadius":
                ((ApplePayButtonManagerInterface) this.mViewManager).setBorderRadius(t, obj != null ? ((Double) obj).intValue() : 4);
                break;
            case "hasOrderTrackingCallback":
                ((ApplePayButtonManagerInterface) this.mViewManager).setHasOrderTrackingCallback(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
