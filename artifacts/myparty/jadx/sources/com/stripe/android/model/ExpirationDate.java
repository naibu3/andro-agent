package com.stripe.android.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.utils.DateUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: ExpirationDate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/ExpirationDate;", "", "<init>", "()V", "Unvalidated", "Validated", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ExpirationDate {
    public static final int $stable = 0;

    public /* synthetic */ ExpirationDate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ExpirationDate.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(II)V", "getMonth", "()Ljava/lang/String;", "getYear", "isMonthValid", "", "()Z", "validate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getDisplayString", "isComplete", "isComplete$payments_core_release", "isPartialEntry", "isPartialEntry$payments_core_release", "component1", "component2", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unvalidated extends ExpirationDate {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Unvalidated EMPTY = new Unvalidated("", "");
        private final boolean isComplete;
        private final boolean isMonthValid;
        private final boolean isPartialEntry;
        private final String month;
        private final String year;

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.month;
            }
            if ((i & 2) != 0) {
                str2 = unvalidated.year;
            }
            return unvalidated.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMonth() {
            return this.month;
        }

        /* renamed from: component2, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        public final Unvalidated copy(String month, String year) {
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(year, "year");
            return new Unvalidated(month, year);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) other;
            return Intrinsics.areEqual(this.month, unvalidated.month) && Intrinsics.areEqual(this.year, unvalidated.year);
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.month + ", year=" + this.year + ")";
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String month, String year) {
            Object objM9118constructorimpl;
            super(null);
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(year, "year");
            this.month = month;
            this.year = year;
            try {
                Result.Companion companion = Result.INSTANCE;
                Unvalidated unvalidated = this;
                int i = Integer.parseInt(this.month);
                objM9118constructorimpl = Result.m9118constructorimpl(Boolean.valueOf(1 <= i && i < 13));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            this.isMonthValid = ((Boolean) (Result.m9124isFailureimpl(objM9118constructorimpl) ? false : objM9118constructorimpl)).booleanValue();
            boolean z = this.month.length() + this.year.length() == 4;
            this.isComplete = z;
            this.isPartialEntry = !z && this.month.length() + this.year.length() > 0;
        }

        /* renamed from: isMonthValid, reason: from getter */
        public final boolean getIsMonthValid() {
            return this.isMonthValid;
        }

        public Unvalidated(int i, int i2) {
            this(String.valueOf(i), String.valueOf(i2));
        }

        public final Validated validate() {
            Object objM9118constructorimpl;
            String str = this.month;
            String str2 = this.year;
            try {
                Result.Companion companion = Result.INSTANCE;
                Unvalidated unvalidated = this;
                objM9118constructorimpl = Result.m9118constructorimpl(new Validated(Integer.parseInt(str), DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            return (Validated) objM9118constructorimpl;
        }

        public final String getDisplayString() {
            return this.year.length() == 3 ? "" : CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{StringsKt.padStart(this.month, 2, '0'), StringsKt.padStart(StringsKt.takeLast(this.year, 2), 2, '0')}), "", null, null, 0, null, null, 62, null);
        }

        /* renamed from: isComplete$payments_core_release, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: isPartialEntry$payments_core_release, reason: from getter */
        public final boolean getIsPartialEntry() {
            return this.isPartialEntry;
        }

        /* compiled from: ExpirationDate.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "input", "", "EMPTY", "getEMPTY", "()Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Unvalidated create(String input) throws IOException {
                Intrinsics.checkNotNullParameter(input, "input");
                String str = input;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (!Character.isDigit(cCharAt) && !CharsKt.isWhitespace(cCharAt) && cCharAt != '/') {
                        return getEMPTY();
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        sb.append(cCharAt2);
                    }
                }
                String string = sb.toString();
                return new Unvalidated(StringsKt.take(string, 2), StringsKt.drop(string, 2));
            }

            public final Unvalidated getEMPTY() {
                return Unvalidated.EMPTY;
            }
        }
    }

    private ExpirationDate() {
    }

    /* compiled from: ExpirationDate.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Validated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "<init>", "(II)V", "getMonth", "()I", "getYear", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Validated extends ExpirationDate {
        public static final int $stable = 0;
        private final int month;
        private final int year;

        public static /* synthetic */ Validated copy$default(Validated validated, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = validated.month;
            }
            if ((i3 & 2) != 0) {
                i2 = validated.year;
            }
            return validated.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* renamed from: component2, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        public final Validated copy(int month, int year) {
            return new Validated(month, year);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) other;
            return this.month == validated.month && this.year == validated.year;
        }

        public int hashCode() {
            return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
        }

        public String toString() {
            return "Validated(month=" + this.month + ", year=" + this.year + ")";
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public Validated(int i, int i2) {
            super(null);
            this.month = i;
            this.year = i2;
        }
    }
}
