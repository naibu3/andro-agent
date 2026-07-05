package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandChoiceConfig.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;", "", "Eligible", "Ineligible", "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;", "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CardBrandChoiceConfig {

    /* compiled from: CardBrandChoiceConfig.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;", "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;", "preferredBrands", "", "Lcom/stripe/android/model/CardBrand;", "initialBrand", "<init>", "(Ljava/util/List;Lcom/stripe/android/model/CardBrand;)V", "getPreferredBrands", "()Ljava/util/List;", "getInitialBrand", "()Lcom/stripe/android/model/CardBrand;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Eligible implements CardBrandChoiceConfig {
        public static final int $stable = 8;
        private final CardBrand initialBrand;
        private final List<CardBrand> preferredBrands;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Eligible copy$default(Eligible eligible, List list, CardBrand cardBrand, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eligible.preferredBrands;
            }
            if ((i & 2) != 0) {
                cardBrand = eligible.initialBrand;
            }
            return eligible.copy(list, cardBrand);
        }

        public final List<CardBrand> component1() {
            return this.preferredBrands;
        }

        /* renamed from: component2, reason: from getter */
        public final CardBrand getInitialBrand() {
            return this.initialBrand;
        }

        public final Eligible copy(List<? extends CardBrand> preferredBrands, CardBrand initialBrand) {
            Intrinsics.checkNotNullParameter(preferredBrands, "preferredBrands");
            return new Eligible(preferredBrands, initialBrand);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) other;
            return Intrinsics.areEqual(this.preferredBrands, eligible.preferredBrands) && this.initialBrand == eligible.initialBrand;
        }

        public int hashCode() {
            int iHashCode = this.preferredBrands.hashCode() * 31;
            CardBrand cardBrand = this.initialBrand;
            return iHashCode + (cardBrand == null ? 0 : cardBrand.hashCode());
        }

        public String toString() {
            return "Eligible(preferredBrands=" + this.preferredBrands + ", initialBrand=" + this.initialBrand + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Eligible(List<? extends CardBrand> preferredBrands, CardBrand cardBrand) {
            Intrinsics.checkNotNullParameter(preferredBrands, "preferredBrands");
            this.preferredBrands = preferredBrands;
            this.initialBrand = cardBrand;
        }

        public final List<CardBrand> getPreferredBrands() {
            return this.preferredBrands;
        }

        public final CardBrand getInitialBrand() {
            return this.initialBrand;
        }
    }

    /* compiled from: CardBrandChoiceConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;", "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;", "<init>", "()V", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ineligible implements CardBrandChoiceConfig {
        public static final int $stable = 0;
        public static final Ineligible INSTANCE = new Ineligible();

        private Ineligible() {
        }
    }
}
