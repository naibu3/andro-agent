package com.google.pay.button;

import com.facebook.appevents.AppEventsConstants;
import kotlin.Metadata;

/* compiled from: PayButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/pay/button/ButtonType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Book", "Buy", "Checkout", AppEventsConstants.EVENT_NAME_DONATE, "Order", "Pay", "Plain", AppEventsConstants.EVENT_NAME_SUBSCRIBE, "compose-pay-button_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public enum ButtonType {
    Book(2),
    Buy(1),
    Checkout(3),
    Donate(4),
    Order(5),
    Pay(6),
    Plain(8),
    Subscribe(7);

    private final int value;

    ButtonType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
