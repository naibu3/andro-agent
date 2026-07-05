package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationInternal.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "Landroid/os/Parcelable;", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFinancialConnectionsSessionClientSecret", "()Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSheetConfiguration implements Parcelable {
    public static final Parcelable.Creator<FinancialConnectionsSheetConfiguration> CREATOR = new Creator();
    private final String financialConnectionsSessionClientSecret;
    private final String publishableKey;
    private final String stripeAccountId;

    /* compiled from: ConfigurationInternal.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSheetConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetConfiguration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FinancialConnectionsSheetConfiguration(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSheetConfiguration[] newArray(int i) {
            return new FinancialConnectionsSheetConfiguration[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsSheetConfiguration copy$default(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret;
        }
        if ((i & 2) != 0) {
            str2 = financialConnectionsSheetConfiguration.publishableKey;
        }
        if ((i & 4) != 0) {
            str3 = financialConnectionsSheetConfiguration.stripeAccountId;
        }
        return financialConnectionsSheetConfiguration.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFinancialConnectionsSessionClientSecret() {
        return this.financialConnectionsSessionClientSecret;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public final FinancialConnectionsSheetConfiguration copy(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return new FinancialConnectionsSheetConfiguration(financialConnectionsSessionClientSecret, publishableKey, stripeAccountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetConfiguration)) {
            return false;
        }
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) other;
        return Intrinsics.areEqual(this.financialConnectionsSessionClientSecret, financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret) && Intrinsics.areEqual(this.publishableKey, financialConnectionsSheetConfiguration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, financialConnectionsSheetConfiguration.stripeAccountId);
    }

    public int hashCode() {
        int iHashCode = ((this.financialConnectionsSessionClientSecret.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.stripeAccountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FinancialConnectionsSheetConfiguration(financialConnectionsSessionClientSecret=" + this.financialConnectionsSessionClientSecret + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.financialConnectionsSessionClientSecret);
        dest.writeString(this.publishableKey);
        dest.writeString(this.stripeAccountId);
    }

    public FinancialConnectionsSheetConfiguration(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        this.financialConnectionsSessionClientSecret = financialConnectionsSessionClientSecret;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
    }

    public /* synthetic */ FinancialConnectionsSheetConfiguration(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getFinancialConnectionsSessionClientSecret() {
        return this.financialConnectionsSessionClientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }
}
