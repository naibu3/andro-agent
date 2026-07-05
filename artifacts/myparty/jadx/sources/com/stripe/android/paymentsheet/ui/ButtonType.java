package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.AppEventsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GooglePayButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/ButtonType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Book", "Buy", "Checkout", AppEventsConstants.EVENT_NAME_DONATE, "Order", "Pay", "Plain", AppEventsConstants.EVENT_NAME_SUBSCRIBE, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType Book = new ButtonType("Book", 0, 2);
    public static final ButtonType Buy = new ButtonType("Buy", 1, 1);
    public static final ButtonType Checkout = new ButtonType("Checkout", 2, 3);
    public static final ButtonType Donate = new ButtonType(AppEventsConstants.EVENT_NAME_DONATE, 3, 4);
    public static final ButtonType Order = new ButtonType("Order", 4, 5);
    public static final ButtonType Pay = new ButtonType("Pay", 5, 6);
    public static final ButtonType Plain = new ButtonType("Plain", 6, 8);
    public static final ButtonType Subscribe = new ButtonType(AppEventsConstants.EVENT_NAME_SUBSCRIBE, 7, 7);
    private final int value;

    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{Book, Buy, Checkout, Donate, Order, Pay, Plain, Subscribe};
    }

    public static EnumEntries<ButtonType> getEntries() {
        return $ENTRIES;
    }

    private ButtonType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ButtonType[] buttonTypeArr$values = $values();
        $VALUES = buttonTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buttonTypeArr$values);
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
