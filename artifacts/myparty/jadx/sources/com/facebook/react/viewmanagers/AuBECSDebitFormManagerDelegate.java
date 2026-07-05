package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AuBECSDebitFormManagerInterface;

/* loaded from: classes4.dex */
public class AuBECSDebitFormManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AuBECSDebitFormManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AuBECSDebitFormManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (str.equals("companyName")) {
            ((AuBECSDebitFormManagerInterface) this.mViewManager).setCompanyName(t, obj == null ? null : (String) obj);
        } else if (str.equals("formStyle")) {
            ((AuBECSDebitFormManagerInterface) this.mViewManager).setFormStyle(t, new DynamicFromObject(obj));
        } else {
            super.kotlinCompat$setProperty(t, str, obj);
        }
    }
}
