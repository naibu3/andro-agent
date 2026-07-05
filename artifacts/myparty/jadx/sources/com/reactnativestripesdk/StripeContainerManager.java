package com.reactnativestripesdk;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.StripeContainerManagerDelegate;
import com.facebook.react.viewmanagers.StripeContainerManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeContainerManager.kt */
@ReactModule(name = StripeContainerManager.REACT_CLASS)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/reactnativestripesdk/StripeContainerManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativestripesdk/StripeContainerView;", "Lcom/facebook/react/viewmanagers/StripeContainerManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/StripeContainerManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "getDelegate", "setKeyboardShouldPersistTaps", "", ViewHierarchyConstants.VIEW_KEY, "keyboardShouldPersistTaps", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeContainerManager extends ViewGroupManager<StripeContainerView> implements StripeContainerManagerInterface<StripeContainerView> {
    public static final String REACT_CLASS = "StripeContainer";
    private final StripeContainerManagerDelegate<StripeContainerView, StripeContainerManager> delegate;
    public static final int $stable = 8;

    public StripeContainerManager() {
        super(null, 1, null);
        this.delegate = new StripeContainerManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StripeContainerManagerDelegate<StripeContainerView, StripeContainerManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.StripeContainerManagerInterface
    @ReactProp(name = "keyboardShouldPersistTaps")
    public void setKeyboardShouldPersistTaps(StripeContainerView view, boolean keyboardShouldPersistTaps) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setKeyboardShouldPersistTaps(keyboardShouldPersistTaps);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StripeContainerView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new StripeContainerView(reactContext);
    }
}
