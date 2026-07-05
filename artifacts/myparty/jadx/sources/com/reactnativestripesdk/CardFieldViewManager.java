package com.reactnativestripesdk;

import android.content.res.Resources;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.CardFieldManagerDelegate;
import com.facebook.react.viewmanagers.CardFieldManagerInterface;
import com.reactnativestripesdk.utils.ExtensionsKt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardFieldViewManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0017H\u0017J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\fH\u0017J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0017J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001eH\u0017J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0017H\u0017J\u001a\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/reactnativestripesdk/CardFieldViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/CardFieldView;", "Lcom/facebook/react/viewmanagers/CardFieldManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;", "kotlin.jvm.PlatformType", "reactContextRef", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "createViewInstance", "reactContext", "onDropViewInstance", "", ViewHierarchyConstants.VIEW_KEY, "setDangerouslyGetFullCardDetails", "dangerouslyGetFullCardDetails", "", "setPostalCodeEnabled", "postalCodeEnabled", "setAutofocus", "autofocus", "setCardStyle", "cardStyle", "Lcom/facebook/react/bridge/Dynamic;", "setCountryCode", "countryCode", "setOnBehalfOf", "onBehalfOf", "setPlaceholders", "placeholders", "setDisabled", "isDisabled", "setPreferredNetworks", "preferredNetworks", "Lcom/facebook/react/bridge/ReadableArray;", "blur", "focus", "clear", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = CardFieldViewManager.REACT_CLASS)
/* loaded from: classes5.dex */
public final class CardFieldViewManager extends SimpleViewManager<CardFieldView> implements CardFieldManagerInterface<CardFieldView> {
    public static final String REACT_CLASS = "CardField";
    private final CardFieldManagerDelegate<CardFieldView, CardFieldViewManager> delegate = new CardFieldManagerDelegate<>(this);
    private ThemedReactContext reactContextRef;
    public static final int $stable = 8;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public CardFieldManagerDelegate<CardFieldView, CardFieldViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(CardFocusChangeEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onFocusChange"))), TuplesKt.to(CardChangeEvent.EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onCardChange"))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public CardFieldView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        CardFieldView cardFieldView = new CardFieldView(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(cardFieldView);
        }
        return cardFieldView;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(CardFieldView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((CardFieldViewManager) view);
        ThemedReactContext themedReactContext = this.reactContextRef;
        StripeSdkModule stripeSdkModule = themedReactContext != null ? (StripeSdkModule) themedReactContext.getNativeModule(StripeSdkModule.class) : null;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "dangerouslyGetFullCardDetails")
    public void setDangerouslyGetFullCardDetails(CardFieldView view, boolean dangerouslyGetFullCardDetails) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDangerouslyGetFullCardDetails(dangerouslyGetFullCardDetails);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "postalCodeEnabled")
    public void setPostalCodeEnabled(CardFieldView view, boolean postalCodeEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPostalCodeEnabled(postalCodeEnabled);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "autofocus")
    public void setAutofocus(CardFieldView view, boolean autofocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutofocus(autofocus);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "cardStyle")
    public void setCardStyle(CardFieldView view, Dynamic cardStyle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cardStyle, "cardStyle");
        view.setCardStyle(ExtensionsKt.asMapOrNull(cardStyle));
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "countryCode")
    public void setCountryCode(CardFieldView view, String countryCode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCountryCode(countryCode);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "onBehalfOf")
    public void setOnBehalfOf(CardFieldView view, String onBehalfOf) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnBehalfOf(onBehalfOf);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "placeholders")
    public void setPlaceholders(CardFieldView view, Dynamic placeholders) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        view.setPlaceHolders(ExtensionsKt.asMapOrNull(placeholders));
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "disabled")
    public void setDisabled(CardFieldView view, boolean isDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisabled(isDisabled);
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    @ReactProp(name = "preferredNetworks")
    public void setPreferredNetworks(CardFieldView view, ReadableArray preferredNetworks) {
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

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    public void blur(CardFieldView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestBlurFromJS();
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    public void focus(CardFieldView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestFocusFromJS();
    }

    @Override // com.facebook.react.viewmanagers.CardFieldManagerInterface
    public void clear(CardFieldView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestClearFromJS();
    }
}
