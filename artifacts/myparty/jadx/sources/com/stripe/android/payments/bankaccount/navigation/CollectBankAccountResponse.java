package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountResult.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;", "Lcom/stripe/android/core/model/StripeModel;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CollectBankAccountResponse implements StripeModel {
    private final FinancialConnectionsSession financialConnectionsSession;
    private final StripeIntent intent;
    public static final Parcelable.Creator<CollectBankAccountResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: CollectBankAccountResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectBankAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectBankAccountResponse((StripeIntent) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()), (FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse[] newArray(int i) {
            return new CollectBankAccountResponse[i];
        }
    }

    public static /* synthetic */ CollectBankAccountResponse copy$default(CollectBankAccountResponse collectBankAccountResponse, StripeIntent stripeIntent, FinancialConnectionsSession financialConnectionsSession, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent = collectBankAccountResponse.intent;
        }
        if ((i & 2) != 0) {
            financialConnectionsSession = collectBankAccountResponse.financialConnectionsSession;
        }
        return collectBankAccountResponse.copy(stripeIntent, financialConnectionsSession);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final FinancialConnectionsSession getFinancialConnectionsSession() {
        return this.financialConnectionsSession;
    }

    public final CollectBankAccountResponse copy(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
        return new CollectBankAccountResponse(intent, financialConnectionsSession);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectBankAccountResponse)) {
            return false;
        }
        CollectBankAccountResponse collectBankAccountResponse = (CollectBankAccountResponse) other;
        return Intrinsics.areEqual(this.intent, collectBankAccountResponse.intent) && Intrinsics.areEqual(this.financialConnectionsSession, collectBankAccountResponse.financialConnectionsSession);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.intent.hashCode() * 31) + this.financialConnectionsSession.hashCode();
    }

    public String toString() {
        return "CollectBankAccountResponse(intent=" + this.intent + ", financialConnectionsSession=" + this.financialConnectionsSession + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intent, flags);
        dest.writeParcelable(this.financialConnectionsSession, flags);
    }

    public CollectBankAccountResponse(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
        this.intent = intent;
        this.financialConnectionsSession = financialConnectionsSession;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    public final FinancialConnectionsSession getFinancialConnectionsSession() {
        return this.financialConnectionsSession;
    }
}
