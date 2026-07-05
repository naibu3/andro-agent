package com.stripe.android.lpmfoundations.paymentmethod;

import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetCardBrandFilter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toBrandCategory", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "Lcom/stripe/android/model/CardBrand;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentSheetCardBrandFilterKt {

    /* compiled from: PaymentSheetCardBrandFilter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.MasterCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardBrand.AmericanExpress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardBrand.Discover.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardBrand.DinersClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardBrand.JCB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardBrand.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PaymentSheet.CardBrandAcceptance.BrandCategory toBrandCategory(CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cardBrand, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[cardBrand.ordinal()]) {
            case 1:
                return PaymentSheet.CardBrandAcceptance.BrandCategory.Visa;
            case 2:
                return PaymentSheet.CardBrandAcceptance.BrandCategory.Mastercard;
            case 3:
                return PaymentSheet.CardBrandAcceptance.BrandCategory.Amex;
            case 4:
            case 5:
            case 6:
            case 7:
                return PaymentSheet.CardBrandAcceptance.BrandCategory.Discover;
            default:
                return null;
        }
    }
}
