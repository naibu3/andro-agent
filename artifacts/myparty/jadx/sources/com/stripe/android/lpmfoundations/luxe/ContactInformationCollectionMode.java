package com.stripe.android.lpmfoundations.luxe;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.PhoneSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactInformationCollectionMode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001e\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH&J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Name", "Phone", "Email", "collectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "formElement", "Lcom/stripe/android/uicore/elements/FormElement;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "isAllowed", "", "isRequired", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ContactInformationCollectionMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContactInformationCollectionMode[] $VALUES;
    public static final ContactInformationCollectionMode Name = new ContactInformationCollectionMode("Name", 0) { // from class: com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode.Name
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode collectionMode(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return configuration.getName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public FormElement formElement(Map<IdentifierSpec, String> initialValues) {
            Intrinsics.checkNotNullParameter(initialValues, "initialValues");
            return new NameSpec((IdentifierSpec) null, (TranslationId) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)).transform(initialValues);
        }
    };
    public static final ContactInformationCollectionMode Phone = new ContactInformationCollectionMode("Phone", 1) { // from class: com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode.Phone
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode collectionMode(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return configuration.getPhone();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public FormElement formElement(Map<IdentifierSpec, String> initialValues) {
            Intrinsics.checkNotNullParameter(initialValues, "initialValues");
            return new PhoneSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)).transform(initialValues);
        }
    };
    public static final ContactInformationCollectionMode Email = new ContactInformationCollectionMode("Email", 2) { // from class: com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode.Email
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode collectionMode(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return configuration.getEmail();
        }

        @Override // com.stripe.android.lpmfoundations.luxe.ContactInformationCollectionMode
        public FormElement formElement(Map<IdentifierSpec, String> initialValues) {
            Intrinsics.checkNotNullParameter(initialValues, "initialValues");
            return new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null).transform(initialValues);
        }
    };

    private static final /* synthetic */ ContactInformationCollectionMode[] $values() {
        return new ContactInformationCollectionMode[]{Name, Phone, Email};
    }

    public /* synthetic */ ContactInformationCollectionMode(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ContactInformationCollectionMode> getEntries() {
        return $ENTRIES;
    }

    public abstract PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode collectionMode(PaymentSheet.BillingDetailsCollectionConfiguration configuration);

    public abstract FormElement formElement(Map<IdentifierSpec, String> initialValues);

    private ContactInformationCollectionMode(String str, int i) {
    }

    static {
        ContactInformationCollectionMode[] contactInformationCollectionModeArr$values = $values();
        $VALUES = contactInformationCollectionModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(contactInformationCollectionModeArr$values);
    }

    public final boolean isAllowed(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return collectionMode(configuration) != PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never;
    }

    public final boolean isRequired(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return collectionMode(configuration) == PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always;
    }

    public static ContactInformationCollectionMode valueOf(String str) {
        return (ContactInformationCollectionMode) Enum.valueOf(ContactInformationCollectionMode.class, str);
    }

    public static ContactInformationCollectionMode[] values() {
        return (ContactInformationCollectionMode[]) $VALUES.clone();
    }
}
