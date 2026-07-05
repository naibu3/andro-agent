package com.stripe.android.common.validation;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CustomerSessionClientSecretValidator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;", "", "<init>", "()V", "EPHEMERAL_KEY_SECRET_PREFIX", "", "CUSTOMER_SESSION_CLIENT_SECRET_KEY_PREFIX", "validate", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "customerSessionClientSecret", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSessionClientSecretValidator {
    public static final int $stable = 0;
    private static final String CUSTOMER_SESSION_CLIENT_SECRET_KEY_PREFIX = "cuss_";
    private static final String EPHEMERAL_KEY_SECRET_PREFIX = "ek_";
    public static final CustomerSessionClientSecretValidator INSTANCE = new CustomerSessionClientSecretValidator();

    private CustomerSessionClientSecretValidator() {
    }

    /* compiled from: CustomerSessionClientSecretValidator.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "", "Valid", "Error", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$Empty;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$LegacyEphemeralKey;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$UnknownKey;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Valid;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* compiled from: CustomerSessionClientSecretValidator.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Valid;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Valid implements Result {
            public static final int $stable = 0;
            public static final Valid INSTANCE = new Valid();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Valid)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1106243723;
            }

            public String toString() {
                return "Valid";
            }

            private Valid() {
            }
        }

        /* compiled from: CustomerSessionClientSecretValidator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "Empty", "LegacyEphemeralKey", "UnknownKey", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Error extends Result {

            /* compiled from: CustomerSessionClientSecretValidator.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$Empty;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Empty implements Result {
                public static final int $stable = 0;
                public static final Empty INSTANCE = new Empty();

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Empty)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 308932224;
                }

                public String toString() {
                    return "Empty";
                }

                private Empty() {
                }
            }

            /* compiled from: CustomerSessionClientSecretValidator.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$LegacyEphemeralKey;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class LegacyEphemeralKey implements Result {
                public static final int $stable = 0;
                public static final LegacyEphemeralKey INSTANCE = new LegacyEphemeralKey();

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LegacyEphemeralKey)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return 1782419352;
                }

                public String toString() {
                    return "LegacyEphemeralKey";
                }

                private LegacyEphemeralKey() {
                }
            }

            /* compiled from: CustomerSessionClientSecretValidator.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$UnknownKey;", "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class UnknownKey implements Result {
                public static final int $stable = 0;
                public static final UnknownKey INSTANCE = new UnknownKey();

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnknownKey)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return -1933116318;
                }

                public String toString() {
                    return "UnknownKey";
                }

                private UnknownKey() {
                }
            }
        }
    }

    public final Result validate(String customerSessionClientSecret) {
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        if (StringsKt.isBlank(customerSessionClientSecret)) {
            return Result.Error.Empty.INSTANCE;
        }
        if (StringsKt.startsWith$default(customerSessionClientSecret, EPHEMERAL_KEY_SECRET_PREFIX, false, 2, (Object) null)) {
            return Result.Error.LegacyEphemeralKey.INSTANCE;
        }
        if (!StringsKt.startsWith$default(customerSessionClientSecret, CUSTOMER_SESSION_CLIENT_SECRET_KEY_PREFIX, false, 2, (Object) null)) {
            return Result.Error.UnknownKey.INSTANCE;
        }
        return Result.Valid.INSTANCE;
    }
}
