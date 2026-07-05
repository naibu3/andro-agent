package com.stripe.android.link;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ConsumerState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/link/ConsumerState;", "", "paymentDetails", "", "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;", "<init>", "(Ljava/util/List;)V", "getPaymentDetails", "()Ljava/util/List;", "withPaymentDetailsResponse", "response", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "withUpdatedPaymentDetail", "updatedPayment", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "billingPhone", "", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConsumerState {
    private final List<LinkPaymentMethod.ConsumerPaymentDetails> paymentDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumerState copy$default(ConsumerState consumerState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = consumerState.paymentDetails;
        }
        return consumerState.copy(list);
    }

    public final List<LinkPaymentMethod.ConsumerPaymentDetails> component1() {
        return this.paymentDetails;
    }

    public final ConsumerState copy(List<LinkPaymentMethod.ConsumerPaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        return new ConsumerState(paymentDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsumerState) && Intrinsics.areEqual(this.paymentDetails, ((ConsumerState) other).paymentDetails);
    }

    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        return "ConsumerState(paymentDetails=" + this.paymentDetails + ")";
    }

    public ConsumerState(List<LinkPaymentMethod.ConsumerPaymentDetails> paymentDetails) {
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    public final List<LinkPaymentMethod.ConsumerPaymentDetails> getPaymentDetails() {
        return this.paymentDetails;
    }

    public final ConsumerState withPaymentDetailsResponse(ConsumerPaymentDetails response) {
        LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails;
        Intrinsics.checkNotNullParameter(response, "response");
        List<LinkPaymentMethod.ConsumerPaymentDetails> list = this.paymentDetails;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((LinkPaymentMethod.ConsumerPaymentDetails) obj).getDetails().getId(), obj);
        }
        List<ConsumerPaymentDetails.PaymentDetails> paymentDetails = response.getPaymentDetails();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paymentDetails, 10));
        for (ConsumerPaymentDetails.PaymentDetails paymentDetails2 : paymentDetails) {
            LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails2 = (LinkPaymentMethod.ConsumerPaymentDetails) linkedHashMap.get(paymentDetails2.getId());
            if (consumerPaymentDetails2 == null || (consumerPaymentDetails = LinkPaymentMethod.ConsumerPaymentDetails.copy$default(consumerPaymentDetails2, paymentDetails2, null, null, 6, null)) == null) {
                consumerPaymentDetails = new LinkPaymentMethod.ConsumerPaymentDetails(paymentDetails2, null, null);
            }
            arrayList.add(consumerPaymentDetails);
        }
        return copy(arrayList);
    }

    public final ConsumerState withUpdatedPaymentDetail(ConsumerPaymentDetails.PaymentDetails updatedPayment, String billingPhone) {
        ConsumerPaymentDetails.PaymentDetails paymentDetails;
        LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetailsCopy$default;
        Intrinsics.checkNotNullParameter(updatedPayment, "updatedPayment");
        List<LinkPaymentMethod.ConsumerPaymentDetails> list = this.paymentDetails;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails : list) {
            if (Intrinsics.areEqual(consumerPaymentDetails.getDetails().getId(), updatedPayment.getId())) {
                ConsumerPaymentDetails.PaymentDetails paymentDetails2 = updatedPayment;
                consumerPaymentDetailsCopy$default = LinkPaymentMethod.ConsumerPaymentDetails.copy$default(consumerPaymentDetails, paymentDetails2, null, billingPhone == null ? consumerPaymentDetails.getBillingPhone() : billingPhone, 2, null);
                paymentDetails = paymentDetails2;
            } else {
                paymentDetails = updatedPayment;
                String billingPhone2 = consumerPaymentDetails.getBillingPhone();
                consumerPaymentDetailsCopy$default = LinkPaymentMethod.ConsumerPaymentDetails.copy$default(consumerPaymentDetails, null, null, billingPhone2 == null ? billingPhone : billingPhone2, 3, null);
            }
            arrayList.add(consumerPaymentDetailsCopy$default);
            updatedPayment = paymentDetails;
        }
        return copy(arrayList);
    }

    /* compiled from: ConsumerState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/ConsumerState$Companion;", "", "<init>", "()V", "fromResponse", "Lcom/stripe/android/link/ConsumerState;", "response", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConsumerState fromResponse(ConsumerPaymentDetails response) {
            Intrinsics.checkNotNullParameter(response, "response");
            List<ConsumerPaymentDetails.PaymentDetails> paymentDetails = response.getPaymentDetails();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paymentDetails, 10));
            Iterator<T> it = paymentDetails.iterator();
            while (it.hasNext()) {
                arrayList.add(new LinkPaymentMethod.ConsumerPaymentDetails((ConsumerPaymentDetails.PaymentDetails) it.next(), null, null));
            }
            return new ConsumerState(arrayList);
        }
    }
}
