package com.stripe.android.cards;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.CardNumberConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardNumber.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/cards/CardNumber;", "", "<init>", "()V", "Unvalidated", "Validated", "Companion", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber$Validated;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CardNumber {
    public static final int DEFAULT_PAN_LENGTH = 16;
    public static final int MAX_PAN_LENGTH = 19;
    public static final int MIN_PAN_LENGTH = 14;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> DEFAULT_SPACE_POSITIONS = SetsKt.setOf((Object[]) new Integer[]{4, 9, 14});
    private static final Map<Integer, Set<Integer>> SPACE_POSITIONS = MapsKt.mapOf(TuplesKt.to(14, SetsKt.setOf((Object[]) new Integer[]{4, 11})), TuplesKt.to(15, SetsKt.setOf((Object[]) new Integer[]{4, 11})), TuplesKt.to(16, SetsKt.setOf((Object[]) new Integer[]{4, 9, 14})), TuplesKt.to(19, SetsKt.setOf((Object[]) new Integer[]{4, 9, 14, 19})));

    public /* synthetic */ CardNumber(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardNumber() {
    }

    /* compiled from: CardNumber.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0007J\u0012\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0007J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0007J\b\u0010\u001b\u001a\u00020\u000eH\u0007J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber;", "denormalized", "", "<init>", "(Ljava/lang/String;)V", "normalized", "getNormalized", "()Ljava/lang/String;", "length", "", "getLength", "()I", "isMaxLength", "", "()Z", "bin", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "isValidLuhn", "validate", "Lcom/stripe/android/cards/CardNumber$Validated;", "panLength", "getFormatted", "formatNumber", "isPartialEntry", "isPossibleCardBrand", "component1", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unvalidated extends CardNumber {
        private static final Companion Companion = new Companion(null);
        private static final Set<Character> REJECT_CHARS = SetsKt.setOf((Object[]) new Character[]{'-', Character.valueOf(CardNumberConfig.SEPARATOR)});
        private final Bin bin;
        private final String denormalized;
        private final boolean isMaxLength;
        private final boolean isValidLuhn;
        private final int length;
        private final String normalized;

        /* renamed from: component1, reason: from getter */
        private final String getDenormalized() {
            return this.denormalized;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.denormalized;
            }
            return unvalidated.copy(str);
        }

        public final Unvalidated copy(String denormalized) {
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            return new Unvalidated(denormalized);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unvalidated) && Intrinsics.areEqual(this.denormalized, ((Unvalidated) other).denormalized);
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.denormalized + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) throws IOException {
            super(null);
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            this.denormalized = denormalized;
            String str = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!REJECT_CHARS.contains(Character.valueOf(cCharAt))) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            this.normalized = string;
            int length = string.length();
            this.length = length;
            this.isMaxLength = length == 19;
            this.bin = Bin.INSTANCE.create(string);
            this.isValidLuhn = CardUtils.INSTANCE.isValidLuhnNumber(string);
        }

        public final String getNormalized() {
            return this.normalized;
        }

        public final int getLength() {
            return this.length;
        }

        /* renamed from: isMaxLength, reason: from getter */
        public final boolean getIsMaxLength() {
            return this.isMaxLength;
        }

        public final Bin getBin() {
            return this.bin;
        }

        /* renamed from: isValidLuhn, reason: from getter */
        public final boolean getIsValidLuhn() {
            return this.isValidLuhn;
        }

        public final Validated validate(int panLength) {
            if (panLength >= 14 && this.normalized.length() == panLength && this.isValidLuhn) {
                return new Validated(this.normalized);
            }
            return null;
        }

        public static /* synthetic */ String getFormatted$default(Unvalidated unvalidated, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return unvalidated.getFormatted(i);
        }

        public final String getFormatted(int panLength) {
            return formatNumber(panLength);
        }

        private final String formatNumber(int panLength) {
            Set<Integer> spacePositions = CardNumber.INSTANCE.getSpacePositions(panLength);
            String strTake = StringsKt.take(this.normalized, panLength);
            int size = spacePositions.size() + 1;
            String[] strArr = new String[size];
            int length = strTake.length();
            int i = 0;
            int i2 = 0;
            for (Object obj : CollectionsKt.sorted(CollectionsKt.toList(spacePositions))) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) obj).intValue() - i;
                if (length > iIntValue) {
                    String strSubstring = strTake.substring(i2, iIntValue);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    strArr[i] = strSubstring;
                    i2 = iIntValue;
                }
                i = i3;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (strArr[i4] == null) {
                    break;
                }
                i4++;
            }
            Integer numValueOf = Integer.valueOf(i4);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                String strSubstring2 = strTake.substring(i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strArr[iIntValue2] = strSubstring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < size; i5++) {
                String str = strArr[i5];
                if (str == null) {
                    break;
                }
                arrayList.add(str);
            }
            return CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
        }

        public final boolean isPartialEntry(int panLength) {
            return (this.normalized.length() == panLength || StringsKt.isBlank(this.normalized)) ? false : true;
        }

        public final boolean isPossibleCardBrand() {
            return (StringsKt.isBlank(this.normalized) || CollectionsKt.first((List) CardBrand.INSTANCE.getCardBrands(this.normalized)) == CardBrand.Unknown) ? false : true;
        }

        /* compiled from: CardNumber.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated$Companion;", "", "<init>", "()V", "REJECT_CHARS", "", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: CardNumber.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Validated;", "Lcom/stripe/android/cards/CardNumber;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Validated extends CardNumber {
        private final String value;

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.value;
            }
            return validated.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Validated copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Validated(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Validated) && Intrinsics.areEqual(this.value, ((Validated) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.value + ")";
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* compiled from: CardNumber.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Companion;", "", "<init>", "()V", "getSpacePositions", "", "", "panLength", "MIN_PAN_LENGTH", "MAX_PAN_LENGTH", "DEFAULT_PAN_LENGTH", "DEFAULT_SPACE_POSITIONS", "SPACE_POSITIONS", "", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<Integer> getSpacePositions(int panLength) {
            Set<Integer> set = (Set) CardNumber.SPACE_POSITIONS.get(Integer.valueOf(panLength));
            return set == null ? CardNumber.DEFAULT_SPACE_POSITIONS : set;
        }
    }
}
