package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1", f = "Text.kt", i = {}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class TextKt$AnnotatedText$pressIndicator$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult$delegate;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ MutableState<String> $pressedAnnotation$delegate;
    final /* synthetic */ AnnotatedString $resource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextKt$AnnotatedText$pressIndicator$1$1(AnnotatedString annotatedString, MutableState<TextLayoutResult> mutableState, MutableState<String> mutableState2, Function1<? super String, Unit> function1, Continuation<? super TextKt$AnnotatedText$pressIndicator$1$1> continuation) {
        super(2, continuation);
        this.$resource = annotatedString;
        this.$layoutResult$delegate = mutableState;
        this.$pressedAnnotation$delegate = mutableState2;
        this.$onClickableTextClick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$1 = new TextKt$AnnotatedText$pressIndicator$1$1(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, this.$onClickableTextClick, continuation);
        textKt$AnnotatedText$pressIndicator$1$1.L$0 = obj;
        return textKt$AnnotatedText$pressIndicator$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TextKt$AnnotatedText$pressIndicator$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, null);
            final AnnotatedString annotatedString = this.$resource;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult$delegate;
            final Function1<String, Unit> function1 = this.$onClickableTextClick;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new Function1() { // from class: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TextKt$AnnotatedText$pressIndicator$1$1.invokeSuspend$lambda$1(annotatedString, mutableState, function1, (Offset) obj2);
                }
            }, this, 3, null) == coroutine_suspended) {
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

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$1", f = "Text.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult$delegate;
        final /* synthetic */ MutableState<String> $pressedAnnotation$delegate;
        final /* synthetic */ AnnotatedString $resource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnnotatedString annotatedString, MutableState<TextLayoutResult> mutableState, MutableState<String> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$resource = annotatedString;
            this.$layoutResult$delegate = mutableState;
            this.$pressedAnnotation$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m7589invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m7589invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, continuation);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                TextLayoutResult textLayoutResultAnnotatedText_rm0N8CA$lambda$7 = TextKt.AnnotatedText_rm0N8CA$lambda$7(this.$layoutResult$delegate);
                AnnotatedString.Range rangeM7588clickedAnnotationd4ec7I = textLayoutResultAnnotatedText_rm0N8CA$lambda$7 != null ? TextKt.m7588clickedAnnotationd4ec7I(textLayoutResultAnnotatedText_rm0N8CA$lambda$7, j, this.$resource) : null;
                this.$pressedAnnotation$delegate.setValue(rangeM7588clickedAnnotationd4ec7I != null ? (String) rangeM7588clickedAnnotationd4ec7I.getItem() : null);
                this.label = 1;
                if (pressGestureScope.tryAwaitRelease(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$pressedAnnotation$delegate.setValue(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AnnotatedString annotatedString, MutableState mutableState, Function1 function1, Offset offset) {
        AnnotatedString.Range rangeM7588clickedAnnotationd4ec7I;
        TextLayoutResult textLayoutResultAnnotatedText_rm0N8CA$lambda$7 = TextKt.AnnotatedText_rm0N8CA$lambda$7(mutableState);
        if (textLayoutResultAnnotatedText_rm0N8CA$lambda$7 != null && (rangeM7588clickedAnnotationd4ec7I = TextKt.m7588clickedAnnotationd4ec7I(textLayoutResultAnnotatedText_rm0N8CA$lambda$7, offset.getPackedValue(), annotatedString)) != null) {
            function1.invoke(rangeM7588clickedAnnotationd4ec7I.getItem());
        }
        return Unit.INSTANCE;
    }
}
