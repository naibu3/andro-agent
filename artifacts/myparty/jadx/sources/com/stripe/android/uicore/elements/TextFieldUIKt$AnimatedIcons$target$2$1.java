package com.stripe.android.uicore.elements;

import androidx.compose.runtime.ProduceStateScope;
import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextFieldUI.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1", f = "TextFieldUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class TextFieldUIKt$AnimatedIcons$target$2$1 extends SuspendLambda implements Function2<ProduceStateScope<TextFieldIcon.Trailing>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $composableScope;
    final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
    final /* synthetic */ boolean $isRunningInTestHarness;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldUIKt$AnimatedIcons$target$2$1(boolean z, CoroutineScope coroutineScope, List<TextFieldIcon.Trailing> list, Continuation<? super TextFieldUIKt$AnimatedIcons$target$2$1> continuation) {
        super(2, continuation);
        this.$isRunningInTestHarness = z;
        this.$composableScope = coroutineScope;
        this.$icons = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextFieldUIKt$AnimatedIcons$target$2$1 textFieldUIKt$AnimatedIcons$target$2$1 = new TextFieldUIKt$AnimatedIcons$target$2$1(this.$isRunningInTestHarness, this.$composableScope, this.$icons, continuation);
        textFieldUIKt$AnimatedIcons$target$2$1.L$0 = obj;
        return textFieldUIKt$AnimatedIcons$target$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<TextFieldIcon.Trailing> produceStateScope, Continuation<? super Unit> continuation) {
        return ((TextFieldUIKt$AnimatedIcons$target$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
        if (!this.$isRunningInTestHarness) {
            BuildersKt__Builders_commonKt.launch$default(this.$composableScope, null, null, new AnonymousClass1(this.$icons, produceStateScope, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TextFieldUI.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1$1", f = "TextFieldUI.kt", i = {0}, l = {377}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
    /* renamed from: com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProduceStateScope<TextFieldIcon.Trailing> $$this$produceState;
        final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<TextFieldIcon.Trailing> list, ProduceStateScope<TextFieldIcon.Trailing> produceStateScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$icons = list;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$icons, this.$$this$produceState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[LOOP:0: B:10:0x0032->B:9:0x0026, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$2
                com.stripe.android.uicore.elements.TextFieldIcon$Trailing r1 = (com.stripe.android.uicore.elements.TextFieldIcon.Trailing) r1
                java.lang.Object r3 = r7.L$1
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.L$0
                androidx.compose.runtime.ProduceStateScope r4 = (androidx.compose.runtime.ProduceStateScope) r4
                kotlin.ResultKt.throwOnFailure(r8)
                goto L50
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                kotlin.ResultKt.throwOnFailure(r8)
            L26:
                java.util.List<com.stripe.android.uicore.elements.TextFieldIcon$Trailing> r8 = r7.$icons
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                androidx.compose.runtime.ProduceStateScope<com.stripe.android.uicore.elements.TextFieldIcon$Trailing> r1 = r7.$$this$produceState
                java.util.Iterator r8 = r8.iterator()
                r3 = r8
                r4 = r1
            L32:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L26
                java.lang.Object r8 = r3.next()
                r1 = r8
                com.stripe.android.uicore.elements.TextFieldIcon$Trailing r1 = (com.stripe.android.uicore.elements.TextFieldIcon.Trailing) r1
                r7.L$0 = r4
                r7.L$1 = r3
                r7.L$2 = r1
                r7.label = r2
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                r4.setValue(r1)
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
