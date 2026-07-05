package com.stripe.android.link.ui.signup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignUpState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/ui/signup/SignUpState;", "", "<init>", "(Ljava/lang/String;I)V", "InputtingPrimaryField", "VerifyingEmail", "InputtingRemainingFields", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignUpState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SignUpState[] $VALUES;
    public static final SignUpState InputtingPrimaryField = new SignUpState("InputtingPrimaryField", 0);
    public static final SignUpState VerifyingEmail = new SignUpState("VerifyingEmail", 1);
    public static final SignUpState InputtingRemainingFields = new SignUpState("InputtingRemainingFields", 2);

    private static final /* synthetic */ SignUpState[] $values() {
        return new SignUpState[]{InputtingPrimaryField, VerifyingEmail, InputtingRemainingFields};
    }

    public static EnumEntries<SignUpState> getEntries() {
        return $ENTRIES;
    }

    private SignUpState(String str, int i) {
    }

    static {
        SignUpState[] signUpStateArr$values = $values();
        $VALUES = signUpStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(signUpStateArr$values);
    }

    public static SignUpState valueOf(String str) {
        return (SignUpState) Enum.valueOf(SignUpState.class, str);
    }

    public static SignUpState[] values() {
        return (SignUpState[]) $VALUES.clone();
    }
}
