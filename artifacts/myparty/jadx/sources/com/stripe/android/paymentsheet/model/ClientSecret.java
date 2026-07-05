package com.stripe.android.paymentsheet.model;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ClientSecret.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ClientSecret;", "Landroid/os/Parcelable;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "validate", "", "Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;", "Lcom/stripe/android/paymentsheet/model/SetupIntentClientSecret;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientSecret implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ ClientSecret(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getValue();

    public abstract void validate();

    private ClientSecret() {
    }
}
