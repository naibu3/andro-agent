package com.stripe.android.paymentsheet.model;

import com.facebook.appevents.AppEventsConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GooglePayButtonType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Buy", "Book", "Checkout", AppEventsConstants.EVENT_NAME_DONATE, "Order", "Pay", AppEventsConstants.EVENT_NAME_SUBSCRIBE, "Plain", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GooglePayButtonType[] $VALUES;
    public static final GooglePayButtonType Buy = new GooglePayButtonType("Buy", 0);
    public static final GooglePayButtonType Book = new GooglePayButtonType("Book", 1);
    public static final GooglePayButtonType Checkout = new GooglePayButtonType("Checkout", 2);
    public static final GooglePayButtonType Donate = new GooglePayButtonType(AppEventsConstants.EVENT_NAME_DONATE, 3);
    public static final GooglePayButtonType Order = new GooglePayButtonType("Order", 4);
    public static final GooglePayButtonType Pay = new GooglePayButtonType("Pay", 5);
    public static final GooglePayButtonType Subscribe = new GooglePayButtonType(AppEventsConstants.EVENT_NAME_SUBSCRIBE, 6);
    public static final GooglePayButtonType Plain = new GooglePayButtonType("Plain", 7);

    private static final /* synthetic */ GooglePayButtonType[] $values() {
        return new GooglePayButtonType[]{Buy, Book, Checkout, Donate, Order, Pay, Subscribe, Plain};
    }

    public static EnumEntries<GooglePayButtonType> getEntries() {
        return $ENTRIES;
    }

    private GooglePayButtonType(String str, int i) {
    }

    static {
        GooglePayButtonType[] googlePayButtonTypeArr$values = $values();
        $VALUES = googlePayButtonTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(googlePayButtonTypeArr$values);
    }

    public static GooglePayButtonType valueOf(String str) {
        return (GooglePayButtonType) Enum.valueOf(GooglePayButtonType.class, str);
    }

    public static GooglePayButtonType[] values() {
        return (GooglePayButtonType[]) $VALUES.clone();
    }
}
