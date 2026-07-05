package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.CardFieldManagerInterface;

/* loaded from: classes4.dex */
public class CardFieldManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & CardFieldManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public CardFieldManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1582085210:
                if (str.equals("preferredNetworks")) {
                    c = 0;
                    break;
                }
                break;
            case -1477067101:
                if (str.equals("countryCode")) {
                    c = 1;
                    break;
                }
                break;
            case -256107391:
                if (str.equals("cardStyle")) {
                    c = 2;
                    break;
                }
                break;
            case -14402964:
                if (str.equals("onBehalfOf")) {
                    c = 3;
                    break;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    c = 4;
                    break;
                }
                break;
            case 985968329:
                if (str.equals("postalCodeEnabled")) {
                    c = 5;
                    break;
                }
                break;
            case 1365780832:
                if (str.equals("placeholders")) {
                    c = 6;
                    break;
                }
                break;
            case 1667607689:
                if (str.equals("autofocus")) {
                    c = 7;
                    break;
                }
                break;
            case 2028605060:
                if (str.equals("dangerouslyGetFullCardDetails")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((CardFieldManagerInterface) this.mViewManager).setPreferredNetworks(t, (ReadableArray) obj);
                break;
            case 1:
                ((CardFieldManagerInterface) this.mViewManager).setCountryCode(t, obj != null ? (String) obj : null);
                break;
            case 2:
                ((CardFieldManagerInterface) this.mViewManager).setCardStyle(t, new DynamicFromObject(obj));
                break;
            case 3:
                ((CardFieldManagerInterface) this.mViewManager).setOnBehalfOf(t, obj != null ? (String) obj : null);
                break;
            case 4:
                ((CardFieldManagerInterface) this.mViewManager).setDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((CardFieldManagerInterface) this.mViewManager).setPostalCodeEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 6:
                ((CardFieldManagerInterface) this.mViewManager).setPlaceholders(t, new DynamicFromObject(obj));
                break;
            case 7:
                ((CardFieldManagerInterface) this.mViewManager).setAutofocus(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((CardFieldManagerInterface) this.mViewManager).setDangerouslyGetFullCardDetails(t, obj != null ? ((Boolean) obj).booleanValue() : false);
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
        switch (str) {
            case "blur":
                ((CardFieldManagerInterface) this.mViewManager).blur(t);
                break;
            case "clear":
                ((CardFieldManagerInterface) this.mViewManager).clear(t);
                break;
            case "focus":
                ((CardFieldManagerInterface) this.mViewManager).focus(t);
                break;
        }
    }
}
