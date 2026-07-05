package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethod;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayableSavedPaymentMethod.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001+B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J;\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÂ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "savedPaymentMethod", "Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "isCbcEligible", "", "shouldShowDefaultBadge", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/SavedPaymentMethod;ZZ)V", "getDisplayName", "()Lcom/stripe/android/core/strings/ResolvableString;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getSavedPaymentMethod", "()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;", "()Z", "getShouldShowDefaultBadge", "isCard", "canChangeCbc", "isModifiable", "canUpdateFullPaymentMethodDetails", "getDescription", "getModifyDescription", "getRemoveDescription", "brandDisplayName", "", "isDefaultPaymentMethod", "defaultPaymentMethodId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisplayableSavedPaymentMethod {
    private final ResolvableString displayName;
    private final boolean isCbcEligible;
    private final PaymentMethod paymentMethod;
    private final SavedPaymentMethod savedPaymentMethod;
    private final boolean shouldShowDefaultBadge;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DisplayableSavedPaymentMethod(ResolvableString resolvableString, PaymentMethod paymentMethod, SavedPaymentMethod savedPaymentMethod, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, paymentMethod, savedPaymentMethod, z, z2);
    }

    private final DisplayableSavedPaymentMethod copy(ResolvableString displayName, PaymentMethod paymentMethod, SavedPaymentMethod savedPaymentMethod, boolean isCbcEligible, boolean shouldShowDefaultBadge) {
        return new DisplayableSavedPaymentMethod(displayName, paymentMethod, savedPaymentMethod, isCbcEligible, shouldShowDefaultBadge);
    }

    static /* synthetic */ DisplayableSavedPaymentMethod copy$default(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, ResolvableString resolvableString, PaymentMethod paymentMethod, SavedPaymentMethod savedPaymentMethod, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = displayableSavedPaymentMethod.displayName;
        }
        if ((i & 2) != 0) {
            paymentMethod = displayableSavedPaymentMethod.paymentMethod;
        }
        if ((i & 4) != 0) {
            savedPaymentMethod = displayableSavedPaymentMethod.savedPaymentMethod;
        }
        if ((i & 8) != 0) {
            z = displayableSavedPaymentMethod.isCbcEligible;
        }
        if ((i & 16) != 0) {
            z2 = displayableSavedPaymentMethod.shouldShowDefaultBadge;
        }
        boolean z3 = z2;
        SavedPaymentMethod savedPaymentMethod2 = savedPaymentMethod;
        return displayableSavedPaymentMethod.copy(resolvableString, paymentMethod, savedPaymentMethod2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final SavedPaymentMethod getSavedPaymentMethod() {
        return this.savedPaymentMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCbcEligible() {
        return this.isCbcEligible;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldShowDefaultBadge() {
        return this.shouldShowDefaultBadge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayableSavedPaymentMethod)) {
            return false;
        }
        DisplayableSavedPaymentMethod displayableSavedPaymentMethod = (DisplayableSavedPaymentMethod) other;
        return Intrinsics.areEqual(this.displayName, displayableSavedPaymentMethod.displayName) && Intrinsics.areEqual(this.paymentMethod, displayableSavedPaymentMethod.paymentMethod) && Intrinsics.areEqual(this.savedPaymentMethod, displayableSavedPaymentMethod.savedPaymentMethod) && this.isCbcEligible == displayableSavedPaymentMethod.isCbcEligible && this.shouldShowDefaultBadge == displayableSavedPaymentMethod.shouldShowDefaultBadge;
    }

    public int hashCode() {
        return (((((((this.displayName.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + this.savedPaymentMethod.hashCode()) * 31) + Boolean.hashCode(this.isCbcEligible)) * 31) + Boolean.hashCode(this.shouldShowDefaultBadge);
    }

    public String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.displayName + ", paymentMethod=" + this.paymentMethod + ", savedPaymentMethod=" + this.savedPaymentMethod + ", isCbcEligible=" + this.isCbcEligible + ", shouldShowDefaultBadge=" + this.shouldShowDefaultBadge + ")";
    }

    private DisplayableSavedPaymentMethod(ResolvableString resolvableString, PaymentMethod paymentMethod, SavedPaymentMethod savedPaymentMethod, boolean z, boolean z2) {
        this.displayName = resolvableString;
        this.paymentMethod = paymentMethod;
        this.savedPaymentMethod = savedPaymentMethod;
        this.isCbcEligible = z;
        this.shouldShowDefaultBadge = z2;
    }

    /* synthetic */ DisplayableSavedPaymentMethod(ResolvableString resolvableString, PaymentMethod paymentMethod, SavedPaymentMethod savedPaymentMethod, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, paymentMethod, savedPaymentMethod, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public final ResolvableString getDisplayName() {
        return this.displayName;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final SavedPaymentMethod getSavedPaymentMethod() {
        return this.savedPaymentMethod;
    }

    public final boolean isCbcEligible() {
        return this.isCbcEligible;
    }

    public final boolean getShouldShowDefaultBadge() {
        return this.shouldShowDefaultBadge;
    }

    public final boolean isCard() {
        SavedPaymentMethod savedPaymentMethod = this.savedPaymentMethod;
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            return !this.paymentMethod.isLinkPaymentMethod();
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
            return ((SavedPaymentMethod.Link) savedPaymentMethod).getPaymentDetails() instanceof LinkPaymentDetails.Card;
        }
        if ((savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) || (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) || Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean canChangeCbc() {
        Set<String> available;
        SavedPaymentMethod savedPaymentMethod = this.savedPaymentMethod;
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            PaymentMethod.Card.Networks networks = ((SavedPaymentMethod.Card) savedPaymentMethod).getCard().networks;
            return this.isCbcEligible && (networks != null && (available = networks.getAvailable()) != null && available.size() > 1);
        }
        if ((savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) || (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) || (savedPaymentMethod instanceof SavedPaymentMethod.Link) || Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isModifiable(boolean canUpdateFullPaymentMethodDetails) {
        SavedPaymentMethod savedPaymentMethod = this.savedPaymentMethod;
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            if (canUpdateFullPaymentMethodDetails) {
                return true;
            }
            return !((SavedPaymentMethod.Card) savedPaymentMethod).isExpired() && canChangeCbc();
        }
        if ((savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) || (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) || (savedPaymentMethod instanceof SavedPaymentMethod.Link) || Intrinsics.areEqual(savedPaymentMethod, SavedPaymentMethod.Unexpected.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ResolvableString getDescription() {
        SavedPaymentMethod savedPaymentMethod = this.savedPaymentMethod;
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.R.string.stripe_card_ending_in, new Object[]{brandDisplayName(), ((SavedPaymentMethod.Card) this.savedPaymentMethod).getCard().last4}, null, 4, null);
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_bank_account_ending_in, new Object[]{((SavedPaymentMethod.SepaDebit) this.savedPaymentMethod).getSepaDebit().last4}, null, 4, null);
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_bank_account_ending_in, new Object[]{((SavedPaymentMethod.USBankAccount) this.savedPaymentMethod).getUsBankAccount().last4}, null, 4, null);
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
            LinkPaymentDetails paymentDetails = ((SavedPaymentMethod.Link) savedPaymentMethod).getPaymentDetails();
            if (paymentDetails instanceof LinkPaymentDetails.BankAccount) {
                return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_bank_account_ending_in, new Object[]{((LinkPaymentDetails.BankAccount) ((SavedPaymentMethod.Link) this.savedPaymentMethod).getPaymentDetails()).getLast4()}, null, 4, null);
            }
            if (!(paymentDetails instanceof LinkPaymentDetails.Card)) {
                throw new NoWhenBranchMatchedException();
            }
            return ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.R.string.stripe_card_ending_in, new Object[]{brandDisplayName(), ((LinkPaymentDetails.Card) ((SavedPaymentMethod.Link) this.savedPaymentMethod).getPaymentDetails()).getLast4()}, null, 4, null);
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.Unexpected) {
            return ResolvableStringUtilsKt.resolvableString("", new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ResolvableString getModifyDescription() {
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_modify_pm, new Object[]{getDescription()}, null, 4, null);
    }

    public final ResolvableString getRemoveDescription() {
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_remove_pm, new Object[]{getDescription()}, null, 4, null);
    }

    public final String brandDisplayName() {
        CardBrand brand;
        CardBrand cardBrandFromCode;
        SavedPaymentMethod savedPaymentMethod = this.savedPaymentMethod;
        if (savedPaymentMethod instanceof SavedPaymentMethod.Card) {
            String str = ((SavedPaymentMethod.Card) savedPaymentMethod).getCard().displayBrand;
            if (str == null || (cardBrandFromCode = CardBrand.INSTANCE.fromCode(str)) == null) {
                cardBrandFromCode = ((SavedPaymentMethod.Card) this.savedPaymentMethod).getCard().brand;
            }
            return cardBrandFromCode.getDisplayName();
        }
        if (savedPaymentMethod instanceof SavedPaymentMethod.Link) {
            LinkPaymentDetails paymentDetails = ((SavedPaymentMethod.Link) savedPaymentMethod).getPaymentDetails();
            LinkPaymentDetails.Card card = paymentDetails instanceof LinkPaymentDetails.Card ? (LinkPaymentDetails.Card) paymentDetails : null;
            if (card == null || (brand = card.getBrand()) == null) {
                return null;
            }
            return brand.getDisplayName();
        }
        if ((savedPaymentMethod instanceof SavedPaymentMethod.USBankAccount) || (savedPaymentMethod instanceof SavedPaymentMethod.SepaDebit) || (savedPaymentMethod instanceof SavedPaymentMethod.Unexpected)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isDefaultPaymentMethod(String defaultPaymentMethodId) {
        return this.paymentMethod.id != null && Intrinsics.areEqual(this.paymentMethod.id, defaultPaymentMethodId);
    }

    /* compiled from: DisplayableSavedPaymentMethod.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "displayName", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "isCbcEligible", "", "shouldShowDefaultBadge", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: DisplayableSavedPaymentMethod.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentMethod.Type.values().length];
                try {
                    iArr[PaymentMethod.Type.Card.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PaymentMethod.Type.Link.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DisplayableSavedPaymentMethod create$default(Companion companion, ResolvableString resolvableString, PaymentMethod paymentMethod, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return companion.create(resolvableString, paymentMethod, z, z2);
        }

        public final DisplayableSavedPaymentMethod create(ResolvableString displayName, PaymentMethod paymentMethod, boolean isCbcEligible, boolean shouldShowDefaultBadge) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            PaymentMethod.Type type = paymentMethod.type;
            int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                LinkPaymentDetails linkPaymentDetails = paymentMethod.getLinkPaymentDetails();
                if (linkPaymentDetails != null) {
                    card = new SavedPaymentMethod.Link(linkPaymentDetails);
                } else {
                    PaymentMethod.Card card = paymentMethod.card;
                    if (card != null) {
                        card = new SavedPaymentMethod.Card(card, paymentMethod.billingDetails);
                    }
                }
            } else if (i == 2) {
                PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
                card = uSBankAccount != null ? new SavedPaymentMethod.USBankAccount(uSBankAccount) : null;
            } else if (i == 3) {
                PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
                card = sepaDebit != null ? new SavedPaymentMethod.SepaDebit(sepaDebit) : null;
            } else if (i == 4) {
                LinkPaymentDetails linkPaymentDetails2 = paymentMethod.getLinkPaymentDetails();
                card = linkPaymentDetails2 != null ? new SavedPaymentMethod.Link(linkPaymentDetails2) : null;
            }
            if (card == null) {
                card = SavedPaymentMethod.Unexpected.INSTANCE;
            }
            return new DisplayableSavedPaymentMethod(displayName, paymentMethod, card, isCbcEligible, shouldShowDefaultBadge, null);
        }
    }
}
