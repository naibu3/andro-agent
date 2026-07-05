package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.Source;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parceler;

/* compiled from: PaymentFlowResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult;", "", "<init>", "()V", "Unvalidated", "Validated", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentFlowResult {
    public static final int $stable = 0;

    public /* synthetic */ PaymentFlowResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentFlowResult() {
    }

    /* compiled from: PaymentFlowResult.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\r\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000e\u0010$\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b'J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\b)J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020\u0005J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00068"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcelable;", "clientSecret", "", "flowOutcome", "", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/android/core/exception/StripeException;", "canCancelSource", "", "sourceId", "source", "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getFlowOutcome", "()I", "getException", "()Lcom/stripe/android/core/exception/StripeException;", "getCanCancelSource$payments_core_release", "()Z", "getSourceId$payments_core_release", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId", "toBundle", "Landroid/os/Bundle;", "validate", "Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate$payments_core_release", "component1", "component2", "component3", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unvalidated implements Parcelable {
        private static final String CLIENT_SECRET_INTENT_ERROR = "Invalid client_secret value in result Intent.";
        private static final String EXTRA = "extra_args";
        private final boolean canCancelSource;
        private final String clientSecret;
        private final StripeException exception;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Unvalidated> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentFlowResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unvalidated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Unvalidated.INSTANCE.create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated[] newArray(int i) {
                return new Unvalidated[i];
            }
        }

        public Unvalidated() {
            this(null, 0, null, false, null, null, null, 127, null);
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = unvalidated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = unvalidated.flowOutcome;
            }
            if ((i2 & 4) != 0) {
                stripeException = unvalidated.exception;
            }
            if ((i2 & 8) != 0) {
                z = unvalidated.canCancelSource;
            }
            if ((i2 & 16) != 0) {
                str2 = unvalidated.sourceId;
            }
            if ((i2 & 32) != 0) {
                source = unvalidated.source;
            }
            if ((i2 & 64) != 0) {
                str3 = unvalidated.stripeAccountId;
            }
            Source source2 = source;
            String str4 = str3;
            String str5 = str2;
            StripeException stripeException2 = stripeException;
            return unvalidated.copy(str, i, stripeException2, z, str5, source2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final int getFlowOutcome() {
            return this.flowOutcome;
        }

        /* renamed from: component3, reason: from getter */
        public final StripeException getException() {
            return this.exception;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final boolean getCanCancelSource() {
            return this.canCancelSource;
        }

        /* renamed from: component5$payments_core_release, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* renamed from: component6$payments_core_release, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        /* renamed from: component7, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Unvalidated copy(String clientSecret, int flowOutcome, StripeException exception, boolean canCancelSource, String sourceId, Source source, String stripeAccountId) {
            return new Unvalidated(clientSecret, flowOutcome, exception, canCancelSource, sourceId, source, stripeAccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unvalidated)) {
                return false;
            }
            Unvalidated unvalidated = (Unvalidated) other;
            return Intrinsics.areEqual(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && Intrinsics.areEqual(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && Intrinsics.areEqual(this.sourceId, unvalidated.sourceId) && Intrinsics.areEqual(this.source, unvalidated.source) && Intrinsics.areEqual(this.stripeAccountId, unvalidated.stripeAccountId);
        }

        public int hashCode() {
            String str = this.clientSecret;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.flowOutcome)) * 31;
            StripeException stripeException = this.exception;
            int iHashCode2 = (((iHashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
            String str2 = this.sourceId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Source source = this.source;
            int iHashCode4 = (iHashCode3 + (source == null ? 0 : source.hashCode())) * 31;
            String str3 = this.stripeAccountId;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Unvalidated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", exception=" + this.exception + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            INSTANCE.write(this, dest, flags);
        }

        public Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3) {
            this.clientSecret = str;
            this.flowOutcome = i;
            this.exception = stripeException;
            this.canCancelSource = z;
            this.sourceId = str2;
            this.source = source;
            this.stripeAccountId = str3;
        }

        public /* synthetic */ Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : stripeException, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : source, (i2 & 64) != 0 ? null : str3);
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getFlowOutcome() {
            return this.flowOutcome;
        }

        public final StripeException getException() {
            return this.exception;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final /* synthetic */ Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(EXTRA, this));
        }

        public final Validated validate$payments_core_release() throws StripeException {
            StripeException stripeException = this.exception;
            if (stripeException instanceof Throwable) {
                throw stripeException;
            }
            String str = this.clientSecret;
            if (str == null || StringsKt.isBlank(str)) {
                throw new IllegalArgumentException(CLIENT_SECRET_INTENT_ERROR.toString());
            }
            return new Validated(this.clientSecret, this.flowOutcome, this.canCancelSource, this.sourceId, this.source, this.stripeAccountId);
        }

        /* compiled from: PaymentFlowResult.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "fromIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "EXTRA", "", "CLIENT_SECRET_INTENT_ERROR", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parceler<Unvalidated> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public Unvalidated[] newArray(int i) {
                return (Unvalidated[]) Parceler.DefaultImpls.newArray(this, i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public Unvalidated create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                Serializable serializable = parcel.readSerializable();
                return new Unvalidated(string, i, serializable instanceof StripeException ? (StripeException) serializable : null, parcel.readInt() == 1, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
            }

            @Override // kotlinx.parcelize.Parceler
            public void write(Unvalidated unvalidated, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(unvalidated, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeString(unvalidated.getClientSecret());
                parcel.writeInt(unvalidated.getFlowOutcome());
                parcel.writeSerializable(unvalidated.getException());
                num.intValue();
                num = unvalidated.getCanCancelSource$payments_core_release() ? 1 : null;
                parcel.writeInt(num != null ? num.intValue() : 0);
                parcel.writeString(unvalidated.getSourceId$payments_core_release());
                parcel.writeParcelable(unvalidated.getSource$payments_core_release(), i);
                parcel.writeString(unvalidated.getStripeAccountId());
            }

            public final /* synthetic */ Unvalidated fromIntent(Intent intent) {
                Unvalidated unvalidated;
                return (intent == null || (unvalidated = (Unvalidated) intent.getParcelableExtra(Unvalidated.EXTRA)) == null) ? new Unvalidated(null, 0, null, false, null, null, null, 127, null) : unvalidated;
            }
        }
    }

    /* compiled from: PaymentFlowResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0019\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0002\b J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "", "clientSecret", "", "flowOutcome", "", "canCancelSource", "", "sourceId", "source", "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getFlowOutcome$payments_core_release", "()I", "getCanCancelSource$payments_core_release", "()Z", "getSourceId$payments_core_release", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "copy", "copy$payments_core_release", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Validated {
        public static final int $stable = 8;
        private final boolean canCancelSource;
        private final String clientSecret;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        public static /* synthetic */ Validated copy$payments_core_release$default(Validated validated, String str, int i, boolean z, String str2, Source source, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = validated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = validated.flowOutcome;
            }
            if ((i2 & 4) != 0) {
                z = validated.canCancelSource;
            }
            if ((i2 & 8) != 0) {
                str2 = validated.sourceId;
            }
            if ((i2 & 16) != 0) {
                source = validated.source;
            }
            if ((i2 & 32) != 0) {
                str3 = validated.stripeAccountId;
            }
            Source source2 = source;
            String str4 = str3;
            return validated.copy$payments_core_release(str, i, z, str2, source2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final int getFlowOutcome() {
            return this.flowOutcome;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final boolean getCanCancelSource() {
            return this.canCancelSource;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* renamed from: component5$payments_core_release, reason: from getter */
        public final Source getSource() {
            return this.source;
        }

        /* renamed from: component6, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Validated copy$payments_core_release(String clientSecret, int flowOutcome, boolean canCancelSource, String sourceId, Source source, String stripeAccountId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Validated(clientSecret, flowOutcome, canCancelSource, sourceId, source, stripeAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validated)) {
                return false;
            }
            Validated validated = (Validated) other;
            return Intrinsics.areEqual(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && Intrinsics.areEqual(this.sourceId, validated.sourceId) && Intrinsics.areEqual(this.source, validated.source) && Intrinsics.areEqual(this.stripeAccountId, validated.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = ((((this.clientSecret.hashCode() * 31) + Integer.hashCode(this.flowOutcome)) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
            String str = this.sourceId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Source source = this.source;
            int iHashCode3 = (iHashCode2 + (source == null ? 0 : source.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Validated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        public Validated(String clientSecret, int i, boolean z, String str, Source source, String str2) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.flowOutcome = i;
            this.canCancelSource = z;
            this.sourceId = str;
            this.source = source;
            this.stripeAccountId = str2;
        }

        public /* synthetic */ Validated(String str, int i, boolean z, String str2, Source source, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : source, (i2 & 32) != 0 ? null : str3);
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getFlowOutcome$payments_core_release() {
            return this.flowOutcome;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }
    }
}
