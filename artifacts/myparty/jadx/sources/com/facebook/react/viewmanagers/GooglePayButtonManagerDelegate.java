package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.GooglePayButtonManagerInterface;

/* loaded from: classes4.dex */
public class GooglePayButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & GooglePayButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public GooglePayButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "type":
                ((GooglePayButtonManagerInterface) this.mViewManager).setType(t, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case "borderRadius":
                ((GooglePayButtonManagerInterface) this.mViewManager).setBorderRadius(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "appearance":
                ((GooglePayButtonManagerInterface) this.mViewManager).setAppearance(t, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
