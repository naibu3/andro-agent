package com.stripe.android.link.ui.inline;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignUpConsentAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "", "<init>", "(Ljava/lang/String;I)V", "Checkbox", "CheckboxWithPrefilledEmail", "CheckboxWithPrefilledEmailAndPhone", "Implied", "ImpliedWithPrefilledEmail", "DefaultOptInWithAllPrefilled", "DefaultOptInWithSomePrefilled", "DefaultOptInWithNonePrefilled", "SignUpOptInMobileChecked", "SignUpOptInMobilePrechecked", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignUpConsentAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SignUpConsentAction[] $VALUES;
    public static final SignUpConsentAction Checkbox = new SignUpConsentAction("Checkbox", 0);
    public static final SignUpConsentAction CheckboxWithPrefilledEmail = new SignUpConsentAction("CheckboxWithPrefilledEmail", 1);
    public static final SignUpConsentAction CheckboxWithPrefilledEmailAndPhone = new SignUpConsentAction("CheckboxWithPrefilledEmailAndPhone", 2);
    public static final SignUpConsentAction Implied = new SignUpConsentAction("Implied", 3);
    public static final SignUpConsentAction ImpliedWithPrefilledEmail = new SignUpConsentAction("ImpliedWithPrefilledEmail", 4);
    public static final SignUpConsentAction DefaultOptInWithAllPrefilled = new SignUpConsentAction("DefaultOptInWithAllPrefilled", 5);
    public static final SignUpConsentAction DefaultOptInWithSomePrefilled = new SignUpConsentAction("DefaultOptInWithSomePrefilled", 6);
    public static final SignUpConsentAction DefaultOptInWithNonePrefilled = new SignUpConsentAction("DefaultOptInWithNonePrefilled", 7);
    public static final SignUpConsentAction SignUpOptInMobileChecked = new SignUpConsentAction("SignUpOptInMobileChecked", 8);
    public static final SignUpConsentAction SignUpOptInMobilePrechecked = new SignUpConsentAction("SignUpOptInMobilePrechecked", 9);

    private static final /* synthetic */ SignUpConsentAction[] $values() {
        return new SignUpConsentAction[]{Checkbox, CheckboxWithPrefilledEmail, CheckboxWithPrefilledEmailAndPhone, Implied, ImpliedWithPrefilledEmail, DefaultOptInWithAllPrefilled, DefaultOptInWithSomePrefilled, DefaultOptInWithNonePrefilled, SignUpOptInMobileChecked, SignUpOptInMobilePrechecked};
    }

    public static EnumEntries<SignUpConsentAction> getEntries() {
        return $ENTRIES;
    }

    private SignUpConsentAction(String str, int i) {
    }

    static {
        SignUpConsentAction[] signUpConsentActionArr$values = $values();
        $VALUES = signUpConsentActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(signUpConsentActionArr$values);
    }

    public static SignUpConsentAction valueOf(String str) {
        return (SignUpConsentAction) Enum.valueOf(SignUpConsentAction.class, str);
    }

    public static SignUpConsentAction[] values() {
        return (SignUpConsentAction[]) $VALUES.clone();
    }
}
