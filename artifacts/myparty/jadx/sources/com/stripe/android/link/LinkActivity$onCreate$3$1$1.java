package com.stripe.android.link;

import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LinkActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.LinkActivity$onCreate$3$1$1", f = "LinkActivity.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkActivity$onCreate$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    final /* synthetic */ LinkActivityViewModel $vm;
    int label;
    final /* synthetic */ LinkActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkActivity$onCreate$3$1$1(LinkActivityViewModel linkActivityViewModel, StripeBottomSheetState stripeBottomSheetState, LinkActivity linkActivity, Continuation<? super LinkActivity$onCreate$3$1$1> continuation) {
        super(2, continuation);
        this.$vm = linkActivityViewModel;
        this.$bottomSheetState = stripeBottomSheetState;
        this.this$0 = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkActivity$onCreate$3$1$1(this.$vm, this.$bottomSheetState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LinkActivity$onCreate$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: LinkActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.LinkActivity$onCreate$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        final /* synthetic */ LinkActivity this$0;

        AnonymousClass1(StripeBottomSheetState stripeBottomSheetState, LinkActivity linkActivity) {
            this.$bottomSheetState = stripeBottomSheetState;
            this.this$0 = linkActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(LinkActivityResult linkActivityResult, Continuation<? super Unit> continuation) {
            LinkActivity$onCreate$3$1$1$1$emit$1 linkActivity$onCreate$3$1$1$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof LinkActivity$onCreate$3$1$1$1$emit$1) {
                linkActivity$onCreate$3$1$1$1$emit$1 = (LinkActivity$onCreate$3$1$1$1$emit$1) continuation;
                if ((linkActivity$onCreate$3$1$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    linkActivity$onCreate$3$1$1$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    linkActivity$onCreate$3$1$1$1$emit$1 = new LinkActivity$onCreate$3$1$1$1$emit$1(this, continuation);
                }
            }
            Object obj = linkActivity$onCreate$3$1$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = linkActivity$onCreate$3$1$1$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
                linkActivity$onCreate$3$1$1$1$emit$1.L$0 = this;
                linkActivity$onCreate$3$1$1$1$emit$1.L$1 = linkActivityResult;
                linkActivity$onCreate$3$1$1$1$emit$1.label = 1;
                if (stripeBottomSheetState.hide(linkActivity$onCreate$3$1$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkActivityResult = (LinkActivityResult) linkActivity$onCreate$3$1$1$1$emit$1.L$1;
                anonymousClass1 = (AnonymousClass1) linkActivity$onCreate$3$1$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            anonymousClass1.this$0.dismissWithResult(linkActivityResult);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((LinkActivityResult) obj, (Continuation<? super Unit>) continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$vm.getResult().collect(new AnonymousClass1(this.$bottomSheetState, this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
