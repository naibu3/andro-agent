package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmSetupIntentParams.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\tH\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+H\u0016J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b4J\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b6J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\tHÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0012\u0010;\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b<\u0010#J\u0016\u0010=\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000fHÀ\u0003¢\u0006\u0002\b>J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0088\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020CJ\u0013\u0010D\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010F\u001a\u00020CHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0016\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020CR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u0006N"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", "", "paymentMethodId", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "returnUrl", "useStripeSdk", "", "mandateId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "setAsDefaultPaymentMethod", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "getClientSecret", "()Ljava/lang/String;", "getPaymentMethodId$payments_core_release", "getPaymentMethodCreateParams$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "getMandateId", "setMandateId", "getMandateData", "()Lcom/stripe/android/model/MandateDataParams;", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "getSetAsDefaultPaymentMethod$payments_core_release", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentMethodCode$payments_core_release", "getPaymentMethodOptions", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "shouldUseStripeSdk", "withShouldUseStripeSdk", "toParamMap", "", "", "paymentMethodParamMap", "getPaymentMethodParamMap", "()Ljava/util/Map;", "mandateDataParams", "getMandateDataParams", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component5", "component6", "component7", "component8", "component8$payments_core_release", "component9", "component9$payments_core_release", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConfirmSetupIntentParams implements ConfirmStripeIntentParams {
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final String paymentMethodCode;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private final PaymentMethodOptionsParams paymentMethodOptions;
    private String returnUrl;
    private final Boolean setAsDefaultPaymentMethod;
    private final boolean useStripeSdk;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ConfirmSetupIntentParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfirmSetupIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            PaymentMethodCreateParams paymentMethodCreateParamsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            String string4 = parcel.readString();
            MandateDataParams mandateDataParamsCreateFromParcel = parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            return new ConfirmSetupIntentParams(string, string2, paymentMethodCreateParamsCreateFromParcel, string3, z2, string4, mandateDataParamsCreateFromParcel, boolValueOf, parcel.readString(), (PaymentMethodOptionsParams) parcel.readParcelable(ConfirmSetupIntentParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams[] newArray(int i) {
            return new ConfirmSetupIntentParams[i];
        }
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getUseStripeSdk() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmSetupIntentParams copy$default(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, Boolean bool, String str5, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmSetupIntentParams.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        if ((i & 4) != 0) {
            paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        if ((i & 8) != 0) {
            str3 = confirmSetupIntentParams.returnUrl;
        }
        if ((i & 16) != 0) {
            z = confirmSetupIntentParams.useStripeSdk;
        }
        if ((i & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        if ((i & 64) != 0) {
            mandateDataParams = confirmSetupIntentParams.mandateData;
        }
        if ((i & 128) != 0) {
            bool = confirmSetupIntentParams.setAsDefaultPaymentMethod;
        }
        if ((i & 256) != 0) {
            str5 = confirmSetupIntentParams.paymentMethodCode;
        }
        if ((i & 512) != 0) {
            paymentMethodOptionsParams = confirmSetupIntentParams.paymentMethodOptions;
        }
        String str6 = str5;
        PaymentMethodOptionsParams paymentMethodOptionsParams2 = paymentMethodOptionsParams;
        MandateDataParams mandateDataParams2 = mandateDataParams;
        Boolean bool2 = bool;
        boolean z2 = z;
        String str7 = str4;
        return confirmSetupIntentParams.copy(str, str2, paymentMethodCreateParams, str3, z2, str7, mandateDataParams2, bool2, str6, paymentMethodOptionsParams2);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return INSTANCE.create(paymentMethodCreateParams, str);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams) {
        return INSTANCE.create(paymentMethodCreateParams, str, mandateDataParams);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2) {
        return INSTANCE.create(paymentMethodCreateParams, str, mandateDataParams, str2);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(String str, PaymentMethod.Type type) {
        return INSTANCE.create(str, type);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(String str, String str2) {
        return INSTANCE.create(str, str2);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams) {
        return INSTANCE.create(str, str2, mandateDataParams);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams, String str3) {
        return INSTANCE.create(str, str2, mandateDataParams, str3);
    }

    @JvmStatic
    public static final ConfirmSetupIntentParams createWithoutPaymentMethod(String str) {
        return INSTANCE.createWithoutPaymentMethod(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component10, reason: from getter */
    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    /* renamed from: component2$payments_core_release, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component3$payments_core_release, reason: from getter */
    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* renamed from: component7, reason: from getter */
    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    /* renamed from: component8$payments_core_release, reason: from getter */
    public final Boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    /* renamed from: component9$payments_core_release, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    public final ConfirmSetupIntentParams copy(String clientSecret, String paymentMethodId, PaymentMethodCreateParams paymentMethodCreateParams, String returnUrl, boolean useStripeSdk, String mandateId, MandateDataParams mandateData, Boolean setAsDefaultPaymentMethod, String paymentMethodCode, PaymentMethodOptionsParams paymentMethodOptions) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, paymentMethodCreateParams, returnUrl, useStripeSdk, mandateId, mandateData, setAsDefaultPaymentMethod, paymentMethodCode, paymentMethodOptions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmSetupIntentParams)) {
            return false;
        }
        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) other;
        return Intrinsics.areEqual(this.clientSecret, confirmSetupIntentParams.clientSecret) && Intrinsics.areEqual(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && Intrinsics.areEqual(this.returnUrl, confirmSetupIntentParams.returnUrl) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && Intrinsics.areEqual(this.mandateId, confirmSetupIntentParams.mandateId) && Intrinsics.areEqual(this.mandateData, confirmSetupIntentParams.mandateData) && Intrinsics.areEqual(this.setAsDefaultPaymentMethod, confirmSetupIntentParams.setAsDefaultPaymentMethod) && Intrinsics.areEqual(this.paymentMethodCode, confirmSetupIntentParams.paymentMethodCode) && Intrinsics.areEqual(this.paymentMethodOptions, confirmSetupIntentParams.paymentMethodOptions);
    }

    public int hashCode() {
        int iHashCode = this.clientSecret.hashCode() * 31;
        String str = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode3 = (iHashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.useStripeSdk)) * 31;
        String str3 = this.mandateId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int iHashCode6 = (iHashCode5 + (mandateDataParams == null ? 0 : mandateDataParams.hashCode())) * 31;
        Boolean bool = this.setAsDefaultPaymentMethod;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.paymentMethodCode;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        return iHashCode8 + (paymentMethodOptionsParams != null ? paymentMethodOptionsParams.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + this.clientSecret + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", returnUrl=" + this.returnUrl + ", useStripeSdk=" + this.useStripeSdk + ", mandateId=" + this.mandateId + ", mandateData=" + this.mandateData + ", setAsDefaultPaymentMethod=" + this.setAsDefaultPaymentMethod + ", paymentMethodCode=" + this.paymentMethodCode + ", paymentMethodOptions=" + this.paymentMethodOptions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientSecret);
        dest.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethodCreateParams.writeToParcel(dest, flags);
        }
        dest.writeString(this.returnUrl);
        dest.writeInt(this.useStripeSdk ? 1 : 0);
        dest.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mandateDataParams.writeToParcel(dest, flags);
        }
        Boolean bool = this.setAsDefaultPaymentMethod;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.paymentMethodCode);
        dest.writeParcelable(this.paymentMethodOptions, flags);
    }

    public ConfirmSetupIntentParams(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z, String str3, MandateDataParams mandateDataParams, Boolean bool, String str4, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.paymentMethodId = str;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str2;
        this.useStripeSdk = z;
        this.mandateId = str3;
        this.mandateData = mandateDataParams;
        this.setAsDefaultPaymentMethod = bool;
        this.paymentMethodCode = str4;
        this.paymentMethodOptions = paymentMethodOptionsParams;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    public final /* synthetic */ String getPaymentMethodId$payments_core_release() {
        return this.paymentMethodId;
    }

    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final Boolean getSetAsDefaultPaymentMethod$payments_core_release() {
        return this.setAsDefaultPaymentMethod;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z, String str4, MandateDataParams mandateDataParams, Boolean bool, String str5, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i & 2) != 0 ? null : str2;
        paymentMethodCreateParams = (i & 4) != 0 ? null : paymentMethodCreateParams;
        this(str, str2, paymentMethodCreateParams, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : mandateDataParams, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? paymentMethodCreateParams != null ? paymentMethodCreateParams.getCode$payments_core_release() : null : str5, (i & 512) != 0 ? null : paymentMethodOptionsParams);
    }

    public final String getPaymentMethodCode$payments_core_release() {
        return this.paymentMethodCode;
    }

    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmSetupIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk) {
        return copy$default(this, null, null, null, null, shouldUseStripeSdk, null, null, null, null, null, PointerIconCompat.TYPE_CROSSHAIR, null);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("client_secret", getClientSecret()), TuplesKt.to("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl = getReturnUrl();
        Map mapMapOf2 = returnUrl != null ? MapsKt.mapOf(TuplesKt.to("return_url", returnUrl)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        String str = this.mandateId;
        Map mapMapOf3 = str != null ? MapsKt.mapOf(TuplesKt.to("mandate", str)) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        Map mapMapOf4 = mandateDataParams != null ? MapsKt.mapOf(TuplesKt.to("mandate_data", mandateDataParams)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf4);
        Boolean bool = this.setAsDefaultPaymentMethod;
        Map mapMapOf5 = bool != null ? MapsKt.mapOf(TuplesKt.to("set_as_default_payment_method", Boolean.valueOf(bool.booleanValue()))) : null;
        if (mapMapOf5 == null) {
            mapMapOf5 = MapsKt.emptyMap();
        }
        return MapsKt.plus(MapsKt.plus(mapPlus3, mapMapOf5), getPaymentMethodParamMap());
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            return MapsKt.mapOf(TuplesKt.to("payment_method_data", paymentMethodCreateParams.toParamMap()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return MapsKt.mapOf(TuplesKt.to("payment_method", str));
        }
        return MapsKt.emptyMap();
    }

    private final Map<String, Object> getMandateDataParams() {
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null && (paramMap = mandateDataParams.toParamMap()) != null) {
            return paramMap;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null && paymentMethodCreateParams.getRequiresMandate$payments_core_release() && this.mandateId == null) {
            return new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT()).toParamMap();
        }
        return null;
    }

    /* compiled from: ConfirmSetupIntentParams.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007JA\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0010\u0016\u001a\u00060\u0007j\u0002`\u0017H\u0000¢\u0006\u0004\b\u0014\u0010\u0018J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "clientSecret", "", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "createWithoutPaymentMethod", "paymentMethodId", "mandateData", "Lcom/stripe/android/model/MandateDataParams;", "mandateId", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createWithSetAsDefaultPaymentMethod", "setAsDefaultPaymentMethod", "", "createWithSetAsDefaultPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "paymentMethodCode", "Lcom/stripe/android/model/PaymentMethodCode;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "createForDashboard", "paymentMethodOptions", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "createForDashboard$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateDataParams) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        private Companion() {
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.INSTANCE.getDEFAULT());
            if (!paymentMethodType.requiresMandate) {
                mandateDataParams = null;
            }
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, mandateDataParams, null, paymentMethodType.code, null, TypedValues.TransitionType.TYPE_TO, null);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams createWithoutPaymentMethod(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, null, null, null, null, 1022, null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, String str, String str2, MandateDataParams mandateDataParams, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.create(str, str2, mandateDataParams, str3);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateData, String mandateId) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, false, mandateId, mandateData, null, null, null, 924, null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
        }

        @JvmStatic
        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateData, String mandateId) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return createWithSetAsDefaultPaymentMethod$payments_core_release(paymentMethodCreateParams, clientSecret, mandateData, mandateId, null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, Boolean bool, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.createWithSetAsDefaultPaymentMethod$payments_core_release(paymentMethodCreateParams, str, mandateDataParams, str2, bool);
        }

        public final ConfirmSetupIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateData, String mandateId, Boolean setAsDefaultPaymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, paymentMethodCreateParams, null, false, mandateId, mandateData, setAsDefaultPaymentMethod, paymentMethodCreateParams.getCode$payments_core_release(), null, 538, null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release$default(Companion companion, String str, String str2, MandateDataParams mandateDataParams, String str3, Boolean bool, String str4, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createWithSetAsDefaultPaymentMethod$payments_core_release(str, str2, mandateDataParams, str3, bool, str4);
        }

        public final ConfirmSetupIntentParams createWithSetAsDefaultPaymentMethod$payments_core_release(String paymentMethodId, String clientSecret, MandateDataParams mandateData, String mandateId, Boolean setAsDefaultPaymentMethod, String paymentMethodCode) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, false, mandateId, mandateData, setAsDefaultPaymentMethod, paymentMethodCode, null, 540, null);
        }

        public final ConfirmSetupIntentParams createForDashboard$payments_core_release(String clientSecret, String paymentMethodId, PaymentMethodOptionsParams paymentMethodOptions) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            PaymentMethodOptionsParams.Card card = paymentMethodOptions instanceof PaymentMethodOptionsParams.Card ? (PaymentMethodOptionsParams.Card) paymentMethodOptions : null;
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, true, null, null, null, PaymentMethod.Type.Card.code, new PaymentMethodOptionsParams.Card(null, null, card != null ? card.getSetupFutureUsage() : null, true, 3, null), 236, null);
        }
    }
}
