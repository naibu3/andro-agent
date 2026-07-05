package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: StripeBottomSheetState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "", "modalBottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "keyboardHandler", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)V", "getModalBottomSheetState", "()Landroidx/compose/material/ModalBottomSheetState;", "dismissalType", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;", "skipHideAnimation", "", "getSkipHideAnimation", "()Z", "setSkipHideAnimation", "(Z)V", "show", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDismissal", "hide", "DismissalType", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeBottomSheetState {
    public static final int $stable = 8;
    private DismissalType dismissalType;
    private final StripeBottomSheetKeyboardHandler keyboardHandler;
    private final ModalBottomSheetState modalBottomSheetState;
    private boolean skipHideAnimation;

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "awaitDismissal", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$awaitDismissal$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeBottomSheetState.this.awaitDismissal(this);
        }
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {74, 77}, m = "hide", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$hide$1, reason: invalid class name and case insensitive filesystem */
    static final class C11681 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11681(Continuation<? super C11681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeBottomSheetState.this.hide(this);
        }
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState", f = "StripeBottomSheetState.kt", i = {0}, l = {50, 57}, m = "show", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$1, reason: invalid class name and case insensitive filesystem */
    static final class C11691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11691(Continuation<? super C11691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeBottomSheetState.this.show(this);
        }
    }

    public StripeBottomSheetState(ModalBottomSheetState modalBottomSheetState, StripeBottomSheetKeyboardHandler keyboardHandler) {
        Intrinsics.checkNotNullParameter(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.checkNotNullParameter(keyboardHandler, "keyboardHandler");
        this.modalBottomSheetState = modalBottomSheetState;
        this.keyboardHandler = keyboardHandler;
    }

    public final ModalBottomSheetState getModalBottomSheetState() {
        return this.modalBottomSheetState;
    }

    public final boolean getSkipHideAnimation() {
        return this.skipHideAnimation;
    }

    public final void setSkipHideAnimation(boolean z) {
        this.skipHideAnimation = z;
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$2", f = "StripeBottomSheetState.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$2, reason: invalid class name and case insensitive filesystem */
    static final class C11702 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C11702(Continuation<? super C11702> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StripeBottomSheetState.this.new C11702(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C11702) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StripeBottomSheetState.this.getModalBottomSheetState().show(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r7, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object show(Continuation<? super Unit> continuation) {
        C11691 c11691;
        final StripeBottomSheetState stripeBottomSheetState;
        if (continuation instanceof C11691) {
            c11691 = (C11691) continuation;
            if ((c11691.label & Integer.MIN_VALUE) != 0) {
                c11691.label -= Integer.MIN_VALUE;
            } else {
                c11691 = new C11691(continuation);
            }
        }
        Object obj = c11691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11691.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11702 c11702 = new C11702(null);
            c11691.L$0 = this;
            c11691.label = 1;
            if (StripeBottomSheetStateKt.repeatUntilSucceededOrLimit(10, c11702, c11691) != coroutine_suspended) {
                stripeBottomSheetState = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        stripeBottomSheetState = (StripeBottomSheetState) c11691.L$0;
        ResultKt.throwOnFailure(obj);
        Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(StripeBottomSheetState.show$lambda$0(this.f$0));
            }
        });
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(null);
        c11691.L$0 = null;
        c11691.label = 2;
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isVisible"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$4", f = "StripeBottomSheetState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$show$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$0(StripeBottomSheetState stripeBottomSheetState) {
        return stripeBottomSheetState.modalBottomSheetState.isVisible();
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isVisible"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$awaitDismissal$3", f = "StripeBottomSheetState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$awaitDismissal$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.Z$0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitDismissal(Continuation<? super DismissalType> continuation) {
        AnonymousClass1 anonymousClass1;
        StripeBottomSheetState stripeBottomSheetState;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(StripeBottomSheetState.awaitDismissal$lambda$1(this.f$0));
                }
            });
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (FlowKt.first(flowSnapshotFlow, anonymousClass3, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            stripeBottomSheetState = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripeBottomSheetState = (StripeBottomSheetState) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        DismissalType dismissalType = stripeBottomSheetState.dismissalType;
        return dismissalType == null ? DismissalType.SwipedDownByUser : dismissalType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean awaitDismissal$lambda$1(StripeBottomSheetState stripeBottomSheetState) {
        return stripeBottomSheetState.modalBottomSheetState.isVisible();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.repeatUntilSucceededOrLimit(10, r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hide(Continuation<? super Unit> continuation) {
        C11681 c11681;
        StripeBottomSheetState stripeBottomSheetState;
        if (continuation instanceof C11681) {
            c11681 = (C11681) continuation;
            if ((c11681.label & Integer.MIN_VALUE) != 0) {
                c11681.label -= Integer.MIN_VALUE;
            } else {
                c11681 = new C11681(continuation);
            }
        }
        Object obj = c11681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11681.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.skipHideAnimation) {
                return Unit.INSTANCE;
            }
            this.dismissalType = DismissalType.Programmatically;
            StripeBottomSheetKeyboardHandler stripeBottomSheetKeyboardHandler = this.keyboardHandler;
            c11681.L$0 = this;
            c11681.label = 1;
            if (stripeBottomSheetKeyboardHandler.dismiss(c11681) != coroutine_suspended) {
                stripeBottomSheetState = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        stripeBottomSheetState = (StripeBottomSheetState) c11681.L$0;
        ResultKt.throwOnFailure(obj);
        if (!stripeBottomSheetState.modalBottomSheetState.isVisible()) {
            return Unit.INSTANCE;
        }
        AnonymousClass2 anonymousClass2 = stripeBottomSheetState.new AnonymousClass2(null);
        c11681.L$0 = null;
        c11681.label = 2;
    }

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$hide$2", f = "StripeBottomSheetState.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState$hide$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return StripeBottomSheetState.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StripeBottomSheetState.this.getModalBottomSheetState().hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;", "", "<init>", "(Ljava/lang/String;I)V", "Programmatically", "SwipedDownByUser", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DismissalType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissalType[] $VALUES;
        public static final DismissalType Programmatically = new DismissalType("Programmatically", 0);
        public static final DismissalType SwipedDownByUser = new DismissalType("SwipedDownByUser", 1);

        private static final /* synthetic */ DismissalType[] $values() {
            return new DismissalType[]{Programmatically, SwipedDownByUser};
        }

        public static EnumEntries<DismissalType> getEntries() {
            return $ENTRIES;
        }

        private DismissalType(String str, int i) {
        }

        static {
            DismissalType[] dismissalTypeArr$values = $values();
            $VALUES = dismissalTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dismissalTypeArr$values);
        }

        public static DismissalType valueOf(String str) {
            return (DismissalType) Enum.valueOf(DismissalType.class, str);
        }

        public static DismissalType[] values() {
            return (DismissalType[]) $VALUES.clone();
        }
    }
}
