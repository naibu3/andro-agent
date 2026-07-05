package com.stripe.android.ui.core.elements;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HyperlinkedText.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1$1", f = "HyperlinkedText.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HyperlinkedTextKt$HyperlinkedText$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnnotatedString $annotatedString;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ UriHandler $uriHandler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperlinkedTextKt$HyperlinkedText$1$1(MutableState<TextLayoutResult> mutableState, AnnotatedString annotatedString, UriHandler uriHandler, Continuation<? super HyperlinkedTextKt$HyperlinkedText$1$1> continuation) {
        super(2, continuation);
        this.$layoutResult = mutableState;
        this.$annotatedString = annotatedString;
        this.$uriHandler = uriHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HyperlinkedTextKt$HyperlinkedText$1$1 hyperlinkedTextKt$HyperlinkedText$1$1 = new HyperlinkedTextKt$HyperlinkedText$1$1(this.$layoutResult, this.$annotatedString, this.$uriHandler, continuation);
        hyperlinkedTextKt$HyperlinkedText$1$1.L$0 = obj;
        return hyperlinkedTextKt$HyperlinkedText$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((HyperlinkedTextKt$HyperlinkedText$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            final AnnotatedString annotatedString = this.$annotatedString;
            final UriHandler uriHandler = this.$uriHandler;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HyperlinkedTextKt$HyperlinkedText$1$1.invokeSuspend$lambda$2(mutableState, annotatedString, uriHandler, (Offset) obj2);
                }
            }, this, 7, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler, Offset offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult != null) {
            int iM5574getOffsetForPositionk4lQ0M = textLayoutResult.m5574getOffsetForPositionk4lQ0M(offset.getPackedValue());
            AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations(iM5574getOffsetForPositionk4lQ0M, iM5574getOffsetForPositionk4lQ0M));
            if (range != null && Intrinsics.areEqual(range.getTag(), "URL")) {
                uriHandler.openUri((String) range.getItem());
            }
        }
        return Unit.INSTANCE;
    }
}
