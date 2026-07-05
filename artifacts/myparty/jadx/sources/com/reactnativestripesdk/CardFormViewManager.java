package com.reactnativestripesdk;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.CardFormManagerDelegate;
import com.facebook.react.viewmanagers.CardFormManagerInterface;
import com.reactnativestripesdk.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardFormViewManager.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f0\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0017J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0017J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0017J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0017J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014H\u0017J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010$H\u0017J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\nH\u0014J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/reactnativestripesdk/CardFormViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/CardFormView;", "Lcom/facebook/react/viewmanagers/CardFormManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;", "kotlin.jvm.PlatformType", "reactContextRef", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "setDangerouslyGetFullCardDetails", "", ViewHierarchyConstants.VIEW_KEY, "dangerouslyGetFullCardDetails", "", "setPostalCodeEnabled", "postalCodeEnabled", "setPlaceholders", "placeholders", "Lcom/facebook/react/bridge/Dynamic;", "setAutofocus", "autofocus", "setCardStyle", "cardStyle", "setDefaultValues", "defaults", "setDisabled", "isDisabled", "setPreferredNetworks", "preferredNetworks", "Lcom/facebook/react/bridge/ReadableArray;", "createViewInstance", "reactContext", "onDropViewInstance", "blur", "focus", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = CardFormViewManager.REACT_CLASS)
/* loaded from: classes5.dex */
public final class CardFormViewManager extends SimpleViewManager<CardFormView> implements CardFormManagerInterface<CardFormView> {
    public static final String REACT_CLASS = "CardForm";
    private final CardFormManagerDelegate<CardFormView, CardFormViewManager> delegate = new CardFormManagerDelegate<>(this);
    private ThemedReactContext reactContextRef;
    public static final int $stable = 8;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public CardFormManagerDelegate<CardFormView, CardFormViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(CardFocusChangeEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onFocusChange"))), TuplesKt.to(CardFormCompleteEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onFormComplete"))));
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "dangerouslyGetFullCardDetails")
    public void setDangerouslyGetFullCardDetails(CardFormView view, boolean dangerouslyGetFullCardDetails) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDangerouslyGetFullCardDetails(dangerouslyGetFullCardDetails);
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "postalCodeEnabled")
    public void setPostalCodeEnabled(CardFormView view, boolean postalCodeEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPostalCodeEnabled(postalCodeEnabled);
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "placeholders")
    public void setPlaceholders(CardFormView view, Dynamic placeholders) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        view.setPlaceHolders(ExtensionsKt.asMapOrNull(placeholders));
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "autofocus")
    public void setAutofocus(CardFormView view, boolean autofocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutofocus(autofocus);
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "cardStyle")
    public void setCardStyle(CardFormView view, Dynamic cardStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        view.setCardStyle(ExtensionsKt.asMapOrNull(cardStyle));
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "defaultValues")
    public void setDefaultValues(CardFormView view, Dynamic defaults) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(defaults, "defaults");
        view.setDefaultValues(ExtensionsKt.asMapOrNull(defaults));
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "disabled")
    public void setDisabled(CardFormView view, boolean isDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisabled(isDisabled);
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    @ReactProp(name = "preferredNetworks")
    public void setPreferredNetworks(CardFormView view, ReadableArray preferredNetworks) {
        ArrayList<Integer> arrayList;
        ArrayList<Object> arrayList2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (preferredNetworks == null || (arrayList2 = preferredNetworks.toArrayList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof Integer) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList<>(arrayList3);
        }
        view.setPreferredNetworks(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public CardFormView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        CardFormView cardFormView = new CardFormView(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(cardFormView);
        }
        return cardFormView;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(CardFormView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((CardFormViewManager) view);
        ThemedReactContext themedReactContext = this.reactContextRef;
        StripeSdkModule stripeSdkModule = themedReactContext != null ? (StripeSdkModule) themedReactContext.getNativeModule(StripeSdkModule.class) : null;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    public void blur(CardFormView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestBlurFromJS();
    }

    @Override // com.facebook.react.viewmanagers.CardFormManagerInterface
    public void focus(CardFormView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestFocusFromJS();
    }
}
