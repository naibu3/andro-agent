package com.stripe.android.common.ui;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InlineContentTemplateBuilder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;", "", "<init>", "()V", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "add", "id", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "align", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "add-QI4CevY", "(Ljava/lang/String;JJILkotlin/jvm/functions/Function2;)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;", "addSpacer", "addSpacer-nttgDAE", "(Ljava/lang/String;JI)Lcom/stripe/android/common/ui/InlineContentTemplateBuilder;", InAppPurchaseConstants.METHOD_BUILD, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InlineContentTemplateBuilder {
    public static final int $stable = 8;
    private final Map<String, InlineTextContent> inlineContent = new LinkedHashMap();

    /* renamed from: add-QI4CevY$default, reason: not valid java name */
    public static /* synthetic */ InlineContentTemplateBuilder m7219addQI4CevY$default(InlineContentTemplateBuilder inlineContentTemplateBuilder, String str, long j, long j2, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = PlaceholderVerticalAlign.INSTANCE.m5526getCenterJ6kI3mc();
        }
        return inlineContentTemplateBuilder.m7221addQI4CevY(str, j, j2, i, function2);
    }

    /* renamed from: add-QI4CevY, reason: not valid java name */
    public final InlineContentTemplateBuilder m7221addQI4CevY(String id, long width, long height, int align, final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.inlineContent.put(id, new InlineTextContent(new Placeholder(width, height, align, null), ComposableLambdaKt.composableLambdaInstance(-905386904, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.stripe.android.common.ui.InlineContentTemplateBuilder$add$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
                invoke(str, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(String it, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-905386904, i, -1, "com.stripe.android.common.ui.InlineContentTemplateBuilder.add.<anonymous> (InlineContentTemplateBuilder.kt:31)");
                }
                content.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        return this;
    }

    /* renamed from: addSpacer-nttgDAE$default, reason: not valid java name */
    public static /* synthetic */ InlineContentTemplateBuilder m7220addSpacernttgDAE$default(InlineContentTemplateBuilder inlineContentTemplateBuilder, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PlaceholderVerticalAlign.INSTANCE.m5526getCenterJ6kI3mc();
        }
        return inlineContentTemplateBuilder.m7222addSpacernttgDAE(str, j, i);
    }

    /* renamed from: addSpacer-nttgDAE, reason: not valid java name */
    public final InlineContentTemplateBuilder m7222addSpacernttgDAE(String id, long width, int align) {
        Intrinsics.checkNotNullParameter(id, "id");
        m7221addQI4CevY(id, width, TextUnitKt.getEm(0), align, ComposableSingletons$InlineContentTemplateBuilderKt.INSTANCE.m7216getLambda1$paymentsheet_release());
        return this;
    }

    public final Map<String, InlineTextContent> build() {
        return this.inlineContent;
    }
}
