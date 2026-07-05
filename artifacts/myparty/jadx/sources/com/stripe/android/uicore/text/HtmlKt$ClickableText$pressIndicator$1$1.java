package com.stripe.android.uicore.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Iterator;
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

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.text.HtmlKt$ClickableText$pressIndicator$1$1", f = "Html.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HtmlKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<Integer, Unit> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HtmlKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, Function1<? super Integer, Unit> function1, Continuation<? super HtmlKt$ClickableText$pressIndicator$1$1> continuation) {
        super(2, continuation);
        this.$layoutResult = mutableState;
        this.$onClick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HtmlKt$ClickableText$pressIndicator$1$1 htmlKt$ClickableText$pressIndicator$1$1 = new HtmlKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, continuation);
        htmlKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return htmlKt$ClickableText$pressIndicator$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((HtmlKt$ClickableText$pressIndicator$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            final Function1<Integer, Unit> function1 = this.$onClick;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$ClickableText$pressIndicator$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HtmlKt$ClickableText$pressIndicator$1$1.invokeSuspend$lambda$3(mutableState, function1, (Offset) obj2);
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
    public static final Unit invokeSuspend$lambda$3(MutableState mutableState, Function1 function1, Offset offset) {
        List<Rect> placeholderRects;
        List listFilterNotNull;
        Object next;
        long packedValue = offset.getPackedValue();
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult != null && (placeholderRects = textLayoutResult.getPlaceholderRects()) != null && (listFilterNotNull = CollectionsKt.filterNotNull(placeholderRects)) != null) {
            Iterator it = listFilterNotNull.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Rect rect = (Rect) next;
                if (Offset.m3416getXimpl(offset.getPackedValue()) > Offset.m3416getXimpl(rect.m3451getTopLeftF1C5BW0()) && Offset.m3416getXimpl(offset.getPackedValue()) < Offset.m3416getXimpl(rect.m3452getTopRightF1C5BW0())) {
                    break;
                }
            }
            Rect rect2 = (Rect) next;
            if (rect2 != null) {
                packedValue = Offset.m3410copydBAh8RU$default(rect2.m3452getTopRightF1C5BW0(), Offset.m3416getXimpl(rect2.m3452getTopRightF1C5BW0()) + 0.1f, 0.0f, 2, null);
            }
        }
        if (((TextLayoutResult) mutableState.getValue()) != null) {
            function1.invoke(Integer.valueOf(r10.m5574getOffsetForPositionk4lQ0M(packedValue) - 1));
        }
        return Unit.INSTANCE;
    }
}
