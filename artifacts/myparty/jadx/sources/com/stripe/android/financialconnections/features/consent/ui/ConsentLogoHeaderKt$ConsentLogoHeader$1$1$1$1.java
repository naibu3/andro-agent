package com.stripe.android.financialconnections.features.consent.ui;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConsentLogoHeader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1", f = "ConsentLogoHeader.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageBitmap>, Object> {
    final /* synthetic */ int $bitmapLoadSize;
    final /* synthetic */ String $it;
    final /* synthetic */ ImageBitmap $placeholderBitmap;
    final /* synthetic */ StripeImageLoader $stripeImageLoader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1(StripeImageLoader stripeImageLoader, String str, int i, ImageBitmap imageBitmap, Continuation<? super ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1> continuation) {
        super(2, continuation);
        this.$stripeImageLoader = stripeImageLoader;
        this.$it = str;
        this.$bitmapLoadSize = i;
        this.$placeholderBitmap = imageBitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1(this.$stripeImageLoader, this.$it, this.$bitmapLoadSize, this.$placeholderBitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageBitmap> continuation) {
        return ((ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8886loadBWLJW6A;
        ImageBitmap imageBitmapAsImageBitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeImageLoader stripeImageLoader = this.$stripeImageLoader;
            String str = this.$it;
            int i2 = this.$bitmapLoadSize;
            this.label = 1;
            objM8886loadBWLJW6A = stripeImageLoader.m8886loadBWLJW6A(str, i2, i2, this);
            if (objM8886loadBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8886loadBWLJW6A = ((Result) obj).getValue();
        }
        if (Result.m9124isFailureimpl(objM8886loadBWLJW6A)) {
            objM8886loadBWLJW6A = null;
        }
        Bitmap bitmap = (Bitmap) objM8886loadBWLJW6A;
        return (bitmap == null || (imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap)) == null) ? this.$placeholderBitmap : imageBitmapAsImageBitmap;
    }
}
