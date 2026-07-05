package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IncentiveEligibilitySession.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/IncentiveEligibilitySession;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "toParamMap", "", "PaymentIntent", "SetupIntent", "DeferredIntent", "Lcom/stripe/android/model/IncentiveEligibilitySession$DeferredIntent;", "Lcom/stripe/android/model/IncentiveEligibilitySession$PaymentIntent;", "Lcom/stripe/android/model/IncentiveEligibilitySession$SetupIntent;", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IncentiveEligibilitySession extends Parcelable {
    String getId();

    Map<String, String> toParamMap();

    /* compiled from: IncentiveEligibilitySession.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/IncentiveEligibilitySession$PaymentIntent;", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentIntent implements IncentiveEligibilitySession {
        public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
        private final String id;

        /* compiled from: IncentiveEligibilitySession.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentIntent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentIntent(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntent[] newArray(int i) {
                return new PaymentIntent[i];
            }
        }

        public static /* synthetic */ PaymentIntent copy$default(PaymentIntent paymentIntent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentIntent.id;
            }
            return paymentIntent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final PaymentIntent copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new PaymentIntent(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentIntent) && Intrinsics.areEqual(this.id, ((PaymentIntent) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "PaymentIntent(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public Map<String, String> toParamMap() {
            return DefaultImpls.toParamMap(this);
        }

        public PaymentIntent(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public String getId() {
            return this.id;
        }
    }

    /* compiled from: IncentiveEligibilitySession.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/IncentiveEligibilitySession$SetupIntent;", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupIntent implements IncentiveEligibilitySession {
        public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
        private final String id;

        /* compiled from: IncentiveEligibilitySession.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SetupIntent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupIntent(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntent[] newArray(int i) {
                return new SetupIntent[i];
            }
        }

        public static /* synthetic */ SetupIntent copy$default(SetupIntent setupIntent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupIntent.id;
            }
            return setupIntent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final SetupIntent copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new SetupIntent(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupIntent) && Intrinsics.areEqual(this.id, ((SetupIntent) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "SetupIntent(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public Map<String, String> toParamMap() {
            return DefaultImpls.toParamMap(this);
        }

        public SetupIntent(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public String getId() {
            return this.id;
        }
    }

    /* compiled from: IncentiveEligibilitySession.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/IncentiveEligibilitySession$DeferredIntent;", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeferredIntent implements IncentiveEligibilitySession {
        public static final Parcelable.Creator<DeferredIntent> CREATOR = new Creator();
        private final String id;

        /* compiled from: IncentiveEligibilitySession.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeferredIntent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeferredIntent(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntent[] newArray(int i) {
                return new DeferredIntent[i];
            }
        }

        public static /* synthetic */ DeferredIntent copy$default(DeferredIntent deferredIntent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deferredIntent.id;
            }
            return deferredIntent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final DeferredIntent copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new DeferredIntent(id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeferredIntent) && Intrinsics.areEqual(this.id, ((DeferredIntent) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "DeferredIntent(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public Map<String, String> toParamMap() {
            return DefaultImpls.toParamMap(this);
        }

        public DeferredIntent(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        @Override // com.stripe.android.model.IncentiveEligibilitySession
        public String getId() {
            return this.id;
        }
    }

    /* compiled from: IncentiveEligibilitySession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Map<String, String> toParamMap(IncentiveEligibilitySession incentiveEligibilitySession) {
            String str;
            if (incentiveEligibilitySession instanceof PaymentIntent) {
                str = "financial_incentive[payment_intent]";
            } else if (incentiveEligibilitySession instanceof SetupIntent) {
                str = "financial_incentive[setup_intent]";
            } else {
                if (!(incentiveEligibilitySession instanceof DeferredIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "financial_incentive[elements_session_id]";
            }
            return MapsKt.mapOf(TuplesKt.to(str, incentiveEligibilitySession.getId()));
        }
    }
}
