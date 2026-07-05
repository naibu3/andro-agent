package com.reactnativestripesdk.pushprovisioning;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AddToWalletButtonManagerDelegate;
import com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface;
import com.reactnativestripesdk.utils.ExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToWalletButtonManager.kt */
@ReactModule(name = AddToWalletButtonManager.REACT_CLASS)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J$\u0010\u000f\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J \u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00180\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001eH\u0017J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0017J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0017J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020&H\u0017R*\u0010\b\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;", "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerInterface;", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "delegate", "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;", "kotlin.jvm.PlatformType", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getName", "", "getDelegate", "onDropViewInstance", "", ViewHierarchyConstants.VIEW_KEY, "onAfterUpdateTransaction", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "setAndroidAssetSource", "source", "Lcom/facebook/react/bridge/ReadableMap;", "setCardDetails", "cardDetails", "Lcom/facebook/react/bridge/Dynamic;", "setEphemeralKey", "ephemeralKey", "setToken", "token", "setIOSButtonStyle", "value", "setTestEnv", "", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddToWalletButtonManager extends SimpleViewManager<AddToWalletButtonView> implements AddToWalletButtonManagerInterface<AddToWalletButtonView> {
    public static final String REACT_CLASS = "AddToWalletButton";
    private final AddToWalletButtonManagerDelegate<AddToWalletButtonView, AddToWalletButtonManager> delegate;
    private final RequestManager requestManager;
    public static final int $stable = 8;

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "iOSButtonStyle")
    public void setIOSButtonStyle(AddToWalletButtonView view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "testEnv")
    public void setTestEnv(AddToWalletButtonView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public AddToWalletButtonManager(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.delegate = new AddToWalletButtonManagerDelegate<>(this);
        RequestManager requestManagerWith = Glide.with(applicationContext);
        Intrinsics.checkNotNullExpressionValue(requestManagerWith, "with(...)");
        this.requestManager = requestManagerWith;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AddToWalletButtonManagerDelegate<AddToWalletButtonView, AddToWalletButtonManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(AddToWalletButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.onDropViewInstance();
        super.onDropViewInstance((AddToWalletButtonManager) view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(AddToWalletButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((AddToWalletButtonManager) view);
        view.onAfterUpdateTransaction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AddToWalletButtonView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new AddToWalletButtonView(reactContext, this.requestManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to("topCompleteAction", MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onCompleteAction"))));
    }

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "androidAssetSource")
    public void setAndroidAssetSource(AddToWalletButtonView view, ReadableMap source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSourceMap(source);
    }

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "cardDetails")
    public void setCardDetails(AddToWalletButtonView view, Dynamic cardDetails) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        view.setCardDetails(ExtensionsKt.asMapOrNull(cardDetails));
    }

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "ephemeralKey")
    public void setEphemeralKey(AddToWalletButtonView view, Dynamic ephemeralKey) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        ReadableMap readableMapAsMap = ephemeralKey.asMap();
        if (readableMapAsMap == null) {
            return;
        }
        view.setEphemeralKey(readableMapAsMap);
    }

    @Override // com.facebook.react.viewmanagers.AddToWalletButtonManagerInterface
    @ReactProp(name = "token")
    public void setToken(AddToWalletButtonView view, Dynamic token) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        ReadableMap readableMapAsMap = token.asMap();
        if (readableMapAsMap == null) {
            return;
        }
        view.setToken(readableMapAsMap);
    }
}
