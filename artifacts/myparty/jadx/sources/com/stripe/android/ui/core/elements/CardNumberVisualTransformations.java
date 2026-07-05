package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.webkit.Profile;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardNumberVisualTransformations.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;", "Landroidx/compose/ui/text/input/VisualTransformation;", "separator", "", "getSeparator", "()C", Profile.DEFAULT_PROFILE_NAME, "FourteenAndFifteenPanLength", "NineteenPanLength", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CardNumberVisualTransformations extends VisualTransformation {
    char getSeparator();

    /* compiled from: CardNumberVisualTransformations.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$Default;", "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;", "separator", "", "<init>", "(C)V", "getSeparator", "()C", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default implements CardNumberVisualTransformations {
        public static final int $stable = 0;
        private final char separator;

        public static /* synthetic */ Default copy$default(Default r0, char c, int i, Object obj) {
            if ((i & 1) != 0) {
                c = r0.separator;
            }
            return r0.copy(c);
        }

        /* renamed from: component1, reason: from getter */
        public final char getSeparator() {
            return this.separator;
        }

        public final Default copy(char separator) {
            return new Default(separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && this.separator == ((Default) other).separator;
        }

        public int hashCode() {
            return Character.hashCode(this.separator);
        }

        public String toString() {
            return "Default(separator=" + this.separator + ")";
        }

        public Default(char c) {
            this.separator = c;
        }

        @Override // com.stripe.android.ui.core.elements.CardNumberVisualTransformations
        public char getSeparator() {
            return this.separator;
        }

        @Override // androidx.compose.ui.text.input.VisualTransformation
        public TransformedText filter(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = text.length();
            String str = "";
            for (int i = 0; i < length; i++) {
                String str2 = str + text.charAt(i);
                if (i % 4 == 3 && i < 15) {
                    str2 = str2 + getSeparator();
                }
                str = str2;
            }
            return new TransformedText(new AnnotatedString(str, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformations$Default$filter$creditCardOffsetTranslator$1
                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int offset) {
                    return offset <= 3 ? offset : offset <= 7 ? offset + 1 : offset <= 11 ? offset + 2 : offset + 3;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int offset) {
                    return offset <= 4 ? offset : offset <= 9 ? offset - 1 : offset <= 14 ? offset - 2 : offset - 3;
                }
            });
        }
    }

    /* compiled from: CardNumberVisualTransformations.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$FourteenAndFifteenPanLength;", "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;", "separator", "", "<init>", "(C)V", "getSeparator", "()C", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FourteenAndFifteenPanLength implements CardNumberVisualTransformations {
        public static final int $stable = 0;
        private final char separator;

        public static /* synthetic */ FourteenAndFifteenPanLength copy$default(FourteenAndFifteenPanLength fourteenAndFifteenPanLength, char c, int i, Object obj) {
            if ((i & 1) != 0) {
                c = fourteenAndFifteenPanLength.separator;
            }
            return fourteenAndFifteenPanLength.copy(c);
        }

        /* renamed from: component1, reason: from getter */
        public final char getSeparator() {
            return this.separator;
        }

        public final FourteenAndFifteenPanLength copy(char separator) {
            return new FourteenAndFifteenPanLength(separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FourteenAndFifteenPanLength) && this.separator == ((FourteenAndFifteenPanLength) other).separator;
        }

        public int hashCode() {
            return Character.hashCode(this.separator);
        }

        public String toString() {
            return "FourteenAndFifteenPanLength(separator=" + this.separator + ")";
        }

        public FourteenAndFifteenPanLength(char c) {
            this.separator = c;
        }

        @Override // com.stripe.android.ui.core.elements.CardNumberVisualTransformations
        public char getSeparator() {
            return this.separator;
        }

        @Override // androidx.compose.ui.text.input.VisualTransformation
        public TransformedText filter(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = text.length();
            String str = "";
            for (int i = 0; i < length; i++) {
                String str2 = str + text.charAt(i);
                if (i == 3 || i == 9) {
                    str2 = str2 + getSeparator();
                }
                str = str2;
            }
            return new TransformedText(new AnnotatedString(str, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformations$FourteenAndFifteenPanLength$filter$creditCardOffsetTranslator$1
                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int offset) {
                    return offset <= 3 ? offset : offset <= 9 ? offset + 1 : offset + 2;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int offset) {
                    return offset <= 4 ? offset : offset <= 11 ? offset - 1 : offset - 2;
                }
            });
        }
    }

    /* compiled from: CardNumberVisualTransformations.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations$NineteenPanLength;", "Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformations;", "separator", "", "<init>", "(C)V", "getSeparator", "()C", ViewProps.FILTER, "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NineteenPanLength implements CardNumberVisualTransformations {
        public static final int $stable = 0;
        private final char separator;

        public static /* synthetic */ NineteenPanLength copy$default(NineteenPanLength nineteenPanLength, char c, int i, Object obj) {
            if ((i & 1) != 0) {
                c = nineteenPanLength.separator;
            }
            return nineteenPanLength.copy(c);
        }

        /* renamed from: component1, reason: from getter */
        public final char getSeparator() {
            return this.separator;
        }

        public final NineteenPanLength copy(char separator) {
            return new NineteenPanLength(separator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NineteenPanLength) && this.separator == ((NineteenPanLength) other).separator;
        }

        public int hashCode() {
            return Character.hashCode(this.separator);
        }

        public String toString() {
            return "NineteenPanLength(separator=" + this.separator + ")";
        }

        public NineteenPanLength(char c) {
            this.separator = c;
        }

        @Override // com.stripe.android.ui.core.elements.CardNumberVisualTransformations
        public char getSeparator() {
            return this.separator;
        }

        @Override // androidx.compose.ui.text.input.VisualTransformation
        public TransformedText filter(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = text.length();
            String str = "";
            for (int i = 0; i < length; i++) {
                String str2 = str + text.charAt(i);
                if (i % 4 == 3 && i < 19) {
                    str2 = str2 + getSeparator();
                }
                str = str2;
            }
            return new TransformedText(new AnnotatedString(str, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.ui.core.elements.CardNumberVisualTransformations$NineteenPanLength$filter$creditCardOffsetTranslator$1
                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int offset) {
                    return offset <= 3 ? offset : offset <= 7 ? offset + 1 : offset <= 11 ? offset + 2 : offset <= 15 ? offset + 3 : offset + 4;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int offset) {
                    return offset <= 4 ? offset : offset <= 9 ? offset - 1 : offset <= 14 ? offset - 2 : offset <= 19 ? offset - 3 : offset - 4;
                }
            });
        }
    }
}
