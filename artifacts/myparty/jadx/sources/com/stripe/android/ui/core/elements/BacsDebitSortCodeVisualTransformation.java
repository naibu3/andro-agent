package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BacsDebitSortCodeVisualTransformation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "<init>", "()V", "SEPARATOR", "", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "format", "SortCodeOffsetMapping", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BacsDebitSortCodeVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    public static final BacsDebitSortCodeVisualTransformation INSTANCE = new BacsDebitSortCodeVisualTransformation();
    private static final String SEPARATOR = "-";

    private BacsDebitSortCodeVisualTransformation() {
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TransformedText(new AnnotatedString(format(text.getText()), null, null, 6, null), SortCodeOffsetMapping.INSTANCE);
    }

    private final String format(String text) {
        return CollectionsKt.joinToString$default(StringsKt.chunked(text, 2), SEPARATOR, null, null, 0, null, null, 62, null);
    }

    /* compiled from: BacsDebitSortCodeVisualTransformation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeVisualTransformation$SortCodeOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "<init>", "()V", "DIVISIBLE", "", "originalToTransformed", TypedValues.CycleType.S_WAVE_OFFSET, "transformedToOriginal", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class SortCodeOffsetMapping implements OffsetMapping {
        private static final int DIVISIBLE = 2;
        public static final SortCodeOffsetMapping INSTANCE = new SortCodeOffsetMapping();

        private SortCodeOffsetMapping() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            if (offset == 0) {
                return 0;
            }
            int i = (offset / 2) + offset;
            return offset % 2 == 0 ? i - 1 : i;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            if (offset == 0) {
                return 0;
            }
            return offset - (offset / 3);
        }
    }
}
