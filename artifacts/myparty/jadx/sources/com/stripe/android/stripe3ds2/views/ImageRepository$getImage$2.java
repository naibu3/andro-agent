package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ImageRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", f = "ImageRepository.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ImageRepository$getImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imageUrl;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageRepository$getImage$2(String str, ImageRepository imageRepository, Continuation<? super ImageRepository$getImage$2> continuation) {
        super(2, continuation);
        this.$imageUrl = str;
        this.this$0 = imageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageRepository$getImage$2(this.$imageUrl, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((ImageRepository$getImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImageRepository imageRepository;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.$imageUrl;
            if (str2 == null) {
                return null;
            }
            imageRepository = this.this$0;
            Bitmap localImage = imageRepository.getLocalImage(str2);
            if (localImage != null) {
                return localImage;
            }
            this.L$0 = imageRepository;
            this.L$1 = str2;
            this.label = 1;
            Object remoteImage = imageRepository.getRemoteImage(str2, this);
            if (remoteImage == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = remoteImage;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            imageRepository = (ImageRepository) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        imageRepository.cacheImage(str, bitmap);
        return bitmap;
    }
}
