package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.AddressSheetViewManagerInterface;

/* loaded from: classes4.dex */
public class AddressSheetViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AddressSheetViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AddressSheetViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c = 0;
                    break;
                }
                break;
            case -1681451540:
                if (str.equals("allowedCountries")) {
                    c = 1;
                    break;
                }
                break;
            case -1640343495:
                if (str.equals("sheetTitle")) {
                    c = 2;
                    break;
                }
                break;
            case -1458199411:
                if (str.equals("animationStyle")) {
                    c = 3;
                    break;
                }
                break;
            case -1141494230:
                if (str.equals("googlePlacesApiKey")) {
                    c = 4;
                    break;
                }
                break;
            case -87791168:
                if (str.equals("additionalFields")) {
                    c = 5;
                    break;
                }
                break;
            case 452779748:
                if (str.equals("primaryButtonTitle")) {
                    c = 6;
                    break;
                }
                break;
            case 466743410:
                if (str.equals(ViewProps.VISIBLE)) {
                    c = 7;
                    break;
                }
                break;
            case 1041951427:
                if (str.equals("defaultValues")) {
                    c = '\b';
                    break;
                }
                break;
            case 1796717668:
                if (str.equals("appearance")) {
                    c = '\t';
                    break;
                }
                break;
            case 1808740268:
                if (str.equals("autocompleteCountries")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((AddressSheetViewManagerInterface) this.mViewManager).setPresentationStyle(t, obj == null ? "popover" : (String) obj);
                break;
            case 1:
                ((AddressSheetViewManagerInterface) this.mViewManager).setAllowedCountries(t, (ReadableArray) obj);
                break;
            case 2:
                ((AddressSheetViewManagerInterface) this.mViewManager).setSheetTitle(t, obj != null ? (String) obj : null);
                break;
            case 3:
                ((AddressSheetViewManagerInterface) this.mViewManager).setAnimationStyle(t, obj == null ? "slide" : (String) obj);
                break;
            case 4:
                ((AddressSheetViewManagerInterface) this.mViewManager).setGooglePlacesApiKey(t, obj != null ? (String) obj : null);
                break;
            case 5:
                ((AddressSheetViewManagerInterface) this.mViewManager).setAdditionalFields(t, new DynamicFromObject(obj));
                break;
            case 6:
                ((AddressSheetViewManagerInterface) this.mViewManager).setPrimaryButtonTitle(t, obj != null ? (String) obj : null);
                break;
            case 7:
                ((AddressSheetViewManagerInterface) this.mViewManager).setVisible(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((AddressSheetViewManagerInterface) this.mViewManager).setDefaultValues(t, new DynamicFromObject(obj));
                break;
            case '\t':
                ((AddressSheetViewManagerInterface) this.mViewManager).setAppearance(t, new DynamicFromObject(obj));
                break;
            case '\n':
                ((AddressSheetViewManagerInterface) this.mViewManager).setAutocompleteCountries(t, (ReadableArray) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
