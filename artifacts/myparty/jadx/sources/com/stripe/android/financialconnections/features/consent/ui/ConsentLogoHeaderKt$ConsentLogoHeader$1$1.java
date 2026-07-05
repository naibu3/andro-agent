package com.stripe.android.financialconnections.features.consent.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ImageBitmap;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConsentLogoHeader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$ConsentLogoHeader$1$1", f = "ConsentLogoHeader.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ConsentLogoHeaderKt$ConsentLogoHeader$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $bitmapLoadSize;
    final /* synthetic */ MutableState<List<ImageBitmap>> $bitmaps$delegate;
    final /* synthetic */ List<String> $logos;
    final /* synthetic */ ImageBitmap $placeholderBitmap;
    final /* synthetic */ StripeImageLoader $stripeImageLoader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsentLogoHeaderKt$ConsentLogoHeader$1$1(List<String> list, StripeImageLoader stripeImageLoader, int i, ImageBitmap imageBitmap, MutableState<List<ImageBitmap>> mutableState, Continuation<? super ConsentLogoHeaderKt$ConsentLogoHeader$1$1> continuation) {
        super(2, continuation);
        this.$logos = list;
        this.$stripeImageLoader = stripeImageLoader;
        this.$bitmapLoadSize = i;
        this.$placeholderBitmap = imageBitmap;
        this.$bitmaps$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConsentLogoHeaderKt$ConsentLogoHeader$1$1 consentLogoHeaderKt$ConsentLogoHeader$1$1 = new ConsentLogoHeaderKt$ConsentLogoHeader$1$1(this.$logos, this.$stripeImageLoader, this.$bitmapLoadSize, this.$placeholderBitmap, this.$bitmaps$delegate, continuation);
        consentLogoHeaderKt$ConsentLogoHeader$1$1.L$0 = obj;
        return consentLogoHeaderKt$ConsentLogoHeader$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConsentLogoHeaderKt$ConsentLogoHeader$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<List<ImageBitmap>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableState<List<ImageBitmap>> mutableState2 = this.$bitmaps$delegate;
            List<String> list = this.$logos;
            StripeImageLoader stripeImageLoader = this.$stripeImageLoader;
            int i2 = this.$bitmapLoadSize;
            ImageBitmap imageBitmap = this.$placeholderBitmap;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ConsentLogoHeaderKt$ConsentLogoHeader$1$1$1$1(stripeImageLoader, (String) it.next(), i2, imageBitmap, null), 3, null));
                stripeImageLoader = stripeImageLoader;
                i2 = i2;
                imageBitmap = imageBitmap;
            }
            this.L$0 = mutableState2;
            this.label = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
            obj = objAwaitAll;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
