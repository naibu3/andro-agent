package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConsumerSignUpConsentAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Checkbox", "CheckboxWithPrefilledEmail", "CheckboxWithPrefilledEmailAndPhone", "Implied", "ImpliedWithPrefilledEmail", "PrecheckedOptInBoxPrefilledAll", "PrecheckedOptInBoxPrefilledSome", "PrecheckedOptInBoxPrefilledNone", "SignUpOptInMobileChecked", "SignUpOptInMobilePrechecked", "EnteredPhoneNumberClickedSaveToLink", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerSignUpConsentAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsumerSignUpConsentAction[] $VALUES;
    private final String value;
    public static final ConsumerSignUpConsentAction Checkbox = new ConsumerSignUpConsentAction("Checkbox", 0, "clicked_checkbox_nospm_mobile_v0");
    public static final ConsumerSignUpConsentAction CheckboxWithPrefilledEmail = new ConsumerSignUpConsentAction("CheckboxWithPrefilledEmail", 1, "clicked_checkbox_nospm_mobile_v0_0");
    public static final ConsumerSignUpConsentAction CheckboxWithPrefilledEmailAndPhone = new ConsumerSignUpConsentAction("CheckboxWithPrefilledEmailAndPhone", 2, "clicked_checkbox_nospm_mobile_v0_1");
    public static final ConsumerSignUpConsentAction Implied = new ConsumerSignUpConsentAction("Implied", 3, "implied_consent_withspm_mobile_v0");
    public static final ConsumerSignUpConsentAction ImpliedWithPrefilledEmail = new ConsumerSignUpConsentAction("ImpliedWithPrefilledEmail", 4, "implied_consent_withspm_mobile_v0_0");
    public static final ConsumerSignUpConsentAction PrecheckedOptInBoxPrefilledAll = new ConsumerSignUpConsentAction("PrecheckedOptInBoxPrefilledAll", 5, "prechecked_opt_in_box_prefilled_all");
    public static final ConsumerSignUpConsentAction PrecheckedOptInBoxPrefilledSome = new ConsumerSignUpConsentAction("PrecheckedOptInBoxPrefilledSome", 6, "prechecked_opt_in_box_prefilled_some");
    public static final ConsumerSignUpConsentAction PrecheckedOptInBoxPrefilledNone = new ConsumerSignUpConsentAction("PrecheckedOptInBoxPrefilledNone", 7, "prechecked_opt_in_box_prefilled_none");
    public static final ConsumerSignUpConsentAction SignUpOptInMobileChecked = new ConsumerSignUpConsentAction("SignUpOptInMobileChecked", 8, "sign_up_opt_in_mobile_checked");
    public static final ConsumerSignUpConsentAction SignUpOptInMobilePrechecked = new ConsumerSignUpConsentAction("SignUpOptInMobilePrechecked", 9, "sign_up_opt_in_mobile_prechecked");
    public static final ConsumerSignUpConsentAction EnteredPhoneNumberClickedSaveToLink = new ConsumerSignUpConsentAction("EnteredPhoneNumberClickedSaveToLink", 10, "entered_phone_number_clicked_save_to_link");

    private static final /* synthetic */ ConsumerSignUpConsentAction[] $values() {
        return new ConsumerSignUpConsentAction[]{Checkbox, CheckboxWithPrefilledEmail, CheckboxWithPrefilledEmailAndPhone, Implied, ImpliedWithPrefilledEmail, PrecheckedOptInBoxPrefilledAll, PrecheckedOptInBoxPrefilledSome, PrecheckedOptInBoxPrefilledNone, SignUpOptInMobileChecked, SignUpOptInMobilePrechecked, EnteredPhoneNumberClickedSaveToLink};
    }

    public static EnumEntries<ConsumerSignUpConsentAction> getEntries() {
        return $ENTRIES;
    }

    private ConsumerSignUpConsentAction(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        ConsumerSignUpConsentAction[] consumerSignUpConsentActionArr$values = $values();
        $VALUES = consumerSignUpConsentActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(consumerSignUpConsentActionArr$values);
    }

    public static ConsumerSignUpConsentAction valueOf(String str) {
        return (ConsumerSignUpConsentAction) Enum.valueOf(ConsumerSignUpConsentAction.class, str);
    }

    public static ConsumerSignUpConsentAction[] values() {
        return (ConsumerSignUpConsentAction[]) $VALUES.clone();
    }
}
