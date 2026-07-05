package com.stripe.android.customersheet;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "", "customerId", "", "ephemeralKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId$paymentsheet_release", "()Ljava/lang/String;", "getEphemeralKey$paymentsheet_release", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerEphemeralKey {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String customerId;
    private final String ephemeralKey;

    @JvmStatic
    public static final CustomerEphemeralKey create(String str, String str2) {
        return INSTANCE.create(str, str2);
    }

    public CustomerEphemeralKey(String customerId, String ephemeralKey) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        this.customerId = customerId;
        this.ephemeralKey = ephemeralKey;
    }

    /* renamed from: getCustomerId$paymentsheet_release, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: getEphemeralKey$paymentsheet_release, reason: from getter */
    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    /* compiled from: CustomerAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "customerId", "", "ephemeralKey", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CustomerEphemeralKey create(String customerId, String ephemeralKey) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
            return new CustomerEphemeralKey(customerId, ephemeralKey);
        }
    }
}
