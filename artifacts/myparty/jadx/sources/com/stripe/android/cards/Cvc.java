package com.stripe.android.cards;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Cvc.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/cards/Cvc;", "", "<init>", "()V", "Unvalidated", "Validated", "Companion", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Cvc {
    public static final int $stable = 0;
    private static final int COMMON_LENGTH = 3;
    private static final Companion Companion = new Companion(null);

    public /* synthetic */ Cvc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Cvc() {
    }

    /* compiled from: Cvc.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0018\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc;", "denormalized", "", "<init>", "(Ljava/lang/String;)V", "normalized", "getNormalized$payments_core_release", "()Ljava/lang/String;", "validate", "Lcom/stripe/android/cards/Cvc$Validated;", "maxLength", "", "isComplete", "", "isPartialEntry", "component1", "copy", "copy$payments_core_release", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unvalidated extends Cvc {
        public static final int $stable = 0;
        private final String denormalized;
        private final String normalized;

        /* renamed from: component1, reason: from getter */
        private final String getDenormalized() {
            return this.denormalized;
        }

        public static /* synthetic */ Unvalidated copy$payments_core_release$default(Unvalidated unvalidated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.denormalized;
            }
            return unvalidated.copy$payments_core_release(str);
        }

        public final Unvalidated copy$payments_core_release(String denormalized) {
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
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            this.normalized = sb.toString();
        }

        /* renamed from: getNormalized$payments_core_release, reason: from getter */
        public final String getNormalized() {
            return this.normalized;
        }

        public final Validated validate(int maxLength) {
            if (isComplete(maxLength)) {
                return new Validated(this.normalized);
            }
            return null;
        }

        private final boolean isComplete(int maxLength) {
            return SetsKt.setOf((Object[]) new Integer[]{3, Integer.valueOf(maxLength)}).contains(Integer.valueOf(this.normalized.length()));
        }

        public final boolean isPartialEntry(int maxLength) {
            return (StringsKt.isBlank(this.normalized) || isComplete(maxLength)) ? false : true;
        }
    }

    /* compiled from: Cvc.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/cards/Cvc$Validated;", "Lcom/stripe/android/cards/Cvc;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "copy", "copy$payments_core_release", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Validated extends Cvc {
        public static final int $stable = 0;
        private final String value;

        public static /* synthetic */ Validated copy$payments_core_release$default(Validated validated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.value;
            }
            return validated.copy$payments_core_release(str);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Validated copy$payments_core_release(String value) {
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

        public final String getValue$payments_core_release() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* compiled from: Cvc.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/cards/Cvc$Companion;", "", "<init>", "()V", "COMMON_LENGTH", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
