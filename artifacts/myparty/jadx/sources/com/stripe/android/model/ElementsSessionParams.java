package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ElementsSessionParams.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004 !\"#R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0003$%&¨\u0006'"}, d2 = {"Lcom/stripe/android/model/ElementsSessionParams;", "Landroid/os/Parcelable;", "type", "", "getType", "()Ljava/lang/String;", "clientSecret", "getClientSecret", "customerSessionClientSecret", "getCustomerSessionClientSecret", "legacyCustomerEphemeralKey", "getLegacyCustomerEphemeralKey", "mobileSessionId", "getMobileSessionId", "locale", "getLocale", "expandFields", "", "getExpandFields", "()Ljava/util/List;", "savedPaymentMethodSelectionId", "getSavedPaymentMethodSelectionId", "customPaymentMethods", "getCustomPaymentMethods", "externalPaymentMethods", "getExternalPaymentMethods", "appId", "getAppId", "sellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "getSellerDetails", "()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "PaymentIntentType", "SetupIntentType", "DeferredIntentType", "SellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;", "Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;", "Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ElementsSessionParams extends Parcelable {
    String getAppId();

    String getClientSecret();

    List<String> getCustomPaymentMethods();

    String getCustomerSessionClientSecret();

    List<String> getExpandFields();

    List<String> getExternalPaymentMethods();

    String getLegacyCustomerEphemeralKey();

    String getLocale();

    String getMobileSessionId();

    String getSavedPaymentMethodSelectionId();

    SellerDetails getSellerDetails();

    String getType();

    /* compiled from: ElementsSessionParams.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "clientSecret", "", "locale", "customerSessionClientSecret", "legacyCustomerEphemeralKey", "savedPaymentMethodSelectionId", "mobileSessionId", "customPaymentMethods", "", "externalPaymentMethods", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getLocale", "getCustomerSessionClientSecret", "getLegacyCustomerEphemeralKey", "getSavedPaymentMethodSelectionId", "getMobileSessionId", "getCustomPaymentMethods", "()Ljava/util/List;", "getExternalPaymentMethods", "getAppId", "type", "getType", "expandFields", "getExpandFields", "sellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "getSellerDetails", "()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentIntentType implements ElementsSessionParams {
        private final String appId;
        private final String clientSecret;
        private final List<String> customPaymentMethods;
        private final String customerSessionClientSecret;
        private final List<String> externalPaymentMethods;
        private final String legacyCustomerEphemeralKey;
        private final String locale;
        private final String mobileSessionId;
        private final String savedPaymentMethodSelectionId;
        public static final Parcelable.Creator<PaymentIntentType> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ElementsSessionParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentIntentType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentType[] newArray(int i) {
                return new PaymentIntentType[i];
            }
        }

        public static /* synthetic */ PaymentIntentType copy$default(PaymentIntentType paymentIntentType, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentIntentType.clientSecret;
            }
            if ((i & 2) != 0) {
                str2 = paymentIntentType.locale;
            }
            if ((i & 4) != 0) {
                str3 = paymentIntentType.customerSessionClientSecret;
            }
            if ((i & 8) != 0) {
                str4 = paymentIntentType.legacyCustomerEphemeralKey;
            }
            if ((i & 16) != 0) {
                str5 = paymentIntentType.savedPaymentMethodSelectionId;
            }
            if ((i & 32) != 0) {
                str6 = paymentIntentType.mobileSessionId;
            }
            if ((i & 64) != 0) {
                list = paymentIntentType.customPaymentMethods;
            }
            if ((i & 128) != 0) {
                list2 = paymentIntentType.externalPaymentMethods;
            }
            if ((i & 256) != 0) {
                str7 = paymentIntentType.appId;
            }
            List list3 = list2;
            String str8 = str7;
            String str9 = str6;
            List list4 = list;
            String str10 = str5;
            String str11 = str3;
            return paymentIntentType.copy(str, str2, str11, str4, str10, str9, list4, list3, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        public final List<String> component7() {
            return this.customPaymentMethods;
        }

        public final List<String> component8() {
            return this.externalPaymentMethods;
        }

        /* renamed from: component9, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final PaymentIntentType copy(String clientSecret, String locale, String customerSessionClientSecret, String legacyCustomerEphemeralKey, String savedPaymentMethodSelectionId, String mobileSessionId, List<String> customPaymentMethods, List<String> externalPaymentMethods, String appId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new PaymentIntentType(clientSecret, locale, customerSessionClientSecret, legacyCustomerEphemeralKey, savedPaymentMethodSelectionId, mobileSessionId, customPaymentMethods, externalPaymentMethods, appId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentIntentType)) {
                return false;
            }
            PaymentIntentType paymentIntentType = (PaymentIntentType) other;
            return Intrinsics.areEqual(this.clientSecret, paymentIntentType.clientSecret) && Intrinsics.areEqual(this.locale, paymentIntentType.locale) && Intrinsics.areEqual(this.customerSessionClientSecret, paymentIntentType.customerSessionClientSecret) && Intrinsics.areEqual(this.legacyCustomerEphemeralKey, paymentIntentType.legacyCustomerEphemeralKey) && Intrinsics.areEqual(this.savedPaymentMethodSelectionId, paymentIntentType.savedPaymentMethodSelectionId) && Intrinsics.areEqual(this.mobileSessionId, paymentIntentType.mobileSessionId) && Intrinsics.areEqual(this.customPaymentMethods, paymentIntentType.customPaymentMethods) && Intrinsics.areEqual(this.externalPaymentMethods, paymentIntentType.externalPaymentMethods) && Intrinsics.areEqual(this.appId, paymentIntentType.appId);
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public SellerDetails getSellerDetails() {
            return null;
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.locale;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerSessionClientSecret;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.legacyCustomerEphemeralKey;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.savedPaymentMethodSelectionId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mobileSessionId;
            return ((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.customPaymentMethods.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31) + this.appId.hashCode();
        }

        public String toString() {
            return "PaymentIntentType(clientSecret=" + this.clientSecret + ", locale=" + this.locale + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", legacyCustomerEphemeralKey=" + this.legacyCustomerEphemeralKey + ", savedPaymentMethodSelectionId=" + this.savedPaymentMethodSelectionId + ", mobileSessionId=" + this.mobileSessionId + ", customPaymentMethods=" + this.customPaymentMethods + ", externalPaymentMethods=" + this.externalPaymentMethods + ", appId=" + this.appId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            dest.writeString(this.locale);
            dest.writeString(this.customerSessionClientSecret);
            dest.writeString(this.legacyCustomerEphemeralKey);
            dest.writeString(this.savedPaymentMethodSelectionId);
            dest.writeString(this.mobileSessionId);
            dest.writeStringList(this.customPaymentMethods);
            dest.writeStringList(this.externalPaymentMethods);
            dest.writeString(this.appId);
        }

        public PaymentIntentType(String clientSecret, String str, String str2, String str3, String str4, String str5, List<String> customPaymentMethods, List<String> externalPaymentMethods, String appId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.clientSecret = clientSecret;
            this.locale = str;
            this.customerSessionClientSecret = str2;
            this.legacyCustomerEphemeralKey = str3;
            this.savedPaymentMethodSelectionId = str4;
            this.mobileSessionId = str5;
            this.customPaymentMethods = customPaymentMethods;
            this.externalPaymentMethods = externalPaymentMethods;
            this.appId = appId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return this.clientSecret;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PaymentIntentType(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20 & 2
                if (r0 == 0) goto Lc
                java.util.Locale r12 = java.util.Locale.getDefault()
                java.lang.String r12 = r12.toLanguageTag()
            Lc:
                r2 = r12
                r12 = r20 & 4
                r0 = 0
                if (r12 == 0) goto L14
                r3 = r0
                goto L15
            L14:
                r3 = r13
            L15:
                r12 = r20 & 8
                if (r12 == 0) goto L1b
                r4 = r0
                goto L1c
            L1b:
                r4 = r14
            L1c:
                r12 = r20 & 16
                if (r12 == 0) goto L22
                r5 = r0
                goto L23
            L22:
                r5 = r15
            L23:
                r12 = r20 & 32
                if (r12 == 0) goto L31
                r6 = r0
                r1 = r11
                r7 = r17
                r8 = r18
                r9 = r19
                r0 = r10
                goto L3b
            L31:
                r6 = r16
                r0 = r10
                r1 = r11
                r7 = r17
                r8 = r18
                r9 = r19
            L3b:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ElementsSessionParams.PaymentIntentType.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExternalPaymentMethods() {
            return this.externalPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getAppId() {
            return this.appId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "payment_intent";
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            return CollectionsKt.listOf("payment_method_preference." + getType() + ".payment_method");
        }
    }

    /* compiled from: ElementsSessionParams.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "clientSecret", "", "locale", "customerSessionClientSecret", "legacyCustomerEphemeralKey", "savedPaymentMethodSelectionId", "mobileSessionId", "customPaymentMethods", "", "externalPaymentMethods", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getLocale", "getCustomerSessionClientSecret", "getLegacyCustomerEphemeralKey", "getSavedPaymentMethodSelectionId", "getMobileSessionId", "getCustomPaymentMethods", "()Ljava/util/List;", "getExternalPaymentMethods", "getAppId", "type", "getType", "expandFields", "getExpandFields", "sellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "getSellerDetails", "()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupIntentType implements ElementsSessionParams {
        private final String appId;
        private final String clientSecret;
        private final List<String> customPaymentMethods;
        private final String customerSessionClientSecret;
        private final List<String> externalPaymentMethods;
        private final String legacyCustomerEphemeralKey;
        private final String locale;
        private final String mobileSessionId;
        private final String savedPaymentMethodSelectionId;
        public static final Parcelable.Creator<SetupIntentType> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ElementsSessionParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SetupIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupIntentType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentType[] newArray(int i) {
                return new SetupIntentType[i];
            }
        }

        public static /* synthetic */ SetupIntentType copy$default(SetupIntentType setupIntentType, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupIntentType.clientSecret;
            }
            if ((i & 2) != 0) {
                str2 = setupIntentType.locale;
            }
            if ((i & 4) != 0) {
                str3 = setupIntentType.customerSessionClientSecret;
            }
            if ((i & 8) != 0) {
                str4 = setupIntentType.legacyCustomerEphemeralKey;
            }
            if ((i & 16) != 0) {
                str5 = setupIntentType.savedPaymentMethodSelectionId;
            }
            if ((i & 32) != 0) {
                str6 = setupIntentType.mobileSessionId;
            }
            if ((i & 64) != 0) {
                list = setupIntentType.customPaymentMethods;
            }
            if ((i & 128) != 0) {
                list2 = setupIntentType.externalPaymentMethods;
            }
            if ((i & 256) != 0) {
                str7 = setupIntentType.appId;
            }
            List list3 = list2;
            String str8 = str7;
            String str9 = str6;
            List list4 = list;
            String str10 = str5;
            String str11 = str3;
            return setupIntentType.copy(str, str2, str11, str4, str10, str9, list4, list3, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        public final List<String> component7() {
            return this.customPaymentMethods;
        }

        public final List<String> component8() {
            return this.externalPaymentMethods;
        }

        /* renamed from: component9, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final SetupIntentType copy(String clientSecret, String locale, String customerSessionClientSecret, String legacyCustomerEphemeralKey, String savedPaymentMethodSelectionId, String mobileSessionId, List<String> customPaymentMethods, List<String> externalPaymentMethods, String appId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new SetupIntentType(clientSecret, locale, customerSessionClientSecret, legacyCustomerEphemeralKey, savedPaymentMethodSelectionId, mobileSessionId, customPaymentMethods, externalPaymentMethods, appId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupIntentType)) {
                return false;
            }
            SetupIntentType setupIntentType = (SetupIntentType) other;
            return Intrinsics.areEqual(this.clientSecret, setupIntentType.clientSecret) && Intrinsics.areEqual(this.locale, setupIntentType.locale) && Intrinsics.areEqual(this.customerSessionClientSecret, setupIntentType.customerSessionClientSecret) && Intrinsics.areEqual(this.legacyCustomerEphemeralKey, setupIntentType.legacyCustomerEphemeralKey) && Intrinsics.areEqual(this.savedPaymentMethodSelectionId, setupIntentType.savedPaymentMethodSelectionId) && Intrinsics.areEqual(this.mobileSessionId, setupIntentType.mobileSessionId) && Intrinsics.areEqual(this.customPaymentMethods, setupIntentType.customPaymentMethods) && Intrinsics.areEqual(this.externalPaymentMethods, setupIntentType.externalPaymentMethods) && Intrinsics.areEqual(this.appId, setupIntentType.appId);
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public SellerDetails getSellerDetails() {
            return null;
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.locale;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerSessionClientSecret;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.legacyCustomerEphemeralKey;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.savedPaymentMethodSelectionId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mobileSessionId;
            return ((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.customPaymentMethods.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31) + this.appId.hashCode();
        }

        public String toString() {
            return "SetupIntentType(clientSecret=" + this.clientSecret + ", locale=" + this.locale + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", legacyCustomerEphemeralKey=" + this.legacyCustomerEphemeralKey + ", savedPaymentMethodSelectionId=" + this.savedPaymentMethodSelectionId + ", mobileSessionId=" + this.mobileSessionId + ", customPaymentMethods=" + this.customPaymentMethods + ", externalPaymentMethods=" + this.externalPaymentMethods + ", appId=" + this.appId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            dest.writeString(this.locale);
            dest.writeString(this.customerSessionClientSecret);
            dest.writeString(this.legacyCustomerEphemeralKey);
            dest.writeString(this.savedPaymentMethodSelectionId);
            dest.writeString(this.mobileSessionId);
            dest.writeStringList(this.customPaymentMethods);
            dest.writeStringList(this.externalPaymentMethods);
            dest.writeString(this.appId);
        }

        public SetupIntentType(String clientSecret, String str, String str2, String str3, String str4, String str5, List<String> customPaymentMethods, List<String> externalPaymentMethods, String appId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.clientSecret = clientSecret;
            this.locale = str;
            this.customerSessionClientSecret = str2;
            this.legacyCustomerEphemeralKey = str3;
            this.savedPaymentMethodSelectionId = str4;
            this.mobileSessionId = str5;
            this.customPaymentMethods = customPaymentMethods;
            this.externalPaymentMethods = externalPaymentMethods;
            this.appId = appId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return this.clientSecret;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ SetupIntentType(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20 & 2
                if (r0 == 0) goto Lc
                java.util.Locale r12 = java.util.Locale.getDefault()
                java.lang.String r12 = r12.toLanguageTag()
            Lc:
                r2 = r12
                r12 = r20 & 4
                r0 = 0
                if (r12 == 0) goto L14
                r3 = r0
                goto L15
            L14:
                r3 = r13
            L15:
                r12 = r20 & 8
                if (r12 == 0) goto L1b
                r4 = r0
                goto L1c
            L1b:
                r4 = r14
            L1c:
                r12 = r20 & 16
                if (r12 == 0) goto L22
                r5 = r0
                goto L23
            L22:
                r5 = r15
            L23:
                r12 = r20 & 32
                if (r12 == 0) goto L31
                r6 = r0
                r1 = r11
                r7 = r17
                r8 = r18
                r9 = r19
                r0 = r10
                goto L3b
            L31:
                r6 = r16
                r0 = r10
                r1 = r11
                r7 = r17
                r8 = r18
                r9 = r19
            L3b:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ElementsSessionParams.SetupIntentType.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExternalPaymentMethods() {
            return this.externalPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getAppId() {
            return this.appId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "setup_intent";
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            return CollectionsKt.listOf("payment_method_preference." + getType() + ".payment_method");
        }
    }

    /* compiled from: ElementsSessionParams.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0085\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017¨\u0006>"}, d2 = {"Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;", "Lcom/stripe/android/model/ElementsSessionParams;", "locale", "", "deferredIntentParams", "Lcom/stripe/android/model/DeferredIntentParams;", "customPaymentMethods", "", "externalPaymentMethods", "savedPaymentMethodSelectionId", "customerSessionClientSecret", "legacyCustomerEphemeralKey", "mobileSessionId", "appId", "sellerDetails", "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;)V", "getLocale", "()Ljava/lang/String;", "getDeferredIntentParams", "()Lcom/stripe/android/model/DeferredIntentParams;", "getCustomPaymentMethods", "()Ljava/util/List;", "getExternalPaymentMethods", "getSavedPaymentMethodSelectionId", "getCustomerSessionClientSecret", "getLegacyCustomerEphemeralKey", "getMobileSessionId", "getAppId", "getSellerDetails", "()Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "clientSecret", "getClientSecret", "type", "getType", "expandFields", "getExpandFields", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeferredIntentType implements ElementsSessionParams {
        private final String appId;
        private final List<String> customPaymentMethods;
        private final String customerSessionClientSecret;
        private final DeferredIntentParams deferredIntentParams;
        private final List<String> externalPaymentMethods;
        private final String legacyCustomerEphemeralKey;
        private final String locale;
        private final String mobileSessionId;
        private final String savedPaymentMethodSelectionId;
        private final SellerDetails sellerDetails;
        public static final Parcelable.Creator<DeferredIntentType> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ElementsSessionParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeferredIntentType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntentType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeferredIntentType(parcel.readString(), DeferredIntentParams.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SellerDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredIntentType[] newArray(int i) {
                return new DeferredIntentType[i];
            }
        }

        public static /* synthetic */ DeferredIntentType copy$default(DeferredIntentType deferredIntentType, String str, DeferredIntentParams deferredIntentParams, List list, List list2, String str2, String str3, String str4, String str5, String str6, SellerDetails sellerDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deferredIntentType.locale;
            }
            if ((i & 2) != 0) {
                deferredIntentParams = deferredIntentType.deferredIntentParams;
            }
            if ((i & 4) != 0) {
                list = deferredIntentType.customPaymentMethods;
            }
            if ((i & 8) != 0) {
                list2 = deferredIntentType.externalPaymentMethods;
            }
            if ((i & 16) != 0) {
                str2 = deferredIntentType.savedPaymentMethodSelectionId;
            }
            if ((i & 32) != 0) {
                str3 = deferredIntentType.customerSessionClientSecret;
            }
            if ((i & 64) != 0) {
                str4 = deferredIntentType.legacyCustomerEphemeralKey;
            }
            if ((i & 128) != 0) {
                str5 = deferredIntentType.mobileSessionId;
            }
            if ((i & 256) != 0) {
                str6 = deferredIntentType.appId;
            }
            if ((i & 512) != 0) {
                sellerDetails = deferredIntentType.sellerDetails;
            }
            String str7 = str6;
            SellerDetails sellerDetails2 = sellerDetails;
            String str8 = str4;
            String str9 = str5;
            String str10 = str2;
            String str11 = str3;
            return deferredIntentType.copy(str, deferredIntentParams, list, list2, str10, str11, str8, str9, str7, sellerDetails2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* renamed from: component10, reason: from getter */
        public final SellerDetails getSellerDetails() {
            return this.sellerDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final DeferredIntentParams getDeferredIntentParams() {
            return this.deferredIntentParams;
        }

        public final List<String> component3() {
            return this.customPaymentMethods;
        }

        public final List<String> component4() {
            return this.externalPaymentMethods;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final DeferredIntentType copy(String locale, DeferredIntentParams deferredIntentParams, List<String> customPaymentMethods, List<String> externalPaymentMethods, String savedPaymentMethodSelectionId, String customerSessionClientSecret, String legacyCustomerEphemeralKey, String mobileSessionId, String appId, SellerDetails sellerDetails) {
            Intrinsics.checkNotNullParameter(deferredIntentParams, "deferredIntentParams");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new DeferredIntentType(locale, deferredIntentParams, customPaymentMethods, externalPaymentMethods, savedPaymentMethodSelectionId, customerSessionClientSecret, legacyCustomerEphemeralKey, mobileSessionId, appId, sellerDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeferredIntentType)) {
                return false;
            }
            DeferredIntentType deferredIntentType = (DeferredIntentType) other;
            return Intrinsics.areEqual(this.locale, deferredIntentType.locale) && Intrinsics.areEqual(this.deferredIntentParams, deferredIntentType.deferredIntentParams) && Intrinsics.areEqual(this.customPaymentMethods, deferredIntentType.customPaymentMethods) && Intrinsics.areEqual(this.externalPaymentMethods, deferredIntentType.externalPaymentMethods) && Intrinsics.areEqual(this.savedPaymentMethodSelectionId, deferredIntentType.savedPaymentMethodSelectionId) && Intrinsics.areEqual(this.customerSessionClientSecret, deferredIntentType.customerSessionClientSecret) && Intrinsics.areEqual(this.legacyCustomerEphemeralKey, deferredIntentType.legacyCustomerEphemeralKey) && Intrinsics.areEqual(this.mobileSessionId, deferredIntentType.mobileSessionId) && Intrinsics.areEqual(this.appId, deferredIntentType.appId) && Intrinsics.areEqual(this.sellerDetails, deferredIntentType.sellerDetails);
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getClientSecret() {
            return null;
        }

        public int hashCode() {
            String str = this.locale;
            int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.deferredIntentParams.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31;
            String str2 = this.savedPaymentMethodSelectionId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.customerSessionClientSecret;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.legacyCustomerEphemeralKey;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mobileSessionId;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.appId.hashCode()) * 31;
            SellerDetails sellerDetails = this.sellerDetails;
            return iHashCode5 + (sellerDetails != null ? sellerDetails.hashCode() : 0);
        }

        public String toString() {
            return "DeferredIntentType(locale=" + this.locale + ", deferredIntentParams=" + this.deferredIntentParams + ", customPaymentMethods=" + this.customPaymentMethods + ", externalPaymentMethods=" + this.externalPaymentMethods + ", savedPaymentMethodSelectionId=" + this.savedPaymentMethodSelectionId + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", legacyCustomerEphemeralKey=" + this.legacyCustomerEphemeralKey + ", mobileSessionId=" + this.mobileSessionId + ", appId=" + this.appId + ", sellerDetails=" + this.sellerDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.locale);
            this.deferredIntentParams.writeToParcel(dest, flags);
            dest.writeStringList(this.customPaymentMethods);
            dest.writeStringList(this.externalPaymentMethods);
            dest.writeString(this.savedPaymentMethodSelectionId);
            dest.writeString(this.customerSessionClientSecret);
            dest.writeString(this.legacyCustomerEphemeralKey);
            dest.writeString(this.mobileSessionId);
            dest.writeString(this.appId);
            SellerDetails sellerDetails = this.sellerDetails;
            if (sellerDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                sellerDetails.writeToParcel(dest, flags);
            }
        }

        public DeferredIntentType(String str, DeferredIntentParams deferredIntentParams, List<String> customPaymentMethods, List<String> externalPaymentMethods, String str2, String str3, String str4, String str5, String appId, SellerDetails sellerDetails) {
            Intrinsics.checkNotNullParameter(deferredIntentParams, "deferredIntentParams");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.locale = str;
            this.deferredIntentParams = deferredIntentParams;
            this.customPaymentMethods = customPaymentMethods;
            this.externalPaymentMethods = externalPaymentMethods;
            this.savedPaymentMethodSelectionId = str2;
            this.customerSessionClientSecret = str3;
            this.legacyCustomerEphemeralKey = str4;
            this.mobileSessionId = str5;
            this.appId = appId;
            this.sellerDetails = sellerDetails;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ DeferredIntentType(java.lang.String r2, com.stripe.android.model.DeferredIntentParams r3, java.util.List r4, java.util.List r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.stripe.android.model.ElementsSessionParams.SellerDetails r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r1 = this;
                r13 = r12 & 1
                if (r13 == 0) goto Lc
                java.util.Locale r2 = java.util.Locale.getDefault()
                java.lang.String r2 = r2.toLanguageTag()
            Lc:
                r13 = r12 & 16
                r0 = 0
                if (r13 == 0) goto L12
                r6 = r0
            L12:
                r13 = r12 & 32
                if (r13 == 0) goto L17
                r7 = r0
            L17:
                r13 = r12 & 64
                if (r13 == 0) goto L1c
                r8 = r0
            L1c:
                r13 = r12 & 128(0x80, float:1.8E-43)
                if (r13 == 0) goto L21
                r9 = r0
            L21:
                r12 = r12 & 512(0x200, float:7.17E-43)
                if (r12 == 0) goto L31
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3c
            L31:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3c:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ElementsSessionParams.DeferredIntentType.<init>(java.lang.String, com.stripe.android.model.DeferredIntentParams, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.ElementsSessionParams$SellerDetails, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLocale() {
            return this.locale;
        }

        public final DeferredIntentParams getDeferredIntentParams() {
            return this.deferredIntentParams;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExternalPaymentMethods() {
            return this.externalPaymentMethods;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getSavedPaymentMethodSelectionId() {
            return this.savedPaymentMethodSelectionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getLegacyCustomerEphemeralKey() {
            return this.legacyCustomerEphemeralKey;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getAppId() {
            return this.appId;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public SellerDetails getSellerDetails() {
            return this.sellerDetails;
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public String getType() {
            return "deferred_intent";
        }

        @Override // com.stripe.android.model.ElementsSessionParams
        public List<String> getExpandFields() {
            return CollectionsKt.emptyList();
        }
    }

    /* compiled from: ElementsSessionParams.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;", "Landroid/os/Parcelable;", "networkId", "", "externalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNetworkId", "()Ljava/lang/String;", "getExternalId", "toQueryParams", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SellerDetails implements Parcelable {
        private final String externalId;
        private final String networkId;
        public static final Parcelable.Creator<SellerDetails> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ElementsSessionParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SellerDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SellerDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SellerDetails(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SellerDetails[] newArray(int i) {
                return new SellerDetails[i];
            }
        }

        public static /* synthetic */ SellerDetails copy$default(SellerDetails sellerDetails, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sellerDetails.networkId;
            }
            if ((i & 2) != 0) {
                str2 = sellerDetails.externalId;
            }
            return sellerDetails.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNetworkId() {
            return this.networkId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExternalId() {
            return this.externalId;
        }

        public final SellerDetails copy(String networkId, String externalId) {
            Intrinsics.checkNotNullParameter(networkId, "networkId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            return new SellerDetails(networkId, externalId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerDetails)) {
                return false;
            }
            SellerDetails sellerDetails = (SellerDetails) other;
            return Intrinsics.areEqual(this.networkId, sellerDetails.networkId) && Intrinsics.areEqual(this.externalId, sellerDetails.externalId);
        }

        public int hashCode() {
            return (this.networkId.hashCode() * 31) + this.externalId.hashCode();
        }

        public String toString() {
            return "SellerDetails(networkId=" + this.networkId + ", externalId=" + this.externalId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.networkId);
            dest.writeString(this.externalId);
        }

        public SellerDetails(String networkId, String externalId) {
            Intrinsics.checkNotNullParameter(networkId, "networkId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            this.networkId = networkId;
            this.externalId = externalId;
        }

        public final String getNetworkId() {
            return this.networkId;
        }

        public final String getExternalId() {
            return this.externalId;
        }

        public final Map<String, Object> toQueryParams() {
            return MapsKt.mapOf(TuplesKt.to("seller_details[network_id]", this.networkId), TuplesKt.to("seller_details[external_id]", this.externalId));
        }
    }
}
