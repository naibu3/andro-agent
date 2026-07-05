package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface;

/* loaded from: classes4.dex */
public class AddToWalletButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AddToWalletButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AddToWalletButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "testEnv":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setTestEnv(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "iOSButtonStyle":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setIOSButtonStyle(t, obj == null ? "onDarkBackground" : (String) obj);
                break;
            case "androidAssetSource":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setAndroidAssetSource(t, (ReadableMap) obj);
                break;
            case "ephemeralKey":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setEphemeralKey(t, new DynamicFromObject(obj));
                break;
            case "token":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setToken(t, new DynamicFromObject(obj));
                break;
            case "cardDetails":
                ((AddToWalletButtonManagerInterface) this.mViewManager).setCardDetails(t, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
