package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.wallet.PaymentDetailsNicknameKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.LinkPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.TransformToBankIcon;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodsUiExtension.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0002\u0010\n\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\tH\u0001\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\tH\u0001\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\tH\u0003\u001a\f\u0010\u0012\u001a\u00020\u0001*\u00020\tH\u0003\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\tH\u0003\u001a#\u0010\u0014\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\u0010\u0018\u001a5\u0010\u0019\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u0004H\u0000\u001a\u0013\u0010!\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\"\u001a\u000e\u0010&\u001a\u0004\u0018\u00010\u001f*\u00020\u0002H\u0000\u001a\u0014\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0000\"\u0018\u0010#\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"getSavedPaymentMethodIcon", "", "Lcom/stripe/android/model/PaymentMethod;", "forVerticalMode", "", "showNightIcon", "(Lcom/stripe/android/model/PaymentMethod;ZLjava/lang/Boolean;)I", "Lcom/stripe/android/model/PaymentMethod$Card;", "(Lcom/stripe/android/model/PaymentMethod$Card;ZLjava/lang/Boolean;)I", "Lcom/stripe/android/model/CardBrand;", "(Lcom/stripe/android/model/CardBrand;ZLjava/lang/Boolean;)I", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;ZLjava/lang/Boolean;)I", "getCardBrandIcon", "getCardBrandIconForVerticalMode", "getCardBrandIconForHorizontalMode", "(Lcom/stripe/android/model/CardBrand;Ljava/lang/Boolean;)I", "getCardBrandIconRef", "getNightIcon", "getDayIcon", "getLinkIcon", "iconOnly", "(Ljava/lang/Boolean;Z)I", "getSepaIcon", "(Ljava/lang/Boolean;)I", "getOverridableIcon", "systemThemeAwareIconRef", "nightIcon", "dayIcon", "(Ljava/lang/Boolean;III)I", "getLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "canShowSublabel", "getLabelIcon", "(Lcom/stripe/android/model/PaymentMethod;Landroidx/compose/runtime/Composer;I)Ljava/lang/Integer;", "shouldTintLabelIcon", "getShouldTintLabelIcon", "(Lcom/stripe/android/model/PaymentMethod;)Z", "getSublabel", "createCardLabel", "last4", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodsUiExtensionKt {

    /* compiled from: PaymentMethodsUiExtension.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Link.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardBrand.values().length];
            try {
                iArr2[CardBrand.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardBrand.AmericanExpress.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CardBrand.Discover.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CardBrand.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardBrand.DinersClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardBrand.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardBrand.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardBrand.CartesBancaires.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CardBrand.Unknown.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IconStyle.values().length];
            try {
                iArr3[IconStyle.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[IconStyle.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ int getSavedPaymentMethodIcon$default(PaymentMethod paymentMethod, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return getSavedPaymentMethodIcon(paymentMethod, z, bool);
    }

    public static final int getSavedPaymentMethodIcon(PaymentMethod paymentMethod, boolean z, Boolean bool) {
        int iInvoke$default;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        Integer numValueOf = null;
        if (i != 1) {
            if (i == 2) {
                numValueOf = Integer.valueOf(getSepaIcon(bool));
            } else if (i == 3) {
                if (paymentMethod.isLinkPassthroughMode()) {
                    iInvoke$default = getLinkIcon(bool, z);
                } else {
                    TransformToBankIcon transformToBankIcon = TransformToBankIcon.INSTANCE;
                    PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
                    iInvoke$default = TransformToBankIcon.invoke$default(transformToBankIcon, uSBankAccount != null ? uSBankAccount.bankName : null, 0, 2, null);
                }
                numValueOf = Integer.valueOf(iInvoke$default);
            } else if (i == 4) {
                numValueOf = Integer.valueOf(getLinkIcon(bool, z));
            }
        } else if (paymentMethod.isLinkPaymentMethod() || paymentMethod.isLinkPassthroughMode()) {
            numValueOf = Integer.valueOf(getLinkIcon(bool, z));
        } else {
            PaymentMethod.Card card = paymentMethod.card;
            if (card != null) {
                numValueOf = Integer.valueOf(getSavedPaymentMethodIcon(card, z, bool));
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return R.drawable.stripe_ic_paymentsheet_card_unknown_ref;
    }

    public static /* synthetic */ int getSavedPaymentMethodIcon$default(PaymentMethod.Card card, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return getSavedPaymentMethodIcon(card, z, bool);
    }

    public static final int getSavedPaymentMethodIcon(PaymentMethod.Card card, boolean z, Boolean bool) {
        CardBrand cardBrandFromCode;
        if (card != null) {
            cardBrandFromCode = CardBrand.INSTANCE.fromCode(card.displayBrand);
            if (cardBrandFromCode == CardBrand.Unknown) {
                cardBrandFromCode = null;
            }
            if (cardBrandFromCode == null) {
                cardBrandFromCode = card.brand;
            }
        } else {
            cardBrandFromCode = CardBrand.Unknown;
        }
        return getSavedPaymentMethodIcon(cardBrandFromCode, z, bool);
    }

    static /* synthetic */ int getSavedPaymentMethodIcon$default(CardBrand cardBrand, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return getSavedPaymentMethodIcon(cardBrand, z, bool);
    }

    private static final int getSavedPaymentMethodIcon(CardBrand cardBrand, boolean z, Boolean bool) {
        if (z) {
            return getCardBrandIconForVerticalMode(cardBrand);
        }
        return getCardBrandIconForHorizontalMode(cardBrand, bool);
    }

    public static /* synthetic */ int getSavedPaymentMethodIcon$default(EditCardPayload editCardPayload, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return getSavedPaymentMethodIcon(editCardPayload, z, bool);
    }

    public static final int getSavedPaymentMethodIcon(EditCardPayload editCardPayload, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(editCardPayload, "<this>");
        if (z) {
            return getCardBrandIconForVerticalMode(editCardPayload.getCardBrand());
        }
        return getCardBrandIconForHorizontalMode(editCardPayload.getCardBrand(), bool);
    }

    public static final int getCardBrandIcon(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "<this>");
        return getCardBrandIconRef(cardBrand);
    }

    public static final int getCardBrandIconForVerticalMode(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return com.stripe.payments.model.R.drawable.stripe_ic_visa_unpadded;
            case 2:
                return com.stripe.payments.model.R.drawable.stripe_ic_amex_unpadded;
            case 3:
                return com.stripe.payments.model.R.drawable.stripe_ic_discover_unpadded;
            case 4:
                return com.stripe.payments.model.R.drawable.stripe_ic_jcb_unpadded;
            case 5:
                return com.stripe.payments.model.R.drawable.stripe_ic_diners_unpadded;
            case 6:
                return com.stripe.payments.model.R.drawable.stripe_ic_mastercard_unpadded;
            case 7:
                return com.stripe.payments.model.R.drawable.stripe_ic_unionpay_unpadded;
            case 8:
                return com.stripe.payments.model.R.drawable.stripe_ic_cartes_bancaires_unpadded;
            case 9:
                return com.stripe.payments.model.R.drawable.stripe_ic_unknown_brand_unpadded;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ int getCardBrandIconForHorizontalMode$default(CardBrand cardBrand, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return getCardBrandIconForHorizontalMode(cardBrand, bool);
    }

    public static final int getCardBrandIconForHorizontalMode(CardBrand cardBrand, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardBrand, "<this>");
        return getOverridableIcon(bool, getCardBrandIconRef(cardBrand), getNightIcon(cardBrand), getDayIcon(cardBrand));
    }

    private static final int getCardBrandIconRef(CardBrand cardBrand) {
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return R.drawable.stripe_ic_paymentsheet_card_visa_ref;
            case 2:
                return R.drawable.stripe_ic_paymentsheet_card_amex_ref;
            case 3:
                return R.drawable.stripe_ic_paymentsheet_card_discover_ref;
            case 4:
                return R.drawable.stripe_ic_paymentsheet_card_jcb_ref;
            case 5:
                return R.drawable.stripe_ic_paymentsheet_card_dinersclub_ref;
            case 6:
                return R.drawable.stripe_ic_paymentsheet_card_mastercard_ref;
            case 7:
                return R.drawable.stripe_ic_paymentsheet_card_unionpay_ref;
            case 8:
                return R.drawable.stripe_ic_paymentsheet_card_cartes_bancaires_ref;
            case 9:
                return R.drawable.stripe_ic_paymentsheet_card_unknown_ref;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int getNightIcon(CardBrand cardBrand) {
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return R.drawable.stripe_ic_paymentsheet_card_visa_night;
            case 2:
                return R.drawable.stripe_ic_paymentsheet_card_amex_night;
            case 3:
                return R.drawable.stripe_ic_paymentsheet_card_discover_night;
            case 4:
                return R.drawable.stripe_ic_paymentsheet_card_jcb_night;
            case 5:
                return R.drawable.stripe_ic_paymentsheet_card_dinersclub_night;
            case 6:
                return R.drawable.stripe_ic_paymentsheet_card_mastercard_night;
            case 7:
                return R.drawable.stripe_ic_paymentsheet_card_unionpay_night;
            case 8:
                return R.drawable.stripe_ic_paymentsheet_card_cartes_bancaires_night;
            case 9:
                return R.drawable.stripe_ic_paymentsheet_card_unknown_night;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int getDayIcon(CardBrand cardBrand) {
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return R.drawable.stripe_ic_paymentsheet_card_visa_day;
            case 2:
                return R.drawable.stripe_ic_paymentsheet_card_amex_day;
            case 3:
                return R.drawable.stripe_ic_paymentsheet_card_discover_day;
            case 4:
                return R.drawable.stripe_ic_paymentsheet_card_jcb_day;
            case 5:
                return R.drawable.stripe_ic_paymentsheet_card_dinersclub_day;
            case 6:
                return R.drawable.stripe_ic_paymentsheet_card_mastercard_day;
            case 7:
                return R.drawable.stripe_ic_paymentsheet_card_unionpay_day;
            case 8:
                return R.drawable.stripe_ic_paymentsheet_card_cartes_bancaires_day;
            case 9:
                return R.drawable.stripe_ic_paymentsheet_card_unknown_day;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ int getLinkIcon$default(Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return getLinkIcon(bool, z);
    }

    public static final int getLinkIcon(Boolean bool, boolean z) {
        if (z) {
            return R.drawable.stripe_ic_paymentsheet_link_arrow;
        }
        return getOverridableIcon(bool, R.drawable.stripe_ic_paymentsheet_link_ref, R.drawable.stripe_ic_paymentsheet_link_night, R.drawable.stripe_ic_paymentsheet_link_day);
    }

    public static /* synthetic */ int getSepaIcon$default(Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return getSepaIcon(bool);
    }

    public static final int getSepaIcon(Boolean bool) {
        return getOverridableIcon(bool, R.drawable.stripe_ic_paymentsheet_sepa_ref, R.drawable.stripe_ic_paymentsheet_sepa_night, R.drawable.stripe_ic_paymentsheet_sepa_day);
    }

    private static final int getOverridableIcon(Boolean bool, int i, int i2, int i3) {
        return bool == null ? i : bool.booleanValue() ? i2 : i3;
    }

    public static final ResolvableString getLabel(PaymentMethod paymentMethod, boolean z) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (paymentMethod.isLinkPassthroughMode()) {
                if (z) {
                    return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link);
                }
                PaymentMethod.Card card = paymentMethod.card;
                return createCardLabel(card != null ? card.last4 : null);
            }
            if (!paymentMethod.isLinkPaymentMethod()) {
                PaymentMethod.Card card2 = paymentMethod.card;
                return createCardLabel(card2 != null ? card2.last4 : null);
            }
            if (z) {
                LinkPaymentDetails linkPaymentDetails = paymentMethod.getLinkPaymentDetails();
                if (linkPaymentDetails != null) {
                    return PaymentDetailsNicknameKt.getLabel(linkPaymentDetails);
                }
                return null;
            }
            LinkPaymentDetails linkPaymentDetails2 = paymentMethod.getLinkPaymentDetails();
            if (linkPaymentDetails2 != null) {
                return PaymentDetailsNicknameKt.getSublabel(linkPaymentDetails2);
            }
            return null;
        }
        if (i == 2) {
            int i2 = R.string.stripe_paymentsheet_payment_method_item_card_number;
            PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
            return ResolvableStringUtilsKt.resolvableString$default(i2, new Object[]{sepaDebit != null ? sepaDebit.last4 : null}, null, 4, null);
        }
        if (i == 3) {
            if (paymentMethod.isLinkPassthroughMode() && z) {
                return ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_link);
            }
            int i3 = R.string.stripe_paymentsheet_payment_method_item_card_number;
            PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
            return ResolvableStringUtilsKt.resolvableString$default(i3, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
        }
        if (i != 4) {
            return null;
        }
        if (z) {
            LinkPaymentDetails linkPaymentDetails3 = paymentMethod.getLinkPaymentDetails();
            if (linkPaymentDetails3 != null) {
                return PaymentDetailsNicknameKt.getLabel(linkPaymentDetails3);
            }
            return null;
        }
        LinkPaymentDetails linkPaymentDetails4 = paymentMethod.getLinkPaymentDetails();
        if (linkPaymentDetails4 != null) {
            return PaymentDetailsNicknameKt.getSublabel(linkPaymentDetails4);
        }
        return null;
    }

    public static /* synthetic */ ResolvableString getLabel$default(PaymentMethod paymentMethod, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getLabel(paymentMethod, z);
    }

    public static final Integer getLabelIcon(PaymentMethod paymentMethod, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        composer.startReplaceGroup(1602795198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1602795198, i, -1, "com.stripe.android.paymentsheet.ui.getLabelIcon (PaymentMethodsUiExtension.kt:262)");
        }
        ProvidableCompositionLocal<IconStyle> localIconStyle = StripeThemeKt.getLocalIconStyle();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localIconStyle);
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i3 = WhenMappings.$EnumSwitchMapping$2[((IconStyle) objConsume).ordinal()];
        if (i3 == 1) {
            i2 = R.drawable.stripe_ic_paymentsheet_bank;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = com.stripe.android.ui.core.R.drawable.stripe_ic_paymentsheet_pm_bank_outlined;
        }
        PaymentMethod.Type type = paymentMethod.type;
        int i4 = type != null ? WhenMappings.$EnumSwitchMapping$0[type.ordinal()] : -1;
        Integer numValueOf = null;
        if (i4 == 1) {
            LinkPaymentDetails linkPaymentDetails = paymentMethod.getLinkPaymentDetails();
            if (linkPaymentDetails instanceof LinkPaymentDetails.BankAccount) {
                numValueOf = Integer.valueOf(i2);
            } else if (!(linkPaymentDetails instanceof LinkPaymentDetails.Card) && linkPaymentDetails != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i4 == 3) {
            numValueOf = Integer.valueOf(i2);
        } else if (i4 == 4) {
            LinkPaymentDetails linkPaymentDetails2 = paymentMethod.getLinkPaymentDetails();
            if (linkPaymentDetails2 instanceof LinkPaymentDetails.BankAccount) {
                numValueOf = Integer.valueOf(i2);
            } else if (!(linkPaymentDetails2 instanceof LinkPaymentDetails.Card) && linkPaymentDetails2 != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return numValueOf;
    }

    public static final boolean getShouldTintLabelIcon(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        return (paymentMethod.type == PaymentMethod.Type.Link || paymentMethod.isLinkPassthroughMode()) ? false : true;
    }

    public static final ResolvableString getSublabel(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "<this>");
        if (paymentMethod.getLinkPaymentDetails() != null) {
            LinkPaymentDetails linkPaymentDetails = paymentMethod.getLinkPaymentDetails();
            if (linkPaymentDetails != null) {
                return PaymentDetailsNicknameKt.getSublabel(linkPaymentDetails);
            }
            return null;
        }
        if (!paymentMethod.isLinkPassthroughMode()) {
            return null;
        }
        PaymentMethod.Type type = paymentMethod.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            PaymentMethod.Card card = paymentMethod.card;
            return createCardLabel(card != null ? card.last4 : null);
        }
        if (i != 3) {
            return null;
        }
        int i2 = R.string.stripe_paymentsheet_payment_method_item_card_number;
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        return ResolvableStringUtilsKt.resolvableString$default(i2, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
    }

    public static final ResolvableString createCardLabel(String str) {
        if (str != null) {
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_payment_method_item_card_number, new Object[]{str}, null, 4, null);
        }
        return null;
    }
}
