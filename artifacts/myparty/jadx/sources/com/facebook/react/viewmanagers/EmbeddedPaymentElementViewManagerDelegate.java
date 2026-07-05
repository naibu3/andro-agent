package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface;

/* loaded from: classes4.dex */
public class EmbeddedPaymentElementViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & EmbeddedPaymentElementViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public EmbeddedPaymentElementViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (str.equals("intentConfiguration")) {
            ((EmbeddedPaymentElementViewManagerInterface) this.mViewManager).setIntentConfiguration(t, new DynamicFromObject(obj));
        } else if (str.equals("configuration")) {
            ((EmbeddedPaymentElementViewManagerInterface) this.mViewManager).setConfiguration(t, new DynamicFromObject(obj));
        } else {
            super.kotlinCompat$setProperty(t, str, obj);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("clearPaymentOption")) {
            ((EmbeddedPaymentElementViewManagerInterface) this.mViewManager).clearPaymentOption(t);
        } else if (str.equals("confirm")) {
            ((EmbeddedPaymentElementViewManagerInterface) this.mViewManager).confirm(t);
        }
    }
}
