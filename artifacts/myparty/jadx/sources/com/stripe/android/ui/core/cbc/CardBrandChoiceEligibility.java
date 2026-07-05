package com.stripe.android.ui.core.cbc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandChoiceEligibility.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "Landroid/os/Parcelable;", "Eligible", "Ineligible", "Companion", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CardBrandChoiceEligibility extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: CardBrandChoiceEligibility.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "<init>", "(Ljava/util/List;)V", "getPreferredNetworks", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Eligible implements CardBrandChoiceEligibility {
        private final List<CardBrand> preferredNetworks;
        public static final Parcelable.Creator<Eligible> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CardBrandChoiceEligibility.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Eligible> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Eligible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CardBrand.valueOf(parcel.readString()));
                }
                return new Eligible(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Eligible[] newArray(int i) {
                return new Eligible[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Eligible copy$default(Eligible eligible, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eligible.preferredNetworks;
            }
            return eligible.copy(list);
        }

        public final List<CardBrand> component1() {
            return this.preferredNetworks;
        }

        public final Eligible copy(List<? extends CardBrand> preferredNetworks) {
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            return new Eligible(preferredNetworks);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Eligible) && Intrinsics.areEqual(this.preferredNetworks, ((Eligible) other).preferredNetworks);
        }

        public int hashCode() {
            return this.preferredNetworks.hashCode();
        }

        public String toString() {
            return "Eligible(preferredNetworks=" + this.preferredNetworks + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<CardBrand> list = this.preferredNetworks;
            dest.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Eligible(List<? extends CardBrand> preferredNetworks) {
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            this.preferredNetworks = preferredNetworks;
        }

        public final List<CardBrand> getPreferredNetworks() {
            return this.preferredNetworks;
        }
    }

    /* compiled from: CardBrandChoiceEligibility.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ineligible implements CardBrandChoiceEligibility {
        public static final Ineligible INSTANCE = new Ineligible();
        public static final Parcelable.Creator<Ineligible> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CardBrandChoiceEligibility.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ineligible> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ineligible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ineligible.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ineligible[] newArray(int i) {
                return new Ineligible[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Ineligible() {
        }
    }

    /* compiled from: CardBrandChoiceEligibility.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "isEligible", "", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CardBrandChoiceEligibility create(boolean isEligible, List<? extends CardBrand> preferredNetworks) {
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            if (isEligible) {
                return new Eligible(preferredNetworks);
            }
            if (isEligible) {
                throw new NoWhenBranchMatchedException();
            }
            return Ineligible.INSTANCE;
        }
    }
}
