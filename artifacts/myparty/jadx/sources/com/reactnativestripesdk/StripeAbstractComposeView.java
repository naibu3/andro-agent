package com.reactnativestripesdk;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.facebook.react.bridge.ReactContext;
import com.reactnativestripesdk.StripeAbstractComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeAbstractComposeView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/reactnativestripesdk/StripeAbstractComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isLifecycleSetup", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "onAttachedToWindow", "", "handleOnDropViewInstance", "CompatView", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StripeAbstractComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private boolean isLifecycleSetup;
    private final LifecycleOwner lifecycleOwner;
    private LifecycleRegistry lifecycleRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeAbstractComposeView(Context context) {
        CompatView composeCompatView;
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        LifecycleOwner lifecycleOwner = new LifecycleOwner() { // from class: com.reactnativestripesdk.StripeAbstractComposeView$lifecycleOwner$1
            @Override // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                return this.this$0.lifecycleRegistry;
            }
        };
        this.lifecycleOwner = lifecycleOwner;
        this.lifecycleRegistry = new LifecycleRegistry(lifecycleOwner);
        setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(lifecycleOwner));
        StripeAbstractComposeView stripeAbstractComposeView = this;
        ViewTreeLifecycleOwner.set(stripeAbstractComposeView, lifecycleOwner);
        StripeSdkModule stripeSdkModule = (StripeSdkModule) ((ReactContext) context).getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule == null || (composeCompatView = stripeSdkModule.getComposeCompatView()) == null) {
            return;
        }
        CompatView compatView = composeCompatView;
        setParentCompositionContext(WindowRecomposer_androidKt.findViewTreeCompositionContext(compatView));
        ViewTreeSavedStateRegistryOwner.set(stripeAbstractComposeView, ViewTreeSavedStateRegistryOwner.get(compatView));
        ViewTreeViewModelStoreOwner.set(stripeAbstractComposeView, ViewTreeViewModelStoreOwner.get(compatView));
    }

    /* compiled from: StripeAbstractComposeView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0017¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/reactnativestripesdk/StripeAbstractComposeView$CompatView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompatView extends AbstractComposeView {
        public static final int $stable = AbstractComposeView.$stable;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$0(CompatView compatView, int i, Composer composer, int i2) {
            compatView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompatView(Context context) {
            super(context, null, 0, 6, null);
            Intrinsics.checkNotNullParameter(context, "context");
            setVisibility(8);
        }

        @Override // androidx.compose.ui.platform.AbstractComposeView
        public void Content(Composer composer, final int i) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-445242522);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content):StripeAbstractComposeView.kt#iypzlo");
            if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-445242522, i, -1, "com.reactnativestripesdk.StripeAbstractComposeView.CompatView.Content (StripeAbstractComposeView.kt:53)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.reactnativestripesdk.StripeAbstractComposeView$CompatView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StripeAbstractComposeView.CompatView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isLifecycleSetup) {
            return;
        }
        Context context = getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        Object currentActivity = reactContext != null ? reactContext.getCurrentActivity() : null;
        LifecycleOwner lifecycleOwner = currentActivity instanceof LifecycleOwner ? (LifecycleOwner) currentActivity : null;
        if (lifecycleOwner != null) {
            this.isLifecycleSetup = true;
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.reactnativestripesdk.StripeAbstractComposeView$onAttachedToWindow$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    this.this$0.lifecycleRegistry.handleLifecycleEvent(event);
                }
            });
        }
    }

    public final void handleOnDropViewInstance() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }
}
