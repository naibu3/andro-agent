package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExpiryDateVisualTransformation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "fallbackExpiryDate", "", "<init>", "(Ljava/lang/String;)V", "separator", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "calculateOutputOffsets", "", "", "output", "calculateSeparatorOffsets", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpiryDateVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final String fallbackExpiryDate;
    private final String separator;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpiryDateVisualTransformation() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ExpiryDateVisualTransformation(String str) {
        this.fallbackExpiryDate = str;
        this.separator = " / ";
    }

    public /* synthetic */ ExpiryDateVisualTransformation(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(text.getText(), this.fallbackExpiryDate)) {
            return new TransformedText(text, OffsetMapping.INSTANCE.getIdentity());
        }
        AnnotatedString annotatedString = text;
        int i = (((!StringsKt.isBlank(annotatedString) && text.charAt(0) != '0' && text.charAt(0) != '1') || (text.length() > 1 && Integer.parseInt(StringsKt.take(text.getText(), 2)) > 12)) ? 1 : 0) ^ 1;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < annotatedString.length(); i2++) {
            sb.append(annotatedString.charAt(i2));
            if (i2 == i) {
                sb.append(this.separator);
            }
        }
        String string = sb.toString();
        final List<Integer> listCalculateOutputOffsets = calculateOutputOffsets(string);
        final List<Integer> listCalculateSeparatorOffsets = calculateSeparatorOffsets(string);
        return new TransformedText(new AnnotatedString(string, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.uicore.elements.ExpiryDateVisualTransformation$filter$offsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return listCalculateOutputOffsets.get(offset).intValue();
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                List<Integer> list = listCalculateSeparatorOffsets;
                int i3 = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() < offset && (i3 = i3 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                return offset - i3;
            }
        });
    }

    private final List<Integer> calculateOutputOffsets(String output) {
        String str = output;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            Integer numValueOf = Integer.valueOf(i2);
            numValueOf.intValue();
            if (!Character.isDigit(cCharAt)) {
                numValueOf = null;
            }
            Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null;
            if (numValueOf2 != null) {
                arrayList.add(numValueOf2);
            }
            i++;
            i2 = i3;
        }
        return CollectionsKt.plus((Collection<? extends Integer>) CollectionsKt.plus((Collection) CollectionsKt.listOf(0), (Iterable) CollectionsKt.dropLast(arrayList, 1)), Integer.valueOf(output.length()));
    }

    private final List<Integer> calculateSeparatorOffsets(String output) {
        String str = output;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            Integer numValueOf = Integer.valueOf(i2);
            numValueOf.intValue();
            if (Character.isDigit(cCharAt)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }
}
