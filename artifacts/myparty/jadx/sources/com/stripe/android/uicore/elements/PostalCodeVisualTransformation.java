package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.uicore.elements.PostalCodeConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostalCodeVisualTransformation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "format", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V", "getFormat", "()Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "postalForCanada", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostalCodeVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final PostalCodeConfig.CountryPostalFormat format;

    public PostalCodeVisualTransformation(PostalCodeConfig.CountryPostalFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.format = format;
    }

    public final PostalCodeConfig.CountryPostalFormat getFormat() {
        return this.format;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return this.format instanceof PostalCodeConfig.CountryPostalFormat.CA ? postalForCanada(text) : new TransformedText(text, OffsetMapping.INSTANCE.getIdentity());
    }

    private final TransformedText postalForCanada(AnnotatedString text) {
        int length = text.getText().length();
        String str = "";
        for (int i = 0; i < length; i++) {
            String str2 = str + Character.toUpperCase(text.getText().charAt(i));
            if (i == 2) {
                str2 = str2 + " ";
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.uicore.elements.PostalCodeVisualTransformation$postalForCanada$postalCodeOffsetTranslator$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                if (offset <= 2) {
                    return offset;
                }
                if (offset <= 5) {
                    return offset + 1;
                }
                return 7;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                if (offset <= 3) {
                    return offset;
                }
                if (offset <= 6) {
                    return offset - 1;
                }
                return 6;
            }
        });
    }
}
