package com.stripe.android.uicore.text;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.image.UiUtilsKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a[\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00170\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001ay\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007¢\u0006\u0004\b+\u0010,\u001a\u007f\u0010-\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001e\u0010*\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0001000/\u0012\u0004\u0012\u00020\u001c0.H\u0007¢\u0006\u0004\b1\u00102\u001a5\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00012\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u00106\u001a\u008f\u0001\u00107\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u00109\u001a\u00020'2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020=2\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001c0.2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u001c0.H\u0003¢\u0006\u0004\b@\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"LINK_TAG", "", "rememberDrawableImages", "", "Landroidx/compose/foundation/text/InlineTextContent;", "drawableImageLoader", "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;", "imageAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "rememberDrawableImages-dwB-JkM", "(Ljava/util/Map;ILandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)Ljava/util/Map;", "rememberBitmapImages", "bitmapImageLoader", "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;", "rememberBitmapImages-0fZqiVQ", "(Ljava/util/Map;ILandroidx/compose/runtime/Composer;I)Ljava/util/Map;", "rememberRemoteImages", "Landroidx/compose/runtime/State;", "annotatedText", "Landroidx/compose/ui/text/AnnotatedString;", "imageLoader", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "stripeImageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "onLoaded", "Lkotlin/Function0;", "", "rememberRemoteImages-XiPi2c8", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Html", "html", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "style", ViewProps.ENABLED, "", "urlSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", ViewProps.ON_CLICK, "Html-m4MizFo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLandroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/text/SpanStyle;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HtmlWithCustomOnClick", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "HtmlWithCustomOnClick-48f2XIo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/SpanStyle;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "annotatedStringResource", "text", "imageGetter", "(Ljava/lang/String;Ljava/util/Map;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "ClickableText", "inlineContent", "softWrap", ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "ClickableText-mZk19tU", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HtmlKt {
    private static final String LINK_TAG = "URL";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableText_mZk19tU$lambda$35(AnnotatedString annotatedString, long j, TextStyle textStyle, Modifier modifier, Map map, boolean z, int i, int i2, Function1 function1, Function1 function12, int i3, int i4, Composer composer, int i5) {
        m8896ClickableTextmZk19tU(annotatedString, j, textStyle, modifier, map, z, i, i2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlWithCustomOnClick_48f2XIo$lambda$23(String str, Modifier modifier, Map map, long j, TextStyle textStyle, SpanStyle spanStyle, int i, Function1 function1, int i2, int i3, Composer composer, int i4) {
        m8898HtmlWithCustomOnClick48f2XIo(str, modifier, map, j, textStyle, spanStyle, i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Html_m4MizFo$lambda$12(String str, Modifier modifier, Map map, long j, TextStyle textStyle, boolean z, SpanStyle spanStyle, int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        m8897Htmlm4MizFo(str, modifier, map, j, textStyle, z, spanStyle, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* renamed from: rememberDrawableImages-dwB-JkM, reason: not valid java name */
    private static final Map<String, InlineTextContent> m8900rememberDrawableImagesdwBJkM(Map<String, EmbeddableImage.Drawable> map, int i, TextStyle textStyle, Composer composer, int i2) {
        composer.startReplaceGroup(1107909875);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107909875, i2, -1, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:79)");
        }
        Set<Map.Entry<String, EmbeddableImage.Drawable>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            final EmbeddableImage.Drawable drawable = (EmbeddableImage.Drawable) entry.getValue();
            final Painter painterPainterResource = PainterResources_androidKt.painterResource(drawable.getId(), composer, 0);
            float fM3482getHeightimpl = Size.m3482getHeightimpl(painterPainterResource.getIntrinsicSize());
            float fM3485getWidthimpl = Size.m3485getWidthimpl(painterPainterResource.getIntrinsicSize());
            long jM5633getFontSizeXSAIIZE = textStyle.m5633getFontSizeXSAIIZE();
            TextUnitKt.m6323checkArithmeticR2X_6o(jM5633getFontSizeXSAIIZE);
            Pair pair = TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM5633getFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM5633getFontSizeXSAIIZE) * (fM3485getWidthimpl / fM3482getHeightimpl)), jM5633getFontSizeXSAIIZE, i, null), ComposableLambdaKt.rememberComposableLambda(-271963554, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.text.HtmlKt$rememberDrawableImages$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer2, Integer num) {
                    invoke(str2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String it2, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-271963554, i3, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)");
                        }
                        ImageKt.Image(painterPainterResource, StringResources_androidKt.stringResource(drawable.getContentDescription(), composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, drawable.getColorFilter(), composer2, 0, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkedHashMap;
    }

    /* renamed from: rememberBitmapImages-0fZqiVQ, reason: not valid java name */
    private static final Map<String, InlineTextContent> m8899rememberBitmapImages0fZqiVQ(Map<String, EmbeddableImage.Bitmap> map, int i, Composer composer, int i2) {
        composer.startReplaceGroup(1925244042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1925244042, i2, -1, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:111)");
        }
        Set<Map.Entry<String, EmbeddableImage.Bitmap>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            final EmbeddableImage.Bitmap bitmap = (EmbeddableImage.Bitmap) entry.getValue();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long jM3488times7Ah8Wj8 = Size.m3488times7Ah8Wj8(SizeKt.Size(bitmap.getBitmap().getWidth(), bitmap.getBitmap().getHeight()), 1 / ((Density) objConsume).getDensity());
            Pair pair = TuplesKt.to(str, new InlineTextContent(new Placeholder(TextUnitKt.getSp(Size.m3485getWidthimpl(jM3488times7Ah8Wj8)), TextUnitKt.getSp(Size.m3482getHeightimpl(jM3488times7Ah8Wj8)), i, null), ComposableLambdaKt.rememberComposableLambda(-560842123, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.text.HtmlKt$rememberBitmapImages$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str2, Composer composer2, Integer num) {
                    invoke(str2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String it2, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-560842123, i3, -1, "com.stripe.android.uicore.text.rememberBitmapImages.<anonymous>.<anonymous> (Html.kt:127)");
                        }
                        ImageKt.m631Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap.getBitmap()), null, null, null, null, 0.0f, null, 0, composer2, 48, 252);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkedHashMap;
    }

    /* renamed from: rememberRemoteImages-XiPi2c8, reason: not valid java name */
    private static final State<Map<String, InlineTextContent>> m8901rememberRemoteImagesXiPi2c8(AnnotatedString annotatedString, Map<String, ? extends EmbeddableImage> map, StripeImageLoader stripeImageLoader, int i, Function0<Unit> function0, Composer composer, int i2) {
        composer.startReplaceGroup(-1863307166);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1863307166, i2, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:143)");
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringAnnotations) {
            String str = (String) ((AnnotatedString.Range) obj).getItem();
            if (UiUtilsKt.isSupportedImageUrl(str) && !map.keySet().contains(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        composer.startReplaceGroup(-1903949203);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) objRememberedValue;
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) objConsume;
        composer.startReplaceGroup(-1903943812);
        if (!arrayList2.isEmpty()) {
            composer.startReplaceGroup(-1903941679);
            boolean zChangedInstance = composer.changedInstance(arrayList2) | composer.changedInstance(stripeImageLoader) | composer.changedInstance(mutableStateFlow) | composer.changed(density) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(function0)) || (i2 & 24576) == 16384);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function2) new HtmlKt$rememberRemoteImages$1$1(arrayList2, mutableStateFlow, function0, stripeImageLoader, density, i, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(annotatedString, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i2 & 14);
        }
        composer.endReplaceGroup();
        State<Map<String, InlineTextContent>> stateCollectAsState = StateFlowsComposeKt.collectAsState(mutableStateFlow, null, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateCollectAsState;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /* renamed from: Html-m4MizFo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8897Htmlm4MizFo(final String html, Modifier modifier, Map<String, ? extends EmbeddableImage> map, long j, TextStyle textStyle, boolean z, SpanStyle spanStyle, int i, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Map<String, ? extends EmbeddableImage> map2;
        int i6;
        long j2;
        TextStyle textStyle2;
        int i7;
        final boolean z2;
        int i8;
        int i9;
        Modifier.Companion companion;
        long jM3693getUnspecified0d7_KjU;
        TextStyle textStyle3;
        SpanStyle spanStyle2;
        int iM5524getAboveBaselineJ6kI3mc;
        int i10;
        Map<String, ? extends EmbeddableImage> map3;
        final Function0<Unit> function02;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SpanStyle spanStyle3;
        Composer composer2;
        final Function0<Unit> function03;
        final TextStyle textStyle4;
        final int i11;
        final long j3;
        final Map<String, ? extends EmbeddableImage> map4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(html, "html");
        Composer composerStartRestartGroup = composer.startRestartGroup(-9822761);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(html) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    map2 = map;
                    i4 |= composerStartRestartGroup.changedInstance(map2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                    j2 = j;
                } else {
                    j2 = j;
                    if ((i2 & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                    }
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        textStyle2 = textStyle;
                        int i13 = composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                        i4 |= i13;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i4 |= i13;
                } else {
                    textStyle2 = textStyle;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(spanStyle) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(i)) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i4 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        Map<String, ? extends EmbeddableImage> mapEmptyMap = i5 == 0 ? MapsKt.emptyMap() : map2;
                        jM3693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j2;
                        if ((i3 & 16) == 0) {
                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            textStyle3 = (TextStyle) objConsume;
                            i4 &= -57345;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        spanStyle2 = i8 == 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : spanStyle;
                        if ((i3 & 128) == 0) {
                            iM5524getAboveBaselineJ6kI3mc = PlaceholderVerticalAlign.INSTANCE.m5524getAboveBaselineJ6kI3mc();
                            i4 &= -29360129;
                        } else {
                            iM5524getAboveBaselineJ6kI3mc = i;
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceGroup(-2101775130);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Map<String, ? extends EmbeddableImage> map5 = mapEmptyMap;
                            i10 = i4;
                            map3 = map5;
                            function02 = (Function0) objRememberedValue2;
                        } else {
                            Map<String, ? extends EmbeddableImage> map6 = mapEmptyMap;
                            i10 = i4;
                            map3 = map6;
                            function02 = function0;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        spanStyle2 = spanStyle;
                        function02 = function0;
                        companion = modifier2;
                        textStyle3 = textStyle2;
                        iM5524getAboveBaselineJ6kI3mc = i;
                        i10 = i4;
                        map3 = map2;
                        jM3693getUnspecified0d7_KjU = j2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-9822761, i10, -1, "com.stripe.android.uicore.text.Html (Html.kt:231)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    context = (Context) objConsume2;
                    composerStartRestartGroup.startReplaceGroup(-2101768304);
                    zChangedInstance = ((i10 & 458752) != 131072) | ((234881024 & i10) == 67108864) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HtmlKt.Html_m4MizFo$lambda$11$lambda$10(z2, function02, context, (List) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i14 = i10 >> 3;
                    int i15 = (65534 & i10) | (i14 & 458752) | (i14 & 3670016);
                    Modifier modifier4 = companion;
                    long j4 = jM3693getUnspecified0d7_KjU;
                    TextStyle textStyle5 = textStyle3;
                    int i16 = iM5524getAboveBaselineJ6kI3mc;
                    SpanStyle spanStyle4 = spanStyle2;
                    m8898HtmlWithCustomOnClick48f2XIo(html, modifier4, map3, j4, textStyle5, spanStyle4, i16, (Function1) objRememberedValue, composerStartRestartGroup, i15, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    spanStyle3 = spanStyle4;
                    composer2 = composerStartRestartGroup;
                    function03 = function02;
                    textStyle4 = textStyle5;
                    i11 = i16;
                    j3 = j4;
                    map4 = map3;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    map4 = map2;
                    textStyle4 = textStyle2;
                    composer2 = composerStartRestartGroup;
                    j3 = j2;
                    spanStyle3 = spanStyle;
                    i11 = i;
                    function03 = function0;
                }
                final boolean z3 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HtmlKt.Html_m4MizFo$lambda$12(html, modifier3, map4, j3, textStyle4, z3, spanStyle3, i11, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            map2 = map;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if ((i4 & 38347923) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume22 = composerStartRestartGroup.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    context = (Context) objConsume22;
                    composerStartRestartGroup.startReplaceGroup(-2101768304);
                    zChangedInstance = ((i10 & 458752) != 131072) | ((234881024 & i10) == 67108864) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HtmlKt.Html_m4MizFo$lambda$11$lambda$10(z2, function02, context, (List) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        int i142 = i10 >> 3;
                        int i152 = (65534 & i10) | (i142 & 458752) | (i142 & 3670016);
                        Modifier modifier42 = companion;
                        long j42 = jM3693getUnspecified0d7_KjU;
                        TextStyle textStyle52 = textStyle3;
                        int i162 = iM5524getAboveBaselineJ6kI3mc;
                        SpanStyle spanStyle42 = spanStyle2;
                        m8898HtmlWithCustomOnClick48f2XIo(html, modifier42, map3, j42, textStyle52, spanStyle42, i162, (Function1) objRememberedValue, composerStartRestartGroup, i152, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        spanStyle3 = spanStyle42;
                        composer2 = composerStartRestartGroup;
                        function03 = function02;
                        textStyle4 = textStyle52;
                        i11 = i162;
                        j3 = j42;
                        map4 = map3;
                        modifier3 = modifier42;
                    }
                }
            }
            final boolean z32 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        map2 = map;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if ((i4 & 38347923) != 38347922) {
        }
        final boolean z322 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Html_m4MizFo$lambda$11$lambda$10(boolean z, Function0 function0, Context context, List annotatedStringRanges) {
        Intrinsics.checkNotNullParameter(annotatedStringRanges, "annotatedStringRanges");
        if (z) {
            function0.invoke();
            AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull(annotatedStringRanges);
            if (range != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse((String) range.getItem()));
                context.startActivity(intent);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* renamed from: HtmlWithCustomOnClick-48f2XIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8898HtmlWithCustomOnClick48f2XIo(final String html, Modifier modifier, Map<String, ? extends EmbeddableImage> map, long j, TextStyle textStyle, SpanStyle spanStyle, int i, final Function1<? super List<AnnotatedString.Range<String>>, Unit> onClick, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Map<String, ? extends EmbeddableImage> map2;
        int i6;
        long j2;
        TextStyle textStyle2;
        int i7;
        SpanStyle spanStyle2;
        Modifier.Companion companion;
        Map<String, ? extends EmbeddableImage> mapEmptyMap;
        TextStyle textStyle3;
        int i8;
        int iM5524getAboveBaselineJ6kI3mc;
        Object objRememberedValue;
        Map<String, ? extends EmbeddableImage> map3;
        int i9;
        Object objRememberedValue2;
        Iterator<Map.Entry<String, ? extends EmbeddableImage>> it;
        int i10;
        Map<String, InlineTextContent> mapM8900rememberDrawableImagesdwBJkM;
        final AnnotatedString annotatedString;
        Map<String, InlineTextContent> mapM8899rememberBitmapImages0fZqiVQ;
        Object objRememberedValue3;
        Map<String, InlineTextContent> value;
        Object objRememberedValue4;
        boolean zChanged;
        Object objRememberedValue5;
        Composer composer2;
        final int i11;
        final Map<String, ? extends EmbeddableImage> map4;
        final Modifier modifier3;
        final SpanStyle spanStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(583944314);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(html) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    map2 = map;
                    i4 |= composerStartRestartGroup.changedInstance(map2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 == 0) {
                    if ((i2 & 3072) == 0) {
                        j2 = j;
                        i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            textStyle2 = textStyle;
                            int i13 = composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                            i4 |= i13;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i4 |= i13;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        spanStyle2 = spanStyle;
                    } else {
                        spanStyle2 = spanStyle;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changed(spanStyle2) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(i)) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(onClick) ? 8388608 : 4194304;
                    }
                    if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                            mapEmptyMap = i5 == 0 ? MapsKt.emptyMap() : map2;
                            long jM3693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j2;
                            if ((i3 & 16) == 0) {
                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                textStyle3 = (TextStyle) objConsume;
                                i4 &= -57345;
                            } else {
                                textStyle3 = textStyle2;
                            }
                            if (i7 != 0) {
                                spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
                            }
                            if ((i3 & 64) == 0) {
                                long j3 = jM3693getUnspecified0d7_KjU;
                                i8 = i4 & (-3670017);
                                iM5524getAboveBaselineJ6kI3mc = PlaceholderVerticalAlign.INSTANCE.m5524getAboveBaselineJ6kI3mc();
                                j2 = j3;
                                textStyle2 = textStyle3;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(583944314, i8, -1, "com.stripe.android.uicore.text.HtmlWithCustomOnClick (Html.kt:281)");
                                }
                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composerStartRestartGroup.consume(localContext);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                Context context = (Context) objConsume2;
                                int i14 = (i8 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                int i15 = i8 >> 9;
                                AnnotatedString annotatedStringAnnotatedStringResource = annotatedStringResource(html, mapEmptyMap, spanStyle2, composerStartRestartGroup, (i8 & 14) | i14 | (i15 & 896), 0);
                                composerStartRestartGroup.startReplaceGroup(-217740528);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                SpanStyle spanStyle4 = spanStyle2;
                                if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                                    map3 = mapEmptyMap;
                                    i9 = i8;
                                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    map3 = mapEmptyMap;
                                    i9 = i8;
                                }
                                final MutableState mutableState = (MutableState) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-217738433);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new StripeImageLoader(context, null, null, null, null, 14, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                StripeImageLoader stripeImageLoader = (StripeImageLoader) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                it = map3.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry<String, ? extends EmbeddableImage> next = it.next();
                                    StripeImageLoader stripeImageLoader2 = stripeImageLoader;
                                    if (next.getValue() instanceof EmbeddableImage.Drawable) {
                                        linkedHashMap.put(next.getKey(), next.getValue());
                                        it = it;
                                    }
                                    stripeImageLoader = stripeImageLoader2;
                                }
                                StripeImageLoader stripeImageLoader3 = stripeImageLoader;
                                int i16 = (i9 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                i10 = i9 >> 6;
                                mapM8900rememberDrawableImagesdwBJkM = m8900rememberDrawableImagesdwBJkM(linkedHashMap, iM5524getAboveBaselineJ6kI3mc, textStyle2, composerStartRestartGroup, (i10 & 896) | i16);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry<String, ? extends EmbeddableImage> entry : map3.entrySet()) {
                                    if (entry.getValue() instanceof EmbeddableImage.Bitmap) {
                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        annotatedStringAnnotatedStringResource = annotatedStringAnnotatedStringResource;
                                    }
                                }
                                annotatedString = annotatedStringAnnotatedStringResource;
                                mapM8899rememberBitmapImages0fZqiVQ = m8899rememberBitmapImages0fZqiVQ(linkedHashMap2, iM5524getAboveBaselineJ6kI3mc, composerStartRestartGroup, i16);
                                composerStartRestartGroup.startReplaceGroup(-217710307);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HtmlKt.HtmlWithCustomOnClick_48f2XIo$lambda$18$lambda$17(mutableState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                State<Map<String, InlineTextContent>> stateM8901rememberRemoteImagesXiPi2c8 = m8901rememberRemoteImagesXiPi2c8(annotatedString, map3, stripeImageLoader3, iM5524getAboveBaselineJ6kI3mc, (Function0) objRememberedValue3, composerStartRestartGroup, i14 | 24576 | (i15 & 7168));
                                Map<String, ? extends EmbeddableImage> map5 = map3;
                                value = stateM8901rememberRemoteImagesXiPi2c8.getValue();
                                if (!value.isEmpty() || ((Boolean) mutableState.getValue()).booleanValue()) {
                                    composerStartRestartGroup.startReplaceGroup(-217700432);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return HtmlKt.HtmlWithCustomOnClick_48f2XIo$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue4);
                                    Map mapPlus = MapsKt.plus(MapsKt.plus(mapM8900rememberDrawableImagesdwBJkM, mapM8899rememberBitmapImages0fZqiVQ), value);
                                    composerStartRestartGroup.startReplaceGroup(-217694064);
                                    zChanged = composerStartRestartGroup.changed(annotatedString) | ((i9 & 29360128) == 8388608);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return HtmlKt.HtmlWithCustomOnClick_48f2XIo$lambda$22$lambda$21(onClick, annotatedString, ((Integer) obj).intValue());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    m8896ClickableTextmZk19tU(annotatedString, j2, textStyle2, modifierSemantics, mapPlus, false, 0, 0, null, (Function1) objRememberedValue5, composer2, i10 & PointerIconCompat.TYPE_TEXT, 480);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i11 = iM5524getAboveBaselineJ6kI3mc;
                                map4 = map5;
                                modifier3 = companion;
                                spanStyle3 = spanStyle4;
                            } else {
                                j2 = jM3693getUnspecified0d7_KjU;
                                textStyle2 = textStyle3;
                                i8 = i4;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            i8 = i4;
                            companion = modifier2;
                            mapEmptyMap = map2;
                        }
                        iM5524getAboveBaselineJ6kI3mc = i;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume22 = composerStartRestartGroup.consume(localContext2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Context context2 = (Context) objConsume22;
                        int i142 = (i8 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                        int i152 = i8 >> 9;
                        AnnotatedString annotatedStringAnnotatedStringResource2 = annotatedStringResource(html, mapEmptyMap, spanStyle2, composerStartRestartGroup, (i8 & 14) | i142 | (i152 & 896), 0);
                        composerStartRestartGroup.startReplaceGroup(-217740528);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        SpanStyle spanStyle42 = spanStyle2;
                        if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState2 = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-217738433);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        StripeImageLoader stripeImageLoader4 = (StripeImageLoader) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        it = map3.entrySet().iterator();
                        while (it.hasNext()) {
                        }
                        StripeImageLoader stripeImageLoader32 = stripeImageLoader4;
                        int i162 = (i9 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                        i10 = i9 >> 6;
                        mapM8900rememberDrawableImagesdwBJkM = m8900rememberDrawableImagesdwBJkM(linkedHashMap3, iM5524getAboveBaselineJ6kI3mc, textStyle2, composerStartRestartGroup, (i10 & 896) | i162);
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                        while (r17.hasNext()) {
                        }
                        annotatedString = annotatedStringAnnotatedStringResource2;
                        mapM8899rememberBitmapImages0fZqiVQ = m8899rememberBitmapImages0fZqiVQ(linkedHashMap22, iM5524getAboveBaselineJ6kI3mc, composerStartRestartGroup, i162);
                        composerStartRestartGroup.startReplaceGroup(-217710307);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        State<Map<String, InlineTextContent>> stateM8901rememberRemoteImagesXiPi2c82 = m8901rememberRemoteImagesXiPi2c8(annotatedString, map3, stripeImageLoader32, iM5524getAboveBaselineJ6kI3mc, (Function0) objRememberedValue3, composerStartRestartGroup, i142 | 24576 | (i152 & 7168));
                        Map<String, ? extends EmbeddableImage> map52 = map3;
                        value = stateM8901rememberRemoteImagesXiPi2c82.getValue();
                        if (value.isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-217700432);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue4);
                            Map mapPlus2 = MapsKt.plus(MapsKt.plus(mapM8900rememberDrawableImagesdwBJkM, mapM8899rememberBitmapImages0fZqiVQ), value);
                            composerStartRestartGroup.startReplaceGroup(-217694064);
                            zChanged = composerStartRestartGroup.changed(annotatedString) | ((i9 & 29360128) == 8388608);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue5 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HtmlKt.HtmlWithCustomOnClick_48f2XIo$lambda$22$lambda$21(onClick, annotatedString, ((Integer) obj).intValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                m8896ClickableTextmZk19tU(annotatedString, j2, textStyle2, modifierSemantics2, mapPlus2, false, 0, 0, null, (Function1) objRememberedValue5, composer2, i10 & PointerIconCompat.TYPE_TEXT, 480);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i11 = iM5524getAboveBaselineJ6kI3mc;
                                map4 = map52;
                                modifier3 = companion;
                                spanStyle3 = spanStyle42;
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        spanStyle3 = spanStyle2;
                        modifier3 = modifier2;
                        map4 = map2;
                        i11 = i;
                    }
                    final long j4 = j2;
                    final TextStyle textStyle4 = textStyle2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return HtmlKt.HtmlWithCustomOnClick_48f2XIo$lambda$23(html, modifier3, map4, j4, textStyle4, spanStyle3, i11, onClick, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 3072;
                j2 = j;
                if ((i2 & 24576) != 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                    }
                }
                final long j42 = j2;
                final TextStyle textStyle42 = textStyle2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            map2 = map;
            i6 = i3 & 8;
            if (i6 == 0) {
            }
            j2 = j;
            if ((i2 & 24576) != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            final long j422 = j2;
            final TextStyle textStyle422 = textStyle2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        map2 = map;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        j2 = j;
        if ((i2 & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        final long j4222 = j2;
        final TextStyle textStyle4222 = textStyle2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlWithCustomOnClick_48f2XIo$lambda$18$lambda$17(MutableState mutableState) {
        mutableState.setValue(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlWithCustomOnClick_48f2XIo$lambda$20$lambda$19(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlWithCustomOnClick_48f2XIo$lambda$22$lambda$21(Function1 function1, AnnotatedString annotatedString, int i) {
        function1.invoke(annotatedString.getStringAnnotations(LINK_TAG, i, i));
        return Unit.INSTANCE;
    }

    public static final AnnotatedString annotatedStringResource(String text, Map<String, ? extends EmbeddableImage> map, SpanStyle spanStyle, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        composer.startReplaceGroup(1962487584);
        Map<String, ? extends EmbeddableImage> mapEmptyMap = (i2 & 2) != 0 ? MapsKt.emptyMap() : map;
        SpanStyle spanStyle2 = (i2 & 4) != 0 ? new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null) : spanStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1962487584, i, -1, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:349)");
        }
        composer.startReplaceGroup(-1904952840);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(text)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = HtmlCompat.fromHtml(text, 0);
            composer.updateRememberedValue(objRememberedValue);
        }
        Spanned spanned = (Spanned) objRememberedValue;
        composer.endReplaceGroup();
        Intrinsics.checkNotNull(spanned);
        composer.startReplaceGroup(-1904946302);
        boolean zChanged = composer.changed(spanned);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            int i3 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i3 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i3 >= 0) {
                    String strSubstring = spanned.toString().substring(i3, spanStart);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    builder.append(strSubstring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == 1) {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        } else if (style == 2) {
                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m5709boximpl(FontStyle.INSTANCE.m5718getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        } else if (style == 3) {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m5709boximpl(FontStyle.INSTANCE.m5718getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), spanStart, spanEnd);
                    } else if (obj instanceof BulletSpan) {
                        builder.append("•\t");
                    } else if (obj instanceof ForegroundColorSpan) {
                        builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!mapEmptyMap.isEmpty()) {
                                String source = imageSpan.getSource();
                                Intrinsics.checkNotNull(source);
                                mapEmptyMap.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            Intrinsics.checkNotNull(source2);
                            InlineTextContentKt.appendInlineContent$default(builder, source2, null, 2, null);
                        }
                        i3 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        builder.addStyle(spanStyle2, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
                        builder.addStringAnnotation(LINK_TAG, url, spanStart, spanEnd);
                    }
                    i3 = spanStart;
                }
            }
            if (i3 != spanned.toString().length()) {
                String strSubstring2 = spanned.toString().substring(i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                builder.append(strSubstring2);
            }
            objRememberedValue2 = builder.toAnnotatedString();
            composer.updateRememberedValue(objRememberedValue2);
        }
        AnnotatedString annotatedString = (AnnotatedString) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableText_mZk19tU$lambda$30$lambda$29(TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* renamed from: ClickableText-mZk19tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8896ClickableTextmZk19tU(final AnnotatedString annotatedString, final long j, final TextStyle textStyle, Modifier modifier, Map<String, InlineTextContent> map, boolean z, int i, int i2, Function1<? super TextLayoutResult, Unit> function1, final Function1<? super Integer, Unit> function12, Composer composer, final int i3, final int i4) {
        AnnotatedString annotatedString2;
        int i5;
        TextStyle textStyle2;
        int i6;
        Modifier modifier2;
        int i7;
        Map<String, InlineTextContent> mapEmptyMap;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Function1<? super TextLayoutResult, Unit> function13;
        boolean z2;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean z3;
        HtmlKt$ClickableText$pressIndicator$1$1 htmlKt$ClickableText$pressIndicator$1$1RememberedValue;
        boolean z4;
        Object objRememberedValue2;
        Composer composer2;
        final Function1<? super TextLayoutResult, Unit> function14;
        final Modifier modifier3;
        final int i13;
        final boolean z5;
        final int i14;
        final Map<String, InlineTextContent> map2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1952998280);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i3 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        mapEmptyMap = map;
                        i5 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                        if ((i3 & 12582912) == 0) {
                            i11 = i10;
                            i5 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i4 & 512) != 0) {
                            i5 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                        }
                        if ((i5 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            if (i6 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            boolean z6 = i8 == 0 ? true : z;
                            int iM6055getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m6055getClipgIe3tQ8() : i;
                            int i15 = i11 == 0 ? Integer.MAX_VALUE : i2;
                            if (i12 == 0) {
                                composerStartRestartGroup.startReplaceGroup(-1159074696);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return HtmlKt.ClickableText_mZk19tU$lambda$30$lambda$29((TextLayoutResult) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                function13 = (Function1) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function13 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                z2 = z6;
                            } else {
                                z2 = z6;
                                ComposerKt.traceEventStart(-1952998280, i5, -1, "com.stripe.android.uicore.text.ClickableText (Html.kt:442)");
                            }
                            composerStartRestartGroup.startReplaceGroup(-1159072790);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1159068598);
                            z3 = (1879048192 & i5) != 536870912;
                            htmlKt$ClickableText$pressIndicator$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z3 || htmlKt$ClickableText$pressIndicator$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                htmlKt$ClickableText$pressIndicator$1$1RememberedValue = new HtmlKt$ClickableText$pressIndicator$1$1(mutableState, function12, null);
                                composerStartRestartGroup.updateRememberedValue(htmlKt$ClickableText$pressIndicator$1$1RememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierThen = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) htmlKt$ClickableText$pressIndicator$1$1RememberedValue));
                            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(textStyle2, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            composerStartRestartGroup.startReplaceGroup(-1159036670);
                            z4 = (234881024 & i5) == 67108864;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HtmlKt.ClickableText_mZk19tU$lambda$34$lambda$33(mutableState, function13, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            boolean z7 = z2;
                            composer2 = composerStartRestartGroup;
                            int i16 = iM6055getClipgIe3tQ8;
                            int i17 = i15;
                            Map<String, InlineTextContent> map3 = mapEmptyMap;
                            BasicTextKt.m1314BasicTextRWo7tUw(annotatedString2, modifierThen, textStyleM5615copyp1EtxEg$default, (Function1) objRememberedValue2, i16, z7, i17, 0, map3, null, composer2, (i5 & 14) | (57344 & (i5 >> 6)) | (458752 & i5) | ((i5 >> 3) & 3670016) | ((i5 << 12) & 234881024), 640);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function14 = function13;
                            modifier3 = modifier2;
                            i13 = i16;
                            z5 = z7;
                            i14 = i17;
                            map2 = map3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i13 = i;
                            function14 = function1;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            map2 = mapEmptyMap;
                            z5 = z;
                            i14 = i2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return HtmlKt.ClickableText_mZk19tU$lambda$35(annotatedString, j, textStyle, modifier3, map2, z5, i13, i14, function14, function12, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    i11 = i10;
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    if ((i4 & 512) != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1159072790);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1159068598);
                        if ((1879048192 & i5) != 536870912) {
                        }
                        htmlKt$ClickableText$pressIndicator$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z3) {
                            htmlKt$ClickableText$pressIndicator$1$1RememberedValue = new HtmlKt$ClickableText$pressIndicator$1$1(mutableState, function12, null);
                            composerStartRestartGroup.updateRememberedValue(htmlKt$ClickableText$pressIndicator$1$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierThen2 = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) htmlKt$ClickableText$pressIndicator$1$1RememberedValue));
                            TextStyle textStyleM5615copyp1EtxEg$default2 = TextStyle.m5615copyp1EtxEg$default(textStyle2, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            composerStartRestartGroup.startReplaceGroup(-1159036670);
                            if ((234881024 & i5) == 67108864) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.text.HtmlKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return HtmlKt.ClickableText_mZk19tU$lambda$34$lambda$33(mutableState, function13, (TextLayoutResult) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z72 = z2;
                                composer2 = composerStartRestartGroup;
                                int i162 = iM6055getClipgIe3tQ8;
                                int i172 = i15;
                                Map<String, InlineTextContent> map32 = mapEmptyMap;
                                BasicTextKt.m1314BasicTextRWo7tUw(annotatedString2, modifierThen2, textStyleM5615copyp1EtxEg$default2, (Function1) objRememberedValue2, i162, z72, i172, 0, map32, null, composer2, (i5 & 14) | (57344 & (i5 >> 6)) | (458752 & i5) | ((i5 >> 3) & 3670016) | ((i5 << 12) & 234881024), 640);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function14 = function13;
                                modifier3 = modifier2;
                                i13 = i162;
                                z5 = z72;
                                i14 = i172;
                                map2 = map32;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                mapEmptyMap = map;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                if ((i4 & 512) != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            mapEmptyMap = map;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 4) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        mapEmptyMap = map;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableText_mZk19tU$lambda$34$lambda$33(MutableState mutableState, Function1 function1, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
