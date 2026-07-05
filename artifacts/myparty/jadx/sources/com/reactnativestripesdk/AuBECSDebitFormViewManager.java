package com.reactnativestripesdk;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AuBECSDebitFormManagerDelegate;
import com.facebook.react.viewmanagers.AuBECSDebitFormManagerInterface;
import com.reactnativestripesdk.utils.ExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuBECSDebitFormViewManager.kt */
@ReactModule(name = AuBECSDebitFormViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0017J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/AuBECSDebitFormView;", "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/AuBECSDebitFormManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "setCompanyName", "", ViewHierarchyConstants.VIEW_KEY, "name", "setFormStyle", "style", "Lcom/facebook/react/bridge/Dynamic;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuBECSDebitFormViewManager extends SimpleViewManager<AuBECSDebitFormView> implements AuBECSDebitFormManagerInterface<AuBECSDebitFormView> {
    public static final String REACT_CLASS = "AuBECSDebitForm";
    private final AuBECSDebitFormManagerDelegate<AuBECSDebitFormView, AuBECSDebitFormViewManager> delegate = new AuBECSDebitFormManagerDelegate<>(this);
    public static final int $stable = 8;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AuBECSDebitFormManagerDelegate<AuBECSDebitFormView, AuBECSDebitFormViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to("topCompleteAction", MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onCompleteAction"))));
    }

    @Override // com.facebook.react.viewmanagers.AuBECSDebitFormManagerInterface
    @ReactProp(name = "companyName")
    public void setCompanyName(AuBECSDebitFormView view, String name) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCompanyName(name);
    }

    @Override // com.facebook.react.viewmanagers.AuBECSDebitFormManagerInterface
    @ReactProp(name = "formStyle")
    public void setFormStyle(AuBECSDebitFormView view, Dynamic style) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(style, "style");
        view.setFormStyle(ExtensionsKt.asMapOrNull(style));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AuBECSDebitFormView createViewInstance(ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new AuBECSDebitFormView(reactContext);
    }
}
