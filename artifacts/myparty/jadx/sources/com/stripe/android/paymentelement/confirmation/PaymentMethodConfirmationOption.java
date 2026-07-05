package com.stripe.android.paymentelement.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PassiveCaptchaParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodConfirmationOption.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Saved", "New", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentMethodConfirmationOption extends ConfirmationHandler.Option {

    /* compiled from: PaymentMethodConfirmationOption.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "originatedFromWallet", "", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Z)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getOriginatedFromWallet", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Saved implements PaymentMethodConfirmationOption {
        private final PaymentMethodOptionsParams optionsParams;
        private final boolean originatedFromWallet;
        private final PaymentMethod paymentMethod;
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        public static final int $stable = PaymentMethodOptionsParams.$stable | PaymentMethod.$stable;

        /* compiled from: PaymentMethodConfirmationOption.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Saved> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saved((PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()), (PaymentMethodOptionsParams) parcel.readParcelable(Saved.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        public static /* synthetic */ Saved copy$default(Saved saved, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = saved.paymentMethod;
            }
            if ((i & 2) != 0) {
                paymentMethodOptionsParams = saved.optionsParams;
            }
            if ((i & 4) != 0) {
                z = saved.originatedFromWallet;
            }
            return saved.copy(paymentMethod, paymentMethodOptionsParams, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodOptionsParams getOptionsParams() {
            return this.optionsParams;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getOriginatedFromWallet() {
            return this.originatedFromWallet;
        }

        public final Saved copy(PaymentMethod paymentMethod, PaymentMethodOptionsParams optionsParams, boolean originatedFromWallet) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Saved(paymentMethod, optionsParams, originatedFromWallet);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Saved)) {
                return false;
            }
            Saved saved = (Saved) other;
            return Intrinsics.areEqual(this.paymentMethod, saved.paymentMethod) && Intrinsics.areEqual(this.optionsParams, saved.optionsParams) && this.originatedFromWallet == saved.originatedFromWallet;
        }

        public int hashCode() {
            int iHashCode = this.paymentMethod.hashCode() * 31;
            PaymentMethodOptionsParams paymentMethodOptionsParams = this.optionsParams;
            return ((iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31) + Boolean.hashCode(this.originatedFromWallet);
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.paymentMethod + ", optionsParams=" + this.optionsParams + ", originatedFromWallet=" + this.originatedFromWallet + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentMethod, flags);
            dest.writeParcelable(this.optionsParams, flags);
            dest.writeInt(this.originatedFromWallet ? 1 : 0);
        }

        public Saved(PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, boolean z) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.optionsParams = paymentMethodOptionsParams;
            this.originatedFromWallet = z;
        }

        public /* synthetic */ Saved(PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethod, paymentMethodOptionsParams, (i & 4) != 0 ? false : z);
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final PaymentMethodOptionsParams getOptionsParams() {
            return this.optionsParams;
        }

        public final boolean getOriginatedFromWallet() {
            return this.originatedFromWallet;
        }
    }

    /* compiled from: PaymentMethodConfirmationOption.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "extraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "shouldSave", "", "passiveCaptchaParams", "Lcom/stripe/android/model/PassiveCaptchaParams;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;)V", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "getShouldSave", "()Z", "getPassiveCaptchaParams", "()Lcom/stripe/android/model/PassiveCaptchaParams;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements PaymentMethodConfirmationOption {
        private final PaymentMethodCreateParams createParams;
        private final PaymentMethodExtraParams extraParams;
        private final PaymentMethodOptionsParams optionsParams;
        private final PassiveCaptchaParams passiveCaptchaParams;
        private final boolean shouldSave;
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        public static final int $stable = ((PassiveCaptchaParams.$stable | PaymentMethodExtraParams.$stable) | PaymentMethodOptionsParams.$stable) | PaymentMethodCreateParams.$stable;

        /* compiled from: PaymentMethodConfirmationOption.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new New((PaymentMethodCreateParams) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodOptionsParams) parcel.readParcelable(New.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(New.class.getClassLoader()), parcel.readInt() != 0, (PassiveCaptchaParams) parcel.readParcelable(New.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }

        public static /* synthetic */ New copy$default(New r0, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, boolean z, PassiveCaptchaParams passiveCaptchaParams, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethodCreateParams = r0.createParams;
            }
            if ((i & 2) != 0) {
                paymentMethodOptionsParams = r0.optionsParams;
            }
            if ((i & 4) != 0) {
                paymentMethodExtraParams = r0.extraParams;
            }
            if ((i & 8) != 0) {
                z = r0.shouldSave;
            }
            if ((i & 16) != 0) {
                passiveCaptchaParams = r0.passiveCaptchaParams;
            }
            PassiveCaptchaParams passiveCaptchaParams2 = passiveCaptchaParams;
            PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
            return r0.copy(paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams2, z, passiveCaptchaParams2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethodCreateParams getCreateParams() {
            return this.createParams;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodOptionsParams getOptionsParams() {
            return this.optionsParams;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethodExtraParams getExtraParams() {
            return this.extraParams;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        /* renamed from: component5, reason: from getter */
        public final PassiveCaptchaParams getPassiveCaptchaParams() {
            return this.passiveCaptchaParams;
        }

        public final New copy(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams, boolean shouldSave, PassiveCaptchaParams passiveCaptchaParams) {
            Intrinsics.checkNotNullParameter(createParams, "createParams");
            return new New(createParams, optionsParams, extraParams, shouldSave, passiveCaptchaParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(this.createParams, r5.createParams) && Intrinsics.areEqual(this.optionsParams, r5.optionsParams) && Intrinsics.areEqual(this.extraParams, r5.extraParams) && this.shouldSave == r5.shouldSave && Intrinsics.areEqual(this.passiveCaptchaParams, r5.passiveCaptchaParams);
        }

        public int hashCode() {
            int iHashCode = this.createParams.hashCode() * 31;
            PaymentMethodOptionsParams paymentMethodOptionsParams = this.optionsParams;
            int iHashCode2 = (iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
            PaymentMethodExtraParams paymentMethodExtraParams = this.extraParams;
            int iHashCode3 = (((iHashCode2 + (paymentMethodExtraParams == null ? 0 : paymentMethodExtraParams.hashCode())) * 31) + Boolean.hashCode(this.shouldSave)) * 31;
            PassiveCaptchaParams passiveCaptchaParams = this.passiveCaptchaParams;
            return iHashCode3 + (passiveCaptchaParams != null ? passiveCaptchaParams.hashCode() : 0);
        }

        public String toString() {
            return "New(createParams=" + this.createParams + ", optionsParams=" + this.optionsParams + ", extraParams=" + this.extraParams + ", shouldSave=" + this.shouldSave + ", passiveCaptchaParams=" + this.passiveCaptchaParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.createParams, flags);
            dest.writeParcelable(this.optionsParams, flags);
            dest.writeParcelable(this.extraParams, flags);
            dest.writeInt(this.shouldSave ? 1 : 0);
            dest.writeParcelable(this.passiveCaptchaParams, flags);
        }

        public New(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, boolean z, PassiveCaptchaParams passiveCaptchaParams) {
            Intrinsics.checkNotNullParameter(createParams, "createParams");
            this.createParams = createParams;
            this.optionsParams = paymentMethodOptionsParams;
            this.extraParams = paymentMethodExtraParams;
            this.shouldSave = z;
            this.passiveCaptchaParams = passiveCaptchaParams;
        }

        public /* synthetic */ New(PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, boolean z, PassiveCaptchaParams passiveCaptchaParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams, z, (i & 16) != 0 ? null : passiveCaptchaParams);
        }

        public final PaymentMethodCreateParams getCreateParams() {
            return this.createParams;
        }

        public final PaymentMethodOptionsParams getOptionsParams() {
            return this.optionsParams;
        }

        public final PaymentMethodExtraParams getExtraParams() {
            return this.extraParams;
        }

        public final boolean getShouldSave() {
            return this.shouldSave;
        }

        public final PassiveCaptchaParams getPassiveCaptchaParams() {
            return this.passiveCaptchaParams;
        }
    }
}
