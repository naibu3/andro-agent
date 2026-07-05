package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes4.dex */
public interface AddressSheetViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAdditionalFields(T t, Dynamic dynamic);

    void setAllowedCountries(T t, ReadableArray readableArray);

    void setAnimationStyle(T t, String str);

    void setAppearance(T t, Dynamic dynamic);

    void setAutocompleteCountries(T t, ReadableArray readableArray);

    void setDefaultValues(T t, Dynamic dynamic);

    void setGooglePlacesApiKey(T t, String str);

    void setPresentationStyle(T t, String str);

    void setPrimaryButtonTitle(T t, String str);

    void setSheetTitle(T t, String str);

    void setVisible(T t, boolean z);
}
