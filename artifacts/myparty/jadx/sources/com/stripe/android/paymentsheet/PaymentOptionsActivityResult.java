package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsActivityResult.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "Landroid/os/Parcelable;", "resultCode", "", "<init>", "(I)V", "getResultCode", "()I", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethods", "()Ljava/util/List;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getLinkAccountInfo", "()Lcom/stripe/android/link/LinkAccountUpdate$Value;", "toBundle", "Landroid/os/Bundle;", "Succeeded", "Canceled", "Companion", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult$Succeeded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentOptionsActivityResult implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_RESULT = "extra_activity_result";
    private final int resultCode;

    public /* synthetic */ PaymentOptionsActivityResult(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract LinkAccountUpdate.Value getLinkAccountInfo();

    public abstract List<PaymentMethod> getPaymentMethods();

    private PaymentOptionsActivityResult(int i) {
        this.resultCode = i;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    /* compiled from: PaymentOptionsActivityResult.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult$Succeeded;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/link/LinkAccountUpdate$Value;Ljava/util/List;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getLinkAccountInfo", "()Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Succeeded extends PaymentOptionsActivityResult {
        private final LinkAccountUpdate.Value linkAccountInfo;
        private final List<PaymentMethod> paymentMethods;
        private final PaymentSelection paymentSelection;
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentOptionsActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSelection paymentSelection = (PaymentSelection) parcel.readParcelable(Succeeded.class.getClassLoader());
                LinkAccountUpdate.Value valueCreateFromParcel = LinkAccountUpdate.Value.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(Succeeded.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Succeeded(paymentSelection, valueCreateFromParcel, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, PaymentSelection paymentSelection, LinkAccountUpdate.Value value, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection = succeeded.paymentSelection;
            }
            if ((i & 2) != 0) {
                value = succeeded.linkAccountInfo;
            }
            if ((i & 4) != 0) {
                list = succeeded.paymentMethods;
            }
            return succeeded.copy(paymentSelection, value, list);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        public final List<PaymentMethod> component3() {
            return this.paymentMethods;
        }

        public final Succeeded copy(PaymentSelection paymentSelection, LinkAccountUpdate.Value linkAccountInfo, List<PaymentMethod> paymentMethods) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            return new Succeeded(paymentSelection, linkAccountInfo, paymentMethods);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return Intrinsics.areEqual(this.paymentSelection, succeeded.paymentSelection) && Intrinsics.areEqual(this.linkAccountInfo, succeeded.linkAccountInfo) && Intrinsics.areEqual(this.paymentMethods, succeeded.paymentMethods);
        }

        public int hashCode() {
            int iHashCode = ((this.paymentSelection.hashCode() * 31) + this.linkAccountInfo.hashCode()) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.paymentSelection + ", linkAccountInfo=" + this.linkAccountInfo + ", paymentMethods=" + this.paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentSelection, flags);
            this.linkAccountInfo.writeToParcel(dest, flags);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public /* synthetic */ Succeeded(PaymentSelection paymentSelection, LinkAccountUpdate.Value value, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSelection, value, (i & 4) != 0 ? null : list);
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsActivityResult
        public LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsActivityResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(PaymentSelection paymentSelection, LinkAccountUpdate.Value linkAccountInfo, List<PaymentMethod> list) {
            super(-1, null);
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            this.paymentSelection = paymentSelection;
            this.linkAccountInfo = linkAccountInfo;
            this.paymentMethods = list;
        }
    }

    /* compiled from: PaymentOptionsActivityResult.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "mostRecentError", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;Lcom/stripe/android/link/LinkAccountUpdate$Value;)V", "getMostRecentError", "()Ljava/lang/Throwable;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentMethods", "()Ljava/util/List;", "getLinkAccountInfo", "()Lcom/stripe/android/link/LinkAccountUpdate$Value;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends PaymentOptionsActivityResult {
        private final LinkAccountUpdate.Value linkAccountInfo;
        private final Throwable mostRecentError;
        private final List<PaymentMethod> paymentMethods;
        private final PaymentSelection paymentSelection;
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentOptionsActivityResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                PaymentSelection paymentSelection = (PaymentSelection) parcel.readParcelable(Canceled.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(Canceled.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Canceled(th, paymentSelection, arrayList, LinkAccountUpdate.Value.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Canceled copy$default(Canceled canceled, Throwable th, PaymentSelection paymentSelection, List list, LinkAccountUpdate.Value value, int i, Object obj) {
            if ((i & 1) != 0) {
                th = canceled.mostRecentError;
            }
            if ((i & 2) != 0) {
                paymentSelection = canceled.paymentSelection;
            }
            if ((i & 4) != 0) {
                list = canceled.paymentMethods;
            }
            if ((i & 8) != 0) {
                value = canceled.linkAccountInfo;
            }
            return canceled.copy(th, paymentSelection, list, value);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getMostRecentError() {
            return this.mostRecentError;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final List<PaymentMethod> component3() {
            return this.paymentMethods;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        public final Canceled copy(Throwable mostRecentError, PaymentSelection paymentSelection, List<PaymentMethod> paymentMethods, LinkAccountUpdate.Value linkAccountInfo) {
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            return new Canceled(mostRecentError, paymentSelection, paymentMethods, linkAccountInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return Intrinsics.areEqual(this.mostRecentError, canceled.mostRecentError) && Intrinsics.areEqual(this.paymentSelection, canceled.paymentSelection) && Intrinsics.areEqual(this.paymentMethods, canceled.paymentMethods) && Intrinsics.areEqual(this.linkAccountInfo, canceled.linkAccountInfo);
        }

        public int hashCode() {
            Throwable th = this.mostRecentError;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            int iHashCode2 = (iHashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31;
            List<PaymentMethod> list = this.paymentMethods;
            return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.linkAccountInfo.hashCode();
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.mostRecentError + ", paymentSelection=" + this.paymentSelection + ", paymentMethods=" + this.paymentMethods + ", linkAccountInfo=" + this.linkAccountInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.mostRecentError);
            dest.writeParcelable(this.paymentSelection, flags);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<PaymentMethod> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            this.linkAccountInfo.writeToParcel(dest, flags);
        }

        public /* synthetic */ Canceled(Throwable th, PaymentSelection paymentSelection, List list, LinkAccountUpdate.Value value, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, paymentSelection, (i & 4) != 0 ? null : list, value);
        }

        public final Throwable getMostRecentError() {
            return this.mostRecentError;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsActivityResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsActivityResult
        public LinkAccountUpdate.Value getLinkAccountInfo() {
            return this.linkAccountInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(Throwable th, PaymentSelection paymentSelection, List<PaymentMethod> list, LinkAccountUpdate.Value linkAccountInfo) {
            super(0, null);
            Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
            this.mostRecentError = th;
            this.paymentSelection = paymentSelection;
            this.paymentMethods = list;
            this.linkAccountInfo = linkAccountInfo;
        }
    }

    public final Bundle toBundle() {
        return BundleKt.bundleOf(TuplesKt.to("extra_activity_result", this));
    }

    /* compiled from: PaymentOptionsActivityResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult$Companion;", "", "<init>", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ PaymentOptionsActivityResult fromIntent$paymentsheet_release(Intent intent) {
            if (intent != null) {
                return (PaymentOptionsActivityResult) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }
    }
}
