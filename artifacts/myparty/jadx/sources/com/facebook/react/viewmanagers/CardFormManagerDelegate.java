package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.CardFormManagerInterface;

/* loaded from: classes4.dex */
public class CardFormManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & CardFormManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public CardFormManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "preferredNetworks":
                ((CardFormManagerInterface) this.mViewManager).setPreferredNetworks(t, (ReadableArray) obj);
                break;
            case "cardStyle":
                ((CardFormManagerInterface) this.mViewManager).setCardStyle(t, new DynamicFromObject(obj));
                break;
            case "disabled":
                ((CardFormManagerInterface) this.mViewManager).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "postalCodeEnabled":
                ((CardFormManagerInterface) this.mViewManager).setPostalCodeEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "defaultValues":
                ((CardFormManagerInterface) this.mViewManager).setDefaultValues(t, new DynamicFromObject(obj));
                break;
            case "placeholders":
                ((CardFormManagerInterface) this.mViewManager).setPlaceholders(t, new DynamicFromObject(obj));
                break;
            case "autofocus":
                ((CardFormManagerInterface) this.mViewManager).setAutofocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "dangerouslyGetFullCardDetails":
                ((CardFormManagerInterface) this.mViewManager).setDangerouslyGetFullCardDetails(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("blur")) {
            ((CardFormManagerInterface) this.mViewManager).blur(t);
        } else if (str.equals("focus")) {
            ((CardFormManagerInterface) this.mViewManager).focus(t);
        }
    }
}
