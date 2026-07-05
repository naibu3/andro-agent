package com.stripe.android.uicore.text;

import android.graphics.Bitmap;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$1", f = "Html.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HtmlKt$rememberRemoteImages$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $imageAlign;
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ Function0<Unit> $onLoaded;
    final /* synthetic */ MutableStateFlow<Map<String, InlineTextContent>> $remoteImages;
    final /* synthetic */ List<AnnotatedString.Range<String>> $remoteUrls;
    final /* synthetic */ StripeImageLoader $stripeImageLoader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HtmlKt$rememberRemoteImages$1$1(List<AnnotatedString.Range<String>> list, MutableStateFlow<Map<String, InlineTextContent>> mutableStateFlow, Function0<Unit> function0, StripeImageLoader stripeImageLoader, Density density, int i, Continuation<? super HtmlKt$rememberRemoteImages$1$1> continuation) {
        super(2, continuation);
        this.$remoteUrls = list;
        this.$remoteImages = mutableStateFlow;
        this.$onLoaded = function0;
        this.$stripeImageLoader = stripeImageLoader;
        this.$localDensity = density;
        this.$imageAlign = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HtmlKt$rememberRemoteImages$1$1 htmlKt$rememberRemoteImages$1$1 = new HtmlKt$rememberRemoteImages$1$1(this.$remoteUrls, this.$remoteImages, this.$onLoaded, this.$stripeImageLoader, this.$localDensity, this.$imageAlign, continuation);
        htmlKt$rememberRemoteImages$1$1.L$0 = obj;
        return htmlKt$rememberRemoteImages$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HtmlKt$rememberRemoteImages$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAwaitAll;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<AnnotatedString.Range<String>> list = this.$remoteUrls;
            StripeImageLoader stripeImageLoader = this.$stripeImageLoader;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new HtmlKt$rememberRemoteImages$1$1$deferred$1$1((AnnotatedString.Range) it.next(), stripeImageLoader, null), 3, null));
            }
            this.label = 1;
            objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objAwaitAll = obj;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : (Iterable) objAwaitAll) {
            Bitmap bitmap = (Bitmap) pair.getSecond();
            Pair pair2 = bitmap != null ? new Pair(pair.getFirst(), bitmap) : null;
            if (pair2 != null) {
                arrayList2.add(pair2);
            }
        }
        Map map = MapsKt.toMap(arrayList2);
        MutableStateFlow<Map<String, InlineTextContent>> mutableStateFlow = this.$remoteImages;
        Density density = this.$localDensity;
        int i2 = this.$imageAlign;
        final StripeImageLoader stripeImageLoader2 = this.$stripeImageLoader;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Iterator it2 = map.entrySet().iterator(); it2.hasNext(); it2 = it2) {
            final Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            final long jM3488times7Ah8Wj8 = Size.m3488times7Ah8Wj8(SizeKt.Size(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / density.getDensity());
            linkedHashMap.put(key, new InlineTextContent(new Placeholder(TextUnitKt.getSp(Size.m3485getWidthimpl(jM3488times7Ah8Wj8)), TextUnitKt.getSp(Size.m3482getHeightimpl(jM3488times7Ah8Wj8)), i2, null), ComposableLambdaKt.composableLambdaInstance(858918421, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
                    invoke(str, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String it3, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(it3, "it");
                    if ((i3 & 17) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(858918421, i3, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Html.kt:183)");
                        }
                        StripeImageKt.StripeImage(entry.getKey(), stripeImageLoader2, null, androidx.compose.foundation.layout.SizeKt.m1051height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(Size.m3485getWidthimpl(jM3488times7Ah8Wj8))), Dp.m6117constructorimpl(Size.m3482getHeightimpl(jM3488times7Ah8Wj8))), null, null, null, null, false, null, null, composer, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            })));
        }
        mutableStateFlow.setValue(linkedHashMap);
        this.$onLoaded.invoke();
        return Unit.INSTANCE;
    }
}
