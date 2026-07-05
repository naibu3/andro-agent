package com.reactnativestripesdk;

import android.content.res.Resources;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.GooglePayButtonManagerDelegate;
import com.facebook.react.viewmanagers.GooglePayButtonManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayButtonManager.kt */
@ReactModule(name = GooglePayButtonManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0017J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/reactnativestripesdk/GooglePayButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/GooglePayButtonView;", "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/GooglePayButtonManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "getDelegate", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onAfterUpdateTransaction", "", ViewHierarchyConstants.VIEW_KEY, "setType", "buttonType", "", "setAppearance", "appearance", "setBorderRadius", "borderRadius", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayButtonManager extends SimpleViewManager<GooglePayButtonView> implements GooglePayButtonManagerInterface<GooglePayButtonView> {
    public static final String REACT_CLASS = "GooglePayButton";
    private final GooglePayButtonManagerDelegate<GooglePayButtonView, GooglePayButtonManager> delegate = new GooglePayButtonManagerDelegate<>(this);
    public static final int $stable = 8;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public GooglePayButtonManagerDelegate<GooglePayButtonView, GooglePayButtonManager> getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public GooglePayButtonView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new GooglePayButtonView(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(GooglePayButtonView view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((GooglePayButtonManager) view);
        view.initialize();
    }

    @Override // com.facebook.react.viewmanagers.GooglePayButtonManagerInterface
    @ReactProp(name = "type")
    public void setType(GooglePayButtonView view, int buttonType) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setType(buttonType);
    }

    @Override // com.facebook.react.viewmanagers.GooglePayButtonManagerInterface
    @ReactProp(name = "appearance")
    public void setAppearance(GooglePayButtonView view, int appearance) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAppearance(appearance);
    }

    @Override // com.facebook.react.viewmanagers.GooglePayButtonManagerInterface
    @ReactProp(name = "borderRadius")
    public void setBorderRadius(GooglePayButtonView view, int borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(borderRadius);
    }
}
