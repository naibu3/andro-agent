package com.stripe.android.paymentsheet.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GooglePayButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/ButtonTheme;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Dark", "Light", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ButtonTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonTheme[] $VALUES;
    public static final ButtonTheme Dark = new ButtonTheme("Dark", 0, 1);
    public static final ButtonTheme Light = new ButtonTheme("Light", 1, 2);
    private final int value;

    private static final /* synthetic */ ButtonTheme[] $values() {
        return new ButtonTheme[]{Dark, Light};
    }

    public static EnumEntries<ButtonTheme> getEntries() {
        return $ENTRIES;
    }

    private ButtonTheme(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ButtonTheme[] buttonThemeArr$values = $values();
        $VALUES = buttonThemeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buttonThemeArr$values);
    }

    public static ButtonTheme valueOf(String str) {
        return (ButtonTheme) Enum.valueOf(ButtonTheme.class, str);
    }

    public static ButtonTheme[] values() {
        return (ButtonTheme[]) $VALUES.clone();
    }
}
