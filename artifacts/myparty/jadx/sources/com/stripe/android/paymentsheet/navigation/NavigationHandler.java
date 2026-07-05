package com.stripe.android.paymentsheet.navigation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NavigationHandler.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u0014\u0010!\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\b\u0010%\u001a\u00020\nH\u0002J\u0006\u0010&\u001a\u00020\nJ\u0011\u0010'\u001a\u00020\n*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u0016\u0010(\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialScreen", "shouldRemoveInitialScreenOnTransition", "", "poppedScreenHandler", "Lkotlin/Function1;", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "isTransitioning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "backStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currentScreen", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentScreen", "()Lkotlinx/coroutines/flow/StateFlow;", "previousScreen", "getPreviousScreen", "canGoBack", "getCanGoBack", "()Z", "transitionTo", TypedValues.AttributesType.S_TARGET, "(Ljava/lang/Object;)V", "transitionToWithDelay", "transitionToInternal", "resetTo", "screens", "pop", "popWithDelay", "popInternal", "closeScreens", "onClose", "navigateWithDelay", "action", "Lkotlin/Function0;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationHandler<T> {
    public static final int $stable = 8;
    private final MutableStateFlow<List<T>> backStack;
    private final CoroutineScope coroutineScope;
    private final StateFlow<T> currentScreen;
    private final T initialScreen;
    private final AtomicBoolean isTransitioning;
    private final Function1<T, Unit> poppedScreenHandler;
    private final StateFlow<T> previousScreen;
    private final boolean shouldRemoveInitialScreenOnTransition;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationHandler(CoroutineScope coroutineScope, T initialScreen, boolean z, Function1<? super T, Unit> poppedScreenHandler) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(initialScreen, "initialScreen");
        Intrinsics.checkNotNullParameter(poppedScreenHandler, "poppedScreenHandler");
        this.coroutineScope = coroutineScope;
        this.initialScreen = initialScreen;
        this.shouldRemoveInitialScreenOnTransition = z;
        this.poppedScreenHandler = poppedScreenHandler;
        this.isTransitioning = new AtomicBoolean(false);
        MutableStateFlow<List<T>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.listOf(initialScreen));
        this.backStack = MutableStateFlow;
        this.currentScreen = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.navigation.NavigationHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationHandler.currentScreen$lambda$0((List) obj);
            }
        });
        this.previousScreen = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.navigation.NavigationHandler$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationHandler.previousScreen$lambda$1((List) obj);
            }
        });
    }

    public /* synthetic */ NavigationHandler(CoroutineScope coroutineScope, Object obj, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, obj, (i & 4) != 0 ? true : z, function1);
    }

    public final StateFlow<T> getCurrentScreen() {
        return this.currentScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object currentScreen$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.last(it);
    }

    public final StateFlow<T> getPreviousScreen() {
        return this.previousScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object previousScreen$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty() || it.size() == 1) {
            return null;
        }
        return it.get(it.size() - 2);
    }

    public final boolean getCanGoBack() {
        return this.backStack.getValue().size() > 1;
    }

    public final void transitionTo(T target) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.isTransitioning.get()) {
            return;
        }
        transitionToInternal(target);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transitionToWithDelay$lambda$2(NavigationHandler navigationHandler, Object obj) {
        navigationHandler.transitionToInternal(obj);
        return Unit.INSTANCE;
    }

    public final void transitionToWithDelay(final T target) {
        Intrinsics.checkNotNullParameter(target, "target");
        navigateWithDelay(new Function0() { // from class: com.stripe.android.paymentsheet.navigation.NavigationHandler$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationHandler.transitionToWithDelay$lambda$2(this.f$0, target);
            }
        });
    }

    private final void transitionToInternal(T target) {
        List<T> value;
        List<T> listPlus;
        MutableStateFlow<List<T>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<T> list = value;
            if (this.shouldRemoveInitialScreenOnTransition) {
                listPlus = CollectionsKt.plus((Collection) CollectionsKt.minus(list, this.initialScreen), (Object) target);
            } else {
                listPlus = CollectionsKt.plus((Collection) list, (Object) target);
            }
        } while (!mutableStateFlow.compareAndSet(value, listPlus));
    }

    public final void resetTo(List<? extends T> screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        if (this.isTransitioning.get()) {
            return;
        }
        List<T> value = this.backStack.getValue();
        this.backStack.setValue(screens);
        for (T t : value) {
            if (!screens.contains(t)) {
                onClose(t);
            }
        }
    }

    public final void pop() {
        if (this.isTransitioning.get()) {
            return;
        }
        popInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popWithDelay$lambda$5(NavigationHandler navigationHandler) throws IOException {
        navigationHandler.popInternal();
        return Unit.INSTANCE;
    }

    public final void popWithDelay() {
        navigateWithDelay(new Function0() { // from class: com.stripe.android.paymentsheet.navigation.NavigationHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationHandler.popWithDelay$lambda$5(this.f$0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void popInternal() throws IOException {
        List<T> value;
        List mutableList;
        MutableStateFlow<List<T>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            mutableList = CollectionsKt.toMutableList((Collection) value);
            Object objRemove = mutableList.remove(CollectionsKt.getLastIndex(mutableList));
            onClose(objRemove);
            this.poppedScreenHandler.invoke(objRemove);
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.toList(mutableList)));
    }

    public final void closeScreens() throws IOException {
        Iterator<T> it = this.backStack.getValue().iterator();
        while (it.hasNext()) {
            onClose(it.next());
        }
    }

    private final void onClose(T t) throws IOException {
        if (t instanceof Closeable) {
            ((Closeable) t).close();
        }
    }

    private final void navigateWithDelay(Function0<Unit> action) {
        if (this.isTransitioning.getAndSet(true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(action, this, null), 3, null);
    }

    /* compiled from: NavigationHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.navigation.NavigationHandler$navigateWithDelay$1", f = "NavigationHandler.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.navigation.NavigationHandler$navigateWithDelay$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $action;
        int label;
        final /* synthetic */ NavigationHandler<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, NavigationHandler<T> navigationHandler, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$action = function0;
            this.this$0 = navigationHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$action, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(DurationKt.toDuration(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, DurationUnit.MILLISECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$action.invoke();
            ((NavigationHandler) this.this$0).isTransitioning.set(false);
            return Unit.INSTANCE;
        }
    }
}
