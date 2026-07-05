package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeImageLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$2", f = "StripeImageLoader.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class StripeImageLoader$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ String $url;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ StripeImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeImageLoader$load$2(StripeImageLoader stripeImageLoader, String str, int i, int i2, Continuation<? super StripeImageLoader$load$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeImageLoader;
        this.$url = str;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StripeImageLoader$load$2(this.this$0, this.$url, this.$width, this.$height, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Bitmap>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Bitmap>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Bitmap>> continuation) {
        return ((StripeImageLoader$load$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: StripeImageLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.image.StripeImageLoader$load$2$1", f = "StripeImageLoader.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.uicore.image.StripeImageLoader$load$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Bitmap>>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ String $url;
        final /* synthetic */ int $width;
        int label;
        final /* synthetic */ StripeImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StripeImageLoader stripeImageLoader, String str, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = stripeImageLoader;
            this.$url = str;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$url, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Bitmap>> continuation) {
            return invoke2((Continuation<? super Result<Bitmap>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Bitmap>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM8884loadFromNetworkBWLJW6A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result resultM8883loadFromMemoryCmtIpJM = this.this$0.m8883loadFromMemoryCmtIpJM(this.$url);
                if (resultM8883loadFromMemoryCmtIpJM == null && (resultM8883loadFromMemoryCmtIpJM = this.this$0.m8882loadFromDiskCmtIpJM(this.$url)) == null) {
                    this.label = 1;
                    objM8884loadFromNetworkBWLJW6A = this.this$0.m8884loadFromNetworkBWLJW6A(this.$url, this.$width, this.$height, this);
                    if (objM8884loadFromNetworkBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    objM8884loadFromNetworkBWLJW6A = resultM8883loadFromMemoryCmtIpJM.getValue();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM8884loadFromNetworkBWLJW6A = ((Result) obj).getValue();
            }
            return Result.m9117boximpl(objM8884loadFromNetworkBWLJW6A);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        Object objWithMutexByUrlLock = this.this$0.withMutexByUrlLock(this.$url, new AnonymousClass1(this.this$0, this.$url, this.$width, this.$height, null), this);
        return objWithMutexByUrlLock == coroutine_suspended ? coroutine_suspended : objWithMutexByUrlLock;
    }
}
