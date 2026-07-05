package com.reactnativestripesdk.addresssheet;

import com.facebook.GraphRequest;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AddressSheetViewManagerDelegate;
import com.facebook.react.viewmanagers.AddressSheetViewManagerInterface;
import com.reactnativestripesdk.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSheetViewManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r0\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;", "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "setVisible", "", ViewHierarchyConstants.VIEW_KEY, "visibility", "", "setAppearance", "appearance", "Lcom/facebook/react/bridge/Dynamic;", "setDefaultValues", "defaults", "setAdditionalFields", GraphRequest.FIELDS_PARAM, "setAllowedCountries", "countries", "Lcom/facebook/react/bridge/ReadableArray;", "setAutocompleteCountries", "setPrimaryButtonTitle", "title", "setSheetTitle", "setGooglePlacesApiKey", SDKConstants.PARAM_KEY, "setPresentationStyle", "value", "setAnimationStyle", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = AddressSheetViewManager.REACT_CLASS)
/* loaded from: classes5.dex */
public final class AddressSheetViewManager extends SimpleViewManager<AddressSheetView> implements AddressSheetViewManagerInterface<AddressSheetView> {
    public static final String REACT_CLASS = "AddressSheetView";
    private final AddressSheetViewManagerDelegate<AddressSheetView, AddressSheetViewManager> delegate = new AddressSheetViewManagerDelegate<>(this);
    public static final int $stable = 8;

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "animationStyle")
    public void setAnimationStyle(AddressSheetView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "presentationStyle")
    public void setPresentationStyle(AddressSheetView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AddressSheetViewManagerDelegate<AddressSheetView, AddressSheetViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(AddressSheetEvent.ON_SUBMIT, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onSubmitAction"))), TuplesKt.to(AddressSheetEvent.ON_ERROR, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onErrorAction"))));
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = ViewProps.VISIBLE)
    public void setVisible(AddressSheetView view, boolean visibility) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisible(visibility);
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "appearance")
    public void setAppearance(AddressSheetView view, Dynamic appearance) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        view.setAppearance(appearance.asMap());
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "defaultValues")
    public void setDefaultValues(AddressSheetView view, Dynamic defaults) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        view.setDefaultValues(defaults.asMap());
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "additionalFields")
    public void setAdditionalFields(AddressSheetView view, Dynamic fields) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(fields, "fields");
        view.setAdditionalFields(ExtensionsKt.asMapOrNull(fields));
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "allowedCountries")
    public void setAllowedCountries(AddressSheetView view, ReadableArray countries) {
        ArrayList arrayList;
        ArrayList<Object> arrayList2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (countries == null || (arrayList2 = countries.toArrayList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof String) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        view.setAllowedCountries(arrayList);
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "autocompleteCountries")
    public void setAutocompleteCountries(AddressSheetView view, ReadableArray countries) {
        ArrayList arrayList;
        ArrayList<Object> arrayList2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (countries == null || (arrayList2 = countries.toArrayList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof String) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        view.setAutocompleteCountries(arrayList);
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "primaryButtonTitle")
    public void setPrimaryButtonTitle(AddressSheetView view, String title) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPrimaryButtonTitle(title);
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "sheetTitle")
    public void setSheetTitle(AddressSheetView view, String title) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetTitle(title);
    }

    @Override // com.facebook.react.viewmanagers.AddressSheetViewManagerInterface
    @ReactProp(name = "googlePlacesApiKey")
    public void setGooglePlacesApiKey(AddressSheetView view, String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGooglePlacesApiKey(key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AddressSheetView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new AddressSheetView(reactContext);
    }
}
