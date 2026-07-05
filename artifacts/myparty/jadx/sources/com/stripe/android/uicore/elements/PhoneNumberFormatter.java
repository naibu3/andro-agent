package com.stripe.android.uicore.elements;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.os.LocaleListCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.stripe.android.ui.core.elements.CardNumberConfig;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;

/* compiled from: PhoneNumberFormatter.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00162\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "countryCode", "getCountryCode", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "userInputFilter", "input", "toE164Format", "WithRegion", "UnknownRegion", "Metadata", "Companion", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PhoneNumberFormatter {
    public static final int $stable = 0;
    private static final int COUNTRY_PREFIX_MAX_LENGTH = 5;
    private static final int E164_MAX_DIGITS = 15;
    private static final Map<String, Metadata> allMetadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CharRange VALID_INPUT_RANGE = new CharRange('0', '9');

    public /* synthetic */ PhoneNumberFormatter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getCountryCode();

    public abstract String getPlaceholder();

    public abstract String getPrefix();

    public abstract VisualTransformation getVisualTransformation();

    public abstract String toE164Format(String input);

    public abstract String userInputFilter(String input);

    private PhoneNumberFormatter() {
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "metadata", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "<init>", "(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V", "prefix", "", "getPrefix", "()Ljava/lang/String;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "countryCode", "getCountryCode", "userInputFilter", "input", "toE164Format", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "formatNumberNational", "filteredInput", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WithRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final Metadata metadata;
        private final String placeholder;
        private final String prefix;
        private final VisualTransformation visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithRegion(Metadata metadata) {
            String strReplace$default;
            super(null);
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.metadata = metadata;
            this.prefix = metadata.getPrefix();
            String pattern = metadata.getPattern();
            this.placeholder = (pattern == null || (strReplace$default = StringsKt.replace$default(pattern, '#', '5', false, 4, (Object) null)) == null) ? "" : strReplace$default;
            this.countryCode = metadata.getRegionCode();
            this.visualTransformation = new VisualTransformation() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1
                @Override // androidx.compose.ui.text.input.VisualTransformation
                public TransformedText filter(AnnotatedString text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    AnnotatedString annotatedString = new AnnotatedString(this.this$0.formatNumberNational(text.getText()), null, null, 6, null);
                    final PhoneNumberFormatter.WithRegion withRegion = this.this$0;
                    return new TransformedText(annotatedString, new OffsetMapping() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$WithRegion$visualTransformation$1$filter$1
                        @Override // androidx.compose.ui.text.input.OffsetMapping
                        public int originalToTransformed(int offset) {
                            if (withRegion.metadata.getPattern() == null) {
                                return offset;
                            }
                            String pattern2 = withRegion.metadata.getPattern();
                            if (offset == 0) {
                                return 0;
                            }
                            String str = pattern2;
                            int i = 0;
                            int i2 = 0;
                            int i3 = -1;
                            for (int i4 = 0; i4 < str.length(); i4++) {
                                i++;
                                if (str.charAt(i4) == '#' && (i2 = i2 + 1) == offset) {
                                    i3 = i;
                                }
                            }
                            return i3 == -1 ? pattern2.length() + 1 + (offset - i2) : i3;
                        }

                        @Override // androidx.compose.ui.text.input.OffsetMapping
                        public int transformedToOriginal(int offset) throws IOException {
                            if (withRegion.metadata.getPattern() == null) {
                                return offset;
                            }
                            if (offset == 0) {
                                return 0;
                            }
                            String pattern2 = withRegion.metadata.getPattern();
                            String strSubstring = pattern2.substring(0, Math.min(offset, pattern2.length()));
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            String str = strSubstring;
                            StringBuilder sb = new StringBuilder();
                            int length = str.length();
                            for (int i = 0; i < length; i++) {
                                char cCharAt = str.charAt(i);
                                if (cCharAt != '#') {
                                    sb.append(cCharAt);
                                }
                            }
                            int length2 = sb.toString().length();
                            if (offset > pattern2.length()) {
                                length2++;
                            }
                            return offset - length2;
                        }
                    });
                }
            };
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return getPrefix() + StringsKt.trimStart(userInputFilter(input), '0');
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public VisualTransformation getVisualTransformation() {
            return this.visualTransformation;
        }

        public final String formatNumberNational(String filteredInput) {
            Intrinsics.checkNotNullParameter(filteredInput, "filteredInput");
            if (this.metadata.getPattern() == null) {
                return filteredInput;
            }
            StringBuilder sb = new StringBuilder();
            String pattern = this.metadata.getPattern();
            int i = 0;
            for (int i2 = 0; i2 < pattern.length(); i2++) {
                char cCharAt = pattern.charAt(i2);
                if (i < filteredInput.length()) {
                    if (cCharAt == '#') {
                        cCharAt = filteredInput.charAt(i);
                        i++;
                    }
                    sb.append(cCharAt);
                }
            }
            if (i < filteredInput.length()) {
                StringBuilder sbAppend = sb.append(CardNumberConfig.SEPARATOR);
                String strSubstring = filteredInput.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                char[] charArray = strSubstring.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                sbAppend.append(charArray);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String userInputFilter(String input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            String str = input;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (PhoneNumberFormatter.INSTANCE.getVALID_INPUT_RANGE().contains(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            String strSubstring = string.substring(0, Math.min(string.length(), 15));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "countryCode", "", "<init>", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "prefix", "getPrefix", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "userInputFilter", "input", "toE164Format", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownRegion extends PhoneNumberFormatter {
        public static final int $stable = 0;
        private final String countryCode;
        private final String placeholder;
        private final String prefix;
        private final VisualTransformation visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownRegion(String countryCode) {
            super(null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.prefix = "";
            this.placeholder = "+############";
            this.visualTransformation = new VisualTransformation() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$UnknownRegion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.text.input.VisualTransformation
                public final TransformedText filter(AnnotatedString annotatedString) {
                    return PhoneNumberFormatter.UnknownRegion.visualTransformation$lambda$2(annotatedString);
                }
            };
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String toE164Format(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return "+" + StringsKt.trimStart(userInputFilter(input), '0');
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public VisualTransformation getVisualTransformation() {
            return this.visualTransformation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText visualTransformation$lambda$2(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TransformedText(new AnnotatedString("+" + text.getText(), null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.uicore.elements.PhoneNumberFormatter$UnknownRegion$visualTransformation$1$1
                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int offset) {
                    return offset + 1;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int offset) {
                    return Math.max(offset - 1, 0);
                }
            });
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public String userInputFilter(String input) throws IOException {
            Intrinsics.checkNotNullParameter(input, "input");
            String str = input;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (PhoneNumberFormatter.INSTANCE.getVALID_INPUT_RANGE().contains(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            String strSubstring = string.substring(0, Math.min(string.length(), 15));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "", "prefix", "", "regionCode", "pattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getRegionCode", "getPattern", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 0;
        private final String pattern;
        private final String prefix;
        private final String regionCode;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.prefix;
            }
            if ((i & 2) != 0) {
                str2 = metadata.regionCode;
            }
            if ((i & 4) != 0) {
                str3 = metadata.pattern;
            }
            return metadata.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegionCode() {
            return this.regionCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public final Metadata copy(String prefix, String regionCode, String pattern) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
            return new Metadata(prefix, regionCode, pattern);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.prefix, metadata.prefix) && Intrinsics.areEqual(this.regionCode, metadata.regionCode) && Intrinsics.areEqual(this.pattern, metadata.pattern);
        }

        public int hashCode() {
            int iHashCode = ((this.prefix.hashCode() * 31) + this.regionCode.hashCode()) * 31;
            String str = this.pattern;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Metadata(prefix=" + this.prefix + ", regionCode=" + this.regionCode + ", pattern=" + this.pattern + ")";
        }

        public Metadata(String prefix, String regionCode, String str) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
            this.prefix = prefix;
            this.regionCode = regionCode;
            this.pattern = str;
            if (str != null && str.length() <= 0) {
                throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.".toString());
            }
        }

        public /* synthetic */ Metadata(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final String getRegionCode() {
            return this.regionCode;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;", "", "<init>", "()V", "E164_MAX_DIGITS", "", "COUNTRY_PREFIX_MAX_LENGTH", "VALID_INPUT_RANGE", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGE", "()Lkotlin/ranges/CharRange;", "forCountry", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "countryCode", "", "forPrefix", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "findBestCountryForPrefix", "prefix", "userLocales", "Landroidx/core/os/LocaleListCompat;", "lengthForCountry", "(Ljava/lang/String;)Ljava/lang/Integer;", "countryCodesForPrefix", "", "prefixForCountry", "prefixForCountry$stripe_ui_core_release", "allMetadata", "", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CharRange getVALID_INPUT_RANGE() {
            return PhoneNumberFormatter.VALID_INPUT_RANGE;
        }

        public final PhoneNumberFormatter forCountry(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null) {
                return new WithRegion(metadata);
            }
            return new UnknownRegion(countryCode);
        }

        public final PhoneNumberFormatter forPrefix(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            int i = 1;
            while (i <= StringsKt.getLastIndex(phoneNumber) && i < 4) {
                i++;
                String strSubstring = phoneNumber.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
                String strFindBestCountryForPrefix = findBestCountryForPrefix(strSubstring, adjustedDefault);
                if (strFindBestCountryForPrefix != null) {
                    return forCountry(strFindBestCountryForPrefix);
                }
            }
            return null;
        }

        private final String findBestCountryForPrefix(String prefix, LocaleListCompat userLocales) {
            List<String> listCountryCodesForPrefix = countryCodesForPrefix(prefix);
            if (listCountryCodesForPrefix.isEmpty()) {
                listCountryCodesForPrefix = null;
            }
            if (listCountryCodesForPrefix == null) {
                return null;
            }
            int size = userLocales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = userLocales.get(i);
                Intrinsics.checkNotNull(locale);
                if (listCountryCodesForPrefix.contains(locale.getCountry())) {
                    return locale.getCountry();
                }
            }
            return (String) CollectionsKt.first((List) listCountryCodesForPrefix);
        }

        public final Integer lengthForCountry(String countryCode) {
            String pattern;
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata == null || (pattern = metadata.getPattern()) == null) {
                return null;
            }
            String str = pattern;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == '#') {
                    i++;
                }
            }
            return Integer.valueOf(i);
        }

        private final List<String> countryCodesForPrefix(String prefix) {
            Map map = PhoneNumberFormatter.allMetadata;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Intrinsics.areEqual(((Metadata) entry.getValue()).getPrefix(), prefix)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((Metadata) ((Map.Entry) it.next()).getValue()).getRegionCode());
            }
            return arrayList;
        }

        public final String prefixForCountry$stripe_ui_core_release(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Map map = PhoneNumberFormatter.allMetadata;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Metadata metadata = (Metadata) map.get(upperCase);
            if (metadata != null) {
                return metadata.getPrefix();
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 4;
        String str = null;
        int i2 = 4;
        int i3 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        allMetadata = MapsKt.mapOf(TuplesKt.to("US", new Metadata("+1", "US", "(###) ###-####")), TuplesKt.to("CA", new Metadata("+1", "CA", "(###) ###-####")), TuplesKt.to("AG", new Metadata("+1", "AG", "(###) ###-####")), TuplesKt.to("AS", new Metadata("+1", "AS", "(###) ###-####")), TuplesKt.to("AI", new Metadata("+1", "AI", "(###) ###-####")), TuplesKt.to("BB", new Metadata("+1", "BB", "(###) ###-####")), TuplesKt.to("BM", new Metadata("+1", "BM", "(###) ###-####")), TuplesKt.to("BS", new Metadata("+1", "BS", "(###) ###-####")), TuplesKt.to("DM", new Metadata("+1", "DM", "(###) ###-####")), TuplesKt.to("DO", new Metadata("+1", "DO", "(###) ###-####")), TuplesKt.to("GD", new Metadata("+1", "GD", "(###) ###-####")), TuplesKt.to("GU", new Metadata("+1", "GU", "(###) ###-####")), TuplesKt.to("JM", new Metadata("+1", "JM", "(###) ###-####")), TuplesKt.to("KN", new Metadata("+1", "KN", "(###) ###-####")), TuplesKt.to("KY", new Metadata("+1", "KY", "(###) ###-####")), TuplesKt.to("LC", new Metadata("+1", "LC", "(###) ###-####")), TuplesKt.to("MP", new Metadata("+1", "MP", "(###) ###-####")), TuplesKt.to("MS", new Metadata("+1", "MS", "(###) ###-####")), TuplesKt.to("PR", new Metadata("+1", "PR", "(###) ###-####")), TuplesKt.to("SX", new Metadata("+1", "SX", "(###) ###-####")), TuplesKt.to("TC", new Metadata("+1", "TC", "(###) ###-####")), TuplesKt.to("TT", new Metadata("+1", "TT", "(###) ###-####")), TuplesKt.to("VC", new Metadata("+1", "VC", "(###) ###-####")), TuplesKt.to("VG", new Metadata("+1", "VG", "(###) ###-####")), TuplesKt.to("VI", new Metadata("+1", "VI", "(###) ###-####")), TuplesKt.to("EG", new Metadata("+20", "EG", "### ### ####")), TuplesKt.to("SS", new Metadata("+211", "SS", "### ### ###")), TuplesKt.to("MA", new Metadata("+212", "MA", "###-######")), TuplesKt.to("EH", new Metadata("+212", "EH", "###-######")), TuplesKt.to("DZ", new Metadata("+213", "DZ", "### ## ## ##")), TuplesKt.to("TN", new Metadata("+216", "TN", "## ### ###")), TuplesKt.to("LY", new Metadata("+218", "LY", "##-#######")), TuplesKt.to("GM", new Metadata("+220", "GM", "### ####")), TuplesKt.to("SN", new Metadata("+221", "SN", "## ### ## ##")), TuplesKt.to("MR", new Metadata("+222", "MR", "## ## ## ##")), TuplesKt.to("ML", new Metadata("+223", "ML", "## ## ## ##")), TuplesKt.to("GN", new Metadata("+224", "GN", "### ## ## ##")), TuplesKt.to("CI", new Metadata("+225", "CI", "## ## ## ##")), TuplesKt.to("BF", new Metadata("+226", "BF", "## ## ## ##")), TuplesKt.to("NE", new Metadata("+227", "NE", "## ## ## ##")), TuplesKt.to("TG", new Metadata("+228", "TG", "## ## ## ##")), TuplesKt.to("BJ", new Metadata("+229", "BJ", "## ## ## ##")), TuplesKt.to("MU", new Metadata("+230", "MU", "#### ####")), TuplesKt.to("LR", new Metadata("+231", "LR", "### ### ###")), TuplesKt.to("SL", new Metadata("+232", "SL", "## ######")), TuplesKt.to("GH", new Metadata("+233", "GH", "## ### ####")), TuplesKt.to("NG", new Metadata("+234", "NG", "### ### ####")), TuplesKt.to("TD", new Metadata("+235", "TD", "## ## ## ##")), TuplesKt.to("CF", new Metadata("+236", "CF", "## ## ## ##")), TuplesKt.to("CM", new Metadata("+237", "CM", "## ## ## ##")), TuplesKt.to("CV", new Metadata("+238", "CV", "### ## ##")), TuplesKt.to("ST", new Metadata("+239", "ST", "### ####")), TuplesKt.to("GQ", new Metadata("+240", "GQ", "### ### ###")), TuplesKt.to("GA", new Metadata("+241", "GA", "## ## ## ##")), TuplesKt.to("CG", new Metadata("+242", "CG", "## ### ####")), TuplesKt.to("CD", new Metadata("+243", "CD", "### ### ###")), TuplesKt.to("AO", new Metadata("+244", "AO", "### ### ###")), TuplesKt.to("GW", new Metadata("+245", "GW", "### ####")), TuplesKt.to("IO", new Metadata("+246", "IO", "### ####")), TuplesKt.to("AC", new Metadata("+247", "AC", str, i, null)), TuplesKt.to("SC", new Metadata("+248", "SC", "# ### ###")), TuplesKt.to("RW", new Metadata("+250", "RW", "### ### ###")), TuplesKt.to("ET", new Metadata("+251", "ET", "## ### ####")), TuplesKt.to("SO", new Metadata("+252", "SO", "## #######")), TuplesKt.to("DJ", new Metadata("+253", "DJ", "## ## ## ##")), TuplesKt.to("KE", new Metadata("+254", "KE", "## #######")), TuplesKt.to("TZ", new Metadata("+255", "TZ", "### ### ###")), TuplesKt.to("UG", new Metadata("+256", "UG", "### ######")), TuplesKt.to("BI", new Metadata("+257", "BI", "## ## ## ##")), TuplesKt.to("MZ", new Metadata("+258", "MZ", "## ### ####")), TuplesKt.to("ZM", new Metadata("+260", "ZM", "## #######")), TuplesKt.to("MG", new Metadata("+261", "MG", "## ## ### ##")), TuplesKt.to("RE", new Metadata("+262", "RE", str, i, 0 == true ? 1 : 0)), TuplesKt.to("TF", new Metadata("+262", "TF", str, i, 0 == true ? 1 : 0)), TuplesKt.to("YT", new Metadata("+262", "YT", "### ## ## ##")), TuplesKt.to("ZW", new Metadata("+263", "ZW", "## ### ####")), TuplesKt.to("NA", new Metadata("+264", "NA", "## ### ####")), TuplesKt.to("MW", new Metadata("+265", "MW", "### ## ## ##")), TuplesKt.to("LS", new Metadata("+266", "LS", "#### ####")), TuplesKt.to("BW", new Metadata("+267", "BW", "## ### ###")), TuplesKt.to("SZ", new Metadata("+268", "SZ", "#### ####")), TuplesKt.to("KM", new Metadata("+269", "KM", "### ## ##")), TuplesKt.to("ZA", new Metadata("+27", "ZA", "## ### ####")), TuplesKt.to("SH", new Metadata("+290", "SH", str, i, 0 == true ? 1 : 0)), TuplesKt.to("TA", new Metadata("+290", "TA", str, i, 0 == true ? 1 : 0)), TuplesKt.to("ER", new Metadata("+291", "ER", "# ### ###")), TuplesKt.to("AW", new Metadata("+297", "AW", "### ####")), TuplesKt.to("FO", new Metadata("+298", "FO", "######")), TuplesKt.to("GL", new Metadata("+299", "GL", "## ## ##")), TuplesKt.to("GR", new Metadata("+30", "GR", "### ### ####")), TuplesKt.to("NL", new Metadata("+31", "NL", "# ########")), TuplesKt.to("BE", new Metadata("+32", "BE", "### ## ## ##")), TuplesKt.to("FR", new Metadata("+33", "FR", "# ## ## ## ##")), TuplesKt.to("ES", new Metadata("+34", "ES", "### ## ## ##")), TuplesKt.to("GI", new Metadata("+350", "GI", "### #####")), TuplesKt.to("PT", new Metadata("+351", "PT", "### ### ###")), TuplesKt.to("LU", new Metadata("+352", "LU", "## ## ## ###")), TuplesKt.to("IE", new Metadata("+353", "IE", "## ### ####")), TuplesKt.to("IS", new Metadata("+354", "IS", "### ####")), TuplesKt.to("AL", new Metadata("+355", "AL", "## ### ####")), TuplesKt.to("MT", new Metadata("+356", "MT", "#### ####")), TuplesKt.to("CY", new Metadata("+357", "CY", "## ######")), TuplesKt.to("FI", new Metadata("+358", "FI", "## ### ## ##")), TuplesKt.to("AX", new Metadata("+358", "AX", 0 == true ? 1 : 0, i2, null)), TuplesKt.to("BG", new Metadata("+359", "BG", "### ### ##")), TuplesKt.to("HU", new Metadata("+36", "HU", "## ### ####")), TuplesKt.to("LT", new Metadata("+370", "LT", "### #####")), TuplesKt.to("LV", new Metadata("+371", "LV", "## ### ###")), TuplesKt.to("EE", new Metadata("+372", "EE", "#### ####")), TuplesKt.to("MD", new Metadata("+373", "MD", "### ## ###")), TuplesKt.to("AM", new Metadata("+374", "AM", "## ######")), TuplesKt.to("BY", new Metadata("+375", "BY", "## ###-##-##")), TuplesKt.to("AD", new Metadata("+376", "AD", "### ###")), TuplesKt.to("MC", new Metadata("+377", "MC", "# ## ## ## ##")), TuplesKt.to("SM", new Metadata("+378", "SM", "## ## ## ##")), TuplesKt.to("VA", new Metadata("+379", "VA", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to("UA", new Metadata("+380", "UA", "## ### ####")), TuplesKt.to("RS", new Metadata("+381", "RS", "## #######")), TuplesKt.to("ME", new Metadata("+382", "ME", "## ### ###")), TuplesKt.to("XK", new Metadata("+383", "XK", "## ### ###")), TuplesKt.to("HR", new Metadata("+385", "HR", "## ### ####")), TuplesKt.to("SI", new Metadata("+386", "SI", "## ### ###")), TuplesKt.to("BA", new Metadata("+387", "BA", "## ###-###")), TuplesKt.to("MK", new Metadata("+389", "MK", "## ### ###")), TuplesKt.to("IT", new Metadata("+39", "IT", "## #### ####")), TuplesKt.to("RO", new Metadata("+40", "RO", "## ### ####")), TuplesKt.to("CH", new Metadata("+41", "CH", "## ### ## ##")), TuplesKt.to("CZ", new Metadata("+420", "CZ", "### ### ###")), TuplesKt.to("SK", new Metadata("+421", "SK", "### ### ###")), TuplesKt.to("LI", new Metadata("+423", "LI", "### ### ###")), TuplesKt.to("AT", new Metadata("+43", "AT", "### ######")), TuplesKt.to("GB", new Metadata("+44", "GB", "#### ######")), TuplesKt.to("GG", new Metadata("+44", "GG", "#### ######")), TuplesKt.to("JE", new Metadata("+44", "JE", "#### ######")), TuplesKt.to("IM", new Metadata("+44", "IM", "#### ######")), TuplesKt.to("DK", new Metadata("+45", "DK", "## ## ## ##")), TuplesKt.to("SE", new Metadata("+46", "SE", "##-### ## ##")), TuplesKt.to("NO", new Metadata("+47", "NO", "### ## ###")), TuplesKt.to("BV", new Metadata("+47", "BV", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to("SJ", new Metadata("+47", "SJ", "## ## ## ##")), TuplesKt.to("PL", new Metadata("+48", "PL", "## ### ## ##")), TuplesKt.to("DE", new Metadata("+49", "DE", "### #######")), TuplesKt.to("FK", new Metadata("+500", "FK", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to("GS", new Metadata("+500", "GS", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0)), TuplesKt.to("BZ", new Metadata("+501", "BZ", "###-####")), TuplesKt.to("GT", new Metadata("+502", "GT", "#### ####")), TuplesKt.to("SV", new Metadata("+503", "SV", "#### ####")), TuplesKt.to("HN", new Metadata("+504", "HN", "####-####")), TuplesKt.to("NI", new Metadata("+505", "NI", "#### ####")), TuplesKt.to("CR", new Metadata("+506", "CR", "#### ####")), TuplesKt.to("PA", new Metadata("+507", "PA", "####-####")), TuplesKt.to("PM", new Metadata("+508", "PM", "## ## ##")), TuplesKt.to("HT", new Metadata("+509", "HT", "## ## ####")), TuplesKt.to("PE", new Metadata("+51", "PE", "### ### ###")), TuplesKt.to("MX", new Metadata("+52", "MX", "### ### ####")), TuplesKt.to("AR", new Metadata("+54", "AR", "## ##-####-####")), TuplesKt.to("BR", new Metadata("+55", "BR", "## #####-####")), TuplesKt.to("CL", new Metadata("+56", "CL", "# #### ####")), TuplesKt.to("CO", new Metadata("+57", "CO", "### #######")), TuplesKt.to("VE", new Metadata("+58", "VE", "###-#######")), TuplesKt.to("BL", new Metadata("+590", "BL", "### ## ## ##")), TuplesKt.to("MF", new Metadata("+590", "MF", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("GP", new Metadata("+590", "GP", "### ## ## ##")), TuplesKt.to("BO", new Metadata("+591", "BO", "########")), TuplesKt.to("GY", new Metadata("+592", "GY", "### ####")), TuplesKt.to("EC", new Metadata("+593", "EC", "## ### ####")), TuplesKt.to("GF", new Metadata("+594", "GF", "### ## ## ##")), TuplesKt.to("PY", new Metadata("+595", "PY", "## #######")), TuplesKt.to("MQ", new Metadata("+596", "MQ", "### ## ## ##")), TuplesKt.to("SR", new Metadata("+597", "SR", "###-####")), TuplesKt.to("UY", new Metadata("+598", "UY", "#### ####")), TuplesKt.to("CW", new Metadata("+599", "CW", "# ### ####")), TuplesKt.to("BQ", new Metadata("+599", "BQ", "### ####")), TuplesKt.to("MY", new Metadata("+60", "MY", "##-### ####")), TuplesKt.to("AU", new Metadata("+61", "AU", "### ### ###")), TuplesKt.to("ID", new Metadata("+62", "ID", "###-###-###")), TuplesKt.to("PH", new Metadata("+63", "PH", "#### ######")), TuplesKt.to("NZ", new Metadata("+64", "NZ", "## ### ####")), TuplesKt.to("SG", new Metadata("+65", "SG", "#### ####")), TuplesKt.to("TH", new Metadata("+66", "TH", "## ### ####")), TuplesKt.to("TL", new Metadata("+670", "TL", "#### ####")), TuplesKt.to("AQ", new Metadata("+672", "AQ", "## ####")), TuplesKt.to("BN", new Metadata("+673", "BN", "### ####")), TuplesKt.to("NR", new Metadata("+674", "NR", "### ####")), TuplesKt.to("PG", new Metadata("+675", "PG", "### ####")), TuplesKt.to("TO", new Metadata("+676", "TO", "### ####")), TuplesKt.to("SB", new Metadata("+677", "SB", "### ####")), TuplesKt.to("VU", new Metadata("+678", "VU", "### ####")), TuplesKt.to("FJ", new Metadata("+679", "FJ", "### ####")), TuplesKt.to("WF", new Metadata("+681", "WF", "## ## ##")), TuplesKt.to("CK", new Metadata("+682", "CK", "## ###")), TuplesKt.to("NU", new Metadata("+683", "NU", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("WS", new Metadata("+685", "WS", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("KI", new Metadata("+686", "KI", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("NC", new Metadata("+687", "NC", "########")), TuplesKt.to("TV", new Metadata("+688", "TV", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("PF", new Metadata("+689", "PF", "## ## ##")), TuplesKt.to("TK", new Metadata("+690", "TK", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("RU", new Metadata("+7", "RU", "### ###-##-##")), TuplesKt.to("KZ", new Metadata("+7", "KZ", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("JP", new Metadata("+81", "JP", "##-####-####")), TuplesKt.to("KR", new Metadata("+82", "KR", "##-####-####")), TuplesKt.to("VN", new Metadata("+84", "VN", "## ### ## ##")), TuplesKt.to("HK", new Metadata("+852", "HK", "#### ####")), TuplesKt.to("MO", new Metadata("+853", "MO", "#### ####")), TuplesKt.to("KH", new Metadata("+855", "KH", "## ### ###")), TuplesKt.to("LA", new Metadata("+856", "LA", "## ## ### ###")), TuplesKt.to("CN", new Metadata("+86", "CN", "### #### ####")), TuplesKt.to("PN", new Metadata("+872", "PN", 0 == true ? 1 : 0, i3, defaultConstructorMarker)), TuplesKt.to("BD", new Metadata("+880", "BD", "####-######")), TuplesKt.to("TW", new Metadata("+886", "TW", "### ### ###")), TuplesKt.to("TR", new Metadata("+90", "TR", "### ### ####")), TuplesKt.to("IN", new Metadata("+91", "IN", "## ## ######")), TuplesKt.to("PK", new Metadata("+92", "PK", "### #######")), TuplesKt.to("AF", new Metadata("+93", "AF", "## ### ####")), TuplesKt.to("LK", new Metadata("+94", "LK", "## # ######")), TuplesKt.to("MM", new Metadata("+95", "MM", "# ### ####")), TuplesKt.to("MV", new Metadata("+960", "MV", "###-####")), TuplesKt.to(ExpandedProductParsedResult.POUND, new Metadata("+961", ExpandedProductParsedResult.POUND, "## ### ###")), TuplesKt.to("JO", new Metadata("+962", "JO", "# #### ####")), TuplesKt.to("IQ", new Metadata("+964", "IQ", "### ### ####")), TuplesKt.to("KW", new Metadata("+965", "KW", "### #####")), TuplesKt.to("SA", new Metadata("+966", "SA", "## ### ####")), TuplesKt.to("YE", new Metadata("+967", "YE", "### ### ###")), TuplesKt.to("OM", new Metadata("+968", "OM", "#### ####")), TuplesKt.to("PS", new Metadata("+970", "PS", "### ### ###")), TuplesKt.to("AE", new Metadata("+971", "AE", "## ### ####")), TuplesKt.to("IL", new Metadata("+972", "IL", "##-###-####")), TuplesKt.to("BH", new Metadata("+973", "BH", "#### ####")), TuplesKt.to("QA", new Metadata("+974", "QA", "#### ####")), TuplesKt.to("BT", new Metadata("+975", "BT", "## ## ## ##")), TuplesKt.to("MN", new Metadata("+976", "MN", "#### ####")), TuplesKt.to("NP", new Metadata("+977", "NP", "###-#######")), TuplesKt.to("TJ", new Metadata("+992", "TJ", "### ## ####")), TuplesKt.to("TM", new Metadata("+993", "TM", "## ##-##-##")), TuplesKt.to("AZ", new Metadata("+994", "AZ", "## ### ## ##")), TuplesKt.to("GE", new Metadata("+995", "GE", "### ## ## ##")), TuplesKt.to(ExpandedProductParsedResult.KILOGRAM, new Metadata("+996", ExpandedProductParsedResult.KILOGRAM, "### ### ###")), TuplesKt.to("UZ", new Metadata("+998", "UZ", "## ### ## ##")));
    }
}
